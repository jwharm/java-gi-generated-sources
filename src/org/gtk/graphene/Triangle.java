package org.gtk.graphene;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A triangle.
 */
public class Triangle extends io.github.jwharm.javagi.ResourceBase {

    public Triangle(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructAlloc() {
        Reference RESULT = References.get(gtk_h.graphene_triangle_alloc(), true);
        return RESULT;
    }
    
    /**
     * Allocates a new {@link Triangle}.
     * <p>
     * The contents of the returned structure are undefined.
     */
    public static Triangle alloc() {
        return new Triangle(constructAlloc());
    }
    
    /**
     * Checks whether the given triangle @t contains the point @p.
     */
    public boolean containsPoint(Point3D p) {
        var RESULT = gtk_h.graphene_triangle_contains_point(handle(), p.handle());
        return RESULT;
    }
    
    /**
     * Checks whether the two given {@link Triangle} are equal.
     */
    public boolean equal(Triangle b) {
        var RESULT = gtk_h.graphene_triangle_equal(handle(), b.handle());
        return RESULT;
    }
    
    /**
     * Frees the resources allocated by graphene_triangle_alloc().
     */
    public void free() {
        gtk_h.graphene_triangle_free(handle());
    }
    
    /**
     * Computes the area of the given {@link Triangle}.
     */
    public float getArea() {
        var RESULT = gtk_h.graphene_triangle_get_area(handle());
        return RESULT;
    }
    
    /**
     * Computes the <a href="http://en.wikipedia.org/wiki/Barycentric_coordinate_system">barycentric coordinates</a>
     * of the given point @p.
     * <p>
     * The point @p must lie on the same plane as the triangle @t; if the
     * point is not coplanar, the result of this function is undefined.
     * <p>
     * If we place the origin in the coordinates of the triangle's A point,
     * the barycentric coordinates are {@code u}, which is on the AC vector; and {@code v}
     * which is on the AB vector:
     * <p>
     * ![](triangle-barycentric.png)
     * <p>
     * The returned {@link Vec2} contains the following values, in order:
     * <p>
     * <ul>
     * <li>{@code res.x = u}
     * <li>{@code res.y = v}
     */
    public boolean getBarycoords(Point3D p, Vec2 res) {
        var RESULT = gtk_h.graphene_triangle_get_barycoords(handle(), p.handle(), res.handle());
        return RESULT;
    }
    
    /**
     * Computes the bounding box of the given {@link Triangle}.
     */
    public void getBoundingBox(Box res) {
        gtk_h.graphene_triangle_get_bounding_box(handle(), res.handle());
    }
    
    /**
     * Computes the coordinates of the midpoint of the given {@link Triangle}.
     * <p>
     * The midpoint G is the <a href="https://en.wikipedia.org/wiki/Centroid#Triangle_centroid">centroid</a>
     * of the triangle, i.e. the intersection of its medians.
     */
    public void getMidpoint(Point3D res) {
        gtk_h.graphene_triangle_get_midpoint(handle(), res.handle());
    }
    
    /**
     * Computes the normal vector of the given {@link Triangle}.
     */
    public void getNormal(Vec3 res) {
        gtk_h.graphene_triangle_get_normal(handle(), res.handle());
    }
    
    /**
     * Computes the plane based on the vertices of the given {@link Triangle}.
     */
    public void getPlane(Plane res) {
        gtk_h.graphene_triangle_get_plane(handle(), res.handle());
    }
    
    /**
     * Retrieves the three vertices of the given {@link Triangle} and returns
     * their coordinates as {@link Point3D}.
     */
    public void getPoints(Point3D a, Point3D b, Point3D c) {
        gtk_h.graphene_triangle_get_points(handle(), a.handle(), b.handle(), c.handle());
    }
    
    /**
     * Computes the UV coordinates of the given point @p.
     * <p>
     * The point @p must lie on the same plane as the triangle @t; if the point
     * is not coplanar, the result of this function is undefined. If @p is <code>null</code>,
     * the point will be set in (0, 0, 0).
     * <p>
     * The UV coordinates will be placed in the {@code res} vector:
     * <p>
     * <ul>
     * <li>{@code res.x = u}
     * <li>{@code res.y = v}
     * </ul>
     * <p>
     * See also: graphene_triangle_get_barycoords()
     */
    public boolean getUv(Point3D p, Vec2 uvA, Vec2 uvB, Vec2 uvC, Vec2 res) {
        var RESULT = gtk_h.graphene_triangle_get_uv(handle(), p.handle(), uvA.handle(), uvB.handle(), uvC.handle(), res.handle());
        return RESULT;
    }
    
    /**
     * Retrieves the three vertices of the given {@link Triangle}.
     */
    public void getVertices(Vec3 a, Vec3 b, Vec3 c) {
        gtk_h.graphene_triangle_get_vertices(handle(), a.handle(), b.handle(), c.handle());
    }
    
    /**
     * Initializes a {@link Triangle} using the three given arrays
     * of floating point values, each representing the coordinates of
     * a point in 3D space.
     */
    public Triangle initFromFloat(float[] a, float[] b, float[] c) {
        var RESULT = gtk_h.graphene_triangle_init_from_float(handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_FLOAT, a)).handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_FLOAT, b)).handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_FLOAT, c)).handle());
        return new Triangle(References.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link Triangle} using the three given 3D points.
     */
    public Triangle initFromPoint3d(Point3D a, Point3D b, Point3D c) {
        var RESULT = gtk_h.graphene_triangle_init_from_point3d(handle(), a.handle(), b.handle(), c.handle());
        return new Triangle(References.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link Triangle} using the three given vectors.
     */
    public Triangle initFromVec3(Vec3 a, Vec3 b, Vec3 c) {
        var RESULT = gtk_h.graphene_triangle_init_from_vec3(handle(), a.handle(), b.handle(), c.handle());
        return new Triangle(References.get(RESULT, false));
    }
    
}
