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
 * @version 1.2
 */
public class Frustum extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Graphene.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "graphene_frustum_t";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(6, ValueLayout.ADDRESS).withName("planes")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static Frustum allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Frustum newInstance = new Frustum(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public Frustum(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static Refcounted constructAlloc() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.graphene_frustum_alloc.invokeExact(), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocates a new {@link Frustum} structure.
     * <p>
     * The contents of the returned structure are undefined.
     * @return the newly allocated {@link Frustum}
     *   structure. Use graphene_frustum_free() to free the resources
     *   allocated by this function.
     */
    public static Frustum alloc() {
        return new Frustum(constructAlloc());
    }
    
    /**
     * Checks whether a point is inside the volume defined by the given
     * {@link Frustum}.
     * @param point a {@link Point3D}
     * @return {@code true} if the point is inside the frustum
     */
    public boolean containsPoint(@NotNull org.gtk.graphene.Point3D point) {
        java.util.Objects.requireNonNull(point, "Parameter 'point' must not be null");
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_frustum_contains_point.invokeExact(
                    handle(),
                    point.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks whether the two given {@link Frustum} are equal.
     * @param b a {@link Frustum}
     * @return {@code true} if the given frustums are equal
     */
    public boolean equal(@NotNull org.gtk.graphene.Frustum b) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_frustum_equal.invokeExact(
                    handle(),
                    b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Frees the resources allocated by graphene_frustum_alloc().
     */
    public void free() {
        try {
            DowncallHandles.graphene_frustum_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the planes that define the given {@link Frustum}.
     * @param planes return location for an array
     *   of 6 {@link Plane}
     */
    public void getPlanes(Out<org.gtk.graphene.Plane[]> planes) {
        java.util.Objects.requireNonNull(planes, "Parameter 'planes' must not be null");
        MemorySegment planesPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            DowncallHandles.graphene_frustum_get_planes.invokeExact(
                    handle(),
                    (Addressable) planesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        org.gtk.graphene.Plane[] planesARRAY = new org.gtk.graphene.Plane[6];
        for (int I = 0; I < 6; I++) {
            var OBJ = planesPOINTER.get(ValueLayout.ADDRESS, I);
            planesARRAY[I] = new org.gtk.graphene.Plane(Refcounted.get(OBJ, false));
        }
        planes.set(planesARRAY);
    }
    
    /**
     * Initializes the given {@link Frustum} using the provided
     * clipping planes.
     * @param p0 a clipping plane
     * @param p1 a clipping plane
     * @param p2 a clipping plane
     * @param p3 a clipping plane
     * @param p4 a clipping plane
     * @param p5 a clipping plane
     * @return the initialized frustum
     */
    public @NotNull org.gtk.graphene.Frustum init(@NotNull org.gtk.graphene.Plane p0, @NotNull org.gtk.graphene.Plane p1, @NotNull org.gtk.graphene.Plane p2, @NotNull org.gtk.graphene.Plane p3, @NotNull org.gtk.graphene.Plane p4, @NotNull org.gtk.graphene.Plane p5) {
        java.util.Objects.requireNonNull(p0, "Parameter 'p0' must not be null");
        java.util.Objects.requireNonNull(p1, "Parameter 'p1' must not be null");
        java.util.Objects.requireNonNull(p2, "Parameter 'p2' must not be null");
        java.util.Objects.requireNonNull(p3, "Parameter 'p3' must not be null");
        java.util.Objects.requireNonNull(p4, "Parameter 'p4' must not be null");
        java.util.Objects.requireNonNull(p5, "Parameter 'p5' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_frustum_init.invokeExact(
                    handle(),
                    p0.handle(),
                    p1.handle(),
                    p2.handle(),
                    p3.handle(),
                    p4.handle(),
                    p5.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Frustum(Refcounted.get(RESULT, false));
    }
    
    /**
     * Initializes the given {@link Frustum} using the clipping
     * planes of another {@link Frustum}.
     * @param src a {@link Frustum}
     * @return the initialized frustum
     */
    public @NotNull org.gtk.graphene.Frustum initFromFrustum(@NotNull org.gtk.graphene.Frustum src) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_frustum_init_from_frustum.invokeExact(
                    handle(),
                    src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Frustum(Refcounted.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link Frustum} using the given {@code matrix}.
     * @param matrix a {@link Matrix}
     * @return the initialized frustum
     */
    public @NotNull org.gtk.graphene.Frustum initFromMatrix(@NotNull org.gtk.graphene.Matrix matrix) {
        java.util.Objects.requireNonNull(matrix, "Parameter 'matrix' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_frustum_init_from_matrix.invokeExact(
                    handle(),
                    matrix.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Frustum(Refcounted.get(RESULT, false));
    }
    
    /**
     * Checks whether the given {@code box} intersects a plane of
     * a {@link Frustum}.
     * @param box a {@link Box}
     * @return {@code true} if the box intersects the frustum
     */
    public boolean intersectsBox(@NotNull org.gtk.graphene.Box box) {
        java.util.Objects.requireNonNull(box, "Parameter 'box' must not be null");
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_frustum_intersects_box.invokeExact(
                    handle(),
                    box.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks whether the given {@code sphere} intersects a plane of
     * a {@link Frustum}.
     * @param sphere a {@link Sphere}
     * @return {@code true} if the sphere intersects the frustum
     */
    public boolean intersectsSphere(@NotNull org.gtk.graphene.Sphere sphere) {
        java.util.Objects.requireNonNull(sphere, "Parameter 'sphere' must not be null");
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_frustum_intersects_sphere.invokeExact(
                    handle(),
                    sphere.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle graphene_frustum_alloc = Interop.downcallHandle(
            "graphene_frustum_alloc",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_frustum_contains_point = Interop.downcallHandle(
            "graphene_frustum_contains_point",
            FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_frustum_equal = Interop.downcallHandle(
            "graphene_frustum_equal",
            FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_frustum_free = Interop.downcallHandle(
            "graphene_frustum_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_frustum_get_planes = Interop.downcallHandle(
            "graphene_frustum_get_planes",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_frustum_init = Interop.downcallHandle(
            "graphene_frustum_init",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_frustum_init_from_frustum = Interop.downcallHandle(
            "graphene_frustum_init_from_frustum",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_frustum_init_from_matrix = Interop.downcallHandle(
            "graphene_frustum_init_from_matrix",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_frustum_intersects_box = Interop.downcallHandle(
            "graphene_frustum_intersects_box",
            FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle graphene_frustum_intersects_sphere = Interop.downcallHandle(
            "graphene_frustum_intersects_sphere",
            FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
