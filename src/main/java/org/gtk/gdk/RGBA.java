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
public class RGBA extends io.github.jwharm.javagi.ResourceBase {

    public RGBA(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle gdk_rgba_copy = Interop.downcallHandle(
        "gdk_rgba_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Makes a copy of a {@code GdkRGBA}.
     * <p>
     * The result must be freed through {@link RGBA#free}.
     */
    public @NotNull RGBA copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_rgba_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new RGBA(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gdk_rgba_equal = Interop.downcallHandle(
        "gdk_rgba_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Compares two {@code GdkRGBA} colors.
     */
    public boolean equal(@NotNull RGBA p2) {
        int RESULT;
        try {
            RESULT = (int) gdk_rgba_equal.invokeExact(handle(), p2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gdk_rgba_free = Interop.downcallHandle(
        "gdk_rgba_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees a {@code GdkRGBA}.
     */
    public @NotNull void free() {
        try {
            gdk_rgba_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gdk_rgba_hash = Interop.downcallHandle(
        "gdk_rgba_hash",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * A hash function suitable for using for a hash
     * table that stores {@code GdkRGBA}s.
     */
    public int hash() {
        int RESULT;
        try {
            RESULT = (int) gdk_rgba_hash.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gdk_rgba_is_clear = Interop.downcallHandle(
        "gdk_rgba_is_clear",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if an {@code rgba} value is transparent.
     * <p>
     * That is, drawing with the value would not produce any change.
     */
    public boolean isClear() {
        int RESULT;
        try {
            RESULT = (int) gdk_rgba_is_clear.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gdk_rgba_is_opaque = Interop.downcallHandle(
        "gdk_rgba_is_opaque",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if an {@code rgba} value is opaque.
     * <p>
     * That is, drawing with the value will not retain any results
     * from previous contents.
     */
    public boolean isOpaque() {
        int RESULT;
        try {
            RESULT = (int) gdk_rgba_is_opaque.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gdk_rgba_parse = Interop.downcallHandle(
        "gdk_rgba_parse",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public boolean parse(@NotNull java.lang.String spec) {
        int RESULT;
        try {
            RESULT = (int) gdk_rgba_parse.invokeExact(handle(), Interop.allocateNativeString(spec));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gdk_rgba_to_string = Interop.downcallHandle(
        "gdk_rgba_to_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public @NotNull java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_rgba_to_string.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
}
