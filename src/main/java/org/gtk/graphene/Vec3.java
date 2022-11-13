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
public class Vec3 extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        Graphene.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "graphene_vec3_t";
    
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
    
    public static Vec3 allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Vec3 newInstance = new Vec3(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Vec3 proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Vec3(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructAlloc() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_vec3_alloc.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocates a new {@link Vec3} structure.
     * <p>
     * The contents of the returned structure are undefined.
     * <p>
     * Use graphene_vec3_init() to initialize the vector.
     * @return the newly allocated {@link Vec3}
     *   structure. Use graphene_vec3_free() to free the resources allocated
     *   by this function.
     */
    public static Vec3 alloc() {
        return new Vec3(constructAlloc(), Ownership.FULL);
    }
    
    /**
     * Adds each component of the two given vectors.
     * @param b a {@link Vec3}
     * @param res return location for the resulting vector
     */
    public void add(@NotNull org.gtk.graphene.Vec3 b, @NotNull org.gtk.graphene.Vec3 res) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_vec3_add.invokeExact(
                    handle(),
                    b.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Computes the cross product of the two given vectors.
     * @param b a {@link Vec3}
     * @param res return location for the resulting vector
     */
    public void cross(@NotNull org.gtk.graphene.Vec3 b, @NotNull org.gtk.graphene.Vec3 res) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_vec3_cross.invokeExact(
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
     * @param b a {@link Vec3}
     * @param res return location for the resulting vector
     */
    public void divide(@NotNull org.gtk.graphene.Vec3 b, @NotNull org.gtk.graphene.Vec3 res) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_vec3_divide.invokeExact(
                    handle(),
                    b.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Computes the dot product of the two given vectors.
     * @param b a {@link Vec3}
     * @return the value of the dot product
     */
    public float dot(@NotNull org.gtk.graphene.Vec3 b) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_vec3_dot.invokeExact(
                    handle(),
                    b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks whether the two given {@link Vec3} are equal.
     * @param v2 a {@link Vec3}
     * @return {@code true} if the two vectors are equal, and false otherwise
     */
    public boolean equal(@NotNull org.gtk.graphene.Vec3 v2) {
        java.util.Objects.requireNonNull(v2, "Parameter 'v2' must not be null");
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_vec3_equal.invokeExact(
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
            DowncallHandles.graphene_vec3_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the first component of the given vector {@code v}.
     * @return the value of the first component of the vector
     */
    public float getX() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_vec3_get_x.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@link Vec2} that contains the first and second
     * components of the given {@link Vec3}.
     * @param res return location for a {@link Vec2}
     */
    public void getXy(@NotNull org.gtk.graphene.Vec2 res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_vec3_get_xy.invokeExact(
                    handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@link Vec3} that contains the first two components of
     * the given {@link Vec3}, and the third component set to 0.
     * @param res return location for a {@link Vec3}
     */
    public void getXy0(@NotNull org.gtk.graphene.Vec3 res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_vec3_get_xy0.invokeExact(
                    handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Converts a {@link Vec3} in a {@link Vec4} using 0.0
     * as the value for the fourth component of the resulting vector.
     * @param res return location for the vector
     */
    public void getXyz0(@NotNull org.gtk.graphene.Vec4 res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_vec3_get_xyz0.invokeExact(
                    handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Converts a {@link Vec3} in a {@link Vec4} using 1.0
     * as the value for the fourth component of the resulting vector.
     * @param res return location for the vector
     */
    public void getXyz1(@NotNull org.gtk.graphene.Vec4 res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_vec3_get_xyz1.invokeExact(
                    handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Converts a {@link Vec3} in a {@link Vec4} using {@code w} as
     * the value of the fourth component of the resulting vector.
     * @param w the value of the W component
     * @param res return location for the vector
     */
    public void getXyzw(float w, @NotNull org.gtk.graphene.Vec4 res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_vec3_get_xyzw.invokeExact(
                    handle(),
                    w,
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the second component of the given vector {@code v}.
     * @return the value of the second component of the vector
     */
    public float getY() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_vec3_get_y.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the third component of the given vector {@code v}.
     * @return the value of the third component of the vector
     */
    public float getZ() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_vec3_get_z.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Initializes a {@link Vec3} using the given values.
     * <p>
     * This function can be called multiple times.
     * @param x the X field of the vector
     * @param y the Y field of the vector
     * @param z the Z field of the vector
     * @return a pointer to the initialized
     *   vector
     */
    public @NotNull org.gtk.graphene.Vec3 init(float x, float y, float z) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_vec3_init.invokeExact(
                    handle(),
                    x,
                    y,
                    z);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Vec3(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes a {@link Vec3} with the values from an array.
     * @param src an array of 3 floating point values
     * @return the initialized vector
     */
    public @NotNull org.gtk.graphene.Vec3 initFromFloat(@NotNull float[] src) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_vec3_init_from_float.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(src, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Vec3(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes a {@link Vec3} with the values of another
     * {@link Vec3}.
     * @param src a {@link Vec3}
     * @return the initialized vector
     */
    public @NotNull org.gtk.graphene.Vec3 initFromVec3(@NotNull org.gtk.graphene.Vec3 src) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_vec3_init_from_vec3.invokeExact(
                    handle(),
                    src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Vec3(RESULT, Ownership.NONE);
    }
    
    /**
     * Linearly interpolates {@code v1} and {@code v2} using the given {@code factor}.
     * @param v2 a {@link Vec3}
     * @param factor the interpolation factor
     * @param res the interpolated vector
     */
    public void interpolate(@NotNull org.gtk.graphene.Vec3 v2, double factor, @NotNull org.gtk.graphene.Vec3 res) {
        java.util.Objects.requireNonNull(v2, "Parameter 'v2' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_vec3_interpolate.invokeExact(
                    handle(),
                    v2.handle(),
                    factor,
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the length of the given vector {@code v}.
     * @return the value of the length of the vector
     */
    public float length() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_vec3_length.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Compares each component of the two given vectors and creates a
     * vector that contains the maximum values.
     * @param b a {@link Vec3}
     * @param res return location for the result vector
     */
    public void max(@NotNull org.gtk.graphene.Vec3 b, @NotNull org.gtk.graphene.Vec3 res) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_vec3_max.invokeExact(
                    handle(),
                    b.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Compares each component of the two given vectors and creates a
     * vector that contains the minimum values.
     * @param b a {@link Vec3}
     * @param res return location for the result vector
     */
    public void min(@NotNull org.gtk.graphene.Vec3 b, @NotNull org.gtk.graphene.Vec3 res) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_vec3_min.invokeExact(
                    handle(),
                    b.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Multiplies each component of the two given vectors.
     * @param b a {@link Vec3}
     * @param res return location for the resulting vector
     */
    public void multiply(@NotNull org.gtk.graphene.Vec3 b, @NotNull org.gtk.graphene.Vec3 res) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_vec3_multiply.invokeExact(
                    handle(),
                    b.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Compares the two given {@link Vec3} vectors and checks
     * whether their values are within the given {@code epsilon}.
     * @param v2 a {@link Vec3}
     * @param epsilon the threshold between the two vectors
     * @return {@code true} if the two vectors are near each other
     */
    public boolean near(@NotNull org.gtk.graphene.Vec3 v2, float epsilon) {
        java.util.Objects.requireNonNull(v2, "Parameter 'v2' must not be null");
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_vec3_near.invokeExact(
                    handle(),
                    v2.handle(),
                    epsilon);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Negates the given {@link Vec3}.
     * @param res return location for the result vector
     */
    public void negate(@NotNull org.gtk.graphene.Vec3 res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_vec3_negate.invokeExact(
                    handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Normalizes the given {@link Vec3}.
     * @param res return location for the normalized vector
     */
    public void normalize(@NotNull org.gtk.graphene.Vec3 res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_vec3_normalize.invokeExact(
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
    public void scale(float factor, @NotNull org.gtk.graphene.Vec3 res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_vec3_scale.invokeExact(
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
     * @param b a {@link Vec3}
     * @param res return location for the resulting vector
     */
    public void subtract(@NotNull org.gtk.graphene.Vec3 b, @NotNull org.gtk.graphene.Vec3 res) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_vec3_subtract.invokeExact(
                    handle(),
                    b.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Copies the components of a {@link Vec3} into the given array.
     * @param dest return location for
     *   an array of floating point values
     */
    public void toFloat(@NotNull Out<float[]> dest) {
        java.util.Objects.requireNonNull(dest, "Parameter 'dest' must not be null");
        MemorySegment destPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            DowncallHandles.graphene_vec3_to_float.invokeExact(
                    handle(),
                    (Addressable) destPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        dest.set(MemorySegment.ofAddress(destPOINTER.get(ValueLayout.ADDRESS, 0), 3 * ValueLayout.JAVA_FLOAT.byteSize(), Interop.getScope()).toArray(ValueLayout.JAVA_FLOAT));
    }
    
    /**
     * Provides a constant pointer to a vector with three components,
     * all sets to 1.
     * @return a constant vector
     */
    public static @NotNull org.gtk.graphene.Vec3 one() {
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
    public static @NotNull org.gtk.graphene.Vec3 xAxis() {
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
    public static @NotNull org.gtk.graphene.Vec3 yAxis() {
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
    public static @NotNull org.gtk.graphene.Vec3 zAxis() {
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
    public static @NotNull org.gtk.graphene.Vec3 zero() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_vec3_zero.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Vec3(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle graphene_vec3_alloc = Interop.downcallHandle(
            "graphene_vec3_alloc",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec3_add = Interop.downcallHandle(
            "graphene_vec3_add",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec3_cross = Interop.downcallHandle(
            "graphene_vec3_cross",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec3_divide = Interop.downcallHandle(
            "graphene_vec3_divide",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec3_dot = Interop.downcallHandle(
            "graphene_vec3_dot",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec3_equal = Interop.downcallHandle(
            "graphene_vec3_equal",
            FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec3_free = Interop.downcallHandle(
            "graphene_vec3_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec3_get_x = Interop.downcallHandle(
            "graphene_vec3_get_x",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec3_get_xy = Interop.downcallHandle(
            "graphene_vec3_get_xy",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec3_get_xy0 = Interop.downcallHandle(
            "graphene_vec3_get_xy0",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec3_get_xyz0 = Interop.downcallHandle(
            "graphene_vec3_get_xyz0",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec3_get_xyz1 = Interop.downcallHandle(
            "graphene_vec3_get_xyz1",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec3_get_xyzw = Interop.downcallHandle(
            "graphene_vec3_get_xyzw",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec3_get_y = Interop.downcallHandle(
            "graphene_vec3_get_y",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec3_get_z = Interop.downcallHandle(
            "graphene_vec3_get_z",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec3_init = Interop.downcallHandle(
            "graphene_vec3_init",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT),
            false
        );
        
        private static final MethodHandle graphene_vec3_init_from_float = Interop.downcallHandle(
            "graphene_vec3_init_from_float",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec3_init_from_vec3 = Interop.downcallHandle(
            "graphene_vec3_init_from_vec3",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec3_interpolate = Interop.downcallHandle(
            "graphene_vec3_interpolate",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec3_length = Interop.downcallHandle(
            "graphene_vec3_length",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec3_max = Interop.downcallHandle(
            "graphene_vec3_max",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec3_min = Interop.downcallHandle(
            "graphene_vec3_min",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec3_multiply = Interop.downcallHandle(
            "graphene_vec3_multiply",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec3_near = Interop.downcallHandle(
            "graphene_vec3_near",
            FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT),
            false
        );
        
        private static final MethodHandle graphene_vec3_negate = Interop.downcallHandle(
            "graphene_vec3_negate",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec3_normalize = Interop.downcallHandle(
            "graphene_vec3_normalize",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec3_scale = Interop.downcallHandle(
            "graphene_vec3_scale",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec3_subtract = Interop.downcallHandle(
            "graphene_vec3_subtract",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec3_to_float = Interop.downcallHandle(
            "graphene_vec3_to_float",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec3_one = Interop.downcallHandle(
            "graphene_vec3_one",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec3_x_axis = Interop.downcallHandle(
            "graphene_vec3_x_axis",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec3_y_axis = Interop.downcallHandle(
            "graphene_vec3_y_axis",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec3_z_axis = Interop.downcallHandle(
            "graphene_vec3_z_axis",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec3_zero = Interop.downcallHandle(
            "graphene_vec3_zero",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
    }
}
