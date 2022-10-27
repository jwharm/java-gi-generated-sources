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
 * @version 1.0
 */
public class Quaternion extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Graphene.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_FLOAT.withName("x"),
        ValueLayout.JAVA_FLOAT.withName("y"),
        ValueLayout.JAVA_FLOAT.withName("z"),
        ValueLayout.JAVA_FLOAT.withName("w")
    ).withName("graphene_quaternion_t");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public Quaternion(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static Refcounted constructAlloc() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.graphene_quaternion_alloc.invokeExact(), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocates a new {@link Quaternion}.
     * <p>
     * The contents of the returned value are undefined.
     * @return the newly allocated {@link Quaternion}
     */
    public static Quaternion alloc() {
        return new Quaternion(constructAlloc());
    }
    
    /**
     * Adds two {@link Quaternion} {@code a} and {@code b}.
     * @param b a {@link Quaternion}
     * @param res the result of the operation
     */
    public void add(@NotNull org.gtk.graphene.Quaternion b, @NotNull Out<org.gtk.graphene.Quaternion> res) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            DowncallHandles.graphene_quaternion_add.invokeExact(handle(), b.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new org.gtk.graphene.Quaternion(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    /**
     * Computes the dot product of two {@link Quaternion}.
     * @param b a {@link Quaternion}
     * @return the value of the dot products
     */
    public float dot(@NotNull org.gtk.graphene.Quaternion b) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_quaternion_dot.invokeExact(handle(), b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks whether the given quaternions are equal.
     * @param b a {@link Quaternion}
     * @return {@code true} if the quaternions are equal
     */
    public boolean equal(@NotNull org.gtk.graphene.Quaternion b) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_quaternion_equal.invokeExact(handle(), b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Releases the resources allocated by graphene_quaternion_alloc().
     */
    public void free() {
        try {
            DowncallHandles.graphene_quaternion_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Initializes a {@link Quaternion} using the given four values.
     * @param x the first component of the quaternion
     * @param y the second component of the quaternion
     * @param z the third component of the quaternion
     * @param w the fourth component of the quaternion
     * @return the initialized quaternion
     */
    public @NotNull org.gtk.graphene.Quaternion init(float x, float y, float z, float w) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_quaternion_init.invokeExact(handle(), x, y, z, w);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Quaternion(Refcounted.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link Quaternion} using an {@code angle} on a
     * specific {@code axis}.
     * @param angle the rotation on a given axis, in degrees
     * @param axis the axis of rotation, expressed as a vector
     * @return the initialized quaternion
     */
    public @NotNull org.gtk.graphene.Quaternion initFromAngleVec3(float angle, @NotNull org.gtk.graphene.Vec3 axis) {
        java.util.Objects.requireNonNull(axis, "Parameter 'axis' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_quaternion_init_from_angle_vec3.invokeExact(handle(), angle, axis.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Quaternion(Refcounted.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link Quaternion} using the values of
     * the <a href="http://en.wikipedia.org/wiki/Euler_angles">Euler angles</a>
     * on each axis.
     * <p>
     * See also: graphene_quaternion_init_from_euler()
     * @param degX rotation angle on the X axis (yaw), in degrees
     * @param degY rotation angle on the Y axis (pitch), in degrees
     * @param degZ rotation angle on the Z axis (roll), in degrees
     * @return the initialized quaternion
     */
    public @NotNull org.gtk.graphene.Quaternion initFromAngles(float degX, float degY, float degZ) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_quaternion_init_from_angles.invokeExact(handle(), degX, degY, degZ);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Quaternion(Refcounted.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link Quaternion} using the given {@link Euler}.
     * @param e a {@link Euler}
     * @return the initialized {@link Quaternion}
     */
    public @NotNull org.gtk.graphene.Quaternion initFromEuler(@NotNull org.gtk.graphene.Euler e) {
        java.util.Objects.requireNonNull(e, "Parameter 'e' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_quaternion_init_from_euler.invokeExact(handle(), e.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Quaternion(Refcounted.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link Quaternion} using the rotation components
     * of a transformation matrix.
     * @param m a {@link Matrix}
     * @return the initialized quaternion
     */
    public @NotNull org.gtk.graphene.Quaternion initFromMatrix(@NotNull org.gtk.graphene.Matrix m) {
        java.util.Objects.requireNonNull(m, "Parameter 'm' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_quaternion_init_from_matrix.invokeExact(handle(), m.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Quaternion(Refcounted.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link Quaternion} with the values from {@code src}.
     * @param src a {@link Quaternion}
     * @return the initialized quaternion
     */
    public @NotNull org.gtk.graphene.Quaternion initFromQuaternion(@NotNull org.gtk.graphene.Quaternion src) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_quaternion_init_from_quaternion.invokeExact(handle(), src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Quaternion(Refcounted.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link Quaternion} using the values of
     * the <a href="http://en.wikipedia.org/wiki/Euler_angles">Euler angles</a>
     * on each axis.
     * <p>
     * See also: graphene_quaternion_init_from_euler()
     * @param radX rotation angle on the X axis (yaw), in radians
     * @param radY rotation angle on the Y axis (pitch), in radians
     * @param radZ rotation angle on the Z axis (roll), in radians
     * @return the initialized quaternion
     */
    public @NotNull org.gtk.graphene.Quaternion initFromRadians(float radX, float radY, float radZ) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_quaternion_init_from_radians.invokeExact(handle(), radX, radY, radZ);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Quaternion(Refcounted.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link Quaternion} with the values from {@code src}.
     * @param src a {@link Vec4}
     * @return the initialized quaternion
     */
    public @NotNull org.gtk.graphene.Quaternion initFromVec4(@NotNull org.gtk.graphene.Vec4 src) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_quaternion_init_from_vec4.invokeExact(handle(), src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Quaternion(Refcounted.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link Quaternion} using the identity
     * transformation.
     * @return the initialized quaternion
     */
    public @NotNull org.gtk.graphene.Quaternion initIdentity() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_quaternion_init_identity.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Quaternion(Refcounted.get(RESULT, false));
    }
    
    /**
     * Inverts a {@link Quaternion}, and returns the conjugate
     * quaternion of {@code q}.
     * @param res return location for the inverted
     *   quaternion
     */
    public void invert(@NotNull Out<org.gtk.graphene.Quaternion> res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            DowncallHandles.graphene_quaternion_invert.invokeExact(handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new org.gtk.graphene.Quaternion(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    /**
     * Multiplies two {@link Quaternion} {@code a} and {@code b}.
     * @param b a {@link Quaternion}
     * @param res the result of the operation
     */
    public void multiply(@NotNull org.gtk.graphene.Quaternion b, @NotNull Out<org.gtk.graphene.Quaternion> res) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            DowncallHandles.graphene_quaternion_multiply.invokeExact(handle(), b.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new org.gtk.graphene.Quaternion(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    /**
     * Normalizes a {@link Quaternion}.
     * @param res return location for the normalized
     *   quaternion
     */
    public void normalize(@NotNull Out<org.gtk.graphene.Quaternion> res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            DowncallHandles.graphene_quaternion_normalize.invokeExact(handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new org.gtk.graphene.Quaternion(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    /**
     * Scales all the elements of a {@link Quaternion} {@code q} using
     * the given scalar factor.
     * @param factor a scaling factor
     * @param res the result of the operation
     */
    public void scale(float factor, @NotNull Out<org.gtk.graphene.Quaternion> res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            DowncallHandles.graphene_quaternion_scale.invokeExact(handle(), factor, (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new org.gtk.graphene.Quaternion(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    /**
     * Interpolates between the two given quaternions using a spherical
     * linear interpolation, or <a href="http://en.wikipedia.org/wiki/Slerp">SLERP</a>,
     * using the given interpolation {@code factor}.
     * @param b a {@link Quaternion}
     * @param factor the linear interpolation factor
     * @param res return location for the interpolated
     *   quaternion
     */
    public void slerp(@NotNull org.gtk.graphene.Quaternion b, float factor, @NotNull Out<org.gtk.graphene.Quaternion> res) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            DowncallHandles.graphene_quaternion_slerp.invokeExact(handle(), b.handle(), factor, (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new org.gtk.graphene.Quaternion(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    /**
     * Converts a quaternion into an {@code angle}, {@code axis} pair.
     * @param angle return location for the angle, in degrees
     * @param axis return location for the rotation axis
     */
    public void toAngleVec3(Out<Float> angle, @NotNull Out<org.gtk.graphene.Vec3> axis) {
        java.util.Objects.requireNonNull(angle, "Parameter 'angle' must not be null");
        java.util.Objects.requireNonNull(axis, "Parameter 'axis' must not be null");
        MemorySegment anglePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        MemorySegment axisPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            DowncallHandles.graphene_quaternion_to_angle_vec3.invokeExact(handle(), (Addressable) anglePOINTER.address(), (Addressable) axisPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        angle.set(anglePOINTER.get(ValueLayout.JAVA_FLOAT, 0));
        axis.set(new org.gtk.graphene.Vec3(Refcounted.get(axisPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    /**
     * Converts a {@link Quaternion} to its corresponding rotations
     * on the <a href="http://en.wikipedia.org/wiki/Euler_angles">Euler angles</a>
     * on each axis.
     * @param degX return location for the rotation angle on
     *   the X axis (yaw), in degrees
     * @param degY return location for the rotation angle on
     *   the Y axis (pitch), in degrees
     * @param degZ return location for the rotation angle on
     *   the Z axis (roll), in degrees
     */
    public void toAngles(Out<Float> degX, Out<Float> degY, Out<Float> degZ) {
        java.util.Objects.requireNonNull(degX, "Parameter 'degX' must not be null");
        java.util.Objects.requireNonNull(degY, "Parameter 'degY' must not be null");
        java.util.Objects.requireNonNull(degZ, "Parameter 'degZ' must not be null");
        MemorySegment degXPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        MemorySegment degYPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        MemorySegment degZPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        try {
            DowncallHandles.graphene_quaternion_to_angles.invokeExact(handle(), (Addressable) degXPOINTER.address(), (Addressable) degYPOINTER.address(), (Addressable) degZPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        degX.set(degXPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
        degY.set(degYPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
        degZ.set(degZPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
    }
    
    /**
     * Converts a quaternion into a transformation matrix expressing
     * the rotation defined by the {@link Quaternion}.
     * @param m a {@link Matrix}
     */
    public void toMatrix(@NotNull Out<org.gtk.graphene.Matrix> m) {
        java.util.Objects.requireNonNull(m, "Parameter 'm' must not be null");
        MemorySegment mPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            DowncallHandles.graphene_quaternion_to_matrix.invokeExact(handle(), (Addressable) mPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        m.set(new org.gtk.graphene.Matrix(Refcounted.get(mPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    /**
     * Converts a {@link Quaternion} to its corresponding rotations
     * on the <a href="http://en.wikipedia.org/wiki/Euler_angles">Euler angles</a>
     * on each axis.
     * @param radX return location for the rotation angle on
     *   the X axis (yaw), in radians
     * @param radY return location for the rotation angle on
     *   the Y axis (pitch), in radians
     * @param radZ return location for the rotation angle on
     *   the Z axis (roll), in radians
     */
    public void toRadians(Out<Float> radX, Out<Float> radY, Out<Float> radZ) {
        java.util.Objects.requireNonNull(radX, "Parameter 'radX' must not be null");
        java.util.Objects.requireNonNull(radY, "Parameter 'radY' must not be null");
        java.util.Objects.requireNonNull(radZ, "Parameter 'radZ' must not be null");
        MemorySegment radXPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        MemorySegment radYPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        MemorySegment radZPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        try {
            DowncallHandles.graphene_quaternion_to_radians.invokeExact(handle(), (Addressable) radXPOINTER.address(), (Addressable) radYPOINTER.address(), (Addressable) radZPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        radX.set(radXPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
        radY.set(radYPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
        radZ.set(radZPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
    }
    
    /**
     * Copies the components of a {@link Quaternion} into a
     * {@link Vec4}.
     * @param res return location for a
     *   {@link Vec4}
     */
    public void toVec4(@NotNull Out<org.gtk.graphene.Vec4> res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            DowncallHandles.graphene_quaternion_to_vec4.invokeExact(handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new org.gtk.graphene.Vec4(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle graphene_quaternion_alloc = Interop.downcallHandle(
            "graphene_quaternion_alloc",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_quaternion_add = Interop.downcallHandle(
            "graphene_quaternion_add",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_quaternion_dot = Interop.downcallHandle(
            "graphene_quaternion_dot",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_quaternion_equal = Interop.downcallHandle(
            "graphene_quaternion_equal",
            FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_quaternion_free = Interop.downcallHandle(
            "graphene_quaternion_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_quaternion_init = Interop.downcallHandle(
            "graphene_quaternion_init",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
        );
        
        private static final MethodHandle graphene_quaternion_init_from_angle_vec3 = Interop.downcallHandle(
            "graphene_quaternion_init_from_angle_vec3",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_quaternion_init_from_angles = Interop.downcallHandle(
            "graphene_quaternion_init_from_angles",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
        );
        
        private static final MethodHandle graphene_quaternion_init_from_euler = Interop.downcallHandle(
            "graphene_quaternion_init_from_euler",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_quaternion_init_from_matrix = Interop.downcallHandle(
            "graphene_quaternion_init_from_matrix",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_quaternion_init_from_quaternion = Interop.downcallHandle(
            "graphene_quaternion_init_from_quaternion",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_quaternion_init_from_radians = Interop.downcallHandle(
            "graphene_quaternion_init_from_radians",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
        );
        
        private static final MethodHandle graphene_quaternion_init_from_vec4 = Interop.downcallHandle(
            "graphene_quaternion_init_from_vec4",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_quaternion_init_identity = Interop.downcallHandle(
            "graphene_quaternion_init_identity",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_quaternion_invert = Interop.downcallHandle(
            "graphene_quaternion_invert",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_quaternion_multiply = Interop.downcallHandle(
            "graphene_quaternion_multiply",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_quaternion_normalize = Interop.downcallHandle(
            "graphene_quaternion_normalize",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_quaternion_scale = Interop.downcallHandle(
            "graphene_quaternion_scale",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_quaternion_slerp = Interop.downcallHandle(
            "graphene_quaternion_slerp",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_quaternion_to_angle_vec3 = Interop.downcallHandle(
            "graphene_quaternion_to_angle_vec3",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_quaternion_to_angles = Interop.downcallHandle(
            "graphene_quaternion_to_angles",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_quaternion_to_matrix = Interop.downcallHandle(
            "graphene_quaternion_to_matrix",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_quaternion_to_radians = Interop.downcallHandle(
            "graphene_quaternion_to_radians",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_quaternion_to_vec4 = Interop.downcallHandle(
            "graphene_quaternion_to_vec4",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
