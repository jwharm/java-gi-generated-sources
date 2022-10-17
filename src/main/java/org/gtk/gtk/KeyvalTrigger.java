package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkShortcutTrigger} that triggers when a specific keyval and modifiers are pressed.
 */
public class KeyvalTrigger extends ShortcutTrigger {

    public KeyvalTrigger(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to KeyvalTrigger */
    public static KeyvalTrigger castFrom(org.gtk.gobject.Object gobject) {
        return new KeyvalTrigger(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_keyval_trigger_new = Interop.downcallHandle(
        "gtk_keyval_trigger_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(@NotNull int keyval, @NotNull org.gtk.gdk.ModifierType modifiers) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_keyval_trigger_new.invokeExact(keyval, modifiers.getValue()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@code GtkShortcutTrigger} that will trigger whenever
     * the key with the given {@code keyval} and {@code modifiers} is pressed.
     */
    public KeyvalTrigger(@NotNull int keyval, @NotNull org.gtk.gdk.ModifierType modifiers) {
        super(constructNew(keyval, modifiers));
    }
    
    private static final MethodHandle gtk_keyval_trigger_get_keyval = Interop.downcallHandle(
        "gtk_keyval_trigger_get_keyval",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the keyval that must be pressed to succeed
     * triggering {@code self}.
     */
    public int getKeyval() {
        int RESULT;
        try {
            RESULT = (int) gtk_keyval_trigger_get_keyval.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_keyval_trigger_get_modifiers = Interop.downcallHandle(
        "gtk_keyval_trigger_get_modifiers",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the modifiers that must be present to succeed
     * triggering {@code self}.
     */
    public @NotNull org.gtk.gdk.ModifierType getModifiers() {
        int RESULT;
        try {
            RESULT = (int) gtk_keyval_trigger_get_modifiers.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ModifierType(RESULT);
    }
    
}
