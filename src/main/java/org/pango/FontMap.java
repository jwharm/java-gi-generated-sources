package org.pango;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code PangoFontMap} represents the set of fonts available for a
 * particular rendering system.
 * <p>
 * This is a virtual object with implementations being specific to
 * particular rendering systems.
 */
public class FontMap extends org.gtk.gobject.Object implements org.gtk.gio.ListModel {

    public FontMap(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to FontMap */
    public static FontMap castFrom(org.gtk.gobject.Object gobject) {
        return new FontMap(gobject.getReference());
    }
    
    /**
     * Forces a change in the context, which will cause any {@code PangoContext}
     * using this fontmap to change.
     * <p>
     * This function is only useful when implementing a new backend
     * for Pango, something applications won't do. Backends should
     * call this function if they have attached extra data to the
     * context and such data is changed.
     */
    public void changed() {
        gtk_h.pango_font_map_changed(handle());
    }
    
    /**
     * Creates a {@code PangoContext} connected to {@code fontmap}.
     * <p>
     * This is equivalent to {@link Context#Context} followed by
     * {@link Context#setFontMap}.
     * <p>
     * If you are using Pango as part of a higher-level system,
     * that system may have it's own way of create a {@code PangoContext}.
     * For instance, the GTK toolkit has, among others,
     * gtk_widget_get_pango_context(). Use those instead.
     */
    public Context createContext() {
        var RESULT = gtk_h.pango_font_map_create_context(handle());
        return new Context(References.get(RESULT, true));
    }
    
    /**
     * Gets a font family by name.
     */
    public FontFamily getFamily(java.lang.String name) {
        var RESULT = gtk_h.pango_font_map_get_family(handle(), Interop.allocateNativeString(name).handle());
        return new FontFamily(References.get(RESULT, false));
    }
    
    /**
     * Returns the current serial number of {@code fontmap}.
     * <p>
     * The serial number is initialized to an small number larger than zero
     * when a new fontmap is created and is increased whenever the fontmap
     * is changed. It may wrap, but will never have the value 0. Since it can
     * wrap, never compare it with "less than", always use "not equals".
     * <p>
     * The fontmap can only be changed using backend-specific API, like changing
     * fontmap resolution.
     * <p>
     * This can be used to automatically detect changes to a {@code PangoFontMap},
     * like in {@code PangoContext}.
     */
    public int getSerial() {
        var RESULT = gtk_h.pango_font_map_get_serial(handle());
        return RESULT;
    }
    
    /**
     * List all families for a fontmap.
     * <p>
     * Note that the returned families are not in any particular order.
     * <p>
     * {@code PangoFontMap} also implemented the {@code Gio.ListModel} interface
     * for enumerating families.
     */
    public void listFamilies(FontFamily[] families, PointerInteger nFamilies) {
        gtk_h.pango_font_map_list_families(handle(), Interop.allocateNativeArray(families).handle(), nFamilies.handle());
    }
    
    /**
     * Load the font in the fontmap that is the closest match for {@code desc}.
     */
    public Font loadFont(Context context, FontDescription desc) {
        var RESULT = gtk_h.pango_font_map_load_font(handle(), context.handle(), desc.handle());
        return new Font(References.get(RESULT, true));
    }
    
    /**
     * Load a set of fonts in the fontmap that can be used to render
     * a font matching {@code desc}.
     */
    public Fontset loadFontset(Context context, FontDescription desc, Language language) {
        var RESULT = gtk_h.pango_font_map_load_fontset(handle(), context.handle(), desc.handle(), language.handle());
        return new Fontset(References.get(RESULT, true));
    }
    
}
