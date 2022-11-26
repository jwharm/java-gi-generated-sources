package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A 4 vertex quadrilateral, as represented by four {@link Point}.
 * <p>
 * The contents of a {@link Quad} are private and should never be
 * accessed directly.
 * @version 1.0
 */
public class Quad extends Struct {
    
    static {
        Graphene.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "graphene_quad_t";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(4, org.gtk.graphene.Point.getMemoryLayout()).withName("points")
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
     * Allocate a new {@link Quad}
     * @return A new, uninitialized @{link Quad}
     */
    public static Quad allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Quad newInstance = new Quad(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Quad proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Quad(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructAlloc() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_quad_alloc.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocates a new {@link Quad} instance.
     * <p>
     * The contents of the returned instance are undefined.
     * @return the newly created {@link Quad} instance
     */
    public static Quad alloc() {
        return new Quad(constructAlloc(), Ownership.FULL);
    }
    
    /**
     * Computes the bounding rectangle of {@code q} and places it into {@code r}.
     * @param r return location for a {@link Rect}
     */
    public void bounds(@NotNull org.gtk.graphene.Rect r) {
        java.util.Objects.requireNonNull(r, "Parameter 'r' must not be null");
        try {
            DowncallHandles.graphene_quad_bounds.invokeExact(
                    handle(),
                    r.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Checks if the given {@link Quad} contains the given {@link Point}.
     * @param p a {@link Point}
     * @return {@code true} if the point is inside the {@link Quad}
     */
    public boolean contains(@NotNull org.gtk.graphene.Point p) {
        java.util.Objects.requireNonNull(p, "Parameter 'p' must not be null");
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_quad_contains.invokeExact(
                    handle(),
                    p.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Frees the resources allocated by graphene_quad_alloc()
     */
    public void free() {
        try {
            DowncallHandles.graphene_quad_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the point of a {@link Quad} at the given index.
     * @param index the index of the point to retrieve
     * @return a {@link Point}
     */
    public @NotNull org.gtk.graphene.Point getPoint(int index) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_quad_get_point.invokeExact(
                    handle(),
                    index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Point(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes a {@link Quad} with the given points.
     * @param p1 the first point of the quadrilateral
     * @param p2 the second point of the quadrilateral
     * @param p3 the third point of the quadrilateral
     * @param p4 the fourth point of the quadrilateral
     * @return the initialized {@link Quad}
     */
    public @NotNull org.gtk.graphene.Quad init(@NotNull org.gtk.graphene.Point p1, @NotNull org.gtk.graphene.Point p2, @NotNull org.gtk.graphene.Point p3, @NotNull org.gtk.graphene.Point p4) {
        java.util.Objects.requireNonNull(p1, "Parameter 'p1' must not be null");
        java.util.Objects.requireNonNull(p2, "Parameter 'p2' must not be null");
        java.util.Objects.requireNonNull(p3, "Parameter 'p3' must not be null");
        java.util.Objects.requireNonNull(p4, "Parameter 'p4' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_quad_init.invokeExact(
                    handle(),
                    p1.handle(),
                    p2.handle(),
                    p3.handle(),
                    p4.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Quad(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes a {@link Quad} using an array of points.
     * @param points an array of 4 {@link Point}
     * @return the initialized {@link Quad}
     */
    public @NotNull org.gtk.graphene.Quad initFromPoints(@NotNull org.gtk.graphene.Point[] points) {
        java.util.Objects.requireNonNull(points, "Parameter 'points' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_quad_init_from_points.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(points, org.gtk.graphene.Point.getMemoryLayout(), false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Quad(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes a {@link Quad} using the four corners of the
     * given {@link Rect}.
     * @param r a {@link Rect}
     * @return the initialized {@link Quad}
     */
    public @NotNull org.gtk.graphene.Quad initFromRect(@NotNull org.gtk.graphene.Rect r) {
        java.util.Objects.requireNonNull(r, "Parameter 'r' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_quad_init_from_rect.invokeExact(
                    handle(),
                    r.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Quad(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle graphene_quad_alloc = Interop.downcallHandle(
            "graphene_quad_alloc",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_quad_bounds = Interop.downcallHandle(
            "graphene_quad_bounds",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_quad_contains = Interop.downcallHandle(
            "graphene_quad_contains",
            FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_quad_free = Interop.downcallHandle(
            "graphene_quad_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_quad_get_point = Interop.downcallHandle(
            "graphene_quad_get_point",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle graphene_quad_init = Interop.downcallHandle(
            "graphene_quad_init",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_quad_init_from_points = Interop.downcallHandle(
            "graphene_quad_init_from_points",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle graphene_quad_init_from_rect = Interop.downcallHandle(
            "graphene_quad_init_from_rect",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private Quad struct;
        
         /**
         * A {@link Quad.Build} object constructs a {@link Quad} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = Quad.allocate();
        }
        
         /**
         * Finish building the {@link Quad} struct.
         * @return A new instance of {@code Quad} with the fields 
         *         that were set in the Build object.
         */
        public Quad construct() {
            return struct;
        }
        
        public Build setPoints(org.gtk.graphene.Point[] points) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("points"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (points == null ? MemoryAddress.NULL : Interop.allocateNativeArray(points, org.gtk.graphene.Point.getMemoryLayout(), false)));
            return this;
        }
    }
}
