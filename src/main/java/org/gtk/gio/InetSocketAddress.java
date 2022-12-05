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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), InetSocketAddress.getType())) {
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_inet_socket_address_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gio.SocketAddress.Build {
        
         /**
         * A {@link InetSocketAddress.Build} object constructs a {@link InetSocketAddress} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link InetSocketAddress} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link InetSocketAddress} using {@link InetSocketAddress#castFrom}.
         * @return A new instance of {@code InetSocketAddress} with the properties 
         *         that were set in the Build object.
         */
        public InetSocketAddress construct() {
            return InetSocketAddress.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    InetSocketAddress.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setAddress(org.gtk.gio.InetAddress address) {
            names.add("address");
            values.add(org.gtk.gobject.Value.create(address));
            return this;
        }
        
        /**
         * The {@code sin6_flowinfo} field, for IPv6 addresses.
         * @param flowinfo The value for the {@code flowinfo} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFlowinfo(int flowinfo) {
            names.add("flowinfo");
            values.add(org.gtk.gobject.Value.create(flowinfo));
            return this;
        }
        
        public Build setPort(int port) {
            names.add("port");
            values.add(org.gtk.gobject.Value.create(port));
            return this;
        }
        
        public Build setScopeId(int scopeId) {
            names.add("scope-id");
            values.add(org.gtk.gobject.Value.create(scopeId));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_inet_socket_address_new = Interop.downcallHandle(
            "g_inet_socket_address_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT),
            false
        );
        
        private static final MethodHandle g_inet_socket_address_new_from_string = Interop.downcallHandle(
            "g_inet_socket_address_new_from_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_inet_socket_address_get_address = Interop.downcallHandle(
            "g_inet_socket_address_get_address",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_inet_socket_address_get_flowinfo = Interop.downcallHandle(
            "g_inet_socket_address_get_flowinfo",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_inet_socket_address_get_port = Interop.downcallHandle(
            "g_inet_socket_address_get_port",
            FunctionDescriptor.of(Interop.valueLayout.C_SHORT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_inet_socket_address_get_scope_id = Interop.downcallHandle(
            "g_inet_socket_address_get_scope_id",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_inet_socket_address_get_type = Interop.downcallHandle(
            "g_inet_socket_address_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
