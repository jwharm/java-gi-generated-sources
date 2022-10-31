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
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkRGBA";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_FLOAT.withName("red"),
        ValueLayout.JAVA_FLOAT.withName("green"),
        ValueLayout.JAVA_FLOAT.withName("blue"),
        ValueLayout.JAVA_FLOAT.withName("alpha")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static RGBA allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RGBA newInstance = new RGBA(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code red}
     * @return The value of the field {@code red}
     */
    public float red$get() {
        var RESULT = (float) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("red"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code red}
     * @param red The new value of the field {@code red}
     */
    public void red$set(float red) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("red"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), red);
    }
    
    /**
     * Get the value of the field {@code green}
     * @return The value of the field {@code green}
     */
    public float green$get() {
        var RESULT = (float) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("green"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code green}
     * @param green The new value of the field {@code green}
     */
    public void green$set(float green) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("green"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), green);
    }
    
    /**
     * Get the value of the field {@code blue}
     * @return The value of the field {@code blue}
     */
    public float blue$get() {
        var RESULT = (float) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("blue"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code blue}
     * @param blue The new value of the field {@code blue}
     */
    public void blue$set(float blue) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("blue"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), blue);
    }
    
    /**
     * Get the value of the field {@code alpha}
     * @return The value of the field {@code alpha}
     */
    public float alpha$get() {
        var RESULT = (float) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("alpha"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code alpha}
     * @param alpha The new value of the field {@code alpha}
     */
    public void alpha$set(float alpha) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("alpha"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), alpha);
    }
    
    @ApiStatus.Internal
    public RGBA(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Makes a copy of a {@code GdkRGBA}.
     * <p>
     * The result must be freed through {@link RGBA#free}.
     * @return A newly allocated {@code GdkRGBA}, with the same contents as {@code rgba}
     */
    public @NotNull org.gtk.gdk.RGBA copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_rgba_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.RGBA(Refcounted.get(RESULT, true));
    }
    
    /**
     * Compares two {@code GdkRGBA} colors.
     * @param p2 another {@code GdkRGBA}
     * @return {@code true} if the two colors compare equal
     */
    public boolean equal(@NotNull org.gtk.gdk.RGBA p2) {
        java.util.Objects.requireNonNull(p2, "Parameter 'p2' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_rgba_equal.invokeExact(
                    handle(),
                    p2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Frees a {@code GdkRGBA}.
     */
    public void free() {
        try {
            DowncallHandles.gdk_rgba_free.invokeExact(
                    handle());
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
            RESULT = (int) DowncallHandles.gdk_rgba_hash.invokeExact(
                    handle());
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
            RESULT = (int) DowncallHandles.gdk_rgba_is_clear.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
            RESULT = (int) DowncallHandles.gdk_rgba_is_opaque.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    public boolean parse(@NotNull java.lang.String spec) {
        java.util.Objects.requireNonNull(spec, "Parameter 'spec' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_rgba_parse.invokeExact(
                    handle(),
                    Interop.allocateNativeString(spec));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    public @NotNull java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_rgba_to_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_rgba_copy = Interop.downcallHandle(
            "gdk_rgba_copy",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_rgba_equal = Interop.downcallHandle(
            "gdk_rgba_equal",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_rgba_free = Interop.downcallHandle(
            "gdk_rgba_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_rgba_hash = Interop.downcallHandle(
            "gdk_rgba_hash",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_rgba_is_clear = Interop.downcallHandle(
            "gdk_rgba_is_clear",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_rgba_is_opaque = Interop.downcallHandle(
            "gdk_rgba_is_opaque",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_rgba_parse = Interop.downcallHandle(
            "gdk_rgba_parse",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_rgba_to_string = Interop.downcallHandle(
            "gdk_rgba_to_string",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
