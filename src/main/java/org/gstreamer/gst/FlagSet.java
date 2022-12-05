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
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public FlagSet(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to FlagSet if its GType is a (or inherits from) "FlagSet".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code FlagSet} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "FlagSet", a ClassCastException will be thrown.
     */
    public static FlagSet castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), FlagSet.getType())) {
            return new FlagSet(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of FlagSet");
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
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
     * @param flagsType a {@link org.gtk.gobject.Type} of a {@code G_TYPE_FLAGS} type.
     */
    public static @NotNull org.gtk.glib.Type register(@NotNull org.gtk.glib.Type flagsType) {
        java.util.Objects.requireNonNull(flagsType, "Parameter 'flagsType' must not be null");
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_flagset_register.invokeExact(
                    flagsType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends io.github.jwharm.javagi.Build {
        
         /**
         * A {@link FlagSet.Build} object constructs a {@link FlagSet} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link FlagSet} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link FlagSet} using {@link FlagSet#castFrom}.
         * @return A new instance of {@code FlagSet} with the properties 
         *         that were set in the Build object.
         */
        public FlagSet construct() {
            return FlagSet.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    FlagSet.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
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
}
