package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The virtual function table for {@link Action}.
 */
public class ActionInterface extends io.github.jwharm.javagi.ResourceBase {

    public ActionInterface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public ActionInterface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GActionInterface.allocate(Interop.getAllocator()).address()));
    }
    
}
