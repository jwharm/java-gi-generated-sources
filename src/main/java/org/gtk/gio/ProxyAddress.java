package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Support for proxied {@link InetSocketAddress}.
 */
public class ProxyAddress extends InetSocketAddress implements SocketConnectable {

    public ProxyAddress(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ProxyAddress */
    public static ProxyAddress castFrom(org.gtk.gobject.Object gobject) {
        return new ProxyAddress(gobject.refcounted());
    }
    
    private static final MethodHandle g_proxy_address_new = Interop.downcallHandle(
        "g_proxy_address_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_SHORT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_SHORT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull InetAddress inetaddr, @NotNull short port, @NotNull java.lang.String protocol, @NotNull java.lang.String destHostname, @NotNull short destPort, @Nullable java.lang.String username, @Nullable java.lang.String password) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_proxy_address_new.invokeExact(inetaddr.handle(), port, Interop.allocateNativeString(protocol), Interop.allocateNativeString(destHostname), destPort, Interop.allocateNativeString(username), Interop.allocateNativeString(password)), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link ProxyAddress} for {@code inetaddr} with {@code protocol} that should
     * tunnel through {@code dest_hostname} and {@code dest_port}.
     * <p>
     * (Note that this method doesn't set the {@link ProxyAddress}:uri or
     * {@link ProxyAddress}:destination-protocol fields; use g_object_new()
     * directly if you want to set those.)
     */
    public ProxyAddress(@NotNull InetAddress inetaddr, @NotNull short port, @NotNull java.lang.String protocol, @NotNull java.lang.String destHostname, @NotNull short destPort, @Nullable java.lang.String username, @Nullable java.lang.String password) {
        super(constructNew(inetaddr, port, protocol, destHostname, destPort, username, password));
    }
    
    private static final MethodHandle g_proxy_address_get_destination_hostname = Interop.downcallHandle(
        "g_proxy_address_get_destination_hostname",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets {@code proxy}'s destination hostname; that is, the name of the host
     * that will be connected to via the proxy, not the name of the proxy
     * itself.
     */
    public @NotNull java.lang.String getDestinationHostname() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_proxy_address_get_destination_hostname.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_proxy_address_get_destination_port = Interop.downcallHandle(
        "g_proxy_address_get_destination_port",
        FunctionDescriptor.of(ValueLayout.JAVA_SHORT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets {@code proxy}'s destination port; that is, the port on the
     * destination host that will be connected to via the proxy, not the
     * port number of the proxy itself.
     */
    public short getDestinationPort() {
        short RESULT;
        try {
            RESULT = (short) g_proxy_address_get_destination_port.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_proxy_address_get_destination_protocol = Interop.downcallHandle(
        "g_proxy_address_get_destination_protocol",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the protocol that is being spoken to the destination
     * server; eg, "http" or "ftp".
     */
    public @NotNull java.lang.String getDestinationProtocol() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_proxy_address_get_destination_protocol.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_proxy_address_get_password = Interop.downcallHandle(
        "g_proxy_address_get_password",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets {@code proxy}'s password.
     */
    public @Nullable java.lang.String getPassword() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_proxy_address_get_password.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_proxy_address_get_protocol = Interop.downcallHandle(
        "g_proxy_address_get_protocol",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets {@code proxy}'s protocol. eg, "socks" or "http"
     */
    public @NotNull java.lang.String getProtocol() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_proxy_address_get_protocol.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_proxy_address_get_uri = Interop.downcallHandle(
        "g_proxy_address_get_uri",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the proxy URI that {@code proxy} was constructed from.
     */
    public @Nullable java.lang.String getUri() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_proxy_address_get_uri.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_proxy_address_get_username = Interop.downcallHandle(
        "g_proxy_address_get_username",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets {@code proxy}'s username.
     */
    public @Nullable java.lang.String getUsername() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_proxy_address_get_username.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
}
