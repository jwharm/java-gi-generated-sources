package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkScrolledWindow` is a container that makes its child scrollable.
 * 
 * It does so using either internally added scrollbars or externally
 * associated adjustments, and optionally draws a frame around the child.
 * 
 * Widgets with native scrolling support, i.e. those whose classes implement
 * the [iface@Gtk.Scrollable] interface, are added directly. For other types
 * of widget, the class [class@Gtk.Viewport] acts as an adaptor, giving
 * scrollability to other widgets. [method@Gtk.ScrolledWindow.set_child]
 * intelligently accounts for whether or not the added child is a `GtkScrollable`.
 * If it isn’t, then it wraps the child in a `GtkViewport`. Therefore, you can
 * just add any child widget and not worry about the details.
 * 
 * If [method@Gtk.ScrolledWindow.set_child] has added a `GtkViewport` for you,
 * you can remove both your added child widget from the `GtkViewport`, and the
 * `GtkViewport` from the `GtkScrolledWindow`, like this:
 * 
 * ```c
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
 * ```
 * 
 * Unless [property@Gtk.ScrolledWindow:hscrollbar-policy] and
 * [property@Gtk.ScrolledWindow:vscrollbar-policy] are %GTK_POLICY_NEVER or
 * %GTK_POLICY_EXTERNAL, `GtkScrolledWindow` adds internal `GtkScrollbar` widgets
 * around its child. The scroll position of the child, and if applicable the
 * scrollbars, is controlled by the [property@Gtk.ScrolledWindow:hadjustment]
 * and [property@Gtk.ScrolledWindow:vadjustment] that are associated with the
 * `GtkScrolledWindow`. See the docs on [class@Gtk.Scrollbar] for the details,
 * but note that the “step_increment” and “page_increment” fields are only
 * effective if the policy causes scrollbars to be present.
 * 
 * If a `GtkScrolledWindow` doesn’t behave quite as you would like, or
 * doesn’t have exactly the right layout, it’s very possible to set up
 * your own scrolling with `GtkScrollbar` and for example a `GtkGrid`.
 * 
 * # Touch support
 * 
 * `GtkScrolledWindow` has built-in support for touch devices. When a
 * touchscreen is used, swiping will move the scrolled window, and will
 * expose 'kinetic' behavior. This can be turned off with the
 * [property@Gtk.ScrolledWindow:kinetic-scrolling] property if it is undesired.
 * 
 * `GtkScrolledWindow` also displays visual 'overshoot' indication when
 * the content is pulled beyond the end, and this situation can be
 * captured with the [signal@Gtk.ScrolledWindow::edge-overshot] signal.
 * 
 * If no mouse device is present, the scrollbars will overlaid as
 * narrow, auto-hiding indicators over the content. If traditional
 * scrollbars are desired although no mouse is present, this behaviour
 * can be turned off with the [property@Gtk.ScrolledWindow:overlay-scrolling]
 * property.
 * 
 * # CSS nodes
 * 
 * `GtkScrolledWindow` has a main CSS node with name scrolledwindow.
 * It gets a .frame style class added when [property@Gtk.ScrolledWindow:has-frame]
 * is %TRUE.
 * 
 * It uses subnodes with names overshoot and undershoot to draw the overflow
 * and underflow indications. These nodes get the .left, .right, .top or .bottom
 * style class added depending on where the indication is drawn.
 * 
 * `GtkScrolledWindow` also sets the positional style classes (.left, .right,
 * .top, .bottom) and style classes related to overlay scrolling
 * (.overlay-indicator, .dragging, .hovering) on its scrollbars.
 * 
 * If both scrollbars are visible, the area where they meet is drawn
 * with a subnode named junction.
 * 
 * # Accessibility
 * 
 * `GtkScrolledWindow` uses the %GTK_ACCESSIBLE_ROLE_GROUP role.
 */
public class ScrolledWindow extends Widget implements Accessible, Buildable, ConstraintTarget {

    public ScrolledWindow(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to ScrolledWindow */
    public static ScrolledWindow castFrom(org.gtk.gobject.Object gobject) {
        return new ScrolledWindow(gobject.getProxy());
    }
    
    /**
     * Creates a new scrolled window.
     */
    public ScrolledWindow() {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrolled_window_new(), false));
    }
    
    /**
     * Gets the child widget of @scrolled_window.
     */
    public Widget getChild() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrolled_window_get_child(HANDLE());
        return new Widget(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Returns the horizontal scrollbar’s adjustment.
     * 
     * This is the adjustment used to connect the horizontal scrollbar
     * to the child widget’s horizontal scroll functionality.
     */
    public Adjustment getHadjustment() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrolled_window_get_hadjustment(HANDLE());
        return new Adjustment(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Gets whether the scrolled window draws a frame.
     */
    public boolean getHasFrame() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrolled_window_get_has_frame(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns the horizontal scrollbar of @scrolled_window.
     */
    public Widget getHscrollbar() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrolled_window_get_hscrollbar(HANDLE());
        return new Widget(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Returns the specified kinetic scrolling behavior.
     */
    public boolean getKineticScrolling() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrolled_window_get_kinetic_scrolling(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns the maximum content height set.
     */
    public int getMaxContentHeight() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrolled_window_get_max_content_height(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the maximum content width set.
     */
    public int getMaxContentWidth() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrolled_window_get_max_content_width(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the minimal content height of @scrolled_window.
     */
    public int getMinContentHeight() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrolled_window_get_min_content_height(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the minimum content width of @scrolled_window.
     */
    public int getMinContentWidth() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrolled_window_get_min_content_width(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns whether overlay scrolling is enabled for this scrolled window.
     */
    public boolean getOverlayScrolling() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrolled_window_get_overlay_scrolling(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the placement of the contents with respect to the scrollbars.
     */
    public CornerType getPlacement() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrolled_window_get_placement(HANDLE());
        return CornerType.fromValue(RESULT);
    }
    
    /**
     * Reports whether the natural height of the child will be calculated
     * and propagated through the scrolled window’s requested natural height.
     */
    public boolean getPropagateNaturalHeight() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrolled_window_get_propagate_natural_height(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Reports whether the natural width of the child will be calculated
     * and propagated through the scrolled window’s requested natural width.
     */
    public boolean getPropagateNaturalWidth() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrolled_window_get_propagate_natural_width(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns the vertical scrollbar’s adjustment.
     * 
     * This is the adjustment used to connect the vertical
     * scrollbar to the child widget’s vertical scroll functionality.
     */
    public Adjustment getVadjustment() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrolled_window_get_vadjustment(HANDLE());
        return new Adjustment(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Returns the vertical scrollbar of @scrolled_window.
     */
    public Widget getVscrollbar() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrolled_window_get_vscrollbar(HANDLE());
        return new Widget(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Sets the child widget of @scrolled_window.
     */
    public void setChild(Widget child) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrolled_window_set_child(HANDLE(), child.HANDLE());
    }
    
    /**
     * Sets the `GtkAdjustment` for the horizontal scrollbar.
     */
    public void setHadjustment(Adjustment hadjustment) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrolled_window_set_hadjustment(HANDLE(), hadjustment.HANDLE());
    }
    
    /**
     * Changes the frame drawn around the contents of @scrolled_window.
     */
    public void setHasFrame(boolean hasFrame) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrolled_window_set_has_frame(HANDLE(), hasFrame ? 1 : 0);
    }
    
    /**
     * Turns kinetic scrolling on or off.
     * 
     * Kinetic scrolling only applies to devices with source
     * %GDK_SOURCE_TOUCHSCREEN.
     */
    public void setKineticScrolling(boolean kineticScrolling) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrolled_window_set_kinetic_scrolling(HANDLE(), kineticScrolling ? 1 : 0);
    }
    
    /**
     * Sets the maximum height that @scrolled_window should keep visible.
     * 
     * The @scrolled_window will grow up to this height before it starts
     * scrolling the content.
     * 
     * It is a programming error to set the maximum content height to a value
     * smaller than [property@Gtk.ScrolledWindow:min-content-height].
     */
    public void setMaxContentHeight(int height) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrolled_window_set_max_content_height(HANDLE(), height);
    }
    
    /**
     * Sets the maximum width that @scrolled_window should keep visible.
     * 
     * The @scrolled_window will grow up to this width before it starts
     * scrolling the content.
     * 
     * It is a programming error to set the maximum content width to a
     * value smaller than [property@Gtk.ScrolledWindow:min-content-width].
     */
    public void setMaxContentWidth(int width) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrolled_window_set_max_content_width(HANDLE(), width);
    }
    
    /**
     * Sets the minimum height that @scrolled_window should keep visible.
     * 
     * Note that this can and (usually will) be smaller than the minimum
     * size of the content.
     * 
     * It is a programming error to set the minimum content height to a
     * value greater than [property@Gtk.ScrolledWindow:max-content-height].
     */
    public void setMinContentHeight(int height) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrolled_window_set_min_content_height(HANDLE(), height);
    }
    
    /**
     * Sets the minimum width that @scrolled_window should keep visible.
     * 
     * Note that this can and (usually will) be smaller than the minimum
     * size of the content.
     * 
     * It is a programming error to set the minimum content width to a
     * value greater than [property@Gtk.ScrolledWindow:max-content-width].
     */
    public void setMinContentWidth(int width) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrolled_window_set_min_content_width(HANDLE(), width);
    }
    
    /**
     * Enables or disables overlay scrolling for this scrolled window.
     */
    public void setOverlayScrolling(boolean overlayScrolling) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrolled_window_set_overlay_scrolling(HANDLE(), overlayScrolling ? 1 : 0);
    }
    
    /**
     * Sets the placement of the contents with respect to the scrollbars
     * for the scrolled window.
     * 
     * The default is %GTK_CORNER_TOP_LEFT, meaning the child is
     * in the top left, with the scrollbars underneath and to the right.
     * Other values in [enum@Gtk.CornerType] are %GTK_CORNER_TOP_RIGHT,
     * %GTK_CORNER_BOTTOM_LEFT, and %GTK_CORNER_BOTTOM_RIGHT.
     * 
     * See also [method@Gtk.ScrolledWindow.get_placement] and
     * [method@Gtk.ScrolledWindow.unset_placement].
     */
    public void setPlacement(CornerType windowPlacement) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrolled_window_set_placement(HANDLE(), windowPlacement.getValue());
    }
    
    /**
     * Sets the scrollbar policy for the horizontal and vertical scrollbars.
     * 
     * The policy determines when the scrollbar should appear; it is a value
     * from the [enum@Gtk.PolicyType] enumeration. If %GTK_POLICY_ALWAYS, the
     * scrollbar is always present; if %GTK_POLICY_NEVER, the scrollbar is
     * never present; if %GTK_POLICY_AUTOMATIC, the scrollbar is present only
     * if needed (that is, if the slider part of the bar would be smaller
     * than the trough — the display is larger than the page size).
     */
    public void setPolicy(PolicyType hscrollbarPolicy, PolicyType vscrollbarPolicy) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrolled_window_set_policy(HANDLE(), hscrollbarPolicy.getValue(), vscrollbarPolicy.getValue());
    }
    
    /**
     * Sets whether the natural height of the child should be calculated
     * and propagated through the scrolled window’s requested natural height.
     */
    public void setPropagateNaturalHeight(boolean propagate) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrolled_window_set_propagate_natural_height(HANDLE(), propagate ? 1 : 0);
    }
    
    /**
     * Sets whether the natural width of the child should be calculated
     * and propagated through the scrolled window’s requested natural width.
     */
    public void setPropagateNaturalWidth(boolean propagate) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrolled_window_set_propagate_natural_width(HANDLE(), propagate ? 1 : 0);
    }
    
    /**
     * Sets the `GtkAdjustment` for the vertical scrollbar.
     */
    public void setVadjustment(Adjustment vadjustment) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrolled_window_set_vadjustment(HANDLE(), vadjustment.HANDLE());
    }
    
    /**
     * Unsets the placement of the contents with respect to the scrollbars.
     * 
     * If no window placement is set for a scrolled window,
     * it defaults to %GTK_CORNER_TOP_LEFT.
     */
    public void unsetPlacement() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrolled_window_unset_placement(HANDLE());
    }
    
    @FunctionalInterface
    public interface EdgeOvershotHandler {
        void signalReceived(ScrolledWindow source, PositionType pos);
    }
    
    /**
     * Emitted whenever user initiated scrolling makes the scrolled
     * window firmly surpass the limits defined by the adjustment
     * in that orientation.
     * 
     * A similar behavior without edge resistance is provided by the
     * [signal@Gtk.ScrolledWindow::edge-reached] signal.
     * 
     * Note: The @pos argument is LTR/RTL aware, so callers should be
     * aware too if intending to provide behavior on horizontal edges.
     */
    public void onEdgeOvershot(EdgeOvershotHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalScrolledWindowEdgeOvershot", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("edge-overshot").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface EdgeReachedHandler {
        void signalReceived(ScrolledWindow source, PositionType pos);
    }
    
    /**
     * Emitted whenever user-initiated scrolling makes the scrolled
     * window exactly reach the lower or upper limits defined by the
     * adjustment in that orientation.
     * 
     * A similar behavior with edge resistance is provided by the
     * [signal@Gtk.ScrolledWindow::edge-overshot] signal.
     * 
     * Note: The @pos argument is LTR/RTL aware, so callers should be
     * aware too if intending to provide behavior on horizontal edges.
     */
    public void onEdgeReached(EdgeReachedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalScrolledWindowEdgeReached", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("edge-reached").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface MoveFocusOutHandler {
        void signalReceived(ScrolledWindow source, DirectionType directionType);
    }
    
    /**
     * Emitted when focus is moved away from the scrolled window by a
     * keybinding.
     * 
     * This is a [keybinding signal](class.SignalAction.html).
     * 
     * The default bindings for this signal are
     * `Ctrl + Tab` to move forward and `Ctrl + Shift + Tab` to
     * move backward.
     */
    public void onMoveFocusOut(MoveFocusOutHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalScrolledWindowMoveFocusOut", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("move-focus-out").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ScrollChildHandler {
        boolean signalReceived(ScrolledWindow source, ScrollType scroll, boolean horizontal);
    }
    
    /**
     * Emitted when a keybinding that scrolls is pressed.
     * 
     * This is a [keybinding signal](class.SignalAction.html).
     * 
     * The horizontal or vertical adjustment is updated which triggers a
     * signal that the scrolled window’s child may listen to and scroll itself.
     */
    public void onScrollChild(ScrollChildHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, int.class, boolean.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalScrolledWindowScrollChild", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("scroll-child").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
