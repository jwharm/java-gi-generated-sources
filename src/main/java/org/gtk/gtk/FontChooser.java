package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkFontChooser} is an interface that can be implemented by widgets
 * for choosing fonts.
 * <p>
 * In GTK, the main objects that implement this interface are
 * {@link FontChooserWidget} and
 * {@link FontButton}.
 */
public interface FontChooser extends io.github.jwharm.javagi.Proxy {
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, FontChooserImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new FontChooserImpl(input);
    
    /**
     * Gets the currently-selected font name.
     * <p>
     * Note that this can be a different string than what you set with
     * {@link FontChooser#setFont}, as the font chooser widget may
     * normalize font names and thus return a string with a different
     * structure. For example, “Helvetica Italic Bold 12” could be
     * normalized to “Helvetica Bold Italic 12”.
     * <p>
     * Use {@link org.pango.FontDescription#equal} if you want to compare two
     * font descriptions.
     * @return A string with the name
     *   of the current font
     */
    default @Nullable java.lang.String getFont() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_font_chooser_get_font.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the currently-selected font.
     * <p>
     * Note that this can be a different string than what you set with
     * {@link FontChooser#setFont}, as the font chooser widget may
     * normalize font names and thus return a string with a different
     * structure. For example, “Helvetica Italic Bold 12” could be
     * normalized to “Helvetica Bold Italic 12”.
     * <p>
     * Use {@link org.pango.FontDescription#equal} if you want to compare two
     * font descriptions.
     * @return A {@code PangoFontDescription} for the
     *   current font
     */
    default @Nullable org.pango.FontDescription getFontDesc() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_font_chooser_get_font_desc.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.pango.FontDescription.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets the {@code PangoFontFace} representing the selected font group
     * details (i.e. family, slant, weight, width, etc).
     * <p>
     * If the selected font is not installed, returns {@code null}.
     * @return A {@code PangoFontFace} representing the
     *   selected font group details
     */
    default @Nullable org.pango.FontFace getFontFace() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_font_chooser_get_font_face.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.pango.FontFace) Interop.register(RESULT, org.pango.FontFace.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the {@code PangoFontFamily} representing the selected font family.
     * <p>
     * Font families are a collection of font faces.
     * <p>
     * If the selected font is not installed, returns {@code null}.
     * @return A {@code PangoFontFamily} representing the
     *   selected font family
     */
    default @Nullable org.pango.FontFamily getFontFamily() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_font_chooser_get_font_family.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.pango.FontFamily) Interop.register(RESULT, org.pango.FontFamily.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the currently-selected font features.
     * <p>
     * The format of the returned string is compatible with the
     * <a href="https://www.w3.org/TR/css-fonts-4/#font-rend-desc">CSS font-feature-settings property</a>.
     * It can be passed to {@link org.pango.AttrFontFeatures#new_}.
     * @return the currently selected font features
     */
    default java.lang.String getFontFeatures() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_font_chooser_get_font_features.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the custom font map of this font chooser widget,
     * or {@code null} if it does not have one.
     * @return a {@code PangoFontMap}
     */
    default @Nullable org.pango.FontMap getFontMap() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_font_chooser_get_font_map.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.pango.FontMap) Interop.register(RESULT, org.pango.FontMap.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * The selected font size.
     * @return A n integer representing the selected font size,
     *   or -1 if no font size is selected.
     */
    default int getFontSize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_font_chooser_get_font_size.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the language that is used for font features.
     * @return the currently selected language
     */
    default java.lang.String getLanguage() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_font_chooser_get_language.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns the current level of granularity for selecting fonts.
     * @return the current granularity level
     */
    default org.gtk.gtk.FontChooserLevel getLevel() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_font_chooser_get_level.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.FontChooserLevel(RESULT);
    }
    
    /**
     * Gets the text displayed in the preview area.
     * @return the text displayed in the preview area
     */
    default java.lang.String getPreviewText() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_font_chooser_get_preview_text.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns whether the preview entry is shown or not.
     * @return {@code true} if the preview entry is shown or {@code false} if it is hidden.
     */
    default boolean getShowPreviewEntry() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_font_chooser_get_show_preview_entry.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Adds a filter function that decides which fonts to display
     * in the font chooser.
     * @param filter a {@code GtkFontFilterFunc}
     * @param destroy function to call to free {@code data} when it is no longer needed
     */
    default void setFilterFunc(@Nullable org.gtk.gtk.FontFilterFunc filter, org.gtk.glib.DestroyNotify destroy) {
        try {
            DowncallHandles.gtk_font_chooser_set_filter_func.invokeExact(
                    handle(),
                    (Addressable) (filter == null ? MemoryAddress.NULL : (Addressable) filter.toCallback()),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) destroy.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the currently-selected font.
     * @param fontname a font name like “Helvetica 12” or “Times Bold 18”
     */
    default void setFont(java.lang.String fontname) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_font_chooser_set_font.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(fontname, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the currently-selected font from {@code font_desc}.
     * @param fontDesc a {@code PangoFontDescription}
     */
    default void setFontDesc(org.pango.FontDescription fontDesc) {
        try {
            DowncallHandles.gtk_font_chooser_set_font_desc.invokeExact(
                    handle(),
                    fontDesc.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a custom font map to use for this font chooser widget.
     * <p>
     * A custom font map can be used to present application-specific
     * fonts instead of or in addition to the normal system fonts.
     * <pre>{@code c
     * FcConfig *config;
     * PangoFontMap *fontmap;
     * 
     * config = FcInitLoadConfigAndFonts ();
     * FcConfigAppFontAddFile (config, my_app_font_file);
     * 
     * fontmap = pango_cairo_font_map_new_for_font_type (CAIRO_FONT_TYPE_FT);
     * pango_fc_font_map_set_config (PANGO_FC_FONT_MAP (fontmap), config);
     * 
     * gtk_font_chooser_set_font_map (font_chooser, fontmap);
     * }</pre>
     * <p>
     * Note that other GTK widgets will only be able to use the
     * application-specific font if it is present in the font map they use:
     * <pre>{@code c
     * context = gtk_widget_get_pango_context (label);
     * pango_context_set_font_map (context, fontmap);
     * }</pre>
     * @param fontmap a {@code PangoFontMap}
     */
    default void setFontMap(@Nullable org.pango.FontMap fontmap) {
        try {
            DowncallHandles.gtk_font_chooser_set_font_map.invokeExact(
                    handle(),
                    (Addressable) (fontmap == null ? MemoryAddress.NULL : fontmap.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the language to use for font features.
     * @param language a language
     */
    default void setLanguage(java.lang.String language) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_font_chooser_set_language.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(language, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the desired level of granularity for selecting fonts.
     * @param level the desired level of granularity
     */
    default void setLevel(org.gtk.gtk.FontChooserLevel level) {
        try {
            DowncallHandles.gtk_font_chooser_set_level.invokeExact(
                    handle(),
                    level.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the text displayed in the preview area.
     * <p>
     * The {@code text} is used to show how the selected font looks.
     * @param text the text to display in the preview area
     */
    default void setPreviewText(java.lang.String text) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_font_chooser_set_preview_text.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(text, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Shows or hides the editable preview entry.
     * @param showPreviewEntry whether to show the editable preview entry or not
     */
    default void setShowPreviewEntry(boolean showPreviewEntry) {
        try {
            DowncallHandles.gtk_font_chooser_set_show_preview_entry.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(showPreviewEntry, null).intValue());
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
            RESULT = (long) DowncallHandles.gtk_font_chooser_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code FontActivated} callback.
     */
    @FunctionalInterface
    public interface FontActivated {
    
        /**
         * Emitted when a font is activated.
         * <p>
         * This usually happens when the user double clicks an item,
         * or an item is selected and the user presses one of the keys
         * Space, Shift+Space, Return or Enter.
         */
        void run(java.lang.String fontname);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceFontChooser, MemoryAddress fontname) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run(Marshal.addressToString.marshal(fontname, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FontActivated.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when a font is activated.
     * <p>
     * This usually happens when the user double clicks an item,
     * or an item is selected and the user presses one of the keys
     * Space, Shift+Space, Return or Enter.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<FontChooser.FontActivated> onFontActivated(FontChooser.FontActivated handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("font-activated", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gtk_font_chooser_get_font = Interop.downcallHandle(
                "gtk_font_chooser_get_font",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_font_chooser_get_font_desc = Interop.downcallHandle(
                "gtk_font_chooser_get_font_desc",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_font_chooser_get_font_face = Interop.downcallHandle(
                "gtk_font_chooser_get_font_face",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_font_chooser_get_font_family = Interop.downcallHandle(
                "gtk_font_chooser_get_font_family",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_font_chooser_get_font_features = Interop.downcallHandle(
                "gtk_font_chooser_get_font_features",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_font_chooser_get_font_map = Interop.downcallHandle(
                "gtk_font_chooser_get_font_map",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_font_chooser_get_font_size = Interop.downcallHandle(
                "gtk_font_chooser_get_font_size",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_font_chooser_get_language = Interop.downcallHandle(
                "gtk_font_chooser_get_language",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_font_chooser_get_level = Interop.downcallHandle(
                "gtk_font_chooser_get_level",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_font_chooser_get_preview_text = Interop.downcallHandle(
                "gtk_font_chooser_get_preview_text",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_font_chooser_get_show_preview_entry = Interop.downcallHandle(
                "gtk_font_chooser_get_show_preview_entry",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_font_chooser_set_filter_func = Interop.downcallHandle(
                "gtk_font_chooser_set_filter_func",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_font_chooser_set_font = Interop.downcallHandle(
                "gtk_font_chooser_set_font",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_font_chooser_set_font_desc = Interop.downcallHandle(
                "gtk_font_chooser_set_font_desc",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_font_chooser_set_font_map = Interop.downcallHandle(
                "gtk_font_chooser_set_font_map",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_font_chooser_set_language = Interop.downcallHandle(
                "gtk_font_chooser_set_language",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_font_chooser_set_level = Interop.downcallHandle(
                "gtk_font_chooser_set_level",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_font_chooser_set_preview_text = Interop.downcallHandle(
                "gtk_font_chooser_set_preview_text",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_font_chooser_set_show_preview_entry = Interop.downcallHandle(
                "gtk_font_chooser_set_show_preview_entry",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_font_chooser_get_type = Interop.downcallHandle(
                "gtk_font_chooser_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * The FontChooserImpl type represents a native instance of the FontChooser interface.
     */
    class FontChooserImpl extends org.gtk.gobject.GObject implements FontChooser {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of FontChooser for the provided memory address.
         * @param address the memory address of the instance
         */
        public FontChooserImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_font_chooser_get_type != null;
    }
}
