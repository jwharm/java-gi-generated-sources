package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Class structure for {@link DBusProxy}.
 */
public class DBusProxyClass extends io.github.jwharm.javagi.ResourceBase {

    public DBusProxyClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public DBusProxyClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GDBusProxyClass.allocate(Interop.getAllocator()).address()));
    }
    
}
