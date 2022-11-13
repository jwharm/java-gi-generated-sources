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
     * Create a NativeSocketAddress proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public NativeSocketAddress(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to NativeSocketAddress if its GType is a (or inherits from) "GNativeSocketAddress".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code NativeSocketAddress} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GNativeSocketAddress", a ClassCastException will be thrown.
     */
    public static NativeSocketAddress castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GNativeSocketAddress"))) {
            return new NativeSocketAddress(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GNativeSocketAddress");
        }
    }
    
    private static Addressable constructNew(@Nullable java.lang.foreign.MemoryAddress native_, long len) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_native_socket_address_new.invokeExact(
                    (Addressable) (native_ == null ? MemoryAddress.NULL : native_),
                    len);
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
        super(constructNew(native_, len), Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_native_socket_address_new = Interop.downcallHandle(
            "g_native_socket_address_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG),
            false
        );
    }
}
