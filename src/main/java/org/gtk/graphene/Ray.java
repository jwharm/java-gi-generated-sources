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
 * @version 1.4
 */
public class Ray extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        Graphene.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "graphene_ray_t";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.graphene.Vec3.getMemoryLayout().withName("origin"),
        org.gtk.graphene.Vec3.getMemoryLayout().withName("direction")
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
    
    public static Ray allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Ray newInstance = new Ray(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Ray proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Ray(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructAlloc() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_ray_alloc.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocates a new {@link Ray} structure.
     * <p>
     * The contents of the returned structure are undefined.
     * @return the newly allocated {@link Ray}.
     *   Use graphene_ray_free() to free the resources allocated by
     *   this function
     */
    public static Ray alloc() {
        return new Ray(constructAlloc(), Ownership.FULL);
    }
    
    /**
     * Checks whether the two given {@link Ray} are equal.
     * @param b a {@link Ray}
     * @return {@code true} if the given rays are equal
     */
    public boolean equal(@NotNull org.gtk.graphene.Ray b) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_ray_equal.invokeExact(
                    handle(),
                    b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Frees the resources allocated by graphene_ray_alloc().
     */
    public void free() {
        try {
            DowncallHandles.graphene_ray_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Computes the point on the given {@link Ray} that is closest to the
     * given point {@code p}.
     * @param p a {@link Point3D}
     * @param res return location for the closest point3d
     */
    public void getClosestPointToPoint(@NotNull org.gtk.graphene.Point3D p, @NotNull org.gtk.graphene.Point3D res) {
        java.util.Objects.requireNonNull(p, "Parameter 'p' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_ray_get_closest_point_to_point.invokeExact(
                    handle(),
                    p.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the direction of the given {@link Ray}.
     * @param direction return location for the direction
     */
    public void getDirection(@NotNull org.gtk.graphene.Vec3 direction) {
        java.util.Objects.requireNonNull(direction, "Parameter 'direction' must not be null");
        try {
            DowncallHandles.graphene_ray_get_direction.invokeExact(
                    handle(),
                    direction.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Computes the distance of the origin of the given {@link Ray} from the
     * given plane.
     * <p>
     * If the ray does not intersect the plane, this function returns {@code INFINITY}.
     * @param p a {@link Plane}
     * @return the distance of the origin of the ray from the plane
     */
    public float getDistanceToPlane(@NotNull org.gtk.graphene.Plane p) {
        java.util.Objects.requireNonNull(p, "Parameter 'p' must not be null");
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_ray_get_distance_to_plane.invokeExact(
                    handle(),
                    p.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Computes the distance of the closest approach between the
     * given {@link Ray} {@code r} and the point {@code p}.
     * <p>
     * The closest approach to a ray from a point is the distance
     * between the point and the projection of the point on the
     * ray itself.
     * @param p a {@link Point3D}
     * @return the distance of the point
     */
    public float getDistanceToPoint(@NotNull org.gtk.graphene.Point3D p) {
        java.util.Objects.requireNonNull(p, "Parameter 'p' must not be null");
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_ray_get_distance_to_point.invokeExact(
                    handle(),
                    p.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the origin of the given {@link Ray}.
     * @param origin return location for the origin
     */
    public void getOrigin(@NotNull org.gtk.graphene.Point3D origin) {
        java.util.Objects.requireNonNull(origin, "Parameter 'origin' must not be null");
        try {
            DowncallHandles.graphene_ray_get_origin.invokeExact(
                    handle(),
                    origin.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the coordinates of a point at the distance {@code t} along the
     * given {@link Ray}.
     * @param t the distance along the ray
     * @param position return location for the position
     */
    public void getPositionAt(float t, @NotNull org.gtk.graphene.Point3D position) {
        java.util.Objects.requireNonNull(position, "Parameter 'position' must not be null");
        try {
            DowncallHandles.graphene_ray_get_position_at.invokeExact(
                    handle(),
                    t,
                    position.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Initializes the given {@link Ray} using the given {@code origin}
     * and {@code direction} values.
     * @param origin the origin of the ray
     * @param direction the direction vector
     * @return the initialized ray
     */
    public @NotNull org.gtk.graphene.Ray init(@Nullable org.gtk.graphene.Point3D origin, @Nullable org.gtk.graphene.Vec3 direction) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_ray_init.invokeExact(
                    handle(),
                    (Addressable) (origin == null ? MemoryAddress.NULL : origin.handle()),
                    (Addressable) (direction == null ? MemoryAddress.NULL : direction.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Ray(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes the given {@link Ray} using the origin and direction
     * values of another {@link Ray}.
     * @param src a {@link Ray}
     * @return the initialized ray
     */
    public @NotNull org.gtk.graphene.Ray initFromRay(@NotNull org.gtk.graphene.Ray src) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_ray_init_from_ray.invokeExact(
                    handle(),
                    src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Ray(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes the given {@link Ray} using the given vectors.
     * @param origin a {@link Vec3}
     * @param direction a {@link Vec3}
     * @return the initialized ray
     */
    public @NotNull org.gtk.graphene.Ray initFromVec3(@Nullable org.gtk.graphene.Vec3 origin, @Nullable org.gtk.graphene.Vec3 direction) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_ray_init_from_vec3.invokeExact(
                    handle(),
                    (Addressable) (origin == null ? MemoryAddress.NULL : origin.handle()),
                    (Addressable) (direction == null ? MemoryAddress.NULL : direction.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Ray(RESULT, Ownership.NONE);
    }
    
    /**
     * Intersects the given {@link Ray} {@code r} with the given
     * {@link Box} {@code b}.
     * @param b a {@link Box}
     * @param tOut the distance of the point on the ray that intersects the box
     * @return the type of intersection
     */
    public @NotNull org.gtk.graphene.RayIntersectionKind intersectBox(@NotNull org.gtk.graphene.Box b, Out<Float> tOut) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        java.util.Objects.requireNonNull(tOut, "Parameter 'tOut' must not be null");
        MemorySegment tOutPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.graphene_ray_intersect_box.invokeExact(
                    handle(),
                    b.handle(),
                    (Addressable) tOutPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        tOut.set(tOutPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
        return new org.gtk.graphene.RayIntersectionKind(RESULT);
    }
    
    /**
     * Intersects the given {@link Ray} {@code r} with the given
     * {@link Sphere} {@code s}.
     * @param s a {@link Sphere}
     * @param tOut the distance of the point on the ray that intersects the sphere
     * @return the type of intersection
     */
    public @NotNull org.gtk.graphene.RayIntersectionKind intersectSphere(@NotNull org.gtk.graphene.Sphere s, Out<Float> tOut) {
        java.util.Objects.requireNonNull(s, "Parameter 's' must not be null");
        java.util.Objects.requireNonNull(tOut, "Parameter 'tOut' must not be null");
        MemorySegment tOutPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.graphene_ray_intersect_sphere.invokeExact(
                    handle(),
                    s.handle(),
                    (Addressable) tOutPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        tOut.set(tOutPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
        return new org.gtk.graphene.RayIntersectionKind(RESULT);
    }
    
    /**
     * Intersects the given {@link Ray} {@code r} with the given
     * {@link Triangle} {@code t}.
     * @param t a {@link Triangle}
     * @param tOut the distance of the point on the ray that intersects the triangle
     * @return the type of intersection
     */
    public @NotNull org.gtk.graphene.RayIntersectionKind intersectTriangle(@NotNull org.gtk.graphene.Triangle t, Out<Float> tOut) {
        java.util.Objects.requireNonNull(t, "Parameter 't' must not be null");
        java.util.Objects.requireNonNull(tOut, "Parameter 'tOut' must not be null");
        MemorySegment tOutPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.graphene_ray_intersect_triangle.invokeExact(
                    handle(),
                    t.handle(),
                    (Addressable) tOutPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        tOut.set(tOutPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
        return new org.gtk.graphene.RayIntersectionKind(RESULT);
    }
    
    /**
     * Checks whether the given {@link Ray} {@code r} intersects the
     * given {@link Box} {@code b}.
     * <p>
     * See also: graphene_ray_intersect_box()
     * @param b a {@link Box}
     * @return {@code true} if the ray intersects the box
     */
    public boolean intersectsBox(@NotNull org.gtk.graphene.Box b) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_ray_intersects_box.invokeExact(
                    handle(),
                    b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks if the given {@link Ray} {@code r} intersects the
     * given {@link Sphere} {@code s}.
     * <p>
     * See also: graphene_ray_intersect_sphere()
     * @param s a {@link Sphere}
     * @return {@code true} if the ray intersects the sphere
     */
    public boolean intersectsSphere(@NotNull org.gtk.graphene.Sphere s) {
        java.util.Objects.requireNonNull(s, "Parameter 's' must not be null");
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_ray_intersects_sphere.invokeExact(
                    handle(),
                    s.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks whether the given {@link Ray} {@code r} intersects the
     * given {@link Triangle} {@code b}.
     * <p>
     * See also: graphene_ray_intersect_triangle()
     * @param t a {@link Triangle}
     * @return {@code true} if the ray intersects the triangle
     */
    public boolean intersectsTriangle(@NotNull org.gtk.graphene.Triangle t) {
        java.util.Objects.requireNonNull(t, "Parameter 't' must not be null");
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_ray_intersects_triangle.invokeExact(
                    handle(),
                    t.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle graphene_ray_alloc = Interop.downcallHandle(
            "graphene_ray_alloc",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_ray_equal = Interop.downcallHandle(
            "graphene_ray_equal",
            FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_ray_free = Interop.downcallHandle(
            "graphene_ray_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_ray_get_closest_point_to_point = Interop.downcallHandle(
            "graphene_ray_get_closest_point_to_point",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_ray_get_direction = Interop.downcallHandle(
            "graphene_ray_get_direction",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_ray_get_distance_to_plane = Interop.downcallHandle(
            "graphene_ray_get_distance_to_plane",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_ray_get_distance_to_point = Interop.downcallHandle(
            "graphene_ray_get_distance_to_point",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_ray_get_origin = Interop.downcallHandle(
            "graphene_ray_get_origin",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_ray_get_position_at = Interop.downcallHandle(
            "graphene_ray_get_position_at",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_ray_init = Interop.downcallHandle(
            "graphene_ray_init",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_ray_init_from_ray = Interop.downcallHandle(
            "graphene_ray_init_from_ray",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_ray_init_from_vec3 = Interop.downcallHandle(
            "graphene_ray_init_from_vec3",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_ray_intersect_box = Interop.downcallHandle(
            "graphene_ray_intersect_box",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_ray_intersect_sphere = Interop.downcallHandle(
            "graphene_ray_intersect_sphere",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_ray_intersect_triangle = Interop.downcallHandle(
            "graphene_ray_intersect_triangle",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_ray_intersects_box = Interop.downcallHandle(
            "graphene_ray_intersects_box",
            FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_ray_intersects_sphere = Interop.downcallHandle(
            "graphene_ray_intersects_sphere",
            FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_ray_intersects_triangle = Interop.downcallHandle(
            "graphene_ray_intersects_triangle",
            FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
}
