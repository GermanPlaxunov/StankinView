package org.proggersofluck.model.request;

import lombok.Data;
import org.proggersofluck.model.navigation.Position;

@Data
public class PathRequest {
    private Position currentPosition;
    private Position destination;
}
