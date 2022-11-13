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
    
    private static final java.lang.String C_TYPE_NAME = "GInetSocketAddress";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.SocketAddress.getMemoryLayout().withName("parent_instance"),
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
    public org.gtk.gio.SocketAddress parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gio.SocketAddress(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a InetSocketAddress proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public InetSocketAddress(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to InetSocketAddress if its GType is a (or inherits from) "GInetSocketAddress".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code InetSocketAddress} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GInetSocketAddress", a ClassCastException will be thrown.
     */
    public static InetSocketAddress castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GInetSocketAddress"))) {
            return new InetSocketAddress(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GInetSocketAddress");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.gio.InetAddress address, short port) {
        java.util.Objects.requireNonNull(address, "Parameter 'address' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_inet_socket_address_new.invokeExact(
                    address.handle(),
                    port);
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
        super(constructNew(address, port), Ownership.FULL);
    }
    
    private static Addressable constructNewFromString(@NotNull java.lang.String address, int port) {
        java.util.Objects.requireNonNull(address, "Parameter 'address' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_inet_socket_address_new_from_string.invokeExact(
                    Interop.allocateNativeString(address),
                    port);
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
        return new InetSocketAddress(constructNewFromString(address, port), Ownership.FULL);
    }
    
    /**
     * Gets {@code address}'s {@link InetAddress}.
     * @return the {@link InetAddress} for {@code address}, which must be
     * g_object_ref()'d if it will be stored
     */
    public @NotNull org.gtk.gio.InetAddress getAddress() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_inet_socket_address_get_address.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.InetAddress(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the {@code sin6_flowinfo} field from {@code address},
     * which must be an IPv6 address.
     * @return the flowinfo field
     */
    public int getFlowinfo() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_inet_socket_address_get_flowinfo.invokeExact(
                    handle());
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
            RESULT = (short) DowncallHandles.g_inet_socket_address_get_port.invokeExact(
                    handle());
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
            RESULT = (int) DowncallHandles.g_inet_socket_address_get_scope_id.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_inet_socket_address_new = Interop.downcallHandle(
            "g_inet_socket_address_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_SHORT),
            false
        );
        
        private static final MethodHandle g_inet_socket_address_new_from_string = Interop.downcallHandle(
            "g_inet_socket_address_new_from_string",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_inet_socket_address_get_address = Interop.downcallHandle(
            "g_inet_socket_address_get_address",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_inet_socket_address_get_flowinfo = Interop.downcallHandle(
            "g_inet_socket_address_get_flowinfo",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_inet_socket_address_get_port = Interop.downcallHandle(
            "g_inet_socket_address_get_port",
            FunctionDescriptor.of(ValueLayout.JAVA_SHORT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_inet_socket_address_get_scope_id = Interop.downcallHandle(
            "g_inet_socket_address_get_scope_id",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
    }
}
