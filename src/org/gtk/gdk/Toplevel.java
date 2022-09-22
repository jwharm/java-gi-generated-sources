package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GdkToplevel} is a freestanding toplevel surface.
 * <p>
 * The {@code GdkToplevel} interface provides useful APIs for interacting with
 * the windowing system, such as controlling maximization and size of the
 * surface, setting icons and transient parents for dialogs.
 */
public interface Toplevel extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Begins an interactive move operation.
     * <p>
     * You might use this function to implement draggable titlebars.
     */
    public default void beginMove(Device device, int button, double x, double y, int timestamp) {
        gtk_h.gdk_toplevel_begin_move(handle(), device.handle(), button, x, y, timestamp);
    }
    
    /**
     * Begins an interactive resize operation.
     * <p>
     * You might use this function to implement a “window resize grip.”
     */
    public default void beginResize(SurfaceEdge edge, Device device, int button, double x, double y, int timestamp) {
        gtk_h.gdk_toplevel_begin_resize(handle(), edge.getValue(), device.handle(), button, x, y, timestamp);
    }
    
    /**
     * Sets keyboard focus to {@code surface}.
     * <p>
     * In most cases, {@link org.gtk.gtk.Window#presentWithTime} should be
     * used on a {@link org.gtk.gtk.Window}, rather than calling this function.
     */
    public default void focus(int timestamp) {
        gtk_h.gdk_toplevel_focus(handle(), timestamp);
    }
    
    /**
     * Gets the bitwise or of the currently active surface state flags,
     * from the {@code GdkToplevelState} enumeration.
     */
    public default int getState() {
        var RESULT = gtk_h.gdk_toplevel_get_state(handle());
        return RESULT;
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
     */
    public default void inhibitSystemShortcuts(Event event) {
        gtk_h.gdk_toplevel_inhibit_system_shortcuts(handle(), event.handle());
    }
    
    /**
     * Asks to lower the {@code toplevel} below other windows.
     * <p>
     * The windowing system may choose to ignore the request.
     */
    public default boolean lower() {
        var RESULT = gtk_h.gdk_toplevel_lower(handle());
        return (RESULT != 0);
    }
    
    /**
     * Asks to minimize the {@code toplevel}.
     * <p>
     * The windowing system may choose to ignore the request.
     */
    public default boolean minimize() {
        var RESULT = gtk_h.gdk_toplevel_minimize(handle());
        return (RESULT != 0);
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
     */
    public default void present(ToplevelLayout layout) {
        gtk_h.gdk_toplevel_present(handle(), layout.handle());
    }
    
    /**
     * Restore default system keyboard shortcuts which were previously
     * inhibited.
     * <p>
     * This undoes the effect of {@link Toplevel#inhibitSystemShortcuts}.
     */
    public default void restoreSystemShortcuts() {
        gtk_h.gdk_toplevel_restore_system_shortcuts(handle());
    }
    
    /**
     * Sets the toplevel to be decorated.
     * <p>
     * Setting {@code decorated} to <code>false</code> hints the desktop environment
     * that the surface has its own, client-side decorations and
     * does not need to have window decorations added.
     */
    public default void setDecorated(boolean decorated) {
        gtk_h.gdk_toplevel_set_decorated(handle(), decorated ? 1 : 0);
    }
    
    /**
     * Sets the toplevel to be deletable.
     * <p>
     * Setting {@code deletable} to <code>true</code> hints the desktop environment
     * that it should offer the user a way to close the surface.
     */
    public default void setDeletable(boolean deletable) {
        gtk_h.gdk_toplevel_set_deletable(handle(), deletable ? 1 : 0);
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
     */
    public default void setIconList(org.gtk.glib.List surfaces) {
        gtk_h.gdk_toplevel_set_icon_list(handle(), surfaces.handle());
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
     */
    public default void setModal(boolean modal) {
        gtk_h.gdk_toplevel_set_modal(handle(), modal ? 1 : 0);
    }
    
    /**
     * Sets the startup notification ID.
     * <p>
     * When using GTK, typically you should use
     * {@link org.gtk.gtk.Window#setStartupId} instead of this
     * low-level function.
     */
    public default void setStartupId(java.lang.String startupId) {
        gtk_h.gdk_toplevel_set_startup_id(handle(), Interop.allocateNativeString(startupId).handle());
    }
    
    /**
     * Sets the title of a toplevel surface.
     * <p>
     * The title maybe be displayed in the titlebar,
     * in lists of windows, etc.
     */
    public default void setTitle(java.lang.String title) {
        gtk_h.gdk_toplevel_set_title(handle(), Interop.allocateNativeString(title).handle());
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
     * {@code Gtk.Dialog}.
     */
    public default void setTransientFor(Surface parent) {
        gtk_h.gdk_toplevel_set_transient_for(handle(), parent.handle());
    }
    
    /**
     * Asks the windowing system to show the window menu.
     * <p>
     * The window menu is the menu shown when right-clicking the titlebar
     * on traditional windows managed by the window manager. This is useful
     * for windows using client-side decorations, activating it with a
     * right-click on the window decorations.
     */
    public default boolean showWindowMenu(Event event) {
        var RESULT = gtk_h.gdk_toplevel_show_window_menu(handle(), event.handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the desktop environment supports
     * tiled window states.
     */
    public default boolean supportsEdgeConstraints() {
        var RESULT = gtk_h.gdk_toplevel_supports_edge_constraints(handle());
        return (RESULT != 0);
    }
    
    public default boolean titlebarGesture(TitlebarGesture gesture) {
        var RESULT = gtk_h.gdk_toplevel_titlebar_gesture(handle(), gesture.getValue());
        return (RESULT != 0);
    }
    
    @FunctionalInterface
    public interface ComputeSizeHandler {
        void signalReceived(Toplevel source, ToplevelSize size);
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
     */
    public default SignalHandle onComputeSize(ComputeSizeHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalToplevelComputeSize", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("compute-size").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    class ToplevelImpl extends org.gtk.gobject.Object implements Toplevel {
        public ToplevelImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
