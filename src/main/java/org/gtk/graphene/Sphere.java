package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A sphere, represented by its center and radius.
 */
public class Sphere extends io.github.jwharm.javagi.ResourceBase {

    public Sphere(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle graphene_sphere_alloc = Interop.downcallHandle(
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
    
    static final MethodHandle graphene_sphere_contains_point = Interop.downcallHandle(
        "graphene_sphere_contains_point",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the given {@code point} is contained in the volume
     * of a {@link Sphere}.
     */
    public boolean containsPoint(Point3D point) {
        try {
            var RESULT = (boolean) graphene_sphere_contains_point.invokeExact(handle(), point.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_sphere_distance = Interop.downcallHandle(
        "graphene_sphere_distance",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the distance of the given {@code point} from the surface of
     * a {@link Sphere}.
     */
    public float distance(Point3D point) {
        try {
            var RESULT = (float) graphene_sphere_distance.invokeExact(handle(), point.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_sphere_equal = Interop.downcallHandle(
        "graphene_sphere_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether two {@link Sphere} are equal.
     */
    public boolean equal(Sphere b) {
        try {
            var RESULT = (boolean) graphene_sphere_equal.invokeExact(handle(), b.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_sphere_free = Interop.downcallHandle(
        "graphene_sphere_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the resources allocated by graphene_sphere_alloc().
     */
    public void free() {
        try {
            graphene_sphere_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_sphere_get_bounding_box = Interop.downcallHandle(
        "graphene_sphere_get_bounding_box",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the bounding box capable of containing the
     * given {@link Sphere}.
     */
    public void getBoundingBox(Box box) {
        try {
            graphene_sphere_get_bounding_box.invokeExact(handle(), box.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_sphere_get_center = Interop.downcallHandle(
        "graphene_sphere_get_center",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the coordinates of the center of a {@link Sphere}.
     */
    public void getCenter(Point3D center) {
        try {
            graphene_sphere_get_center.invokeExact(handle(), center.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_sphere_get_radius = Interop.downcallHandle(
        "graphene_sphere_get_radius",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the radius of a {@link Sphere}.
     */
    public float getRadius() {
        try {
            var RESULT = (float) graphene_sphere_get_radius.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_sphere_init = Interop.downcallHandle(
        "graphene_sphere_init",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Initializes the given {@link Sphere} with the given {@code center} and {@code radius}.
     */
    public Sphere init(Point3D center, float radius) {
        try {
            var RESULT = (MemoryAddress) graphene_sphere_init.invokeExact(handle(), center.handle(), radius);
            return new Sphere(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_sphere_init_from_points = Interop.downcallHandle(
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
    public Sphere initFromPoints(int nPoints, Point3D[] points, Point3D center) {
        try {
            var RESULT = (MemoryAddress) graphene_sphere_init_from_points.invokeExact(handle(), nPoints, Interop.allocateNativeArray(points).handle(), center.handle());
            return new Sphere(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_sphere_init_from_vectors = Interop.downcallHandle(
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
    public Sphere initFromVectors(int nVectors, Vec3[] vectors, Point3D center) {
        try {
            var RESULT = (MemoryAddress) graphene_sphere_init_from_vectors.invokeExact(handle(), nVectors, Interop.allocateNativeArray(vectors).handle(), center.handle());
            return new Sphere(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_sphere_is_empty = Interop.downcallHandle(
        "graphene_sphere_is_empty",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the sphere has a zero radius.
     */
    public boolean isEmpty() {
        try {
            var RESULT = (boolean) graphene_sphere_is_empty.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_sphere_translate = Interop.downcallHandle(
        "graphene_sphere_translate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Translates the center of the given {@link Sphere} using the {@code point}
     * coordinates as the delta of the translation.
     */
    public void translate(Point3D point, Sphere res) {
        try {
            graphene_sphere_translate.invokeExact(handle(), point.handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
