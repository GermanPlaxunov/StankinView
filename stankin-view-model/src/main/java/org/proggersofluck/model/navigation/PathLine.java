package org.proggersofluck.model.navigation;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class PathLine {
    private final NavigationPoint start;
    private final NavigationPoint end;
}
