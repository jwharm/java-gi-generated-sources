package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

public final class Gio {
    
    public static final boolean DBUS_METHOD_INVOCATION_HANDLED = true;

    public static final boolean DBUS_METHOD_INVOCATION_UNHANDLED = false;

    public static final java.lang.String DEBUG_CONTROLLER_EXTENSION_POINT_NAME = "gio-debug-controller";

    public static final java.lang.String DESKTOP_APP_INFO_LOOKUP_EXTENSION_POINT_NAME = "gio-desktop-app-info-lookup";

    public static final java.lang.String DRIVE_IDENTIFIER_KIND_UNIX_DEVICE = "unix-device";

    public static final java.lang.String FILE_ATTRIBUTE_ACCESS_CAN_DELETE = "access::can-delete";

    public static final java.lang.String FILE_ATTRIBUTE_ACCESS_CAN_EXECUTE = "access::can-execute";

    public static final java.lang.String FILE_ATTRIBUTE_ACCESS_CAN_READ = "access::can-read";

    public static final java.lang.String FILE_ATTRIBUTE_ACCESS_CAN_RENAME = "access::can-rename";

    public static final java.lang.String FILE_ATTRIBUTE_ACCESS_CAN_TRASH = "access::can-trash";

    public static final java.lang.String FILE_ATTRIBUTE_ACCESS_CAN_WRITE = "access::can-write";

    public static final java.lang.String FILE_ATTRIBUTE_DOS_IS_ARCHIVE = "dos::is-archive";

    public static final java.lang.String FILE_ATTRIBUTE_DOS_IS_MOUNTPOINT = "dos::is-mountpoint";

    public static final java.lang.String FILE_ATTRIBUTE_DOS_IS_SYSTEM = "dos::is-system";

    public static final java.lang.String FILE_ATTRIBUTE_DOS_REPARSE_POINT_TAG = "dos::reparse-point-tag";

    public static final java.lang.String FILE_ATTRIBUTE_ETAG_VALUE = "etag::value";

    public static final java.lang.String FILE_ATTRIBUTE_FILESYSTEM_FREE = "filesystem::free";

    public static final java.lang.String FILE_ATTRIBUTE_FILESYSTEM_READONLY = "filesystem::readonly";

    public static final java.lang.String FILE_ATTRIBUTE_FILESYSTEM_REMOTE = "filesystem::remote";

    public static final java.lang.String FILE_ATTRIBUTE_FILESYSTEM_SIZE = "filesystem::size";

    public static final java.lang.String FILE_ATTRIBUTE_FILESYSTEM_TYPE = "filesystem::type";

    public static final java.lang.String FILE_ATTRIBUTE_FILESYSTEM_USED = "filesystem::used";

    public static final java.lang.String FILE_ATTRIBUTE_FILESYSTEM_USE_PREVIEW = "filesystem::use-preview";

    public static final java.lang.String FILE_ATTRIBUTE_GVFS_BACKEND = "gvfs::backend";

    public static final java.lang.String FILE_ATTRIBUTE_ID_FILE = "id::file";

    public static final java.lang.String FILE_ATTRIBUTE_ID_FILESYSTEM = "id::filesystem";

    public static final java.lang.String FILE_ATTRIBUTE_MOUNTABLE_CAN_EJECT = "mountable::can-eject";

    public static final java.lang.String FILE_ATTRIBUTE_MOUNTABLE_CAN_MOUNT = "mountable::can-mount";

    public static final java.lang.String FILE_ATTRIBUTE_MOUNTABLE_CAN_POLL = "mountable::can-poll";

    public static final java.lang.String FILE_ATTRIBUTE_MOUNTABLE_CAN_START = "mountable::can-start";

    public static final java.lang.String FILE_ATTRIBUTE_MOUNTABLE_CAN_START_DEGRADED = "mountable::can-start-degraded";

    public static final java.lang.String FILE_ATTRIBUTE_MOUNTABLE_CAN_STOP = "mountable::can-stop";

    public static final java.lang.String FILE_ATTRIBUTE_MOUNTABLE_CAN_UNMOUNT = "mountable::can-unmount";

    public static final java.lang.String FILE_ATTRIBUTE_MOUNTABLE_HAL_UDI = "mountable::hal-udi";

    public static final java.lang.String FILE_ATTRIBUTE_MOUNTABLE_IS_MEDIA_CHECK_AUTOMATIC = "mountable::is-media-check-automatic";

    public static final java.lang.String FILE_ATTRIBUTE_MOUNTABLE_START_STOP_TYPE = "mountable::start-stop-type";

    public static final java.lang.String FILE_ATTRIBUTE_MOUNTABLE_UNIX_DEVICE = "mountable::unix-device";

    public static final java.lang.String FILE_ATTRIBUTE_MOUNTABLE_UNIX_DEVICE_FILE = "mountable::unix-device-file";

    public static final java.lang.String FILE_ATTRIBUTE_OWNER_GROUP = "owner::group";

    public static final java.lang.String FILE_ATTRIBUTE_OWNER_USER = "owner::user";

    public static final java.lang.String FILE_ATTRIBUTE_OWNER_USER_REAL = "owner::user-real";

    public static final java.lang.String FILE_ATTRIBUTE_PREVIEW_ICON = "preview::icon";

    public static final java.lang.String FILE_ATTRIBUTE_RECENT_MODIFIED = "recent::modified";

    public static final java.lang.String FILE_ATTRIBUTE_SELINUX_CONTEXT = "selinux::context";

    public static final java.lang.String FILE_ATTRIBUTE_STANDARD_ALLOCATED_SIZE = "standard::allocated-size";

    public static final java.lang.String FILE_ATTRIBUTE_STANDARD_CONTENT_TYPE = "standard::content-type";

    public static final java.lang.String FILE_ATTRIBUTE_STANDARD_COPY_NAME = "standard::copy-name";

    public static final java.lang.String FILE_ATTRIBUTE_STANDARD_DESCRIPTION = "standard::description";

    public static final java.lang.String FILE_ATTRIBUTE_STANDARD_DISPLAY_NAME = "standard::display-name";

    public static final java.lang.String FILE_ATTRIBUTE_STANDARD_EDIT_NAME = "standard::edit-name";

    public static final java.lang.String FILE_ATTRIBUTE_STANDARD_FAST_CONTENT_TYPE = "standard::fast-content-type";

    public static final java.lang.String FILE_ATTRIBUTE_STANDARD_ICON = "standard::icon";

    public static final java.lang.String FILE_ATTRIBUTE_STANDARD_IS_BACKUP = "standard::is-backup";

    public static final java.lang.String FILE_ATTRIBUTE_STANDARD_IS_HIDDEN = "standard::is-hidden";

    public static final java.lang.String FILE_ATTRIBUTE_STANDARD_IS_SYMLINK = "standard::is-symlink";

    public static final java.lang.String FILE_ATTRIBUTE_STANDARD_IS_VIRTUAL = "standard::is-virtual";

    public static final java.lang.String FILE_ATTRIBUTE_STANDARD_IS_VOLATILE = "standard::is-volatile";

    public static final java.lang.String FILE_ATTRIBUTE_STANDARD_NAME = "standard::name";

    public static final java.lang.String FILE_ATTRIBUTE_STANDARD_SIZE = "standard::size";

    public static final java.lang.String FILE_ATTRIBUTE_STANDARD_SORT_ORDER = "standard::sort-order";

    public static final java.lang.String FILE_ATTRIBUTE_STANDARD_SYMBOLIC_ICON = "standard::symbolic-icon";

    public static final java.lang.String FILE_ATTRIBUTE_STANDARD_SYMLINK_TARGET = "standard::symlink-target";

    public static final java.lang.String FILE_ATTRIBUTE_STANDARD_TARGET_URI = "standard::target-uri";

    public static final java.lang.String FILE_ATTRIBUTE_STANDARD_TYPE = "standard::type";

    public static final java.lang.String FILE_ATTRIBUTE_THUMBNAILING_FAILED = "thumbnail::failed";

    public static final java.lang.String FILE_ATTRIBUTE_THUMBNAIL_IS_VALID = "thumbnail::is-valid";

    public static final java.lang.String FILE_ATTRIBUTE_THUMBNAIL_PATH = "thumbnail::path";

    public static final java.lang.String FILE_ATTRIBUTE_TIME_ACCESS = "time::access";

    public static final java.lang.String FILE_ATTRIBUTE_TIME_ACCESS_USEC = "time::access-usec";

    public static final java.lang.String FILE_ATTRIBUTE_TIME_CHANGED = "time::changed";

    public static final java.lang.String FILE_ATTRIBUTE_TIME_CHANGED_USEC = "time::changed-usec";

    public static final java.lang.String FILE_ATTRIBUTE_TIME_CREATED = "time::created";

    public static final java.lang.String FILE_ATTRIBUTE_TIME_CREATED_USEC = "time::created-usec";

    public static final java.lang.String FILE_ATTRIBUTE_TIME_MODIFIED = "time::modified";

    public static final java.lang.String FILE_ATTRIBUTE_TIME_MODIFIED_USEC = "time::modified-usec";

    public static final java.lang.String FILE_ATTRIBUTE_TRASH_DELETION_DATE = "trash::deletion-date";

    public static final java.lang.String FILE_ATTRIBUTE_TRASH_ITEM_COUNT = "trash::item-count";

    public static final java.lang.String FILE_ATTRIBUTE_TRASH_ORIG_PATH = "trash::orig-path";

    public static final java.lang.String FILE_ATTRIBUTE_UNIX_BLOCKS = "unix::blocks";

    public static final java.lang.String FILE_ATTRIBUTE_UNIX_BLOCK_SIZE = "unix::block-size";

    public static final java.lang.String FILE_ATTRIBUTE_UNIX_DEVICE = "unix::device";

    public static final java.lang.String FILE_ATTRIBUTE_UNIX_GID = "unix::gid";

    public static final java.lang.String FILE_ATTRIBUTE_UNIX_INODE = "unix::inode";

    public static final java.lang.String FILE_ATTRIBUTE_UNIX_IS_MOUNTPOINT = "unix::is-mountpoint";

    public static final java.lang.String FILE_ATTRIBUTE_UNIX_MODE = "unix::mode";

    public static final java.lang.String FILE_ATTRIBUTE_UNIX_NLINK = "unix::nlink";

    public static final java.lang.String FILE_ATTRIBUTE_UNIX_RDEV = "unix::rdev";

    public static final java.lang.String FILE_ATTRIBUTE_UNIX_UID = "unix::uid";

    public static final java.lang.String MEMORY_MONITOR_EXTENSION_POINT_NAME = "gio-memory-monitor";

    public static final java.lang.String MENU_ATTRIBUTE_ACTION = "action";

    public static final java.lang.String MENU_ATTRIBUTE_ACTION_NAMESPACE = "action-namespace";

    public static final java.lang.String MENU_ATTRIBUTE_ICON = "icon";

    public static final java.lang.String MENU_ATTRIBUTE_LABEL = "label";

    public static final java.lang.String MENU_ATTRIBUTE_TARGET = "target";

    public static final java.lang.String MENU_LINK_SECTION = "section";

    public static final java.lang.String MENU_LINK_SUBMENU = "submenu";

    public static final java.lang.String NATIVE_VOLUME_MONITOR_EXTENSION_POINT_NAME = "gio-native-volume-monitor";

    public static final java.lang.String NETWORK_MONITOR_EXTENSION_POINT_NAME = "gio-network-monitor";

    public static final java.lang.String POWER_PROFILE_MONITOR_EXTENSION_POINT_NAME = "gio-power-profile-monitor";

    public static final java.lang.String PROXY_EXTENSION_POINT_NAME = "gio-proxy";

    public static final java.lang.String PROXY_RESOLVER_EXTENSION_POINT_NAME = "gio-proxy-resolver";

    public static final java.lang.String SETTINGS_BACKEND_EXTENSION_POINT_NAME = "gsettings-backend";

    public static final java.lang.String TLS_BACKEND_EXTENSION_POINT_NAME = "gio-tls-backend";

    public static final java.lang.String TLS_DATABASE_PURPOSE_AUTHENTICATE_CLIENT = "1.3.6.1.5.5.7.3.2";

    public static final java.lang.String TLS_DATABASE_PURPOSE_AUTHENTICATE_SERVER = "1.3.6.1.5.5.7.3.1";

    public static final java.lang.String VFS_EXTENSION_POINT_NAME = "gio-vfs";

    public static final java.lang.String VOLUME_IDENTIFIER_KIND_CLASS = "class";

    public static final java.lang.String VOLUME_IDENTIFIER_KIND_HAL_UDI = "hal-udi";

    public static final java.lang.String VOLUME_IDENTIFIER_KIND_LABEL = "label";

    public static final java.lang.String VOLUME_IDENTIFIER_KIND_NFS_MOUNT = "nfs-mount";

    public static final java.lang.String VOLUME_IDENTIFIER_KIND_UNIX_DEVICE = "unix-device";

    public static final java.lang.String VOLUME_IDENTIFIER_KIND_UUID = "uuid";

    public static final java.lang.String VOLUME_MONITOR_EXTENSION_POINT_NAME = "gio-volume-monitor";

    /**
     * Checks if @action_name is valid.
     * 
     * @action_name is valid if it consists only of alphanumeric characters,
     * plus &<code>#39</code> -&<code>#39</code>  and &<code>#39</code> .&<code>#39</code> .  The empty string is not a valid action name.
     * 
     * It is an error to call this function with a non-utf8 @action_name.
     * @action_name must not be <code>null</code>
     */
    public static boolean actionNameIsValid(java.lang.String actionName) {
        var RESULT = gtk_h.g_action_name_is_valid(Interop.allocateNativeString(actionName).handle());
        return (RESULT != 0);
    }
    
    /**
     * Parses a detailed action name into its separate name and target
     * components.
     * 
     * Detailed action names can have three formats.
     * 
     * The first format is used to represent an action name with no target
     * value and consists of just an action name containing no whitespace
     * nor the characters &<code>#39</code> :&<code>#39</code> , &<code>#39</code> (&<code>#39</code>  or &<code>#39</code> )&<code>#39</code> .  For example: &<code>#34</code> app.action&<code>#34</code> .
     * 
     * The second format is used to represent an action with a target value
     * that is a non-empty string consisting only of alphanumerics, plus &<code>#39</code> -&<code>#39</code> 
     * and &<code>#39</code> .&<code>#39</code> .  In that case, the action name and target value are
     * separated by a double colon (&<code>#34</code> ::&<code>#34</code> ).  For example:
     * &<code>#34</code> app.action::target&<code>#34</code> .
     * 
     * The third format is used to represent an action with any type of
     * target value, including strings.  The target value follows the action
     * name, surrounded in parens.  For example: &<code>#34</code> app.action(42)&<code>#34</code> .  The
     * target value is parsed using g_variant_parse().  If a tuple-typed
     * value is desired, it must be specified in the same way, resulting in
     * two sets of parens, for example: &<code>#34</code> app.action((1,2,3))&<code>#34</code> .  A string
     * target can be specified this way as well: &<code>#34</code> app.action(&<code>#39</code> target&<code>#39</code> )&<code>#34</code> .
     * For strings, this third format must be used if * target value is
     * empty or contains characters other than alphanumerics, &<code>#39</code> -&<code>#39</code>  and &<code>#39</code> .&<code>#39</code> .
     */
    public static boolean actionParseDetailedName(java.lang.String detailedName, java.lang.String[] actionName, org.gtk.glib.Variant[] targetValue) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_action_parse_detailed_name(Interop.allocateNativeString(detailedName).handle(), Interop.allocateNativeArray(actionName).handle(), Interop.allocateNativeArray(targetValue).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Formats a detailed action name from @action_name and @target_value.
     * 
     * It is an error to call this function with an invalid action name.
     * 
     * This function is the opposite of g_action_parse_detailed_name().
     * It will produce a string that can be parsed back to the @action_name
     * and @target_value by that function.
     * 
     * See that function for the types of strings that will be printed by
     * this function.
     */
    public static java.lang.String actionPrintDetailedName(java.lang.String actionName, org.gtk.glib.Variant targetValue) {
        var RESULT = gtk_h.g_action_print_detailed_name(Interop.allocateNativeString(actionName).handle(), targetValue.handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Creates a new {@link org.gtk.gio.AppInfo} from the given information.
     * 
     * Note that for @commandline, the quoting rules of the Exec key of the
     * {@link [freedesktop.org Desktop Entry Specification]}(http://freedesktop.org/Standards/desktop-entry-spec)
     * are applied. For example, if the @commandline contains
     * percent-encoded URIs, the percent-character must be doubled in order to prevent it from
     * being swallowed by Exec key unquoting. See the specification for exact quoting rules.
     */
    public static AppInfo appInfoCreateFromCommandline(java.lang.String commandline, java.lang.String applicationName, int flags) throws io.github.jwharm.javagi.GErrorException {
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
     * <p>
     * For desktop files, this includes applications that have<code>NoDisplay=true</code> set or are excluded from display by means
     * of <code>OnlyShowIn</code> or <code>NotShowIn</code>. See g_app_info_should_show().
     * The returned list does not include applications which have
     * the <code>Hidden</code> key set.
     */
    public static org.gtk.glib.List appInfoGetAll() {
        var RESULT = gtk_h.g_app_info_get_all();
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Gets a list of all <code>#GAppInfos</code> for a given content type,
     * including the recommended and fallback <code>#GAppInfos</code>  See
     * g_app_info_get_recommended_for_type() and
     * g_app_info_get_fallback_for_type().
     */
    public static org.gtk.glib.List appInfoGetAllForType(java.lang.String contentType) {
        var RESULT = gtk_h.g_app_info_get_all_for_type(Interop.allocateNativeString(contentType).handle());
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Gets the default {@link org.gtk.gio.AppInfo} for a given content type.
     */
    public static AppInfo appInfoGetDefaultForType(java.lang.String contentType, boolean mustSupportUris) {
        var RESULT = gtk_h.g_app_info_get_default_for_type(Interop.allocateNativeString(contentType).handle(), mustSupportUris ? 1 : 0);
        return new AppInfo.AppInfoImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets the default application for handling URIs with
     * the given URI scheme. A URI scheme is the initial part
     * of the URI, up to but not including the &<code>#39</code> :&<code>#39</code> , e.g. &<code>#34</code> http&<code>#34</code> ,
     * &<code>#34</code> ftp&<code>#34</code>  or &<code>#34</code> sip&<code>#34</code> .
     */
    public static AppInfo appInfoGetDefaultForUriScheme(java.lang.String uriScheme) {
        var RESULT = gtk_h.g_app_info_get_default_for_uri_scheme(Interop.allocateNativeString(uriScheme).handle());
        return new AppInfo.AppInfoImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets a list of fallback <code>#GAppInfos</code> for a given content type, i.e.
     * those applications which claim to support the given content type
     * by MIME type subclassing and not directly.
     */
    public static org.gtk.glib.List appInfoGetFallbackForType(java.lang.String contentType) {
        var RESULT = gtk_h.g_app_info_get_fallback_for_type(Interop.allocateNativeString(contentType).handle());
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Gets a list of recommended <code>#GAppInfos</code> for a given content type, i.e.
     * those applications which claim to support the given content type exactly,
     * and not by MIME type subclassing.
     * Note that the first application of the list is the last used one, i.e.
     * the last one for which g_app_info_set_as_last_used_for_type() has been
     * called.
     */
    public static org.gtk.glib.List appInfoGetRecommendedForType(java.lang.String contentType) {
        var RESULT = gtk_h.g_app_info_get_recommended_for_type(Interop.allocateNativeString(contentType).handle());
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Utility function that launches the default application
     * registered to handle the specified uri. Synchronous I/O
     * is done on the uri to detect the type of the file if
     * required.
     * 
     * The D-Bus&<code>#8211</code> activated applications don&<code>#39</code> t have to be started if your application
     * terminates too soon after this function. To prevent this, use
     * g_app_info_launch_default_for_uri_async() instead.
     */
    public static boolean appInfoLaunchDefaultForUri(java.lang.String uri, AppLaunchContext context) throws io.github.jwharm.javagi.GErrorException {
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
     * This is also useful if you want to be sure that the D-Bus&<code>#8211</code> activated
     * applications are really started before termination and if you are interested
     * in receiving error information from their activation.
     */
    public static void appInfoLaunchDefaultForUriAsync(java.lang.String uri, AppLaunchContext context, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_app_info_launch_default_for_uri_async(Interop.allocateNativeString(uri).handle(), context.handle(), cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an asynchronous launch-default-for-uri operation.
     */
    public static boolean appInfoLaunchDefaultForUriFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
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
    public static void appInfoResetTypeAssociations(java.lang.String contentType) {
        gtk_h.g_app_info_reset_type_associations(Interop.allocateNativeString(contentType).handle());
    }
    
    /**
     * Asynchronously connects to the message bus specified by @bus_type.
     * 
     * When the operation is finished, @callback will be invoked. You can
     * then call g_bus_get_finish() to get the result of the operation.
     * 
     * This is an asynchronous failable function. See g_bus_get_sync() for
     * the synchronous version.
     */
    public static void busGet(BusType busType, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_bus_get(busType.getValue(), cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an operation started with g_bus_get().
     * 
     * The returned object is a singleton, that is, shared with other
     * callers of g_bus_get() and g_bus_get_sync() for @bus_type. In the
     * event that you need a private message bus connection, use
     * g_dbus_address_get_for_bus_sync() and
     * g_dbus_connection_new_for_address() with
     * G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_CLIENT and
     * G_DBUS_CONNECTION_FLAGS_MESSAGE_BUS_CONNECTION flags.
     * 
     * Note that the returned {@link org.gtk.gio.DBusConnection} object will (usually) have
     * the {@link org.gtk.gio.DBusConnection} exit-on-close property set to <code>true</code>
     */
    public static DBusConnection busGetFinish(AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_bus_get_finish(res.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new DBusConnection(References.get(RESULT, true));
    }
    
    /**
     * Synchronously connects to the message bus specified by @bus_type.
     * Note that the returned object may shared with other callers,
     * e.g. if two separate parts of a process calls this function with
     * the same @bus_type, they will share the same object.
     * 
     * This is a synchronous failable function. See g_bus_get() and
     * g_bus_get_finish() for the asynchronous version.
     * 
     * The returned object is a singleton, that is, shared with other
     * callers of g_bus_get() and g_bus_get_sync() for @bus_type. In the
     * event that you need a private message bus connection, use
     * g_dbus_address_get_for_bus_sync() and
     * g_dbus_connection_new_for_address() with
     * G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_CLIENT and
     * G_DBUS_CONNECTION_FLAGS_MESSAGE_BUS_CONNECTION flags.
     * 
     * Note that the returned {@link org.gtk.gio.DBusConnection} object will (usually) have
     * the {@link org.gtk.gio.DBusConnection} exit-on-close property set to <code>true</code>
     */
    public static DBusConnection busGetSync(BusType busType, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_bus_get_sync(busType.getValue(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new DBusConnection(References.get(RESULT, true));
    }
    
    /**
     * Starts acquiring @name on the bus specified by @bus_type and calls
     * @name_acquired_handler and @name_lost_handler when the name is
     * acquired respectively lost. Callbacks will be invoked in the
     * {@link [thread-default main context]}{@link [g-main-context-push-thread-default]}
     * of the thread you are calling this function from.
     * 
     * You are guaranteed that one of the @name_acquired_handler and @name_lost_handler
     * callbacks will be invoked after calling this function - there are three
     * possible cases:
     * 
     * - @name_lost_handler with a <code>null</code> connection (if a connection to the bus
     *   can&<code>#39</code> t be made).
     * 
     * - @bus_acquired_handler then @name_lost_handler (if the name can&<code>#39</code> t be
     *   obtained)
     * 
     * - @bus_acquired_handler then @name_acquired_handler (if the name was
     *   obtained).
     * 
     * When you are done owning the name, just call g_bus_unown_name()
     * with the owner id this function returns.
     * 
     * If the name is acquired or lost (for example another application
     * could acquire the name if you allow replacement or the application
     * currently owning the name exits), the handlers are also invoked.
     * If the {@link org.gtk.gio.DBusConnection} that is used for attempting to own the name
     * closes, then @name_lost_handler is invoked since it is no longer
     * possible for other processes to access the process.
     * 
     * You cannot use g_bus_own_name() several times for the same name (unless
     * interleaved with calls to g_bus_unown_name()) - only the first call
     * will work.
     * 
     * Another guarantee is that invocations of @name_acquired_handler
     * and @name_lost_handler are guaranteed to alternate; that
     * is, if @name_acquired_handler is invoked then you are
     * guaranteed that the next time one of the handlers is invoked, it
     * will be @name_lost_handler. The reverse is also true.
     * 
     * If you plan on exporting objects (using e.g.
     * g_dbus_connection_register_object()), note that it is generally too late
     * to export the objects in @name_acquired_handler. Instead, you can do this
     * in @bus_acquired_handler since you are guaranteed that this will run
     * before @name is requested from the bus.
     * 
     * This behavior makes it very simple to write applications that wants
     * to {@link [own names]}{@link [gdbus-owning-names]} and export objects.
     * Simply register objects to be exported in @bus_acquired_handler and
     * unregister the objects (if any) in @name_lost_handler.
     */
    public static int busOwnName(BusType busType, java.lang.String name, int flags, BusAcquiredCallback busAcquiredHandler, BusNameAcquiredCallback nameAcquiredHandler, BusNameLostCallback nameLostHandler) {
        try {
            var RESULT = gtk_h.g_bus_own_name(busType.getValue(), Interop.allocateNativeString(name).handle(), flags, 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbBusAcquiredCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbBusNameAcquiredCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbBusNameLostCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(busAcquiredHandler.hashCode(), busAcquiredHandler)), 
                    Interop.cbDestroyNotifySymbol());
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Like g_bus_own_name() but takes a {@link org.gtk.gio.DBusConnection} instead of a
     * {@link org.gtk.gio.BusType}
     */
    public static int busOwnNameOnConnection(DBusConnection connection, java.lang.String name, int flags, BusNameAcquiredCallback nameAcquiredHandler, BusNameLostCallback nameLostHandler) {
        try {
            var RESULT = gtk_h.g_bus_own_name_on_connection(connection.handle(), Interop.allocateNativeString(name).handle(), flags, 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbBusNameAcquiredCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbBusNameLostCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(nameAcquiredHandler.hashCode(), nameAcquiredHandler)), 
                    Interop.cbDestroyNotifySymbol());
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Version of g_bus_own_name_on_connection() using closures instead of
     * callbacks for easier binding in other languages.
     */
    public static int busOwnNameOnConnectionWithClosures(DBusConnection connection, java.lang.String name, int flags, org.gtk.gobject.Closure nameAcquiredClosure, org.gtk.gobject.Closure nameLostClosure) {
        var RESULT = gtk_h.g_bus_own_name_on_connection_with_closures(connection.handle(), Interop.allocateNativeString(name).handle(), flags, nameAcquiredClosure.handle(), nameLostClosure.handle());
        return RESULT;
    }
    
    /**
     * Version of g_bus_own_name() using closures instead of callbacks for
     * easier binding in other languages.
     */
    public static int busOwnNameWithClosures(BusType busType, java.lang.String name, int flags, org.gtk.gobject.Closure busAcquiredClosure, org.gtk.gobject.Closure nameAcquiredClosure, org.gtk.gobject.Closure nameLostClosure) {
        var RESULT = gtk_h.g_bus_own_name_with_closures(busType.getValue(), Interop.allocateNativeString(name).handle(), flags, busAcquiredClosure.handle(), nameAcquiredClosure.handle(), nameLostClosure.handle());
        return RESULT;
    }
    
    /**
     * Stops owning a name.
     * 
     * Note that there may still be D-Bus traffic to process (relating to owning
     * and unowning the name) in the current thread-default {@link org.gtk.glib.MainContext} after
     * this function has returned. You should continue to iterate the {@link org.gtk.glib.MainContext} until the {@link org.gtk.glib.DestroyNotify} function passed to g_bus_own_name() is called, in
     * order to avoid memory leaks through callbacks queued on the {@link org.gtk.glib.MainContext} after it&<code>#8217</code> s stopped being iterated.
     */
    public static void busUnownName(int ownerId) {
        gtk_h.g_bus_unown_name(ownerId);
    }
    
    /**
     * Stops watching a name.
     * 
     * Note that there may still be D-Bus traffic to process (relating to watching
     * and unwatching the name) in the current thread-default {@link org.gtk.glib.MainContext} after
     * this function has returned. You should continue to iterate the {@link org.gtk.glib.MainContext} until the {@link org.gtk.glib.DestroyNotify} function passed to g_bus_watch_name() is called, in
     * order to avoid memory leaks through callbacks queued on the {@link org.gtk.glib.MainContext} after it&<code>#8217</code> s stopped being iterated.
     */
    public static void busUnwatchName(int watcherId) {
        gtk_h.g_bus_unwatch_name(watcherId);
    }
    
    /**
     * Starts watching @name on the bus specified by @bus_type and calls
     * @name_appeared_handler and @name_vanished_handler when the name is
     * known to have an owner respectively known to lose its
     * owner. Callbacks will be invoked in the
     * {@link [thread-default main context]}{@link [g-main-context-push-thread-default]}
     * of the thread you are calling this function from.
     * 
     * You are guaranteed that one of the handlers will be invoked after
     * calling this function. When you are done watching the name, just
     * call g_bus_unwatch_name() with the watcher id this function
     * returns.
     * 
     * If the name vanishes or appears (for example the application owning
     * the name could restart), the handlers are also invoked. If the
     * {@link org.gtk.gio.DBusConnection} that is used for watching the name disconnects, then
     * @name_vanished_handler is invoked since it is no longer
     * possible to access the name.
     * 
     * Another guarantee is that invocations of @name_appeared_handler
     * and @name_vanished_handler are guaranteed to alternate; that
     * is, if @name_appeared_handler is invoked then you are
     * guaranteed that the next time one of the handlers is invoked, it
     * will be @name_vanished_handler. The reverse is also true.
     * 
     * This behavior makes it very simple to write applications that want
     * to take action when a certain {@link [name exists]}{@link [gdbus-watching-names]}.
     * Basically, the application should create object proxies in
     * @name_appeared_handler and destroy them again (if any) in
     * @name_vanished_handler.
     */
    public static int busWatchName(BusType busType, java.lang.String name, int flags, BusNameAppearedCallback nameAppearedHandler, BusNameVanishedCallback nameVanishedHandler) {
        try {
            var RESULT = gtk_h.g_bus_watch_name(busType.getValue(), Interop.allocateNativeString(name).handle(), flags, 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbBusNameAppearedCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbBusNameVanishedCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(nameAppearedHandler.hashCode(), nameAppearedHandler)), 
                    Interop.cbDestroyNotifySymbol());
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Like g_bus_watch_name() but takes a {@link org.gtk.gio.DBusConnection} instead of a
     * {@link org.gtk.gio.BusType}
     */
    public static int busWatchNameOnConnection(DBusConnection connection, java.lang.String name, int flags, BusNameAppearedCallback nameAppearedHandler, BusNameVanishedCallback nameVanishedHandler) {
        try {
            var RESULT = gtk_h.g_bus_watch_name_on_connection(connection.handle(), Interop.allocateNativeString(name).handle(), flags, 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbBusNameAppearedCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbBusNameVanishedCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(nameAppearedHandler.hashCode(), nameAppearedHandler)), 
                    Interop.cbDestroyNotifySymbol());
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Version of g_bus_watch_name_on_connection() using closures instead of callbacks for
     * easier binding in other languages.
     */
    public static int busWatchNameOnConnectionWithClosures(DBusConnection connection, java.lang.String name, int flags, org.gtk.gobject.Closure nameAppearedClosure, org.gtk.gobject.Closure nameVanishedClosure) {
        var RESULT = gtk_h.g_bus_watch_name_on_connection_with_closures(connection.handle(), Interop.allocateNativeString(name).handle(), flags, nameAppearedClosure.handle(), nameVanishedClosure.handle());
        return RESULT;
    }
    
    /**
     * Version of g_bus_watch_name() using closures instead of callbacks for
     * easier binding in other languages.
     */
    public static int busWatchNameWithClosures(BusType busType, java.lang.String name, int flags, org.gtk.gobject.Closure nameAppearedClosure, org.gtk.gobject.Closure nameVanishedClosure) {
        var RESULT = gtk_h.g_bus_watch_name_with_closures(busType.getValue(), Interop.allocateNativeString(name).handle(), flags, nameAppearedClosure.handle(), nameVanishedClosure.handle());
        return RESULT;
    }
    
    /**
     * Checks if a content type can be executable. Note that for instance
     * things like text files can be executables (i.e. scripts and batch files).
     */
    public static boolean contentTypeCanBeExecutable(java.lang.String type) {
        var RESULT = gtk_h.g_content_type_can_be_executable(Interop.allocateNativeString(type).handle());
        return (RESULT != 0);
    }
    
    /**
     * Compares two content types for equality.
     */
    public static boolean contentTypeEquals(java.lang.String type1, java.lang.String type2) {
        var RESULT = gtk_h.g_content_type_equals(Interop.allocateNativeString(type1).handle(), Interop.allocateNativeString(type2).handle());
        return (RESULT != 0);
    }
    
    /**
     * Tries to find a content type based on the mime type name.
     */
    public static java.lang.String contentTypeFromMimeType(java.lang.String mimeType) {
        var RESULT = gtk_h.g_content_type_from_mime_type(Interop.allocateNativeString(mimeType).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the human readable description of the content type.
     */
    public static java.lang.String contentTypeGetDescription(java.lang.String type) {
        var RESULT = gtk_h.g_content_type_get_description(Interop.allocateNativeString(type).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the generic icon name for a content type.
     * 
     * See the
     * {@link [shared-mime-info]}(http://www.freedesktop.org/wiki/Specifications/shared-mime-info-spec)
     * specification for more on the generic icon name.
     */
    public static java.lang.String contentTypeGetGenericIconName(java.lang.String type) {
        var RESULT = gtk_h.g_content_type_get_generic_icon_name(Interop.allocateNativeString(type).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the icon for a content type.
     */
    public static Icon contentTypeGetIcon(java.lang.String type) {
        var RESULT = gtk_h.g_content_type_get_icon(Interop.allocateNativeString(type).handle());
        return new Icon.IconImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets the mime type for the content type, if one is registered.
     */
    public static java.lang.String contentTypeGetMimeType(java.lang.String type) {
        var RESULT = gtk_h.g_content_type_get_mime_type(Interop.allocateNativeString(type).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the symbolic icon for a content type.
     */
    public static Icon contentTypeGetSymbolicIcon(java.lang.String type) {
        var RESULT = gtk_h.g_content_type_get_symbolic_icon(Interop.allocateNativeString(type).handle());
        return new Icon.IconImpl(References.get(RESULT, true));
    }
    
    /**
     * Determines if @type is a subset of @supertype.
     */
    public static boolean contentTypeIsA(java.lang.String type, java.lang.String supertype) {
        var RESULT = gtk_h.g_content_type_is_a(Interop.allocateNativeString(type).handle(), Interop.allocateNativeString(supertype).handle());
        return (RESULT != 0);
    }
    
    /**
     * Determines if @type is a subset of @mime_type.
     * Convenience wrapper around g_content_type_is_a().
     */
    public static boolean contentTypeIsMimeType(java.lang.String type, java.lang.String mimeType) {
        var RESULT = gtk_h.g_content_type_is_mime_type(Interop.allocateNativeString(type).handle(), Interop.allocateNativeString(mimeType).handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if the content type is the generic &<code>#34</code> unknown&<code>#34</code>  type.
     * On UNIX this is the &<code>#34</code> application/octet-stream&<code>#34</code>  mimetype,
     * while on win32 it is &<code>#34</code> *&<code>#34</code>  and on OSX it is a dynamic type
     * or octet-stream.
     */
    public static boolean contentTypeIsUnknown(java.lang.String type) {
        var RESULT = gtk_h.g_content_type_is_unknown(Interop.allocateNativeString(type).handle());
        return (RESULT != 0);
    }
    
    /**
     * Set the list of directories used by GIO to load the MIME database.
     * If @dirs is <code>null</code>  the directories used are the default:
     * <p>
     *  - the <code>mime</code> subdirectory of the directory in <code>$XDG_DATA_HOME</code>
     *  - the <code>mime</code> subdirectory of every directory in <code>$XDG_DATA_DIRS</code>
     * 
     * This function is intended to be used when writing tests that depend on
     * information stored in the MIME database, in order to control the data.
     * 
     * Typically, in case your tests use <code>G_TEST_OPTION_ISOLATE_DIRS</code>  but they
     * depend on the system&<code>#8217</code> s MIME database, you should call this function
     * with @dirs set to <code>null</code> before calling g_test_init(), for instance:
     * 
     * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
     *   // Load MIME data from the system
     *   g_content_type_set_mime_dirs (NULL);
     *   // Isolate the environment
     *   g_test_init (&<code>#38</code> argc, &<code>#38</code> argv, G_TEST_OPTION_ISOLATE_DIRS, NULL);
     * 
     *   &<code>#8230</code> 
     * 
     *   return g_test_run ();
     * ]}|
     */
    public static void contentTypeSetMimeDirs(java.lang.String[] dirs) {
        gtk_h.g_content_type_set_mime_dirs(Interop.allocateNativeArray(dirs).handle());
    }
    
    /**
     * Gets a list of strings containing all the registered content types
     * known to the system. The list and its data should be freed using<code>g_list_free_full (list, g_free)</code>.
     */
    public static org.gtk.glib.List contentTypesGetRegistered() {
        var RESULT = gtk_h.g_content_types_get_registered();
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Escape @string so it can appear in a D-Bus address as the value
     * part of a key-value pair.
     * <p>
     * For instance, if @string is <code>/run/bus-for-:0</code>,
     * this function would return <code>/run/bus-for-<code>3A0</code> /code>,
     * which could be used in a D-Bus address like<code>unix:nonce-tcp:host=127.0.0.1,port=42,noncefile=/run/bus-for-<code>3A0</code> /code>.
     */
    public static java.lang.String dbusAddressEscapeValue(java.lang.String string) {
        var RESULT = gtk_h.g_dbus_address_escape_value(Interop.allocateNativeString(string).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Synchronously looks up the D-Bus address for the well-known message
     * bus instance specified by @bus_type. This may involve using various
     * platform specific mechanisms.
     * 
     * The returned address will be in the
     * {@link [D-Bus address format]}(https://dbus.freedesktop.org/doc/dbus-specification.html<code>#addresses</code> .
     */
    public static java.lang.String dbusAddressGetForBusSync(BusType busType, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dbus_address_get_for_bus_sync(busType.getValue(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Asynchronously connects to an endpoint specified by @address and
     * sets up the connection so it is in a state to run the client-side
     * of the D-Bus authentication conversation. @address must be in the
     * {@link [D-Bus address format]}(https://dbus.freedesktop.org/doc/dbus-specification.html<code>#addresses</code> .
     * 
     * When the operation is finished, @callback will be invoked. You can
     * then call g_dbus_address_get_stream_finish() to get the result of
     * the operation.
     * 
     * This is an asynchronous failable function. See
     * g_dbus_address_get_stream_sync() for the synchronous version.
     */
    public static void dbusAddressGetStream(java.lang.String address, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_dbus_address_get_stream(Interop.allocateNativeString(address).handle(), cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an operation started with g_dbus_address_get_stream().
     * 
     * A server is not required to set a GUID, so @out_guid may be set to <code>null</code> even on success.
     */
    public static IOStream dbusAddressGetStreamFinish(AsyncResult res, java.lang.String[] outGuid) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dbus_address_get_stream_finish(res.handle(), Interop.allocateNativeArray(outGuid).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new IOStream(References.get(RESULT, true));
    }
    
    /**
     * Synchronously connects to an endpoint specified by @address and
     * sets up the connection so it is in a state to run the client-side
     * of the D-Bus authentication conversation. @address must be in the
     * {@link [D-Bus address format]}(https://dbus.freedesktop.org/doc/dbus-specification.html<code>#addresses</code> .
     * 
     * A server is not required to set a GUID, so @out_guid may be set to <code>null</code> even on success.
     * 
     * This is a synchronous failable function. See
     * g_dbus_address_get_stream() for the asynchronous version.
     */
    public static IOStream dbusAddressGetStreamSync(java.lang.String address, java.lang.String[] outGuid, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dbus_address_get_stream_sync(Interop.allocateNativeString(address).handle(), Interop.allocateNativeArray(outGuid).handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new IOStream(References.get(RESULT, true));
    }
    
    /**
     * Looks up the value of an annotation.
     * 
     * The cost of this function is O(n) in number of annotations.
     */
    public static java.lang.String dbusAnnotationInfoLookup(DBusAnnotationInfo[] annotations, java.lang.String name) {
        var RESULT = gtk_h.g_dbus_annotation_info_lookup(Interop.allocateNativeArray(annotations).handle(), Interop.allocateNativeString(name).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Creates a D-Bus error name to use for @error. If @error matches
     * a registered error (cf. g_dbus_error_register_error()), the corresponding
     * D-Bus error name will be returned.
     * <p>
     * Otherwise the a name of the form<code>org.gtk.GDBus.UnmappedGError.Quark._ESCAPED_QUARK_NAME.Code_ERROR_CODE</code>
     * will be used. This allows other GDBus applications to map the error
     * on the wire back to a {@link org.gtk.glib.Error} using g_dbus_error_new_for_dbus_error().
     * 
     * This function is typically only used in object mappings to put a
     * {@link org.gtk.glib.Error} on the wire. Regular applications should not use it.
     */
    public static java.lang.String dbusErrorEncodeGerror(org.gtk.glib.Error error) {
        var RESULT = gtk_h.g_dbus_error_encode_gerror(error.handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the D-Bus error name used for @error, if any.
     * 
     * This function is guaranteed to return a D-Bus error name for all
     * <code>#GErrors</code> returned from functions handling remote method calls
     * (e.g. g_dbus_connection_call_finish()) unless
     * g_dbus_error_strip_remote_error() has been used on @error.
     */
    public static java.lang.String dbusErrorGetRemoteError(org.gtk.glib.Error error) {
        var RESULT = gtk_h.g_dbus_error_get_remote_error(error.handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Checks if @error represents an error received via D-Bus from a remote peer. If so,
     * use g_dbus_error_get_remote_error() to get the name of the error.
     */
    public static boolean dbusErrorIsRemoteError(org.gtk.glib.Error error) {
        var RESULT = gtk_h.g_dbus_error_is_remote_error(error.handle());
        return (RESULT != 0);
    }
    
    /**
     * Creates a {@link org.gtk.glib.Error} based on the contents of @dbus_error_name and
     * @dbus_error_message.
     * 
     * Errors registered with g_dbus_error_register_error() will be looked
     * up using @dbus_error_name and if a match is found, the error domain
     * and code is used. Applications can use g_dbus_error_get_remote_error()
     * to recover @dbus_error_name.
     * 
     * If a match against a registered error is not found and the D-Bus
     * error name is in a form as returned by g_dbus_error_encode_gerror()
     * the error domain and code encoded in the name is used to
     * create the {@link org.gtk.glib.Error}  Also, @dbus_error_name is added to the error message
     * such that it can be recovered with g_dbus_error_get_remote_error().
     * 
     * Otherwise, a {@link org.gtk.glib.Error} with the error code {@link org.gtk.gio.IOErrorEnum<code>#DBUS_ERROR</code>  in the <code>G_IO_ERROR</code> error domain is returned. Also, @dbus_error_name is
     * added to the error message such that it can be recovered with
     * g_dbus_error_get_remote_error().
     * 
     * In all three cases, @dbus_error_name can always be recovered from the
     * returned {@link org.gtk.glib.Error} using the g_dbus_error_get_remote_error() function
     * (unless g_dbus_error_strip_remote_error() hasn&<code>#39</code> t been used on the returned error).
     * 
     * This function is typically only used in object mappings to prepare
     * {@link org.gtk.glib.Error} instances for applications. Regular applications should not use
     * it.
     */
    public static org.gtk.glib.Error dbusErrorNewForDbusError(java.lang.String dbusErrorName, java.lang.String dbusErrorMessage) {
        var RESULT = gtk_h.g_dbus_error_new_for_dbus_error(Interop.allocateNativeString(dbusErrorName).handle(), Interop.allocateNativeString(dbusErrorMessage).handle());
        return new org.gtk.glib.Error(References.get(RESULT, true));
    }
    
    public static org.gtk.glib.Quark dbusErrorQuark() {
        var RESULT = gtk_h.g_dbus_error_quark();
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Creates an association to map between @dbus_error_name and
     * <code>#GErrors</code> specified by @error_domain and @error_code.
     * 
     * This is typically done in the routine that returns the {@link org.gtk.glib.Quark} for
     * an error domain.
     */
    public static boolean dbusErrorRegisterError(org.gtk.glib.Quark errorDomain, int errorCode, java.lang.String dbusErrorName) {
        var RESULT = gtk_h.g_dbus_error_register_error(errorDomain.getValue(), errorCode, Interop.allocateNativeString(dbusErrorName).handle());
        return (RESULT != 0);
    }
    
    /**
     * Looks for extra information in the error message used to recover
     * the D-Bus error name and strips it if found. If stripped, the
     * message field in @error will correspond exactly to what was
     * received on the wire.
     * 
     * This is typically used when presenting errors to the end user.
     */
    public static boolean dbusErrorStripRemoteError(org.gtk.glib.Error error) {
        var RESULT = gtk_h.g_dbus_error_strip_remote_error(error.handle());
        return (RESULT != 0);
    }
    
    /**
     * Destroys an association previously set up with g_dbus_error_register_error().
     */
    public static boolean dbusErrorUnregisterError(org.gtk.glib.Quark errorDomain, int errorCode, java.lang.String dbusErrorName) {
        var RESULT = gtk_h.g_dbus_error_unregister_error(errorDomain.getValue(), errorCode, Interop.allocateNativeString(dbusErrorName).handle());
        return (RESULT != 0);
    }
    
    /**
     * This is a language binding friendly version of g_dbus_escape_object_path_bytestring().
     */
    public static java.lang.String dbusEscapeObjectPath(java.lang.String s) {
        var RESULT = gtk_h.g_dbus_escape_object_path(Interop.allocateNativeString(s).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Escapes @bytes for use in a D-Bus object path component.
     * @bytes is an array of zero or more nonzero bytes in an
     * unspecified encoding, followed by a single zero byte.
     * <p>
     * The escaping method consists of replacing all non-alphanumeric
     * characters (see g_ascii_isalnum()) with their hexadecimal value
     * preceded by an underscore (<code>_</code>). For example:<code>foo.bar.baz</code> will become <code>foo_2ebar_2ebaz</code>.
     * 
     * This method is appropriate to use when the input is nearly
     * a valid object path component but is not when your input
     * is far from being a valid object path component.
     * Other escaping algorithms are also valid to use with
     * D-Bus object paths.
     * 
     * This can be reversed with g_dbus_unescape_object_path().
     */
    public static java.lang.String dbusEscapeObjectPathBytestring(byte[] bytes) {
        var RESULT = gtk_h.g_dbus_escape_object_path_bytestring(new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, bytes)).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Generate a D-Bus GUID that can be used with
     * e.g. g_dbus_connection_new().
     * 
     * See the
     * {@link [D-Bus specification]}(https://dbus.freedesktop.org/doc/dbus-specification.html<code>#uuids</code> 
     * regarding what strings are valid D-Bus GUIDs. The specification refers to
     * these as &<code>#8216</code> UUIDs&<code>#8217</code>  whereas GLib (for historical reasons) refers to them as
     * &<code>#8216</code> GUIDs&<code>#8217</code> . The terms are interchangeable.
     * 
     * Note that D-Bus GUIDs do not follow
     * {@link [RFC 4122]}(https://datatracker.ietf.org/doc/html/rfc4122).
     */
    public static java.lang.String dbusGenerateGuid() {
        var RESULT = gtk_h.g_dbus_generate_guid();
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Converts a {@link org.gtk.gobject.Value} to a {@link org.gtk.glib.Variant} of the type indicated by the @type
     * parameter.
     * <p>
     * The conversion is using the following rules:
     * <p>
     * <li><code>G_TYPE_STRING</code>: &<code>#39</code> s&<code>#39</code> , &<code>#39</code> o&<code>#39</code> , &<code>#39</code> g&<code>#39</code>  or &<code>#39</code> ay&<code>#39</code> 
     * <li><code>G_TYPE_STRV</code>: &<code>#39</code> as&<code>#39</code> , &<code>#39</code> ao&<code>#39</code>  or &<code>#39</code> aay&<code>#39</code> 
     * <li><code>G_TYPE_BOOLEAN</code>: &<code>#39</code> b&<code>#39</code> 
     * <li><code>G_TYPE_UCHAR</code>: &<code>#39</code> y&<code>#39</code> 
     * <li><code>G_TYPE_INT</code>: &<code>#39</code> i&<code>#39</code> , &<code>#39</code> n&<code>#39</code> 
     * <li><code>G_TYPE_UINT</code>: &<code>#39</code> u&<code>#39</code> , &<code>#39</code> q&<code>#39</code> 
     * <li><code>G_TYPE_INT64</code>: &<code>#39</code> x&<code>#39</code> 
     * <li><code>G_TYPE_UINT64</code>: &<code>#39</code> t&<code>#39</code> 
     * <li><code>G_TYPE_DOUBLE</code>: &<code>#39</code> d&<code>#39</code> 
     * <li><code>G_TYPE_VARIANT</code>: Any {@link org.gtk.glib.VariantType} 
     * This can fail if e.g. @gvalue is of type <code>G_TYPE_STRING</code> and @type
     * is &<code>#39</code> i&<code>#39</code> , i.e. <code>G_VARIANT_TYPE_INT32</code>  It will also fail for any {@link org.gtk.glib.Type} (including e.g. <code>G_TYPE_OBJECT</code> and <code>G_TYPE_BOXED</code> derived-types) not
     * in the table above.
     * 
     * Note that if @gvalue is of type <code>G_TYPE_VARIANT</code> and its value is
     * <code>null</code>  the empty {@link org.gtk.glib.Variant} instance (never <code>null</code>  for @type is
     * returned (e.g. 0 for scalar types, the empty string for string types,
     * &<code>#39</code> /&<code>#39</code>  for object path types, the empty array for any array type and so on).
     * 
     * See the g_dbus_gvariant_to_gvalue() function for how to convert a
     * {@link org.gtk.glib.Variant} to a {@link org.gtk.gobject.Value}
     */
    public static org.gtk.glib.Variant dbusGvalueToGvariant(org.gtk.gobject.Value gvalue, org.gtk.glib.VariantType type) {
        var RESULT = gtk_h.g_dbus_gvalue_to_gvariant(gvalue.handle(), type.handle());
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Converts a {@link org.gtk.glib.Variant} to a {@link org.gtk.gobject.Value}  If @value is floating, it is consumed.
     * 
     * The rules specified in the g_dbus_gvalue_to_gvariant() function are
     * used - this function is essentially its reverse form. So, a {@link org.gtk.glib.Variant} containing any basic or string array type will be converted to a {@link org.gtk.gobject.Value} containing a basic value or string array. Any other {@link org.gtk.glib.Variant} (handle,
     * variant, tuple, dict entry) will be converted to a {@link org.gtk.gobject.Value} containing that
     * {@link org.gtk.glib.Variant} 
     * 
     * The conversion never fails - a valid {@link org.gtk.gobject.Value} is always returned in
     * @out_gvalue.
     */
    public static void dbusGvariantToGvalue(org.gtk.glib.Variant value, org.gtk.gobject.Value outGvalue) {
        gtk_h.g_dbus_gvariant_to_gvalue(value.handle(), outGvalue.handle());
    }
    
    /**
     * Checks if @string is a
     * {@link [D-Bus address]}(https://dbus.freedesktop.org/doc/dbus-specification.html<code>#addresses</code> .
     * 
     * This doesn&<code>#39</code> t check if @string is actually supported by {@link org.gtk.gio.DBusServer} or {@link org.gtk.gio.DBusConnection} - use g_dbus_is_supported_address() to do more
     * checks.
     */
    public static boolean dbusIsAddress(java.lang.String string) {
        var RESULT = gtk_h.g_dbus_is_address(Interop.allocateNativeString(string).handle());
        return (RESULT != 0);
    }
    
    /**
     * Check whether @string is a valid D-Bus error name.
     * 
     * This function returns the same result as g_dbus_is_interface_name(),
     * because D-Bus error names are defined to have exactly the
     * same syntax as interface names.
     */
    public static boolean dbusIsErrorName(java.lang.String string) {
        var RESULT = gtk_h.g_dbus_is_error_name(Interop.allocateNativeString(string).handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if @string is a D-Bus GUID.
     * 
     * See the documentation for g_dbus_generate_guid() for more information about
     * the format of a GUID.
     */
    public static boolean dbusIsGuid(java.lang.String string) {
        var RESULT = gtk_h.g_dbus_is_guid(Interop.allocateNativeString(string).handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if @string is a valid D-Bus interface name.
     */
    public static boolean dbusIsInterfaceName(java.lang.String string) {
        var RESULT = gtk_h.g_dbus_is_interface_name(Interop.allocateNativeString(string).handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if @string is a valid D-Bus member (e.g. signal or method) name.
     */
    public static boolean dbusIsMemberName(java.lang.String string) {
        var RESULT = gtk_h.g_dbus_is_member_name(Interop.allocateNativeString(string).handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if @string is a valid D-Bus bus name (either unique or well-known).
     */
    public static boolean dbusIsName(java.lang.String string) {
        var RESULT = gtk_h.g_dbus_is_name(Interop.allocateNativeString(string).handle());
        return (RESULT != 0);
    }
    
    /**
     * Like g_dbus_is_address() but also checks if the library supports the
     * transports in @string and that key/value pairs for each transport
     * are valid. See the specification of the
     * {@link [D-Bus address format]}(https://dbus.freedesktop.org/doc/dbus-specification.html<code>#addresses</code> .
     */
    public static boolean dbusIsSupportedAddress(java.lang.String string) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dbus_is_supported_address(Interop.allocateNativeString(string).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Checks if @string is a valid D-Bus unique bus name.
     */
    public static boolean dbusIsUniqueName(java.lang.String string) {
        var RESULT = gtk_h.g_dbus_is_unique_name(Interop.allocateNativeString(string).handle());
        return (RESULT != 0);
    }
    
    /**
     * Creates a new {@link org.gtk.gio.DtlsClientConnection} wrapping @base_socket which is
     * assumed to communicate with the server identified by @server_identity.
     */
    public static DtlsClientConnection dtlsClientConnectionNew(DatagramBased baseSocket, SocketConnectable serverIdentity) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dtls_client_connection_new(baseSocket.handle(), serverIdentity.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new DtlsClientConnection.DtlsClientConnectionImpl(References.get(RESULT, true));
    }
    
    /**
     * Creates a new {@link org.gtk.gio.DtlsServerConnection} wrapping @base_socket.
     */
    public static DtlsServerConnection dtlsServerConnectionNew(DatagramBased baseSocket, TlsCertificate certificate) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dtls_server_connection_new(baseSocket.handle(), certificate.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new DtlsServerConnection.DtlsServerConnectionImpl(References.get(RESULT, true));
    }
    
    /**
     * Creates a {@link org.gtk.gio.File} with the given argument from the command line.
     * The value of @arg can be either a URI, an absolute path or a
     * relative path resolved relative to the current working directory.
     * This operation never fails, but the returned object might not
     * support any I/O operation if @arg points to a malformed path.
     * 
     * Note that on Windows, this function expects its argument to be in
     * UTF-8 -- not the system code page.  This means that you
     * should not use this function with string from argv as it is passed
     * to main().  g_win32_get_command_line() will return a UTF-8 version of
     * the commandline.  {@link org.gtk.gio.Application} also uses UTF-8 but
     * g_application_command_line_create_file_for_arg() may be more useful
     * for you there.  It is also always possible to use this function with
     * {@link org.gtk.glib.OptionContext} arguments of type {@link org.gtk.glib.OptionArg<code>#FILENAME</code>
     */
    public static File fileNewForCommandlineArg(java.lang.String arg) {
        var RESULT = gtk_h.g_file_new_for_commandline_arg(Interop.allocateNativeString(arg).handle());
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Creates a {@link org.gtk.gio.File} with the given argument from the command line.
     * 
     * This function is similar to g_file_new_for_commandline_arg() except
     * that it allows for passing the current working directory as an
     * argument instead of using the current working directory of the
     * process.
     * 
     * This is useful if the commandline argument was given in a context
     * other than the invocation of the current process.
     * 
     * See also g_application_command_line_create_file_for_arg().
     */
    public static File fileNewForCommandlineArgAndCwd(java.lang.String arg, java.lang.String cwd) {
        var RESULT = gtk_h.g_file_new_for_commandline_arg_and_cwd(Interop.allocateNativeString(arg).handle(), Interop.allocateNativeString(cwd).handle());
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Constructs a {@link org.gtk.gio.File} for a given path. This operation never
     * fails, but the returned object might not support any I/O
     * operation if @path is malformed.
     */
    public static File fileNewForPath(java.lang.String path) {
        var RESULT = gtk_h.g_file_new_for_path(Interop.allocateNativeString(path).handle());
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Constructs a {@link org.gtk.gio.File} for a given URI. This operation never
     * fails, but the returned object might not support any I/O
     * operation if @uri is malformed or if the uri type is
     * not supported.
     */
    public static File fileNewForUri(java.lang.String uri) {
        var RESULT = gtk_h.g_file_new_for_uri(Interop.allocateNativeString(uri).handle());
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Opens a file in the preferred directory for temporary files (as
     * returned by g_get_tmp_dir()) and returns a {@link org.gtk.gio.File} and
     * {@link org.gtk.gio.FileIOStream} pointing to it.
     * 
     * @tmpl should be a string in the GLib file name encoding
     * containing a sequence of six &<code>#39</code> X&<code>#39</code>  characters, and containing no
     * directory components. If it is <code>null</code>  a default template is used.
     * 
     * Unlike the other {@link org.gtk.gio.File} constructors, this will return <code>null</code> if
     * a temporary file could not be created.
     */
    public static File fileNewTmp(java.lang.String tmpl, FileIOStream[] iostream) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_new_tmp(Interop.allocateNativeString(tmpl).handle(), Interop.allocateNativeArray(iostream).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Constructs a {@link org.gtk.gio.File} with the given @parse_name (i.e. something
     * given by g_file_get_parse_name()). This operation never fails,
     * but the returned object might not support any I/O operation if
     * the @parse_name cannot be parsed.
     */
    public static File fileParseName(java.lang.String parseName) {
        var RESULT = gtk_h.g_file_parse_name(Interop.allocateNativeString(parseName).handle());
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Deserializes a {@link org.gtk.gio.Icon} previously serialized using g_icon_serialize().
     */
    public static Icon iconDeserialize(org.gtk.glib.Variant value) {
        var RESULT = gtk_h.g_icon_deserialize(value.handle());
        return new Icon.IconImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets a hash for an icon.
     */
    public static int iconHash(jdk.incubator.foreign.MemoryAddress icon) {
        var RESULT = gtk_h.g_icon_hash(icon);
        return RESULT;
    }
    
    /**
     * Generate a {@link org.gtk.gio.Icon} instance from @str. This function can fail if
     * @str is not valid - see g_icon_to_string() for discussion.
     * 
     * If your application or library provides one or more {@link org.gtk.gio.Icon} implementations you need to ensure that each {@link org.gtk.glib.Type} is registered
     * with the type system prior to calling g_icon_new_for_string().
     */
    public static Icon iconNewForString(java.lang.String str) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_icon_new_for_string(Interop.allocateNativeString(str).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new Icon.IconImpl(References.get(RESULT, true));
    }
    
    /**
     * Converts errno.h error codes into GIO error codes. The fallback
     * value {@link org.gtk.gio.IOErrorEnum<code>#FAILED</code>  is returned for error codes not currently
     * handled (but note that future GLib releases may return a more
     * specific value instead).
     * 
     * As <code>errno</code> is global and may be modified by intermediate function
     * calls, you should save its value as soon as the call which sets it
     */
    public static IOErrorEnum ioErrorFromErrno(int errNo) {
        var RESULT = gtk_h.g_io_error_from_errno(errNo);
        return IOErrorEnum.fromValue(RESULT);
    }
    
    /**
     * Gets the GIO Error Quark.
     */
    public static org.gtk.glib.Quark ioErrorQuark() {
        var RESULT = gtk_h.g_io_error_quark();
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Registers @type as extension for the extension point with name
     * @extension_point_name.
     * 
     * If @type has already been registered as an extension for this
     * extension point, the existing {@link org.gtk.gio.IOExtension} object is returned.
     */
    public static IOExtension ioExtensionPointImplement(java.lang.String extensionPointName, Type type, java.lang.String extensionName, int priority) {
        var RESULT = gtk_h.g_io_extension_point_implement(Interop.allocateNativeString(extensionPointName).handle(), type.getValue(), Interop.allocateNativeString(extensionName).handle(), priority);
        return new IOExtension(References.get(RESULT, false));
    }
    
    /**
     * Looks up an existing extension point.
     */
    public static IOExtensionPoint ioExtensionPointLookup(java.lang.String name) {
        var RESULT = gtk_h.g_io_extension_point_lookup(Interop.allocateNativeString(name).handle());
        return new IOExtensionPoint(References.get(RESULT, false));
    }
    
    /**
     * Registers an extension point.
     */
    public static IOExtensionPoint ioExtensionPointRegister(java.lang.String name) {
        var RESULT = gtk_h.g_io_extension_point_register(Interop.allocateNativeString(name).handle());
        return new IOExtensionPoint(References.get(RESULT, false));
    }
    
    /**
     * Loads all the modules in the specified directory.
     * 
     * If don&<code>#39</code> t require all modules to be initialized (and thus registering
     * all gtypes) then you can use g_io_modules_scan_all_in_directory()
     * which allows delayed/lazy loading of modules.
     */
    public static org.gtk.glib.List ioModulesLoadAllInDirectory(java.lang.String dirname) {
        var RESULT = gtk_h.g_io_modules_load_all_in_directory(Interop.allocateNativeString(dirname).handle());
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Loads all the modules in the specified directory.
     * 
     * If don&<code>#39</code> t require all modules to be initialized (and thus registering
     * all gtypes) then you can use g_io_modules_scan_all_in_directory()
     * which allows delayed/lazy loading of modules.
     */
    public static org.gtk.glib.List ioModulesLoadAllInDirectoryWithScope(java.lang.String dirname, IOModuleScope scope) {
        var RESULT = gtk_h.g_io_modules_load_all_in_directory_with_scope(Interop.allocateNativeString(dirname).handle(), scope.handle());
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Scans all the modules in the specified directory, ensuring that
     * any extension point implemented by a module is registered.
     * 
     * This may not actually load and initialize all the types in each
     * module, some modules may be lazily loaded and initialized when
     * an extension point it implements is used with e.g.
     * g_io_extension_point_get_extensions() or
     * g_io_extension_point_get_extension_by_name().
     * 
     * If you need to guarantee that all types are loaded in all the modules,
     * use g_io_modules_load_all_in_directory().
     */
    public static void ioModulesScanAllInDirectory(java.lang.String dirname) {
        gtk_h.g_io_modules_scan_all_in_directory(Interop.allocateNativeString(dirname).handle());
    }
    
    /**
     * Scans all the modules in the specified directory, ensuring that
     * any extension point implemented by a module is registered.
     * 
     * This may not actually load and initialize all the types in each
     * module, some modules may be lazily loaded and initialized when
     * an extension point it implements is used with e.g.
     * g_io_extension_point_get_extensions() or
     * g_io_extension_point_get_extension_by_name().
     * 
     * If you need to guarantee that all types are loaded in all the modules,
     * use g_io_modules_load_all_in_directory().
     */
    public static void ioModulesScanAllInDirectoryWithScope(java.lang.String dirname, IOModuleScope scope) {
        gtk_h.g_io_modules_scan_all_in_directory_with_scope(Interop.allocateNativeString(dirname).handle(), scope.handle());
    }
    
    /**
     * Creates a keyfile-backed {@link org.gtk.gio.SettingsBackend} 
     * <p>
     * The filename of the keyfile to use is given by @filename.
     * <p>
     * All settings read to or written from the backend must fall under the
     * path given in @root_path (which must start and end with a slash and
     * not contain two consecutive slashes).  @root_path may be &<code>#34</code> /&<code>#34</code> .
     * <p>
     * If @root_group is non-<code>null</code> then it specifies the name of the keyfile
     * group used for keys that are written directly below @root_path.  For
     * example, if @root_path is &<code>#34</code> /apps/example/&<code>#34</code>  and @root_group is
     * &<code>#34</code> toplevel&<code>#34</code> , then settings the key &<code>#34</code> /apps/example/enabled&<code>#34</code>  to a value
     * of <code>true</code> will cause the following to appear in the keyfile:
     * <p>
     * |{@link [
     *   [toplevel]}
     *   enabled=true
     * ]|
     * <p>
     * If @root_group is <code>null</code> then it is not permitted to store keys
     * directly below the @root_path.
     * <p>
     * For keys not stored directly below @root_path (ie: in a sub-path),
     * the name of the subpath (with the final slash stripped) is used as
     * the name of the keyfile group.  To continue the example, if
     * &<code>#34</code> /apps/example/profiles/default/font-size&<code>#34</code>  were set to
     * 12 then the following would appear in the keyfile:
     * <p>
     * |{@link [
     *   [profiles/default]}
     *   font-size=12
     * ]|
     * <p>
     * The backend will refuse writes (and return writability as being
     * <code>false</code>  for keys outside of @root_path and, in the event that
     * @root_group is <code>null</code>  also for keys directly under @root_path.
     * Writes will also be refused if the backend detects that it has the
     * inability to rewrite the keyfile (ie: the containing directory is not
     * writable).
     * <p>
     * There is no checking done for your key namespace clashing with the
     * syntax of the key file format.  For example, if you have &<code>#39</code> {@link [&<code>#39</code>  or &<code>#39</code> ]}&<code>#39</code> 
     * characters in your path names or &<code>#39</code> =&<code>#39</code>  in your key names you may be in
     * trouble.
     * <p>
     * The backend reads default values from a keyfile called <code>defaults</code> in
     * the directory specified by the <code>#GKeyfileSettingsBackend</code> defaults-dir property,
     * and a list of locked keys from a text file with the name <code>locks</code> in
     * the same location.
     */
    public static SettingsBackend keyfileSettingsBackendNew(java.lang.String filename, java.lang.String rootPath, java.lang.String rootGroup) {
        var RESULT = gtk_h.g_keyfile_settings_backend_new(Interop.allocateNativeString(filename).handle(), Interop.allocateNativeString(rootPath).handle(), Interop.allocateNativeString(rootGroup).handle());
        return new SettingsBackend(References.get(RESULT, true));
    }
    
    /**
     * Gets a reference to the default {@link org.gtk.gio.MemoryMonitor} for the system.
     */
    public static MemoryMonitor memoryMonitorDupDefault() {
        var RESULT = gtk_h.g_memory_monitor_dup_default();
        return new MemoryMonitor.MemoryMonitorImpl(References.get(RESULT, true));
    }
    
    /**
     * Creates a memory-backed {@link org.gtk.gio.SettingsBackend} 
     * 
     * This backend allows changes to settings, but does not write them
     * to any backing storage, so the next time you run your application,
     * the memory backend will start out with the default values again.
     */
    public static SettingsBackend memorySettingsBackendNew() {
        var RESULT = gtk_h.g_memory_settings_backend_new();
        return new SettingsBackend(References.get(RESULT, true));
    }
    
    /**
     * Gets the default {@link org.gtk.gio.NetworkMonitor} for the system.
     */
    public static NetworkMonitor networkMonitorGetDefault() {
        var RESULT = gtk_h.g_network_monitor_get_default();
        return new NetworkMonitor.NetworkMonitorImpl(References.get(RESULT, false));
    }
    
    /**
     * Initializes the platform networking libraries (eg, on Windows, this
     * calls WSAStartup()). GLib will call this itself if it is needed, so
     * you only need to call it if you directly call system networking
     * functions (without calling any GLib networking functions first).
     */
    public static void networkingInit() {
        gtk_h.g_networking_init();
    }
    
    /**
     * Creates a readonly {@link org.gtk.gio.SettingsBackend} 
     * 
     * This backend does not allow changes to settings, so all settings
     * will always have their default values.
     */
    public static SettingsBackend nullSettingsBackendNew() {
        var RESULT = gtk_h.g_null_settings_backend_new();
        return new SettingsBackend(References.get(RESULT, true));
    }
    
    /**
     * Utility method for {@link org.gtk.gio.PollableInputStream} and {@link org.gtk.gio.PollableOutputStream} implementations. Creates a new {@link org.gtk.glib.Source} that expects a callback of
     * type {@link org.gtk.gio.PollableSourceFunc}  The new source does not actually do
     * anything on its own; use g_source_add_child_source() to add other
     * sources to it to cause it to trigger.
     */
    public static org.gtk.glib.Source pollableSourceNew(org.gtk.gobject.Object pollableStream) {
        var RESULT = gtk_h.g_pollable_source_new(pollableStream.handle());
        return new org.gtk.glib.Source(References.get(RESULT, true));
    }
    
    /**
     * Utility method for {@link org.gtk.gio.PollableInputStream} and {@link org.gtk.gio.PollableOutputStream} implementations. Creates a new {@link org.gtk.glib.Source}  as with
     * g_pollable_source_new(), but also attaching @child_source (with a
     * dummy callback), and @cancellable, if they are non-<code>null</code>
     */
    public static org.gtk.glib.Source pollableSourceNewFull(org.gtk.gobject.Object pollableStream, org.gtk.glib.Source childSource, Cancellable cancellable) {
        var RESULT = gtk_h.g_pollable_source_new_full(pollableStream.handle(), childSource.handle(), cancellable.handle());
        return new org.gtk.glib.Source(References.get(RESULT, true));
    }
    
    /**
     * Tries to read from @stream, as with g_input_stream_read() (if
     * @blocking is <code>true</code>  or g_pollable_input_stream_read_nonblocking()
     * (if @blocking is <code>false</code> . This can be used to more easily share
     * code between blocking and non-blocking implementations of a method.
     * 
     * If @blocking is <code>false</code>  then @stream must be a
     * {@link org.gtk.gio.PollableInputStream} for which g_pollable_input_stream_can_poll()
     * returns <code>true</code>  or else the behavior is undefined. If @blocking is
     * <code>true</code>  then @stream does not need to be a {@link org.gtk.gio.PollableInputStream}
     */
    public static long pollableStreamRead(InputStream stream, byte[] buffer, long count, boolean blocking, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_pollable_stream_read(stream.handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, buffer)).handle(), count, blocking ? 1 : 0, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Tries to write to @stream, as with g_output_stream_write() (if
     * @blocking is <code>true</code>  or g_pollable_output_stream_write_nonblocking()
     * (if @blocking is <code>false</code> . This can be used to more easily share
     * code between blocking and non-blocking implementations of a method.
     * 
     * If @blocking is <code>false</code>  then @stream must be a
     * {@link org.gtk.gio.PollableOutputStream} for which
     * g_pollable_output_stream_can_poll() returns <code>true</code> or else the
     * behavior is undefined. If @blocking is <code>true</code>  then @stream does not
     * need to be a {@link org.gtk.gio.PollableOutputStream}
     */
    public static long pollableStreamWrite(OutputStream stream, byte[] buffer, long count, boolean blocking, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_pollable_stream_write(stream.handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, buffer)).handle(), count, blocking ? 1 : 0, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Gets a reference to the default {@link org.gtk.gio.PowerProfileMonitor} for the system.
     */
    public static PowerProfileMonitor powerProfileMonitorDupDefault() {
        var RESULT = gtk_h.g_power_profile_monitor_dup_default();
        return new PowerProfileMonitor.PowerProfileMonitorImpl(References.get(RESULT, true));
    }
    
    /**
     * Find the <code>gio-proxy</code> extension point for a proxy implementation that supports
     * the specified protocol.
     */
    public static Proxy proxyGetDefaultForProtocol(java.lang.String protocol) {
        var RESULT = gtk_h.g_proxy_get_default_for_protocol(Interop.allocateNativeString(protocol).handle());
        return new Proxy.ProxyImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets the default {@link org.gtk.gio.ProxyResolver} for the system.
     */
    public static ProxyResolver proxyResolverGetDefault() {
        var RESULT = gtk_h.g_proxy_resolver_get_default();
        return new ProxyResolver.ProxyResolverImpl(References.get(RESULT, false));
    }
    
    /**
     * Gets the {@link org.gtk.gio.Resolver} Error Quark.
     */
    public static org.gtk.glib.Quark resolverErrorQuark() {
        var RESULT = gtk_h.g_resolver_error_quark();
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Gets the {@link org.gtk.gio.Resource} Error Quark.
     */
    public static org.gtk.glib.Quark resourceErrorQuark() {
        var RESULT = gtk_h.g_resource_error_quark();
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Loads a binary resource bundle and creates a {@link org.gtk.gio.Resource} representation of it, allowing
     * you to query it for data.
     * 
     * If you want to use this resource in the global resource namespace you need
     * to register it with g_resources_register().
     * 
     * If @filename is empty or the data in it is corrupt,
     * {@link org.gtk.gio.ResourceError<code>#INTERNAL</code>  will be returned. If @filename doesn&<code>#8217</code> t exist, or
     * there is an error in reading it, an error from g_mapped_file_new() will be
     * returned.
     */
    public static Resource resourceLoad(java.lang.String filename) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_resource_load(Interop.allocateNativeString(filename).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new Resource(References.get(RESULT, true));
    }
    
    /**
     * Looks for a file at the specified @path in the set of
     * globally registered resources and returns a {@link org.gtk.glib.Bytes} that
     * lets you directly access the data in memory.
     * 
     * The data is always followed by a zero byte, so you
     * can safely use the data as a C string. However, that byte
     * is not included in the size of the GBytes.
     * 
     * For uncompressed resource files this is a pointer directly into
     * the resource bundle, which is typically in some readonly data section
     * in the program binary. For compressed files we allocate memory on
     * the heap and automatically uncompress the data.
     * 
     * @lookup_flags controls the behaviour of the lookup.
     */
    public static org.gtk.glib.Bytes resourcesLookupData(java.lang.String path, int lookupFlags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_resources_lookup_data(Interop.allocateNativeString(path).handle(), lookupFlags, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.Bytes(References.get(RESULT, true));
    }
    
    /**
     * Looks for a file at the specified @path in the set of
     * globally registered resources and returns a {@link org.gtk.gio.InputStream} that lets you read the data.
     * 
     * @lookup_flags controls the behaviour of the lookup.
     */
    public static InputStream resourcesOpenStream(java.lang.String path, int lookupFlags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_resources_open_stream(Interop.allocateNativeString(path).handle(), lookupFlags, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new InputStream(References.get(RESULT, true));
    }
    
    /**
     * Registers the resource with the process-global set of resources.
     * Once a resource is registered the files in it can be accessed
     * with the global resource lookup functions like g_resources_lookup_data().
     */
    public static void resourcesRegister(Resource resource) {
        gtk_h.g_resources_register(resource.handle());
    }
    
    /**
     * Unregisters the resource from the process-global set of resources.
     */
    public static void resourcesUnregister(Resource resource) {
        gtk_h.g_resources_unregister(resource.handle());
    }
    
    /**
     * Gets the default system schema source.
     * <p>
     * This function is not required for normal uses of {@link org.gtk.gio.Settings} but it
     * may be useful to authors of plugin management systems or to those who
     * want to introspect the content of schemas.
     * <p>
     * If no schemas are installed, <code>null</code> will be returned.
     * <p>
     * The returned source may actually consist of multiple schema sources
     * from different directories, depending on which directories were given
     * in <code>XDG_DATA_DIRS</code> and <code>GSETTINGS_SCHEMA_DIR</code>. For this reason, all
     * lookups performed against the default source should probably be done
     * recursively.
     */
    public static SettingsSchemaSource settingsSchemaSourceGetDefault() {
        var RESULT = gtk_h.g_settings_schema_source_get_default();
        return new SettingsSchemaSource(References.get(RESULT, false));
    }
    
    /**
     * Sorts @targets in place according to the algorithm in RFC 2782.
     */
    public static org.gtk.glib.List srvTargetListSort(org.gtk.glib.List targets) {
        var RESULT = gtk_h.g_srv_target_list_sort(targets.handle());
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Gets the default {@link org.gtk.gio.TlsBackend} for the system.
     */
    public static TlsBackend tlsBackendGetDefault() {
        var RESULT = gtk_h.g_tls_backend_get_default();
        return new TlsBackend.TlsBackendImpl(References.get(RESULT, false));
    }
    
    /**
     * Gets the TLS channel binding error quark.
     */
    public static org.gtk.glib.Quark tlsChannelBindingErrorQuark() {
        var RESULT = gtk_h.g_tls_channel_binding_error_quark();
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Creates a new {@link org.gtk.gio.TlsClientConnection} wrapping @base_io_stream (which
     * must have pollable input and output streams) which is assumed to
     * communicate with the server identified by @server_identity.
     * 
     * See the documentation for {@link org.gtk.gio.TlsConnection} base-io-stream for restrictions
     * on when application code can run operations on the @base_io_stream after
     * this function has returned.
     */
    public static TlsClientConnection tlsClientConnectionNew(IOStream baseIoStream, SocketConnectable serverIdentity) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_tls_client_connection_new(baseIoStream.handle(), serverIdentity.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new TlsClientConnection.TlsClientConnectionImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets the TLS error quark.
     */
    public static org.gtk.glib.Quark tlsErrorQuark() {
        var RESULT = gtk_h.g_tls_error_quark();
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Creates a new {@link org.gtk.gio.TlsFileDatabase} which uses anchor certificate authorities
     * in @anchors to verify certificate chains.
     * 
     * The certificates in @anchors must be PEM encoded.
     */
    public static TlsFileDatabase tlsFileDatabaseNew(java.lang.String anchors) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_tls_file_database_new(Interop.allocateNativeString(anchors).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new TlsFileDatabase.TlsFileDatabaseImpl(References.get(RESULT, true));
    }
    
    /**
     * Creates a new {@link org.gtk.gio.TlsServerConnection} wrapping @base_io_stream (which
     * must have pollable input and output streams).
     * 
     * See the documentation for {@link org.gtk.gio.TlsConnection} base-io-stream for restrictions
     * on when application code can run operations on the @base_io_stream after
     * this function has returned.
     */
    public static TlsServerConnection tlsServerConnectionNew(IOStream baseIoStream, TlsCertificate certificate) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_tls_server_connection_new(baseIoStream.handle(), certificate.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new TlsServerConnection.TlsServerConnectionImpl(References.get(RESULT, true));
    }
    
    /**
     * Determines if @mount_path is considered an implementation of the
     * OS. This is primarily used for hiding mountable and mounted volumes
     * that only are used in the OS and has little to no relevance to the
     * casual user.
     */
    public static boolean unixIsMountPathSystemInternal(java.lang.String mountPath) {
        var RESULT = gtk_h.g_unix_is_mount_path_system_internal(Interop.allocateNativeString(mountPath).handle());
        return (RESULT != 0);
    }
    
    /**
     * Determines if @device_path is considered a block device path which is only
     * used in implementation of the OS. This is primarily used for hiding
     * mounted volumes that are intended as APIs for programs to read, and system
     * administrators at a shell; rather than something that should, for example,
     * appear in a GUI. For example, the Linux <code>/proc</code> filesystem.
     * 
     * The list of device paths considered &<code>#8216</code> system&<code>#8217</code>  ones may change over time.
     */
    public static boolean unixIsSystemDevicePath(java.lang.String devicePath) {
        var RESULT = gtk_h.g_unix_is_system_device_path(Interop.allocateNativeString(devicePath).handle());
        return (RESULT != 0);
    }
    
    /**
     * Determines if @fs_type is considered a type of file system which is only
     * used in implementation of the OS. This is primarily used for hiding
     * mounted volumes that are intended as APIs for programs to read, and system
     * administrators at a shell; rather than something that should, for example,
     * appear in a GUI. For example, the Linux <code>/proc</code> filesystem.
     * 
     * The list of file system types considered &<code>#8216</code> system&<code>#8217</code>  ones may change over time.
     */
    public static boolean unixIsSystemFsType(java.lang.String fsType) {
        var RESULT = gtk_h.g_unix_is_system_fs_type(Interop.allocateNativeString(fsType).handle());
        return (RESULT != 0);
    }
    
    /**
     * Compares two unix mounts.
     */
    public static int unixMountCompare(UnixMountEntry mount1, UnixMountEntry mount2) {
        var RESULT = gtk_h.g_unix_mount_compare(mount1.handle(), mount2.handle());
        return RESULT;
    }
    
    /**
     * Makes a copy of @mount_entry.
     */
    public static UnixMountEntry unixMountCopy(UnixMountEntry mountEntry) {
        var RESULT = gtk_h.g_unix_mount_copy(mountEntry.handle());
        return new UnixMountEntry(References.get(RESULT, true));
    }
    
    /**
     * Frees a unix mount.
     */
    public static void unixMountFree(UnixMountEntry mountEntry) {
        gtk_h.g_unix_mount_free(mountEntry.handle());
    }
    
    /**
     * Gets the device path for a unix mount.
     */
    public static java.lang.String unixMountGetDevicePath(UnixMountEntry mountEntry) {
        var RESULT = gtk_h.g_unix_mount_get_device_path(mountEntry.handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the filesystem type for the unix mount.
     */
    public static java.lang.String unixMountGetFsType(UnixMountEntry mountEntry) {
        var RESULT = gtk_h.g_unix_mount_get_fs_type(mountEntry.handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the mount path for a unix mount.
     */
    public static java.lang.String unixMountGetMountPath(UnixMountEntry mountEntry) {
        var RESULT = gtk_h.g_unix_mount_get_mount_path(mountEntry.handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets a comma-separated list of mount options for the unix mount. For example,<code>rw,relatime,seclabel,data=ordered</code>.
     * 
     * This is similar to g_unix_mount_point_get_options(), but it takes
     * a {@link org.gtk.gio.UnixMountEntry} as an argument.
     */
    public static java.lang.String unixMountGetOptions(UnixMountEntry mountEntry) {
        var RESULT = gtk_h.g_unix_mount_get_options(mountEntry.handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the root of the mount within the filesystem. This is useful e.g. for
     * mounts created by bind operation, or btrfs subvolumes.
     * 
     * For example, the root path is equal to &<code>#34</code> /&<code>#34</code>  for mount created by
     * &<code>#34</code> mount /dev/sda1 /mnt/foo&<code>#34</code>  and &<code>#34</code> /bar&<code>#34</code>  for
     * &<code>#34</code> mount --bind /mnt/foo/bar /mnt/bar&<code>#34</code> .
     */
    public static java.lang.String unixMountGetRootPath(UnixMountEntry mountEntry) {
        var RESULT = gtk_h.g_unix_mount_get_root_path(mountEntry.handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Guesses whether a Unix mount can be ejected.
     */
    public static boolean unixMountGuessCanEject(UnixMountEntry mountEntry) {
        var RESULT = gtk_h.g_unix_mount_guess_can_eject(mountEntry.handle());
        return (RESULT != 0);
    }
    
    /**
     * Guesses the icon of a Unix mount.
     */
    public static Icon unixMountGuessIcon(UnixMountEntry mountEntry) {
        var RESULT = gtk_h.g_unix_mount_guess_icon(mountEntry.handle());
        return new Icon.IconImpl(References.get(RESULT, true));
    }
    
    /**
     * Guesses the name of a Unix mount.
     * The result is a translated string.
     */
    public static java.lang.String unixMountGuessName(UnixMountEntry mountEntry) {
        var RESULT = gtk_h.g_unix_mount_guess_name(mountEntry.handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Guesses whether a Unix mount should be displayed in the UI.
     */
    public static boolean unixMountGuessShouldDisplay(UnixMountEntry mountEntry) {
        var RESULT = gtk_h.g_unix_mount_guess_should_display(mountEntry.handle());
        return (RESULT != 0);
    }
    
    /**
     * Guesses the symbolic icon of a Unix mount.
     */
    public static Icon unixMountGuessSymbolicIcon(UnixMountEntry mountEntry) {
        var RESULT = gtk_h.g_unix_mount_guess_symbolic_icon(mountEntry.handle());
        return new Icon.IconImpl(References.get(RESULT, true));
    }
    
    /**
     * Checks if a unix mount is mounted read only.
     */
    public static boolean unixMountIsReadonly(UnixMountEntry mountEntry) {
        var RESULT = gtk_h.g_unix_mount_is_readonly(mountEntry.handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if a Unix mount is a system mount. This is the Boolean OR of
     * g_unix_is_system_fs_type(), g_unix_is_system_device_path() and
     * g_unix_is_mount_path_system_internal() on @mount_entry&<code>#8217</code> s properties.
     * 
     * The definition of what a &<code>#8216</code> system&<code>#8217</code>  mount entry is may change over time as new
     * file system types and device paths are ignored.
     */
    public static boolean unixMountIsSystemInternal(UnixMountEntry mountEntry) {
        var RESULT = gtk_h.g_unix_mount_is_system_internal(mountEntry.handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if the unix mount points have changed since a given unix time.
     */
    public static boolean unixMountPointsChangedSince(long time) {
        var RESULT = gtk_h.g_unix_mount_points_changed_since(time);
        return (RESULT != 0);
    }
    
    /**
     * Checks if the unix mounts have changed since a given unix time.
     */
    public static boolean unixMountsChangedSince(long time) {
        var RESULT = gtk_h.g_unix_mounts_changed_since(time);
        return (RESULT != 0);
    }
    
}
