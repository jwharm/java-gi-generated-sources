package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A quaternion.
 * <p>
 * The contents of the {@link Quaternion} structure are private
 * and should never be accessed directly.
 */
public class Quaternion extends io.github.jwharm.javagi.ResourceBase {

    public Quaternion(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle graphene_quaternion_alloc = Interop.downcallHandle(
        "graphene_quaternion_alloc",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructAlloc() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) graphene_quaternion_alloc.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Allocates a new {@link Quaternion}.
     * <p>
     * The contents of the returned value are undefined.
     */
    public static Quaternion alloc() {
        return new Quaternion(constructAlloc());
    }
    
    static final MethodHandle graphene_quaternion_add = Interop.downcallHandle(
        "graphene_quaternion_add",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds two {@link Quaternion} @a and @b.
     */
    public void add(Quaternion b, Quaternion res) {
        try {
            graphene_quaternion_add.invokeExact(handle(), b.handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_quaternion_dot = Interop.downcallHandle(
        "graphene_quaternion_dot",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the dot product of two {@link Quaternion}.
     */
    public float dot(Quaternion b) {
        try {
            var RESULT = (float) graphene_quaternion_dot.invokeExact(handle(), b.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_quaternion_equal = Interop.downcallHandle(
        "graphene_quaternion_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the given quaternions are equal.
     */
    public boolean equal(Quaternion b) {
        try {
            var RESULT = (boolean) graphene_quaternion_equal.invokeExact(handle(), b.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_quaternion_free = Interop.downcallHandle(
        "graphene_quaternion_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Releases the resources allocated by graphene_quaternion_alloc().
     */
    public void free() {
        try {
            graphene_quaternion_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_quaternion_init = Interop.downcallHandle(
        "graphene_quaternion_init",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Initializes a {@link Quaternion} using the given four values.
     */
    public Quaternion init(float x, float y, float z, float w) {
        try {
            var RESULT = (MemoryAddress) graphene_quaternion_init.invokeExact(handle(), x, y, z, w);
            return new Quaternion(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_quaternion_init_from_angle_vec3 = Interop.downcallHandle(
        "graphene_quaternion_init_from_angle_vec3",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Quaternion} using an {@code angle} on a
     * specific {@code axis}.
     */
    public Quaternion initFromAngleVec3(float angle, Vec3 axis) {
        try {
            var RESULT = (MemoryAddress) graphene_quaternion_init_from_angle_vec3.invokeExact(handle(), angle, axis.handle());
            return new Quaternion(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_quaternion_init_from_angles = Interop.downcallHandle(
        "graphene_quaternion_init_from_angles",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Initializes a {@link Quaternion} using the values of
     * the <a href="http://en.wikipedia.org/wiki/Euler_angles">Euler angles</a>
     * on each axis.
     * <p>
     * See also: graphene_quaternion_init_from_euler()
     */
    public Quaternion initFromAngles(float degX, float degY, float degZ) {
        try {
            var RESULT = (MemoryAddress) graphene_quaternion_init_from_angles.invokeExact(handle(), degX, degY, degZ);
            return new Quaternion(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_quaternion_init_from_euler = Interop.downcallHandle(
        "graphene_quaternion_init_from_euler",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Quaternion} using the given {@link Euler}.
     */
    public Quaternion initFromEuler(Euler e) {
        try {
            var RESULT = (MemoryAddress) graphene_quaternion_init_from_euler.invokeExact(handle(), e.handle());
            return new Quaternion(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_quaternion_init_from_matrix = Interop.downcallHandle(
        "graphene_quaternion_init_from_matrix",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Quaternion} using the rotation components
     * of a transformation matrix.
     */
    public Quaternion initFromMatrix(Matrix m) {
        try {
            var RESULT = (MemoryAddress) graphene_quaternion_init_from_matrix.invokeExact(handle(), m.handle());
            return new Quaternion(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_quaternion_init_from_quaternion = Interop.downcallHandle(
        "graphene_quaternion_init_from_quaternion",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Quaternion} with the values from {@code src}.
     */
    public Quaternion initFromQuaternion(Quaternion src) {
        try {
            var RESULT = (MemoryAddress) graphene_quaternion_init_from_quaternion.invokeExact(handle(), src.handle());
            return new Quaternion(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_quaternion_init_from_radians = Interop.downcallHandle(
        "graphene_quaternion_init_from_radians",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Initializes a {@link Quaternion} using the values of
     * the <a href="http://en.wikipedia.org/wiki/Euler_angles">Euler angles</a>
     * on each axis.
     * <p>
     * See also: graphene_quaternion_init_from_euler()
     */
    public Quaternion initFromRadians(float radX, float radY, float radZ) {
        try {
            var RESULT = (MemoryAddress) graphene_quaternion_init_from_radians.invokeExact(handle(), radX, radY, radZ);
            return new Quaternion(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_quaternion_init_from_vec4 = Interop.downcallHandle(
        "graphene_quaternion_init_from_vec4",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Quaternion} with the values from {@code src}.
     */
    public Quaternion initFromVec4(Vec4 src) {
        try {
            var RESULT = (MemoryAddress) graphene_quaternion_init_from_vec4.invokeExact(handle(), src.handle());
            return new Quaternion(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_quaternion_init_identity = Interop.downcallHandle(
        "graphene_quaternion_init_identity",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Quaternion} using the identity
     * transformation.
     */
    public Quaternion initIdentity() {
        try {
            var RESULT = (MemoryAddress) graphene_quaternion_init_identity.invokeExact(handle());
            return new Quaternion(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_quaternion_invert = Interop.downcallHandle(
        "graphene_quaternion_invert",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inverts a {@link Quaternion}, and returns the conjugate
     * quaternion of @q.
     */
    public void invert(Quaternion res) {
        try {
            graphene_quaternion_invert.invokeExact(handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_quaternion_multiply = Interop.downcallHandle(
        "graphene_quaternion_multiply",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Multiplies two {@link Quaternion} @a and @b.
     */
    public void multiply(Quaternion b, Quaternion res) {
        try {
            graphene_quaternion_multiply.invokeExact(handle(), b.handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_quaternion_normalize = Interop.downcallHandle(
        "graphene_quaternion_normalize",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Normalizes a {@link Quaternion}.
     */
    public void normalize(Quaternion res) {
        try {
            graphene_quaternion_normalize.invokeExact(handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_quaternion_scale = Interop.downcallHandle(
        "graphene_quaternion_scale",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Scales all the elements of a {@link Quaternion} @q using
     * the given scalar factor.
     */
    public void scale(float factor, Quaternion res) {
        try {
            graphene_quaternion_scale.invokeExact(handle(), factor, res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_quaternion_slerp = Interop.downcallHandle(
        "graphene_quaternion_slerp",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Interpolates between the two given quaternions using a spherical
     * linear interpolation, or <a href="http://en.wikipedia.org/wiki/Slerp">SLERP</a>,
     * using the given interpolation {@code factor}.
     */
    public void slerp(Quaternion b, float factor, Quaternion res) {
        try {
            graphene_quaternion_slerp.invokeExact(handle(), b.handle(), factor, res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_quaternion_to_angle_vec3 = Interop.downcallHandle(
        "graphene_quaternion_to_angle_vec3",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a quaternion into an {@code angle}, {@code axis} pair.
     */
    public void toAngleVec3(PointerFloat angle, Vec3 axis) {
        try {
            graphene_quaternion_to_angle_vec3.invokeExact(handle(), angle.handle(), axis.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_quaternion_to_angles = Interop.downcallHandle(
        "graphene_quaternion_to_angles",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a {@link Quaternion} to its corresponding rotations
     * on the <a href="http://en.wikipedia.org/wiki/Euler_angles">Euler angles</a>
     * on each axis.
     */
    public void toAngles(PointerFloat degX, PointerFloat degY, PointerFloat degZ) {
        try {
            graphene_quaternion_to_angles.invokeExact(handle(), degX.handle(), degY.handle(), degZ.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_quaternion_to_matrix = Interop.downcallHandle(
        "graphene_quaternion_to_matrix",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a quaternion into a transformation matrix expressing
     * the rotation defined by the {@link Quaternion}.
     */
    public void toMatrix(Matrix m) {
        try {
            graphene_quaternion_to_matrix.invokeExact(handle(), m.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_quaternion_to_radians = Interop.downcallHandle(
        "graphene_quaternion_to_radians",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a {@link Quaternion} to its corresponding rotations
     * on the <a href="http://en.wikipedia.org/wiki/Euler_angles">Euler angles</a>
     * on each axis.
     */
    public void toRadians(PointerFloat radX, PointerFloat radY, PointerFloat radZ) {
        try {
            graphene_quaternion_to_radians.invokeExact(handle(), radX.handle(), radY.handle(), radZ.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_quaternion_to_vec4 = Interop.downcallHandle(
        "graphene_quaternion_to_vec4",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Copies the components of a {@link Quaternion} into a
     * {@link Vec4}.
     */
    public void toVec4(Vec4 res) {
        try {
            graphene_quaternion_to_vec4.invokeExact(handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
