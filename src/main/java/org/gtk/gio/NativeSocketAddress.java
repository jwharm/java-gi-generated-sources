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
     * Create a NativeSocketAddress proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected NativeSocketAddress(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, NativeSocketAddress> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new NativeSocketAddress(input, ownership);
    
    private static MemoryAddress constructNew(@Nullable java.lang.foreign.MemoryAddress native_, long len) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_native_socket_address_new.invokeExact(
                    (Addressable) (native_ == null ? MemoryAddress.NULL : (Addressable) native_),
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_native_socket_address_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link NativeSocketAddress.Builder} object constructs a {@link NativeSocketAddress} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link NativeSocketAddress.Builder#build()}. 
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
         * Finish building the {@link NativeSocketAddress} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link NativeSocketAddress}.
         * @return A new instance of {@code NativeSocketAddress} with the properties 
         *         that were set in the Builder object.
         */
        public NativeSocketAddress build() {
            return (NativeSocketAddress) org.gtk.gobject.GObject.newWithProperties(
                NativeSocketAddress.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_native_socket_address_new = Interop.downcallHandle(
            "g_native_socket_address_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_native_socket_address_get_type = Interop.downcallHandle(
            "g_native_socket_address_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
