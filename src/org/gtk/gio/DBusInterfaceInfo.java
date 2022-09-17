package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Information about a D-Bus interface.
 */
public class DBusInterfaceInfo extends io.github.jwharm.javagi.ResourceBase {

    public DBusInterfaceInfo(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Builds a lookup-cache to speed up
     * g_dbus_interface_info_lookup_method(),
     * g_dbus_interface_info_lookup_signal() and
     * g_dbus_interface_info_lookup_property().
     * 
     * If this has already been called with @info, the existing cache is
     * used and its use count is increased.
     * 
     * Note that @info cannot be modified until
     * g_dbus_interface_info_cache_release() is called.
     */
    public void cacheBuild() {
        gtk_h.g_dbus_interface_info_cache_build(handle());
    }
    
    /**
     * Decrements the usage count for the cache for @info built by
     * g_dbus_interface_info_cache_build() (if any) and frees the
     * resources used by the cache if the usage count drops to zero.
     */
    public void cacheRelease() {
        gtk_h.g_dbus_interface_info_cache_release(handle());
    }
    
    /**
     * Appends an XML representation of @info (and its children) to @string_builder.
     * <p>
     * This function is typically used for generating introspection XML
     * documents at run-time for handling the<code>org.freedesktop.DBus.Introspectable.Introspect</code>
     * method.
     */
    public void generateXml(int indent, org.gtk.glib.String stringBuilder) {
        gtk_h.g_dbus_interface_info_generate_xml(handle(), indent, stringBuilder.handle());
    }
    
    /**
     * Looks up information about a method.
     * 
     * The cost of this function is O(n) in number of methods unless
     * g_dbus_interface_info_cache_build() has been used on @info.
     */
    public DBusMethodInfo lookupMethod(java.lang.String name) {
        var RESULT = gtk_h.g_dbus_interface_info_lookup_method(handle(), Interop.allocateNativeString(name).handle());
        return new DBusMethodInfo(References.get(RESULT, false));
    }
    
    /**
     * Looks up information about a property.
     * 
     * The cost of this function is O(n) in number of properties unless
     * g_dbus_interface_info_cache_build() has been used on @info.
     */
    public DBusPropertyInfo lookupProperty(java.lang.String name) {
        var RESULT = gtk_h.g_dbus_interface_info_lookup_property(handle(), Interop.allocateNativeString(name).handle());
        return new DBusPropertyInfo(References.get(RESULT, false));
    }
    
    /**
     * Looks up information about a signal.
     * 
     * The cost of this function is O(n) in number of signals unless
     * g_dbus_interface_info_cache_build() has been used on @info.
     */
    public DBusSignalInfo lookupSignal(java.lang.String name) {
        var RESULT = gtk_h.g_dbus_interface_info_lookup_signal(handle(), Interop.allocateNativeString(name).handle());
        return new DBusSignalInfo(References.get(RESULT, false));
    }
    
    /**
     * If @info is statically allocated does nothing. Otherwise increases
     * the reference count.
     */
    public DBusInterfaceInfo ref() {
        var RESULT = gtk_h.g_dbus_interface_info_ref(handle());
        return new DBusInterfaceInfo(References.get(RESULT, true));
    }
    
    /**
     * If @info is statically allocated, does nothing. Otherwise decreases
     * the reference count of @info. When its reference count drops to 0,
     * the memory used is freed.
     */
    public void unref() {
        gtk_h.g_dbus_interface_info_unref(handle());
    }
    
}
