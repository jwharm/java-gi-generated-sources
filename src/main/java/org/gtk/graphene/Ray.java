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
public class Ray extends Struct {
    
    static {
        Graphene.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "graphene_ray_t";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.graphene.Vec3.getMemoryLayout().withName("origin"),
            org.gtk.graphene.Vec3.getMemoryLayout().withName("direction")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Ray}
     * @return A new, uninitialized @{link Ray}
     */
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
    protected Ray(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Ray> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Ray(input, ownership);
    
    private static MemoryAddress constructAlloc() {
        MemoryAddress RESULT;
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
        var RESULT = constructAlloc();
        return org.gtk.graphene.Ray.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Checks whether the two given {@link Ray} are equal.
     * @param b a {@link Ray}
     * @return {@code true} if the given rays are equal
     */
    public boolean equal(org.gtk.graphene.Ray b) {
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
    public void getClosestPointToPoint(org.gtk.graphene.Point3D p, org.gtk.graphene.Point3D res) {
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
    public void getDirection(org.gtk.graphene.Vec3 direction) {
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
    public float getDistanceToPlane(org.gtk.graphene.Plane p) {
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
    public float getDistanceToPoint(org.gtk.graphene.Point3D p) {
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
    public void getOrigin(org.gtk.graphene.Point3D origin) {
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
    public void getPositionAt(float t, org.gtk.graphene.Point3D position) {
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
    public org.gtk.graphene.Ray init(@Nullable org.gtk.graphene.Point3D origin, @Nullable org.gtk.graphene.Vec3 direction) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_ray_init.invokeExact(
                    handle(),
                    (Addressable) (origin == null ? MemoryAddress.NULL : origin.handle()),
                    (Addressable) (direction == null ? MemoryAddress.NULL : direction.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Ray.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes the given {@link Ray} using the origin and direction
     * values of another {@link Ray}.
     * @param src a {@link Ray}
     * @return the initialized ray
     */
    public org.gtk.graphene.Ray initFromRay(org.gtk.graphene.Ray src) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_ray_init_from_ray.invokeExact(
                    handle(),
                    src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Ray.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes the given {@link Ray} using the given vectors.
     * @param origin a {@link Vec3}
     * @param direction a {@link Vec3}
     * @return the initialized ray
     */
    public org.gtk.graphene.Ray initFromVec3(@Nullable org.gtk.graphene.Vec3 origin, @Nullable org.gtk.graphene.Vec3 direction) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_ray_init_from_vec3.invokeExact(
                    handle(),
                    (Addressable) (origin == null ? MemoryAddress.NULL : origin.handle()),
                    (Addressable) (direction == null ? MemoryAddress.NULL : direction.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Ray.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Intersects the given {@link Ray} {@code r} with the given
     * {@link Box} {@code b}.
     * @param b a {@link Box}
     * @param tOut the distance of the point on the ray that intersects the box
     * @return the type of intersection
     */
    public org.gtk.graphene.RayIntersectionKind intersectBox(org.gtk.graphene.Box b, Out<Float> tOut) {
        MemorySegment tOutPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_FLOAT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.graphene_ray_intersect_box.invokeExact(
                    handle(),
                    b.handle(),
                    (Addressable) tOutPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        tOut.set(tOutPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
        return org.gtk.graphene.RayIntersectionKind.of(RESULT);
    }
    
    /**
     * Intersects the given {@link Ray} {@code r} with the given
     * {@link Sphere} {@code s}.
     * @param s a {@link Sphere}
     * @param tOut the distance of the point on the ray that intersects the sphere
     * @return the type of intersection
     */
    public org.gtk.graphene.RayIntersectionKind intersectSphere(org.gtk.graphene.Sphere s, Out<Float> tOut) {
        MemorySegment tOutPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_FLOAT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.graphene_ray_intersect_sphere.invokeExact(
                    handle(),
                    s.handle(),
                    (Addressable) tOutPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        tOut.set(tOutPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
        return org.gtk.graphene.RayIntersectionKind.of(RESULT);
    }
    
    /**
     * Intersects the given {@link Ray} {@code r} with the given
     * {@link Triangle} {@code t}.
     * @param t a {@link Triangle}
     * @param tOut the distance of the point on the ray that intersects the triangle
     * @return the type of intersection
     */
    public org.gtk.graphene.RayIntersectionKind intersectTriangle(org.gtk.graphene.Triangle t, Out<Float> tOut) {
        MemorySegment tOutPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_FLOAT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.graphene_ray_intersect_triangle.invokeExact(
                    handle(),
                    t.handle(),
                    (Addressable) tOutPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        tOut.set(tOutPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
        return org.gtk.graphene.RayIntersectionKind.of(RESULT);
    }
    
    /**
     * Checks whether the given {@link Ray} {@code r} intersects the
     * given {@link Box} {@code b}.
     * <p>
     * See also: graphene_ray_intersect_box()
     * @param b a {@link Box}
     * @return {@code true} if the ray intersects the box
     */
    public boolean intersectsBox(org.gtk.graphene.Box b) {
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
    public boolean intersectsSphere(org.gtk.graphene.Sphere s) {
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
    public boolean intersectsTriangle(org.gtk.graphene.Triangle t) {
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
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_ray_equal = Interop.downcallHandle(
            "graphene_ray_equal",
            FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_ray_free = Interop.downcallHandle(
            "graphene_ray_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_ray_get_closest_point_to_point = Interop.downcallHandle(
            "graphene_ray_get_closest_point_to_point",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_ray_get_direction = Interop.downcallHandle(
            "graphene_ray_get_direction",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_ray_get_distance_to_plane = Interop.downcallHandle(
            "graphene_ray_get_distance_to_plane",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_ray_get_distance_to_point = Interop.downcallHandle(
            "graphene_ray_get_distance_to_point",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_ray_get_origin = Interop.downcallHandle(
            "graphene_ray_get_origin",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_ray_get_position_at = Interop.downcallHandle(
            "graphene_ray_get_position_at",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_ray_init = Interop.downcallHandle(
            "graphene_ray_init",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_ray_init_from_ray = Interop.downcallHandle(
            "graphene_ray_init_from_ray",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_ray_init_from_vec3 = Interop.downcallHandle(
            "graphene_ray_init_from_vec3",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_ray_intersect_box = Interop.downcallHandle(
            "graphene_ray_intersect_box",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_ray_intersect_sphere = Interop.downcallHandle(
            "graphene_ray_intersect_sphere",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_ray_intersect_triangle = Interop.downcallHandle(
            "graphene_ray_intersect_triangle",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_ray_intersects_box = Interop.downcallHandle(
            "graphene_ray_intersects_box",
            FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_ray_intersects_sphere = Interop.downcallHandle(
            "graphene_ray_intersects_sphere",
            FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_ray_intersects_triangle = Interop.downcallHandle(
            "graphene_ray_intersects_triangle",
            FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link Ray.Builder} object constructs a {@link Ray} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Ray.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Ray struct;
        
        private Builder() {
            struct = Ray.allocate();
        }
        
         /**
         * Finish building the {@link Ray} struct.
         * @return A new instance of {@code Ray} with the fields 
         *         that were set in the Builder object.
         */
        public Ray build() {
            return struct;
        }
        
        public Builder setOrigin(org.gtk.graphene.Vec3 origin) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("origin"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (origin == null ? MemoryAddress.NULL : origin.handle()));
            return this;
        }
        
        public Builder setDirection(org.gtk.graphene.Vec3 direction) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("direction"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (direction == null ? MemoryAddress.NULL : direction.handle()));
            return this;
        }
    }
}
