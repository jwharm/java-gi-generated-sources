package org.harfbuzz;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A virtual method for the #hb_font_funcs_t of an #hb_font_t object.
 * 
 * This method should retrieve the advances for a sequence of glyphs, in
 * horizontal-direction text segments.
 */
public class FontGetGlyphHAdvancesFuncT {

    private final FontGetGlyphAdvancesFuncT value;
    
    public FontGetGlyphHAdvancesFuncT(FontGetGlyphAdvancesFuncT value) {
        this.value = value;
    }
    
    public FontGetGlyphAdvancesFuncT getValue() {
        return this.value;
    }
    
}
