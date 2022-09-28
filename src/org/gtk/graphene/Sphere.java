package org.gtk.graphene;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A sphere, represented by its center and radius.
 */
public class Sphere extends io.github.jwharm.javagi.ResourceBase {

    public Sphere(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructAlloc() {
        Reference RESULT = References.get(gtk_h.graphene_sphere_alloc(), true);
        return RESULT;
    }
    
    /**
     * Allocates a new {@link Sphere}.
     * <p>
     * The contents of the newly allocated structure are undefined.
     */
    public static Sphere alloc() {
        return new Sphere(constructAlloc());
    }
    
    /**
     * Checks whether the given {@code point} is contained in the volume
     * of a {@link Sphere}.
     */
    public boolean containsPoint(Point3D point) {
        var RESULT = gtk_h.graphene_sphere_contains_point(handle(), point.handle());
        return RESULT;
    }
    
    /**
     * Computes the distance of the given {@code point} from the surface of
     * a {@link Sphere}.
     */
    public float distance(Point3D point) {
        var RESULT = gtk_h.graphene_sphere_distance(handle(), point.handle());
        return RESULT;
    }
    
    /**
     * Checks whether two {@link Sphere} are equal.
     */
    public boolean equal(Sphere b) {
        var RESULT = gtk_h.graphene_sphere_equal(handle(), b.handle());
        return RESULT;
    }
    
    /**
     * Frees the resources allocated by graphene_sphere_alloc().
     */
    public void free() {
        gtk_h.graphene_sphere_free(handle());
    }
    
    /**
     * Computes the bounding box capable of containing the
     * given {@link Sphere}.
     */
    public void getBoundingBox(Box box) {
        gtk_h.graphene_sphere_get_bounding_box(handle(), box.handle());
    }
    
    /**
     * Retrieves the coordinates of the center of a {@link Sphere}.
     */
    public void getCenter(Point3D center) {
        gtk_h.graphene_sphere_get_center(handle(), center.handle());
    }
    
    /**
     * Retrieves the radius of a {@link Sphere}.
     */
    public float getRadius() {
        var RESULT = gtk_h.graphene_sphere_get_radius(handle());
        return RESULT;
    }
    
    /**
     * Initializes the given {@link Sphere} with the given {@code center} and {@code radius}.
     */
    public Sphere init(Point3D center, float radius) {
        var RESULT = gtk_h.graphene_sphere_init(handle(), center.handle(), radius);
        return new Sphere(References.get(RESULT, false));
    }
    
    /**
     * Initializes the given {@link Sphere} using the given array
     * of 3D coordinates so that the sphere includes them.
     * <p>
     * The center of the sphere can either be specified, or will be center
     * of the 3D volume that encompasses all {@code points}.
     */
    public Sphere initFromPoints(int nPoints, Point3D[] points, Point3D center) {
        var RESULT = gtk_h.graphene_sphere_init_from_points(handle(), nPoints, Interop.allocateNativeArray(points).handle(), center.handle());
        return new Sphere(References.get(RESULT, false));
    }
    
    /**
     * Initializes the given {@link Sphere} using the given array
     * of 3D coordinates so that the sphere includes them.
     * <p>
     * The center of the sphere can either be specified, or will be center
     * of the 3D volume that encompasses all {@code vectors}.
     */
    public Sphere initFromVectors(int nVectors, Vec3[] vectors, Point3D center) {
        var RESULT = gtk_h.graphene_sphere_init_from_vectors(handle(), nVectors, Interop.allocateNativeArray(vectors).handle(), center.handle());
        return new Sphere(References.get(RESULT, false));
    }
    
    /**
     * Checks whether the sphere has a zero radius.
     */
    public boolean isEmpty() {
        var RESULT = gtk_h.graphene_sphere_is_empty(handle());
        return RESULT;
    }
    
    /**
     * Translates the center of the given {@link Sphere} using the {@code point}
     * coordinates as the delta of the translation.
     */
    public void translate(Point3D point, Sphere res) {
        gtk_h.graphene_sphere_translate(handle(), point.handle(), res.handle());
    }
    
}
