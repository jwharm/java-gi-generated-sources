package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A sphere, represented by its center and radius.
 */
public class Sphere extends io.github.jwharm.javagi.ResourceBase {

    public Sphere(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle graphene_sphere_alloc = Interop.downcallHandle(
        "graphene_sphere_alloc",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructAlloc() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) graphene_sphere_alloc.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Allocates a new {@link Sphere}.
     * <p>
     * The contents of the newly allocated structure are undefined.
     */
    public static Sphere alloc() {
        return new Sphere(constructAlloc());
    }
    
    private static final MethodHandle graphene_sphere_contains_point = Interop.downcallHandle(
        "graphene_sphere_contains_point",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the given {@code point} is contained in the volume
     * of a {@link Sphere}.
     */
    public boolean containsPoint(@NotNull Point3D point) {
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_sphere_contains_point.invokeExact(handle(), point.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_sphere_distance = Interop.downcallHandle(
        "graphene_sphere_distance",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the distance of the given {@code point} from the surface of
     * a {@link Sphere}.
     */
    public float distance(@NotNull Point3D point) {
        float RESULT;
        try {
            RESULT = (float) graphene_sphere_distance.invokeExact(handle(), point.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_sphere_equal = Interop.downcallHandle(
        "graphene_sphere_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether two {@link Sphere} are equal.
     */
    public boolean equal(@NotNull Sphere b) {
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_sphere_equal.invokeExact(handle(), b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_sphere_free = Interop.downcallHandle(
        "graphene_sphere_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the resources allocated by graphene_sphere_alloc().
     */
    public @NotNull void free() {
        try {
            graphene_sphere_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle graphene_sphere_get_bounding_box = Interop.downcallHandle(
        "graphene_sphere_get_bounding_box",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the bounding box capable of containing the
     * given {@link Sphere}.
     */
    public @NotNull void getBoundingBox(@NotNull Out<Box> box) {
        MemorySegment boxPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_sphere_get_bounding_box.invokeExact(handle(), (Addressable) boxPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        box.set(new Box(Refcounted.get(boxPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_sphere_get_center = Interop.downcallHandle(
        "graphene_sphere_get_center",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the coordinates of the center of a {@link Sphere}.
     */
    public @NotNull void getCenter(@NotNull Out<Point3D> center) {
        MemorySegment centerPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_sphere_get_center.invokeExact(handle(), (Addressable) centerPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        center.set(new Point3D(Refcounted.get(centerPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_sphere_get_radius = Interop.downcallHandle(
        "graphene_sphere_get_radius",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the radius of a {@link Sphere}.
     */
    public float getRadius() {
        float RESULT;
        try {
            RESULT = (float) graphene_sphere_get_radius.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_sphere_init = Interop.downcallHandle(
        "graphene_sphere_init",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Initializes the given {@link Sphere} with the given {@code center} and {@code radius}.
     */
    public @NotNull Sphere init(@Nullable Point3D center, @NotNull float radius) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_sphere_init.invokeExact(handle(), center.handle(), radius);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Sphere(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_sphere_init_from_points = Interop.downcallHandle(
        "graphene_sphere_init_from_points",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes the given {@link Sphere} using the given array
     * of 3D coordinates so that the sphere includes them.
     * <p>
     * The center of the sphere can either be specified, or will be center
     * of the 3D volume that encompasses all {@code points}.
     */
    public @NotNull Sphere initFromPoints(@NotNull int nPoints, @NotNull Point3D[] points, @Nullable Point3D center) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_sphere_init_from_points.invokeExact(handle(), nPoints, Interop.allocateNativeArray(points), center.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Sphere(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_sphere_init_from_vectors = Interop.downcallHandle(
        "graphene_sphere_init_from_vectors",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes the given {@link Sphere} using the given array
     * of 3D coordinates so that the sphere includes them.
     * <p>
     * The center of the sphere can either be specified, or will be center
     * of the 3D volume that encompasses all {@code vectors}.
     */
    public @NotNull Sphere initFromVectors(@NotNull int nVectors, @NotNull Vec3[] vectors, @Nullable Point3D center) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_sphere_init_from_vectors.invokeExact(handle(), nVectors, Interop.allocateNativeArray(vectors), center.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Sphere(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_sphere_is_empty = Interop.downcallHandle(
        "graphene_sphere_is_empty",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the sphere has a zero radius.
     */
    public boolean isEmpty() {
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_sphere_is_empty.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_sphere_translate = Interop.downcallHandle(
        "graphene_sphere_translate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Translates the center of the given {@link Sphere} using the {@code point}
     * coordinates as the delta of the translation.
     */
    public @NotNull void translate(@NotNull Point3D point, @NotNull Out<Sphere> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_sphere_translate.invokeExact(handle(), point.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Sphere(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
}
