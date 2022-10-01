package org.pango;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code PangoFontMetrics} structure holds the overall metric information
 * for a font.
 * <p>
 * The information in a {@code PangoFontMetrics} structure may be restricted
 * to a script. The fields of this structure are private to implementations
 * of a font backend. See the documentation of the corresponding getters
 * for documentation of their meaning.
 * <p>
 * For an overview of the most important metrics, see:
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="fontmetrics-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img alt="Font metrics" src="fontmetrics-light.png"&gt;
 * &lt;/picture&gt;
 */
public class FontMetrics extends io.github.jwharm.javagi.ResourceBase {

    public FontMetrics(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public FontMetrics() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.PangoFontMetrics.allocate(Interop.getAllocator()).address()));
    }
    
    /**
     * Gets the approximate character width for a font metrics structure.
     * <p>
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
     * <p>
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
     * <p>
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
     * <p>
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
     * <p>
     * The line height is the recommended distance between successive
     * baselines in wrapped text using this font.
     * <p>
     * If the line height is not available, 0 is returned.
     */
    public int getHeight() {
        var RESULT = gtk_h.pango_font_metrics_get_height(handle());
        return RESULT;
    }
    
    /**
     * Gets the suggested position to draw the strikethrough.
     * <p>
     * The value returned is the distance <strong>above</strong> the
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
     * <p>
     * The value returned is the distance <strong>above</strong> the baseline of the top
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
        return new FontMetrics(Refcounted.get(RESULT, true));
    }
    
    /**
     * Decrease the reference count of a font metrics structure by one.
     * <p>
     * If the result is zero, frees the structure and any associated memory.
     */
    public void unref() {
        gtk_h.pango_font_metrics_unref(handle());
    }
    
}
