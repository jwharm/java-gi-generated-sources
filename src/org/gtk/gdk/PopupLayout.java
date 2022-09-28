package org.gtk.gdk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
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

    public PopupLayout(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNew(Rectangle anchorRect, Gravity rectAnchor, Gravity surfaceAnchor) {
        Reference RESULT = References.get(gtk_h.gdk_popup_layout_new(anchorRect.handle(), rectAnchor.getValue(), surfaceAnchor.getValue()), true);
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
     */
    public PopupLayout(Rectangle anchorRect, Gravity rectAnchor, Gravity surfaceAnchor) {
        super(constructNew(anchorRect, rectAnchor, surfaceAnchor));
    }
    
    /**
     * Makes a copy of {@code layout}.
     */
    public PopupLayout copy() {
        var RESULT = gtk_h.gdk_popup_layout_copy(handle());
        return new PopupLayout(References.get(RESULT, true));
    }
    
    /**
     * Check whether {@code layout} and {@code other} has identical layout properties.
     */
    public boolean equal(PopupLayout other) {
        var RESULT = gtk_h.gdk_popup_layout_equal(handle(), other.handle());
        return RESULT != 0;
    }
    
    /**
     * Get the {@code GdkAnchorHints}.
     */
    public AnchorHints getAnchorHints() {
        var RESULT = gtk_h.gdk_popup_layout_get_anchor_hints(handle());
        return new AnchorHints(RESULT);
    }
    
    /**
     * Get the anchor rectangle.
     */
    public Rectangle getAnchorRect() {
        var RESULT = gtk_h.gdk_popup_layout_get_anchor_rect(handle());
        return new Rectangle(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the offset for the anchor rectangle.
     */
    public void getOffset(PointerInteger dx, PointerInteger dy) {
        gtk_h.gdk_popup_layout_get_offset(handle(), dx.handle(), dy.handle());
    }
    
    /**
     * Returns the anchor position on the anchor rectangle.
     */
    public Gravity getRectAnchor() {
        var RESULT = gtk_h.gdk_popup_layout_get_rect_anchor(handle());
        return new Gravity(RESULT);
    }
    
    /**
     * Obtains the shadow widths of this layout.
     */
    public void getShadowWidth(PointerInteger left, PointerInteger right, PointerInteger top, PointerInteger bottom) {
        gtk_h.gdk_popup_layout_get_shadow_width(handle(), left.handle(), right.handle(), top.handle(), bottom.handle());
    }
    
    /**
     * Returns the anchor position on the popup surface.
     */
    public Gravity getSurfaceAnchor() {
        var RESULT = gtk_h.gdk_popup_layout_get_surface_anchor(handle());
        return new Gravity(RESULT);
    }
    
    /**
     * Increases the reference count of {@code value}.
     */
    public PopupLayout ref() {
        var RESULT = gtk_h.gdk_popup_layout_ref(handle());
        return new PopupLayout(References.get(RESULT, true));
    }
    
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
        gtk_h.gdk_popup_layout_set_anchor_hints(handle(), anchorHints.getValue());
    }
    
    /**
     * Set the anchor rectangle.
     */
    public void setAnchorRect(Rectangle anchorRect) {
        gtk_h.gdk_popup_layout_set_anchor_rect(handle(), anchorRect.handle());
    }
    
    /**
     * Offset the position of the anchor rectangle with the given delta.
     */
    public void setOffset(int dx, int dy) {
        gtk_h.gdk_popup_layout_set_offset(handle(), dx, dy);
    }
    
    /**
     * Set the anchor on the anchor rectangle.
     */
    public void setRectAnchor(Gravity anchor) {
        gtk_h.gdk_popup_layout_set_rect_anchor(handle(), anchor.getValue());
    }
    
    /**
     * Sets the shadow width of the popup.
     * <p>
     * The shadow width corresponds to the part of the computed
     * surface size that would consist of the shadow margin
     * surrounding the window, would there be any.
     */
    public void setShadowWidth(int left, int right, int top, int bottom) {
        gtk_h.gdk_popup_layout_set_shadow_width(handle(), left, right, top, bottom);
    }
    
    /**
     * Set the anchor on the popup surface.
     */
    public void setSurfaceAnchor(Gravity anchor) {
        gtk_h.gdk_popup_layout_set_surface_anchor(handle(), anchor.getValue());
    }
    
    /**
     * Decreases the reference count of {@code value}.
     */
    public void unref() {
        gtk_h.gdk_popup_layout_unref(handle());
    }
    
}
