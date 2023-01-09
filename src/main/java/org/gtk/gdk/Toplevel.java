package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GdkToplevel} is a freestanding toplevel surface.
 * <p>
 * The {@code GdkToplevel} interface provides useful APIs for interacting with
 * the windowing system, such as controlling maximization and size of the
 * surface, setting icons and transient parents for dialogs.
 */
public interface Toplevel extends io.github.jwharm.javagi.Proxy {
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ToplevelImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ToplevelImpl(input);
    
    /**
     * Begins an interactive move operation.
     * <p>
     * You might use this function to implement draggable titlebars.
     * @param device the device used for the operation
     * @param button the button being used to drag, or 0 for a keyboard-initiated drag
     * @param x surface X coordinate of mouse click that began the drag
     * @param y surface Y coordinate of mouse click that began the drag
     * @param timestamp timestamp of mouse click that began the drag (use
     *   {@link Event#getTime})
     */
    default void beginMove(org.gtk.gdk.Device device, int button, double x, double y, int timestamp) {
        try {
            DowncallHandles.gdk_toplevel_begin_move.invokeExact(
                    handle(),
                    device.handle(),
                    button,
                    x,
                    y,
                    timestamp);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Begins an interactive resize operation.
     * <p>
     * You might use this function to implement a “window resize grip.”
     * @param edge the edge or corner from which the drag is started
     * @param device the device used for the operation
     * @param button the button being used to drag, or 0 for a keyboard-initiated drag
     * @param x surface X coordinate of mouse click that began the drag
     * @param y surface Y coordinate of mouse click that began the drag
     * @param timestamp timestamp of mouse click that began the drag (use
     *   {@link Event#getTime})
     */
    default void beginResize(org.gtk.gdk.SurfaceEdge edge, @Nullable org.gtk.gdk.Device device, int button, double x, double y, int timestamp) {
        try {
            DowncallHandles.gdk_toplevel_begin_resize.invokeExact(
                    handle(),
                    edge.getValue(),
                    (Addressable) (device == null ? MemoryAddress.NULL : device.handle()),
                    button,
                    x,
                    y,
                    timestamp);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets keyboard focus to {@code surface}.
     * <p>
     * In most cases, {@link org.gtk.gtk.Window#presentWithTime} should be
     * used on a {@link org.gtk.gtk.Window}, rather than calling this function.
     * @param timestamp timestamp of the event triggering the surface focus
     */
    default void focus(int timestamp) {
        try {
            DowncallHandles.gdk_toplevel_focus.invokeExact(
                    handle(),
                    timestamp);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the bitwise or of the currently active surface state flags,
     * from the {@code GdkToplevelState} enumeration.
     * @return surface state bitfield
     */
    default org.gtk.gdk.ToplevelState getState() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_toplevel_get_state.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ToplevelState(RESULT);
    }
    
    /**
     * Requests that the {@code toplevel} inhibit the system shortcuts.
     * <p>
     * This is asking the desktop environment/windowing system to let all
     * keyboard events reach the surface, as long as it is focused, instead
     * of triggering system actions.
     * <p>
     * If granted, the rerouting remains active until the default shortcuts
     * processing is restored with {@link Toplevel#restoreSystemShortcuts},
     * or the request is revoked by the desktop environment, windowing system
     * or the user.
     * <p>
     * A typical use case for this API is remote desktop or virtual machine
     * viewers which need to inhibit the default system keyboard shortcuts
     * so that the remote session or virtual host gets those instead of the
     * local environment.
     * <p>
     * The windowing system or desktop environment may ask the user to grant
     * or deny the request or even choose to ignore the request entirely.
     * <p>
     * The caller can be notified whenever the request is granted or revoked
     * by listening to the {@code Gdk.Toplevel:shortcuts-inhibited} property.
     * @param event the {@code GdkEvent} that is triggering the inhibit
     *   request, or {@code null} if none is available
     */
    default void inhibitSystemShortcuts(@Nullable org.gtk.gdk.Event event) {
        try {
            DowncallHandles.gdk_toplevel_inhibit_system_shortcuts.invokeExact(
                    handle(),
                    (Addressable) (event == null ? MemoryAddress.NULL : event.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Asks to lower the {@code toplevel} below other windows.
     * <p>
     * The windowing system may choose to ignore the request.
     * @return {@code true} if the surface was lowered
     */
    default boolean lower() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_toplevel_lower.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Asks to minimize the {@code toplevel}.
     * <p>
     * The windowing system may choose to ignore the request.
     * @return {@code true} if the surface was minimized
     */
    default boolean minimize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_toplevel_minimize.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Present {@code toplevel} after having processed the {@code GdkToplevelLayout} rules.
     * <p>
     * If the toplevel was previously not showing, it will be showed,
     * otherwise it will change layout according to {@code layout}.
     * <p>
     * GDK may emit the {@code Gdk.Toplevel::compute-size} signal to let
     * the user of this toplevel compute the preferred size of the toplevel
     * surface.
     * <p>
     * Presenting is asynchronous and the specified layout parameters are not
     * guaranteed to be respected.
     * @param layout the {@code GdkToplevelLayout} object used to layout
     */
    default void present(org.gtk.gdk.ToplevelLayout layout) {
        try {
            DowncallHandles.gdk_toplevel_present.invokeExact(
                    handle(),
                    layout.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Restore default system keyboard shortcuts which were previously
     * inhibited.
     * <p>
     * This undoes the effect of {@link Toplevel#inhibitSystemShortcuts}.
     */
    default void restoreSystemShortcuts() {
        try {
            DowncallHandles.gdk_toplevel_restore_system_shortcuts.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the toplevel to be decorated.
     * <p>
     * Setting {@code decorated} to {@code false} hints the desktop environment
     * that the surface has its own, client-side decorations and
     * does not need to have window decorations added.
     * @param decorated {@code true} to request decorations
     */
    default void setDecorated(boolean decorated) {
        try {
            DowncallHandles.gdk_toplevel_set_decorated.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(decorated, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the toplevel to be deletable.
     * <p>
     * Setting {@code deletable} to {@code true} hints the desktop environment
     * that it should offer the user a way to close the surface.
     * @param deletable {@code true} to request a delete button
     */
    default void setDeletable(boolean deletable) {
        try {
            DowncallHandles.gdk_toplevel_set_deletable.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(deletable, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a list of icons for the surface.
     * <p>
     * One of these will be used to represent the surface in iconic form.
     * The icon may be shown in window lists or task bars. Which icon
     * size is shown depends on the window manager. The window manager
     * can scale the icon but setting several size icons can give better
     * image quality.
     * <p>
     * Note that some platforms don't support surface icons.
     * @param surfaces A list of textures to use as icon, of different sizes
     */
    default void setIconList(org.gtk.glib.List surfaces) {
        try {
            DowncallHandles.gdk_toplevel_set_icon_list.invokeExact(
                    handle(),
                    surfaces.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the toplevel to be modal.
     * <p>
     * The application can use this hint to tell the
     * window manager that a certain surface has modal
     * behaviour. The window manager can use this information
     * to handle modal surfaces in a special way.
     * <p>
     * You should only use this on surfaces for which you have
     * previously called {@link Toplevel#setTransientFor}.
     * @param modal {@code true} if the surface is modal, {@code false} otherwise.
     */
    default void setModal(boolean modal) {
        try {
            DowncallHandles.gdk_toplevel_set_modal.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(modal, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the startup notification ID.
     * <p>
     * When using GTK, typically you should use
     * {@link org.gtk.gtk.Window#setStartupId} instead of this
     * low-level function.
     * @param startupId a string with startup-notification identifier
     */
    default void setStartupId(java.lang.String startupId) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gdk_toplevel_set_startup_id.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(startupId, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the title of a toplevel surface.
     * <p>
     * The title maybe be displayed in the titlebar,
     * in lists of windows, etc.
     * @param title title of {@code surface}
     */
    default void setTitle(java.lang.String title) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gdk_toplevel_set_title.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(title, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets a transient-for parent.
     * <p>
     * Indicates to the window manager that {@code surface} is a transient
     * dialog associated with the application surface {@code parent}. This
     * allows the window manager to do things like center {@code surface}
     * on {@code parent} and keep {@code surface} above {@code parent}.
     * <p>
     * See {@link org.gtk.gtk.Window#setTransientFor} if you’re using
     * {@link org.gtk.gtk.Window}.
     * @param parent another toplevel {@code GdkSurface}
     */
    default void setTransientFor(org.gtk.gdk.Surface parent) {
        try {
            DowncallHandles.gdk_toplevel_set_transient_for.invokeExact(
                    handle(),
                    parent.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Asks the windowing system to show the window menu.
     * <p>
     * The window menu is the menu shown when right-clicking the titlebar
     * on traditional windows managed by the window manager. This is useful
     * for windows using client-side decorations, activating it with a
     * right-click on the window decorations.
     * @param event a {@code GdkEvent} to show the menu for
     * @return {@code true} if the window menu was shown and {@code false} otherwise.
     */
    default boolean showWindowMenu(org.gtk.gdk.Event event) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_toplevel_show_window_menu.invokeExact(
                    handle(),
                    event.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns whether the desktop environment supports
     * tiled window states.
     * @return {@code true} if the desktop environment supports tiled window states
     */
    default boolean supportsEdgeConstraints() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_toplevel_supports_edge_constraints.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    default boolean titlebarGesture(org.gtk.gdk.TitlebarGesture gesture) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_toplevel_titlebar_gesture.invokeExact(
                    handle(),
                    gesture.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_toplevel_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code ComputeSize} callback.
     */
    @FunctionalInterface
    public interface ComputeSize {
    
        /**
         * Emitted when the size for the surface needs to be computed, when
         * it is present.
         * <p>
         * It will normally be emitted during or after {@link Toplevel#present},
         * depending on the configuration received by the windowing system.
         * It may also be emitted at any other point in time, in response
         * to the windowing system spontaneously changing the configuration.
         * <p>
         * It is the responsibility of the toplevel user to handle this signal
         * and compute the desired size of the toplevel, given the information
         * passed via the {@code Gdk.ToplevelSize} object. Failing to do so
         * will result in an arbitrary size being used as a result.
         */
        void run(org.gtk.gdk.ToplevelSize size);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceToplevel, MemoryAddress size) {
            run(org.gtk.gdk.ToplevelSize.fromAddress.marshal(size, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ComputeSize.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the size for the surface needs to be computed, when
     * it is present.
     * <p>
     * It will normally be emitted during or after {@link Toplevel#present},
     * depending on the configuration received by the windowing system.
     * It may also be emitted at any other point in time, in response
     * to the windowing system spontaneously changing the configuration.
     * <p>
     * It is the responsibility of the toplevel user to handle this signal
     * and compute the desired size of the toplevel, given the information
     * passed via the {@code Gdk.ToplevelSize} object. Failing to do so
     * will result in an arbitrary size being used as a result.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<Toplevel.ComputeSize> onComputeSize(Toplevel.ComputeSize handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("compute-size", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gdk_toplevel_begin_move = Interop.downcallHandle(
                "gdk_toplevel_begin_move",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_toplevel_begin_resize = Interop.downcallHandle(
                "gdk_toplevel_begin_resize",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_toplevel_focus = Interop.downcallHandle(
                "gdk_toplevel_focus",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_toplevel_get_state = Interop.downcallHandle(
                "gdk_toplevel_get_state",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_toplevel_inhibit_system_shortcuts = Interop.downcallHandle(
                "gdk_toplevel_inhibit_system_shortcuts",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_toplevel_lower = Interop.downcallHandle(
                "gdk_toplevel_lower",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_toplevel_minimize = Interop.downcallHandle(
                "gdk_toplevel_minimize",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_toplevel_present = Interop.downcallHandle(
                "gdk_toplevel_present",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_toplevel_restore_system_shortcuts = Interop.downcallHandle(
                "gdk_toplevel_restore_system_shortcuts",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_toplevel_set_decorated = Interop.downcallHandle(
                "gdk_toplevel_set_decorated",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_toplevel_set_deletable = Interop.downcallHandle(
                "gdk_toplevel_set_deletable",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_toplevel_set_icon_list = Interop.downcallHandle(
                "gdk_toplevel_set_icon_list",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_toplevel_set_modal = Interop.downcallHandle(
                "gdk_toplevel_set_modal",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_toplevel_set_startup_id = Interop.downcallHandle(
                "gdk_toplevel_set_startup_id",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_toplevel_set_title = Interop.downcallHandle(
                "gdk_toplevel_set_title",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_toplevel_set_transient_for = Interop.downcallHandle(
                "gdk_toplevel_set_transient_for",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_toplevel_show_window_menu = Interop.downcallHandle(
                "gdk_toplevel_show_window_menu",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_toplevel_supports_edge_constraints = Interop.downcallHandle(
                "gdk_toplevel_supports_edge_constraints",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_toplevel_titlebar_gesture = Interop.downcallHandle(
                "gdk_toplevel_titlebar_gesture",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_toplevel_get_type = Interop.downcallHandle(
                "gdk_toplevel_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * The ToplevelImpl type represents a native instance of the Toplevel interface.
     */
    class ToplevelImpl extends org.gtk.gobject.GObject implements Toplevel {
        
        static {
            Gdk.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of Toplevel for the provided memory address.
         * @param address the memory address of the instance
         */
        public ToplevelImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gdk_toplevel_get_type != null;
    }
}
