package org.proggersofluck.model.navigation;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class Path {
    private final List<PathLine> path;
}
