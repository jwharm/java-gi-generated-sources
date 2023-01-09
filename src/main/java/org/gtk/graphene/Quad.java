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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(4, org.gtk.graphene.Point.getMemoryLayout()).withName("points")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Quad}
     * @return A new, uninitialized @{link Quad}
     */
    public static Quad allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Quad newInstance = new Quad(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Quad proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Quad(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Quad> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Quad(input);
    
    private static MemoryAddress constructAlloc() {
        MemoryAddress RESULT;
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
        var RESULT = constructAlloc();
        var OBJECT = org.gtk.graphene.Quad.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Computes the bounding rectangle of {@code q} and places it into {@code r}.
     * @param r return location for a {@link Rect}
     */
    public void bounds(org.gtk.graphene.Rect r) {
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
    public boolean contains(org.gtk.graphene.Point p) {
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
            DowncallHandles.graphene_quad_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the point of a {@link Quad} at the given index.
     * @param index the index of the point to retrieve
     * @return a {@link Point}
     */
    public org.gtk.graphene.Point getPoint(int index) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_quad_get_point.invokeExact(
                    handle(),
                    index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Point.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Initializes a {@link Quad} with the given points.
     * @param p1 the first point of the quadrilateral
     * @param p2 the second point of the quadrilateral
     * @param p3 the third point of the quadrilateral
     * @param p4 the fourth point of the quadrilateral
     * @return the initialized {@link Quad}
     */
    public org.gtk.graphene.Quad init(org.gtk.graphene.Point p1, org.gtk.graphene.Point p2, org.gtk.graphene.Point p3, org.gtk.graphene.Point p4) {
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
        return org.gtk.graphene.Quad.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Initializes a {@link Quad} using an array of points.
     * @param points an array of 4 {@link Point}
     * @return the initialized {@link Quad}
     */
    public org.gtk.graphene.Quad initFromPoints(org.gtk.graphene.Point[] points) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.graphene_quad_init_from_points.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(points, org.gtk.graphene.Point.getMemoryLayout(), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gtk.graphene.Quad.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Initializes a {@link Quad} using the four corners of the
     * given {@link Rect}.
     * @param r a {@link Rect}
     * @return the initialized {@link Quad}
     */
    public org.gtk.graphene.Quad initFromRect(org.gtk.graphene.Rect r) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_quad_init_from_rect.invokeExact(
                    handle(),
                    r.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Quad.fromAddress.marshal(RESULT, null);
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
     * A {@link Quad.Builder} object constructs a {@link Quad} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Quad.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Quad struct;
        
        private Builder() {
            struct = Quad.allocate();
        }
        
        /**
         * Finish building the {@link Quad} struct.
         * @return A new instance of {@code Quad} with the fields 
         *         that were set in the Builder object.
         */
        public Quad build() {
            return struct;
        }
        
        public Builder setPoints(org.gtk.graphene.Point[] points) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("points"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (points == null ? MemoryAddress.NULL : Interop.allocateNativeArray(points, org.gtk.graphene.Point.getMemoryLayout(), false, SCOPE)));
                return this;
            }
        }
    }
}
