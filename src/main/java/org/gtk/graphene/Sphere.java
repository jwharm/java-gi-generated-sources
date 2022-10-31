package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A sphere, represented by its center and radius.
 * @version 1.2
 */
public class Sphere extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Graphene.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "graphene_sphere_t";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.graphene.Vec3.getMemoryLayout().withName("center"),
        ValueLayout.JAVA_FLOAT.withName("radius")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static Sphere allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Sphere newInstance = new Sphere(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public Sphere(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static Refcounted constructAlloc() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.graphene_sphere_alloc.invokeExact(), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocates a new {@link Sphere}.
     * <p>
     * The contents of the newly allocated structure are undefined.
     * @return the newly allocated {@link Sphere}. Use
     *   graphene_sphere_free() to free the resources allocated by this function
     */
    public static Sphere alloc() {
        return new Sphere(constructAlloc());
    }
    
    /**
     * Checks whether the given {@code point} is contained in the volume
     * of a {@link Sphere}.
     * @param point a {@link Point3D}
     * @return {@code true} if the sphere contains the point
     */
    public boolean containsPoint(@NotNull org.gtk.graphene.Point3D point) {
        java.util.Objects.requireNonNull(point, "Parameter 'point' must not be null");
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_sphere_contains_point.invokeExact(
                    handle(),
                    point.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Computes the distance of the given {@code point} from the surface of
     * a {@link Sphere}.
     * @param point a {@link Point3D}
     * @return the distance of the point
     */
    public float distance(@NotNull org.gtk.graphene.Point3D point) {
        java.util.Objects.requireNonNull(point, "Parameter 'point' must not be null");
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_sphere_distance.invokeExact(
                    handle(),
                    point.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks whether two {@link Sphere} are equal.
     * @param b a {@link Sphere}
     * @return {@code true} if the spheres are equal
     */
    public boolean equal(@NotNull org.gtk.graphene.Sphere b) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_sphere_equal.invokeExact(
                    handle(),
                    b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Frees the resources allocated by graphene_sphere_alloc().
     */
    public void free() {
        try {
            DowncallHandles.graphene_sphere_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Computes the bounding box capable of containing the
     * given {@link Sphere}.
     * @param box return location for the bounding box
     */
    public void getBoundingBox(@NotNull org.gtk.graphene.Box box) {
        java.util.Objects.requireNonNull(box, "Parameter 'box' must not be null");
        try {
            DowncallHandles.graphene_sphere_get_bounding_box.invokeExact(
                    handle(),
                    box.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the coordinates of the center of a {@link Sphere}.
     * @param center return location for the coordinates of
     *   the center
     */
    public void getCenter(@NotNull org.gtk.graphene.Point3D center) {
        java.util.Objects.requireNonNull(center, "Parameter 'center' must not be null");
        try {
            DowncallHandles.graphene_sphere_get_center.invokeExact(
                    handle(),
                    center.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the radius of a {@link Sphere}.
     */
    public float getRadius() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_sphere_get_radius.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Initializes the given {@link Sphere} with the given {@code center} and {@code radius}.
     * @param center the coordinates of the center of the sphere, or {@code null}
     *   for a center in (0, 0, 0)
     * @param radius the radius of the sphere
     * @return the initialized {@link Sphere}
     */
    public @NotNull org.gtk.graphene.Sphere init(@Nullable org.gtk.graphene.Point3D center, float radius) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_sphere_init.invokeExact(
                    handle(),
                    (Addressable) (center == null ? MemoryAddress.NULL : center.handle()),
                    radius);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Sphere(Refcounted.get(RESULT, false));
    }
    
    /**
     * Initializes the given {@link Sphere} using the given array
     * of 3D coordinates so that the sphere includes them.
     * <p>
     * The center of the sphere can either be specified, or will be center
     * of the 3D volume that encompasses all {@code points}.
     * @param nPoints the number of {@link Point3D} in the {@code points} array
     * @param points an array of {@link Point3D}
     * @param center the center of the sphere
     * @return the initialized {@link Sphere}
     */
    public @NotNull org.gtk.graphene.Sphere initFromPoints(int nPoints, org.gtk.graphene.Point3D[] points, @Nullable org.gtk.graphene.Point3D center) {
        java.util.Objects.requireNonNull(points, "Parameter 'points' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_sphere_init_from_points.invokeExact(
                    handle(),
                    nPoints,
                    Interop.allocateNativeArray(points, false),
                    (Addressable) (center == null ? MemoryAddress.NULL : center.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Sphere(Refcounted.get(RESULT, false));
    }
    
    /**
     * Initializes the given {@link Sphere} using the given array
     * of 3D coordinates so that the sphere includes them.
     * <p>
     * The center of the sphere can either be specified, or will be center
     * of the 3D volume that encompasses all {@code vectors}.
     * @param nVectors the number of {@link Vec3} in the {@code vectors} array
     * @param vectors an array of {@link Vec3}
     * @param center the center of the sphere
     * @return the initialized {@link Sphere}
     */
    public @NotNull org.gtk.graphene.Sphere initFromVectors(int nVectors, org.gtk.graphene.Vec3[] vectors, @Nullable org.gtk.graphene.Point3D center) {
        java.util.Objects.requireNonNull(vectors, "Parameter 'vectors' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_sphere_init_from_vectors.invokeExact(
                    handle(),
                    nVectors,
                    Interop.allocateNativeArray(vectors, false),
                    (Addressable) (center == null ? MemoryAddress.NULL : center.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Sphere(Refcounted.get(RESULT, false));
    }
    
    /**
     * Checks whether the sphere has a zero radius.
     * @return {@code true} if the sphere is empty
     */
    public boolean isEmpty() {
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_sphere_is_empty.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Translates the center of the given {@link Sphere} using the {@code point}
     * coordinates as the delta of the translation.
     * @param point the coordinates of the translation
     * @param res return location for the translated sphere
     */
    public void translate(@NotNull org.gtk.graphene.Point3D point, @NotNull org.gtk.graphene.Sphere res) {
        java.util.Objects.requireNonNull(point, "Parameter 'point' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_sphere_translate.invokeExact(
                    handle(),
                    point.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle graphene_sphere_alloc = Interop.downcallHandle(
            "graphene_sphere_alloc",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_sphere_contains_point = Interop.downcallHandle(
            "graphene_sphere_contains_point",
            FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_sphere_distance = Interop.downcallHandle(
            "graphene_sphere_distance",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_sphere_equal = Interop.downcallHandle(
            "graphene_sphere_equal",
            FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_sphere_free = Interop.downcallHandle(
            "graphene_sphere_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_sphere_get_bounding_box = Interop.downcallHandle(
            "graphene_sphere_get_bounding_box",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_sphere_get_center = Interop.downcallHandle(
            "graphene_sphere_get_center",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_sphere_get_radius = Interop.downcallHandle(
            "graphene_sphere_get_radius",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_sphere_init = Interop.downcallHandle(
            "graphene_sphere_init",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
        );
        
        private static final MethodHandle graphene_sphere_init_from_points = Interop.downcallHandle(
            "graphene_sphere_init_from_points",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_sphere_init_from_vectors = Interop.downcallHandle(
            "graphene_sphere_init_from_vectors",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_sphere_is_empty = Interop.downcallHandle(
            "graphene_sphere_is_empty",
            FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_sphere_translate = Interop.downcallHandle(
            "graphene_sphere_translate",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
