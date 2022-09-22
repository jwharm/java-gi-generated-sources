package org.gtk.graphene;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A point with three components: X, Y, and Z.
 */
public class Point3D extends io.github.jwharm.javagi.ResourceBase {

    public Point3D(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructAlloc() {
        Reference RESULT = References.get(gtk_h.graphene_point3d_alloc(), true);
        return RESULT;
    }
    
    /**
     * Allocates a {@link Point3D} structure.
     */
    public static Point3D alloc() {
        return new Point3D(constructAlloc());
    }
    
    /**
     * Computes the cross product of the two given {@link Point3D}.
     */
    public void cross(Point3D b, Point3D res) {
        gtk_h.graphene_point3d_cross(handle(), b.handle(), res.handle());
    }
    
    /**
     * Computes the distance between the two given {@link Point3D}.
     */
    public float distance(Point3D b, Vec3 delta) {
        var RESULT = gtk_h.graphene_point3d_distance(handle(), b.handle(), delta.handle());
        return RESULT;
    }
    
    /**
     * Computes the dot product of the two given {@link Point3D}.
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
     * Initializes a {@link Point3D} with the given coordinates.
     */
    public Point3D init(float x, float y, float z) {
        var RESULT = gtk_h.graphene_point3d_init(handle(), x, y, z);
        return new Point3D(References.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link Point3D} using the coordinates of
     * another {@link Point3D}.
     */
    public Point3D initFromPoint(Point3D src) {
        var RESULT = gtk_h.graphene_point3d_init_from_point(handle(), src.handle());
        return new Point3D(References.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link Point3D} using the components
     * of a {@link Vec3}.
     */
    public Point3D initFromVec3(Vec3 v) {
        var RESULT = gtk_h.graphene_point3d_init_from_vec3(handle(), v.handle());
        return new Point3D(References.get(RESULT, false));
    }
    
    /**
     * Linearly interpolates each component of @a and @b using the
     * provided {@code factor}, and places the result in {@code res}.
     */
    public void interpolate(Point3D b, double factor, Point3D res) {
        gtk_h.graphene_point3d_interpolate(handle(), b.handle(), factor, res.handle());
    }
    
    /**
     * Computes the length of the vector represented by the
     * coordinates of the given {@link Point3D}.
     */
    public float length() {
        var RESULT = gtk_h.graphene_point3d_length(handle());
        return RESULT;
    }
    
    /**
     * Checks whether the two points are near each other, within
     * an {@code epsilon} factor.
     */
    public boolean near(Point3D b, float epsilon) {
        var RESULT = gtk_h.graphene_point3d_near(handle(), b.handle(), epsilon);
        return RESULT;
    }
    
    /**
     * Computes the normalization of the vector represented by the
     * coordinates of the given {@link Point3D}.
     */
    public void normalize(Point3D res) {
        gtk_h.graphene_point3d_normalize(handle(), res.handle());
    }
    
    /**
     * Normalizes the coordinates of a {@link Point3D} using the
     * given viewport and clipping planes.
     * <p>
     * The coordinates of the resulting {@link Point3D} will be
     * in the [ -1, 1 ] range.
     */
    public void normalizeViewport(Rect viewport, float zNear, float zFar, Point3D res) {
        gtk_h.graphene_point3d_normalize_viewport(handle(), viewport.handle(), zNear, zFar, res.handle());
    }
    
    /**
     * Scales the coordinates of the given {@link Point3D} by
     * the given {@code factor}.
     */
    public void scale(float factor, Point3D res) {
        gtk_h.graphene_point3d_scale(handle(), factor, res.handle());
    }
    
    /**
     * Stores the coordinates of a {@link Point3D} into a
     * {@link Vec3}.
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
