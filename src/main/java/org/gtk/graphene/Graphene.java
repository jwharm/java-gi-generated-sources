package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public final class Graphene {
    
    public static final double PI = 3.141593d;

    public static final double PI_2 = 1.570796d;

    public static final int VEC2_LEN = 2;

    public static final int VEC3_LEN = 3;

    public static final int VEC4_LEN = 4;

    static final MethodHandle graphene_box_empty = Interop.downcallHandle(
        "graphene_box_empty",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * A degenerate {@link Box} that can only be expanded.
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     */
    public static Box boxEmpty() {
        try {
            var RESULT = (MemoryAddress) graphene_box_empty.invokeExact();
            return new Box(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_box_infinite = Interop.downcallHandle(
        "graphene_box_infinite",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * A degenerate {@link Box} that cannot be expanded.
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     */
    public static Box boxInfinite() {
        try {
            var RESULT = (MemoryAddress) graphene_box_infinite.invokeExact();
            return new Box(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_box_minus_one = Interop.downcallHandle(
        "graphene_box_minus_one",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * A {@link Box} with the minimum vertex set at (-1, -1, -1) and the
     * maximum vertex set at (0, 0, 0).
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     */
    public static Box boxMinusOne() {
        try {
            var RESULT = (MemoryAddress) graphene_box_minus_one.invokeExact();
            return new Box(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_box_one = Interop.downcallHandle(
        "graphene_box_one",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * A {@link Box} with the minimum vertex set at (0, 0, 0) and the
     * maximum vertex set at (1, 1, 1).
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     */
    public static Box boxOne() {
        try {
            var RESULT = (MemoryAddress) graphene_box_one.invokeExact();
            return new Box(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_box_one_minus_one = Interop.downcallHandle(
        "graphene_box_one_minus_one",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * A {@link Box} with the minimum vertex set at (-1, -1, -1) and the
     * maximum vertex set at (1, 1, 1).
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     */
    public static Box boxOneMinusOne() {
        try {
            var RESULT = (MemoryAddress) graphene_box_one_minus_one.invokeExact();
            return new Box(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_box_zero = Interop.downcallHandle(
        "graphene_box_zero",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * A {@link Box} with both the minimum and maximum vertices set at (0, 0, 0).
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     */
    public static Box boxZero() {
        try {
            var RESULT = (MemoryAddress) graphene_box_zero.invokeExact();
            return new Box(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_point3d_zero = Interop.downcallHandle(
        "graphene_point3d_zero",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves a constant point with all three coordinates set to 0.
     */
    public static Point3D point3dZero() {
        try {
            var RESULT = (MemoryAddress) graphene_point3d_zero.invokeExact();
            return new Point3D(Refcounted.get(RESULT, false));
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
    public static Point pointZero() {
        try {
            var RESULT = (MemoryAddress) graphene_point_zero.invokeExact();
            return new Point(Refcounted.get(RESULT, false));
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
    public static Rect rectAlloc() {
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
    public static Rect rectZero() {
        try {
            var RESULT = (MemoryAddress) graphene_rect_zero.invokeExact();
            return new Rect(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_size_zero = Interop.downcallHandle(
        "graphene_size_zero",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * A constant pointer to a zero {@link Size}, useful for
     * equality checks and interpolations.
     */
    public static Size sizeZero() {
        try {
            var RESULT = (MemoryAddress) graphene_size_zero.invokeExact();
            return new Size(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec2_one = Interop.downcallHandle(
        "graphene_vec2_one",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves a constant vector with (1, 1) components.
     */
    public static Vec2 vec2One() {
        try {
            var RESULT = (MemoryAddress) graphene_vec2_one.invokeExact();
            return new Vec2(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec2_x_axis = Interop.downcallHandle(
        "graphene_vec2_x_axis",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves a constant vector with (1, 0) components.
     */
    public static Vec2 vec2XAxis() {
        try {
            var RESULT = (MemoryAddress) graphene_vec2_x_axis.invokeExact();
            return new Vec2(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec2_y_axis = Interop.downcallHandle(
        "graphene_vec2_y_axis",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves a constant vector with (0, 1) components.
     */
    public static Vec2 vec2YAxis() {
        try {
            var RESULT = (MemoryAddress) graphene_vec2_y_axis.invokeExact();
            return new Vec2(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec2_zero = Interop.downcallHandle(
        "graphene_vec2_zero",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves a constant vector with (0, 0) components.
     */
    public static Vec2 vec2Zero() {
        try {
            var RESULT = (MemoryAddress) graphene_vec2_zero.invokeExact();
            return new Vec2(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec3_one = Interop.downcallHandle(
        "graphene_vec3_one",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Provides a constant pointer to a vector with three components,
     * all sets to 1.
     */
    public static Vec3 vec3One() {
        try {
            var RESULT = (MemoryAddress) graphene_vec3_one.invokeExact();
            return new Vec3(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec3_x_axis = Interop.downcallHandle(
        "graphene_vec3_x_axis",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Provides a constant pointer to a vector with three components
     * with values set to (1, 0, 0).
     */
    public static Vec3 vec3XAxis() {
        try {
            var RESULT = (MemoryAddress) graphene_vec3_x_axis.invokeExact();
            return new Vec3(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec3_y_axis = Interop.downcallHandle(
        "graphene_vec3_y_axis",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Provides a constant pointer to a vector with three components
     * with values set to (0, 1, 0).
     */
    public static Vec3 vec3YAxis() {
        try {
            var RESULT = (MemoryAddress) graphene_vec3_y_axis.invokeExact();
            return new Vec3(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec3_z_axis = Interop.downcallHandle(
        "graphene_vec3_z_axis",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Provides a constant pointer to a vector with three components
     * with values set to (0, 0, 1).
     */
    public static Vec3 vec3ZAxis() {
        try {
            var RESULT = (MemoryAddress) graphene_vec3_z_axis.invokeExact();
            return new Vec3(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec3_zero = Interop.downcallHandle(
        "graphene_vec3_zero",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Provides a constant pointer to a vector with three components,
     * all sets to 0.
     */
    public static Vec3 vec3Zero() {
        try {
            var RESULT = (MemoryAddress) graphene_vec3_zero.invokeExact();
            return new Vec3(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec4_one = Interop.downcallHandle(
        "graphene_vec4_one",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves a pointer to a {@link Vec4} with all its
     * components set to 1.
     */
    public static Vec4 vec4One() {
        try {
            var RESULT = (MemoryAddress) graphene_vec4_one.invokeExact();
            return new Vec4(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec4_w_axis = Interop.downcallHandle(
        "graphene_vec4_w_axis",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves a pointer to a {@link Vec4} with its
     * components set to (0, 0, 0, 1).
     */
    public static Vec4 vec4WAxis() {
        try {
            var RESULT = (MemoryAddress) graphene_vec4_w_axis.invokeExact();
            return new Vec4(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec4_x_axis = Interop.downcallHandle(
        "graphene_vec4_x_axis",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves a pointer to a {@link Vec4} with its
     * components set to (1, 0, 0, 0).
     */
    public static Vec4 vec4XAxis() {
        try {
            var RESULT = (MemoryAddress) graphene_vec4_x_axis.invokeExact();
            return new Vec4(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec4_y_axis = Interop.downcallHandle(
        "graphene_vec4_y_axis",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves a pointer to a {@link Vec4} with its
     * components set to (0, 1, 0, 0).
     */
    public static Vec4 vec4YAxis() {
        try {
            var RESULT = (MemoryAddress) graphene_vec4_y_axis.invokeExact();
            return new Vec4(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec4_z_axis = Interop.downcallHandle(
        "graphene_vec4_z_axis",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves a pointer to a {@link Vec4} with its
     * components set to (0, 0, 1, 0).
     */
    public static Vec4 vec4ZAxis() {
        try {
            var RESULT = (MemoryAddress) graphene_vec4_z_axis.invokeExact();
            return new Vec4(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec4_zero = Interop.downcallHandle(
        "graphene_vec4_zero",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves a pointer to a {@link Vec4} with all its
     * components set to 0.
     */
    public static Vec4 vec4Zero() {
        try {
            var RESULT = (MemoryAddress) graphene_vec4_zero.invokeExact();
            return new Vec4(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
