package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A 3D box, described as the volume between a minimum and
 * a maximum vertices.
 */
public class Box extends io.github.jwharm.javagi.ResourceBase {

    public Box(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle graphene_box_alloc = Interop.downcallHandle(
        "graphene_box_alloc",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructAlloc() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) graphene_box_alloc.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Allocates a new {@link Box}.
     * <p>
     * The contents of the returned structure are undefined.
     */
    public static Box alloc() {
        return new Box(constructAlloc());
    }
    
    static final MethodHandle graphene_box_contains_box = Interop.downcallHandle(
        "graphene_box_contains_box",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the {@link Box} @a contains the given
     * {@link Box} @b.
     */
    public boolean containsBox(Box b) {
        try {
            var RESULT = (boolean) graphene_box_contains_box.invokeExact(handle(), b.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_box_contains_point = Interop.downcallHandle(
        "graphene_box_contains_point",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether {@code box} contains the given {@code point}.
     */
    public boolean containsPoint(Point3D point) {
        try {
            var RESULT = (boolean) graphene_box_contains_point.invokeExact(handle(), point.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_box_equal = Interop.downcallHandle(
        "graphene_box_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the two given boxes are equal.
     */
    public boolean equal(Box b) {
        try {
            var RESULT = (boolean) graphene_box_equal.invokeExact(handle(), b.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_box_expand = Interop.downcallHandle(
        "graphene_box_expand",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Expands the dimensions of {@code box} to include the coordinates at {@code point}.
     */
    public void expand(Point3D point, Box res) {
        try {
            graphene_box_expand.invokeExact(handle(), point.handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_box_expand_scalar = Interop.downcallHandle(
        "graphene_box_expand_scalar",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Expands the dimensions of {@code box} by the given {@code scalar} value.
     * <p>
     * If {@code scalar} is positive, the {@link Box} will grow; if {@code scalar} is
     * negative, the {@link Box} will shrink.
     */
    public void expandScalar(float scalar, Box res) {
        try {
            graphene_box_expand_scalar.invokeExact(handle(), scalar, res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_box_expand_vec3 = Interop.downcallHandle(
        "graphene_box_expand_vec3",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Expands the dimensions of {@code box} to include the coordinates of the
     * given vector.
     */
    public void expandVec3(Vec3 vec, Box res) {
        try {
            graphene_box_expand_vec3.invokeExact(handle(), vec.handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_box_free = Interop.downcallHandle(
        "graphene_box_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the resources allocated by graphene_box_alloc().
     */
    public void free() {
        try {
            graphene_box_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_box_get_bounding_sphere = Interop.downcallHandle(
        "graphene_box_get_bounding_sphere",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the bounding {@link Sphere} capable of containing the given
     * {@link Box}.
     */
    public void getBoundingSphere(Sphere sphere) {
        try {
            graphene_box_get_bounding_sphere.invokeExact(handle(), sphere.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_box_get_center = Interop.downcallHandle(
        "graphene_box_get_center",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the coordinates of the center of a {@link Box}.
     */
    public void getCenter(Point3D center) {
        try {
            graphene_box_get_center.invokeExact(handle(), center.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_box_get_depth = Interop.downcallHandle(
        "graphene_box_get_depth",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the size of the {@code box} on the Z axis.
     */
    public float getDepth() {
        try {
            var RESULT = (float) graphene_box_get_depth.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_box_get_height = Interop.downcallHandle(
        "graphene_box_get_height",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the size of the {@code box} on the Y axis.
     */
    public float getHeight() {
        try {
            var RESULT = (float) graphene_box_get_height.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_box_get_max = Interop.downcallHandle(
        "graphene_box_get_max",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the coordinates of the maximum point of the given
     * {@link Box}.
     */
    public void getMax(Point3D max) {
        try {
            graphene_box_get_max.invokeExact(handle(), max.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_box_get_min = Interop.downcallHandle(
        "graphene_box_get_min",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the coordinates of the minimum point of the given
     * {@link Box}.
     */
    public void getMin(Point3D min) {
        try {
            graphene_box_get_min.invokeExact(handle(), min.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_box_get_size = Interop.downcallHandle(
        "graphene_box_get_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the size of the box on all three axes, and stores
     * it into the given {@code size} vector.
     */
    public void getSize(Vec3 size) {
        try {
            graphene_box_get_size.invokeExact(handle(), size.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_box_get_vertices = Interop.downcallHandle(
        "graphene_box_get_vertices",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the vertices of the given {@link Box}.
     */
    public void getVertices(PointerProxy<Vec3> vertices) {
        try {
            graphene_box_get_vertices.invokeExact(handle(), vertices.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_box_get_width = Interop.downcallHandle(
        "graphene_box_get_width",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the size of the {@code box} on the X axis.
     */
    public float getWidth() {
        try {
            var RESULT = (float) graphene_box_get_width.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_box_init = Interop.downcallHandle(
        "graphene_box_init",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes the given {@link Box} with two vertices.
     */
    public Box init(Point3D min, Point3D max) {
        try {
            var RESULT = (MemoryAddress) graphene_box_init.invokeExact(handle(), min.handle(), max.handle());
            return new Box(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_box_init_from_box = Interop.downcallHandle(
        "graphene_box_init_from_box",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes the given {@link Box} with the vertices of
     * another {@link Box}.
     */
    public Box initFromBox(Box src) {
        try {
            var RESULT = (MemoryAddress) graphene_box_init_from_box.invokeExact(handle(), src.handle());
            return new Box(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_box_init_from_points = Interop.downcallHandle(
        "graphene_box_init_from_points",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes the given {@link Box} with the given array
     * of vertices.
     * <p>
     * If {@code n_points} is 0, the returned box is initialized with
     * graphene_box_empty().
     */
    public Box initFromPoints(int nPoints, Point3D[] points) {
        try {
            var RESULT = (MemoryAddress) graphene_box_init_from_points.invokeExact(handle(), nPoints, Interop.allocateNativeArray(points).handle());
            return new Box(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_box_init_from_vec3 = Interop.downcallHandle(
        "graphene_box_init_from_vec3",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes the given {@link Box} with two vertices
     * stored inside {@link Vec3}.
     */
    public Box initFromVec3(Vec3 min, Vec3 max) {
        try {
            var RESULT = (MemoryAddress) graphene_box_init_from_vec3.invokeExact(handle(), min.handle(), max.handle());
            return new Box(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_box_init_from_vectors = Interop.downcallHandle(
        "graphene_box_init_from_vectors",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes the given {@link Box} with the given array
     * of vertices.
     * <p>
     * If {@code n_vectors} is 0, the returned box is initialized with
     * graphene_box_empty().
     */
    public Box initFromVectors(int nVectors, Vec3[] vectors) {
        try {
            var RESULT = (MemoryAddress) graphene_box_init_from_vectors.invokeExact(handle(), nVectors, Interop.allocateNativeArray(vectors).handle());
            return new Box(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_box_intersection = Interop.downcallHandle(
        "graphene_box_intersection",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Intersects the two given {@link Box}.
     * <p>
     * If the two boxes do not intersect, {@code res} will contain a degenerate box
     * initialized with graphene_box_empty().
     */
    public boolean intersection(Box b, Box res) {
        try {
            var RESULT = (boolean) graphene_box_intersection.invokeExact(handle(), b.handle(), res.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_box_union = Interop.downcallHandle(
        "graphene_box_union",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Unions the two given {@link Box}.
     */
    public void union(Box b, Box res) {
        try {
            graphene_box_union.invokeExact(handle(), b.handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_box_empty = Interop.downcallHandle(
        "graphene_box_empty",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * A degenerate {@link Box} that can only be expanded.
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     */
    public static Box empty() {
        try {
            var RESULT = (MemoryAddress) graphene_box_empty.invokeExact();
            return new Box(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_box_infinite = Interop.downcallHandle(
        "graphene_box_infinite",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * A degenerate {@link Box} that cannot be expanded.
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     */
    public static Box infinite() {
        try {
            var RESULT = (MemoryAddress) graphene_box_infinite.invokeExact();
            return new Box(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_box_minus_one = Interop.downcallHandle(
        "graphene_box_minus_one",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * A {@link Box} with the minimum vertex set at (-1, -1, -1) and the
     * maximum vertex set at (0, 0, 0).
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     */
    public static Box minusOne() {
        try {
            var RESULT = (MemoryAddress) graphene_box_minus_one.invokeExact();
            return new Box(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_box_one = Interop.downcallHandle(
        "graphene_box_one",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * A {@link Box} with the minimum vertex set at (0, 0, 0) and the
     * maximum vertex set at (1, 1, 1).
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     */
    public static Box one() {
        try {
            var RESULT = (MemoryAddress) graphene_box_one.invokeExact();
            return new Box(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_box_one_minus_one = Interop.downcallHandle(
        "graphene_box_one_minus_one",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * A {@link Box} with the minimum vertex set at (-1, -1, -1) and the
     * maximum vertex set at (1, 1, 1).
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     */
    public static Box oneMinusOne() {
        try {
            var RESULT = (MemoryAddress) graphene_box_one_minus_one.invokeExact();
            return new Box(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_box_zero = Interop.downcallHandle(
        "graphene_box_zero",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * A {@link Box} with both the minimum and maximum vertices set at (0, 0, 0).
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     */
    public static Box zero() {
        try {
            var RESULT = (MemoryAddress) graphene_box_zero.invokeExact();
            return new Box(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
