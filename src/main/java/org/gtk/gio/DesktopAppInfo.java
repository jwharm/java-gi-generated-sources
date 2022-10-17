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
public class DesktopAppInfo extends org.gtk.gobject.Object implements AppInfo {

    public DesktopAppInfo(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to DesktopAppInfo */
    public static DesktopAppInfo castFrom(org.gtk.gobject.Object gobject) {
        return new DesktopAppInfo(gobject.refcounted());
    }
    
    private static final MethodHandle g_desktop_app_info_new = Interop.downcallHandle(
        "g_desktop_app_info_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull java.lang.String desktopId) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_desktop_app_info_new.invokeExact(Interop.allocateNativeString(desktopId)), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
     */
    public DesktopAppInfo(@NotNull java.lang.String desktopId) {
        super(constructNew(desktopId));
    }
    
    private static final MethodHandle g_desktop_app_info_new_from_filename = Interop.downcallHandle(
        "g_desktop_app_info_new_from_filename",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromFilename(@NotNull java.lang.String filename) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_desktop_app_info_new_from_filename.invokeExact(Interop.allocateNativeString(filename)), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link DesktopAppInfo}.
     */
    public static DesktopAppInfo newFromFilename(@NotNull java.lang.String filename) {
        return new DesktopAppInfo(constructNewFromFilename(filename));
    }
    
    private static final MethodHandle g_desktop_app_info_new_from_keyfile = Interop.downcallHandle(
        "g_desktop_app_info_new_from_keyfile",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromKeyfile(@NotNull org.gtk.glib.KeyFile keyFile) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_desktop_app_info_new_from_keyfile.invokeExact(keyFile.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link DesktopAppInfo}.
     */
    public static DesktopAppInfo newFromKeyfile(@NotNull org.gtk.glib.KeyFile keyFile) {
        return new DesktopAppInfo(constructNewFromKeyfile(keyFile));
    }
    
    private static final MethodHandle g_desktop_app_info_get_action_name = Interop.downcallHandle(
        "g_desktop_app_info_get_action_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the user-visible display name of the "additional application
     * action" specified by {@code action_name}.
     * <p>
     * This corresponds to the "Name" key within the keyfile group for the
     * action.
     */
    public @NotNull java.lang.String getActionName(@NotNull java.lang.String actionName) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_desktop_app_info_get_action_name.invokeExact(handle(), Interop.allocateNativeString(actionName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_desktop_app_info_get_boolean = Interop.downcallHandle(
        "g_desktop_app_info_get_boolean",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks up a boolean value in the keyfile backing {@code info}.
     * <p>
     * The {@code key} is looked up in the "Desktop Entry" group.
     */
    public boolean getBoolean(@NotNull java.lang.String key) {
        int RESULT;
        try {
            RESULT = (int) g_desktop_app_info_get_boolean.invokeExact(handle(), Interop.allocateNativeString(key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_desktop_app_info_get_categories = Interop.downcallHandle(
        "g_desktop_app_info_get_categories",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the categories from the desktop file.
     */
    public @Nullable java.lang.String getCategories() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_desktop_app_info_get_categories.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_desktop_app_info_get_filename = Interop.downcallHandle(
        "g_desktop_app_info_get_filename",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * When {@code info} was created from a known filename, return it.  In some
     * situations such as the {@link DesktopAppInfo} returned from
     * g_desktop_app_info_new_from_keyfile(), this function will return {@code null}.
     */
    public @Nullable java.lang.String getFilename() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_desktop_app_info_get_filename.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_desktop_app_info_get_generic_name = Interop.downcallHandle(
        "g_desktop_app_info_get_generic_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the generic name from the desktop file.
     */
    public @Nullable java.lang.String getGenericName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_desktop_app_info_get_generic_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_desktop_app_info_get_is_hidden = Interop.downcallHandle(
        "g_desktop_app_info_get_is_hidden",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * A desktop file is hidden if the Hidden key in it is
     * set to True.
     */
    public boolean getIsHidden() {
        int RESULT;
        try {
            RESULT = (int) g_desktop_app_info_get_is_hidden.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_desktop_app_info_get_keywords = Interop.downcallHandle(
        "g_desktop_app_info_get_keywords",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the keywords from the desktop file.
     */
    public PointerString getKeywords() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_desktop_app_info_get_keywords.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    private static final MethodHandle g_desktop_app_info_get_locale_string = Interop.downcallHandle(
        "g_desktop_app_info_get_locale_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks up a localized string value in the keyfile backing {@code info}
     * translated to the current locale.
     * <p>
     * The {@code key} is looked up in the "Desktop Entry" group.
     */
    public @Nullable java.lang.String getLocaleString(@NotNull java.lang.String key) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_desktop_app_info_get_locale_string.invokeExact(handle(), Interop.allocateNativeString(key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_desktop_app_info_get_nodisplay = Interop.downcallHandle(
        "g_desktop_app_info_get_nodisplay",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of the NoDisplay key, which helps determine if the
     * application info should be shown in menus. See
     * {@code G_KEY_FILE_DESKTOP_KEY_NO_DISPLAY} and g_app_info_should_show().
     */
    public boolean getNodisplay() {
        int RESULT;
        try {
            RESULT = (int) g_desktop_app_info_get_nodisplay.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_desktop_app_info_get_show_in = Interop.downcallHandle(
        "g_desktop_app_info_get_show_in",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public boolean getShowIn(@Nullable java.lang.String desktopEnv) {
        int RESULT;
        try {
            RESULT = (int) g_desktop_app_info_get_show_in.invokeExact(handle(), Interop.allocateNativeString(desktopEnv));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_desktop_app_info_get_startup_wm_class = Interop.downcallHandle(
        "g_desktop_app_info_get_startup_wm_class",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the StartupWMClass field from {@code info}. This represents the
     * WM_CLASS property of the main window of the application, if launched
     * through {@code info}.
     */
    public @Nullable java.lang.String getStartupWmClass() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_desktop_app_info_get_startup_wm_class.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_desktop_app_info_get_string = Interop.downcallHandle(
        "g_desktop_app_info_get_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks up a string value in the keyfile backing {@code info}.
     * <p>
     * The {@code key} is looked up in the "Desktop Entry" group.
     */
    public @Nullable java.lang.String getString(@NotNull java.lang.String key) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_desktop_app_info_get_string.invokeExact(handle(), Interop.allocateNativeString(key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_desktop_app_info_get_string_list = Interop.downcallHandle(
        "g_desktop_app_info_get_string_list",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks up a string list value in the keyfile backing {@code info}.
     * <p>
     * The {@code key} is looked up in the "Desktop Entry" group.
     */
    public java.lang.String[] getStringList(@NotNull java.lang.String key, @NotNull Out<Long> length) {
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_desktop_app_info_get_string_list.invokeExact(handle(), Interop.allocateNativeString(key), (Addressable) lengthPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        length.set(lengthPOINTER.get(ValueLayout.JAVA_LONG, 0));
        java.lang.String[] resultARRAY = new java.lang.String[length.get().intValue()];
        for (int I = 0; I < length.get().intValue(); I++) {
            var OBJ = RESULT.get(ValueLayout.ADDRESS, I);
            resultARRAY[I] = OBJ.getUtf8String(0);
        }
        return resultARRAY;
    }
    
    private static final MethodHandle g_desktop_app_info_has_key = Interop.downcallHandle(
        "g_desktop_app_info_has_key",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether {@code key} exists in the "Desktop Entry" group
     * of the keyfile backing {@code info}.
     */
    public boolean hasKey(@NotNull java.lang.String key) {
        int RESULT;
        try {
            RESULT = (int) g_desktop_app_info_has_key.invokeExact(handle(), Interop.allocateNativeString(key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_desktop_app_info_launch_action = Interop.downcallHandle(
        "g_desktop_app_info_launch_action",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public @NotNull void launchAction(@NotNull java.lang.String actionName, @Nullable AppLaunchContext launchContext) {
        try {
            g_desktop_app_info_launch_action.invokeExact(handle(), Interop.allocateNativeString(actionName), launchContext.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_desktop_app_info_launch_uris_as_manager = Interop.downcallHandle(
        "g_desktop_app_info_launch_uris_as_manager",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public boolean launchUrisAsManager(@NotNull org.gtk.glib.List uris, @Nullable AppLaunchContext launchContext, @NotNull org.gtk.glib.SpawnFlags spawnFlags, @Nullable org.gtk.glib.SpawnChildSetupFunc userSetup, @Nullable DesktopAppLaunchCallback pidCallback) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_desktop_app_info_launch_uris_as_manager.invokeExact(handle(), uris.handle(), launchContext.handle(), spawnFlags.getValue(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbSpawnChildSetupFunc",
                            MethodType.methodType(void.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(userSetup)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbDesktopAppLaunchCallback",
                            MethodType.methodType(void.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(userSetup)), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_desktop_app_info_launch_uris_as_manager_with_fds = Interop.downcallHandle(
        "g_desktop_app_info_launch_uris_as_manager_with_fds",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Equivalent to g_desktop_app_info_launch_uris_as_manager() but allows
     * you to pass in file descriptors for the stdin, stdout and stderr streams
     * of the launched process.
     * <p>
     * If application launching occurs via some non-spawn mechanism (e.g. D-Bus
     * activation) then {@code stdin_fd}, {@code stdout_fd} and {@code stderr_fd} are ignored.
     */
    public boolean launchUrisAsManagerWithFds(@NotNull org.gtk.glib.List uris, @Nullable AppLaunchContext launchContext, @NotNull org.gtk.glib.SpawnFlags spawnFlags, @Nullable org.gtk.glib.SpawnChildSetupFunc userSetup, @Nullable DesktopAppLaunchCallback pidCallback, @NotNull int stdinFd, @NotNull int stdoutFd, @NotNull int stderrFd) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_desktop_app_info_launch_uris_as_manager_with_fds.invokeExact(handle(), uris.handle(), launchContext.handle(), spawnFlags.getValue(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbSpawnChildSetupFunc",
                            MethodType.methodType(void.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(userSetup)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbDesktopAppLaunchCallback",
                            MethodType.methodType(void.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(userSetup)), stdinFd, stdoutFd, stderrFd, (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_desktop_app_info_list_actions = Interop.downcallHandle(
        "g_desktop_app_info_list_actions",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the list of "additional application actions" supported on the
     * desktop file, as per the desktop file specification.
     * <p>
     * As per the specification, this is the list of actions that are
     * explicitly listed in the "Actions" key of the [Desktop Entry] group.
     */
    public PointerString listActions() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_desktop_app_info_list_actions.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    private static final MethodHandle g_desktop_app_info_get_implementations = Interop.downcallHandle(
        "g_desktop_app_info_get_implementations",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets all applications that implement {@code interface}.
     * <p>
     * An application implements an interface if that interface is listed in
     * the Implements= line of the desktop file of the application.
     */
    public static @NotNull org.gtk.glib.List getImplementations(@NotNull java.lang.String interface_) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_desktop_app_info_get_implementations.invokeExact(Interop.allocateNativeString(interface_));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_desktop_app_info_search = Interop.downcallHandle(
        "g_desktop_app_info_search",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
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
     */
    public static void search(@NotNull java.lang.String searchString) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_desktop_app_info_search.invokeExact(Interop.allocateNativeString(searchString));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return ;
    }
    
}
