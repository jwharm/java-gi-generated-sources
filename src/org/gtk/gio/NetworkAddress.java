package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * {@link NetworkAddress} provides an easy way to resolve a hostname and
 * then attempt to connect to that host, handling the possibility of
 * multiple IP addresses and multiple address families.
 * <p>
 * The enumeration results of resolved addresses <strong>may</strong> be cached as long
 * as this object is kept alive which may have unexpected results if
 * alive for too long.
 * <p>
 * See {@link SocketConnectable} for an example of using the connectable
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
     * Creates a new {@link SocketConnectable} for connecting to the given
     * {@code hostname} and {@code port}.
     * <p>
     * Note that depending on the configuration of the machine, a
     * {@code hostname} of {@code localhost} may refer to the IPv4 loopback address
     * only, or to both IPv4 and IPv6; use
     * g_network_address_new_loopback() to create a {@link NetworkAddress} that
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
     * Creates a new {@link SocketConnectable} for connecting to the local host
     * over a loopback connection to the given {@code port}. This is intended for
     * use in connecting to local services which may be running on IPv4 or
     * IPv6.
     * <p>
     * The connectable will return IPv4 and IPv6 loopback addresses,
     * regardless of how the host resolves {@code localhost}. By contrast,
     * g_network_address_new() will often only return an IPv4 address when
     * resolving {@code localhost}, and an IPv6 address for {@code localhost6}.
     * <p>
     * g_network_address_get_hostname() will always return {@code localhost} for
     * a {@link NetworkAddress} created with this constructor.
     */
    public static NetworkAddress newLoopback(short port) {
        return new NetworkAddress(constructNewLoopback(port));
    }
    
    /**
     * Gets {@code addr}'s hostname. This might be either UTF-8 or ASCII-encoded,
     * depending on what {@code addr} was created with.
     */
    public java.lang.String getHostname() {
        var RESULT = gtk_h.g_network_address_get_hostname(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets {@code addr}'s port number
     */
    public short getPort() {
        var RESULT = gtk_h.g_network_address_get_port(handle());
        return RESULT;
    }
    
    /**
     * Gets {@code addr}'s scheme
     */
    public java.lang.String getScheme() {
        var RESULT = gtk_h.g_network_address_get_scheme(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Creates a new {@link SocketConnectable} for connecting to the given
     * {@code hostname} and {@code port}. May fail and return <code>null</code> in case
     * parsing {@code host_and_port} fails.
     * <p>
     * {@code host_and_port} may be in any of a number of recognised formats; an IPv6
     * address, an IPv4 address, or a domain name (in which case a DNS
     * lookup is performed). Quoting with [] is supported for all address
     * types. A port override may be specified in the usual way with a
     * colon.
     * <p>
     * If no port is specified in {@code host_and_port} then {@code default_port} will be
     * used as the port number to connect to.
     * <p>
     * In general, {@code host_and_port} is expected to be provided by the user
     * (allowing them to give the hostname, and a port override if necessary)
     * and {@code default_port} is expected to be provided by the application.
     * <p>
     * (The port component of {@code host_and_port} can also be specified as a
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
     * Creates a new {@link SocketConnectable} for connecting to the given
     * {@code uri}. May fail and return <code>null</code> in case parsing {@code uri} fails.
     * <p>
     * Using this rather than g_network_address_new() or
     * g_network_address_parse() allows {@link SocketClient} to determine
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
