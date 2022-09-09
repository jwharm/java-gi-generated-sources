package org.gtk.graphene;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A point with three components: X, Y, and Z.
 */
public class Point3D extends io.github.jwharm.javagi.interop.ResourceBase {

    public Point3D(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Allocates a #graphene_point3d_t structure.
     */
    public static Point3D alloc() {
        return new Point3D(References.get(gtk_h.graphene_point3d_alloc(), true));
    }
    
    /**
     * Computes the cross product of the two given #graphene_point3d_t.
     */
    public void cross(Point3D b, Point3D res) {
        gtk_h.graphene_point3d_cross(handle(), b.handle(), res.handle());
    }
    
    /**
     * Computes the distance between the two given #graphene_point3d_t.
     */
    public float distance(Point3D b, Vec3 delta) {
        var RESULT = gtk_h.graphene_point3d_distance(handle(), b.handle(), delta.handle());
        return RESULT;
    }
    
    /**
     * Computes the dot product of the two given #graphene_point3d_t.
     */
    public float dot(Point3D b) {
        var RESULT = gtk_h.graphene_point3d_dot(handle(), b.handle());
        return RESULT;
    }
    
    /**
     * Checks whether two given points are equal.
     */
    public boolean equal(Point3D b) {
        var RESULT = gtk_h.graphene_point3d_equal(handle(), b.handle());
        return RESULT;
    }
    
    /**
     * Frees the resources allocated via graphene_point3d_alloc().
     */
    public void free() {
        gtk_h.graphene_point3d_free(handle());
    }
    
    /**
     * Initializes a #graphene_point3d_t with the given coordinates.
     */
    public Point3D init(float x, float y, float z) {
        var RESULT = gtk_h.graphene_point3d_init(handle(), x, y, z);
        return new Point3D(References.get(RESULT, false));
    }
    
    /**
     * Initializes a #graphene_point3d_t using the coordinates of
     * another #graphene_point3d_t.
     */
    public Point3D initFromPoint(Point3D src) {
        var RESULT = gtk_h.graphene_point3d_init_from_point(handle(), src.handle());
        return new Point3D(References.get(RESULT, false));
    }
    
    /**
     * Initializes a #graphene_point3d_t using the components
     * of a #graphene_vec3_t.
     */
    public Point3D initFromVec3(Vec3 v) {
        var RESULT = gtk_h.graphene_point3d_init_from_vec3(handle(), v.handle());
        return new Point3D(References.get(RESULT, false));
    }
    
    /**
     * Linearly interpolates each component of @a and @b using the
     * provided @factor, and places the result in @res.
     */
    public void interpolate(Point3D b, double factor, Point3D res) {
        gtk_h.graphene_point3d_interpolate(handle(), b.handle(), factor, res.handle());
    }
    
    /**
     * Computes the length of the vector represented by the
     * coordinates of the given #graphene_point3d_t.
     */
    public float length() {
        var RESULT = gtk_h.graphene_point3d_length(handle());
        return RESULT;
    }
    
    /**
     * Checks whether the two points are near each other, within
     * an @epsilon factor.
     */
    public boolean near(Point3D b, float epsilon) {
        var RESULT = gtk_h.graphene_point3d_near(handle(), b.handle(), epsilon);
        return RESULT;
    }
    
    /**
     * Computes the normalization of the vector represented by the
     * coordinates of the given #graphene_point3d_t.
     */
    public void normalize(Point3D res) {
        gtk_h.graphene_point3d_normalize(handle(), res.handle());
    }
    
    /**
     * Normalizes the coordinates of a #graphene_point3d_t using the
     * given viewport and clipping planes.
     * 
     * The coordinates of the resulting #graphene_point3d_t will be
     * in the [ -1, 1 ] range.
     */
    public void normalizeViewport(Rect viewport, float zNear, float zFar, Point3D res) {
        gtk_h.graphene_point3d_normalize_viewport(handle(), viewport.handle(), zNear, zFar, res.handle());
    }
    
    /**
     * Scales the coordinates of the given #graphene_point3d_t by
     * the given @factor.
     */
    public void scale(float factor, Point3D res) {
        gtk_h.graphene_point3d_scale(handle(), factor, res.handle());
    }
    
    /**
     * Stores the coordinates of a #graphene_point3d_t into a
     * #graphene_vec3_t.
     */
    public void toVec3(Vec3 v) {
        gtk_h.graphene_point3d_to_vec3(handle(), v.handle());
    }
    
    /**
     * Retrieves a constant point with all three coordinates set to 0.
     */
    public static Point3D zero() {
        var RESULT = gtk_h.graphene_point3d_zero();
        return new Point3D(References.get(RESULT, false));
    }
    
}
