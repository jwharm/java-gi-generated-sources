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
    @ApiStatus.Internal
    public KeyvalTrigger(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to KeyvalTrigger if its GType is a (or inherits from) "GtkKeyvalTrigger".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code KeyvalTrigger} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkKeyvalTrigger", a ClassCastException will be thrown.
     */
    public static KeyvalTrigger castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkKeyvalTrigger"))) {
            return new KeyvalTrigger(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkKeyvalTrigger");
        }
    }
    
    private static Addressable constructNew(int keyval, @NotNull org.gtk.gdk.ModifierType modifiers) {
        java.util.Objects.requireNonNull(modifiers, "Parameter 'modifiers' must not be null");
        Addressable RESULT;
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
    public KeyvalTrigger(int keyval, @NotNull org.gtk.gdk.ModifierType modifiers) {
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
    public @NotNull org.gtk.gdk.ModifierType getModifiers() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_keyval_trigger_get_modifiers.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ModifierType(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_keyval_trigger_new = Interop.downcallHandle(
            "gtk_keyval_trigger_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_keyval_trigger_get_keyval = Interop.downcallHandle(
            "gtk_keyval_trigger_get_keyval",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_keyval_trigger_get_modifiers = Interop.downcallHandle(
            "gtk_keyval_trigger_get_modifiers",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
    }
}
