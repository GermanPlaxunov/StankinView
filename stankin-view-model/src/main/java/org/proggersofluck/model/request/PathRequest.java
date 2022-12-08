package org.proggersofluck.model.request;

import lombok.Data;
import org.proggersofluck.model.navigation.NavigationPoint;

@Data
public class PathRequest {
    private NavigationPoint currentPosition;
    private NavigationPoint destination;
}
