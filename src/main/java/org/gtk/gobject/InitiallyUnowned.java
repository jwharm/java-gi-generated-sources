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
public class InitiallyUnowned extends org.gtk.gobject.GObject {
    
    static {
        GObjects.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GInitiallyUnowned";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInstance.getMemoryLayout().withName("g_type_instance"),
            Interop.valueLayout.C_INT.withName("ref_count"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("qdata")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a InitiallyUnowned proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected InitiallyUnowned(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, InitiallyUnowned> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new InitiallyUnowned(input);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_initially_unowned_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link InitiallyUnowned.Builder} object constructs a {@link InitiallyUnowned} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link InitiallyUnowned.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link InitiallyUnowned} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link InitiallyUnowned}.
         * @return A new instance of {@code InitiallyUnowned} with the properties 
         *         that were set in the Builder object.
         */
        public InitiallyUnowned build() {
            return (InitiallyUnowned) org.gtk.gobject.GObject.newWithProperties(
                InitiallyUnowned.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_initially_unowned_get_type != null;
    }
}
