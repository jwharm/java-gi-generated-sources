package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkShortcutTrigger} that triggers when a specific keyval and modifiers are pressed.
 */
public class KeyvalTrigger extends org.gtk.gtk.ShortcutTrigger {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkKeyvalTrigger";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a KeyvalTrigger proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected KeyvalTrigger(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, KeyvalTrigger> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new KeyvalTrigger(input, ownership);
    
    private static MemoryAddress constructNew(int keyval, org.gtk.gdk.ModifierType modifiers) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_keyval_trigger_new.invokeExact(
                    keyval,
                    modifiers.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkShortcutTrigger} that will trigger whenever
     * the key with the given {@code keyval} and {@code modifiers} is pressed.
     * @param keyval The keyval to trigger for
     * @param modifiers the modifiers that need to be present
     */
    public KeyvalTrigger(int keyval, org.gtk.gdk.ModifierType modifiers) {
        super(constructNew(keyval, modifiers), Ownership.FULL);
    }
    
    /**
     * Gets the keyval that must be pressed to succeed
     * triggering {@code self}.
     * @return the keyval
     */
    public int getKeyval() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_keyval_trigger_get_keyval.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the modifiers that must be present to succeed
     * triggering {@code self}.
     * @return the modifiers
     */
    public org.gtk.gdk.ModifierType getModifiers() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_keyval_trigger_get_modifiers.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ModifierType(RESULT);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_keyval_trigger_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link KeyvalTrigger.Builder} object constructs a {@link KeyvalTrigger} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link KeyvalTrigger.Builder#build()}. 
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
         * Finish building the {@link KeyvalTrigger} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link KeyvalTrigger}.
         * @return A new instance of {@code KeyvalTrigger} with the properties 
         *         that were set in the Builder object.
         */
        public KeyvalTrigger build() {
            return (KeyvalTrigger) org.gtk.gobject.GObject.newWithProperties(
                KeyvalTrigger.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The key value for the trigger.
         * @param keyval The value for the {@code keyval} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setKeyval(int keyval) {
            names.add("keyval");
            values.add(org.gtk.gobject.Value.create(keyval));
            return this;
        }
        
        /**
         * The key modifiers for the trigger.
         * @param modifiers The value for the {@code modifiers} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setModifiers(org.gtk.gdk.ModifierType modifiers) {
            names.add("modifiers");
            values.add(org.gtk.gobject.Value.create(modifiers));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_keyval_trigger_new = Interop.downcallHandle(
            "gtk_keyval_trigger_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_keyval_trigger_get_keyval = Interop.downcallHandle(
            "gtk_keyval_trigger_get_keyval",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_keyval_trigger_get_modifiers = Interop.downcallHandle(
            "gtk_keyval_trigger_get_modifiers",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_keyval_trigger_get_type = Interop.downcallHandle(
            "gtk_keyval_trigger_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
