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
     * Cast object to FontChooser if its GType is a (or inherits from) "GtkFontChooser".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code FontChooser} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkFontChooser", a ClassCastException will be thrown.
     */
    public static FontChooser castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), FontChooser.getType())) {
            return new FontChooserImpl(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkFontChooser");
        }
    }
    
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_font_chooser_get_font.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_font_chooser_get_font_desc.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.FontDescription(RESULT, Ownership.FULL);
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_font_chooser_get_font_face.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.FontFace(RESULT, Ownership.NONE);
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_font_chooser_get_font_family.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.FontFamily(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the currently-selected font features.
     * <p>
     * The format of the returned string is compatible with the
     * <a href="https://www.w3.org/TR/css-fonts-4/#font-rend-desc">CSS font-feature-settings property</a>.
     * It can be passed to {@link org.pango.AttrFontFeatures#new_}.
     * @return the currently selected font features
     */
    default @NotNull java.lang.String getFontFeatures() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_font_chooser_get_font_features.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the custom font map of this font chooser widget,
     * or {@code null} if it does not have one.
     * @return a {@code PangoFontMap}
     */
    default @Nullable org.pango.FontMap getFontMap() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_font_chooser_get_font_map.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.FontMap(RESULT, Ownership.FULL);
    }
    
    /**
     * The selected font size.
     * @return A n integer representing the selected font size,
     *   or -1 if no font size is selected.
     */
    default int getFontSize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_font_chooser_get_font_size.invokeExact(
                    handle());
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_font_chooser_get_language.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns the current level of granularity for selecting fonts.
     * @return the current granularity level
     */
    default @NotNull org.gtk.gtk.FontChooserLevel getLevel() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_font_chooser_get_level.invokeExact(
                    handle());
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_font_chooser_get_preview_text.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns whether the preview entry is shown or not.
     * @return {@code true} if the preview entry is shown or {@code false} if it is hidden.
     */
    default boolean getShowPreviewEntry() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_font_chooser_get_show_preview_entry.invokeExact(
                    handle());
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
        try {
            DowncallHandles.gtk_font_chooser_set_filter_func.invokeExact(
                    handle(),
                    (Addressable) (filter == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbFontFilterFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
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
            DowncallHandles.gtk_font_chooser_set_font.invokeExact(
                    handle(),
                    Interop.allocateNativeString(fontname));
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
    default void setLanguage(@NotNull java.lang.String language) {
        java.util.Objects.requireNonNull(language, "Parameter 'language' must not be null");
        try {
            DowncallHandles.gtk_font_chooser_set_language.invokeExact(
                    handle(),
                    Interop.allocateNativeString(language));
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
    default void setPreviewText(@NotNull java.lang.String text) {
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        try {
            DowncallHandles.gtk_font_chooser_set_preview_text.invokeExact(
                    handle(),
                    Interop.allocateNativeString(text));
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
            DowncallHandles.gtk_font_chooser_set_show_preview_entry.invokeExact(
                    handle(),
                    showPreviewEntry ? 1 : 0);
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
            RESULT = (long) DowncallHandles.gtk_font_chooser_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface FontActivated {
        void signalReceived(FontChooser sourceFontChooser, @NotNull java.lang.String fontname);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("font-activated"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FontChooser.Callbacks.class, "signalFontChooserFontActivated",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
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
    
    @ApiStatus.Internal
    static class Callbacks {
        
        public static void signalFontChooserFontActivated(MemoryAddress sourceFontChooser, MemoryAddress fontname, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (FontChooser.FontActivated) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new FontChooser.FontChooserImpl(sourceFontChooser, Ownership.NONE), Interop.getStringFrom(fontname));
        }
    }
    
    class FontChooserImpl extends org.gtk.gobject.Object implements FontChooser {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        public FontChooserImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
