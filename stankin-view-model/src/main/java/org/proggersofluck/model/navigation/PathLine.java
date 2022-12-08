package org.proggersofluck.model.navigation;

import lombok.Data;

@Data
public class PathLine {
    private NavigationPoint start;
    private NavigationPoint end;
}
