package org.gtk.graphene;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
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

    public Ray(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructAlloc() {
        Reference RESULT = References.get(gtk_h.graphene_ray_alloc(), true);
        return RESULT;
    }
    
    /**
     * Allocates a new {@link Ray} structure.
     * <p>
     * The contents of the returned structure are undefined.
     */
    public static Ray alloc() {
        return new Ray(constructAlloc());
    }
    
    /**
     * Checks whether the two given {@link Ray} are equal.
     */
    public boolean equal(Ray b) {
        var RESULT = gtk_h.graphene_ray_equal(handle(), b.handle());
        return RESULT;
    }
    
    /**
     * Frees the resources allocated by graphene_ray_alloc().
     */
    public void free() {
        gtk_h.graphene_ray_free(handle());
    }
    
    /**
     * Computes the point on the given {@link Ray} that is closest to the
     * given point @p.
     */
    public void getClosestPointToPoint(Point3D p, Point3D res) {
        gtk_h.graphene_ray_get_closest_point_to_point(handle(), p.handle(), res.handle());
    }
    
    /**
     * Retrieves the direction of the given {@link Ray}.
     */
    public void getDirection(Vec3 direction) {
        gtk_h.graphene_ray_get_direction(handle(), direction.handle());
    }
    
    /**
     * Computes the distance of the origin of the given {@link Ray} from the
     * given plane.
     * <p>
     * If the ray does not intersect the plane, this function returns {@code INFINITY}.
     */
    public float getDistanceToPlane(Plane p) {
        var RESULT = gtk_h.graphene_ray_get_distance_to_plane(handle(), p.handle());
        return RESULT;
    }
    
    /**
     * Computes the distance of the closest approach between the
     * given {@link Ray} @r and the point @p.
     * <p>
     * The closest approach to a ray from a point is the distance
     * between the point and the projection of the point on the
     * ray itself.
     */
    public float getDistanceToPoint(Point3D p) {
        var RESULT = gtk_h.graphene_ray_get_distance_to_point(handle(), p.handle());
        return RESULT;
    }
    
    /**
     * Retrieves the origin of the given {@link Ray}.
     */
    public void getOrigin(Point3D origin) {
        gtk_h.graphene_ray_get_origin(handle(), origin.handle());
    }
    
    /**
     * Retrieves the coordinates of a point at the distance @t along the
     * given {@link Ray}.
     */
    public void getPositionAt(float t, Point3D position) {
        gtk_h.graphene_ray_get_position_at(handle(), t, position.handle());
    }
    
    /**
     * Initializes the given {@link Ray} using the given {@code origin}
     * and {@code direction} values.
     */
    public Ray init(Point3D origin, Vec3 direction) {
        var RESULT = gtk_h.graphene_ray_init(handle(), origin.handle(), direction.handle());
        return new Ray(References.get(RESULT, false));
    }
    
    /**
     * Initializes the given {@link Ray} using the origin and direction
     * values of another {@link Ray}.
     */
    public Ray initFromRay(Ray src) {
        var RESULT = gtk_h.graphene_ray_init_from_ray(handle(), src.handle());
        return new Ray(References.get(RESULT, false));
    }
    
    /**
     * Initializes the given {@link Ray} using the given vectors.
     */
    public Ray initFromVec3(Vec3 origin, Vec3 direction) {
        var RESULT = gtk_h.graphene_ray_init_from_vec3(handle(), origin.handle(), direction.handle());
        return new Ray(References.get(RESULT, false));
    }
    
    /**
     * Intersects the given {@link Ray} @r with the given
     * {@link Box} @b.
     */
    public RayIntersectionKind intersectBox(Box b, PointerFloat tOut) {
        var RESULT = gtk_h.graphene_ray_intersect_box(handle(), b.handle(), tOut.handle());
        return new RayIntersectionKind(RESULT);
    }
    
    /**
     * Intersects the given {@link Ray} @r with the given
     * {@link Sphere} @s.
     */
    public RayIntersectionKind intersectSphere(Sphere s, PointerFloat tOut) {
        var RESULT = gtk_h.graphene_ray_intersect_sphere(handle(), s.handle(), tOut.handle());
        return new RayIntersectionKind(RESULT);
    }
    
    /**
     * Intersects the given {@link Ray} @r with the given
     * {@link Triangle} @t.
     */
    public RayIntersectionKind intersectTriangle(Triangle t, PointerFloat tOut) {
        var RESULT = gtk_h.graphene_ray_intersect_triangle(handle(), t.handle(), tOut.handle());
        return new RayIntersectionKind(RESULT);
    }
    
    /**
     * Checks whether the given {@link Ray} @r intersects the
     * given {@link Box} @b.
     * <p>
     * See also: graphene_ray_intersect_box()
     */
    public boolean intersectsBox(Box b) {
        var RESULT = gtk_h.graphene_ray_intersects_box(handle(), b.handle());
        return RESULT;
    }
    
    /**
     * Checks if the given {@link Ray} @r intersects the
     * given {@link Sphere} @s.
     * <p>
     * See also: graphene_ray_intersect_sphere()
     */
    public boolean intersectsSphere(Sphere s) {
        var RESULT = gtk_h.graphene_ray_intersects_sphere(handle(), s.handle());
        return RESULT;
    }
    
    /**
     * Checks whether the given {@link Ray} @r intersects the
     * given {@link Triangle} @b.
     * <p>
     * See also: graphene_ray_intersect_triangle()
     */
    public boolean intersectsTriangle(Triangle t) {
        var RESULT = gtk_h.graphene_ray_intersects_triangle(handle(), t.handle());
        return RESULT;
    }
    
}
