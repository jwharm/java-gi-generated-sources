package org.gtk.graphene;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A 3D box, described as the volume between a minimum and
 * a maximum vertices.
 */
public class Box extends io.github.jwharm.javagi.interop.ResourceBase {

    public Box(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Allocates a new #graphene_box_t.
     * 
     * The contents of the returned structure are undefined.
     */
    public Box() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_box_alloc(), true));
    }
    
    /**
     * Checks whether the #graphene_box_t @a contains the given
     * #graphene_box_t @b.
     */
    public boolean containsBox(Box b) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_box_contains_box(HANDLE(), b.HANDLE());
        return RESULT;
    }
    
    /**
     * Checks whether @box contains the given @point.
     */
    public boolean containsPoint(Point3D point) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_box_contains_point(HANDLE(), point.HANDLE());
        return RESULT;
    }
    
    /**
     * Checks whether the two given boxes are equal.
     */
    public boolean equal(Box b) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_box_equal(HANDLE(), b.HANDLE());
        return RESULT;
    }
    
    /**
     * Expands the dimensions of @box to include the coordinates at @point.
     */
    public void expand(Point3D point, Box res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_box_expand(HANDLE(), point.HANDLE(), res.HANDLE());
    }
    
    /**
     * Expands the dimensions of @box by the given @scalar value.
     * 
     * If @scalar is positive, the #graphene_box_t will grow; if @scalar is
     * negative, the #graphene_box_t will shrink.
     */
    public void expandScalar(float scalar, Box res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_box_expand_scalar(HANDLE(), scalar, res.HANDLE());
    }
    
    /**
     * Expands the dimensions of @box to include the coordinates of the
     * given vector.
     */
    public void expandVec3(Vec3 vec, Box res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_box_expand_vec3(HANDLE(), vec.HANDLE(), res.HANDLE());
    }
    
    /**
     * Frees the resources allocated by graphene_box_alloc().
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_box_free(HANDLE());
    }
    
    /**
     * Computes the bounding #graphene_sphere_t capable of containing the given
     * #graphene_box_t.
     */
    public void getBoundingSphere(Sphere sphere) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_box_get_bounding_sphere(HANDLE(), sphere.HANDLE());
    }
    
    /**
     * Retrieves the coordinates of the center of a #graphene_box_t.
     */
    public void getCenter(Point3D center) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_box_get_center(HANDLE(), center.HANDLE());
    }
    
    /**
     * Retrieves the size of the @box on the Z axis.
     */
    public float getDepth() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_box_get_depth(HANDLE());
        return RESULT;
    }
    
    /**
     * Retrieves the size of the @box on the Y axis.
     */
    public float getHeight() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_box_get_height(HANDLE());
        return RESULT;
    }
    
    /**
     * Retrieves the coordinates of the maximum point of the given
     * #graphene_box_t.
     */
    public void getMax(Point3D max) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_box_get_max(HANDLE(), max.HANDLE());
    }
    
    /**
     * Retrieves the coordinates of the minimum point of the given
     * #graphene_box_t.
     */
    public void getMin(Point3D min) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_box_get_min(HANDLE(), min.HANDLE());
    }
    
    /**
     * Retrieves the size of the box on all three axes, and stores
     * it into the given @size vector.
     */
    public void getSize(Vec3 size) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_box_get_size(HANDLE(), size.HANDLE());
    }
    
    /**
     * Computes the vertices of the given #graphene_box_t.
     */
    public void getVertices(Vec3[] vertices) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_box_get_vertices(HANDLE(), Interop.allocateNativeArray(vertices));
    }
    
    /**
     * Retrieves the size of the @box on the X axis.
     */
    public float getWidth() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_box_get_width(HANDLE());
        return RESULT;
    }
    
    /**
     * Initializes the given #graphene_box_t with two vertices.
     */
    public Box init(Point3D min, Point3D max) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_box_init(HANDLE(), min.HANDLE(), max.HANDLE());
        return new Box(References.get(RESULT, false));
    }
    
    /**
     * Initializes the given #graphene_box_t with the vertices of
     * another #graphene_box_t.
     */
    public Box initFromBox(Box src) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_box_init_from_box(HANDLE(), src.HANDLE());
        return new Box(References.get(RESULT, false));
    }
    
    /**
     * Initializes the given #graphene_box_t with the given array
     * of vertices.
     * 
     * If @n_points is 0, the returned box is initialized with
     * graphene_box_empty().
     */
    public Box initFromPoints(int nPoints, Point3D[] points) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_box_init_from_points(HANDLE(), nPoints, Interop.allocateNativeArray(points));
        return new Box(References.get(RESULT, false));
    }
    
    /**
     * Initializes the given #graphene_box_t with two vertices
     * stored inside #graphene_vec3_t.
     */
    public Box initFromVec3(Vec3 min, Vec3 max) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_box_init_from_vec3(HANDLE(), min.HANDLE(), max.HANDLE());
        return new Box(References.get(RESULT, false));
    }
    
    /**
     * Initializes the given #graphene_box_t with the given array
     * of vertices.
     * 
     * If @n_vectors is 0, the returned box is initialized with
     * graphene_box_empty().
     */
    public Box initFromVectors(int nVectors, Vec3[] vectors) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_box_init_from_vectors(HANDLE(), nVectors, Interop.allocateNativeArray(vectors));
        return new Box(References.get(RESULT, false));
    }
    
    /**
     * Intersects the two given #graphene_box_t.
     * 
     * If the two boxes do not intersect, @res will contain a degenerate box
     * initialized with graphene_box_empty().
     */
    public boolean intersection(Box b, Box res) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_box_intersection(HANDLE(), b.HANDLE(), res.HANDLE());
        return RESULT;
    }
    
    /**
     * Unions the two given #graphene_box_t.
     */
    public void union(Box b, Box res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_box_union(HANDLE(), b.HANDLE(), res.HANDLE());
    }
    
}
