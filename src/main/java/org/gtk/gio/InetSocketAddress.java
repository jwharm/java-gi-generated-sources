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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gio.SocketAddress.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a InetSocketAddress proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected InetSocketAddress(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, InetSocketAddress> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new InetSocketAddress(input, ownership);
    
    private static MemoryAddress constructNew(org.gtk.gio.InetAddress address, short port) {
        MemoryAddress RESULT;
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
    public InetSocketAddress(org.gtk.gio.InetAddress address, short port) {
        super(constructNew(address, port), Ownership.FULL);
    }
    
    private static MemoryAddress constructNewFromString(java.lang.String address, int port) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_inet_socket_address_new_from_string.invokeExact(
                    Marshal.stringToAddress.marshal(address, null),
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
    public static InetSocketAddress newFromString(java.lang.String address, int port) {
        var RESULT = constructNewFromString(address, port);
        return (org.gtk.gio.InetSocketAddress) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.InetSocketAddress.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets {@code address}'s {@link InetAddress}.
     * @return the {@link InetAddress} for {@code address}, which must be
     * g_object_ref()'d if it will be stored
     */
    public org.gtk.gio.InetAddress getAddress() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_inet_socket_address_get_address.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.InetAddress) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.InetAddress.fromAddress).marshal(RESULT, Ownership.NONE);
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
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_inet_socket_address_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link InetSocketAddress.Builder} object constructs a {@link InetSocketAddress} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link InetSocketAddress.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gio.SocketAddress.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link InetSocketAddress} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link InetSocketAddress}.
         * @return A new instance of {@code InetSocketAddress} with the properties 
         *         that were set in the Builder object.
         */
        public InetSocketAddress build() {
            return (InetSocketAddress) org.gtk.gobject.GObject.newWithProperties(
                InetSocketAddress.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setAddress(org.gtk.gio.InetAddress address) {
            names.add("address");
            values.add(org.gtk.gobject.Value.create(address));
            return this;
        }
        
        /**
         * The {@code sin6_flowinfo} field, for IPv6 addresses.
         * @param flowinfo The value for the {@code flowinfo} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFlowinfo(int flowinfo) {
            names.add("flowinfo");
            values.add(org.gtk.gobject.Value.create(flowinfo));
            return this;
        }
        
        public Builder setPort(int port) {
            names.add("port");
            values.add(org.gtk.gobject.Value.create(port));
            return this;
        }
        
        public Builder setScopeId(int scopeId) {
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
