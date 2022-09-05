package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Information about a D-Bus interface.
 */
public class DBusInterfaceInfo extends io.github.jwharm.javagi.interop.ResourceBase {

    public DBusInterfaceInfo(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_interface_info_cache_build(HANDLE());
    }
    
    /**
     * Decrements the usage count for the cache for @info built by
     * g_dbus_interface_info_cache_build() (if any) and frees the
     * resources used by the cache if the usage count drops to zero.
     */
    public void cacheRelease() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_interface_info_cache_release(HANDLE());
    }
    
    /**
     * Appends an XML representation of @info (and its children) to @string_builder.
     * 
     * This function is typically used for generating introspection XML
     * documents at run-time for handling the
     * `org.freedesktop.DBus.Introspectable.Introspect`
     * method.
     */
    public void generateXml(int indent, org.gtk.glib.String stringBuilder) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_interface_info_generate_xml(HANDLE(), indent, stringBuilder.HANDLE());
    }
    
    /**
     * Looks up information about a method.
     * 
     * The cost of this function is O(n) in number of methods unless
     * g_dbus_interface_info_cache_build() has been used on @info.
     */
    public DBusMethodInfo lookupMethod(java.lang.String name) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_interface_info_lookup_method(HANDLE(), Interop.getAllocator().allocateUtf8String(name));
        return new DBusMethodInfo(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Looks up information about a property.
     * 
     * The cost of this function is O(n) in number of properties unless
     * g_dbus_interface_info_cache_build() has been used on @info.
     */
    public DBusPropertyInfo lookupProperty(java.lang.String name) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_interface_info_lookup_property(HANDLE(), Interop.getAllocator().allocateUtf8String(name));
        return new DBusPropertyInfo(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Looks up information about a signal.
     * 
     * The cost of this function is O(n) in number of signals unless
     * g_dbus_interface_info_cache_build() has been used on @info.
     */
    public DBusSignalInfo lookupSignal(java.lang.String name) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_interface_info_lookup_signal(HANDLE(), Interop.getAllocator().allocateUtf8String(name));
        return new DBusSignalInfo(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * If @info is statically allocated does nothing. Otherwise increases
     * the reference count.
     */
    public DBusInterfaceInfo ref() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_interface_info_ref(HANDLE());
        return new DBusInterfaceInfo(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * If @info is statically allocated, does nothing. Otherwise decreases
     * the reference count of @info. When its reference count drops to 0,
     * the memory used is freed.
     */
    public void unref() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_interface_info_unref(HANDLE());
    }
    
}
