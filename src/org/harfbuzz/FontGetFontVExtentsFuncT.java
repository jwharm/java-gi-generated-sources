package org.harfbuzz;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A virtual method for the #hb_font_funcs_t of an #hb_font_t object.
 * 
 * This method should retrieve the extents for a font, for vertical-direction
 * text segments. Extents must be returned in an #hb_glyph_extents output
 * parameter.
 */
public class FontGetFontVExtentsFuncT {

    private final FontGetFontExtentsFuncT value;
    
    public FontGetFontVExtentsFuncT(FontGetFontExtentsFuncT value) {
        this.value = value;
    }
    
    public FontGetFontExtentsFuncT getValue() {
        return this.value;
    }
    
}
