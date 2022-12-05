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
     * <p>
     * Because FontButton is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public FontButton(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to FontButton if its GType is a (or inherits from) "GtkFontButton".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code FontButton} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkFontButton", a ClassCastException will be thrown.
     */
    public static FontButton castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), FontButton.getType())) {
            return new FontButton(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkFontButton");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
        super(constructNew(), Ownership.NONE);
    }
    
    private static Addressable constructNewWithFont(@NotNull java.lang.String fontname) {
        java.util.Objects.requireNonNull(fontname, "Parameter 'fontname' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_font_button_new_with_font.invokeExact(
                    Interop.allocateNativeString(fontname));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new font picker widget showing the given font.
     * @param fontname Name of font to display in font chooser dialog
     * @return a new font picker widget.
     */
    public static FontButton newWithFont(@NotNull java.lang.String fontname) {
        return new FontButton(constructNewWithFont(fontname), Ownership.NONE);
    }
    
    /**
     * Gets whether the dialog is modal.
     * @return {@code true} if the dialog is modal
     */
    public boolean getModal() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_font_button_get_modal.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Retrieves the title of the font chooser dialog.
     * @return an internal copy of the title string
     *   which must not be freed.
     */
    public @NotNull java.lang.String getTitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_font_button_get_title.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns whether the selected font is used in the label.
     * @return whether the selected font is used in the label.
     */
    public boolean getUseFont() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_font_button_get_use_font.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether the selected size is used in the label.
     * @return whether the selected size is used in the label.
     */
    public boolean getUseSize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_font_button_get_use_size.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets whether the dialog should be modal.
     * @param modal {@code true} to make the dialog modal
     */
    public void setModal(boolean modal) {
        try {
            DowncallHandles.gtk_font_button_set_modal.invokeExact(
                    handle(),
                    modal ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the title for the font chooser dialog.
     * @param title a string containing the font chooser dialog title
     */
    public void setTitle(@NotNull java.lang.String title) {
        java.util.Objects.requireNonNull(title, "Parameter 'title' must not be null");
        try {
            DowncallHandles.gtk_font_button_set_title.invokeExact(
                    handle(),
                    Interop.allocateNativeString(title));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
                    useFont ? 1 : 0);
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
                    useSize ? 1 : 0);
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
            RESULT = (long) DowncallHandles.gtk_font_button_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Activate {
        void signalReceived(FontButton sourceFontButton);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FontButton.Callbacks.class, "signalFontButtonActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<FontButton.Activate>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface FontSet {
        void signalReceived(FontButton sourceFontButton);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("font-set"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FontButton.Callbacks.class, "signalFontButtonFontSet",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<FontButton.FontSet>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Widget.Build {
        
         /**
         * A {@link FontButton.Build} object constructs a {@link FontButton} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link FontButton} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link FontButton} using {@link FontButton#castFrom}.
         * @return A new instance of {@code FontButton} with the properties 
         *         that were set in the Build object.
         */
        public FontButton construct() {
            return FontButton.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    FontButton.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * Whether the font chooser dialog should be modal.
         * @param modal The value for the {@code modal} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setModal(boolean modal) {
            names.add("modal");
            values.add(org.gtk.gobject.Value.create(modal));
            return this;
        }
        
        /**
         * The title of the font chooser dialog.
         * @param title The value for the {@code title} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTitle(java.lang.String title) {
            names.add("title");
            values.add(org.gtk.gobject.Value.create(title));
            return this;
        }
        
        /**
         * Whether the buttons label will be drawn in the selected font.
         * @param useFont The value for the {@code use-font} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setUseFont(boolean useFont) {
            names.add("use-font");
            values.add(org.gtk.gobject.Value.create(useFont));
            return this;
        }
        
        /**
         * Whether the buttons label will use the selected font size.
         * @param useSize The value for the {@code use-size} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setUseSize(boolean useSize) {
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
    
    private static class Callbacks {
        
        public static void signalFontButtonActivate(MemoryAddress sourceFontButton, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (FontButton.Activate) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new FontButton(sourceFontButton, Ownership.NONE));
        }
        
        public static void signalFontButtonFontSet(MemoryAddress sourceFontButton, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (FontButton.FontSet) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new FontButton(sourceFontButton, Ownership.NONE));
        }
    }
}
