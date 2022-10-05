package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Describe a rotation using Euler angles.
 * <p>
 * The contents of the {@link Euler} structure are private
 * and should never be accessed directly.
 */
public class Euler extends io.github.jwharm.javagi.ResourceBase {

    public Euler(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle graphene_euler_alloc = Interop.downcallHandle(
        "graphene_euler_alloc",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructAlloc() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) graphene_euler_alloc.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Allocates a new {@link Euler}.
     * <p>
     * The contents of the returned structure are undefined.
     */
    public static Euler alloc() {
        return new Euler(constructAlloc());
    }
    
    static final MethodHandle graphene_euler_equal = Interop.downcallHandle(
        "graphene_euler_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if two {@link Euler} are equal.
     */
    public boolean equal(Euler b) {
        try {
            var RESULT = (boolean) graphene_euler_equal.invokeExact(handle(), b.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_euler_free = Interop.downcallHandle(
        "graphene_euler_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the resources allocated by graphene_euler_alloc().
     */
    public void free() {
        try {
            graphene_euler_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_euler_get_alpha = Interop.downcallHandle(
        "graphene_euler_get_alpha",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the first component of the Euler angle vector,
     * depending on the order of rotation.
     * <p>
     * See also: graphene_euler_get_x()
     */
    public float getAlpha() {
        try {
            var RESULT = (float) graphene_euler_get_alpha.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_euler_get_beta = Interop.downcallHandle(
        "graphene_euler_get_beta",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the second component of the Euler angle vector,
     * depending on the order of rotation.
     * <p>
     * See also: graphene_euler_get_y()
     */
    public float getBeta() {
        try {
            var RESULT = (float) graphene_euler_get_beta.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_euler_get_gamma = Interop.downcallHandle(
        "graphene_euler_get_gamma",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the third component of the Euler angle vector,
     * depending on the order of rotation.
     * <p>
     * See also: graphene_euler_get_z()
     */
    public float getGamma() {
        try {
            var RESULT = (float) graphene_euler_get_gamma.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_euler_get_order = Interop.downcallHandle(
        "graphene_euler_get_order",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the order used to apply the rotations described in the
     * {@link Euler} structure, when converting to and from other
     * structures, like {@link Quaternion} and {@link Matrix}.
     * <p>
     * This function does not return the {@link EulerOrder#DEFAULT}
     * enumeration value; it will return the effective order of rotation
     * instead.
     */
    public EulerOrder getOrder() {
        try {
            var RESULT = (int) graphene_euler_get_order.invokeExact(handle());
            return new EulerOrder(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_euler_get_x = Interop.downcallHandle(
        "graphene_euler_get_x",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the rotation angle on the X axis, in degrees.
     */
    public float getX() {
        try {
            var RESULT = (float) graphene_euler_get_x.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_euler_get_y = Interop.downcallHandle(
        "graphene_euler_get_y",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the rotation angle on the Y axis, in degrees.
     */
    public float getY() {
        try {
            var RESULT = (float) graphene_euler_get_y.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_euler_get_z = Interop.downcallHandle(
        "graphene_euler_get_z",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the rotation angle on the Z axis, in degrees.
     */
    public float getZ() {
        try {
            var RESULT = (float) graphene_euler_get_z.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_euler_init = Interop.downcallHandle(
        "graphene_euler_init",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Initializes a {@link Euler} using the given angles.
     * <p>
     * The order of the rotations is {@link EulerOrder#DEFAULT}.
     */
    public Euler init(float x, float y, float z) {
        try {
            var RESULT = (MemoryAddress) graphene_euler_init.invokeExact(handle(), x, y, z);
            return new Euler(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_euler_init_from_euler = Interop.downcallHandle(
        "graphene_euler_init_from_euler",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Euler} using the angles and order of
     * another {@link Euler}.
     * <p>
     * If the {@link Euler} {@code src} is {@code null}, this function is equivalent
     * to calling graphene_euler_init() with all angles set to 0.
     */
    public Euler initFromEuler(Euler src) {
        try {
            var RESULT = (MemoryAddress) graphene_euler_init_from_euler.invokeExact(handle(), src.handle());
            return new Euler(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_euler_init_from_matrix = Interop.downcallHandle(
        "graphene_euler_init_from_matrix",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Initializes a {@link Euler} using the given rotation matrix.
     * <p>
     * If the {@link Matrix} @m is {@code null}, the {@link Euler} will
     * be initialized with all angles set to 0.
     */
    public Euler initFromMatrix(Matrix m, EulerOrder order) {
        try {
            var RESULT = (MemoryAddress) graphene_euler_init_from_matrix.invokeExact(handle(), m.handle(), order.getValue());
            return new Euler(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_euler_init_from_quaternion = Interop.downcallHandle(
        "graphene_euler_init_from_quaternion",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Initializes a {@link Euler} using the given normalized quaternion.
     * <p>
     * If the {@link Quaternion} @q is {@code null}, the {@link Euler} will
     * be initialized with all angles set to 0.
     */
    public Euler initFromQuaternion(Quaternion q, EulerOrder order) {
        try {
            var RESULT = (MemoryAddress) graphene_euler_init_from_quaternion.invokeExact(handle(), q.handle(), order.getValue());
            return new Euler(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_euler_init_from_radians = Interop.downcallHandle(
        "graphene_euler_init_from_radians",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Initializes a {@link Euler} using the given angles
     * and order of rotation.
     */
    public Euler initFromRadians(float x, float y, float z, EulerOrder order) {
        try {
            var RESULT = (MemoryAddress) graphene_euler_init_from_radians.invokeExact(handle(), x, y, z, order.getValue());
            return new Euler(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_euler_init_from_vec3 = Interop.downcallHandle(
        "graphene_euler_init_from_vec3",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Initializes a {@link Euler} using the angles contained in a
     * {@link Vec3}.
     * <p>
     * If the {@link Vec3} @v is {@code null}, the {@link Euler} will be
     * initialized with all angles set to 0.
     */
    public Euler initFromVec3(Vec3 v, EulerOrder order) {
        try {
            var RESULT = (MemoryAddress) graphene_euler_init_from_vec3.invokeExact(handle(), v.handle(), order.getValue());
            return new Euler(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_euler_init_with_order = Interop.downcallHandle(
        "graphene_euler_init_with_order",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Initializes a {@link Euler} with the given angles and {@code order}.
     */
    public Euler initWithOrder(float x, float y, float z, EulerOrder order) {
        try {
            var RESULT = (MemoryAddress) graphene_euler_init_with_order.invokeExact(handle(), x, y, z, order.getValue());
            return new Euler(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_euler_reorder = Interop.downcallHandle(
        "graphene_euler_reorder",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Reorders a {@link Euler} using {@code order}.
     * <p>
     * This function is equivalent to creating a {@link Quaternion} from the
     * given {@link Euler}, and then converting the quaternion into another
     * {@link Euler}.
     */
    public void reorder(EulerOrder order, Euler res) {
        try {
            graphene_euler_reorder.invokeExact(handle(), order.getValue(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_euler_to_matrix = Interop.downcallHandle(
        "graphene_euler_to_matrix",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a {@link Euler} into a transformation matrix expressing
     * the extrinsic composition of rotations described by the Euler angles.
     * <p>
     * The rotations are applied over the reference frame axes in the order
     * associated with the {@link Euler}; for instance, if the order
     * used to initialize @e is {@link EulerOrder#XYZ}:
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
     */
    public void toMatrix(Matrix res) {
        try {
            graphene_euler_to_matrix.invokeExact(handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_euler_to_quaternion = Interop.downcallHandle(
        "graphene_euler_to_quaternion",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a {@link Euler} into a {@link Quaternion}.
     */
    public void toQuaternion(Quaternion res) {
        try {
            graphene_euler_to_quaternion.invokeExact(handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_euler_to_vec3 = Interop.downcallHandle(
        "graphene_euler_to_vec3",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the angles of a {@link Euler} and initializes a
     * {@link Vec3} with them.
     */
    public void toVec3(Vec3 res) {
        try {
            graphene_euler_to_vec3.invokeExact(handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
