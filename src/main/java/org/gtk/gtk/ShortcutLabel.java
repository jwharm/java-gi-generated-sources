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
public class ShortcutLabel extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public ShortcutLabel(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ShortcutLabel */
    public static ShortcutLabel castFrom(org.gtk.gobject.Object gobject) {
        return new ShortcutLabel(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@NotNull java.lang.String accelerator) {
        java.util.Objects.requireNonNull(accelerator, "Parameter 'accelerator' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_shortcut_label_new.invokeExact(Interop.allocateNativeString(accelerator)), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkShortcutLabel} with {@code accelerator} set.
     * @param accelerator the initial accelerator
     */
    public ShortcutLabel(@NotNull java.lang.String accelerator) {
        super(constructNew(accelerator));
    }
    
    /**
     * Retrieves the current accelerator of {@code self}.
     * @return the current accelerator.
     */
    public @Nullable java.lang.String getAccelerator() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_shortcut_label_get_accelerator.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieves the text that is displayed when no accelerator is set.
     * @return the current text displayed when no
     * accelerator is set.
     */
    public @Nullable java.lang.String getDisabledText() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_shortcut_label_get_disabled_text.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Sets the accelerator to be displayed by {@code self}.
     * @param accelerator the new accelerator
     */
    public void setAccelerator(@NotNull java.lang.String accelerator) {
        java.util.Objects.requireNonNull(accelerator, "Parameter 'accelerator' must not be null");
        try {
            DowncallHandles.gtk_shortcut_label_set_accelerator.invokeExact(handle(), Interop.allocateNativeString(accelerator));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the text to be displayed by {@code self} when no accelerator is set.
     * @param disabledText the text to be displayed when no accelerator is set
     */
    public void setDisabledText(@NotNull java.lang.String disabledText) {
        java.util.Objects.requireNonNull(disabledText, "Parameter 'disabledText' must not be null");
        try {
            DowncallHandles.gtk_shortcut_label_set_disabled_text.invokeExact(handle(), Interop.allocateNativeString(disabledText));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_shortcut_label_new = Interop.downcallHandle(
            "gtk_shortcut_label_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_shortcut_label_get_accelerator = Interop.downcallHandle(
            "gtk_shortcut_label_get_accelerator",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_shortcut_label_get_disabled_text = Interop.downcallHandle(
            "gtk_shortcut_label_get_disabled_text",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_shortcut_label_set_accelerator = Interop.downcallHandle(
            "gtk_shortcut_label_set_accelerator",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_shortcut_label_set_disabled_text = Interop.downcallHandle(
            "gtk_shortcut_label_set_disabled_text",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
