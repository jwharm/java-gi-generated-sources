package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>PangoFontMetrics</code> structure holds the overall metric information
 * for a font.
 * <p>
 * The information in a <code>PangoFontMetrics</code> structure may be restricted
 * to a script. The fields of this structure are private to implementations
 * of a font backend. See the documentation of the corresponding getters
 * for documentation of their meaning.
 * 
 * For an overview of the most important metrics, see:
 * 
 * &#60;picture&#62;
 *   &#60;source srcset=&#34;fontmetrics-dark.png&#34; media=&#34;(prefers-color-scheme: dark)&#34;&#62;
 *   &#60;img alt=&#34;Font metrics&#34; src=&#34;fontmetrics-light.png&#34;&#62;
 * &#60;/picture&#62;
 */
public class FontMetrics extends io.github.jwharm.javagi.ResourceBase {

    public FontMetrics(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Gets the approximate character width for a font metrics structure.
     * 
     * This is merely a representative value useful, for example, for
     * determining the initial size for a window. Actual characters in
     * text will be wider and narrower than this.
     */
    public int getApproximateCharWidth() {
        var RESULT = gtk_h.pango_font_metrics_get_approximate_char_width(handle());
        return RESULT;
    }
    
    /**
     * Gets the approximate digit width for a font metrics structure.
     * 
     * This is merely a representative value useful, for example, for
     * determining the initial size for a window. Actual digits in
     * text can be wider or narrower than this, though this value
     * is generally somewhat more accurate than the result of
     * pango_font_metrics_get_approximate_char_width() for digits.
     */
    public int getApproximateDigitWidth() {
        var RESULT = gtk_h.pango_font_metrics_get_approximate_digit_width(handle());
        return RESULT;
    }
    
    /**
     * Gets the ascent from a font metrics structure.
     * 
     * The ascent is the distance from the baseline to the logical top
     * of a line of text. (The logical top may be above or below the top
     * of the actual drawn ink. It is necessary to lay out the text to
     * figure where the ink will be.)
     */
    public int getAscent() {
        var RESULT = gtk_h.pango_font_metrics_get_ascent(handle());
        return RESULT;
    }
    
    /**
     * Gets the descent from a font metrics structure.
     * 
     * The descent is the distance from the baseline to the logical bottom
     * of a line of text. (The logical bottom may be above or below the
     * bottom of the actual drawn ink. It is necessary to lay out the text
     * to figure where the ink will be.)
     */
    public int getDescent() {
        var RESULT = gtk_h.pango_font_metrics_get_descent(handle());
        return RESULT;
    }
    
    /**
     * Gets the line height from a font metrics structure.
     * 
     * The line height is the recommended distance between successive
     * baselines in wrapped text using this font.
     * 
     * If the line height is not available, 0 is returned.
     */
    public int getHeight() {
        var RESULT = gtk_h.pango_font_metrics_get_height(handle());
        return RESULT;
    }
    
    /**
     * Gets the suggested position to draw the strikethrough.
     * 
     * The value returned is the distance *above* the
     * baseline of the top of the strikethrough.
     */
    public int getStrikethroughPosition() {
        var RESULT = gtk_h.pango_font_metrics_get_strikethrough_position(handle());
        return RESULT;
    }
    
    /**
     * Gets the suggested thickness to draw for the strikethrough.
     */
    public int getStrikethroughThickness() {
        var RESULT = gtk_h.pango_font_metrics_get_strikethrough_thickness(handle());
        return RESULT;
    }
    
    /**
     * Gets the suggested position to draw the underline.
     * 
     * The value returned is the distance *above* the baseline of the top
     * of the underline. Since most fonts have underline positions beneath
     * the baseline, this value is typically negative.
     */
    public int getUnderlinePosition() {
        var RESULT = gtk_h.pango_font_metrics_get_underline_position(handle());
        return RESULT;
    }
    
    /**
     * Gets the suggested thickness to draw for the underline.
     */
    public int getUnderlineThickness() {
        var RESULT = gtk_h.pango_font_metrics_get_underline_thickness(handle());
        return RESULT;
    }
    
    /**
     * Increase the reference count of a font metrics structure by one.
     */
    public FontMetrics ref() {
        var RESULT = gtk_h.pango_font_metrics_ref(handle());
        return new FontMetrics(References.get(RESULT, true));
    }
    
    /**
     * Decrease the reference count of a font metrics structure by one.
     * 
     * If the result is zero, frees the structure and any associated memory.
     */
    public void unref() {
        gtk_h.pango_font_metrics_unref(handle());
    }
    
}
