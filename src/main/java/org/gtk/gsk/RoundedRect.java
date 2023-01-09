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
public class RoundedRect extends Struct {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskRoundedRect";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.graphene.Rect.getMemoryLayout().withName("bounds"),
            MemoryLayout.sequenceLayout(4, org.gtk.graphene.Size.getMemoryLayout()).withName("corner")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link RoundedRect}
     * @return A new, uninitialized @{link RoundedRect}
     */
    public static RoundedRect allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        RoundedRect newInstance = new RoundedRect(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code bounds}
     * @return The value of the field {@code bounds}
     */
    public org.gtk.graphene.Rect getBounds() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("bounds"));
        return org.gtk.graphene.Rect.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code bounds}
     * @param bounds The new value of the field {@code bounds}
     */
    public void setBounds(org.gtk.graphene.Rect bounds) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bounds"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (bounds == null ? MemoryAddress.NULL : bounds.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code corner}
     * @return The value of the field {@code corner}
     */
    public org.gtk.graphene.Size[] getCorner() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("corner"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerProxy<org.gtk.graphene.Size>(RESULT, org.gtk.graphene.Size.fromAddress).toArray((int) 4, org.gtk.graphene.Size.class);
        }
    }
    
    /**
     * Change the value of the field {@code corner}
     * @param corner The new value of the field {@code corner}
     */
    public void setCorner(org.gtk.graphene.Size[] corner) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("corner"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (corner == null ? MemoryAddress.NULL : Interop.allocateNativeArray(corner, org.gtk.graphene.Size.getMemoryLayout(), false, SCOPE)));
        }
    }
    
    /**
     * Create a RoundedRect proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected RoundedRect(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, RoundedRect> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new RoundedRect(input);
    
    /**
     * Checks if the given {@code point} is inside the rounded rectangle.
     * @param point the point to check
     * @return {@code true} if the {@code point} is inside the rounded rectangle
     */
    public boolean containsPoint(org.gtk.graphene.Point point) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gsk_rounded_rect_contains_point.invokeExact(
                    handle(),
                    point.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if the given {@code rect} is contained inside the rounded rectangle.
     * @param rect the rectangle to check
     * @return {@code true} if the {@code rect} is fully contained inside the rounded rectangle
     */
    public boolean containsRect(org.gtk.graphene.Rect rect) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gsk_rounded_rect_contains_rect.invokeExact(
                    handle(),
                    rect.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
    public org.gtk.gsk.RoundedRect init(org.gtk.graphene.Rect bounds, org.gtk.graphene.Size topLeft, org.gtk.graphene.Size topRight, org.gtk.graphene.Size bottomRight, org.gtk.graphene.Size bottomLeft) {
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
        return org.gtk.gsk.RoundedRect.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Initializes {@code self} using the given {@code src} rectangle.
     * <p>
     * This function will not normalize the {@code GskRoundedRect},
     * so make sure the source is normalized.
     * @param src a {@code GskRoundedRect}
     * @return the initialized rectangle
     */
    public org.gtk.gsk.RoundedRect initCopy(org.gtk.gsk.RoundedRect src) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_rounded_rect_init_copy.invokeExact(
                    handle(),
                    src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gsk.RoundedRect.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Initializes {@code self} to the given {@code bounds} and sets the radius
     * of all four corners to {@code radius}.
     * @param bounds a {@code graphene_rect_t}
     * @param radius the border radius
     * @return the initialized rectangle
     */
    public org.gtk.gsk.RoundedRect initFromRect(org.gtk.graphene.Rect bounds, float radius) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_rounded_rect_init_from_rect.invokeExact(
                    handle(),
                    bounds.handle(),
                    radius);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gsk.RoundedRect.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Checks if part of the given {@code rect} is contained inside the rounded rectangle.
     * @param rect the rectangle to check
     * @return {@code true} if the {@code rect} intersects with the rounded rectangle
     */
    public boolean intersectsRect(org.gtk.graphene.Rect rect) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gsk_rounded_rect_intersects_rect.invokeExact(
                    handle(),
                    rect.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
            RESULT = (int) DowncallHandles.gsk_rounded_rect_is_rectilinear.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Normalizes the passed rectangle.
     * <p>
     * This function will ensure that the bounds of the rectangle
     * are normalized and ensure that the corner values are positive
     * and the corners do not overlap.
     * @return the normalized rectangle
     */
    public org.gtk.gsk.RoundedRect normalize() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_rounded_rect_normalize.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gsk.RoundedRect.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Offsets the bound's origin by {@code dx} and {@code dy}.
     * <p>
     * The size and corners of the rectangle are unchanged.
     * @param dx the horizontal offset
     * @param dy the vertical offset
     * @return the offset rectangle
     */
    public org.gtk.gsk.RoundedRect offset(float dx, float dy) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_rounded_rect_offset.invokeExact(
                    handle(),
                    dx,
                    dy);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gsk.RoundedRect.fromAddress.marshal(RESULT, null);
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
    public org.gtk.gsk.RoundedRect shrink(float top, float right, float bottom, float left) {
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
        return org.gtk.gsk.RoundedRect.fromAddress.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_rounded_rect_contains_point = Interop.downcallHandle(
                "gsk_rounded_rect_contains_point",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_rounded_rect_contains_rect = Interop.downcallHandle(
                "gsk_rounded_rect_contains_rect",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_rounded_rect_init = Interop.downcallHandle(
                "gsk_rounded_rect_init",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_rounded_rect_init_copy = Interop.downcallHandle(
                "gsk_rounded_rect_init_copy",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_rounded_rect_init_from_rect = Interop.downcallHandle(
                "gsk_rounded_rect_init_from_rect",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle gsk_rounded_rect_intersects_rect = Interop.downcallHandle(
                "gsk_rounded_rect_intersects_rect",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_rounded_rect_is_rectilinear = Interop.downcallHandle(
                "gsk_rounded_rect_is_rectilinear",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_rounded_rect_normalize = Interop.downcallHandle(
                "gsk_rounded_rect_normalize",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_rounded_rect_offset = Interop.downcallHandle(
                "gsk_rounded_rect_offset",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle gsk_rounded_rect_shrink = Interop.downcallHandle(
                "gsk_rounded_rect_shrink",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT),
                false
        );
    }
    
    /**
     * A {@link RoundedRect.Builder} object constructs a {@link RoundedRect} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link RoundedRect.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final RoundedRect struct;
        
        private Builder() {
            struct = RoundedRect.allocate();
        }
        
        /**
         * Finish building the {@link RoundedRect} struct.
         * @return A new instance of {@code RoundedRect} with the fields 
         *         that were set in the Builder object.
         */
        public RoundedRect build() {
            return struct;
        }
        
        /**
         * the bounds of the rectangle
         * @param bounds The value for the {@code bounds} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBounds(org.gtk.graphene.Rect bounds) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("bounds"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (bounds == null ? MemoryAddress.NULL : bounds.handle()));
                return this;
            }
        }
        
        /**
         * the size of the 4 rounded corners
         * @param corner The value for the {@code corner} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCorner(org.gtk.graphene.Size[] corner) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("corner"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (corner == null ? MemoryAddress.NULL : Interop.allocateNativeArray(corner, org.gtk.graphene.Size.getMemoryLayout(), false, SCOPE)));
                return this;
            }
        }
    }
}
