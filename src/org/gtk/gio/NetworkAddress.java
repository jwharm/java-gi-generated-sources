package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GNetworkAddress provides an easy way to resolve a hostname and
 * then attempt to connect to that host, handling the possibility of
 * multiple IP addresses and multiple address families.
 * 
 * The enumeration results of resolved addresses *may* be cached as long
 * as this object is kept alive which may have unexpected results if
 * alive for too long.
 * 
 * See #GSocketConnectable for an example of using the connectable
 * interface.
 */
public class NetworkAddress extends org.gtk.gobject.Object implements SocketConnectable {

    public NetworkAddress(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to NetworkAddress */
    public static NetworkAddress castFrom(org.gtk.gobject.Object gobject) {
        return new NetworkAddress(gobject.getReference());
    }
    
    /**
     * Creates a new #GSocketConnectable for connecting to the given
     * @hostname and @port.
     * 
     * Note that depending on the configuration of the machine, a
     * @hostname of `localhost` may refer to the IPv4 loopback address
     * only, or to both IPv4 and IPv6; use
     * g_network_address_new_loopback() to create a #GNetworkAddress that
     * is guaranteed to resolve to both addresses.
     */
    public NetworkAddress(java.lang.String hostname, short port) {
        super(References.get(gtk_h.g_network_address_new(Interop.allocateNativeString(hostname).handle(), port), true));
    }
    
    /**
     * Creates a new #GSocketConnectable for connecting to the local host
     * over a loopback connection to the given @port. This is intended for
     * use in connecting to local services which may be running on IPv4 or
     * IPv6.
     * 
     * The connectable will return IPv4 and IPv6 loopback addresses,
     * regardless of how the host resolves `localhost`. By contrast,
     * g_network_address_new() will often only return an IPv4 address when
     * resolving `localhost`, and an IPv6 address for `localhost6`.
     * 
     * g_network_address_get_hostname() will always return `localhost` for
     * a #GNetworkAddress created with this constructor.
     */
    public NetworkAddress(short port) {
        super(References.get(gtk_h.g_network_address_new_loopback(port), true));
    }
    
    /**
     * Gets @addr's hostname. This might be either UTF-8 or ASCII-encoded,
     * depending on what @addr was created with.
     */
    public java.lang.String getHostname() {
        var RESULT = gtk_h.g_network_address_get_hostname(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets @addr's port number
     */
    public short getPort() {
        var RESULT = gtk_h.g_network_address_get_port(handle());
        return RESULT;
    }
    
    /**
     * Gets @addr's scheme
     */
    public java.lang.String getScheme() {
        var RESULT = gtk_h.g_network_address_get_scheme(handle());
        return RESULT.getUtf8String(0);
    }
    
}
