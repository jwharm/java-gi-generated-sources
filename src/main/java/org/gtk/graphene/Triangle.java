package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A triangle.
 */
public class Triangle extends io.github.jwharm.javagi.ResourceBase {

    public Triangle(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle graphene_triangle_alloc = Interop.downcallHandle(
        "graphene_triangle_alloc",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructAlloc() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) graphene_triangle_alloc.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Allocates a new {@link Triangle}.
     * <p>
     * The contents of the returned structure are undefined.
     */
    public static Triangle alloc() {
        return new Triangle(constructAlloc());
    }
    
    static final MethodHandle graphene_triangle_contains_point = Interop.downcallHandle(
        "graphene_triangle_contains_point",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the given triangle @t contains the point @p.
     */
    public boolean containsPoint(Point3D p) {
        try {
            var RESULT = (boolean) graphene_triangle_contains_point.invokeExact(handle(), p.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_triangle_equal = Interop.downcallHandle(
        "graphene_triangle_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the two given {@link Triangle} are equal.
     */
    public boolean equal(Triangle b) {
        try {
            var RESULT = (boolean) graphene_triangle_equal.invokeExact(handle(), b.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_triangle_free = Interop.downcallHandle(
        "graphene_triangle_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the resources allocated by graphene_triangle_alloc().
     */
    public void free() {
        try {
            graphene_triangle_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_triangle_get_area = Interop.downcallHandle(
        "graphene_triangle_get_area",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the area of the given {@link Triangle}.
     */
    public float getArea() {
        try {
            var RESULT = (float) graphene_triangle_get_area.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_triangle_get_barycoords = Interop.downcallHandle(
        "graphene_triangle_get_barycoords",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (boolean) graphene_triangle_get_barycoords.invokeExact(handle(), p.handle(), res.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_triangle_get_bounding_box = Interop.downcallHandle(
        "graphene_triangle_get_bounding_box",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the bounding box of the given {@link Triangle}.
     */
    public void getBoundingBox(Box res) {
        try {
            graphene_triangle_get_bounding_box.invokeExact(handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_triangle_get_midpoint = Interop.downcallHandle(
        "graphene_triangle_get_midpoint",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the coordinates of the midpoint of the given {@link Triangle}.
     * <p>
     * The midpoint G is the <a href="https://en.wikipedia.org/wiki/Centroid#Triangle_centroid">centroid</a>
     * of the triangle, i.e. the intersection of its medians.
     */
    public void getMidpoint(Point3D res) {
        try {
            graphene_triangle_get_midpoint.invokeExact(handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_triangle_get_normal = Interop.downcallHandle(
        "graphene_triangle_get_normal",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the normal vector of the given {@link Triangle}.
     */
    public void getNormal(Vec3 res) {
        try {
            graphene_triangle_get_normal.invokeExact(handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_triangle_get_plane = Interop.downcallHandle(
        "graphene_triangle_get_plane",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the plane based on the vertices of the given {@link Triangle}.
     */
    public void getPlane(Plane res) {
        try {
            graphene_triangle_get_plane.invokeExact(handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_triangle_get_points = Interop.downcallHandle(
        "graphene_triangle_get_points",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the three vertices of the given {@link Triangle} and returns
     * their coordinates as {@link Point3D}.
     */
    public void getPoints(Point3D a, Point3D b, Point3D c) {
        try {
            graphene_triangle_get_points.invokeExact(handle(), a.handle(), b.handle(), c.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_triangle_get_uv = Interop.downcallHandle(
        "graphene_triangle_get_uv",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the UV coordinates of the given point @p.
     * <p>
     * The point @p must lie on the same plane as the triangle @t; if the point
     * is not coplanar, the result of this function is undefined. If @p is {@code null},
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
        try {
            var RESULT = (boolean) graphene_triangle_get_uv.invokeExact(handle(), p.handle(), uvA.handle(), uvB.handle(), uvC.handle(), res.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_triangle_get_vertices = Interop.downcallHandle(
        "graphene_triangle_get_vertices",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the three vertices of the given {@link Triangle}.
     */
    public void getVertices(Vec3 a, Vec3 b, Vec3 c) {
        try {
            graphene_triangle_get_vertices.invokeExact(handle(), a.handle(), b.handle(), c.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_triangle_init_from_float = Interop.downcallHandle(
        "graphene_triangle_init_from_float",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Triangle} using the three given arrays
     * of floating point values, each representing the coordinates of
     * a point in 3D space.
     */
    public Triangle initFromFloat(float[] a, float[] b, float[] c) {
        try {
            var RESULT = (MemoryAddress) graphene_triangle_init_from_float.invokeExact(handle(), Interop.allocateNativeArray(a).handle(), Interop.allocateNativeArray(b).handle(), Interop.allocateNativeArray(c).handle());
            return new Triangle(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_triangle_init_from_point3d = Interop.downcallHandle(
        "graphene_triangle_init_from_point3d",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Triangle} using the three given 3D points.
     */
    public Triangle initFromPoint3d(Point3D a, Point3D b, Point3D c) {
        try {
            var RESULT = (MemoryAddress) graphene_triangle_init_from_point3d.invokeExact(handle(), a.handle(), b.handle(), c.handle());
            return new Triangle(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_triangle_init_from_vec3 = Interop.downcallHandle(
        "graphene_triangle_init_from_vec3",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Triangle} using the three given vectors.
     */
    public Triangle initFromVec3(Vec3 a, Vec3 b, Vec3 c) {
        try {
            var RESULT = (MemoryAddress) graphene_triangle_init_from_vec3.invokeExact(handle(), a.handle(), b.handle(), c.handle());
            return new Triangle(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
