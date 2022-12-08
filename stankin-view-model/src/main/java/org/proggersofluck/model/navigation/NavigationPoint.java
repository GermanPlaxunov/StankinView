package org.proggersofluck.model.navigation;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class NavigationPoint {
    private final float x;
    private final float y;
    private final int floor;
    private final int code;
}
