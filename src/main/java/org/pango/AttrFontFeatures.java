package org.pango;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code PangoAttrFontFeatures} structure is used to represent OpenType
 * font features as an attribute.
 */
public class AttrFontFeatures extends io.github.jwharm.javagi.ResourceBase {

    public AttrFontFeatures(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public AttrFontFeatures() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.PangoAttrFontFeatures.allocate(Interop.getAllocator()).address()));
    }
    
    /**
     * Create a new font features tag attribute.
     * <p>
     * You can use this attribute to select OpenType font features like small-caps,
     * alternative glyphs, ligatures, etc. for fonts that support them.
     */
    public static Attribute new_(java.lang.String features) {
        var RESULT = gtk_h.pango_attr_font_features_new(Interop.allocateNativeString(features).handle());
        return new Attribute(Refcounted.get(RESULT, true));
    }
    
}
