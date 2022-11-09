package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Support for proxied {@link InetSocketAddress}.
 * @version 2.26
 */
public class ProxyAddress extends org.gtk.gio.InetSocketAddress implements org.gtk.gio.SocketConnectable {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GProxyAddress";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.InetSocketAddress.getMemoryLayout().withName("parent_instance"),
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
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gio.InetSocketAddress parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gio.InetSocketAddress(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a ProxyAddress proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ProxyAddress(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ProxyAddress if its GType is a (or inherits from) "GProxyAddress".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "ProxyAddress" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GProxyAddress", a ClassCastException will be thrown.
     */
    public static ProxyAddress castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GProxyAddress"))) {
            return new ProxyAddress(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GProxyAddress");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.gio.InetAddress inetaddr, short port, @NotNull java.lang.String protocol, @NotNull java.lang.String destHostname, short destPort, @Nullable java.lang.String username, @Nullable java.lang.String password) {
        java.util.Objects.requireNonNull(inetaddr, "Parameter 'inetaddr' must not be null");
        java.util.Objects.requireNonNull(protocol, "Parameter 'protocol' must not be null");
        java.util.Objects.requireNonNull(destHostname, "Parameter 'destHostname' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_proxy_address_new.invokeExact(
                    inetaddr.handle(),
                    port,
                    Interop.allocateNativeString(protocol),
                    Interop.allocateNativeString(destHostname),
                    destPort,
                    (Addressable) (username == null ? MemoryAddress.NULL : Interop.allocateNativeString(username)),
                    (Addressable) (password == null ? MemoryAddress.NULL : Interop.allocateNativeString(password)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link ProxyAddress} for {@code inetaddr} with {@code protocol} that should
     * tunnel through {@code dest_hostname} and {@code dest_port}.
     * <p>
     * (Note that this method doesn't set the {@link ProxyAddress}:uri or
     * {@link ProxyAddress}:destination-protocol fields; use g_object_new()
     * directly if you want to set those.)
     * @param inetaddr The proxy server {@link InetAddress}.
     * @param port The proxy server port.
     * @param protocol The proxy protocol to support, in lower case (e.g. socks, http).
     * @param destHostname The destination hostname the proxy should tunnel to.
     * @param destPort The destination port to tunnel to.
     * @param username The username to authenticate to the proxy server
     *     (or {@code null}).
     * @param password The password to authenticate to the proxy server
     *     (or {@code null}).
     */
    public ProxyAddress(@NotNull org.gtk.gio.InetAddress inetaddr, short port, @NotNull java.lang.String protocol, @NotNull java.lang.String destHostname, short destPort, @Nullable java.lang.String username, @Nullable java.lang.String password) {
        super(constructNew(inetaddr, port, protocol, destHostname, destPort, username, password), Ownership.FULL);
    }
    
    /**
     * Gets {@code proxy}'s destination hostname; that is, the name of the host
     * that will be connected to via the proxy, not the name of the proxy
     * itself.
     * @return the {@code proxy}'s destination hostname
     */
    public @NotNull java.lang.String getDestinationHostname() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_proxy_address_get_destination_hostname.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets {@code proxy}'s destination port; that is, the port on the
     * destination host that will be connected to via the proxy, not the
     * port number of the proxy itself.
     * @return the {@code proxy}'s destination port
     */
    public short getDestinationPort() {
        short RESULT;
        try {
            RESULT = (short) DowncallHandles.g_proxy_address_get_destination_port.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the protocol that is being spoken to the destination
     * server; eg, "http" or "ftp".
     * @return the {@code proxy}'s destination protocol
     */
    public @NotNull java.lang.String getDestinationProtocol() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_proxy_address_get_destination_protocol.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets {@code proxy}'s password.
     * @return the {@code proxy}'s password
     */
    public @Nullable java.lang.String getPassword() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_proxy_address_get_password.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets {@code proxy}'s protocol. eg, "socks" or "http"
     * @return the {@code proxy}'s protocol
     */
    public @NotNull java.lang.String getProtocol() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_proxy_address_get_protocol.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the proxy URI that {@code proxy} was constructed from.
     * @return the {@code proxy}'s URI, or {@code null} if unknown
     */
    public @Nullable java.lang.String getUri() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_proxy_address_get_uri.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets {@code proxy}'s username.
     * @return the {@code proxy}'s username
     */
    public @Nullable java.lang.String getUsername() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_proxy_address_get_username.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_proxy_address_new = Interop.downcallHandle(
            "g_proxy_address_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_SHORT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_SHORT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_proxy_address_get_destination_hostname = Interop.downcallHandle(
            "g_proxy_address_get_destination_hostname",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_proxy_address_get_destination_port = Interop.downcallHandle(
            "g_proxy_address_get_destination_port",
            FunctionDescriptor.of(ValueLayout.JAVA_SHORT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_proxy_address_get_destination_protocol = Interop.downcallHandle(
            "g_proxy_address_get_destination_protocol",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_proxy_address_get_password = Interop.downcallHandle(
            "g_proxy_address_get_password",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_proxy_address_get_protocol = Interop.downcallHandle(
            "g_proxy_address_get_protocol",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_proxy_address_get_uri = Interop.downcallHandle(
            "g_proxy_address_get_uri",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_proxy_address_get_username = Interop.downcallHandle(
            "g_proxy_address_get_username",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
}
