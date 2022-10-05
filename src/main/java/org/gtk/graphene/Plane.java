package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A 2D plane that extends infinitely in a 3D volume.
 * <p>
 * The contents of the {@code graphene_plane_t} are private, and should not be
 * modified directly.
 */
public class Plane extends io.github.jwharm.javagi.ResourceBase {

    public Plane(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle graphene_plane_alloc = Interop.downcallHandle(
        "graphene_plane_alloc",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructAlloc() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) graphene_plane_alloc.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Allocates a new {@link Plane} structure.
     * <p>
     * The contents of the returned structure are undefined.
     */
    public static Plane alloc() {
        return new Plane(constructAlloc());
    }
    
    static final MethodHandle graphene_plane_distance = Interop.downcallHandle(
        "graphene_plane_distance",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the distance of {@code point} from a {@link Plane}.
     */
    public float distance(Point3D point) {
        try {
            var RESULT = (float) graphene_plane_distance.invokeExact(handle(), point.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_plane_equal = Interop.downcallHandle(
        "graphene_plane_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the two given {@link Plane} are equal.
     */
    public boolean equal(Plane b) {
        try {
            var RESULT = (boolean) graphene_plane_equal.invokeExact(handle(), b.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_plane_free = Interop.downcallHandle(
        "graphene_plane_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the resources allocated by graphene_plane_alloc().
     */
    public void free() {
        try {
            graphene_plane_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_plane_get_constant = Interop.downcallHandle(
        "graphene_plane_get_constant",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the distance along the normal vector of the
     * given {@link Plane} from the origin.
     */
    public float getConstant() {
        try {
            var RESULT = (float) graphene_plane_get_constant.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_plane_get_normal = Interop.downcallHandle(
        "graphene_plane_get_normal",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the normal vector pointing towards the origin of the
     * given {@link Plane}.
     */
    public void getNormal(Vec3 normal) {
        try {
            graphene_plane_get_normal.invokeExact(handle(), normal.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_plane_init = Interop.downcallHandle(
        "graphene_plane_init",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Initializes the given {@link Plane} using the given {@code normal} vector
     * and {@code constant} values.
     */
    public Plane init(Vec3 normal, float constant) {
        try {
            var RESULT = (MemoryAddress) graphene_plane_init.invokeExact(handle(), normal.handle(), constant);
            return new Plane(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_plane_init_from_plane = Interop.downcallHandle(
        "graphene_plane_init_from_plane",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes the given {@link Plane} using the normal
     * vector and constant of another {@link Plane}.
     */
    public Plane initFromPlane(Plane src) {
        try {
            var RESULT = (MemoryAddress) graphene_plane_init_from_plane.invokeExact(handle(), src.handle());
            return new Plane(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_plane_init_from_point = Interop.downcallHandle(
        "graphene_plane_init_from_point",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes the given {@link Plane} using the given normal vector
     * and an arbitrary co-planar point.
     */
    public Plane initFromPoint(Vec3 normal, Point3D point) {
        try {
            var RESULT = (MemoryAddress) graphene_plane_init_from_point.invokeExact(handle(), normal.handle(), point.handle());
            return new Plane(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_plane_init_from_points = Interop.downcallHandle(
        "graphene_plane_init_from_points",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes the given {@link Plane} using the 3 provided co-planar
     * points.
     * <p>
     * The winding order is counter-clockwise, and determines which direction
     * the normal vector will point.
     */
    public Plane initFromPoints(Point3D a, Point3D b, Point3D c) {
        try {
            var RESULT = (MemoryAddress) graphene_plane_init_from_points.invokeExact(handle(), a.handle(), b.handle(), c.handle());
            return new Plane(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_plane_init_from_vec4 = Interop.downcallHandle(
        "graphene_plane_init_from_vec4",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes the given {@link Plane} using the components of
     * the given {@link Vec4} vector.
     */
    public Plane initFromVec4(Vec4 src) {
        try {
            var RESULT = (MemoryAddress) graphene_plane_init_from_vec4.invokeExact(handle(), src.handle());
            return new Plane(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_plane_negate = Interop.downcallHandle(
        "graphene_plane_negate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Negates the normal vector and constant of a {@link Plane}, effectively
     * mirroring the plane across the origin.
     */
    public void negate(Plane res) {
        try {
            graphene_plane_negate.invokeExact(handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_plane_normalize = Interop.downcallHandle(
        "graphene_plane_normalize",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Normalizes the vector of the given {@link Plane},
     * and adjusts the constant accordingly.
     */
    public void normalize(Plane res) {
        try {
            graphene_plane_normalize.invokeExact(handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_plane_transform = Interop.downcallHandle(
        "graphene_plane_transform",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Transforms a {@link Plane} @p using the given {@code matrix}
     * and {@code normal_matrix}.
     * <p>
     * If {@code normal_matrix} is {@code null}, a transformation matrix for the plane
     * normal will be computed from {@code matrix}. If you are transforming
     * multiple planes using the same {@code matrix} it's recommended to compute
     * the normal matrix beforehand to avoid incurring in the cost of
     * recomputing it every time.
     */
    public void transform(Matrix matrix, Matrix normalMatrix, Plane res) {
        try {
            graphene_plane_transform.invokeExact(handle(), matrix.handle(), normalMatrix.handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
