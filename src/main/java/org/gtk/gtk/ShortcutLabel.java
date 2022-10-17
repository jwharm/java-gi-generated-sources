package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    private static final MethodHandle gtk_shortcut_label_new = Interop.downcallHandle(
        "gtk_shortcut_label_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull java.lang.String accelerator) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_shortcut_label_new.invokeExact(Interop.allocateNativeString(accelerator)), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkShortcutLabel} with {@code accelerator} set.
     */
    public ShortcutLabel(@NotNull java.lang.String accelerator) {
        super(constructNew(accelerator));
    }
    
    private static final MethodHandle gtk_shortcut_label_get_accelerator = Interop.downcallHandle(
        "gtk_shortcut_label_get_accelerator",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the current accelerator of {@code self}.
     */
    public @Nullable java.lang.String getAccelerator() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_shortcut_label_get_accelerator.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_shortcut_label_get_disabled_text = Interop.downcallHandle(
        "gtk_shortcut_label_get_disabled_text",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the text that is displayed when no accelerator is set.
     */
    public @Nullable java.lang.String getDisabledText() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_shortcut_label_get_disabled_text.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_shortcut_label_set_accelerator = Interop.downcallHandle(
        "gtk_shortcut_label_set_accelerator",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the accelerator to be displayed by {@code self}.
     */
    public @NotNull void setAccelerator(@NotNull java.lang.String accelerator) {
        try {
            gtk_shortcut_label_set_accelerator.invokeExact(handle(), Interop.allocateNativeString(accelerator));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_shortcut_label_set_disabled_text = Interop.downcallHandle(
        "gtk_shortcut_label_set_disabled_text",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the text to be displayed by {@code self} when no accelerator is set.
     */
    public @NotNull void setDisabledText(@NotNull java.lang.String disabledText) {
        try {
            gtk_shortcut_label_set_disabled_text.invokeExact(handle(), Interop.allocateNativeString(disabledText));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
