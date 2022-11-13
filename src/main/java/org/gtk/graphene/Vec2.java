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
public class Vec2 extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        Graphene.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "graphene_vec2_t";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.graphene.Simd4F.getMemoryLayout().withName("value")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static Vec2 allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Vec2 newInstance = new Vec2(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Vec2 proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Vec2(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructAlloc() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_vec2_alloc.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocates a new {@link Vec2} structure.
     * <p>
     * The contents of the returned structure are undefined.
     * <p>
     * Use graphene_vec2_init() to initialize the vector.
     * @return the newly allocated {@link Vec2}
     *   structure. Use graphene_vec2_free() to free the resources allocated
     *   by this function.
     */
    public static Vec2 alloc() {
        return new Vec2(constructAlloc(), Ownership.FULL);
    }
    
    /**
     * Adds each component of the two passed vectors and places
     * each result into the components of {@code res}.
     * @param b a {@link Vec2}
     * @param res return location for the result
     */
    public void add(@NotNull org.gtk.graphene.Vec2 b, @NotNull org.gtk.graphene.Vec2 res) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_vec2_add.invokeExact(
                    handle(),
                    b.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Divides each component of the first operand {@code a} by the corresponding
     * component of the second operand {@code b}, and places the results into the
     * vector {@code res}.
     * @param b a {@link Vec2}
     * @param res return location for the result
     */
    public void divide(@NotNull org.gtk.graphene.Vec2 b, @NotNull org.gtk.graphene.Vec2 res) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_vec2_divide.invokeExact(
                    handle(),
                    b.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Computes the dot product of the two given vectors.
     * @param b a {@link Vec2}
     * @return the dot product of the vectors
     */
    public float dot(@NotNull org.gtk.graphene.Vec2 b) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_vec2_dot.invokeExact(
                    handle(),
                    b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks whether the two given {@link Vec2} are equal.
     * @param v2 a {@link Vec2}
     * @return {@code true} if the two vectors are equal, and false otherwise
     */
    public boolean equal(@NotNull org.gtk.graphene.Vec2 v2) {
        java.util.Objects.requireNonNull(v2, "Parameter 'v2' must not be null");
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_vec2_equal.invokeExact(
                    handle(),
                    v2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Frees the resources allocated by {@code v}
     */
    public void free() {
        try {
            DowncallHandles.graphene_vec2_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the X component of the {@link Vec2}.
     * @return the value of the X component
     */
    public float getX() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_vec2_get_x.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the Y component of the {@link Vec2}.
     * @return the value of the Y component
     */
    public float getY() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_vec2_get_y.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Initializes a {@link Vec2} using the given values.
     * <p>
     * This function can be called multiple times.
     * @param x the X field of the vector
     * @param y the Y field of the vector
     * @return the initialized vector
     */
    public @NotNull org.gtk.graphene.Vec2 init(float x, float y) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_vec2_init.invokeExact(
                    handle(),
                    x,
                    y);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Vec2(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes {@code v} with the contents of the given array.
     * @param src an array of floating point values
     *   with at least two elements
     * @return the initialized vector
     */
    public @NotNull org.gtk.graphene.Vec2 initFromFloat(@NotNull float[] src) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_vec2_init_from_float.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(src, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Vec2(RESULT, Ownership.NONE);
    }
    
    /**
     * Copies the contents of {@code src} into {@code v}.
     * @param src a {@link Vec2}
     * @return the initialized vector
     */
    public @NotNull org.gtk.graphene.Vec2 initFromVec2(@NotNull org.gtk.graphene.Vec2 src) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_vec2_init_from_vec2.invokeExact(
                    handle(),
                    src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Vec2(RESULT, Ownership.NONE);
    }
    
    /**
     * Linearly interpolates {@code v1} and {@code v2} using the given {@code factor}.
     * @param v2 a {@link Vec2}
     * @param factor the interpolation factor
     * @param res the interpolated vector
     */
    public void interpolate(@NotNull org.gtk.graphene.Vec2 v2, double factor, @NotNull org.gtk.graphene.Vec2 res) {
        java.util.Objects.requireNonNull(v2, "Parameter 'v2' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_vec2_interpolate.invokeExact(
                    handle(),
                    v2.handle(),
                    factor,
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Computes the length of the given vector.
     * @return the length of the vector
     */
    public float length() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_vec2_length.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Compares the two given vectors and places the maximum
     * values of each component into {@code res}.
     * @param b a {@link Vec2}
     * @param res the resulting vector
     */
    public void max(@NotNull org.gtk.graphene.Vec2 b, @NotNull org.gtk.graphene.Vec2 res) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_vec2_max.invokeExact(
                    handle(),
                    b.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Compares the two given vectors and places the minimum
     * values of each component into {@code res}.
     * @param b a {@link Vec2}
     * @param res the resulting vector
     */
    public void min(@NotNull org.gtk.graphene.Vec2 b, @NotNull org.gtk.graphene.Vec2 res) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_vec2_min.invokeExact(
                    handle(),
                    b.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Multiplies each component of the two passed vectors and places
     * each result into the components of {@code res}.
     * @param b a {@link Vec2}
     * @param res return location for the result
     */
    public void multiply(@NotNull org.gtk.graphene.Vec2 b, @NotNull org.gtk.graphene.Vec2 res) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_vec2_multiply.invokeExact(
                    handle(),
                    b.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Compares the two given {@link Vec2} vectors and checks
     * whether their values are within the given {@code epsilon}.
     * @param v2 a {@link Vec2}
     * @param epsilon the threshold between the two vectors
     * @return {@code true} if the two vectors are near each other
     */
    public boolean near(@NotNull org.gtk.graphene.Vec2 v2, float epsilon) {
        java.util.Objects.requireNonNull(v2, "Parameter 'v2' must not be null");
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_vec2_near.invokeExact(
                    handle(),
                    v2.handle(),
                    epsilon);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Negates the given {@link Vec2}.
     * @param res return location for the result vector
     */
    public void negate(@NotNull org.gtk.graphene.Vec2 res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_vec2_negate.invokeExact(
                    handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Computes the normalized vector for the given vector {@code v}.
     * @param res return location for the
     *   normalized vector
     */
    public void normalize(@NotNull org.gtk.graphene.Vec2 res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_vec2_normalize.invokeExact(
                    handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Multiplies all components of the given vector with the given scalar {@code factor}.
     * @param factor the scalar factor
     * @param res return location for the result vector
     */
    public void scale(float factor, @NotNull org.gtk.graphene.Vec2 res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_vec2_scale.invokeExact(
                    handle(),
                    factor,
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Subtracts from each component of the first operand {@code a} the
     * corresponding component of the second operand {@code b} and places
     * each result into the components of {@code res}.
     * @param b a {@link Vec2}
     * @param res return location for the result
     */
    public void subtract(@NotNull org.gtk.graphene.Vec2 b, @NotNull org.gtk.graphene.Vec2 res) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_vec2_subtract.invokeExact(
                    handle(),
                    b.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Stores the components of {@code v} into an array.
     * @param dest return location
     *   for an array of floating point values with at least 2 elements
     */
    public void toFloat(@NotNull Out<float[]> dest) {
        java.util.Objects.requireNonNull(dest, "Parameter 'dest' must not be null");
        MemorySegment destPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            DowncallHandles.graphene_vec2_to_float.invokeExact(
                    handle(),
                    (Addressable) destPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        dest.set(MemorySegment.ofAddress(destPOINTER.get(ValueLayout.ADDRESS, 0), 2 * ValueLayout.JAVA_FLOAT.byteSize(), Interop.getScope()).toArray(ValueLayout.JAVA_FLOAT));
    }
    
    /**
     * Retrieves a constant vector with (1, 1) components.
     * @return the one vector
     */
    public static @NotNull org.gtk.graphene.Vec2 one() {
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
    public static @NotNull org.gtk.graphene.Vec2 xAxis() {
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
    public static @NotNull org.gtk.graphene.Vec2 yAxis() {
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
    public static @NotNull org.gtk.graphene.Vec2 zero() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_vec2_zero.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Vec2(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle graphene_vec2_alloc = Interop.downcallHandle(
            "graphene_vec2_alloc",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec2_add = Interop.downcallHandle(
            "graphene_vec2_add",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec2_divide = Interop.downcallHandle(
            "graphene_vec2_divide",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec2_dot = Interop.downcallHandle(
            "graphene_vec2_dot",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec2_equal = Interop.downcallHandle(
            "graphene_vec2_equal",
            FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec2_free = Interop.downcallHandle(
            "graphene_vec2_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec2_get_x = Interop.downcallHandle(
            "graphene_vec2_get_x",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec2_get_y = Interop.downcallHandle(
            "graphene_vec2_get_y",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec2_init = Interop.downcallHandle(
            "graphene_vec2_init",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT),
            false
        );
        
        private static final MethodHandle graphene_vec2_init_from_float = Interop.downcallHandle(
            "graphene_vec2_init_from_float",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec2_init_from_vec2 = Interop.downcallHandle(
            "graphene_vec2_init_from_vec2",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec2_interpolate = Interop.downcallHandle(
            "graphene_vec2_interpolate",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec2_length = Interop.downcallHandle(
            "graphene_vec2_length",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec2_max = Interop.downcallHandle(
            "graphene_vec2_max",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec2_min = Interop.downcallHandle(
            "graphene_vec2_min",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec2_multiply = Interop.downcallHandle(
            "graphene_vec2_multiply",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec2_near = Interop.downcallHandle(
            "graphene_vec2_near",
            FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT),
            false
        );
        
        private static final MethodHandle graphene_vec2_negate = Interop.downcallHandle(
            "graphene_vec2_negate",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec2_normalize = Interop.downcallHandle(
            "graphene_vec2_normalize",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec2_scale = Interop.downcallHandle(
            "graphene_vec2_scale",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec2_subtract = Interop.downcallHandle(
            "graphene_vec2_subtract",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec2_to_float = Interop.downcallHandle(
            "graphene_vec2_to_float",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec2_one = Interop.downcallHandle(
            "graphene_vec2_one",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec2_x_axis = Interop.downcallHandle(
            "graphene_vec2_x_axis",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec2_y_axis = Interop.downcallHandle(
            "graphene_vec2_y_axis",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec2_zero = Interop.downcallHandle(
            "graphene_vec2_zero",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
    }
}
