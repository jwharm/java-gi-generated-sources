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
public class Plane extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Graphene.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "graphene_plane_t";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.graphene.Vec3.getMemoryLayout().withName("normal"),
        ValueLayout.JAVA_FLOAT.withName("constant")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static Plane allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Plane newInstance = new Plane(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public Plane(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static Refcounted constructAlloc() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.graphene_plane_alloc.invokeExact(), true);
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
        return new Plane(constructAlloc());
    }
    
    /**
     * Computes the distance of {@code point} from a {@link Plane}.
     * @param point a {@link Point3D}
     * @return the distance of the given {@link Point3D} from the plane
     */
    public float distance(@NotNull org.gtk.graphene.Point3D point) {
        java.util.Objects.requireNonNull(point, "Parameter 'point' must not be null");
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
    public boolean equal(@NotNull org.gtk.graphene.Plane b) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
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
            DowncallHandles.graphene_plane_free.invokeExact(
                    handle());
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
            RESULT = (float) DowncallHandles.graphene_plane_get_constant.invokeExact(
                    handle());
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
    public void getNormal(@NotNull org.gtk.graphene.Vec3 normal) {
        java.util.Objects.requireNonNull(normal, "Parameter 'normal' must not be null");
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
    public @NotNull org.gtk.graphene.Plane init(@Nullable org.gtk.graphene.Vec3 normal, float constant) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_plane_init.invokeExact(
                    handle(),
                    (Addressable) (normal == null ? MemoryAddress.NULL : normal.handle()),
                    constant);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Plane(Refcounted.get(RESULT, false));
    }
    
    /**
     * Initializes the given {@link Plane} using the normal
     * vector and constant of another {@link Plane}.
     * @param src a {@link Plane}
     * @return the initialized plane
     */
    public @NotNull org.gtk.graphene.Plane initFromPlane(@NotNull org.gtk.graphene.Plane src) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_plane_init_from_plane.invokeExact(
                    handle(),
                    src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Plane(Refcounted.get(RESULT, false));
    }
    
    /**
     * Initializes the given {@link Plane} using the given normal vector
     * and an arbitrary co-planar point.
     * @param normal a normal vector defining the plane pointing towards the origin
     * @param point a {@link Point3D}
     * @return the initialized plane
     */
    public @NotNull org.gtk.graphene.Plane initFromPoint(@NotNull org.gtk.graphene.Vec3 normal, @NotNull org.gtk.graphene.Point3D point) {
        java.util.Objects.requireNonNull(normal, "Parameter 'normal' must not be null");
        java.util.Objects.requireNonNull(point, "Parameter 'point' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_plane_init_from_point.invokeExact(
                    handle(),
                    normal.handle(),
                    point.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Plane(Refcounted.get(RESULT, false));
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
    public @NotNull org.gtk.graphene.Plane initFromPoints(@NotNull org.gtk.graphene.Point3D a, @NotNull org.gtk.graphene.Point3D b, @NotNull org.gtk.graphene.Point3D c) {
        java.util.Objects.requireNonNull(a, "Parameter 'a' must not be null");
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        java.util.Objects.requireNonNull(c, "Parameter 'c' must not be null");
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
        return new org.gtk.graphene.Plane(Refcounted.get(RESULT, false));
    }
    
    /**
     * Initializes the given {@link Plane} using the components of
     * the given {@link Vec4} vector.
     * @param src a {@link Vec4} containing the normal vector in its first
     *   three components, and the distance in its fourth component
     * @return the initialized plane
     */
    public @NotNull org.gtk.graphene.Plane initFromVec4(@NotNull org.gtk.graphene.Vec4 src) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_plane_init_from_vec4.invokeExact(
                    handle(),
                    src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Plane(Refcounted.get(RESULT, false));
    }
    
    /**
     * Negates the normal vector and constant of a {@link Plane}, effectively
     * mirroring the plane across the origin.
     * @param res return location for the negated plane
     */
    public void negate(@NotNull org.gtk.graphene.Plane res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
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
    public void normalize(@NotNull org.gtk.graphene.Plane res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
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
    public void transform(@NotNull org.gtk.graphene.Matrix matrix, @Nullable org.gtk.graphene.Matrix normalMatrix, @NotNull org.gtk.graphene.Plane res) {
        java.util.Objects.requireNonNull(matrix, "Parameter 'matrix' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
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
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_plane_distance = Interop.downcallHandle(
            "graphene_plane_distance",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_plane_equal = Interop.downcallHandle(
            "graphene_plane_equal",
            FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_plane_free = Interop.downcallHandle(
            "graphene_plane_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_plane_get_constant = Interop.downcallHandle(
            "graphene_plane_get_constant",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_plane_get_normal = Interop.downcallHandle(
            "graphene_plane_get_normal",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_plane_init = Interop.downcallHandle(
            "graphene_plane_init",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
        );
        
        private static final MethodHandle graphene_plane_init_from_plane = Interop.downcallHandle(
            "graphene_plane_init_from_plane",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_plane_init_from_point = Interop.downcallHandle(
            "graphene_plane_init_from_point",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_plane_init_from_points = Interop.downcallHandle(
            "graphene_plane_init_from_points",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_plane_init_from_vec4 = Interop.downcallHandle(
            "graphene_plane_init_from_vec4",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_plane_negate = Interop.downcallHandle(
            "graphene_plane_negate",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_plane_normalize = Interop.downcallHandle(
            "graphene_plane_normalize",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_plane_transform = Interop.downcallHandle(
            "graphene_plane_transform",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
