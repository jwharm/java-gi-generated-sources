package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Structure used for scatter/gather data input.
 * You generally pass in an array of {@code GInputVectors}
 * and the operation will store the read data starting in the
 * first buffer, switching to the next as needed.
 */
public class InputVector extends io.github.jwharm.javagi.ResourceBase {

    public InputVector(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
}
