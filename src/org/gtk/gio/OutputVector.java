package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
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

    public OutputVector(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public OutputVector() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GOutputVector.allocate(Interop.getAllocator()).address()));
    }
    
}
