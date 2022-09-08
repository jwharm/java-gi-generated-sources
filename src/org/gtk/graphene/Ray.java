package org.gtk.graphene;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A ray emitted from an origin in a given direction.
 * 
 * The contents of the `graphene_ray_t` structure are private, and should not
 * be modified directly.
 */
public class Ray extends io.github.jwharm.javagi.interop.ResourceBase {

    public Ray(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Allocates a new #graphene_ray_t structure.
     * 
     * The contents of the returned structure are undefined.
     */
    public Ray() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_ray_alloc(), true));
    }
    
    /**
     * Checks whether the two given #graphene_ray_t are equal.
     */
    public boolean equal(Ray b) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_ray_equal(HANDLE(), b.HANDLE());
        return RESULT;
    }
    
    /**
     * Frees the resources allocated by graphene_ray_alloc().
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_ray_free(HANDLE());
    }
    
    /**
     * Computes the point on the given #graphene_ray_t that is closest to the
     * given point @p.
     */
    public void getClosestPointToPoint(Point3D p, Point3D res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_ray_get_closest_point_to_point(HANDLE(), p.HANDLE(), res.HANDLE());
    }
    
    /**
     * Retrieves the direction of the given #graphene_ray_t.
     */
    public void getDirection(Vec3 direction) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_ray_get_direction(HANDLE(), direction.HANDLE());
    }
    
    /**
     * Computes the distance of the origin of the given #graphene_ray_t from the
     * given plane.
     * 
     * If the ray does not intersect the plane, this function returns `INFINITY`.
     */
    public float getDistanceToPlane(Plane p) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_ray_get_distance_to_plane(HANDLE(), p.HANDLE());
        return RESULT;
    }
    
    /**
     * Computes the distance of the closest approach between the
     * given #graphene_ray_t @r and the point @p.
     * 
     * The closest approach to a ray from a point is the distance
     * between the point and the projection of the point on the
     * ray itself.
     */
    public float getDistanceToPoint(Point3D p) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_ray_get_distance_to_point(HANDLE(), p.HANDLE());
        return RESULT;
    }
    
    /**
     * Retrieves the origin of the given #graphene_ray_t.
     */
    public void getOrigin(Point3D origin) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_ray_get_origin(HANDLE(), origin.HANDLE());
    }
    
    /**
     * Retrieves the coordinates of a point at the distance @t along the
     * given #graphene_ray_t.
     */
    public void getPositionAt(float t, Point3D position) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_ray_get_position_at(HANDLE(), t, position.HANDLE());
    }
    
    /**
     * Initializes the given #graphene_ray_t using the given @origin
     * and @direction values.
     */
    public Ray init(Point3D origin, Vec3 direction) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_ray_init(HANDLE(), origin.HANDLE(), direction.HANDLE());
        return new Ray(References.get(RESULT, false));
    }
    
    /**
     * Initializes the given #graphene_ray_t using the origin and direction
     * values of another #graphene_ray_t.
     */
    public Ray initFromRay(Ray src) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_ray_init_from_ray(HANDLE(), src.HANDLE());
        return new Ray(References.get(RESULT, false));
    }
    
    /**
     * Initializes the given #graphene_ray_t using the given vectors.
     */
    public Ray initFromVec3(Vec3 origin, Vec3 direction) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_ray_init_from_vec3(HANDLE(), origin.HANDLE(), direction.HANDLE());
        return new Ray(References.get(RESULT, false));
    }
    
    /**
     * Checks whether the given #graphene_ray_t @r intersects the
     * given #graphene_box_t @b.
     * 
     * See also: graphene_ray_intersect_box()
     */
    public boolean intersectsBox(Box b) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_ray_intersects_box(HANDLE(), b.HANDLE());
        return RESULT;
    }
    
    /**
     * Checks if the given #graphene_ray_t @r intersects the
     * given #graphene_sphere_t @s.
     * 
     * See also: graphene_ray_intersect_sphere()
     */
    public boolean intersectsSphere(Sphere s) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_ray_intersects_sphere(HANDLE(), s.HANDLE());
        return RESULT;
    }
    
    /**
     * Checks whether the given #graphene_ray_t @r intersects the
     * given #graphene_triangle_t @b.
     * 
     * See also: graphene_ray_intersect_triangle()
     */
    public boolean intersectsTriangle(Triangle t) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_ray_intersects_triangle(HANDLE(), t.HANDLE());
        return RESULT;
    }
    
}
