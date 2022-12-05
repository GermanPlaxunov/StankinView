package org.proggersofluck.model.navigation;

import lombok.Data;

@Data
public class Position {
    private final NavigationPoint navigationPoint;
    private final int floor;
}
