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
 */
public class Plane extends io.github.jwharm.javagi.ResourceBase {

    public Plane(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle graphene_plane_alloc = Interop.downcallHandle(
        "graphene_plane_alloc",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructAlloc() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) graphene_plane_alloc.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Allocates a new {@link Plane} structure.
     * <p>
     * The contents of the returned structure are undefined.
     */
    public static Plane alloc() {
        return new Plane(constructAlloc());
    }
    
    private static final MethodHandle graphene_plane_distance = Interop.downcallHandle(
        "graphene_plane_distance",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the distance of {@code point} from a {@link Plane}.
     */
    public float distance(@NotNull Point3D point) {
        float RESULT;
        try {
            RESULT = (float) graphene_plane_distance.invokeExact(handle(), point.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_plane_equal = Interop.downcallHandle(
        "graphene_plane_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the two given {@link Plane} are equal.
     */
    public boolean equal(@NotNull Plane b) {
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_plane_equal.invokeExact(handle(), b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_plane_free = Interop.downcallHandle(
        "graphene_plane_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the resources allocated by graphene_plane_alloc().
     */
    public @NotNull void free() {
        try {
            graphene_plane_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle graphene_plane_get_constant = Interop.downcallHandle(
        "graphene_plane_get_constant",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the distance along the normal vector of the
     * given {@link Plane} from the origin.
     */
    public float getConstant() {
        float RESULT;
        try {
            RESULT = (float) graphene_plane_get_constant.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_plane_get_normal = Interop.downcallHandle(
        "graphene_plane_get_normal",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the normal vector pointing towards the origin of the
     * given {@link Plane}.
     */
    public @NotNull void getNormal(@NotNull Out<Vec3> normal) {
        MemorySegment normalPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_plane_get_normal.invokeExact(handle(), (Addressable) normalPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        normal.set(new Vec3(Refcounted.get(normalPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_plane_init = Interop.downcallHandle(
        "graphene_plane_init",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Initializes the given {@link Plane} using the given {@code normal} vector
     * and {@code constant} values.
     */
    public @NotNull Plane init(@Nullable Vec3 normal, @NotNull float constant) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_plane_init.invokeExact(handle(), normal.handle(), constant);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Plane(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_plane_init_from_plane = Interop.downcallHandle(
        "graphene_plane_init_from_plane",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes the given {@link Plane} using the normal
     * vector and constant of another {@link Plane}.
     */
    public @NotNull Plane initFromPlane(@NotNull Plane src) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_plane_init_from_plane.invokeExact(handle(), src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Plane(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_plane_init_from_point = Interop.downcallHandle(
        "graphene_plane_init_from_point",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes the given {@link Plane} using the given normal vector
     * and an arbitrary co-planar point.
     */
    public @NotNull Plane initFromPoint(@NotNull Vec3 normal, @NotNull Point3D point) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_plane_init_from_point.invokeExact(handle(), normal.handle(), point.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Plane(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_plane_init_from_points = Interop.downcallHandle(
        "graphene_plane_init_from_points",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes the given {@link Plane} using the 3 provided co-planar
     * points.
     * <p>
     * The winding order is counter-clockwise, and determines which direction
     * the normal vector will point.
     */
    public @NotNull Plane initFromPoints(@NotNull Point3D a, @NotNull Point3D b, @NotNull Point3D c) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_plane_init_from_points.invokeExact(handle(), a.handle(), b.handle(), c.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Plane(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_plane_init_from_vec4 = Interop.downcallHandle(
        "graphene_plane_init_from_vec4",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes the given {@link Plane} using the components of
     * the given {@link Vec4} vector.
     */
    public @NotNull Plane initFromVec4(@NotNull Vec4 src) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_plane_init_from_vec4.invokeExact(handle(), src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Plane(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_plane_negate = Interop.downcallHandle(
        "graphene_plane_negate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Negates the normal vector and constant of a {@link Plane}, effectively
     * mirroring the plane across the origin.
     */
    public @NotNull void negate(@NotNull Out<Plane> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_plane_negate.invokeExact(handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Plane(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_plane_normalize = Interop.downcallHandle(
        "graphene_plane_normalize",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Normalizes the vector of the given {@link Plane},
     * and adjusts the constant accordingly.
     */
    public @NotNull void normalize(@NotNull Out<Plane> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_plane_normalize.invokeExact(handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Plane(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_plane_transform = Interop.downcallHandle(
        "graphene_plane_transform",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Transforms a {@link Plane} @p using the given {@code matrix}
     * and {@code normal_matrix}.
     * <p>
     * If {@code normal_matrix} is {@code null}, a transformation matrix for the plane
     * normal will be computed from {@code matrix}. If you are transforming
     * multiple planes using the same {@code matrix} it's recommended to compute
     * the normal matrix beforehand to avoid incurring in the cost of
     * recomputing it every time.
     */
    public @NotNull void transform(@NotNull Matrix matrix, @Nullable Matrix normalMatrix, @NotNull Out<Plane> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_plane_transform.invokeExact(handle(), matrix.handle(), normalMatrix.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Plane(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
}
