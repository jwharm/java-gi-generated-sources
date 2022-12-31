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
     * <p>
     * Because InitiallyUnowned is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected InitiallyUnowned(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, InitiallyUnowned> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new InitiallyUnowned(input, ownership);
    
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
}
