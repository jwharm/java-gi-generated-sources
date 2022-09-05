package org.gtk.graphene;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A point with three components: X, Y, and Z.
 */
public class Point3D extends io.github.jwharm.javagi.interop.ResourceBase {

    public Point3D(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Allocates a #graphene_point3d_t structure.
     */
    public Point3D() {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_point3d_alloc(), true));
    }
    
    /**
     * Computes the cross product of the two given #graphene_point3d_t.
     */
    public void cross(Point3D b, Point3D res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_point3d_cross(HANDLE(), b.HANDLE(), res.HANDLE());
    }
    
    /**
     * Computes the distance between the two given #graphene_point3d_t.
     */
    public float distance(Point3D b, Vec3 delta) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_point3d_distance(HANDLE(), b.HANDLE(), delta.HANDLE());
        return RESULT;
    }
    
    /**
     * Computes the dot product of the two given #graphene_point3d_t.
     */
    public float dot(Point3D b) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_point3d_dot(HANDLE(), b.HANDLE());
        return RESULT;
    }
    
    /**
     * Checks whether two given points are equal.
     */
    public boolean equal(Point3D b) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_point3d_equal(HANDLE(), b.HANDLE());
        return RESULT;
    }
    
    /**
     * Frees the resources allocated via graphene_point3d_alloc().
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_point3d_free(HANDLE());
    }
    
    /**
     * Initializes a #graphene_point3d_t with the given coordinates.
     */
    public Point3D init(float x, float y, float z) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_point3d_init(HANDLE(), x, y, z);
        return new Point3D(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Initializes a #graphene_point3d_t using the coordinates of
     * another #graphene_point3d_t.
     */
    public Point3D initFromPoint(Point3D src) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_point3d_init_from_point(HANDLE(), src.HANDLE());
        return new Point3D(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Initializes a #graphene_point3d_t using the components
     * of a #graphene_vec3_t.
     */
    public Point3D initFromVec3(Vec3 v) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_point3d_init_from_vec3(HANDLE(), v.HANDLE());
        return new Point3D(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Linearly interpolates each component of @a and @b using the
     * provided @factor, and places the result in @res.
     */
    public void interpolate(Point3D b, double factor, Point3D res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_point3d_interpolate(HANDLE(), b.HANDLE(), factor, res.HANDLE());
    }
    
    /**
     * Computes the length of the vector represented by the
     * coordinates of the given #graphene_point3d_t.
     */
    public float length() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_point3d_length(HANDLE());
        return RESULT;
    }
    
    /**
     * Checks whether the two points are near each other, within
     * an @epsilon factor.
     */
    public boolean near(Point3D b, float epsilon) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_point3d_near(HANDLE(), b.HANDLE(), epsilon);
        return RESULT;
    }
    
    /**
     * Computes the normalization of the vector represented by the
     * coordinates of the given #graphene_point3d_t.
     */
    public void normalize(Point3D res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_point3d_normalize(HANDLE(), res.HANDLE());
    }
    
    /**
     * Normalizes the coordinates of a #graphene_point3d_t using the
     * given viewport and clipping planes.
     * 
     * The coordinates of the resulting #graphene_point3d_t will be
     * in the [ -1, 1 ] range.
     */
    public void normalizeViewport(Rect viewport, float zNear, float zFar, Point3D res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_point3d_normalize_viewport(HANDLE(), viewport.HANDLE(), zNear, zFar, res.HANDLE());
    }
    
    /**
     * Scales the coordinates of the given #graphene_point3d_t by
     * the given @factor.
     */
    public void scale(float factor, Point3D res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_point3d_scale(HANDLE(), factor, res.HANDLE());
    }
    
    /**
     * Stores the coordinates of a #graphene_point3d_t into a
     * #graphene_vec3_t.
     */
    public void toVec3(Vec3 v) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_point3d_to_vec3(HANDLE(), v.HANDLE());
    }
    
}
