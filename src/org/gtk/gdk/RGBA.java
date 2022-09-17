package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>GdkRGBA</code> is used to represent a color, in a way that is compatible
 * with cairo&#8217;s notion of color.
 * <p><code>GdkRGBA</code> is a convenient way to pass colors around. It&#8217;s based on
 * cairo&#8217;s way to deal with colors and mirrors its behavior. All values
 * are in the range from 0.0 to 1.0 inclusive. So the color
 * (0.0, 0.0, 0.0, 0.0) represents transparent black and
 * (1.0, 1.0, 1.0, 1.0) is opaque white. Other values will
 * be clamped to this range when drawing.
 */
public class RGBA extends io.github.jwharm.javagi.ResourceBase {

    public RGBA(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Makes a copy of a <code>GdkRGBA</code>.
     * 
     * The result must be freed through {@link org.gtk.gdk.RGBA#free}.
     */
    public RGBA copy() {
        var RESULT = gtk_h.gdk_rgba_copy(handle());
        return new RGBA(References.get(RESULT, true));
    }
    
    /**
     * Compares two <code>GdkRGBA</code> colors.
     */
    public boolean equal(RGBA p2) {
        var RESULT = gtk_h.gdk_rgba_equal(handle(), p2.handle());
        return (RESULT != 0);
    }
    
    /**
     * Frees a <code>GdkRGBA</code>.
     */
    public void free() {
        gtk_h.gdk_rgba_free(handle());
    }
    
    /**
     * A hash function suitable for using for a hash
     * table that stores <code>GdkRGBA</code>s.
     */
    public int hash() {
        var RESULT = gtk_h.gdk_rgba_hash(handle());
        return RESULT;
    }
    
    /**
     * Checks if an @rgba value is transparent.
     * 
     * That is, drawing with the value would not produce any change.
     */
    public boolean isClear() {
        var RESULT = gtk_h.gdk_rgba_is_clear(handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if an @rgba value is opaque.
     * 
     * That is, drawing with the value will not retain any results
     * from previous contents.
     */
    public boolean isOpaque() {
        var RESULT = gtk_h.gdk_rgba_is_opaque(handle());
        return (RESULT != 0);
    }
    
    /**
     * Parses a textual representation of a color.
     * 
     * The string can be either one of:
     * 
     * - A standard name (Taken from the Css specification).
     * - A hexadecimal value in the form &#8220;\\#rgb&#8221;, &#8220;\\#rrggbb&#8221;,
     *   &#8220;\\#rrrgggbbb&#8221; or &#8221;\\#rrrrggggbbbb&#8221;
     * - A hexadecimal value in the form &#8220;\\#rgba&#8221;, &#8220;\\#rrggbbaa&#8221;,
     *   or &#8221;\\#rrrrggggbbbbaaaa&#8221;
     * - A RGB color in the form &#8220;rgb(r,g,b)&#8221; (In this case the color
     *   will have full opacity)
     * - A RGBA color in the form &#8220;rgba(r,g,b,a)&#8221;
     * 
     * Where &#8220;r&#8221;, &#8220;g&#8221;, &#8220;b&#8221; and &#8220;a&#8221; are respectively the red, green,
     * blue and alpha color values. In the last two cases, &#8220;r&#8221;, &#8220;g&#8221;,
     * and &#8220;b&#8221; are either integers in the range 0 to 255 or percentage
     * values in the range 0<code></code> to 100<code>,</code> and a is a floating point value
     * in the range 0 to 1.
     */
    public boolean parse(java.lang.String spec) {
        var RESULT = gtk_h.gdk_rgba_parse(handle(), Interop.allocateNativeString(spec).handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns a textual specification of @rgba in the form<code>rgb(r,g,b)</code> or <code>rgba(r,g,b,a)</code>, where &#8220;r&#8221;, &#8220;g&#8221;, &#8220;b&#8221; and
     * &#8220;a&#8221; represent the red, green, blue and alpha values
     * respectively. &#8220;r&#8221;, &#8220;g&#8221;, and &#8220;b&#8221; are represented as integers
     * in the range 0 to 255, and &#8220;a&#8221; is represented as a floating
     * point value in the range 0 to 1.
     * 
     * These string forms are string forms that are supported by
     * the CSS3 colors module, and can be parsed by {@link org.gtk.gdk.RGBA#parse}.
     * 
     * Note that this string representation may lose some precision,
     * since &#8220;r&#8221;, &#8220;g&#8221; and &#8220;b&#8221; are represented as 8-bit integers. If
     * this is a concern, you should use a different representation.
     */
    public java.lang.String toString() {
        var RESULT = gtk_h.gdk_rgba_to_string(handle());
        return RESULT.getUtf8String(0);
    }
    
}
