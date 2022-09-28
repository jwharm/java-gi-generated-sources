package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Class structure for {@link DBusObjectManagerServer}.
 */
public class DBusObjectManagerServerClass extends io.github.jwharm.javagi.ResourceBase {

    public DBusObjectManagerServerClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public DBusObjectManagerServerClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GDBusObjectManagerServerClass.allocate(Interop.getAllocator()).address()));
    }
    
}
