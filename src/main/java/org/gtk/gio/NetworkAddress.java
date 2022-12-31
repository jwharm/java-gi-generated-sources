package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link NetworkAddress} provides an easy way to resolve a hostname and
 * then attempt to connect to that host, handling the possibility of
 * multiple IP addresses and multiple address families.
 * <p>
 * The enumeration results of resolved addresses <em>may</em> be cached as long
 * as this object is kept alive which may have unexpected results if
 * alive for too long.
 * <p>
 * See {@link SocketConnectable} for an example of using the connectable
 * interface.
 */
public class NetworkAddress extends org.gtk.gobject.GObject implements org.gtk.gio.SocketConnectable {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GNetworkAddress";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a NetworkAddress proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected NetworkAddress(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, NetworkAddress> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new NetworkAddress(input, ownership);
    
    private static MemoryAddress constructNew(java.lang.String hostname, short port) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_network_address_new.invokeExact(
                    Marshal.stringToAddress.marshal(hostname, null),
                    port);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param hostname the hostname
     * @param port the port
     */
    public NetworkAddress(java.lang.String hostname, short port) {
        super(constructNew(hostname, port), Ownership.FULL);
    }
    
    private static MemoryAddress constructNewLoopback(short port) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_network_address_new_loopback.invokeExact(
                    port);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param port the port
     * @return the new {@link NetworkAddress}
     */
    public static NetworkAddress newLoopback(short port) {
        var RESULT = constructNewLoopback(port);
        return (org.gtk.gio.NetworkAddress) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.NetworkAddress.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets {@code addr}'s hostname. This might be either UTF-8 or ASCII-encoded,
     * depending on what {@code addr} was created with.
     * @return {@code addr}'s hostname
     */
    public java.lang.String getHostname() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_network_address_get_hostname.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets {@code addr}'s port number
     * @return {@code addr}'s port (which may be 0)
     */
    public short getPort() {
        short RESULT;
        try {
            RESULT = (short) DowncallHandles.g_network_address_get_port.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets {@code addr}'s scheme
     * @return {@code addr}'s scheme ({@code null} if not built from URI)
     */
    public @Nullable java.lang.String getScheme() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_network_address_get_scheme.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_network_address_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Creates a new {@link SocketConnectable} for connecting to the given
     * {@code hostname} and {@code port}. May fail and return {@code null} in case
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
     * @param hostAndPort the hostname and optionally a port
     * @param defaultPort the default port if not in {@code host_and_port}
     * @return the new
     *   {@link NetworkAddress}, or {@code null} on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static org.gtk.gio.NetworkAddress parse(java.lang.String hostAndPort, short defaultPort) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_network_address_parse.invokeExact(
                    Marshal.stringToAddress.marshal(hostAndPort, null),
                    defaultPort,
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (org.gtk.gio.NetworkAddress) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.NetworkAddress.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new {@link SocketConnectable} for connecting to the given
     * {@code uri}. May fail and return {@code null} in case parsing {@code uri} fails.
     * <p>
     * Using this rather than g_network_address_new() or
     * g_network_address_parse() allows {@link SocketClient} to determine
     * when to use application-specific proxy protocols.
     * @param uri the hostname and optionally a port
     * @param defaultPort The default port if none is found in the URI
     * @return the new
     *   {@link NetworkAddress}, or {@code null} on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static org.gtk.gio.NetworkAddress parseUri(java.lang.String uri, short defaultPort) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_network_address_parse_uri.invokeExact(
                    Marshal.stringToAddress.marshal(uri, null),
                    defaultPort,
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (org.gtk.gio.NetworkAddress) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.NetworkAddress.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * A {@link NetworkAddress.Builder} object constructs a {@link NetworkAddress} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link NetworkAddress.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link NetworkAddress} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link NetworkAddress}.
         * @return A new instance of {@code NetworkAddress} with the properties 
         *         that were set in the Builder object.
         */
        public NetworkAddress build() {
            return (NetworkAddress) org.gtk.gobject.GObject.newWithProperties(
                NetworkAddress.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setHostname(java.lang.String hostname) {
            names.add("hostname");
            values.add(org.gtk.gobject.Value.create(hostname));
            return this;
        }
        
        public Builder setPort(int port) {
            names.add("port");
            values.add(org.gtk.gobject.Value.create(port));
            return this;
        }
        
        public Builder setScheme(java.lang.String scheme) {
            names.add("scheme");
            values.add(org.gtk.gobject.Value.create(scheme));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_network_address_new = Interop.downcallHandle(
            "g_network_address_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT),
            false
        );
        
        private static final MethodHandle g_network_address_new_loopback = Interop.downcallHandle(
            "g_network_address_new_loopback",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT),
            false
        );
        
        private static final MethodHandle g_network_address_get_hostname = Interop.downcallHandle(
            "g_network_address_get_hostname",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_network_address_get_port = Interop.downcallHandle(
            "g_network_address_get_port",
            FunctionDescriptor.of(Interop.valueLayout.C_SHORT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_network_address_get_scheme = Interop.downcallHandle(
            "g_network_address_get_scheme",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_network_address_get_type = Interop.downcallHandle(
            "g_network_address_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_network_address_parse = Interop.downcallHandle(
            "g_network_address_parse",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_network_address_parse_uri = Interop.downcallHandle(
            "g_network_address_parse_uri",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
