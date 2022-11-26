package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A point with two coordinates.
 * @version 1.0
 */
public class Point extends Struct {
    
    static {
        Graphene.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "graphene_point_t";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_FLOAT.withName("x"),
        Interop.valueLayout.C_FLOAT.withName("y")
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
     * Allocate a new {@link Point}
     * @return A new, uninitialized @{link Point}
     */
    public static Point allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Point newInstance = new Point(segment.address(), Ownership.NONE);
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
     * Create a Point proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Point(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructAlloc() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_point_alloc.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocates a new {@link Point} structure.
     * <p>
     * The coordinates of the returned point are (0, 0).
     * <p>
     * It's possible to chain this function with graphene_point_init()
     * or graphene_point_init_from_point(), e.g.:
     * <pre>{@code <!-- language="C" -->
     *   graphene_point_t *
     *   point_new (float x, float y)
     *   {
     *     return graphene_point_init (graphene_point_alloc (), x, y);
     *   }
     * 
     *   graphene_point_t *
     *   point_copy (const graphene_point_t *p)
     *   {
     *     return graphene_point_init_from_point (graphene_point_alloc (), p);
     *   }
     * }</pre>
     * @return the newly allocated {@link Point}.
     *   Use graphene_point_free() to free the resources allocated by
     *   this function.
     */
    public static Point alloc() {
        return new Point(constructAlloc(), Ownership.FULL);
    }
    
    /**
     * Computes the distance between {@code a} and {@code b}.
     * @param b a {@link Point}
     * @param dX distance component on the X axis
     * @param dY distance component on the Y axis
     * @return the distance between the two points
     */
    public float distance(@NotNull org.gtk.graphene.Point b, Out<Float> dX, Out<Float> dY) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        java.util.Objects.requireNonNull(dX, "Parameter 'dX' must not be null");
        MemorySegment dXPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_FLOAT);
        java.util.Objects.requireNonNull(dY, "Parameter 'dY' must not be null");
        MemorySegment dYPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_FLOAT);
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_point_distance.invokeExact(
                    handle(),
                    b.handle(),
                    (Addressable) dXPOINTER.address(),
                    (Addressable) dYPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        dX.set(dXPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
        dY.set(dYPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
        return RESULT;
    }
    
    /**
     * Checks if the two points {@code a} and {@code b} point to the same
     * coordinates.
     * <p>
     * This function accounts for floating point fluctuations; if
     * you want to control the fuzziness of the match, you can use
     * graphene_point_near() instead.
     * @param b a {@link Point}
     * @return {@code true} if the points have the same coordinates
     */
    public boolean equal(@NotNull org.gtk.graphene.Point b) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_point_equal.invokeExact(
                    handle(),
                    b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Frees the resources allocated by graphene_point_alloc().
     */
    public void free() {
        try {
            DowncallHandles.graphene_point_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Initializes {@code p} to the given {@code x} and {@code y} coordinates.
     * <p>
     * It's safe to call this function multiple times.
     * @param x the X coordinate
     * @param y the Y coordinate
     * @return the initialized point
     */
    public @NotNull org.gtk.graphene.Point init(float x, float y) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_point_init.invokeExact(
                    handle(),
                    x,
                    y);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Point(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes {@code p} with the same coordinates of {@code src}.
     * @param src the {@link Point} to use
     * @return the initialized point
     */
    public @NotNull org.gtk.graphene.Point initFromPoint(@NotNull org.gtk.graphene.Point src) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_point_init_from_point.invokeExact(
                    handle(),
                    src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Point(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes {@code p} with the coordinates inside the given {@link Vec2}.
     * @param src a {@link Vec2}
     * @return the initialized point
     */
    public @NotNull org.gtk.graphene.Point initFromVec2(@NotNull org.gtk.graphene.Vec2 src) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_point_init_from_vec2.invokeExact(
                    handle(),
                    src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Point(RESULT, Ownership.NONE);
    }
    
    /**
     * Linearly interpolates the coordinates of {@code a} and {@code b} using the
     * given {@code factor}.
     * @param b a {@link Point}
     * @param factor the linear interpolation factor
     * @param res return location for the interpolated
     *   point
     */
    public void interpolate(@NotNull org.gtk.graphene.Point b, double factor, @NotNull org.gtk.graphene.Point res) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        try {
            DowncallHandles.graphene_point_interpolate.invokeExact(
                    handle(),
                    b.handle(),
                    factor,
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Checks whether the two points {@code a} and {@code b} are within
     * the threshold of {@code epsilon}.
     * @param b a {@link Point}
     * @param epsilon threshold between the two points
     * @return {@code true} if the distance is within {@code epsilon}
     */
    public boolean near(@NotNull org.gtk.graphene.Point b, float epsilon) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_point_near.invokeExact(
                    handle(),
                    b.handle(),
                    epsilon);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Stores the coordinates of the given {@link Point} into a
     * {@link Vec2}.
     * @param v return location for the vertex
     */
    public void toVec2(@NotNull org.gtk.graphene.Vec2 v) {
        java.util.Objects.requireNonNull(v, "Parameter 'v' must not be null");
        try {
            DowncallHandles.graphene_point_to_vec2.invokeExact(
                    handle(),
                    v.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns a point fixed at (0, 0).
     * @return a fixed point
     */
    public static @NotNull org.gtk.graphene.Point zero() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_point_zero.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Point(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle graphene_point_alloc = Interop.downcallHandle(
            "graphene_point_alloc",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_point_distance = Interop.downcallHandle(
            "graphene_point_distance",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_point_equal = Interop.downcallHandle(
            "graphene_point_equal",
            FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_point_free = Interop.downcallHandle(
            "graphene_point_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_point_init = Interop.downcallHandle(
            "graphene_point_init",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT),
            false
        );
        
        private static final MethodHandle graphene_point_init_from_point = Interop.downcallHandle(
            "graphene_point_init_from_point",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_point_init_from_vec2 = Interop.downcallHandle(
            "graphene_point_init_from_vec2",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_point_interpolate = Interop.downcallHandle(
            "graphene_point_interpolate",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_point_near = Interop.downcallHandle(
            "graphene_point_near",
            FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
            false
        );
        
        private static final MethodHandle graphene_point_to_vec2 = Interop.downcallHandle(
            "graphene_point_to_vec2",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_point_zero = Interop.downcallHandle(
            "graphene_point_zero",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private Point struct;
        
         /**
         * A {@link Point.Build} object constructs a {@link Point} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = Point.allocate();
        }
        
         /**
         * Finish building the {@link Point} struct.
         * @return A new instance of {@code Point} with the fields 
         *         that were set in the Build object.
         */
        public Point construct() {
            return struct;
        }
        
        /**
         * the X coordinate of the point
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
         * the Y coordinate of the point
         * @param y The value for the {@code y} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setY(float y) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("y"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), y);
            return this;
        }
    }
}
