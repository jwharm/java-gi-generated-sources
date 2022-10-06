package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A structure capable of holding a vector with four dimensions: x, y, z, and w.
 * <p>
 * The contents of the {@link Vec4} structure are private and should
 * never be accessed directly.
 */
public class Vec4 extends io.github.jwharm.javagi.ResourceBase {

    public Vec4(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle graphene_vec4_alloc = Interop.downcallHandle(
        "graphene_vec4_alloc",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructAlloc() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) graphene_vec4_alloc.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Allocates a new {@link Vec4} structure.
     * <p>
     * The contents of the returned structure are undefined.
     * <p>
     * Use graphene_vec4_init() to initialize the vector.
     */
    public static Vec4 alloc() {
        return new Vec4(constructAlloc());
    }
    
    static final MethodHandle graphene_vec4_add = Interop.downcallHandle(
        "graphene_vec4_add",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds each component of the two given vectors.
     */
    public void add(Vec4 b, Vec4 res) {
        try {
            graphene_vec4_add.invokeExact(handle(), b.handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec4_divide = Interop.downcallHandle(
        "graphene_vec4_divide",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Divides each component of the first operand @a by the corresponding
     * component of the second operand @b, and places the results into the
     * vector {@code res}.
     */
    public void divide(Vec4 b, Vec4 res) {
        try {
            graphene_vec4_divide.invokeExact(handle(), b.handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec4_dot = Interop.downcallHandle(
        "graphene_vec4_dot",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the dot product of the two given vectors.
     */
    public float dot(Vec4 b) {
        try {
            var RESULT = (float) graphene_vec4_dot.invokeExact(handle(), b.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec4_equal = Interop.downcallHandle(
        "graphene_vec4_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the two given {@link Vec4} are equal.
     */
    public boolean equal(Vec4 v2) {
        try {
            var RESULT = (boolean) graphene_vec4_equal.invokeExact(handle(), v2.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec4_free = Interop.downcallHandle(
        "graphene_vec4_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the resources allocated by @v
     */
    public void free() {
        try {
            graphene_vec4_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec4_get_w = Interop.downcallHandle(
        "graphene_vec4_get_w",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the value of the fourth component of the given {@link Vec4}.
     */
    public float getW() {
        try {
            var RESULT = (float) graphene_vec4_get_w.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec4_get_x = Interop.downcallHandle(
        "graphene_vec4_get_x",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the value of the first component of the given {@link Vec4}.
     */
    public float getX() {
        try {
            var RESULT = (float) graphene_vec4_get_x.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec4_get_xy = Interop.downcallHandle(
        "graphene_vec4_get_xy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a {@link Vec2} that contains the first two components
     * of the given {@link Vec4}.
     */
    public void getXy(Vec2 res) {
        try {
            graphene_vec4_get_xy.invokeExact(handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec4_get_xyz = Interop.downcallHandle(
        "graphene_vec4_get_xyz",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a {@link Vec3} that contains the first three components
     * of the given {@link Vec4}.
     */
    public void getXyz(Vec3 res) {
        try {
            graphene_vec4_get_xyz.invokeExact(handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec4_get_y = Interop.downcallHandle(
        "graphene_vec4_get_y",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the value of the second component of the given {@link Vec4}.
     */
    public float getY() {
        try {
            var RESULT = (float) graphene_vec4_get_y.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec4_get_z = Interop.downcallHandle(
        "graphene_vec4_get_z",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the value of the third component of the given {@link Vec4}.
     */
    public float getZ() {
        try {
            var RESULT = (float) graphene_vec4_get_z.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec4_init = Interop.downcallHandle(
        "graphene_vec4_init",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Initializes a {@link Vec4} using the given values.
     * <p>
     * This function can be called multiple times.
     */
    public Vec4 init(float x, float y, float z, float w) {
        try {
            var RESULT = (MemoryAddress) graphene_vec4_init.invokeExact(handle(), x, y, z, w);
            return new Vec4(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec4_init_from_float = Interop.downcallHandle(
        "graphene_vec4_init_from_float",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Vec4} with the values inside the given array.
     */
    public Vec4 initFromFloat(float[] src) {
        try {
            var RESULT = (MemoryAddress) graphene_vec4_init_from_float.invokeExact(handle(), Interop.allocateNativeArray(src).handle());
            return new Vec4(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec4_init_from_vec2 = Interop.downcallHandle(
        "graphene_vec4_init_from_vec2",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Initializes a {@link Vec4} using the components of a
     * {@link Vec2} and the values of @z and @w.
     */
    public Vec4 initFromVec2(Vec2 src, float z, float w) {
        try {
            var RESULT = (MemoryAddress) graphene_vec4_init_from_vec2.invokeExact(handle(), src.handle(), z, w);
            return new Vec4(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec4_init_from_vec3 = Interop.downcallHandle(
        "graphene_vec4_init_from_vec3",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Initializes a {@link Vec4} using the components of a
     * {@link Vec3} and the value of @w.
     */
    public Vec4 initFromVec3(Vec3 src, float w) {
        try {
            var RESULT = (MemoryAddress) graphene_vec4_init_from_vec3.invokeExact(handle(), src.handle(), w);
            return new Vec4(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec4_init_from_vec4 = Interop.downcallHandle(
        "graphene_vec4_init_from_vec4",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Vec4} using the components of
     * another {@link Vec4}.
     */
    public Vec4 initFromVec4(Vec4 src) {
        try {
            var RESULT = (MemoryAddress) graphene_vec4_init_from_vec4.invokeExact(handle(), src.handle());
            return new Vec4(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec4_interpolate = Interop.downcallHandle(
        "graphene_vec4_interpolate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Linearly interpolates {@code v1} and {@code v2} using the given {@code factor}.
     */
    public void interpolate(Vec4 v2, double factor, Vec4 res) {
        try {
            graphene_vec4_interpolate.invokeExact(handle(), v2.handle(), factor, res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec4_length = Interop.downcallHandle(
        "graphene_vec4_length",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the length of the given {@link Vec4}.
     */
    public float length() {
        try {
            var RESULT = (float) graphene_vec4_length.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec4_max = Interop.downcallHandle(
        "graphene_vec4_max",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Compares each component of the two given vectors and creates a
     * vector that contains the maximum values.
     */
    public void max(Vec4 b, Vec4 res) {
        try {
            graphene_vec4_max.invokeExact(handle(), b.handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec4_min = Interop.downcallHandle(
        "graphene_vec4_min",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Compares each component of the two given vectors and creates a
     * vector that contains the minimum values.
     */
    public void min(Vec4 b, Vec4 res) {
        try {
            graphene_vec4_min.invokeExact(handle(), b.handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec4_multiply = Interop.downcallHandle(
        "graphene_vec4_multiply",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Multiplies each component of the two given vectors.
     */
    public void multiply(Vec4 b, Vec4 res) {
        try {
            graphene_vec4_multiply.invokeExact(handle(), b.handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec4_near = Interop.downcallHandle(
        "graphene_vec4_near",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Compares the two given {@link Vec4} vectors and checks
     * whether their values are within the given {@code epsilon}.
     */
    public boolean near(Vec4 v2, float epsilon) {
        try {
            var RESULT = (boolean) graphene_vec4_near.invokeExact(handle(), v2.handle(), epsilon);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec4_negate = Interop.downcallHandle(
        "graphene_vec4_negate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Negates the given {@link Vec4}.
     */
    public void negate(Vec4 res) {
        try {
            graphene_vec4_negate.invokeExact(handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec4_normalize = Interop.downcallHandle(
        "graphene_vec4_normalize",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Normalizes the given {@link Vec4}.
     */
    public void normalize(Vec4 res) {
        try {
            graphene_vec4_normalize.invokeExact(handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec4_scale = Interop.downcallHandle(
        "graphene_vec4_scale",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Multiplies all components of the given vector with the given scalar {@code factor}.
     */
    public void scale(float factor, Vec4 res) {
        try {
            graphene_vec4_scale.invokeExact(handle(), factor, res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec4_subtract = Interop.downcallHandle(
        "graphene_vec4_subtract",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Subtracts from each component of the first operand @a the
     * corresponding component of the second operand @b and places
     * each result into the components of {@code res}.
     */
    public void subtract(Vec4 b, Vec4 res) {
        try {
            graphene_vec4_subtract.invokeExact(handle(), b.handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_vec4_to_float = Interop.downcallHandle(
        "graphene_vec4_to_float",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Stores the components of the given {@link Vec4} into an array
     * of floating point values.
     */
    public void toFloat(PointerFloat dest) {
        try {
            graphene_vec4_to_float.invokeExact(handle(), dest.handle());
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
    public static Vec4 one() {
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
    public static Vec4 wAxis() {
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
    public static Vec4 xAxis() {
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
    public static Vec4 yAxis() {
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
    public static Vec4 zAxis() {
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
    public static Vec4 zero() {
        try {
            var RESULT = (MemoryAddress) graphene_vec4_zero.invokeExact();
            return new Vec4(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
