package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A size.
 */
public class Size extends io.github.jwharm.javagi.ResourceBase {

    public Size(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle graphene_size_alloc = Interop.downcallHandle(
        "graphene_size_alloc",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructAlloc() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) graphene_size_alloc.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Allocates a new {@link Size}.
     * <p>
     * The contents of the returned value are undefined.
     */
    public static Size alloc() {
        return new Size(constructAlloc());
    }
    
    private static final MethodHandle graphene_size_equal = Interop.downcallHandle(
        "graphene_size_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the two give {@link Size} are equal.
     */
    public boolean equal(@NotNull Size b) {
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_size_equal.invokeExact(handle(), b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_size_free = Interop.downcallHandle(
        "graphene_size_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the resources allocated by graphene_size_alloc().
     */
    public @NotNull void free() {
        try {
            graphene_size_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle graphene_size_init = Interop.downcallHandle(
        "graphene_size_init",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Initializes a {@link Size} using the given {@code width} and {@code height}.
     */
    public @NotNull Size init(@NotNull float width, @NotNull float height) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_size_init.invokeExact(handle(), width, height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Size(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_size_init_from_size = Interop.downcallHandle(
        "graphene_size_init_from_size",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Size} using the width and height of
     * the given {@code src}.
     */
    public @NotNull Size initFromSize(@NotNull Size src) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_size_init_from_size.invokeExact(handle(), src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Size(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_size_interpolate = Interop.downcallHandle(
        "graphene_size_interpolate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Linearly interpolates the two given {@link Size} using the given
     * interpolation {@code factor}.
     */
    public @NotNull void interpolate(@NotNull Size b, @NotNull double factor, @NotNull Out<Size> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_size_interpolate.invokeExact(handle(), b.handle(), factor, (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Size(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_size_scale = Interop.downcallHandle(
        "graphene_size_scale",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Scales the components of a {@link Size} using the given {@code factor}.
     */
    public @NotNull void scale(@NotNull float factor, @NotNull Out<Size> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_size_scale.invokeExact(handle(), factor, (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Size(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_size_zero = Interop.downcallHandle(
        "graphene_size_zero",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * A constant pointer to a zero {@link Size}, useful for
     * equality checks and interpolations.
     */
    public static @NotNull Size zero() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_size_zero.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Size(Refcounted.get(RESULT, false));
    }
    
}
