package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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

    public Rectangle(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle gdk_rectangle_contains_point = Interop.downcallHandle(
        "gdk_rectangle_contains_point",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns {@code true} if {@code rect} contains the point described by @x and @y.
     */
    public boolean containsPoint(int x, int y) {
        try {
            var RESULT = (int) gdk_rectangle_contains_point.invokeExact(handle(), x, y);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_rectangle_equal = Interop.downcallHandle(
        "gdk_rectangle_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if the two given rectangles are equal.
     */
    public boolean equal(Rectangle rect2) {
        try {
            var RESULT = (int) gdk_rectangle_equal.invokeExact(handle(), rect2.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_rectangle_intersect = Interop.downcallHandle(
        "gdk_rectangle_intersect",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Calculates the intersection of two rectangles.
     * <p>
     * It is allowed for {@code dest} to be the same as either {@code src1} or {@code src2}.
     * If the rectangles do not intersect, {@code dest}’s width and height is set
     * to 0 and its x and y values are undefined. If you are only interested
     * in whether the rectangles intersect, but not in the intersecting area
     * itself, pass {@code null} for {@code dest}.
     */
    public boolean intersect(Rectangle src2, Rectangle dest) {
        try {
            var RESULT = (int) gdk_rectangle_intersect.invokeExact(handle(), src2.handle(), dest.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_rectangle_union = Interop.downcallHandle(
        "gdk_rectangle_union",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Calculates the union of two rectangles.
     * <p>
     * The union of rectangles {@code src1} and {@code src2} is the smallest rectangle which
     * includes both {@code src1} and {@code src2} within it. It is allowed for {@code dest} to be
     * the same as either {@code src1} or {@code src2}.
     * <p>
     * Note that this function does not ignore 'empty' rectangles (ie. with
     * zero width or height).
     */
    public void union(Rectangle src2, Rectangle dest) {
        try {
            gdk_rectangle_union.invokeExact(handle(), src2.handle(), dest.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
