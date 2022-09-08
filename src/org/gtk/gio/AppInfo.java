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
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = gtk_h.g_app_info_add_supports_type(handle(), Interop.allocateNativeString(contentType).handle(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
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
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = gtk_h.g_app_info_launch(handle(), files.handle(), context.handle(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
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
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = gtk_h.g_app_info_launch_uris(handle(), uris.handle(), context.handle(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Finishes a g_app_info_launch_uris_async() operation.
     */
    public default boolean launchUrisFinish(AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = gtk_h.g_app_info_launch_uris_finish(handle(), result.handle(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Removes a supported type from an application, if possible.
     */
    public default boolean removeSupportsType(java.lang.String contentType) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = gtk_h.g_app_info_remove_supports_type(handle(), Interop.allocateNativeString(contentType).handle(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Sets the application as the default handler for the given file extension.
     */
    public default boolean setAsDefaultForExtension(java.lang.String extension) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = gtk_h.g_app_info_set_as_default_for_extension(handle(), Interop.allocateNativeString(extension).handle(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Sets the application as the default handler for a given type.
     */
    public default boolean setAsDefaultForType(java.lang.String contentType) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = gtk_h.g_app_info_set_as_default_for_type(handle(), Interop.allocateNativeString(contentType).handle(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
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
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = gtk_h.g_app_info_set_as_last_used_for_type(handle(), Interop.allocateNativeString(contentType).handle(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
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
    
    class AppInfoImpl extends org.gtk.gobject.Object implements AppInfo {
        public AppInfoImpl(io.github.jwharm.javagi.interop.Reference reference) {
            super(reference);
        }
    }
}
