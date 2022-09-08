package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Information about nodes in a remote object hierarchy.
 */
public class DBusNodeInfo extends io.github.jwharm.javagi.interop.ResourceBase {

    public DBusNodeInfo(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Appends an XML representation of @info (and its children) to @string_builder.
     * 
     * This function is typically used for generating introspection XML documents at run-time for
     * handling the `org.freedesktop.DBus.Introspectable.Introspect`  method.
     */
    public void generateXml(int indent, org.gtk.glib.String stringBuilder) {
        gtk_h.g_dbus_node_info_generate_xml(handle(), indent, stringBuilder.handle());
    }
    
    /**
     * Looks up information about an interface.
     * 
     * The cost of this function is O(n) in number of interfaces.
     */
    public DBusInterfaceInfo lookupInterface(java.lang.String name) {
        var RESULT = gtk_h.g_dbus_node_info_lookup_interface(handle(), Interop.allocateNativeString(name).handle());
        return new DBusInterfaceInfo(References.get(RESULT, false));
    }
    
    /**
     * If @info is statically allocated does nothing. Otherwise increases
     * the reference count.
     */
    public DBusNodeInfo ref() {
        var RESULT = gtk_h.g_dbus_node_info_ref(handle());
        return new DBusNodeInfo(References.get(RESULT, true));
    }
    
    /**
     * If @info is statically allocated, does nothing. Otherwise decreases
     * the reference count of @info. When its reference count drops to 0,
     * the memory used is freed.
     */
    public void unref() {
        gtk_h.g_dbus_node_info_unref(handle());
    }
    
}
