package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `PangoAttrShape` structure is used to represent attributes which
 * impose shape restrictions.
 */
public class AttrShape extends io.github.jwharm.javagi.interop.ResourceBase {

    public AttrShape(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Create a new shape attribute.
     * 
     * A shape is used to impose a particular ink and logical
     * rectangle on the result of shaping a particular glyph.
     * This might be used, for instance, for embedding a picture
     * or a widget inside a `PangoLayout`.
     */
    public static Attribute new_(Rectangle inkRect, Rectangle logicalRect) {
        var RESULT = gtk_h.pango_attr_shape_new(inkRect.handle(), logicalRect.handle());
        return new Attribute(References.get(RESULT, true));
    }
    
}
