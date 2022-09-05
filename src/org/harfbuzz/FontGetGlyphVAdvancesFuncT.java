package org.harfbuzz;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A virtual method for the #hb_font_funcs_t of an #hb_font_t object.
 * 
 * This method should retrieve the advances for a sequence of glyphs, in
 * vertical-direction text segments.
 */
public class FontGetGlyphVAdvancesFuncT {

    private final FontGetGlyphAdvancesFuncT value;
    
    public FontGetGlyphVAdvancesFuncT(FontGetGlyphAdvancesFuncT value) {
        this.value = value;
    }
    
    public FontGetGlyphAdvancesFuncT getValue() {
        return this.value;
    }
    
}
