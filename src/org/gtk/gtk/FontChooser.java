package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkFontChooser` is an interface that can be implemented by widgets
 * for choosing fonts.
 * 
 * In GTK, the main objects that implement this interface are
 * [class@Gtk.FontChooserWidget], [class@Gtk.FontChooserDialog] and
 * [class@Gtk.FontButton].
 */
public interface FontChooser extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Gets the currently-selected font name.
     * 
     * Note that this can be a different string than what you set with
     * [method@Gtk.FontChooser.set_font], as the font chooser widget may
     * normalize font names and thus return a string with a different
     * structure. For example, “Helvetica Italic Bold 12” could be
     * normalized to “Helvetica Bold Italic 12”.
     * 
     * Use [method@Pango.FontDescription.equal] if you want to compare two
     * font descriptions.
     */
    public default java.lang.String getFont() {
        var RESULT = gtk_h.gtk_font_chooser_get_font(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the currently-selected font.
     * 
     * Note that this can be a different string than what you set with
     * [method@Gtk.FontChooser.set_font], as the font chooser widget may
     * normalize font names and thus return a string with a different
     * structure. For example, “Helvetica Italic Bold 12” could be
     * normalized to “Helvetica Bold Italic 12”.
     * 
     * Use [method@Pango.FontDescription.equal] if you want to compare two
     * font descriptions.
     */
    public default org.pango.FontDescription getFontDesc() {
        var RESULT = gtk_h.gtk_font_chooser_get_font_desc(handle());
        return new org.pango.FontDescription(References.get(RESULT, true));
    }
    
    /**
     * Gets the `PangoFontFace` representing the selected font group
     * details (i.e. family, slant, weight, width, etc).
     * 
     * If the selected font is not installed, returns %NULL.
     */
    public default org.pango.FontFace getFontFace() {
        var RESULT = gtk_h.gtk_font_chooser_get_font_face(handle());
        return new org.pango.FontFace(References.get(RESULT, false));
    }
    
    /**
     * Gets the `PangoFontFamily` representing the selected font family.
     * 
     * Font families are a collection of font faces.
     * 
     * If the selected font is not installed, returns %NULL.
     */
    public default org.pango.FontFamily getFontFamily() {
        var RESULT = gtk_h.gtk_font_chooser_get_font_family(handle());
        return new org.pango.FontFamily(References.get(RESULT, false));
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
     * or %NULL if it does not have one.
     */
    public default org.pango.FontMap getFontMap() {
        var RESULT = gtk_h.gtk_font_chooser_get_font_map(handle());
        return new org.pango.FontMap(References.get(RESULT, true));
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
    public default int getLevel() {
        var RESULT = gtk_h.gtk_font_chooser_get_level(handle());
        return RESULT;
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
        return (RESULT != 0);
    }
    
    /**
     * Adds a filter function that decides which fonts to display
     * in the font chooser.
     */
    public default void setFilterFunc(FontChooser fontchooser, FontFilterFunc filter) {
        try {
            int hash = filter.hashCode();
            Interop.signalRegistry.put(hash, filter);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbFontFilterFunc", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.gtk_font_chooser_set_filter_func(handle(), nativeSymbol, intSegment, Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
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
     * Sets the currently-selected font from @font_desc.
     */
    public default void setFontDesc(org.pango.FontDescription fontDesc) {
        gtk_h.gtk_font_chooser_set_font_desc(handle(), fontDesc.handle());
    }
    
    /**
     * Sets a custom font map to use for this font chooser widget.
     * 
     * A custom font map can be used to present application-specific
     * fonts instead of or in addition to the normal system fonts.
     * 
     * ```c
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
     * ```
     * 
     * Note that other GTK widgets will only be able to use the
     * application-specific font if it is present in the font map they use:
     * 
     * ```c
     * context = gtk_widget_get_pango_context (label);
     * pango_context_set_font_map (context, fontmap);
     * ```
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
    public default void setLevel(int level) {
        gtk_h.gtk_font_chooser_set_level(handle(), level);
    }
    
    /**
     * Sets the text displayed in the preview area.
     * 
     * The @text is used to show how the selected font looks.
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
     * 
     * This usually happens when the user double clicks an item,
     * or an item is selected and the user presses one of the keys
     * Space, Shift+Space, Return or Enter.
     */
    public default void onFontActivated(FontActivatedHandler handler) {
        try {
            int hash = handler.hashCode();
            Interop.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFontChooserFontActivated", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("font-activated").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    class FontChooserImpl extends org.gtk.gobject.Object implements FontChooser {
        public FontChooserImpl(io.github.jwharm.javagi.interop.Reference reference) {
            super(reference);
        }
    }
}
