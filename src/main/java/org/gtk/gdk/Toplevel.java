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

    @ApiStatus.Internal static final MethodHandle gdk_toplevel_begin_move = Interop.downcallHandle(
        "gdk_toplevel_begin_move",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT)
    );
    
    /**
     * Begins an interactive move operation.
     * <p>
     * You might use this function to implement draggable titlebars.
     */
    default @NotNull void beginMove(@NotNull Device device, @NotNull int button, @NotNull double x, @NotNull double y, @NotNull int timestamp) {
        try {
            gdk_toplevel_begin_move.invokeExact(handle(), device.handle(), button, x, y, timestamp);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle gdk_toplevel_begin_resize = Interop.downcallHandle(
        "gdk_toplevel_begin_resize",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT)
    );
    
    /**
     * Begins an interactive resize operation.
     * <p>
     * You might use this function to implement a “window resize grip.”
     */
    default @NotNull void beginResize(@NotNull SurfaceEdge edge, @Nullable Device device, @NotNull int button, @NotNull double x, @NotNull double y, @NotNull int timestamp) {
        try {
            gdk_toplevel_begin_resize.invokeExact(handle(), edge.getValue(), device.handle(), button, x, y, timestamp);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle gdk_toplevel_focus = Interop.downcallHandle(
        "gdk_toplevel_focus",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets keyboard focus to {@code surface}.
     * <p>
     * In most cases, {@link org.gtk.gtk.Window#presentWithTime} should be
     * used on a {@link org.gtk.gtk.Window}, rather than calling this function.
     */
    default @NotNull void focus(@NotNull int timestamp) {
        try {
            gdk_toplevel_focus.invokeExact(handle(), timestamp);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle gdk_toplevel_get_state = Interop.downcallHandle(
        "gdk_toplevel_get_state",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the bitwise or of the currently active surface state flags,
     * from the {@code GdkToplevelState} enumeration.
     */
    default @NotNull ToplevelState getState() {
        int RESULT;
        try {
            RESULT = (int) gdk_toplevel_get_state.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ToplevelState(RESULT);
    }
    
    @ApiStatus.Internal static final MethodHandle gdk_toplevel_inhibit_system_shortcuts = Interop.downcallHandle(
        "gdk_toplevel_inhibit_system_shortcuts",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    default @NotNull void inhibitSystemShortcuts(@Nullable Event event) {
        try {
            gdk_toplevel_inhibit_system_shortcuts.invokeExact(handle(), event.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle gdk_toplevel_lower = Interop.downcallHandle(
        "gdk_toplevel_lower",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Asks to lower the {@code toplevel} below other windows.
     * <p>
     * The windowing system may choose to ignore the request.
     */
    default boolean lower() {
        int RESULT;
        try {
            RESULT = (int) gdk_toplevel_lower.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle gdk_toplevel_minimize = Interop.downcallHandle(
        "gdk_toplevel_minimize",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Asks to minimize the {@code toplevel}.
     * <p>
     * The windowing system may choose to ignore the request.
     */
    default boolean minimize() {
        int RESULT;
        try {
            RESULT = (int) gdk_toplevel_minimize.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle gdk_toplevel_present = Interop.downcallHandle(
        "gdk_toplevel_present",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    default @NotNull void present(@NotNull ToplevelLayout layout) {
        try {
            gdk_toplevel_present.invokeExact(handle(), layout.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle gdk_toplevel_restore_system_shortcuts = Interop.downcallHandle(
        "gdk_toplevel_restore_system_shortcuts",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Restore default system keyboard shortcuts which were previously
     * inhibited.
     * <p>
     * This undoes the effect of {@link Toplevel#inhibitSystemShortcuts}.
     */
    default @NotNull void restoreSystemShortcuts() {
        try {
            gdk_toplevel_restore_system_shortcuts.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle gdk_toplevel_set_decorated = Interop.downcallHandle(
        "gdk_toplevel_set_decorated",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the toplevel to be decorated.
     * <p>
     * Setting {@code decorated} to {@code false} hints the desktop environment
     * that the surface has its own, client-side decorations and
     * does not need to have window decorations added.
     */
    default @NotNull void setDecorated(@NotNull boolean decorated) {
        try {
            gdk_toplevel_set_decorated.invokeExact(handle(), decorated ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle gdk_toplevel_set_deletable = Interop.downcallHandle(
        "gdk_toplevel_set_deletable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the toplevel to be deletable.
     * <p>
     * Setting {@code deletable} to {@code true} hints the desktop environment
     * that it should offer the user a way to close the surface.
     */
    default @NotNull void setDeletable(@NotNull boolean deletable) {
        try {
            gdk_toplevel_set_deletable.invokeExact(handle(), deletable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle gdk_toplevel_set_icon_list = Interop.downcallHandle(
        "gdk_toplevel_set_icon_list",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    default @NotNull void setIconList(@NotNull org.gtk.glib.List surfaces) {
        try {
            gdk_toplevel_set_icon_list.invokeExact(handle(), surfaces.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle gdk_toplevel_set_modal = Interop.downcallHandle(
        "gdk_toplevel_set_modal",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
     */
    default @NotNull void setModal(@NotNull boolean modal) {
        try {
            gdk_toplevel_set_modal.invokeExact(handle(), modal ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle gdk_toplevel_set_startup_id = Interop.downcallHandle(
        "gdk_toplevel_set_startup_id",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the startup notification ID.
     * <p>
     * When using GTK, typically you should use
     * {@link org.gtk.gtk.Window#setStartupId} instead of this
     * low-level function.
     */
    default @NotNull void setStartupId(@NotNull java.lang.String startupId) {
        try {
            gdk_toplevel_set_startup_id.invokeExact(handle(), Interop.allocateNativeString(startupId));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle gdk_toplevel_set_title = Interop.downcallHandle(
        "gdk_toplevel_set_title",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the title of a toplevel surface.
     * <p>
     * The title maybe be displayed in the titlebar,
     * in lists of windows, etc.
     */
    default @NotNull void setTitle(@NotNull java.lang.String title) {
        try {
            gdk_toplevel_set_title.invokeExact(handle(), Interop.allocateNativeString(title));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle gdk_toplevel_set_transient_for = Interop.downcallHandle(
        "gdk_toplevel_set_transient_for",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a transient-for parent.
     * <p>
     * Indicates to the window manager that {@code surface} is a transient
     * dialog associated with the application surface {@code parent}. This
     * allows the window manager to do things like center {@code surface}
     * on {@code parent} and keep {@code surface} above {@code parent}.
     * <p>
     * See {@link org.gtk.gtk.Window#setTransientFor} if you’re using
     * {@code Gtk.Dialog}.
     */
    default @NotNull void setTransientFor(@NotNull Surface parent) {
        try {
            gdk_toplevel_set_transient_for.invokeExact(handle(), parent.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle gdk_toplevel_show_window_menu = Interop.downcallHandle(
        "gdk_toplevel_show_window_menu",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Asks the windowing system to show the window menu.
     * <p>
     * The window menu is the menu shown when right-clicking the titlebar
     * on traditional windows managed by the window manager. This is useful
     * for windows using client-side decorations, activating it with a
     * right-click on the window decorations.
     */
    default boolean showWindowMenu(@NotNull Event event) {
        int RESULT;
        try {
            RESULT = (int) gdk_toplevel_show_window_menu.invokeExact(handle(), event.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle gdk_toplevel_supports_edge_constraints = Interop.downcallHandle(
        "gdk_toplevel_supports_edge_constraints",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the desktop environment supports
     * tiled window states.
     */
    default boolean supportsEdgeConstraints() {
        int RESULT;
        try {
            RESULT = (int) gdk_toplevel_supports_edge_constraints.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle gdk_toplevel_titlebar_gesture = Interop.downcallHandle(
        "gdk_toplevel_titlebar_gesture",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    default boolean titlebarGesture(@NotNull TitlebarGesture gesture) {
        int RESULT;
        try {
            RESULT = (int) gdk_toplevel_titlebar_gesture.invokeExact(handle(), gesture.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    public static class Callbacks {
    
    }
    
    class ToplevelImpl extends org.gtk.gobject.Object implements Toplevel {
        public ToplevelImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
