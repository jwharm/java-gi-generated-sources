package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The virtual function table for {@link ActionMap}.
 */
public class ActionMapInterface extends io.github.jwharm.javagi.ResourceBase {

    public ActionMapInterface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public ActionMapInterface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GActionMapInterface.allocate(Interop.getAllocator()).address()));
    }
    
}
