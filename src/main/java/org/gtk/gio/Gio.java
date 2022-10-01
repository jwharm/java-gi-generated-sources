package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
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
     * Checks if {@code action_name} is valid.
     * <p>
     * {@code action_name} is valid if it consists only of alphanumeric characters,
     * plus '-' and '.'.  The empty string is not a valid action name.
     * <p>
     * It is an error to call this function with a non-utf8 {@code action_name}.
     * {@code action_name} must not be {@code null}.
     */
    public static boolean actionNameIsValid(java.lang.String actionName) {
        var RESULT = gtk_h.g_action_name_is_valid(Interop.allocateNativeString(actionName).handle());
        return RESULT != 0;
    }
    
    /**
     * Parses a detailed action name into its separate name and target
     * components.
     * <p>
     * Detailed action names can have three formats.
     * <p>
     * The first format is used to represent an action name with no target
     * value and consists of just an action name containing no whitespace
     * nor the characters ':', '(' or ')'.  For example: "app.action".
     * <p>
     * The second format is used to represent an action with a target value
     * that is a non-empty string consisting only of alphanumerics, plus '-'
     * and '.'.  In that case, the action name and target value are
     * separated by a double colon ("::").  For example:
     * "app.action::target".
     * <p>
     * The third format is used to represent an action with any type of
     * target value, including strings.  The target value follows the action
     * name, surrounded in parens.  For example: "app.action(42)".  The
     * target value is parsed using g_variant_parse().  If a tuple-typed
     * value is desired, it must be specified in the same way, resulting in
     * two sets of parens, for example: "app.action((1,2,3))".  A string
     * target can be specified this way as well: "app.action('target')".
     * For strings, this third format must be used if * target value is
     * empty or contains characters other than alphanumerics, '-' and '.'.
     */
    public static boolean actionParseDetailedName(java.lang.String detailedName, java.lang.String[] actionName, org.gtk.glib.Variant[] targetValue) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_action_parse_detailed_name(Interop.allocateNativeString(detailedName).handle(), Interop.allocateNativeArray(actionName).handle(), Interop.allocateNativeArray(targetValue).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Formats a detailed action name from {@code action_name} and {@code target_value}.
     * <p>
     * It is an error to call this function with an invalid action name.
     * <p>
     * This function is the opposite of g_action_parse_detailed_name().
     * It will produce a string that can be parsed back to the {@code action_name}
     * and {@code target_value} by that function.
     * <p>
     * See that function for the types of strings that will be printed by
     * this function.
     */
    public static java.lang.String actionPrintDetailedName(java.lang.String actionName, org.gtk.glib.Variant targetValue) {
        var RESULT = gtk_h.g_action_print_detailed_name(Interop.allocateNativeString(actionName).handle(), targetValue.handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Creates a new {@link AppInfo} from the given information.
     * <p>
     * Note that for {@code commandline}, the quoting rules of the Exec key of the
     * <a href="http://freedesktop.org/Standards/desktop-entry-spec">freedesktop.org Desktop Entry Specification</a>
     * are applied. For example, if the {@code commandline} contains
     * percent-encoded URIs, the percent-character must be doubled in order to prevent it from
     * being swallowed by Exec key unquoting. See the specification for exact quoting rules.
     */
    public static AppInfo appInfoCreateFromCommandline(java.lang.String commandline, java.lang.String applicationName, AppInfoCreateFlags flags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_app_info_create_from_commandline(Interop.allocateNativeString(commandline).handle(), Interop.allocateNativeString(applicationName).handle(), flags.getValue(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new AppInfo.AppInfoImpl(References.get(RESULT, true));
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
     */
    public static org.gtk.glib.List appInfoGetAll() {
        var RESULT = gtk_h.g_app_info_get_all();
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Gets a list of all {@code GAppInfos} for a given content type,
     * including the recommended and fallback {@code GAppInfos}. See
     * g_app_info_get_recommended_for_type() and
     * g_app_info_get_fallback_for_type().
     */
    public static org.gtk.glib.List appInfoGetAllForType(java.lang.String contentType) {
        var RESULT = gtk_h.g_app_info_get_all_for_type(Interop.allocateNativeString(contentType).handle());
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Gets the default {@link AppInfo} for a given content type.
     */
    public static AppInfo appInfoGetDefaultForType(java.lang.String contentType, boolean mustSupportUris) {
        var RESULT = gtk_h.g_app_info_get_default_for_type(Interop.allocateNativeString(contentType).handle(), mustSupportUris ? 1 : 0);
        return new AppInfo.AppInfoImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets the default application for handling URIs with
     * the given URI scheme. A URI scheme is the initial part
     * of the URI, up to but not including the ':', e.g. "http",
     * "ftp" or "sip".
     */
    public static AppInfo appInfoGetDefaultForUriScheme(java.lang.String uriScheme) {
        var RESULT = gtk_h.g_app_info_get_default_for_uri_scheme(Interop.allocateNativeString(uriScheme).handle());
        return new AppInfo.AppInfoImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets a list of fallback {@code GAppInfos} for a given content type, i.e.
     * those applications which claim to support the given content type
     * by MIME type subclassing and not directly.
     */
    public static org.gtk.glib.List appInfoGetFallbackForType(java.lang.String contentType) {
        var RESULT = gtk_h.g_app_info_get_fallback_for_type(Interop.allocateNativeString(contentType).handle());
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Gets a list of recommended {@code GAppInfos} for a given content type, i.e.
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
     * <p>
     * The D-Bus–activated applications don't have to be started if your application
     * terminates too soon after this function. To prevent this, use
     * g_app_info_launch_default_for_uri_async() instead.
     */
    public static boolean appInfoLaunchDefaultForUri(java.lang.String uri, AppLaunchContext context) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_app_info_launch_default_for_uri(Interop.allocateNativeString(uri).handle(), context.handle(), GERROR);
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
     */
    public static void appInfoLaunchDefaultForUriAsync(java.lang.String uri, AppLaunchContext context, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_app_info_launch_default_for_uri_async(Interop.allocateNativeString(uri).handle(), context.handle(), cancellable.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
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
        return RESULT != 0;
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
     * Asynchronously connects to the message bus specified by {@code bus_type}.
     * <p>
     * When the operation is finished, {@code callback} will be invoked. You can
     * then call g_bus_get_finish() to get the result of the operation.
     * <p>
     * This is an asynchronous failable function. See g_bus_get_sync() for
     * the synchronous version.
     */
    public static void busGet(BusType busType, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_bus_get(busType.getValue(), cancellable.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an operation started with g_bus_get().
     * <p>
     * The returned object is a singleton, that is, shared with other
     * callers of g_bus_get() and g_bus_get_sync() for {@code bus_type}. In the
     * event that you need a private message bus connection, use
     * g_dbus_address_get_for_bus_sync() and
     * g_dbus_connection_new_for_address() with
     * G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_CLIENT and
     * G_DBUS_CONNECTION_FLAGS_MESSAGE_BUS_CONNECTION flags.
     * <p>
     * Note that the returned {@link DBusConnection} object will (usually) have
     * the {@link DBusConnection}:exit-on-close property set to {@code true}.
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
     * Synchronously connects to the message bus specified by {@code bus_type}.
     * Note that the returned object may shared with other callers,
     * e.g. if two separate parts of a process calls this function with
     * the same {@code bus_type}, they will share the same object.
     * <p>
     * This is a synchronous failable function. See g_bus_get() and
     * g_bus_get_finish() for the asynchronous version.
     * <p>
     * The returned object is a singleton, that is, shared with other
     * callers of g_bus_get() and g_bus_get_sync() for {@code bus_type}. In the
     * event that you need a private message bus connection, use
     * g_dbus_address_get_for_bus_sync() and
     * g_dbus_connection_new_for_address() with
     * G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_CLIENT and
     * G_DBUS_CONNECTION_FLAGS_MESSAGE_BUS_CONNECTION flags.
     * <p>
     * Note that the returned {@link DBusConnection} object will (usually) have
     * the {@link DBusConnection}:exit-on-close property set to {@code true}.
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
     * Starts acquiring {@code name} on the bus specified by {@code bus_type} and calls
     * {@code name_acquired_handler} and {@code name_lost_handler} when the name is
     * acquired respectively lost. Callbacks will be invoked in the
     * [thread-default main context][g-main-context-push-thread-default]
     * of the thread you are calling this function from.
     * <p>
     * You are guaranteed that one of the {@code name_acquired_handler} and {@code name_lost_handler}
     * callbacks will be invoked after calling this function - there are three
     * possible cases:
     * <p>
     * <ul>
     * <li>{@code name_lost_handler} with a {@code null} connection (if a connection to the bus
     *   can't be made).
     * </ul>
     * <p>
     * <ul>
     * <li>{@code bus_acquired_handler} then {@code name_lost_handler} (if the name can't be
     *   obtained)
     * </ul>
     * <p>
     * <ul>
     * <li>{@code bus_acquired_handler} then {@code name_acquired_handler} (if the name was
     *   obtained).
     * </ul>
     * <p>
     * When you are done owning the name, just call g_bus_unown_name()
     * with the owner id this function returns.
     * <p>
     * If the name is acquired or lost (for example another application
     * could acquire the name if you allow replacement or the application
     * currently owning the name exits), the handlers are also invoked.
     * If the {@link DBusConnection} that is used for attempting to own the name
     * closes, then {@code name_lost_handler} is invoked since it is no longer
     * possible for other processes to access the process.
     * <p>
     * You cannot use g_bus_own_name() several times for the same name (unless
     * interleaved with calls to g_bus_unown_name()) - only the first call
     * will work.
     * <p>
     * Another guarantee is that invocations of {@code name_acquired_handler}
     * and {@code name_lost_handler} are guaranteed to alternate; that
     * is, if {@code name_acquired_handler} is invoked then you are
     * guaranteed that the next time one of the handlers is invoked, it
     * will be {@code name_lost_handler}. The reverse is also true.
     * <p>
     * If you plan on exporting objects (using e.g.
     * g_dbus_connection_register_object()), note that it is generally too late
     * to export the objects in {@code name_acquired_handler}. Instead, you can do this
     * in {@code bus_acquired_handler} since you are guaranteed that this will run
     * before {@code name} is requested from the bus.
     * <p>
     * This behavior makes it very simple to write applications that wants
     * to [own names][gdbus-owning-names] and export objects.
     * Simply register objects to be exported in {@code bus_acquired_handler} and
     * unregister the objects (if any) in {@code name_lost_handler}.
     */
    public static int busOwnName(BusType busType, java.lang.String name, BusNameOwnerFlags flags, BusAcquiredCallback busAcquiredHandler, BusNameAcquiredCallback nameAcquiredHandler, BusNameLostCallback nameLostHandler) {
        try {
            var RESULT = gtk_h.g_bus_own_name(busType.getValue(), Interop.allocateNativeString(name).handle(), flags.getValue(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbBusAcquiredCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbBusNameAcquiredCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbBusNameLostCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(busAcquiredHandler.hashCode(), busAcquiredHandler)), 
                    Interop.cbDestroyNotifySymbol());
            return RESULT;
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Like g_bus_own_name() but takes a {@link DBusConnection} instead of a
     * {@link BusType}.
     */
    public static int busOwnNameOnConnection(DBusConnection connection, java.lang.String name, BusNameOwnerFlags flags, BusNameAcquiredCallback nameAcquiredHandler, BusNameLostCallback nameLostHandler) {
        try {
            var RESULT = gtk_h.g_bus_own_name_on_connection(connection.handle(), Interop.allocateNativeString(name).handle(), flags.getValue(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbBusNameAcquiredCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbBusNameLostCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(nameAcquiredHandler.hashCode(), nameAcquiredHandler)), 
                    Interop.cbDestroyNotifySymbol());
            return RESULT;
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Version of g_bus_own_name_on_connection() using closures instead of
     * callbacks for easier binding in other languages.
     */
    public static int busOwnNameOnConnectionWithClosures(DBusConnection connection, java.lang.String name, BusNameOwnerFlags flags, org.gtk.gobject.Closure nameAcquiredClosure, org.gtk.gobject.Closure nameLostClosure) {
        var RESULT = gtk_h.g_bus_own_name_on_connection_with_closures(connection.handle(), Interop.allocateNativeString(name).handle(), flags.getValue(), nameAcquiredClosure.handle(), nameLostClosure.handle());
        return RESULT;
    }
    
    /**
     * Version of g_bus_own_name() using closures instead of callbacks for
     * easier binding in other languages.
     */
    public static int busOwnNameWithClosures(BusType busType, java.lang.String name, BusNameOwnerFlags flags, org.gtk.gobject.Closure busAcquiredClosure, org.gtk.gobject.Closure nameAcquiredClosure, org.gtk.gobject.Closure nameLostClosure) {
        var RESULT = gtk_h.g_bus_own_name_with_closures(busType.getValue(), Interop.allocateNativeString(name).handle(), flags.getValue(), busAcquiredClosure.handle(), nameAcquiredClosure.handle(), nameLostClosure.handle());
        return RESULT;
    }
    
    /**
     * Stops owning a name.
     * <p>
     * Note that there may still be D-Bus traffic to process (relating to owning
     * and unowning the name) in the current thread-default {@link org.gtk.glib.MainContext} after
     * this function has returned. You should continue to iterate the {@link org.gtk.glib.MainContext}
     * until the {@link org.gtk.glib.DestroyNotify} function passed to g_bus_own_name() is called, in
     * order to avoid memory leaks through callbacks queued on the {@link org.gtk.glib.MainContext}
     * after it’s stopped being iterated.
     */
    public static void busUnownName(int ownerId) {
        gtk_h.g_bus_unown_name(ownerId);
    }
    
    /**
     * Stops watching a name.
     * <p>
     * Note that there may still be D-Bus traffic to process (relating to watching
     * and unwatching the name) in the current thread-default {@link org.gtk.glib.MainContext} after
     * this function has returned. You should continue to iterate the {@link org.gtk.glib.MainContext}
     * until the {@link org.gtk.glib.DestroyNotify} function passed to g_bus_watch_name() is called, in
     * order to avoid memory leaks through callbacks queued on the {@link org.gtk.glib.MainContext}
     * after it’s stopped being iterated.
     */
    public static void busUnwatchName(int watcherId) {
        gtk_h.g_bus_unwatch_name(watcherId);
    }
    
    /**
     * Starts watching {@code name} on the bus specified by {@code bus_type} and calls
     * {@code name_appeared_handler} and {@code name_vanished_handler} when the name is
     * known to have an owner respectively known to lose its
     * owner. Callbacks will be invoked in the
     * [thread-default main context][g-main-context-push-thread-default]
     * of the thread you are calling this function from.
     * <p>
     * You are guaranteed that one of the handlers will be invoked after
     * calling this function. When you are done watching the name, just
     * call g_bus_unwatch_name() with the watcher id this function
     * returns.
     * <p>
     * If the name vanishes or appears (for example the application owning
     * the name could restart), the handlers are also invoked. If the
     * {@link DBusConnection} that is used for watching the name disconnects, then
     * {@code name_vanished_handler} is invoked since it is no longer
     * possible to access the name.
     * <p>
     * Another guarantee is that invocations of {@code name_appeared_handler}
     * and {@code name_vanished_handler} are guaranteed to alternate; that
     * is, if {@code name_appeared_handler} is invoked then you are
     * guaranteed that the next time one of the handlers is invoked, it
     * will be {@code name_vanished_handler}. The reverse is also true.
     * <p>
     * This behavior makes it very simple to write applications that want
     * to take action when a certain [name exists][gdbus-watching-names].
     * Basically, the application should create object proxies in
     * {@code name_appeared_handler} and destroy them again (if any) in
     * {@code name_vanished_handler}.
     */
    public static int busWatchName(BusType busType, java.lang.String name, BusNameWatcherFlags flags, BusNameAppearedCallback nameAppearedHandler, BusNameVanishedCallback nameVanishedHandler) {
        try {
            var RESULT = gtk_h.g_bus_watch_name(busType.getValue(), Interop.allocateNativeString(name).handle(), flags.getValue(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbBusNameAppearedCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbBusNameVanishedCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(nameAppearedHandler.hashCode(), nameAppearedHandler)), 
                    Interop.cbDestroyNotifySymbol());
            return RESULT;
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Like g_bus_watch_name() but takes a {@link DBusConnection} instead of a
     * {@link BusType}.
     */
    public static int busWatchNameOnConnection(DBusConnection connection, java.lang.String name, BusNameWatcherFlags flags, BusNameAppearedCallback nameAppearedHandler, BusNameVanishedCallback nameVanishedHandler) {
        try {
            var RESULT = gtk_h.g_bus_watch_name_on_connection(connection.handle(), Interop.allocateNativeString(name).handle(), flags.getValue(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbBusNameAppearedCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbBusNameVanishedCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(nameAppearedHandler.hashCode(), nameAppearedHandler)), 
                    Interop.cbDestroyNotifySymbol());
            return RESULT;
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Version of g_bus_watch_name_on_connection() using closures instead of callbacks for
     * easier binding in other languages.
     */
    public static int busWatchNameOnConnectionWithClosures(DBusConnection connection, java.lang.String name, BusNameWatcherFlags flags, org.gtk.gobject.Closure nameAppearedClosure, org.gtk.gobject.Closure nameVanishedClosure) {
        var RESULT = gtk_h.g_bus_watch_name_on_connection_with_closures(connection.handle(), Interop.allocateNativeString(name).handle(), flags.getValue(), nameAppearedClosure.handle(), nameVanishedClosure.handle());
        return RESULT;
    }
    
    /**
     * Version of g_bus_watch_name() using closures instead of callbacks for
     * easier binding in other languages.
     */
    public static int busWatchNameWithClosures(BusType busType, java.lang.String name, BusNameWatcherFlags flags, org.gtk.gobject.Closure nameAppearedClosure, org.gtk.gobject.Closure nameVanishedClosure) {
        var RESULT = gtk_h.g_bus_watch_name_with_closures(busType.getValue(), Interop.allocateNativeString(name).handle(), flags.getValue(), nameAppearedClosure.handle(), nameVanishedClosure.handle());
        return RESULT;
    }
    
    /**
     * Checks if a content type can be executable. Note that for instance
     * things like text files can be executables (i.e. scripts and batch files).
     */
    public static boolean contentTypeCanBeExecutable(java.lang.String type) {
        var RESULT = gtk_h.g_content_type_can_be_executable(Interop.allocateNativeString(type).handle());
        return RESULT != 0;
    }
    
    /**
     * Compares two content types for equality.
     */
    public static boolean contentTypeEquals(java.lang.String type1, java.lang.String type2) {
        var RESULT = gtk_h.g_content_type_equals(Interop.allocateNativeString(type1).handle(), Interop.allocateNativeString(type2).handle());
        return RESULT != 0;
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
     * <p>
     * See the
     * <a href="http://www.freedesktop.org/wiki/Specifications/shared-mime-info-spec">shared-mime-info</a>
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
     * Get the list of directories which MIME data is loaded from. See
     * g_content_type_set_mime_dirs() for details.
     */
    public static PointerIterator<java.lang.String> contentTypeGetMimeDirs() {
        var RESULT = gtk_h.g_content_type_get_mime_dirs();
        return new PointerString(RESULT).iterator();
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
     * Guesses the content type based on example data. If the function is
     * uncertain, {@code result_uncertain} will be set to {@code true}. Either {@code filename}
     * or {@code data} may be {@code null}, in which case the guess will be based solely
     * on the other argument.
     */
    public static java.lang.String contentTypeGuess(java.lang.String filename, byte[] data, long dataSize, PointerBoolean resultUncertain) {
        var RESULT = gtk_h.g_content_type_guess(Interop.allocateNativeString(filename).handle(), Interop.allocateNativeArray(data).handle(), dataSize, resultUncertain.handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Tries to guess the type of the tree with root {@code root}, by
     * looking at the files it contains. The result is an array
     * of content types, with the best guess coming first.
     * <p>
     * The types returned all have the form x-content/foo, e.g.
     * x-content/audio-cdda (for audio CDs) or x-content/image-dcf
     * (for a camera memory card). See the
     * <a href="http://www.freedesktop.org/wiki/Specifications/shared-mime-info-spec">shared-mime-info</a>
     * specification for more on x-content types.
     * <p>
     * This function is useful in the implementation of
     * g_mount_guess_content_type().
     */
    public static PointerIterator<java.lang.String> contentTypeGuessForTree(File root) {
        var RESULT = gtk_h.g_content_type_guess_for_tree(root.handle());
        return new PointerString(RESULT).iterator();
    }
    
    /**
     * Determines if {@code type} is a subset of {@code supertype}.
     */
    public static boolean contentTypeIsA(java.lang.String type, java.lang.String supertype) {
        var RESULT = gtk_h.g_content_type_is_a(Interop.allocateNativeString(type).handle(), Interop.allocateNativeString(supertype).handle());
        return RESULT != 0;
    }
    
    /**
     * Determines if {@code type} is a subset of {@code mime_type}.
     * Convenience wrapper around g_content_type_is_a().
     */
    public static boolean contentTypeIsMimeType(java.lang.String type, java.lang.String mimeType) {
        var RESULT = gtk_h.g_content_type_is_mime_type(Interop.allocateNativeString(type).handle(), Interop.allocateNativeString(mimeType).handle());
        return RESULT != 0;
    }
    
    /**
     * Checks if the content type is the generic "unknown" type.
     * On UNIX this is the "application/octet-stream" mimetype,
     * while on win32 it is "*" and on OSX it is a dynamic type
     * or octet-stream.
     */
    public static boolean contentTypeIsUnknown(java.lang.String type) {
        var RESULT = gtk_h.g_content_type_is_unknown(Interop.allocateNativeString(type).handle());
        return RESULT != 0;
    }
    
    /**
     * Set the list of directories used by GIO to load the MIME database.
     * If {@code dirs} is {@code null}, the directories used are the default:
     * <p>
     * <ul>
     * <li>the {@code mime} subdirectory of the directory in {@code $XDG_DATA_HOME}
     * <li>the {@code mime} subdirectory of every directory in {@code $XDG_DATA_DIRS}
     * </ul>
     * <p>
     * This function is intended to be used when writing tests that depend on
     * information stored in the MIME database, in order to control the data.
     * <p>
     * Typically, in case your tests use {@code G_TEST_OPTION_ISOLATE_DIRS}, but they
     * depend on the system’s MIME database, you should call this function
     * with {@code dirs} set to {@code null} before calling g_test_init(), for instance:
     * <p>
     * <pre>{@code <!-- language="C" -->
     *   // Load MIME data from the system
     *   g_content_type_set_mime_dirs (NULL);
     *   // Isolate the environment
     *   g_test_init (&argc, &argv, G_TEST_OPTION_ISOLATE_DIRS, NULL);
     * 
     *   …
     * 
     *   return g_test_run ();
     * }</pre>
     */
    public static void contentTypeSetMimeDirs(java.lang.String[] dirs) {
        gtk_h.g_content_type_set_mime_dirs(Interop.allocateNativeArray(dirs).handle());
    }
    
    /**
     * Gets a list of strings containing all the registered content types
     * known to the system. The list and its data should be freed using
     * {@code g_list_free_full (list, g_free)}.
     */
    public static org.gtk.glib.List contentTypesGetRegistered() {
        var RESULT = gtk_h.g_content_types_get_registered();
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Escape {@code string} so it can appear in a D-Bus address as the value
     * part of a key-value pair.
     * <p>
     * For instance, if {@code string} is {@code /run/bus-for-:0},
     * this function would return {@code /run/bus-for-%3A0},
     * which could be used in a D-Bus address like
     * {@code unix:nonce-tcp:host=127.0.0.1,port=42,noncefile=/run/bus-for-%3A0}.
     */
    public static java.lang.String dbusAddressEscapeValue(java.lang.String string) {
        var RESULT = gtk_h.g_dbus_address_escape_value(Interop.allocateNativeString(string).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Synchronously looks up the D-Bus address for the well-known message
     * bus instance specified by {@code bus_type}. This may involve using various
     * platform specific mechanisms.
     * <p>
     * The returned address will be in the
     * <a href="https://dbus.freedesktop.org/doc/dbus-specification.html#addresses">D-Bus address format</a>.
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
     * Asynchronously connects to an endpoint specified by {@code address} and
     * sets up the connection so it is in a state to run the client-side
     * of the D-Bus authentication conversation. {@code address} must be in the
     * <a href="https://dbus.freedesktop.org/doc/dbus-specification.html#addresses">D-Bus address format</a>.
     * <p>
     * When the operation is finished, {@code callback} will be invoked. You can
     * then call g_dbus_address_get_stream_finish() to get the result of
     * the operation.
     * <p>
     * This is an asynchronous failable function. See
     * g_dbus_address_get_stream_sync() for the synchronous version.
     */
    public static void dbusAddressGetStream(java.lang.String address, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_dbus_address_get_stream(Interop.allocateNativeString(address).handle(), cancellable.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an operation started with g_dbus_address_get_stream().
     * <p>
     * A server is not required to set a GUID, so {@code out_guid} may be set to {@code null}
     * even on success.
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
     * Synchronously connects to an endpoint specified by {@code address} and
     * sets up the connection so it is in a state to run the client-side
     * of the D-Bus authentication conversation. {@code address} must be in the
     * <a href="https://dbus.freedesktop.org/doc/dbus-specification.html#addresses">D-Bus address format</a>.
     * <p>
     * A server is not required to set a GUID, so {@code out_guid} may be set to {@code null}
     * even on success.
     * <p>
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
     * <p>
     * The cost of this function is O(n) in number of annotations.
     */
    public static java.lang.String dbusAnnotationInfoLookup(DBusAnnotationInfo[] annotations, java.lang.String name) {
        var RESULT = gtk_h.g_dbus_annotation_info_lookup(Interop.allocateNativeArray(annotations).handle(), Interop.allocateNativeString(name).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Creates a D-Bus error name to use for {@code error}. If {@code error} matches
     * a registered error (cf. g_dbus_error_register_error()), the corresponding
     * D-Bus error name will be returned.
     * <p>
     * Otherwise the a name of the form
     * {@code org.gtk.GDBus.UnmappedGError.Quark._ESCAPED_QUARK_NAME.Code_ERROR_CODE}
     * will be used. This allows other GDBus applications to map the error
     * on the wire back to a {@link org.gtk.glib.Error} using g_dbus_error_new_for_dbus_error().
     * <p>
     * This function is typically only used in object mappings to put a
     * {@link org.gtk.glib.Error} on the wire. Regular applications should not use it.
     */
    public static java.lang.String dbusErrorEncodeGerror(org.gtk.glib.Error error) {
        var RESULT = gtk_h.g_dbus_error_encode_gerror(error.handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the D-Bus error name used for {@code error}, if any.
     * <p>
     * This function is guaranteed to return a D-Bus error name for all
     * {@code GErrors} returned from functions handling remote method calls
     * (e.g. g_dbus_connection_call_finish()) unless
     * g_dbus_error_strip_remote_error() has been used on {@code error}.
     */
    public static java.lang.String dbusErrorGetRemoteError(org.gtk.glib.Error error) {
        var RESULT = gtk_h.g_dbus_error_get_remote_error(error.handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Checks if {@code error} represents an error received via D-Bus from a remote peer. If so,
     * use g_dbus_error_get_remote_error() to get the name of the error.
     */
    public static boolean dbusErrorIsRemoteError(org.gtk.glib.Error error) {
        var RESULT = gtk_h.g_dbus_error_is_remote_error(error.handle());
        return RESULT != 0;
    }
    
    /**
     * Creates a {@link org.gtk.glib.Error} based on the contents of {@code dbus_error_name} and
     * {@code dbus_error_message}.
     * <p>
     * Errors registered with g_dbus_error_register_error() will be looked
     * up using {@code dbus_error_name} and if a match is found, the error domain
     * and code is used. Applications can use g_dbus_error_get_remote_error()
     * to recover {@code dbus_error_name}.
     * <p>
     * If a match against a registered error is not found and the D-Bus
     * error name is in a form as returned by g_dbus_error_encode_gerror()
     * the error domain and code encoded in the name is used to
     * create the {@link org.gtk.glib.Error}. Also, {@code dbus_error_name} is added to the error message
     * such that it can be recovered with g_dbus_error_get_remote_error().
     * <p>
     * Otherwise, a {@link org.gtk.glib.Error} with the error code {@link IOErrorEnum#DBUS_ERROR}
     * in the {@code G_IO_ERROR} error domain is returned. Also, {@code dbus_error_name} is
     * added to the error message such that it can be recovered with
     * g_dbus_error_get_remote_error().
     * <p>
     * In all three cases, {@code dbus_error_name} can always be recovered from the
     * returned {@link org.gtk.glib.Error} using the g_dbus_error_get_remote_error() function
     * (unless g_dbus_error_strip_remote_error() hasn't been used on the returned error).
     * <p>
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
     * Creates an association to map between {@code dbus_error_name} and
     * {@code GErrors} specified by {@code error_domain} and {@code error_code}.
     * <p>
     * This is typically done in the routine that returns the {@link org.gtk.glib.Quark} for
     * an error domain.
     */
    public static boolean dbusErrorRegisterError(org.gtk.glib.Quark errorDomain, int errorCode, java.lang.String dbusErrorName) {
        var RESULT = gtk_h.g_dbus_error_register_error(errorDomain.getValue(), errorCode, Interop.allocateNativeString(dbusErrorName).handle());
        return RESULT != 0;
    }
    
    /**
     * Helper function for associating a {@link org.gtk.glib.Error} error domain with D-Bus error names.
     * <p>
     * While {@code quark_volatile} has a {@code volatile} qualifier, this is a historical
     * artifact and the argument passed to it should not be {@code volatile}.
     */
    public static void dbusErrorRegisterErrorDomain(java.lang.String errorDomainQuarkName, PointerLong quarkVolatile, DBusErrorEntry[] entries, int numEntries) {
        gtk_h.g_dbus_error_register_error_domain(Interop.allocateNativeString(errorDomainQuarkName).handle(), quarkVolatile.handle(), Interop.allocateNativeArray(entries).handle(), numEntries);
    }
    
    /**
     * Looks for extra information in the error message used to recover
     * the D-Bus error name and strips it if found. If stripped, the
     * message field in {@code error} will correspond exactly to what was
     * received on the wire.
     * <p>
     * This is typically used when presenting errors to the end user.
     */
    public static boolean dbusErrorStripRemoteError(org.gtk.glib.Error error) {
        var RESULT = gtk_h.g_dbus_error_strip_remote_error(error.handle());
        return RESULT != 0;
    }
    
    /**
     * Destroys an association previously set up with g_dbus_error_register_error().
     */
    public static boolean dbusErrorUnregisterError(org.gtk.glib.Quark errorDomain, int errorCode, java.lang.String dbusErrorName) {
        var RESULT = gtk_h.g_dbus_error_unregister_error(errorDomain.getValue(), errorCode, Interop.allocateNativeString(dbusErrorName).handle());
        return RESULT != 0;
    }
    
    /**
     * This is a language binding friendly version of g_dbus_escape_object_path_bytestring().
     */
    public static java.lang.String dbusEscapeObjectPath(java.lang.String s) {
        var RESULT = gtk_h.g_dbus_escape_object_path(Interop.allocateNativeString(s).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Escapes {@code bytes} for use in a D-Bus object path component.
     * {@code bytes} is an array of zero or more nonzero bytes in an
     * unspecified encoding, followed by a single zero byte.
     * <p>
     * The escaping method consists of replacing all non-alphanumeric
     * characters (see g_ascii_isalnum()) with their hexadecimal value
     * preceded by an underscore ({@code _}). For example:
     * {@code foo.bar.baz} will become {@code foo_2ebar_2ebaz}.
     * <p>
     * This method is appropriate to use when the input is nearly
     * a valid object path component but is not when your input
     * is far from being a valid object path component.
     * Other escaping algorithms are also valid to use with
     * D-Bus object paths.
     * <p>
     * This can be reversed with g_dbus_unescape_object_path().
     */
    public static java.lang.String dbusEscapeObjectPathBytestring(byte[] bytes) {
        var RESULT = gtk_h.g_dbus_escape_object_path_bytestring(Interop.allocateNativeArray(bytes).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Generate a D-Bus GUID that can be used with
     * e.g. g_dbus_connection_new().
     * <p>
     * See the
     * <a href="https://dbus.freedesktop.org/doc/dbus-specification.html#uuids">D-Bus specification</a>
     * regarding what strings are valid D-Bus GUIDs. The specification refers to
     * these as ‘UUIDs’ whereas GLib (for historical reasons) refers to them as
     * ‘GUIDs’. The terms are interchangeable.
     * <p>
     * Note that D-Bus GUIDs do not follow
     * <a href="https://datatracker.ietf.org/doc/html/rfc4122">RFC 4122</a>.
     */
    public static java.lang.String dbusGenerateGuid() {
        var RESULT = gtk_h.g_dbus_generate_guid();
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Converts a {@link org.gtk.gobject.Value} to a {@link org.gtk.glib.Variant} of the type indicated by the {@code type}
     * parameter.
     * <p>
     * The conversion is using the following rules:
     * <p>
     * <ul>
     * <li>{@code G_TYPE_STRING}: 's', 'o', 'g' or 'ay'
     * <li>{@code G_TYPE_STRV}: 'as', 'ao' or 'aay'
     * <li>{@code G_TYPE_BOOLEAN}: 'b'
     * <li>{@code G_TYPE_UCHAR}: 'y'
     * <li>{@code G_TYPE_INT}: 'i', 'n'
     * <li>{@code G_TYPE_UINT}: 'u', 'q'
     * <li>{@code G_TYPE_INT64}: 'x'
     * <li>{@code G_TYPE_UINT64}: 't'
     * <li>{@code G_TYPE_DOUBLE}: 'd'
     * <li>{@code G_TYPE_VARIANT}: Any {@link org.gtk.glib.VariantType}
     * </ul>
     * <p>
     * This can fail if e.g. {@code gvalue} is of type {@code G_TYPE_STRING} and {@code type}
     * is 'i', i.e. {@code G_VARIANT_TYPE_INT32}. It will also fail for any {@link org.gtk.glib.Type}
     * (including e.g. {@code G_TYPE_OBJECT} and {@code G_TYPE_BOXED} derived-types) not
     * in the table above.
     * <p>
     * Note that if {@code gvalue} is of type {@code G_TYPE_VARIANT} and its value is
     * {@code null}, the empty {@link org.gtk.glib.Variant} instance (never {@code null}) for {@code type} is
     * returned (e.g. 0 for scalar types, the empty string for string types,
     * '/' for object path types, the empty array for any array type and so on).
     * <p>
     * See the g_dbus_gvariant_to_gvalue() function for how to convert a
     * {@link org.gtk.glib.Variant} to a {@link org.gtk.gobject.Value}.
     */
    public static org.gtk.glib.Variant dbusGvalueToGvariant(org.gtk.gobject.Value gvalue, org.gtk.glib.VariantType type) {
        var RESULT = gtk_h.g_dbus_gvalue_to_gvariant(gvalue.handle(), type.handle());
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Converts a {@link org.gtk.glib.Variant} to a {@link org.gtk.gobject.Value}. If {@code value} is floating, it is consumed.
     * <p>
     * The rules specified in the g_dbus_gvalue_to_gvariant() function are
     * used - this function is essentially its reverse form. So, a {@link org.gtk.glib.Variant}
     * containing any basic or string array type will be converted to a {@link org.gtk.gobject.Value}
     * containing a basic value or string array. Any other {@link org.gtk.glib.Variant} (handle,
     * variant, tuple, dict entry) will be converted to a {@link org.gtk.gobject.Value} containing that
     * {@link org.gtk.glib.Variant}.
     * <p>
     * The conversion never fails - a valid {@link org.gtk.gobject.Value} is always returned in
     * {@code out_gvalue}.
     */
    public static void dbusGvariantToGvalue(org.gtk.glib.Variant value, org.gtk.gobject.Value outGvalue) {
        gtk_h.g_dbus_gvariant_to_gvalue(value.handle(), outGvalue.handle());
    }
    
    /**
     * Checks if {@code string} is a
     * <a href="https://dbus.freedesktop.org/doc/dbus-specification.html#addresses">D-Bus address</a>.
     * <p>
     * This doesn't check if {@code string} is actually supported by {@link DBusServer}
     * or {@link DBusConnection} - use g_dbus_is_supported_address() to do more
     * checks.
     */
    public static boolean dbusIsAddress(java.lang.String string) {
        var RESULT = gtk_h.g_dbus_is_address(Interop.allocateNativeString(string).handle());
        return RESULT != 0;
    }
    
    /**
     * Check whether {@code string} is a valid D-Bus error name.
     * <p>
     * This function returns the same result as g_dbus_is_interface_name(),
     * because D-Bus error names are defined to have exactly the
     * same syntax as interface names.
     */
    public static boolean dbusIsErrorName(java.lang.String string) {
        var RESULT = gtk_h.g_dbus_is_error_name(Interop.allocateNativeString(string).handle());
        return RESULT != 0;
    }
    
    /**
     * Checks if {@code string} is a D-Bus GUID.
     * <p>
     * See the documentation for g_dbus_generate_guid() for more information about
     * the format of a GUID.
     */
    public static boolean dbusIsGuid(java.lang.String string) {
        var RESULT = gtk_h.g_dbus_is_guid(Interop.allocateNativeString(string).handle());
        return RESULT != 0;
    }
    
    /**
     * Checks if {@code string} is a valid D-Bus interface name.
     */
    public static boolean dbusIsInterfaceName(java.lang.String string) {
        var RESULT = gtk_h.g_dbus_is_interface_name(Interop.allocateNativeString(string).handle());
        return RESULT != 0;
    }
    
    /**
     * Checks if {@code string} is a valid D-Bus member (e.g. signal or method) name.
     */
    public static boolean dbusIsMemberName(java.lang.String string) {
        var RESULT = gtk_h.g_dbus_is_member_name(Interop.allocateNativeString(string).handle());
        return RESULT != 0;
    }
    
    /**
     * Checks if {@code string} is a valid D-Bus bus name (either unique or well-known).
     */
    public static boolean dbusIsName(java.lang.String string) {
        var RESULT = gtk_h.g_dbus_is_name(Interop.allocateNativeString(string).handle());
        return RESULT != 0;
    }
    
    /**
     * Like g_dbus_is_address() but also checks if the library supports the
     * transports in {@code string} and that key/value pairs for each transport
     * are valid. See the specification of the
     * <a href="https://dbus.freedesktop.org/doc/dbus-specification.html#addresses">D-Bus address format</a>.
     */
    public static boolean dbusIsSupportedAddress(java.lang.String string) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dbus_is_supported_address(Interop.allocateNativeString(string).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks if {@code string} is a valid D-Bus unique bus name.
     */
    public static boolean dbusIsUniqueName(java.lang.String string) {
        var RESULT = gtk_h.g_dbus_is_unique_name(Interop.allocateNativeString(string).handle());
        return RESULT != 0;
    }
    
    /**
     * Unescapes an string that was previously escaped with
     * g_dbus_escape_object_path(). If the string is in a format that could
     * not have been returned by g_dbus_escape_object_path(), this function
     * returns {@code null}.
     * <p>
     * Encoding alphanumeric characters which do not need to be
     * encoded is not allowed (e.g {@code _63} is not valid, the string
     * should contain {@code c} instead).
     */
    public static PointerIterator<Byte> dbusUnescapeObjectPath(java.lang.String s) {
        var RESULT = gtk_h.g_dbus_unescape_object_path(Interop.allocateNativeString(s).handle());
        return new PointerByte(RESULT).iterator();
    }
    
    /**
     * Creates a new {@link DtlsClientConnection} wrapping {@code base_socket} which is
     * assumed to communicate with the server identified by {@code server_identity}.
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
     * Creates a new {@link DtlsServerConnection} wrapping {@code base_socket}.
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
     * Creates a {@link File} with the given argument from the command line.
     * The value of {@code arg} can be either a URI, an absolute path or a
     * relative path resolved relative to the current working directory.
     * This operation never fails, but the returned object might not
     * support any I/O operation if {@code arg} points to a malformed path.
     * <p>
     * Note that on Windows, this function expects its argument to be in
     * UTF-8 -- not the system code page.  This means that you
     * should not use this function with string from argv as it is passed
     * to main().  g_win32_get_command_line() will return a UTF-8 version of
     * the commandline.  {@link Application} also uses UTF-8 but
     * g_application_command_line_create_file_for_arg() may be more useful
     * for you there.  It is also always possible to use this function with
     * {@link org.gtk.glib.OptionContext} arguments of type {@link org.gtk.glib.OptionArg#FILENAME}.
     */
    public static File fileNewForCommandlineArg(java.lang.String arg) {
        var RESULT = gtk_h.g_file_new_for_commandline_arg(Interop.allocateNativeString(arg).handle());
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Creates a {@link File} with the given argument from the command line.
     * <p>
     * This function is similar to g_file_new_for_commandline_arg() except
     * that it allows for passing the current working directory as an
     * argument instead of using the current working directory of the
     * process.
     * <p>
     * This is useful if the commandline argument was given in a context
     * other than the invocation of the current process.
     * <p>
     * See also g_application_command_line_create_file_for_arg().
     */
    public static File fileNewForCommandlineArgAndCwd(java.lang.String arg, java.lang.String cwd) {
        var RESULT = gtk_h.g_file_new_for_commandline_arg_and_cwd(Interop.allocateNativeString(arg).handle(), Interop.allocateNativeString(cwd).handle());
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Constructs a {@link File} for a given path. This operation never
     * fails, but the returned object might not support any I/O
     * operation if {@code path} is malformed.
     */
    public static File fileNewForPath(java.lang.String path) {
        var RESULT = gtk_h.g_file_new_for_path(Interop.allocateNativeString(path).handle());
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Constructs a {@link File} for a given URI. This operation never
     * fails, but the returned object might not support any I/O
     * operation if {@code uri} is malformed or if the uri type is
     * not supported.
     */
    public static File fileNewForUri(java.lang.String uri) {
        var RESULT = gtk_h.g_file_new_for_uri(Interop.allocateNativeString(uri).handle());
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Opens a file in the preferred directory for temporary files (as
     * returned by g_get_tmp_dir()) and returns a {@link File} and
     * {@link FileIOStream} pointing to it.
     * <p>
     * {@code tmpl} should be a string in the GLib file name encoding
     * containing a sequence of six 'X' characters, and containing no
     * directory components. If it is {@code null}, a default template is used.
     * <p>
     * Unlike the other {@link File} constructors, this will return {@code null} if
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
     * Constructs a {@link File} with the given {@code parse_name} (i.e. something
     * given by g_file_get_parse_name()). This operation never fails,
     * but the returned object might not support any I/O operation if
     * the {@code parse_name} cannot be parsed.
     */
    public static File fileParseName(java.lang.String parseName) {
        var RESULT = gtk_h.g_file_parse_name(Interop.allocateNativeString(parseName).handle());
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Deserializes a {@link Icon} previously serialized using g_icon_serialize().
     */
    public static Icon iconDeserialize(org.gtk.glib.Variant value) {
        var RESULT = gtk_h.g_icon_deserialize(value.handle());
        return new Icon.IconImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets a hash for an icon.
     */
    public static int iconHash(java.lang.foreign.MemoryAddress icon) {
        var RESULT = gtk_h.g_icon_hash(icon);
        return RESULT;
    }
    
    /**
     * Generate a {@link Icon} instance from {@code str}. This function can fail if
     * {@code str} is not valid - see g_icon_to_string() for discussion.
     * <p>
     * If your application or library provides one or more {@link Icon}
     * implementations you need to ensure that each {@link org.gtk.glib.Type} is registered
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
     * value {@link IOErrorEnum#FAILED} is returned for error codes not currently
     * handled (but note that future GLib releases may return a more
     * specific value instead).
     * <p>
     * As {@code errno} is global and may be modified by intermediate function
     * calls, you should save its value as soon as the call which sets it
     */
    public static IOErrorEnum ioErrorFromErrno(int errNo) {
        var RESULT = gtk_h.g_io_error_from_errno(errNo);
        return new IOErrorEnum(RESULT);
    }
    
    /**
     * Gets the GIO Error Quark.
     */
    public static org.gtk.glib.Quark ioErrorQuark() {
        var RESULT = gtk_h.g_io_error_quark();
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Registers {@code type} as extension for the extension point with name
     * {@code extension_point_name}.
     * <p>
     * If {@code type} has already been registered as an extension for this
     * extension point, the existing {@link IOExtension} object is returned.
     */
    public static IOExtension ioExtensionPointImplement(java.lang.String extensionPointName, org.gtk.gobject.Type type, java.lang.String extensionName, int priority) {
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
     * <p>
     * If don't require all modules to be initialized (and thus registering
     * all gtypes) then you can use g_io_modules_scan_all_in_directory()
     * which allows delayed/lazy loading of modules.
     */
    public static org.gtk.glib.List ioModulesLoadAllInDirectory(java.lang.String dirname) {
        var RESULT = gtk_h.g_io_modules_load_all_in_directory(Interop.allocateNativeString(dirname).handle());
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Loads all the modules in the specified directory.
     * <p>
     * If don't require all modules to be initialized (and thus registering
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
     * <p>
     * This may not actually load and initialize all the types in each
     * module, some modules may be lazily loaded and initialized when
     * an extension point it implements is used with e.g.
     * g_io_extension_point_get_extensions() or
     * g_io_extension_point_get_extension_by_name().
     * <p>
     * If you need to guarantee that all types are loaded in all the modules,
     * use g_io_modules_load_all_in_directory().
     */
    public static void ioModulesScanAllInDirectory(java.lang.String dirname) {
        gtk_h.g_io_modules_scan_all_in_directory(Interop.allocateNativeString(dirname).handle());
    }
    
    /**
     * Scans all the modules in the specified directory, ensuring that
     * any extension point implemented by a module is registered.
     * <p>
     * This may not actually load and initialize all the types in each
     * module, some modules may be lazily loaded and initialized when
     * an extension point it implements is used with e.g.
     * g_io_extension_point_get_extensions() or
     * g_io_extension_point_get_extension_by_name().
     * <p>
     * If you need to guarantee that all types are loaded in all the modules,
     * use g_io_modules_load_all_in_directory().
     */
    public static void ioModulesScanAllInDirectoryWithScope(java.lang.String dirname, IOModuleScope scope) {
        gtk_h.g_io_modules_scan_all_in_directory_with_scope(Interop.allocateNativeString(dirname).handle(), scope.handle());
    }
    
    /**
     * Creates a keyfile-backed {@link SettingsBackend}.
     * <p>
     * The filename of the keyfile to use is given by {@code filename}.
     * <p>
     * All settings read to or written from the backend must fall under the
     * path given in {@code root_path} (which must start and end with a slash and
     * not contain two consecutive slashes).  {@code root_path} may be "/".
     * <p>
     * If {@code root_group} is non-{@code null} then it specifies the name of the keyfile
     * group used for keys that are written directly below {@code root_path}.  For
     * example, if {@code root_path} is "/apps/example/" and {@code root_group} is
     * "toplevel", then settings the key "/apps/example/enabled" to a value
     * of {@code true} will cause the following to appear in the keyfile:
     * <p>
     * <pre>{@code 
     *   [toplevel]
     *   enabled=true
     * }</pre>
     * <p>
     * If {@code root_group} is {@code null} then it is not permitted to store keys
     * directly below the {@code root_path}.
     * <p>
     * For keys not stored directly below {@code root_path} (ie: in a sub-path),
     * the name of the subpath (with the final slash stripped) is used as
     * the name of the keyfile group.  To continue the example, if
     * "/apps/example/profiles/default/font-size" were set to
     * 12 then the following would appear in the keyfile:
     * <p>
     * <pre>{@code 
     *   [profiles/default]
     *   font-size=12
     * }</pre>
     * <p>
     * The backend will refuse writes (and return writability as being
     * {@code false}) for keys outside of {@code root_path} and, in the event that
     * {@code root_group} is {@code null}, also for keys directly under {@code root_path}.
     * Writes will also be refused if the backend detects that it has the
     * inability to rewrite the keyfile (ie: the containing directory is not
     * writable).
     * <p>
     * There is no checking done for your key namespace clashing with the
     * syntax of the key file format.  For example, if you have '[' or ']'
     * characters in your path names or '=' in your key names you may be in
     * trouble.
     * <p>
     * The backend reads default values from a keyfile called {@code defaults} in
     * the directory specified by the {@code GKeyfileSettingsBackend}:defaults-dir property,
     * and a list of locked keys from a text file with the name {@code locks} in
     * the same location.
     */
    public static SettingsBackend keyfileSettingsBackendNew(java.lang.String filename, java.lang.String rootPath, java.lang.String rootGroup) {
        var RESULT = gtk_h.g_keyfile_settings_backend_new(Interop.allocateNativeString(filename).handle(), Interop.allocateNativeString(rootPath).handle(), Interop.allocateNativeString(rootGroup).handle());
        return new SettingsBackend(References.get(RESULT, true));
    }
    
    /**
     * Gets a reference to the default {@link MemoryMonitor} for the system.
     */
    public static MemoryMonitor memoryMonitorDupDefault() {
        var RESULT = gtk_h.g_memory_monitor_dup_default();
        return new MemoryMonitor.MemoryMonitorImpl(References.get(RESULT, true));
    }
    
    /**
     * Creates a memory-backed {@link SettingsBackend}.
     * <p>
     * This backend allows changes to settings, but does not write them
     * to any backing storage, so the next time you run your application,
     * the memory backend will start out with the default values again.
     */
    public static SettingsBackend memorySettingsBackendNew() {
        var RESULT = gtk_h.g_memory_settings_backend_new();
        return new SettingsBackend(References.get(RESULT, true));
    }
    
    /**
     * Gets the default {@link NetworkMonitor} for the system.
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
     * Creates a readonly {@link SettingsBackend}.
     * <p>
     * This backend does not allow changes to settings, so all settings
     * will always have their default values.
     */
    public static SettingsBackend nullSettingsBackendNew() {
        var RESULT = gtk_h.g_null_settings_backend_new();
        return new SettingsBackend(References.get(RESULT, true));
    }
    
    /**
     * Utility method for {@link PollableInputStream} and {@link PollableOutputStream}
     * implementations. Creates a new {@link org.gtk.glib.Source} that expects a callback of
     * type {@link PollableSourceFunc}. The new source does not actually do
     * anything on its own; use g_source_add_child_source() to add other
     * sources to it to cause it to trigger.
     */
    public static org.gtk.glib.Source pollableSourceNew(org.gtk.gobject.Object pollableStream) {
        var RESULT = gtk_h.g_pollable_source_new(pollableStream.handle());
        return new org.gtk.glib.Source(References.get(RESULT, true));
    }
    
    /**
     * Utility method for {@link PollableInputStream} and {@link PollableOutputStream}
     * implementations. Creates a new {@link org.gtk.glib.Source}, as with
     * g_pollable_source_new(), but also attaching {@code child_source} (with a
     * dummy callback), and {@code cancellable}, if they are non-{@code null}.
     */
    public static org.gtk.glib.Source pollableSourceNewFull(org.gtk.gobject.Object pollableStream, org.gtk.glib.Source childSource, Cancellable cancellable) {
        var RESULT = gtk_h.g_pollable_source_new_full(pollableStream.handle(), childSource.handle(), cancellable.handle());
        return new org.gtk.glib.Source(References.get(RESULT, true));
    }
    
    /**
     * Tries to read from {@code stream}, as with g_input_stream_read() (if
     * {@code blocking} is {@code true}) or g_pollable_input_stream_read_nonblocking()
     * (if {@code blocking} is {@code false}). This can be used to more easily share
     * code between blocking and non-blocking implementations of a method.
     * <p>
     * If {@code blocking} is {@code false}, then {@code stream} must be a
     * {@link PollableInputStream} for which g_pollable_input_stream_can_poll()
     * returns {@code true}, or else the behavior is undefined. If {@code blocking} is
     * {@code true}, then {@code stream} does not need to be a {@link PollableInputStream}.
     */
    public static long pollableStreamRead(InputStream stream, byte[] buffer, long count, boolean blocking, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_pollable_stream_read(stream.handle(), Interop.allocateNativeArray(buffer).handle(), count, blocking ? 1 : 0, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Tries to write to {@code stream}, as with g_output_stream_write() (if
     * {@code blocking} is {@code true}) or g_pollable_output_stream_write_nonblocking()
     * (if {@code blocking} is {@code false}). This can be used to more easily share
     * code between blocking and non-blocking implementations of a method.
     * <p>
     * If {@code blocking} is {@code false}, then {@code stream} must be a
     * {@link PollableOutputStream} for which
     * g_pollable_output_stream_can_poll() returns {@code true} or else the
     * behavior is undefined. If {@code blocking} is {@code true}, then {@code stream} does not
     * need to be a {@link PollableOutputStream}.
     */
    public static long pollableStreamWrite(OutputStream stream, byte[] buffer, long count, boolean blocking, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_pollable_stream_write(stream.handle(), Interop.allocateNativeArray(buffer).handle(), count, blocking ? 1 : 0, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Tries to write {@code count} bytes to {@code stream}, as with
     * g_output_stream_write_all(), but using g_pollable_stream_write()
     * rather than g_output_stream_write().
     * <p>
     * On a successful write of {@code count} bytes, {@code true} is returned, and
     * {@code bytes_written} is set to {@code count}.
     * <p>
     * If there is an error during the operation (including
     * {@link IOErrorEnum#WOULD_BLOCK} in the non-blocking case), {@code false} is
     * returned and {@code error} is set to indicate the error status,
     * {@code bytes_written} is updated to contain the number of bytes written
     * into the stream before the error occurred.
     * <p>
     * As with g_pollable_stream_write(), if {@code blocking} is {@code false}, then
     * {@code stream} must be a {@link PollableOutputStream} for which
     * g_pollable_output_stream_can_poll() returns {@code true} or else the
     * behavior is undefined. If {@code blocking} is {@code true}, then {@code stream} does not
     * need to be a {@link PollableOutputStream}.
     */
    public static boolean pollableStreamWriteAll(OutputStream stream, byte[] buffer, long count, boolean blocking, PointerLong bytesWritten, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_pollable_stream_write_all(stream.handle(), Interop.allocateNativeArray(buffer).handle(), count, blocking ? 1 : 0, bytesWritten.handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets a reference to the default {@link PowerProfileMonitor} for the system.
     */
    public static PowerProfileMonitor powerProfileMonitorDupDefault() {
        var RESULT = gtk_h.g_power_profile_monitor_dup_default();
        return new PowerProfileMonitor.PowerProfileMonitorImpl(References.get(RESULT, true));
    }
    
    /**
     * Find the {@code gio-proxy} extension point for a proxy implementation that supports
     * the specified protocol.
     */
    public static Proxy proxyGetDefaultForProtocol(java.lang.String protocol) {
        var RESULT = gtk_h.g_proxy_get_default_for_protocol(Interop.allocateNativeString(protocol).handle());
        return new Proxy.ProxyImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets the default {@link ProxyResolver} for the system.
     */
    public static ProxyResolver proxyResolverGetDefault() {
        var RESULT = gtk_h.g_proxy_resolver_get_default();
        return new ProxyResolver.ProxyResolverImpl(References.get(RESULT, false));
    }
    
    /**
     * Gets the {@link Resolver} Error Quark.
     */
    public static org.gtk.glib.Quark resolverErrorQuark() {
        var RESULT = gtk_h.g_resolver_error_quark();
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Gets the {@link Resource} Error Quark.
     */
    public static org.gtk.glib.Quark resourceErrorQuark() {
        var RESULT = gtk_h.g_resource_error_quark();
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Loads a binary resource bundle and creates a {@link Resource} representation of it, allowing
     * you to query it for data.
     * <p>
     * If you want to use this resource in the global resource namespace you need
     * to register it with g_resources_register().
     * <p>
     * If {@code filename} is empty or the data in it is corrupt,
     * {@link ResourceError#INTERNAL} will be returned. If {@code filename} doesn’t exist, or
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
     * Returns all the names of children at the specified {@code path} in the set of
     * globally registered resources.
     * The return result is a {@code null} terminated list of strings which should
     * be released with g_strfreev().
     * <p>
     * {@code lookup_flags} controls the behaviour of the lookup.
     */
    public static PointerIterator<java.lang.String> resourcesEnumerateChildren(java.lang.String path, ResourceLookupFlags lookupFlags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_resources_enumerate_children(Interop.allocateNativeString(path).handle(), lookupFlags.getValue(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new PointerString(RESULT).iterator();
    }
    
    /**
     * Looks for a file at the specified {@code path} in the set of
     * globally registered resources and if found returns information about it.
     * <p>
     * {@code lookup_flags} controls the behaviour of the lookup.
     */
    public static boolean resourcesGetInfo(java.lang.String path, ResourceLookupFlags lookupFlags, PointerLong size, PointerInteger flags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_resources_get_info(Interop.allocateNativeString(path).handle(), lookupFlags.getValue(), size.handle(), flags.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Looks for a file at the specified {@code path} in the set of
     * globally registered resources and returns a {@link org.gtk.glib.Bytes} that
     * lets you directly access the data in memory.
     * <p>
     * The data is always followed by a zero byte, so you
     * can safely use the data as a C string. However, that byte
     * is not included in the size of the GBytes.
     * <p>
     * For uncompressed resource files this is a pointer directly into
     * the resource bundle, which is typically in some readonly data section
     * in the program binary. For compressed files we allocate memory on
     * the heap and automatically uncompress the data.
     * <p>
     * {@code lookup_flags} controls the behaviour of the lookup.
     */
    public static org.gtk.glib.Bytes resourcesLookupData(java.lang.String path, ResourceLookupFlags lookupFlags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_resources_lookup_data(Interop.allocateNativeString(path).handle(), lookupFlags.getValue(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.Bytes(References.get(RESULT, true));
    }
    
    /**
     * Looks for a file at the specified {@code path} in the set of
     * globally registered resources and returns a {@link InputStream}
     * that lets you read the data.
     * <p>
     * {@code lookup_flags} controls the behaviour of the lookup.
     */
    public static InputStream resourcesOpenStream(java.lang.String path, ResourceLookupFlags lookupFlags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_resources_open_stream(Interop.allocateNativeString(path).handle(), lookupFlags.getValue(), GERROR);
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
     * This function is not required for normal uses of {@link Settings} but it
     * may be useful to authors of plugin management systems or to those who
     * want to introspect the content of schemas.
     * <p>
     * If no schemas are installed, {@code null} will be returned.
     * <p>
     * The returned source may actually consist of multiple schema sources
     * from different directories, depending on which directories were given
     * in {@code XDG_DATA_DIRS} and {@code GSETTINGS_SCHEMA_DIR}. For this reason, all
     * lookups performed against the default source should probably be done
     * recursively.
     */
    public static SettingsSchemaSource settingsSchemaSourceGetDefault() {
        var RESULT = gtk_h.g_settings_schema_source_get_default();
        return new SettingsSchemaSource(References.get(RESULT, false));
    }
    
    /**
     * Sorts {@code targets} in place according to the algorithm in RFC 2782.
     */
    public static org.gtk.glib.List srvTargetListSort(org.gtk.glib.List targets) {
        var RESULT = gtk_h.g_srv_target_list_sort(targets.handle());
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Gets the default {@link TlsBackend} for the system.
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
     * Creates a new {@link TlsClientConnection} wrapping {@code base_io_stream} (which
     * must have pollable input and output streams) which is assumed to
     * communicate with the server identified by {@code server_identity}.
     * <p>
     * See the documentation for {@link TlsConnection}:base-io-stream for restrictions
     * on when application code can run operations on the {@code base_io_stream} after
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
     * Creates a new {@link TlsFileDatabase} which uses anchor certificate authorities
     * in {@code anchors} to verify certificate chains.
     * <p>
     * The certificates in {@code anchors} must be PEM encoded.
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
     * Creates a new {@link TlsServerConnection} wrapping {@code base_io_stream} (which
     * must have pollable input and output streams).
     * <p>
     * See the documentation for {@link TlsConnection}:base-io-stream for restrictions
     * on when application code can run operations on the {@code base_io_stream} after
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
     * Determines if {@code mount_path} is considered an implementation of the
     * OS. This is primarily used for hiding mountable and mounted volumes
     * that only are used in the OS and has little to no relevance to the
     * casual user.
     */
    public static boolean unixIsMountPathSystemInternal(java.lang.String mountPath) {
        var RESULT = gtk_h.g_unix_is_mount_path_system_internal(Interop.allocateNativeString(mountPath).handle());
        return RESULT != 0;
    }
    
    /**
     * Determines if {@code device_path} is considered a block device path which is only
     * used in implementation of the OS. This is primarily used for hiding
     * mounted volumes that are intended as APIs for programs to read, and system
     * administrators at a shell; rather than something that should, for example,
     * appear in a GUI. For example, the Linux {@code /proc} filesystem.
     * <p>
     * The list of device paths considered ‘system’ ones may change over time.
     */
    public static boolean unixIsSystemDevicePath(java.lang.String devicePath) {
        var RESULT = gtk_h.g_unix_is_system_device_path(Interop.allocateNativeString(devicePath).handle());
        return RESULT != 0;
    }
    
    /**
     * Determines if {@code fs_type} is considered a type of file system which is only
     * used in implementation of the OS. This is primarily used for hiding
     * mounted volumes that are intended as APIs for programs to read, and system
     * administrators at a shell; rather than something that should, for example,
     * appear in a GUI. For example, the Linux {@code /proc} filesystem.
     * <p>
     * The list of file system types considered ‘system’ ones may change over time.
     */
    public static boolean unixIsSystemFsType(java.lang.String fsType) {
        var RESULT = gtk_h.g_unix_is_system_fs_type(Interop.allocateNativeString(fsType).handle());
        return RESULT != 0;
    }
    
    /**
     * Gets a {@link UnixMountEntry} for a given mount path. If {@code time_read}
     * is set, it will be filled with a unix timestamp for checking
     * if the mounts have changed since with g_unix_mounts_changed_since().
     * <p>
     * If more mounts have the same mount path, the last matching mount
     * is returned.
     * <p>
     * This will return {@code null} if there is no mount point at {@code mount_path}.
     */
    public static UnixMountEntry unixMountAt(java.lang.String mountPath, PointerLong timeRead) {
        var RESULT = gtk_h.g_unix_mount_at(Interop.allocateNativeString(mountPath).handle(), timeRead.handle());
        return new UnixMountEntry(References.get(RESULT, true));
    }
    
    /**
     * Compares two unix mounts.
     */
    public static int unixMountCompare(UnixMountEntry mount1, UnixMountEntry mount2) {
        var RESULT = gtk_h.g_unix_mount_compare(mount1.handle(), mount2.handle());
        return RESULT;
    }
    
    /**
     * Makes a copy of {@code mount_entry}.
     */
    public static UnixMountEntry unixMountCopy(UnixMountEntry mountEntry) {
        var RESULT = gtk_h.g_unix_mount_copy(mountEntry.handle());
        return new UnixMountEntry(References.get(RESULT, true));
    }
    
    /**
     * Gets a {@link UnixMountEntry} for a given file path. If {@code time_read}
     * is set, it will be filled with a unix timestamp for checking
     * if the mounts have changed since with g_unix_mounts_changed_since().
     * <p>
     * If more mounts have the same mount path, the last matching mount
     * is returned.
     * <p>
     * This will return {@code null} if looking up the mount entry fails, if
     * {@code file_path} doesn’t exist or there is an I/O error.
     */
    public static UnixMountEntry unixMountFor(java.lang.String filePath, PointerLong timeRead) {
        var RESULT = gtk_h.g_unix_mount_for(Interop.allocateNativeString(filePath).handle(), timeRead.handle());
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
     * Gets a comma-separated list of mount options for the unix mount. For example,
     * {@code rw,relatime,seclabel,data=ordered}.
     * <p>
     * This is similar to g_unix_mount_point_get_options(), but it takes
     * a {@link UnixMountEntry} as an argument.
     */
    public static java.lang.String unixMountGetOptions(UnixMountEntry mountEntry) {
        var RESULT = gtk_h.g_unix_mount_get_options(mountEntry.handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the root of the mount within the filesystem. This is useful e.g. for
     * mounts created by bind operation, or btrfs subvolumes.
     * <p>
     * For example, the root path is equal to "/" for mount created by
     * "mount /dev/sda1 /mnt/foo" and "/bar" for
     * "mount --bind /mnt/foo/bar /mnt/bar".
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
        return RESULT != 0;
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
        return RESULT != 0;
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
        return RESULT != 0;
    }
    
    /**
     * Checks if a Unix mount is a system mount. This is the Boolean OR of
     * g_unix_is_system_fs_type(), g_unix_is_system_device_path() and
     * g_unix_is_mount_path_system_internal() on {@code mount_entry}’s properties.
     * <p>
     * The definition of what a ‘system’ mount entry is may change over time as new
     * file system types and device paths are ignored.
     */
    public static boolean unixMountIsSystemInternal(UnixMountEntry mountEntry) {
        var RESULT = gtk_h.g_unix_mount_is_system_internal(mountEntry.handle());
        return RESULT != 0;
    }
    
    /**
     * Gets a {@link UnixMountPoint} for a given mount path. If {@code time_read} is set, it
     * will be filled with a unix timestamp for checking if the mount points have
     * changed since with g_unix_mount_points_changed_since().
     * <p>
     * If more mount points have the same mount path, the last matching mount point
     * is returned.
     */
    public static UnixMountPoint unixMountPointAt(java.lang.String mountPath, PointerLong timeRead) {
        var RESULT = gtk_h.g_unix_mount_point_at(Interop.allocateNativeString(mountPath).handle(), timeRead.handle());
        return new UnixMountPoint(References.get(RESULT, true));
    }
    
    /**
     * Checks if the unix mount points have changed since a given unix time.
     */
    public static boolean unixMountPointsChangedSince(long time) {
        var RESULT = gtk_h.g_unix_mount_points_changed_since(time);
        return RESULT != 0;
    }
    
    /**
     * Gets a {@link org.gtk.glib.List} of {@link UnixMountPoint} containing the unix mount points.
     * If {@code time_read} is set, it will be filled with the mount timestamp,
     * allowing for checking if the mounts have changed with
     * g_unix_mount_points_changed_since().
     */
    public static org.gtk.glib.List unixMountPointsGet(PointerLong timeRead) {
        var RESULT = gtk_h.g_unix_mount_points_get(timeRead.handle());
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Checks if the unix mounts have changed since a given unix time.
     */
    public static boolean unixMountsChangedSince(long time) {
        var RESULT = gtk_h.g_unix_mounts_changed_since(time);
        return RESULT != 0;
    }
    
    /**
     * Gets a {@link org.gtk.glib.List} of {@link UnixMountEntry} containing the unix mounts.
     * If {@code time_read} is set, it will be filled with the mount
     * timestamp, allowing for checking if the mounts have changed
     * with g_unix_mounts_changed_since().
     */
    public static org.gtk.glib.List unixMountsGet(PointerLong timeRead) {
        var RESULT = gtk_h.g_unix_mounts_get(timeRead.handle());
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    public static void __cbBusNameVanishedCallback(MemoryAddress connection, MemoryAddress name, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (BusNameVanishedCallback) Interop.signalRegistry.get(hash);
        handler.onBusNameVanishedCallback(new DBusConnection(References.get(connection, false)), name.getUtf8String(0));
    }
    
    public static void __cbBusNameAppearedCallback(MemoryAddress connection, MemoryAddress name, MemoryAddress nameOwner, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (BusNameAppearedCallback) Interop.signalRegistry.get(hash);
        handler.onBusNameAppearedCallback(new DBusConnection(References.get(connection, false)), name.getUtf8String(0), nameOwner.getUtf8String(0));
    }
    
    public static void __cbFileMeasureProgressCallback(int reporting, long currentSize, long numDirs, long numFiles, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (FileMeasureProgressCallback) Interop.signalRegistry.get(hash);
        handler.onFileMeasureProgressCallback(reporting != 0, currentSize, numDirs, numFiles);
    }
    
    public static boolean __cbDatagramBasedSourceFunc(MemoryAddress datagramBased, int condition, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (DatagramBasedSourceFunc) Interop.signalRegistry.get(hash);
        return handler.onDatagramBasedSourceFunc(new DatagramBased.DatagramBasedImpl(References.get(datagramBased, false)), new org.gtk.glib.IOCondition(condition));
    }
    
    public static boolean __cbSettingsGetMapping(MemoryAddress value, MemoryAddress result, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (SettingsGetMapping) Interop.signalRegistry.get(hash);
        return handler.onSettingsGetMapping(new org.gtk.glib.Variant(References.get(value, false)), result);
    }
    
    public static org.gtk.glib.Variant __cbDBusInterfaceGetPropertyFunc(MemoryAddress connection, MemoryAddress sender, MemoryAddress objectPath, MemoryAddress interfaceName, MemoryAddress propertyName, MemoryAddress error, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (DBusInterfaceGetPropertyFunc) Interop.signalRegistry.get(hash);
        return handler.onDBusInterfaceGetPropertyFunc(new DBusConnection(References.get(connection, false)), sender.getUtf8String(0), objectPath.getUtf8String(0), interfaceName.getUtf8String(0), propertyName.getUtf8String(0));
    }
    
    public static void __cbBusAcquiredCallback(MemoryAddress connection, MemoryAddress name, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (BusAcquiredCallback) Interop.signalRegistry.get(hash);
        handler.onBusAcquiredCallback(new DBusConnection(References.get(connection, false)), name.getUtf8String(0));
    }
    
    public static org.gtk.glib.Variant __cbSettingsBindSetMapping(MemoryAddress value, MemoryAddress expectedType, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (SettingsBindSetMapping) Interop.signalRegistry.get(hash);
        return handler.onSettingsBindSetMapping(new org.gtk.gobject.Value(References.get(value, false)), new org.gtk.glib.VariantType(References.get(expectedType, false)));
    }
    
    public static java.lang.foreign.MemoryAddress __cbReallocFunc(MemoryAddress data, long size) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (ReallocFunc) Interop.signalRegistry.get(hash);
        return handler.onReallocFunc(size);
    }
    
    public static boolean __cbCancellableSourceFunc(MemoryAddress cancellable, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (CancellableSourceFunc) Interop.signalRegistry.get(hash);
        return handler.onCancellableSourceFunc(new Cancellable(References.get(cancellable, false)));
    }
    
    public static boolean __cbDBusInterfaceSetPropertyFunc(MemoryAddress connection, MemoryAddress sender, MemoryAddress objectPath, MemoryAddress interfaceName, MemoryAddress propertyName, MemoryAddress value, MemoryAddress error, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (DBusInterfaceSetPropertyFunc) Interop.signalRegistry.get(hash);
        return handler.onDBusInterfaceSetPropertyFunc(new DBusConnection(References.get(connection, false)), sender.getUtf8String(0), objectPath.getUtf8String(0), interfaceName.getUtf8String(0), propertyName.getUtf8String(0), new org.gtk.glib.Variant(References.get(value, false)));
    }
    
    public static void __cbBusNameLostCallback(MemoryAddress connection, MemoryAddress name, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (BusNameLostCallback) Interop.signalRegistry.get(hash);
        handler.onBusNameLostCallback(new DBusConnection(References.get(connection, false)), name.getUtf8String(0));
    }
    
    public static boolean __cbFileReadMoreCallback(MemoryAddress fileContents, long fileSize, MemoryAddress callbackData) {
        int hash = callbackData.get(ValueLayout.JAVA_INT, 0);
        var handler = (FileReadMoreCallback) Interop.signalRegistry.get(hash);
        return handler.onFileReadMoreCallback(fileContents.getUtf8String(0), fileSize);
    }
    
    public static boolean __cbSocketSourceFunc(MemoryAddress socket, int condition, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (SocketSourceFunc) Interop.signalRegistry.get(hash);
        return handler.onSocketSourceFunc(new Socket(References.get(socket, false)), new org.gtk.glib.IOCondition(condition));
    }
    
    public static void __cbDesktopAppLaunchCallback(MemoryAddress appinfo, int pid, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (DesktopAppLaunchCallback) Interop.signalRegistry.get(hash);
        handler.onDesktopAppLaunchCallback(new DesktopAppInfo(References.get(appinfo, false)), new org.gtk.glib.Pid(pid));
    }
    
    public static boolean __cbPollableSourceFunc(MemoryAddress pollableStream, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (PollableSourceFunc) Interop.signalRegistry.get(hash);
        return handler.onPollableSourceFunc(new org.gtk.gobject.Object(References.get(pollableStream, false)));
    }
    
    public static void __cbAsyncReadyCallback(MemoryAddress sourceObject, MemoryAddress res, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (AsyncReadyCallback) Interop.signalRegistry.get(hash);
        handler.onAsyncReadyCallback(new org.gtk.gobject.Object(References.get(sourceObject, false)), new AsyncResult.AsyncResultImpl(References.get(res, false)));
    }
    
    public static boolean __cbSettingsBindGetMapping(MemoryAddress value, MemoryAddress variant, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (SettingsBindGetMapping) Interop.signalRegistry.get(hash);
        return handler.onSettingsBindGetMapping(new org.gtk.gobject.Value(References.get(value, false)), new org.gtk.glib.Variant(References.get(variant, false)));
    }
    
    public static DBusInterfaceVTable __cbDBusSubtreeDispatchFunc(MemoryAddress connection, MemoryAddress sender, MemoryAddress objectPath, MemoryAddress interfaceName, MemoryAddress node, MemoryAddress outUserData, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (DBusSubtreeDispatchFunc) Interop.signalRegistry.get(hash);
        return handler.onDBusSubtreeDispatchFunc(new DBusConnection(References.get(connection, false)), sender.getUtf8String(0), objectPath.getUtf8String(0), interfaceName.getUtf8String(0), node.getUtf8String(0), outUserData);
    }
    
    public static void __cbDBusSignalCallback(MemoryAddress connection, MemoryAddress senderName, MemoryAddress objectPath, MemoryAddress interfaceName, MemoryAddress signalName, MemoryAddress parameters, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (DBusSignalCallback) Interop.signalRegistry.get(hash);
        handler.onDBusSignalCallback(new DBusConnection(References.get(connection, false)), senderName.getUtf8String(0), objectPath.getUtf8String(0), interfaceName.getUtf8String(0), signalName.getUtf8String(0), new org.gtk.glib.Variant(References.get(parameters, false)));
    }
    
    public static void __cbFileProgressCallback(long currentNumBytes, long totalNumBytes, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (FileProgressCallback) Interop.signalRegistry.get(hash);
        handler.onFileProgressCallback(currentNumBytes, totalNumBytes);
    }
    
    public static File __cbVfsFileLookupFunc(MemoryAddress vfs, MemoryAddress identifier, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (VfsFileLookupFunc) Interop.signalRegistry.get(hash);
        return handler.onVfsFileLookupFunc(new Vfs(References.get(vfs, false)), identifier.getUtf8String(0));
    }
    
    public static void __cbDBusInterfaceMethodCallFunc(MemoryAddress connection, MemoryAddress sender, MemoryAddress objectPath, MemoryAddress interfaceName, MemoryAddress methodName, MemoryAddress parameters, MemoryAddress invocation, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (DBusInterfaceMethodCallFunc) Interop.signalRegistry.get(hash);
        handler.onDBusInterfaceMethodCallFunc(new DBusConnection(References.get(connection, false)), sender.getUtf8String(0), objectPath.getUtf8String(0), interfaceName.getUtf8String(0), methodName.getUtf8String(0), new org.gtk.glib.Variant(References.get(parameters, false)), new DBusMethodInvocation(References.get(invocation, true)));
    }
    
    public static void __cbDBusSubtreeEnumerateFunc(MemoryAddress connection, MemoryAddress sender, MemoryAddress objectPath, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (DBusSubtreeEnumerateFunc) Interop.signalRegistry.get(hash);
        handler.onDBusSubtreeEnumerateFunc(new DBusConnection(References.get(connection, false)), sender.getUtf8String(0), objectPath.getUtf8String(0));
    }
    
    public static DBusMessage __cbDBusMessageFilterFunction(MemoryAddress connection, MemoryAddress message, int incoming, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (DBusMessageFilterFunction) Interop.signalRegistry.get(hash);
        return handler.onDBusMessageFilterFunction(new DBusConnection(References.get(connection, false)), new DBusMessage(References.get(message, true)), incoming != 0);
    }
    
    public static void __cbDBusSubtreeIntrospectFunc(MemoryAddress connection, MemoryAddress sender, MemoryAddress objectPath, MemoryAddress node, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (DBusSubtreeIntrospectFunc) Interop.signalRegistry.get(hash);
        handler.onDBusSubtreeIntrospectFunc(new DBusConnection(References.get(connection, false)), sender.getUtf8String(0), objectPath.getUtf8String(0), node.getUtf8String(0));
    }
    
    public static org.gtk.gobject.Type __cbDBusProxyTypeFunc(MemoryAddress manager, MemoryAddress objectPath, MemoryAddress interfaceName, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (DBusProxyTypeFunc) Interop.signalRegistry.get(hash);
        return handler.onDBusProxyTypeFunc(new DBusObjectManagerClient(References.get(manager, false)), objectPath.getUtf8String(0), interfaceName.getUtf8String(0));
    }
    
    public static void __cbTaskThreadFunc(MemoryAddress task, MemoryAddress sourceObject, MemoryAddress taskData, MemoryAddress cancellable) {
        int hash = taskData.get(ValueLayout.JAVA_INT, 0);
        var handler = (TaskThreadFunc) Interop.signalRegistry.get(hash);
        handler.onTaskThreadFunc(new Task(References.get(task, false)), new org.gtk.gobject.Object(References.get(sourceObject, false)), new Cancellable(References.get(cancellable, false)));
    }
    
    public static void __cbBusNameAcquiredCallback(MemoryAddress connection, MemoryAddress name, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (BusNameAcquiredCallback) Interop.signalRegistry.get(hash);
        handler.onBusNameAcquiredCallback(new DBusConnection(References.get(connection, false)), name.getUtf8String(0));
    }
    
    public static boolean __cbIOSchedulerJobFunc(MemoryAddress job, MemoryAddress cancellable, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (IOSchedulerJobFunc) Interop.signalRegistry.get(hash);
        return handler.onIOSchedulerJobFunc(new IOSchedulerJob(References.get(job, false)), new Cancellable(References.get(cancellable, false)));
    }
    
}
