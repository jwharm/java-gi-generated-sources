package org.gtk.graphene;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A triangle.
 */
public class Triangle extends io.github.jwharm.javagi.interop.ResourceBase {

    public Triangle(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Allocates a new #graphene_triangle_t.
     * 
     * The contents of the returned structure are undefined.
     */
    public Triangle() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_triangle_alloc(), true));
    }
    
    /**
     * Checks whether the given triangle @t contains the point @p.
     */
    public boolean containsPoint(Point3D p) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_triangle_contains_point(HANDLE(), p.HANDLE());
        return RESULT;
    }
    
    /**
     * Checks whether the two given #graphene_triangle_t are equal.
     */
    public boolean equal(Triangle b) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_triangle_equal(HANDLE(), b.HANDLE());
        return RESULT;
    }
    
    /**
     * Frees the resources allocated by graphene_triangle_alloc().
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_triangle_free(HANDLE());
    }
    
    /**
     * Computes the area of the given #graphene_triangle_t.
     */
    public float getArea() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_triangle_get_area(HANDLE());
        return RESULT;
    }
    
    /**
     * Computes the [barycentric coordinates](http://en.wikipedia.org/wiki/Barycentric_coordinate_system)
     * of the given point @p.
     * 
     * The point @p must lie on the same plane as the triangle @t; if the
     * point is not coplanar, the result of this function is undefined.
     * 
     * If we place the origin in the coordinates of the triangle's A point,
     * the barycentric coordinates are `u`, which is on the AC vector; and `v`
     * which is on the AB vector:
     * 
     * ![](triangle-barycentric.png)
     * 
     * The returned #graphene_vec2_t contains the following values, in order:
     * 
     *  - `res.x = u`
     *  - `res.y = v`
     */
    public boolean getBarycoords(Point3D p, Vec2 res) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_triangle_get_barycoords(HANDLE(), p.HANDLE(), res.HANDLE());
        return RESULT;
    }
    
    /**
     * Computes the bounding box of the given #graphene_triangle_t.
     */
    public void getBoundingBox(Box res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_triangle_get_bounding_box(HANDLE(), res.HANDLE());
    }
    
    /**
     * Computes the coordinates of the midpoint of the given #graphene_triangle_t.
     * 
     * The midpoint G is the [centroid](https://en.wikipedia.org/wiki/Centroid#Triangle_centroid)
     * of the triangle, i.e. the intersection of its medians.
     */
    public void getMidpoint(Point3D res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_triangle_get_midpoint(HANDLE(), res.HANDLE());
    }
    
    /**
     * Computes the normal vector of the given #graphene_triangle_t.
     */
    public void getNormal(Vec3 res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_triangle_get_normal(HANDLE(), res.HANDLE());
    }
    
    /**
     * Computes the plane based on the vertices of the given #graphene_triangle_t.
     */
    public void getPlane(Plane res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_triangle_get_plane(HANDLE(), res.HANDLE());
    }
    
    /**
     * Retrieves the three vertices of the given #graphene_triangle_t and returns
     * their coordinates as #graphene_point3d_t.
     */
    public void getPoints(Point3D a, Point3D b, Point3D c) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_triangle_get_points(HANDLE(), a.HANDLE(), b.HANDLE(), c.HANDLE());
    }
    
    /**
     * Computes the UV coordinates of the given point @p.
     * 
     * The point @p must lie on the same plane as the triangle @t; if the point
     * is not coplanar, the result of this function is undefined. If @p is %NULL,
     * the point will be set in (0, 0, 0).
     * 
     * The UV coordinates will be placed in the @res vector:
     * 
     *  - `res.x = u`
     *  - `res.y = v`
     * 
     * See also: graphene_triangle_get_barycoords()
     */
    public boolean getUv(Point3D p, Vec2 uvA, Vec2 uvB, Vec2 uvC, Vec2 res) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_triangle_get_uv(HANDLE(), p.HANDLE(), uvA.HANDLE(), uvB.HANDLE(), uvC.HANDLE(), res.HANDLE());
        return RESULT;
    }
    
    /**
     * Retrieves the three vertices of the given #graphene_triangle_t.
     */
    public void getVertices(Vec3 a, Vec3 b, Vec3 c) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_triangle_get_vertices(HANDLE(), a.HANDLE(), b.HANDLE(), c.HANDLE());
    }
    
    /**
     * Initializes a #graphene_triangle_t using the three given arrays
     * of floating point values, each representing the coordinates of
     * a point in 3D space.
     */
    public Triangle initFromFloat(float[] a, float[] b, float[] c) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_triangle_init_from_float(HANDLE(), Interop.getAllocator().allocateArray(ValueLayout.JAVA_FLOAT, a), Interop.getAllocator().allocateArray(ValueLayout.JAVA_FLOAT, b), Interop.getAllocator().allocateArray(ValueLayout.JAVA_FLOAT, c));
        return new Triangle(References.get(RESULT, false));
    }
    
    /**
     * Initializes a #graphene_triangle_t using the three given 3D points.
     */
    public Triangle initFromPoint3d(Point3D a, Point3D b, Point3D c) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_triangle_init_from_point3d(HANDLE(), a.HANDLE(), b.HANDLE(), c.HANDLE());
        return new Triangle(References.get(RESULT, false));
    }
    
    /**
     * Initializes a #graphene_triangle_t using the three given vectors.
     */
    public Triangle initFromVec3(Vec3 a, Vec3 b, Vec3 c) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_triangle_init_from_vec3(HANDLE(), a.HANDLE(), b.HANDLE(), c.HANDLE());
        return new Triangle(References.get(RESULT, false));
    }
    
}
