package com.proggersofluck.stankinviewservice.process.navigate;

import lombok.extern.slf4j.Slf4j;
import org.proggersofluck.model.navigation.NavigationMap;
import org.proggersofluck.model.navigation.NavigationPoint;
import org.proggersofluck.model.navigation.Path;
import org.proggersofluck.model.navigation.PathLine;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
public class Navigator {

    private List<NavigationPoint> wrongPoints;
    private List<NavigationPoint> usedPoints;

    public Path getPath(NavigationMap map, Map<String, String> firstStep, NavigationPoint start, NavigationPoint target) {
        wrongPoints = new ArrayList<>();
        usedPoints = new ArrayList<>();
        var path = new ArrayList<PathLine>();
        usedPoints.add(start);
        //FirstStep
        var firstStepId = firstStep.get(target.getId());
        var current = getById(map, firstStepId);
        path.add(buildPathLine(start, current));
        while (!isPathFinished(current, target)) {
            if (!isDeadEnd(map, current.getId())) {
                if (isOneWay(map, current.getId())) {
                    if (isTargetAudienceAttached(map, current.getId(), target.getId())) {
                        path.add(buildPathLine(current, target));
                        current = target;
                    } else {
                        var next = getNextStep(map, current.getId());
                        path.add(buildPathLine(current, next));
                        usedPoints.add(current);
                        current = next;
                    }
                } else {
                    if (isTargetAudienceAttached(map, current.getId(), target.getId())) {
                        path.add(buildPathLine(current, target));
                        current = target;
                    } else {
                        var next = getNextStep(map, current.getId());
                        path.add(buildPathLine(current, next));
                        usedPoints.add(current);
                        current = next;
                    }
                }
            } else {
                wrongPoints.addAll(usedPoints);
                path = new ArrayList<>();
                usedPoints = new ArrayList<>();
                usedPoints.add(start);
                current = getById(map, firstStepId);
                path.add(buildPathLine(start, current));
            }
        }
        return new Path(path);
    }

    private boolean isPathFinished(NavigationPoint current, NavigationPoint target) {
        return current.getId().equals(target.getId());
    }

    private PathLine buildPathLine(NavigationPoint start, NavigationPoint end) {
        return new PathLine(start, end);
    }

    private NavigationPoint getNextStep(NavigationMap map, String id) {
        var conns = getConnectionsById(map, id);
        var notWrong = getNotInBl(conns);
        var notUsed = getNotInUsed(notWrong);
        return notUsed.get(0);
    }

    private boolean isDeadEnd(NavigationMap map, String id) {
        return getConnectionsById(map, id)
                .stream()
                .filter(p -> !usedPoints.contains(p))
                .collect(Collectors.toList())
                .size() == 0;
    }

    private List<NavigationPoint> getNotInUsed(List<NavigationPoint> points) {
        return points.stream()
                .filter(point -> !usedPoints.contains(point))
                .collect(Collectors.toList());
    }

    private List<NavigationPoint> getNotInBl(List<NavigationPoint> points) {
        return points.stream()
                .filter(point -> !wrongPoints.contains(point))
                .collect(Collectors.toList());
    }

    private NavigationPoint getById(NavigationMap map, String id) {
        return map.getConnections()
                .entrySet()
                .stream()
                .filter(entry -> entry.getKey().getId().equals(id))
                .findFirst()
                .get()
                .getKey();
    }

    private List<NavigationPoint> getConnectionsById(NavigationMap map, String id) {
        var isPresent = map.getConnections()
                .entrySet()
                .stream()
                .filter(entry -> entry.getKey().getId().equals(id))
                .findFirst().isPresent();
        return isPresent
                ? map.getConnections()
                .entrySet()
                .stream()
                .filter(entry -> entry.getKey().getId().equals(id))
                .findFirst()
                .get()
                .getValue()
                : null;
    }

    private boolean isOneWay(NavigationMap map, String id) {
        return getConnectionsById(map, id)
                .stream()
                .filter(conn -> conn.getId().startsWith("n"))
                .collect(Collectors.toList())
                .size() <= 2;
    }

    private boolean attachedAudience(NavigationMap map, String id) {
        return getConnectionsById(map, id)
                .stream()
                .filter(conn -> conn.getId().startsWith("a"))
                .collect(Collectors.toList())
                .size() > 0;
    }

    private boolean isTargetAudienceAttached(NavigationMap map, String id, String targetId) {
        return getConnectionsById(map, id)
                .stream()
                .filter(conn -> conn.getId().equals(targetId))
                .collect(Collectors.toList())
                .size() > 0;
    }
}
