package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A structure capable of holding a vector with three dimensions: x, y, and z.
 * <p>
 * The contents of the {@link Vec3} structure are private and should
 * never be accessed directly.
 */
public class Vec3 extends io.github.jwharm.javagi.ResourceBase {

    public Vec3(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle graphene_vec3_alloc = Interop.downcallHandle(
        "graphene_vec3_alloc",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructAlloc() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) graphene_vec3_alloc.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Allocates a new {@link Vec3} structure.
     * <p>
     * The contents of the returned structure are undefined.
     * <p>
     * Use graphene_vec3_init() to initialize the vector.
     */
    public static Vec3 alloc() {
        return new Vec3(constructAlloc());
    }
    
    private static final MethodHandle graphene_vec3_add = Interop.downcallHandle(
        "graphene_vec3_add",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds each component of the two given vectors.
     */
    public @NotNull void add(@NotNull Vec3 b, @NotNull Out<Vec3> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_vec3_add.invokeExact(handle(), b.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Vec3(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_vec3_cross = Interop.downcallHandle(
        "graphene_vec3_cross",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the cross product of the two given vectors.
     */
    public @NotNull void cross(@NotNull Vec3 b, @NotNull Out<Vec3> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_vec3_cross.invokeExact(handle(), b.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Vec3(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_vec3_divide = Interop.downcallHandle(
        "graphene_vec3_divide",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Divides each component of the first operand @a by the corresponding
     * component of the second operand @b, and places the results into the
     * vector {@code res}.
     */
    public @NotNull void divide(@NotNull Vec3 b, @NotNull Out<Vec3> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_vec3_divide.invokeExact(handle(), b.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Vec3(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_vec3_dot = Interop.downcallHandle(
        "graphene_vec3_dot",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the dot product of the two given vectors.
     */
    public float dot(@NotNull Vec3 b) {
        float RESULT;
        try {
            RESULT = (float) graphene_vec3_dot.invokeExact(handle(), b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_vec3_equal = Interop.downcallHandle(
        "graphene_vec3_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the two given {@link Vec3} are equal.
     */
    public boolean equal(@NotNull Vec3 v2) {
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_vec3_equal.invokeExact(handle(), v2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_vec3_free = Interop.downcallHandle(
        "graphene_vec3_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the resources allocated by @v
     */
    public @NotNull void free() {
        try {
            graphene_vec3_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle graphene_vec3_get_x = Interop.downcallHandle(
        "graphene_vec3_get_x",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the first component of the given vector @v.
     */
    public float getX() {
        float RESULT;
        try {
            RESULT = (float) graphene_vec3_get_x.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_vec3_get_xy = Interop.downcallHandle(
        "graphene_vec3_get_xy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a {@link Vec2} that contains the first and second
     * components of the given {@link Vec3}.
     */
    public @NotNull void getXy(@NotNull Out<Vec2> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_vec3_get_xy.invokeExact(handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Vec2(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_vec3_get_xy0 = Interop.downcallHandle(
        "graphene_vec3_get_xy0",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a {@link Vec3} that contains the first two components of
     * the given {@link Vec3}, and the third component set to 0.
     */
    public @NotNull void getXy0(@NotNull Out<Vec3> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_vec3_get_xy0.invokeExact(handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Vec3(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_vec3_get_xyz0 = Interop.downcallHandle(
        "graphene_vec3_get_xyz0",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a {@link Vec3} in a {@link Vec4} using 0.0
     * as the value for the fourth component of the resulting vector.
     */
    public @NotNull void getXyz0(@NotNull Out<Vec4> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_vec3_get_xyz0.invokeExact(handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Vec4(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_vec3_get_xyz1 = Interop.downcallHandle(
        "graphene_vec3_get_xyz1",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a {@link Vec3} in a {@link Vec4} using 1.0
     * as the value for the fourth component of the resulting vector.
     */
    public @NotNull void getXyz1(@NotNull Out<Vec4> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_vec3_get_xyz1.invokeExact(handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Vec4(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_vec3_get_xyzw = Interop.downcallHandle(
        "graphene_vec3_get_xyzw",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a {@link Vec3} in a {@link Vec4} using @w as
     * the value of the fourth component of the resulting vector.
     */
    public @NotNull void getXyzw(@NotNull float w, @NotNull Out<Vec4> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_vec3_get_xyzw.invokeExact(handle(), w, (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Vec4(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_vec3_get_y = Interop.downcallHandle(
        "graphene_vec3_get_y",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the second component of the given vector @v.
     */
    public float getY() {
        float RESULT;
        try {
            RESULT = (float) graphene_vec3_get_y.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_vec3_get_z = Interop.downcallHandle(
        "graphene_vec3_get_z",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the third component of the given vector @v.
     */
    public float getZ() {
        float RESULT;
        try {
            RESULT = (float) graphene_vec3_get_z.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_vec3_init = Interop.downcallHandle(
        "graphene_vec3_init",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Initializes a {@link Vec3} using the given values.
     * <p>
     * This function can be called multiple times.
     */
    public @NotNull Vec3 init(@NotNull float x, @NotNull float y, @NotNull float z) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_vec3_init.invokeExact(handle(), x, y, z);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Vec3(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_vec3_init_from_float = Interop.downcallHandle(
        "graphene_vec3_init_from_float",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Vec3} with the values from an array.
     */
    public @NotNull Vec3 initFromFloat(@NotNull float[] src) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_vec3_init_from_float.invokeExact(handle(), Interop.allocateNativeArray(src));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Vec3(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_vec3_init_from_vec3 = Interop.downcallHandle(
        "graphene_vec3_init_from_vec3",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Vec3} with the values of another
     * {@link Vec3}.
     */
    public @NotNull Vec3 initFromVec3(@NotNull Vec3 src) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_vec3_init_from_vec3.invokeExact(handle(), src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Vec3(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_vec3_interpolate = Interop.downcallHandle(
        "graphene_vec3_interpolate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Linearly interpolates {@code v1} and {@code v2} using the given {@code factor}.
     */
    public @NotNull void interpolate(@NotNull Vec3 v2, @NotNull double factor, @NotNull Out<Vec3> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_vec3_interpolate.invokeExact(handle(), v2.handle(), factor, (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Vec3(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_vec3_length = Interop.downcallHandle(
        "graphene_vec3_length",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the length of the given vector @v.
     */
    public float length() {
        float RESULT;
        try {
            RESULT = (float) graphene_vec3_length.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_vec3_max = Interop.downcallHandle(
        "graphene_vec3_max",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Compares each component of the two given vectors and creates a
     * vector that contains the maximum values.
     */
    public @NotNull void max(@NotNull Vec3 b, @NotNull Out<Vec3> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_vec3_max.invokeExact(handle(), b.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Vec3(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_vec3_min = Interop.downcallHandle(
        "graphene_vec3_min",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Compares each component of the two given vectors and creates a
     * vector that contains the minimum values.
     */
    public @NotNull void min(@NotNull Vec3 b, @NotNull Out<Vec3> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_vec3_min.invokeExact(handle(), b.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Vec3(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_vec3_multiply = Interop.downcallHandle(
        "graphene_vec3_multiply",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Multiplies each component of the two given vectors.
     */
    public @NotNull void multiply(@NotNull Vec3 b, @NotNull Out<Vec3> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_vec3_multiply.invokeExact(handle(), b.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Vec3(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_vec3_near = Interop.downcallHandle(
        "graphene_vec3_near",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Compares the two given {@link Vec3} vectors and checks
     * whether their values are within the given {@code epsilon}.
     */
    public boolean near(@NotNull Vec3 v2, @NotNull float epsilon) {
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_vec3_near.invokeExact(handle(), v2.handle(), epsilon);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_vec3_negate = Interop.downcallHandle(
        "graphene_vec3_negate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Negates the given {@link Vec3}.
     */
    public @NotNull void negate(@NotNull Out<Vec3> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_vec3_negate.invokeExact(handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Vec3(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_vec3_normalize = Interop.downcallHandle(
        "graphene_vec3_normalize",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Normalizes the given {@link Vec3}.
     */
    public @NotNull void normalize(@NotNull Out<Vec3> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_vec3_normalize.invokeExact(handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Vec3(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_vec3_scale = Interop.downcallHandle(
        "graphene_vec3_scale",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Multiplies all components of the given vector with the given scalar {@code factor}.
     */
    public @NotNull void scale(@NotNull float factor, @NotNull Out<Vec3> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_vec3_scale.invokeExact(handle(), factor, (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Vec3(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_vec3_subtract = Interop.downcallHandle(
        "graphene_vec3_subtract",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Subtracts from each component of the first operand @a the
     * corresponding component of the second operand @b and places
     * each result into the components of {@code res}.
     */
    public @NotNull void subtract(@NotNull Vec3 b, @NotNull Out<Vec3> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_vec3_subtract.invokeExact(handle(), b.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Vec3(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_vec3_to_float = Interop.downcallHandle(
        "graphene_vec3_to_float",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Copies the components of a {@link Vec3} into the given array.
     */
    public @NotNull void toFloat(@NotNull Out<float[]> dest) {
        MemorySegment destPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_vec3_to_float.invokeExact(handle(), (Addressable) destPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        dest.set(MemorySegment.ofAddress(destPOINTER.get(ValueLayout.ADDRESS, 0), 3 * ValueLayout.JAVA_FLOAT.byteSize(), Interop.getScope()).toArray(ValueLayout.JAVA_FLOAT));
    }
    
    private static final MethodHandle graphene_vec3_one = Interop.downcallHandle(
        "graphene_vec3_one",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Provides a constant pointer to a vector with three components,
     * all sets to 1.
     */
    public static @NotNull Vec3 one() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_vec3_one.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Vec3(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_vec3_x_axis = Interop.downcallHandle(
        "graphene_vec3_x_axis",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Provides a constant pointer to a vector with three components
     * with values set to (1, 0, 0).
     */
    public static @NotNull Vec3 xAxis() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_vec3_x_axis.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Vec3(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_vec3_y_axis = Interop.downcallHandle(
        "graphene_vec3_y_axis",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Provides a constant pointer to a vector with three components
     * with values set to (0, 1, 0).
     */
    public static @NotNull Vec3 yAxis() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_vec3_y_axis.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Vec3(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_vec3_z_axis = Interop.downcallHandle(
        "graphene_vec3_z_axis",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Provides a constant pointer to a vector with three components
     * with values set to (0, 0, 1).
     */
    public static @NotNull Vec3 zAxis() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_vec3_z_axis.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Vec3(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_vec3_zero = Interop.downcallHandle(
        "graphene_vec3_zero",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Provides a constant pointer to a vector with three components,
     * all sets to 0.
     */
    public static @NotNull Vec3 zero() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_vec3_zero.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Vec3(Refcounted.get(RESULT, false));
    }
    
}
