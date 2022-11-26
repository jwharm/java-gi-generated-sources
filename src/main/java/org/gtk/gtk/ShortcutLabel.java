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
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ShortcutLabel proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ShortcutLabel(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ShortcutLabel if its GType is a (or inherits from) "GtkShortcutLabel".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ShortcutLabel} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkShortcutLabel", a ClassCastException will be thrown.
     */
    public static ShortcutLabel castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), ShortcutLabel.getType())) {
            return new ShortcutLabel(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkShortcutLabel");
        }
    }
    
    private static Addressable constructNew(@NotNull java.lang.String accelerator) {
        java.util.Objects.requireNonNull(accelerator, "Parameter 'accelerator' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_shortcut_label_new.invokeExact(
                    Interop.allocateNativeString(accelerator));
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
        super(constructNew(accelerator), Ownership.NONE);
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_shortcut_label_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Widget.Build {
        
         /**
         * A {@link ShortcutLabel.Build} object constructs a {@link ShortcutLabel} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ShortcutLabel} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ShortcutLabel} using {@link ShortcutLabel#castFrom}.
         * @return A new instance of {@code ShortcutLabel} with the properties 
         *         that were set in the Build object.
         */
        public ShortcutLabel construct() {
            return ShortcutLabel.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ShortcutLabel.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The accelerator that {@code self} displays.
         * <p>
         * See {@code Gtk.ShortcutsShortcut:accelerator}
         * for the accepted syntax.
         * @param accelerator The value for the {@code accelerator} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAccelerator(java.lang.String accelerator) {
            names.add("accelerator");
            values.add(org.gtk.gobject.Value.create(accelerator));
            return this;
        }
        
        /**
         * The text that is displayed when no accelerator is set.
         * @param disabledText The value for the {@code disabled-text} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDisabledText(java.lang.String disabledText) {
            names.add("disabled-text");
            values.add(org.gtk.gobject.Value.create(disabledText));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_shortcut_label_new = Interop.downcallHandle(
            "gtk_shortcut_label_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_shortcut_label_get_accelerator = Interop.downcallHandle(
            "gtk_shortcut_label_get_accelerator",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_shortcut_label_get_disabled_text = Interop.downcallHandle(
            "gtk_shortcut_label_get_disabled_text",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_shortcut_label_set_accelerator = Interop.downcallHandle(
            "gtk_shortcut_label_set_accelerator",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_shortcut_label_set_disabled_text = Interop.downcallHandle(
            "gtk_shortcut_label_set_disabled_text",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_shortcut_label_get_type = Interop.downcallHandle(
            "gtk_shortcut_label_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
