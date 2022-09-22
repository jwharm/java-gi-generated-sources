package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link DesktopAppInfo} is an implementation of {@link AppInfo} based on
 * desktop files.
 * <p>
 * Note that {@code <gio/gdesktopappinfo.h>} belongs to the UNIX-specific
 * GIO interfaces, thus you have to use the {@code gio-unix-2.0.pc} pkg-config
 * file when using it.
 */
public class DesktopAppInfo extends org.gtk.gobject.Object implements AppInfo {

    public DesktopAppInfo(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to DesktopAppInfo */
    public static DesktopAppInfo castFrom(org.gtk.gobject.Object gobject) {
        return new DesktopAppInfo(gobject.getReference());
    }
    
    private static Reference constructNew(java.lang.String desktopId) {
        Reference RESULT = References.get(gtk_h.g_desktop_app_info_new(Interop.allocateNativeString(desktopId).handle()), true);
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
     */
    public DesktopAppInfo(java.lang.String desktopId) {
        super(constructNew(desktopId));
    }
    
    private static Reference constructNewFromFilename(java.lang.String filename) {
        Reference RESULT = References.get(gtk_h.g_desktop_app_info_new_from_filename(Interop.allocateNativeString(filename).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link DesktopAppInfo}.
     */
    public static DesktopAppInfo newFromFilename(java.lang.String filename) {
        return new DesktopAppInfo(constructNewFromFilename(filename));
    }
    
    private static Reference constructNewFromKeyfile(org.gtk.glib.KeyFile keyFile) {
        Reference RESULT = References.get(gtk_h.g_desktop_app_info_new_from_keyfile(keyFile.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link DesktopAppInfo}.
     */
    public static DesktopAppInfo newFromKeyfile(org.gtk.glib.KeyFile keyFile) {
        return new DesktopAppInfo(constructNewFromKeyfile(keyFile));
    }
    
    /**
     * Gets the user-visible display name of the "additional application
     * action" specified by {@code action_name}.
     * <p>
     * This corresponds to the "Name" key within the keyfile group for the
     * action.
     */
    public java.lang.String getActionName(java.lang.String actionName) {
        var RESULT = gtk_h.g_desktop_app_info_get_action_name(handle(), Interop.allocateNativeString(actionName).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Looks up a boolean value in the keyfile backing {@code info}.
     * <p>
     * The {@code key} is looked up in the "Desktop Entry" group.
     */
    public boolean getBoolean(java.lang.String key) {
        var RESULT = gtk_h.g_desktop_app_info_get_boolean(handle(), Interop.allocateNativeString(key).handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the categories from the desktop file.
     */
    public java.lang.String getCategories() {
        var RESULT = gtk_h.g_desktop_app_info_get_categories(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * When {@code info} was created from a known filename, return it.  In some
     * situations such as the {@link DesktopAppInfo} returned from
     * g_desktop_app_info_new_from_keyfile(), this function will return <code>null</code>.
     */
    public java.lang.String getFilename() {
        var RESULT = gtk_h.g_desktop_app_info_get_filename(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the generic name from the desktop file.
     */
    public java.lang.String getGenericName() {
        var RESULT = gtk_h.g_desktop_app_info_get_generic_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * A desktop file is hidden if the Hidden key in it is
     * set to True.
     */
    public boolean getIsHidden() {
        var RESULT = gtk_h.g_desktop_app_info_get_is_hidden(handle());
        return (RESULT != 0);
    }
    
    /**
     * Looks up a localized string value in the keyfile backing {@code info}
     * translated to the current locale.
     * <p>
     * The {@code key} is looked up in the "Desktop Entry" group.
     */
    public java.lang.String getLocaleString(java.lang.String key) {
        var RESULT = gtk_h.g_desktop_app_info_get_locale_string(handle(), Interop.allocateNativeString(key).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the value of the NoDisplay key, which helps determine if the
     * application info should be shown in menus. See
     * {@code G_KEY_FILE_DESKTOP_KEY_NO_DISPLAY} and g_app_info_should_show().
     */
    public boolean getNodisplay() {
        var RESULT = gtk_h.g_desktop_app_info_get_nodisplay(handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if the application info should be shown in menus that list available
     * applications for a specific name of the desktop, based on the
     * {@code OnlyShowIn} and {@code NotShowIn} keys.
     * <p>
     * {@code desktop_env} should typically be given as <code>null</code>, in which case the
     * {@code XDG_CURRENT_DESKTOP} environment variable is consulted.  If you want
     * to override the default mechanism then you may specify {@code desktop_env},
     * but this is not recommended.
     * <p>
     * Note that g_app_info_should_show() for {@code info} will include this check (with
     * <code>null</code> for {@code desktop_env}) as well as additional checks.
     */
    public boolean getShowIn(java.lang.String desktopEnv) {
        var RESULT = gtk_h.g_desktop_app_info_get_show_in(handle(), Interop.allocateNativeString(desktopEnv).handle());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves the StartupWMClass field from {@code info}. This represents the
     * WM_CLASS property of the main window of the application, if launched
     * through {@code info}.
     */
    public java.lang.String getStartupWmClass() {
        var RESULT = gtk_h.g_desktop_app_info_get_startup_wm_class(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Looks up a string value in the keyfile backing {@code info}.
     * <p>
     * The {@code key} is looked up in the "Desktop Entry" group.
     */
    public java.lang.String getString(java.lang.String key) {
        var RESULT = gtk_h.g_desktop_app_info_get_string(handle(), Interop.allocateNativeString(key).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns whether {@code key} exists in the "Desktop Entry" group
     * of the keyfile backing {@code info}.
     */
    public boolean hasKey(java.lang.String key) {
        var RESULT = gtk_h.g_desktop_app_info_has_key(handle(), Interop.allocateNativeString(key).handle());
        return (RESULT != 0);
    }
    
    /**
     * Activates the named application action.
     * <p>
     * You may only call this function on action names that were
     * returned from g_desktop_app_info_list_actions().
     * <p>
     * Note that if the main entry of the desktop file indicates that the
     * application supports startup notification, and {@code launch_context} is
     * non-<code>null</code>, then startup notification will be used when activating the
     * action (and as such, invocation of the action on the receiving side
     * must signal the end of startup notification when it is completed).
     * This is the expected behaviour of applications declaring additional
     * actions, as per the desktop file specification.
     * <p>
     * As with g_app_info_launch() there is no way to detect failures that
     * occur while using this function.
     */
    public void launchAction(java.lang.String actionName, AppLaunchContext launchContext) {
        gtk_h.g_desktop_app_info_launch_action(handle(), Interop.allocateNativeString(actionName).handle(), launchContext.handle());
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
     */
    public boolean launchUrisAsManager(org.gtk.glib.List uris, AppLaunchContext launchContext, int spawnFlags, org.gtk.glib.SpawnChildSetupFunc userSetup, DesktopAppLaunchCallback pidCallback) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = gtk_h.g_desktop_app_info_launch_uris_as_manager(handle(), uris.handle(), launchContext.handle(), spawnFlags, 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbSpawnChildSetupFunc",
                            MethodType.methodType(void.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(userSetup.hashCode(), userSetup)), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbDesktopAppLaunchCallback",
                            MethodType.methodType(void.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(userSetup.hashCode(), userSetup)), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return (RESULT != 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Equivalent to g_desktop_app_info_launch_uris_as_manager() but allows
     * you to pass in file descriptors for the stdin, stdout and stderr streams
     * of the launched process.
     * <p>
     * If application launching occurs via some non-spawn mechanism (e.g. D-Bus
     * activation) then {@code stdin_fd}, {@code stdout_fd} and {@code stderr_fd} are ignored.
     */
    public boolean launchUrisAsManagerWithFds(org.gtk.glib.List uris, AppLaunchContext launchContext, int spawnFlags, org.gtk.glib.SpawnChildSetupFunc userSetup, DesktopAppLaunchCallback pidCallback, int stdinFd, int stdoutFd, int stderrFd) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = gtk_h.g_desktop_app_info_launch_uris_as_manager_with_fds(handle(), uris.handle(), launchContext.handle(), spawnFlags, 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbSpawnChildSetupFunc",
                            MethodType.methodType(void.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(userSetup.hashCode(), userSetup)), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbDesktopAppLaunchCallback",
                            MethodType.methodType(void.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(userSetup.hashCode(), userSetup)), stdinFd, stdoutFd, stderrFd, GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return (RESULT != 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Gets all applications that implement {@code interface}.
     * <p>
     * An application implements an interface if that interface is listed in
     * the Implements= line of the desktop file of the application.
     */
    public static org.gtk.glib.List getImplementations(java.lang.String interface_) {
        var RESULT = gtk_h.g_desktop_app_info_get_implementations(Interop.allocateNativeString(interface_).handle());
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
}
