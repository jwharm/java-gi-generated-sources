package org.harfbuzz;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A virtual method for the #hb_font_funcs_t of an #hb_font_t object.
 * 
 * This method should retrieve the kerning-adjustment value for a glyph-pair in
 * the specified font, for horizontal text segments.
 */
public class FontGetGlyphHKerningFuncT {

    private final FontGetGlyphKerningFuncT value;
    
    public FontGetGlyphHKerningFuncT(FontGetGlyphKerningFuncT value) {
        this.value = value;
    }
    
    public FontGetGlyphKerningFuncT getValue() {
        return this.value;
    }
    
}
