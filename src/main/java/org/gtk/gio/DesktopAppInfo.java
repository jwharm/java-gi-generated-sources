package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link DesktopAppInfo} is an implementation of {@link AppInfo} based on
 * desktop files.
 * <p>
 * Note that {@code <gio/gdesktopappinfo.h>} belongs to the UNIX-specific
 * GIO interfaces, thus you have to use the {@code gio-unix-2.0.pc} pkg-config
 * file when using it.
 */
public class DesktopAppInfo extends org.gtk.gobject.GObject implements org.gtk.gio.AppInfo {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDesktopAppInfo";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a DesktopAppInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DesktopAppInfo(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DesktopAppInfo> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DesktopAppInfo(input);
    
    private static MemoryAddress constructNew(java.lang.String desktopId) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_desktop_app_info_new.invokeExact(Marshal.stringToAddress.marshal(desktopId, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Creates a new {@link DesktopAppInfo} based on a desktop file id.
     * <p>
     * A desktop file id is the basename of the desktop file, including the
     * .desktop extension. GIO is looking for a desktop file with this name
     * in the {@code applications} subdirectories of the XDG
     * data directories (i.e. the directories specified in the {@code XDG_DATA_HOME}
     * and {@code XDG_DATA_DIRS} environment variables). GIO also supports the
     * prefix-to-subdirectory mapping that is described in the
     * <a href="http://standards.freedesktop.org/menu-spec/latest/">Menu Spec</a>
     * (i.e. a desktop id of kde-foo.desktop will match
     * {@code /usr/share/applications/kde/foo.desktop}).
     * @param desktopId the desktop file id
     */
    public DesktopAppInfo(java.lang.String desktopId) {
        super(constructNew(desktopId));
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewFromFilename(java.lang.String filename) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_desktop_app_info_new_from_filename.invokeExact(Marshal.stringToAddress.marshal(filename, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
        
    /**
     * Creates a new {@link DesktopAppInfo}.
     * @param filename the path of a desktop file, in the GLib
     *      filename encoding
     * @return a new {@link DesktopAppInfo} or {@code null} on error.
     */
    public static DesktopAppInfo newFromFilename(java.lang.String filename) {
        var RESULT = constructNewFromFilename(filename);
        var OBJECT = (org.gtk.gio.DesktopAppInfo) Interop.register(RESULT, org.gtk.gio.DesktopAppInfo.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewFromKeyfile(org.gtk.glib.KeyFile keyFile) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_desktop_app_info_new_from_keyfile.invokeExact(keyFile.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Creates a new {@link DesktopAppInfo}.
     * @param keyFile an opened {@link org.gtk.glib.KeyFile}
     * @return a new {@link DesktopAppInfo} or {@code null} on error.
     */
    public static DesktopAppInfo newFromKeyfile(org.gtk.glib.KeyFile keyFile) {
        var RESULT = constructNewFromKeyfile(keyFile);
        var OBJECT = (org.gtk.gio.DesktopAppInfo) Interop.register(RESULT, org.gtk.gio.DesktopAppInfo.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets the user-visible display name of the "additional application
     * action" specified by {@code action_name}.
     * <p>
     * This corresponds to the "Name" key within the keyfile group for the
     * action.
     * @param actionName the name of the action as from
     *   g_desktop_app_info_list_actions()
     * @return the locale-specific action name
     */
    public java.lang.String getActionName(java.lang.String actionName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_desktop_app_info_get_action_name.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(actionName, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Looks up a boolean value in the keyfile backing {@code info}.
     * <p>
     * The {@code key} is looked up in the "Desktop Entry" group.
     * @param key the key to look up
     * @return the boolean value, or {@code false} if the key
     *     is not found
     */
    public boolean getBoolean(java.lang.String key) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_desktop_app_info_get_boolean.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Gets the categories from the desktop file.
     * @return The unparsed Categories key from the desktop file;
     *     i.e. no attempt is made to split it by ';' or validate it.
     */
    public @Nullable java.lang.String getCategories() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_desktop_app_info_get_categories.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * When {@code info} was created from a known filename, return it.  In some
     * situations such as the {@link DesktopAppInfo} returned from
     * g_desktop_app_info_new_from_keyfile(), this function will return {@code null}.
     * @return The full path to the file for {@code info},
     *     or {@code null} if not known.
     */
    public @Nullable java.lang.String getFilename() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_desktop_app_info_get_filename.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the generic name from the desktop file.
     * @return The value of the GenericName key
     */
    public @Nullable java.lang.String getGenericName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_desktop_app_info_get_generic_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * A desktop file is hidden if the Hidden key in it is
     * set to True.
     * @return {@code true} if hidden, {@code false} otherwise.
     */
    public boolean getIsHidden() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_desktop_app_info_get_is_hidden.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the keywords from the desktop file.
     * @return The value of the Keywords key
     */
    public PointerString getKeywords() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_desktop_app_info_get_keywords.invokeExact(handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerString(RESULT);
        }
    }
    
    /**
     * Looks up a localized string value in the keyfile backing {@code info}
     * translated to the current locale.
     * <p>
     * The {@code key} is looked up in the "Desktop Entry" group.
     * @param key the key to look up
     * @return a newly allocated string, or {@code null} if the key
     *     is not found
     */
    public @Nullable java.lang.String getLocaleString(java.lang.String key) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_desktop_app_info_get_locale_string.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Gets the value of the NoDisplay key, which helps determine if the
     * application info should be shown in menus. See
     * {@code G_KEY_FILE_DESKTOP_KEY_NO_DISPLAY} and g_app_info_should_show().
     * @return The value of the NoDisplay key
     */
    public boolean getNodisplay() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_desktop_app_info_get_nodisplay.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if the application info should be shown in menus that list available
     * applications for a specific name of the desktop, based on the
     * {@code OnlyShowIn} and {@code NotShowIn} keys.
     * <p>
     * {@code desktop_env} should typically be given as {@code null}, in which case the
     * {@code XDG_CURRENT_DESKTOP} environment variable is consulted.  If you want
     * to override the default mechanism then you may specify {@code desktop_env},
     * but this is not recommended.
     * <p>
     * Note that g_app_info_should_show() for {@code info} will include this check (with
     * {@code null} for {@code desktop_env}) as well as additional checks.
     * @param desktopEnv a string specifying a desktop name
     * @return {@code true} if the {@code info} should be shown in {@code desktop_env} according to the
     * {@code OnlyShowIn} and {@code NotShowIn} keys, {@code false}
     * otherwise.
     */
    public boolean getShowIn(@Nullable java.lang.String desktopEnv) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_desktop_app_info_get_show_in.invokeExact(
                        handle(),
                        (Addressable) (desktopEnv == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(desktopEnv, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Retrieves the StartupWMClass field from {@code info}. This represents the
     * WM_CLASS property of the main window of the application, if launched
     * through {@code info}.
     * @return the startup WM class, or {@code null} if none is set
     * in the desktop file.
     */
    public @Nullable java.lang.String getStartupWmClass() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_desktop_app_info_get_startup_wm_class.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Looks up a string value in the keyfile backing {@code info}.
     * <p>
     * The {@code key} is looked up in the "Desktop Entry" group.
     * @param key the key to look up
     * @return a newly allocated string, or {@code null} if the key
     *     is not found
     */
    public @Nullable java.lang.String getString(java.lang.String key) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_desktop_app_info_get_string.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Looks up a string list value in the keyfile backing {@code info}.
     * <p>
     * The {@code key} is looked up in the "Desktop Entry" group.
     * @param key the key to look up
     * @param length return location for the number of returned strings, or {@code null}
     * @return a {@code null}-terminated string array or {@code null} if the specified
     *  key cannot be found. The array should be freed with g_strfreev().
     */
    public java.lang.String[] getStringList(java.lang.String key, Out<Long> length) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment lengthPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_desktop_app_info_get_string_list.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        (Addressable) (length == null ? MemoryAddress.NULL : (Addressable) lengthPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (length != null) length.set(lengthPOINTER.get(Interop.valueLayout.C_LONG, 0));
            java.lang.String[] resultARRAY = new java.lang.String[length.get().intValue()];
            for (int I = 0; I < length.get().intValue(); I++) {
                var OBJ = RESULT.get(Interop.valueLayout.ADDRESS, I);
                resultARRAY[I] = Marshal.addressToString.marshal(OBJ, null);
            }
            return resultARRAY;
        }
    }
    
    /**
     * Returns whether {@code key} exists in the "Desktop Entry" group
     * of the keyfile backing {@code info}.
     * @param key the key to look up
     * @return {@code true} if the {@code key} exists
     */
    public boolean hasKey(java.lang.String key) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_desktop_app_info_has_key.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Activates the named application action.
     * <p>
     * You may only call this function on action names that were
     * returned from g_desktop_app_info_list_actions().
     * <p>
     * Note that if the main entry of the desktop file indicates that the
     * application supports startup notification, and {@code launch_context} is
     * non-{@code null}, then startup notification will be used when activating the
     * action (and as such, invocation of the action on the receiving side
     * must signal the end of startup notification when it is completed).
     * This is the expected behaviour of applications declaring additional
     * actions, as per the desktop file specification.
     * <p>
     * As with g_app_info_launch() there is no way to detect failures that
     * occur while using this function.
     * @param actionName the name of the action as from
     *   g_desktop_app_info_list_actions()
     * @param launchContext a {@link AppLaunchContext}
     */
    public void launchAction(java.lang.String actionName, @Nullable org.gtk.gio.AppLaunchContext launchContext) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_desktop_app_info_launch_action.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(actionName, SCOPE),
                        (Addressable) (launchContext == null ? MemoryAddress.NULL : launchContext.handle()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * This function performs the equivalent of g_app_info_launch_uris(),
     * but is intended primarily for operating system components that
     * launch applications.  Ordinary applications should use
     * g_app_info_launch_uris().
     * <p>
     * If the application is launched via GSpawn, then {@code spawn_flags}, {@code user_setup}
     * and {@code user_setup_data} are used for the call to g_spawn_async().
     * Additionally, {@code pid_callback} (with {@code pid_callback_data}) will be called to
     * inform about the PID of the created process. See g_spawn_async_with_pipes()
     * for information on certain parameter conditions that can enable an
     * optimized posix_spawn() codepath to be used.
     * <p>
     * If application launching occurs via some other mechanism (eg: D-Bus
     * activation) then {@code spawn_flags}, {@code user_setup}, {@code user_setup_data},
     * {@code pid_callback} and {@code pid_callback_data} are ignored.
     * @param uris List of URIs
     * @param launchContext a {@link AppLaunchContext}
     * @param spawnFlags {@link org.gtk.glib.SpawnFlags}, used for each process
     * @param userSetup a {@link org.gtk.glib.SpawnChildSetupFunc}, used once
     *     for each process.
     * @param pidCallback Callback for child processes
     * @return {@code true} on successful launch, {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean launchUrisAsManager(org.gtk.glib.List uris, @Nullable org.gtk.gio.AppLaunchContext launchContext, org.gtk.glib.SpawnFlags spawnFlags, @Nullable org.gtk.glib.SpawnChildSetupFunc userSetup, @Nullable org.gtk.gio.DesktopAppLaunchCallback pidCallback) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_desktop_app_info_launch_uris_as_manager.invokeExact(
                        handle(),
                        uris.handle(),
                        (Addressable) (launchContext == null ? MemoryAddress.NULL : launchContext.handle()),
                        spawnFlags.getValue(),
                        (Addressable) (userSetup == null ? MemoryAddress.NULL : (Addressable) userSetup.toCallback()),
                        (Addressable) MemoryAddress.NULL,
                        (Addressable) (pidCallback == null ? MemoryAddress.NULL : (Addressable) pidCallback.toCallback()),
                        (Addressable) MemoryAddress.NULL,
                        (Addressable) GERROR);
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
     * Equivalent to g_desktop_app_info_launch_uris_as_manager() but allows
     * you to pass in file descriptors for the stdin, stdout and stderr streams
     * of the launched process.
     * <p>
     * If application launching occurs via some non-spawn mechanism (e.g. D-Bus
     * activation) then {@code stdin_fd}, {@code stdout_fd} and {@code stderr_fd} are ignored.
     * @param uris List of URIs
     * @param launchContext a {@link AppLaunchContext}
     * @param spawnFlags {@link org.gtk.glib.SpawnFlags}, used for each process
     * @param userSetup a {@link org.gtk.glib.SpawnChildSetupFunc}, used once
     *     for each process.
     * @param pidCallback Callback for child processes
     * @param stdinFd file descriptor to use for child's stdin, or -1
     * @param stdoutFd file descriptor to use for child's stdout, or -1
     * @param stderrFd file descriptor to use for child's stderr, or -1
     * @return {@code true} on successful launch, {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean launchUrisAsManagerWithFds(org.gtk.glib.List uris, @Nullable org.gtk.gio.AppLaunchContext launchContext, org.gtk.glib.SpawnFlags spawnFlags, @Nullable org.gtk.glib.SpawnChildSetupFunc userSetup, @Nullable org.gtk.gio.DesktopAppLaunchCallback pidCallback, int stdinFd, int stdoutFd, int stderrFd) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_desktop_app_info_launch_uris_as_manager_with_fds.invokeExact(
                        handle(),
                        uris.handle(),
                        (Addressable) (launchContext == null ? MemoryAddress.NULL : launchContext.handle()),
                        spawnFlags.getValue(),
                        (Addressable) (userSetup == null ? MemoryAddress.NULL : (Addressable) userSetup.toCallback()),
                        (Addressable) MemoryAddress.NULL,
                        (Addressable) (pidCallback == null ? MemoryAddress.NULL : (Addressable) pidCallback.toCallback()),
                        (Addressable) MemoryAddress.NULL,
                        stdinFd,
                        stdoutFd,
                        stderrFd,
                        (Addressable) GERROR);
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
     * Returns the list of "additional application actions" supported on the
     * desktop file, as per the desktop file specification.
     * <p>
     * As per the specification, this is the list of actions that are
     * explicitly listed in the "Actions" key of the [Desktop Entry] group.
     * @return a list of strings, always non-{@code null}
     */
    public PointerString listActions() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_desktop_app_info_list_actions.invokeExact(handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerString(RESULT);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_desktop_app_info_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Gets all applications that implement {@code interface}.
     * <p>
     * An application implements an interface if that interface is listed in
     * the Implements= line of the desktop file of the application.
     * @param interface_ the name of the interface
     * @return a list of {@link DesktopAppInfo}
     * objects.
     */
    public static org.gtk.glib.List getImplementations(java.lang.String interface_) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_desktop_app_info_get_implementations.invokeExact(Marshal.stringToAddress.marshal(interface_, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = org.gtk.glib.List.fromAddress.marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Searches desktop files for ones that match {@code search_string}.
     * <p>
     * The return value is an array of strvs.  Each strv contains a list of
     * applications that matched {@code search_string} with an equal score.  The
     * outer list is sorted by score so that the first strv contains the
     * best-matching applications, and so on.
     * The algorithm for determining matches is undefined and may change at
     * any time.
     * <p>
     * None of the search results are subjected to the normal validation
     * checks performed by g_desktop_app_info_new() (for example, checking that
     * the executable referenced by a result exists), and so it is possible for
     * g_desktop_app_info_new() to return {@code null} when passed an app ID returned by
     * this function. It is expected that calling code will do this when
     * subsequently creating a {@link DesktopAppInfo} for each result.
     * @param searchString the search string to use
     * @return a
     *   list of strvs.  Free each item with g_strfreev() and free the outer
     *   list with g_free().
     */
    public static java.lang.String[][] search(java.lang.String searchString) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_desktop_app_info_search.invokeExact(Marshal.stringToAddress.marshal(searchString, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return null /* unsupported */;
        }
    }
    
    /**
     * Sets the name of the desktop that the application is running in.
     * This is used by g_app_info_should_show() and
     * g_desktop_app_info_get_show_in() to evaluate the
     * {@code OnlyShowIn} and {@code NotShowIn}
     * desktop entry fields.
     * <p>
     * Should be called only once; subsequent calls are ignored.
     * @param desktopEnv a string specifying what desktop this is
     * @deprecated do not use this API.  Since 2.42 the value of the
     * {@code XDG_CURRENT_DESKTOP} environment variable will be used.
     */
    @Deprecated
    public static void setDesktopEnv(java.lang.String desktopEnv) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_desktop_app_info_set_desktop_env.invokeExact(Marshal.stringToAddress.marshal(desktopEnv, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * A {@link DesktopAppInfo.Builder} object constructs a {@link DesktopAppInfo} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link DesktopAppInfo.Builder#build()}. 
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
         * Finish building the {@link DesktopAppInfo} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DesktopAppInfo}.
         * @return A new instance of {@code DesktopAppInfo} with the properties 
         *         that were set in the Builder object.
         */
        public DesktopAppInfo build() {
            return (DesktopAppInfo) org.gtk.gobject.GObject.newWithProperties(
                DesktopAppInfo.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The origin filename of this {@link DesktopAppInfo}
         * @param filename The value for the {@code filename} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFilename(java.lang.String filename) {
            names.add("filename");
            values.add(org.gtk.gobject.Value.create(filename));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_desktop_app_info_new = Interop.downcallHandle(
                "g_desktop_app_info_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_desktop_app_info_new_from_filename = Interop.downcallHandle(
                "g_desktop_app_info_new_from_filename",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_desktop_app_info_new_from_keyfile = Interop.downcallHandle(
                "g_desktop_app_info_new_from_keyfile",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_desktop_app_info_get_action_name = Interop.downcallHandle(
                "g_desktop_app_info_get_action_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_desktop_app_info_get_boolean = Interop.downcallHandle(
                "g_desktop_app_info_get_boolean",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_desktop_app_info_get_categories = Interop.downcallHandle(
                "g_desktop_app_info_get_categories",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_desktop_app_info_get_filename = Interop.downcallHandle(
                "g_desktop_app_info_get_filename",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_desktop_app_info_get_generic_name = Interop.downcallHandle(
                "g_desktop_app_info_get_generic_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_desktop_app_info_get_is_hidden = Interop.downcallHandle(
                "g_desktop_app_info_get_is_hidden",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_desktop_app_info_get_keywords = Interop.downcallHandle(
                "g_desktop_app_info_get_keywords",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_desktop_app_info_get_locale_string = Interop.downcallHandle(
                "g_desktop_app_info_get_locale_string",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_desktop_app_info_get_nodisplay = Interop.downcallHandle(
                "g_desktop_app_info_get_nodisplay",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_desktop_app_info_get_show_in = Interop.downcallHandle(
                "g_desktop_app_info_get_show_in",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_desktop_app_info_get_startup_wm_class = Interop.downcallHandle(
                "g_desktop_app_info_get_startup_wm_class",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_desktop_app_info_get_string = Interop.downcallHandle(
                "g_desktop_app_info_get_string",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_desktop_app_info_get_string_list = Interop.downcallHandle(
                "g_desktop_app_info_get_string_list",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_desktop_app_info_has_key = Interop.downcallHandle(
                "g_desktop_app_info_has_key",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_desktop_app_info_launch_action = Interop.downcallHandle(
                "g_desktop_app_info_launch_action",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_desktop_app_info_launch_uris_as_manager = Interop.downcallHandle(
                "g_desktop_app_info_launch_uris_as_manager",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_desktop_app_info_launch_uris_as_manager_with_fds = Interop.downcallHandle(
                "g_desktop_app_info_launch_uris_as_manager_with_fds",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_desktop_app_info_list_actions = Interop.downcallHandle(
                "g_desktop_app_info_list_actions",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_desktop_app_info_get_type = Interop.downcallHandle(
                "g_desktop_app_info_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_desktop_app_info_get_implementations = Interop.downcallHandle(
                "g_desktop_app_info_get_implementations",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_desktop_app_info_search = Interop.downcallHandle(
                "g_desktop_app_info_search",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_desktop_app_info_set_desktop_env = Interop.downcallHandle(
                "g_desktop_app_info_set_desktop_env",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_desktop_app_info_get_type != null;
    }
}
