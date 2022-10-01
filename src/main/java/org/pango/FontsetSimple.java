package org.pango;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code PangoFontsetSimple} is a implementation of the abstract
 * {@code PangoFontset} base class as an array of fonts.
 * <p>
 * When creating a {@code PangoFontsetSimple}, you have to provide
 * the array of fonts that make up the fontset.
 */
public class FontsetSimple extends Fontset {

    public FontsetSimple(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to FontsetSimple */
    public static FontsetSimple castFrom(org.gtk.gobject.Object gobject) {
        return new FontsetSimple(gobject.refcounted());
    }
    
    private static Refcounted constructNew(Language language) {
        Refcounted RESULT = Refcounted.get(gtk_h.pango_fontset_simple_new(language.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code PangoFontsetSimple} for the given language.
     */
    public FontsetSimple(Language language) {
        super(constructNew(language));
    }
    
    /**
     * Adds a font to the fontset.
     * <p>
     * The fontset takes ownership of {@code font}.
     */
    public void append(Font font) {
        gtk_h.pango_fontset_simple_append(handle(), font.refcounted().unowned().handle());
    }
    
    /**
     * Returns the number of fonts in the fontset.
     */
    public int size() {
        var RESULT = gtk_h.pango_fontset_simple_size(handle());
        return RESULT;
    }
    
}
