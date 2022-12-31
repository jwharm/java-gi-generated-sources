package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link SocketAddress} is the equivalent of struct sockaddr in the BSD
 * sockets API. This is an abstract class; use {@link InetSocketAddress}
 * for internet sockets, or {@link UnixSocketAddress} for UNIX domain sockets.
 */
public class SocketAddress extends org.gtk.gobject.GObject implements org.gtk.gio.SocketConnectable {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSocketAddress";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a SocketAddress proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected SocketAddress(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, SocketAddress> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new SocketAddress(input, ownership);
    
    private static MemoryAddress constructNewFromNative(java.lang.foreign.MemoryAddress native_, long len) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_socket_address_new_from_native.invokeExact(
                    (Addressable) native_,
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@link SocketAddress} subclass corresponding to the native
     * struct sockaddr {@code native}.
     * @param native_ a pointer to a struct sockaddr
     * @param len the size of the memory location pointed to by {@code native}
     * @return a new {@link SocketAddress} if {@code native} could successfully
     *     be converted, otherwise {@code null}
     */
    public static SocketAddress newFromNative(java.lang.foreign.MemoryAddress native_, long len) {
        var RESULT = constructNewFromNative(native_, len);
        return (org.gtk.gio.SocketAddress) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.SocketAddress.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the socket family type of {@code address}.
     * @return the socket family type of {@code address}
     */
    public org.gtk.gio.SocketFamily getFamily() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_address_get_family.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gio.SocketFamily.of(RESULT);
    }
    
    /**
     * Gets the size of {@code address}'s native struct sockaddr.
     * You can use this to allocate memory to pass to
     * g_socket_address_to_native().
     * @return the size of the native struct sockaddr that
     *     {@code address} represents
     */
    public long getNativeSize() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_socket_address_get_native_size.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Converts a {@link SocketAddress} to a native struct sockaddr, which can
     * be passed to low-level functions like connect() or bind().
     * <p>
     * If not enough space is available, a {@link IOErrorEnum#NO_SPACE} error
     * is returned. If the address type is not known on the system
     * then a {@link IOErrorEnum#NOT_SUPPORTED} error is returned.
     * @param dest a pointer to a memory location that will contain the native
     * struct sockaddr
     * @param destlen the size of {@code dest}. Must be at least as large as
     *     g_socket_address_get_native_size()
     * @return {@code true} if {@code dest} was filled in, {@code false} on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean toNative(@Nullable java.lang.foreign.MemoryAddress dest, long destlen) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_address_to_native.invokeExact(
                    handle(),
                    (Addressable) (dest == null ? MemoryAddress.NULL : (Addressable) dest),
                    destlen,
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_socket_address_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link SocketAddress.Builder} object constructs a {@link SocketAddress} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link SocketAddress.Builder#build()}. 
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
         * Finish building the {@link SocketAddress} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link SocketAddress}.
         * @return A new instance of {@code SocketAddress} with the properties 
         *         that were set in the Builder object.
         */
        public SocketAddress build() {
            return (SocketAddress) org.gtk.gobject.GObject.newWithProperties(
                SocketAddress.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setFamily(org.gtk.gio.SocketFamily family) {
            names.add("family");
            values.add(org.gtk.gobject.Value.create(family));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_socket_address_new_from_native = Interop.downcallHandle(
            "g_socket_address_new_from_native",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_socket_address_get_family = Interop.downcallHandle(
            "g_socket_address_get_family",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_socket_address_get_native_size = Interop.downcallHandle(
            "g_socket_address_get_native_size",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_socket_address_to_native = Interop.downcallHandle(
            "g_socket_address_to_native",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_socket_address_get_type = Interop.downcallHandle(
            "g_socket_address_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
