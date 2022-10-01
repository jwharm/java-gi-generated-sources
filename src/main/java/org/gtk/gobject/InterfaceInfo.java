package org.gtk.gobject;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A structure that provides information to the type system which is
 * used specifically for managing interface types.
 */
public class InterfaceInfo extends io.github.jwharm.javagi.ResourceBase {

    public InterfaceInfo(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public InterfaceInfo() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.GInterfaceInfo.allocate(Interop.getAllocator()).address()));
    }
    
}
