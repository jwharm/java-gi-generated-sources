package org.gtk.graphene;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A sphere, represented by its center and radius.
 */
public class Sphere extends io.github.jwharm.javagi.interop.ResourceBase {

    public Sphere(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Allocates a new #graphene_sphere_t.
     * 
     * The contents of the newly allocated structure are undefined.
     */
    public Sphere() {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_sphere_alloc(), true));
    }
    
    /**
     * Checks whether the given @point is contained in the volume
     * of a #graphene_sphere_t.
     */
    public boolean containsPoint(Point3D point) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_sphere_contains_point(HANDLE(), point.HANDLE());
        return RESULT;
    }
    
    /**
     * Computes the distance of the given @point from the surface of
     * a #graphene_sphere_t.
     */
    public float distance(Point3D point) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_sphere_distance(HANDLE(), point.HANDLE());
        return RESULT;
    }
    
    /**
     * Checks whether two #graphene_sphere_t are equal.
     */
    public boolean equal(Sphere b) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_sphere_equal(HANDLE(), b.HANDLE());
        return RESULT;
    }
    
    /**
     * Frees the resources allocated by graphene_sphere_alloc().
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_sphere_free(HANDLE());
    }
    
    /**
     * Computes the bounding box capable of containing the
     * given #graphene_sphere_t.
     */
    public void getBoundingBox(Box box) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_sphere_get_bounding_box(HANDLE(), box.HANDLE());
    }
    
    /**
     * Retrieves the coordinates of the center of a #graphene_sphere_t.
     */
    public void getCenter(Point3D center) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_sphere_get_center(HANDLE(), center.HANDLE());
    }
    
    /**
     * Retrieves the radius of a #graphene_sphere_t.
     */
    public float getRadius() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_sphere_get_radius(HANDLE());
        return RESULT;
    }
    
    /**
     * Initializes the given #graphene_sphere_t with the given @center and @radius.
     */
    public Sphere init(Point3D center, float radius) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_sphere_init(HANDLE(), center.HANDLE(), radius);
        return new Sphere(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Initializes the given #graphene_sphere_t using the given array
     * of 3D coordinates so that the sphere includes them.
     * 
     * The center of the sphere can either be specified, or will be center
     * of the 3D volume that encompasses all @points.
     */
    public Sphere initFromPoints(int nPoints, Point3D[] points, Point3D center) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_sphere_init_from_points(HANDLE(), nPoints, Interop.allocateNativeArray(points), center.HANDLE());
        return new Sphere(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Initializes the given #graphene_sphere_t using the given array
     * of 3D coordinates so that the sphere includes them.
     * 
     * The center of the sphere can either be specified, or will be center
     * of the 3D volume that encompasses all @vectors.
     */
    public Sphere initFromVectors(int nVectors, Vec3[] vectors, Point3D center) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_sphere_init_from_vectors(HANDLE(), nVectors, Interop.allocateNativeArray(vectors), center.HANDLE());
        return new Sphere(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Checks whether the sphere has a zero radius.
     */
    public boolean isEmpty() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_sphere_is_empty(HANDLE());
        return RESULT;
    }
    
    /**
     * Translates the center of the given #graphene_sphere_t using the @point
     * coordinates as the delta of the translation.
     */
    public void translate(Point3D point, Sphere res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_sphere_translate(HANDLE(), point.HANDLE(), res.HANDLE());
    }
    
}
