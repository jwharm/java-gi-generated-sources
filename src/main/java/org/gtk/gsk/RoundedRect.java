package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A rectangular region with rounded corners.
 * <p>
 * Application code should normalize rectangles using
 * {@link RoundedRect#normalize}; this function will ensure that
 * the bounds of the rectangle are normalized and ensure that the corner
 * values are positive and the corners do not overlap.
 * <p>
 * All functions taking a {@code GskRoundedRect} as an argument will internally
 * operate on a normalized copy; all functions returning a {@code GskRoundedRect}
 * will always return a normalized one.
 * <p>
 * The algorithm used for normalizing corner sizes is described in
 * <a href="https://drafts.csswg.org/css-backgrounds-3/#border-radius">the CSS specification</a>.
 */
public class RoundedRect extends io.github.jwharm.javagi.ResourceBase {

    public RoundedRect(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle gsk_rounded_rect_contains_point = Interop.downcallHandle(
        "gsk_rounded_rect_contains_point",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if the given {@code point} is inside the rounded rectangle.
     */
    public boolean containsPoint(@NotNull org.gtk.graphene.Point point) {
        int RESULT;
        try {
            RESULT = (int) gsk_rounded_rect_contains_point.invokeExact(handle(), point.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gsk_rounded_rect_contains_rect = Interop.downcallHandle(
        "gsk_rounded_rect_contains_rect",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if the given {@code rect} is contained inside the rounded rectangle.
     */
    public boolean containsRect(@NotNull org.gtk.graphene.Rect rect) {
        int RESULT;
        try {
            RESULT = (int) gsk_rounded_rect_contains_rect.invokeExact(handle(), rect.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gsk_rounded_rect_init = Interop.downcallHandle(
        "gsk_rounded_rect_init",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes the given {@code GskRoundedRect} with the given values.
     * <p>
     * This function will implicitly normalize the {@code GskRoundedRect}
     * before returning.
     */
    public @NotNull RoundedRect init(@NotNull org.gtk.graphene.Rect bounds, @NotNull org.gtk.graphene.Size topLeft, @NotNull org.gtk.graphene.Size topRight, @NotNull org.gtk.graphene.Size bottomRight, @NotNull org.gtk.graphene.Size bottomLeft) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_rounded_rect_init.invokeExact(handle(), bounds.handle(), topLeft.handle(), topRight.handle(), bottomRight.handle(), bottomLeft.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new RoundedRect(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gsk_rounded_rect_init_copy = Interop.downcallHandle(
        "gsk_rounded_rect_init_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes {@code self} using the given {@code src} rectangle.
     * <p>
     * This function will not normalize the {@code GskRoundedRect},
     * so make sure the source is normalized.
     */
    public @NotNull RoundedRect initCopy(@NotNull RoundedRect src) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_rounded_rect_init_copy.invokeExact(handle(), src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new RoundedRect(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gsk_rounded_rect_init_from_rect = Interop.downcallHandle(
        "gsk_rounded_rect_init_from_rect",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Initializes {@code self} to the given {@code bounds} and sets the radius
     * of all four corners to {@code radius}.
     */
    public @NotNull RoundedRect initFromRect(@NotNull org.gtk.graphene.Rect bounds, @NotNull float radius) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_rounded_rect_init_from_rect.invokeExact(handle(), bounds.handle(), radius);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new RoundedRect(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gsk_rounded_rect_intersects_rect = Interop.downcallHandle(
        "gsk_rounded_rect_intersects_rect",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if part of the given {@code rect} is contained inside the rounded rectangle.
     */
    public boolean intersectsRect(@NotNull org.gtk.graphene.Rect rect) {
        int RESULT;
        try {
            RESULT = (int) gsk_rounded_rect_intersects_rect.invokeExact(handle(), rect.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gsk_rounded_rect_is_rectilinear = Interop.downcallHandle(
        "gsk_rounded_rect_is_rectilinear",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if all corners of {@code self} are right angles and the
     * rectangle covers all of its bounds.
     * <p>
     * This information can be used to decide if {@link ClipNode#ClipNode}
     * or {@link RoundedClipNode#RoundedClipNode} should be called.
     */
    public boolean isRectilinear() {
        int RESULT;
        try {
            RESULT = (int) gsk_rounded_rect_is_rectilinear.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gsk_rounded_rect_normalize = Interop.downcallHandle(
        "gsk_rounded_rect_normalize",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Normalizes the passed rectangle.
     * <p>
     * This function will ensure that the bounds of the rectangle
     * are normalized and ensure that the corner values are positive
     * and the corners do not overlap.
     */
    public @NotNull RoundedRect normalize() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_rounded_rect_normalize.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new RoundedRect(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gsk_rounded_rect_offset = Interop.downcallHandle(
        "gsk_rounded_rect_offset",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Offsets the bound's origin by {@code dx} and {@code dy}.
     * <p>
     * The size and corners of the rectangle are unchanged.
     */
    public @NotNull RoundedRect offset(@NotNull float dx, @NotNull float dy) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_rounded_rect_offset.invokeExact(handle(), dx, dy);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new RoundedRect(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gsk_rounded_rect_shrink = Interop.downcallHandle(
        "gsk_rounded_rect_shrink",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Shrinks (or grows) the given rectangle by moving the 4 sides
     * according to the offsets given.
     * <p>
     * The corner radii will be changed in a way that tries to keep
     * the center of the corner circle intact. This emulates CSS behavior.
     * <p>
     * This function also works for growing rectangles if you pass
     * negative values for the {@code top}, {@code right}, {@code bottom} or {@code left}.
     */
    public @NotNull RoundedRect shrink(@NotNull float top, @NotNull float right, @NotNull float bottom, @NotNull float left) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_rounded_rect_shrink.invokeExact(handle(), top, right, bottom, left);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new RoundedRect(Refcounted.get(RESULT, false));
    }
    
}
