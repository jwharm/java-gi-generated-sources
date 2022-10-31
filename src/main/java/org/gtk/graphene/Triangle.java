package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A triangle.
 * @version 1.2
 */
public class Triangle extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Graphene.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "graphene_triangle_t";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.graphene.Vec3.getMemoryLayout().withName("a"),
        org.gtk.graphene.Vec3.getMemoryLayout().withName("b"),
        org.gtk.graphene.Vec3.getMemoryLayout().withName("c")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static Triangle allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Triangle newInstance = new Triangle(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public Triangle(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static Refcounted constructAlloc() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.graphene_triangle_alloc.invokeExact(), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocates a new {@link Triangle}.
     * <p>
     * The contents of the returned structure are undefined.
     * @return the newly allocated {@link Triangle}
     *   structure. Use graphene_triangle_free() to free the resources
     *   allocated by this function
     */
    public static Triangle alloc() {
        return new Triangle(constructAlloc());
    }
    
    /**
     * Checks whether the given triangle {@code t} contains the point {@code p}.
     * @param p a {@link Point3D}
     * @return {@code true} if the point is inside the triangle
     */
    public boolean containsPoint(@NotNull org.gtk.graphene.Point3D p) {
        java.util.Objects.requireNonNull(p, "Parameter 'p' must not be null");
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_triangle_contains_point.invokeExact(
                    handle(),
                    p.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks whether the two given {@link Triangle} are equal.
     * @param b a {@link Triangle}
     * @return {@code true} if the triangles are equal
     */
    public boolean equal(@NotNull org.gtk.graphene.Triangle b) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_triangle_equal.invokeExact(
                    handle(),
                    b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Frees the resources allocated by graphene_triangle_alloc().
     */
    public void free() {
        try {
            DowncallHandles.graphene_triangle_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Computes the area of the given {@link Triangle}.
     * @return the area of the triangle
     */
    public float getArea() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_triangle_get_area.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Computes the <a href="http://en.wikipedia.org/wiki/Barycentric_coordinate_system">barycentric coordinates</a>
     * of the given point {@code p}.
     * <p>
     * The point {@code p} must lie on the same plane as the triangle {@code t}; if the
     * point is not coplanar, the result of this function is undefined.
     * <p>
     * If we place the origin in the coordinates of the triangle's A point,
     * the barycentric coordinates are {@code u}, which is on the AC vector; and {@code v}
     * which is on the AB vector:
     * <p>
     * <img src="./doc-files/triangle-barycentric.png" alt="">
     * <p>
     * The returned {@link Vec2} contains the following values, in order:
     * <ul>
     * <li>{@code res.x = u}
     * <li>{@code res.y = v}
     * </ul>
     * @param p a {@link Point3D}
     * @param res return location for the vector
     *   with the barycentric coordinates
     * @return {@code true} if the barycentric coordinates are valid
     */
    public boolean getBarycoords(@Nullable org.gtk.graphene.Point3D p, @NotNull org.gtk.graphene.Vec2 res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_triangle_get_barycoords.invokeExact(
                    handle(),
                    (Addressable) (p == null ? MemoryAddress.NULL : p.handle()),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Computes the bounding box of the given {@link Triangle}.
     * @param res return location for the box
     */
    public void getBoundingBox(@NotNull org.gtk.graphene.Box res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_triangle_get_bounding_box.invokeExact(
                    handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Computes the coordinates of the midpoint of the given {@link Triangle}.
     * <p>
     * The midpoint G is the <a href="https://en.wikipedia.org/wiki/Centroid#Triangle_centroid">centroid</a>
     * of the triangle, i.e. the intersection of its medians.
     * @param res return location for the coordinates of
     *   the midpoint
     */
    public void getMidpoint(@NotNull org.gtk.graphene.Point3D res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_triangle_get_midpoint.invokeExact(
                    handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Computes the normal vector of the given {@link Triangle}.
     * @param res return location for the normal vector
     */
    public void getNormal(@NotNull org.gtk.graphene.Vec3 res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_triangle_get_normal.invokeExact(
                    handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Computes the plane based on the vertices of the given {@link Triangle}.
     * @param res return location for the plane
     */
    public void getPlane(@NotNull org.gtk.graphene.Plane res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_triangle_get_plane.invokeExact(
                    handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the three vertices of the given {@link Triangle} and returns
     * their coordinates as {@link Point3D}.
     * @param a return location for the coordinates
     *   of the first vertex
     * @param b return location for the coordinates
     *   of the second vertex
     * @param c return location for the coordinates
     *   of the third vertex
     */
    public void getPoints(@NotNull org.gtk.graphene.Point3D a, @NotNull org.gtk.graphene.Point3D b, @NotNull org.gtk.graphene.Point3D c) {
        java.util.Objects.requireNonNull(a, "Parameter 'a' must not be null");
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        java.util.Objects.requireNonNull(c, "Parameter 'c' must not be null");
        try {
            DowncallHandles.graphene_triangle_get_points.invokeExact(
                    handle(),
                    a.handle(),
                    b.handle(),
                    c.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Computes the UV coordinates of the given point {@code p}.
     * <p>
     * The point {@code p} must lie on the same plane as the triangle {@code t}; if the point
     * is not coplanar, the result of this function is undefined. If {@code p} is {@code null},
     * the point will be set in (0, 0, 0).
     * <p>
     * The UV coordinates will be placed in the {@code res} vector:
     * <ul>
     * <li>{@code res.x = u}
     * <li>{@code res.y = v}
     * </ul>
     * <p>
     * See also: graphene_triangle_get_barycoords()
     * @param p a {@link Point3D}
     * @param uvA the UV coordinates of the first point
     * @param uvB the UV coordinates of the second point
     * @param uvC the UV coordinates of the third point
     * @param res a vector containing the UV coordinates
     *   of the given point {@code p}
     * @return {@code true} if the coordinates are valid
     */
    public boolean getUv(@Nullable org.gtk.graphene.Point3D p, @NotNull org.gtk.graphene.Vec2 uvA, @NotNull org.gtk.graphene.Vec2 uvB, @NotNull org.gtk.graphene.Vec2 uvC, @NotNull org.gtk.graphene.Vec2 res) {
        java.util.Objects.requireNonNull(uvA, "Parameter 'uvA' must not be null");
        java.util.Objects.requireNonNull(uvB, "Parameter 'uvB' must not be null");
        java.util.Objects.requireNonNull(uvC, "Parameter 'uvC' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_triangle_get_uv.invokeExact(
                    handle(),
                    (Addressable) (p == null ? MemoryAddress.NULL : p.handle()),
                    uvA.handle(),
                    uvB.handle(),
                    uvC.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the three vertices of the given {@link Triangle}.
     * @param a return location for the first vertex
     * @param b return location for the second vertex
     * @param c return location for the third vertex
     */
    public void getVertices(@NotNull org.gtk.graphene.Vec3 a, @NotNull org.gtk.graphene.Vec3 b, @NotNull org.gtk.graphene.Vec3 c) {
        java.util.Objects.requireNonNull(a, "Parameter 'a' must not be null");
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        java.util.Objects.requireNonNull(c, "Parameter 'c' must not be null");
        try {
            DowncallHandles.graphene_triangle_get_vertices.invokeExact(
                    handle(),
                    a.handle(),
                    b.handle(),
                    c.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Initializes a {@link Triangle} using the three given arrays
     * of floating point values, each representing the coordinates of
     * a point in 3D space.
     * @param a an array of 3 floating point values
     * @param b an array of 3 floating point values
     * @param c an array of 3 floating point values
     * @return the initialized {@link Triangle}
     */
    public @NotNull org.gtk.graphene.Triangle initFromFloat(float[] a, float[] b, float[] c) {
        java.util.Objects.requireNonNull(a, "Parameter 'a' must not be null");
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        java.util.Objects.requireNonNull(c, "Parameter 'c' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_triangle_init_from_float.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(a, false),
                    Interop.allocateNativeArray(b, false),
                    Interop.allocateNativeArray(c, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Triangle(Refcounted.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link Triangle} using the three given 3D points.
     * @param a a {@link Point3D}
     * @param b a {@link Point3D}
     * @param c a {@link Point3D}
     * @return the initialized {@link Triangle}
     */
    public @NotNull org.gtk.graphene.Triangle initFromPoint3d(@Nullable org.gtk.graphene.Point3D a, @Nullable org.gtk.graphene.Point3D b, @Nullable org.gtk.graphene.Point3D c) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_triangle_init_from_point3d.invokeExact(
                    handle(),
                    (Addressable) (a == null ? MemoryAddress.NULL : a.handle()),
                    (Addressable) (b == null ? MemoryAddress.NULL : b.handle()),
                    (Addressable) (c == null ? MemoryAddress.NULL : c.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Triangle(Refcounted.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link Triangle} using the three given vectors.
     * @param a a {@link Vec3}
     * @param b a {@link Vec3}
     * @param c a {@link Vec3}
     * @return the initialized {@link Triangle}
     */
    public @NotNull org.gtk.graphene.Triangle initFromVec3(@Nullable org.gtk.graphene.Vec3 a, @Nullable org.gtk.graphene.Vec3 b, @Nullable org.gtk.graphene.Vec3 c) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_triangle_init_from_vec3.invokeExact(
                    handle(),
                    (Addressable) (a == null ? MemoryAddress.NULL : a.handle()),
                    (Addressable) (b == null ? MemoryAddress.NULL : b.handle()),
                    (Addressable) (c == null ? MemoryAddress.NULL : c.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Triangle(Refcounted.get(RESULT, false));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle graphene_triangle_alloc = Interop.downcallHandle(
            "graphene_triangle_alloc",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_triangle_contains_point = Interop.downcallHandle(
            "graphene_triangle_contains_point",
            FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_triangle_equal = Interop.downcallHandle(
            "graphene_triangle_equal",
            FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_triangle_free = Interop.downcallHandle(
            "graphene_triangle_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_triangle_get_area = Interop.downcallHandle(
            "graphene_triangle_get_area",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_triangle_get_barycoords = Interop.downcallHandle(
            "graphene_triangle_get_barycoords",
            FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_triangle_get_bounding_box = Interop.downcallHandle(
            "graphene_triangle_get_bounding_box",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_triangle_get_midpoint = Interop.downcallHandle(
            "graphene_triangle_get_midpoint",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_triangle_get_normal = Interop.downcallHandle(
            "graphene_triangle_get_normal",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_triangle_get_plane = Interop.downcallHandle(
            "graphene_triangle_get_plane",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_triangle_get_points = Interop.downcallHandle(
            "graphene_triangle_get_points",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_triangle_get_uv = Interop.downcallHandle(
            "graphene_triangle_get_uv",
            FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_triangle_get_vertices = Interop.downcallHandle(
            "graphene_triangle_get_vertices",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_triangle_init_from_float = Interop.downcallHandle(
            "graphene_triangle_init_from_float",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_triangle_init_from_point3d = Interop.downcallHandle(
            "graphene_triangle_init_from_point3d",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_triangle_init_from_vec3 = Interop.downcallHandle(
            "graphene_triangle_init_from_vec3",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
