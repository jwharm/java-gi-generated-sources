package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GdkToplevel` is a freestanding toplevel surface.
 * 
 * The `GdkToplevel` interface provides useful APIs for interacting with
 * the windowing system, such as controlling maximization and size of the
 * surface, setting icons and transient parents for dialogs.
 */
public interface Toplevel extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Begins an interactive move operation.
     * 
     * You might use this function to implement draggable titlebars.
     */
    public default void beginMove(Device device, int button, double x, double y, int timestamp) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_toplevel_begin_move(HANDLE(), device.HANDLE(), button, x, y, timestamp);
    }
    
    /**
     * Begins an interactive resize operation.
     * 
     * You might use this function to implement a “window resize grip.”
     */
    public default void beginResize(SurfaceEdge edge, Device device, int button, double x, double y, int timestamp) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_toplevel_begin_resize(HANDLE(), edge.getValue(), device.HANDLE(), button, x, y, timestamp);
    }
    
    /**
     * Sets keyboard focus to @surface.
     * 
     * In most cases, [method@Gtk.Window.present_with_time] should be
     * used on a [class@Gtk.Window], rather than calling this function.
     */
    public default void focus(int timestamp) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_toplevel_focus(HANDLE(), timestamp);
    }
    
    /**
     * Gets the bitwise or of the currently active surface state flags,
     * from the `GdkToplevelState` enumeration.
     */
    public default int getState() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_toplevel_get_state(HANDLE());
        return RESULT;
    }
    
    /**
     * Requests that the @toplevel inhibit the system shortcuts.
     * 
     * This is asking the desktop environment/windowing system to let all
     * keyboard events reach the surface, as long as it is focused, instead
     * of triggering system actions.
     * 
     * If granted, the rerouting remains active until the default shortcuts
     * processing is restored with [method@Gdk.Toplevel.restore_system_shortcuts],
     * or the request is revoked by the desktop environment, windowing system
     * or the user.
     * 
     * A typical use case for this API is remote desktop or virtual machine
     * viewers which need to inhibit the default system keyboard shortcuts
     * so that the remote session or virtual host gets those instead of the
     * local environment.
     * 
     * The windowing system or desktop environment may ask the user to grant
     * or deny the request or even choose to ignore the request entirely.
     * 
     * The caller can be notified whenever the request is granted or revoked
     * by listening to the [property@Gdk.Toplevel:shortcuts-inhibited] property.
     */
    public default void inhibitSystemShortcuts(Event event) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_toplevel_inhibit_system_shortcuts(HANDLE(), event.HANDLE());
    }
    
    /**
     * Asks to lower the @toplevel below other windows.
     * 
     * The windowing system may choose to ignore the request.
     */
    public default boolean lower() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_toplevel_lower(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Asks to minimize the @toplevel.
     * 
     * The windowing system may choose to ignore the request.
     */
    public default boolean minimize() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_toplevel_minimize(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Present @toplevel after having processed the `GdkToplevelLayout` rules.
     * 
     * If the toplevel was previously not showing, it will be showed,
     * otherwise it will change layout according to @layout.
     * 
     * GDK may emit the [signal@Gdk.Toplevel::compute-size] signal to let
     * the user of this toplevel compute the preferred size of the toplevel
     * surface.
     * 
     * Presenting is asynchronous and the specified layout parameters are not
     * guaranteed to be respected.
     */
    public default void present(ToplevelLayout layout) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_toplevel_present(HANDLE(), layout.HANDLE());
    }
    
    /**
     * Restore default system keyboard shortcuts which were previously
     * inhibited.
     * 
     * This undoes the effect of [method@Gdk.Toplevel.inhibit_system_shortcuts].
     */
    public default void restoreSystemShortcuts() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_toplevel_restore_system_shortcuts(HANDLE());
    }
    
    /**
     * Sets the toplevel to be decorated.
     * 
     * Setting @decorated to %FALSE hints the desktop environment
     * that the surface has its own, client-side decorations and
     * does not need to have window decorations added.
     */
    public default void setDecorated(boolean decorated) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_toplevel_set_decorated(HANDLE(), decorated ? 1 : 0);
    }
    
    /**
     * Sets the toplevel to be deletable.
     * 
     * Setting @deletable to %TRUE hints the desktop environment
     * that it should offer the user a way to close the surface.
     */
    public default void setDeletable(boolean deletable) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_toplevel_set_deletable(HANDLE(), deletable ? 1 : 0);
    }
    
    /**
     * Sets a list of icons for the surface.
     * 
     * One of these will be used to represent the surface in iconic form.
     * The icon may be shown in window lists or task bars. Which icon
     * size is shown depends on the window manager. The window manager
     * can scale the icon but setting several size icons can give better
     * image quality.
     * 
     * Note that some platforms don't support surface icons.
     */
    public default void setIconList(org.gtk.glib.List surfaces) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_toplevel_set_icon_list(HANDLE(), surfaces.HANDLE());
    }
    
    /**
     * Sets the toplevel to be modal.
     * 
     * The application can use this hint to tell the
     * window manager that a certain surface has modal
     * behaviour. The window manager can use this information
     * to handle modal surfaces in a special way.
     * 
     * You should only use this on surfaces for which you have
     * previously called [method@Gdk.Toplevel.set_transient_for].
     */
    public default void setModal(boolean modal) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_toplevel_set_modal(HANDLE(), modal ? 1 : 0);
    }
    
    /**
     * Sets the startup notification ID.
     * 
     * When using GTK, typically you should use
     * [method@Gtk.Window.set_startup_id] instead of this
     * low-level function.
     */
    public default void setStartupId(java.lang.String startupId) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_toplevel_set_startup_id(HANDLE(), Interop.getAllocator().allocateUtf8String(startupId));
    }
    
    /**
     * Sets the title of a toplevel surface.
     * 
     * The title maybe be displayed in the titlebar,
     * in lists of windows, etc.
     */
    public default void setTitle(java.lang.String title) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_toplevel_set_title(HANDLE(), Interop.getAllocator().allocateUtf8String(title));
    }
    
    /**
     * Sets a transient-for parent.
     * 
     * Indicates to the window manager that @surface is a transient
     * dialog associated with the application surface @parent. This
     * allows the window manager to do things like center @surface
     * on @parent and keep @surface above @parent.
     * 
     * See [method@Gtk.Window.set_transient_for] if you’re using
     * [class@Gtk.Window] or [class@Gtk.Dialog].
     */
    public default void setTransientFor(Surface parent) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_toplevel_set_transient_for(HANDLE(), parent.HANDLE());
    }
    
    /**
     * Asks the windowing system to show the window menu.
     * 
     * The window menu is the menu shown when right-clicking the titlebar
     * on traditional windows managed by the window manager. This is useful
     * for windows using client-side decorations, activating it with a
     * right-click on the window decorations.
     */
    public default boolean showWindowMenu(Event event) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_toplevel_show_window_menu(HANDLE(), event.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the desktop environment supports
     * tiled window states.
     */
    public default boolean supportsEdgeConstraints() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_toplevel_supports_edge_constraints(HANDLE());
        return (RESULT != 0);
    }
    
    public default boolean titlebarGesture(TitlebarGesture gesture) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_toplevel_titlebar_gesture(HANDLE(), gesture.getValue());
        return (RESULT != 0);
    }
    
    @FunctionalInterface
    public interface ComputeSizeHandler {
        void signalReceived(Toplevel source, ToplevelSize size);
    }
    
    /**
     * Emitted when the size for the surface needs to be computed, when
     * it is present.
     * 
     * It will normally be emitted during or after [method@Gdk.Toplevel.present],
     * depending on the configuration received by the windowing system.
     * It may also be emitted at any other point in time, in response
     * to the windowing system spontaneously changing the configuration.
     * 
     * It is the responsibility of the toplevel user to handle this signal
     * and compute the desired size of the toplevel, given the information
     * passed via the [struct@Gdk.ToplevelSize] object. Failing to do so
     * will result in an arbitrary size being used as a result.
     */
    public default void onComputeSize(ComputeSizeHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalToplevelComputeSize", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("compute-size"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    class ToplevelImpl extends org.gtk.gobject.Object implements Toplevel {
        public ToplevelImpl(io.github.jwharm.javagi.interop.Proxy proxy) {
            super(proxy);
        }
    }
}
