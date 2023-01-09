package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GdkRGBA} is used to represent a color, in a way that is compatible
 * with cairo’s notion of color.
 * <p>
 * {@code GdkRGBA} is a convenient way to pass colors around. It’s based on
 * cairo’s way to deal with colors and mirrors its behavior. All values
 * are in the range from 0.0 to 1.0 inclusive. So the color
 * (0.0, 0.0, 0.0, 0.0) represents transparent black and
 * (1.0, 1.0, 1.0, 1.0) is opaque white. Other values will
 * be clamped to this range when drawing.
 */
public class RGBA extends Struct {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkRGBA";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_FLOAT.withName("red"),
            Interop.valueLayout.C_FLOAT.withName("green"),
            Interop.valueLayout.C_FLOAT.withName("blue"),
            Interop.valueLayout.C_FLOAT.withName("alpha")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link RGBA}
     * @return A new, uninitialized @{link RGBA}
     */
    public static RGBA allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        RGBA newInstance = new RGBA(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code red}
     * @return The value of the field {@code red}
     */
    public float getRed() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (float) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("red"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code red}
     * @param red The new value of the field {@code red}
     */
    public void setRed(float red) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("red"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), red);
        }
    }
    
    /**
     * Get the value of the field {@code green}
     * @return The value of the field {@code green}
     */
    public float getGreen() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (float) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("green"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code green}
     * @param green The new value of the field {@code green}
     */
    public void setGreen(float green) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("green"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), green);
        }
    }
    
    /**
     * Get the value of the field {@code blue}
     * @return The value of the field {@code blue}
     */
    public float getBlue() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (float) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("blue"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code blue}
     * @param blue The new value of the field {@code blue}
     */
    public void setBlue(float blue) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("blue"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), blue);
        }
    }
    
    /**
     * Get the value of the field {@code alpha}
     * @return The value of the field {@code alpha}
     */
    public float getAlpha() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (float) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("alpha"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code alpha}
     * @param alpha The new value of the field {@code alpha}
     */
    public void setAlpha(float alpha) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("alpha"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), alpha);
        }
    }
    
    /**
     * Create a RGBA proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected RGBA(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, RGBA> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new RGBA(input);
    
    /**
     * Makes a copy of a {@code GdkRGBA}.
     * <p>
     * The result must be freed through {@link RGBA#free}.
     * @return A newly allocated {@code GdkRGBA}, with the same contents as {@code rgba}
     */
    public org.gtk.gdk.RGBA copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_rgba_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.gdk.RGBA.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Compares two {@code GdkRGBA} colors.
     * @param p2 another {@code GdkRGBA}
     * @return {@code true} if the two colors compare equal
     */
    public boolean equal(org.gtk.gdk.RGBA p2) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_rgba_equal.invokeExact(
                    handle(),
                    p2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Frees a {@code GdkRGBA}.
     */
    public void free() {
        try {
            DowncallHandles.gdk_rgba_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A hash function suitable for using for a hash
     * table that stores {@code GdkRGBA}s.
     * @return The hash value for {@code p}
     */
    public int hash() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_rgba_hash.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks if an {@code rgba} value is transparent.
     * <p>
     * That is, drawing with the value would not produce any change.
     * @return {@code true} if the {@code rgba} is clear
     */
    public boolean isClear() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_rgba_is_clear.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if an {@code rgba} value is opaque.
     * <p>
     * That is, drawing with the value will not retain any results
     * from previous contents.
     * @return {@code true} if the {@code rgba} is opaque
     */
    public boolean isOpaque() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_rgba_is_opaque.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Parses a textual representation of a color.
     * <p>
     * The string can be either one of:
     * <ul>
     * <li>A standard name (Taken from the Css specification).
     * <li>A hexadecimal value in the form “\\{@code rgb}”, “\\{@code rrggbb}”,
     *   “\\{@code rrrgggbbb}” or ”\\{@code rrrrggggbbbb}”
     * <li>A hexadecimal value in the form “\\{@code rgba}”, “\\{@code rrggbbaa}”,
     *   or ”\\{@code rrrrggggbbbbaaaa}”
     * <li>A RGB color in the form “rgb(r,g,b)” (In this case the color
     *   will have full opacity)
     * <li>A RGBA color in the form “rgba(r,g,b,a)”
     * </ul>
     * <p>
     * Where “r”, “g”, “b” and “a” are respectively the red, green,
     * blue and alpha color values. In the last two cases, “r”, “g”,
     * and “b” are either integers in the range 0 to 255 or percentage
     * values in the range 0% to 100%, and a is a floating point value
     * in the range 0 to 1.
     * @param spec the string specifying the color
     * @return {@code true} if the parsing succeeded
     */
    public boolean parse(java.lang.String spec) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gdk_rgba_parse.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(spec, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Returns a textual specification of {@code rgba} in the form
     * {@code rgb(r,g,b)} or {@code rgba(r,g,b,a)}, where “r”, “g”, “b” and
     * “a” represent the red, green, blue and alpha values
     * respectively. “r”, “g”, and “b” are represented as integers
     * in the range 0 to 255, and “a” is represented as a floating
     * point value in the range 0 to 1.
     * <p>
     * These string forms are string forms that are supported by
     * the CSS3 colors module, and can be parsed by {@link RGBA#parse}.
     * <p>
     * Note that this string representation may lose some precision,
     * since “r”, “g” and “b” are represented as 8-bit integers. If
     * this is a concern, you should use a different representation.
     * @return A newly allocated text string
     */
    public java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_rgba_to_string.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_rgba_copy = Interop.downcallHandle(
                "gdk_rgba_copy",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_rgba_equal = Interop.downcallHandle(
                "gdk_rgba_equal",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_rgba_free = Interop.downcallHandle(
                "gdk_rgba_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_rgba_hash = Interop.downcallHandle(
                "gdk_rgba_hash",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_rgba_is_clear = Interop.downcallHandle(
                "gdk_rgba_is_clear",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_rgba_is_opaque = Interop.downcallHandle(
                "gdk_rgba_is_opaque",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_rgba_parse = Interop.downcallHandle(
                "gdk_rgba_parse",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_rgba_to_string = Interop.downcallHandle(
                "gdk_rgba_to_string",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link RGBA.Builder} object constructs a {@link RGBA} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link RGBA.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final RGBA struct;
        
        private Builder() {
            struct = RGBA.allocate();
        }
        
        /**
         * Finish building the {@link RGBA} struct.
         * @return A new instance of {@code RGBA} with the fields 
         *         that were set in the Builder object.
         */
        public RGBA build() {
            return struct;
        }
        
        /**
         * The intensity of the red channel from 0.0 to 1.0 inclusive
         * @param red The value for the {@code red} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRed(float red) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("red"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), red);
                return this;
            }
        }
        
        /**
         * The intensity of the green channel from 0.0 to 1.0 inclusive
         * @param green The value for the {@code green} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGreen(float green) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("green"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), green);
                return this;
            }
        }
        
        /**
         * The intensity of the blue channel from 0.0 to 1.0 inclusive
         * @param blue The value for the {@code blue} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBlue(float blue) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("blue"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), blue);
                return this;
            }
        }
        
        /**
         * The opacity of the color from 0.0 for completely translucent to
         *   1.0 for opaque
         * @param alpha The value for the {@code alpha} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAlpha(float alpha) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("alpha"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), alpha);
                return this;
            }
        }
    }
}
