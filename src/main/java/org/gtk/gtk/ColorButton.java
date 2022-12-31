package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GtkColorButton} allows to open a color chooser dialog to change
 * the color.
 * <p>
 * <img src="./doc-files/color-button.png" alt="An example GtkColorButton">
 * <p>
 * It is suitable widget for selecting a color in a preference dialog.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * <pre>{@code 
 * colorbutton
 * ╰── button.color
 *     ╰── [content]
 * }</pre>
 * <p>
 * {@code GtkColorButton} has a single CSS node with name colorbutton which
 * contains a button node. To differentiate it from a plain {@code GtkButton},
 * it gets the .color style class.
 */
public class ColorButton extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ColorChooser, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkColorButton";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ColorButton proxy instance for the provided memory address.
     * <p>
     * Because ColorButton is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ColorButton(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, ColorButton> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ColorButton(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_color_button_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new color button.
     * <p>
     * This returns a widget in the form of a small button containing
     * a swatch representing the current selected color. When the button
     * is clicked, a color chooser dialog will open, allowing the user
     * to select a color. The swatch will be updated to reflect the new
     * color when the user finishes.
     */
    public ColorButton() {
        super(constructNew(), Ownership.NONE);
    }
    
    private static MemoryAddress constructNewWithRgba(org.gtk.gdk.RGBA rgba) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_color_button_new_with_rgba.invokeExact(
                    rgba.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new color button showing the given color.
     * @param rgba A {@code GdkRGBA} to set the current color with
     * @return a new color button
     */
    public static ColorButton newWithRgba(org.gtk.gdk.RGBA rgba) {
        var RESULT = constructNewWithRgba(rgba);
        return (org.gtk.gtk.ColorButton) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.ColorButton.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets whether the dialog is modal.
     * @return {@code true} if the dialog is modal
     */
    public boolean getModal() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_color_button_get_modal.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the title of the color chooser dialog.
     * @return An internal string, do not free the return value
     */
    public java.lang.String getTitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_color_button_get_title.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Sets whether the dialog should be modal.
     * @param modal {@code true} to make the dialog modal
     */
    public void setModal(boolean modal) {
        try {
            DowncallHandles.gtk_color_button_set_modal.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(modal, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the title for the color chooser dialog.
     * @param title String containing new window title
     */
    public void setTitle(java.lang.String title) {
        try {
            DowncallHandles.gtk_color_button_set_title.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(title, null));
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
            RESULT = (long) DowncallHandles.gtk_color_button_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Activate {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceColorButton) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Activate.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted to when the color button is activated.
     * <p>
     * The {@code ::activate} signal on {@code GtkMenuButton} is an action signal and
     * emitting it causes the button to pop up its dialog.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<ColorButton.Activate> onActivate(ColorButton.Activate handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("activate"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ColorSet {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceColorButton) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ColorSet.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when the user selects a color.
     * <p>
     * When handling this signal, use {@link ColorChooser#getRgba}
     * to find out which color was just selected.
     * <p>
     * Note that this signal is only emitted when the user changes the color.
     * If you need to react to programmatic color changes as well, use
     * the notify::rgba signal.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<ColorButton.ColorSet> onColorSet(ColorButton.ColorSet handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("color-set"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link ColorButton.Builder} object constructs a {@link ColorButton} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ColorButton.Builder#build()}. 
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
         * Finish building the {@link ColorButton} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ColorButton}.
         * @return A new instance of {@code ColorButton} with the properties 
         *         that were set in the Builder object.
         */
        public ColorButton build() {
            return (ColorButton) org.gtk.gobject.GObject.newWithProperties(
                ColorButton.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Whether the color chooser dialog should be modal.
         * @param modal The value for the {@code modal} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setModal(boolean modal) {
            names.add("modal");
            values.add(org.gtk.gobject.Value.create(modal));
            return this;
        }
        
        /**
         * Whether the color chooser should open in editor mode.
         * <p>
         * This property should be used in cases where the palette
         * in the editor would be redundant, such as when the color
         * button is already part of a palette.
         * @param showEditor The value for the {@code show-editor} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setShowEditor(boolean showEditor) {
            names.add("show-editor");
            values.add(org.gtk.gobject.Value.create(showEditor));
            return this;
        }
        
        /**
         * The title of the color chooser dialog
         * @param title The value for the {@code title} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTitle(java.lang.String title) {
            names.add("title");
            values.add(org.gtk.gobject.Value.create(title));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_color_button_new = Interop.downcallHandle(
            "gtk_color_button_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_color_button_new_with_rgba = Interop.downcallHandle(
            "gtk_color_button_new_with_rgba",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_color_button_get_modal = Interop.downcallHandle(
            "gtk_color_button_get_modal",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_color_button_get_title = Interop.downcallHandle(
            "gtk_color_button_get_title",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_color_button_set_modal = Interop.downcallHandle(
            "gtk_color_button_set_modal",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_color_button_set_title = Interop.downcallHandle(
            "gtk_color_button_set_title",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_color_button_get_type = Interop.downcallHandle(
            "gtk_color_button_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
