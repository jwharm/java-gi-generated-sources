package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

public final class Gio {
    
    /**
     * Checks if @action_name is valid.
     * 
     * @action_name is valid if it consists only of alphanumeric characters,
     * plus '-' and '.'.  The empty string is not a valid action name.
     * 
     * It is an error to call this function with a non-utf8 @action_name.
     * @action_name must not be %NULL.
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
     * nor the characters ':', '(' or ')'.  For example: "app.action".
     * 
     * The second format is used to represent an action with a target value
     * that is a non-empty string consisting only of alphanumerics, plus '-'
     * and '.'.  In that case, the action name and target value are
     * separated by a double colon ("::").  For example:
     * "app.action::target".
     * 
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
     * Creates a new #GAppInfo from the given information.
     * 
     * Note that for @commandline, the quoting rules of the Exec key of the
     * [freedesktop.org Desktop Entry Specification](http://freedesktop.org/Standards/desktop-entry-spec)
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
     * 
     * For desktop files, this includes applications that have
     * `NoDisplay=true` set or are excluded from display by means
     * of `OnlyShowIn` or `NotShowIn`. See g_app_info_should_show().
     * The returned list does not include applications which have
     * the `Hidden` key set.
     */
    public static org.gtk.glib.List appInfoGetAll() {
        var RESULT = gtk_h.g_app_info_get_all();
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Gets a list of all #GAppInfos for a given content type,
     * including the recommended and fallback #GAppInfos. See
     * g_app_info_get_recommended_for_type() and
     * g_app_info_get_fallback_for_type().
     */
    public static org.gtk.glib.List appInfoGetAllForType(java.lang.String contentType) {
        var RESULT = gtk_h.g_app_info_get_all_for_type(Interop.allocateNativeString(contentType).handle());
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Gets the default #GAppInfo for a given content type.
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
     * Gets a list of fallback #GAppInfos for a given content type, i.e.
     * those applications which claim to support the given content type
     * by MIME type subclassing and not directly.
     */
    public static org.gtk.glib.List appInfoGetFallbackForType(java.lang.String contentType) {
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
     * Note that the returned #GDBusConnection object will (usually) have
     * the #GDBusConnection:exit-on-close property set to %TRUE.
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
     * Note that the returned #GDBusConnection object will (usually) have
     * the #GDBusConnection:exit-on-close property set to %TRUE.
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
     * [thread-default main context][g-main-context-push-thread-default]
     * of the thread you are calling this function from.
     * 
     * You are guaranteed that one of the @name_acquired_handler and @name_lost_handler
     * callbacks will be invoked after calling this function - there are three
     * possible cases:
     * 
     * - @name_lost_handler with a %NULL connection (if a connection to the bus
     *   can't be made).
     * 
     * - @bus_acquired_handler then @name_lost_handler (if the name can't be
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
     * If the #GDBusConnection that is used for attempting to own the name
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
     * to [own names][gdbus-owning-names] and export objects.
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
     * Like g_bus_own_name() but takes a #GDBusConnection instead of a
     * #GBusType.
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
     * and unowning the name) in the current thread-default #GMainContext after
     * this function has returned. You should continue to iterate the #GMainContext
     * until the #GDestroyNotify function passed to g_bus_own_name() is called, in
     * order to avoid memory leaks through callbacks queued on the #GMainContext
     * after it’s stopped being iterated.
     */
    public static void busUnownName(int ownerId) {
        gtk_h.g_bus_unown_name(ownerId);
    }
    
    /**
     * Stops watching a name.
     * 
     * Note that there may still be D-Bus traffic to process (relating to watching
     * and unwatching the name) in the current thread-default #GMainContext after
     * this function has returned. You should continue to iterate the #GMainContext
     * until the #GDestroyNotify function passed to g_bus_watch_name() is called, in
     * order to avoid memory leaks through callbacks queued on the #GMainContext
     * after it’s stopped being iterated.
     */
    public static void busUnwatchName(int watcherId) {
        gtk_h.g_bus_unwatch_name(watcherId);
    }
    
    /**
     * Starts watching @name on the bus specified by @bus_type and calls
     * @name_appeared_handler and @name_vanished_handler when the name is
     * known to have an owner respectively known to lose its
     * owner. Callbacks will be invoked in the
     * [thread-default main context][g-main-context-push-thread-default]
     * of the thread you are calling this function from.
     * 
     * You are guaranteed that one of the handlers will be invoked after
     * calling this function. When you are done watching the name, just
     * call g_bus_unwatch_name() with the watcher id this function
     * returns.
     * 
     * If the name vanishes or appears (for example the application owning
     * the name could restart), the handlers are also invoked. If the
     * #GDBusConnection that is used for watching the name disconnects, then
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
     * to take action when a certain [name exists][gdbus-watching-names].
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
     * Like g_bus_watch_name() but takes a #GDBusConnection instead of a
     * #GBusType.
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
     * [shared-mime-info](http://www.freedesktop.org/wiki/Specifications/shared-mime-info-spec)
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
     * Checks if the content type is the generic "unknown" type.
     * On UNIX this is the "application/octet-stream" mimetype,
     * while on win32 it is "*" and on OSX it is a dynamic type
     * or octet-stream.
     */
    public static boolean contentTypeIsUnknown(java.lang.String type) {
        var RESULT = gtk_h.g_content_type_is_unknown(Interop.allocateNativeString(type).handle());
        return (RESULT != 0);
    }
    
    /**
     * Set the list of directories used by GIO to load the MIME database.
     * If @dirs is %NULL, the directories used are the default:
     * 
     *  - the `mime` subdirectory of the directory in `$XDG_DATA_HOME`
     *  - the `mime` subdirectory of every directory in `$XDG_DATA_DIRS`
     * 
     * This function is intended to be used when writing tests that depend on
     * information stored in the MIME database, in order to control the data.
     * 
     * Typically, in case your tests use %G_TEST_OPTION_ISOLATE_DIRS, but they
     * depend on the system’s MIME database, you should call this function
     * with @dirs set to %NULL before calling g_test_init(), for instance:
     * 
     * |[<!-- language="C" -->
     *   // Load MIME data from the system
     *   g_content_type_set_mime_dirs (NULL);
     *   // Isolate the environment
     *   g_test_init (&argc, &argv, G_TEST_OPTION_ISOLATE_DIRS, NULL);
     * 
     *   …
     * 
     *   return g_test_run ();
     * ]|
     */
    public static void contentTypeSetMimeDirs(java.lang.String[] dirs) {
        gtk_h.g_content_type_set_mime_dirs(Interop.allocateNativeArray(dirs).handle());
    }
    
    /**
     * Gets a list of strings containing all the registered content types
     * known to the system. The list and its data should be freed using
     * `g_list_free_full (list, g_free)`.
     */
    public static org.gtk.glib.List contentTypesGetRegistered() {
        var RESULT = gtk_h.g_content_types_get_registered();
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Escape @string so it can appear in a D-Bus address as the value
     * part of a key-value pair.
     * 
     * For instance, if @string is `/run/bus-for-:0`,
     * this function would return `/run/bus-for-%3A0`,
     * which could be used in a D-Bus address like
     * `unix:nonce-tcp:host=127.0.0.1,port=42,noncefile=/run/bus-for-%3A0`.
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
     * [D-Bus address format](https://dbus.freedesktop.org/doc/dbus-specification.html#addresses).
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
     * [D-Bus address format](https://dbus.freedesktop.org/doc/dbus-specification.html#addresses).
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
     * A server is not required to set a GUID, so @out_guid may be set to %NULL
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
     * Synchronously connects to an endpoint specified by @address and
     * sets up the connection so it is in a state to run the client-side
     * of the D-Bus authentication conversation. @address must be in the
     * [D-Bus address format](https://dbus.freedesktop.org/doc/dbus-specification.html#addresses).
     * 
     * A server is not required to set a GUID, so @out_guid may be set to %NULL
     * even on success.
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
     * 
     * Otherwise the a name of the form
     * `org.gtk.GDBus.UnmappedGError.Quark._ESCAPED_QUARK_NAME.Code_ERROR_CODE`
     * will be used. This allows other GDBus applications to map the error
     * on the wire back to a #GError using g_dbus_error_new_for_dbus_error().
     * 
     * This function is typically only used in object mappings to put a
     * #GError on the wire. Regular applications should not use it.
     */
    public static java.lang.String dbusErrorEncodeGerror(org.gtk.glib.Error error) {
        var RESULT = gtk_h.g_dbus_error_encode_gerror(error.handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the D-Bus error name used for @error, if any.
     * 
     * This function is guaranteed to return a D-Bus error name for all
     * #GErrors returned from functions handling remote method calls
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
     * Creates a #GError based on the contents of @dbus_error_name and
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
     * create the #GError. Also, @dbus_error_name is added to the error message
     * such that it can be recovered with g_dbus_error_get_remote_error().
     * 
     * Otherwise, a #GError with the error code %G_IO_ERROR_DBUS_ERROR
     * in the %G_IO_ERROR error domain is returned. Also, @dbus_error_name is
     * added to the error message such that it can be recovered with
     * g_dbus_error_get_remote_error().
     * 
     * In all three cases, @dbus_error_name can always be recovered from the
     * returned #GError using the g_dbus_error_get_remote_error() function
     * (unless g_dbus_error_strip_remote_error() hasn't been used on the returned error).
     * 
     * This function is typically only used in object mappings to prepare
     * #GError instances for applications. Regular applications should not use
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
     * #GErrors specified by @error_domain and @error_code.
     * 
     * This is typically done in the routine that returns the #GQuark for
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
     * 
     * The escaping method consists of replacing all non-alphanumeric
     * characters (see g_ascii_isalnum()) with their hexadecimal value
     * preceded by an underscore (`_`). For example:
     * `foo.bar.baz` will become `foo_2ebar_2ebaz`.
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
     * [D-Bus specification](https://dbus.freedesktop.org/doc/dbus-specification.html#uuids)
     * regarding what strings are valid D-Bus GUIDs. The specification refers to
     * these as ‘UUIDs’ whereas GLib (for historical reasons) refers to them as
     * ‘GUIDs’. The terms are interchangeable.
     * 
     * Note that D-Bus GUIDs do not follow
     * [RFC 4122](https://datatracker.ietf.org/doc/html/rfc4122).
     */
    public static java.lang.String dbusGenerateGuid() {
        var RESULT = gtk_h.g_dbus_generate_guid();
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Converts a #GValue to a #GVariant of the type indicated by the @type
     * parameter.
     * 
     * The conversion is using the following rules:
     * 
     * - `G_TYPE_STRING`: 's', 'o', 'g' or 'ay'
     * - `G_TYPE_STRV`: 'as', 'ao' or 'aay'
     * - `G_TYPE_BOOLEAN`: 'b'
     * - `G_TYPE_UCHAR`: 'y'
     * - `G_TYPE_INT`: 'i', 'n'
     * - `G_TYPE_UINT`: 'u', 'q'
     * - `G_TYPE_INT64`: 'x'
     * - `G_TYPE_UINT64`: 't'
     * - `G_TYPE_DOUBLE`: 'd'
     * - `G_TYPE_VARIANT`: Any #GVariantType
     * 
     * This can fail if e.g. @gvalue is of type %G_TYPE_STRING and @type
     * is 'i', i.e. %G_VARIANT_TYPE_INT32. It will also fail for any #GType
     * (including e.g. %G_TYPE_OBJECT and %G_TYPE_BOXED derived-types) not
     * in the table above.
     * 
     * Note that if @gvalue is of type %G_TYPE_VARIANT and its value is
     * %NULL, the empty #GVariant instance (never %NULL) for @type is
     * returned (e.g. 0 for scalar types, the empty string for string types,
     * '/' for object path types, the empty array for any array type and so on).
     * 
     * See the g_dbus_gvariant_to_gvalue() function for how to convert a
     * #GVariant to a #GValue.
     */
    public static org.gtk.glib.Variant dbusGvalueToGvariant(org.gtk.gobject.Value gvalue, org.gtk.glib.VariantType type) {
        var RESULT = gtk_h.g_dbus_gvalue_to_gvariant(gvalue.handle(), type.handle());
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Converts a #GVariant to a #GValue. If @value is floating, it is consumed.
     * 
     * The rules specified in the g_dbus_gvalue_to_gvariant() function are
     * used - this function is essentially its reverse form. So, a #GVariant
     * containing any basic or string array type will be converted to a #GValue
     * containing a basic value or string array. Any other #GVariant (handle,
     * variant, tuple, dict entry) will be converted to a #GValue containing that
     * #GVariant.
     * 
     * The conversion never fails - a valid #GValue is always returned in
     * @out_gvalue.
     */
    public static void dbusGvariantToGvalue(org.gtk.glib.Variant value, org.gtk.gobject.Value outGvalue) {
        gtk_h.g_dbus_gvariant_to_gvalue(value.handle(), outGvalue.handle());
    }
    
    /**
     * Checks if @string is a
     * [D-Bus address](https://dbus.freedesktop.org/doc/dbus-specification.html#addresses).
     * 
     * This doesn't check if @string is actually supported by #GDBusServer
     * or #GDBusConnection - use g_dbus_is_supported_address() to do more
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
     * [D-Bus address format](https://dbus.freedesktop.org/doc/dbus-specification.html#addresses).
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
     * Creates a new #GDtlsClientConnection wrapping @base_socket which is
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
     * Creates a new #GDtlsServerConnection wrapping @base_socket.
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
     * Creates a #GFile with the given argument from the command line.
     * The value of @arg can be either a URI, an absolute path or a
     * relative path resolved relative to the current working directory.
     * This operation never fails, but the returned object might not
     * support any I/O operation if @arg points to a malformed path.
     * 
     * Note that on Windows, this function expects its argument to be in
     * UTF-8 -- not the system code page.  This means that you
     * should not use this function with string from argv as it is passed
     * to main().  g_win32_get_command_line() will return a UTF-8 version of
     * the commandline.  #GApplication also uses UTF-8 but
     * g_application_command_line_create_file_for_arg() may be more useful
     * for you there.  It is also always possible to use this function with
     * #GOptionContext arguments of type %G_OPTION_ARG_FILENAME.
     */
    public static File fileNewForCommandlineArg(java.lang.String arg) {
        var RESULT = gtk_h.g_file_new_for_commandline_arg(Interop.allocateNativeString(arg).handle());
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Creates a #GFile with the given argument from the command line.
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
     * Constructs a #GFile for a given path. This operation never
     * fails, but the returned object might not support any I/O
     * operation if @path is malformed.
     */
    public static File fileNewForPath(java.lang.String path) {
        var RESULT = gtk_h.g_file_new_for_path(Interop.allocateNativeString(path).handle());
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Constructs a #GFile for a given URI. This operation never
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
     * returned by g_get_tmp_dir()) and returns a #GFile and
     * #GFileIOStream pointing to it.
     * 
     * @tmpl should be a string in the GLib file name encoding
     * containing a sequence of six 'X' characters, and containing no
     * directory components. If it is %NULL, a default template is used.
     * 
     * Unlike the other #GFile constructors, this will return %NULL if
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
     * Constructs a #GFile with the given @parse_name (i.e. something
     * given by g_file_get_parse_name()). This operation never fails,
     * but the returned object might not support any I/O operation if
     * the @parse_name cannot be parsed.
     */
    public static File fileParseName(java.lang.String parseName) {
        var RESULT = gtk_h.g_file_parse_name(Interop.allocateNativeString(parseName).handle());
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Deserializes a #GIcon previously serialized using g_icon_serialize().
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
     * Generate a #GIcon instance from @str. This function can fail if
     * @str is not valid - see g_icon_to_string() for discussion.
     * 
     * If your application or library provides one or more #GIcon
     * implementations you need to ensure that each #GType is registered
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
     * value %G_IO_ERROR_FAILED is returned for error codes not currently
     * handled (but note that future GLib releases may return a more
     * specific value instead).
     * 
     * As %errno is global and may be modified by intermediate function
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
     * extension point, the existing #GIOExtension object is returned.
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
     * 
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
     * Creates a keyfile-backed #GSettingsBackend.
     * 
     * The filename of the keyfile to use is given by @filename.
     * 
     * All settings read to or written from the backend must fall under the
     * path given in @root_path (which must start and end with a slash and
     * not contain two consecutive slashes).  @root_path may be "/".
     * 
     * If @root_group is non-%NULL then it specifies the name of the keyfile
     * group used for keys that are written directly below @root_path.  For
     * example, if @root_path is "/apps/example/" and @root_group is
     * "toplevel", then settings the key "/apps/example/enabled" to a value
     * of %TRUE will cause the following to appear in the keyfile:
     * 
     * |[
     *   [toplevel]
     *   enabled=true
     * ]|
     * 
     * If @root_group is %NULL then it is not permitted to store keys
     * directly below the @root_path.
     * 
     * For keys not stored directly below @root_path (ie: in a sub-path),
     * the name of the subpath (with the final slash stripped) is used as
     * the name of the keyfile group.  To continue the example, if
     * "/apps/example/profiles/default/font-size" were set to
     * 12 then the following would appear in the keyfile:
     * 
     * |[
     *   [profiles/default]
     *   font-size=12
     * ]|
     * 
     * The backend will refuse writes (and return writability as being
     * %FALSE) for keys outside of @root_path and, in the event that
     * @root_group is %NULL, also for keys directly under @root_path.
     * Writes will also be refused if the backend detects that it has the
     * inability to rewrite the keyfile (ie: the containing directory is not
     * writable).
     * 
     * There is no checking done for your key namespace clashing with the
     * syntax of the key file format.  For example, if you have '[' or ']'
     * characters in your path names or '=' in your key names you may be in
     * trouble.
     * 
     * The backend reads default values from a keyfile called `defaults` in
     * the directory specified by the #GKeyfileSettingsBackend:defaults-dir property,
     * and a list of locked keys from a text file with the name `locks` in
     * the same location.
     */
    public static SettingsBackend keyfileSettingsBackendNew(java.lang.String filename, java.lang.String rootPath, java.lang.String rootGroup) {
        var RESULT = gtk_h.g_keyfile_settings_backend_new(Interop.allocateNativeString(filename).handle(), Interop.allocateNativeString(rootPath).handle(), Interop.allocateNativeString(rootGroup).handle());
        return new SettingsBackend(References.get(RESULT, true));
    }
    
    /**
     * Gets a reference to the default #GMemoryMonitor for the system.
     */
    public static MemoryMonitor memoryMonitorDupDefault() {
        var RESULT = gtk_h.g_memory_monitor_dup_default();
        return new MemoryMonitor.MemoryMonitorImpl(References.get(RESULT, true));
    }
    
    /**
     * Creates a memory-backed #GSettingsBackend.
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
     * Gets the default #GNetworkMonitor for the system.
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
     * Creates a readonly #GSettingsBackend.
     * 
     * This backend does not allow changes to settings, so all settings
     * will always have their default values.
     */
    public static SettingsBackend nullSettingsBackendNew() {
        var RESULT = gtk_h.g_null_settings_backend_new();
        return new SettingsBackend(References.get(RESULT, true));
    }
    
    /**
     * Utility method for #GPollableInputStream and #GPollableOutputStream
     * implementations. Creates a new #GSource that expects a callback of
     * type #GPollableSourceFunc. The new source does not actually do
     * anything on its own; use g_source_add_child_source() to add other
     * sources to it to cause it to trigger.
     */
    public static org.gtk.glib.Source pollableSourceNew(org.gtk.gobject.Object pollableStream) {
        var RESULT = gtk_h.g_pollable_source_new(pollableStream.handle());
        return new org.gtk.glib.Source(References.get(RESULT, true));
    }
    
    /**
     * Utility method for #GPollableInputStream and #GPollableOutputStream
     * implementations. Creates a new #GSource, as with
     * g_pollable_source_new(), but also attaching @child_source (with a
     * dummy callback), and @cancellable, if they are non-%NULL.
     */
    public static org.gtk.glib.Source pollableSourceNewFull(org.gtk.gobject.Object pollableStream, org.gtk.glib.Source childSource, Cancellable cancellable) {
        var RESULT = gtk_h.g_pollable_source_new_full(pollableStream.handle(), childSource.handle(), cancellable.handle());
        return new org.gtk.glib.Source(References.get(RESULT, true));
    }
    
    /**
     * Tries to read from @stream, as with g_input_stream_read() (if
     * @blocking is %TRUE) or g_pollable_input_stream_read_nonblocking()
     * (if @blocking is %FALSE). This can be used to more easily share
     * code between blocking and non-blocking implementations of a method.
     * 
     * If @blocking is %FALSE, then @stream must be a
     * #GPollableInputStream for which g_pollable_input_stream_can_poll()
     * returns %TRUE, or else the behavior is undefined. If @blocking is
     * %TRUE, then @stream does not need to be a #GPollableInputStream.
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
     * @blocking is %TRUE) or g_pollable_output_stream_write_nonblocking()
     * (if @blocking is %FALSE). This can be used to more easily share
     * code between blocking and non-blocking implementations of a method.
     * 
     * If @blocking is %FALSE, then @stream must be a
     * #GPollableOutputStream for which
     * g_pollable_output_stream_can_poll() returns %TRUE or else the
     * behavior is undefined. If @blocking is %TRUE, then @stream does not
     * need to be a #GPollableOutputStream.
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
     * Gets a reference to the default #GPowerProfileMonitor for the system.
     */
    public static PowerProfileMonitor powerProfileMonitorDupDefault() {
        var RESULT = gtk_h.g_power_profile_monitor_dup_default();
        return new PowerProfileMonitor.PowerProfileMonitorImpl(References.get(RESULT, true));
    }
    
    /**
     * Find the `gio-proxy` extension point for a proxy implementation that supports
     * the specified protocol.
     */
    public static Proxy proxyGetDefaultForProtocol(java.lang.String protocol) {
        var RESULT = gtk_h.g_proxy_get_default_for_protocol(Interop.allocateNativeString(protocol).handle());
        return new Proxy.ProxyImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets the default #GProxyResolver for the system.
     */
    public static ProxyResolver proxyResolverGetDefault() {
        var RESULT = gtk_h.g_proxy_resolver_get_default();
        return new ProxyResolver.ProxyResolverImpl(References.get(RESULT, false));
    }
    
    /**
     * Gets the #GResolver Error Quark.
     */
    public static org.gtk.glib.Quark resolverErrorQuark() {
        var RESULT = gtk_h.g_resolver_error_quark();
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Gets the #GResource Error Quark.
     */
    public static org.gtk.glib.Quark resourceErrorQuark() {
        var RESULT = gtk_h.g_resource_error_quark();
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Loads a binary resource bundle and creates a #GResource representation of it, allowing
     * you to query it for data.
     * 
     * If you want to use this resource in the global resource namespace you need
     * to register it with g_resources_register().
     * 
     * If @filename is empty or the data in it is corrupt,
     * %G_RESOURCE_ERROR_INTERNAL will be returned. If @filename doesn’t exist, or
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
     * globally registered resources and returns a #GBytes that
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
     * globally registered resources and returns a #GInputStream
     * that lets you read the data.
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
     * 
     * This function is not required for normal uses of #GSettings but it
     * may be useful to authors of plugin management systems or to those who
     * want to introspect the content of schemas.
     * 
     * If no schemas are installed, %NULL will be returned.
     * 
     * The returned source may actually consist of multiple schema sources
     * from different directories, depending on which directories were given
     * in `XDG_DATA_DIRS` and `GSETTINGS_SCHEMA_DIR`. For this reason, all
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
     * Gets the default #GTlsBackend for the system.
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
     * Creates a new #GTlsClientConnection wrapping @base_io_stream (which
     * must have pollable input and output streams) which is assumed to
     * communicate with the server identified by @server_identity.
     * 
     * See the documentation for #GTlsConnection:base-io-stream for restrictions
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
     * Creates a new #GTlsFileDatabase which uses anchor certificate authorities
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
     * Creates a new #GTlsServerConnection wrapping @base_io_stream (which
     * must have pollable input and output streams).
     * 
     * See the documentation for #GTlsConnection:base-io-stream for restrictions
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
     * appear in a GUI. For example, the Linux `/proc` filesystem.
     * 
     * The list of device paths considered ‘system’ ones may change over time.
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
     * appear in a GUI. For example, the Linux `/proc` filesystem.
     * 
     * The list of file system types considered ‘system’ ones may change over time.
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
     * Gets a comma-separated list of mount options for the unix mount. For example,
     * `rw,relatime,seclabel,data=ordered`.
     * 
     * This is similar to g_unix_mount_point_get_options(), but it takes
     * a #GUnixMountEntry as an argument.
     */
    public static java.lang.String unixMountGetOptions(UnixMountEntry mountEntry) {
        var RESULT = gtk_h.g_unix_mount_get_options(mountEntry.handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the root of the mount within the filesystem. This is useful e.g. for
     * mounts created by bind operation, or btrfs subvolumes.
     * 
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
     * g_unix_is_mount_path_system_internal() on @mount_entry’s properties.
     * 
     * The definition of what a ‘system’ mount entry is may change over time as new
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
