package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A point with three components: X, Y, and Z.
 */
public class Point3D extends io.github.jwharm.javagi.ResourceBase {

    public Point3D(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle graphene_point3d_alloc = Interop.downcallHandle(
        "graphene_point3d_alloc",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructAlloc() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) graphene_point3d_alloc.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Allocates a {@link Point3D} structure.
     */
    public static Point3D alloc() {
        return new Point3D(constructAlloc());
    }
    
    private static final MethodHandle graphene_point3d_cross = Interop.downcallHandle(
        "graphene_point3d_cross",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the cross product of the two given {@link Point3D}.
     */
    public @NotNull void cross(@NotNull Point3D b, @NotNull Out<Point3D> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_point3d_cross.invokeExact(handle(), b.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Point3D(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_point3d_distance = Interop.downcallHandle(
        "graphene_point3d_distance",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the distance between the two given {@link Point3D}.
     */
    public float distance(@NotNull Point3D b, @NotNull Out<Vec3> delta) {
        MemorySegment deltaPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        float RESULT;
        try {
            RESULT = (float) graphene_point3d_distance.invokeExact(handle(), b.handle(), (Addressable) deltaPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        delta.set(new Vec3(Refcounted.get(deltaPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        return RESULT;
    }
    
    private static final MethodHandle graphene_point3d_dot = Interop.downcallHandle(
        "graphene_point3d_dot",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the dot product of the two given {@link Point3D}.
     */
    public float dot(@NotNull Point3D b) {
        float RESULT;
        try {
            RESULT = (float) graphene_point3d_dot.invokeExact(handle(), b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_point3d_equal = Interop.downcallHandle(
        "graphene_point3d_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether two given points are equal.
     */
    public boolean equal(@NotNull Point3D b) {
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_point3d_equal.invokeExact(handle(), b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_point3d_free = Interop.downcallHandle(
        "graphene_point3d_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the resources allocated via graphene_point3d_alloc().
     */
    public @NotNull void free() {
        try {
            graphene_point3d_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle graphene_point3d_init = Interop.downcallHandle(
        "graphene_point3d_init",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Initializes a {@link Point3D} with the given coordinates.
     */
    public @NotNull Point3D init(@NotNull float x, @NotNull float y, @NotNull float z) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_point3d_init.invokeExact(handle(), x, y, z);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Point3D(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_point3d_init_from_point = Interop.downcallHandle(
        "graphene_point3d_init_from_point",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Point3D} using the coordinates of
     * another {@link Point3D}.
     */
    public @NotNull Point3D initFromPoint(@NotNull Point3D src) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_point3d_init_from_point.invokeExact(handle(), src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Point3D(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_point3d_init_from_vec3 = Interop.downcallHandle(
        "graphene_point3d_init_from_vec3",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Point3D} using the components
     * of a {@link Vec3}.
     */
    public @NotNull Point3D initFromVec3(@NotNull Vec3 v) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_point3d_init_from_vec3.invokeExact(handle(), v.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Point3D(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_point3d_interpolate = Interop.downcallHandle(
        "graphene_point3d_interpolate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Linearly interpolates each component of @a and @b using the
     * provided {@code factor}, and places the result in {@code res}.
     */
    public @NotNull void interpolate(@NotNull Point3D b, @NotNull double factor, @NotNull Out<Point3D> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_point3d_interpolate.invokeExact(handle(), b.handle(), factor, (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Point3D(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_point3d_length = Interop.downcallHandle(
        "graphene_point3d_length",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the length of the vector represented by the
     * coordinates of the given {@link Point3D}.
     */
    public float length() {
        float RESULT;
        try {
            RESULT = (float) graphene_point3d_length.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_point3d_near = Interop.downcallHandle(
        "graphene_point3d_near",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Checks whether the two points are near each other, within
     * an {@code epsilon} factor.
     */
    public boolean near(@NotNull Point3D b, @NotNull float epsilon) {
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_point3d_near.invokeExact(handle(), b.handle(), epsilon);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_point3d_normalize = Interop.downcallHandle(
        "graphene_point3d_normalize",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the normalization of the vector represented by the
     * coordinates of the given {@link Point3D}.
     */
    public @NotNull void normalize(@NotNull Out<Point3D> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_point3d_normalize.invokeExact(handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Point3D(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_point3d_normalize_viewport = Interop.downcallHandle(
        "graphene_point3d_normalize_viewport",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Normalizes the coordinates of a {@link Point3D} using the
     * given viewport and clipping planes.
     * <p>
     * The coordinates of the resulting {@link Point3D} will be
     * in the [ -1, 1 ] range.
     */
    public @NotNull void normalizeViewport(@NotNull Rect viewport, @NotNull float zNear, @NotNull float zFar, @NotNull Out<Point3D> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_point3d_normalize_viewport.invokeExact(handle(), viewport.handle(), zNear, zFar, (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Point3D(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_point3d_scale = Interop.downcallHandle(
        "graphene_point3d_scale",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Scales the coordinates of the given {@link Point3D} by
     * the given {@code factor}.
     */
    public @NotNull void scale(@NotNull float factor, @NotNull Out<Point3D> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_point3d_scale.invokeExact(handle(), factor, (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Point3D(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_point3d_to_vec3 = Interop.downcallHandle(
        "graphene_point3d_to_vec3",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Stores the coordinates of a {@link Point3D} into a
     * {@link Vec3}.
     */
    public @NotNull void toVec3(@NotNull Out<Vec3> v) {
        MemorySegment vPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_point3d_to_vec3.invokeExact(handle(), (Addressable) vPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        v.set(new Vec3(Refcounted.get(vPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_point3d_zero = Interop.downcallHandle(
        "graphene_point3d_zero",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves a constant point with all three coordinates set to 0.
     */
    public static @NotNull Point3D zero() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_point3d_zero.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Point3D(Refcounted.get(RESULT, false));
    }
    
}
