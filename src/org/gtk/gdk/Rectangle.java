package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>GdkRectangle</code> data type for representing rectangles.
 * <p><code>GdkRectangle</code> is identical to <code>cairo_rectangle_t</code>. Together with Cairo&<code>#8217</code> s<code>cairo_region_t</code> data type, these are the central types for representing
 * sets of pixels.
 * <p>
 * The intersection of two rectangles can be computed with
 * {@link org.gtk.gdk.Rectangle<code>#intersect</code> ; to find the union of two rectangles use
 * {@link org.gtk.gdk.Rectangle<code>#union</code> .
 * <p>
 * The <code>cairo_region_t</code> type provided by Cairo is usually used for managing
 * non-rectangular clipping of graphical operations.
 * 
 * The Graphene library has a number of other data types for regions and
 * volumes in 2D and 3D.
 */
public class Rectangle extends io.github.jwharm.javagi.ResourceBase {

    public Rectangle(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Returns <code>true</code> if @rect contains the point described by @x and @y.
     */
    public boolean containsPoint(int x, int y) {
        var RESULT = gtk_h.gdk_rectangle_contains_point(handle(), x, y);
        return (RESULT != 0);
    }
    
    /**
     * Checks if the two given rectangles are equal.
     */
    public boolean equal(Rectangle rect2) {
        var RESULT = gtk_h.gdk_rectangle_equal(handle(), rect2.handle());
        return (RESULT != 0);
    }
    
    /**
     * Calculates the intersection of two rectangles.
     * 
     * It is allowed for @dest to be the same as either @src1 or @src2.
     * If the rectangles do not intersect, @dest&<code>#8217</code> s width and height is set
     * to 0 and its x and y values are undefined. If you are only interested
     * in whether the rectangles intersect, but not in the intersecting area
     * itself, pass <code>null</code> for @dest.
     */
    public boolean intersect(Rectangle src2, Rectangle dest) {
        var RESULT = gtk_h.gdk_rectangle_intersect(handle(), src2.handle(), dest.handle());
        return (RESULT != 0);
    }
    
    /**
     * Calculates the union of two rectangles.
     * 
     * The union of rectangles @src1 and @src2 is the smallest rectangle which
     * includes both @src1 and @src2 within it. It is allowed for @dest to be
     * the same as either @src1 or @src2.
     * 
     * Note that this function does not ignore &<code>#39</code> empty&<code>#39</code>  rectangles (ie. with
     * zero width or height).
     */
    public void union(Rectangle src2, Rectangle dest) {
        gtk_h.gdk_rectangle_union(handle(), src2.handle(), dest.handle());
    }
    
}
