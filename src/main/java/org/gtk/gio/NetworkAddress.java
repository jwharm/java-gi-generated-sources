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
public class NetworkAddress extends org.gtk.gobject.Object implements org.gtk.gio.SocketConnectable {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GNetworkAddress";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a NetworkAddress proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public NetworkAddress(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to NetworkAddress if its GType is a (or inherits from) "GNetworkAddress".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code NetworkAddress} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GNetworkAddress", a ClassCastException will be thrown.
     */
    public static NetworkAddress castFrom(org.gtk.gobject.Object gobject) {
            return new NetworkAddress(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew(@NotNull java.lang.String hostname, short port) {
        java.util.Objects.requireNonNull(hostname, "Parameter 'hostname' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_network_address_new.invokeExact(
                    Interop.allocateNativeString(hostname),
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
    public NetworkAddress(@NotNull java.lang.String hostname, short port) {
        super(constructNew(hostname, port), Ownership.FULL);
    }
    
    private static Addressable constructNewLoopback(short port) {
        Addressable RESULT;
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
        return new NetworkAddress(constructNewLoopback(port), Ownership.FULL);
    }
    
    /**
     * Gets {@code addr}'s hostname. This might be either UTF-8 or ASCII-encoded,
     * depending on what {@code addr} was created with.
     * @return {@code addr}'s hostname
     */
    public @NotNull java.lang.String getHostname() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_network_address_get_hostname.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
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
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
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
    public static @NotNull org.gtk.gio.NetworkAddress parse(@NotNull java.lang.String hostAndPort, short defaultPort) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(hostAndPort, "Parameter 'hostAndPort' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_network_address_parse.invokeExact(
                    Interop.allocateNativeString(hostAndPort),
                    defaultPort,
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.NetworkAddress(RESULT, Ownership.FULL);
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
    public static @NotNull org.gtk.gio.NetworkAddress parseUri(@NotNull java.lang.String uri, short defaultPort) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_network_address_parse_uri.invokeExact(
                    Interop.allocateNativeString(uri),
                    defaultPort,
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.NetworkAddress(RESULT, Ownership.FULL);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link NetworkAddress.Build} object constructs a {@link NetworkAddress} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link NetworkAddress} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link NetworkAddress} using {@link NetworkAddress#castFrom}.
         * @return A new instance of {@code NetworkAddress} with the properties 
         *         that were set in the Build object.
         */
        public NetworkAddress construct() {
            return NetworkAddress.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    NetworkAddress.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setHostname(java.lang.String hostname) {
            names.add("hostname");
            values.add(org.gtk.gobject.Value.create(hostname));
            return this;
        }
        
        public Build setPort(int port) {
            names.add("port");
            values.add(org.gtk.gobject.Value.create(port));
            return this;
        }
        
        public Build setScheme(java.lang.String scheme) {
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
