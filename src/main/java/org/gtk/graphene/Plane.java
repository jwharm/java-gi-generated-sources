package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A 2D plane that extends infinitely in a 3D volume.
 * <p>
 * The contents of the {@code graphene_plane_t} are private, and should not be
 * modified directly.
 * @version 1.2
 */
public class Plane extends Struct {
    
    static {
        Graphene.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "graphene_plane_t";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.graphene.Vec3.getMemoryLayout().withName("normal"),
            Interop.valueLayout.C_FLOAT.withName("constant")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Plane}
     * @return A new, uninitialized @{link Plane}
     */
    public static Plane allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Plane newInstance = new Plane(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Plane proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Plane(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Plane> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Plane(input);
    
    private static MemoryAddress constructAlloc() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_plane_alloc.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Allocates a new {@link Plane} structure.
     * <p>
     * The contents of the returned structure are undefined.
     * @return the newly allocated {@link Plane}.
     *   Use graphene_plane_free() to free the resources allocated by
     *   this function
     */
    public static Plane alloc() {
        var RESULT = constructAlloc();
        var OBJECT = org.gtk.graphene.Plane.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Computes the distance of {@code point} from a {@link Plane}.
     * @param point a {@link Point3D}
     * @return the distance of the given {@link Point3D} from the plane
     */
    public float distance(org.gtk.graphene.Point3D point) {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_plane_distance.invokeExact(
                    handle(),
                    point.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks whether the two given {@link Plane} are equal.
     * @param b a {@link Plane}
     * @return {@code true} if the given planes are equal
     */
    public boolean equal(org.gtk.graphene.Plane b) {
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_plane_equal.invokeExact(
                    handle(),
                    b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Frees the resources allocated by graphene_plane_alloc().
     */
    public void free() {
        try {
            DowncallHandles.graphene_plane_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the distance along the normal vector of the
     * given {@link Plane} from the origin.
     * @return the constant value of the plane
     */
    public float getConstant() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_plane_get_constant.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the normal vector pointing towards the origin of the
     * given {@link Plane}.
     * @param normal return location for the normal vector
     */
    public void getNormal(org.gtk.graphene.Vec3 normal) {
        try {
            DowncallHandles.graphene_plane_get_normal.invokeExact(
                    handle(),
                    normal.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Initializes the given {@link Plane} using the given {@code normal} vector
     * and {@code constant} values.
     * @param normal a unit length normal vector defining the plane
     *   pointing towards the origin; if unset, we use the X axis by default
     * @param constant the distance from the origin to the plane along the
     *   normal vector; the sign determines the half-space occupied by the
     *   plane
     * @return the initialized plane
     */
    public org.gtk.graphene.Plane init(@Nullable org.gtk.graphene.Vec3 normal, float constant) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_plane_init.invokeExact(
                    handle(),
                    (Addressable) (normal == null ? MemoryAddress.NULL : normal.handle()),
                    constant);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Plane.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Initializes the given {@link Plane} using the normal
     * vector and constant of another {@link Plane}.
     * @param src a {@link Plane}
     * @return the initialized plane
     */
    public org.gtk.graphene.Plane initFromPlane(org.gtk.graphene.Plane src) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_plane_init_from_plane.invokeExact(
                    handle(),
                    src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Plane.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Initializes the given {@link Plane} using the given normal vector
     * and an arbitrary co-planar point.
     * @param normal a normal vector defining the plane pointing towards the origin
     * @param point a {@link Point3D}
     * @return the initialized plane
     */
    public org.gtk.graphene.Plane initFromPoint(org.gtk.graphene.Vec3 normal, org.gtk.graphene.Point3D point) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_plane_init_from_point.invokeExact(
                    handle(),
                    normal.handle(),
                    point.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Plane.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Initializes the given {@link Plane} using the 3 provided co-planar
     * points.
     * <p>
     * The winding order is counter-clockwise, and determines which direction
     * the normal vector will point.
     * @param a a {@link Point3D}
     * @param b a {@link Point3D}
     * @param c a {@link Point3D}
     * @return the initialized plane
     */
    public org.gtk.graphene.Plane initFromPoints(org.gtk.graphene.Point3D a, org.gtk.graphene.Point3D b, org.gtk.graphene.Point3D c) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_plane_init_from_points.invokeExact(
                    handle(),
                    a.handle(),
                    b.handle(),
                    c.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Plane.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Initializes the given {@link Plane} using the components of
     * the given {@link Vec4} vector.
     * @param src a {@link Vec4} containing the normal vector in its first
     *   three components, and the distance in its fourth component
     * @return the initialized plane
     */
    public org.gtk.graphene.Plane initFromVec4(org.gtk.graphene.Vec4 src) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_plane_init_from_vec4.invokeExact(
                    handle(),
                    src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Plane.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Negates the normal vector and constant of a {@link Plane}, effectively
     * mirroring the plane across the origin.
     * @param res return location for the negated plane
     */
    public void negate(org.gtk.graphene.Plane res) {
        try {
            DowncallHandles.graphene_plane_negate.invokeExact(
                    handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Normalizes the vector of the given {@link Plane},
     * and adjusts the constant accordingly.
     * @param res return location for the normalized plane
     */
    public void normalize(org.gtk.graphene.Plane res) {
        try {
            DowncallHandles.graphene_plane_normalize.invokeExact(
                    handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Transforms a {@link Plane} {@code p} using the given {@code matrix}
     * and {@code normal_matrix}.
     * <p>
     * If {@code normal_matrix} is {@code null}, a transformation matrix for the plane
     * normal will be computed from {@code matrix}. If you are transforming
     * multiple planes using the same {@code matrix} it's recommended to compute
     * the normal matrix beforehand to avoid incurring in the cost of
     * recomputing it every time.
     * @param matrix a {@link Matrix}
     * @param normalMatrix a {@link Matrix}
     * @param res the transformed plane
     */
    public void transform(org.gtk.graphene.Matrix matrix, @Nullable org.gtk.graphene.Matrix normalMatrix, org.gtk.graphene.Plane res) {
        try {
            DowncallHandles.graphene_plane_transform.invokeExact(
                    handle(),
                    matrix.handle(),
                    (Addressable) (normalMatrix == null ? MemoryAddress.NULL : normalMatrix.handle()),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle graphene_plane_alloc = Interop.downcallHandle(
                "graphene_plane_alloc",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_plane_distance = Interop.downcallHandle(
                "graphene_plane_distance",
                FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_plane_equal = Interop.downcallHandle(
                "graphene_plane_equal",
                FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_plane_free = Interop.downcallHandle(
                "graphene_plane_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_plane_get_constant = Interop.downcallHandle(
                "graphene_plane_get_constant",
                FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_plane_get_normal = Interop.downcallHandle(
                "graphene_plane_get_normal",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_plane_init = Interop.downcallHandle(
                "graphene_plane_init",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle graphene_plane_init_from_plane = Interop.downcallHandle(
                "graphene_plane_init_from_plane",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_plane_init_from_point = Interop.downcallHandle(
                "graphene_plane_init_from_point",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_plane_init_from_points = Interop.downcallHandle(
                "graphene_plane_init_from_points",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_plane_init_from_vec4 = Interop.downcallHandle(
                "graphene_plane_init_from_vec4",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_plane_negate = Interop.downcallHandle(
                "graphene_plane_negate",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_plane_normalize = Interop.downcallHandle(
                "graphene_plane_normalize",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_plane_transform = Interop.downcallHandle(
                "graphene_plane_transform",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link Plane.Builder} object constructs a {@link Plane} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Plane.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Plane struct;
        
        private Builder() {
            struct = Plane.allocate();
        }
        
        /**
         * Finish building the {@link Plane} struct.
         * @return A new instance of {@code Plane} with the fields 
         *         that were set in the Builder object.
         */
        public Plane build() {
            return struct;
        }
        
        public Builder setNormal(org.gtk.graphene.Vec3 normal) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("normal"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (normal == null ? MemoryAddress.NULL : normal.handle()));
                return this;
            }
        }
        
        public Builder setConstant(float constant) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("constant"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), constant);
                return this;
            }
        }
    }
}
