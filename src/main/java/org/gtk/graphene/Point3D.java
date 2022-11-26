package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A point with three components: X, Y, and Z.
 * @version 1.0
 */
public class Point3D extends Struct {
    
    static {
        Graphene.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "graphene_point3d_t";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_FLOAT.withName("x"),
        Interop.valueLayout.C_FLOAT.withName("y"),
        Interop.valueLayout.C_FLOAT.withName("z")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Point3D}
     * @return A new, uninitialized @{link Point3D}
     */
    public static Point3D allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Point3D newInstance = new Point3D(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code x}
     * @return The value of the field {@code x}
     */
    public float x$get() {
        var RESULT = (float) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("x"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code x}
     * @param x The new value of the field {@code x}
     */
    public void x$set(float x) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("x"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), x);
    }
    
    /**
     * Get the value of the field {@code y}
     * @return The value of the field {@code y}
     */
    public float y$get() {
        var RESULT = (float) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("y"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code y}
     * @param y The new value of the field {@code y}
     */
    public void y$set(float y) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("y"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), y);
    }
    
    /**
     * Get the value of the field {@code z}
     * @return The value of the field {@code z}
     */
    public float z$get() {
        var RESULT = (float) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("z"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code z}
     * @param z The new value of the field {@code z}
     */
    public void z$set(float z) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("z"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), z);
    }
    
    /**
     * Create a Point3D proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Point3D(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructAlloc() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_point3d_alloc.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocates a {@link Point3D} structure.
     * @return the newly allocated structure.
     *   Use graphene_point3d_free() to free the resources
     *   allocated by this function.
     */
    public static Point3D alloc() {
        return new Point3D(constructAlloc(), Ownership.FULL);
    }
    
    /**
     * Computes the cross product of the two given {@link Point3D}.
     * @param b a {@link Point3D}
     * @param res return location for the cross
     *   product
     */
    public void cross(@NotNull org.gtk.graphene.Point3D b, @NotNull org.gtk.graphene.Point3D res) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_point3d_cross.invokeExact(
                    handle(),
                    b.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Computes the distance between the two given {@link Point3D}.
     * @param b a {@link Point3D}
     * @param delta return location for the distance
     *   components on the X, Y, and Z axis
     * @return the distance between two points
     */
    public float distance(@NotNull org.gtk.graphene.Point3D b, @NotNull org.gtk.graphene.Vec3 delta) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        java.util.Objects.requireNonNull(delta, "Parameter 'delta' must not be null");
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_point3d_distance.invokeExact(
                    handle(),
                    b.handle(),
                    delta.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Computes the dot product of the two given {@link Point3D}.
     * @param b a {@link Point3D}
     * @return the value of the dot product
     */
    public float dot(@NotNull org.gtk.graphene.Point3D b) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_point3d_dot.invokeExact(
                    handle(),
                    b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks whether two given points are equal.
     * @param b a {@link Point3D}
     * @return {@code true} if the points are equal
     */
    public boolean equal(@NotNull org.gtk.graphene.Point3D b) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_point3d_equal.invokeExact(
                    handle(),
                    b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Frees the resources allocated via graphene_point3d_alloc().
     */
    public void free() {
        try {
            DowncallHandles.graphene_point3d_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Initializes a {@link Point3D} with the given coordinates.
     * @param x the X coordinate of the point
     * @param y the Y coordinate of the point
     * @param z the Z coordinate of the point
     * @return the initialized {@link Point3D}
     */
    public @NotNull org.gtk.graphene.Point3D init(float x, float y, float z) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_point3d_init.invokeExact(
                    handle(),
                    x,
                    y,
                    z);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Point3D(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes a {@link Point3D} using the coordinates of
     * another {@link Point3D}.
     * @param src a {@link Point3D}
     * @return the initialized point
     */
    public @NotNull org.gtk.graphene.Point3D initFromPoint(@NotNull org.gtk.graphene.Point3D src) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_point3d_init_from_point.invokeExact(
                    handle(),
                    src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Point3D(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes a {@link Point3D} using the components
     * of a {@link Vec3}.
     * @param v a {@link Vec3}
     * @return the initialized {@link Point3D}
     */
    public @NotNull org.gtk.graphene.Point3D initFromVec3(@NotNull org.gtk.graphene.Vec3 v) {
        java.util.Objects.requireNonNull(v, "Parameter 'v' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_point3d_init_from_vec3.invokeExact(
                    handle(),
                    v.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Point3D(RESULT, Ownership.NONE);
    }
    
    /**
     * Linearly interpolates each component of {@code a} and {@code b} using the
     * provided {@code factor}, and places the result in {@code res}.
     * @param b a {@link Point3D}
     * @param factor the interpolation factor
     * @param res the return location for the
     *   interpolated {@link Point3D}
     */
    public void interpolate(@NotNull org.gtk.graphene.Point3D b, double factor, @NotNull org.gtk.graphene.Point3D res) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_point3d_interpolate.invokeExact(
                    handle(),
                    b.handle(),
                    factor,
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Computes the length of the vector represented by the
     * coordinates of the given {@link Point3D}.
     * @return the length of the vector represented by the point
     */
    public float length() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_point3d_length.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks whether the two points are near each other, within
     * an {@code epsilon} factor.
     * @param b a {@link Point3D}
     * @param epsilon fuzzyness factor
     * @return {@code true} if the points are near each other
     */
    public boolean near(@NotNull org.gtk.graphene.Point3D b, float epsilon) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_point3d_near.invokeExact(
                    handle(),
                    b.handle(),
                    epsilon);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Computes the normalization of the vector represented by the
     * coordinates of the given {@link Point3D}.
     * @param res return location for the normalized
     *   {@link Point3D}
     */
    public void normalize(@NotNull org.gtk.graphene.Point3D res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_point3d_normalize.invokeExact(
                    handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Normalizes the coordinates of a {@link Point3D} using the
     * given viewport and clipping planes.
     * <p>
     * The coordinates of the resulting {@link Point3D} will be
     * in the [ -1, 1 ] range.
     * @param viewport a {@link Rect} representing a viewport
     * @param zNear the coordinate of the near clipping plane, or 0 for
     *   the default near clipping plane
     * @param zFar the coordinate of the far clipping plane, or 1 for the
     *   default far clipping plane
     * @param res the return location for the
     *   normalized {@link Point3D}
     */
    public void normalizeViewport(@NotNull org.gtk.graphene.Rect viewport, float zNear, float zFar, @NotNull org.gtk.graphene.Point3D res) {
        java.util.Objects.requireNonNull(viewport, "Parameter 'viewport' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_point3d_normalize_viewport.invokeExact(
                    handle(),
                    viewport.handle(),
                    zNear,
                    zFar,
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Scales the coordinates of the given {@link Point3D} by
     * the given {@code factor}.
     * @param factor the scaling factor
     * @param res return location for the scaled point
     */
    public void scale(float factor, @NotNull org.gtk.graphene.Point3D res) {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_point3d_scale.invokeExact(
                    handle(),
                    factor,
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Stores the coordinates of a {@link Point3D} into a
     * {@link Vec3}.
     * @param v return location for a {@link Vec3}
     */
    public void toVec3(@NotNull org.gtk.graphene.Vec3 v) {
        java.util.Objects.requireNonNull(v, "Parameter 'v' must not be null");
        try {
            DowncallHandles.graphene_point3d_to_vec3.invokeExact(
                    handle(),
                    v.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves a constant point with all three coordinates set to 0.
     * @return a zero point
     */
    public static @NotNull org.gtk.graphene.Point3D zero() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_point3d_zero.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Point3D(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle graphene_point3d_alloc = Interop.downcallHandle(
            "graphene_point3d_alloc",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_point3d_cross = Interop.downcallHandle(
            "graphene_point3d_cross",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_point3d_distance = Interop.downcallHandle(
            "graphene_point3d_distance",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_point3d_dot = Interop.downcallHandle(
            "graphene_point3d_dot",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_point3d_equal = Interop.downcallHandle(
            "graphene_point3d_equal",
            FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_point3d_free = Interop.downcallHandle(
            "graphene_point3d_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_point3d_init = Interop.downcallHandle(
            "graphene_point3d_init",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT),
            false
        );
        
        private static final MethodHandle graphene_point3d_init_from_point = Interop.downcallHandle(
            "graphene_point3d_init_from_point",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_point3d_init_from_vec3 = Interop.downcallHandle(
            "graphene_point3d_init_from_vec3",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_point3d_interpolate = Interop.downcallHandle(
            "graphene_point3d_interpolate",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_point3d_length = Interop.downcallHandle(
            "graphene_point3d_length",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_point3d_near = Interop.downcallHandle(
            "graphene_point3d_near",
            FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
            false
        );
        
        private static final MethodHandle graphene_point3d_normalize = Interop.downcallHandle(
            "graphene_point3d_normalize",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_point3d_normalize_viewport = Interop.downcallHandle(
            "graphene_point3d_normalize_viewport",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_point3d_scale = Interop.downcallHandle(
            "graphene_point3d_scale",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_point3d_to_vec3 = Interop.downcallHandle(
            "graphene_point3d_to_vec3",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_point3d_zero = Interop.downcallHandle(
            "graphene_point3d_zero",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private Point3D struct;
        
         /**
         * A {@link Point3D.Build} object constructs a {@link Point3D} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = Point3D.allocate();
        }
        
         /**
         * Finish building the {@link Point3D} struct.
         * @return A new instance of {@code Point3D} with the fields 
         *         that were set in the Build object.
         */
        public Point3D construct() {
            return struct;
        }
        
        /**
         * the X coordinate
         * @param x The value for the {@code x} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setX(float x) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("x"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), x);
            return this;
        }
        
        /**
         * the Y coordinate
         * @param y The value for the {@code y} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setY(float y) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("y"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), y);
            return this;
        }
        
        /**
         * the Z coordinate
         * @param z The value for the {@code z} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setZ(float z) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("z"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), z);
            return this;
        }
    }
}
