package org.pango;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code PangoColor} structure is used to
 * represent a color in an uncalibrated RGB color-space.
 */
public class Color extends io.github.jwharm.javagi.ResourceBase {

    public Color(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public Color() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.PangoColor.allocate(Interop.getAllocator()).address()));
    }
    
    /**
     * Creates a copy of {@code src}.
     * <p>
     * The copy should be freed with {@link Color#free}.
     * Primarily used by language bindings, not that useful
     * otherwise (since colors can just be copied by assignment
     * in C).
     */
    public Color copy() {
        var RESULT = gtk_h.pango_color_copy(handle());
        return new Color(Refcounted.get(RESULT, true));
    }
    
    /**
     * Frees a color allocated by {@link Color#copy}.
     */
    public void free() {
        gtk_h.pango_color_free(handle());
    }
    
    /**
     * Fill in the fields of a color from a string specification.
     * <p>
     * The string can either one of a large set of standard names.
     * (Taken from the CSS Color <a href="https://www.w3.org/TR/css-color-4/#named-colors">specification</a>,
     * or it can be a value in the form {@code #rgb}, {@code #rrggbb},
     * {@code #rrrgggbbb} or {@code #rrrrggggbbbb}, where {@code r}, {@code g} and {@code b}
     * are hex digits of the red, green, and blue components
     * of the color, respectively. (White in the four forms is
     * {@code #fff}, {@code #ffffff}, {@code #fffffffff} and {@code #ffffffffffff}.)
     */
    public boolean parse(java.lang.String spec) {
        var RESULT = gtk_h.pango_color_parse(handle(), Interop.allocateNativeString(spec).handle());
        return RESULT != 0;
    }
    
    /**
     * Fill in the fields of a color from a string specification.
     * <p>
     * The string can either one of a large set of standard names.
     * (Taken from the CSS Color <a href="https://www.w3.org/TR/css-color-4/#named-colors">specification</a>,
     * or it can be a hexadecimal value in the form {@code #rgb},
     * {@code #rrggbb}, {@code #rrrgggbbb} or {@code #rrrrggggbbbb} where {@code r}, {@code g}
     * and {@code b} are hex digits of the red, green, and blue components
     * of the color, respectively. (White in the four forms is
     * {@code #fff}, {@code #ffffff}, {@code #fffffffff} and {@code #ffffffffffff}.)
     * <p>
     * Additionally, parse strings of the form {@code #rgba}, {@code #rrggbbaa},
     * {@code #rrrrggggbbbbaaaa}, if {@code alpha} is not {@code null}, and set {@code alpha}
     * to the value specified by the hex digits for {@code a}. If no alpha
     * component is found in {@code spec}, {@code alpha} is set to 0xffff (for a
     * solid color).
     */
    public boolean parseWithAlpha(PointerShort alpha, java.lang.String spec) {
        var RESULT = gtk_h.pango_color_parse_with_alpha(handle(), alpha.handle(), Interop.allocateNativeString(spec).handle());
        return RESULT != 0;
    }
    
    /**
     * Returns a textual specification of {@code color}.
     * <p>
     * The string is in the hexadecimal form {@code #rrrrggggbbbb},
     * where {@code r}, {@code g} and {@code b} are hex digits representing the
     * red, green, and blue components respectively.
     */
    public java.lang.String toString() {
        var RESULT = gtk_h.pango_color_to_string(handle());
        return RESULT.getUtf8String(0);
    }
    
}
