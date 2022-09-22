package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Information about a signal on a D-Bus interface.
 */
public class DBusSignalInfo extends io.github.jwharm.javagi.ResourceBase {

    public DBusSignalInfo(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * If {@code info} is statically allocated does nothing. Otherwise increases
     * the reference count.
     */
    public DBusSignalInfo ref() {
        var RESULT = gtk_h.g_dbus_signal_info_ref(handle());
        return new DBusSignalInfo(References.get(RESULT, true));
    }
    
    /**
     * If {@code info} is statically allocated, does nothing. Otherwise decreases
     * the reference count of {@code info}. When its reference count drops to 0,
     * the memory used is freed.
     */
    public void unref() {
        gtk_h.g_dbus_signal_info_unref(handle());
    }
    
}
