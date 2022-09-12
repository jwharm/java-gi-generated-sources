package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
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

    public NetworkAddress(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to NetworkAddress */
    public static NetworkAddress castFrom(org.gtk.gobject.Object gobject) {
        return new NetworkAddress(gobject.getReference());
    }
    
    private static Reference constructNew(java.lang.String hostname, short port) {
        Reference RESULT = References.get(gtk_h.g_network_address_new(Interop.allocateNativeString(hostname).handle(), port), true);
        return RESULT;
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
        super(constructNew(hostname, port));
    }
    
    private static Reference constructNewLoopback(short port) {
        Reference RESULT = References.get(gtk_h.g_network_address_new_loopback(port), true);
        return RESULT;
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
    public static NetworkAddress newLoopback(short port) {
        return new NetworkAddress(constructNewLoopback(port));
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
    
    /**
     * Creates a new #GSocketConnectable for connecting to the given
     * @hostname and @port. May fail and return %NULL in case
     * parsing @host_and_port fails.
     * 
     * @host_and_port may be in any of a number of recognised formats; an IPv6
     * address, an IPv4 address, or a domain name (in which case a DNS
     * lookup is performed). Quoting with [] is supported for all address
     * types. A port override may be specified in the usual way with a
     * colon.
     * 
     * If no port is specified in @host_and_port then @default_port will be
     * used as the port number to connect to.
     * 
     * In general, @host_and_port is expected to be provided by the user
     * (allowing them to give the hostname, and a port override if necessary)
     * and @default_port is expected to be provided by the application.
     * 
     * (The port component of @host_and_port can also be specified as a
     * service name rather than as a numeric port, but this functionality
     * is deprecated, because it depends on the contents of /etc/services,
     * which is generally quite sparse on platforms other than Linux.)
     */
    public static NetworkAddress parse(java.lang.String hostAndPort, short defaultPort) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_network_address_parse(Interop.allocateNativeString(hostAndPort).handle(), defaultPort, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new NetworkAddress(References.get(RESULT, true));
    }
    
    /**
     * Creates a new #GSocketConnectable for connecting to the given
     * @uri. May fail and return %NULL in case parsing @uri fails.
     * 
     * Using this rather than g_network_address_new() or
     * g_network_address_parse() allows #GSocketClient to determine
     * when to use application-specific proxy protocols.
     */
    public static NetworkAddress parseUri(java.lang.String uri, short defaultPort) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_network_address_parse_uri(Interop.allocateNativeString(uri).handle(), defaultPort, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new NetworkAddress(References.get(RESULT, true));
    }
    
}
