package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    private static final MethodHandle graphene_quaternion_alloc = Interop.downcallHandle(
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
    
    private static final MethodHandle graphene_quaternion_add = Interop.downcallHandle(
        "graphene_quaternion_add",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds two {@link Quaternion} @a and @b.
     */
    public @NotNull void add(@NotNull Quaternion b, @NotNull Out<Quaternion> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_quaternion_add.invokeExact(handle(), b.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Quaternion(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_quaternion_dot = Interop.downcallHandle(
        "graphene_quaternion_dot",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the dot product of two {@link Quaternion}.
     */
    public float dot(@NotNull Quaternion b) {
        float RESULT;
        try {
            RESULT = (float) graphene_quaternion_dot.invokeExact(handle(), b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_quaternion_equal = Interop.downcallHandle(
        "graphene_quaternion_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the given quaternions are equal.
     */
    public boolean equal(@NotNull Quaternion b) {
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_quaternion_equal.invokeExact(handle(), b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_quaternion_free = Interop.downcallHandle(
        "graphene_quaternion_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Releases the resources allocated by graphene_quaternion_alloc().
     */
    public @NotNull void free() {
        try {
            graphene_quaternion_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle graphene_quaternion_init = Interop.downcallHandle(
        "graphene_quaternion_init",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Initializes a {@link Quaternion} using the given four values.
     */
    public @NotNull Quaternion init(@NotNull float x, @NotNull float y, @NotNull float z, @NotNull float w) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_quaternion_init.invokeExact(handle(), x, y, z, w);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Quaternion(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_quaternion_init_from_angle_vec3 = Interop.downcallHandle(
        "graphene_quaternion_init_from_angle_vec3",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Quaternion} using an {@code angle} on a
     * specific {@code axis}.
     */
    public @NotNull Quaternion initFromAngleVec3(@NotNull float angle, @NotNull Vec3 axis) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_quaternion_init_from_angle_vec3.invokeExact(handle(), angle, axis.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Quaternion(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_quaternion_init_from_angles = Interop.downcallHandle(
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
    public @NotNull Quaternion initFromAngles(@NotNull float degX, @NotNull float degY, @NotNull float degZ) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_quaternion_init_from_angles.invokeExact(handle(), degX, degY, degZ);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Quaternion(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_quaternion_init_from_euler = Interop.downcallHandle(
        "graphene_quaternion_init_from_euler",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Quaternion} using the given {@link Euler}.
     */
    public @NotNull Quaternion initFromEuler(@NotNull Euler e) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_quaternion_init_from_euler.invokeExact(handle(), e.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Quaternion(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_quaternion_init_from_matrix = Interop.downcallHandle(
        "graphene_quaternion_init_from_matrix",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Quaternion} using the rotation components
     * of a transformation matrix.
     */
    public @NotNull Quaternion initFromMatrix(@NotNull Matrix m) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_quaternion_init_from_matrix.invokeExact(handle(), m.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Quaternion(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_quaternion_init_from_quaternion = Interop.downcallHandle(
        "graphene_quaternion_init_from_quaternion",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Quaternion} with the values from {@code src}.
     */
    public @NotNull Quaternion initFromQuaternion(@NotNull Quaternion src) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_quaternion_init_from_quaternion.invokeExact(handle(), src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Quaternion(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_quaternion_init_from_radians = Interop.downcallHandle(
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
    public @NotNull Quaternion initFromRadians(@NotNull float radX, @NotNull float radY, @NotNull float radZ) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_quaternion_init_from_radians.invokeExact(handle(), radX, radY, radZ);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Quaternion(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_quaternion_init_from_vec4 = Interop.downcallHandle(
        "graphene_quaternion_init_from_vec4",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Quaternion} with the values from {@code src}.
     */
    public @NotNull Quaternion initFromVec4(@NotNull Vec4 src) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_quaternion_init_from_vec4.invokeExact(handle(), src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Quaternion(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_quaternion_init_identity = Interop.downcallHandle(
        "graphene_quaternion_init_identity",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Quaternion} using the identity
     * transformation.
     */
    public @NotNull Quaternion initIdentity() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_quaternion_init_identity.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Quaternion(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_quaternion_invert = Interop.downcallHandle(
        "graphene_quaternion_invert",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inverts a {@link Quaternion}, and returns the conjugate
     * quaternion of @q.
     */
    public @NotNull void invert(@NotNull Out<Quaternion> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_quaternion_invert.invokeExact(handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Quaternion(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_quaternion_multiply = Interop.downcallHandle(
        "graphene_quaternion_multiply",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Multiplies two {@link Quaternion} @a and @b.
     */
    public @NotNull void multiply(@NotNull Quaternion b, @NotNull Out<Quaternion> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_quaternion_multiply.invokeExact(handle(), b.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Quaternion(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_quaternion_normalize = Interop.downcallHandle(
        "graphene_quaternion_normalize",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Normalizes a {@link Quaternion}.
     */
    public @NotNull void normalize(@NotNull Out<Quaternion> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_quaternion_normalize.invokeExact(handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Quaternion(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_quaternion_scale = Interop.downcallHandle(
        "graphene_quaternion_scale",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Scales all the elements of a {@link Quaternion} @q using
     * the given scalar factor.
     */
    public @NotNull void scale(@NotNull float factor, @NotNull Out<Quaternion> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_quaternion_scale.invokeExact(handle(), factor, (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Quaternion(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_quaternion_slerp = Interop.downcallHandle(
        "graphene_quaternion_slerp",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Interpolates between the two given quaternions using a spherical
     * linear interpolation, or <a href="http://en.wikipedia.org/wiki/Slerp">SLERP</a>,
     * using the given interpolation {@code factor}.
     */
    public @NotNull void slerp(@NotNull Quaternion b, @NotNull float factor, @NotNull Out<Quaternion> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_quaternion_slerp.invokeExact(handle(), b.handle(), factor, (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Quaternion(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_quaternion_to_angle_vec3 = Interop.downcallHandle(
        "graphene_quaternion_to_angle_vec3",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a quaternion into an {@code angle}, {@code axis} pair.
     */
    public @NotNull void toAngleVec3(@NotNull Out<Float> angle, @NotNull Out<Vec3> axis) {
        MemorySegment anglePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        MemorySegment axisPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_quaternion_to_angle_vec3.invokeExact(handle(), (Addressable) anglePOINTER.address(), (Addressable) axisPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        angle.set(anglePOINTER.get(ValueLayout.JAVA_FLOAT, 0));
        axis.set(new Vec3(Refcounted.get(axisPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_quaternion_to_angles = Interop.downcallHandle(
        "graphene_quaternion_to_angles",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a {@link Quaternion} to its corresponding rotations
     * on the <a href="http://en.wikipedia.org/wiki/Euler_angles">Euler angles</a>
     * on each axis.
     */
    public @NotNull void toAngles(@NotNull Out<Float> degX, @NotNull Out<Float> degY, @NotNull Out<Float> degZ) {
        MemorySegment degXPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        MemorySegment degYPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        MemorySegment degZPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        try {
            graphene_quaternion_to_angles.invokeExact(handle(), (Addressable) degXPOINTER.address(), (Addressable) degYPOINTER.address(), (Addressable) degZPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        degX.set(degXPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
        degY.set(degYPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
        degZ.set(degZPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
    }
    
    private static final MethodHandle graphene_quaternion_to_matrix = Interop.downcallHandle(
        "graphene_quaternion_to_matrix",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a quaternion into a transformation matrix expressing
     * the rotation defined by the {@link Quaternion}.
     */
    public @NotNull void toMatrix(@NotNull Out<Matrix> m) {
        MemorySegment mPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_quaternion_to_matrix.invokeExact(handle(), (Addressable) mPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        m.set(new Matrix(Refcounted.get(mPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_quaternion_to_radians = Interop.downcallHandle(
        "graphene_quaternion_to_radians",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a {@link Quaternion} to its corresponding rotations
     * on the <a href="http://en.wikipedia.org/wiki/Euler_angles">Euler angles</a>
     * on each axis.
     */
    public @NotNull void toRadians(@NotNull Out<Float> radX, @NotNull Out<Float> radY, @NotNull Out<Float> radZ) {
        MemorySegment radXPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        MemorySegment radYPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        MemorySegment radZPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        try {
            graphene_quaternion_to_radians.invokeExact(handle(), (Addressable) radXPOINTER.address(), (Addressable) radYPOINTER.address(), (Addressable) radZPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        radX.set(radXPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
        radY.set(radYPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
        radZ.set(radZPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
    }
    
    private static final MethodHandle graphene_quaternion_to_vec4 = Interop.downcallHandle(
        "graphene_quaternion_to_vec4",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Copies the components of a {@link Quaternion} into a
     * {@link Vec4}.
     */
    public @NotNull void toVec4(@NotNull Out<Vec4> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_quaternion_to_vec4.invokeExact(handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Vec4(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
}
