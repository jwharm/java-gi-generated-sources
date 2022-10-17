package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    private static final MethodHandle graphene_ray_alloc = Interop.downcallHandle(
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
    
    private static final MethodHandle graphene_ray_equal = Interop.downcallHandle(
        "graphene_ray_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the two given {@link Ray} are equal.
     */
    public boolean equal(@NotNull Ray b) {
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_ray_equal.invokeExact(handle(), b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_ray_free = Interop.downcallHandle(
        "graphene_ray_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the resources allocated by graphene_ray_alloc().
     */
    public @NotNull void free() {
        try {
            graphene_ray_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle graphene_ray_get_closest_point_to_point = Interop.downcallHandle(
        "graphene_ray_get_closest_point_to_point",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the point on the given {@link Ray} that is closest to the
     * given point @p.
     */
    public @NotNull void getClosestPointToPoint(@NotNull Point3D p, @NotNull Out<Point3D> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_ray_get_closest_point_to_point.invokeExact(handle(), p.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Point3D(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_ray_get_direction = Interop.downcallHandle(
        "graphene_ray_get_direction",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the direction of the given {@link Ray}.
     */
    public @NotNull void getDirection(@NotNull Out<Vec3> direction) {
        MemorySegment directionPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_ray_get_direction.invokeExact(handle(), (Addressable) directionPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        direction.set(new Vec3(Refcounted.get(directionPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_ray_get_distance_to_plane = Interop.downcallHandle(
        "graphene_ray_get_distance_to_plane",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the distance of the origin of the given {@link Ray} from the
     * given plane.
     * <p>
     * If the ray does not intersect the plane, this function returns {@code INFINITY}.
     */
    public float getDistanceToPlane(@NotNull Plane p) {
        float RESULT;
        try {
            RESULT = (float) graphene_ray_get_distance_to_plane.invokeExact(handle(), p.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_ray_get_distance_to_point = Interop.downcallHandle(
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
    public float getDistanceToPoint(@NotNull Point3D p) {
        float RESULT;
        try {
            RESULT = (float) graphene_ray_get_distance_to_point.invokeExact(handle(), p.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_ray_get_origin = Interop.downcallHandle(
        "graphene_ray_get_origin",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the origin of the given {@link Ray}.
     */
    public @NotNull void getOrigin(@NotNull Out<Point3D> origin) {
        MemorySegment originPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_ray_get_origin.invokeExact(handle(), (Addressable) originPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        origin.set(new Point3D(Refcounted.get(originPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_ray_get_position_at = Interop.downcallHandle(
        "graphene_ray_get_position_at",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the coordinates of a point at the distance @t along the
     * given {@link Ray}.
     */
    public @NotNull void getPositionAt(@NotNull float t, @NotNull Out<Point3D> position) {
        MemorySegment positionPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_ray_get_position_at.invokeExact(handle(), t, (Addressable) positionPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        position.set(new Point3D(Refcounted.get(positionPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_ray_init = Interop.downcallHandle(
        "graphene_ray_init",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes the given {@link Ray} using the given {@code origin}
     * and {@code direction} values.
     */
    public @NotNull Ray init(@Nullable Point3D origin, @Nullable Vec3 direction) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_ray_init.invokeExact(handle(), origin.handle(), direction.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Ray(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_ray_init_from_ray = Interop.downcallHandle(
        "graphene_ray_init_from_ray",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes the given {@link Ray} using the origin and direction
     * values of another {@link Ray}.
     */
    public @NotNull Ray initFromRay(@NotNull Ray src) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_ray_init_from_ray.invokeExact(handle(), src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Ray(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_ray_init_from_vec3 = Interop.downcallHandle(
        "graphene_ray_init_from_vec3",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes the given {@link Ray} using the given vectors.
     */
    public @NotNull Ray initFromVec3(@Nullable Vec3 origin, @Nullable Vec3 direction) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_ray_init_from_vec3.invokeExact(handle(), origin.handle(), direction.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Ray(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_ray_intersect_box = Interop.downcallHandle(
        "graphene_ray_intersect_box",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Intersects the given {@link Ray} @r with the given
     * {@link Box} @b.
     */
    public @NotNull RayIntersectionKind intersectBox(@NotNull Box b, @NotNull Out<Float> tOut) {
        MemorySegment tOutPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        int RESULT;
        try {
            RESULT = (int) graphene_ray_intersect_box.invokeExact(handle(), b.handle(), (Addressable) tOutPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        tOut.set(tOutPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
        return new RayIntersectionKind(RESULT);
    }
    
    private static final MethodHandle graphene_ray_intersect_sphere = Interop.downcallHandle(
        "graphene_ray_intersect_sphere",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Intersects the given {@link Ray} @r with the given
     * {@link Sphere} @s.
     */
    public @NotNull RayIntersectionKind intersectSphere(@NotNull Sphere s, @NotNull Out<Float> tOut) {
        MemorySegment tOutPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        int RESULT;
        try {
            RESULT = (int) graphene_ray_intersect_sphere.invokeExact(handle(), s.handle(), (Addressable) tOutPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        tOut.set(tOutPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
        return new RayIntersectionKind(RESULT);
    }
    
    private static final MethodHandle graphene_ray_intersect_triangle = Interop.downcallHandle(
        "graphene_ray_intersect_triangle",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Intersects the given {@link Ray} @r with the given
     * {@link Triangle} @t.
     */
    public @NotNull RayIntersectionKind intersectTriangle(@NotNull Triangle t, @NotNull Out<Float> tOut) {
        MemorySegment tOutPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        int RESULT;
        try {
            RESULT = (int) graphene_ray_intersect_triangle.invokeExact(handle(), t.handle(), (Addressable) tOutPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        tOut.set(tOutPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
        return new RayIntersectionKind(RESULT);
    }
    
    private static final MethodHandle graphene_ray_intersects_box = Interop.downcallHandle(
        "graphene_ray_intersects_box",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the given {@link Ray} @r intersects the
     * given {@link Box} @b.
     * <p>
     * See also: graphene_ray_intersect_box()
     */
    public boolean intersectsBox(@NotNull Box b) {
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_ray_intersects_box.invokeExact(handle(), b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_ray_intersects_sphere = Interop.downcallHandle(
        "graphene_ray_intersects_sphere",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if the given {@link Ray} @r intersects the
     * given {@link Sphere} @s.
     * <p>
     * See also: graphene_ray_intersect_sphere()
     */
    public boolean intersectsSphere(@NotNull Sphere s) {
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_ray_intersects_sphere.invokeExact(handle(), s.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_ray_intersects_triangle = Interop.downcallHandle(
        "graphene_ray_intersects_triangle",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the given {@link Ray} @r intersects the
     * given {@link Triangle} @b.
     * <p>
     * See also: graphene_ray_intersect_triangle()
     */
    public boolean intersectsTriangle(@NotNull Triangle t) {
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_ray_intersects_triangle.invokeExact(handle(), t.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
}
