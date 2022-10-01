package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 * <p>
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
 * <h1>Touch support</h1>
 * <p>
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
 * <h1>CSS nodes</h1>
 * <p>
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
 * <h1>Accessibility</h1>
 * <p>
 * {@code GtkScrolledWindow} uses the {@link AccessibleRole#GROUP} role.
 */
public class ScrolledWindow extends Widget implements Accessible, Buildable, ConstraintTarget {

    public ScrolledWindow(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ScrolledWindow */
    public static ScrolledWindow castFrom(org.gtk.gobject.Object gobject) {
        return new ScrolledWindow(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_scrolled_window_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new scrolled window.
     */
    public ScrolledWindow() {
        super(constructNew());
    }
    
    /**
     * Gets the child widget of {@code scrolled_window}.
     */
    public Widget getChild() {
        var RESULT = gtk_h.gtk_scrolled_window_get_child(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Returns the horizontal scrollbar’s adjustment.
     * <p>
     * This is the adjustment used to connect the horizontal scrollbar
     * to the child widget’s horizontal scroll functionality.
     */
    public Adjustment getHadjustment() {
        var RESULT = gtk_h.gtk_scrolled_window_get_hadjustment(handle());
        return new Adjustment(References.get(RESULT, false));
    }
    
    /**
     * Gets whether the scrolled window draws a frame.
     */
    public boolean getHasFrame() {
        var RESULT = gtk_h.gtk_scrolled_window_get_has_frame(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns the horizontal scrollbar of {@code scrolled_window}.
     */
    public Widget getHscrollbar() {
        var RESULT = gtk_h.gtk_scrolled_window_get_hscrollbar(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Returns the specified kinetic scrolling behavior.
     */
    public boolean getKineticScrolling() {
        var RESULT = gtk_h.gtk_scrolled_window_get_kinetic_scrolling(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns the maximum content height set.
     */
    public int getMaxContentHeight() {
        var RESULT = gtk_h.gtk_scrolled_window_get_max_content_height(handle());
        return RESULT;
    }
    
    /**
     * Returns the maximum content width set.
     */
    public int getMaxContentWidth() {
        var RESULT = gtk_h.gtk_scrolled_window_get_max_content_width(handle());
        return RESULT;
    }
    
    /**
     * Gets the minimal content height of {@code scrolled_window}.
     */
    public int getMinContentHeight() {
        var RESULT = gtk_h.gtk_scrolled_window_get_min_content_height(handle());
        return RESULT;
    }
    
    /**
     * Gets the minimum content width of {@code scrolled_window}.
     */
    public int getMinContentWidth() {
        var RESULT = gtk_h.gtk_scrolled_window_get_min_content_width(handle());
        return RESULT;
    }
    
    /**
     * Returns whether overlay scrolling is enabled for this scrolled window.
     */
    public boolean getOverlayScrolling() {
        var RESULT = gtk_h.gtk_scrolled_window_get_overlay_scrolling(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the placement of the contents with respect to the scrollbars.
     */
    public CornerType getPlacement() {
        var RESULT = gtk_h.gtk_scrolled_window_get_placement(handle());
        return new CornerType(RESULT);
    }
    
    /**
     * Retrieves the current policy values for the horizontal and vertical
     * scrollbars.
     * <p>
     * See {@link ScrolledWindow#setPolicy}.
     */
    public void getPolicy(PolicyType hscrollbarPolicy, PolicyType vscrollbarPolicy) {
        gtk_h.gtk_scrolled_window_get_policy(handle(), new PointerInteger(hscrollbarPolicy.getValue()).handle(), new PointerInteger(vscrollbarPolicy.getValue()).handle());
    }
    
    /**
     * Reports whether the natural height of the child will be calculated
     * and propagated through the scrolled window’s requested natural height.
     */
    public boolean getPropagateNaturalHeight() {
        var RESULT = gtk_h.gtk_scrolled_window_get_propagate_natural_height(handle());
        return RESULT != 0;
    }
    
    /**
     * Reports whether the natural width of the child will be calculated
     * and propagated through the scrolled window’s requested natural width.
     */
    public boolean getPropagateNaturalWidth() {
        var RESULT = gtk_h.gtk_scrolled_window_get_propagate_natural_width(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns the vertical scrollbar’s adjustment.
     * <p>
     * This is the adjustment used to connect the vertical
     * scrollbar to the child widget’s vertical scroll functionality.
     */
    public Adjustment getVadjustment() {
        var RESULT = gtk_h.gtk_scrolled_window_get_vadjustment(handle());
        return new Adjustment(References.get(RESULT, false));
    }
    
    /**
     * Returns the vertical scrollbar of {@code scrolled_window}.
     */
    public Widget getVscrollbar() {
        var RESULT = gtk_h.gtk_scrolled_window_get_vscrollbar(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Sets the child widget of {@code scrolled_window}.
     */
    public void setChild(Widget child) {
        gtk_h.gtk_scrolled_window_set_child(handle(), child.handle());
    }
    
    /**
     * Sets the {@code GtkAdjustment} for the horizontal scrollbar.
     */
    public void setHadjustment(Adjustment hadjustment) {
        gtk_h.gtk_scrolled_window_set_hadjustment(handle(), hadjustment.handle());
    }
    
    /**
     * Changes the frame drawn around the contents of {@code scrolled_window}.
     */
    public void setHasFrame(boolean hasFrame) {
        gtk_h.gtk_scrolled_window_set_has_frame(handle(), hasFrame ? 1 : 0);
    }
    
    /**
     * Turns kinetic scrolling on or off.
     * <p>
     * Kinetic scrolling only applies to devices with source
     * {@link org.gtk.gdk.InputSource#TOUCHSCREEN}.
     */
    public void setKineticScrolling(boolean kineticScrolling) {
        gtk_h.gtk_scrolled_window_set_kinetic_scrolling(handle(), kineticScrolling ? 1 : 0);
    }
    
    /**
     * Sets the maximum height that {@code scrolled_window} should keep visible.
     * <p>
     * The {@code scrolled_window} will grow up to this height before it starts
     * scrolling the content.
     * <p>
     * It is a programming error to set the maximum content height to a value
     * smaller than {@code Gtk.ScrolledWindow:min-content-height}.
     */
    public void setMaxContentHeight(int height) {
        gtk_h.gtk_scrolled_window_set_max_content_height(handle(), height);
    }
    
    /**
     * Sets the maximum width that {@code scrolled_window} should keep visible.
     * <p>
     * The {@code scrolled_window} will grow up to this width before it starts
     * scrolling the content.
     * <p>
     * It is a programming error to set the maximum content width to a
     * value smaller than {@code Gtk.ScrolledWindow:min-content-width}.
     */
    public void setMaxContentWidth(int width) {
        gtk_h.gtk_scrolled_window_set_max_content_width(handle(), width);
    }
    
    /**
     * Sets the minimum height that {@code scrolled_window} should keep visible.
     * <p>
     * Note that this can and (usually will) be smaller than the minimum
     * size of the content.
     * <p>
     * It is a programming error to set the minimum content height to a
     * value greater than {@code Gtk.ScrolledWindow:max-content-height}.
     */
    public void setMinContentHeight(int height) {
        gtk_h.gtk_scrolled_window_set_min_content_height(handle(), height);
    }
    
    /**
     * Sets the minimum width that {@code scrolled_window} should keep visible.
     * <p>
     * Note that this can and (usually will) be smaller than the minimum
     * size of the content.
     * <p>
     * It is a programming error to set the minimum content width to a
     * value greater than {@code Gtk.ScrolledWindow:max-content-width}.
     */
    public void setMinContentWidth(int width) {
        gtk_h.gtk_scrolled_window_set_min_content_width(handle(), width);
    }
    
    /**
     * Enables or disables overlay scrolling for this scrolled window.
     */
    public void setOverlayScrolling(boolean overlayScrolling) {
        gtk_h.gtk_scrolled_window_set_overlay_scrolling(handle(), overlayScrolling ? 1 : 0);
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
     */
    public void setPlacement(CornerType windowPlacement) {
        gtk_h.gtk_scrolled_window_set_placement(handle(), windowPlacement.getValue());
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
     */
    public void setPolicy(PolicyType hscrollbarPolicy, PolicyType vscrollbarPolicy) {
        gtk_h.gtk_scrolled_window_set_policy(handle(), hscrollbarPolicy.getValue(), vscrollbarPolicy.getValue());
    }
    
    /**
     * Sets whether the natural height of the child should be calculated
     * and propagated through the scrolled window’s requested natural height.
     */
    public void setPropagateNaturalHeight(boolean propagate) {
        gtk_h.gtk_scrolled_window_set_propagate_natural_height(handle(), propagate ? 1 : 0);
    }
    
    /**
     * Sets whether the natural width of the child should be calculated
     * and propagated through the scrolled window’s requested natural width.
     */
    public void setPropagateNaturalWidth(boolean propagate) {
        gtk_h.gtk_scrolled_window_set_propagate_natural_width(handle(), propagate ? 1 : 0);
    }
    
    /**
     * Sets the {@code GtkAdjustment} for the vertical scrollbar.
     */
    public void setVadjustment(Adjustment vadjustment) {
        gtk_h.gtk_scrolled_window_set_vadjustment(handle(), vadjustment.handle());
    }
    
    /**
     * Unsets the placement of the contents with respect to the scrollbars.
     * <p>
     * If no window placement is set for a scrolled window,
     * it defaults to {@link CornerType#TOP_LEFT}.
     */
    public void unsetPlacement() {
        gtk_h.gtk_scrolled_window_unset_placement(handle());
    }
    
    @FunctionalInterface
    public interface EdgeOvershotHandler {
        void signalReceived(ScrolledWindow source, PositionType pos);
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
     */
    public SignalHandle onEdgeOvershot(EdgeOvershotHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("edge-overshot").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ScrolledWindow.Callbacks.class, "signalScrolledWindowEdgeOvershot",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
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
     * <p>
     * A similar behavior with edge resistance is provided by the
     * {@code Gtk.ScrolledWindow::edge-overshot} signal.
     * <p>
     * Note: The {@code pos} argument is LTR/RTL aware, so callers should be
     * aware too if intending to provide behavior on horizontal edges.
     */
    public SignalHandle onEdgeReached(EdgeReachedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("edge-reached").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ScrolledWindow.Callbacks.class, "signalScrolledWindowEdgeReached",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
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
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default bindings for this signal are
     * {@code Ctrl + Tab} to move forward and {@code Ctrl + Shift + Tab} to
     * move backward.
     */
    public SignalHandle onMoveFocusOut(MoveFocusOutHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("move-focus-out").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ScrolledWindow.Callbacks.class, "signalScrolledWindowMoveFocusOut",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ScrollChildHandler {
        boolean signalReceived(ScrolledWindow source, ScrollType scroll, boolean horizontal);
    }
    
    /**
     * Emitted when a keybinding that scrolls is pressed.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The horizontal or vertical adjustment is updated which triggers a
     * signal that the scrolled window’s child may listen to and scroll itself.
     */
    public SignalHandle onScrollChild(ScrollChildHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("scroll-child").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ScrolledWindow.Callbacks.class, "signalScrolledWindowScrollChild",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static class Callbacks {
    
        public static void signalScrolledWindowEdgeOvershot(MemoryAddress source, int pos, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ScrolledWindow.EdgeOvershotHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new ScrolledWindow(References.get(source)), new PositionType(pos));
        }
        
        public static void signalScrolledWindowEdgeReached(MemoryAddress source, int pos, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ScrolledWindow.EdgeReachedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new ScrolledWindow(References.get(source)), new PositionType(pos));
        }
        
        public static void signalScrolledWindowMoveFocusOut(MemoryAddress source, int directionType, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ScrolledWindow.MoveFocusOutHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new ScrolledWindow(References.get(source)), new DirectionType(directionType));
        }
        
        public static boolean signalScrolledWindowScrollChild(MemoryAddress source, int scroll, int horizontal, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ScrolledWindow.ScrollChildHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new ScrolledWindow(References.get(source)), new ScrollType(scroll), horizontal != 0);
        }
        
    }
}
