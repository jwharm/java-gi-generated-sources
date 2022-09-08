package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Information about a method on an D-Bus interface.
 */
public class DBusMethodInfo extends io.github.jwharm.javagi.interop.ResourceBase {

    public DBusMethodInfo(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * If @info is statically allocated does nothing. Otherwise increases
     * the reference count.
     */
    public DBusMethodInfo ref() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_method_info_ref(HANDLE());
        return new DBusMethodInfo(References.get(RESULT, true));
    }
    
    /**
     * If @info is statically allocated, does nothing. Otherwise decreases
     * the reference count of @info. When its reference count drops to 0,
     * the memory used is freed.
     */
    public void unref() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_method_info_unref(HANDLE());
    }
    
}
