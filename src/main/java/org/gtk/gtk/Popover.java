package org.gtk.gtk;

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

    public Popover(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Popover */
    public static Popover castFrom(org.gtk.gobject.Object gobject) {
        return new Popover(gobject.refcounted());
    }
    
    static final MethodHandle gtk_popover_new = Interop.downcallHandle(
        "gtk_popover_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_popover_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkPopover}.
     */
    public Popover() {
        super(constructNew());
    }
    
    static final MethodHandle gtk_popover_get_autohide = Interop.downcallHandle(
        "gtk_popover_get_autohide",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the popover is modal.
     * <p>
     * See {@link Popover#setAutohide} for the
     * implications of this.
     */
    public boolean getAutohide() {
        try {
            var RESULT = (int) gtk_popover_get_autohide.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_popover_get_cascade_popdown = Interop.downcallHandle(
        "gtk_popover_get_cascade_popdown",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the popover will close after a modal child is closed.
     */
    public boolean getCascadePopdown() {
        try {
            var RESULT = (int) gtk_popover_get_cascade_popdown.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_popover_get_child = Interop.downcallHandle(
        "gtk_popover_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the child widget of {@code popover}.
     */
    public Widget getChild() {
        try {
            var RESULT = (MemoryAddress) gtk_popover_get_child.invokeExact(handle());
            return new Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_popover_get_has_arrow = Interop.downcallHandle(
        "gtk_popover_get_has_arrow",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether this popover is showing an arrow
     * pointing at the widget that it is relative to.
     */
    public boolean getHasArrow() {
        try {
            var RESULT = (int) gtk_popover_get_has_arrow.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_popover_get_mnemonics_visible = Interop.downcallHandle(
        "gtk_popover_get_mnemonics_visible",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether mnemonics are visible.
     */
    public boolean getMnemonicsVisible() {
        try {
            var RESULT = (int) gtk_popover_get_mnemonics_visible.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_popover_get_offset = Interop.downcallHandle(
        "gtk_popover_get_offset",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the offset previous set with gtk_popover_set_offset().
     */
    public void getOffset(PointerInteger xOffset, PointerInteger yOffset) {
        try {
            gtk_popover_get_offset.invokeExact(handle(), xOffset.handle(), yOffset.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_popover_get_pointing_to = Interop.downcallHandle(
        "gtk_popover_get_pointing_to",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the rectangle that the popover points to.
     * <p>
     * If a rectangle to point to has been set, this function will
     * return {@code true} and fill in {@code rect} with such rectangle, otherwise
     * it will return {@code false} and fill in {@code rect} with the parent
     * widget coordinates.
     */
    public boolean getPointingTo(org.gtk.gdk.Rectangle rect) {
        try {
            var RESULT = (int) gtk_popover_get_pointing_to.invokeExact(handle(), rect.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_popover_get_position = Interop.downcallHandle(
        "gtk_popover_get_position",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the preferred position of {@code popover}.
     */
    public PositionType getPosition() {
        try {
            var RESULT = (int) gtk_popover_get_position.invokeExact(handle());
            return new PositionType(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_popover_popdown = Interop.downcallHandle(
        "gtk_popover_popdown",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Pops {@code popover} down.
     * <p>
     * This may have the side-effect of closing a parent popover
     * as well. See {@code Gtk.Popover:cascade-popdown}.
     */
    public void popdown() {
        try {
            gtk_popover_popdown.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_popover_popup = Interop.downcallHandle(
        "gtk_popover_popup",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Pops {@code popover} up.
     */
    public void popup() {
        try {
            gtk_popover_popup.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_popover_present = Interop.downcallHandle(
        "gtk_popover_present",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Presents the popover to the user.
     */
    public void present() {
        try {
            gtk_popover_present.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_popover_set_autohide = Interop.downcallHandle(
        "gtk_popover_set_autohide",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
        try {
            gtk_popover_set_autohide.invokeExact(handle(), autohide ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_popover_set_cascade_popdown = Interop.downcallHandle(
        "gtk_popover_set_cascade_popdown",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * If {@code cascade_popdown} is {@code true}, the popover will be
     * closed when a child modal popover is closed.
     * <p>
     * If {@code false}, {@code popover} will stay visible.
     */
    public void setCascadePopdown(boolean cascadePopdown) {
        try {
            gtk_popover_set_cascade_popdown.invokeExact(handle(), cascadePopdown ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_popover_set_child = Interop.downcallHandle(
        "gtk_popover_set_child",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the child widget of {@code popover}.
     */
    public void setChild(Widget child) {
        try {
            gtk_popover_set_child.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_popover_set_default_widget = Interop.downcallHandle(
        "gtk_popover_set_default_widget",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the default widget of a {@code GtkPopover}.
     * <p>
     * The default widget is the widget that’s activated when the user
     * presses Enter in a dialog (for example). This function sets or
     * unsets the default widget for a {@code GtkPopover}.
     */
    public void setDefaultWidget(Widget widget) {
        try {
            gtk_popover_set_default_widget.invokeExact(handle(), widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_popover_set_has_arrow = Interop.downcallHandle(
        "gtk_popover_set_has_arrow",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether this popover should draw an arrow
     * pointing at the widget it is relative to.
     */
    public void setHasArrow(boolean hasArrow) {
        try {
            gtk_popover_set_has_arrow.invokeExact(handle(), hasArrow ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_popover_set_mnemonics_visible = Interop.downcallHandle(
        "gtk_popover_set_mnemonics_visible",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether mnemonics should be visible.
     */
    public void setMnemonicsVisible(boolean mnemonicsVisible) {
        try {
            gtk_popover_set_mnemonics_visible.invokeExact(handle(), mnemonicsVisible ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_popover_set_offset = Interop.downcallHandle(
        "gtk_popover_set_offset",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the offset to use when calculating the position
     * of the popover.
     * <p>
     * These values are used when preparing the {@code Gdk.PopupLayout}
     * for positioning the popover.
     */
    public void setOffset(int xOffset, int yOffset) {
        try {
            gtk_popover_set_offset.invokeExact(handle(), xOffset, yOffset);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_popover_set_pointing_to = Interop.downcallHandle(
        "gtk_popover_set_pointing_to",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the rectangle that {@code popover} points to.
     * <p>
     * This is in the coordinate space of the {@code popover} parent.
     */
    public void setPointingTo(org.gtk.gdk.Rectangle rect) {
        try {
            gtk_popover_set_pointing_to.invokeExact(handle(), rect.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_popover_set_position = Interop.downcallHandle(
        "gtk_popover_set_position",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
        try {
            gtk_popover_set_position.invokeExact(handle(), position.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate-default").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Popover.Callbacks.class, "signalPopoverActivateDefault",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("closed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Popover.Callbacks.class, "signalPopoverClosed",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalPopoverActivateDefault(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Popover.ActivateDefaultHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Popover(Refcounted.get(source)));
        }
        
        public static void signalPopoverClosed(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Popover.ClosedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Popover(Refcounted.get(source)));
        }
        
    }
}
