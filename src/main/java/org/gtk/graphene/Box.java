package org.gtk.graphene;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A 3D box, described as the volume between a minimum and
 * a maximum vertices.
 */
public class Box extends io.github.jwharm.javagi.ResourceBase {

    public Box(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static Refcounted constructAlloc() {
        Refcounted RESULT = Refcounted.get(gtk_h.graphene_box_alloc(), true);
        return RESULT;
    }
    
    /**
     * Allocates a new {@link Box}.
     * <p>
     * The contents of the returned structure are undefined.
     */
    public static Box alloc() {
        return new Box(constructAlloc());
    }
    
    /**
     * Checks whether the {@link Box} @a contains the given
     * {@link Box} @b.
     */
    public boolean containsBox(Box b) {
        var RESULT = gtk_h.graphene_box_contains_box(handle(), b.handle());
        return RESULT;
    }
    
    /**
     * Checks whether {@code box} contains the given {@code point}.
     */
    public boolean containsPoint(Point3D point) {
        var RESULT = gtk_h.graphene_box_contains_point(handle(), point.handle());
        return RESULT;
    }
    
    /**
     * Checks whether the two given boxes are equal.
     */
    public boolean equal(Box b) {
        var RESULT = gtk_h.graphene_box_equal(handle(), b.handle());
        return RESULT;
    }
    
    /**
     * Expands the dimensions of {@code box} to include the coordinates at {@code point}.
     */
    public void expand(Point3D point, Box res) {
        gtk_h.graphene_box_expand(handle(), point.handle(), res.handle());
    }
    
    /**
     * Expands the dimensions of {@code box} by the given {@code scalar} value.
     * <p>
     * If {@code scalar} is positive, the {@link Box} will grow; if {@code scalar} is
     * negative, the {@link Box} will shrink.
     */
    public void expandScalar(float scalar, Box res) {
        gtk_h.graphene_box_expand_scalar(handle(), scalar, res.handle());
    }
    
    /**
     * Expands the dimensions of {@code box} to include the coordinates of the
     * given vector.
     */
    public void expandVec3(Vec3 vec, Box res) {
        gtk_h.graphene_box_expand_vec3(handle(), vec.handle(), res.handle());
    }
    
    /**
     * Frees the resources allocated by graphene_box_alloc().
     */
    public void free() {
        gtk_h.graphene_box_free(handle());
    }
    
    /**
     * Computes the bounding {@link Sphere} capable of containing the given
     * {@link Box}.
     */
    public void getBoundingSphere(Sphere sphere) {
        gtk_h.graphene_box_get_bounding_sphere(handle(), sphere.handle());
    }
    
    /**
     * Retrieves the coordinates of the center of a {@link Box}.
     */
    public void getCenter(Point3D center) {
        gtk_h.graphene_box_get_center(handle(), center.handle());
    }
    
    /**
     * Retrieves the size of the {@code box} on the Z axis.
     */
    public float getDepth() {
        var RESULT = gtk_h.graphene_box_get_depth(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the size of the {@code box} on the Y axis.
     */
    public float getHeight() {
        var RESULT = gtk_h.graphene_box_get_height(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the coordinates of the maximum point of the given
     * {@link Box}.
     */
    public void getMax(Point3D max) {
        gtk_h.graphene_box_get_max(handle(), max.handle());
    }
    
    /**
     * Retrieves the coordinates of the minimum point of the given
     * {@link Box}.
     */
    public void getMin(Point3D min) {
        gtk_h.graphene_box_get_min(handle(), min.handle());
    }
    
    /**
     * Retrieves the size of the box on all three axes, and stores
     * it into the given {@code size} vector.
     */
    public void getSize(Vec3 size) {
        gtk_h.graphene_box_get_size(handle(), size.handle());
    }
    
    /**
     * Computes the vertices of the given {@link Box}.
     */
    public void getVertices(Vec3[] vertices) {
        gtk_h.graphene_box_get_vertices(handle(), Interop.allocateNativeArray(vertices).handle());
    }
    
    /**
     * Retrieves the size of the {@code box} on the X axis.
     */
    public float getWidth() {
        var RESULT = gtk_h.graphene_box_get_width(handle());
        return RESULT;
    }
    
    /**
     * Initializes the given {@link Box} with two vertices.
     */
    public Box init(Point3D min, Point3D max) {
        var RESULT = gtk_h.graphene_box_init(handle(), min.handle(), max.handle());
        return new Box(Refcounted.get(RESULT, false));
    }
    
    /**
     * Initializes the given {@link Box} with the vertices of
     * another {@link Box}.
     */
    public Box initFromBox(Box src) {
        var RESULT = gtk_h.graphene_box_init_from_box(handle(), src.handle());
        return new Box(Refcounted.get(RESULT, false));
    }
    
    /**
     * Initializes the given {@link Box} with the given array
     * of vertices.
     * <p>
     * If {@code n_points} is 0, the returned box is initialized with
     * graphene_box_empty().
     */
    public Box initFromPoints(int nPoints, Point3D[] points) {
        var RESULT = gtk_h.graphene_box_init_from_points(handle(), nPoints, Interop.allocateNativeArray(points).handle());
        return new Box(Refcounted.get(RESULT, false));
    }
    
    /**
     * Initializes the given {@link Box} with two vertices
     * stored inside {@link Vec3}.
     */
    public Box initFromVec3(Vec3 min, Vec3 max) {
        var RESULT = gtk_h.graphene_box_init_from_vec3(handle(), min.handle(), max.handle());
        return new Box(Refcounted.get(RESULT, false));
    }
    
    /**
     * Initializes the given {@link Box} with the given array
     * of vertices.
     * <p>
     * If {@code n_vectors} is 0, the returned box is initialized with
     * graphene_box_empty().
     */
    public Box initFromVectors(int nVectors, Vec3[] vectors) {
        var RESULT = gtk_h.graphene_box_init_from_vectors(handle(), nVectors, Interop.allocateNativeArray(vectors).handle());
        return new Box(Refcounted.get(RESULT, false));
    }
    
    /**
     * Intersects the two given {@link Box}.
     * <p>
     * If the two boxes do not intersect, {@code res} will contain a degenerate box
     * initialized with graphene_box_empty().
     */
    public boolean intersection(Box b, Box res) {
        var RESULT = gtk_h.graphene_box_intersection(handle(), b.handle(), res.handle());
        return RESULT;
    }
    
    /**
     * Unions the two given {@link Box}.
     */
    public void union(Box b, Box res) {
        gtk_h.graphene_box_union(handle(), b.handle(), res.handle());
    }
    
    /**
     * A degenerate {@link Box} that can only be expanded.
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     */
    public static Box empty() {
        var RESULT = gtk_h.graphene_box_empty();
        return new Box(Refcounted.get(RESULT, false));
    }
    
    /**
     * A degenerate {@link Box} that cannot be expanded.
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     */
    public static Box infinite() {
        var RESULT = gtk_h.graphene_box_infinite();
        return new Box(Refcounted.get(RESULT, false));
    }
    
    /**
     * A {@link Box} with the minimum vertex set at (-1, -1, -1) and the
     * maximum vertex set at (0, 0, 0).
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     */
    public static Box minusOne() {
        var RESULT = gtk_h.graphene_box_minus_one();
        return new Box(Refcounted.get(RESULT, false));
    }
    
    /**
     * A {@link Box} with the minimum vertex set at (0, 0, 0) and the
     * maximum vertex set at (1, 1, 1).
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     */
    public static Box one() {
        var RESULT = gtk_h.graphene_box_one();
        return new Box(Refcounted.get(RESULT, false));
    }
    
    /**
     * A {@link Box} with the minimum vertex set at (-1, -1, -1) and the
     * maximum vertex set at (1, 1, 1).
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     */
    public static Box oneMinusOne() {
        var RESULT = gtk_h.graphene_box_one_minus_one();
        return new Box(Refcounted.get(RESULT, false));
    }
    
    /**
     * A {@link Box} with both the minimum and maximum vertices set at (0, 0, 0).
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     */
    public static Box zero() {
        var RESULT = gtk_h.graphene_box_zero();
        return new Box(Refcounted.get(RESULT, false));
    }
    
}
