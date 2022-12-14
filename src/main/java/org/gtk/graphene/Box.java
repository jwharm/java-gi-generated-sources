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
public class Box extends Struct {
    
    static {
        Graphene.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "graphene_box_t";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.graphene.Vec3.getMemoryLayout().withName("min"),
            org.gtk.graphene.Vec3.getMemoryLayout().withName("max")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Box}
     * @return A new, uninitialized @{link Box}
     */
    public static Box allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Box newInstance = new Box(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Box proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Box(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Box> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Box(input);
    
    private static MemoryAddress constructAlloc() {
        MemoryAddress RESULT;
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
        var RESULT = constructAlloc();
        var OBJECT = org.gtk.graphene.Box.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Checks whether the {@link Box} {@code a} contains the given
     * {@link Box} {@code b}.
     * @param b a {@link Box}
     * @return {@code true} if the box is contained in the given box
     */
    public boolean containsBox(org.gtk.graphene.Box b) {
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
    public boolean containsPoint(org.gtk.graphene.Point3D point) {
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
    public boolean equal(org.gtk.graphene.Box b) {
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
    public void expand(org.gtk.graphene.Point3D point, org.gtk.graphene.Box res) {
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
    public void expandScalar(float scalar, org.gtk.graphene.Box res) {
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
    public void expandVec3(org.gtk.graphene.Vec3 vec, org.gtk.graphene.Box res) {
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
            DowncallHandles.graphene_box_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Computes the bounding {@link Sphere} capable of containing the given
     * {@link Box}.
     * @param sphere return location for the bounding sphere
     */
    public void getBoundingSphere(org.gtk.graphene.Sphere sphere) {
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
    public void getCenter(org.gtk.graphene.Point3D center) {
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
            RESULT = (float) DowncallHandles.graphene_box_get_depth.invokeExact(handle());
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
            RESULT = (float) DowncallHandles.graphene_box_get_height.invokeExact(handle());
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
    public void getMax(org.gtk.graphene.Point3D max) {
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
    public void getMin(org.gtk.graphene.Point3D min) {
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
    public void getSize(org.gtk.graphene.Vec3 size) {
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
    public void getVertices(Out<org.gtk.graphene.Vec3[]> vertices) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment verticesPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            try {
                DowncallHandles.graphene_box_get_vertices.invokeExact(
                        handle(),
                        (Addressable) verticesPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            org.gtk.graphene.Vec3[] verticesARRAY = new org.gtk.graphene.Vec3[8];
            for (int I = 0; I < 8; I++) {
                var OBJ = verticesPOINTER.get(Interop.valueLayout.ADDRESS, I);
                verticesARRAY[I] = org.gtk.graphene.Vec3.fromAddress.marshal(OBJ, null);
                }
            vertices.set(verticesARRAY);
        }
    }
    
    /**
     * Retrieves the size of the {@code box} on the X axis.
     * @return the width of the box
     */
    public float getWidth() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_box_get_width.invokeExact(handle());
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
    public org.gtk.graphene.Box init(@Nullable org.gtk.graphene.Point3D min, @Nullable org.gtk.graphene.Point3D max) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_box_init.invokeExact(
                    handle(),
                    (Addressable) (min == null ? MemoryAddress.NULL : min.handle()),
                    (Addressable) (max == null ? MemoryAddress.NULL : max.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Box.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Initializes the given {@link Box} with the vertices of
     * another {@link Box}.
     * @param src a {@link Box}
     * @return the initialized {@link Box}
     */
    public org.gtk.graphene.Box initFromBox(org.gtk.graphene.Box src) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_box_init_from_box.invokeExact(
                    handle(),
                    src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Box.fromAddress.marshal(RESULT, null);
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
    public org.gtk.graphene.Box initFromPoints(int nPoints, org.gtk.graphene.Point3D[] points) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.graphene_box_init_from_points.invokeExact(
                        handle(),
                        nPoints,
                        Interop.allocateNativeArray(points, org.gtk.graphene.Point3D.getMemoryLayout(), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gtk.graphene.Box.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Initializes the given {@link Box} with two vertices
     * stored inside {@link Vec3}.
     * @param min the coordinates of the minimum vertex
     * @param max the coordinates of the maximum vertex
     * @return the initialized {@link Box}
     */
    public org.gtk.graphene.Box initFromVec3(@Nullable org.gtk.graphene.Vec3 min, @Nullable org.gtk.graphene.Vec3 max) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_box_init_from_vec3.invokeExact(
                    handle(),
                    (Addressable) (min == null ? MemoryAddress.NULL : min.handle()),
                    (Addressable) (max == null ? MemoryAddress.NULL : max.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Box.fromAddress.marshal(RESULT, null);
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
    public org.gtk.graphene.Box initFromVectors(int nVectors, org.gtk.graphene.Vec3[] vectors) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.graphene_box_init_from_vectors.invokeExact(
                        handle(),
                        nVectors,
                        Interop.allocateNativeArray(vectors, org.gtk.graphene.Vec3.getMemoryLayout(), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gtk.graphene.Box.fromAddress.marshal(RESULT, null);
        }
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
    public boolean intersection(org.gtk.graphene.Box b, @Nullable org.gtk.graphene.Box res) {
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_box_intersection.invokeExact(
                    handle(),
                    b.handle(),
                    (Addressable) (res == null ? MemoryAddress.NULL : res.handle()));
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
    public void union(org.gtk.graphene.Box b, org.gtk.graphene.Box res) {
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
    public static org.gtk.graphene.Box empty() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_box_empty.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Box.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * A degenerate {@link Box} that cannot be expanded.
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     * @return a {@link Box}
     */
    public static org.gtk.graphene.Box infinite() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_box_infinite.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Box.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * A {@link Box} with the minimum vertex set at (-1, -1, -1) and the
     * maximum vertex set at (0, 0, 0).
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     * @return a {@link Box}
     */
    public static org.gtk.graphene.Box minusOne() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_box_minus_one.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Box.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * A {@link Box} with the minimum vertex set at (0, 0, 0) and the
     * maximum vertex set at (1, 1, 1).
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     * @return a {@link Box}
     */
    public static org.gtk.graphene.Box one() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_box_one.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Box.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * A {@link Box} with the minimum vertex set at (-1, -1, -1) and the
     * maximum vertex set at (1, 1, 1).
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     * @return a {@link Box}
     */
    public static org.gtk.graphene.Box oneMinusOne() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_box_one_minus_one.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Box.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * A {@link Box} with both the minimum and maximum vertices set at (0, 0, 0).
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     * @return a {@link Box}
     */
    public static org.gtk.graphene.Box zero() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_box_zero.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Box.fromAddress.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle graphene_box_alloc = Interop.downcallHandle(
                "graphene_box_alloc",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_box_contains_box = Interop.downcallHandle(
                "graphene_box_contains_box",
                FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_box_contains_point = Interop.downcallHandle(
                "graphene_box_contains_point",
                FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_box_equal = Interop.downcallHandle(
                "graphene_box_equal",
                FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_box_expand = Interop.downcallHandle(
                "graphene_box_expand",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_box_expand_scalar = Interop.downcallHandle(
                "graphene_box_expand_scalar",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_box_expand_vec3 = Interop.downcallHandle(
                "graphene_box_expand_vec3",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_box_free = Interop.downcallHandle(
                "graphene_box_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_box_get_bounding_sphere = Interop.downcallHandle(
                "graphene_box_get_bounding_sphere",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_box_get_center = Interop.downcallHandle(
                "graphene_box_get_center",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_box_get_depth = Interop.downcallHandle(
                "graphene_box_get_depth",
                FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_box_get_height = Interop.downcallHandle(
                "graphene_box_get_height",
                FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_box_get_max = Interop.downcallHandle(
                "graphene_box_get_max",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_box_get_min = Interop.downcallHandle(
                "graphene_box_get_min",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_box_get_size = Interop.downcallHandle(
                "graphene_box_get_size",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_box_get_vertices = Interop.downcallHandle(
                "graphene_box_get_vertices",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_box_get_width = Interop.downcallHandle(
                "graphene_box_get_width",
                FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_box_init = Interop.downcallHandle(
                "graphene_box_init",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_box_init_from_box = Interop.downcallHandle(
                "graphene_box_init_from_box",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_box_init_from_points = Interop.downcallHandle(
                "graphene_box_init_from_points",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_box_init_from_vec3 = Interop.downcallHandle(
                "graphene_box_init_from_vec3",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_box_init_from_vectors = Interop.downcallHandle(
                "graphene_box_init_from_vectors",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_box_intersection = Interop.downcallHandle(
                "graphene_box_intersection",
                FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_box_union = Interop.downcallHandle(
                "graphene_box_union",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_box_empty = Interop.downcallHandle(
                "graphene_box_empty",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_box_infinite = Interop.downcallHandle(
                "graphene_box_infinite",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_box_minus_one = Interop.downcallHandle(
                "graphene_box_minus_one",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_box_one = Interop.downcallHandle(
                "graphene_box_one",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_box_one_minus_one = Interop.downcallHandle(
                "graphene_box_one_minus_one",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_box_zero = Interop.downcallHandle(
                "graphene_box_zero",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link Box.Builder} object constructs a {@link Box} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Box.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Box struct;
        
        private Builder() {
            struct = Box.allocate();
        }
        
        /**
         * Finish building the {@link Box} struct.
         * @return A new instance of {@code Box} with the fields 
         *         that were set in the Builder object.
         */
        public Box build() {
            return struct;
        }
        
        public Builder setMin(org.gtk.graphene.Vec3 min) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("min"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (min == null ? MemoryAddress.NULL : min.handle()));
                return this;
            }
        }
        
        public Builder setMax(org.gtk.graphene.Vec3 max) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("max"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (max == null ? MemoryAddress.NULL : max.handle()));
                return this;
            }
        }
    }
}
