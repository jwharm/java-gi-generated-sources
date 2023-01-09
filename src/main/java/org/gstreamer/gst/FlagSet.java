package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A fundamental type that describes a 32-bit flag bitfield, with 32-bit
 * mask indicating which of the bits in the field are explicitly set.
 */
public class FlagSet extends io.github.jwharm.javagi.ObjectBase {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "FlagSet";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a FlagSet proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected FlagSet(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, FlagSet> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new FlagSet(input);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_flagset_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Create a new sub-class of {@code GST_TYPE_FLAG_SET}
     * which will pretty-print the human-readable flags
     * when serializing, for easier debugging.
     * @param flagsType a {@link org.gtk.glib.Type} of a {@code G_TYPE_FLAGS} type.
     */
    public static org.gtk.glib.Type register(org.gtk.glib.Type flagsType) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_flagset_register.invokeExact(flagsType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_flagset_get_type = Interop.downcallHandle(
                "gst_flagset_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_flagset_register = Interop.downcallHandle(
                "gst_flagset_register",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_flagset_get_type != null;
    }
}
