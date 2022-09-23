package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code PangoAttrSize} structure is used to represent attributes which
 * set font size.
 */
public class AttrSize extends io.github.jwharm.javagi.ResourceBase {

    public AttrSize(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public AttrSize() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.PangoAttrSize.allocate(Interop.getAllocator()).address()));
    }
    
    /**
     * Create a new font-size attribute in fractional points.
     */
    public static Attribute new_(int size) {
        var RESULT = gtk_h.pango_attr_size_new(size);
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Create a new font-size attribute in device units.
     */
    public static Attribute newAbsolute(int size) {
        var RESULT = gtk_h.pango_attr_size_new_absolute(size);
        return new Attribute(References.get(RESULT, true));
    }
    
}
