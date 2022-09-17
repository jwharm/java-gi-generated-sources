package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkPopover</code> is a bubble-like context popup.
 * <p>
 * !{@link [An example GtkPopover]}(popover.png)
 * <p>
 * It is primarily meant to provide context-dependent information
 * or options. Popovers are attached to a parent widget. By default,
 * they point to the whole widget area, although this behavior can be
 * changed with {@link org.gtk.gtk.Popover#setPointingTo}.
 * <p>
 * The position of a popover relative to the widget it is attached to
 * can also be changed with {@link org.gtk.gtk.Popover#setPosition}
 * <p>
 * By default, <code>GtkPopover</code> performs a grab, in order to ensure input
 * events get redirected to it while it is shown, and also so the popover
 * is dismissed in the expected situations (clicks outside the popover,
 * or the Escape key being pressed). If no such modal behavior is desired
 * on a popover, {@link org.gtk.gtk.Popover#setAutohide} may be called on it to
 * tweak its behavior.
 * <p>
 * <h2>GtkPopover as menu replacement</h2>
 * <p><code>GtkPopover</code> is often used to replace menus. The best was to do this
 * is to use the {@link org.gtk.gtk.PopoverMenu} subclass which supports being
 * populated from a <code>GMenuModel</code> with {@link [ctor@Gtk.PopoverMenu.new_from_model] (ref=ctor)}.
 * <p><pre>xml
 * &#60;section&#62;
 *   &#60;attribute name=&#34;display-hint&#34;&#62;horizontal-buttons&#60;/attribute&#62;
 *   &#60;item&#62;
 *     &#60;attribute name=&#34;label&#34;&#62;Cut&#60;/attribute&#62;
 *     &#60;attribute name=&#34;action&#34;&#62;app.cut&#60;/attribute&#62;
 *     &#60;attribute name=&#34;verb-icon&#34;&#62;edit-cut-symbolic&#60;/attribute&#62;
 *   &#60;/item&#62;
 *   &#60;item&#62;
 *     &#60;attribute name=&#34;label&#34;&#62;Copy&#60;/attribute&#62;
 *     &#60;attribute name=&#34;action&#34;&#62;app.copy&#60;/attribute&#62;
 *     &#60;attribute name=&#34;verb-icon&#34;&#62;edit-copy-symbolic&#60;/attribute&#62;
 *   &#60;/item&#62;
 *   &#60;item&#62;
 *     &#60;attribute name=&#34;label&#34;&#62;Paste&#60;/attribute&#62;
 *     &#60;attribute name=&#34;action&#34;&#62;app.paste&#60;/attribute&#62;
 *     &#60;attribute name=&#34;verb-icon&#34;&#62;edit-paste-symbolic&#60;/attribute&#62;
 *   &#60;/item&#62;
 * &#60;/section&#62;
 * </pre>
 * <p>
 * <h1>SS nodes</h1>
 * <p><pre>
 * popover{@link [.menu]}
 * &#9500;&#9472;&#9472; arrow
 * &#9584;&#9472;&#9472; contents.background
 *     &#9584;&#9472;&#9472; &#60;child&#62;
 * </pre>
 * <p>
 * The contents child node always gets the .background style class
 * and the popover itself gets the .menu style class if the popover
 * is menu-like (i.e. <code>GtkPopoverMenu</code>).
 * <p>
 * Particular uses of <code>GtkPopover</code>, such as touch selection popups or
 * magnifiers in <code>GtkEntry</code> or <code>GtkTextView</code> get style classes like
 * .touch-selection or .magnifier to differentiate from plain popovers.
 * <p>
 * When styling a popover directly, the popover node should usually
 * not have any background. The visible part of the popover can have
 * a shadow. To specify it in CSS, set the box-shadow of the contents node.
 * <p>
 * Note that, in order to accomplish appropriate arrow visuals, <code>GtkPopover</code>
 * uses custom drawing for the arrow node. This makes it possible for the
 * arrow to change its shape dynamically, but it also limits the possibilities
 * of styling it using CSS. In particular, the arrow gets drawn over the
 * content node&#39;s border and shadow, so they look like one shape, which
 * means that the border width of the content node and the arrow node should
 * be the same. The arrow also does not support any border shape other than
 * solid, no border-radius, only one border width (border-bottom-width is
 * used) and no box-shadow.
 */
public class Popover extends Widget implements Accessible, Buildable, ConstraintTarget, Native, ShortcutManager {

    public Popover(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Popover */
    public static Popover castFrom(org.gtk.gobject.Object gobject) {
        return new Popover(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_popover_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkPopover</code>.
     */
    public Popover() {
        super(constructNew());
    }
    
    /**
     * Returns whether the popover is modal.
     * 
     * See {@link org.gtk.gtk.Popover#setAutohide} for the
     * implications of this.
     */
    public boolean getAutohide() {
        var RESULT = gtk_h.gtk_popover_get_autohide(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the popover will close after a modal child is closed.
     */
    public boolean getCascadePopdown() {
        var RESULT = gtk_h.gtk_popover_get_cascade_popdown(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the child widget of @popover.
     */
    public Widget getChild() {
        var RESULT = gtk_h.gtk_popover_get_child(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets whether this popover is showing an arrow
     * pointing at the widget that it is relative to.
     */
    public boolean getHasArrow() {
        var RESULT = gtk_h.gtk_popover_get_has_arrow(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets whether mnemonics are visible.
     */
    public boolean getMnemonicsVisible() {
        var RESULT = gtk_h.gtk_popover_get_mnemonics_visible(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the rectangle that the popover points to.
     * 
     * If a rectangle to point to has been set, this function will
     * return <code>true</code> and fill in @rect with such rectangle, otherwise
     * it will return <code>false</code> and fill in @rect with the parent
     * widget coordinates.
     */
    public boolean getPointingTo(org.gtk.gdk.Rectangle rect) {
        var RESULT = gtk_h.gtk_popover_get_pointing_to(handle(), rect.handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the preferred position of @popover.
     */
    public PositionType getPosition() {
        var RESULT = gtk_h.gtk_popover_get_position(handle());
        return PositionType.fromValue(RESULT);
    }
    
    /**
     * Pops @popover down.
     * 
     * This may have the side-effect of closing a parent popover
     * as well. See {@link [property@Gtk.Popover:cascade-popdown] (ref=property)}.
     */
    public void popdown() {
        gtk_h.gtk_popover_popdown(handle());
    }
    
    /**
     * Pops @popover up.
     */
    public void popup() {
        gtk_h.gtk_popover_popup(handle());
    }
    
    /**
     * Presents the popover to the user.
     */
    public void present() {
        gtk_h.gtk_popover_present(handle());
    }
    
    /**
     * Sets whether @popover is modal.
     * 
     * A modal popover will grab the keyboard focus on it when being
     * displayed. Focus will wrap around within the popover. Clicking
     * outside the popover area or pressing Esc will dismiss the popover.
     * 
     * Called this function on an already showing popup with a new
     * autohide value different from the current one, will cause the
     * popup to be hidden.
     */
    public void setAutohide(boolean autohide) {
        gtk_h.gtk_popover_set_autohide(handle(), autohide ? 1 : 0);
    }
    
    /**
     * If @cascade_popdown is <code>TRUE,</code> the popover will be
     * closed when a child modal popover is closed.
     * 
     * If <code>FALSE,</code> @popover will stay visible.
     */
    public void setCascadePopdown(boolean cascadePopdown) {
        gtk_h.gtk_popover_set_cascade_popdown(handle(), cascadePopdown ? 1 : 0);
    }
    
    /**
     * Sets the child widget of @popover.
     */
    public void setChild(Widget child) {
        gtk_h.gtk_popover_set_child(handle(), child.handle());
    }
    
    /**
     * Sets the default widget of a <code>GtkPopover</code>.
     * <p>
     * The default widget is the widget that&#8217;s activated when the user
     * presses Enter in a dialog (for example). This function sets or
     * unsets the default widget for a <code>GtkPopover</code>.
     */
    public void setDefaultWidget(Widget widget) {
        gtk_h.gtk_popover_set_default_widget(handle(), widget.handle());
    }
    
    /**
     * Sets whether this popover should draw an arrow
     * pointing at the widget it is relative to.
     */
    public void setHasArrow(boolean hasArrow) {
        gtk_h.gtk_popover_set_has_arrow(handle(), hasArrow ? 1 : 0);
    }
    
    /**
     * Sets whether mnemonics should be visible.
     */
    public void setMnemonicsVisible(boolean mnemonicsVisible) {
        gtk_h.gtk_popover_set_mnemonics_visible(handle(), mnemonicsVisible ? 1 : 0);
    }
    
    /**
     * Sets the offset to use when calculating the position
     * of the popover.
     * 
     * These values are used when preparing the {@link [struct@Gdk.PopupLayout] (ref=struct)}
     * for positioning the popover.
     */
    public void setOffset(int xOffset, int yOffset) {
        gtk_h.gtk_popover_set_offset(handle(), xOffset, yOffset);
    }
    
    /**
     * Sets the rectangle that @popover points to.
     * 
     * This is in the coordinate space of the @popover parent.
     */
    public void setPointingTo(org.gtk.gdk.Rectangle rect) {
        gtk_h.gtk_popover_set_pointing_to(handle(), rect.handle());
    }
    
    /**
     * Sets the preferred position for @popover to appear.
     * <p>
     * If the @popover is currently visible, it will be immediately
     * updated.
     * <p>
     * This preference will be respected where possible, although
     * on lack of space (eg. if close to the window edges), the<code>GtkPopover</code> may choose to appear on the opposite side.
     */
    public void setPosition(PositionType position) {
        gtk_h.gtk_popover_set_position(handle(), position.getValue());
    }
    
    @FunctionalInterface
    public interface ActivateDefaultHandler {
        void signalReceived(Popover source);
    }
    
    /**
     * Emitted whend the user activates the default widget.
     * 
     * This is a {@link [keybinding signal]}(class.SignalAction.html).
     */
    public SignalHandle onActivateDefault(ActivateDefaultHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPopoverActivateDefault", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("activate-default").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ClosedHandler {
        void signalReceived(Popover source);
    }
    
    /**
     * Emitted when the popover is closed.
     */
    public SignalHandle onClosed(ClosedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPopoverClosed", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("closed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
