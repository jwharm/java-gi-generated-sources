package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A point with two coordinates.
 */
public class Point extends io.github.jwharm.javagi.ResourceBase {

    public Point(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle graphene_point_alloc = Interop.downcallHandle(
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
    
    private static final MethodHandle graphene_point_distance = Interop.downcallHandle(
        "graphene_point_distance",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the distance between @a and @b.
     */
    public float distance(@NotNull Point b, @NotNull Out<Float> dX, @NotNull Out<Float> dY) {
        MemorySegment dXPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        MemorySegment dYPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        float RESULT;
        try {
            RESULT = (float) graphene_point_distance.invokeExact(handle(), b.handle(), (Addressable) dXPOINTER.address(), (Addressable) dYPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        dX.set(dXPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
        dY.set(dYPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
        return RESULT;
    }
    
    private static final MethodHandle graphene_point_equal = Interop.downcallHandle(
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
    public boolean equal(@NotNull Point b) {
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_point_equal.invokeExact(handle(), b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_point_free = Interop.downcallHandle(
        "graphene_point_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the resources allocated by graphene_point_alloc().
     */
    public @NotNull void free() {
        try {
            graphene_point_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle graphene_point_init = Interop.downcallHandle(
        "graphene_point_init",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Initializes @p to the given @x and @y coordinates.
     * <p>
     * It's safe to call this function multiple times.
     */
    public @NotNull Point init(@NotNull float x, @NotNull float y) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_point_init.invokeExact(handle(), x, y);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Point(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_point_init_from_point = Interop.downcallHandle(
        "graphene_point_init_from_point",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes @p with the same coordinates of {@code src}.
     */
    public @NotNull Point initFromPoint(@NotNull Point src) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_point_init_from_point.invokeExact(handle(), src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Point(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_point_init_from_vec2 = Interop.downcallHandle(
        "graphene_point_init_from_vec2",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes @p with the coordinates inside the given {@link Vec2}.
     */
    public @NotNull Point initFromVec2(@NotNull Vec2 src) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_point_init_from_vec2.invokeExact(handle(), src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Point(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_point_interpolate = Interop.downcallHandle(
        "graphene_point_interpolate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Linearly interpolates the coordinates of @a and @b using the
     * given {@code factor}.
     */
    public @NotNull void interpolate(@NotNull Point b, @NotNull double factor, @NotNull Out<Point> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_point_interpolate.invokeExact(handle(), b.handle(), factor, (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Point(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_point_near = Interop.downcallHandle(
        "graphene_point_near",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Checks whether the two points @a and @b are within
     * the threshold of {@code epsilon}.
     */
    public boolean near(@NotNull Point b, @NotNull float epsilon) {
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_point_near.invokeExact(handle(), b.handle(), epsilon);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_point_to_vec2 = Interop.downcallHandle(
        "graphene_point_to_vec2",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Stores the coordinates of the given {@link Point} into a
     * {@link Vec2}.
     */
    public @NotNull void toVec2(@NotNull Out<Vec2> v) {
        MemorySegment vPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_point_to_vec2.invokeExact(handle(), (Addressable) vPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        v.set(new Vec2(Refcounted.get(vPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_point_zero = Interop.downcallHandle(
        "graphene_point_zero",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a point fixed at (0, 0).
     */
    public static @NotNull Point zero() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_point_zero.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Point(Refcounted.get(RESULT, false));
    }
    
}
