package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Information about a method on an D-Bus interface.
 */
public class DBusMethodInfo extends io.github.jwharm.javagi.ResourceBase {

    public DBusMethodInfo(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public DBusMethodInfo() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GDBusMethodInfo.allocate(Interop.getAllocator()).address()));
    }
    
    /**
     * If {@code info} is statically allocated does nothing. Otherwise increases
     * the reference count.
     */
    public DBusMethodInfo ref() {
        var RESULT = gtk_h.g_dbus_method_info_ref(handle());
        return new DBusMethodInfo(References.get(RESULT, true));
    }
    
    /**
     * If {@code info} is statically allocated, does nothing. Otherwise decreases
     * the reference count of {@code info}. When its reference count drops to 0,
     * the memory used is freed.
     */
    public void unref() {
        gtk_h.g_dbus_method_info_unref(handle());
    }
    
}
