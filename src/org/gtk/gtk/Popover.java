package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkPopover} is a bubble-like context popup.
 * <p>
 * <img src="./doc-files/popover.png" alt="An example GtkPopover">
 * <p>
 * It is primarily meant to provide context-dependent information
 * or options. Popovers are attached to a parent widget. By default,
 * they point to the whole widget area, although this behavior can be
 * changed with {@link Popover#setPointingTo}.
 * <p>
 * The position of a popover relative to the widget it is attached to
 * can also be changed with {@link Popover#setPosition}
 * <p>
 * By default, {@code GtkPopover} performs a grab, in order to ensure input
 * events get redirected to it while it is shown, and also so the popover
 * is dismissed in the expected situations (clicks outside the popover,
 * or the Escape key being pressed). If no such modal behavior is desired
 * on a popover, {@link Popover#setAutohide} may be called on it to
 * tweak its behavior.
 * <p>
 * <h2>GtkPopover as menu replacement</h2>
 * <p>
 * {@code GtkPopover} is often used to replace menus. The best was to do this
 * is to use the {@link PopoverMenu} subclass which supports being
 * populated from a {@code GMenuModel} with {@link PopoverMenu#newFromModel}.
 * <p>
 * <pre>{@code xml
 * <section>
 *   <attribute name="display-hint">horizontal-buttons</attribute>
 *   <item>
 *     <attribute name="label">Cut</attribute>
 *     <attribute name="action">app.cut</attribute>
 *     <attribute name="verb-icon">edit-cut-symbolic</attribute>
 *   </item>
 *   <item>
 *     <attribute name="label">Copy</attribute>
 *     <attribute name="action">app.copy</attribute>
 *     <attribute name="verb-icon">edit-copy-symbolic</attribute>
 *   </item>
 *   <item>
 *     <attribute name="label">Paste</attribute>
 *     <attribute name="action">app.paste</attribute>
 *     <attribute name="verb-icon">edit-paste-symbolic</attribute>
 *   </item>
 * </section>
 * }</pre>
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
 * <pre>{@code 
 * popover[.menu]
 * ├── arrow
 * ╰── contents.background
 *     ╰── <child>
 * }</pre>
 * <p>
 * The contents child node always gets the .background style class
 * and the popover itself gets the .menu style class if the popover
 * is menu-like (i.e. {@code GtkPopoverMenu}).
 * <p>
 * Particular uses of {@code GtkPopover}, such as touch selection popups or
 * magnifiers in {@code GtkEntry} or {@code GtkTextView} get style classes like
 * .touch-selection or .magnifier to differentiate from plain popovers.
 * <p>
 * When styling a popover directly, the popover node should usually
 * not have any background. The visible part of the popover can have
 * a shadow. To specify it in CSS, set the box-shadow of the contents node.
 * <p>
 * Note that, in order to accomplish appropriate arrow visuals, {@code GtkPopover}
 * uses custom drawing for the arrow node. This makes it possible for the
 * arrow to change its shape dynamically, but it also limits the possibilities
 * of styling it using CSS. In particular, the arrow gets drawn over the
 * content node's border and shadow, so they look like one shape, which
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
     * Creates a new {@code GtkPopover}.
     */
    public Popover() {
        super(constructNew());
    }
    
    /**
     * Returns whether the popover is modal.
     * <p>
     * See {@link Popover#setAutohide} for the
     * implications of this.
     */
    public boolean getAutohide() {
        var RESULT = gtk_h.gtk_popover_get_autohide(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns whether the popover will close after a modal child is closed.
     */
    public boolean getCascadePopdown() {
        var RESULT = gtk_h.gtk_popover_get_cascade_popdown(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the child widget of {@code popover}.
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
        return RESULT != 0;
    }
    
    /**
     * Gets whether mnemonics are visible.
     */
    public boolean getMnemonicsVisible() {
        var RESULT = gtk_h.gtk_popover_get_mnemonics_visible(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the offset previous set with gtk_popover_set_offset().
     */
    public void getOffset(PointerInteger xOffset, PointerInteger yOffset) {
        gtk_h.gtk_popover_get_offset(handle(), xOffset.handle(), yOffset.handle());
    }
    
    /**
     * Gets the rectangle that the popover points to.
     * <p>
     * If a rectangle to point to has been set, this function will
     * return {@code true} and fill in {@code rect} with such rectangle, otherwise
     * it will return {@code false} and fill in {@code rect} with the parent
     * widget coordinates.
     */
    public boolean getPointingTo(org.gtk.gdk.Rectangle rect) {
        var RESULT = gtk_h.gtk_popover_get_pointing_to(handle(), rect.handle());
        return RESULT != 0;
    }
    
    /**
     * Returns the preferred position of {@code popover}.
     */
    public PositionType getPosition() {
        var RESULT = gtk_h.gtk_popover_get_position(handle());
        return new PositionType(RESULT);
    }
    
    /**
     * Pops {@code popover} down.
     * <p>
     * This may have the side-effect of closing a parent popover
     * as well. See {@code Gtk.Popover:cascade-popdown}.
     */
    public void popdown() {
        gtk_h.gtk_popover_popdown(handle());
    }
    
    /**
     * Pops {@code popover} up.
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
     * Sets whether {@code popover} is modal.
     * <p>
     * A modal popover will grab the keyboard focus on it when being
     * displayed. Focus will wrap around within the popover. Clicking
     * outside the popover area or pressing Esc will dismiss the popover.
     * <p>
     * Called this function on an already showing popup with a new
     * autohide value different from the current one, will cause the
     * popup to be hidden.
     */
    public void setAutohide(boolean autohide) {
        gtk_h.gtk_popover_set_autohide(handle(), autohide ? 1 : 0);
    }
    
    /**
     * If {@code cascade_popdown} is {@code true}, the popover will be
     * closed when a child modal popover is closed.
     * <p>
     * If {@code false}, {@code popover} will stay visible.
     */
    public void setCascadePopdown(boolean cascadePopdown) {
        gtk_h.gtk_popover_set_cascade_popdown(handle(), cascadePopdown ? 1 : 0);
    }
    
    /**
     * Sets the child widget of {@code popover}.
     */
    public void setChild(Widget child) {
        gtk_h.gtk_popover_set_child(handle(), child.handle());
    }
    
    /**
     * Sets the default widget of a {@code GtkPopover}.
     * <p>
     * The default widget is the widget that’s activated when the user
     * presses Enter in a dialog (for example). This function sets or
     * unsets the default widget for a {@code GtkPopover}.
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
     * <p>
     * These values are used when preparing the {@code Gdk.PopupLayout}
     * for positioning the popover.
     */
    public void setOffset(int xOffset, int yOffset) {
        gtk_h.gtk_popover_set_offset(handle(), xOffset, yOffset);
    }
    
    /**
     * Sets the rectangle that {@code popover} points to.
     * <p>
     * This is in the coordinate space of the {@code popover} parent.
     */
    public void setPointingTo(org.gtk.gdk.Rectangle rect) {
        gtk_h.gtk_popover_set_pointing_to(handle(), rect.handle());
    }
    
    /**
     * Sets the preferred position for {@code popover} to appear.
     * <p>
     * If the {@code popover} is currently visible, it will be immediately
     * updated.
     * <p>
     * This preference will be respected where possible, although
     * on lack of space (eg. if close to the window edges), the
     * {@code GtkPopover} may choose to appear on the opposite side.
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
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     */
    public SignalHandle onActivateDefault(ActivateDefaultHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("activate-default").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Popover.class, "__signalPopoverActivateDefault",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalPopoverActivateDefault(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (Popover.ActivateDefaultHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Popover(References.get(source)));
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("closed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Popover.class, "__signalPopoverClosed",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalPopoverClosed(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (Popover.ClosedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Popover(References.get(source)));
    }
    
}
