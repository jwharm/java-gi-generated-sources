package org.gtk.graphene;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A 2D plane that extends infinitely in a 3D volume.
 * 
 * The contents of the `graphene_plane_t` are private, and should not be
 * modified directly.
 */
public class Plane extends io.github.jwharm.javagi.interop.ResourceBase {

    public Plane(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Allocates a new #graphene_plane_t structure.
     * 
     * The contents of the returned structure are undefined.
     */
    public Plane() {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_plane_alloc(), true));
    }
    
    /**
     * Computes the distance of @point from a #graphene_plane_t.
     */
    public float distance(Point3D point) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_plane_distance(HANDLE(), point.HANDLE());
        return RESULT;
    }
    
    /**
     * Checks whether the two given #graphene_plane_t are equal.
     */
    public boolean equal(Plane b) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_plane_equal(HANDLE(), b.HANDLE());
        return RESULT;
    }
    
    /**
     * Frees the resources allocated by graphene_plane_alloc().
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_plane_free(HANDLE());
    }
    
    /**
     * Retrieves the distance along the normal vector of the
     * given #graphene_plane_t from the origin.
     */
    public float getConstant() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_plane_get_constant(HANDLE());
        return RESULT;
    }
    
    /**
     * Retrieves the normal vector pointing towards the origin of the
     * given #graphene_plane_t.
     */
    public void getNormal(Vec3 normal) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_plane_get_normal(HANDLE(), normal.HANDLE());
    }
    
    /**
     * Initializes the given #graphene_plane_t using the given @normal vector
     * and @constant values.
     */
    public Plane init(Vec3 normal, float constant) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_plane_init(HANDLE(), normal.HANDLE(), constant);
        return new Plane(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Initializes the given #graphene_plane_t using the normal
     * vector and constant of another #graphene_plane_t.
     */
    public Plane initFromPlane(Plane src) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_plane_init_from_plane(HANDLE(), src.HANDLE());
        return new Plane(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Initializes the given #graphene_plane_t using the given normal vector
     * and an arbitrary co-planar point.
     */
    public Plane initFromPoint(Vec3 normal, Point3D point) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_plane_init_from_point(HANDLE(), normal.HANDLE(), point.HANDLE());
        return new Plane(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Initializes the given #graphene_plane_t using the 3 provided co-planar
     * points.
     * 
     * The winding order is counter-clockwise, and determines which direction
     * the normal vector will point.
     */
    public Plane initFromPoints(Point3D a, Point3D b, Point3D c) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_plane_init_from_points(HANDLE(), a.HANDLE(), b.HANDLE(), c.HANDLE());
        return new Plane(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Initializes the given #graphene_plane_t using the components of
     * the given #graphene_vec4_t vector.
     */
    public Plane initFromVec4(Vec4 src) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_plane_init_from_vec4(HANDLE(), src.HANDLE());
        return new Plane(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Negates the normal vector and constant of a #graphene_plane_t, effectively
     * mirroring the plane across the origin.
     */
    public void negate(Plane res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_plane_negate(HANDLE(), res.HANDLE());
    }
    
    /**
     * Normalizes the vector of the given #graphene_plane_t,
     * and adjusts the constant accordingly.
     */
    public void normalize(Plane res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_plane_normalize(HANDLE(), res.HANDLE());
    }
    
    /**
     * Transforms a #graphene_plane_t @p using the given @matrix
     * and @normal_matrix.
     * 
     * If @normal_matrix is %NULL, a transformation matrix for the plane
     * normal will be computed from @matrix. If you are transforming
     * multiple planes using the same @matrix it's recommended to compute
     * the normal matrix beforehand to avoid incurring in the cost of
     * recomputing it every time.
     */
    public void transform(Matrix matrix, Matrix normalMatrix, Plane res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_plane_transform(HANDLE(), matrix.HANDLE(), normalMatrix.HANDLE(), res.HANDLE());
    }
    
}
