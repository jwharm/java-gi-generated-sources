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
     * <p>
     * Because ShortcutLabel is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ShortcutLabel(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, ShortcutLabel> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ShortcutLabel(input, ownership);
    
    private static MemoryAddress constructNew(java.lang.String accelerator) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_shortcut_label_new.invokeExact(
                    Marshal.stringToAddress.marshal(accelerator, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkShortcutLabel} with {@code accelerator} set.
     * @param accelerator the initial accelerator
     */
    public ShortcutLabel(java.lang.String accelerator) {
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
        return Marshal.addressToString.marshal(RESULT, null);
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
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Sets the accelerator to be displayed by {@code self}.
     * @param accelerator the new accelerator
     */
    public void setAccelerator(java.lang.String accelerator) {
        try {
            DowncallHandles.gtk_shortcut_label_set_accelerator.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(accelerator, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the text to be displayed by {@code self} when no accelerator is set.
     * @param disabledText the text to be displayed when no accelerator is set
     */
    public void setDisabledText(java.lang.String disabledText) {
        try {
            DowncallHandles.gtk_shortcut_label_set_disabled_text.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(disabledText, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_shortcut_label_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link ShortcutLabel.Builder} object constructs a {@link ShortcutLabel} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ShortcutLabel.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link ShortcutLabel} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ShortcutLabel}.
         * @return A new instance of {@code ShortcutLabel} with the properties 
         *         that were set in the Builder object.
         */
        public ShortcutLabel build() {
            return (ShortcutLabel) org.gtk.gobject.GObject.newWithProperties(
                ShortcutLabel.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
        public Builder setAccelerator(java.lang.String accelerator) {
            names.add("accelerator");
            values.add(org.gtk.gobject.Value.create(accelerator));
            return this;
        }
        
        /**
         * The text that is displayed when no accelerator is set.
         * @param disabledText The value for the {@code disabled-text} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDisabledText(java.lang.String disabledText) {
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
