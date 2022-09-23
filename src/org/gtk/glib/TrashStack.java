package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Each piece of memory that is pushed onto the stack
 * is cast to a GTrashStack*.
 */
public class TrashStack extends io.github.jwharm.javagi.ResourceBase {

    public TrashStack(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public TrashStack() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GTrashStack.allocate(Interop.getAllocator()).address()));
    }
    
}
