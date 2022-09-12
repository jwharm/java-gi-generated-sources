package org.harfbuzz;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A virtual method for the #hb_font_funcs_t of an #hb_font_t object.
 * 
 * This method should retrieve the kerning-adjustment value for a glyph-pair in
 * the specified font, for vertical text segments.
 */
public class FontGetGlyphVKerningFuncT {

    private final FontGetGlyphKerningFuncT value;
    
    public FontGetGlyphVKerningFuncT(FontGetGlyphKerningFuncT value) {
        this.value = value;
    }
    
    public FontGetGlyphKerningFuncT getValue() {
        return this.value;
    }
    
}
