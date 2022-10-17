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
 * {@code Gdk.Popup.get_position_y},
 * {@code Gdk.Popup.get_surface_anchor}
 * after the popup has been presented. This can be used to adjust the rendering.
 * For example, {@link org.gtk.gtk.Popover} changes its arrow position accordingly.
 * But you have to be careful avoid changing the size of the popover, or it
 * has to be presented again.
 */
public class PopupLayout extends io.github.jwharm.javagi.ResourceBase {

    public PopupLayout(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle gdk_popup_layout_new = Interop.downcallHandle(
        "gdk_popup_layout_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(@NotNull Rectangle anchorRect, @NotNull Gravity rectAnchor, @NotNull Gravity surfaceAnchor) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gdk_popup_layout_new.invokeExact(anchorRect.handle(), rectAnchor.getValue(), surfaceAnchor.getValue()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     */
    public PopupLayout(@NotNull Rectangle anchorRect, @NotNull Gravity rectAnchor, @NotNull Gravity surfaceAnchor) {
        super(constructNew(anchorRect, rectAnchor, surfaceAnchor));
    }
    
    private static final MethodHandle gdk_popup_layout_copy = Interop.downcallHandle(
        "gdk_popup_layout_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Makes a copy of {@code layout}.
     */
    public @NotNull PopupLayout copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_popup_layout_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PopupLayout(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gdk_popup_layout_equal = Interop.downcallHandle(
        "gdk_popup_layout_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Check whether {@code layout} and {@code other} has identical layout properties.
     */
    public boolean equal(@NotNull PopupLayout other) {
        int RESULT;
        try {
            RESULT = (int) gdk_popup_layout_equal.invokeExact(handle(), other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gdk_popup_layout_get_anchor_hints = Interop.downcallHandle(
        "gdk_popup_layout_get_anchor_hints",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the {@code GdkAnchorHints}.
     */
    public @NotNull AnchorHints getAnchorHints() {
        int RESULT;
        try {
            RESULT = (int) gdk_popup_layout_get_anchor_hints.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new AnchorHints(RESULT);
    }
    
    private static final MethodHandle gdk_popup_layout_get_anchor_rect = Interop.downcallHandle(
        "gdk_popup_layout_get_anchor_rect",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the anchor rectangle.
     */
    public @NotNull Rectangle getAnchorRect() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_popup_layout_get_anchor_rect.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Rectangle(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gdk_popup_layout_get_offset = Interop.downcallHandle(
        "gdk_popup_layout_get_offset",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the offset for the anchor rectangle.
     */
    public @NotNull void getOffset(@NotNull Out<Integer> dx, @NotNull Out<Integer> dy) {
        MemorySegment dxPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment dyPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            gdk_popup_layout_get_offset.invokeExact(handle(), (Addressable) dxPOINTER.address(), (Addressable) dyPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        dx.set(dxPOINTER.get(ValueLayout.JAVA_INT, 0));
        dy.set(dyPOINTER.get(ValueLayout.JAVA_INT, 0));
    }
    
    private static final MethodHandle gdk_popup_layout_get_rect_anchor = Interop.downcallHandle(
        "gdk_popup_layout_get_rect_anchor",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the anchor position on the anchor rectangle.
     */
    public @NotNull Gravity getRectAnchor() {
        int RESULT;
        try {
            RESULT = (int) gdk_popup_layout_get_rect_anchor.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Gravity(RESULT);
    }
    
    private static final MethodHandle gdk_popup_layout_get_shadow_width = Interop.downcallHandle(
        "gdk_popup_layout_get_shadow_width",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Obtains the shadow widths of this layout.
     */
    public @NotNull void getShadowWidth(@NotNull Out<Integer> left, @NotNull Out<Integer> right, @NotNull Out<Integer> top, @NotNull Out<Integer> bottom) {
        MemorySegment leftPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment rightPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment topPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment bottomPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            gdk_popup_layout_get_shadow_width.invokeExact(handle(), (Addressable) leftPOINTER.address(), (Addressable) rightPOINTER.address(), (Addressable) topPOINTER.address(), (Addressable) bottomPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        left.set(leftPOINTER.get(ValueLayout.JAVA_INT, 0));
        right.set(rightPOINTER.get(ValueLayout.JAVA_INT, 0));
        top.set(topPOINTER.get(ValueLayout.JAVA_INT, 0));
        bottom.set(bottomPOINTER.get(ValueLayout.JAVA_INT, 0));
    }
    
    private static final MethodHandle gdk_popup_layout_get_surface_anchor = Interop.downcallHandle(
        "gdk_popup_layout_get_surface_anchor",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the anchor position on the popup surface.
     */
    public @NotNull Gravity getSurfaceAnchor() {
        int RESULT;
        try {
            RESULT = (int) gdk_popup_layout_get_surface_anchor.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Gravity(RESULT);
    }
    
    private static final MethodHandle gdk_popup_layout_ref = Interop.downcallHandle(
        "gdk_popup_layout_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increases the reference count of {@code value}.
     */
    public @NotNull PopupLayout ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_popup_layout_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PopupLayout(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gdk_popup_layout_set_anchor_hints = Interop.downcallHandle(
        "gdk_popup_layout_set_anchor_hints",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Set new anchor hints.
     * <p>
     * The set {@code anchor_hints} determines how {@code surface} will be moved
     * if the anchor points cause it to move off-screen. For example,
     * {@link AnchorHints#FLIP_X} will replace {@link Gravity#NORTH_WEST} with
     * {@link Gravity#NORTH_EAST} and vice versa if {@code surface} extends
     * beyond the left or right edges of the monitor.
     */
    public @NotNull void setAnchorHints(@NotNull AnchorHints anchorHints) {
        try {
            gdk_popup_layout_set_anchor_hints.invokeExact(handle(), anchorHints.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gdk_popup_layout_set_anchor_rect = Interop.downcallHandle(
        "gdk_popup_layout_set_anchor_rect",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Set the anchor rectangle.
     */
    public @NotNull void setAnchorRect(@NotNull Rectangle anchorRect) {
        try {
            gdk_popup_layout_set_anchor_rect.invokeExact(handle(), anchorRect.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gdk_popup_layout_set_offset = Interop.downcallHandle(
        "gdk_popup_layout_set_offset",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Offset the position of the anchor rectangle with the given delta.
     */
    public @NotNull void setOffset(@NotNull int dx, @NotNull int dy) {
        try {
            gdk_popup_layout_set_offset.invokeExact(handle(), dx, dy);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gdk_popup_layout_set_rect_anchor = Interop.downcallHandle(
        "gdk_popup_layout_set_rect_anchor",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Set the anchor on the anchor rectangle.
     */
    public @NotNull void setRectAnchor(@NotNull Gravity anchor) {
        try {
            gdk_popup_layout_set_rect_anchor.invokeExact(handle(), anchor.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gdk_popup_layout_set_shadow_width = Interop.downcallHandle(
        "gdk_popup_layout_set_shadow_width",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the shadow width of the popup.
     * <p>
     * The shadow width corresponds to the part of the computed
     * surface size that would consist of the shadow margin
     * surrounding the window, would there be any.
     */
    public @NotNull void setShadowWidth(@NotNull int left, @NotNull int right, @NotNull int top, @NotNull int bottom) {
        try {
            gdk_popup_layout_set_shadow_width.invokeExact(handle(), left, right, top, bottom);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gdk_popup_layout_set_surface_anchor = Interop.downcallHandle(
        "gdk_popup_layout_set_surface_anchor",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Set the anchor on the popup surface.
     */
    public @NotNull void setSurfaceAnchor(@NotNull Gravity anchor) {
        try {
            gdk_popup_layout_set_surface_anchor.invokeExact(handle(), anchor.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gdk_popup_layout_unref = Interop.downcallHandle(
        "gdk_popup_layout_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decreases the reference count of {@code value}.
     */
    public @NotNull void unref() {
        try {
            gdk_popup_layout_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
