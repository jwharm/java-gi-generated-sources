package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The <code>PangoColor</code> structure is used to
 * represent a color in an uncalibrated RGB color-space.
 */
public class Color extends io.github.jwharm.javagi.ResourceBase {

    public Color(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Creates a copy of @src.
     * 
     * The copy should be freed with {@link org.pango.Color#free}.
     * Primarily used by language bindings, not that useful
     * otherwise (since colors can just be copied by assignment
     * in C).
     */
    public Color copy() {
        var RESULT = gtk_h.pango_color_copy(handle());
        return new Color(References.get(RESULT, true));
    }
    
    /**
     * Frees a color allocated by {@link org.pango.Color#copy}.
     */
    public void free() {
        gtk_h.pango_color_free(handle());
    }
    
    /**
     * Fill in the fields of a color from a string specification.
     * <p>
     * The string can either one of a large set of standard names.
     * (Taken from the CSS Color {@link [specification]}(https://www.w3.org/TR/css-color-4/#named-colors),
     * or it can be a value in the form <code>#rgb</code>, <code>#rrggbb</code>,<code>#rrrgggbbb</code> or <code>#rrrrggggbbbb</code>, where <code>r</code>, <code>g</code> and <code>b</code>
     * are hex digits of the red, green, and blue components
     * of the color, respectively. (White in the four forms is<code>#fff</code>, <code>#ffffff</code>, <code>#fffffffff</code> and <code>#ffffffffffff</code>.)
     */
    public boolean parse(java.lang.String spec) {
        var RESULT = gtk_h.pango_color_parse(handle(), Interop.allocateNativeString(spec).handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns a textual specification of @color.
     * <p>
     * The string is in the hexadecimal form <code>#rrrrggggbbbb</code>,
     * where <code>r</code>, <code>g</code> and <code>b</code> are hex digits representing the
     * red, green, and blue components respectively.
     */
    public java.lang.String toString() {
        var RESULT = gtk_h.pango_color_to_string(handle());
        return RESULT.getUtf8String(0);
    }
    
}
