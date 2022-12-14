package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoColor} structure is used to
 * represent a color in an uncalibrated RGB color-space.
 */
public class Color extends Struct {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoColor";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_SHORT.withName("red"),
            Interop.valueLayout.C_SHORT.withName("green"),
            Interop.valueLayout.C_SHORT.withName("blue")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Color}
     * @return A new, uninitialized @{link Color}
     */
    public static Color allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Color newInstance = new Color(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code red}
     * @return The value of the field {@code red}
     */
    public short getRed() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (short) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("red"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code red}
     * @param red The new value of the field {@code red}
     */
    public void setRed(short red) {
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
    public short getGreen() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (short) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("green"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code green}
     * @param green The new value of the field {@code green}
     */
    public void setGreen(short green) {
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
    public short getBlue() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (short) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("blue"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code blue}
     * @param blue The new value of the field {@code blue}
     */
    public void setBlue(short blue) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("blue"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), blue);
        }
    }
    
    /**
     * Create a Color proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Color(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Color> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Color(input);
    
    /**
     * Creates a copy of {@code src}.
     * <p>
     * The copy should be freed with {@link Color#free}.
     * Primarily used by language bindings, not that useful
     * otherwise (since colors can just be copied by assignment
     * in C).
     * @return the newly allocated {@code PangoColor},
     *   which should be freed with {@link Color#free}
     */
    public @Nullable org.pango.Color copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_color_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.pango.Color.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Frees a color allocated by {@link Color#copy}.
     */
    public void free() {
        try {
            DowncallHandles.pango_color_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param spec a string specifying the new color
     * @return {@code true} if parsing of the specifier succeeded,
     *   otherwise {@code false}
     */
    public boolean parse(java.lang.String spec) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.pango_color_parse.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(spec, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
     * @param alpha return location for alpha
     * @param spec a string specifying the new color
     * @return {@code true} if parsing of the specifier succeeded,
     *   otherwise {@code false}
     */
    public boolean parseWithAlpha(Out<Short> alpha, java.lang.String spec) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment alphaPOINTER = SCOPE.allocate(Interop.valueLayout.C_SHORT);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.pango_color_parse_with_alpha.invokeExact(
                        handle(),
                        (Addressable) (alpha == null ? MemoryAddress.NULL : (Addressable) alphaPOINTER.address()),
                        Marshal.stringToAddress.marshal(spec, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (alpha != null) alpha.set(alphaPOINTER.get(Interop.valueLayout.C_SHORT, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Returns a textual specification of {@code color}.
     * <p>
     * The string is in the hexadecimal form {@code #rrrrggggbbbb},
     * where {@code r}, {@code g} and {@code b} are hex digits representing the
     * red, green, and blue components respectively.
     * @return a newly-allocated text string that must
     *   be freed with g_free().
     */
    public java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_color_to_string.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_color_copy = Interop.downcallHandle(
                "pango_color_copy",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_color_free = Interop.downcallHandle(
                "pango_color_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_color_parse = Interop.downcallHandle(
                "pango_color_parse",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_color_parse_with_alpha = Interop.downcallHandle(
                "pango_color_parse_with_alpha",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_color_to_string = Interop.downcallHandle(
                "pango_color_to_string",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link Color.Builder} object constructs a {@link Color} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Color.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Color struct;
        
        private Builder() {
            struct = Color.allocate();
        }
        
        /**
         * Finish building the {@link Color} struct.
         * @return A new instance of {@code Color} with the fields 
         *         that were set in the Builder object.
         */
        public Color build() {
            return struct;
        }
        
        /**
         * value of red component
         * @param red The value for the {@code red} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRed(short red) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("red"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), red);
                return this;
            }
        }
        
        /**
         * value of green component
         * @param green The value for the {@code green} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGreen(short green) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("green"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), green);
                return this;
            }
        }
        
        /**
         * value of blue component
         * @param blue The value for the {@code blue} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBlue(short blue) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("blue"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), blue);
                return this;
            }
        }
    }
}
