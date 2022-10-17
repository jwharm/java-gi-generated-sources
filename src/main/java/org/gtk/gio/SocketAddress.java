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
public class SocketAddress extends org.gtk.gobject.Object implements SocketConnectable {

    public SocketAddress(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to SocketAddress */
    public static SocketAddress castFrom(org.gtk.gobject.Object gobject) {
        return new SocketAddress(gobject.refcounted());
    }
    
    private static final MethodHandle g_socket_address_new_from_native = Interop.downcallHandle(
        "g_socket_address_new_from_native",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    private static Refcounted constructNewFromNative(@NotNull java.lang.foreign.MemoryAddress native_, @NotNull long len) {
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
    public static SocketAddress newFromNative(@NotNull java.lang.foreign.MemoryAddress native_, @NotNull long len) {
        return new SocketAddress(constructNewFromNative(native_, len));
    }
    
    private static final MethodHandle g_socket_address_get_family = Interop.downcallHandle(
        "g_socket_address_get_family",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the socket family type of {@code address}.
     */
    public @NotNull SocketFamily getFamily() {
        int RESULT;
        try {
            RESULT = (int) g_socket_address_get_family.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SocketFamily(RESULT);
    }
    
    private static final MethodHandle g_socket_address_get_native_size = Interop.downcallHandle(
        "g_socket_address_get_native_size",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the size of {@code address}'s native struct sockaddr.
     * You can use this to allocate memory to pass to
     * g_socket_address_to_native().
     */
    public long getNativeSize() {
        long RESULT;
        try {
            RESULT = (long) g_socket_address_get_native_size.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_socket_address_to_native = Interop.downcallHandle(
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
    public boolean toNative(@Nullable java.lang.foreign.MemoryAddress dest, @NotNull long destlen) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_socket_address_to_native.invokeExact(handle(), dest, destlen, (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
}
