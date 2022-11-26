package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global Graphene namespace.
 */
public final class Graphene {
    
    static {
        System.loadLibrary("graphene-1.0");
    }
    
    @ApiStatus.Internal static void javagi$ensureInitialized() {}
    
    public static final double PI = 3.141593d;
    
    public static final double PI_2 = 1.570796d;
    
    /**
     * Evaluates to the number of components of a {@link Vec2}.
     * <p>
     * This symbol is useful when declaring a C array of floating
     * point values to be used with graphene_vec2_init_from_float() and
     * graphene_vec2_to_float(), e.g.
     * <pre>{@code 
     *   float v[GRAPHENE_VEC2_LEN];
     * 
     *   // vec is defined elsewhere
     *   graphene_vec2_to_float (&vec, v);
     * 
     *   for (int i = 0; i < GRAPHENE_VEC2_LEN; i++)
     *     fprintf (stdout, "component %d: %g\\n", i, v[i]);
     * }</pre>
     */
    public static final int VEC2_LEN = 2;
    
    /**
     * Evaluates to the number of components of a {@link Vec3}.
     * <p>
     * This symbol is useful when declaring a C array of floating
     * point values to be used with graphene_vec3_init_from_float() and
     * graphene_vec3_to_float(), e.g.
     * <pre>{@code 
     *   float v[GRAPHENE_VEC3_LEN];
     * 
     *   // vec is defined elsewhere
     *   graphene_vec3_to_float (&vec, v);
     * 
     *   for (int i = 0; i < GRAPHENE_VEC2_LEN; i++)
     *     fprintf (stdout, "component %d: %g\\n", i, v[i]);
     * }</pre>
     */
    public static final int VEC3_LEN = 3;
    
    /**
     * Evaluates to the number of components of a {@link Vec4}.
     * <p>
     * This symbol is useful when declaring a C array of floating
     * point values to be used with graphene_vec4_init_from_float() and
     * graphene_vec4_to_float(), e.g.
     * <pre>{@code 
     *   float v[GRAPHENE_VEC4_LEN];
     * 
     *   // vec is defined elsewhere
     *   graphene_vec4_to_float (&vec, v);
     * 
     *   for (int i = 0; i < GRAPHENE_VEC4_LEN; i++)
     *     fprintf (stdout, "component %d: %g\\n", i, v[i]);
     * }</pre>
     */
    public static final int VEC4_LEN = 4;
    
    /**
     * A degenerate {@link Box} that can only be expanded.
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     * @return a {@link Box}
     */
    public static @NotNull org.gtk.graphene.Box boxEmpty() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_box_empty.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Box(RESULT, Ownership.NONE);
    }
    
    /**
     * A degenerate {@link Box} that cannot be expanded.
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     * @return a {@link Box}
     */
    public static @NotNull org.gtk.graphene.Box boxInfinite() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_box_infinite.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Box(RESULT, Ownership.NONE);
    }
    
    /**
     * A {@link Box} with the minimum vertex set at (-1, -1, -1) and the
     * maximum vertex set at (0, 0, 0).
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     * @return a {@link Box}
     */
    public static @NotNull org.gtk.graphene.Box boxMinusOne() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_box_minus_one.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Box(RESULT, Ownership.NONE);
    }
    
    /**
     * A {@link Box} with the minimum vertex set at (0, 0, 0) and the
     * maximum vertex set at (1, 1, 1).
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     * @return a {@link Box}
     */
    public static @NotNull org.gtk.graphene.Box boxOne() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_box_one.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Box(RESULT, Ownership.NONE);
    }
    
    /**
     * A {@link Box} with the minimum vertex set at (-1, -1, -1) and the
     * maximum vertex set at (1, 1, 1).
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     * @return a {@link Box}
     */
    public static @NotNull org.gtk.graphene.Box boxOneMinusOne() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_box_one_minus_one.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Box(RESULT, Ownership.NONE);
    }
    
    /**
     * A {@link Box} with both the minimum and maximum vertices set at (0, 0, 0).
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     * @return a {@link Box}
     */
    public static @NotNull org.gtk.graphene.Box boxZero() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_box_zero.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Box(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves a constant point with all three coordinates set to 0.
     * @return a zero point
     */
    public static @NotNull org.gtk.graphene.Point3D point3dZero() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_point3d_zero.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Point3D(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns a point fixed at (0, 0).
     * @return a fixed point
     */
    public static @NotNull org.gtk.graphene.Point pointZero() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_point_zero.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Point(RESULT, Ownership.NONE);
    }
    
    /**
     * Allocates a new {@link Rect}.
     * <p>
     * The contents of the returned rectangle are undefined.
     * @return the newly allocated rectangle
     */
    public static @NotNull org.gtk.graphene.Rect rectAlloc() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_rect_alloc.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Rect(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns a degenerate rectangle with origin fixed at (0, 0) and
     * a size of 0, 0.
     * @return a fixed rectangle
     */
    public static @NotNull org.gtk.graphene.Rect rectZero() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_rect_zero.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Rect(RESULT, Ownership.NONE);
    }
    
    /**
     * A constant pointer to a zero {@link Size}, useful for
     * equality checks and interpolations.
     * @return a constant size
     */
    public static @NotNull org.gtk.graphene.Size sizeZero() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_size_zero.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Size(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves a constant vector with (1, 1) components.
     * @return the one vector
     */
    public static @NotNull org.gtk.graphene.Vec2 vec2One() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_vec2_one.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Vec2(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves a constant vector with (1, 0) components.
     * @return the X axis vector
     */
    public static @NotNull org.gtk.graphene.Vec2 vec2XAxis() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_vec2_x_axis.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Vec2(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves a constant vector with (0, 1) components.
     * @return the Y axis vector
     */
    public static @NotNull org.gtk.graphene.Vec2 vec2YAxis() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_vec2_y_axis.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Vec2(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves a constant vector with (0, 0) components.
     * @return the zero vector
     */
    public static @NotNull org.gtk.graphene.Vec2 vec2Zero() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_vec2_zero.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Vec2(RESULT, Ownership.NONE);
    }
    
    /**
     * Provides a constant pointer to a vector with three components,
     * all sets to 1.
     * @return a constant vector
     */
    public static @NotNull org.gtk.graphene.Vec3 vec3One() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_vec3_one.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Vec3(RESULT, Ownership.NONE);
    }
    
    /**
     * Provides a constant pointer to a vector with three components
     * with values set to (1, 0, 0).
     * @return a constant vector
     */
    public static @NotNull org.gtk.graphene.Vec3 vec3XAxis() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_vec3_x_axis.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Vec3(RESULT, Ownership.NONE);
    }
    
    /**
     * Provides a constant pointer to a vector with three components
     * with values set to (0, 1, 0).
     * @return a constant vector
     */
    public static @NotNull org.gtk.graphene.Vec3 vec3YAxis() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_vec3_y_axis.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Vec3(RESULT, Ownership.NONE);
    }
    
    /**
     * Provides a constant pointer to a vector with three components
     * with values set to (0, 0, 1).
     * @return a constant vector
     */
    public static @NotNull org.gtk.graphene.Vec3 vec3ZAxis() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_vec3_z_axis.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Vec3(RESULT, Ownership.NONE);
    }
    
    /**
     * Provides a constant pointer to a vector with three components,
     * all sets to 0.
     * @return a constant vector
     */
    public static @NotNull org.gtk.graphene.Vec3 vec3Zero() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_vec3_zero.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Vec3(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves a pointer to a {@link Vec4} with all its
     * components set to 1.
     * @return a constant vector
     */
    public static @NotNull org.gtk.graphene.Vec4 vec4One() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_vec4_one.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Vec4(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves a pointer to a {@link Vec4} with its
     * components set to (0, 0, 0, 1).
     * @return a constant vector
     */
    public static @NotNull org.gtk.graphene.Vec4 vec4WAxis() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_vec4_w_axis.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Vec4(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves a pointer to a {@link Vec4} with its
     * components set to (1, 0, 0, 0).
     * @return a constant vector
     */
    public static @NotNull org.gtk.graphene.Vec4 vec4XAxis() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_vec4_x_axis.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Vec4(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves a pointer to a {@link Vec4} with its
     * components set to (0, 1, 0, 0).
     * @return a constant vector
     */
    public static @NotNull org.gtk.graphene.Vec4 vec4YAxis() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_vec4_y_axis.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Vec4(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves a pointer to a {@link Vec4} with its
     * components set to (0, 0, 1, 0).
     * @return a constant vector
     */
    public static @NotNull org.gtk.graphene.Vec4 vec4ZAxis() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_vec4_z_axis.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Vec4(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves a pointer to a {@link Vec4} with all its
     * components set to 0.
     * @return a constant vector
     */
    public static @NotNull org.gtk.graphene.Vec4 vec4Zero() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_vec4_zero.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Vec4(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle graphene_box_empty = Interop.downcallHandle(
            "graphene_box_empty",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_box_infinite = Interop.downcallHandle(
            "graphene_box_infinite",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_box_minus_one = Interop.downcallHandle(
            "graphene_box_minus_one",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_box_one = Interop.downcallHandle(
            "graphene_box_one",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_box_one_minus_one = Interop.downcallHandle(
            "graphene_box_one_minus_one",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_box_zero = Interop.downcallHandle(
            "graphene_box_zero",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_point3d_zero = Interop.downcallHandle(
            "graphene_point3d_zero",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_point_zero = Interop.downcallHandle(
            "graphene_point_zero",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_rect_alloc = Interop.downcallHandle(
            "graphene_rect_alloc",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_rect_zero = Interop.downcallHandle(
            "graphene_rect_zero",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_size_zero = Interop.downcallHandle(
            "graphene_size_zero",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec2_one = Interop.downcallHandle(
            "graphene_vec2_one",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec2_x_axis = Interop.downcallHandle(
            "graphene_vec2_x_axis",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec2_y_axis = Interop.downcallHandle(
            "graphene_vec2_y_axis",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec2_zero = Interop.downcallHandle(
            "graphene_vec2_zero",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec3_one = Interop.downcallHandle(
            "graphene_vec3_one",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec3_x_axis = Interop.downcallHandle(
            "graphene_vec3_x_axis",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec3_y_axis = Interop.downcallHandle(
            "graphene_vec3_y_axis",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec3_z_axis = Interop.downcallHandle(
            "graphene_vec3_z_axis",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec3_zero = Interop.downcallHandle(
            "graphene_vec3_zero",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec4_one = Interop.downcallHandle(
            "graphene_vec4_one",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec4_w_axis = Interop.downcallHandle(
            "graphene_vec4_w_axis",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec4_x_axis = Interop.downcallHandle(
            "graphene_vec4_x_axis",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec4_y_axis = Interop.downcallHandle(
            "graphene_vec4_y_axis",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec4_z_axis = Interop.downcallHandle(
            "graphene_vec4_z_axis",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec4_zero = Interop.downcallHandle(
            "graphene_vec4_zero",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }
}
