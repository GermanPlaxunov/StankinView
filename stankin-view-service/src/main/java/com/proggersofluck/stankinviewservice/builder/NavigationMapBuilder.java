package com.proggersofluck.stankinviewservice.builder;

import org.proggersofluck.model.navigation.NavigationMap;
import org.proggersofluck.model.navigation.NavigationPoint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NavigationMapBuilder {
    private final String LEFT = "n1";
    private final String RIGHT = "n6";
    private List<NavigationPoint> points;

    //Первый шаг налево или направо
    public Map<String, String> getLeftOrRightStart(){
        var result = new HashMap<String, String>();
        result.put("a1", LEFT);
        result.put("a2", LEFT);
        result.put("a3", LEFT);
        result.put("a4", LEFT);
        result.put("a5", LEFT);
        result.put("a6", LEFT);
        result.put("a7", LEFT);
        result.put("a8", RIGHT);
        result.put("a9", RIGHT);
        result.put("a10", RIGHT);
        result.put("a11", RIGHT);
        result.put("a12", RIGHT);
        result.put("a13", RIGHT);
        return result;
    }

    public NavigationMap buildNavigationMap(int floor) {
        NavigationMap map;
        if (floor == 1) {
            var connections = getConnections();
            map = new NavigationMap()
                    .setConnections(connections);
            return map;
        }
        return null;
    }

    private void initPoints() {
        this.points = List.of(
                //NavigationPoints
                createPoint("n0"),
                createPoint("n1"),
                createPoint("n2"),
                createPoint("n3"),
                createPoint("n4"),
                createPoint("n5"),
                createPoint("n6"),
                createPoint("n7"),
                createPoint("n8"),
                createPoint("n9"),
                //Audiences
                createPoint("a1"),
                createPoint("a2"),
                createPoint("a3"),
                createPoint("a4"),
                createPoint("a5"),
                createPoint("a6"),
                createPoint("a7"),
                createPoint("a8"),
                createPoint("a9"),
                createPoint("a10"),
                createPoint("a11"),
                createPoint("a12"),
                createPoint("a13")
        );
    }

    private Map<NavigationPoint, List<NavigationPoint>> getConnections() {
        initPoints();
        var conns = new HashMap<NavigationPoint, List<NavigationPoint>>();
        conns.put(findPoint("n0"), findPoints("n1", "n6"));
        conns.put(findPoint("n1"), findPoints("n0", "n2", "a7"));
        conns.put(findPoint("n2"), findPoints("n1", "n3", "a6"));
        conns.put(findPoint("n3"), findPoints("n2", "n4"));
        conns.put(findPoint("n4"), findPoints("n3", "n5", "a4", "a5"));
        conns.put(findPoint("n5"), findPoints("n4", "a1", "a2", "a3"));
        conns.put(findPoint("n6"), findPoints("n0", "n7", "n8", "a8"));
        conns.put(findPoint("n7"), findPoints("n6", "a13"));
        conns.put(findPoint("n8"), findPoints("n6", "n9", "a9", "a11"));
        conns.put(findPoint("n9"), findPoints("n8", "a10", "a12"));
        //Audiences
        conns.put(findPoint("a1"), findPoints("n5"));
        conns.put(findPoint("a2"), findPoints("n5"));
        conns.put(findPoint("a3"), findPoints("n5"));
        conns.put(findPoint("a4"), findPoints("n4"));
        conns.put(findPoint("a5"), findPoints("n4"));
        conns.put(findPoint("a6"), findPoints("n2"));
        conns.put(findPoint("a7"), findPoints("n1"));
        conns.put(findPoint("a8"), findPoints("n6"));
        conns.put(findPoint("a9"), findPoints("n8"));
        conns.put(findPoint("a10"), findPoints("n9"));
        conns.put(findPoint("a11"), findPoints("n8"));
        conns.put(findPoint("a12"), findPoints("n9"));
        conns.put(findPoint("a13"), findPoints("n7"));
        return conns;
    }

    private List<NavigationPoint> findPoints(String... ids) {
        var list = new ArrayList<NavigationPoint>();
        for (var id : ids) {
            list.add(findPoint(id));
        }
        return list;
    }

    public NavigationPoint findPoint(String id) {
        return points.stream()
                .filter(point -> point.getId().equals(id))
                .findFirst()
                .get();
    }

    private NavigationPoint createPoint(String id) {
        return new NavigationPoint(id, 0, 0, 0, 0);
    }

}
