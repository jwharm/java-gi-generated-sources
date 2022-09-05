package org.harfbuzz;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A virtual method for the #hb_font_funcs_t of an #hb_font_t object.
 * 
 * This method should retrieve the (X,Y) coordinates (in font units) of the
 * origin for a glyph, for vertical-direction text segments. Each coordinate
 * must be returned in an #hb_position_t output parameter.
 */
public class FontGetGlyphVOriginFuncT {

    private final FontGetGlyphOriginFuncT value;
    
    public FontGetGlyphVOriginFuncT(FontGetGlyphOriginFuncT value) {
        this.value = value;
    }
    
    public FontGetGlyphOriginFuncT getValue() {
        return this.value;
    }
    
}