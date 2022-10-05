package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Represents a request of a screen object in a given orientation. These
 * are primarily used in container implementations when allocating a natural
 * size for children calling. See {@link distribute_natural_allocation#null}.
 */
public class RequestedSize extends io.github.jwharm.javagi.ResourceBase {

    public RequestedSize(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
}
