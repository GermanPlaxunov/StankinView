package org.proggersofluck.model.response;

import org.proggersofluck.model.navigation.Path;

import java.util.Map;

public record PreparedPath(Map<Integer, Path> path) {
}
