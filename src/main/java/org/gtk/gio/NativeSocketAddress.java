package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A socket address of some unknown native type.
 */
public class NativeSocketAddress extends org.gtk.gio.SocketAddress implements org.gtk.gio.SocketConnectable {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.SocketAddress.getMemoryLayout().withName("parent_instance"),
        org.gtk.gio.NativeSocketAddressPrivate.getMemoryLayout().withName("priv")
    ).withName("GNativeSocketAddress");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public NativeSocketAddress(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to NativeSocketAddress */
    public static NativeSocketAddress castFrom(org.gtk.gobject.Object gobject) {
        return new NativeSocketAddress(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@Nullable java.lang.foreign.MemoryAddress native_, long len) {
        java.util.Objects.requireNonNullElse(native_, MemoryAddress.NULL);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_native_socket_address_new.invokeExact(native_, len), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link NativeSocketAddress} for {@code native} and {@code len}.
     * @param native_ a native address object
     * @param len the length of {@code native}, in bytes
     */
    public NativeSocketAddress(@Nullable java.lang.foreign.MemoryAddress native_, long len) {
        super(constructNew(native_, len));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_native_socket_address_new = Interop.downcallHandle(
            "g_native_socket_address_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
        );
    }
}
