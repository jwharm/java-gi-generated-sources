package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Information about an argument for a method or a signal.
 */
public class DBusArgInfo extends io.github.jwharm.javagi.ResourceBase {

    public DBusArgInfo(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public DBusArgInfo() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.GDBusArgInfo.allocate(Interop.getAllocator()).address()));
    }
    
    /**
     * If {@code info} is statically allocated does nothing. Otherwise increases
     * the reference count.
     */
    public DBusArgInfo ref() {
        var RESULT = gtk_h.g_dbus_arg_info_ref(handle());
        return new DBusArgInfo(Refcounted.get(RESULT, true));
    }
    
    /**
     * If {@code info} is statically allocated, does nothing. Otherwise decreases
     * the reference count of {@code info}. When its reference count drops to 0,
     * the memory used is freed.
     */
    public void unref() {
        gtk_h.g_dbus_arg_info_unref(handle());
    }
    
}
