package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GdkRectangle` data type for representing rectangles.
 * 
 * `GdkRectangle` is identical to `cairo_rectangle_t`. Together with Cairo’s
 * `cairo_region_t` data type, these are the central types for representing
 * sets of pixels.
 * 
 * The intersection of two rectangles can be computed with
 * [method@Gdk.Rectangle.intersect]; to find the union of two rectangles use
 * [method@Gdk.Rectangle.union].
 * 
 * The `cairo_region_t` type provided by Cairo is usually used for managing
 * non-rectangular clipping of graphical operations.
 * 
 * The Graphene library has a number of other data types for regions and
 * volumes in 2D and 3D.
 */
public class Rectangle extends io.github.jwharm.javagi.interop.ResourceBase {

    public Rectangle(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Returns %TRUE if @rect contains the point described by @x and @y.
     */
    public boolean containsPoint(int x, int y) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_rectangle_contains_point(HANDLE(), x, y);
        return (RESULT != 0);
    }
    
    /**
     * Checks if the two given rectangles are equal.
     */
    public boolean equal(Rectangle rect2) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_rectangle_equal(HANDLE(), rect2.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Calculates the intersection of two rectangles.
     * 
     * It is allowed for @dest to be the same as either @src1 or @src2.
     * If the rectangles do not intersect, @dest’s width and height is set
     * to 0 and its x and y values are undefined. If you are only interested
     * in whether the rectangles intersect, but not in the intersecting area
     * itself, pass %NULL for @dest.
     */
    public boolean intersect(Rectangle src2, Rectangle dest) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_rectangle_intersect(HANDLE(), src2.HANDLE(), dest.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Calculates the union of two rectangles.
     * 
     * The union of rectangles @src1 and @src2 is the smallest rectangle which
     * includes both @src1 and @src2 within it. It is allowed for @dest to be
     * the same as either @src1 or @src2.
     * 
     * Note that this function does not ignore 'empty' rectangles (ie. with
     * zero width or height).
     */
    public void union(Rectangle src2, Rectangle dest) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_rectangle_union(HANDLE(), src2.HANDLE(), dest.HANDLE());
    }
    
}
