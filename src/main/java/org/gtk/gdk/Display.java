package org.gtk.gdk;

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
    
    static final MethodHandle gdk_display_beep = Interop.downcallHandle(
        "gdk_display_beep",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Emits a short beep on {@code display}
     */
    public void beep() {
        try {
            gdk_display_beep.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_display_close = Interop.downcallHandle(
        "gdk_display_close",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Closes the connection to the windowing system for the given display.
     * <p>
     * This cleans up associated resources.
     */
    public void close() {
        try {
            gdk_display_close.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_display_create_gl_context = Interop.downcallHandle(
        "gdk_display_create_gl_context",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (MemoryAddress) gdk_display_create_gl_context.invokeExact(handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new GLContext(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_display_device_is_grabbed = Interop.downcallHandle(
        "gdk_display_device_is_grabbed",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if there is an ongoing grab on {@code device} for {@code display}.
     */
    public boolean deviceIsGrabbed(Device device) {
        try {
            var RESULT = (int) gdk_display_device_is_grabbed.invokeExact(handle(), device.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_display_flush = Interop.downcallHandle(
        "gdk_display_flush",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
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
        try {
            gdk_display_flush.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_display_get_app_launch_context = Interop.downcallHandle(
        "gdk_display_get_app_launch_context",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a {@code GdkAppLaunchContext} suitable for launching
     * applications on the given display.
     */
    public AppLaunchContext getAppLaunchContext() {
        try {
            var RESULT = (MemoryAddress) gdk_display_get_app_launch_context.invokeExact(handle());
            return new AppLaunchContext(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_display_get_clipboard = Interop.downcallHandle(
        "gdk_display_get_clipboard",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the clipboard used for copy/paste operations.
     */
    public Clipboard getClipboard() {
        try {
            var RESULT = (MemoryAddress) gdk_display_get_clipboard.invokeExact(handle());
            return new Clipboard(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_display_get_default_seat = Interop.downcallHandle(
        "gdk_display_get_default_seat",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the default {@code GdkSeat} for this display.
     * <p>
     * Note that a display may not have a seat. In this case,
     * this function will return {@code null}.
     */
    public Seat getDefaultSeat() {
        try {
            var RESULT = (MemoryAddress) gdk_display_get_default_seat.invokeExact(handle());
            return new Seat(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_display_get_monitor_at_surface = Interop.downcallHandle(
        "gdk_display_get_monitor_at_surface",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the monitor in which the largest area of {@code surface}
     * resides.
     * <p>
     * Returns a monitor close to {@code surface} if it is outside
     * of all monitors.
     */
    public Monitor getMonitorAtSurface(Surface surface) {
        try {
            var RESULT = (MemoryAddress) gdk_display_get_monitor_at_surface.invokeExact(handle(), surface.handle());
            return new Monitor(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_display_get_monitors = Interop.downcallHandle(
        "gdk_display_get_monitors",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (MemoryAddress) gdk_display_get_monitors.invokeExact(handle());
            return new org.gtk.gio.ListModel.ListModelImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_display_get_name = Interop.downcallHandle(
        "gdk_display_get_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the name of the display.
     */
    public java.lang.String getName() {
        try {
            var RESULT = (MemoryAddress) gdk_display_get_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_display_get_primary_clipboard = Interop.downcallHandle(
        "gdk_display_get_primary_clipboard",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the clipboard used for the primary selection.
     * <p>
     * On backends where the primary clipboard is not supported natively,
     * GDK emulates this clipboard locally.
     */
    public Clipboard getPrimaryClipboard() {
        try {
            var RESULT = (MemoryAddress) gdk_display_get_primary_clipboard.invokeExact(handle());
            return new Clipboard(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_display_get_setting = Interop.downcallHandle(
        "gdk_display_get_setting",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves a desktop-wide setting such as double-click time
     * for the {@code display}.
     */
    public boolean getSetting(java.lang.String name, org.gtk.gobject.Value value) {
        try {
            var RESULT = (int) gdk_display_get_setting.invokeExact(handle(), Interop.allocateNativeString(name).handle(), value.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_display_get_startup_notification_id = Interop.downcallHandle(
        "gdk_display_get_startup_notification_id",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the startup notification ID for a Wayland display, or {@code null}
     * if no ID has been defined.
     */
    public java.lang.String getStartupNotificationId() {
        try {
            var RESULT = (MemoryAddress) gdk_display_get_startup_notification_id.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_display_is_closed = Interop.downcallHandle(
        "gdk_display_is_closed",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds out if the display has been closed.
     */
    public boolean isClosed() {
        try {
            var RESULT = (int) gdk_display_is_closed.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_display_is_composited = Interop.downcallHandle(
        "gdk_display_is_composited",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (int) gdk_display_is_composited.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_display_is_rgba = Interop.downcallHandle(
        "gdk_display_is_rgba",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (int) gdk_display_is_rgba.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_display_list_seats = Interop.downcallHandle(
        "gdk_display_list_seats",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the list of seats known to {@code display}.
     */
    public org.gtk.glib.List listSeats() {
        try {
            var RESULT = (MemoryAddress) gdk_display_list_seats.invokeExact(handle());
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_display_map_keycode = Interop.downcallHandle(
        "gdk_display_map_keycode",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (int) gdk_display_map_keycode.invokeExact(handle(), keycode, Interop.allocateNativeArray(keys).handle(), Interop.allocateNativeArray(keyvals).handle(), nEntries.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_display_map_keyval = Interop.downcallHandle(
        "gdk_display_map_keyval",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (int) gdk_display_map_keyval.invokeExact(handle(), keyval, Interop.allocateNativeArray(keys).handle(), nKeys.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_display_notify_startup_complete = Interop.downcallHandle(
        "gdk_display_notify_startup_complete",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            gdk_display_notify_startup_complete.invokeExact(handle(), Interop.allocateNativeString(startupId).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_display_prepare_gl = Interop.downcallHandle(
        "gdk_display_prepare_gl",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (int) gdk_display_prepare_gl.invokeExact(handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_display_put_event = Interop.downcallHandle(
        "gdk_display_put_event",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Appends the given event onto the front of the event
     * queue for {@code display}.
     * <p>
     * This function is only useful in very special situations
     * and should not be used by applications.
     */
    public void putEvent(Event event) {
        try {
            gdk_display_put_event.invokeExact(handle(), event.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_display_supports_input_shapes = Interop.downcallHandle(
        "gdk_display_supports_input_shapes",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if the display supports input shapes.
     * <p>
     * This means that {@link Surface#setInputRegion} can
     * be used to modify the input shape of surfaces on {@code display}.
     * <p>
     * On modern displays, this value is always {@code true}.
     */
    public boolean supportsInputShapes() {
        try {
            var RESULT = (int) gdk_display_supports_input_shapes.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_display_sync = Interop.downcallHandle(
        "gdk_display_sync",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
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
        try {
            gdk_display_sync.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_display_translate_key = Interop.downcallHandle(
        "gdk_display_translate_key",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
        try {
            var RESULT = (int) gdk_display_translate_key.invokeExact(handle(), keycode, state.getValue(), group, keyval.handle(), effectiveGroup.handle(), level.handle(), new PointerInteger(consumed.getValue()).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_display_get_default = Interop.downcallHandle(
        "gdk_display_get_default",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the default {@code GdkDisplay}.
     * <p>
     * This is a convenience function for:
     * <p>
     *     gdk_display_manager_get_default_display (gdk_display_manager_get ())
     */
    public static Display getDefault() {
        try {
            var RESULT = (MemoryAddress) gdk_display_get_default.invokeExact();
            return new Display(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_display_open = Interop.downcallHandle(
        "gdk_display_open",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Opens a display.
     * <p>
     * If opening the display fails, {@code NULL} is returned.
     */
    public static Display open(java.lang.String displayName) {
        try {
            var RESULT = (MemoryAddress) gdk_display_open.invokeExact(Interop.allocateNativeString(displayName).handle());
            return new Display(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("closed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Display.Callbacks.class, "signalDisplayClosed",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("opened").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Display.Callbacks.class, "signalDisplayOpened",
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
    public interface SeatAddedHandler {
        void signalReceived(Display source, Seat seat);
    }
    
    /**
     * Emitted whenever a new seat is made known to the windowing system.
     */
    public SignalHandle onSeatAdded(SeatAddedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("seat-added").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Display.Callbacks.class, "signalDisplaySeatAdded",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("seat-removed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Display.Callbacks.class, "signalDisplaySeatRemoved",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("setting-changed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Display.Callbacks.class, "signalDisplaySettingChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
