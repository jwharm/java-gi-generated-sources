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
    
    private static final java.lang.String C_TYPE_NAME = "GtkShortcutLabel";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public ShortcutLabel(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to ShortcutLabel if its GType is a (or inherits from) "GtkShortcutLabel".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "ShortcutLabel" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkShortcutLabel", a ClassCastException will be thrown.
     */
    public static ShortcutLabel castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkShortcutLabel"))) {
            return new ShortcutLabel(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkShortcutLabel");
        }
    }
    
    private static Refcounted constructNew(@NotNull java.lang.String accelerator) {
        java.util.Objects.requireNonNull(accelerator, "Parameter 'accelerator' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_shortcut_label_new.invokeExact(
                    Interop.allocateNativeString(accelerator)), false);
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_shortcut_label_get_accelerator.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Retrieves the text that is displayed when no accelerator is set.
     * @return the current text displayed when no
     * accelerator is set.
     */
    public @Nullable java.lang.String getDisabledText() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_shortcut_label_get_disabled_text.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Sets the accelerator to be displayed by {@code self}.
     * @param accelerator the new accelerator
     */
    public void setAccelerator(@NotNull java.lang.String accelerator) {
        java.util.Objects.requireNonNull(accelerator, "Parameter 'accelerator' must not be null");
        try {
            DowncallHandles.gtk_shortcut_label_set_accelerator.invokeExact(
                    handle(),
                    Interop.allocateNativeString(accelerator));
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
            DowncallHandles.gtk_shortcut_label_set_disabled_text.invokeExact(
                    handle(),
                    Interop.allocateNativeString(disabledText));
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
