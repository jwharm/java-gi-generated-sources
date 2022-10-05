package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkShortcutLabel} displays a single keyboard shortcut or gesture.
 * <p>
 * The main use case for {@code GtkShortcutLabel} is inside a {@link ShortcutsWindow}.
 */
public class ShortcutLabel extends Widget implements Accessible, Buildable, ConstraintTarget {

    public ShortcutLabel(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ShortcutLabel */
    public static ShortcutLabel castFrom(org.gtk.gobject.Object gobject) {
        return new ShortcutLabel(gobject.refcounted());
    }
    
    static final MethodHandle gtk_shortcut_label_new = Interop.downcallHandle(
        "gtk_shortcut_label_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(java.lang.String accelerator) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_shortcut_label_new.invokeExact(Interop.allocateNativeString(accelerator).handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkShortcutLabel} with {@code accelerator} set.
     */
    public ShortcutLabel(java.lang.String accelerator) {
        super(constructNew(accelerator));
    }
    
    static final MethodHandle gtk_shortcut_label_get_accelerator = Interop.downcallHandle(
        "gtk_shortcut_label_get_accelerator",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the current accelerator of {@code self}.
     */
    public java.lang.String getAccelerator() {
        try {
            var RESULT = (MemoryAddress) gtk_shortcut_label_get_accelerator.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_shortcut_label_get_disabled_text = Interop.downcallHandle(
        "gtk_shortcut_label_get_disabled_text",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the text that is displayed when no accelerator is set.
     */
    public java.lang.String getDisabledText() {
        try {
            var RESULT = (MemoryAddress) gtk_shortcut_label_get_disabled_text.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_shortcut_label_set_accelerator = Interop.downcallHandle(
        "gtk_shortcut_label_set_accelerator",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the accelerator to be displayed by {@code self}.
     */
    public void setAccelerator(java.lang.String accelerator) {
        try {
            gtk_shortcut_label_set_accelerator.invokeExact(handle(), Interop.allocateNativeString(accelerator).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_shortcut_label_set_disabled_text = Interop.downcallHandle(
        "gtk_shortcut_label_set_disabled_text",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the text to be displayed by {@code self} when no accelerator is set.
     */
    public void setDisabledText(java.lang.String disabledText) {
        try {
            gtk_shortcut_label_set_disabled_text.invokeExact(handle(), Interop.allocateNativeString(disabledText).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
