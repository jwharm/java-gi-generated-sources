package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>PangoFontsetSimple</code> is a implementation of the abstract<code>PangoFontset</code> base class as an array of fonts.
 * <p>
 * When creating a <code>PangoFontsetSimple</code>, you have to provide
 * the array of fonts that make up the fontset.
 */
public class FontsetSimple extends Fontset {

    public FontsetSimple(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to FontsetSimple */
    public static FontsetSimple castFrom(org.gtk.gobject.Object gobject) {
        return new FontsetSimple(gobject.getReference());
    }
    
    private static Reference constructNew(Language language) {
        Reference RESULT = References.get(gtk_h.pango_fontset_simple_new(language.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new <code>PangoFontsetSimple</code> for the given language.
     */
    public FontsetSimple(Language language) {
        super(constructNew(language));
    }
    
    /**
     * Adds a font to the fontset.
     * 
     * The fontset takes ownership of @font.
     */
    public void append(Font font) {
        gtk_h.pango_fontset_simple_append(handle(), font.getReference().unowned().handle());
    }
    
    /**
     * Returns the number of fonts in the fontset.
     */
    public int size() {
        var RESULT = gtk_h.pango_fontset_simple_size(handle());
        return RESULT;
    }
    
}
