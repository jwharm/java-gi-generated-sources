package org.gtk.graphene;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
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
        super(References.get(gtk_h.graphene_box_alloc(), true));
    }
    
    /**
     * Checks whether the #graphene_box_t @a contains the given
     * #graphene_box_t @b.
     */
    public boolean containsBox(Box b) {
        var RESULT = gtk_h.graphene_box_contains_box(handle(), b.handle());
        return RESULT;
    }
    
    /**
     * Checks whether @box contains the given @point.
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
     * Expands the dimensions of @box to include the coordinates at @point.
     */
    public void expand(Point3D point, Box res) {
        gtk_h.graphene_box_expand(handle(), point.handle(), res.handle());
    }
    
    /**
     * Expands the dimensions of @box by the given @scalar value.
     * 
     * If @scalar is positive, the #graphene_box_t will grow; if @scalar is
     * negative, the #graphene_box_t will shrink.
     */
    public void expandScalar(float scalar, Box res) {
        gtk_h.graphene_box_expand_scalar(handle(), scalar, res.handle());
    }
    
    /**
     * Expands the dimensions of @box to include the coordinates of the
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
     * Computes the bounding #graphene_sphere_t capable of containing the given
     * #graphene_box_t.
     */
    public void getBoundingSphere(Sphere sphere) {
        gtk_h.graphene_box_get_bounding_sphere(handle(), sphere.handle());
    }
    
    /**
     * Retrieves the coordinates of the center of a #graphene_box_t.
     */
    public void getCenter(Point3D center) {
        gtk_h.graphene_box_get_center(handle(), center.handle());
    }
    
    /**
     * Retrieves the size of the @box on the Z axis.
     */
    public float getDepth() {
        var RESULT = gtk_h.graphene_box_get_depth(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the size of the @box on the Y axis.
     */
    public float getHeight() {
        var RESULT = gtk_h.graphene_box_get_height(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the coordinates of the maximum point of the given
     * #graphene_box_t.
     */
    public void getMax(Point3D max) {
        gtk_h.graphene_box_get_max(handle(), max.handle());
    }
    
    /**
     * Retrieves the coordinates of the minimum point of the given
     * #graphene_box_t.
     */
    public void getMin(Point3D min) {
        gtk_h.graphene_box_get_min(handle(), min.handle());
    }
    
    /**
     * Retrieves the size of the box on all three axes, and stores
     * it into the given @size vector.
     */
    public void getSize(Vec3 size) {
        gtk_h.graphene_box_get_size(handle(), size.handle());
    }
    
    /**
     * Computes the vertices of the given #graphene_box_t.
     */
    public void getVertices(Vec3[] vertices) {
        gtk_h.graphene_box_get_vertices(handle(), Interop.allocateNativeArray(vertices));
    }
    
    /**
     * Retrieves the size of the @box on the X axis.
     */
    public float getWidth() {
        var RESULT = gtk_h.graphene_box_get_width(handle());
        return RESULT;
    }
    
    /**
     * Initializes the given #graphene_box_t with two vertices.
     */
    public Box init(Point3D min, Point3D max) {
        var RESULT = gtk_h.graphene_box_init(handle(), min.handle(), max.handle());
        return new Box(References.get(RESULT, false));
    }
    
    /**
     * Initializes the given #graphene_box_t with the vertices of
     * another #graphene_box_t.
     */
    public Box initFromBox(Box src) {
        var RESULT = gtk_h.graphene_box_init_from_box(handle(), src.handle());
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
        var RESULT = gtk_h.graphene_box_init_from_points(handle(), nPoints, Interop.allocateNativeArray(points));
        return new Box(References.get(RESULT, false));
    }
    
    /**
     * Initializes the given #graphene_box_t with two vertices
     * stored inside #graphene_vec3_t.
     */
    public Box initFromVec3(Vec3 min, Vec3 max) {
        var RESULT = gtk_h.graphene_box_init_from_vec3(handle(), min.handle(), max.handle());
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
        var RESULT = gtk_h.graphene_box_init_from_vectors(handle(), nVectors, Interop.allocateNativeArray(vectors));
        return new Box(References.get(RESULT, false));
    }
    
    /**
     * Intersects the two given #graphene_box_t.
     * 
     * If the two boxes do not intersect, @res will contain a degenerate box
     * initialized with graphene_box_empty().
     */
    public boolean intersection(Box b, Box res) {
        var RESULT = gtk_h.graphene_box_intersection(handle(), b.handle(), res.handle());
        return RESULT;
    }
    
    /**
     * Unions the two given #graphene_box_t.
     */
    public void union(Box b, Box res) {
        gtk_h.graphene_box_union(handle(), b.handle(), res.handle());
    }
    
}
