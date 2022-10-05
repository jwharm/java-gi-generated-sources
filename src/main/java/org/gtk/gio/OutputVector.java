package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Structure used for scatter/gather data output.
 * You generally pass in an array of {@code GOutputVectors}
 * and the operation will use all the buffers as if they were
 * one buffer.
 */
public class OutputVector extends io.github.jwharm.javagi.ResourceBase {

    public OutputVector(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
}
