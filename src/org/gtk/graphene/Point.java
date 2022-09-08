package org.gtk.graphene;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A point with two coordinates.
 */
public class Point extends io.github.jwharm.javagi.interop.ResourceBase {

    public Point(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Allocates a new #graphene_point_t structure.
     * 
     * The coordinates of the returned point are (0, 0).
     * 
     * It's possible to chain this function with graphene_point_init()
     * or graphene_point_init_from_point(), e.g.:
     * 
     * |[<!-- language="C" -->
     *   graphene_point_t *
     *   point_new (float x, float y)
     *   {
     *     return graphene_point_init (graphene_point_alloc (), x, y);
     *   }
     * 
     *   graphene_point_t *
     *   point_copy (const graphene_point_t *p)
     *   {
     *     return graphene_point_init_from_point (graphene_point_alloc (), p);
     *   }
     * ]|
     */
    public Point() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_point_alloc(), true));
    }
    
    /**
     * Checks if the two points @a and @b point to the same
     * coordinates.
     * 
     * This function accounts for floating point fluctuations; if
     * you want to control the fuzziness of the match, you can use
     * graphene_point_near() instead.
     */
    public boolean equal(Point b) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_point_equal(HANDLE(), b.HANDLE());
        return RESULT;
    }
    
    /**
     * Frees the resources allocated by graphene_point_alloc().
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_point_free(HANDLE());
    }
    
    /**
     * Initializes @p to the given @x and @y coordinates.
     * 
     * It's safe to call this function multiple times.
     */
    public Point init(float x, float y) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_point_init(HANDLE(), x, y);
        return new Point(References.get(RESULT, false));
    }
    
    /**
     * Initializes @p with the same coordinates of @src.
     */
    public Point initFromPoint(Point src) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_point_init_from_point(HANDLE(), src.HANDLE());
        return new Point(References.get(RESULT, false));
    }
    
    /**
     * Initializes @p with the coordinates inside the given #graphene_vec2_t.
     */
    public Point initFromVec2(Vec2 src) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_point_init_from_vec2(HANDLE(), src.HANDLE());
        return new Point(References.get(RESULT, false));
    }
    
    /**
     * Linearly interpolates the coordinates of @a and @b using the
     * given @factor.
     */
    public void interpolate(Point b, double factor, Point res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_point_interpolate(HANDLE(), b.HANDLE(), factor, res.HANDLE());
    }
    
    /**
     * Checks whether the two points @a and @b are within
     * the threshold of @epsilon.
     */
    public boolean near(Point b, float epsilon) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_point_near(HANDLE(), b.HANDLE(), epsilon);
        return RESULT;
    }
    
    /**
     * Stores the coordinates of the given #graphene_point_t into a
     * #graphene_vec2_t.
     */
    public void toVec2(Vec2 v) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_point_to_vec2(HANDLE(), v.HANDLE());
    }
    
}
