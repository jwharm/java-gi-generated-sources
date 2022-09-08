package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `PangoFontsetSimple` is a implementation of the abstract
 * `PangoFontset` base class as an array of fonts.
 * 
 * When creating a `PangoFontsetSimple`, you have to provide
 * the array of fonts that make up the fontset.
 */
public class FontsetSimple extends Fontset {

    public FontsetSimple(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to FontsetSimple */
    public static FontsetSimple castFrom(org.gtk.gobject.Object gobject) {
        return new FontsetSimple(gobject.getReference());
    }
    
    /**
     * Creates a new `PangoFontsetSimple` for the given language.
     */
    public FontsetSimple(Language language) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.pango_fontset_simple_new(language.HANDLE()), true));
    }
    
    /**
     * Adds a font to the fontset.
     * 
     * The fontset takes ownership of @font.
     */
    public void append(Font font) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_fontset_simple_append(HANDLE(), font.getReference().unowned().HANDLE());
    }
    
    /**
     * Returns the number of fonts in the fontset.
     */
    public int size() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_fontset_simple_size(HANDLE());
        return RESULT;
    }
    
}
