package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A structure capable of holding a vector with four dimensions: x, y, z, and w.
 * <p>
 * The contents of the {@link Vec4} structure are private and should
 * never be accessed directly.
 */
public class Vec4 extends Struct {
    
    static {
        Graphene.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "graphene_vec4_t";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
    
    /**
     * Allocate a new {@link Vec4}
     * @return A new, uninitialized @{link Vec4}
     */
    public static Vec4 allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Vec4 newInstance = new Vec4(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Vec4 proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Vec4(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructAlloc() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_vec4_alloc.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocates a new {@link Vec4} structure.
     * <p>
     * The contents of the returned structure are undefined.
     * <p>
     * Use graphene_vec4_init() to initialize the vector.
     * @return the newly allocated {@link Vec4}
     *   structure. Use graphene_vec4_free() to free the resources allocated
     *   by this function.
     */
    public static Vec4 alloc() {
        return new Vec4(constructAlloc(), Ownership.FULL);
    }
    
    /**
     * Adds each component of the two given vectors.
     * @param b a {@link Vec4}
     * @param res return location for the resulting vector
     */
    public void add(@NotNull org.gtk.graphene.Vec4 b, @NotNull org.gtk.graphene.Vec4 res) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_vec4_add.invokeExact(
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
     * @param b a {@link Vec4}
     * @param res return location for the resulting vector
     */
    public void divide(@NotNull org.gtk.graphene.Vec4 b, @NotNull org.gtk.graphene.Vec4 res) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_vec4_divide.invokeExact(
                    handle(),
                    b.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Computes the dot product of the two given vectors.
     * @param b a {@link Vec4}
     * @return the value of the dot product
     */
    public float dot(@NotNull org.gtk.graphene.Vec4 b) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_vec4_dot.invokeExact(
                    handle(),
                    b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks whether the two given {@link Vec4} are equal.
     * @param v2 a {@link Vec4}
     * @return {@code true} if the two vectors are equal, and false otherwise
     */
    public boolean equal(@NotNull org.gtk.graphene.Vec4 v2) {
        java.util.Objects.requireNonNull(v2, "Parameter 'v2' must not be null");
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_vec4_equal.invokeExact(
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
            DowncallHandles.graphene_vec4_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the value of the fourth component of the given {@link Vec4}.
     * @return the value of the fourth component
     */
    public float getW() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_vec4_get_w.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the value of the first component of the given {@link Vec4}.
     * @return the value of the first component
     */
    public float getX() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_vec4_get_x.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@link Vec2} that contains the first two components
     * of the given {@link Vec4}.
     * @param res return location for a {@link Vec2}
     */
    public void getXy(@NotNull org.gtk.graphene.Vec2 res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_vec4_get_xy.invokeExact(
                    handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@link Vec3} that contains the first three components
     * of the given {@link Vec4}.
     * @param res return location for a graphene_vec3_t
     */
    public void getXyz(@NotNull org.gtk.graphene.Vec3 res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_vec4_get_xyz.invokeExact(
                    handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the value of the second component of the given {@link Vec4}.
     * @return the value of the second component
     */
    public float getY() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_vec4_get_y.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the value of the third component of the given {@link Vec4}.
     * @return the value of the third component
     */
    public float getZ() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_vec4_get_z.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Initializes a {@link Vec4} using the given values.
     * <p>
     * This function can be called multiple times.
     * @param x the X field of the vector
     * @param y the Y field of the vector
     * @param z the Z field of the vector
     * @param w the W field of the vector
     * @return a pointer to the initialized
     *   vector
     */
    public @NotNull org.gtk.graphene.Vec4 init(float x, float y, float z, float w) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_vec4_init.invokeExact(
                    handle(),
                    x,
                    y,
                    z,
                    w);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Vec4(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes a {@link Vec4} with the values inside the given array.
     * @param src an array of four floating point values
     * @return the initialized vector
     */
    public @NotNull org.gtk.graphene.Vec4 initFromFloat(@NotNull float[] src) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_vec4_init_from_float.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(src, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Vec4(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes a {@link Vec4} using the components of a
     * {@link Vec2} and the values of {@code z} and {@code w}.
     * @param src a {@link Vec2}
     * @param z the value for the third component of {@code v}
     * @param w the value for the fourth component of {@code v}
     * @return the initialized vector
     */
    public @NotNull org.gtk.graphene.Vec4 initFromVec2(@NotNull org.gtk.graphene.Vec2 src, float z, float w) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_vec4_init_from_vec2.invokeExact(
                    handle(),
                    src.handle(),
                    z,
                    w);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Vec4(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes a {@link Vec4} using the components of a
     * {@link Vec3} and the value of {@code w}.
     * @param src a {@link Vec3}
     * @param w the value for the fourth component of {@code v}
     * @return the initialized vector
     */
    public @NotNull org.gtk.graphene.Vec4 initFromVec3(@NotNull org.gtk.graphene.Vec3 src, float w) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_vec4_init_from_vec3.invokeExact(
                    handle(),
                    src.handle(),
                    w);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Vec4(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes a {@link Vec4} using the components of
     * another {@link Vec4}.
     * @param src a {@link Vec4}
     * @return the initialized vector
     */
    public @NotNull org.gtk.graphene.Vec4 initFromVec4(@NotNull org.gtk.graphene.Vec4 src) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_vec4_init_from_vec4.invokeExact(
                    handle(),
                    src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Vec4(RESULT, Ownership.NONE);
    }
    
    /**
     * Linearly interpolates {@code v1} and {@code v2} using the given {@code factor}.
     * @param v2 a {@link Vec4}
     * @param factor the interpolation factor
     * @param res the interpolated vector
     */
    public void interpolate(@NotNull org.gtk.graphene.Vec4 v2, double factor, @NotNull org.gtk.graphene.Vec4 res) {
        java.util.Objects.requireNonNull(v2, "Parameter 'v2' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_vec4_interpolate.invokeExact(
                    handle(),
                    v2.handle(),
                    factor,
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Computes the length of the given {@link Vec4}.
     * @return the length of the vector
     */
    public float length() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_vec4_length.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Compares each component of the two given vectors and creates a
     * vector that contains the maximum values.
     * @param b a {@link Vec4}
     * @param res return location for the result vector
     */
    public void max(@NotNull org.gtk.graphene.Vec4 b, @NotNull org.gtk.graphene.Vec4 res) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_vec4_max.invokeExact(
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
     * @param b a {@link Vec4}
     * @param res return location for the result vector
     */
    public void min(@NotNull org.gtk.graphene.Vec4 b, @NotNull org.gtk.graphene.Vec4 res) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_vec4_min.invokeExact(
                    handle(),
                    b.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Multiplies each component of the two given vectors.
     * @param b a {@link Vec4}
     * @param res return location for the resulting vector
     */
    public void multiply(@NotNull org.gtk.graphene.Vec4 b, @NotNull org.gtk.graphene.Vec4 res) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_vec4_multiply.invokeExact(
                    handle(),
                    b.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Compares the two given {@link Vec4} vectors and checks
     * whether their values are within the given {@code epsilon}.
     * @param v2 a {@link Vec4}
     * @param epsilon the threshold between the two vectors
     * @return {@code true} if the two vectors are near each other
     */
    public boolean near(@NotNull org.gtk.graphene.Vec4 v2, float epsilon) {
        java.util.Objects.requireNonNull(v2, "Parameter 'v2' must not be null");
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_vec4_near.invokeExact(
                    handle(),
                    v2.handle(),
                    epsilon);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Negates the given {@link Vec4}.
     * @param res return location for the result vector
     */
    public void negate(@NotNull org.gtk.graphene.Vec4 res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_vec4_negate.invokeExact(
                    handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Normalizes the given {@link Vec4}.
     * @param res return location for the normalized
     *   vector
     */
    public void normalize(@NotNull org.gtk.graphene.Vec4 res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_vec4_normalize.invokeExact(
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
    public void scale(float factor, @NotNull org.gtk.graphene.Vec4 res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_vec4_scale.invokeExact(
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
     * @param b a {@link Vec4}
     * @param res return location for the resulting vector
     */
    public void subtract(@NotNull org.gtk.graphene.Vec4 b, @NotNull org.gtk.graphene.Vec4 res) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_vec4_subtract.invokeExact(
                    handle(),
                    b.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Stores the components of the given {@link Vec4} into an array
     * of floating point values.
     * @param dest return location for
     *   an array of floating point values
     */
    public void toFloat(@NotNull Out<float[]> dest) {
        java.util.Objects.requireNonNull(dest, "Parameter 'dest' must not be null");
        MemorySegment destPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.graphene_vec4_to_float.invokeExact(
                    handle(),
                    (Addressable) destPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        dest.set(MemorySegment.ofAddress(destPOINTER.get(Interop.valueLayout.ADDRESS, 0), 4 * Interop.valueLayout.C_FLOAT.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_FLOAT));
    }
    
    /**
     * Retrieves a pointer to a {@link Vec4} with all its
     * components set to 1.
     * @return a constant vector
     */
    public static @NotNull org.gtk.graphene.Vec4 one() {
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
    public static @NotNull org.gtk.graphene.Vec4 wAxis() {
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
    public static @NotNull org.gtk.graphene.Vec4 xAxis() {
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
    public static @NotNull org.gtk.graphene.Vec4 yAxis() {
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
    public static @NotNull org.gtk.graphene.Vec4 zAxis() {
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
    public static @NotNull org.gtk.graphene.Vec4 zero() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_vec4_zero.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Vec4(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle graphene_vec4_alloc = Interop.downcallHandle(
            "graphene_vec4_alloc",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec4_add = Interop.downcallHandle(
            "graphene_vec4_add",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec4_divide = Interop.downcallHandle(
            "graphene_vec4_divide",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec4_dot = Interop.downcallHandle(
            "graphene_vec4_dot",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec4_equal = Interop.downcallHandle(
            "graphene_vec4_equal",
            FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec4_free = Interop.downcallHandle(
            "graphene_vec4_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec4_get_w = Interop.downcallHandle(
            "graphene_vec4_get_w",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec4_get_x = Interop.downcallHandle(
            "graphene_vec4_get_x",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec4_get_xy = Interop.downcallHandle(
            "graphene_vec4_get_xy",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec4_get_xyz = Interop.downcallHandle(
            "graphene_vec4_get_xyz",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec4_get_y = Interop.downcallHandle(
            "graphene_vec4_get_y",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec4_get_z = Interop.downcallHandle(
            "graphene_vec4_get_z",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec4_init = Interop.downcallHandle(
            "graphene_vec4_init",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT),
            false
        );
        
        private static final MethodHandle graphene_vec4_init_from_float = Interop.downcallHandle(
            "graphene_vec4_init_from_float",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec4_init_from_vec2 = Interop.downcallHandle(
            "graphene_vec4_init_from_vec2",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT),
            false
        );
        
        private static final MethodHandle graphene_vec4_init_from_vec3 = Interop.downcallHandle(
            "graphene_vec4_init_from_vec3",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
            false
        );
        
        private static final MethodHandle graphene_vec4_init_from_vec4 = Interop.downcallHandle(
            "graphene_vec4_init_from_vec4",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec4_interpolate = Interop.downcallHandle(
            "graphene_vec4_interpolate",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec4_length = Interop.downcallHandle(
            "graphene_vec4_length",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec4_max = Interop.downcallHandle(
            "graphene_vec4_max",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec4_min = Interop.downcallHandle(
            "graphene_vec4_min",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec4_multiply = Interop.downcallHandle(
            "graphene_vec4_multiply",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec4_near = Interop.downcallHandle(
            "graphene_vec4_near",
            FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
            false
        );
        
        private static final MethodHandle graphene_vec4_negate = Interop.downcallHandle(
            "graphene_vec4_negate",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec4_normalize = Interop.downcallHandle(
            "graphene_vec4_normalize",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec4_scale = Interop.downcallHandle(
            "graphene_vec4_scale",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec4_subtract = Interop.downcallHandle(
            "graphene_vec4_subtract",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_vec4_to_float = Interop.downcallHandle(
            "graphene_vec4_to_float",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
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

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private Vec4 struct;
        
         /**
         * A {@link Vec4.Build} object constructs a {@link Vec4} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = Vec4.allocate();
        }
        
         /**
         * Finish building the {@link Vec4} struct.
         * @return A new instance of {@code Vec4} with the fields 
         *         that were set in the Build object.
         */
        public Vec4 construct() {
            return struct;
        }
        
        public Build setValue(org.gtk.graphene.Simd4F value) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (value == null ? MemoryAddress.NULL : value.handle()));
            return this;
        }
    }
}
