package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An IPv4 or IPv6 socket address; that is, the combination of a
 * {@link InetAddress} and a port number.
 */
public class InetSocketAddress extends org.gtk.gio.SocketAddress implements org.gtk.gio.SocketConnectable {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.SocketAddress.getMemoryLayout().withName("parent_instance"),
        org.gtk.gio.InetSocketAddressPrivate.getMemoryLayout().withName("priv")
    ).withName("GInetSocketAddress");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public InetSocketAddress(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to InetSocketAddress */
    public static InetSocketAddress castFrom(org.gtk.gobject.Object gobject) {
        return new InetSocketAddress(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.gio.InetAddress address, short port) {
        java.util.Objects.requireNonNull(address, "Parameter 'address' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_inet_socket_address_new.invokeExact(address.handle(), port), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link InetSocketAddress} for {@code address} and {@code port}.
     * @param address a {@link InetAddress}
     * @param port a port number
     */
    public InetSocketAddress(@NotNull org.gtk.gio.InetAddress address, short port) {
        super(constructNew(address, port));
    }
    
    private static Refcounted constructNewFromString(@NotNull java.lang.String address, int port) {
        java.util.Objects.requireNonNull(address, "Parameter 'address' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_inet_socket_address_new_from_string.invokeExact(Interop.allocateNativeString(address), port), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link InetSocketAddress} for {@code address} and {@code port}.
     * <p>
     * If {@code address} is an IPv6 address, it can also contain a scope ID
     * (separated from the address by a {@code %}).
     * @param address the string form of an IP address
     * @param port a port number
     * @return a new {@link InetSocketAddress},
     * or {@code null} if {@code address} cannot be parsed.
     */
    public static InetSocketAddress newFromString(@NotNull java.lang.String address, int port) {
        return new InetSocketAddress(constructNewFromString(address, port));
    }
    
    /**
     * Gets {@code address}'s {@link InetAddress}.
     * @return the {@link InetAddress} for {@code address}, which must be
     * g_object_ref()'d if it will be stored
     */
    public @NotNull org.gtk.gio.InetAddress getAddress() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_inet_socket_address_get_address.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.InetAddress(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the {@code sin6_flowinfo} field from {@code address},
     * which must be an IPv6 address.
     * @return the flowinfo field
     */
    public int getFlowinfo() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_inet_socket_address_get_flowinfo.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets {@code address}'s port.
     * @return the port for {@code address}
     */
    public short getPort() {
        short RESULT;
        try {
            RESULT = (short) DowncallHandles.g_inet_socket_address_get_port.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the {@code sin6_scope_id} field from {@code address},
     * which must be an IPv6 address.
     * @return the scope id field
     */
    public int getScopeId() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_inet_socket_address_get_scope_id.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_inet_socket_address_new = Interop.downcallHandle(
            "g_inet_socket_address_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_SHORT)
        );
        
        private static final MethodHandle g_inet_socket_address_new_from_string = Interop.downcallHandle(
            "g_inet_socket_address_new_from_string",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_inet_socket_address_get_address = Interop.downcallHandle(
            "g_inet_socket_address_get_address",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_inet_socket_address_get_flowinfo = Interop.downcallHandle(
            "g_inet_socket_address_get_flowinfo",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_inet_socket_address_get_port = Interop.downcallHandle(
            "g_inet_socket_address_get_port",
            FunctionDescriptor.of(ValueLayout.JAVA_SHORT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_inet_socket_address_get_scope_id = Interop.downcallHandle(
            "g_inet_socket_address_get_scope_id",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
    }
}
