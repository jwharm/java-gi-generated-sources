package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Structure used for scatter/gather data output.
 * You generally pass in an array of #GOutputVectors
 * and the operation will use all the buffers as if they were
 * one buffer.
 */
public class OutputVector extends io.github.jwharm.javagi.interop.ResourceBase {

    public OutputVector(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
}
