package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A 3D box, described as the volume between a minimum and
 * a maximum vertices.
 */
public class Box extends io.github.jwharm.javagi.ResourceBase {

    public Box(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle graphene_box_alloc = Interop.downcallHandle(
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
    
    private static final MethodHandle graphene_box_contains_box = Interop.downcallHandle(
        "graphene_box_contains_box",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the {@link Box} @a contains the given
     * {@link Box} @b.
     */
    public boolean containsBox(@NotNull Box b) {
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_box_contains_box.invokeExact(handle(), b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_box_contains_point = Interop.downcallHandle(
        "graphene_box_contains_point",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether {@code box} contains the given {@code point}.
     */
    public boolean containsPoint(@NotNull Point3D point) {
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_box_contains_point.invokeExact(handle(), point.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_box_equal = Interop.downcallHandle(
        "graphene_box_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the two given boxes are equal.
     */
    public boolean equal(@NotNull Box b) {
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_box_equal.invokeExact(handle(), b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_box_expand = Interop.downcallHandle(
        "graphene_box_expand",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Expands the dimensions of {@code box} to include the coordinates at {@code point}.
     */
    public @NotNull void expand(@NotNull Point3D point, @NotNull Out<Box> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_box_expand.invokeExact(handle(), point.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Box(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_box_expand_scalar = Interop.downcallHandle(
        "graphene_box_expand_scalar",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Expands the dimensions of {@code box} by the given {@code scalar} value.
     * <p>
     * If {@code scalar} is positive, the {@link Box} will grow; if {@code scalar} is
     * negative, the {@link Box} will shrink.
     */
    public @NotNull void expandScalar(@NotNull float scalar, @NotNull Out<Box> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_box_expand_scalar.invokeExact(handle(), scalar, (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Box(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_box_expand_vec3 = Interop.downcallHandle(
        "graphene_box_expand_vec3",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Expands the dimensions of {@code box} to include the coordinates of the
     * given vector.
     */
    public @NotNull void expandVec3(@NotNull Vec3 vec, @NotNull Out<Box> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_box_expand_vec3.invokeExact(handle(), vec.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Box(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_box_free = Interop.downcallHandle(
        "graphene_box_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the resources allocated by graphene_box_alloc().
     */
    public @NotNull void free() {
        try {
            graphene_box_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle graphene_box_get_bounding_sphere = Interop.downcallHandle(
        "graphene_box_get_bounding_sphere",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the bounding {@link Sphere} capable of containing the given
     * {@link Box}.
     */
    public @NotNull void getBoundingSphere(@NotNull Out<Sphere> sphere) {
        MemorySegment spherePOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_box_get_bounding_sphere.invokeExact(handle(), (Addressable) spherePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        sphere.set(new Sphere(Refcounted.get(spherePOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_box_get_center = Interop.downcallHandle(
        "graphene_box_get_center",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the coordinates of the center of a {@link Box}.
     */
    public @NotNull void getCenter(@NotNull Out<Point3D> center) {
        MemorySegment centerPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_box_get_center.invokeExact(handle(), (Addressable) centerPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        center.set(new Point3D(Refcounted.get(centerPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_box_get_depth = Interop.downcallHandle(
        "graphene_box_get_depth",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the size of the {@code box} on the Z axis.
     */
    public float getDepth() {
        float RESULT;
        try {
            RESULT = (float) graphene_box_get_depth.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_box_get_height = Interop.downcallHandle(
        "graphene_box_get_height",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the size of the {@code box} on the Y axis.
     */
    public float getHeight() {
        float RESULT;
        try {
            RESULT = (float) graphene_box_get_height.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_box_get_max = Interop.downcallHandle(
        "graphene_box_get_max",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the coordinates of the maximum point of the given
     * {@link Box}.
     */
    public @NotNull void getMax(@NotNull Out<Point3D> max) {
        MemorySegment maxPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_box_get_max.invokeExact(handle(), (Addressable) maxPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        max.set(new Point3D(Refcounted.get(maxPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_box_get_min = Interop.downcallHandle(
        "graphene_box_get_min",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the coordinates of the minimum point of the given
     * {@link Box}.
     */
    public @NotNull void getMin(@NotNull Out<Point3D> min) {
        MemorySegment minPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_box_get_min.invokeExact(handle(), (Addressable) minPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        min.set(new Point3D(Refcounted.get(minPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_box_get_size = Interop.downcallHandle(
        "graphene_box_get_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the size of the box on all three axes, and stores
     * it into the given {@code size} vector.
     */
    public @NotNull void getSize(@NotNull Out<Vec3> size) {
        MemorySegment sizePOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_box_get_size.invokeExact(handle(), (Addressable) sizePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        size.set(new Vec3(Refcounted.get(sizePOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_box_get_vertices = Interop.downcallHandle(
        "graphene_box_get_vertices",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the vertices of the given {@link Box}.
     */
    public @NotNull void getVertices(@NotNull Out<Vec3[]> vertices) {
        MemorySegment verticesPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_box_get_vertices.invokeExact(handle(), (Addressable) verticesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        Vec3[] verticesARRAY = new Vec3[8];
        for (int I = 0; I < 8; I++) {
            var OBJ = verticesPOINTER.get(ValueLayout.ADDRESS, I);
            verticesARRAY[I] = new Vec3(Refcounted.get(OBJ, false));
        }
        vertices.set(verticesARRAY);
    }
    
    private static final MethodHandle graphene_box_get_width = Interop.downcallHandle(
        "graphene_box_get_width",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the size of the {@code box} on the X axis.
     */
    public float getWidth() {
        float RESULT;
        try {
            RESULT = (float) graphene_box_get_width.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_box_init = Interop.downcallHandle(
        "graphene_box_init",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes the given {@link Box} with two vertices.
     */
    public @NotNull Box init(@Nullable Point3D min, @Nullable Point3D max) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_box_init.invokeExact(handle(), min.handle(), max.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Box(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_box_init_from_box = Interop.downcallHandle(
        "graphene_box_init_from_box",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes the given {@link Box} with the vertices of
     * another {@link Box}.
     */
    public @NotNull Box initFromBox(@NotNull Box src) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_box_init_from_box.invokeExact(handle(), src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Box(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_box_init_from_points = Interop.downcallHandle(
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
    public @NotNull Box initFromPoints(@NotNull int nPoints, @NotNull Point3D[] points) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_box_init_from_points.invokeExact(handle(), nPoints, Interop.allocateNativeArray(points));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Box(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_box_init_from_vec3 = Interop.downcallHandle(
        "graphene_box_init_from_vec3",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes the given {@link Box} with two vertices
     * stored inside {@link Vec3}.
     */
    public @NotNull Box initFromVec3(@Nullable Vec3 min, @Nullable Vec3 max) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_box_init_from_vec3.invokeExact(handle(), min.handle(), max.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Box(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_box_init_from_vectors = Interop.downcallHandle(
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
    public @NotNull Box initFromVectors(@NotNull int nVectors, @NotNull Vec3[] vectors) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_box_init_from_vectors.invokeExact(handle(), nVectors, Interop.allocateNativeArray(vectors));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Box(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_box_intersection = Interop.downcallHandle(
        "graphene_box_intersection",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Intersects the two given {@link Box}.
     * <p>
     * If the two boxes do not intersect, {@code res} will contain a degenerate box
     * initialized with graphene_box_empty().
     */
    public boolean intersection(@NotNull Box b, @NotNull Out<Box> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_box_intersection.invokeExact(handle(), b.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Box(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        return RESULT;
    }
    
    private static final MethodHandle graphene_box_union = Interop.downcallHandle(
        "graphene_box_union",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Unions the two given {@link Box}.
     */
    public @NotNull void union(@NotNull Box b, @NotNull Out<Box> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_box_union.invokeExact(handle(), b.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Box(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_box_empty = Interop.downcallHandle(
        "graphene_box_empty",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * A degenerate {@link Box} that can only be expanded.
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     */
    public static @NotNull Box empty() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_box_empty.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Box(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_box_infinite = Interop.downcallHandle(
        "graphene_box_infinite",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * A degenerate {@link Box} that cannot be expanded.
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     */
    public static @NotNull Box infinite() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_box_infinite.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Box(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_box_minus_one = Interop.downcallHandle(
        "graphene_box_minus_one",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * A {@link Box} with the minimum vertex set at (-1, -1, -1) and the
     * maximum vertex set at (0, 0, 0).
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     */
    public static @NotNull Box minusOne() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_box_minus_one.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Box(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_box_one = Interop.downcallHandle(
        "graphene_box_one",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * A {@link Box} with the minimum vertex set at (0, 0, 0) and the
     * maximum vertex set at (1, 1, 1).
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     */
    public static @NotNull Box one() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_box_one.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Box(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_box_one_minus_one = Interop.downcallHandle(
        "graphene_box_one_minus_one",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * A {@link Box} with the minimum vertex set at (-1, -1, -1) and the
     * maximum vertex set at (1, 1, 1).
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     */
    public static @NotNull Box oneMinusOne() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_box_one_minus_one.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Box(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_box_zero = Interop.downcallHandle(
        "graphene_box_zero",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * A {@link Box} with both the minimum and maximum vertices set at (0, 0, 0).
     * <p>
     * The returned value is owned by Graphene and should not be modified or freed.
     */
    public static @NotNull Box zero() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_box_zero.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Box(Refcounted.get(RESULT, false));
    }
    
}
