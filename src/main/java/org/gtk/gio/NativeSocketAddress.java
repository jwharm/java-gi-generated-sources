package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A socket address of some unknown native type.
 */
public class NativeSocketAddress extends SocketAddress implements SocketConnectable {

    public NativeSocketAddress(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to NativeSocketAddress */
    public static NativeSocketAddress castFrom(org.gtk.gobject.Object gobject) {
        return new NativeSocketAddress(gobject.refcounted());
    }
    
    private static final MethodHandle g_native_socket_address_new = Interop.downcallHandle(
        "g_native_socket_address_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    private static Refcounted constructNew(@Nullable java.lang.foreign.MemoryAddress native_, @NotNull long len) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_native_socket_address_new.invokeExact(native_, len), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link NativeSocketAddress} for {@code native} and {@code len}.
     */
    public NativeSocketAddress(@Nullable java.lang.foreign.MemoryAddress native_, @NotNull long len) {
        super(constructNew(native_, len));
    }
    
}
