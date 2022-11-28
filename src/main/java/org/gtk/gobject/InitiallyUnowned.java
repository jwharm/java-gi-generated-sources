package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A type for objects that have an initially floating reference.
 * <p>
 * All the fields in the {@code GInitiallyUnowned} structure are private to the
 * implementation and should never be accessed directly.
 */
public class InitiallyUnowned extends org.gtk.gobject.Object {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GInitiallyUnowned";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInstance.getMemoryLayout().withName("g_type_instance"),
        Interop.valueLayout.C_INT.withName("ref_count"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("qdata")
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
     * Create a InitiallyUnowned proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public InitiallyUnowned(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to InitiallyUnowned if its GType is a (or inherits from) "GInitiallyUnowned".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code InitiallyUnowned} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GInitiallyUnowned", a ClassCastException will be thrown.
     */
    public static InitiallyUnowned castFrom(org.gtk.gobject.Object gobject) {
            return new InitiallyUnowned(gobject.handle(), gobject.yieldOwnership());
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_initially_unowned_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link InitiallyUnowned.Build} object constructs a {@link InitiallyUnowned} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link InitiallyUnowned} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link InitiallyUnowned} using {@link InitiallyUnowned#castFrom}.
         * @return A new instance of {@code InitiallyUnowned} with the properties 
         *         that were set in the Build object.
         */
        public InitiallyUnowned construct() {
            return InitiallyUnowned.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    InitiallyUnowned.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_initially_unowned_get_type = Interop.downcallHandle(
            "g_initially_unowned_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
