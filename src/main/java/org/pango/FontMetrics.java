package org.pango;

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
    
    static final MethodHandle pango_font_metrics_get_approximate_char_width = Interop.downcallHandle(
        "pango_font_metrics_get_approximate_char_width",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the approximate character width for a font metrics structure.
     * <p>
     * This is merely a representative value useful, for example, for
     * determining the initial size for a window. Actual characters in
     * text will be wider and narrower than this.
     */
    public int getApproximateCharWidth() {
        try {
            var RESULT = (int) pango_font_metrics_get_approximate_char_width.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_font_metrics_get_approximate_digit_width = Interop.downcallHandle(
        "pango_font_metrics_get_approximate_digit_width",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (int) pango_font_metrics_get_approximate_digit_width.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_font_metrics_get_ascent = Interop.downcallHandle(
        "pango_font_metrics_get_ascent",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the ascent from a font metrics structure.
     * <p>
     * The ascent is the distance from the baseline to the logical top
     * of a line of text. (The logical top may be above or below the top
     * of the actual drawn ink. It is necessary to lay out the text to
     * figure where the ink will be.)
     */
    public int getAscent() {
        try {
            var RESULT = (int) pango_font_metrics_get_ascent.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_font_metrics_get_descent = Interop.downcallHandle(
        "pango_font_metrics_get_descent",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the descent from a font metrics structure.
     * <p>
     * The descent is the distance from the baseline to the logical bottom
     * of a line of text. (The logical bottom may be above or below the
     * bottom of the actual drawn ink. It is necessary to lay out the text
     * to figure where the ink will be.)
     */
    public int getDescent() {
        try {
            var RESULT = (int) pango_font_metrics_get_descent.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_font_metrics_get_height = Interop.downcallHandle(
        "pango_font_metrics_get_height",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the line height from a font metrics structure.
     * <p>
     * The line height is the recommended distance between successive
     * baselines in wrapped text using this font.
     * <p>
     * If the line height is not available, 0 is returned.
     */
    public int getHeight() {
        try {
            var RESULT = (int) pango_font_metrics_get_height.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_font_metrics_get_strikethrough_position = Interop.downcallHandle(
        "pango_font_metrics_get_strikethrough_position",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the suggested position to draw the strikethrough.
     * <p>
     * The value returned is the distance <strong>above</strong> the
     * baseline of the top of the strikethrough.
     */
    public int getStrikethroughPosition() {
        try {
            var RESULT = (int) pango_font_metrics_get_strikethrough_position.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_font_metrics_get_strikethrough_thickness = Interop.downcallHandle(
        "pango_font_metrics_get_strikethrough_thickness",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the suggested thickness to draw for the strikethrough.
     */
    public int getStrikethroughThickness() {
        try {
            var RESULT = (int) pango_font_metrics_get_strikethrough_thickness.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_font_metrics_get_underline_position = Interop.downcallHandle(
        "pango_font_metrics_get_underline_position",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the suggested position to draw the underline.
     * <p>
     * The value returned is the distance <strong>above</strong> the baseline of the top
     * of the underline. Since most fonts have underline positions beneath
     * the baseline, this value is typically negative.
     */
    public int getUnderlinePosition() {
        try {
            var RESULT = (int) pango_font_metrics_get_underline_position.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_font_metrics_get_underline_thickness = Interop.downcallHandle(
        "pango_font_metrics_get_underline_thickness",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the suggested thickness to draw for the underline.
     */
    public int getUnderlineThickness() {
        try {
            var RESULT = (int) pango_font_metrics_get_underline_thickness.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_font_metrics_ref = Interop.downcallHandle(
        "pango_font_metrics_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increase the reference count of a font metrics structure by one.
     */
    public FontMetrics ref() {
        try {
            var RESULT = (MemoryAddress) pango_font_metrics_ref.invokeExact(handle());
            return new FontMetrics(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_font_metrics_unref = Interop.downcallHandle(
        "pango_font_metrics_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decrease the reference count of a font metrics structure by one.
     * <p>
     * If the result is zero, frees the structure and any associated memory.
     */
    public void unref() {
        try {
            pango_font_metrics_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
