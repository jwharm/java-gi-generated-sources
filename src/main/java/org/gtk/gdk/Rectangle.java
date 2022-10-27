package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GdkRectangle} data type for representing rectangles.
 * <p>
 * {@code GdkRectangle} is identical to {@code cairo_rectangle_t}. Together with Cairo’s
 * {@code cairo_region_t} data type, these are the central types for representing
 * sets of pixels.
 * <p>
 * The intersection of two rectangles can be computed with
 * {@link Rectangle#intersect}; to find the union of two rectangles use
 * {@link Rectangle#union}.
 * <p>
 * The {@code cairo_region_t} type provided by Cairo is usually used for managing
 * non-rectangular clipping of graphical operations.
 * <p>
 * The Graphene library has a number of other data types for regions and
 * volumes in 2D and 3D.
 */
public class Rectangle extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("x"),
        ValueLayout.JAVA_INT.withName("y"),
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height")
    ).withName("GdkRectangle");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public Rectangle(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Returns {@code true} if {@code rect} contains the point described by {@code x} and {@code y}.
     * @param x X coordinate
     * @param y Y coordinate
     * @return {@code true} if {@code rect} contains the point
     */
    public boolean containsPoint(int x, int y) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_rectangle_contains_point.invokeExact(handle(), x, y);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks if the two given rectangles are equal.
     * @param rect2 a {@code GdkRectangle}
     * @return {@code true} if the rectangles are equal.
     */
    public boolean equal(@NotNull org.gtk.gdk.Rectangle rect2) {
        java.util.Objects.requireNonNull(rect2, "Parameter 'rect2' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_rectangle_equal.invokeExact(handle(), rect2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Calculates the intersection of two rectangles.
     * <p>
     * It is allowed for {@code dest} to be the same as either {@code src1} or {@code src2}.
     * If the rectangles do not intersect, {@code dest}’s width and height is set
     * to 0 and its x and y values are undefined. If you are only interested
     * in whether the rectangles intersect, but not in the intersecting area
     * itself, pass {@code null} for {@code dest}.
     * @param src2 a {@code GdkRectangle}
     * @param dest return location for the
     *   intersection of {@code src1} and {@code src2}
     * @return {@code true} if the rectangles intersect.
     */
    public boolean intersect(@NotNull org.gtk.gdk.Rectangle src2, @NotNull Out<org.gtk.gdk.Rectangle> dest) {
        java.util.Objects.requireNonNull(src2, "Parameter 'src2' must not be null");
        java.util.Objects.requireNonNull(dest, "Parameter 'dest' must not be null");
        MemorySegment destPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_rectangle_intersect.invokeExact(handle(), src2.handle(), (Addressable) destPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        dest.set(new org.gtk.gdk.Rectangle(Refcounted.get(destPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        return RESULT != 0;
    }
    
    /**
     * Calculates the union of two rectangles.
     * <p>
     * The union of rectangles {@code src1} and {@code src2} is the smallest rectangle which
     * includes both {@code src1} and {@code src2} within it. It is allowed for {@code dest} to be
     * the same as either {@code src1} or {@code src2}.
     * <p>
     * Note that this function does not ignore 'empty' rectangles (ie. with
     * zero width or height).
     * @param src2 a {@code GdkRectangle}
     * @param dest return location for the union of {@code src1} and {@code src2}
     */
    public void union(@NotNull org.gtk.gdk.Rectangle src2, @NotNull Out<org.gtk.gdk.Rectangle> dest) {
        java.util.Objects.requireNonNull(src2, "Parameter 'src2' must not be null");
        java.util.Objects.requireNonNull(dest, "Parameter 'dest' must not be null");
        MemorySegment destPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            DowncallHandles.gdk_rectangle_union.invokeExact(handle(), src2.handle(), (Addressable) destPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        dest.set(new org.gtk.gdk.Rectangle(Refcounted.get(destPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_rectangle_contains_point = Interop.downcallHandle(
            "gdk_rectangle_contains_point",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gdk_rectangle_equal = Interop.downcallHandle(
            "gdk_rectangle_equal",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_rectangle_intersect = Interop.downcallHandle(
            "gdk_rectangle_intersect",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_rectangle_union = Interop.downcallHandle(
            "gdk_rectangle_union",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
