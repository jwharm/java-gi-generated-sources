package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkFontChooser} is an interface that can be implemented by widgets
 * for choosing fonts.
 * <p>
 * In GTK, the main objects that implement this interface are
 * {@code Gtk.FontChooserDialog} and
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
     */
    public default java.lang.String getFont() {
        var RESULT = gtk_h.gtk_font_chooser_get_font(handle());
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
     */
    public default org.pango.FontDescription getFontDesc() {
        var RESULT = gtk_h.gtk_font_chooser_get_font_desc(handle());
        return new org.pango.FontDescription(Refcounted.get(RESULT, true));
    }
    
    /**
     * Gets the {@code PangoFontFace} representing the selected font group
     * details (i.e. family, slant, weight, width, etc).
     * <p>
     * If the selected font is not installed, returns {@code null}.
     */
    public default org.pango.FontFace getFontFace() {
        var RESULT = gtk_h.gtk_font_chooser_get_font_face(handle());
        return new org.pango.FontFace(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the {@code PangoFontFamily} representing the selected font family.
     * <p>
     * Font families are a collection of font faces.
     * <p>
     * If the selected font is not installed, returns {@code null}.
     */
    public default org.pango.FontFamily getFontFamily() {
        var RESULT = gtk_h.gtk_font_chooser_get_font_family(handle());
        return new org.pango.FontFamily(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the currently-selected font features.
     */
    public default java.lang.String getFontFeatures() {
        var RESULT = gtk_h.gtk_font_chooser_get_font_features(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the custom font map of this font chooser widget,
     * or {@code null} if it does not have one.
     */
    public default org.pango.FontMap getFontMap() {
        var RESULT = gtk_h.gtk_font_chooser_get_font_map(handle());
        return new org.pango.FontMap(Refcounted.get(RESULT, true));
    }
    
    /**
     * The selected font size.
     */
    public default int getFontSize() {
        var RESULT = gtk_h.gtk_font_chooser_get_font_size(handle());
        return RESULT;
    }
    
    /**
     * Gets the language that is used for font features.
     */
    public default java.lang.String getLanguage() {
        var RESULT = gtk_h.gtk_font_chooser_get_language(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the current level of granularity for selecting fonts.
     */
    public default FontChooserLevel getLevel() {
        var RESULT = gtk_h.gtk_font_chooser_get_level(handle());
        return new FontChooserLevel(RESULT);
    }
    
    /**
     * Gets the text displayed in the preview area.
     */
    public default java.lang.String getPreviewText() {
        var RESULT = gtk_h.gtk_font_chooser_get_preview_text(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns whether the preview entry is shown or not.
     */
    public default boolean getShowPreviewEntry() {
        var RESULT = gtk_h.gtk_font_chooser_get_show_preview_entry(handle());
        return RESULT != 0;
    }
    
    /**
     * Adds a filter function that decides which fonts to display
     * in the font chooser.
     */
    public default void setFilterFunc(FontFilterFunc filter) {
        try {
            gtk_h.gtk_font_chooser_set_filter_func(handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbFontFilterFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(filter.hashCode(), filter)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Sets the currently-selected font.
     */
    public default void setFont(java.lang.String fontname) {
        gtk_h.gtk_font_chooser_set_font(handle(), Interop.allocateNativeString(fontname).handle());
    }
    
    /**
     * Sets the currently-selected font from {@code font_desc}.
     */
    public default void setFontDesc(org.pango.FontDescription fontDesc) {
        gtk_h.gtk_font_chooser_set_font_desc(handle(), fontDesc.handle());
    }
    
    /**
     * Sets a custom font map to use for this font chooser widget.
     * <p>
     * A custom font map can be used to present application-specific
     * fonts instead of or in addition to the normal system fonts.
     * <p>
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
     * <p>
     * <pre>{@code c
     * context = gtk_widget_get_pango_context (label);
     * pango_context_set_font_map (context, fontmap);
     * }</pre>
     */
    public default void setFontMap(org.pango.FontMap fontmap) {
        gtk_h.gtk_font_chooser_set_font_map(handle(), fontmap.handle());
    }
    
    /**
     * Sets the language to use for font features.
     */
    public default void setLanguage(java.lang.String language) {
        gtk_h.gtk_font_chooser_set_language(handle(), Interop.allocateNativeString(language).handle());
    }
    
    /**
     * Sets the desired level of granularity for selecting fonts.
     */
    public default void setLevel(FontChooserLevel level) {
        gtk_h.gtk_font_chooser_set_level(handle(), level.getValue());
    }
    
    /**
     * Sets the text displayed in the preview area.
     * <p>
     * The {@code text} is used to show how the selected font looks.
     */
    public default void setPreviewText(java.lang.String text) {
        gtk_h.gtk_font_chooser_set_preview_text(handle(), Interop.allocateNativeString(text).handle());
    }
    
    /**
     * Shows or hides the editable preview entry.
     */
    public default void setShowPreviewEntry(boolean showPreviewEntry) {
        gtk_h.gtk_font_chooser_set_show_preview_entry(handle(), showPreviewEntry ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface FontActivatedHandler {
        void signalReceived(FontChooser source, java.lang.String fontname);
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("font-activated").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FontChooser.Callbacks.class, "signalFontChooserFontActivated",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
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
