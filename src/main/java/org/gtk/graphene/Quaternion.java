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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_FLOAT.withName("x"),
        Interop.valueLayout.C_FLOAT.withName("y"),
        Interop.valueLayout.C_FLOAT.withName("z"),
        Interop.valueLayout.C_FLOAT.withName("w")
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
    @ApiStatus.Internal
    public Quaternion(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructAlloc() {
        Addressable RESULT;
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
        return new Quaternion(constructAlloc(), Ownership.FULL);
    }
    
    /**
     * Adds two {@link Quaternion} {@code a} and {@code b}.
     * @param b a {@link Quaternion}
     * @param res the result of the operation
     */
    public void add(@NotNull org.gtk.graphene.Quaternion b, @NotNull org.gtk.graphene.Quaternion res) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
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
    public float dot(@NotNull org.gtk.graphene.Quaternion b) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
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
    public boolean equal(@NotNull org.gtk.graphene.Quaternion b) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
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
    public @NotNull org.gtk.graphene.Quaternion init(float x, float y, float z, float w) {
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
        return new org.gtk.graphene.Quaternion(RESULT, Ownership.NONE);
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
            RESULT = (MemoryAddress) DowncallHandles.graphene_quaternion_init_from_angle_vec3.invokeExact(
                    handle(),
                    angle,
                    axis.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Quaternion(RESULT, Ownership.NONE);
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
            RESULT = (MemoryAddress) DowncallHandles.graphene_quaternion_init_from_angles.invokeExact(
                    handle(),
                    degX,
                    degY,
                    degZ);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Quaternion(RESULT, Ownership.NONE);
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
            RESULT = (MemoryAddress) DowncallHandles.graphene_quaternion_init_from_euler.invokeExact(
                    handle(),
                    e.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Quaternion(RESULT, Ownership.NONE);
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
            RESULT = (MemoryAddress) DowncallHandles.graphene_quaternion_init_from_matrix.invokeExact(
                    handle(),
                    m.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Quaternion(RESULT, Ownership.NONE);
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
            RESULT = (MemoryAddress) DowncallHandles.graphene_quaternion_init_from_quaternion.invokeExact(
                    handle(),
                    src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Quaternion(RESULT, Ownership.NONE);
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
            RESULT = (MemoryAddress) DowncallHandles.graphene_quaternion_init_from_radians.invokeExact(
                    handle(),
                    radX,
                    radY,
                    radZ);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Quaternion(RESULT, Ownership.NONE);
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
            RESULT = (MemoryAddress) DowncallHandles.graphene_quaternion_init_from_vec4.invokeExact(
                    handle(),
                    src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Quaternion(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes a {@link Quaternion} using the identity
     * transformation.
     * @return the initialized quaternion
     */
    public @NotNull org.gtk.graphene.Quaternion initIdentity() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_quaternion_init_identity.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Quaternion(RESULT, Ownership.NONE);
    }
    
    /**
     * Inverts a {@link Quaternion}, and returns the conjugate
     * quaternion of {@code q}.
     * @param res return location for the inverted
     *   quaternion
     */
    public void invert(@NotNull org.gtk.graphene.Quaternion res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
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
    public void multiply(@NotNull org.gtk.graphene.Quaternion b, @NotNull org.gtk.graphene.Quaternion res) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
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
    public void normalize(@NotNull org.gtk.graphene.Quaternion res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
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
    public void scale(float factor, @NotNull org.gtk.graphene.Quaternion res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
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
    public void slerp(@NotNull org.gtk.graphene.Quaternion b, float factor, @NotNull org.gtk.graphene.Quaternion res) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
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
    public void toAngleVec3(Out<Float> angle, @NotNull org.gtk.graphene.Vec3 axis) {
        java.util.Objects.requireNonNull(angle, "Parameter 'angle' must not be null");
        MemorySegment anglePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_FLOAT);
        java.util.Objects.requireNonNull(axis, "Parameter 'axis' must not be null");
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
        java.util.Objects.requireNonNull(degX, "Parameter 'degX' must not be null");
        MemorySegment degXPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_FLOAT);
        java.util.Objects.requireNonNull(degY, "Parameter 'degY' must not be null");
        MemorySegment degYPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_FLOAT);
        java.util.Objects.requireNonNull(degZ, "Parameter 'degZ' must not be null");
        MemorySegment degZPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_FLOAT);
        try {
            DowncallHandles.graphene_quaternion_to_angles.invokeExact(
                    handle(),
                    (Addressable) degXPOINTER.address(),
                    (Addressable) degYPOINTER.address(),
                    (Addressable) degZPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        degX.set(degXPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
        degY.set(degYPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
        degZ.set(degZPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
    }
    
    /**
     * Converts a quaternion into a transformation matrix expressing
     * the rotation defined by the {@link Quaternion}.
     * @param m a {@link Matrix}
     */
    public void toMatrix(@NotNull org.gtk.graphene.Matrix m) {
        java.util.Objects.requireNonNull(m, "Parameter 'm' must not be null");
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
        java.util.Objects.requireNonNull(radX, "Parameter 'radX' must not be null");
        MemorySegment radXPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_FLOAT);
        java.util.Objects.requireNonNull(radY, "Parameter 'radY' must not be null");
        MemorySegment radYPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_FLOAT);
        java.util.Objects.requireNonNull(radZ, "Parameter 'radZ' must not be null");
        MemorySegment radZPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_FLOAT);
        try {
            DowncallHandles.graphene_quaternion_to_radians.invokeExact(
                    handle(),
                    (Addressable) radXPOINTER.address(),
                    (Addressable) radYPOINTER.address(),
                    (Addressable) radZPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        radX.set(radXPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
        radY.set(radYPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
        radZ.set(radZPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
    }
    
    /**
     * Copies the components of a {@link Quaternion} into a
     * {@link Vec4}.
     * @param res return location for a
     *   {@link Vec4}
     */
    public void toVec4(@NotNull org.gtk.graphene.Vec4 res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
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
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private Quaternion struct;
        
         /**
         * A {@link Quaternion.Build} object constructs a {@link Quaternion} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = Quaternion.allocate();
        }
        
         /**
         * Finish building the {@link Quaternion} struct.
         * @return A new instance of {@code Quaternion} with the fields 
         *         that were set in the Build object.
         */
        public Quaternion construct() {
            return struct;
        }
        
        public Build setX(float x) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("x"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), x);
            return this;
        }
        
        public Build setY(float y) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("y"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), y);
            return this;
        }
        
        public Build setZ(float z) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("z"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), z);
            return this;
        }
        
        public Build setW(float w) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("w"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), w);
            return this;
        }
    }
}
