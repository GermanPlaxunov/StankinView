package org.proggersofluck.model.navigation;

import lombok.Data;

import java.util.List;

@Data
public class Path {
    private List<PathLine> path;
}
