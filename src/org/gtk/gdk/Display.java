package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GdkDisplay` objects are the GDK representation of a workstation.
 * 
 * Their purpose are two-fold:
 * 
 * - To manage and provide information about input devices (pointers, keyboards, etc)
 * - To manage and provide information about output devices (monitors, projectors, etc)
 * 
 * Most of the input device handling has been factored out into separate
 * [class@Gdk.Seat] objects. Every display has a one or more seats, which
 * can be accessed with [method@Gdk.Display.get_default_seat] and
 * [method@Gdk.Display.list_seats].
 * 
 * Output devices are represented by [class@Gdk.Monitor] objects, which can
 * be accessed with [method@Gdk.Display.get_monitor_at_surface] and similar APIs.
 */
public class Display extends org.gtk.gobject.Object {

    public Display(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to Display */
    public static Display castFrom(org.gtk.gobject.Object gobject) {
        return new Display(gobject.getProxy());
    }
    
    /**
     * Emits a short beep on @display
     */
    public void beep() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_display_beep(HANDLE());
    }
    
    /**
     * Closes the connection to the windowing system for the given display.
     * 
     * This cleans up associated resources.
     */
    public void close() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_display_close(HANDLE());
    }
    
    /**
     * Creates a new `GdkGLContext` for the `GdkDisplay`.
     * 
     * The context is disconnected from any particular surface or surface
     * and cannot be used to draw to any surface. It can only be used to
     * draw to non-surface framebuffers like textures.
     * 
     * If the creation of the `GdkGLContext` failed, @error will be set.
     * Before using the returned `GdkGLContext`, you will need to
     * call [method@Gdk.GLContext.make_current] or [method@Gdk.GLContext.realize].
     */
    public GLContext createGlContext() throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_display_create_gl_context(HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new GLContext(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Returns %TRUE if there is an ongoing grab on @device for @display.
     */
    public boolean deviceIsGrabbed(Device device) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_display_device_is_grabbed(HANDLE(), device.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Flushes any requests queued for the windowing system.
     * 
     * This happens automatically when the main loop blocks waiting for new events,
     * but if your application is drawing without returning control to the main loop,
     * you may need to call this function explicitly. A common case where this function
     * needs to be called is when an application is executing drawing commands
     * from a thread other than the thread where the main loop is running.
     * 
     * This is most useful for X11. On windowing systems where requests are
     * handled synchronously, this function will do nothing.
     */
    public void flush() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_display_flush(HANDLE());
    }
    
    /**
     * Returns a `GdkAppLaunchContext` suitable for launching
     * applications on the given display.
     */
    public AppLaunchContext getAppLaunchContext() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_display_get_app_launch_context(HANDLE());
        return new AppLaunchContext(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Gets the clipboard used for copy/paste operations.
     */
    public Clipboard getClipboard() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_display_get_clipboard(HANDLE());
        return new Clipboard(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Returns the default `GdkSeat` for this display.
     * 
     * Note that a display may not have a seat. In this case,
     * this function will return %NULL.
     */
    public Seat getDefaultSeat() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_display_get_default_seat(HANDLE());
        return new Seat(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Gets the monitor in which the largest area of @surface
     * resides.
     * 
     * Returns a monitor close to @surface if it is outside
     * of all monitors.
     */
    public Monitor getMonitorAtSurface(Surface surface) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_display_get_monitor_at_surface(HANDLE(), surface.HANDLE());
        return new Monitor(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Gets the list of monitors associated with this display.
     * 
     * Subsequent calls to this function will always return the
     * same list for the same display.
     * 
     * You can listen to the GListModel::items-changed signal on
     * this list to monitor changes to the monitor of this display.
     */
    public org.gtk.gio.ListModel getMonitors() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_display_get_monitors(HANDLE());
        return new org.gtk.gio.ListModel.ListModelImpl(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Gets the name of the display.
     */
    public java.lang.String getName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_display_get_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the clipboard used for the primary selection.
     * 
     * On backends where the primary clipboard is not supported natively,
     * GDK emulates this clipboard locally.
     */
    public Clipboard getPrimaryClipboard() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_display_get_primary_clipboard(HANDLE());
        return new Clipboard(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Retrieves a desktop-wide setting such as double-click time
     * for the @display.
     */
    public boolean getSetting(java.lang.String name, org.gtk.gobject.Value value) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_display_get_setting(HANDLE(), Interop.getAllocator().allocateUtf8String(name), value.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the startup notification ID for a Wayland display, or %NULL
     * if no ID has been defined.
     */
    public java.lang.String getStartupNotificationId() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_display_get_startup_notification_id(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Finds out if the display has been closed.
     */
    public boolean isClosed() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_display_is_closed(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether surfaces can reasonably be expected to have
     * their alpha channel drawn correctly on the screen.
     * 
     * Check [method@Gdk.Display.is_rgba] for whether the display
     * supports an alpha channel.
     * 
     * On X11 this function returns whether a compositing manager is
     * compositing on @display.
     * 
     * On modern displays, this value is always %TRUE.
     */
    public boolean isComposited() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_display_is_composited(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether surfaces on this @display are created with an
     * alpha channel.
     * 
     * Even if a %TRUE is returned, it is possible that the
     * surface’s alpha channel won’t be honored when displaying the
     * surface on the screen: in particular, for X an appropriate
     * windowing manager and compositing manager must be running to
     * provide appropriate display. Use [method@Gdk.Display.is_composited]
     * to check if that is the case.
     * 
     * On modern displays, this value is always %TRUE.
     */
    public boolean isRgba() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_display_is_rgba(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns the list of seats known to @display.
     */
    public org.gtk.glib.List listSeats() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_display_list_seats(HANDLE());
        return new org.gtk.glib.List(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Indicates to the GUI environment that the application has
     * finished loading, using a given identifier.
     * 
     * GTK will call this function automatically for [class@Gtk.Window]
     * with custom startup-notification identifier unless
     * [method@Gtk.Window.set_auto_startup_notification]
     * is called to disable that feature.
     */
    public void notifyStartupComplete(java.lang.String startupId) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_display_notify_startup_complete(HANDLE(), Interop.getAllocator().allocateUtf8String(startupId));
    }
    
    /**
     * Checks that OpenGL is available for @self and ensures that it is
     * properly initialized.
     * When this fails, an @error will be set describing the error and this
     * function returns %FALSE.
     * 
     * Note that even if this function succeeds, creating a `GdkGLContext`
     * may still fail.
     * 
     * This function is idempotent. Calling it multiple times will just
     * return the same value or error.
     * 
     * You never need to call this function, GDK will call it automatically
     * as needed. But you can use it as a check when setting up code that
     * might make use of OpenGL.
     */
    public boolean prepareGl() throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_display_prepare_gl(HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Appends the given event onto the front of the event
     * queue for @display.
     * 
     * This function is only useful in very special situations
     * and should not be used by applications.
     */
    public void putEvent(Event event) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_display_put_event(HANDLE(), event.HANDLE());
    }
    
    /**
     * Returns %TRUE if the display supports input shapes.
     * 
     * This means that [method@Gdk.Surface.set_input_region] can
     * be used to modify the input shape of surfaces on @display.
     * 
     * On modern displays, this value is always %TRUE.
     */
    public boolean supportsInputShapes() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_display_supports_input_shapes(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Flushes any requests queued for the windowing system and waits until all
     * requests have been handled.
     * 
     * This is often used for making sure that the display is synchronized
     * with the current state of the program. Calling [method@Gdk.Display.sync]
     * before [method@GdkX11.Display.error_trap_pop] makes sure that any errors
     * generated from earlier requests are handled before the error trap is removed.
     * 
     * This is most useful for X11. On windowing systems where requests are
     * handled synchronously, this function will do nothing.
     */
    public void sync() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_display_sync(HANDLE());
    }
    
    @FunctionalInterface
    public interface ClosedHandler {
        void signalReceived(Display source, boolean isError);
    }
    
    /**
     * Emitted when the connection to the windowing system for @display is closed.
     */
    public void onClosed(ClosedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, boolean.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDisplayClosed", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("closed"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface OpenedHandler {
        void signalReceived(Display source);
    }
    
    /**
     * Emitted when the connection to the windowing system for @display is opened.
     */
    public void onOpened(OpenedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDisplayOpened", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("opened"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface SeatAddedHandler {
        void signalReceived(Display source, Seat seat);
    }
    
    /**
     * Emitted whenever a new seat is made known to the windowing system.
     */
    public void onSeatAdded(SeatAddedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDisplaySeatAdded", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("seat-added"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface SeatRemovedHandler {
        void signalReceived(Display source, Seat seat);
    }
    
    /**
     * Emitted whenever a seat is removed by the windowing system.
     */
    public void onSeatRemoved(SeatRemovedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDisplaySeatRemoved", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("seat-removed"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface SettingChangedHandler {
        void signalReceived(Display source, java.lang.String setting);
    }
    
    /**
     * Emitted whenever a setting changes its value.
     */
    public void onSettingChanged(SettingChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDisplaySettingChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("setting-changed"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
