package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The #GDBusConnection type is used for D-Bus connections to remote
 * peers such as a message buses. It is a low-level API that offers a
 * lot of flexibility. For instance, it lets you establish a connection
 * over any transport that can by represented as a #GIOStream.
 * 
 * This class is rarely used directly in D-Bus clients. If you are writing
 * a D-Bus client, it is often easier to use the g_bus_own_name(),
 * g_bus_watch_name() or g_dbus_proxy_new_for_bus() APIs.
 * 
 * As an exception to the usual GLib rule that a particular object must not
 * be used by two threads at the same time, #GDBusConnection's methods may be
 * called from any thread. This is so that g_bus_get() and g_bus_get_sync()
 * can safely return the same #GDBusConnection when called from any thread.
 * 
 * Most of the ways to obtain a #GDBusConnection automatically initialize it
 * (i.e. connect to D-Bus): for instance, g_dbus_connection_new() and
 * g_bus_get(), and the synchronous versions of those methods, give you an
 * initialized connection. Language bindings for GIO should use
 * g_initable_new() or g_async_initable_new_async(), which also initialize the
 * connection.
 * 
 * If you construct an uninitialized #GDBusConnection, such as via
 * g_object_new(), you must initialize it via g_initable_init() or
 * g_async_initable_init_async() before using its methods or properties.
 * Calling methods or accessing properties on a #GDBusConnection that has not
 * completed initialization successfully is considered to be invalid, and leads
 * to undefined behaviour. In particular, if initialization fails with a
 * #GError, the only valid thing you can do with that #GDBusConnection is to
 * free it with g_object_unref().
 * 
 * ## An example D-Bus server # {#gdbus-server}
 * 
 * Here is an example for a D-Bus server:
 * [gdbus-example-server.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-server.c)
 * 
 * ## An example for exporting a subtree # {#gdbus-subtree-server}
 * 
 * Here is an example for exporting a subtree:
 * [gdbus-example-subtree.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-subtree.c)
 * 
 * ## An example for file descriptor passing # {#gdbus-unix-fd-client}
 * 
 * Here is an example for passing UNIX file descriptors:
 * [gdbus-unix-fd-client.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-unix-fd-client.c)
 * 
 * ## An example for exporting a GObject # {#gdbus-export}
 * 
 * Here is an example for exporting a #GObject:
 * [gdbus-example-export.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-export.c)
 */
public class DBusConnection extends org.gtk.gobject.Object implements AsyncInitable, Initable {

    public DBusConnection(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to DBusConnection */
    public static DBusConnection castFrom(org.gtk.gobject.Object gobject) {
        return new DBusConnection(gobject.getReference());
    }
    
    /**
     * Finishes an operation started with g_dbus_connection_call().
     */
    public org.gtk.glib.Variant callFinish(AsyncResult res) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_connection_call_finish(HANDLE(), res.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Synchronously invokes the @method_name method on the
     * @interface_name D-Bus interface on the remote object at
     * @object_path owned by @bus_name.
     * 
     * If @connection is closed then the operation will fail with
     * %G_IO_ERROR_CLOSED. If @cancellable is canceled, the
     * operation will fail with %G_IO_ERROR_CANCELLED. If @parameters
     * contains a value not compatible with the D-Bus protocol, the operation
     * fails with %G_IO_ERROR_INVALID_ARGUMENT.
     * 
     * If @reply_type is non-%NULL then the reply will be checked for having
     * this type and an error will be raised if it does not match.  Said
     * another way, if you give a @reply_type then any non-%NULL return
     * value will be of this type.
     * 
     * If the @parameters #GVariant is floating, it is consumed.
     * This allows convenient 'inline' use of g_variant_new(), e.g.:
     * |[<!-- language="C" -->
     *  g_dbus_connection_call_sync (connection,
     *                               "org.freedesktop.StringThings",
     *                               "/org/freedesktop/StringThings",
     *                               "org.freedesktop.StringThings",
     *                               "TwoStrings",
     *                               g_variant_new ("(ss)",
     *                                              "Thing One",
     *                                              "Thing Two"),
     *                               NULL,
     *                               G_DBUS_CALL_FLAGS_NONE,
     *                               -1,
     *                               NULL,
     *                               &error);
     * ]|
     * 
     * The calling thread is blocked until a reply is received. See
     * g_dbus_connection_call() for the asynchronous version of
     * this method.
     */
    public org.gtk.glib.Variant callSync(java.lang.String busName, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String methodName, org.gtk.glib.Variant parameters, org.gtk.glib.VariantType replyType, int flags, int timeoutMsec, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_connection_call_sync(HANDLE(), Interop.allocateNativeString(busName).HANDLE(), Interop.allocateNativeString(objectPath).HANDLE(), Interop.allocateNativeString(interfaceName).HANDLE(), Interop.allocateNativeString(methodName).HANDLE(), parameters.HANDLE(), replyType.HANDLE(), flags, timeoutMsec, cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Finishes an operation started with g_dbus_connection_call_with_unix_fd_list().
     * 
     * The file descriptors normally correspond to %G_VARIANT_TYPE_HANDLE
     * values in the body of the message. For example,
     * if g_variant_get_handle() returns 5, that is intended to be a reference
     * to the file descriptor that can be accessed by
     * `g_unix_fd_list_get (*out_fd_list, 5, ...)`.
     * 
     * When designing D-Bus APIs that are intended to be interoperable,
     * please note that non-GDBus implementations of D-Bus can usually only
     * access file descriptors if they are referenced in this way by a
     * value of type %G_VARIANT_TYPE_HANDLE in the body of the message.
     */
    public org.gtk.glib.Variant callWithUnixFdListFinish(UnixFDList[] outFdList, AsyncResult res) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_connection_call_with_unix_fd_list_finish(HANDLE(), Interop.allocateNativeArray(outFdList), res.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Like g_dbus_connection_call_sync() but also takes and returns #GUnixFDList objects.
     * See g_dbus_connection_call_with_unix_fd_list() and
     * g_dbus_connection_call_with_unix_fd_list_finish() for more details.
     * 
     * This method is only available on UNIX.
     */
    public org.gtk.glib.Variant callWithUnixFdListSync(java.lang.String busName, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String methodName, org.gtk.glib.Variant parameters, org.gtk.glib.VariantType replyType, int flags, int timeoutMsec, UnixFDList fdList, UnixFDList[] outFdList, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_connection_call_with_unix_fd_list_sync(HANDLE(), Interop.allocateNativeString(busName).HANDLE(), Interop.allocateNativeString(objectPath).HANDLE(), Interop.allocateNativeString(interfaceName).HANDLE(), Interop.allocateNativeString(methodName).HANDLE(), parameters.HANDLE(), replyType.HANDLE(), flags, timeoutMsec, fdList.HANDLE(), Interop.allocateNativeArray(outFdList), cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Finishes an operation started with g_dbus_connection_close().
     */
    public boolean closeFinish(AsyncResult res) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_connection_close_finish(HANDLE(), res.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Synchronously closes @connection. The calling thread is blocked
     * until this is done. See g_dbus_connection_close() for the
     * asynchronous version of this method and more details about what it
     * does.
     */
    public boolean closeSync(Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_connection_close_sync(HANDLE(), cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Emits a signal.
     * 
     * If the parameters GVariant is floating, it is consumed.
     * 
     * This can only fail if @parameters is not compatible with the D-Bus protocol
     * (%G_IO_ERROR_INVALID_ARGUMENT), or if @connection has been closed
     * (%G_IO_ERROR_CLOSED).
     */
    public boolean emitSignal(java.lang.String destinationBusName, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String signalName, org.gtk.glib.Variant parameters) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_connection_emit_signal(HANDLE(), Interop.allocateNativeString(destinationBusName).HANDLE(), Interop.allocateNativeString(objectPath).HANDLE(), Interop.allocateNativeString(interfaceName).HANDLE(), Interop.allocateNativeString(signalName).HANDLE(), parameters.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Exports @action_group on @connection at @object_path.
     * 
     * The implemented D-Bus API should be considered private.  It is
     * subject to change in the future.
     * 
     * A given object path can only have one action group exported on it.
     * If this constraint is violated, the export will fail and 0 will be
     * returned (with @error set accordingly).
     * 
     * You can unexport the action group using
     * g_dbus_connection_unexport_action_group() with the return value of
     * this function.
     * 
     * The thread default main context is taken at the time of this call.
     * All incoming action activations and state change requests are
     * reported from this context.  Any changes on the action group that
     * cause it to emit signals must also come from this same context.
     * Since incoming action activations and state change requests are
     * rather likely to cause changes on the action group, this effectively
     * limits a given action group to being exported from only one main
     * context.
     */
    public int exportActionGroup(java.lang.String objectPath, ActionGroup actionGroup) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_connection_export_action_group(HANDLE(), Interop.allocateNativeString(objectPath).HANDLE(), actionGroup.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Exports @menu on @connection at @object_path.
     * 
     * The implemented D-Bus API should be considered private.
     * It is subject to change in the future.
     * 
     * An object path can only have one menu model exported on it. If this
     * constraint is violated, the export will fail and 0 will be
     * returned (with @error set accordingly).
     * 
     * You can unexport the menu model using
     * g_dbus_connection_unexport_menu_model() with the return value of
     * this function.
     */
    public int exportMenuModel(java.lang.String objectPath, MenuModel menu) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_connection_export_menu_model(HANDLE(), Interop.allocateNativeString(objectPath).HANDLE(), menu.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Finishes an operation started with g_dbus_connection_flush().
     */
    public boolean flushFinish(AsyncResult res) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_connection_flush_finish(HANDLE(), res.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Synchronously flushes @connection. The calling thread is blocked
     * until this is done. See g_dbus_connection_flush() for the
     * asynchronous version of this method and more details about what it
     * does.
     */
    public boolean flushSync(Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_connection_flush_sync(HANDLE(), cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Gets the capabilities negotiated with the remote peer
     */
    public int getCapabilities() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_connection_get_capabilities(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets whether the process is terminated when @connection is
     * closed by the remote peer. See
     * #GDBusConnection:exit-on-close for more details.
     */
    public boolean getExitOnClose() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_connection_get_exit_on_close(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the flags used to construct this connection
     */
    public int getFlags() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_connection_get_flags(HANDLE());
        return RESULT;
    }
    
    /**
     * The GUID of the peer performing the role of server when
     * authenticating. See #GDBusConnection:guid for more details.
     */
    public java.lang.String getGuid() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_connection_get_guid(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieves the last serial number assigned to a #GDBusMessage on
     * the current thread. This includes messages sent via both low-level
     * API such as g_dbus_connection_send_message() as well as
     * high-level API such as g_dbus_connection_emit_signal(),
     * g_dbus_connection_call() or g_dbus_proxy_call().
     */
    public int getLastSerial() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_connection_get_last_serial(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the credentials of the authenticated peer. This will always
     * return %NULL unless @connection acted as a server
     * (e.g. %G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_SERVER was passed)
     * when set up and the client passed credentials as part of the
     * authentication process.
     * 
     * In a message bus setup, the message bus is always the server and
     * each application is a client. So this method will always return
     * %NULL for message bus clients.
     */
    public Credentials getPeerCredentials() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_connection_get_peer_credentials(HANDLE());
        return new Credentials(References.get(RESULT, false));
    }
    
    /**
     * Gets the underlying stream used for IO.
     * 
     * While the #GDBusConnection is active, it will interact with this
     * stream from a worker thread, so it is not safe to interact with
     * the stream directly.
     */
    public IOStream getStream() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_connection_get_stream(HANDLE());
        return new IOStream(References.get(RESULT, false));
    }
    
    /**
     * Gets the unique name of @connection as assigned by the message
     * bus. This can also be used to figure out if @connection is a
     * message bus connection.
     */
    public java.lang.String getUniqueName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_connection_get_unique_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets whether @connection is closed.
     */
    public boolean isClosed() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_connection_is_closed(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Version of g_dbus_connection_register_object() using closures instead of a
     * #GDBusInterfaceVTable for easier binding in other languages.
     */
    public int registerObjectWithClosures(java.lang.String objectPath, DBusInterfaceInfo interfaceInfo, org.gtk.gobject.Closure methodCallClosure, org.gtk.gobject.Closure getPropertyClosure, org.gtk.gobject.Closure setPropertyClosure) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_connection_register_object_with_closures(HANDLE(), Interop.allocateNativeString(objectPath).HANDLE(), interfaceInfo.HANDLE(), methodCallClosure.HANDLE(), getPropertyClosure.HANDLE(), setPropertyClosure.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Removes a filter.
     * 
     * Note that since filters run in a different thread, there is a race
     * condition where it is possible that the filter will be running even
     * after calling g_dbus_connection_remove_filter(), so you cannot just
     * free data that the filter might be using. Instead, you should pass
     * a #GDestroyNotify to g_dbus_connection_add_filter(), which will be
     * called when it is guaranteed that the data is no longer needed.
     */
    public void removeFilter(int filterId) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_connection_remove_filter(HANDLE(), filterId);
    }
    
    /**
     * Finishes an operation started with g_dbus_connection_send_message_with_reply().
     * 
     * Note that @error is only set if a local in-process error
     * occurred. That is to say that the returned #GDBusMessage object may
     * be of type %G_DBUS_MESSAGE_TYPE_ERROR. Use
     * g_dbus_message_to_gerror() to transcode this to a #GError.
     * 
     * See this [server][gdbus-server] and [client][gdbus-unix-fd-client]
     * for an example of how to use this low-level API to send and receive
     * UNIX file descriptors.
     */
    public DBusMessage sendMessageWithReplyFinish(AsyncResult res) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_connection_send_message_with_reply_finish(HANDLE(), res.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new DBusMessage(References.get(RESULT, true));
    }
    
    /**
     * Sets whether the process should be terminated when @connection is
     * closed by the remote peer. See #GDBusConnection:exit-on-close for
     * more details.
     * 
     * Note that this function should be used with care. Most modern UNIX
     * desktops tie the notion of a user session with the session bus, and expect
     * all of a user's applications to quit when their bus connection goes away.
     * If you are setting @exit_on_close to %FALSE for the shared session
     * bus connection, you should make sure that your application exits
     * when the user session ends.
     */
    public void setExitOnClose(boolean exitOnClose) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_connection_set_exit_on_close(HANDLE(), exitOnClose ? 1 : 0);
    }
    
    /**
     * Unsubscribes from signals.
     * 
     * Note that there may still be D-Bus traffic to process (relating to this
     * signal subscription) in the current thread-default #GMainContext after this
     * function has returned. You should continue to iterate the #GMainContext
     * until the #GDestroyNotify function passed to
     * g_dbus_connection_signal_subscribe() is called, in order to avoid memory
     * leaks through callbacks queued on the #GMainContext after it’s stopped being
     * iterated.
     * Alternatively, any idle source with a priority lower than %G_PRIORITY_DEFAULT
     * that was scheduled after unsubscription, also indicates that all resources
     * of this subscription are released.
     */
    public void signalUnsubscribe(int subscriptionId) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_connection_signal_unsubscribe(HANDLE(), subscriptionId);
    }
    
    /**
     * If @connection was created with
     * %G_DBUS_CONNECTION_FLAGS_DELAY_MESSAGE_PROCESSING, this method
     * starts processing messages. Does nothing on if @connection wasn't
     * created with this flag or if the method has already been called.
     */
    public void startMessageProcessing() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_connection_start_message_processing(HANDLE());
    }
    
    /**
     * Reverses the effect of a previous call to
     * g_dbus_connection_export_action_group().
     * 
     * It is an error to call this function with an ID that wasn't returned
     * from g_dbus_connection_export_action_group() or to call it with the
     * same ID more than once.
     */
    public void unexportActionGroup(int exportId) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_connection_unexport_action_group(HANDLE(), exportId);
    }
    
    /**
     * Reverses the effect of a previous call to
     * g_dbus_connection_export_menu_model().
     * 
     * It is an error to call this function with an ID that wasn't returned
     * from g_dbus_connection_export_menu_model() or to call it with the
     * same ID more than once.
     */
    public void unexportMenuModel(int exportId) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_connection_unexport_menu_model(HANDLE(), exportId);
    }
    
    /**
     * Unregisters an object.
     */
    public boolean unregisterObject(int registrationId) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_connection_unregister_object(HANDLE(), registrationId);
        return (RESULT != 0);
    }
    
    /**
     * Unregisters a subtree.
     */
    public boolean unregisterSubtree(int registrationId) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_connection_unregister_subtree(HANDLE(), registrationId);
        return (RESULT != 0);
    }
    
    @FunctionalInterface
    public interface ClosedHandler {
        void signalReceived(DBusConnection source, boolean remotePeerVanished, org.gtk.glib.Error error);
    }
    
    /**
     * Emitted when the connection is closed.
     * 
     * The cause of this event can be
     * 
     * - If g_dbus_connection_close() is called. In this case
     *   @remote_peer_vanished is set to %FALSE and @error is %NULL.
     * 
     * - If the remote peer closes the connection. In this case
     *   @remote_peer_vanished is set to %TRUE and @error is set.
     * 
     * - If the remote peer sends invalid or malformed data. In this
     *   case @remote_peer_vanished is set to %FALSE and @error is set.
     * 
     * Upon receiving this signal, you should give up your reference to
     * @connection. You are guaranteed that this signal is emitted only
     * once.
     */
    public void onClosed(ClosedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, boolean.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDBusConnectionClosed", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("closed").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
