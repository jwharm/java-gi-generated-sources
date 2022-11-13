package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link AppInfo} and {@link AppLaunchContext} are used for describing and launching
 * applications installed on the system.
 * <p>
 * As of GLib 2.20, URIs will always be converted to POSIX paths
 * (using g_file_get_path()) when using g_app_info_launch() even if
 * the application requested an URI and not a POSIX path. For example
 * for a desktop-file based application with Exec key {@code totem
 * %U} and a single URI, {@code sftp://foo/file.avi}, then
 * {@code /home/user/.gvfs/sftp on foo/file.avi} will be passed. This will
 * only work if a set of suitable GIO extensions (such as gvfs 2.26
 * compiled with FUSE support), is available and operational; if this
 * is not the case, the URI will be passed unmodified to the application.
 * Some URIs, such as {@code mailto:}, of course cannot be mapped to a POSIX
 * path (in gvfs there's no FUSE mount for it); such URIs will be
 * passed unmodified to the application.
 * <p>
 * Specifically for gvfs 2.26 and later, the POSIX URI will be mapped
 * back to the GIO URI in the {@link File} constructors (since gvfs
 * implements the {@link Vfs} extension point). As such, if the application
 * needs to examine the URI, it needs to use g_file_get_uri() or
 * similar on {@link File}. In other words, an application cannot assume
 * that the URI passed to e.g. g_file_new_for_commandline_arg() is
 * equal to the result of g_file_get_uri(). The following snippet
 * illustrates this:
 * <pre>{@code 
 * GFile *f;
 * char *uri;
 * 
 * file = g_file_new_for_commandline_arg (uri_from_commandline);
 * 
 * uri = g_file_get_uri (file);
 * strcmp (uri, uri_from_commandline) == 0;
 * g_free (uri);
 * 
 * if (g_file_has_uri_scheme (file, "cdda"))
 *   {
 *     // do something special with uri
 *   }
 * g_object_unref (file);
 * }</pre>
 * <p>
 * This code will work when both {@code cdda://sr0/Track 1.wav} and
 * {@code /home/user/.gvfs/cdda on sr0/Track 1.wav} is passed to the
 * application. It should be noted that it's generally not safe
 * for applications to rely on the format of a particular URIs.
 * Different launcher applications (e.g. file managers) may have
 * different ideas of what a given URI means.
 */
public interface AppInfo extends io.github.jwharm.javagi.Proxy {
    
    /**
     * Cast object to AppInfo if its GType is a (or inherits from) "GAppInfo".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code AppInfo} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GAppInfo", a ClassCastException will be thrown.
     */
    public static AppInfo castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GAppInfo"))) {
            return new AppInfoImpl(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GAppInfo");
        }
    }
    
    /**
     * Adds a content type to the application information to indicate the
     * application is capable of opening files with the given content type.
     * @param contentType a string.
     * @return {@code true} on success, {@code false} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean addSupportsType(@NotNull java.lang.String contentType) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(contentType, "Parameter 'contentType' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_app_info_add_supports_type.invokeExact(
                    handle(),
                    Interop.allocateNativeString(contentType),
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
     * Obtains the information whether the {@link AppInfo} can be deleted.
     * See g_app_info_delete().
     * @return {@code true} if {@code appinfo} can be deleted
     */
    default boolean canDelete() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_app_info_can_delete.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks if a supported content type can be removed from an application.
     * @return {@code true} if it is possible to remove supported
     *     content types from a given {@code appinfo}, {@code false} if not.
     */
    default boolean canRemoveSupportsType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_app_info_can_remove_supports_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Tries to delete a {@link AppInfo}.
     * <p>
     * On some platforms, there may be a difference between user-defined
     * {@code GAppInfos} which can be deleted, and system-wide ones which cannot.
     * See g_app_info_can_delete().
     * @return {@code true} if {@code appinfo} has been deleted
     */
    default boolean delete() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_app_info_delete.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Creates a duplicate of a {@link AppInfo}.
     * @return a duplicate of {@code appinfo}.
     */
    default @NotNull org.gtk.gio.AppInfo dup() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_app_info_dup.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.AppInfo.AppInfoImpl(RESULT, Ownership.FULL);
    }
    
    /**
     * Checks if two {@code GAppInfos} are equal.
     * <p>
     * Note that the check <em>may not</em> compare each individual
     * field, and only does an identity check. In case detecting changes in the
     * contents is needed, program code must additionally compare relevant fields.
     * @param appinfo2 the second {@link AppInfo}.
     * @return {@code true} if {@code appinfo1} is equal to {@code appinfo2}. {@code false} otherwise.
     */
    default boolean equal(@NotNull org.gtk.gio.AppInfo appinfo2) {
        java.util.Objects.requireNonNull(appinfo2, "Parameter 'appinfo2' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_app_info_equal.invokeExact(
                    handle(),
                    appinfo2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the commandline with which the application will be
     * started.
     * @return a string containing the {@code appinfo}'s commandline,
     *     or {@code null} if this information is not available
     */
    default @Nullable java.lang.String getCommandline() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_app_info_get_commandline.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets a human-readable description of an installed application.
     * @return a string containing a description of the
     * application {@code appinfo}, or {@code null} if none.
     */
    default @Nullable java.lang.String getDescription() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_app_info_get_description.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the display name of the application. The display name is often more
     * descriptive to the user than the name itself.
     * @return the display name of the application for {@code appinfo}, or the name if
     * no display name is available.
     */
    default @NotNull java.lang.String getDisplayName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_app_info_get_display_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the executable's name for the installed application.
     * @return a string containing the {@code appinfo}'s application
     * binaries name
     */
    default @NotNull java.lang.String getExecutable() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_app_info_get_executable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the icon for the application.
     * @return the default {@link Icon} for {@code appinfo} or {@code null}
     * if there is no default icon.
     */
    default @Nullable org.gtk.gio.Icon getIcon() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_app_info_get_icon.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.Icon.IconImpl(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the ID of an application. An id is a string that
     * identifies the application. The exact format of the id is
     * platform dependent. For instance, on Unix this is the
     * desktop file id from the xdg menu specification.
     * <p>
     * Note that the returned ID may be {@code null}, depending on how
     * the {@code appinfo} has been constructed.
     * @return a string containing the application's ID.
     */
    default @Nullable java.lang.String getId() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_app_info_get_id.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the installed name of the application.
     * @return the name of the application for {@code appinfo}.
     */
    default @NotNull java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_app_info_get_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Retrieves the list of content types that {@code app_info} claims to support.
     * If this information is not provided by the environment, this function
     * will return {@code null}.
     * This function does not take in consideration associations added with
     * g_app_info_add_supports_type(), but only those exported directly by
     * the application.
     * @return a list of content types.
     */
    default @NotNull PointerString getSupportedTypes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_app_info_get_supported_types.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Launches the application. Passes {@code files} to the launched application
     * as arguments, using the optional {@code context} to get information
     * about the details of the launcher (like what screen it is on).
     * On error, {@code error} will be set accordingly.
     * <p>
     * To launch the application without arguments pass a {@code null} {@code files} list.
     * <p>
     * Note that even if the launch is successful the application launched
     * can fail to start if it runs into problems during startup. There is
     * no way to detect this.
     * <p>
     * Some URIs can be changed when passed through a GFile (for instance
     * unsupported URIs with strange formats like mailto:), so if you have
     * a textual URI you want to pass in as argument, consider using
     * g_app_info_launch_uris() instead.
     * <p>
     * The launched application inherits the environment of the launching
     * process, but it can be modified with g_app_launch_context_setenv()
     * and g_app_launch_context_unsetenv().
     * <p>
     * On UNIX, this function sets the {@code GIO_LAUNCHED_DESKTOP_FILE}
     * environment variable with the path of the launched desktop file and
     * {@code GIO_LAUNCHED_DESKTOP_FILE_PID} to the process id of the launched
     * process. This can be used to ignore {@code GIO_LAUNCHED_DESKTOP_FILE},
     * should it be inherited by further processes. The {@code DISPLAY} and
     * {@code DESKTOP_STARTUP_ID} environment variables are also set, based
     * on information provided in {@code context}.
     * @param files a {@link org.gtk.glib.List} of {@link File} objects
     * @param context a {@link AppLaunchContext} or {@code null}
     * @return {@code true} on successful launch, {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean launch(@Nullable org.gtk.glib.List files, @Nullable org.gtk.gio.AppLaunchContext context) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_app_info_launch.invokeExact(
                    handle(),
                    (Addressable) (files == null ? MemoryAddress.NULL : files.handle()),
                    (Addressable) (context == null ? MemoryAddress.NULL : context.handle()),
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
     * Launches the application. This passes the {@code uris} to the launched application
     * as arguments, using the optional {@code context} to get information
     * about the details of the launcher (like what screen it is on).
     * On error, {@code error} will be set accordingly.
     * <p>
     * To launch the application without arguments pass a {@code null} {@code uris} list.
     * <p>
     * Note that even if the launch is successful the application launched
     * can fail to start if it runs into problems during startup. There is
     * no way to detect this.
     * @param uris a {@link org.gtk.glib.List} containing URIs to launch.
     * @param context a {@link AppLaunchContext} or {@code null}
     * @return {@code true} on successful launch, {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean launchUris(@Nullable org.gtk.glib.List uris, @Nullable org.gtk.gio.AppLaunchContext context) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_app_info_launch_uris.invokeExact(
                    handle(),
                    (Addressable) (uris == null ? MemoryAddress.NULL : uris.handle()),
                    (Addressable) (context == null ? MemoryAddress.NULL : context.handle()),
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
     * Async version of g_app_info_launch_uris().
     * <p>
     * The {@code callback} is invoked immediately after the application launch, but it
     * waits for activation in case of D-Bus–activated applications and also provides
     * extended error information for sandboxed applications, see notes for
     * g_app_info_launch_default_for_uri_async().
     * @param uris a {@link org.gtk.glib.List} containing URIs to launch.
     * @param context a {@link AppLaunchContext} or {@code null}
     * @param cancellable a {@link Cancellable}
     * @param callback a {@link AsyncReadyCallback} to call when the request is done
     */
    default void launchUrisAsync(@Nullable org.gtk.glib.List uris, @Nullable org.gtk.gio.AppLaunchContext context, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_app_info_launch_uris_async.invokeExact(
                    handle(),
                    (Addressable) (uris == null ? MemoryAddress.NULL : uris.handle()),
                    (Addressable) (context == null ? MemoryAddress.NULL : context.handle()),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes a g_app_info_launch_uris_async() operation.
     * @param result a {@link AsyncResult}
     * @return {@code true} on successful launch, {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean launchUrisFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_app_info_launch_uris_finish.invokeExact(
                    handle(),
                    result.handle(),
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
     * Removes a supported type from an application, if possible.
     * @param contentType a string.
     * @return {@code true} on success, {@code false} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean removeSupportsType(@NotNull java.lang.String contentType) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(contentType, "Parameter 'contentType' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_app_info_remove_supports_type.invokeExact(
                    handle(),
                    Interop.allocateNativeString(contentType),
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
     * Sets the application as the default handler for the given file extension.
     * @param extension a string containing the file extension
     *     (without the dot).
     * @return {@code true} on success, {@code false} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean setAsDefaultForExtension(@NotNull java.lang.String extension) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(extension, "Parameter 'extension' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_app_info_set_as_default_for_extension.invokeExact(
                    handle(),
                    Interop.allocateNativeString(extension),
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
     * Sets the application as the default handler for a given type.
     * @param contentType the content type.
     * @return {@code true} on success, {@code false} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean setAsDefaultForType(@NotNull java.lang.String contentType) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(contentType, "Parameter 'contentType' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_app_info_set_as_default_for_type.invokeExact(
                    handle(),
                    Interop.allocateNativeString(contentType),
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
     * Sets the application as the last used application for a given type.
     * This will make the application appear as first in the list returned
     * by g_app_info_get_recommended_for_type(), regardless of the default
     * application for that content type.
     * @param contentType the content type.
     * @return {@code true} on success, {@code false} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean setAsLastUsedForType(@NotNull java.lang.String contentType) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(contentType, "Parameter 'contentType' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_app_info_set_as_last_used_for_type.invokeExact(
                    handle(),
                    Interop.allocateNativeString(contentType),
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
     * Checks if the application info should be shown in menus that
     * list available applications.
     * @return {@code true} if the {@code appinfo} should be shown, {@code false} otherwise.
     */
    default boolean shouldShow() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_app_info_should_show.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks if the application accepts files as arguments.
     * @return {@code true} if the {@code appinfo} supports files.
     */
    default boolean supportsFiles() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_app_info_supports_files.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks if the application supports reading files and directories from URIs.
     * @return {@code true} if the {@code appinfo} supports URIs.
     */
    default boolean supportsUris() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_app_info_supports_uris.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Creates a new {@link AppInfo} from the given information.
     * <p>
     * Note that for {@code commandline}, the quoting rules of the Exec key of the
     * <a href="http://freedesktop.org/Standards/desktop-entry-spec">freedesktop.org Desktop Entry Specification</a>
     * are applied. For example, if the {@code commandline} contains
     * percent-encoded URIs, the percent-character must be doubled in order to prevent it from
     * being swallowed by Exec key unquoting. See the specification for exact quoting rules.
     * @param commandline the commandline to use
     * @param applicationName the application name, or {@code null} to use {@code commandline}
     * @param flags flags that can specify details of the created {@link AppInfo}
     * @return new {@link AppInfo} for given command.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static @NotNull org.gtk.gio.AppInfo createFromCommandline(@NotNull java.lang.String commandline, @Nullable java.lang.String applicationName, @NotNull org.gtk.gio.AppInfoCreateFlags flags) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(commandline, "Parameter 'commandline' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_app_info_create_from_commandline.invokeExact(
                    Interop.allocateNativeString(commandline),
                    (Addressable) (applicationName == null ? MemoryAddress.NULL : Interop.allocateNativeString(applicationName)),
                    flags.getValue(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.AppInfo.AppInfoImpl(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets a list of all of the applications currently registered
     * on this system.
     * <p>
     * For desktop files, this includes applications that have
     * {@code NoDisplay=true} set or are excluded from display by means
     * of {@code OnlyShowIn} or {@code NotShowIn}. See g_app_info_should_show().
     * The returned list does not include applications which have
     * the {@code Hidden} key set.
     * @return a newly allocated {@link org.gtk.glib.List} of references to {@code GAppInfos}.
     */
    public static @NotNull org.gtk.glib.List getAll() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_app_info_get_all.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets a list of all {@code GAppInfos} for a given content type,
     * including the recommended and fallback {@code GAppInfos}. See
     * g_app_info_get_recommended_for_type() and
     * g_app_info_get_fallback_for_type().
     * @param contentType the content type to find a {@link AppInfo} for
     * @return {@link org.gtk.glib.List} of {@code GAppInfos}
     *     for given {@code content_type} or {@code null} on error.
     */
    public static @NotNull org.gtk.glib.List getAllForType(@NotNull java.lang.String contentType) {
        java.util.Objects.requireNonNull(contentType, "Parameter 'contentType' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_app_info_get_all_for_type.invokeExact(
                    Interop.allocateNativeString(contentType));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the default {@link AppInfo} for a given content type.
     * @param contentType the content type to find a {@link AppInfo} for
     * @param mustSupportUris if {@code true}, the {@link AppInfo} is expected to
     *     support URIs
     * @return {@link AppInfo} for given {@code content_type} or
     *     {@code null} on error.
     */
    public static @Nullable org.gtk.gio.AppInfo getDefaultForType(@NotNull java.lang.String contentType, boolean mustSupportUris) {
        java.util.Objects.requireNonNull(contentType, "Parameter 'contentType' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_app_info_get_default_for_type.invokeExact(
                    Interop.allocateNativeString(contentType),
                    mustSupportUris ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.AppInfo.AppInfoImpl(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the default application for handling URIs with
     * the given URI scheme. A URI scheme is the initial part
     * of the URI, up to but not including the ':', e.g. "http",
     * "ftp" or "sip".
     * @param uriScheme a string containing a URI scheme.
     * @return {@link AppInfo} for given {@code uri_scheme} or
     *     {@code null} on error.
     */
    public static @Nullable org.gtk.gio.AppInfo getDefaultForUriScheme(@NotNull java.lang.String uriScheme) {
        java.util.Objects.requireNonNull(uriScheme, "Parameter 'uriScheme' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_app_info_get_default_for_uri_scheme.invokeExact(
                    Interop.allocateNativeString(uriScheme));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.AppInfo.AppInfoImpl(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets a list of fallback {@code GAppInfos} for a given content type, i.e.
     * those applications which claim to support the given content type
     * by MIME type subclassing and not directly.
     * @param contentType the content type to find a {@link AppInfo} for
     * @return {@link org.gtk.glib.List} of {@code GAppInfos}
     *     for given {@code content_type} or {@code null} on error.
     */
    public static @NotNull org.gtk.glib.List getFallbackForType(@NotNull java.lang.String contentType) {
        java.util.Objects.requireNonNull(contentType, "Parameter 'contentType' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_app_info_get_fallback_for_type.invokeExact(
                    Interop.allocateNativeString(contentType));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets a list of recommended {@code GAppInfos} for a given content type, i.e.
     * those applications which claim to support the given content type exactly,
     * and not by MIME type subclassing.
     * Note that the first application of the list is the last used one, i.e.
     * the last one for which g_app_info_set_as_last_used_for_type() has been
     * called.
     * @param contentType the content type to find a {@link AppInfo} for
     * @return {@link org.gtk.glib.List} of {@code GAppInfos}
     *     for given {@code content_type} or {@code null} on error.
     */
    public static @NotNull org.gtk.glib.List getRecommendedForType(@NotNull java.lang.String contentType) {
        java.util.Objects.requireNonNull(contentType, "Parameter 'contentType' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_app_info_get_recommended_for_type.invokeExact(
                    Interop.allocateNativeString(contentType));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
    }
    
    /**
     * Utility function that launches the default application
     * registered to handle the specified uri. Synchronous I/O
     * is done on the uri to detect the type of the file if
     * required.
     * <p>
     * The D-Bus–activated applications don't have to be started if your application
     * terminates too soon after this function. To prevent this, use
     * g_app_info_launch_default_for_uri_async() instead.
     * @param uri the uri to show
     * @param context an optional {@link AppLaunchContext}
     * @return {@code true} on success, {@code false} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static boolean launchDefaultForUri(@NotNull java.lang.String uri, @Nullable org.gtk.gio.AppLaunchContext context) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_app_info_launch_default_for_uri.invokeExact(
                    Interop.allocateNativeString(uri),
                    (Addressable) (context == null ? MemoryAddress.NULL : context.handle()),
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
     * Async version of g_app_info_launch_default_for_uri().
     * <p>
     * This version is useful if you are interested in receiving
     * error information in the case where the application is
     * sandboxed and the portal may present an application chooser
     * dialog to the user.
     * <p>
     * This is also useful if you want to be sure that the D-Bus–activated
     * applications are really started before termination and if you are interested
     * in receiving error information from their activation.
     * @param uri the uri to show
     * @param context an optional {@link AppLaunchContext}
     * @param cancellable a {@link Cancellable}
     * @param callback a {@link AsyncReadyCallback} to call when the request is done
     */
    public static void launchDefaultForUriAsync(@NotNull java.lang.String uri, @Nullable org.gtk.gio.AppLaunchContext context, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        try {
            DowncallHandles.g_app_info_launch_default_for_uri_async.invokeExact(
                    Interop.allocateNativeString(uri),
                    (Addressable) (context == null ? MemoryAddress.NULL : context.handle()),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an asynchronous launch-default-for-uri operation.
     * @param result a {@link AsyncResult}
     * @return {@code true} if the launch was successful, {@code false} if {@code error} is set
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static boolean launchDefaultForUriFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_app_info_launch_default_for_uri_finish.invokeExact(
                    result.handle(),
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
     * Removes all changes to the type associations done by
     * g_app_info_set_as_default_for_type(),
     * g_app_info_set_as_default_for_extension(),
     * g_app_info_add_supports_type() or
     * g_app_info_remove_supports_type().
     * @param contentType a content type
     */
    public static void resetTypeAssociations(@NotNull java.lang.String contentType) {
        java.util.Objects.requireNonNull(contentType, "Parameter 'contentType' must not be null");
        try {
            DowncallHandles.g_app_info_reset_type_associations.invokeExact(
                    Interop.allocateNativeString(contentType));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_app_info_add_supports_type = Interop.downcallHandle(
            "g_app_info_add_supports_type",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_app_info_can_delete = Interop.downcallHandle(
            "g_app_info_can_delete",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_app_info_can_remove_supports_type = Interop.downcallHandle(
            "g_app_info_can_remove_supports_type",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_app_info_delete = Interop.downcallHandle(
            "g_app_info_delete",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_app_info_dup = Interop.downcallHandle(
            "g_app_info_dup",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_app_info_equal = Interop.downcallHandle(
            "g_app_info_equal",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_app_info_get_commandline = Interop.downcallHandle(
            "g_app_info_get_commandline",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_app_info_get_description = Interop.downcallHandle(
            "g_app_info_get_description",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_app_info_get_display_name = Interop.downcallHandle(
            "g_app_info_get_display_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_app_info_get_executable = Interop.downcallHandle(
            "g_app_info_get_executable",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_app_info_get_icon = Interop.downcallHandle(
            "g_app_info_get_icon",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_app_info_get_id = Interop.downcallHandle(
            "g_app_info_get_id",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_app_info_get_name = Interop.downcallHandle(
            "g_app_info_get_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_app_info_get_supported_types = Interop.downcallHandle(
            "g_app_info_get_supported_types",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_app_info_launch = Interop.downcallHandle(
            "g_app_info_launch",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_app_info_launch_uris = Interop.downcallHandle(
            "g_app_info_launch_uris",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_app_info_launch_uris_async = Interop.downcallHandle(
            "g_app_info_launch_uris_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_app_info_launch_uris_finish = Interop.downcallHandle(
            "g_app_info_launch_uris_finish",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_app_info_remove_supports_type = Interop.downcallHandle(
            "g_app_info_remove_supports_type",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_app_info_set_as_default_for_extension = Interop.downcallHandle(
            "g_app_info_set_as_default_for_extension",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_app_info_set_as_default_for_type = Interop.downcallHandle(
            "g_app_info_set_as_default_for_type",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_app_info_set_as_last_used_for_type = Interop.downcallHandle(
            "g_app_info_set_as_last_used_for_type",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_app_info_should_show = Interop.downcallHandle(
            "g_app_info_should_show",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_app_info_supports_files = Interop.downcallHandle(
            "g_app_info_supports_files",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_app_info_supports_uris = Interop.downcallHandle(
            "g_app_info_supports_uris",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_app_info_create_from_commandline = Interop.downcallHandle(
            "g_app_info_create_from_commandline",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_app_info_get_all = Interop.downcallHandle(
            "g_app_info_get_all",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_app_info_get_all_for_type = Interop.downcallHandle(
            "g_app_info_get_all_for_type",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_app_info_get_default_for_type = Interop.downcallHandle(
            "g_app_info_get_default_for_type",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_app_info_get_default_for_uri_scheme = Interop.downcallHandle(
            "g_app_info_get_default_for_uri_scheme",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_app_info_get_fallback_for_type = Interop.downcallHandle(
            "g_app_info_get_fallback_for_type",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_app_info_get_recommended_for_type = Interop.downcallHandle(
            "g_app_info_get_recommended_for_type",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_app_info_launch_default_for_uri = Interop.downcallHandle(
            "g_app_info_launch_default_for_uri",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_app_info_launch_default_for_uri_async = Interop.downcallHandle(
            "g_app_info_launch_default_for_uri_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_app_info_launch_default_for_uri_finish = Interop.downcallHandle(
            "g_app_info_launch_default_for_uri_finish",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_app_info_reset_type_associations = Interop.downcallHandle(
            "g_app_info_reset_type_associations",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
    }
    
    class AppInfoImpl extends org.gtk.gobject.Object implements AppInfo {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public AppInfoImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
