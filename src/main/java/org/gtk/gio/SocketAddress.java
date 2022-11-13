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
public class SocketAddress extends org.gtk.gobject.Object implements org.gtk.gio.SocketConnectable {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSocketAddress";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance")
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
    public org.gtk.gobject.Object parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gobject.Object(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a SocketAddress proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SocketAddress(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to SocketAddress if its GType is a (or inherits from) "GSocketAddress".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code SocketAddress} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GSocketAddress", a ClassCastException will be thrown.
     */
    public static SocketAddress castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GSocketAddress"))) {
            return new SocketAddress(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GSocketAddress");
        }
    }
    
    private static Addressable constructNewFromNative(@NotNull java.lang.foreign.MemoryAddress native_, long len) {
        java.util.Objects.requireNonNull(native_, "Parameter 'native_' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_socket_address_new_from_native.invokeExact(
                    native_,
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
    public static SocketAddress newFromNative(@NotNull java.lang.foreign.MemoryAddress native_, long len) {
        return new SocketAddress(constructNewFromNative(native_, len), Ownership.FULL);
    }
    
    /**
     * Gets the socket family type of {@code address}.
     * @return the socket family type of {@code address}
     */
    public @NotNull org.gtk.gio.SocketFamily getFamily() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_address_get_family.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.SocketFamily(RESULT);
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
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_address_to_native.invokeExact(
                    handle(),
                    (Addressable) (dest == null ? MemoryAddress.NULL : dest),
                    destlen,
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_socket_address_new_from_native = Interop.downcallHandle(
            "g_socket_address_new_from_native",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG),
            false
        );
        
        private static final MethodHandle g_socket_address_get_family = Interop.downcallHandle(
            "g_socket_address_get_family",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_socket_address_get_native_size = Interop.downcallHandle(
            "g_socket_address_get_native_size",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_socket_address_to_native = Interop.downcallHandle(
            "g_socket_address_to_native",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
            false
        );
    }
}
