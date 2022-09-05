package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Information about a D-Bus property on a D-Bus interface.
 */
public class DBusPropertyInfo extends io.github.jwharm.javagi.interop.ResourceBase {

    public DBusPropertyInfo(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * If @info is statically allocated does nothing. Otherwise increases
     * the reference count.
     */
    public DBusPropertyInfo ref() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_property_info_ref(HANDLE());
        return new DBusPropertyInfo(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * If @info is statically allocated, does nothing. Otherwise decreases
     * the reference count of @info. When its reference count drops to 0,
     * the memory used is freed.
     */
    public void unref() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_property_info_unref(HANDLE());
    }
    
}
