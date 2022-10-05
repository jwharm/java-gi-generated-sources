package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A ray emitted from an origin in a given direction.
 * <p>
 * The contents of the {@code graphene_ray_t} structure are private, and should not
 * be modified directly.
 */
public class Ray extends io.github.jwharm.javagi.ResourceBase {

    public Ray(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle graphene_ray_alloc = Interop.downcallHandle(
        "graphene_ray_alloc",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructAlloc() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) graphene_ray_alloc.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Allocates a new {@link Ray} structure.
     * <p>
     * The contents of the returned structure are undefined.
     */
    public static Ray alloc() {
        return new Ray(constructAlloc());
    }
    
    static final MethodHandle graphene_ray_equal = Interop.downcallHandle(
        "graphene_ray_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the two given {@link Ray} are equal.
     */
    public boolean equal(Ray b) {
        try {
            var RESULT = (boolean) graphene_ray_equal.invokeExact(handle(), b.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_ray_free = Interop.downcallHandle(
        "graphene_ray_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the resources allocated by graphene_ray_alloc().
     */
    public void free() {
        try {
            graphene_ray_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_ray_get_closest_point_to_point = Interop.downcallHandle(
        "graphene_ray_get_closest_point_to_point",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the point on the given {@link Ray} that is closest to the
     * given point @p.
     */
    public void getClosestPointToPoint(Point3D p, Point3D res) {
        try {
            graphene_ray_get_closest_point_to_point.invokeExact(handle(), p.handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_ray_get_direction = Interop.downcallHandle(
        "graphene_ray_get_direction",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the direction of the given {@link Ray}.
     */
    public void getDirection(Vec3 direction) {
        try {
            graphene_ray_get_direction.invokeExact(handle(), direction.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_ray_get_distance_to_plane = Interop.downcallHandle(
        "graphene_ray_get_distance_to_plane",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the distance of the origin of the given {@link Ray} from the
     * given plane.
     * <p>
     * If the ray does not intersect the plane, this function returns {@code INFINITY}.
     */
    public float getDistanceToPlane(Plane p) {
        try {
            var RESULT = (float) graphene_ray_get_distance_to_plane.invokeExact(handle(), p.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_ray_get_distance_to_point = Interop.downcallHandle(
        "graphene_ray_get_distance_to_point",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the distance of the closest approach between the
     * given {@link Ray} @r and the point @p.
     * <p>
     * The closest approach to a ray from a point is the distance
     * between the point and the projection of the point on the
     * ray itself.
     */
    public float getDistanceToPoint(Point3D p) {
        try {
            var RESULT = (float) graphene_ray_get_distance_to_point.invokeExact(handle(), p.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_ray_get_origin = Interop.downcallHandle(
        "graphene_ray_get_origin",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the origin of the given {@link Ray}.
     */
    public void getOrigin(Point3D origin) {
        try {
            graphene_ray_get_origin.invokeExact(handle(), origin.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_ray_get_position_at = Interop.downcallHandle(
        "graphene_ray_get_position_at",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the coordinates of a point at the distance @t along the
     * given {@link Ray}.
     */
    public void getPositionAt(float t, Point3D position) {
        try {
            graphene_ray_get_position_at.invokeExact(handle(), t, position.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_ray_init = Interop.downcallHandle(
        "graphene_ray_init",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes the given {@link Ray} using the given {@code origin}
     * and {@code direction} values.
     */
    public Ray init(Point3D origin, Vec3 direction) {
        try {
            var RESULT = (MemoryAddress) graphene_ray_init.invokeExact(handle(), origin.handle(), direction.handle());
            return new Ray(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_ray_init_from_ray = Interop.downcallHandle(
        "graphene_ray_init_from_ray",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes the given {@link Ray} using the origin and direction
     * values of another {@link Ray}.
     */
    public Ray initFromRay(Ray src) {
        try {
            var RESULT = (MemoryAddress) graphene_ray_init_from_ray.invokeExact(handle(), src.handle());
            return new Ray(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_ray_init_from_vec3 = Interop.downcallHandle(
        "graphene_ray_init_from_vec3",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes the given {@link Ray} using the given vectors.
     */
    public Ray initFromVec3(Vec3 origin, Vec3 direction) {
        try {
            var RESULT = (MemoryAddress) graphene_ray_init_from_vec3.invokeExact(handle(), origin.handle(), direction.handle());
            return new Ray(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_ray_intersect_box = Interop.downcallHandle(
        "graphene_ray_intersect_box",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Intersects the given {@link Ray} @r with the given
     * {@link Box} @b.
     */
    public RayIntersectionKind intersectBox(Box b, PointerFloat tOut) {
        try {
            var RESULT = (int) graphene_ray_intersect_box.invokeExact(handle(), b.handle(), tOut.handle());
            return new RayIntersectionKind(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_ray_intersect_sphere = Interop.downcallHandle(
        "graphene_ray_intersect_sphere",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Intersects the given {@link Ray} @r with the given
     * {@link Sphere} @s.
     */
    public RayIntersectionKind intersectSphere(Sphere s, PointerFloat tOut) {
        try {
            var RESULT = (int) graphene_ray_intersect_sphere.invokeExact(handle(), s.handle(), tOut.handle());
            return new RayIntersectionKind(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_ray_intersect_triangle = Interop.downcallHandle(
        "graphene_ray_intersect_triangle",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Intersects the given {@link Ray} @r with the given
     * {@link Triangle} @t.
     */
    public RayIntersectionKind intersectTriangle(Triangle t, PointerFloat tOut) {
        try {
            var RESULT = (int) graphene_ray_intersect_triangle.invokeExact(handle(), t.handle(), tOut.handle());
            return new RayIntersectionKind(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_ray_intersects_box = Interop.downcallHandle(
        "graphene_ray_intersects_box",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the given {@link Ray} @r intersects the
     * given {@link Box} @b.
     * <p>
     * See also: graphene_ray_intersect_box()
     */
    public boolean intersectsBox(Box b) {
        try {
            var RESULT = (boolean) graphene_ray_intersects_box.invokeExact(handle(), b.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_ray_intersects_sphere = Interop.downcallHandle(
        "graphene_ray_intersects_sphere",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if the given {@link Ray} @r intersects the
     * given {@link Sphere} @s.
     * <p>
     * See also: graphene_ray_intersect_sphere()
     */
    public boolean intersectsSphere(Sphere s) {
        try {
            var RESULT = (boolean) graphene_ray_intersects_sphere.invokeExact(handle(), s.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_ray_intersects_triangle = Interop.downcallHandle(
        "graphene_ray_intersects_triangle",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the given {@link Ray} @r intersects the
     * given {@link Triangle} @b.
     * <p>
     * See also: graphene_ray_intersect_triangle()
     */
    public boolean intersectsTriangle(Triangle t) {
        try {
            var RESULT = (boolean) graphene_ray_intersects_triangle.invokeExact(handle(), t.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
