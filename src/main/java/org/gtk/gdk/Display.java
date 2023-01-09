package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GdkDisplay} objects are the GDK representation of a workstation.
 * <p>
 * Their purpose are two-fold:
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
public class Display extends org.gtk.gobject.GObject {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkDisplay";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Display proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Display(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Display> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Display(input);
    
    /**
     * Emits a short beep on {@code display}
     */
    public void beep() {
        try {
            DowncallHandles.gdk_display_beep.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Closes the connection to the windowing system for the given display.
     * <p>
     * This cleans up associated resources.
     */
    public void close() {
        try {
            DowncallHandles.gdk_display_close.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * call {@link GLContext#makeCurrent} or {@link GLContext#realize}.
     * @return the newly created {@code GdkGLContext}
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.gdk.GLContext createGlContext() throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gdk_display_create_gl_context.invokeExact(handle(),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            var OBJECT = (org.gtk.gdk.GLContext) Interop.register(RESULT, org.gtk.gdk.GLContext.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Returns {@code true} if there is an ongoing grab on {@code device} for {@code display}.
     * @param device a {@code GdkDevice}
     * @return {@code true} if there is a grab in effect for {@code device}.
     */
    public boolean deviceIsGrabbed(org.gtk.gdk.Device device) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_display_device_is_grabbed.invokeExact(
                    handle(),
                    device.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        try {
            DowncallHandles.gdk_display_flush.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns a {@code GdkAppLaunchContext} suitable for launching
     * applications on the given display.
     * @return a new {@code GdkAppLaunchContext} for {@code display}
     */
    public org.gtk.gdk.AppLaunchContext getAppLaunchContext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_display_get_app_launch_context.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gtk.gdk.AppLaunchContext) Interop.register(RESULT, org.gtk.gdk.AppLaunchContext.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets the clipboard used for copy/paste operations.
     * @return the display's clipboard
     */
    public org.gtk.gdk.Clipboard getClipboard() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_display_get_clipboard.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Clipboard) Interop.register(RESULT, org.gtk.gdk.Clipboard.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Returns the default {@code GdkSeat} for this display.
     * <p>
     * Note that a display may not have a seat. In this case,
     * this function will return {@code null}.
     * @return the default seat.
     */
    public @Nullable org.gtk.gdk.Seat getDefaultSeat() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_display_get_default_seat.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Seat) Interop.register(RESULT, org.gtk.gdk.Seat.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the monitor in which the largest area of {@code surface}
     * resides.
     * <p>
     * Returns a monitor close to {@code surface} if it is outside
     * of all monitors.
     * @param surface a {@code GdkSurface}
     * @return the monitor with the largest
     *   overlap with {@code surface}
     */
    public org.gtk.gdk.Monitor getMonitorAtSurface(org.gtk.gdk.Surface surface) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_display_get_monitor_at_surface.invokeExact(
                    handle(),
                    surface.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Monitor) Interop.register(RESULT, org.gtk.gdk.Monitor.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the list of monitors associated with this display.
     * <p>
     * Subsequent calls to this function will always return the
     * same list for the same display.
     * <p>
     * You can listen to the GListModel::items-changed signal on
     * this list to monitor changes to the monitor of this display.
     * @return a {@code GListModel} of {@code GdkMonitor}
     */
    public org.gtk.gio.ListModel getMonitors() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_display_get_monitors.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.ListModel) Interop.register(RESULT, org.gtk.gio.ListModel.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the name of the display.
     * @return a string representing the display name. This string is owned
     *   by GDK and should not be modified or freed.
     */
    public java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_display_get_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the clipboard used for the primary selection.
     * <p>
     * On backends where the primary clipboard is not supported natively,
     * GDK emulates this clipboard locally.
     * @return the primary clipboard
     */
    public org.gtk.gdk.Clipboard getPrimaryClipboard() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_display_get_primary_clipboard.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Clipboard) Interop.register(RESULT, org.gtk.gdk.Clipboard.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Retrieves a desktop-wide setting such as double-click time
     * for the {@code display}.
     * @param name the name of the setting
     * @param value location to store the value of the setting
     * @return {@code true} if the setting existed and a value was stored
     *   in {@code value}, {@code false} otherwise
     */
    public boolean getSetting(java.lang.String name, org.gtk.gobject.Value value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gdk_display_get_setting.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        value.handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Gets the startup notification ID for a Wayland display, or {@code null}
     * if no ID has been defined.
     * @return the startup notification ID for {@code display}
     */
    public @Nullable java.lang.String getStartupNotificationId() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_display_get_startup_notification_id.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Finds out if the display has been closed.
     * @return {@code true} if the display is closed.
     */
    public boolean isClosed() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_display_is_closed.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
     * @return Whether surfaces with RGBA visuals can reasonably
     *   be expected to have their alpha channels drawn correctly
     *   on the screen.
     */
    public boolean isComposited() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_display_is_composited.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
     * @return {@code true} if surfaces are created with an alpha channel or
     *   {@code false} if the display does not support this functionality.
     */
    public boolean isRgba() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_display_is_rgba.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the list of seats known to {@code display}.
     * @return the
     *   list of seats known to the {@code GdkDisplay}
     */
    public org.gtk.glib.List listSeats() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_display_list_seats.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, null);
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
     * @param keycode a keycode
     * @param keys return
     *   location for array of {@code GdkKeymapKey}
     * @param keyvals return
     *   location for array of keyvals
     * @param nEntries length of {@code keys} and {@code keyvals}
     * @return {@code true} if there were any entries
     */
    public boolean mapKeycode(int keycode, @Nullable Out<org.gtk.gdk.KeymapKey[]> keys, Out<int[]> keyvals, Out<Integer> nEntries) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment keysPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment keyvalsPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment nEntriesPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gdk_display_map_keycode.invokeExact(
                        handle(),
                        keycode,
                        (Addressable) (keys == null ? MemoryAddress.NULL : (Addressable) keysPOINTER.address()),
                        (Addressable) (keyvals == null ? MemoryAddress.NULL : (Addressable) keyvalsPOINTER.address()),
                        (Addressable) nEntriesPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    nEntries.set(nEntriesPOINTER.get(Interop.valueLayout.C_INT, 0));
            org.gtk.gdk.KeymapKey[] keysARRAY = new org.gtk.gdk.KeymapKey[nEntries.get().intValue()];
            for (int I = 0; I < nEntries.get().intValue(); I++) {
                var OBJ = keysPOINTER.get(Interop.valueLayout.ADDRESS, I);
                keysARRAY[I] = org.gtk.gdk.KeymapKey.fromAddress.marshal(OBJ, null);
                }
            keys.set(keysARRAY);
            keyvals.set(MemorySegment.ofAddress(keyvalsPOINTER.get(Interop.valueLayout.ADDRESS, 0), nEntries.get().intValue() * Interop.valueLayout.C_INT.byteSize(), SCOPE).toArray(Interop.valueLayout.C_INT));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
     * @param keyval a keyval, such as {@code GDK_KEY_a}, {@code GDK_KEY_Up}, {@code GDK_KEY_Return}, etc.
     * @param keys return location
     *   for an array of {@code GdkKeymapKey}
     * @param nKeys return location for number of elements in returned array
     * @return {@code true} if keys were found and returned
     */
    public boolean mapKeyval(int keyval, Out<org.gtk.gdk.KeymapKey[]> keys, Out<Integer> nKeys) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment keysPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment nKeysPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gdk_display_map_keyval.invokeExact(
                        handle(),
                        keyval,
                        (Addressable) keysPOINTER.address(),
                        (Addressable) nKeysPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    nKeys.set(nKeysPOINTER.get(Interop.valueLayout.C_INT, 0));
            org.gtk.gdk.KeymapKey[] keysARRAY = new org.gtk.gdk.KeymapKey[nKeys.get().intValue()];
            for (int I = 0; I < nKeys.get().intValue(); I++) {
                var OBJ = keysPOINTER.get(Interop.valueLayout.ADDRESS, I);
                keysARRAY[I] = org.gtk.gdk.KeymapKey.fromAddress.marshal(OBJ, null);
                }
            keys.set(keysARRAY);
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Indicates to the GUI environment that the application has
     * finished loading, using a given identifier.
     * <p>
     * GTK will call this function automatically for {@link org.gtk.gtk.Window}
     * with custom startup-notification identifier unless
     * {@link org.gtk.gtk.Window#setAutoStartupNotification}
     * is called to disable that feature.
     * @param startupId a startup-notification identifier, for which
     *   notification process should be completed
     */
    public void notifyStartupComplete(java.lang.String startupId) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gdk_display_notify_startup_complete.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(startupId, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
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
     * @return {@code true} if the display supports OpenGL
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean prepareGl() throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gdk_display_prepare_gl.invokeExact(handle(),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Appends the given event onto the front of the event
     * queue for {@code display}.
     * <p>
     * This function is only useful in very special situations
     * and should not be used by applications.
     * @param event a {@code GdkEvent}
     */
    public void putEvent(org.gtk.gdk.Event event) {
        try {
            DowncallHandles.gdk_display_put_event.invokeExact(
                    handle(),
                    event.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns {@code true} if the display supports input shapes.
     * <p>
     * This means that {@link Surface#setInputRegion} can
     * be used to modify the input shape of surfaces on {@code display}.
     * <p>
     * On modern displays, this value is always {@code true}.
     * @return {@code true} if surfaces with modified input shape are supported
     */
    public boolean supportsInputShapes() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_display_supports_input_shapes.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Flushes any requests queued for the windowing system and waits until all
     * requests have been handled.
     * <p>
     * This is often used for making sure that the display is synchronized
     * with the current state of the program. Calling {@link Display#sync}
     * before {@code GdkX11.Display#errorTrapPop} makes sure that any errors
     * generated from earlier requests are handled before the error trap is removed.
     * <p>
     * This is most useful for X11. On windowing systems where requests are
     * handled synchronously, this function will do nothing.
     */
    public void sync() {
        try {
            DowncallHandles.gdk_display_sync.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param keycode a keycode
     * @param state a modifier state
     * @param group active keyboard group
     * @param keyval return location for keyval
     * @param effectiveGroup return location for effective group
     * @param level return location for level
     * @param consumed return location for modifiers that were used
     *   to determine the group or level
     * @return {@code true} if there was a keyval bound to keycode/state/group.
     */
    public boolean translateKey(int keycode, org.gtk.gdk.ModifierType state, int group, Out<Integer> keyval, Out<Integer> effectiveGroup, Out<Integer> level, @Nullable Out<org.gtk.gdk.ModifierType> consumed) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment keyvalPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment effectiveGroupPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment levelPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment consumedPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gdk_display_translate_key.invokeExact(
                        handle(),
                        keycode,
                        state.getValue(),
                        group,
                        (Addressable) (keyval == null ? MemoryAddress.NULL : (Addressable) keyvalPOINTER.address()),
                        (Addressable) (effectiveGroup == null ? MemoryAddress.NULL : (Addressable) effectiveGroupPOINTER.address()),
                        (Addressable) (level == null ? MemoryAddress.NULL : (Addressable) levelPOINTER.address()),
                        (Addressable) (consumed == null ? MemoryAddress.NULL : (Addressable) consumedPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (keyval != null) keyval.set(keyvalPOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (effectiveGroup != null) effectiveGroup.set(effectiveGroupPOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (level != null) level.set(levelPOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (consumed != null) consumed.set(new org.gtk.gdk.ModifierType(consumedPOINTER.get(Interop.valueLayout.C_INT, 0)));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_display_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Gets the default {@code GdkDisplay}.
     * <p>
     * This is a convenience function for:
     * <p>
     *     gdk_display_manager_get_default_display (gdk_display_manager_get ())
     * @return a {@code GdkDisplay}, or {@code null} if
     *   there is no default display
     */
    public static @Nullable org.gtk.gdk.Display getDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_display_get_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Display) Interop.register(RESULT, org.gtk.gdk.Display.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Opens a display.
     * <p>
     * If opening the display fails, {@code NULL} is returned.
     * @param displayName the name of the display to open
     * @return a {@code GdkDisplay}
     */
    public static @Nullable org.gtk.gdk.Display open(java.lang.String displayName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gdk_display_open.invokeExact(Marshal.stringToAddress.marshal(displayName, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return (org.gtk.gdk.Display) Interop.register(RESULT, org.gtk.gdk.Display.fromAddress).marshal(RESULT, null);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Closed} callback.
     */
    @FunctionalInterface
    public interface Closed {
    
        /**
         * Emitted when the connection to the windowing system for {@code display} is closed.
         */
        void run(boolean isError);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceDisplay, int isError) {
            run(Marshal.integerToBoolean.marshal(isError, null).booleanValue());
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
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
     * Emitted when the connection to the windowing system for {@code display} is closed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Display.Closed> onClosed(Display.Closed handler) {
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
     * Functional interface declaration of the {@code Opened} callback.
     */
    @FunctionalInterface
    public interface Opened {
    
        /**
         * Emitted when the connection to the windowing system for {@code display} is opened.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceDisplay) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Opened.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the connection to the windowing system for {@code display} is opened.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Display.Opened> onOpened(Display.Opened handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("opened", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code SeatAdded} callback.
     */
    @FunctionalInterface
    public interface SeatAdded {
    
        /**
         * Emitted whenever a new seat is made known to the windowing system.
         */
        void run(org.gtk.gdk.Seat seat);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceDisplay, MemoryAddress seat) {
            run((org.gtk.gdk.Seat) Interop.register(seat, org.gtk.gdk.Seat.fromAddress).marshal(seat, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SeatAdded.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted whenever a new seat is made known to the windowing system.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Display.SeatAdded> onSeatAdded(Display.SeatAdded handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("seat-added", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code SeatRemoved} callback.
     */
    @FunctionalInterface
    public interface SeatRemoved {
    
        /**
         * Emitted whenever a seat is removed by the windowing system.
         */
        void run(org.gtk.gdk.Seat seat);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceDisplay, MemoryAddress seat) {
            run((org.gtk.gdk.Seat) Interop.register(seat, org.gtk.gdk.Seat.fromAddress).marshal(seat, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SeatRemoved.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted whenever a seat is removed by the windowing system.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Display.SeatRemoved> onSeatRemoved(Display.SeatRemoved handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("seat-removed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code SettingChanged} callback.
     */
    @FunctionalInterface
    public interface SettingChanged {
    
        /**
         * Emitted whenever a setting changes its value.
         */
        void run(java.lang.String setting);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceDisplay, MemoryAddress setting) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run(Marshal.addressToString.marshal(setting, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SettingChanged.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted whenever a setting changes its value.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Display.SettingChanged> onSettingChanged(Display.SettingChanged handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("setting-changed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link Display.Builder} object constructs a {@link Display} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Display.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Display} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Display}.
         * @return A new instance of {@code Display} with the properties 
         *         that were set in the Builder object.
         */
        public Display build() {
            return (Display) org.gtk.gobject.GObject.newWithProperties(
                Display.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * {@code true} if the display properly composites the alpha channel.
         * @param composited The value for the {@code composited} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setComposited(boolean composited) {
            names.add("composited");
            values.add(org.gtk.gobject.Value.create(composited));
            return this;
        }
        
        /**
         * {@code true} if the display supports input shapes.
         * @param inputShapes The value for the {@code input-shapes} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInputShapes(boolean inputShapes) {
            names.add("input-shapes");
            values.add(org.gtk.gobject.Value.create(inputShapes));
            return this;
        }
        
        /**
         * {@code true} if the display supports an alpha channel.
         * @param rgba The value for the {@code rgba} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRgba(boolean rgba) {
            names.add("rgba");
            values.add(org.gtk.gobject.Value.create(rgba));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_display_beep = Interop.downcallHandle(
                "gdk_display_beep",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_display_close = Interop.downcallHandle(
                "gdk_display_close",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_display_create_gl_context = Interop.downcallHandle(
                "gdk_display_create_gl_context",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_display_device_is_grabbed = Interop.downcallHandle(
                "gdk_display_device_is_grabbed",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_display_flush = Interop.downcallHandle(
                "gdk_display_flush",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_display_get_app_launch_context = Interop.downcallHandle(
                "gdk_display_get_app_launch_context",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_display_get_clipboard = Interop.downcallHandle(
                "gdk_display_get_clipboard",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_display_get_default_seat = Interop.downcallHandle(
                "gdk_display_get_default_seat",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_display_get_monitor_at_surface = Interop.downcallHandle(
                "gdk_display_get_monitor_at_surface",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_display_get_monitors = Interop.downcallHandle(
                "gdk_display_get_monitors",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_display_get_name = Interop.downcallHandle(
                "gdk_display_get_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_display_get_primary_clipboard = Interop.downcallHandle(
                "gdk_display_get_primary_clipboard",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_display_get_setting = Interop.downcallHandle(
                "gdk_display_get_setting",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_display_get_startup_notification_id = Interop.downcallHandle(
                "gdk_display_get_startup_notification_id",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_display_is_closed = Interop.downcallHandle(
                "gdk_display_is_closed",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_display_is_composited = Interop.downcallHandle(
                "gdk_display_is_composited",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_display_is_rgba = Interop.downcallHandle(
                "gdk_display_is_rgba",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_display_list_seats = Interop.downcallHandle(
                "gdk_display_list_seats",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_display_map_keycode = Interop.downcallHandle(
                "gdk_display_map_keycode",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_display_map_keyval = Interop.downcallHandle(
                "gdk_display_map_keyval",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_display_notify_startup_complete = Interop.downcallHandle(
                "gdk_display_notify_startup_complete",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_display_prepare_gl = Interop.downcallHandle(
                "gdk_display_prepare_gl",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_display_put_event = Interop.downcallHandle(
                "gdk_display_put_event",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_display_supports_input_shapes = Interop.downcallHandle(
                "gdk_display_supports_input_shapes",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_display_sync = Interop.downcallHandle(
                "gdk_display_sync",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_display_translate_key = Interop.downcallHandle(
                "gdk_display_translate_key",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gdk_display_get_type = Interop.downcallHandle(
                "gdk_display_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gdk_display_get_default = Interop.downcallHandle(
                "gdk_display_get_default",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_display_open = Interop.downcallHandle(
                "gdk_display_open",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gdk_display_get_type != null;
    }
}
