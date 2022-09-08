package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `GdkPopupLayout` struct contains information that is
 * necessary position a [iface@Gdk.Popup] relative to its parent.
 * 
 * The positioning requires a negotiation with the windowing system,
 * since it depends on external constraints, such as the position of
 * the parent surface, and the screen dimensions.
 * 
 * The basic ingredients are a rectangle on the parent surface,
 * and the anchor on both that rectangle and the popup. The anchors
 * specify a side or corner to place next to each other.
 * 
 * ![Popup anchors](popup-anchors.png)
 * 
 * For cases where placing the anchors next to each other would make
 * the popup extend offscreen, the layout includes some hints for how
 * to resolve this problem. The hints may suggest to flip the anchor
 * position to the other side, or to 'slide' the popup along a side,
 * or to resize it.
 * 
 * ![Flipping popups](popup-flip.png)
 * 
 * ![Sliding popups](popup-slide.png)
 * 
 * These hints may be combined.
 * 
 * Ultimatively, it is up to the windowing system to determine the position
 * and size of the popup. You can learn about the result by calling
 * [method@Gdk.Popup.get_position_x], [method@Gdk.Popup.get_position_y],
 * [method@Gdk.Popup.get_rect_anchor] and [method@Gdk.Popup.get_surface_anchor]
 * after the popup has been presented. This can be used to adjust the rendering.
 * For example, [class@Gtk.Popover] changes its arrow position accordingly.
 * But you have to be careful avoid changing the size of the popover, or it
 * has to be presented again.
 */
public class PopupLayout extends io.github.jwharm.javagi.interop.ResourceBase {

    public PopupLayout(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Create a popup layout description.
     * 
     * Used together with [method@Gdk.Popup.present] to describe how a popup
     * surface should be placed and behave on-screen.
     * 
     * @anchor_rect is relative to the top-left corner of the surface's parent.
     * @rect_anchor and @surface_anchor determine anchor points on @anchor_rect
     * and surface to pin together.
     * 
     * The position of @anchor_rect's anchor point can optionally be offset using
     * [method@Gdk.PopupLayout.set_offset], which is equivalent to offsetting the
     * position of surface.
     */
    public PopupLayout(Rectangle anchorRect, Gravity rectAnchor, Gravity surfaceAnchor) {
        super(References.get(gtk_h.gdk_popup_layout_new(anchorRect.handle(), rectAnchor.getValue(), surfaceAnchor.getValue()), true));
    }
    
    /**
     * Makes a copy of @layout.
     */
    public PopupLayout copy() {
        var RESULT = gtk_h.gdk_popup_layout_copy(handle());
        return new PopupLayout(References.get(RESULT, true));
    }
    
    /**
     * Check whether @layout and @other has identical layout properties.
     */
    public boolean equal(PopupLayout other) {
        var RESULT = gtk_h.gdk_popup_layout_equal(handle(), other.handle());
        return (RESULT != 0);
    }
    
    /**
     * Get the `GdkAnchorHints`.
     */
    public int getAnchorHints() {
        var RESULT = gtk_h.gdk_popup_layout_get_anchor_hints(handle());
        return RESULT;
    }
    
    /**
     * Get the anchor rectangle.
     */
    public Rectangle getAnchorRect() {
        var RESULT = gtk_h.gdk_popup_layout_get_anchor_rect(handle());
        return new Rectangle(References.get(RESULT, false));
    }
    
    /**
     * Returns the anchor position on the anchor rectangle.
     */
    public Gravity getRectAnchor() {
        var RESULT = gtk_h.gdk_popup_layout_get_rect_anchor(handle());
        return Gravity.fromValue(RESULT);
    }
    
    /**
     * Returns the anchor position on the popup surface.
     */
    public Gravity getSurfaceAnchor() {
        var RESULT = gtk_h.gdk_popup_layout_get_surface_anchor(handle());
        return Gravity.fromValue(RESULT);
    }
    
    /**
     * Increases the reference count of @value.
     */
    public PopupLayout ref() {
        var RESULT = gtk_h.gdk_popup_layout_ref(handle());
        return new PopupLayout(References.get(RESULT, true));
    }
    
    /**
     * Set new anchor hints.
     * 
     * The set @anchor_hints determines how @surface will be moved
     * if the anchor points cause it to move off-screen. For example,
     * %GDK_ANCHOR_FLIP_X will replace %GDK_GRAVITY_NORTH_WEST with
     * %GDK_GRAVITY_NORTH_EAST and vice versa if @surface extends
     * beyond the left or right edges of the monitor.
     */
    public void setAnchorHints(int anchorHints) {
        gtk_h.gdk_popup_layout_set_anchor_hints(handle(), anchorHints);
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
     * 
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
     * Decreases the reference count of @value.
     */
    public void unref() {
        gtk_h.gdk_popup_layout_unref(handle());
    }
    
}
