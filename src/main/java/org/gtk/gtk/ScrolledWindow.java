package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkScrolledWindow} is a container that makes its child scrollable.
 * <p>
 * It does so using either internally added scrollbars or externally
 * associated adjustments, and optionally draws a frame around the child.
 * <p>
 * Widgets with native scrolling support, i.e. those whose classes implement
 * the {@code Gtk.Scrollable} interface, are added directly. For other types
 * of widget, the class {@link Viewport} acts as an adaptor, giving
 * scrollability to other widgets. {@link ScrolledWindow#setChild}
 * intelligently accounts for whether or not the added child is a {@code GtkScrollable}.
 * If it isn’t, then it wraps the child in a {@code GtkViewport}. Therefore, you can
 * just add any child widget and not worry about the details.
 * <p>
 * If {@link ScrolledWindow#setChild} has added a {@code GtkViewport} for you,
 * you can remove both your added child widget from the {@code GtkViewport}, and the
 * {@code GtkViewport} from the {@code GtkScrolledWindow}, like this:
 * <pre>{@code c
 * GtkWidget *scrolled_window = gtk_scrolled_window_new ();
 * GtkWidget *child_widget = gtk_button_new ();
 * 
 * // GtkButton is not a GtkScrollable, so GtkScrolledWindow will automatically
 * // add a GtkViewport.
 * gtk_box_append (GTK_BOX (scrolled_window), child_widget);
 * 
 * // Either of these will result in child_widget being unparented:
 * gtk_box_remove (GTK_BOX (scrolled_window), child_widget);
 * // or
 * gtk_box_remove (GTK_BOX (scrolled_window),
 *                       gtk_bin_get_child (GTK_BIN (scrolled_window)));
 * }</pre>
 * <p>
 * Unless {@code Gtk.ScrolledWindow:hscrollbar-policy} and
 * {@code Gtk.ScrolledWindow:vscrollbar-policy} are {@link PolicyType#NEVER} or
 * {@link PolicyType#EXTERNAL}, {@code GtkScrolledWindow} adds internal {@code GtkScrollbar} widgets
 * around its child. The scroll position of the child, and if applicable the
 * scrollbars, is controlled by the {@code Gtk.ScrolledWindow:hadjustment}
 * and {@code Gtk.ScrolledWindow:vadjustment} that are associated with the
 * {@code GtkScrolledWindow}. See the docs on {@link Scrollbar} for the details,
 * but note that the “step_increment” and “page_increment” fields are only
 * effective if the policy causes scrollbars to be present.
 * <p>
 * If a {@code GtkScrolledWindow} doesn’t behave quite as you would like, or
 * doesn’t have exactly the right layout, it’s very possible to set up
 * your own scrolling with {@code GtkScrollbar} and for example a {@code GtkGrid}.
 * <p>
 * <strong>Touch support</strong><br/>
 * {@code GtkScrolledWindow} has built-in support for touch devices. When a
 * touchscreen is used, swiping will move the scrolled window, and will
 * expose 'kinetic' behavior. This can be turned off with the
 * {@code Gtk.ScrolledWindow:kinetic-scrolling} property if it is undesired.
 * <p>
 * {@code GtkScrolledWindow} also displays visual 'overshoot' indication when
 * the content is pulled beyond the end, and this situation can be
 * captured with the {@code Gtk.ScrolledWindow::edge-overshot} signal.
 * <p>
 * If no mouse device is present, the scrollbars will overlaid as
 * narrow, auto-hiding indicators over the content. If traditional
 * scrollbars are desired although no mouse is present, this behaviour
 * can be turned off with the {@code Gtk.ScrolledWindow:overlay-scrolling}
 * property.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code GtkScrolledWindow} has a main CSS node with name scrolledwindow.
 * It gets a .frame style class added when {@code Gtk.ScrolledWindow:has-frame}
 * is {@code true}.
 * <p>
 * It uses subnodes with names overshoot and undershoot to draw the overflow
 * and underflow indications. These nodes get the .left, .right, .top or .bottom
 * style class added depending on where the indication is drawn.
 * <p>
 * {@code GtkScrolledWindow} also sets the positional style classes (.left, .right,
 * .top, .bottom) and style classes related to overlay scrolling
 * (.overlay-indicator, .dragging, .hovering) on its scrollbars.
 * <p>
 * If both scrollbars are visible, the area where they meet is drawn
 * with a subnode named junction.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code GtkScrolledWindow} uses the {@link AccessibleRole#GROUP} role.
 */
public class ScrolledWindow extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkScrolledWindow";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ScrolledWindow proxy instance for the provided memory address.
     * <p>
     * Because ScrolledWindow is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ScrolledWindow(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ScrolledWindow> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ScrolledWindow(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_scrolled_window_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new scrolled window.
     */
    public ScrolledWindow() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Gets the child widget of {@code scrolled_window}.
     * @return the child widget of {@code scrolled_window}
     */
    public @Nullable org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_scrolled_window_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Widget.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the horizontal scrollbar’s adjustment.
     * <p>
     * This is the adjustment used to connect the horizontal scrollbar
     * to the child widget’s horizontal scroll functionality.
     * @return the horizontal {@code GtkAdjustment}
     */
    public org.gtk.gtk.Adjustment getHadjustment() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_scrolled_window_get_hadjustment.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Adjustment) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Adjustment.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets whether the scrolled window draws a frame.
     * @return {@code true} if the {@code scrolled_window} has a frame
     */
    public boolean getHasFrame() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_scrolled_window_get_has_frame.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the horizontal scrollbar of {@code scrolled_window}.
     * @return the horizontal scrollbar of the scrolled window.
     */
    public org.gtk.gtk.Widget getHscrollbar() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_scrolled_window_get_hscrollbar.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Widget.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the specified kinetic scrolling behavior.
     * @return the scrolling behavior flags.
     */
    public boolean getKineticScrolling() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_scrolled_window_get_kinetic_scrolling.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the maximum content height set.
     * @return the maximum content height, or -1
     */
    public int getMaxContentHeight() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_scrolled_window_get_max_content_height.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the maximum content width set.
     * @return the maximum content width, or -1
     */
    public int getMaxContentWidth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_scrolled_window_get_max_content_width.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the minimal content height of {@code scrolled_window}.
     * @return the minimal content height
     */
    public int getMinContentHeight() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_scrolled_window_get_min_content_height.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the minimum content width of {@code scrolled_window}.
     * @return the minimum content width
     */
    public int getMinContentWidth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_scrolled_window_get_min_content_width.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns whether overlay scrolling is enabled for this scrolled window.
     * @return {@code true} if overlay scrolling is enabled
     */
    public boolean getOverlayScrolling() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_scrolled_window_get_overlay_scrolling.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the placement of the contents with respect to the scrollbars.
     * @return the current placement value.
     */
    public org.gtk.gtk.CornerType getPlacement() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_scrolled_window_get_placement.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.CornerType.of(RESULT);
    }
    
    /**
     * Retrieves the current policy values for the horizontal and vertical
     * scrollbars.
     * <p>
     * See {@link ScrolledWindow#setPolicy}.
     * @param hscrollbarPolicy location to store the policy
     *   for the horizontal scrollbar
     * @param vscrollbarPolicy location to store the policy
     *   for the vertical scrollbar
     */
    public void getPolicy(@Nullable Out<org.gtk.gtk.PolicyType> hscrollbarPolicy, @Nullable Out<org.gtk.gtk.PolicyType> vscrollbarPolicy) {
        MemorySegment hscrollbarPolicyPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment vscrollbarPolicyPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gtk_scrolled_window_get_policy.invokeExact(
                    handle(),
                    (Addressable) (hscrollbarPolicy == null ? MemoryAddress.NULL : (Addressable) hscrollbarPolicyPOINTER.address()),
                    (Addressable) (vscrollbarPolicy == null ? MemoryAddress.NULL : (Addressable) vscrollbarPolicyPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (hscrollbarPolicy != null) hscrollbarPolicy.set(org.gtk.gtk.PolicyType.of(hscrollbarPolicyPOINTER.get(Interop.valueLayout.C_INT, 0)));
        if (vscrollbarPolicy != null) vscrollbarPolicy.set(org.gtk.gtk.PolicyType.of(vscrollbarPolicyPOINTER.get(Interop.valueLayout.C_INT, 0)));
    }
    
    /**
     * Reports whether the natural height of the child will be calculated
     * and propagated through the scrolled window’s requested natural height.
     * @return whether natural height propagation is enabled.
     */
    public boolean getPropagateNaturalHeight() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_scrolled_window_get_propagate_natural_height.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Reports whether the natural width of the child will be calculated
     * and propagated through the scrolled window’s requested natural width.
     * @return whether natural width propagation is enabled.
     */
    public boolean getPropagateNaturalWidth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_scrolled_window_get_propagate_natural_width.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the vertical scrollbar’s adjustment.
     * <p>
     * This is the adjustment used to connect the vertical
     * scrollbar to the child widget’s vertical scroll functionality.
     * @return the vertical {@code GtkAdjustment}
     */
    public org.gtk.gtk.Adjustment getVadjustment() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_scrolled_window_get_vadjustment.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Adjustment) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Adjustment.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the vertical scrollbar of {@code scrolled_window}.
     * @return the vertical scrollbar of the scrolled window.
     */
    public org.gtk.gtk.Widget getVscrollbar() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_scrolled_window_get_vscrollbar.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Widget.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Sets the child widget of {@code scrolled_window}.
     * @param child the child widget
     */
    public void setChild(@Nullable org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.gtk_scrolled_window_set_child.invokeExact(
                    handle(),
                    (Addressable) (child == null ? MemoryAddress.NULL : child.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code GtkAdjustment} for the horizontal scrollbar.
     * @param hadjustment the {@code GtkAdjustment} to use, or {@code null} to create a new one
     */
    public void setHadjustment(@Nullable org.gtk.gtk.Adjustment hadjustment) {
        try {
            DowncallHandles.gtk_scrolled_window_set_hadjustment.invokeExact(
                    handle(),
                    (Addressable) (hadjustment == null ? MemoryAddress.NULL : hadjustment.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Changes the frame drawn around the contents of {@code scrolled_window}.
     * @param hasFrame whether to draw a frame around scrolled window contents
     */
    public void setHasFrame(boolean hasFrame) {
        try {
            DowncallHandles.gtk_scrolled_window_set_has_frame.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(hasFrame, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Turns kinetic scrolling on or off.
     * <p>
     * Kinetic scrolling only applies to devices with source
     * {@link org.gtk.gdk.InputSource#TOUCHSCREEN}.
     * @param kineticScrolling {@code true} to enable kinetic scrolling
     */
    public void setKineticScrolling(boolean kineticScrolling) {
        try {
            DowncallHandles.gtk_scrolled_window_set_kinetic_scrolling.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(kineticScrolling, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the maximum height that {@code scrolled_window} should keep visible.
     * <p>
     * The {@code scrolled_window} will grow up to this height before it starts
     * scrolling the content.
     * <p>
     * It is a programming error to set the maximum content height to a value
     * smaller than {@code Gtk.ScrolledWindow:min-content-height}.
     * @param height the maximum content height
     */
    public void setMaxContentHeight(int height) {
        try {
            DowncallHandles.gtk_scrolled_window_set_max_content_height.invokeExact(
                    handle(),
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the maximum width that {@code scrolled_window} should keep visible.
     * <p>
     * The {@code scrolled_window} will grow up to this width before it starts
     * scrolling the content.
     * <p>
     * It is a programming error to set the maximum content width to a
     * value smaller than {@code Gtk.ScrolledWindow:min-content-width}.
     * @param width the maximum content width
     */
    public void setMaxContentWidth(int width) {
        try {
            DowncallHandles.gtk_scrolled_window_set_max_content_width.invokeExact(
                    handle(),
                    width);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the minimum height that {@code scrolled_window} should keep visible.
     * <p>
     * Note that this can and (usually will) be smaller than the minimum
     * size of the content.
     * <p>
     * It is a programming error to set the minimum content height to a
     * value greater than {@code Gtk.ScrolledWindow:max-content-height}.
     * @param height the minimal content height
     */
    public void setMinContentHeight(int height) {
        try {
            DowncallHandles.gtk_scrolled_window_set_min_content_height.invokeExact(
                    handle(),
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the minimum width that {@code scrolled_window} should keep visible.
     * <p>
     * Note that this can and (usually will) be smaller than the minimum
     * size of the content.
     * <p>
     * It is a programming error to set the minimum content width to a
     * value greater than {@code Gtk.ScrolledWindow:max-content-width}.
     * @param width the minimal content width
     */
    public void setMinContentWidth(int width) {
        try {
            DowncallHandles.gtk_scrolled_window_set_min_content_width.invokeExact(
                    handle(),
                    width);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Enables or disables overlay scrolling for this scrolled window.
     * @param overlayScrolling whether to enable overlay scrolling
     */
    public void setOverlayScrolling(boolean overlayScrolling) {
        try {
            DowncallHandles.gtk_scrolled_window_set_overlay_scrolling.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(overlayScrolling, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the placement of the contents with respect to the scrollbars
     * for the scrolled window.
     * <p>
     * The default is {@link CornerType#TOP_LEFT}, meaning the child is
     * in the top left, with the scrollbars underneath and to the right.
     * Other values in {@code Gtk.CornerType} are {@link CornerType#TOP_RIGHT},
     * {@link CornerType#BOTTOM_LEFT}, and {@link CornerType#BOTTOM_RIGHT}.
     * <p>
     * See also {@link ScrolledWindow#getPlacement} and
     * {@link ScrolledWindow#unsetPlacement}.
     * @param windowPlacement position of the child window
     */
    public void setPlacement(org.gtk.gtk.CornerType windowPlacement) {
        try {
            DowncallHandles.gtk_scrolled_window_set_placement.invokeExact(
                    handle(),
                    windowPlacement.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the scrollbar policy for the horizontal and vertical scrollbars.
     * <p>
     * The policy determines when the scrollbar should appear; it is a value
     * from the {@code Gtk.PolicyType} enumeration. If {@link PolicyType#ALWAYS}, the
     * scrollbar is always present; if {@link PolicyType#NEVER}, the scrollbar is
     * never present; if {@link PolicyType#AUTOMATIC}, the scrollbar is present only
     * if needed (that is, if the slider part of the bar would be smaller
     * than the trough — the display is larger than the page size).
     * @param hscrollbarPolicy policy for horizontal bar
     * @param vscrollbarPolicy policy for vertical bar
     */
    public void setPolicy(org.gtk.gtk.PolicyType hscrollbarPolicy, org.gtk.gtk.PolicyType vscrollbarPolicy) {
        try {
            DowncallHandles.gtk_scrolled_window_set_policy.invokeExact(
                    handle(),
                    hscrollbarPolicy.getValue(),
                    vscrollbarPolicy.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the natural height of the child should be calculated
     * and propagated through the scrolled window’s requested natural height.
     * @param propagate whether to propagate natural height
     */
    public void setPropagateNaturalHeight(boolean propagate) {
        try {
            DowncallHandles.gtk_scrolled_window_set_propagate_natural_height.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(propagate, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the natural width of the child should be calculated
     * and propagated through the scrolled window’s requested natural width.
     * @param propagate whether to propagate natural width
     */
    public void setPropagateNaturalWidth(boolean propagate) {
        try {
            DowncallHandles.gtk_scrolled_window_set_propagate_natural_width.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(propagate, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code GtkAdjustment} for the vertical scrollbar.
     * @param vadjustment the {@code GtkAdjustment} to use, or {@code null} to create a new one
     */
    public void setVadjustment(@Nullable org.gtk.gtk.Adjustment vadjustment) {
        try {
            DowncallHandles.gtk_scrolled_window_set_vadjustment.invokeExact(
                    handle(),
                    (Addressable) (vadjustment == null ? MemoryAddress.NULL : vadjustment.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unsets the placement of the contents with respect to the scrollbars.
     * <p>
     * If no window placement is set for a scrolled window,
     * it defaults to {@link CornerType#TOP_LEFT}.
     */
    public void unsetPlacement() {
        try {
            DowncallHandles.gtk_scrolled_window_unset_placement.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_scrolled_window_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface EdgeOvershot {
        void run(org.gtk.gtk.PositionType pos);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceScrolledWindow, int pos) {
            run(org.gtk.gtk.PositionType.of(pos));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EdgeOvershot.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted whenever user initiated scrolling makes the scrolled
     * window firmly surpass the limits defined by the adjustment
     * in that orientation.
     * <p>
     * A similar behavior without edge resistance is provided by the
     * {@code Gtk.ScrolledWindow::edge-reached} signal.
     * <p>
     * Note: The {@code pos} argument is LTR/RTL aware, so callers should be
     * aware too if intending to provide behavior on horizontal edges.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<ScrolledWindow.EdgeOvershot> onEdgeOvershot(ScrolledWindow.EdgeOvershot handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("edge-overshot"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface EdgeReached {
        void run(org.gtk.gtk.PositionType pos);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceScrolledWindow, int pos) {
            run(org.gtk.gtk.PositionType.of(pos));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EdgeReached.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted whenever user-initiated scrolling makes the scrolled
     * window exactly reach the lower or upper limits defined by the
     * adjustment in that orientation.
     * <p>
     * A similar behavior with edge resistance is provided by the
     * {@code Gtk.ScrolledWindow::edge-overshot} signal.
     * <p>
     * Note: The {@code pos} argument is LTR/RTL aware, so callers should be
     * aware too if intending to provide behavior on horizontal edges.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<ScrolledWindow.EdgeReached> onEdgeReached(ScrolledWindow.EdgeReached handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("edge-reached"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MoveFocusOut {
        void run(org.gtk.gtk.DirectionType directionType);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceScrolledWindow, int directionType) {
            run(org.gtk.gtk.DirectionType.of(directionType));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MoveFocusOut.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when focus is moved away from the scrolled window by a
     * keybinding.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default bindings for this signal are
     * {@code Ctrl + Tab} to move forward and {@code Ctrl + Shift + Tab} to
     * move backward.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<ScrolledWindow.MoveFocusOut> onMoveFocusOut(ScrolledWindow.MoveFocusOut handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("move-focus-out"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ScrollChild {
        boolean run(org.gtk.gtk.ScrollType scroll, boolean horizontal);

        @ApiStatus.Internal default int upcall(MemoryAddress sourceScrolledWindow, int scroll, int horizontal) {
            var RESULT = run(org.gtk.gtk.ScrollType.of(scroll), Marshal.integerToBoolean.marshal(horizontal, null).booleanValue());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ScrollChild.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when a keybinding that scrolls is pressed.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The horizontal or vertical adjustment is updated which triggers a
     * signal that the scrolled window’s child may listen to and scroll itself.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<ScrolledWindow.ScrollChild> onScrollChild(ScrolledWindow.ScrollChild handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("scroll-child"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link ScrolledWindow.Builder} object constructs a {@link ScrolledWindow} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ScrolledWindow.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link ScrolledWindow} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ScrolledWindow}.
         * @return A new instance of {@code ScrolledWindow} with the properties 
         *         that were set in the Builder object.
         */
        public ScrolledWindow build() {
            return (ScrolledWindow) org.gtk.gobject.GObject.newWithProperties(
                ScrolledWindow.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The child widget.
         * @param child The value for the {@code child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setChild(org.gtk.gtk.Widget child) {
            names.add("child");
            values.add(org.gtk.gobject.Value.create(child));
            return this;
        }
        
        public Builder setHadjustment(org.gtk.gtk.Adjustment hadjustment) {
            names.add("hadjustment");
            values.add(org.gtk.gobject.Value.create(hadjustment));
            return this;
        }
        
        /**
         * Whether to draw a frame around the contents.
         * @param hasFrame The value for the {@code has-frame} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHasFrame(boolean hasFrame) {
            names.add("has-frame");
            values.add(org.gtk.gobject.Value.create(hasFrame));
            return this;
        }
        
        /**
         * When the horizontal scrollbar is displayed.
         * <p>
         * Use {@link ScrolledWindow#setPolicy} to set
         * this property.
         * @param hscrollbarPolicy The value for the {@code hscrollbar-policy} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHscrollbarPolicy(org.gtk.gtk.PolicyType hscrollbarPolicy) {
            names.add("hscrollbar-policy");
            values.add(org.gtk.gobject.Value.create(hscrollbarPolicy));
            return this;
        }
        
        /**
         * Whether kinetic scrolling is enabled or not.
         * <p>
         * Kinetic scrolling only applies to devices with source {@link org.gtk.gdk.InputSource#TOUCHSCREEN}.
         * @param kineticScrolling The value for the {@code kinetic-scrolling} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setKineticScrolling(boolean kineticScrolling) {
            names.add("kinetic-scrolling");
            values.add(org.gtk.gobject.Value.create(kineticScrolling));
            return this;
        }
        
        /**
         * The maximum content height of {@code scrolled_window}.
         * @param maxContentHeight The value for the {@code max-content-height} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMaxContentHeight(int maxContentHeight) {
            names.add("max-content-height");
            values.add(org.gtk.gobject.Value.create(maxContentHeight));
            return this;
        }
        
        /**
         * The maximum content width of {@code scrolled_window}.
         * @param maxContentWidth The value for the {@code max-content-width} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMaxContentWidth(int maxContentWidth) {
            names.add("max-content-width");
            values.add(org.gtk.gobject.Value.create(maxContentWidth));
            return this;
        }
        
        /**
         * The minimum content height of {@code scrolled_window}.
         * @param minContentHeight The value for the {@code min-content-height} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMinContentHeight(int minContentHeight) {
            names.add("min-content-height");
            values.add(org.gtk.gobject.Value.create(minContentHeight));
            return this;
        }
        
        /**
         * The minimum content width of {@code scrolled_window}.
         * @param minContentWidth The value for the {@code min-content-width} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMinContentWidth(int minContentWidth) {
            names.add("min-content-width");
            values.add(org.gtk.gobject.Value.create(minContentWidth));
            return this;
        }
        
        /**
         * Whether overlay scrolling is enabled or not.
         * <p>
         * If it is, the scrollbars are only added as traditional widgets
         * when a mouse is present. Otherwise, they are overlaid on top of
         * the content, as narrow indicators.
         * <p>
         * Note that overlay scrolling can also be globally disabled, with
         * the {@code Gtk.Settings:gtk-overlay-scrolling} setting.
         * @param overlayScrolling The value for the {@code overlay-scrolling} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setOverlayScrolling(boolean overlayScrolling) {
            names.add("overlay-scrolling");
            values.add(org.gtk.gobject.Value.create(overlayScrolling));
            return this;
        }
        
        /**
         * Whether the natural height of the child should be calculated and propagated
         * through the scrolled window’s requested natural height.
         * <p>
         * This is useful in cases where an attempt should be made to allocate exactly
         * enough space for the natural size of the child.
         * @param propagateNaturalHeight The value for the {@code propagate-natural-height} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPropagateNaturalHeight(boolean propagateNaturalHeight) {
            names.add("propagate-natural-height");
            values.add(org.gtk.gobject.Value.create(propagateNaturalHeight));
            return this;
        }
        
        /**
         * Whether the natural width of the child should be calculated and propagated
         * through the scrolled window’s requested natural width.
         * <p>
         * This is useful in cases where an attempt should be made to allocate exactly
         * enough space for the natural size of the child.
         * @param propagateNaturalWidth The value for the {@code propagate-natural-width} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPropagateNaturalWidth(boolean propagateNaturalWidth) {
            names.add("propagate-natural-width");
            values.add(org.gtk.gobject.Value.create(propagateNaturalWidth));
            return this;
        }
        
        public Builder setVadjustment(org.gtk.gtk.Adjustment vadjustment) {
            names.add("vadjustment");
            values.add(org.gtk.gobject.Value.create(vadjustment));
            return this;
        }
        
        /**
         * When the vertical scrollbar is displayed.
         * <p>
         * Use {@link ScrolledWindow#setPolicy} to set
         * this property.
         * @param vscrollbarPolicy The value for the {@code vscrollbar-policy} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setVscrollbarPolicy(org.gtk.gtk.PolicyType vscrollbarPolicy) {
            names.add("vscrollbar-policy");
            values.add(org.gtk.gobject.Value.create(vscrollbarPolicy));
            return this;
        }
        
        /**
         * Where the contents are located with respect to the scrollbars.
         * @param windowPlacement The value for the {@code window-placement} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setWindowPlacement(org.gtk.gtk.CornerType windowPlacement) {
            names.add("window-placement");
            values.add(org.gtk.gobject.Value.create(windowPlacement));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_scrolled_window_new = Interop.downcallHandle(
            "gtk_scrolled_window_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_scrolled_window_get_child = Interop.downcallHandle(
            "gtk_scrolled_window_get_child",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_scrolled_window_get_hadjustment = Interop.downcallHandle(
            "gtk_scrolled_window_get_hadjustment",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_scrolled_window_get_has_frame = Interop.downcallHandle(
            "gtk_scrolled_window_get_has_frame",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_scrolled_window_get_hscrollbar = Interop.downcallHandle(
            "gtk_scrolled_window_get_hscrollbar",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_scrolled_window_get_kinetic_scrolling = Interop.downcallHandle(
            "gtk_scrolled_window_get_kinetic_scrolling",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_scrolled_window_get_max_content_height = Interop.downcallHandle(
            "gtk_scrolled_window_get_max_content_height",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_scrolled_window_get_max_content_width = Interop.downcallHandle(
            "gtk_scrolled_window_get_max_content_width",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_scrolled_window_get_min_content_height = Interop.downcallHandle(
            "gtk_scrolled_window_get_min_content_height",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_scrolled_window_get_min_content_width = Interop.downcallHandle(
            "gtk_scrolled_window_get_min_content_width",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_scrolled_window_get_overlay_scrolling = Interop.downcallHandle(
            "gtk_scrolled_window_get_overlay_scrolling",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_scrolled_window_get_placement = Interop.downcallHandle(
            "gtk_scrolled_window_get_placement",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_scrolled_window_get_policy = Interop.downcallHandle(
            "gtk_scrolled_window_get_policy",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_scrolled_window_get_propagate_natural_height = Interop.downcallHandle(
            "gtk_scrolled_window_get_propagate_natural_height",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_scrolled_window_get_propagate_natural_width = Interop.downcallHandle(
            "gtk_scrolled_window_get_propagate_natural_width",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_scrolled_window_get_vadjustment = Interop.downcallHandle(
            "gtk_scrolled_window_get_vadjustment",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_scrolled_window_get_vscrollbar = Interop.downcallHandle(
            "gtk_scrolled_window_get_vscrollbar",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_scrolled_window_set_child = Interop.downcallHandle(
            "gtk_scrolled_window_set_child",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_scrolled_window_set_hadjustment = Interop.downcallHandle(
            "gtk_scrolled_window_set_hadjustment",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_scrolled_window_set_has_frame = Interop.downcallHandle(
            "gtk_scrolled_window_set_has_frame",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_scrolled_window_set_kinetic_scrolling = Interop.downcallHandle(
            "gtk_scrolled_window_set_kinetic_scrolling",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_scrolled_window_set_max_content_height = Interop.downcallHandle(
            "gtk_scrolled_window_set_max_content_height",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_scrolled_window_set_max_content_width = Interop.downcallHandle(
            "gtk_scrolled_window_set_max_content_width",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_scrolled_window_set_min_content_height = Interop.downcallHandle(
            "gtk_scrolled_window_set_min_content_height",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_scrolled_window_set_min_content_width = Interop.downcallHandle(
            "gtk_scrolled_window_set_min_content_width",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_scrolled_window_set_overlay_scrolling = Interop.downcallHandle(
            "gtk_scrolled_window_set_overlay_scrolling",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_scrolled_window_set_placement = Interop.downcallHandle(
            "gtk_scrolled_window_set_placement",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_scrolled_window_set_policy = Interop.downcallHandle(
            "gtk_scrolled_window_set_policy",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_scrolled_window_set_propagate_natural_height = Interop.downcallHandle(
            "gtk_scrolled_window_set_propagate_natural_height",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_scrolled_window_set_propagate_natural_width = Interop.downcallHandle(
            "gtk_scrolled_window_set_propagate_natural_width",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_scrolled_window_set_vadjustment = Interop.downcallHandle(
            "gtk_scrolled_window_set_vadjustment",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_scrolled_window_unset_placement = Interop.downcallHandle(
            "gtk_scrolled_window_unset_placement",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_scrolled_window_get_type = Interop.downcallHandle(
            "gtk_scrolled_window_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
