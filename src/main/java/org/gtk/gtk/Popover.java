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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.Widget.getMemoryLayout().withName("parent")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a Popover proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Popover(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Popover> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Popover(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_popover_new.invokeExact();
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
        this.refSink();
        this.takeOwnership();
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
            RESULT = (int) DowncallHandles.gtk_popover_get_autohide.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns whether the popover will close after a modal child is closed.
     * @return {@code true} if {@code popover} will close after a modal child.
     */
    public boolean getCascadePopdown() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_popover_get_cascade_popdown.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the child widget of {@code popover}.
     * @return the child widget of {@code popover}
     */
    public @Nullable org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_popover_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets whether this popover is showing an arrow
     * pointing at the widget that it is relative to.
     * @return whether the popover has an arrow
     */
    public boolean getHasArrow() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_popover_get_has_arrow.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets whether mnemonics are visible.
     * @return {@code true} if mnemonics are supposed to be visible
     *   in this popover
     */
    public boolean getMnemonicsVisible() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_popover_get_mnemonics_visible.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the offset previous set with gtk_popover_set_offset().
     * @param xOffset a location for the x_offset
     * @param yOffset a location for the y_offset
     */
    public void getOffset(Out<Integer> xOffset, Out<Integer> yOffset) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment xOffsetPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment yOffsetPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.gtk_popover_get_offset.invokeExact(
                        handle(),
                        (Addressable) (xOffset == null ? MemoryAddress.NULL : (Addressable) xOffsetPOINTER.address()),
                        (Addressable) (yOffset == null ? MemoryAddress.NULL : (Addressable) yOffsetPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (xOffset != null) xOffset.set(xOffsetPOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (yOffset != null) yOffset.set(yOffsetPOINTER.get(Interop.valueLayout.C_INT, 0));
        }
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
    public boolean getPointingTo(org.gtk.gdk.Rectangle rect) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_popover_get_pointing_to.invokeExact(
                    handle(),
                    rect.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the preferred position of {@code popover}.
     * @return The preferred position.
     */
    public org.gtk.gtk.PositionType getPosition() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_popover_get_position.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.PositionType.of(RESULT);
    }
    
    /**
     * Pops {@code popover} down.
     * <p>
     * This may have the side-effect of closing a parent popover
     * as well. See {@code Gtk.Popover:cascade-popdown}.
     */
    public void popdown() {
        try {
            DowncallHandles.gtk_popover_popdown.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Pops {@code popover} up.
     */
    public void popup() {
        try {
            DowncallHandles.gtk_popover_popup.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Presents the popover to the user.
     */
    public void present() {
        try {
            DowncallHandles.gtk_popover_present.invokeExact(handle());
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
                    Marshal.booleanToInteger.marshal(autohide, null).intValue());
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
                    Marshal.booleanToInteger.marshal(cascadePopdown, null).intValue());
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
                    Marshal.booleanToInteger.marshal(hasArrow, null).intValue());
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
                    Marshal.booleanToInteger.marshal(mnemonicsVisible, null).intValue());
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
    public void setPosition(org.gtk.gtk.PositionType position) {
        try {
            DowncallHandles.gtk_popover_set_position.invokeExact(
                    handle(),
                    position.getValue());
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
            RESULT = (long) DowncallHandles.gtk_popover_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code ActivateDefault} callback.
     */
    @FunctionalInterface
    public interface ActivateDefault {
    
        /**
         * Emitted whend the user activates the default widget.
         * <p>
         * This is a <a href="class.SignalAction.html">keybinding signal</a>.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourcePopover) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ActivateDefault.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted whend the user activates the default widget.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Popover.ActivateDefault> onActivateDefault(Popover.ActivateDefault handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("activate-default", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Closed} callback.
     */
    @FunctionalInterface
    public interface Closed {
    
        /**
         * Emitted when the popover is closed.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourcePopover) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Closed.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the popover is closed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Popover.Closed> onClosed(Popover.Closed handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("closed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link Popover.Builder} object constructs a {@link Popover} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Popover.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Popover} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Popover}.
         * @return A new instance of {@code Popover} with the properties 
         *         that were set in the Builder object.
         */
        public Popover build() {
            return (Popover) org.gtk.gobject.GObject.newWithProperties(
                Popover.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Whether to dismiss the popover on outside clicks.
         * @param autohide The value for the {@code autohide} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAutohide(boolean autohide) {
            names.add("autohide");
            values.add(org.gtk.gobject.Value.create(autohide));
            return this;
        }
        
        /**
         * Whether the popover pops down after a child popover.
         * <p>
         * This is used to implement the expected behavior of submenus.
         * @param cascadePopdown The value for the {@code cascade-popdown} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCascadePopdown(boolean cascadePopdown) {
            names.add("cascade-popdown");
            values.add(org.gtk.gobject.Value.create(cascadePopdown));
            return this;
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
        
        /**
         * The default widget inside the popover.
         * @param defaultWidget The value for the {@code default-widget} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDefaultWidget(org.gtk.gtk.Widget defaultWidget) {
            names.add("default-widget");
            values.add(org.gtk.gobject.Value.create(defaultWidget));
            return this;
        }
        
        /**
         * Whether to draw an arrow.
         * @param hasArrow The value for the {@code has-arrow} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHasArrow(boolean hasArrow) {
            names.add("has-arrow");
            values.add(org.gtk.gobject.Value.create(hasArrow));
            return this;
        }
        
        /**
         * Whether mnemonics are currently visible in this popover.
         * @param mnemonicsVisible The value for the {@code mnemonics-visible} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMnemonicsVisible(boolean mnemonicsVisible) {
            names.add("mnemonics-visible");
            values.add(org.gtk.gobject.Value.create(mnemonicsVisible));
            return this;
        }
        
        /**
         * Rectangle in the parent widget that the popover points to.
         * @param pointingTo The value for the {@code pointing-to} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPointingTo(org.gtk.gdk.Rectangle pointingTo) {
            names.add("pointing-to");
            values.add(org.gtk.gobject.Value.create(pointingTo));
            return this;
        }
        
        /**
         * How to place the popover, relative to its parent.
         * @param position The value for the {@code position} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPosition(org.gtk.gtk.PositionType position) {
            names.add("position");
            values.add(org.gtk.gobject.Value.create(position));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_popover_new = Interop.downcallHandle(
                "gtk_popover_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_popover_get_autohide = Interop.downcallHandle(
                "gtk_popover_get_autohide",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_popover_get_cascade_popdown = Interop.downcallHandle(
                "gtk_popover_get_cascade_popdown",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_popover_get_child = Interop.downcallHandle(
                "gtk_popover_get_child",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_popover_get_has_arrow = Interop.downcallHandle(
                "gtk_popover_get_has_arrow",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_popover_get_mnemonics_visible = Interop.downcallHandle(
                "gtk_popover_get_mnemonics_visible",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_popover_get_offset = Interop.downcallHandle(
                "gtk_popover_get_offset",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_popover_get_pointing_to = Interop.downcallHandle(
                "gtk_popover_get_pointing_to",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_popover_get_position = Interop.downcallHandle(
                "gtk_popover_get_position",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_popover_popdown = Interop.downcallHandle(
                "gtk_popover_popdown",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_popover_popup = Interop.downcallHandle(
                "gtk_popover_popup",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_popover_present = Interop.downcallHandle(
                "gtk_popover_present",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_popover_set_autohide = Interop.downcallHandle(
                "gtk_popover_set_autohide",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_popover_set_cascade_popdown = Interop.downcallHandle(
                "gtk_popover_set_cascade_popdown",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_popover_set_child = Interop.downcallHandle(
                "gtk_popover_set_child",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_popover_set_default_widget = Interop.downcallHandle(
                "gtk_popover_set_default_widget",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_popover_set_has_arrow = Interop.downcallHandle(
                "gtk_popover_set_has_arrow",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_popover_set_mnemonics_visible = Interop.downcallHandle(
                "gtk_popover_set_mnemonics_visible",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_popover_set_offset = Interop.downcallHandle(
                "gtk_popover_set_offset",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_popover_set_pointing_to = Interop.downcallHandle(
                "gtk_popover_set_pointing_to",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_popover_set_position = Interop.downcallHandle(
                "gtk_popover_set_position",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_popover_get_type = Interop.downcallHandle(
                "gtk_popover_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_popover_get_type != null;
    }
}
