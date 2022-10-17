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
 * {@code Gtk.FontChooserDialog} and
 * {@link FontButton}.
 */
public interface FontChooser extends io.github.jwharm.javagi.Proxy {

    @ApiStatus.Internal static final MethodHandle gtk_font_chooser_get_font = Interop.downcallHandle(
        "gtk_font_chooser_get_font",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    default @Nullable java.lang.String getFont() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_font_chooser_get_font.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_font_chooser_get_font_desc = Interop.downcallHandle(
        "gtk_font_chooser_get_font_desc",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    default @Nullable org.pango.FontDescription getFontDesc() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_font_chooser_get_font_desc.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.FontDescription(Refcounted.get(RESULT, true));
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_font_chooser_get_font_face = Interop.downcallHandle(
        "gtk_font_chooser_get_font_face",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code PangoFontFace} representing the selected font group
     * details (i.e. family, slant, weight, width, etc).
     * <p>
     * If the selected font is not installed, returns {@code null}.
     */
    default @Nullable org.pango.FontFace getFontFace() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_font_chooser_get_font_face.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.FontFace(Refcounted.get(RESULT, false));
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_font_chooser_get_font_family = Interop.downcallHandle(
        "gtk_font_chooser_get_font_family",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code PangoFontFamily} representing the selected font family.
     * <p>
     * Font families are a collection of font faces.
     * <p>
     * If the selected font is not installed, returns {@code null}.
     */
    default @Nullable org.pango.FontFamily getFontFamily() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_font_chooser_get_font_family.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.FontFamily(Refcounted.get(RESULT, false));
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_font_chooser_get_font_features = Interop.downcallHandle(
        "gtk_font_chooser_get_font_features",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the currently-selected font features.
     */
    default @NotNull java.lang.String getFontFeatures() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_font_chooser_get_font_features.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_font_chooser_get_font_map = Interop.downcallHandle(
        "gtk_font_chooser_get_font_map",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the custom font map of this font chooser widget,
     * or {@code null} if it does not have one.
     */
    default @Nullable org.pango.FontMap getFontMap() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_font_chooser_get_font_map.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.FontMap(Refcounted.get(RESULT, true));
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_font_chooser_get_font_size = Interop.downcallHandle(
        "gtk_font_chooser_get_font_size",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The selected font size.
     */
    default int getFontSize() {
        int RESULT;
        try {
            RESULT = (int) gtk_font_chooser_get_font_size.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_font_chooser_get_language = Interop.downcallHandle(
        "gtk_font_chooser_get_language",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the language that is used for font features.
     */
    default @NotNull java.lang.String getLanguage() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_font_chooser_get_language.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_font_chooser_get_level = Interop.downcallHandle(
        "gtk_font_chooser_get_level",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the current level of granularity for selecting fonts.
     */
    default @NotNull FontChooserLevel getLevel() {
        int RESULT;
        try {
            RESULT = (int) gtk_font_chooser_get_level.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new FontChooserLevel(RESULT);
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_font_chooser_get_preview_text = Interop.downcallHandle(
        "gtk_font_chooser_get_preview_text",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the text displayed in the preview area.
     */
    default @NotNull java.lang.String getPreviewText() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_font_chooser_get_preview_text.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_font_chooser_get_show_preview_entry = Interop.downcallHandle(
        "gtk_font_chooser_get_show_preview_entry",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the preview entry is shown or not.
     */
    default boolean getShowPreviewEntry() {
        int RESULT;
        try {
            RESULT = (int) gtk_font_chooser_get_show_preview_entry.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_font_chooser_set_filter_func = Interop.downcallHandle(
        "gtk_font_chooser_set_filter_func",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a filter function that decides which fonts to display
     * in the font chooser.
     */
    default @NotNull void setFilterFunc(@Nullable FontFilterFunc filter) {
        try {
            gtk_font_chooser_set_filter_func.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbFontFilterFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(filter)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_font_chooser_set_font = Interop.downcallHandle(
        "gtk_font_chooser_set_font",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the currently-selected font.
     */
    default @NotNull void setFont(@NotNull java.lang.String fontname) {
        try {
            gtk_font_chooser_set_font.invokeExact(handle(), Interop.allocateNativeString(fontname));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_font_chooser_set_font_desc = Interop.downcallHandle(
        "gtk_font_chooser_set_font_desc",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the currently-selected font from {@code font_desc}.
     */
    default @NotNull void setFontDesc(@NotNull org.pango.FontDescription fontDesc) {
        try {
            gtk_font_chooser_set_font_desc.invokeExact(handle(), fontDesc.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_font_chooser_set_font_map = Interop.downcallHandle(
        "gtk_font_chooser_set_font_map",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a custom font map to use for this font chooser widget.
     * <p>
     * A custom font map can be used to present application-specific
     * fonts instead of or in addition to the normal system fonts.
     * 
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
     * 
     * <pre>{@code c
     * context = gtk_widget_get_pango_context (label);
     * pango_context_set_font_map (context, fontmap);
     * }</pre>
     */
    default @NotNull void setFontMap(@Nullable org.pango.FontMap fontmap) {
        try {
            gtk_font_chooser_set_font_map.invokeExact(handle(), fontmap.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_font_chooser_set_language = Interop.downcallHandle(
        "gtk_font_chooser_set_language",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the language to use for font features.
     */
    default @NotNull void setLanguage(@NotNull java.lang.String language) {
        try {
            gtk_font_chooser_set_language.invokeExact(handle(), Interop.allocateNativeString(language));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_font_chooser_set_level = Interop.downcallHandle(
        "gtk_font_chooser_set_level",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the desired level of granularity for selecting fonts.
     */
    default @NotNull void setLevel(@NotNull FontChooserLevel level) {
        try {
            gtk_font_chooser_set_level.invokeExact(handle(), level.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_font_chooser_set_preview_text = Interop.downcallHandle(
        "gtk_font_chooser_set_preview_text",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the text displayed in the preview area.
     * <p>
     * The {@code text} is used to show how the selected font looks.
     */
    default @NotNull void setPreviewText(@NotNull java.lang.String text) {
        try {
            gtk_font_chooser_set_preview_text.invokeExact(handle(), Interop.allocateNativeString(text));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_font_chooser_set_show_preview_entry = Interop.downcallHandle(
        "gtk_font_chooser_set_show_preview_entry",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Shows or hides the editable preview entry.
     */
    default @NotNull void setShowPreviewEntry(@NotNull boolean showPreviewEntry) {
        try {
            gtk_font_chooser_set_show_preview_entry.invokeExact(handle(), showPreviewEntry ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface FontActivatedHandler {
        void signalReceived(FontChooser source, @NotNull java.lang.String fontname);
    }
    
    /**
     * Emitted when a font is activated.
     * <p>
     * This usually happens when the user double clicks an item,
     * or an item is selected and the user presses one of the keys
     * Space, Shift+Space, Return or Enter.
     */
    public default SignalHandle onFontActivated(FontActivatedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("font-activated"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FontChooser.Callbacks.class, "signalFontChooserFontActivated",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalFontChooserFontActivated(MemoryAddress source, MemoryAddress fontname, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (FontChooser.FontActivatedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new FontChooser.FontChooserImpl(Refcounted.get(source)), fontname.getUtf8String(0));
        }
        
    }
    
    class FontChooserImpl extends org.gtk.gobject.Object implements FontChooser {
        public FontChooserImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
