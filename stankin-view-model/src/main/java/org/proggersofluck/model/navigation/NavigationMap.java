package org.proggersofluck.model.navigation;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class NavigationMap {
    private Map<NavigationPoint, List<NavigationPoint>> connections;

}
