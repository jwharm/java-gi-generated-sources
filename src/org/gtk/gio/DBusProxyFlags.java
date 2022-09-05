package org.gtk.gio;

/**
 * Flags used when constructing an instance of a #GDBusProxy derived class.
 */
public class DBusProxyFlags {

    /**
     * No flags set.
     */
    public static final int NONE = 0;
    
    /**
     * Don't load properties.
     */
    public static final int DO_NOT_LOAD_PROPERTIES = 1;
    
    /**
     * Don't connect to signals on the remote object.
     */
    public static final int DO_NOT_CONNECT_SIGNALS = 2;
    
    /**
     * If the proxy is for a well-known name,
     * do not ask the bus to launch an owner during proxy initialization or a method call.
     * This flag is only meaningful in proxies for well-known names.
     */
    public static final int DO_NOT_AUTO_START = 4;
    
    /**
     * If set, the property value for any __invalidated property__ will be (asynchronously) retrieved upon receiving the [`PropertiesChanged`](http://dbus.freedesktop.org/doc/dbus-specification.html#standard-interfaces-properties) D-Bus signal and the property will not cause emission of the #GDBusProxy::g-properties-changed signal. When the value is received the #GDBusProxy::g-properties-changed signal is emitted for the property along with the retrieved value. Since 2.32.
     */
    public static final int GET_INVALIDATED_PROPERTIES = 8;
    
    /**
     * If the proxy is for a well-known name,
     * do not ask the bus to launch an owner during proxy initialization, but allow it to be
     * autostarted by a method call. This flag is only meaningful in proxies for well-known names,
     * and only if %G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START is not also specified.
     */
    public static final int DO_NOT_AUTO_START_AT_CONSTRUCTION = 16;
    
    /**
     * Don't actually send the AddMatch D-Bus
     *    call for this signal subscription. This gives you more control
     *    over which match rules you add (but you must add them manually). (Since: 2.72)
     */
    public static final int NO_MATCH_RULE = 32;
    
}
