package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A sphere, represented by its center and radius.
 * @version 1.2
 */
public class Sphere extends Struct {
    
    static {
        Graphene.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "graphene_sphere_t";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.graphene.Vec3.getMemoryLayout().withName("center"),
            Interop.valueLayout.C_FLOAT.withName("radius")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Sphere}
     * @return A new, uninitialized @{link Sphere}
     */
    public static Sphere allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Sphere newInstance = new Sphere(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Sphere proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Sphere(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Sphere> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Sphere(input);
    
    private static MemoryAddress constructAlloc() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_sphere_alloc.invokeExact();
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
        var RESULT = constructAlloc();
        var OBJECT = org.gtk.graphene.Sphere.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Checks whether the given {@code point} is contained in the volume
     * of a {@link Sphere}.
     * @param point a {@link Point3D}
     * @return {@code true} if the sphere contains the point
     */
    public boolean containsPoint(org.gtk.graphene.Point3D point) {
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
    public float distance(org.gtk.graphene.Point3D point) {
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
    public boolean equal(org.gtk.graphene.Sphere b) {
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
            DowncallHandles.graphene_sphere_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Computes the bounding box capable of containing the
     * given {@link Sphere}.
     * @param box return location for the bounding box
     */
    public void getBoundingBox(org.gtk.graphene.Box box) {
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
    public void getCenter(org.gtk.graphene.Point3D center) {
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
            RESULT = (float) DowncallHandles.graphene_sphere_get_radius.invokeExact(handle());
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
    public org.gtk.graphene.Sphere init(@Nullable org.gtk.graphene.Point3D center, float radius) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_sphere_init.invokeExact(
                    handle(),
                    (Addressable) (center == null ? MemoryAddress.NULL : center.handle()),
                    radius);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Sphere.fromAddress.marshal(RESULT, null);
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
    public org.gtk.graphene.Sphere initFromPoints(int nPoints, org.gtk.graphene.Point3D[] points, @Nullable org.gtk.graphene.Point3D center) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.graphene_sphere_init_from_points.invokeExact(
                        handle(),
                        nPoints,
                        Interop.allocateNativeArray(points, org.gtk.graphene.Point3D.getMemoryLayout(), false, SCOPE),
                        (Addressable) (center == null ? MemoryAddress.NULL : center.handle()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gtk.graphene.Sphere.fromAddress.marshal(RESULT, null);
        }
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
    public org.gtk.graphene.Sphere initFromVectors(int nVectors, org.gtk.graphene.Vec3[] vectors, @Nullable org.gtk.graphene.Point3D center) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.graphene_sphere_init_from_vectors.invokeExact(
                        handle(),
                        nVectors,
                        Interop.allocateNativeArray(vectors, org.gtk.graphene.Vec3.getMemoryLayout(), false, SCOPE),
                        (Addressable) (center == null ? MemoryAddress.NULL : center.handle()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gtk.graphene.Sphere.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Checks whether the sphere has a zero radius.
     * @return {@code true} if the sphere is empty
     */
    public boolean isEmpty() {
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_sphere_is_empty.invokeExact(handle());
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
    public void translate(org.gtk.graphene.Point3D point, org.gtk.graphene.Sphere res) {
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
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_sphere_contains_point = Interop.downcallHandle(
                "graphene_sphere_contains_point",
                FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_sphere_distance = Interop.downcallHandle(
                "graphene_sphere_distance",
                FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_sphere_equal = Interop.downcallHandle(
                "graphene_sphere_equal",
                FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_sphere_free = Interop.downcallHandle(
                "graphene_sphere_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_sphere_get_bounding_box = Interop.downcallHandle(
                "graphene_sphere_get_bounding_box",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_sphere_get_center = Interop.downcallHandle(
                "graphene_sphere_get_center",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_sphere_get_radius = Interop.downcallHandle(
                "graphene_sphere_get_radius",
                FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_sphere_init = Interop.downcallHandle(
                "graphene_sphere_init",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle graphene_sphere_init_from_points = Interop.downcallHandle(
                "graphene_sphere_init_from_points",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_sphere_init_from_vectors = Interop.downcallHandle(
                "graphene_sphere_init_from_vectors",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_sphere_is_empty = Interop.downcallHandle(
                "graphene_sphere_is_empty",
                FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_sphere_translate = Interop.downcallHandle(
                "graphene_sphere_translate",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link Sphere.Builder} object constructs a {@link Sphere} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Sphere.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Sphere struct;
        
        private Builder() {
            struct = Sphere.allocate();
        }
        
        /**
         * Finish building the {@link Sphere} struct.
         * @return A new instance of {@code Sphere} with the fields 
         *         that were set in the Builder object.
         */
        public Sphere build() {
            return struct;
        }
        
        public Builder setCenter(org.gtk.graphene.Vec3 center) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("center"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (center == null ? MemoryAddress.NULL : center.handle()));
                return this;
            }
        }
        
        public Builder setRadius(float radius) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("radius"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), radius);
                return this;
            }
        }
    }
}
