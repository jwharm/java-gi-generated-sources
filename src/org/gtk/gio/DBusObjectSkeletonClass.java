package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Class structure for {@link DBusObjectSkeleton}.
 */
public class DBusObjectSkeletonClass extends io.github.jwharm.javagi.ResourceBase {

    public DBusObjectSkeletonClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public DBusObjectSkeletonClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GDBusObjectSkeletonClass.allocate(Interop.getAllocator()).address()));
    }
    
}
