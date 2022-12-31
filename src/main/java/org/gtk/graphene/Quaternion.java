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
public class Quaternion extends Struct {
    
    static {
        Graphene.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "graphene_quaternion_t";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_FLOAT.withName("x"),
            Interop.valueLayout.C_FLOAT.withName("y"),
            Interop.valueLayout.C_FLOAT.withName("z"),
            Interop.valueLayout.C_FLOAT.withName("w")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Quaternion}
     * @return A new, uninitialized @{link Quaternion}
     */
    public static Quaternion allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Quaternion newInstance = new Quaternion(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Quaternion proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Quaternion(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Quaternion> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Quaternion(input, ownership);
    
    private static MemoryAddress constructAlloc() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_quaternion_alloc.invokeExact();
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
        var RESULT = constructAlloc();
        return org.gtk.graphene.Quaternion.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Adds two {@link Quaternion} {@code a} and {@code b}.
     * @param b a {@link Quaternion}
     * @param res the result of the operation
     */
    public void add(org.gtk.graphene.Quaternion b, org.gtk.graphene.Quaternion res) {
        try {
            DowncallHandles.graphene_quaternion_add.invokeExact(
                    handle(),
                    b.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Computes the dot product of two {@link Quaternion}.
     * @param b a {@link Quaternion}
     * @return the value of the dot products
     */
    public float dot(org.gtk.graphene.Quaternion b) {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_quaternion_dot.invokeExact(
                    handle(),
                    b.handle());
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
    public boolean equal(org.gtk.graphene.Quaternion b) {
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_quaternion_equal.invokeExact(
                    handle(),
                    b.handle());
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
            DowncallHandles.graphene_quaternion_free.invokeExact(
                    handle());
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
    public org.gtk.graphene.Quaternion init(float x, float y, float z, float w) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_quaternion_init.invokeExact(
                    handle(),
                    x,
                    y,
                    z,
                    w);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Quaternion.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes a {@link Quaternion} using an {@code angle} on a
     * specific {@code axis}.
     * @param angle the rotation on a given axis, in degrees
     * @param axis the axis of rotation, expressed as a vector
     * @return the initialized quaternion
     */
    public org.gtk.graphene.Quaternion initFromAngleVec3(float angle, org.gtk.graphene.Vec3 axis) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_quaternion_init_from_angle_vec3.invokeExact(
                    handle(),
                    angle,
                    axis.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Quaternion.fromAddress.marshal(RESULT, Ownership.NONE);
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
    public org.gtk.graphene.Quaternion initFromAngles(float degX, float degY, float degZ) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_quaternion_init_from_angles.invokeExact(
                    handle(),
                    degX,
                    degY,
                    degZ);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Quaternion.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes a {@link Quaternion} using the given {@link Euler}.
     * @param e a {@link Euler}
     * @return the initialized {@link Quaternion}
     */
    public org.gtk.graphene.Quaternion initFromEuler(org.gtk.graphene.Euler e) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_quaternion_init_from_euler.invokeExact(
                    handle(),
                    e.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Quaternion.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes a {@link Quaternion} using the rotation components
     * of a transformation matrix.
     * @param m a {@link Matrix}
     * @return the initialized quaternion
     */
    public org.gtk.graphene.Quaternion initFromMatrix(org.gtk.graphene.Matrix m) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_quaternion_init_from_matrix.invokeExact(
                    handle(),
                    m.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Quaternion.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes a {@link Quaternion} with the values from {@code src}.
     * @param src a {@link Quaternion}
     * @return the initialized quaternion
     */
    public org.gtk.graphene.Quaternion initFromQuaternion(org.gtk.graphene.Quaternion src) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_quaternion_init_from_quaternion.invokeExact(
                    handle(),
                    src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Quaternion.fromAddress.marshal(RESULT, Ownership.NONE);
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
    public org.gtk.graphene.Quaternion initFromRadians(float radX, float radY, float radZ) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_quaternion_init_from_radians.invokeExact(
                    handle(),
                    radX,
                    radY,
                    radZ);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Quaternion.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes a {@link Quaternion} with the values from {@code src}.
     * @param src a {@link Vec4}
     * @return the initialized quaternion
     */
    public org.gtk.graphene.Quaternion initFromVec4(org.gtk.graphene.Vec4 src) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_quaternion_init_from_vec4.invokeExact(
                    handle(),
                    src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Quaternion.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes a {@link Quaternion} using the identity
     * transformation.
     * @return the initialized quaternion
     */
    public org.gtk.graphene.Quaternion initIdentity() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_quaternion_init_identity.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Quaternion.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Inverts a {@link Quaternion}, and returns the conjugate
     * quaternion of {@code q}.
     * @param res return location for the inverted
     *   quaternion
     */
    public void invert(org.gtk.graphene.Quaternion res) {
        try {
            DowncallHandles.graphene_quaternion_invert.invokeExact(
                    handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Multiplies two {@link Quaternion} {@code a} and {@code b}.
     * @param b a {@link Quaternion}
     * @param res the result of the operation
     */
    public void multiply(org.gtk.graphene.Quaternion b, org.gtk.graphene.Quaternion res) {
        try {
            DowncallHandles.graphene_quaternion_multiply.invokeExact(
                    handle(),
                    b.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Normalizes a {@link Quaternion}.
     * @param res return location for the normalized
     *   quaternion
     */
    public void normalize(org.gtk.graphene.Quaternion res) {
        try {
            DowncallHandles.graphene_quaternion_normalize.invokeExact(
                    handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Scales all the elements of a {@link Quaternion} {@code q} using
     * the given scalar factor.
     * @param factor a scaling factor
     * @param res the result of the operation
     */
    public void scale(float factor, org.gtk.graphene.Quaternion res) {
        try {
            DowncallHandles.graphene_quaternion_scale.invokeExact(
                    handle(),
                    factor,
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
    public void slerp(org.gtk.graphene.Quaternion b, float factor, org.gtk.graphene.Quaternion res) {
        try {
            DowncallHandles.graphene_quaternion_slerp.invokeExact(
                    handle(),
                    b.handle(),
                    factor,
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Converts a quaternion into an {@code angle}, {@code axis} pair.
     * @param angle return location for the angle, in degrees
     * @param axis return location for the rotation axis
     */
    public void toAngleVec3(Out<Float> angle, org.gtk.graphene.Vec3 axis) {
        MemorySegment anglePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_FLOAT);
        try {
            DowncallHandles.graphene_quaternion_to_angle_vec3.invokeExact(
                    handle(),
                    (Addressable) anglePOINTER.address(),
                    axis.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        angle.set(anglePOINTER.get(Interop.valueLayout.C_FLOAT, 0));
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
        MemorySegment degXPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_FLOAT);
        MemorySegment degYPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_FLOAT);
        MemorySegment degZPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_FLOAT);
        try {
            DowncallHandles.graphene_quaternion_to_angles.invokeExact(
                    handle(),
                    (Addressable) (degX == null ? MemoryAddress.NULL : (Addressable) degXPOINTER.address()),
                    (Addressable) (degY == null ? MemoryAddress.NULL : (Addressable) degYPOINTER.address()),
                    (Addressable) (degZ == null ? MemoryAddress.NULL : (Addressable) degZPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (degX != null) degX.set(degXPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
        if (degY != null) degY.set(degYPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
        if (degZ != null) degZ.set(degZPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
    }
    
    /**
     * Converts a quaternion into a transformation matrix expressing
     * the rotation defined by the {@link Quaternion}.
     * @param m a {@link Matrix}
     */
    public void toMatrix(org.gtk.graphene.Matrix m) {
        try {
            DowncallHandles.graphene_quaternion_to_matrix.invokeExact(
                    handle(),
                    m.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
        MemorySegment radXPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_FLOAT);
        MemorySegment radYPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_FLOAT);
        MemorySegment radZPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_FLOAT);
        try {
            DowncallHandles.graphene_quaternion_to_radians.invokeExact(
                    handle(),
                    (Addressable) (radX == null ? MemoryAddress.NULL : (Addressable) radXPOINTER.address()),
                    (Addressable) (radY == null ? MemoryAddress.NULL : (Addressable) radYPOINTER.address()),
                    (Addressable) (radZ == null ? MemoryAddress.NULL : (Addressable) radZPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (radX != null) radX.set(radXPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
        if (radY != null) radY.set(radYPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
        if (radZ != null) radZ.set(radZPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
    }
    
    /**
     * Copies the components of a {@link Quaternion} into a
     * {@link Vec4}.
     * @param res return location for a
     *   {@link Vec4}
     */
    public void toVec4(org.gtk.graphene.Vec4 res) {
        try {
            DowncallHandles.graphene_quaternion_to_vec4.invokeExact(
                    handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle graphene_quaternion_alloc = Interop.downcallHandle(
            "graphene_quaternion_alloc",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_quaternion_add = Interop.downcallHandle(
            "graphene_quaternion_add",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_quaternion_dot = Interop.downcallHandle(
            "graphene_quaternion_dot",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_quaternion_equal = Interop.downcallHandle(
            "graphene_quaternion_equal",
            FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_quaternion_free = Interop.downcallHandle(
            "graphene_quaternion_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_quaternion_init = Interop.downcallHandle(
            "graphene_quaternion_init",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT),
            false
        );
        
        private static final MethodHandle graphene_quaternion_init_from_angle_vec3 = Interop.downcallHandle(
            "graphene_quaternion_init_from_angle_vec3",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_quaternion_init_from_angles = Interop.downcallHandle(
            "graphene_quaternion_init_from_angles",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT),
            false
        );
        
        private static final MethodHandle graphene_quaternion_init_from_euler = Interop.downcallHandle(
            "graphene_quaternion_init_from_euler",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_quaternion_init_from_matrix = Interop.downcallHandle(
            "graphene_quaternion_init_from_matrix",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_quaternion_init_from_quaternion = Interop.downcallHandle(
            "graphene_quaternion_init_from_quaternion",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_quaternion_init_from_radians = Interop.downcallHandle(
            "graphene_quaternion_init_from_radians",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT),
            false
        );
        
        private static final MethodHandle graphene_quaternion_init_from_vec4 = Interop.downcallHandle(
            "graphene_quaternion_init_from_vec4",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_quaternion_init_identity = Interop.downcallHandle(
            "graphene_quaternion_init_identity",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_quaternion_invert = Interop.downcallHandle(
            "graphene_quaternion_invert",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_quaternion_multiply = Interop.downcallHandle(
            "graphene_quaternion_multiply",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_quaternion_normalize = Interop.downcallHandle(
            "graphene_quaternion_normalize",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_quaternion_scale = Interop.downcallHandle(
            "graphene_quaternion_scale",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_quaternion_slerp = Interop.downcallHandle(
            "graphene_quaternion_slerp",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_quaternion_to_angle_vec3 = Interop.downcallHandle(
            "graphene_quaternion_to_angle_vec3",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_quaternion_to_angles = Interop.downcallHandle(
            "graphene_quaternion_to_angles",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_quaternion_to_matrix = Interop.downcallHandle(
            "graphene_quaternion_to_matrix",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_quaternion_to_radians = Interop.downcallHandle(
            "graphene_quaternion_to_radians",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_quaternion_to_vec4 = Interop.downcallHandle(
            "graphene_quaternion_to_vec4",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link Quaternion.Builder} object constructs a {@link Quaternion} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Quaternion.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Quaternion struct;
        
        private Builder() {
            struct = Quaternion.allocate();
        }
        
         /**
         * Finish building the {@link Quaternion} struct.
         * @return A new instance of {@code Quaternion} with the fields 
         *         that were set in the Builder object.
         */
        public Quaternion build() {
            return struct;
        }
        
        public Builder setX(float x) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("x"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), x);
            return this;
        }
        
        public Builder setY(float y) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("y"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), y);
            return this;
        }
        
        public Builder setZ(float z) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("z"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), z);
            return this;
        }
        
        public Builder setW(float w) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("w"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), w);
            return this;
        }
    }
}
