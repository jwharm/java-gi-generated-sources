package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `PangoColor` structure is used to
 * represent a color in an uncalibrated RGB color-space.
 */
public class Color extends io.github.jwharm.javagi.interop.ResourceBase {

    public Color(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Creates a copy of @src.
     * 
     * The copy should be freed with [method@Pango.Color.free].
     * Primarily used by language bindings, not that useful
     * otherwise (since colors can just be copied by assignment
     * in C).
     */
    public Color copy() {
        var RESULT = gtk_h.pango_color_copy(handle());
        return new Color(References.get(RESULT, true));
    }
    
    /**
     * Frees a color allocated by [method@Pango.Color.copy].
     */
    public void free() {
        gtk_h.pango_color_free(handle());
    }
    
    /**
     * Fill in the fields of a color from a string specification.
     * 
     * The string can either one of a large set of standard names.
     * (Taken from the CSS Color [specification](https://www.w3.org/TR/css-color-4/#named-colors),
     * or it can be a value in the form `#rgb`, `#rrggbb`,
     * `#rrrgggbbb` or `#rrrrggggbbbb`, where `r`, `g` and `b`
     * are hex digits of the red, green, and blue components
     * of the color, respectively. (White in the four forms is
     * `#fff`, `#ffffff`, `#fffffffff` and `#ffffffffffff`.)
     */
    public boolean parse(java.lang.String spec) {
        var RESULT = gtk_h.pango_color_parse(handle(), Interop.allocateNativeString(spec).handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns a textual specification of @color.
     * 
     * The string is in the hexadecimal form `#rrrrggggbbbb`,
     * where `r`, `g` and `b` are hex digits representing the
     * red, green, and blue components respectively.
     */
    public java.lang.String toString() {
        var RESULT = gtk_h.pango_color_to_string(handle());
        return RESULT.getUtf8String(0);
    }
    
}
