package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `PangoAttrFontDesc` structure is used to store an attribute that
 * sets all aspects of the font description at once.
 */
public class AttrFontDesc extends io.github.jwharm.javagi.ResourceBase {

    public AttrFontDesc(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Create a new font description attribute.
     * 
     * This attribute allows setting family, style, weight, variant,
     * stretch, and size simultaneously.
     */
    public static Attribute new_(FontDescription desc) {
        var RESULT = gtk_h.pango_attr_font_desc_new(desc.handle());
        return new Attribute(References.get(RESULT, true));
    }
    
}
