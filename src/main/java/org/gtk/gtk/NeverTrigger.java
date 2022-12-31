package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkShortcutTrigger} that never triggers.
 */
public class NeverTrigger extends org.gtk.gtk.ShortcutTrigger {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkNeverTrigger";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a NeverTrigger proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected NeverTrigger(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, NeverTrigger> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new NeverTrigger(input, ownership);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_never_trigger_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Gets the never trigger.
     * <p>
     * This is a singleton for a trigger that never triggers.
     * Use this trigger instead of {@code null} because it implements
     * all virtual functions.
     * @return The never trigger
     */
    public static org.gtk.gtk.NeverTrigger get() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_never_trigger_get.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.NeverTrigger) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.NeverTrigger.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * A {@link NeverTrigger.Builder} object constructs a {@link NeverTrigger} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link NeverTrigger.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.ShortcutTrigger.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link NeverTrigger} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link NeverTrigger}.
         * @return A new instance of {@code NeverTrigger} with the properties 
         *         that were set in the Builder object.
         */
        public NeverTrigger build() {
            return (NeverTrigger) org.gtk.gobject.GObject.newWithProperties(
                NeverTrigger.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_never_trigger_get_type = Interop.downcallHandle(
            "gtk_never_trigger_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gtk_never_trigger_get = Interop.downcallHandle(
            "gtk_never_trigger_get",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }
}
