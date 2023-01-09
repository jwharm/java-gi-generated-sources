package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GtkFontButton} allows to open a font chooser dialog to change
 * the font.
 * <p>
 * <img src="./doc-files/font-button.png" alt="An example GtkFontButton">
 * <p>
 * It is suitable widget for selecting a font in a preference dialog.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * <pre>{@code 
 * fontbutton
 * ╰── button.font
 *     ╰── [content]
 * }</pre>
 * <p>
 * {@code GtkFontButton} has a single CSS node with name fontbutton which
 * contains a button node with the .font style class.
 */
public class FontButton extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.FontChooser {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkFontButton";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a FontButton proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected FontButton(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, FontButton> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new FontButton(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_font_button_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new font picker widget.
     */
    public FontButton() {
        super(constructNew());
        this.refSink();
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewWithFont(java.lang.String fontname) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_font_button_new_with_font.invokeExact(Marshal.stringToAddress.marshal(fontname, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
        
    /**
     * Creates a new font picker widget showing the given font.
     * @param fontname Name of font to display in font chooser dialog
     * @return a new font picker widget.
     */
    public static FontButton newWithFont(java.lang.String fontname) {
        var RESULT = constructNewWithFont(fontname);
        var OBJECT = (org.gtk.gtk.FontButton) Interop.register(RESULT, org.gtk.gtk.FontButton.fromAddress).marshal(RESULT, null);
        OBJECT.refSink();
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets whether the dialog is modal.
     * @return {@code true} if the dialog is modal
     */
    public boolean getModal() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_font_button_get_modal.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Retrieves the title of the font chooser dialog.
     * @return an internal copy of the title string
     *   which must not be freed.
     */
    public java.lang.String getTitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_font_button_get_title.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns whether the selected font is used in the label.
     * @return whether the selected font is used in the label.
     */
    public boolean getUseFont() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_font_button_get_use_font.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns whether the selected size is used in the label.
     * @return whether the selected size is used in the label.
     */
    public boolean getUseSize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_font_button_get_use_size.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets whether the dialog should be modal.
     * @param modal {@code true} to make the dialog modal
     */
    public void setModal(boolean modal) {
        try {
            DowncallHandles.gtk_font_button_set_modal.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(modal, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the title for the font chooser dialog.
     * @param title a string containing the font chooser dialog title
     */
    public void setTitle(java.lang.String title) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_font_button_set_title.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(title, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * If {@code use_font} is {@code true}, the font name will be written
     * using the selected font.
     * @param useFont If {@code true}, font name will be written using font chosen.
     */
    public void setUseFont(boolean useFont) {
        try {
            DowncallHandles.gtk_font_button_set_use_font.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(useFont, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If {@code use_size} is {@code true}, the font name will be written using
     * the selected size.
     * @param useSize If {@code true}, font name will be written using the
     *   selected size.
     */
    public void setUseSize(boolean useSize) {
        try {
            DowncallHandles.gtk_font_button_set_use_size.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(useSize, null).intValue());
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
            RESULT = (long) DowncallHandles.gtk_font_button_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code Activate} callback.
     */
    @FunctionalInterface
    public interface Activate {
    
        /**
         * Emitted to when the font button is activated.
         * <p>
         * The {@code ::activate} signal on {@code GtkFontButton} is an action signal and
         * emitting it causes the button to present its dialog.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceFontButton) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Activate.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted to when the font button is activated.
     * <p>
     * The {@code ::activate} signal on {@code GtkFontButton} is an action signal and
     * emitting it causes the button to present its dialog.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<FontButton.Activate> onActivate(FontButton.Activate handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("activate", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code FontSet} callback.
     */
    @FunctionalInterface
    public interface FontSet {
    
        /**
         * Emitted when the user selects a font.
         * <p>
         * When handling this signal, use {@link FontChooser#getFont}
         * to find out which font was just selected.
         * <p>
         * Note that this signal is only emitted when the user changes the font.
         * If you need to react to programmatic font changes as well, use
         * the notify::font signal.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceFontButton) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FontSet.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the user selects a font.
     * <p>
     * When handling this signal, use {@link FontChooser#getFont}
     * to find out which font was just selected.
     * <p>
     * Note that this signal is only emitted when the user changes the font.
     * If you need to react to programmatic font changes as well, use
     * the notify::font signal.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<FontButton.FontSet> onFontSet(FontButton.FontSet handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("font-set", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link FontButton.Builder} object constructs a {@link FontButton} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link FontButton.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link FontButton} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link FontButton}.
         * @return A new instance of {@code FontButton} with the properties 
         *         that were set in the Builder object.
         */
        public FontButton build() {
            return (FontButton) org.gtk.gobject.GObject.newWithProperties(
                FontButton.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Whether the font chooser dialog should be modal.
         * @param modal The value for the {@code modal} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setModal(boolean modal) {
            names.add("modal");
            values.add(org.gtk.gobject.Value.create(modal));
            return this;
        }
        
        /**
         * The title of the font chooser dialog.
         * @param title The value for the {@code title} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTitle(java.lang.String title) {
            names.add("title");
            values.add(org.gtk.gobject.Value.create(title));
            return this;
        }
        
        /**
         * Whether the buttons label will be drawn in the selected font.
         * @param useFont The value for the {@code use-font} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUseFont(boolean useFont) {
            names.add("use-font");
            values.add(org.gtk.gobject.Value.create(useFont));
            return this;
        }
        
        /**
         * Whether the buttons label will use the selected font size.
         * @param useSize The value for the {@code use-size} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUseSize(boolean useSize) {
            names.add("use-size");
            values.add(org.gtk.gobject.Value.create(useSize));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_font_button_new = Interop.downcallHandle(
                "gtk_font_button_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_font_button_new_with_font = Interop.downcallHandle(
                "gtk_font_button_new_with_font",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_font_button_get_modal = Interop.downcallHandle(
                "gtk_font_button_get_modal",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_font_button_get_title = Interop.downcallHandle(
                "gtk_font_button_get_title",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_font_button_get_use_font = Interop.downcallHandle(
                "gtk_font_button_get_use_font",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_font_button_get_use_size = Interop.downcallHandle(
                "gtk_font_button_get_use_size",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_font_button_set_modal = Interop.downcallHandle(
                "gtk_font_button_set_modal",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_font_button_set_title = Interop.downcallHandle(
                "gtk_font_button_set_title",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_font_button_set_use_font = Interop.downcallHandle(
                "gtk_font_button_set_use_font",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_font_button_set_use_size = Interop.downcallHandle(
                "gtk_font_button_set_use_size",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_font_button_get_type = Interop.downcallHandle(
                "gtk_font_button_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_font_button_get_type != null;
    }
}
