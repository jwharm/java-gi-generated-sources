package org.harfbuzz;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A virtual method for the #hb_font_funcs_t of an #hb_font_t object.
 * 
 * This method should retrieve the advance for a specified glyph, in
 * horizontal-direction text segments. Advances must be returned in
 * an #hb_position_t output parameter.
 */
public class FontGetGlyphHAdvanceFuncT {

    private final FontGetGlyphAdvanceFuncT value;
    
    public FontGetGlyphHAdvanceFuncT(FontGetGlyphAdvanceFuncT value) {
        this.value = value;
    }
    
    public FontGetGlyphAdvanceFuncT getValue() {
        return this.value;
    }
    
}
