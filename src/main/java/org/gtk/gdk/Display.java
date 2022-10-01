package org.gtk.gdk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GdkDisplay} objects are the GDK representation of a workstation.
 * <p>
 * Their purpose are two-fold:
 * <p>
 * <ul>
 * <li>To manage and provide information about input devices (pointers, keyboards, etc)
 * <li>To manage and provide information about output devices (monitors, projectors, etc)
 * </ul>
 * <p>
 * Most of the input device handling has been factored out into separate
 * {@link Seat} objects. Every display has a one or more seats, which
 * can be accessed with {@link Display#getDefaultSeat} and
 * {@link Display#listSeats}.
 * <p>
 * Output devices are represented by {@link Monitor} objects, which can
 * be accessed with {@link Display#getMonitorAtSurface} and similar APIs.
 */
public class Display extends org.gtk.gobject.Object {

    public Display(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Display */
    public static Display castFrom(org.gtk.gobject.Object gobject) {
        return new Display(gobject.refcounted());
    }
    
    /**
     * Emits a short beep on {@code display}
     */
    public void beep() {
        gtk_h.gdk_display_beep(handle());
    }
    
    /**
     * Closes the connection to the windowing system for the given display.
     * <p>
     * This cleans up associated resources.
     */
    public void close() {
        gtk_h.gdk_display_close(handle());
    }
    
    /**
     * Creates a new {@code GdkGLContext} for the {@code GdkDisplay}.
     * <p>
     * The context is disconnected from any particular surface or surface
     * and cannot be used to draw to any surface. It can only be used to
     * draw to non-surface framebuffers like textures.
     * <p>
     * If the creation of the {@code GdkGLContext} failed, {@code error} will be set.
     * Before using the returned {@code GdkGLContext}, you will need to
     * call {@code Gdk.GLContext.realize}.
     */
    public GLContext createGlContext() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gdk_display_create_gl_context(handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new GLContext(Refcounted.get(RESULT, true));
    }
    
    /**
     * Returns {@code true} if there is an ongoing grab on {@code device} for {@code display}.
     */
    public boolean deviceIsGrabbed(Device device) {
        var RESULT = gtk_h.gdk_display_device_is_grabbed(handle(), device.handle());
        return RESULT != 0;
    }
    
    /**
     * Flushes any requests queued for the windowing system.
     * <p>
     * This happens automatically when the main loop blocks waiting for new events,
     * but if your application is drawing without returning control to the main loop,
     * you may need to call this function explicitly. A common case where this function
     * needs to be called is when an application is executing drawing commands
     * from a thread other than the thread where the main loop is running.
     * <p>
     * This is most useful for X11. On windowing systems where requests are
     * handled synchronously, this function will do nothing.
     */
    public void flush() {
        gtk_h.gdk_display_flush(handle());
    }
    
    /**
     * Returns a {@code GdkAppLaunchContext} suitable for launching
     * applications on the given display.
     */
    public AppLaunchContext getAppLaunchContext() {
        var RESULT = gtk_h.gdk_display_get_app_launch_context(handle());
        return new AppLaunchContext(Refcounted.get(RESULT, true));
    }
    
    /**
     * Gets the clipboard used for copy/paste operations.
     */
    public Clipboard getClipboard() {
        var RESULT = gtk_h.gdk_display_get_clipboard(handle());
        return new Clipboard(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the default {@code GdkSeat} for this display.
     * <p>
     * Note that a display may not have a seat. In this case,
     * this function will return {@code null}.
     */
    public Seat getDefaultSeat() {
        var RESULT = gtk_h.gdk_display_get_default_seat(handle());
        return new Seat(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the monitor in which the largest area of {@code surface}
     * resides.
     * <p>
     * Returns a monitor close to {@code surface} if it is outside
     * of all monitors.
     */
    public Monitor getMonitorAtSurface(Surface surface) {
        var RESULT = gtk_h.gdk_display_get_monitor_at_surface(handle(), surface.handle());
        return new Monitor(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the list of monitors associated with this display.
     * <p>
     * Subsequent calls to this function will always return the
     * same list for the same display.
     * <p>
     * You can listen to the GListModel::items-changed signal on
     * this list to monitor changes to the monitor of this display.
     */
    public org.gtk.gio.ListModel getMonitors() {
        var RESULT = gtk_h.gdk_display_get_monitors(handle());
        return new org.gtk.gio.ListModel.ListModelImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the name of the display.
     */
    public java.lang.String getName() {
        var RESULT = gtk_h.gdk_display_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the clipboard used for the primary selection.
     * <p>
     * On backends where the primary clipboard is not supported natively,
     * GDK emulates this clipboard locally.
     */
    public Clipboard getPrimaryClipboard() {
        var RESULT = gtk_h.gdk_display_get_primary_clipboard(handle());
        return new Clipboard(Refcounted.get(RESULT, false));
    }
    
    /**
     * Retrieves a desktop-wide setting such as double-click time
     * for the {@code display}.
     */
    public boolean getSetting(java.lang.String name, org.gtk.gobject.Value value) {
        var RESULT = gtk_h.gdk_display_get_setting(handle(), Interop.allocateNativeString(name).handle(), value.handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the startup notification ID for a Wayland display, or {@code null}
     * if no ID has been defined.
     */
    public java.lang.String getStartupNotificationId() {
        var RESULT = gtk_h.gdk_display_get_startup_notification_id(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Finds out if the display has been closed.
     */
    public boolean isClosed() {
        var RESULT = gtk_h.gdk_display_is_closed(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns whether surfaces can reasonably be expected to have
     * their alpha channel drawn correctly on the screen.
     * <p>
     * Check {@link Display#isRgba} for whether the display
     * supports an alpha channel.
     * <p>
     * On X11 this function returns whether a compositing manager is
     * compositing on {@code display}.
     * <p>
     * On modern displays, this value is always {@code true}.
     */
    public boolean isComposited() {
        var RESULT = gtk_h.gdk_display_is_composited(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns whether surfaces on this {@code display} are created with an
     * alpha channel.
     * <p>
     * Even if a {@code true} is returned, it is possible that the
     * surface’s alpha channel won’t be honored when displaying the
     * surface on the screen: in particular, for X an appropriate
     * windowing manager and compositing manager must be running to
     * provide appropriate display. Use {@link Display#isComposited}
     * to check if that is the case.
     * <p>
     * On modern displays, this value is always {@code true}.
     */
    public boolean isRgba() {
        var RESULT = gtk_h.gdk_display_is_rgba(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns the list of seats known to {@code display}.
     */
    public org.gtk.glib.List listSeats() {
        var RESULT = gtk_h.gdk_display_list_seats(handle());
        return new org.gtk.glib.List(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the keyvals bound to {@code keycode}.
     * <p>
     * The Nth {@code GdkKeymapKey} in {@code keys} is bound to the Nth keyval in {@code keyvals}.
     * <p>
     * When a keycode is pressed by the user, the keyval from
     * this list of entries is selected by considering the effective
     * keyboard group and level.
     * <p>
     * Free the returned arrays with g_free().
     */
    public boolean mapKeycode(int keycode, KeymapKey[] keys, int[] keyvals, PointerInteger nEntries) {
        var RESULT = gtk_h.gdk_display_map_keycode(handle(), keycode, Interop.allocateNativeArray(keys).handle(), Interop.allocateNativeArray(keyvals).handle(), nEntries.handle());
        return RESULT != 0;
    }
    
    /**
     * Obtains a list of keycode/group/level combinations that will
     * generate {@code keyval}.
     * <p>
     * Groups and levels are two kinds of keyboard mode; in general, the level
     * determines whether the top or bottom symbol on a key is used, and the
     * group determines whether the left or right symbol is used.
     * <p>
     * On US keyboards, the shift key changes the keyboard level, and there
     * are no groups. A group switch key might convert a keyboard between
     * Hebrew to English modes, for example.
     * <p>
     * {@code GdkEventKey} contains a {@code group} field that indicates the active
     * keyboard group. The level is computed from the modifier mask.
     * <p>
     * The returned array should be freed with g_free().
     */
    public boolean mapKeyval(int keyval, KeymapKey[] keys, PointerInteger nKeys) {
        var RESULT = gtk_h.gdk_display_map_keyval(handle(), keyval, Interop.allocateNativeArray(keys).handle(), nKeys.handle());
        return RESULT != 0;
    }
    
    /**
     * Indicates to the GUI environment that the application has
     * finished loading, using a given identifier.
     * <p>
     * GTK will call this function automatically for {@link org.gtk.gtk.Window}
     * with custom startup-notification identifier unless
     * {@link org.gtk.gtk.Window#setAutoStartupNotification}
     * is called to disable that feature.
     */
    public void notifyStartupComplete(java.lang.String startupId) {
        gtk_h.gdk_display_notify_startup_complete(handle(), Interop.allocateNativeString(startupId).handle());
    }
    
    /**
     * Checks that OpenGL is available for {@code self} and ensures that it is
     * properly initialized.
     * When this fails, an {@code error} will be set describing the error and this
     * function returns {@code false}.
     * <p>
     * Note that even if this function succeeds, creating a {@code GdkGLContext}
     * may still fail.
     * <p>
     * This function is idempotent. Calling it multiple times will just
     * return the same value or error.
     * <p>
     * You never need to call this function, GDK will call it automatically
     * as needed. But you can use it as a check when setting up code that
     * might make use of OpenGL.
     */
    public boolean prepareGl() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gdk_display_prepare_gl(handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Appends the given event onto the front of the event
     * queue for {@code display}.
     * <p>
     * This function is only useful in very special situations
     * and should not be used by applications.
     */
    public void putEvent(Event event) {
        gtk_h.gdk_display_put_event(handle(), event.handle());
    }
    
    /**
     * Returns {@code true} if the display supports input shapes.
     * <p>
     * This means that {@link Surface#setInputRegion} can
     * be used to modify the input shape of surfaces on {@code display}.
     * <p>
     * On modern displays, this value is always {@code true}.
     */
    public boolean supportsInputShapes() {
        var RESULT = gtk_h.gdk_display_supports_input_shapes(handle());
        return RESULT != 0;
    }
    
    /**
     * Flushes any requests queued for the windowing system and waits until all
     * requests have been handled.
     * <p>
     * This is often used for making sure that the display is synchronized
     * with the current state of the program. Calling {@link Display#sync}
     * before {@link null.Display#errorTrapPop} makes sure that any errors
     * generated from earlier requests are handled before the error trap is removed.
     * <p>
     * This is most useful for X11. On windowing systems where requests are
     * handled synchronously, this function will do nothing.
     */
    public void sync() {
        gtk_h.gdk_display_sync(handle());
    }
    
    /**
     * Translates the contents of a {@code GdkEventKey} into a keyval, effective group,
     * and level.
     * <p>
     * Modifiers that affected the translation and are thus unavailable for
     * application use are returned in {@code consumed_modifiers}.
     * <p>
     * The {@code effective_group} is the group that was actually used for the
     * translation; some keys such as Enter are not affected by the active
     * keyboard group. The {@code level} is derived from {@code state}.
     * <p>
     * {@code consumed_modifiers} gives modifiers that should be masked out
     * from {@code state} when comparing this key press to a keyboard shortcut.
     * For instance, on a US keyboard, the {@code plus} symbol is shifted, so
     * when comparing a key press to a {@code <Control>plus} accelerator {@code <Shift>}
     * should be masked out.
     * <p>
     * This function should rarely be needed, since {@code GdkEventKey} already
     * contains the translated keyval. It is exported for the benefit of
     * virtualized test environments.
     */
    public boolean translateKey(int keycode, ModifierType state, int group, PointerInteger keyval, PointerInteger effectiveGroup, PointerInteger level, ModifierType consumed) {
        var RESULT = gtk_h.gdk_display_translate_key(handle(), keycode, state.getValue(), group, keyval.handle(), effectiveGroup.handle(), level.handle(), new PointerInteger(consumed.getValue()).handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the default {@code GdkDisplay}.
     * <p>
     * This is a convenience function for:
     * <p>
     *     gdk_display_manager_get_default_display (gdk_display_manager_get ())
     */
    public static Display getDefault() {
        var RESULT = gtk_h.gdk_display_get_default();
        return new Display(Refcounted.get(RESULT, false));
    }
    
    /**
     * Opens a display.
     * <p>
     * If opening the display fails, {@code NULL} is returned.
     */
    public static Display open(java.lang.String displayName) {
        var RESULT = gtk_h.gdk_display_open(Interop.allocateNativeString(displayName).handle());
        return new Display(Refcounted.get(RESULT, false));
    }
    
    @FunctionalInterface
    public interface ClosedHandler {
        void signalReceived(Display source, boolean isError);
    }
    
    /**
     * Emitted when the connection to the windowing system for {@code display} is closed.
     */
    public SignalHandle onClosed(ClosedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("closed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Display.Callbacks.class, "signalDisplayClosed",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface OpenedHandler {
        void signalReceived(Display source);
    }
    
    /**
     * Emitted when the connection to the windowing system for {@code display} is opened.
     */
    public SignalHandle onOpened(OpenedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("opened").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Display.Callbacks.class, "signalDisplayOpened",
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
    
    @FunctionalInterface
    public interface SeatAddedHandler {
        void signalReceived(Display source, Seat seat);
    }
    
    /**
     * Emitted whenever a new seat is made known to the windowing system.
     */
    public SignalHandle onSeatAdded(SeatAddedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("seat-added").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Display.Callbacks.class, "signalDisplaySeatAdded",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
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
    public SignalHandle onSeatRemoved(SeatRemovedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("seat-removed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Display.Callbacks.class, "signalDisplaySeatRemoved",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
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
    public SignalHandle onSettingChanged(SettingChangedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("setting-changed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Display.Callbacks.class, "signalDisplaySettingChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static class Callbacks {
    
        public static void signalDisplayClosed(MemoryAddress source, int isError, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Display.ClosedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Display(Refcounted.get(source)), isError != 0);
        }
        
        public static void signalDisplayOpened(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Display.OpenedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Display(Refcounted.get(source)));
        }
        
        public static void signalDisplaySeatAdded(MemoryAddress source, MemoryAddress seat, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Display.SeatAddedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Display(Refcounted.get(source)), new Seat(Refcounted.get(seat, false)));
        }
        
        public static void signalDisplaySeatRemoved(MemoryAddress source, MemoryAddress seat, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Display.SeatRemovedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Display(Refcounted.get(source)), new Seat(Refcounted.get(seat, false)));
        }
        
        public static void signalDisplaySettingChanged(MemoryAddress source, MemoryAddress setting, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Display.SettingChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Display(Refcounted.get(source)), setting.getUtf8String(0));
        }
        
    }
}
