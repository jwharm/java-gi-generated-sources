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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link FontMetrics}
     * @return A new, uninitialized @{link FontMetrics}
     */
    public static FontMetrics allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        FontMetrics newInstance = new FontMetrics(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a FontMetrics proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected FontMetrics(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, FontMetrics> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new FontMetrics(input);
    
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
            RESULT = (int) DowncallHandles.pango_font_metrics_get_approximate_char_width.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.pango_font_metrics_get_approximate_digit_width.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.pango_font_metrics_get_ascent.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.pango_font_metrics_get_descent.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.pango_font_metrics_get_height.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.pango_font_metrics_get_strikethrough_position.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.pango_font_metrics_get_strikethrough_thickness.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.pango_font_metrics_get_underline_position.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.pango_font_metrics_get_underline_thickness.invokeExact(handle());
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
            RESULT = (MemoryAddress) DowncallHandles.pango_font_metrics_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.pango.FontMetrics.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Decrease the reference count of a font metrics structure by one.
     * <p>
     * If the result is zero, frees the structure and any associated memory.
     */
    public void unref() {
        try {
            DowncallHandles.pango_font_metrics_unref.invokeExact(handle());
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
     * A {@link FontMetrics.Builder} object constructs a {@link FontMetrics} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link FontMetrics.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final FontMetrics struct;
        
        private Builder() {
            struct = FontMetrics.allocate();
        }
        
        /**
         * Finish building the {@link FontMetrics} struct.
         * @return A new instance of {@code FontMetrics} with the fields 
         *         that were set in the Builder object.
         */
        public FontMetrics build() {
            return struct;
        }
        
        public Builder setRefCount(int refCount) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("ref_count"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), refCount);
                return this;
            }
        }
        
        public Builder setAscent(int ascent) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("ascent"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), ascent);
                return this;
            }
        }
        
        public Builder setDescent(int descent) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("descent"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), descent);
                return this;
            }
        }
        
        public Builder setHeight(int height) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("height"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), height);
                return this;
            }
        }
        
        public Builder setApproximateCharWidth(int approximateCharWidth) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("approximate_char_width"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), approximateCharWidth);
                return this;
            }
        }
        
        public Builder setApproximateDigitWidth(int approximateDigitWidth) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("approximate_digit_width"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), approximateDigitWidth);
                return this;
            }
        }
        
        public Builder setUnderlinePosition(int underlinePosition) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("underline_position"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), underlinePosition);
                return this;
            }
        }
        
        public Builder setUnderlineThickness(int underlineThickness) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("underline_thickness"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), underlineThickness);
                return this;
            }
        }
        
        public Builder setStrikethroughPosition(int strikethroughPosition) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("strikethrough_position"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), strikethroughPosition);
                return this;
            }
        }
        
        public Builder setStrikethroughThickness(int strikethroughThickness) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("strikethrough_thickness"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), strikethroughThickness);
                return this;
            }
        }
    }
}
