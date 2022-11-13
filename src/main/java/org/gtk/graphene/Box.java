package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A 3D box, described as the volume between a minimum and
 * a maximum vertices.
 * @version 1.2
 */
public class Box extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        Graphene.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "graphene_box_t";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.graphene.Vec3.getMemoryLayout().withName("min"),
        org.gtk.graphene.Vec3.getMemoryLayout().withName("max")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static Box allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Box newInstance = new Box(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Box proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Box(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructAlloc() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_box_alloc.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocates a new {@link Box}.
     * <p>
     * The contents of the returned structure are undefined.
     * @return the newly allocated {@link Box} structure.
     *   Use graphene_box_free() to free the resources allocated by this function
     */
    public static Box alloc() {
        return new Box(constructAlloc(), Ownership.FULL);
    }
    
    /**
     * Checks whether the {@link Box} {@code a} contains the given
     * {@link Box} {@code b}.
     * @param b a {@link Box}
     * @return {@code true} if the box is contained in the given box
     */
    public boolean containsBox(@NotNull org.gtk.graphene.Box b) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_box_contains_box.invokeExact(
                    handle(),
                    b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks whether {@code box} contains the given {@code point}.
     * @param point the coordinates to check
     * @return {@code true} if the point is contained in the given box
     */
    public boolean containsPoint(@NotNull org.gtk.graphene.Point3D point) {
        java.util.Objects.requireNonNull(point, "Parameter 'point' must not be null");
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_box_contains_point.invokeExact(
                    handle(),
                    point.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks whether the two given boxes are equal.
     * @param b a {@link Box}
     * @return {@code true} if the boxes are equal
     */
    public boolean equal(@NotNull org.gtk.graphene.Box b) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_box_equal.invokeExact(
                    handle(),
                    b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Expands the dimensions of {@code box} to include the coordinates at {@code point}.
     * @param point the coordinates of the point to include
     * @param res return location for the expanded box
     */
    public void expand(@NotNull org.gtk.graphene.Point3D point, @NotNull org.gtk.graphene.Box res) {
        java.util.Objects.requireNonNull(point, "Parameter 'point' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_box_expand.invokeExact(
                    handle(),
                    point.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Expands the dimensions of {@code box} by the given {@code scalar} value.
     * <p>
     * If {@code scalar} is positive, the {@link Box} will grow; if {@code scalar} is
     * negative, the {@link Box} will shrink.
     * @param scalar a scalar value
     * @param res return location for the expanded box
     */
    public void expandScalar(float scalar, @NotNull org.gtk.graphene.Box res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_box_expand_scalar.invokeExact(
                    handle(),
                    scalar,
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Expands the dimensions of {@code box} to include the coordinates of the
     * given vector.
     * @param vec the coordinates of the point to include, as a {@link Vec3}
     * @param res return location for the expanded box
     */
    public void expandVec3(@NotNull org.gtk.graphene.Vec3 vec, @NotNull org.gtk.graphene.Box res) {
        java.util.Objects.requireNonNull(vec, "Parameter 'vec' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_box_expand_vec3.invokeExact(
                    handle(),
                    vec.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Frees the resources allocated by graphene_box_alloc().
     */
    public void free() {
        try {
            DowncallHandles.graphene_box_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Computes the bounding {@link Sphere} capable of containing the given
     * {@link Box}.
     * @param sphere return location for the bounding sphere
     */
    public void getBoundingSphere(@NotNull org.gtk.graphene.Sphere sphere) {
        java.util.Objects.requireNonNull(sphere, "Parameter 'sphere' must not be null");
        try {
            DowncallHandles.graphene_box_get_bounding_sphere.invokeExact(
                    handle(),
                    sphere.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the coordinates of the center of a {@link Box}.
     * @param center return location for the coordinates of
     *   the center
     */
    public void getCenter(@NotNull org.gtk.graphene.Point3D center) {
        java.util.Objects.requireNonNull(center, "Parameter 'center' must not be null");
        try {
            DowncallHandles.graphene_box_get_center.invokeExact(
                    handle(),
                    center.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the size of the {@code box} on the Z axis.
     * @return the depth of the box
     */
    public float getDepth() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_box_get_depth.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the size of the {@code box} on the Y axis.
     * @return the height of the box
     */
    public float getHeight() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_box_get_height.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the coordinates of the maximum point of the given
     * {@link Box}.
     * @param max return location for the maximum point
     */
    public void getMax(@NotNull org.gtk.graphene.Point3D max) {
        java.util.Objects.requireNonNull(max, "Parameter 'max' must not be null");
        try {
            DowncallHandles.graphene_box_get_max.invokeExact(
                    handle(),
                    max.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the coordinates of the minimum point of the given
     * {@link Box}.
     * @param min return location for the minimum point
     */
    public void getMin(@NotNull org.gtk.graphene.Point3D min) {
        java.util.Objects.requireNonNull(min, "Parameter 'min' must not be null");
        try {
            DowncallHandles.graphene_box_get_min.invokeExact(
                    handle(),
                    min.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the size of the box on all three axes, and stores
     * it into the given {@code size} vector.
     * @param size return location for the size
     */
    public void getSize(@NotNull org.gtk.graphene.Vec3 size) {
        java.util.Objects.requireNonNull(size, "Parameter 'size' must not be null");
        try {
            DowncallHandles.graphene_box_get_size.invokeExact(
                    handle(),
                    size.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Computes the vertices of the given {@link Box}.
     * @param vertices return location for an array
     *   of 8 {@link Vec3}
     */
    public void getVertices(@NotNull Out<org.gtk.graphene.Vec3[]> vertices) {
        java.util.Objects.requireNonNull(vertices, "Parameter 'vertices' must not be null");
        MemorySegment verticesPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            DowncallHandles.graphene_box_get_vertices.invokeExact(
                    handle(),
                    (Addressable) verticesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        org.gtk.graphene.Vec3[] verticesARRAY = new org.gtk.graphene.Vec3[8];
        for (int I = 0; I < 8; I++) {
            var OBJ = verticesPOINTER.get(ValueLayout.ADDRESS, I);
            verticesARRAY[I] = new org.gtk.graphene.Vec3(OBJ, Ownership.NONE);
        }
        vertices.set(verticesARRAY);
    }
    
    /**
     * Retrieves the size of the {@code box} on the X axis.
     * @return the width of the box
     */
    public float getWidth() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_box_get_width.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Initializes the given {@link Box} with two vertices.
     * @param min the coordinates of the minimum vertex
     * @param max the coordinates of the maximum vertex
     * @return the initialized {@link Box}
     */
    public @NotNull org.gtk.graphene.Box init(@Nullable org.gtk.graphene.Point3D min, @Nullable org.gtk.graphene.Point3D max) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_box_init.invokeExact(
                    handle(),
                    (Addressable) (min == null ? MemoryAddress.NULL : min.handle()),
                    (Addressable) (max == null ? MemoryAddress.NULL : max.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Box(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes the given {@link Box} with the vertices of
     * another {@link Box}.
     * @param src a {@link Box}
     * @return the initialized {@link Box}
     */
    public @NotNull org.gtk.graphene.Box initFromBox(@NotNull org.gtk.graphene.Box src) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_box_init_from_box.invokeExact(
                    handle(),
                    src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Box(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes the given {@link Box} with the given array
     * of vertices.
     * <p>
     * If {@code n_points} is 0, the returned box is initialized with
     * graphene_box_empty().
     * @param nPoints the number {@link Point3D} in the {@code points} array
     * @param points an array of {@link Point3D}
     * @return the initialized {@link Box}
     */
    public @NotNull org.gtk.graphene.Box initFromPoints(int nPoints, @NotNull org.gtk.graphene.Point3D[] points) {
        java.util.Objects.requireNonNull(points, "Parameter 'points' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_box_init_from_points.invokeExact(
                    handle(),
                    nPoints,
                    Interop.allocateNativeArray(points, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Box(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes the given {@link Box} with two vertices
     * stored inside {@link Vec3}.
     * @param min the coordinates of the minimum vertex
     * @param max the coordinates of the maximum vertex
     * @return the initialized {@link Box}
     */
    public @NotNull org.gtk.graphene.Box initFromVec3(@Nullable org.gtk.graphene.Vec3 min, @Nullable org.gtk.graphene.Vec3 max) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_box_init_from_vec3.invokeExact(
                    handle(),
                    (Addressable) (min == null ? MemoryAddress.NULL : min.handle()),
                    (Addressable) (max == null ? MemoryAddress.NULL : max.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Box(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes the given {@link Box} with the given array
     * of vertices.
     * <p>
     * If {@code n_vectors} is 0, the returned box is initialized with
     * graphene_box_empty().
     * @param nVectors the number {@link Point3D} in the {@code vectors} array
     * @param vectors an array of {@link Vec3}
     * @return the initialized {@link Box}
     */
    public @NotNull org.gtk.graphene.Box initFromVectors(int nVectors, @NotNull org.gtk.graphene.Vec3[] vectors) {
        java.util.Objects.requireNonNull(vectors, "Parameter 'vectors' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_box_init_from_vectors.invokeExact(
                    handle(),
                    nVectors,
                    Interop.allocateNativeArray(vectors, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Box(RESULT, Ownership.NONE);
    }
    
    /**
     * Intersects the two given {@link Box}.
     * <p>
     * If the two boxes do not intersect, {@code res} will contain a degenerate box
     * initialized with graphene_box_empty().
     * @param b a {@link Box}
     * @param res return location for the result
     * @return true if the two boxes intersect
     */
    public boolean intersection(@NotNull org.gtk.graphene.Box b, @NotNull org.gtk.graphene.Box res) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_box_intersection.invokeExact(
                    handle(),
                    b.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Unions the two given {@link Box}.
     * @param b the box to union to {@code a}
     * @param res return location for the result
     */
    public void union(@NotNull org.gtk.graphene.Box b, @NotNull org.gtk.graphene.Box res) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_box_union.invokeExact(
                    handle(),
                    b.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A degenerate {@link Box} that can only be expanded.
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     * @return a {@link Box}
     */
    public static @NotNull org.gtk.graphene.Box empty() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_box_empty.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Box(RESULT, Ownership.NONE);
    }
    
    /**
     * A degenerate {@link Box} that cannot be expanded.
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     * @return a {@link Box}
     */
    public static @NotNull org.gtk.graphene.Box infinite() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_box_infinite.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Box(RESULT, Ownership.NONE);
    }
    
    /**
     * A {@link Box} with the minimum vertex set at (-1, -1, -1) and the
     * maximum vertex set at (0, 0, 0).
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     * @return a {@link Box}
     */
    public static @NotNull org.gtk.graphene.Box minusOne() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_box_minus_one.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Box(RESULT, Ownership.NONE);
    }
    
    /**
     * A {@link Box} with the minimum vertex set at (0, 0, 0) and the
     * maximum vertex set at (1, 1, 1).
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     * @return a {@link Box}
     */
    public static @NotNull org.gtk.graphene.Box one() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_box_one.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Box(RESULT, Ownership.NONE);
    }
    
    /**
     * A {@link Box} with the minimum vertex set at (-1, -1, -1) and the
     * maximum vertex set at (1, 1, 1).
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     * @return a {@link Box}
     */
    public static @NotNull org.gtk.graphene.Box oneMinusOne() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_box_one_minus_one.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Box(RESULT, Ownership.NONE);
    }
    
    /**
     * A {@link Box} with both the minimum and maximum vertices set at (0, 0, 0).
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     * @return a {@link Box}
     */
    public static @NotNull org.gtk.graphene.Box zero() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_box_zero.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Box(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle graphene_box_alloc = Interop.downcallHandle(
            "graphene_box_alloc",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_box_contains_box = Interop.downcallHandle(
            "graphene_box_contains_box",
            FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_box_contains_point = Interop.downcallHandle(
            "graphene_box_contains_point",
            FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_box_equal = Interop.downcallHandle(
            "graphene_box_equal",
            FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_box_expand = Interop.downcallHandle(
            "graphene_box_expand",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_box_expand_scalar = Interop.downcallHandle(
            "graphene_box_expand_scalar",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_box_expand_vec3 = Interop.downcallHandle(
            "graphene_box_expand_vec3",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_box_free = Interop.downcallHandle(
            "graphene_box_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_box_get_bounding_sphere = Interop.downcallHandle(
            "graphene_box_get_bounding_sphere",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_box_get_center = Interop.downcallHandle(
            "graphene_box_get_center",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_box_get_depth = Interop.downcallHandle(
            "graphene_box_get_depth",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_box_get_height = Interop.downcallHandle(
            "graphene_box_get_height",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_box_get_max = Interop.downcallHandle(
            "graphene_box_get_max",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_box_get_min = Interop.downcallHandle(
            "graphene_box_get_min",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_box_get_size = Interop.downcallHandle(
            "graphene_box_get_size",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_box_get_vertices = Interop.downcallHandle(
            "graphene_box_get_vertices",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_box_get_width = Interop.downcallHandle(
            "graphene_box_get_width",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_box_init = Interop.downcallHandle(
            "graphene_box_init",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_box_init_from_box = Interop.downcallHandle(
            "graphene_box_init_from_box",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_box_init_from_points = Interop.downcallHandle(
            "graphene_box_init_from_points",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_box_init_from_vec3 = Interop.downcallHandle(
            "graphene_box_init_from_vec3",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_box_init_from_vectors = Interop.downcallHandle(
            "graphene_box_init_from_vectors",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_box_intersection = Interop.downcallHandle(
            "graphene_box_intersection",
            FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_box_union = Interop.downcallHandle(
            "graphene_box_union",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_box_empty = Interop.downcallHandle(
            "graphene_box_empty",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_box_infinite = Interop.downcallHandle(
            "graphene_box_infinite",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_box_minus_one = Interop.downcallHandle(
            "graphene_box_minus_one",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_box_one = Interop.downcallHandle(
            "graphene_box_one",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_box_one_minus_one = Interop.downcallHandle(
            "graphene_box_one_minus_one",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_box_zero = Interop.downcallHandle(
            "graphene_box_zero",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
    }
}
