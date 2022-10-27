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
        return RESULT.getUtf8String(0);
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
        return new org.pango.FontDescription(Refcounted.get(RESULT, true));
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
        return new org.pango.FontFace(Refcounted.get(RESULT, false));
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
        return new org.pango.FontFamily(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the currently-selected font features.
     * @return the currently selected font features
     */
    default @NotNull java.lang.String getFontFeatures() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_font_chooser_get_font_features.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
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
        return new org.pango.FontMap(Refcounted.get(RESULT, true));
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
    default @NotNull java.lang.String getLanguage() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_font_chooser_get_language.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the current level of granularity for selecting fonts.
     * @return the current granularity level
     */
    default @NotNull org.gtk.gtk.FontChooserLevel getLevel() {
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
    default @NotNull java.lang.String getPreviewText() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_font_chooser_get_preview_text.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
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
        return RESULT != 0;
    }
    
    /**
     * Adds a filter function that decides which fonts to display
     * in the font chooser.
     * @param filter a {@code GtkFontFilterFunc}
     */
    default void setFilterFunc(@Nullable org.gtk.gtk.FontFilterFunc filter) {
        java.util.Objects.requireNonNullElse(filter, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_font_chooser_set_filter_func.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbFontFilterFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                   (Addressable) (filter == null ? MemoryAddress.NULL : Interop.registerCallback(filter)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the currently-selected font.
     * @param fontname a font name like “Helvetica 12” or “Times Bold 18”
     */
    default void setFont(@NotNull java.lang.String fontname) {
        java.util.Objects.requireNonNull(fontname, "Parameter 'fontname' must not be null");
        try {
            DowncallHandles.gtk_font_chooser_set_font.invokeExact(handle(), Interop.allocateNativeString(fontname));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the currently-selected font from {@code font_desc}.
     * @param fontDesc a {@code PangoFontDescription}
     */
    default void setFontDesc(@NotNull org.pango.FontDescription fontDesc) {
        java.util.Objects.requireNonNull(fontDesc, "Parameter 'fontDesc' must not be null");
        try {
            DowncallHandles.gtk_font_chooser_set_font_desc.invokeExact(handle(), fontDesc.handle());
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
        java.util.Objects.requireNonNullElse(fontmap, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_font_chooser_set_font_map.invokeExact(handle(), fontmap.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the language to use for font features.
     * @param language a language
     */
    default void setLanguage(@NotNull java.lang.String language) {
        java.util.Objects.requireNonNull(language, "Parameter 'language' must not be null");
        try {
            DowncallHandles.gtk_font_chooser_set_language.invokeExact(handle(), Interop.allocateNativeString(language));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the desired level of granularity for selecting fonts.
     * @param level the desired level of granularity
     */
    default void setLevel(@NotNull org.gtk.gtk.FontChooserLevel level) {
        java.util.Objects.requireNonNull(level, "Parameter 'level' must not be null");
        try {
            DowncallHandles.gtk_font_chooser_set_level.invokeExact(handle(), level.getValue());
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
    default void setPreviewText(@NotNull java.lang.String text) {
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        try {
            DowncallHandles.gtk_font_chooser_set_preview_text.invokeExact(handle(), Interop.allocateNativeString(text));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Shows or hides the editable preview entry.
     * @param showPreviewEntry whether to show the editable preview entry or not
     */
    default void setShowPreviewEntry(boolean showPreviewEntry) {
        try {
            DowncallHandles.gtk_font_chooser_set_show_preview_entry.invokeExact(handle(), showPreviewEntry ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface FontActivated {
        void signalReceived(FontChooser source, @NotNull java.lang.String fontname);
    }
    
    /**
     * Emitted when a font is activated.
     * <p>
     * This usually happens when the user double clicks an item,
     * or an item is selected and the user presses one of the keys
     * Space, Shift+Space, Return or Enter.
     */
    public default Signal<FontChooser.FontActivated> onFontActivated(FontChooser.FontActivated handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("font-activated"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FontChooser.Callbacks.class, "signalFontChooserFontActivated",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<FontChooser.FontActivated>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gtk_font_chooser_get_font = Interop.downcallHandle(
            "gtk_font_chooser_get_font",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_font_chooser_get_font_desc = Interop.downcallHandle(
            "gtk_font_chooser_get_font_desc",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_font_chooser_get_font_face = Interop.downcallHandle(
            "gtk_font_chooser_get_font_face",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_font_chooser_get_font_family = Interop.downcallHandle(
            "gtk_font_chooser_get_font_family",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_font_chooser_get_font_features = Interop.downcallHandle(
            "gtk_font_chooser_get_font_features",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_font_chooser_get_font_map = Interop.downcallHandle(
            "gtk_font_chooser_get_font_map",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_font_chooser_get_font_size = Interop.downcallHandle(
            "gtk_font_chooser_get_font_size",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_font_chooser_get_language = Interop.downcallHandle(
            "gtk_font_chooser_get_language",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_font_chooser_get_level = Interop.downcallHandle(
            "gtk_font_chooser_get_level",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_font_chooser_get_preview_text = Interop.downcallHandle(
            "gtk_font_chooser_get_preview_text",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_font_chooser_get_show_preview_entry = Interop.downcallHandle(
            "gtk_font_chooser_get_show_preview_entry",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_font_chooser_set_filter_func = Interop.downcallHandle(
            "gtk_font_chooser_set_filter_func",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_font_chooser_set_font = Interop.downcallHandle(
            "gtk_font_chooser_set_font",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_font_chooser_set_font_desc = Interop.downcallHandle(
            "gtk_font_chooser_set_font_desc",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_font_chooser_set_font_map = Interop.downcallHandle(
            "gtk_font_chooser_set_font_map",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_font_chooser_set_language = Interop.downcallHandle(
            "gtk_font_chooser_set_language",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_font_chooser_set_level = Interop.downcallHandle(
            "gtk_font_chooser_set_level",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_font_chooser_set_preview_text = Interop.downcallHandle(
            "gtk_font_chooser_set_preview_text",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_font_chooser_set_show_preview_entry = Interop.downcallHandle(
            "gtk_font_chooser_set_show_preview_entry",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
    
    @ApiStatus.Internal
    static class Callbacks {
        
        public static void signalFontChooserFontActivated(MemoryAddress source, MemoryAddress fontname, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (FontChooser.FontActivated) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new FontChooser.FontChooserImpl(Refcounted.get(source)), fontname.getUtf8String(0));
        }
    }
    
    class FontChooserImpl extends org.gtk.gobject.Object implements FontChooser {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        public FontChooserImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
