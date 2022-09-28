package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The virtual function table for {@link ActionGroup}.
 */
public class ActionGroupInterface extends io.github.jwharm.javagi.ResourceBase {

    public ActionGroupInterface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public ActionGroupInterface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GActionGroupInterface.allocate(Interop.getAllocator()).address()));
    }
    
}
