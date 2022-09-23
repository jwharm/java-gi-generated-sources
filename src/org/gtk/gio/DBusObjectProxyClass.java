package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Class structure for {@link DBusObjectProxy}.
 */
public class DBusObjectProxyClass extends io.github.jwharm.javagi.ResourceBase {

    public DBusObjectProxyClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public DBusObjectProxyClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GDBusObjectProxyClass.allocate(Interop.getAllocator()).address()));
    }
    
}
