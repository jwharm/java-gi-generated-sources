package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A structure capable of holding a vector with two dimensions, x and y.
 * <p>
 * The contents of the {@link Vec2} structure are private and should
 * never be accessed directly.
 */
public class Vec2 extends io.github.jwharm.javagi.ResourceBase {

    public Vec2(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle graphene_vec2_alloc = Interop.downcallHandle(
        "graphene_vec2_alloc",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructAlloc() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) graphene_vec2_alloc.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Allocates a new {@link Vec2} structure.
     * <p>
     * The contents of the returned structure are undefined.
     * <p>
     * Use graphene_vec2_init() to initialize the vector.
     */
    public static Vec2 alloc() {
        return new Vec2(constructAlloc());
    }
    
    private static final MethodHandle graphene_vec2_add = Interop.downcallHandle(
        "graphene_vec2_add",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds each component of the two passed vectors and places
     * each result into the components of {@code res}.
     */
    public @NotNull void add(@NotNull Vec2 b, @NotNull Out<Vec2> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_vec2_add.invokeExact(handle(), b.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Vec2(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_vec2_divide = Interop.downcallHandle(
        "graphene_vec2_divide",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Divides each component of the first operand @a by the corresponding
     * component of the second operand @b, and places the results into the
     * vector {@code res}.
     */
    public @NotNull void divide(@NotNull Vec2 b, @NotNull Out<Vec2> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_vec2_divide.invokeExact(handle(), b.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Vec2(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_vec2_dot = Interop.downcallHandle(
        "graphene_vec2_dot",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the dot product of the two given vectors.
     */
    public float dot(@NotNull Vec2 b) {
        float RESULT;
        try {
            RESULT = (float) graphene_vec2_dot.invokeExact(handle(), b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_vec2_equal = Interop.downcallHandle(
        "graphene_vec2_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the two given {@link Vec2} are equal.
     */
    public boolean equal(@NotNull Vec2 v2) {
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_vec2_equal.invokeExact(handle(), v2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_vec2_free = Interop.downcallHandle(
        "graphene_vec2_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the resources allocated by @v
     */
    public @NotNull void free() {
        try {
            graphene_vec2_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle graphene_vec2_get_x = Interop.downcallHandle(
        "graphene_vec2_get_x",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the X component of the {@link Vec2}.
     */
    public float getX() {
        float RESULT;
        try {
            RESULT = (float) graphene_vec2_get_x.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_vec2_get_y = Interop.downcallHandle(
        "graphene_vec2_get_y",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the Y component of the {@link Vec2}.
     */
    public float getY() {
        float RESULT;
        try {
            RESULT = (float) graphene_vec2_get_y.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_vec2_init = Interop.downcallHandle(
        "graphene_vec2_init",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Initializes a {@link Vec2} using the given values.
     * <p>
     * This function can be called multiple times.
     */
    public @NotNull Vec2 init(@NotNull float x, @NotNull float y) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_vec2_init.invokeExact(handle(), x, y);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Vec2(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_vec2_init_from_float = Interop.downcallHandle(
        "graphene_vec2_init_from_float",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes @v with the contents of the given array.
     */
    public @NotNull Vec2 initFromFloat(@NotNull float[] src) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_vec2_init_from_float.invokeExact(handle(), Interop.allocateNativeArray(src));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Vec2(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_vec2_init_from_vec2 = Interop.downcallHandle(
        "graphene_vec2_init_from_vec2",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Copies the contents of {@code src} into @v.
     */
    public @NotNull Vec2 initFromVec2(@NotNull Vec2 src) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_vec2_init_from_vec2.invokeExact(handle(), src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Vec2(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_vec2_interpolate = Interop.downcallHandle(
        "graphene_vec2_interpolate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Linearly interpolates {@code v1} and {@code v2} using the given {@code factor}.
     */
    public @NotNull void interpolate(@NotNull Vec2 v2, @NotNull double factor, @NotNull Out<Vec2> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_vec2_interpolate.invokeExact(handle(), v2.handle(), factor, (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Vec2(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_vec2_length = Interop.downcallHandle(
        "graphene_vec2_length",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the length of the given vector.
     */
    public float length() {
        float RESULT;
        try {
            RESULT = (float) graphene_vec2_length.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_vec2_max = Interop.downcallHandle(
        "graphene_vec2_max",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Compares the two given vectors and places the maximum
     * values of each component into {@code res}.
     */
    public @NotNull void max(@NotNull Vec2 b, @NotNull Out<Vec2> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_vec2_max.invokeExact(handle(), b.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Vec2(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_vec2_min = Interop.downcallHandle(
        "graphene_vec2_min",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Compares the two given vectors and places the minimum
     * values of each component into {@code res}.
     */
    public @NotNull void min(@NotNull Vec2 b, @NotNull Out<Vec2> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_vec2_min.invokeExact(handle(), b.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Vec2(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_vec2_multiply = Interop.downcallHandle(
        "graphene_vec2_multiply",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Multiplies each component of the two passed vectors and places
     * each result into the components of {@code res}.
     */
    public @NotNull void multiply(@NotNull Vec2 b, @NotNull Out<Vec2> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_vec2_multiply.invokeExact(handle(), b.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Vec2(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_vec2_near = Interop.downcallHandle(
        "graphene_vec2_near",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Compares the two given {@link Vec2} vectors and checks
     * whether their values are within the given {@code epsilon}.
     */
    public boolean near(@NotNull Vec2 v2, @NotNull float epsilon) {
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_vec2_near.invokeExact(handle(), v2.handle(), epsilon);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_vec2_negate = Interop.downcallHandle(
        "graphene_vec2_negate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Negates the given {@link Vec2}.
     */
    public @NotNull void negate(@NotNull Out<Vec2> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_vec2_negate.invokeExact(handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Vec2(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_vec2_normalize = Interop.downcallHandle(
        "graphene_vec2_normalize",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the normalized vector for the given vector @v.
     */
    public @NotNull void normalize(@NotNull Out<Vec2> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_vec2_normalize.invokeExact(handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Vec2(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_vec2_scale = Interop.downcallHandle(
        "graphene_vec2_scale",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Multiplies all components of the given vector with the given scalar {@code factor}.
     */
    public @NotNull void scale(@NotNull float factor, @NotNull Out<Vec2> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_vec2_scale.invokeExact(handle(), factor, (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Vec2(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_vec2_subtract = Interop.downcallHandle(
        "graphene_vec2_subtract",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Subtracts from each component of the first operand @a the
     * corresponding component of the second operand @b and places
     * each result into the components of {@code res}.
     */
    public @NotNull void subtract(@NotNull Vec2 b, @NotNull Out<Vec2> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_vec2_subtract.invokeExact(handle(), b.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Vec2(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_vec2_to_float = Interop.downcallHandle(
        "graphene_vec2_to_float",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Stores the components of @v into an array.
     */
    public @NotNull void toFloat(@NotNull Out<float[]> dest) {
        MemorySegment destPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_vec2_to_float.invokeExact(handle(), (Addressable) destPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        dest.set(MemorySegment.ofAddress(destPOINTER.get(ValueLayout.ADDRESS, 0), 2 * ValueLayout.JAVA_FLOAT.byteSize(), Interop.getScope()).toArray(ValueLayout.JAVA_FLOAT));
    }
    
    private static final MethodHandle graphene_vec2_one = Interop.downcallHandle(
        "graphene_vec2_one",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves a constant vector with (1, 1) components.
     */
    public static @NotNull Vec2 one() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_vec2_one.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Vec2(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_vec2_x_axis = Interop.downcallHandle(
        "graphene_vec2_x_axis",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves a constant vector with (1, 0) components.
     */
    public static @NotNull Vec2 xAxis() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_vec2_x_axis.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Vec2(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_vec2_y_axis = Interop.downcallHandle(
        "graphene_vec2_y_axis",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves a constant vector with (0, 1) components.
     */
    public static @NotNull Vec2 yAxis() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_vec2_y_axis.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Vec2(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_vec2_zero = Interop.downcallHandle(
        "graphene_vec2_zero",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves a constant vector with (0, 0) components.
     */
    public static @NotNull Vec2 zero() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_vec2_zero.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Vec2(Refcounted.get(RESULT, false));
    }
    
}
