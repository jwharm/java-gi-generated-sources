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
 */
public class Quad extends io.github.jwharm.javagi.ResourceBase {

    public Quad(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle graphene_quad_alloc = Interop.downcallHandle(
        "graphene_quad_alloc",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructAlloc() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) graphene_quad_alloc.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Allocates a new {@link Quad} instance.
     * <p>
     * The contents of the returned instance are undefined.
     */
    public static Quad alloc() {
        return new Quad(constructAlloc());
    }
    
    private static final MethodHandle graphene_quad_bounds = Interop.downcallHandle(
        "graphene_quad_bounds",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the bounding rectangle of @q and places it into @r.
     */
    public @NotNull void bounds(@NotNull Out<Rect> r) {
        MemorySegment rPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_quad_bounds.invokeExact(handle(), (Addressable) rPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        r.set(new Rect(Refcounted.get(rPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_quad_contains = Interop.downcallHandle(
        "graphene_quad_contains",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if the given {@link Quad} contains the given {@link Point}.
     */
    public boolean contains(@NotNull Point p) {
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_quad_contains.invokeExact(handle(), p.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_quad_free = Interop.downcallHandle(
        "graphene_quad_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the resources allocated by graphene_quad_alloc()
     */
    public @NotNull void free() {
        try {
            graphene_quad_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle graphene_quad_get_point = Interop.downcallHandle(
        "graphene_quad_get_point",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Retrieves the point of a {@link Quad} at the given index.
     */
    public @NotNull Point getPoint(@NotNull int index) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_quad_get_point.invokeExact(handle(), index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Point(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_quad_init = Interop.downcallHandle(
        "graphene_quad_init",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Quad} with the given points.
     */
    public @NotNull Quad init(@NotNull Point p1, @NotNull Point p2, @NotNull Point p3, @NotNull Point p4) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_quad_init.invokeExact(handle(), p1.handle(), p2.handle(), p3.handle(), p4.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Quad(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_quad_init_from_points = Interop.downcallHandle(
        "graphene_quad_init_from_points",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Quad} using an array of points.
     */
    public @NotNull Quad initFromPoints(@NotNull Point[] points) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_quad_init_from_points.invokeExact(handle(), Interop.allocateNativeArray(points));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Quad(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_quad_init_from_rect = Interop.downcallHandle(
        "graphene_quad_init_from_rect",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Quad} using the four corners of the
     * given {@link Rect}.
     */
    public @NotNull Quad initFromRect(@NotNull Rect r) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_quad_init_from_rect.invokeExact(handle(), r.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Quad(Refcounted.get(RESULT, false));
    }
    
}
