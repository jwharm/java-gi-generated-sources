package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Represents a request of a screen object in a given orientation. These
 * are primarily used in container implementations when allocating a natural
 * size for children calling. See [func@distribute_natural_allocation].
 */
public class RequestedSize extends io.github.jwharm.javagi.ResourceBase {

    public RequestedSize(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
}
