package org.gtk.glib;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Each piece of memory that is pushed onto the stack
 * is cast to a GTrashStack*.
 */
public class TrashStack extends io.github.jwharm.javagi.ResourceBase {

    public TrashStack(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public TrashStack() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.GTrashStack.allocate(Interop.getAllocator()).address()));
    }
    
}
