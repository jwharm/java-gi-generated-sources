package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An IPv4 or IPv6 socket address; that is, the combination of a
 * {@link InetAddress} and a port number.
 */
public class InetSocketAddress extends SocketAddress implements SocketConnectable {

    public InetSocketAddress(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to InetSocketAddress */
    public static InetSocketAddress castFrom(org.gtk.gobject.Object gobject) {
        return new InetSocketAddress(gobject.refcounted());
    }
    
    private static final MethodHandle g_inet_socket_address_new = Interop.downcallHandle(
        "g_inet_socket_address_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_SHORT)
    );
    
    private static Refcounted constructNew(@NotNull InetAddress address, @NotNull short port) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_inet_socket_address_new.invokeExact(address.handle(), port), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link InetSocketAddress} for {@code address} and {@code port}.
     */
    public InetSocketAddress(@NotNull InetAddress address, @NotNull short port) {
        super(constructNew(address, port));
    }
    
    private static final MethodHandle g_inet_socket_address_new_from_string = Interop.downcallHandle(
        "g_inet_socket_address_new_from_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNewFromString(@NotNull java.lang.String address, @NotNull int port) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_inet_socket_address_new_from_string.invokeExact(Interop.allocateNativeString(address), port), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link InetSocketAddress} for {@code address} and {@code port}.
     * <p>
     * If {@code address} is an IPv6 address, it can also contain a scope ID
     * (separated from the address by a {@code %}).
     */
    public static InetSocketAddress newFromString(@NotNull java.lang.String address, @NotNull int port) {
        return new InetSocketAddress(constructNewFromString(address, port));
    }
    
    private static final MethodHandle g_inet_socket_address_get_address = Interop.downcallHandle(
        "g_inet_socket_address_get_address",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets {@code address}'s {@link InetAddress}.
     */
    public @NotNull InetAddress getAddress() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_inet_socket_address_get_address.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new InetAddress(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_inet_socket_address_get_flowinfo = Interop.downcallHandle(
        "g_inet_socket_address_get_flowinfo",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code sin6_flowinfo} field from {@code address},
     * which must be an IPv6 address.
     */
    public int getFlowinfo() {
        int RESULT;
        try {
            RESULT = (int) g_inet_socket_address_get_flowinfo.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_inet_socket_address_get_port = Interop.downcallHandle(
        "g_inet_socket_address_get_port",
        FunctionDescriptor.of(ValueLayout.JAVA_SHORT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets {@code address}'s port.
     */
    public short getPort() {
        short RESULT;
        try {
            RESULT = (short) g_inet_socket_address_get_port.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_inet_socket_address_get_scope_id = Interop.downcallHandle(
        "g_inet_socket_address_get_scope_id",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code sin6_scope_id} field from {@code address},
     * which must be an IPv6 address.
     */
    public int getScopeId() {
        int RESULT;
        try {
            RESULT = (int) g_inet_socket_address_get_scope_id.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
}
