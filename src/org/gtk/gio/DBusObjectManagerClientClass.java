package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Class structure for {@link DBusObjectManagerClient}.
 */
public class DBusObjectManagerClientClass extends io.github.jwharm.javagi.ResourceBase {

    public DBusObjectManagerClientClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public DBusObjectManagerClientClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GDBusObjectManagerClientClass.allocate(Interop.getAllocator()).address()));
    }
    
}
