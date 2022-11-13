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
public class DesktopAppInfo extends org.gtk.gobject.Object implements org.gtk.gio.AppInfo {
    
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
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DesktopAppInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to DesktopAppInfo if its GType is a (or inherits from) "GDesktopAppInfo".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code DesktopAppInfo} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GDesktopAppInfo", a ClassCastException will be thrown.
     */
    public static DesktopAppInfo castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GDesktopAppInfo"))) {
            return new DesktopAppInfo(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GDesktopAppInfo");
        }
    }
    
    private static Addressable constructNew(@NotNull java.lang.String desktopId) {
        java.util.Objects.requireNonNull(desktopId, "Parameter 'desktopId' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_desktop_app_info_new.invokeExact(
                    Interop.allocateNativeString(desktopId));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
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
    public DesktopAppInfo(@NotNull java.lang.String desktopId) {
        super(constructNew(desktopId), Ownership.FULL);
    }
    
    private static Addressable constructNewFromFilename(@NotNull java.lang.String filename) {
        java.util.Objects.requireNonNull(filename, "Parameter 'filename' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_desktop_app_info_new_from_filename.invokeExact(
                    Interop.allocateNativeString(filename));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link DesktopAppInfo}.
     * @param filename the path of a desktop file, in the GLib
     *      filename encoding
     * @return a new {@link DesktopAppInfo} or {@code null} on error.
     */
    public static DesktopAppInfo newFromFilename(@NotNull java.lang.String filename) {
        return new DesktopAppInfo(constructNewFromFilename(filename), Ownership.FULL);
    }
    
    private static Addressable constructNewFromKeyfile(@NotNull org.gtk.glib.KeyFile keyFile) {
        java.util.Objects.requireNonNull(keyFile, "Parameter 'keyFile' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_desktop_app_info_new_from_keyfile.invokeExact(
                    keyFile.handle());
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
    public static DesktopAppInfo newFromKeyfile(@NotNull org.gtk.glib.KeyFile keyFile) {
        return new DesktopAppInfo(constructNewFromKeyfile(keyFile), Ownership.FULL);
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
    public @NotNull java.lang.String getActionName(@NotNull java.lang.String actionName) {
        java.util.Objects.requireNonNull(actionName, "Parameter 'actionName' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_desktop_app_info_get_action_name.invokeExact(
                    handle(),
                    Interop.allocateNativeString(actionName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Looks up a boolean value in the keyfile backing {@code info}.
     * <p>
     * The {@code key} is looked up in the "Desktop Entry" group.
     * @param key the key to look up
     * @return the boolean value, or {@code false} if the key
     *     is not found
     */
    public boolean getBoolean(@NotNull java.lang.String key) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_desktop_app_info_get_boolean.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the categories from the desktop file.
     * @return The unparsed Categories key from the desktop file;
     *     i.e. no attempt is made to split it by ';' or validate it.
     */
    public @Nullable java.lang.String getCategories() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_desktop_app_info_get_categories.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
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
            RESULT = (MemoryAddress) DowncallHandles.g_desktop_app_info_get_filename.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the generic name from the desktop file.
     * @return The value of the GenericName key
     */
    public @Nullable java.lang.String getGenericName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_desktop_app_info_get_generic_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * A desktop file is hidden if the Hidden key in it is
     * set to True.
     * @return {@code true} if hidden, {@code false} otherwise.
     */
    public boolean getIsHidden() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_desktop_app_info_get_is_hidden.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the keywords from the desktop file.
     * @return The value of the Keywords key
     */
    public @NotNull PointerString getKeywords() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_desktop_app_info_get_keywords.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
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
    public @Nullable java.lang.String getLocaleString(@NotNull java.lang.String key) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_desktop_app_info_get_locale_string.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
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
            RESULT = (int) DowncallHandles.g_desktop_app_info_get_nodisplay.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_desktop_app_info_get_show_in.invokeExact(
                    handle(),
                    (Addressable) (desktopEnv == null ? MemoryAddress.NULL : Interop.allocateNativeString(desktopEnv)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
            RESULT = (MemoryAddress) DowncallHandles.g_desktop_app_info_get_startup_wm_class.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Looks up a string value in the keyfile backing {@code info}.
     * <p>
     * The {@code key} is looked up in the "Desktop Entry" group.
     * @param key the key to look up
     * @return a newly allocated string, or {@code null} if the key
     *     is not found
     */
    public @Nullable java.lang.String getString(@NotNull java.lang.String key) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_desktop_app_info_get_string.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
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
    public @NotNull java.lang.String[] getStringList(@NotNull java.lang.String key, Out<Long> length) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        java.util.Objects.requireNonNull(length, "Parameter 'length' must not be null");
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_desktop_app_info_get_string_list.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key),
                    (Addressable) lengthPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        length.set(lengthPOINTER.get(ValueLayout.JAVA_LONG, 0));
        java.lang.String[] resultARRAY = new java.lang.String[length.get().intValue()];
        for (int I = 0; I < length.get().intValue(); I++) {
            var OBJ = RESULT.get(ValueLayout.ADDRESS, I);
            resultARRAY[I] = Interop.getStringFrom(OBJ);
        }
        return resultARRAY;
    }
    
    /**
     * Returns whether {@code key} exists in the "Desktop Entry" group
     * of the keyfile backing {@code info}.
     * @param key the key to look up
     * @return {@code true} if the {@code key} exists
     */
    public boolean hasKey(@NotNull java.lang.String key) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_desktop_app_info_has_key.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    public void launchAction(@NotNull java.lang.String actionName, @Nullable org.gtk.gio.AppLaunchContext launchContext) {
        java.util.Objects.requireNonNull(actionName, "Parameter 'actionName' must not be null");
        try {
            DowncallHandles.g_desktop_app_info_launch_action.invokeExact(
                    handle(),
                    Interop.allocateNativeString(actionName),
                    (Addressable) (launchContext == null ? MemoryAddress.NULL : launchContext.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
    public boolean launchUrisAsManager(@NotNull org.gtk.glib.List uris, @Nullable org.gtk.gio.AppLaunchContext launchContext, @NotNull org.gtk.glib.SpawnFlags spawnFlags, @Nullable org.gtk.glib.SpawnChildSetupFunc userSetup, @Nullable org.gtk.gio.DesktopAppLaunchCallback pidCallback) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(uris, "Parameter 'uris' must not be null");
        java.util.Objects.requireNonNull(spawnFlags, "Parameter 'spawnFlags' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_desktop_app_info_launch_uris_as_manager.invokeExact(
                    handle(),
                    uris.handle(),
                    (Addressable) (launchContext == null ? MemoryAddress.NULL : launchContext.handle()),
                    spawnFlags.getValue(),
                    (Addressable) (userSetup == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbSpawnChildSetupFunc",
                            MethodType.methodType(void.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (userSetup == null ? MemoryAddress.NULL : Interop.registerCallback(userSetup)),
                    (Addressable) (pidCallback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbDesktopAppLaunchCallback",
                            MethodType.methodType(void.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (userSetup == null ? MemoryAddress.NULL : Interop.registerCallback(userSetup)),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
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
    public boolean launchUrisAsManagerWithFds(@NotNull org.gtk.glib.List uris, @Nullable org.gtk.gio.AppLaunchContext launchContext, @NotNull org.gtk.glib.SpawnFlags spawnFlags, @Nullable org.gtk.glib.SpawnChildSetupFunc userSetup, @Nullable org.gtk.gio.DesktopAppLaunchCallback pidCallback, int stdinFd, int stdoutFd, int stderrFd) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(uris, "Parameter 'uris' must not be null");
        java.util.Objects.requireNonNull(spawnFlags, "Parameter 'spawnFlags' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_desktop_app_info_launch_uris_as_manager_with_fds.invokeExact(
                    handle(),
                    uris.handle(),
                    (Addressable) (launchContext == null ? MemoryAddress.NULL : launchContext.handle()),
                    spawnFlags.getValue(),
                    (Addressable) (userSetup == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbSpawnChildSetupFunc",
                            MethodType.methodType(void.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (userSetup == null ? MemoryAddress.NULL : Interop.registerCallback(userSetup)),
                    (Addressable) (pidCallback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbDesktopAppLaunchCallback",
                            MethodType.methodType(void.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (userSetup == null ? MemoryAddress.NULL : Interop.registerCallback(userSetup)),
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
        return RESULT != 0;
    }
    
    /**
     * Returns the list of "additional application actions" supported on the
     * desktop file, as per the desktop file specification.
     * <p>
     * As per the specification, this is the list of actions that are
     * explicitly listed in the "Actions" key of the [Desktop Entry] group.
     * @return a list of strings, always non-{@code null}
     */
    public @NotNull PointerString listActions() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_desktop_app_info_list_actions.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
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
    public static @NotNull org.gtk.glib.List getImplementations(@NotNull java.lang.String interface_) {
        java.util.Objects.requireNonNull(interface_, "Parameter 'interface_' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_desktop_app_info_get_implementations.invokeExact(
                    Interop.allocateNativeString(interface_));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
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
    public static @NotNull java.lang.String[][] search(@NotNull java.lang.String searchString) {
        java.util.Objects.requireNonNull(searchString, "Parameter 'searchString' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_desktop_app_info_search.invokeExact(
                    Interop.allocateNativeString(searchString));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return null /* Return type not supported yet */;
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
    public static void setDesktopEnv(@NotNull java.lang.String desktopEnv) {
        java.util.Objects.requireNonNull(desktopEnv, "Parameter 'desktopEnv' must not be null");
        try {
            DowncallHandles.g_desktop_app_info_set_desktop_env.invokeExact(
                    Interop.allocateNativeString(desktopEnv));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_desktop_app_info_new = Interop.downcallHandle(
            "g_desktop_app_info_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_desktop_app_info_new_from_filename = Interop.downcallHandle(
            "g_desktop_app_info_new_from_filename",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_desktop_app_info_new_from_keyfile = Interop.downcallHandle(
            "g_desktop_app_info_new_from_keyfile",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_desktop_app_info_get_action_name = Interop.downcallHandle(
            "g_desktop_app_info_get_action_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_desktop_app_info_get_boolean = Interop.downcallHandle(
            "g_desktop_app_info_get_boolean",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_desktop_app_info_get_categories = Interop.downcallHandle(
            "g_desktop_app_info_get_categories",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_desktop_app_info_get_filename = Interop.downcallHandle(
            "g_desktop_app_info_get_filename",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_desktop_app_info_get_generic_name = Interop.downcallHandle(
            "g_desktop_app_info_get_generic_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_desktop_app_info_get_is_hidden = Interop.downcallHandle(
            "g_desktop_app_info_get_is_hidden",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_desktop_app_info_get_keywords = Interop.downcallHandle(
            "g_desktop_app_info_get_keywords",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_desktop_app_info_get_locale_string = Interop.downcallHandle(
            "g_desktop_app_info_get_locale_string",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_desktop_app_info_get_nodisplay = Interop.downcallHandle(
            "g_desktop_app_info_get_nodisplay",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_desktop_app_info_get_show_in = Interop.downcallHandle(
            "g_desktop_app_info_get_show_in",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_desktop_app_info_get_startup_wm_class = Interop.downcallHandle(
            "g_desktop_app_info_get_startup_wm_class",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_desktop_app_info_get_string = Interop.downcallHandle(
            "g_desktop_app_info_get_string",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_desktop_app_info_get_string_list = Interop.downcallHandle(
            "g_desktop_app_info_get_string_list",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_desktop_app_info_has_key = Interop.downcallHandle(
            "g_desktop_app_info_has_key",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_desktop_app_info_launch_action = Interop.downcallHandle(
            "g_desktop_app_info_launch_action",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_desktop_app_info_launch_uris_as_manager = Interop.downcallHandle(
            "g_desktop_app_info_launch_uris_as_manager",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_desktop_app_info_launch_uris_as_manager_with_fds = Interop.downcallHandle(
            "g_desktop_app_info_launch_uris_as_manager_with_fds",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_desktop_app_info_list_actions = Interop.downcallHandle(
            "g_desktop_app_info_list_actions",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_desktop_app_info_get_implementations = Interop.downcallHandle(
            "g_desktop_app_info_get_implementations",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_desktop_app_info_search = Interop.downcallHandle(
            "g_desktop_app_info_search",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_desktop_app_info_set_desktop_env = Interop.downcallHandle(
            "g_desktop_app_info_set_desktop_env",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
    }
}
