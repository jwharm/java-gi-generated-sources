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
 */
public class Euler extends io.github.jwharm.javagi.ResourceBase {

    public Euler(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle graphene_euler_alloc = Interop.downcallHandle(
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
    
    private static final MethodHandle graphene_euler_equal = Interop.downcallHandle(
        "graphene_euler_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if two {@link Euler} are equal.
     */
    public boolean equal(@NotNull Euler b) {
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_euler_equal.invokeExact(handle(), b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_euler_free = Interop.downcallHandle(
        "graphene_euler_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the resources allocated by graphene_euler_alloc().
     */
    public @NotNull void free() {
        try {
            graphene_euler_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle graphene_euler_get_alpha = Interop.downcallHandle(
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
        float RESULT;
        try {
            RESULT = (float) graphene_euler_get_alpha.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_euler_get_beta = Interop.downcallHandle(
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
        float RESULT;
        try {
            RESULT = (float) graphene_euler_get_beta.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_euler_get_gamma = Interop.downcallHandle(
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
        float RESULT;
        try {
            RESULT = (float) graphene_euler_get_gamma.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_euler_get_order = Interop.downcallHandle(
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
    public @NotNull EulerOrder getOrder() {
        int RESULT;
        try {
            RESULT = (int) graphene_euler_get_order.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new EulerOrder(RESULT);
    }
    
    private static final MethodHandle graphene_euler_get_x = Interop.downcallHandle(
        "graphene_euler_get_x",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the rotation angle on the X axis, in degrees.
     */
    public float getX() {
        float RESULT;
        try {
            RESULT = (float) graphene_euler_get_x.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_euler_get_y = Interop.downcallHandle(
        "graphene_euler_get_y",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the rotation angle on the Y axis, in degrees.
     */
    public float getY() {
        float RESULT;
        try {
            RESULT = (float) graphene_euler_get_y.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_euler_get_z = Interop.downcallHandle(
        "graphene_euler_get_z",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the rotation angle on the Z axis, in degrees.
     */
    public float getZ() {
        float RESULT;
        try {
            RESULT = (float) graphene_euler_get_z.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_euler_init = Interop.downcallHandle(
        "graphene_euler_init",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Initializes a {@link Euler} using the given angles.
     * <p>
     * The order of the rotations is {@link EulerOrder#DEFAULT}.
     */
    public @NotNull Euler init(@NotNull float x, @NotNull float y, @NotNull float z) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_euler_init.invokeExact(handle(), x, y, z);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Euler(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_euler_init_from_euler = Interop.downcallHandle(
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
    public @NotNull Euler initFromEuler(@Nullable Euler src) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_euler_init_from_euler.invokeExact(handle(), src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Euler(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_euler_init_from_matrix = Interop.downcallHandle(
        "graphene_euler_init_from_matrix",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Initializes a {@link Euler} using the given rotation matrix.
     * <p>
     * If the {@link Matrix} @m is {@code null}, the {@link Euler} will
     * be initialized with all angles set to 0.
     */
    public @NotNull Euler initFromMatrix(@Nullable Matrix m, @NotNull EulerOrder order) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_euler_init_from_matrix.invokeExact(handle(), m.handle(), order.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Euler(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_euler_init_from_quaternion = Interop.downcallHandle(
        "graphene_euler_init_from_quaternion",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Initializes a {@link Euler} using the given normalized quaternion.
     * <p>
     * If the {@link Quaternion} @q is {@code null}, the {@link Euler} will
     * be initialized with all angles set to 0.
     */
    public @NotNull Euler initFromQuaternion(@Nullable Quaternion q, @NotNull EulerOrder order) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_euler_init_from_quaternion.invokeExact(handle(), q.handle(), order.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Euler(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_euler_init_from_radians = Interop.downcallHandle(
        "graphene_euler_init_from_radians",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Initializes a {@link Euler} using the given angles
     * and order of rotation.
     */
    public @NotNull Euler initFromRadians(@NotNull float x, @NotNull float y, @NotNull float z, @NotNull EulerOrder order) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_euler_init_from_radians.invokeExact(handle(), x, y, z, order.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Euler(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_euler_init_from_vec3 = Interop.downcallHandle(
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
    public @NotNull Euler initFromVec3(@Nullable Vec3 v, @NotNull EulerOrder order) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_euler_init_from_vec3.invokeExact(handle(), v.handle(), order.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Euler(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_euler_init_with_order = Interop.downcallHandle(
        "graphene_euler_init_with_order",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Initializes a {@link Euler} with the given angles and {@code order}.
     */
    public @NotNull Euler initWithOrder(@NotNull float x, @NotNull float y, @NotNull float z, @NotNull EulerOrder order) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_euler_init_with_order.invokeExact(handle(), x, y, z, order.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Euler(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_euler_reorder = Interop.downcallHandle(
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
    public @NotNull void reorder(@NotNull EulerOrder order, @NotNull Out<Euler> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_euler_reorder.invokeExact(handle(), order.getValue(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Euler(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_euler_to_matrix = Interop.downcallHandle(
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
    public @NotNull void toMatrix(@NotNull Out<Matrix> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_euler_to_matrix.invokeExact(handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Matrix(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_euler_to_quaternion = Interop.downcallHandle(
        "graphene_euler_to_quaternion",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a {@link Euler} into a {@link Quaternion}.
     */
    public @NotNull void toQuaternion(@NotNull Out<Quaternion> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_euler_to_quaternion.invokeExact(handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Quaternion(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_euler_to_vec3 = Interop.downcallHandle(
        "graphene_euler_to_vec3",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the angles of a {@link Euler} and initializes a
     * {@link Vec3} with them.
     */
    public @NotNull void toVec3(@NotNull Out<Vec3> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_euler_to_vec3.invokeExact(handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Vec3(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
}
