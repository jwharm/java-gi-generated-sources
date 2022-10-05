package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
    
    static final MethodHandle gdk_popup_layout_new = Interop.downcallHandle(
        "gdk_popup_layout_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(Rectangle anchorRect, Gravity rectAnchor, Gravity surfaceAnchor) {
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
    public PopupLayout(Rectangle anchorRect, Gravity rectAnchor, Gravity surfaceAnchor) {
        super(constructNew(anchorRect, rectAnchor, surfaceAnchor));
    }
    
    static final MethodHandle gdk_popup_layout_copy = Interop.downcallHandle(
        "gdk_popup_layout_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Makes a copy of {@code layout}.
     */
    public PopupLayout copy() {
        try {
            var RESULT = (MemoryAddress) gdk_popup_layout_copy.invokeExact(handle());
            return new PopupLayout(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_popup_layout_equal = Interop.downcallHandle(
        "gdk_popup_layout_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Check whether {@code layout} and {@code other} has identical layout properties.
     */
    public boolean equal(PopupLayout other) {
        try {
            var RESULT = (int) gdk_popup_layout_equal.invokeExact(handle(), other.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_popup_layout_get_anchor_hints = Interop.downcallHandle(
        "gdk_popup_layout_get_anchor_hints",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the {@code GdkAnchorHints}.
     */
    public AnchorHints getAnchorHints() {
        try {
            var RESULT = (int) gdk_popup_layout_get_anchor_hints.invokeExact(handle());
            return new AnchorHints(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_popup_layout_get_anchor_rect = Interop.downcallHandle(
        "gdk_popup_layout_get_anchor_rect",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the anchor rectangle.
     */
    public Rectangle getAnchorRect() {
        try {
            var RESULT = (MemoryAddress) gdk_popup_layout_get_anchor_rect.invokeExact(handle());
            return new Rectangle(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_popup_layout_get_offset = Interop.downcallHandle(
        "gdk_popup_layout_get_offset",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the offset for the anchor rectangle.
     */
    public void getOffset(PointerInteger dx, PointerInteger dy) {
        try {
            gdk_popup_layout_get_offset.invokeExact(handle(), dx.handle(), dy.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_popup_layout_get_rect_anchor = Interop.downcallHandle(
        "gdk_popup_layout_get_rect_anchor",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the anchor position on the anchor rectangle.
     */
    public Gravity getRectAnchor() {
        try {
            var RESULT = (int) gdk_popup_layout_get_rect_anchor.invokeExact(handle());
            return new Gravity(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_popup_layout_get_shadow_width = Interop.downcallHandle(
        "gdk_popup_layout_get_shadow_width",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Obtains the shadow widths of this layout.
     */
    public void getShadowWidth(PointerInteger left, PointerInteger right, PointerInteger top, PointerInteger bottom) {
        try {
            gdk_popup_layout_get_shadow_width.invokeExact(handle(), left.handle(), right.handle(), top.handle(), bottom.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_popup_layout_get_surface_anchor = Interop.downcallHandle(
        "gdk_popup_layout_get_surface_anchor",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the anchor position on the popup surface.
     */
    public Gravity getSurfaceAnchor() {
        try {
            var RESULT = (int) gdk_popup_layout_get_surface_anchor.invokeExact(handle());
            return new Gravity(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_popup_layout_ref = Interop.downcallHandle(
        "gdk_popup_layout_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increases the reference count of {@code value}.
     */
    public PopupLayout ref() {
        try {
            var RESULT = (MemoryAddress) gdk_popup_layout_ref.invokeExact(handle());
            return new PopupLayout(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_popup_layout_set_anchor_hints = Interop.downcallHandle(
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
    public void setAnchorHints(AnchorHints anchorHints) {
        try {
            gdk_popup_layout_set_anchor_hints.invokeExact(handle(), anchorHints.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_popup_layout_set_anchor_rect = Interop.downcallHandle(
        "gdk_popup_layout_set_anchor_rect",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Set the anchor rectangle.
     */
    public void setAnchorRect(Rectangle anchorRect) {
        try {
            gdk_popup_layout_set_anchor_rect.invokeExact(handle(), anchorRect.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_popup_layout_set_offset = Interop.downcallHandle(
        "gdk_popup_layout_set_offset",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Offset the position of the anchor rectangle with the given delta.
     */
    public void setOffset(int dx, int dy) {
        try {
            gdk_popup_layout_set_offset.invokeExact(handle(), dx, dy);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_popup_layout_set_rect_anchor = Interop.downcallHandle(
        "gdk_popup_layout_set_rect_anchor",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Set the anchor on the anchor rectangle.
     */
    public void setRectAnchor(Gravity anchor) {
        try {
            gdk_popup_layout_set_rect_anchor.invokeExact(handle(), anchor.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_popup_layout_set_shadow_width = Interop.downcallHandle(
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
    public void setShadowWidth(int left, int right, int top, int bottom) {
        try {
            gdk_popup_layout_set_shadow_width.invokeExact(handle(), left, right, top, bottom);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_popup_layout_set_surface_anchor = Interop.downcallHandle(
        "gdk_popup_layout_set_surface_anchor",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Set the anchor on the popup surface.
     */
    public void setSurfaceAnchor(Gravity anchor) {
        try {
            gdk_popup_layout_set_surface_anchor.invokeExact(handle(), anchor.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_popup_layout_unref = Interop.downcallHandle(
        "gdk_popup_layout_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decreases the reference count of {@code value}.
     */
    public void unref() {
        try {
            gdk_popup_layout_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
