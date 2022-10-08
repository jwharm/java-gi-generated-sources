package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link SocketAddress} is the equivalent of struct sockaddr in the BSD
 * sockets API. This is an abstract class; use {@link InetSocketAddress}
 * for internet sockets, or {@link UnixSocketAddress} for UNIX domain sockets.
 */
public class SocketAddress extends org.gtk.gobject.Object implements SocketConnectable {

    public SocketAddress(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to SocketAddress */
    public static SocketAddress castFrom(org.gtk.gobject.Object gobject) {
        return new SocketAddress(gobject.refcounted());
    }
    
    static final MethodHandle g_socket_address_new_from_native = Interop.downcallHandle(
        "g_socket_address_new_from_native",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    private static Refcounted constructNewFromNative(java.lang.foreign.MemoryAddress native_, long len) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_socket_address_new_from_native.invokeExact(native_, len), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@link SocketAddress} subclass corresponding to the native
     * struct sockaddr {@code native}.
     */
    public static SocketAddress newFromNative(java.lang.foreign.MemoryAddress native_, long len) {
        return new SocketAddress(constructNewFromNative(native_, len));
    }
    
    static final MethodHandle g_socket_address_get_family = Interop.downcallHandle(
        "g_socket_address_get_family",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the socket family type of {@code address}.
     */
    public SocketFamily getFamily() {
        try {
            var RESULT = (int) g_socket_address_get_family.invokeExact(handle());
            return new SocketFamily(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_socket_address_get_native_size = Interop.downcallHandle(
        "g_socket_address_get_native_size",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the size of {@code address}'s native struct sockaddr.
     * You can use this to allocate memory to pass to
     * g_socket_address_to_native().
     */
    public long getNativeSize() {
        try {
            var RESULT = (long) g_socket_address_get_native_size.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_socket_address_to_native = Interop.downcallHandle(
        "g_socket_address_to_native",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a {@link SocketAddress} to a native struct sockaddr, which can
     * be passed to low-level functions like connect() or bind().
     * <p>
     * If not enough space is available, a {@link IOErrorEnum#NO_SPACE} error
     * is returned. If the address type is not known on the system
     * then a {@link IOErrorEnum#NOT_SUPPORTED} error is returned.
     */
    public boolean toNative(java.lang.foreign.MemoryAddress dest, long destlen) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_socket_address_to_native.invokeExact(handle(), dest, destlen, (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
