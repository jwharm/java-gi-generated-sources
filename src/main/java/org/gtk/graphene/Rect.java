package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The location and size of a rectangle region.
 * <p>
 * The width and height of a {@link Rect} can be negative; for instance,
 * a {@link Rect} with an origin of [ 0, 0 ] and a size of [ 10, 10 ] is
 * equivalent to a {@link Rect} with an origin of [ 10, 10 ] and a size
 * of [ -10, -10 ].
 * <p>
 * Application code can normalize rectangles using graphene_rect_normalize();
 * this function will ensure that the width and height of a rectangle are
 * positive values. All functions taking a {@link Rect} as an argument
 * will internally operate on a normalized copy; all functions returning a
 * {@link Rect} will always return a normalized rectangle.
 */
public class Rect extends io.github.jwharm.javagi.ResourceBase {

    public Rect(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle graphene_rect_contains_point = Interop.downcallHandle(
        "graphene_rect_contains_point",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether a {@link Rect} contains the given coordinates.
     */
    public boolean containsPoint(Point p) {
        try {
            var RESULT = (boolean) graphene_rect_contains_point.invokeExact(handle(), p.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_rect_contains_rect = Interop.downcallHandle(
        "graphene_rect_contains_rect",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether a {@link Rect} fully contains the given
     * rectangle.
     */
    public boolean containsRect(Rect b) {
        try {
            var RESULT = (boolean) graphene_rect_contains_rect.invokeExact(handle(), b.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_rect_equal = Interop.downcallHandle(
        "graphene_rect_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the two given rectangle are equal.
     */
    public boolean equal(Rect b) {
        try {
            var RESULT = (boolean) graphene_rect_equal.invokeExact(handle(), b.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_rect_expand = Interop.downcallHandle(
        "graphene_rect_expand",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Expands a {@link Rect} to contain the given {@link Point}.
     */
    public void expand(Point p, Rect res) {
        try {
            graphene_rect_expand.invokeExact(handle(), p.handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_rect_free = Interop.downcallHandle(
        "graphene_rect_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the resources allocated by graphene_rect_alloc().
     */
    public void free() {
        try {
            graphene_rect_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_rect_get_area = Interop.downcallHandle(
        "graphene_rect_get_area",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Compute the area of given normalized rectangle.
     */
    public float getArea() {
        try {
            var RESULT = (float) graphene_rect_get_area.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_rect_get_bottom_left = Interop.downcallHandle(
        "graphene_rect_get_bottom_left",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the coordinates of the bottom-left corner of the given rectangle.
     */
    public void getBottomLeft(Point p) {
        try {
            graphene_rect_get_bottom_left.invokeExact(handle(), p.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_rect_get_bottom_right = Interop.downcallHandle(
        "graphene_rect_get_bottom_right",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the coordinates of the bottom-right corner of the given rectangle.
     */
    public void getBottomRight(Point p) {
        try {
            graphene_rect_get_bottom_right.invokeExact(handle(), p.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_rect_get_center = Interop.downcallHandle(
        "graphene_rect_get_center",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the coordinates of the center of the given rectangle.
     */
    public void getCenter(Point p) {
        try {
            graphene_rect_get_center.invokeExact(handle(), p.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_rect_get_height = Interop.downcallHandle(
        "graphene_rect_get_height",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the normalized height of the given rectangle.
     */
    public float getHeight() {
        try {
            var RESULT = (float) graphene_rect_get_height.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_rect_get_top_left = Interop.downcallHandle(
        "graphene_rect_get_top_left",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the coordinates of the top-left corner of the given rectangle.
     */
    public void getTopLeft(Point p) {
        try {
            graphene_rect_get_top_left.invokeExact(handle(), p.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_rect_get_top_right = Interop.downcallHandle(
        "graphene_rect_get_top_right",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the coordinates of the top-right corner of the given rectangle.
     */
    public void getTopRight(Point p) {
        try {
            graphene_rect_get_top_right.invokeExact(handle(), p.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_rect_get_vertices = Interop.downcallHandle(
        "graphene_rect_get_vertices",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the four vertices of a {@link Rect}.
     */
    public void getVertices(PointerProxy<Vec2> vertices) {
        try {
            graphene_rect_get_vertices.invokeExact(handle(), vertices.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_rect_get_width = Interop.downcallHandle(
        "graphene_rect_get_width",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the normalized width of the given rectangle.
     */
    public float getWidth() {
        try {
            var RESULT = (float) graphene_rect_get_width.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_rect_get_x = Interop.downcallHandle(
        "graphene_rect_get_x",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the normalized X coordinate of the origin of the given
     * rectangle.
     */
    public float getX() {
        try {
            var RESULT = (float) graphene_rect_get_x.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_rect_get_y = Interop.downcallHandle(
        "graphene_rect_get_y",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the normalized Y coordinate of the origin of the given
     * rectangle.
     */
    public float getY() {
        try {
            var RESULT = (float) graphene_rect_get_y.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_rect_init = Interop.downcallHandle(
        "graphene_rect_init",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Initializes the given {@link Rect} with the given values.
     * <p>
     * This function will implicitly normalize the {@link Rect}
     * before returning.
     */
    public Rect init(float x, float y, float width, float height) {
        try {
            var RESULT = (MemoryAddress) graphene_rect_init.invokeExact(handle(), x, y, width, height);
            return new Rect(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_rect_init_from_rect = Interop.downcallHandle(
        "graphene_rect_init_from_rect",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes @r using the given {@code src} rectangle.
     * <p>
     * This function will implicitly normalize the {@link Rect}
     * before returning.
     */
    public Rect initFromRect(Rect src) {
        try {
            var RESULT = (MemoryAddress) graphene_rect_init_from_rect.invokeExact(handle(), src.handle());
            return new Rect(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_rect_inset = Interop.downcallHandle(
        "graphene_rect_inset",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Changes the given rectangle to be smaller, or larger depending on the
     * given inset parameters.
     * <p>
     * To create an inset rectangle, use positive {@code d_x} or {@code d_y} values; to
     * create a larger, encompassing rectangle, use negative {@code d_x} or {@code d_y}
     * values.
     * <p>
     * The origin of the rectangle is offset by {@code d_x} and {@code d_y}, while the size
     * is adjusted by {@code (2 * @d_x, 2 * @d_y)}. If {@code d_x} and {@code d_y} are positive
     * values, the size of the rectangle is decreased; if {@code d_x} and {@code d_y} are
     * negative values, the size of the rectangle is increased.
     * <p>
     * If the size of the resulting inset rectangle has a negative width or
     * height then the size will be set to zero.
     */
    public Rect inset(float dX, float dY) {
        try {
            var RESULT = (MemoryAddress) graphene_rect_inset.invokeExact(handle(), dX, dY);
            return new Rect(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_rect_inset_r = Interop.downcallHandle(
        "graphene_rect_inset_r",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Changes the given rectangle to be smaller, or larger depending on the
     * given inset parameters.
     * <p>
     * To create an inset rectangle, use positive {@code d_x} or {@code d_y} values; to
     * create a larger, encompassing rectangle, use negative {@code d_x} or {@code d_y}
     * values.
     * <p>
     * The origin of the rectangle is offset by {@code d_x} and {@code d_y}, while the size
     * is adjusted by {@code (2 * @d_x, 2 * @d_y)}. If {@code d_x} and {@code d_y} are positive
     * values, the size of the rectangle is decreased; if {@code d_x} and {@code d_y} are
     * negative values, the size of the rectangle is increased.
     * <p>
     * If the size of the resulting inset rectangle has a negative width or
     * height then the size will be set to zero.
     */
    public void insetR(float dX, float dY, Rect res) {
        try {
            graphene_rect_inset_r.invokeExact(handle(), dX, dY, res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_rect_interpolate = Interop.downcallHandle(
        "graphene_rect_interpolate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Linearly interpolates the origin and size of the two given
     * rectangles.
     */
    public void interpolate(Rect b, double factor, Rect res) {
        try {
            graphene_rect_interpolate.invokeExact(handle(), b.handle(), factor, res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_rect_intersection = Interop.downcallHandle(
        "graphene_rect_intersection",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the intersection of the two given rectangles.
     * <p>
     * ![](rectangle-intersection.png)
     * <p>
     * The intersection in the image above is the blue outline.
     * <p>
     * If the two rectangles do not intersect, {@code res} will contain
     * a degenerate rectangle with origin in (0, 0) and a size of 0.
     */
    public boolean intersection(Rect b, Rect res) {
        try {
            var RESULT = (boolean) graphene_rect_intersection.invokeExact(handle(), b.handle(), res.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_rect_normalize = Interop.downcallHandle(
        "graphene_rect_normalize",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Normalizes the passed rectangle.
     * <p>
     * This function ensures that the size of the rectangle is made of
     * positive values, and that the origin is the top-left corner of
     * the rectangle.
     */
    public Rect normalize() {
        try {
            var RESULT = (MemoryAddress) graphene_rect_normalize.invokeExact(handle());
            return new Rect(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_rect_normalize_r = Interop.downcallHandle(
        "graphene_rect_normalize_r",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Normalizes the passed rectangle.
     * <p>
     * This function ensures that the size of the rectangle is made of
     * positive values, and that the origin is in the top-left corner
     * of the rectangle.
     */
    public void normalizeR(Rect res) {
        try {
            graphene_rect_normalize_r.invokeExact(handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_rect_offset = Interop.downcallHandle(
        "graphene_rect_offset",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Offsets the origin by {@code d_x} and {@code d_y}.
     * <p>
     * The size of the rectangle is unchanged.
     */
    public Rect offset(float dX, float dY) {
        try {
            var RESULT = (MemoryAddress) graphene_rect_offset.invokeExact(handle(), dX, dY);
            return new Rect(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_rect_offset_r = Interop.downcallHandle(
        "graphene_rect_offset_r",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Offsets the origin of the given rectangle by {@code d_x} and {@code d_y}.
     * <p>
     * The size of the rectangle is left unchanged.
     */
    public void offsetR(float dX, float dY, Rect res) {
        try {
            graphene_rect_offset_r.invokeExact(handle(), dX, dY, res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_rect_round_extents = Interop.downcallHandle(
        "graphene_rect_round_extents",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Rounds the origin of the given rectangle to its nearest
     * integer value and and recompute the size so that the
     * rectangle is large enough to contain all the conrners
     * of the original rectangle.
     * <p>
     * This function is the equivalent of calling {@code floor} on
     * the coordinates of the origin, and recomputing the size
     * calling {@code ceil} on the bottom-right coordinates.
     * <p>
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
        try {
            graphene_rect_round_extents.invokeExact(handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_rect_scale = Interop.downcallHandle(
        "graphene_rect_scale",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Scales the size and origin of a rectangle horizontaly by {@code s_h},
     * and vertically by {@code s_v}. The result {@code res} is normalized.
     */
    public void scale(float sH, float sV, Rect res) {
        try {
            graphene_rect_scale.invokeExact(handle(), sH, sV, res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_rect_union = Interop.downcallHandle(
        "graphene_rect_union",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the union of the two given rectangles.
     * <p>
     * ![](rectangle-union.png)
     * <p>
     * The union in the image above is the blue outline.
     */
    public void union(Rect b, Rect res) {
        try {
            graphene_rect_union.invokeExact(handle(), b.handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_rect_alloc = Interop.downcallHandle(
        "graphene_rect_alloc",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Allocates a new {@link Rect}.
     * <p>
     * The contents of the returned rectangle are undefined.
     */
    public static Rect alloc() {
        try {
            var RESULT = (MemoryAddress) graphene_rect_alloc.invokeExact();
            return new Rect(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_rect_zero = Interop.downcallHandle(
        "graphene_rect_zero",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a degenerate rectangle with origin fixed at (0, 0) and
     * a size of 0, 0.
     */
    public static Rect zero() {
        try {
            var RESULT = (MemoryAddress) graphene_rect_zero.invokeExact();
            return new Rect(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
