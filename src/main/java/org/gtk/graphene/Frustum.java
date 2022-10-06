package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
    
    static final MethodHandle graphene_frustum_alloc = Interop.downcallHandle(
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
    
    static final MethodHandle graphene_frustum_contains_point = Interop.downcallHandle(
        "graphene_frustum_contains_point",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether a point is inside the volume defined by the given
     * {@link Frustum}.
     */
    public boolean containsPoint(Point3D point) {
        try {
            var RESULT = (boolean) graphene_frustum_contains_point.invokeExact(handle(), point.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_frustum_equal = Interop.downcallHandle(
        "graphene_frustum_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the two given {@link Frustum} are equal.
     */
    public boolean equal(Frustum b) {
        try {
            var RESULT = (boolean) graphene_frustum_equal.invokeExact(handle(), b.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_frustum_free = Interop.downcallHandle(
        "graphene_frustum_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the resources allocated by graphene_frustum_alloc().
     */
    public void free() {
        try {
            graphene_frustum_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_frustum_get_planes = Interop.downcallHandle(
        "graphene_frustum_get_planes",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the planes that define the given {@link Frustum}.
     */
    public void getPlanes(PointerProxy<Plane> planes) {
        try {
            graphene_frustum_get_planes.invokeExact(handle(), planes.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_frustum_init = Interop.downcallHandle(
        "graphene_frustum_init",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes the given {@link Frustum} using the provided
     * clipping planes.
     */
    public Frustum init(Plane p0, Plane p1, Plane p2, Plane p3, Plane p4, Plane p5) {
        try {
            var RESULT = (MemoryAddress) graphene_frustum_init.invokeExact(handle(), p0.handle(), p1.handle(), p2.handle(), p3.handle(), p4.handle(), p5.handle());
            return new Frustum(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_frustum_init_from_frustum = Interop.downcallHandle(
        "graphene_frustum_init_from_frustum",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes the given {@link Frustum} using the clipping
     * planes of another {@link Frustum}.
     */
    public Frustum initFromFrustum(Frustum src) {
        try {
            var RESULT = (MemoryAddress) graphene_frustum_init_from_frustum.invokeExact(handle(), src.handle());
            return new Frustum(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_frustum_init_from_matrix = Interop.downcallHandle(
        "graphene_frustum_init_from_matrix",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Frustum} using the given {@code matrix}.
     */
    public Frustum initFromMatrix(Matrix matrix) {
        try {
            var RESULT = (MemoryAddress) graphene_frustum_init_from_matrix.invokeExact(handle(), matrix.handle());
            return new Frustum(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_frustum_intersects_box = Interop.downcallHandle(
        "graphene_frustum_intersects_box",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the given {@code box} intersects a plane of
     * a {@link Frustum}.
     */
    public boolean intersectsBox(Box box) {
        try {
            var RESULT = (boolean) graphene_frustum_intersects_box.invokeExact(handle(), box.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_frustum_intersects_sphere = Interop.downcallHandle(
        "graphene_frustum_intersects_sphere",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the given {@code sphere} intersects a plane of
     * a {@link Frustum}.
     */
    public boolean intersectsSphere(Sphere sphere) {
        try {
            var RESULT = (boolean) graphene_frustum_intersects_sphere.invokeExact(handle(), sphere.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
