package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * <strong>GtkPopover as menu replacement</strong><br/>
 * {@code GtkPopover} is often used to replace menus. The best was to do this
 * is to use the {@link PopoverMenu} subclass which supports being
 * populated from a {@code GMenuModel} with {@link PopoverMenu#newFromModel}.
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
 * <strong>CSS nodes</strong><br/>
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
public class Popover extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Native, org.gtk.gtk.ShortcutManager {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkPopover";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.Widget.getMemoryLayout().withName("parent")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent}
     * @return The value of the field {@code parent}
     */
    public org.gtk.gtk.Widget parent$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return new org.gtk.gtk.Widget(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public Popover(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to Popover if its GType is a (or inherits from) "GtkPopover".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "Popover" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkPopover", a ClassCastException will be thrown.
     */
    public static Popover castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkPopover"))) {
            return new Popover(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkPopover");
        }
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_popover_new.invokeExact(), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @return {@code true} if {@code popover} is modal
     */
    public boolean getAutohide() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_popover_get_autohide.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether the popover will close after a modal child is closed.
     * @return {@code true} if {@code popover} will close after a modal child.
     */
    public boolean getCascadePopdown() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_popover_get_cascade_popdown.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the child widget of {@code popover}.
     * @return the child widget of {@code popover}
     */
    public @Nullable org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_popover_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets whether this popover is showing an arrow
     * pointing at the widget that it is relative to.
     * @return whether the popover has an arrow
     */
    public boolean getHasArrow() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_popover_get_has_arrow.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets whether mnemonics are visible.
     * @return {@code true} if mnemonics are supposed to be visible
     *   in this popover
     */
    public boolean getMnemonicsVisible() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_popover_get_mnemonics_visible.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the offset previous set with gtk_popover_set_offset().
     * @param xOffset a location for the x_offset
     * @param yOffset a location for the y_offset
     */
    public void getOffset(Out<Integer> xOffset, Out<Integer> yOffset) {
        MemorySegment xOffsetPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment yOffsetPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            DowncallHandles.gtk_popover_get_offset.invokeExact(
                    handle(),
                    (Addressable) (xOffset == null ? MemoryAddress.NULL : (Addressable) xOffsetPOINTER.address()),
                    (Addressable) (yOffset == null ? MemoryAddress.NULL : (Addressable) yOffsetPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (xOffset != null) xOffset.set(xOffsetPOINTER.get(ValueLayout.JAVA_INT, 0));
        if (yOffset != null) yOffset.set(yOffsetPOINTER.get(ValueLayout.JAVA_INT, 0));
    }
    
    /**
     * Gets the rectangle that the popover points to.
     * <p>
     * If a rectangle to point to has been set, this function will
     * return {@code true} and fill in {@code rect} with such rectangle, otherwise
     * it will return {@code false} and fill in {@code rect} with the parent
     * widget coordinates.
     * @param rect location to store the rectangle
     * @return {@code true} if a rectangle to point to was set.
     */
    public boolean getPointingTo(@NotNull org.gtk.gdk.Rectangle rect) {
        java.util.Objects.requireNonNull(rect, "Parameter 'rect' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_popover_get_pointing_to.invokeExact(
                    handle(),
                    rect.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the preferred position of {@code popover}.
     * @return The preferred position.
     */
    public @NotNull org.gtk.gtk.PositionType getPosition() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_popover_get_position.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.PositionType(RESULT);
    }
    
    /**
     * Pops {@code popover} down.
     * <p>
     * This may have the side-effect of closing a parent popover
     * as well. See {@code Gtk.Popover:cascade-popdown}.
     */
    public void popdown() {
        try {
            DowncallHandles.gtk_popover_popdown.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Pops {@code popover} up.
     */
    public void popup() {
        try {
            DowncallHandles.gtk_popover_popup.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Presents the popover to the user.
     */
    public void present() {
        try {
            DowncallHandles.gtk_popover_present.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param autohide {@code true} to dismiss the popover on outside clicks
     */
    public void setAutohide(boolean autohide) {
        try {
            DowncallHandles.gtk_popover_set_autohide.invokeExact(
                    handle(),
                    autohide ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If {@code cascade_popdown} is {@code true}, the popover will be
     * closed when a child modal popover is closed.
     * <p>
     * If {@code false}, {@code popover} will stay visible.
     * @param cascadePopdown {@code true} if the popover should follow a child closing
     */
    public void setCascadePopdown(boolean cascadePopdown) {
        try {
            DowncallHandles.gtk_popover_set_cascade_popdown.invokeExact(
                    handle(),
                    cascadePopdown ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the child widget of {@code popover}.
     * @param child the child widget
     */
    public void setChild(@Nullable org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.gtk_popover_set_child.invokeExact(
                    handle(),
                    (Addressable) (child == null ? MemoryAddress.NULL : child.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the default widget of a {@code GtkPopover}.
     * <p>
     * The default widget is the widget that’s activated when the user
     * presses Enter in a dialog (for example). This function sets or
     * unsets the default widget for a {@code GtkPopover}.
     * @param widget a child widget of {@code popover} to set as
     *   the default, or {@code null} to unset the default widget for the popover
     */
    public void setDefaultWidget(@Nullable org.gtk.gtk.Widget widget) {
        try {
            DowncallHandles.gtk_popover_set_default_widget.invokeExact(
                    handle(),
                    (Addressable) (widget == null ? MemoryAddress.NULL : widget.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether this popover should draw an arrow
     * pointing at the widget it is relative to.
     * @param hasArrow {@code true} to draw an arrow
     */
    public void setHasArrow(boolean hasArrow) {
        try {
            DowncallHandles.gtk_popover_set_has_arrow.invokeExact(
                    handle(),
                    hasArrow ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether mnemonics should be visible.
     * @param mnemonicsVisible the new value
     */
    public void setMnemonicsVisible(boolean mnemonicsVisible) {
        try {
            DowncallHandles.gtk_popover_set_mnemonics_visible.invokeExact(
                    handle(),
                    mnemonicsVisible ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the offset to use when calculating the position
     * of the popover.
     * <p>
     * These values are used when preparing the {@code Gdk.PopupLayout}
     * for positioning the popover.
     * @param xOffset the x offset to adjust the position by
     * @param yOffset the y offset to adjust the position by
     */
    public void setOffset(int xOffset, int yOffset) {
        try {
            DowncallHandles.gtk_popover_set_offset.invokeExact(
                    handle(),
                    xOffset,
                    yOffset);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the rectangle that {@code popover} points to.
     * <p>
     * This is in the coordinate space of the {@code popover} parent.
     * @param rect rectangle to point to
     */
    public void setPointingTo(@Nullable org.gtk.gdk.Rectangle rect) {
        try {
            DowncallHandles.gtk_popover_set_pointing_to.invokeExact(
                    handle(),
                    (Addressable) (rect == null ? MemoryAddress.NULL : rect.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param position preferred popover position
     */
    public void setPosition(@NotNull org.gtk.gtk.PositionType position) {
        java.util.Objects.requireNonNull(position, "Parameter 'position' must not be null");
        try {
            DowncallHandles.gtk_popover_set_position.invokeExact(
                    handle(),
                    position.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ActivateDefault {
        void signalReceived(Popover source);
    }
    
    /**
     * Emitted whend the user activates the default widget.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     */
    public Signal<Popover.ActivateDefault> onActivateDefault(Popover.ActivateDefault handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate-default"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Popover.Callbacks.class, "signalPopoverActivateDefault",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Popover.ActivateDefault>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Closed {
        void signalReceived(Popover source);
    }
    
    /**
     * Emitted when the popover is closed.
     */
    public Signal<Popover.Closed> onClosed(Popover.Closed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("closed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Popover.Callbacks.class, "signalPopoverClosed",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Popover.Closed>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_popover_new = Interop.downcallHandle(
            "gtk_popover_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_popover_get_autohide = Interop.downcallHandle(
            "gtk_popover_get_autohide",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_popover_get_cascade_popdown = Interop.downcallHandle(
            "gtk_popover_get_cascade_popdown",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_popover_get_child = Interop.downcallHandle(
            "gtk_popover_get_child",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_popover_get_has_arrow = Interop.downcallHandle(
            "gtk_popover_get_has_arrow",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_popover_get_mnemonics_visible = Interop.downcallHandle(
            "gtk_popover_get_mnemonics_visible",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_popover_get_offset = Interop.downcallHandle(
            "gtk_popover_get_offset",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_popover_get_pointing_to = Interop.downcallHandle(
            "gtk_popover_get_pointing_to",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_popover_get_position = Interop.downcallHandle(
            "gtk_popover_get_position",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_popover_popdown = Interop.downcallHandle(
            "gtk_popover_popdown",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_popover_popup = Interop.downcallHandle(
            "gtk_popover_popup",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_popover_present = Interop.downcallHandle(
            "gtk_popover_present",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_popover_set_autohide = Interop.downcallHandle(
            "gtk_popover_set_autohide",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_popover_set_cascade_popdown = Interop.downcallHandle(
            "gtk_popover_set_cascade_popdown",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_popover_set_child = Interop.downcallHandle(
            "gtk_popover_set_child",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_popover_set_default_widget = Interop.downcallHandle(
            "gtk_popover_set_default_widget",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_popover_set_has_arrow = Interop.downcallHandle(
            "gtk_popover_set_has_arrow",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_popover_set_mnemonics_visible = Interop.downcallHandle(
            "gtk_popover_set_mnemonics_visible",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_popover_set_offset = Interop.downcallHandle(
            "gtk_popover_set_offset",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_popover_set_pointing_to = Interop.downcallHandle(
            "gtk_popover_set_pointing_to",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_popover_set_position = Interop.downcallHandle(
            "gtk_popover_set_position",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
    
    private static class Callbacks {
        
        public static void signalPopoverActivateDefault(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Popover.ActivateDefault) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Popover(Refcounted.get(source)));
        }
        
        public static void signalPopoverClosed(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Popover.Closed) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Popover(Refcounted.get(source)));
        }
    }
}
