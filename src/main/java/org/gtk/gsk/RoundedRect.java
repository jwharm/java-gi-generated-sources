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
public class RoundedRect extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskRoundedRect";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.graphene.Rect.getMemoryLayout().withName("bounds"),
        MemoryLayout.paddingLayout(192),
        MemoryLayout.sequenceLayout(4, ValueLayout.ADDRESS).withName("corner")
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
    
    public static RoundedRect allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RoundedRect newInstance = new RoundedRect(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code bounds}
     * @return The value of the field {@code bounds}
     */
    public org.gtk.graphene.Rect bounds$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("bounds"));
        return new org.gtk.graphene.Rect(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a RoundedRect proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public RoundedRect(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Checks if the given {@code point} is inside the rounded rectangle.
     * @param point the point to check
     * @return {@code true} if the {@code point} is inside the rounded rectangle
     */
    public boolean containsPoint(@NotNull org.gtk.graphene.Point point) {
        java.util.Objects.requireNonNull(point, "Parameter 'point' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gsk_rounded_rect_contains_point.invokeExact(
                    handle(),
                    point.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks if the given {@code rect} is contained inside the rounded rectangle.
     * @param rect the rectangle to check
     * @return {@code true} if the {@code rect} is fully contained inside the rounded rectangle
     */
    public boolean containsRect(@NotNull org.gtk.graphene.Rect rect) {
        java.util.Objects.requireNonNull(rect, "Parameter 'rect' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gsk_rounded_rect_contains_rect.invokeExact(
                    handle(),
                    rect.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Initializes the given {@code GskRoundedRect} with the given values.
     * <p>
     * This function will implicitly normalize the {@code GskRoundedRect}
     * before returning.
     * @param bounds a {@code graphene_rect_t} describing the bounds
     * @param topLeft the rounding radius of the top left corner
     * @param topRight the rounding radius of the top right corner
     * @param bottomRight the rounding radius of the bottom right corner
     * @param bottomLeft the rounding radius of the bottom left corner
     * @return the initialized rectangle
     */
    public @NotNull org.gtk.gsk.RoundedRect init(@NotNull org.gtk.graphene.Rect bounds, @NotNull org.gtk.graphene.Size topLeft, @NotNull org.gtk.graphene.Size topRight, @NotNull org.gtk.graphene.Size bottomRight, @NotNull org.gtk.graphene.Size bottomLeft) {
        java.util.Objects.requireNonNull(bounds, "Parameter 'bounds' must not be null");
        java.util.Objects.requireNonNull(topLeft, "Parameter 'topLeft' must not be null");
        java.util.Objects.requireNonNull(topRight, "Parameter 'topRight' must not be null");
        java.util.Objects.requireNonNull(bottomRight, "Parameter 'bottomRight' must not be null");
        java.util.Objects.requireNonNull(bottomLeft, "Parameter 'bottomLeft' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_rounded_rect_init.invokeExact(
                    handle(),
                    bounds.handle(),
                    topLeft.handle(),
                    topRight.handle(),
                    bottomRight.handle(),
                    bottomLeft.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.RoundedRect(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes {@code self} using the given {@code src} rectangle.
     * <p>
     * This function will not normalize the {@code GskRoundedRect},
     * so make sure the source is normalized.
     * @param src a {@code GskRoundedRect}
     * @return the initialized rectangle
     */
    public @NotNull org.gtk.gsk.RoundedRect initCopy(@NotNull org.gtk.gsk.RoundedRect src) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_rounded_rect_init_copy.invokeExact(
                    handle(),
                    src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.RoundedRect(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes {@code self} to the given {@code bounds} and sets the radius
     * of all four corners to {@code radius}.
     * @param bounds a {@code graphene_rect_t}
     * @param radius the border radius
     * @return the initialized rectangle
     */
    public @NotNull org.gtk.gsk.RoundedRect initFromRect(@NotNull org.gtk.graphene.Rect bounds, float radius) {
        java.util.Objects.requireNonNull(bounds, "Parameter 'bounds' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_rounded_rect_init_from_rect.invokeExact(
                    handle(),
                    bounds.handle(),
                    radius);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.RoundedRect(RESULT, Ownership.NONE);
    }
    
    /**
     * Checks if part of the given {@code rect} is contained inside the rounded rectangle.
     * @param rect the rectangle to check
     * @return {@code true} if the {@code rect} intersects with the rounded rectangle
     */
    public boolean intersectsRect(@NotNull org.gtk.graphene.Rect rect) {
        java.util.Objects.requireNonNull(rect, "Parameter 'rect' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gsk_rounded_rect_intersects_rect.invokeExact(
                    handle(),
                    rect.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks if all corners of {@code self} are right angles and the
     * rectangle covers all of its bounds.
     * <p>
     * This information can be used to decide if {@link ClipNode#ClipNode}
     * or {@link RoundedClipNode#RoundedClipNode} should be called.
     * @return {@code true} if the rectangle is rectilinear
     */
    public boolean isRectilinear() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gsk_rounded_rect_is_rectilinear.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Normalizes the passed rectangle.
     * <p>
     * This function will ensure that the bounds of the rectangle
     * are normalized and ensure that the corner values are positive
     * and the corners do not overlap.
     * @return the normalized rectangle
     */
    public @NotNull org.gtk.gsk.RoundedRect normalize() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_rounded_rect_normalize.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.RoundedRect(RESULT, Ownership.NONE);
    }
    
    /**
     * Offsets the bound's origin by {@code dx} and {@code dy}.
     * <p>
     * The size and corners of the rectangle are unchanged.
     * @param dx the horizontal offset
     * @param dy the vertical offset
     * @return the offset rectangle
     */
    public @NotNull org.gtk.gsk.RoundedRect offset(float dx, float dy) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_rounded_rect_offset.invokeExact(
                    handle(),
                    dx,
                    dy);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.RoundedRect(RESULT, Ownership.NONE);
    }
    
    /**
     * Shrinks (or grows) the given rectangle by moving the 4 sides
     * according to the offsets given.
     * <p>
     * The corner radii will be changed in a way that tries to keep
     * the center of the corner circle intact. This emulates CSS behavior.
     * <p>
     * This function also works for growing rectangles if you pass
     * negative values for the {@code top}, {@code right}, {@code bottom} or {@code left}.
     * @param top How far to move the top side downwards
     * @param right How far to move the right side to the left
     * @param bottom How far to move the bottom side upwards
     * @param left How far to move the left side to the right
     * @return the resized {@code GskRoundedRect}
     */
    public @NotNull org.gtk.gsk.RoundedRect shrink(float top, float right, float bottom, float left) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_rounded_rect_shrink.invokeExact(
                    handle(),
                    top,
                    right,
                    bottom,
                    left);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.RoundedRect(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_rounded_rect_contains_point = Interop.downcallHandle(
            "gsk_rounded_rect_contains_point",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_rounded_rect_contains_rect = Interop.downcallHandle(
            "gsk_rounded_rect_contains_rect",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_rounded_rect_init = Interop.downcallHandle(
            "gsk_rounded_rect_init",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_rounded_rect_init_copy = Interop.downcallHandle(
            "gsk_rounded_rect_init_copy",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_rounded_rect_init_from_rect = Interop.downcallHandle(
            "gsk_rounded_rect_init_from_rect",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT),
            false
        );
        
        private static final MethodHandle gsk_rounded_rect_intersects_rect = Interop.downcallHandle(
            "gsk_rounded_rect_intersects_rect",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_rounded_rect_is_rectilinear = Interop.downcallHandle(
            "gsk_rounded_rect_is_rectilinear",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_rounded_rect_normalize = Interop.downcallHandle(
            "gsk_rounded_rect_normalize",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_rounded_rect_offset = Interop.downcallHandle(
            "gsk_rounded_rect_offset",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT),
            false
        );
        
        private static final MethodHandle gsk_rounded_rect_shrink = Interop.downcallHandle(
            "gsk_rounded_rect_shrink",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT),
            false
        );
    }
}
