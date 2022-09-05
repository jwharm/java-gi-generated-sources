package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GDesktopAppInfo is an implementation of #GAppInfo based on
 * desktop files.
 * 
 * Note that `<gio/gdesktopappinfo.h>` belongs to the UNIX-specific
 * GIO interfaces, thus you have to use the `gio-unix-2.0.pc` pkg-config
 * file when using it.
 */
public class DesktopAppInfo extends org.gtk.gobject.Object implements AppInfo {

    public DesktopAppInfo(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to DesktopAppInfo */
    public static DesktopAppInfo castFrom(org.gtk.gobject.Object gobject) {
        return new DesktopAppInfo(gobject.getProxy());
    }
    
    /**
     * Creates a new #GDesktopAppInfo based on a desktop file id.
     * 
     * A desktop file id is the basename of the desktop file, including the
     * .desktop extension. GIO is looking for a desktop file with this name
     * in the `applications` subdirectories of the XDG
     * data directories (i.e. the directories specified in the `XDG_DATA_HOME`
     * and `XDG_DATA_DIRS` environment variables). GIO also supports the
     * prefix-to-subdirectory mapping that is described in the
     * [Menu Spec](http://standards.freedesktop.org/menu-spec/latest/)
     * (i.e. a desktop id of kde-foo.desktop will match
     * `/usr/share/applications/kde/foo.desktop`).
     */
    public DesktopAppInfo(java.lang.String desktopId) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_desktop_app_info_new(Interop.getAllocator().allocateUtf8String(desktopId)), true));
    }
    
    /**
     * Creates a new #GDesktopAppInfo.
     */
    public static DesktopAppInfo newFromFilename(java.lang.String filename) {
        return new DesktopAppInfo(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_desktop_app_info_new_from_filename(Interop.getAllocator().allocateUtf8String(filename)), true));
    }
    
    /**
     * Creates a new #GDesktopAppInfo.
     */
    public DesktopAppInfo(org.gtk.glib.KeyFile keyFile) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_desktop_app_info_new_from_keyfile(keyFile.HANDLE()), true));
    }
    
    /**
     * Gets the user-visible display name of the "additional application
     * action" specified by @action_name.
     * 
     * This corresponds to the "Name" key within the keyfile group for the
     * action.
     */
    public java.lang.String getActionName(java.lang.String actionName) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_desktop_app_info_get_action_name(HANDLE(), Interop.getAllocator().allocateUtf8String(actionName));
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Looks up a boolean value in the keyfile backing @info.
     * 
     * The @key is looked up in the "Desktop Entry" group.
     */
    public boolean getBoolean(java.lang.String key) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_desktop_app_info_get_boolean(HANDLE(), Interop.getAllocator().allocateUtf8String(key));
        return (RESULT != 0);
    }
    
    /**
     * Gets the categories from the desktop file.
     */
    public java.lang.String getCategories() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_desktop_app_info_get_categories(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * When @info was created from a known filename, return it.  In some
     * situations such as the #GDesktopAppInfo returned from
     * g_desktop_app_info_new_from_keyfile(), this function will return %NULL.
     */
    public java.lang.String getFilename() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_desktop_app_info_get_filename(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the generic name from the desktop file.
     */
    public java.lang.String getGenericName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_desktop_app_info_get_generic_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * A desktop file is hidden if the Hidden key in it is
     * set to True.
     */
    public boolean getIsHidden() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_desktop_app_info_get_is_hidden(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Looks up a localized string value in the keyfile backing @info
     * translated to the current locale.
     * 
     * The @key is looked up in the "Desktop Entry" group.
     */
    public java.lang.String getLocaleString(java.lang.String key) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_desktop_app_info_get_locale_string(HANDLE(), Interop.getAllocator().allocateUtf8String(key));
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the value of the NoDisplay key, which helps determine if the
     * application info should be shown in menus. See
     * %G_KEY_FILE_DESKTOP_KEY_NO_DISPLAY and g_app_info_should_show().
     */
    public boolean getNodisplay() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_desktop_app_info_get_nodisplay(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Checks if the application info should be shown in menus that list available
     * applications for a specific name of the desktop, based on the
     * `OnlyShowIn` and `NotShowIn` keys.
     * 
     * @desktop_env should typically be given as %NULL, in which case the
     * `XDG_CURRENT_DESKTOP` environment variable is consulted.  If you want
     * to override the default mechanism then you may specify @desktop_env,
     * but this is not recommended.
     * 
     * Note that g_app_info_should_show() for @info will include this check (with
     * %NULL for @desktop_env) as well as additional checks.
     */
    public boolean getShowIn(java.lang.String desktopEnv) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_desktop_app_info_get_show_in(HANDLE(), Interop.getAllocator().allocateUtf8String(desktopEnv));
        return (RESULT != 0);
    }
    
    /**
     * Retrieves the StartupWMClass field from @info. This represents the
     * WM_CLASS property of the main window of the application, if launched
     * through @info.
     */
    public java.lang.String getStartupWmClass() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_desktop_app_info_get_startup_wm_class(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Looks up a string value in the keyfile backing @info.
     * 
     * The @key is looked up in the "Desktop Entry" group.
     */
    public java.lang.String getString(java.lang.String key) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_desktop_app_info_get_string(HANDLE(), Interop.getAllocator().allocateUtf8String(key));
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns whether @key exists in the "Desktop Entry" group
     * of the keyfile backing @info.
     */
    public boolean hasKey(java.lang.String key) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_desktop_app_info_has_key(HANDLE(), Interop.getAllocator().allocateUtf8String(key));
        return (RESULT != 0);
    }
    
    /**
     * Activates the named application action.
     * 
     * You may only call this function on action names that were
     * returned from g_desktop_app_info_list_actions().
     * 
     * Note that if the main entry of the desktop file indicates that the
     * application supports startup notification, and @launch_context is
     * non-%NULL, then startup notification will be used when activating the
     * action (and as such, invocation of the action on the receiving side
     * must signal the end of startup notification when it is completed).
     * This is the expected behaviour of applications declaring additional
     * actions, as per the desktop file specification.
     * 
     * As with g_app_info_launch() there is no way to detect failures that
     * occur while using this function.
     */
    public void launchAction(java.lang.String actionName, AppLaunchContext launchContext) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_desktop_app_info_launch_action(HANDLE(), Interop.getAllocator().allocateUtf8String(actionName), launchContext.HANDLE());
    }
    
}