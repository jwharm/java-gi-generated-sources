package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `PangoFontMap` represents the set of fonts available for a
 * particular rendering system.
 * 
 * This is a virtual object with implementations being specific to
 * particular rendering systems.
 */
public class FontMap extends org.gtk.gobject.Object {

    public FontMap(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to FontMap */
    public static FontMap castFrom(org.gtk.gobject.Object gobject) {
        return new FontMap(gobject.getReference());
    }
    
    /**
     * Forces a change in the context, which will cause any `PangoContext`
     * using this fontmap to change.
     * 
     * This function is only useful when implementing a new backend
     * for Pango, something applications won't do. Backends should
     * call this function if they have attached extra data to the
     * context and such data is changed.
     */
    public void changed() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_font_map_changed(HANDLE());
    }
    
    /**
     * Creates a `PangoContext` connected to @fontmap.
     * 
     * This is equivalent to [ctor@Pango.Context.new] followed by
     * [method@Pango.Context.set_font_map].
     * 
     * If you are using Pango as part of a higher-level system,
     * that system may have it's own way of create a `PangoContext`.
     * For instance, the GTK toolkit has, among others,
     * gtk_widget_get_pango_context(). Use those instead.
     */
    public Context createContext() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_font_map_create_context(HANDLE());
        return new Context(References.get(RESULT, true));
    }
    
    /**
     * Gets a font family by name.
     */
    public FontFamily getFamily(java.lang.String name) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_font_map_get_family(HANDLE(), Interop.allocateNativeString(name).HANDLE());
        return new FontFamily(References.get(RESULT, false));
    }
    
    /**
     * Returns the current serial number of @fontmap.
     * 
     * The serial number is initialized to an small number larger than zero
     * when a new fontmap is created and is increased whenever the fontmap
     * is changed. It may wrap, but will never have the value 0. Since it can
     * wrap, never compare it with "less than", always use "not equals".
     * 
     * The fontmap can only be changed using backend-specific API, like changing
     * fontmap resolution.
     * 
     * This can be used to automatically detect changes to a `PangoFontMap`,
     * like in `PangoContext`.
     */
    public int getSerial() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_font_map_get_serial(HANDLE());
        return RESULT;
    }
    
    /**
     * Load the font in the fontmap that is the closest match for @desc.
     */
    public Font loadFont(Context context, FontDescription desc) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_font_map_load_font(HANDLE(), context.HANDLE(), desc.HANDLE());
        return new Font(References.get(RESULT, true));
    }
    
    /**
     * Load a set of fonts in the fontmap that can be used to render
     * a font matching @desc.
     */
    public Fontset loadFontset(Context context, FontDescription desc, Language language) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_font_map_load_fontset(HANDLE(), context.HANDLE(), desc.HANDLE(), language.HANDLE());
        return new Fontset(References.get(RESULT, true));
    }
    
}
