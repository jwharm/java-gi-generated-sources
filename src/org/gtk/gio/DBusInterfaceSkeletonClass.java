package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Class structure for {@link DBusInterfaceSkeleton}.
 */
public class DBusInterfaceSkeletonClass extends io.github.jwharm.javagi.ResourceBase {

    public DBusInterfaceSkeletonClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public DBusInterfaceSkeletonClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GDBusInterfaceSkeletonClass.allocate(Interop.getAllocator()).address()));
    }
    
}
