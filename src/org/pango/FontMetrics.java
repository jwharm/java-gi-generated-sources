package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `PangoFontMetrics` structure holds the overall metric information
 * for a font.
 * 
 * The information in a `PangoFontMetrics` structure may be restricted
 * to a script. The fields of this structure are private to implementations
 * of a font backend. See the documentation of the corresponding getters
 * for documentation of their meaning.
 * 
 * For an overview of the most important metrics, see:
 * 
 * <picture>
 *   <source srcset="fontmetrics-dark.png" media="(prefers-color-scheme: dark)">
 *   <img alt="Font metrics" src="fontmetrics-light.png">
 * </picture>
 */
public class FontMetrics extends io.github.jwharm.javagi.interop.ResourceBase {

    public FontMetrics(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Gets the approximate character width for a font metrics structure.
     * 
     * This is merely a representative value useful, for example, for
     * determining the initial size for a window. Actual characters in
     * text will be wider and narrower than this.
     */
    public int getApproximateCharWidth() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_font_metrics_get_approximate_char_width(HANDLE());
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_font_metrics_get_approximate_digit_width(HANDLE());
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_font_metrics_get_ascent(HANDLE());
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_font_metrics_get_descent(HANDLE());
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_font_metrics_get_height(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the suggested position to draw the strikethrough.
     * 
     * The value returned is the distance *above* the
     * baseline of the top of the strikethrough.
     */
    public int getStrikethroughPosition() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_font_metrics_get_strikethrough_position(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the suggested thickness to draw for the strikethrough.
     */
    public int getStrikethroughThickness() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_font_metrics_get_strikethrough_thickness(HANDLE());
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_font_metrics_get_underline_position(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the suggested thickness to draw for the underline.
     */
    public int getUnderlineThickness() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_font_metrics_get_underline_thickness(HANDLE());
        return RESULT;
    }
    
    /**
     * Increase the reference count of a font metrics structure by one.
     */
    public FontMetrics ref() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_font_metrics_ref(HANDLE());
        return new FontMetrics(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Decrease the reference count of a font metrics structure by one.
     * 
     * If the result is zero, frees the structure and any associated memory.
     */
    public void unref() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_font_metrics_unref(HANDLE());
    }
    
}
