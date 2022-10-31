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
    
    private static final java.lang.String C_TYPE_NAME = "GNativeSocketAddress";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.SocketAddress.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gio.SocketAddress parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gio.SocketAddress(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public NativeSocketAddress(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to NativeSocketAddress if its GType is a (or inherits from) "GNativeSocketAddress".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "NativeSocketAddress" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GNativeSocketAddress", a ClassCastException will be thrown.
     */
    public static NativeSocketAddress castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GNativeSocketAddress"))) {
            return new NativeSocketAddress(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GNativeSocketAddress");
        }
    }
    
    private static Refcounted constructNew(@Nullable java.lang.foreign.MemoryAddress native_, long len) {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_native_socket_address_new.invokeExact(
                    (Addressable) (native_ == null ? MemoryAddress.NULL : native_),
                    len), true);
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
