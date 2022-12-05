package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GdkPopupLayout} struct contains information that is
 * necessary position a {@code Gdk.Popup} relative to its parent.
 * <p>
 * The positioning requires a negotiation with the windowing system,
 * since it depends on external constraints, such as the position of
 * the parent surface, and the screen dimensions.
 * <p>
 * The basic ingredients are a rectangle on the parent surface,
 * and the anchor on both that rectangle and the popup. The anchors
 * specify a side or corner to place next to each other.
 * <p>
 * <img src="./doc-files/popup-anchors.png" alt="Popup anchors">
 * <p>
 * For cases where placing the anchors next to each other would make
 * the popup extend offscreen, the layout includes some hints for how
 * to resolve this problem. The hints may suggest to flip the anchor
 * position to the other side, or to 'slide' the popup along a side,
 * or to resize it.
 * <p>
 * <img src="./doc-files/popup-flip.png" alt="Flipping popups">
 * <p>
 * <img src="./doc-files/popup-slide.png" alt="Sliding popups">
 * <p>
 * These hints may be combined.
 * <p>
 * Ultimatively, it is up to the windowing system to determine the position
 * and size of the popup. You can learn about the result by calling
 * {@link Popup#getPositionX}, {@link Popup#getPositionY},
 * {@link Popup#getRectAnchor} and {@link Popup#getSurfaceAnchor}
 * after the popup has been presented. This can be used to adjust the rendering.
 * For example, {@link org.gtk.gtk.Popover} changes its arrow position accordingly.
 * But you have to be careful avoid changing the size of the popover, or it
 * has to be presented again.
 */
public class PopupLayout extends Struct {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkPopupLayout";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link PopupLayout}
     * @return A new, uninitialized @{link PopupLayout}
     */
    public static PopupLayout allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PopupLayout newInstance = new PopupLayout(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PopupLayout proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PopupLayout(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew(@NotNull org.gtk.gdk.Rectangle anchorRect, @NotNull org.gtk.gdk.Gravity rectAnchor, @NotNull org.gtk.gdk.Gravity surfaceAnchor) {
        java.util.Objects.requireNonNull(anchorRect, "Parameter 'anchorRect' must not be null");
        java.util.Objects.requireNonNull(rectAnchor, "Parameter 'rectAnchor' must not be null");
        java.util.Objects.requireNonNull(surfaceAnchor, "Parameter 'surfaceAnchor' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_popup_layout_new.invokeExact(
                    anchorRect.handle(),
                    rectAnchor.getValue(),
                    surfaceAnchor.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a popup layout description.
     * <p>
     * Used together with {@link Popup#present} to describe how a popup
     * surface should be placed and behave on-screen.
     * <p>
     * {@code anchor_rect} is relative to the top-left corner of the surface's parent.
     * {@code rect_anchor} and {@code surface_anchor} determine anchor points on {@code anchor_rect}
     * and surface to pin together.
     * <p>
     * The position of {@code anchor_rect}'s anchor point can optionally be offset using
     * {@link PopupLayout#setOffset}, which is equivalent to offsetting the
     * position of surface.
     * @param anchorRect the anchor {@code GdkRectangle} to align {@code surface} with
     * @param rectAnchor the point on {@code anchor_rect} to align with {@code surface}'s anchor point
     * @param surfaceAnchor the point on {@code surface} to align with {@code rect}'s anchor point
     */
    public PopupLayout(@NotNull org.gtk.gdk.Rectangle anchorRect, @NotNull org.gtk.gdk.Gravity rectAnchor, @NotNull org.gtk.gdk.Gravity surfaceAnchor) {
        super(constructNew(anchorRect, rectAnchor, surfaceAnchor), Ownership.FULL);
    }
    
    /**
     * Makes a copy of {@code layout}.
     * @return a copy of {@code layout}.
     */
    public @NotNull org.gtk.gdk.PopupLayout copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_popup_layout_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.PopupLayout(RESULT, Ownership.FULL);
    }
    
    /**
     * Check whether {@code layout} and {@code other} has identical layout properties.
     * @param other another {@code GdkPopupLayout}
     * @return {@code true} if {@code layout} and {@code other} have identical layout properties,
     *   otherwise {@code false}.
     */
    public boolean equal(@NotNull org.gtk.gdk.PopupLayout other) {
        java.util.Objects.requireNonNull(other, "Parameter 'other' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_popup_layout_equal.invokeExact(
                    handle(),
                    other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Get the {@code GdkAnchorHints}.
     * @return the {@code GdkAnchorHints}
     */
    public @NotNull org.gtk.gdk.AnchorHints getAnchorHints() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_popup_layout_get_anchor_hints.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.AnchorHints(RESULT);
    }
    
    /**
     * Get the anchor rectangle.
     * @return The anchor rectangle
     */
    public @NotNull org.gtk.gdk.Rectangle getAnchorRect() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_popup_layout_get_anchor_rect.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Rectangle(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the offset for the anchor rectangle.
     * @param dx return location for the delta X coordinate
     * @param dy return location for the delta Y coordinate
     */
    public void getOffset(Out<Integer> dx, Out<Integer> dy) {
        java.util.Objects.requireNonNull(dx, "Parameter 'dx' must not be null");
        MemorySegment dxPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(dy, "Parameter 'dy' must not be null");
        MemorySegment dyPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gdk_popup_layout_get_offset.invokeExact(
                    handle(),
                    (Addressable) dxPOINTER.address(),
                    (Addressable) dyPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        dx.set(dxPOINTER.get(Interop.valueLayout.C_INT, 0));
        dy.set(dyPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Returns the anchor position on the anchor rectangle.
     * @return the anchor on the anchor rectangle.
     */
    public @NotNull org.gtk.gdk.Gravity getRectAnchor() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_popup_layout_get_rect_anchor.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gdk.Gravity.of(RESULT);
    }
    
    /**
     * Obtains the shadow widths of this layout.
     * @param left return location for the left shadow width
     * @param right return location for the right shadow width
     * @param top return location for the top shadow width
     * @param bottom return location for the bottom shadow width
     */
    public void getShadowWidth(Out<Integer> left, Out<Integer> right, Out<Integer> top, Out<Integer> bottom) {
        java.util.Objects.requireNonNull(left, "Parameter 'left' must not be null");
        MemorySegment leftPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(right, "Parameter 'right' must not be null");
        MemorySegment rightPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(top, "Parameter 'top' must not be null");
        MemorySegment topPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(bottom, "Parameter 'bottom' must not be null");
        MemorySegment bottomPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gdk_popup_layout_get_shadow_width.invokeExact(
                    handle(),
                    (Addressable) leftPOINTER.address(),
                    (Addressable) rightPOINTER.address(),
                    (Addressable) topPOINTER.address(),
                    (Addressable) bottomPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        left.set(leftPOINTER.get(Interop.valueLayout.C_INT, 0));
        right.set(rightPOINTER.get(Interop.valueLayout.C_INT, 0));
        top.set(topPOINTER.get(Interop.valueLayout.C_INT, 0));
        bottom.set(bottomPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Returns the anchor position on the popup surface.
     * @return the anchor on the popup surface.
     */
    public @NotNull org.gtk.gdk.Gravity getSurfaceAnchor() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_popup_layout_get_surface_anchor.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gdk.Gravity.of(RESULT);
    }
    
    /**
     * Increases the reference count of {@code value}.
     * @return the same {@code layout}
     */
    public @NotNull org.gtk.gdk.PopupLayout ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_popup_layout_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.PopupLayout(RESULT, Ownership.FULL);
    }
    
    /**
     * Set new anchor hints.
     * <p>
     * The set {@code anchor_hints} determines how {@code surface} will be moved
     * if the anchor points cause it to move off-screen. For example,
     * {@link AnchorHints#FLIP_X} will replace {@link Gravity#NORTH_WEST} with
     * {@link Gravity#NORTH_EAST} and vice versa if {@code surface} extends
     * beyond the left or right edges of the monitor.
     * @param anchorHints the new {@code GdkAnchorHints}
     */
    public void setAnchorHints(@NotNull org.gtk.gdk.AnchorHints anchorHints) {
        java.util.Objects.requireNonNull(anchorHints, "Parameter 'anchorHints' must not be null");
        try {
            DowncallHandles.gdk_popup_layout_set_anchor_hints.invokeExact(
                    handle(),
                    anchorHints.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the anchor rectangle.
     * @param anchorRect the new anchor rectangle
     */
    public void setAnchorRect(@NotNull org.gtk.gdk.Rectangle anchorRect) {
        java.util.Objects.requireNonNull(anchorRect, "Parameter 'anchorRect' must not be null");
        try {
            DowncallHandles.gdk_popup_layout_set_anchor_rect.invokeExact(
                    handle(),
                    anchorRect.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Offset the position of the anchor rectangle with the given delta.
     * @param dx x delta to offset the anchor rectangle with
     * @param dy y delta to offset the anchor rectangle with
     */
    public void setOffset(int dx, int dy) {
        try {
            DowncallHandles.gdk_popup_layout_set_offset.invokeExact(
                    handle(),
                    dx,
                    dy);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the anchor on the anchor rectangle.
     * @param anchor the new rect anchor
     */
    public void setRectAnchor(@NotNull org.gtk.gdk.Gravity anchor) {
        java.util.Objects.requireNonNull(anchor, "Parameter 'anchor' must not be null");
        try {
            DowncallHandles.gdk_popup_layout_set_rect_anchor.invokeExact(
                    handle(),
                    anchor.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the shadow width of the popup.
     * <p>
     * The shadow width corresponds to the part of the computed
     * surface size that would consist of the shadow margin
     * surrounding the window, would there be any.
     * @param left width of the left part of the shadow
     * @param right width of the right part of the shadow
     * @param top height of the top part of the shadow
     * @param bottom height of the bottom part of the shadow
     */
    public void setShadowWidth(int left, int right, int top, int bottom) {
        try {
            DowncallHandles.gdk_popup_layout_set_shadow_width.invokeExact(
                    handle(),
                    left,
                    right,
                    top,
                    bottom);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the anchor on the popup surface.
     * @param anchor the new popup surface anchor
     */
    public void setSurfaceAnchor(@NotNull org.gtk.gdk.Gravity anchor) {
        java.util.Objects.requireNonNull(anchor, "Parameter 'anchor' must not be null");
        try {
            DowncallHandles.gdk_popup_layout_set_surface_anchor.invokeExact(
                    handle(),
                    anchor.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Decreases the reference count of {@code value}.
     */
    public void unref() {
        try {
            DowncallHandles.gdk_popup_layout_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_popup_layout_new = Interop.downcallHandle(
            "gdk_popup_layout_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gdk_popup_layout_copy = Interop.downcallHandle(
            "gdk_popup_layout_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_popup_layout_equal = Interop.downcallHandle(
            "gdk_popup_layout_equal",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_popup_layout_get_anchor_hints = Interop.downcallHandle(
            "gdk_popup_layout_get_anchor_hints",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_popup_layout_get_anchor_rect = Interop.downcallHandle(
            "gdk_popup_layout_get_anchor_rect",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_popup_layout_get_offset = Interop.downcallHandle(
            "gdk_popup_layout_get_offset",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_popup_layout_get_rect_anchor = Interop.downcallHandle(
            "gdk_popup_layout_get_rect_anchor",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_popup_layout_get_shadow_width = Interop.downcallHandle(
            "gdk_popup_layout_get_shadow_width",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_popup_layout_get_surface_anchor = Interop.downcallHandle(
            "gdk_popup_layout_get_surface_anchor",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_popup_layout_ref = Interop.downcallHandle(
            "gdk_popup_layout_ref",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_popup_layout_set_anchor_hints = Interop.downcallHandle(
            "gdk_popup_layout_set_anchor_hints",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gdk_popup_layout_set_anchor_rect = Interop.downcallHandle(
            "gdk_popup_layout_set_anchor_rect",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_popup_layout_set_offset = Interop.downcallHandle(
            "gdk_popup_layout_set_offset",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gdk_popup_layout_set_rect_anchor = Interop.downcallHandle(
            "gdk_popup_layout_set_rect_anchor",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gdk_popup_layout_set_shadow_width = Interop.downcallHandle(
            "gdk_popup_layout_set_shadow_width",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gdk_popup_layout_set_surface_anchor = Interop.downcallHandle(
            "gdk_popup_layout_set_surface_anchor",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gdk_popup_layout_unref = Interop.downcallHandle(
            "gdk_popup_layout_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
    }
}
