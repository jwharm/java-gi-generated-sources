package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A size.
 */
public class Size extends io.github.jwharm.javagi.ResourceBase {

    public Size(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle graphene_size_alloc = Interop.downcallHandle(
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
    
    static final MethodHandle graphene_size_equal = Interop.downcallHandle(
        "graphene_size_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the two give {@link Size} are equal.
     */
    public boolean equal(Size b) {
        try {
            var RESULT = (boolean) graphene_size_equal.invokeExact(handle(), b.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_size_free = Interop.downcallHandle(
        "graphene_size_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the resources allocated by graphene_size_alloc().
     */
    public void free() {
        try {
            graphene_size_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_size_init = Interop.downcallHandle(
        "graphene_size_init",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Initializes a {@link Size} using the given {@code width} and {@code height}.
     */
    public Size init(float width, float height) {
        try {
            var RESULT = (MemoryAddress) graphene_size_init.invokeExact(handle(), width, height);
            return new Size(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_size_init_from_size = Interop.downcallHandle(
        "graphene_size_init_from_size",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Size} using the width and height of
     * the given {@code src}.
     */
    public Size initFromSize(Size src) {
        try {
            var RESULT = (MemoryAddress) graphene_size_init_from_size.invokeExact(handle(), src.handle());
            return new Size(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_size_interpolate = Interop.downcallHandle(
        "graphene_size_interpolate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Linearly interpolates the two given {@link Size} using the given
     * interpolation {@code factor}.
     */
    public void interpolate(Size b, double factor, Size res) {
        try {
            graphene_size_interpolate.invokeExact(handle(), b.handle(), factor, res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_size_scale = Interop.downcallHandle(
        "graphene_size_scale",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Scales the components of a {@link Size} using the given {@code factor}.
     */
    public void scale(float factor, Size res) {
        try {
            graphene_size_scale.invokeExact(handle(), factor, res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_size_zero = Interop.downcallHandle(
        "graphene_size_zero",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * A constant pointer to a zero {@link Size}, useful for
     * equality checks and interpolations.
     */
    public static Size zero() {
        try {
            var RESULT = (MemoryAddress) graphene_size_zero.invokeExact();
            return new Size(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
