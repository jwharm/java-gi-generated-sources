package org.gtk.gio;

/**
 * Flags used when constructing an instance of a {@link DBusProxy} derived class.
 */
public class DBusProxyFlags extends io.github.jwharm.javagi.Bitfield {

    /**
     * No flags set.
     */
    public static final DBusProxyFlags NONE = new DBusProxyFlags(0);
    
    /**
     * Don't load properties.
     */
    public static final DBusProxyFlags DO_NOT_LOAD_PROPERTIES = new DBusProxyFlags(1);
    
    /**
     * Don't connect to signals on the remote object.
     */
    public static final DBusProxyFlags DO_NOT_CONNECT_SIGNALS = new DBusProxyFlags(2);
    
    /**
     * If the proxy is for a well-known name,
     * do not ask the bus to launch an owner during proxy initialization or a method call.
     * This flag is only meaningful in proxies for well-known names.
     */
    public static final DBusProxyFlags DO_NOT_AUTO_START = new DBusProxyFlags(4);
    
    /**
     * If set, the property value for any __invalidated property__ will be (asynchronously) retrieved upon receiving the <a href="http://dbus.freedesktop.org/doc/dbus-specification.html#standard-interfaces-properties">`PropertiesChanged`</a> D-Bus signal and the property will not cause emission of the {@link DBusProxy}::g-properties-changed signal. When the value is received the {@link DBusProxy}::g-properties-changed signal is emitted for the property along with the retrieved value. Since 2.32.
     */
    public static final DBusProxyFlags GET_INVALIDATED_PROPERTIES = new DBusProxyFlags(8);
    
    /**
     * If the proxy is for a well-known name,
     * do not ask the bus to launch an owner during proxy initialization, but allow it to be
     * autostarted by a method call. This flag is only meaningful in proxies for well-known names,
     * and only if {@link DBusProxyFlags#DO_NOT_AUTO_START} is not also specified.
     */
    public static final DBusProxyFlags DO_NOT_AUTO_START_AT_CONSTRUCTION = new DBusProxyFlags(16);
    
    /**
     * Don't actually send the AddMatch D-Bus
     *    call for this signal subscription. This gives you more control
     *    over which match rules you add (but you must add them manually). (Since: 2.72)
     */
    public static final DBusProxyFlags NO_MATCH_RULE = new DBusProxyFlags(32);
    
    public DBusProxyFlags(int value) {
        super(value);
    }
    
}
