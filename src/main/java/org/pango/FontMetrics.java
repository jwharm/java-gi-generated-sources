package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
public class FontMetrics extends Struct {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoFontMetrics";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("ref_count"),
        Interop.valueLayout.C_INT.withName("ascent"),
        Interop.valueLayout.C_INT.withName("descent"),
        Interop.valueLayout.C_INT.withName("height"),
        Interop.valueLayout.C_INT.withName("approximate_char_width"),
        Interop.valueLayout.C_INT.withName("approximate_digit_width"),
        Interop.valueLayout.C_INT.withName("underline_position"),
        Interop.valueLayout.C_INT.withName("underline_thickness"),
        Interop.valueLayout.C_INT.withName("strikethrough_position"),
        Interop.valueLayout.C_INT.withName("strikethrough_thickness")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link FontMetrics}
     * @return A new, uninitialized @{link FontMetrics}
     */
    public static FontMetrics allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        FontMetrics newInstance = new FontMetrics(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a FontMetrics proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public FontMetrics(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Gets the approximate character width for a font metrics structure.
     * <p>
     * This is merely a representative value useful, for example, for
     * determining the initial size for a window. Actual characters in
     * text will be wider and narrower than this.
     * @return the character width, in Pango units.
     */
    public int getApproximateCharWidth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_font_metrics_get_approximate_char_width.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @return the digit width, in Pango units.
     */
    public int getApproximateDigitWidth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_font_metrics_get_approximate_digit_width.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the ascent from a font metrics structure.
     * <p>
     * The ascent is the distance from the baseline to the logical top
     * of a line of text. (The logical top may be above or below the top
     * of the actual drawn ink. It is necessary to lay out the text to
     * figure where the ink will be.)
     * @return the ascent, in Pango units.
     */
    public int getAscent() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_font_metrics_get_ascent.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the descent from a font metrics structure.
     * <p>
     * The descent is the distance from the baseline to the logical bottom
     * of a line of text. (The logical bottom may be above or below the
     * bottom of the actual drawn ink. It is necessary to lay out the text
     * to figure where the ink will be.)
     * @return the descent, in Pango units.
     */
    public int getDescent() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_font_metrics_get_descent.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the line height from a font metrics structure.
     * <p>
     * The line height is the recommended distance between successive
     * baselines in wrapped text using this font.
     * <p>
     * If the line height is not available, 0 is returned.
     * @return the height, in Pango units
     */
    public int getHeight() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_font_metrics_get_height.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the suggested position to draw the strikethrough.
     * <p>
     * The value returned is the distance <em>above</em> the
     * baseline of the top of the strikethrough.
     * @return the suggested strikethrough position, in Pango units.
     */
    public int getStrikethroughPosition() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_font_metrics_get_strikethrough_position.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the suggested thickness to draw for the strikethrough.
     * @return the suggested strikethrough thickness, in Pango units.
     */
    public int getStrikethroughThickness() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_font_metrics_get_strikethrough_thickness.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the suggested position to draw the underline.
     * <p>
     * The value returned is the distance <em>above</em> the baseline of the top
     * of the underline. Since most fonts have underline positions beneath
     * the baseline, this value is typically negative.
     * @return the suggested underline position, in Pango units.
     */
    public int getUnderlinePosition() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_font_metrics_get_underline_position.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the suggested thickness to draw for the underline.
     * @return the suggested underline thickness, in Pango units.
     */
    public int getUnderlineThickness() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_font_metrics_get_underline_thickness.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Increase the reference count of a font metrics structure by one.
     * @return {@code metrics}
     */
    public @Nullable org.pango.FontMetrics ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_font_metrics_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.FontMetrics(RESULT, Ownership.FULL);
    }
    
    /**
     * Decrease the reference count of a font metrics structure by one.
     * <p>
     * If the result is zero, frees the structure and any associated memory.
     */
    public void unref() {
        try {
            DowncallHandles.pango_font_metrics_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_font_metrics_get_approximate_char_width = Interop.downcallHandle(
            "pango_font_metrics_get_approximate_char_width",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_font_metrics_get_approximate_digit_width = Interop.downcallHandle(
            "pango_font_metrics_get_approximate_digit_width",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_font_metrics_get_ascent = Interop.downcallHandle(
            "pango_font_metrics_get_ascent",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_font_metrics_get_descent = Interop.downcallHandle(
            "pango_font_metrics_get_descent",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_font_metrics_get_height = Interop.downcallHandle(
            "pango_font_metrics_get_height",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_font_metrics_get_strikethrough_position = Interop.downcallHandle(
            "pango_font_metrics_get_strikethrough_position",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_font_metrics_get_strikethrough_thickness = Interop.downcallHandle(
            "pango_font_metrics_get_strikethrough_thickness",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_font_metrics_get_underline_position = Interop.downcallHandle(
            "pango_font_metrics_get_underline_position",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_font_metrics_get_underline_thickness = Interop.downcallHandle(
            "pango_font_metrics_get_underline_thickness",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_font_metrics_ref = Interop.downcallHandle(
            "pango_font_metrics_ref",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_font_metrics_unref = Interop.downcallHandle(
            "pango_font_metrics_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private FontMetrics struct;
        
         /**
         * A {@link FontMetrics.Build} object constructs a {@link FontMetrics} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = FontMetrics.allocate();
        }
        
         /**
         * Finish building the {@link FontMetrics} struct.
         * @return A new instance of {@code FontMetrics} with the fields 
         *         that were set in the Build object.
         */
        public FontMetrics construct() {
            return struct;
        }
        
        public Build setRefCount(int ref_count) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ref_count"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), ref_count);
            return this;
        }
        
        public Build setAscent(int ascent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ascent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), ascent);
            return this;
        }
        
        public Build setDescent(int descent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("descent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), descent);
            return this;
        }
        
        public Build setHeight(int height) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("height"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), height);
            return this;
        }
        
        public Build setApproximateCharWidth(int approximate_char_width) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("approximate_char_width"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), approximate_char_width);
            return this;
        }
        
        public Build setApproximateDigitWidth(int approximate_digit_width) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("approximate_digit_width"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), approximate_digit_width);
            return this;
        }
        
        public Build setUnderlinePosition(int underline_position) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("underline_position"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), underline_position);
            return this;
        }
        
        public Build setUnderlineThickness(int underline_thickness) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("underline_thickness"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), underline_thickness);
            return this;
        }
        
        public Build setStrikethroughPosition(int strikethrough_position) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("strikethrough_position"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), strikethrough_position);
            return this;
        }
        
        public Build setStrikethroughThickness(int strikethrough_thickness) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("strikethrough_thickness"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), strikethrough_thickness);
            return this;
        }
    }
}
