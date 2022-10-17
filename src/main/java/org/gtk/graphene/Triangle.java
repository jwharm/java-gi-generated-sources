package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A triangle.
 */
public class Triangle extends io.github.jwharm.javagi.ResourceBase {

    public Triangle(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle graphene_triangle_alloc = Interop.downcallHandle(
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
    
    private static final MethodHandle graphene_triangle_contains_point = Interop.downcallHandle(
        "graphene_triangle_contains_point",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the given triangle @t contains the point @p.
     */
    public boolean containsPoint(@NotNull Point3D p) {
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_triangle_contains_point.invokeExact(handle(), p.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_triangle_equal = Interop.downcallHandle(
        "graphene_triangle_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the two given {@link Triangle} are equal.
     */
    public boolean equal(@NotNull Triangle b) {
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_triangle_equal.invokeExact(handle(), b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_triangle_free = Interop.downcallHandle(
        "graphene_triangle_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the resources allocated by graphene_triangle_alloc().
     */
    public @NotNull void free() {
        try {
            graphene_triangle_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle graphene_triangle_get_area = Interop.downcallHandle(
        "graphene_triangle_get_area",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the area of the given {@link Triangle}.
     */
    public float getArea() {
        float RESULT;
        try {
            RESULT = (float) graphene_triangle_get_area.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_triangle_get_barycoords = Interop.downcallHandle(
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
    public boolean getBarycoords(@Nullable Point3D p, @NotNull Out<Vec2> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_triangle_get_barycoords.invokeExact(handle(), p.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Vec2(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        return RESULT;
    }
    
    private static final MethodHandle graphene_triangle_get_bounding_box = Interop.downcallHandle(
        "graphene_triangle_get_bounding_box",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the bounding box of the given {@link Triangle}.
     */
    public @NotNull void getBoundingBox(@NotNull Out<Box> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_triangle_get_bounding_box.invokeExact(handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Box(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_triangle_get_midpoint = Interop.downcallHandle(
        "graphene_triangle_get_midpoint",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the coordinates of the midpoint of the given {@link Triangle}.
     * <p>
     * The midpoint G is the <a href="https://en.wikipedia.org/wiki/Centroid#Triangle_centroid">centroid</a>
     * of the triangle, i.e. the intersection of its medians.
     */
    public @NotNull void getMidpoint(@NotNull Out<Point3D> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_triangle_get_midpoint.invokeExact(handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Point3D(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_triangle_get_normal = Interop.downcallHandle(
        "graphene_triangle_get_normal",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the normal vector of the given {@link Triangle}.
     */
    public @NotNull void getNormal(@NotNull Out<Vec3> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_triangle_get_normal.invokeExact(handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Vec3(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_triangle_get_plane = Interop.downcallHandle(
        "graphene_triangle_get_plane",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the plane based on the vertices of the given {@link Triangle}.
     */
    public @NotNull void getPlane(@NotNull Out<Plane> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_triangle_get_plane.invokeExact(handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Plane(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_triangle_get_points = Interop.downcallHandle(
        "graphene_triangle_get_points",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the three vertices of the given {@link Triangle} and returns
     * their coordinates as {@link Point3D}.
     */
    public @NotNull void getPoints(@NotNull Out<Point3D> a, @NotNull Out<Point3D> b, @NotNull Out<Point3D> c) {
        MemorySegment aPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment bPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment cPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_triangle_get_points.invokeExact(handle(), (Addressable) aPOINTER.address(), (Addressable) bPOINTER.address(), (Addressable) cPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        a.set(new Point3D(Refcounted.get(aPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        b.set(new Point3D(Refcounted.get(bPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        c.set(new Point3D(Refcounted.get(cPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_triangle_get_uv = Interop.downcallHandle(
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
    public boolean getUv(@Nullable Point3D p, @NotNull Vec2 uvA, @NotNull Vec2 uvB, @NotNull Vec2 uvC, @NotNull Out<Vec2> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_triangle_get_uv.invokeExact(handle(), p.handle(), uvA.handle(), uvB.handle(), uvC.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Vec2(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        return RESULT;
    }
    
    private static final MethodHandle graphene_triangle_get_vertices = Interop.downcallHandle(
        "graphene_triangle_get_vertices",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the three vertices of the given {@link Triangle}.
     */
    public @NotNull void getVertices(@NotNull Out<Vec3> a, @NotNull Out<Vec3> b, @NotNull Out<Vec3> c) {
        MemorySegment aPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment bPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment cPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_triangle_get_vertices.invokeExact(handle(), (Addressable) aPOINTER.address(), (Addressable) bPOINTER.address(), (Addressable) cPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        a.set(new Vec3(Refcounted.get(aPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        b.set(new Vec3(Refcounted.get(bPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        c.set(new Vec3(Refcounted.get(cPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_triangle_init_from_float = Interop.downcallHandle(
        "graphene_triangle_init_from_float",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Triangle} using the three given arrays
     * of floating point values, each representing the coordinates of
     * a point in 3D space.
     */
    public @NotNull Triangle initFromFloat(@NotNull float[] a, @NotNull float[] b, @NotNull float[] c) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_triangle_init_from_float.invokeExact(handle(), Interop.allocateNativeArray(a), Interop.allocateNativeArray(b), Interop.allocateNativeArray(c));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Triangle(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_triangle_init_from_point3d = Interop.downcallHandle(
        "graphene_triangle_init_from_point3d",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Triangle} using the three given 3D points.
     */
    public @NotNull Triangle initFromPoint3d(@Nullable Point3D a, @Nullable Point3D b, @Nullable Point3D c) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_triangle_init_from_point3d.invokeExact(handle(), a.handle(), b.handle(), c.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Triangle(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_triangle_init_from_vec3 = Interop.downcallHandle(
        "graphene_triangle_init_from_vec3",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Triangle} using the three given vectors.
     */
    public @NotNull Triangle initFromVec3(@Nullable Vec3 a, @Nullable Vec3 b, @Nullable Vec3 c) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_triangle_init_from_vec3.invokeExact(handle(), a.handle(), b.handle(), c.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Triangle(Refcounted.get(RESULT, false));
    }
    
}
