package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GAppInfo and #GAppLaunchContext are used for describing and launching
 * applications installed on the system.
 * 
 * As of GLib 2.20, URIs will always be converted to POSIX paths
 * (using g_file_get_path()) when using g_app_info_launch() even if
 * the application requested an URI and not a POSIX path. For example
 * for a desktop-file based application with Exec key `totem
 * %U` and a single URI, `sftp://foo/file.avi`, then
 * `/home/user/.gvfs/sftp on foo/file.avi` will be passed. This will
 * only work if a set of suitable GIO extensions (such as gvfs 2.26
 * compiled with FUSE support), is available and operational; if this
 * is not the case, the URI will be passed unmodified to the application.
 * Some URIs, such as `mailto:`, of course cannot be mapped to a POSIX
 * path (in gvfs there's no FUSE mount for it); such URIs will be
 * passed unmodified to the application.
 * 
 * Specifically for gvfs 2.26 and later, the POSIX URI will be mapped
 * back to the GIO URI in the #GFile constructors (since gvfs
 * implements the #GVfs extension point). As such, if the application
 * needs to examine the URI, it needs to use g_file_get_uri() or
 * similar on #GFile. In other words, an application cannot assume
 * that the URI passed to e.g. g_file_new_for_commandline_arg() is
 * equal to the result of g_file_get_uri(). The following snippet
 * illustrates this:
 * 
 * |[
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
 * ]|
 * 
 * This code will work when both `cdda://sr0/Track 1.wav` and
 * `/home/user/.gvfs/cdda on sr0/Track 1.wav` is passed to the
 * application. It should be noted that it's generally not safe
 * for applications to rely on the format of a particular URIs.
 * Different launcher applications (e.g. file managers) may have
 * different ideas of what a given URI means.
 */
public interface AppInfo extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Adds a content type to the application information to indicate the
     * application is capable of opening files with the given content type.
     */
    public default boolean addSupportsType(java.lang.String contentType) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_app_info_add_supports_type(handle(), Interop.allocateNativeString(contentType).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Obtains the information whether the #GAppInfo can be deleted.
     * See g_app_info_delete().
     */
    public default boolean canDelete() {
        var RESULT = gtk_h.g_app_info_can_delete(handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if a supported content type can be removed from an application.
     */
    public default boolean canRemoveSupportsType() {
        var RESULT = gtk_h.g_app_info_can_remove_supports_type(handle());
        return (RESULT != 0);
    }
    
    /**
     * Tries to delete a #GAppInfo.
     * 
     * On some platforms, there may be a difference between user-defined
     * #GAppInfos which can be deleted, and system-wide ones which cannot.
     * See g_app_info_can_delete().
     */
    public default boolean delete() {
        var RESULT = gtk_h.g_app_info_delete(handle());
        return (RESULT != 0);
    }
    
    /**
     * Creates a duplicate of a #GAppInfo.
     */
    public default AppInfo dup() {
        var RESULT = gtk_h.g_app_info_dup(handle());
        return new AppInfo.AppInfoImpl(References.get(RESULT, true));
    }
    
    /**
     * Checks if two #GAppInfos are equal.
     * 
     * Note that the check *may not* compare each individual
     * field, and only does an identity check. In case detecting changes in the
     * contents is needed, program code must additionally compare relevant fields.
     */
    public default boolean equal(AppInfo appinfo2) {
        var RESULT = gtk_h.g_app_info_equal(handle(), appinfo2.handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the commandline with which the application will be
     * started.
     */
    public default java.lang.String getCommandline() {
        var RESULT = gtk_h.g_app_info_get_commandline(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets a human-readable description of an installed application.
     */
    public default java.lang.String getDescription() {
        var RESULT = gtk_h.g_app_info_get_description(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the display name of the application. The display name is often more
     * descriptive to the user than the name itself.
     */
    public default java.lang.String getDisplayName() {
        var RESULT = gtk_h.g_app_info_get_display_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the executable's name for the installed application.
     */
    public default java.lang.String getExecutable() {
        var RESULT = gtk_h.g_app_info_get_executable(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the icon for the application.
     */
    public default Icon getIcon() {
        var RESULT = gtk_h.g_app_info_get_icon(handle());
        return new Icon.IconImpl(References.get(RESULT, false));
    }
    
    /**
     * Gets the ID of an application. An id is a string that
     * identifies the application. The exact format of the id is
     * platform dependent. For instance, on Unix this is the
     * desktop file id from the xdg menu specification.
     * 
     * Note that the returned ID may be %NULL, depending on how
     * the @appinfo has been constructed.
     */
    public default java.lang.String getId() {
        var RESULT = gtk_h.g_app_info_get_id(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the installed name of the application.
     */
    public default java.lang.String getName() {
        var RESULT = gtk_h.g_app_info_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Launches the application. Passes @files to the launched application
     * as arguments, using the optional @context to get information
     * about the details of the launcher (like what screen it is on).
     * On error, @error will be set accordingly.
     * 
     * To launch the application without arguments pass a %NULL @files list.
     * 
     * Note that even if the launch is successful the application launched
     * can fail to start if it runs into problems during startup. There is
     * no way to detect this.
     * 
     * Some URIs can be changed when passed through a GFile (for instance
     * unsupported URIs with strange formats like mailto:), so if you have
     * a textual URI you want to pass in as argument, consider using
     * g_app_info_launch_uris() instead.
     * 
     * The launched application inherits the environment of the launching
     * process, but it can be modified with g_app_launch_context_setenv()
     * and g_app_launch_context_unsetenv().
     * 
     * On UNIX, this function sets the `GIO_LAUNCHED_DESKTOP_FILE`
     * environment variable with the path of the launched desktop file and
     * `GIO_LAUNCHED_DESKTOP_FILE_PID` to the process id of the launched
     * process. This can be used to ignore `GIO_LAUNCHED_DESKTOP_FILE`,
     * should it be inherited by further processes. The `DISPLAY` and
     * `DESKTOP_STARTUP_ID` environment variables are also set, based
     * on information provided in @context.
     */
    public default boolean launch(org.gtk.glib.List files, AppLaunchContext context) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_app_info_launch(handle(), files.handle(), context.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Launches the application. This passes the @uris to the launched application
     * as arguments, using the optional @context to get information
     * about the details of the launcher (like what screen it is on).
     * On error, @error will be set accordingly.
     * 
     * To launch the application without arguments pass a %NULL @uris list.
     * 
     * Note that even if the launch is successful the application launched
     * can fail to start if it runs into problems during startup. There is
     * no way to detect this.
     */
    public default boolean launchUris(org.gtk.glib.List uris, AppLaunchContext context) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_app_info_launch_uris(handle(), uris.handle(), context.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Async version of g_app_info_launch_uris().
     * 
     * The @callback is invoked immediately after the application launch, but it
     * waits for activation in case of D-Bus–activated applications and also provides
     * extended error information for sandboxed applications, see notes for
     * g_app_info_launch_default_for_uri_async().
     */
    public default void launchUrisAsync(AppInfo appinfo, org.gtk.glib.List uris, AppLaunchContext context, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            int hash = callback.hashCode();
            Interop.signalRegistry.put(hash, callback);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_app_info_launch_uris_async(handle(), uris.handle(), context.handle(), cancellable.handle(), nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes a g_app_info_launch_uris_async() operation.
     */
    public default boolean launchUrisFinish(AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_app_info_launch_uris_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Removes a supported type from an application, if possible.
     */
    public default boolean removeSupportsType(java.lang.String contentType) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_app_info_remove_supports_type(handle(), Interop.allocateNativeString(contentType).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Sets the application as the default handler for the given file extension.
     */
    public default boolean setAsDefaultForExtension(java.lang.String extension) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_app_info_set_as_default_for_extension(handle(), Interop.allocateNativeString(extension).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Sets the application as the default handler for a given type.
     */
    public default boolean setAsDefaultForType(java.lang.String contentType) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_app_info_set_as_default_for_type(handle(), Interop.allocateNativeString(contentType).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Sets the application as the last used application for a given type.
     * This will make the application appear as first in the list returned
     * by g_app_info_get_recommended_for_type(), regardless of the default
     * application for that content type.
     */
    public default boolean setAsLastUsedForType(java.lang.String contentType) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_app_info_set_as_last_used_for_type(handle(), Interop.allocateNativeString(contentType).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Checks if the application info should be shown in menus that
     * list available applications.
     */
    public default boolean shouldShow() {
        var RESULT = gtk_h.g_app_info_should_show(handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if the application accepts files as arguments.
     */
    public default boolean supportsFiles() {
        var RESULT = gtk_h.g_app_info_supports_files(handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if the application supports reading files and directories from URIs.
     */
    public default boolean supportsUris() {
        var RESULT = gtk_h.g_app_info_supports_uris(handle());
        return (RESULT != 0);
    }
    
    /**
     * Creates a new #GAppInfo from the given information.
     * 
     * Note that for @commandline, the quoting rules of the Exec key of the
     * [freedesktop.org Desktop Entry Specification](http://freedesktop.org/Standards/desktop-entry-spec)
     * are applied. For example, if the @commandline contains
     * percent-encoded URIs, the percent-character must be doubled in order to prevent it from
     * being swallowed by Exec key unquoting. See the specification for exact quoting rules.
     */
    public static AppInfo createFromCommandline(java.lang.String commandline, java.lang.String applicationName, int flags) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_app_info_create_from_commandline(Interop.allocateNativeString(commandline).handle(), Interop.allocateNativeString(applicationName).handle(), flags, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new AppInfo.AppInfoImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets a list of all of the applications currently registered
     * on this system.
     * 
     * For desktop files, this includes applications that have
     * `NoDisplay=true` set or are excluded from display by means
     * of `OnlyShowIn` or `NotShowIn`. See g_app_info_should_show().
     * The returned list does not include applications which have
     * the `Hidden` key set.
     */
    public static org.gtk.glib.List getAll() {
        var RESULT = gtk_h.g_app_info_get_all();
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Gets a list of all #GAppInfos for a given content type,
     * including the recommended and fallback #GAppInfos. See
     * g_app_info_get_recommended_for_type() and
     * g_app_info_get_fallback_for_type().
     */
    public static org.gtk.glib.List getAllForType(java.lang.String contentType) {
        var RESULT = gtk_h.g_app_info_get_all_for_type(Interop.allocateNativeString(contentType).handle());
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Gets the default #GAppInfo for a given content type.
     */
    public static AppInfo getDefaultForType(java.lang.String contentType, boolean mustSupportUris) {
        var RESULT = gtk_h.g_app_info_get_default_for_type(Interop.allocateNativeString(contentType).handle(), mustSupportUris ? 1 : 0);
        return new AppInfo.AppInfoImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets the default application for handling URIs with
     * the given URI scheme. A URI scheme is the initial part
     * of the URI, up to but not including the ':', e.g. "http",
     * "ftp" or "sip".
     */
    public static AppInfo getDefaultForUriScheme(java.lang.String uriScheme) {
        var RESULT = gtk_h.g_app_info_get_default_for_uri_scheme(Interop.allocateNativeString(uriScheme).handle());
        return new AppInfo.AppInfoImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets a list of fallback #GAppInfos for a given content type, i.e.
     * those applications which claim to support the given content type
     * by MIME type subclassing and not directly.
     */
    public static org.gtk.glib.List getFallbackForType(java.lang.String contentType) {
        var RESULT = gtk_h.g_app_info_get_fallback_for_type(Interop.allocateNativeString(contentType).handle());
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Gets a list of recommended #GAppInfos for a given content type, i.e.
     * those applications which claim to support the given content type exactly,
     * and not by MIME type subclassing.
     * Note that the first application of the list is the last used one, i.e.
     * the last one for which g_app_info_set_as_last_used_for_type() has been
     * called.
     */
    public static org.gtk.glib.List getRecommendedForType(java.lang.String contentType) {
        var RESULT = gtk_h.g_app_info_get_recommended_for_type(Interop.allocateNativeString(contentType).handle());
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Utility function that launches the default application
     * registered to handle the specified uri. Synchronous I/O
     * is done on the uri to detect the type of the file if
     * required.
     * 
     * The D-Bus–activated applications don't have to be started if your application
     * terminates too soon after this function. To prevent this, use
     * g_app_info_launch_default_for_uri_async() instead.
     */
    public static boolean launchDefaultForUri(java.lang.String uri, AppLaunchContext context) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_app_info_launch_default_for_uri(Interop.allocateNativeString(uri).handle(), context.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Async version of g_app_info_launch_default_for_uri().
     * 
     * This version is useful if you are interested in receiving
     * error information in the case where the application is
     * sandboxed and the portal may present an application chooser
     * dialog to the user.
     * 
     * This is also useful if you want to be sure that the D-Bus–activated
     * applications are really started before termination and if you are interested
     * in receiving error information from their activation.
     */
    public void launchDefaultForUriAsync(java.lang.String uri, AppLaunchContext context, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            int hash = callback.hashCode();
            Interop.signalRegistry.put(hash, callback);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_app_info_launch_default_for_uri_async(Interop.allocateNativeString(uri).handle(), context.handle(), cancellable.handle(), nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an asynchronous launch-default-for-uri operation.
     */
    public static boolean launchDefaultForUriFinish(AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_app_info_launch_default_for_uri_finish(result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Removes all changes to the type associations done by
     * g_app_info_set_as_default_for_type(),
     * g_app_info_set_as_default_for_extension(),
     * g_app_info_add_supports_type() or
     * g_app_info_remove_supports_type().
     */
    public static void resetTypeAssociations(java.lang.String contentType) {
        gtk_h.g_app_info_reset_type_associations(Interop.allocateNativeString(contentType).handle());
    }
    
    class AppInfoImpl extends org.gtk.gobject.Object implements AppInfo {
        public AppInfoImpl(io.github.jwharm.javagi.interop.Reference reference) {
            super(reference);
        }
    }
}
