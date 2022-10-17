package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A 3D volume delimited by 2D clip planes.
 * <p>
 * The contents of the {@code graphene_frustum_t} are private, and should not be
 * modified directly.
 */
public class Frustum extends io.github.jwharm.javagi.ResourceBase {

    public Frustum(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle graphene_frustum_alloc = Interop.downcallHandle(
        "graphene_frustum_alloc",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructAlloc() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) graphene_frustum_alloc.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Allocates a new {@link Frustum} structure.
     * <p>
     * The contents of the returned structure are undefined.
     */
    public static Frustum alloc() {
        return new Frustum(constructAlloc());
    }
    
    private static final MethodHandle graphene_frustum_contains_point = Interop.downcallHandle(
        "graphene_frustum_contains_point",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether a point is inside the volume defined by the given
     * {@link Frustum}.
     */
    public boolean containsPoint(@NotNull Point3D point) {
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_frustum_contains_point.invokeExact(handle(), point.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_frustum_equal = Interop.downcallHandle(
        "graphene_frustum_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the two given {@link Frustum} are equal.
     */
    public boolean equal(@NotNull Frustum b) {
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_frustum_equal.invokeExact(handle(), b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_frustum_free = Interop.downcallHandle(
        "graphene_frustum_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the resources allocated by graphene_frustum_alloc().
     */
    public @NotNull void free() {
        try {
            graphene_frustum_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle graphene_frustum_get_planes = Interop.downcallHandle(
        "graphene_frustum_get_planes",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the planes that define the given {@link Frustum}.
     */
    public @NotNull void getPlanes(@NotNull Out<Plane[]> planes) {
        MemorySegment planesPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_frustum_get_planes.invokeExact(handle(), (Addressable) planesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        Plane[] planesARRAY = new Plane[6];
        for (int I = 0; I < 6; I++) {
            var OBJ = planesPOINTER.get(ValueLayout.ADDRESS, I);
            planesARRAY[I] = new Plane(Refcounted.get(OBJ, false));
        }
        planes.set(planesARRAY);
    }
    
    private static final MethodHandle graphene_frustum_init = Interop.downcallHandle(
        "graphene_frustum_init",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes the given {@link Frustum} using the provided
     * clipping planes.
     */
    public @NotNull Frustum init(@NotNull Plane p0, @NotNull Plane p1, @NotNull Plane p2, @NotNull Plane p3, @NotNull Plane p4, @NotNull Plane p5) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_frustum_init.invokeExact(handle(), p0.handle(), p1.handle(), p2.handle(), p3.handle(), p4.handle(), p5.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Frustum(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_frustum_init_from_frustum = Interop.downcallHandle(
        "graphene_frustum_init_from_frustum",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes the given {@link Frustum} using the clipping
     * planes of another {@link Frustum}.
     */
    public @NotNull Frustum initFromFrustum(@NotNull Frustum src) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_frustum_init_from_frustum.invokeExact(handle(), src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Frustum(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_frustum_init_from_matrix = Interop.downcallHandle(
        "graphene_frustum_init_from_matrix",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Frustum} using the given {@code matrix}.
     */
    public @NotNull Frustum initFromMatrix(@NotNull Matrix matrix) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_frustum_init_from_matrix.invokeExact(handle(), matrix.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Frustum(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_frustum_intersects_box = Interop.downcallHandle(
        "graphene_frustum_intersects_box",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the given {@code box} intersects a plane of
     * a {@link Frustum}.
     */
    public boolean intersectsBox(@NotNull Box box) {
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_frustum_intersects_box.invokeExact(handle(), box.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_frustum_intersects_sphere = Interop.downcallHandle(
        "graphene_frustum_intersects_sphere",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the given {@code sphere} intersects a plane of
     * a {@link Frustum}.
     */
    public boolean intersectsSphere(@NotNull Sphere sphere) {
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_frustum_intersects_sphere.invokeExact(handle(), sphere.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
}
