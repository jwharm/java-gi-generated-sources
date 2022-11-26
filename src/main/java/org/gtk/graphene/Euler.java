package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describe a rotation using Euler angles.
 * <p>
 * The contents of the {@link Euler} structure are private
 * and should never be accessed directly.
 * @version 1.2
 */
public class Euler extends Struct {
    
    static {
        Graphene.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "graphene_euler_t";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.graphene.Vec3.getMemoryLayout().withName("angles"),
        Interop.valueLayout.C_INT.withName("order")
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
     * Allocate a new {@link Euler}
     * @return A new, uninitialized @{link Euler}
     */
    public static Euler allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Euler newInstance = new Euler(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Euler proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Euler(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructAlloc() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_euler_alloc.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocates a new {@link Euler}.
     * <p>
     * The contents of the returned structure are undefined.
     * @return the newly allocated {@link Euler}
     */
    public static Euler alloc() {
        return new Euler(constructAlloc(), Ownership.FULL);
    }
    
    /**
     * Checks if two {@link Euler} are equal.
     * @param b a {@link Euler}
     * @return {@code true} if the two {@link Euler} are equal
     */
    public boolean equal(@NotNull org.gtk.graphene.Euler b) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_euler_equal.invokeExact(
                    handle(),
                    b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Frees the resources allocated by graphene_euler_alloc().
     */
    public void free() {
        try {
            DowncallHandles.graphene_euler_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the first component of the Euler angle vector,
     * depending on the order of rotation.
     * <p>
     * See also: graphene_euler_get_x()
     * @return the first component of the Euler angle vector, in radians
     */
    public float getAlpha() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_euler_get_alpha.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the second component of the Euler angle vector,
     * depending on the order of rotation.
     * <p>
     * See also: graphene_euler_get_y()
     * @return the second component of the Euler angle vector, in radians
     */
    public float getBeta() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_euler_get_beta.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the third component of the Euler angle vector,
     * depending on the order of rotation.
     * <p>
     * See also: graphene_euler_get_z()
     * @return the third component of the Euler angle vector, in radians
     */
    public float getGamma() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_euler_get_gamma.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the order used to apply the rotations described in the
     * {@link Euler} structure, when converting to and from other
     * structures, like {@link Quaternion} and {@link Matrix}.
     * <p>
     * This function does not return the {@link EulerOrder#DEFAULT}
     * enumeration value; it will return the effective order of rotation
     * instead.
     * @return the order used to apply the rotations
     */
    public @NotNull org.gtk.graphene.EulerOrder getOrder() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.graphene_euler_get_order.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.EulerOrder(RESULT);
    }
    
    /**
     * Retrieves the rotation angle on the X axis, in degrees.
     * @return the rotation angle
     */
    public float getX() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_euler_get_x.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the rotation angle on the Y axis, in degrees.
     * @return the rotation angle
     */
    public float getY() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_euler_get_y.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the rotation angle on the Z axis, in degrees.
     * @return the rotation angle
     */
    public float getZ() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_euler_get_z.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Initializes a {@link Euler} using the given angles.
     * <p>
     * The order of the rotations is {@link EulerOrder#DEFAULT}.
     * @param x rotation angle on the X axis, in degrees
     * @param y rotation angle on the Y axis, in degrees
     * @param z rotation angle on the Z axis, in degrees
     * @return the initialized {@link Euler}
     */
    public @NotNull org.gtk.graphene.Euler init(float x, float y, float z) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_euler_init.invokeExact(
                    handle(),
                    x,
                    y,
                    z);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Euler(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes a {@link Euler} using the angles and order of
     * another {@link Euler}.
     * <p>
     * If the {@link Euler} {@code src} is {@code null}, this function is equivalent
     * to calling graphene_euler_init() with all angles set to 0.
     * @param src a {@link Euler}
     * @return the initialized {@link Euler}
     */
    public @NotNull org.gtk.graphene.Euler initFromEuler(@Nullable org.gtk.graphene.Euler src) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_euler_init_from_euler.invokeExact(
                    handle(),
                    (Addressable) (src == null ? MemoryAddress.NULL : src.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Euler(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes a {@link Euler} using the given rotation matrix.
     * <p>
     * If the {@link Matrix} {@code m} is {@code null}, the {@link Euler} will
     * be initialized with all angles set to 0.
     * @param m a rotation matrix
     * @param order the order used to apply the rotations
     * @return the initialized {@link Euler}
     */
    public @NotNull org.gtk.graphene.Euler initFromMatrix(@Nullable org.gtk.graphene.Matrix m, @NotNull org.gtk.graphene.EulerOrder order) {
        java.util.Objects.requireNonNull(order, "Parameter 'order' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_euler_init_from_matrix.invokeExact(
                    handle(),
                    (Addressable) (m == null ? MemoryAddress.NULL : m.handle()),
                    order.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Euler(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes a {@link Euler} using the given normalized quaternion.
     * <p>
     * If the {@link Quaternion} {@code q} is {@code null}, the {@link Euler} will
     * be initialized with all angles set to 0.
     * @param q a normalized {@link Quaternion}
     * @param order the order used to apply the rotations
     * @return the initialized {@link Euler}
     */
    public @NotNull org.gtk.graphene.Euler initFromQuaternion(@Nullable org.gtk.graphene.Quaternion q, @NotNull org.gtk.graphene.EulerOrder order) {
        java.util.Objects.requireNonNull(order, "Parameter 'order' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_euler_init_from_quaternion.invokeExact(
                    handle(),
                    (Addressable) (q == null ? MemoryAddress.NULL : q.handle()),
                    order.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Euler(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes a {@link Euler} using the given angles
     * and order of rotation.
     * @param x rotation angle on the X axis, in radians
     * @param y rotation angle on the Y axis, in radians
     * @param z rotation angle on the Z axis, in radians
     * @param order order of rotations
     * @return the initialized {@link Euler}
     */
    public @NotNull org.gtk.graphene.Euler initFromRadians(float x, float y, float z, @NotNull org.gtk.graphene.EulerOrder order) {
        java.util.Objects.requireNonNull(order, "Parameter 'order' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_euler_init_from_radians.invokeExact(
                    handle(),
                    x,
                    y,
                    z,
                    order.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Euler(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes a {@link Euler} using the angles contained in a
     * {@link Vec3}.
     * <p>
     * If the {@link Vec3} {@code v} is {@code null}, the {@link Euler} will be
     * initialized with all angles set to 0.
     * @param v a {@link Vec3} containing the rotation
     *   angles in degrees
     * @param order the order used to apply the rotations
     * @return the initialized {@link Euler}
     */
    public @NotNull org.gtk.graphene.Euler initFromVec3(@Nullable org.gtk.graphene.Vec3 v, @NotNull org.gtk.graphene.EulerOrder order) {
        java.util.Objects.requireNonNull(order, "Parameter 'order' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_euler_init_from_vec3.invokeExact(
                    handle(),
                    (Addressable) (v == null ? MemoryAddress.NULL : v.handle()),
                    order.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Euler(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes a {@link Euler} with the given angles and {@code order}.
     * @param x rotation angle on the X axis, in degrees
     * @param y rotation angle on the Y axis, in degrees
     * @param z rotation angle on the Z axis, in degrees
     * @param order the order used to apply the rotations
     * @return the initialized {@link Euler}
     */
    public @NotNull org.gtk.graphene.Euler initWithOrder(float x, float y, float z, @NotNull org.gtk.graphene.EulerOrder order) {
        java.util.Objects.requireNonNull(order, "Parameter 'order' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_euler_init_with_order.invokeExact(
                    handle(),
                    x,
                    y,
                    z,
                    order.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Euler(RESULT, Ownership.NONE);
    }
    
    /**
     * Reorders a {@link Euler} using {@code order}.
     * <p>
     * This function is equivalent to creating a {@link Quaternion} from the
     * given {@link Euler}, and then converting the quaternion into another
     * {@link Euler}.
     * @param order the new order
     * @param res return location for the reordered
     *   {@link Euler}
     */
    public void reorder(@NotNull org.gtk.graphene.EulerOrder order, @NotNull org.gtk.graphene.Euler res) {
        java.util.Objects.requireNonNull(order, "Parameter 'order' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_euler_reorder.invokeExact(
                    handle(),
                    order.getValue(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Converts a {@link Euler} into a transformation matrix expressing
     * the extrinsic composition of rotations described by the Euler angles.
     * <p>
     * The rotations are applied over the reference frame axes in the order
     * associated with the {@link Euler}; for instance, if the order
     * used to initialize {@code e} is {@link EulerOrder#XYZ}:
     * <p>
     *  * the first rotation moves the body around the X axis with
     *    an angle φ
     *  * the second rotation moves the body around the Y axis with
     *    an angle of ϑ
     *  * the third rotation moves the body around the Z axis with
     *    an angle of ψ
     * <p>
     * The rotation sign convention is right-handed, to preserve compatibility
     * between Euler-based, quaternion-based, and angle-axis-based rotations.
     * @param res return location for a {@link Matrix}
     */
    public void toMatrix(@NotNull org.gtk.graphene.Matrix res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_euler_to_matrix.invokeExact(
                    handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Converts a {@link Euler} into a {@link Quaternion}.
     * @param res return location for a {@link Quaternion}
     */
    public void toQuaternion(@NotNull org.gtk.graphene.Quaternion res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_euler_to_quaternion.invokeExact(
                    handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the angles of a {@link Euler} and initializes a
     * {@link Vec3} with them.
     * @param res return location for a {@link Vec3}
     */
    public void toVec3(@NotNull org.gtk.graphene.Vec3 res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_euler_to_vec3.invokeExact(
                    handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle graphene_euler_alloc = Interop.downcallHandle(
            "graphene_euler_alloc",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_euler_equal = Interop.downcallHandle(
            "graphene_euler_equal",
            FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_euler_free = Interop.downcallHandle(
            "graphene_euler_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_euler_get_alpha = Interop.downcallHandle(
            "graphene_euler_get_alpha",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_euler_get_beta = Interop.downcallHandle(
            "graphene_euler_get_beta",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_euler_get_gamma = Interop.downcallHandle(
            "graphene_euler_get_gamma",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_euler_get_order = Interop.downcallHandle(
            "graphene_euler_get_order",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_euler_get_x = Interop.downcallHandle(
            "graphene_euler_get_x",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_euler_get_y = Interop.downcallHandle(
            "graphene_euler_get_y",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_euler_get_z = Interop.downcallHandle(
            "graphene_euler_get_z",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_euler_init = Interop.downcallHandle(
            "graphene_euler_init",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT),
            false
        );
        
        private static final MethodHandle graphene_euler_init_from_euler = Interop.downcallHandle(
            "graphene_euler_init_from_euler",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_euler_init_from_matrix = Interop.downcallHandle(
            "graphene_euler_init_from_matrix",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle graphene_euler_init_from_quaternion = Interop.downcallHandle(
            "graphene_euler_init_from_quaternion",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle graphene_euler_init_from_radians = Interop.downcallHandle(
            "graphene_euler_init_from_radians",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle graphene_euler_init_from_vec3 = Interop.downcallHandle(
            "graphene_euler_init_from_vec3",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle graphene_euler_init_with_order = Interop.downcallHandle(
            "graphene_euler_init_with_order",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle graphene_euler_reorder = Interop.downcallHandle(
            "graphene_euler_reorder",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_euler_to_matrix = Interop.downcallHandle(
            "graphene_euler_to_matrix",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_euler_to_quaternion = Interop.downcallHandle(
            "graphene_euler_to_quaternion",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_euler_to_vec3 = Interop.downcallHandle(
            "graphene_euler_to_vec3",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private Euler struct;
        
         /**
         * A {@link Euler.Build} object constructs a {@link Euler} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = Euler.allocate();
        }
        
         /**
         * Finish building the {@link Euler} struct.
         * @return A new instance of {@code Euler} with the fields 
         *         that were set in the Build object.
         */
        public Euler construct() {
            return struct;
        }
        
        public Build setAngles(org.gtk.graphene.Vec3 angles) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("angles"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (angles == null ? MemoryAddress.NULL : angles.handle()));
            return this;
        }
        
        public Build setOrder(org.gtk.graphene.EulerOrder order) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("order"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (order == null ? MemoryAddress.NULL : order.getValue()));
            return this;
        }
    }
}
