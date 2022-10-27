package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoColor} structure is used to
 * represent a color in an uncalibrated RGB color-space.
 */
public class Color extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_SHORT.withName("red"),
        ValueLayout.JAVA_SHORT.withName("green"),
        ValueLayout.JAVA_SHORT.withName("blue")
    ).withName("PangoColor");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public Color(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
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
        return new org.pango.Color(Refcounted.get(RESULT, true));
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
    public boolean parse(@NotNull java.lang.String spec) {
        java.util.Objects.requireNonNull(spec, "Parameter 'spec' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_color_parse.invokeExact(handle(), Interop.allocateNativeString(spec));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param alpha return location for alpha
     * @param spec a string specifying the new color
     * @return {@code true} if parsing of the specifier succeeded,
     *   otherwise {@code false}
     */
    public boolean parseWithAlpha(Out<Short> alpha, @NotNull java.lang.String spec) {
        java.util.Objects.requireNonNull(alpha, "Parameter 'alpha' must not be null");
        java.util.Objects.requireNonNull(spec, "Parameter 'spec' must not be null");
        MemorySegment alphaPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_SHORT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_color_parse_with_alpha.invokeExact(handle(), (Addressable) alphaPOINTER.address(), Interop.allocateNativeString(spec));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        alpha.set(alphaPOINTER.get(ValueLayout.JAVA_SHORT, 0));
        return RESULT != 0;
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
    public @NotNull java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_color_to_string.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_color_copy = Interop.downcallHandle(
            "pango_color_copy",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_color_free = Interop.downcallHandle(
            "pango_color_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_color_parse = Interop.downcallHandle(
            "pango_color_parse",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_color_parse_with_alpha = Interop.downcallHandle(
            "pango_color_parse_with_alpha",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_color_to_string = Interop.downcallHandle(
            "pango_color_to_string",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
