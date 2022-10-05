package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A point with two coordinates.
 */
public class Point extends io.github.jwharm.javagi.ResourceBase {

    public Point(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle graphene_point_alloc = Interop.downcallHandle(
        "graphene_point_alloc",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructAlloc() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) graphene_point_alloc.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Allocates a new {@link Point} structure.
     * <p>
     * The coordinates of the returned point are (0, 0).
     * <p>
     * It's possible to chain this function with graphene_point_init()
     * or graphene_point_init_from_point(), e.g.:
     * <p>
     * <pre>{@code <!-- language="C" -->
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
     * }</pre>
     */
    public static Point alloc() {
        return new Point(constructAlloc());
    }
    
    static final MethodHandle graphene_point_distance = Interop.downcallHandle(
        "graphene_point_distance",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the distance between @a and @b.
     */
    public float distance(Point b, PointerFloat dX, PointerFloat dY) {
        try {
            var RESULT = (float) graphene_point_distance.invokeExact(handle(), b.handle(), dX.handle(), dY.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_point_equal = Interop.downcallHandle(
        "graphene_point_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if the two points @a and @b point to the same
     * coordinates.
     * <p>
     * This function accounts for floating point fluctuations; if
     * you want to control the fuzziness of the match, you can use
     * graphene_point_near() instead.
     */
    public boolean equal(Point b) {
        try {
            var RESULT = (boolean) graphene_point_equal.invokeExact(handle(), b.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_point_free = Interop.downcallHandle(
        "graphene_point_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the resources allocated by graphene_point_alloc().
     */
    public void free() {
        try {
            graphene_point_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_point_init = Interop.downcallHandle(
        "graphene_point_init",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Initializes @p to the given @x and @y coordinates.
     * <p>
     * It's safe to call this function multiple times.
     */
    public Point init(float x, float y) {
        try {
            var RESULT = (MemoryAddress) graphene_point_init.invokeExact(handle(), x, y);
            return new Point(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_point_init_from_point = Interop.downcallHandle(
        "graphene_point_init_from_point",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes @p with the same coordinates of {@code src}.
     */
    public Point initFromPoint(Point src) {
        try {
            var RESULT = (MemoryAddress) graphene_point_init_from_point.invokeExact(handle(), src.handle());
            return new Point(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_point_init_from_vec2 = Interop.downcallHandle(
        "graphene_point_init_from_vec2",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes @p with the coordinates inside the given {@link Vec2}.
     */
    public Point initFromVec2(Vec2 src) {
        try {
            var RESULT = (MemoryAddress) graphene_point_init_from_vec2.invokeExact(handle(), src.handle());
            return new Point(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_point_interpolate = Interop.downcallHandle(
        "graphene_point_interpolate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Linearly interpolates the coordinates of @a and @b using the
     * given {@code factor}.
     */
    public void interpolate(Point b, double factor, Point res) {
        try {
            graphene_point_interpolate.invokeExact(handle(), b.handle(), factor, res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_point_near = Interop.downcallHandle(
        "graphene_point_near",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Checks whether the two points @a and @b are within
     * the threshold of {@code epsilon}.
     */
    public boolean near(Point b, float epsilon) {
        try {
            var RESULT = (boolean) graphene_point_near.invokeExact(handle(), b.handle(), epsilon);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_point_to_vec2 = Interop.downcallHandle(
        "graphene_point_to_vec2",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Stores the coordinates of the given {@link Point} into a
     * {@link Vec2}.
     */
    public void toVec2(Vec2 v) {
        try {
            graphene_point_to_vec2.invokeExact(handle(), v.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_point_zero = Interop.downcallHandle(
        "graphene_point_zero",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a point fixed at (0, 0).
     */
    public static Point zero() {
        try {
            var RESULT = (MemoryAddress) graphene_point_zero.invokeExact();
            return new Point(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
