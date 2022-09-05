package org.gtk.graphene;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The location and size of a rectangle region.
 * 
 * The width and height of a #graphene_rect_t can be negative; for instance,
 * a #graphene_rect_t with an origin of [ 0, 0 ] and a size of [ 10, 10 ] is
 * equivalent to a #graphene_rect_t with an origin of [ 10, 10 ] and a size
 * of [ -10, -10 ].
 * 
 * Application code can normalize rectangles using graphene_rect_normalize();
 * this function will ensure that the width and height of a rectangle are
 * positive values. All functions taking a #graphene_rect_t as an argument
 * will internally operate on a normalized copy; all functions returning a
 * #graphene_rect_t will always return a normalized rectangle.
 */
public class Rect extends io.github.jwharm.javagi.interop.ResourceBase {

    public Rect(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Checks whether a #graphene_rect_t contains the given coordinates.
     */
    public boolean containsPoint(Point p) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_rect_contains_point(HANDLE(), p.HANDLE());
        return RESULT;
    }
    
    /**
     * Checks whether a #graphene_rect_t fully contains the given
     * rectangle.
     */
    public boolean containsRect(Rect b) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_rect_contains_rect(HANDLE(), b.HANDLE());
        return RESULT;
    }
    
    /**
     * Checks whether the two given rectangle are equal.
     */
    public boolean equal(Rect b) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_rect_equal(HANDLE(), b.HANDLE());
        return RESULT;
    }
    
    /**
     * Expands a #graphene_rect_t to contain the given #graphene_point_t.
     */
    public void expand(Point p, Rect res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_rect_expand(HANDLE(), p.HANDLE(), res.HANDLE());
    }
    
    /**
     * Frees the resources allocated by graphene_rect_alloc().
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_rect_free(HANDLE());
    }
    
    /**
     * Compute the area of given normalized rectangle.
     */
    public float getArea() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_rect_get_area(HANDLE());
        return RESULT;
    }
    
    /**
     * Retrieves the coordinates of the bottom-left corner of the given rectangle.
     */
    public void getBottomLeft(Point p) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_rect_get_bottom_left(HANDLE(), p.HANDLE());
    }
    
    /**
     * Retrieves the coordinates of the bottom-right corner of the given rectangle.
     */
    public void getBottomRight(Point p) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_rect_get_bottom_right(HANDLE(), p.HANDLE());
    }
    
    /**
     * Retrieves the coordinates of the center of the given rectangle.
     */
    public void getCenter(Point p) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_rect_get_center(HANDLE(), p.HANDLE());
    }
    
    /**
     * Retrieves the normalized height of the given rectangle.
     */
    public float getHeight() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_rect_get_height(HANDLE());
        return RESULT;
    }
    
    /**
     * Retrieves the coordinates of the top-left corner of the given rectangle.
     */
    public void getTopLeft(Point p) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_rect_get_top_left(HANDLE(), p.HANDLE());
    }
    
    /**
     * Retrieves the coordinates of the top-right corner of the given rectangle.
     */
    public void getTopRight(Point p) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_rect_get_top_right(HANDLE(), p.HANDLE());
    }
    
    /**
     * Computes the four vertices of a #graphene_rect_t.
     */
    public void getVertices(Vec2[] vertices) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_rect_get_vertices(HANDLE(), Interop.allocateNativeArray(vertices));
    }
    
    /**
     * Retrieves the normalized width of the given rectangle.
     */
    public float getWidth() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_rect_get_width(HANDLE());
        return RESULT;
    }
    
    /**
     * Retrieves the normalized X coordinate of the origin of the given
     * rectangle.
     */
    public float getX() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_rect_get_x(HANDLE());
        return RESULT;
    }
    
    /**
     * Retrieves the normalized Y coordinate of the origin of the given
     * rectangle.
     */
    public float getY() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_rect_get_y(HANDLE());
        return RESULT;
    }
    
    /**
     * Initializes the given #graphene_rect_t with the given values.
     * 
     * This function will implicitly normalize the #graphene_rect_t
     * before returning.
     */
    public Rect init(float x, float y, float width, float height) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_rect_init(HANDLE(), x, y, width, height);
        return new Rect(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Initializes @r using the given @src rectangle.
     * 
     * This function will implicitly normalize the #graphene_rect_t
     * before returning.
     */
    public Rect initFromRect(Rect src) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_rect_init_from_rect(HANDLE(), src.HANDLE());
        return new Rect(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Changes the given rectangle to be smaller, or larger depending on the
     * given inset parameters.
     * 
     * To create an inset rectangle, use positive @d_x or @d_y values; to
     * create a larger, encompassing rectangle, use negative @d_x or @d_y
     * values.
     * 
     * The origin of the rectangle is offset by @d_x and @d_y, while the size
     * is adjusted by `(2 * @d_x, 2 * @d_y)`. If @d_x and @d_y are positive
     * values, the size of the rectangle is decreased; if @d_x and @d_y are
     * negative values, the size of the rectangle is increased.
     * 
     * If the size of the resulting inset rectangle has a negative width or
     * height then the size will be set to zero.
     */
    public Rect inset(float dX, float dY) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_rect_inset(HANDLE(), dX, dY);
        return new Rect(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Changes the given rectangle to be smaller, or larger depending on the
     * given inset parameters.
     * 
     * To create an inset rectangle, use positive @d_x or @d_y values; to
     * create a larger, encompassing rectangle, use negative @d_x or @d_y
     * values.
     * 
     * The origin of the rectangle is offset by @d_x and @d_y, while the size
     * is adjusted by `(2 * @d_x, 2 * @d_y)`. If @d_x and @d_y are positive
     * values, the size of the rectangle is decreased; if @d_x and @d_y are
     * negative values, the size of the rectangle is increased.
     * 
     * If the size of the resulting inset rectangle has a negative width or
     * height then the size will be set to zero.
     */
    public void insetR(float dX, float dY, Rect res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_rect_inset_r(HANDLE(), dX, dY, res.HANDLE());
    }
    
    /**
     * Linearly interpolates the origin and size of the two given
     * rectangles.
     */
    public void interpolate(Rect b, double factor, Rect res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_rect_interpolate(HANDLE(), b.HANDLE(), factor, res.HANDLE());
    }
    
    /**
     * Computes the intersection of the two given rectangles.
     * 
     * ![](rectangle-intersection.png)
     * 
     * The intersection in the image above is the blue outline.
     * 
     * If the two rectangles do not intersect, @res will contain
     * a degenerate rectangle with origin in (0, 0) and a size of 0.
     */
    public boolean intersection(Rect b, Rect res) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_rect_intersection(HANDLE(), b.HANDLE(), res.HANDLE());
        return RESULT;
    }
    
    /**
     * Normalizes the passed rectangle.
     * 
     * This function ensures that the size of the rectangle is made of
     * positive values, and that the origin is the top-left corner of
     * the rectangle.
     */
    public Rect normalize() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_rect_normalize(HANDLE());
        return new Rect(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Normalizes the passed rectangle.
     * 
     * This function ensures that the size of the rectangle is made of
     * positive values, and that the origin is in the top-left corner
     * of the rectangle.
     */
    public void normalizeR(Rect res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_rect_normalize_r(HANDLE(), res.HANDLE());
    }
    
    /**
     * Offsets the origin by @d_x and @d_y.
     * 
     * The size of the rectangle is unchanged.
     */
    public Rect offset(float dX, float dY) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_rect_offset(HANDLE(), dX, dY);
        return new Rect(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Offsets the origin of the given rectangle by @d_x and @d_y.
     * 
     * The size of the rectangle is left unchanged.
     */
    public void offsetR(float dX, float dY, Rect res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_rect_offset_r(HANDLE(), dX, dY, res.HANDLE());
    }
    
    /**
     * Rounds the origin of the given rectangle to its nearest
     * integer value and and recompute the size so that the
     * rectangle is large enough to contain all the conrners
     * of the original rectangle.
     * 
     * This function is the equivalent of calling `floor` on
     * the coordinates of the origin, and recomputing the size
     * calling `ceil` on the bottom-right coordinates.
     * 
     * If you want to be sure that the rounded rectangle
     * completely covers the area that was covered by the
     * original rectangle — i.e. you want to cover the area
     * including all its corners — this function will make sure
     * that the size is recomputed taking into account the ceiling
     * of the coordinates of the bottom-right corner.
     * If the difference between the original coordinates and the
     * coordinates of the rounded rectangle is greater than the
     * difference between the original size and and the rounded
     * size, then the move of the origin would not be compensated
     * by a move in the anti-origin, leaving the corners of the
     * original rectangle outside the rounded one.
     */
    public void roundExtents(Rect res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_rect_round_extents(HANDLE(), res.HANDLE());
    }
    
    /**
     * Scales the size and origin of a rectangle horizontaly by @s_h,
     * and vertically by @s_v. The result @res is normalized.
     */
    public void scale(float sH, float sV, Rect res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_rect_scale(HANDLE(), sH, sV, res.HANDLE());
    }
    
    /**
     * Computes the union of the two given rectangles.
     * 
     * ![](rectangle-union.png)
     * 
     * The union in the image above is the blue outline.
     */
    public void union(Rect b, Rect res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_rect_union(HANDLE(), b.HANDLE(), res.HANDLE());
    }
    
}