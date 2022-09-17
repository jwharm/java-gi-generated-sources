package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
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
 * be used by two threads at the same time, #GDBusConnection&#39;s methods may be
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
 * {@link [gdbus-example-server.c]}(https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-server.c)
 * 
 * ## An example for exporting a subtree # {#gdbus-subtree-server}
 * 
 * Here is an example for exporting a subtree:
 * {@link [gdbus-example-subtree.c]}(https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-subtree.c)
 * 
 * ## An example for file descriptor passing # {#gdbus-unix-fd-client}
 * 
 * Here is an example for passing UNIX file descriptors:
 * {@link [gdbus-unix-fd-client.c]}(https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-unix-fd-client.c)
 * 
 * ## An example for exporting a GObject # {#gdbus-export}
 * 
 * Here is an example for exporting a #GObject:
 * {@link [gdbus-example-export.c]}(https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-export.c)
 */
public class DBusConnection extends org.gtk.gobject.Object implements AsyncInitable, Initable {

    public DBusConnection(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to DBusConnection */
    public static DBusConnection castFrom(org.gtk.gobject.Object gobject) {
        return new DBusConnection(gobject.getReference());
    }
    
    private static Reference constructNewFinish(AsyncResult res) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.g_dbus_connection_new_finish(res.handle(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Finishes an operation started with g_dbus_connection_new().
     */
    public static DBusConnection newFinish(AsyncResult res) throws GErrorException {
        return new DBusConnection(constructNewFinish(res));
    }
    
    private static Reference constructNewForAddressFinish(AsyncResult res) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.g_dbus_connection_new_for_address_finish(res.handle(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Finishes an operation started with g_dbus_connection_new_for_address().
     */
    public static DBusConnection newForAddressFinish(AsyncResult res) throws GErrorException {
        return new DBusConnection(constructNewForAddressFinish(res));
    }
    
    private static Reference constructNewForAddressSync(java.lang.String address, int flags, DBusAuthObserver observer, Cancellable cancellable) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.g_dbus_connection_new_for_address_sync(Interop.allocateNativeString(address).handle(), flags, observer.handle(), cancellable.handle(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Synchronously connects and sets up a D-Bus client connection for
     * exchanging D-Bus messages with an endpoint specified by @address
     * which must be in the
     * {@link [D-Bus address format]}(https://dbus.freedesktop.org/doc/dbus-specification.html#addresses).
     * 
     * This constructor can only be used to initiate client-side
     * connections - use g_dbus_connection_new_sync() if you need to act
     * as the server. In particular, @flags cannot contain the
     * <code>G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_SERVER,
     * %G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS</code> or
     * {@link org.gtk.gio.DBusConnectionFlags#AUTHENTICATION_REQUIRE_SAME_USER} flags.
     * 
     * This is a synchronous failable constructor. See
     * g_dbus_connection_new_for_address() for the asynchronous version.
     * 
     * If @observer is not <code>null</code> it may be used to control the
     * authentication process.
     */
    public static DBusConnection newForAddressSync(java.lang.String address, int flags, DBusAuthObserver observer, Cancellable cancellable) throws GErrorException {
        return new DBusConnection(constructNewForAddressSync(address, flags, observer, cancellable));
    }
    
    private static Reference constructNewSync(IOStream stream, java.lang.String guid, int flags, DBusAuthObserver observer, Cancellable cancellable) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.g_dbus_connection_new_sync(stream.handle(), Interop.allocateNativeString(guid).handle(), flags, observer.handle(), cancellable.handle(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Synchronously sets up a D-Bus connection for exchanging D-Bus messages
     * with the end represented by @stream.
     * 
     * If @stream is a #GSocketConnection, then the corresponding #GSocket
     * will be put into non-blocking mode.
     * 
     * The D-Bus connection will interact with @stream from a worker thread.
     * As a result, the caller should not interact with @stream after this
     * method has been called, except by calling g_object_unref() on it.
     * 
     * If @observer is not <code>null</code> it may be used to control the
     * authentication process.
     * 
     * This is a synchronous failable constructor. See
     * g_dbus_connection_new() for the asynchronous version.
     */
    public static DBusConnection newSync(IOStream stream, java.lang.String guid, int flags, DBusAuthObserver observer, Cancellable cancellable) throws GErrorException {
        return new DBusConnection(constructNewSync(stream, guid, flags, observer, cancellable));
    }
    
    /**
     * Adds a message filter. Filters are handlers that are run on all
     * incoming and outgoing messages, prior to standard dispatch. Filters
     * are run in the order that they were added.  The same handler can be
     * added as a filter more than once, in which case it will be run more
     * than once.  Filters added during a filter callback won&#39;t be run on
     * the message being processed. Filter functions are allowed to modify
     * and even drop messages.
     * 
     * Note that filters are run in a dedicated message handling thread so
     * they can&#39;t block and, generally, can&#39;t do anything but signal a
     * worker thread. Also note that filters are rarely needed - use API
     * such as g_dbus_connection_send_message_with_reply(),
     * g_dbus_connection_signal_subscribe() or g_dbus_connection_call() instead.
     * 
     * If a filter consumes an incoming message the message is not
     * dispatched anywhere else - not even the standard dispatch machinery
     * (that API such as g_dbus_connection_signal_subscribe() and
     * g_dbus_connection_send_message_with_reply() relies on) will see the
     * message. Similarly, if a filter consumes an outgoing message, the
     * message will not be sent to the other peer.
     * 
     * If @user_data_free_func is non-<code>NULL,</code> it will be called (in the
     * thread-default main context of the thread you are calling this
     * method from) at some point after @user_data is no longer
     * needed. (It is not guaranteed to be called synchronously when the
     * filter is removed, and may be called after @connection has been
     * destroyed.)
     */
    public int addFilter(DBusMessageFilterFunction filterFunction) {
        try {
            var RESULT = gtk_h.g_dbus_connection_add_filter(handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbDBusMessageFilterFunction",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, boolean.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(filterFunction.hashCode(), filterFunction)), 
                    Interop.cbDestroyNotifySymbol());
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Asynchronously invokes the @method_name method on the
     * @interface_name D-Bus interface on the remote object at
     * @object_path owned by @bus_name.
     * 
     * If @connection is closed then the operation will fail with
     * <code>G_IO_ERROR_CLOSED.</code> If @cancellable is canceled, the operation will
     * fail with <code>G_IO_ERROR_CANCELLED.</code> If @parameters contains a value
     * not compatible with the D-Bus protocol, the operation fails with
     * <code>G_IO_ERROR_INVALID_ARGUMENT.
     * 
     * If</code> @reply_type is non-<code>null</code> then the reply will be checked for having this type and an
     * error will be raised if it does not match.  Said another way, if you give a @reply_type
     * then any non-<code>null</code> return value will be of this type. Unless it&#8217;s
     * <code>G_VARIANT_TYPE_UNIT,</code> the @reply_type will be a tuple containing one or more
     * values.
     * 
     * If the @parameters #GVariant is floating, it is consumed. This allows
     * convenient &#39;inline&#39; use of g_variant_new(), e.g.:
     * |{@link [&#60;!-- language=&#34;C&#34; --&#62;
     *  g_dbus_connection_call (connection,
     *                          &#34;org.freedesktop.StringThings&#34;,
     *                          &#34;/org/freedesktop/StringThings&#34;,
     *                          &#34;org.freedesktop.StringThings&#34;,
     *                          &#34;TwoStrings&#34;,
     *                          g_variant_new (&#34;(ss)&#34;,
     *                                         &#34;Thing One&#34;,
     *                                         &#34;Thing Two&#34;),
     *                          NULL,
     *                          G_DBUS_CALL_FLAGS_NONE,
     *                          -1,
     *                          NULL,
     *                          (GAsyncReadyCallback) two_strings_done,
     *                          NULL);
     * ]}|
     * 
     * This is an asynchronous method. When the operation is finished,
     * @callback will be invoked in the
     * {@link [thread-default main context]}{@link [g-main-context-push-thread-default]}
     * of the thread you are calling this method from. You can then call
     * g_dbus_connection_call_finish() to get the result of the operation.
     * See g_dbus_connection_call_sync() for the synchronous version of this
     * function.
     * 
     * If @callback is <code>null</code> then the D-Bus method call message will be sent with
     * the {@link org.gtk.gio.DBusMessageFlags#NO_REPLY_EXPECTED} flag set.
     */
    public void call(java.lang.String busName, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String methodName, org.gtk.glib.Variant parameters, org.gtk.glib.VariantType replyType, int flags, int timeoutMsec, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_dbus_connection_call(handle(), Interop.allocateNativeString(busName).handle(), Interop.allocateNativeString(objectPath).handle(), Interop.allocateNativeString(interfaceName).handle(), Interop.allocateNativeString(methodName).handle(), parameters.handle(), replyType.handle(), flags, timeoutMsec, cancellable.handle(), 
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
     * Finishes an operation started with g_dbus_connection_call().
     */
    public org.gtk.glib.Variant callFinish(AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dbus_connection_call_finish(handle(), res.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Synchronously invokes the @method_name method on the
     * @interface_name D-Bus interface on the remote object at
     * @object_path owned by @bus_name.
     * 
     * If @connection is closed then the operation will fail with
     * <code>G_IO_ERROR_CLOSED.</code> If @cancellable is canceled, the
     * operation will fail with <code>G_IO_ERROR_CANCELLED.</code> If @parameters
     * contains a value not compatible with the D-Bus protocol, the operation
     * fails with <code>G_IO_ERROR_INVALID_ARGUMENT.
     * 
     * If</code> @reply_type is non-<code>null</code> then the reply will be checked for having
     * this type and an error will be raised if it does not match.  Said
     * another way, if you give a @reply_type then any non-<code>null</code> return
     * value will be of this type.
     * 
     * If the @parameters #GVariant is floating, it is consumed.
     * This allows convenient &#39;inline&#39; use of g_variant_new(), e.g.:
     * |{@link [&#60;!-- language=&#34;C&#34; --&#62;
     *  g_dbus_connection_call_sync (connection,
     *                               &#34;org.freedesktop.StringThings&#34;,
     *                               &#34;/org/freedesktop/StringThings&#34;,
     *                               &#34;org.freedesktop.StringThings&#34;,
     *                               &#34;TwoStrings&#34;,
     *                               g_variant_new (&#34;(ss)&#34;,
     *                                              &#34;Thing One&#34;,
     *                                              &#34;Thing Two&#34;),
     *                               NULL,
     *                               G_DBUS_CALL_FLAGS_NONE,
     *                               -1,
     *                               NULL,
     *                               &#38;error);
     * ]}|
     * 
     * The calling thread is blocked until a reply is received. See
     * g_dbus_connection_call() for the asynchronous version of
     * this method.
     */
    public org.gtk.glib.Variant callSync(java.lang.String busName, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String methodName, org.gtk.glib.Variant parameters, org.gtk.glib.VariantType replyType, int flags, int timeoutMsec, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dbus_connection_call_sync(handle(), Interop.allocateNativeString(busName).handle(), Interop.allocateNativeString(objectPath).handle(), Interop.allocateNativeString(interfaceName).handle(), Interop.allocateNativeString(methodName).handle(), parameters.handle(), replyType.handle(), flags, timeoutMsec, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Like g_dbus_connection_call() but also takes a #GUnixFDList object.
     * <p>
     * The file descriptors normally correspond to <code>G_VARIANT_TYPE_HANDLE
     * values</code> in the body of the message. For example, if a message contains
     * two file descriptors, @fd_list would have length 2, and<code>g_variant_new_handle (0)</code> and <code>g_variant_new_handle (1)</code> would appear
     * somewhere in the body of the message (not necessarily in that order!)
     * to represent the file descriptors at indexes 0 and 1 respectively.
     * 
     * When designing D-Bus APIs that are intended to be interoperable,
     * please note that non-GDBus implementations of D-Bus can usually only
     * access file descriptors if they are referenced in this way by a
     * value of type <code>G_VARIANT_TYPE_HANDLE</code> in the body of the message.
     * 
     * This method is only available on UNIX.
     */
    public void callWithUnixFdList(java.lang.String busName, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String methodName, org.gtk.glib.Variant parameters, org.gtk.glib.VariantType replyType, int flags, int timeoutMsec, UnixFDList fdList, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_dbus_connection_call_with_unix_fd_list(handle(), Interop.allocateNativeString(busName).handle(), Interop.allocateNativeString(objectPath).handle(), Interop.allocateNativeString(interfaceName).handle(), Interop.allocateNativeString(methodName).handle(), parameters.handle(), replyType.handle(), flags, timeoutMsec, fdList.handle(), cancellable.handle(), 
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
     * Finishes an operation started with g_dbus_connection_call_with_unix_fd_list().
     * <p>
     * The file descriptors normally correspond to <code>G_VARIANT_TYPE_HANDLE
     * values</code> in the body of the message. For example,
     * if g_variant_get_handle() returns 5, that is intended to be a reference
     * to the file descriptor that can be accessed by<code>g_unix_fd_list_get (*out_fd_list, 5, ...)</code>.
     * 
     * When designing D-Bus APIs that are intended to be interoperable,
     * please note that non-GDBus implementations of D-Bus can usually only
     * access file descriptors if they are referenced in this way by a
     * value of type <code>G_VARIANT_TYPE_HANDLE</code> in the body of the message.
     */
    public org.gtk.glib.Variant callWithUnixFdListFinish(UnixFDList[] outFdList, AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dbus_connection_call_with_unix_fd_list_finish(handle(), Interop.allocateNativeArray(outFdList).handle(), res.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
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
    public org.gtk.glib.Variant callWithUnixFdListSync(java.lang.String busName, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String methodName, org.gtk.glib.Variant parameters, org.gtk.glib.VariantType replyType, int flags, int timeoutMsec, UnixFDList fdList, UnixFDList[] outFdList, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dbus_connection_call_with_unix_fd_list_sync(handle(), Interop.allocateNativeString(busName).handle(), Interop.allocateNativeString(objectPath).handle(), Interop.allocateNativeString(interfaceName).handle(), Interop.allocateNativeString(methodName).handle(), parameters.handle(), replyType.handle(), flags, timeoutMsec, fdList.handle(), Interop.allocateNativeArray(outFdList).handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Closes @connection. Note that this never causes the process to
     * exit (this might only happen if the other end of a shared message
     * bus connection disconnects, see #GDBusConnection:exit-on-close).
     * 
     * Once the connection is closed, operations such as sending a message
     * will return with the error <code>G_IO_ERROR_CLOSED.</code> Closing a connection
     * will not automatically flush the connection so queued messages may
     * be lost. Use g_dbus_connection_flush() if you need such guarantees.
     * 
     * If @connection is already closed, this method fails with
     * <code>G_IO_ERROR_CLOSED.
     * 
     * When</code> @connection has been closed, the #GDBusConnection::closed
     * signal is emitted in the
     * {@link [thread-default main context]}{@link [g-main-context-push-thread-default]}
     * of the thread that @connection was constructed in.
     * 
     * This is an asynchronous method. When the operation is finished,
     * @callback will be invoked in the
     * {@link [thread-default main context]}{@link [g-main-context-push-thread-default]}
     * of the thread you are calling this method from. You can
     * then call g_dbus_connection_close_finish() to get the result of the
     * operation. See g_dbus_connection_close_sync() for the synchronous
     * version.
     */
    public void close(Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_dbus_connection_close(handle(), cancellable.handle(), 
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
     * Finishes an operation started with g_dbus_connection_close().
     */
    public boolean closeFinish(AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dbus_connection_close_finish(handle(), res.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Synchronously closes @connection. The calling thread is blocked
     * until this is done. See g_dbus_connection_close() for the
     * asynchronous version of this method and more details about what it
     * does.
     */
    public boolean closeSync(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dbus_connection_close_sync(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Emits a signal.
     * 
     * If the parameters GVariant is floating, it is consumed.
     * 
     * This can only fail if @parameters is not compatible with the D-Bus protocol
     * (<code>G_IO_ERROR_INVALID_ARGUMENT),</code> or if @connection has been closed
     * (or if @connection has been closed
     * (%G_IO_ERROR_CLOSED).
     */
    public boolean emitSignal(java.lang.String destinationBusName, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String signalName, org.gtk.glib.Variant parameters) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dbus_connection_emit_signal(handle(), Interop.allocateNativeString(destinationBusName).handle(), Interop.allocateNativeString(objectPath).handle(), Interop.allocateNativeString(interfaceName).handle(), Interop.allocateNativeString(signalName).handle(), parameters.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
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
    public int exportActionGroup(java.lang.String objectPath, ActionGroup actionGroup) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dbus_connection_export_action_group(handle(), Interop.allocateNativeString(objectPath).handle(), actionGroup.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
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
    public int exportMenuModel(java.lang.String objectPath, MenuModel menu) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dbus_connection_export_menu_model(handle(), Interop.allocateNativeString(objectPath).handle(), menu.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Asynchronously flushes @connection, that is, writes all queued
     * outgoing message to the transport and then flushes the transport
     * (using g_output_stream_flush_async()). This is useful in programs
     * that wants to emit a D-Bus signal and then exit immediately. Without
     * flushing the connection, there is no guaranteed that the message has
     * been sent to the networking buffers in the OS kernel.
     * 
     * This is an asynchronous method. When the operation is finished,
     * @callback will be invoked in the
     * {@link [thread-default main context]}{@link [g-main-context-push-thread-default]}
     * of the thread you are calling this method from. You can
     * then call g_dbus_connection_flush_finish() to get the result of the
     * operation. See g_dbus_connection_flush_sync() for the synchronous
     * version.
     */
    public void flush(Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_dbus_connection_flush(handle(), cancellable.handle(), 
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
     * Finishes an operation started with g_dbus_connection_flush().
     */
    public boolean flushFinish(AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dbus_connection_flush_finish(handle(), res.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Synchronously flushes @connection. The calling thread is blocked
     * until this is done. See g_dbus_connection_flush() for the
     * asynchronous version of this method and more details about what it
     * does.
     */
    public boolean flushSync(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dbus_connection_flush_sync(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Gets the capabilities negotiated with the remote peer
     */
    public int getCapabilities() {
        var RESULT = gtk_h.g_dbus_connection_get_capabilities(handle());
        return RESULT;
    }
    
    /**
     * Gets whether the process is terminated when @connection is
     * closed by the remote peer. See
     * #GDBusConnection:exit-on-close for more details.
     */
    public boolean getExitOnClose() {
        var RESULT = gtk_h.g_dbus_connection_get_exit_on_close(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the flags used to construct this connection
     */
    public int getFlags() {
        var RESULT = gtk_h.g_dbus_connection_get_flags(handle());
        return RESULT;
    }
    
    /**
     * The GUID of the peer performing the role of server when
     * authenticating. See #GDBusConnection:guid for more details.
     */
    public java.lang.String getGuid() {
        var RESULT = gtk_h.g_dbus_connection_get_guid(handle());
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
        var RESULT = gtk_h.g_dbus_connection_get_last_serial(handle());
        return RESULT;
    }
    
    /**
     * Gets the credentials of the authenticated peer. This will always
     * return <code>null</code> unless @connection acted as a server
     * (e.g. {@link org.gtk.gio.DBusConnectionFlags#AUTHENTICATION_SERVER} was passed)
     * when set up and the client passed credentials as part of the
     * authentication process.
     * 
     * In a message bus setup, the message bus is always the server and
     * each application is a client. So this method will always return
     * <code>null</code> for message bus clients.
     */
    public Credentials getPeerCredentials() {
        var RESULT = gtk_h.g_dbus_connection_get_peer_credentials(handle());
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
        var RESULT = gtk_h.g_dbus_connection_get_stream(handle());
        return new IOStream(References.get(RESULT, false));
    }
    
    /**
     * Gets the unique name of @connection as assigned by the message
     * bus. This can also be used to figure out if @connection is a
     * message bus connection.
     */
    public java.lang.String getUniqueName() {
        var RESULT = gtk_h.g_dbus_connection_get_unique_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets whether @connection is closed.
     */
    public boolean isClosed() {
        var RESULT = gtk_h.g_dbus_connection_is_closed(handle());
        return (RESULT != 0);
    }
    
    /**
     * Registers callbacks for exported objects at @object_path with the
     * D-Bus interface that is described in @interface_info.
     * <p>
     * Calls to functions in @vtable (and @user_data_free_func) will happen
     * in the
     * {@link [thread-default main context]}{@link [g-main-context-push-thread-default]}
     * of the thread you are calling this method from.
     * <p>
     * Note that all #GVariant values passed to functions in @vtable will match
     * the signature given in @interface_info - if a remote caller passes
     * incorrect values, the <code>org.freedesktop.DBus.Error.InvalidArgs</code>
     * is returned to the remote caller.
     * <p>
     * Additionally, if the remote caller attempts to invoke methods or
     * access properties not mentioned in @interface_info the<code>org.freedesktop.DBus.Error.UnknownMethod</code> resp.<code>org.freedesktop.DBus.Error.InvalidArgs</code> errors
     * are returned to the caller.
     * 
     * It is considered a programming error if the
     * #GDBusInterfaceGetPropertyFunc function in @vtable returns a
     * #GVariant of incorrect type.
     * 
     * If an existing callback is already registered at @object_path and
     * @interface_name, then @error is set to <code>G_IO_ERROR_EXISTS.
     * 
     * GDBus</code> automatically implements the standard D-Bus interfaces
     * org.freedesktop.DBus.Properties, org.freedesktop.DBus.Introspectable
     * and org.freedesktop.Peer, so you don&#39;t have to implement those for the
     * objects you export. You can implement org.freedesktop.DBus.Properties
     * yourself, e.g. to handle getting and setting of properties asynchronously.
     * 
     * Note that the reference count on @interface_info will be
     * incremented by 1 (unless allocated statically, e.g. if the
     * reference count is -1, see g_dbus_interface_info_ref()) for as long
     * as the object is exported. Also note that @vtable will be copied.
     * 
     * See this {@link [server]}{@link [gdbus-server]} for an example of how to use this method.
     */
    public int registerObject(java.lang.String objectPath, DBusInterfaceInfo interfaceInfo, DBusInterfaceVTable vtable, jdk.incubator.foreign.MemoryAddress userData, org.gtk.glib.DestroyNotify userDataFreeFunc) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dbus_connection_register_object(handle(), Interop.allocateNativeString(objectPath).handle(), interfaceInfo.handle(), vtable.handle(), userData, 
                    Interop.cbDestroyNotifySymbol(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Version of g_dbus_connection_register_object() using closures instead of a
     * #GDBusInterfaceVTable for easier binding in other languages.
     */
    public int registerObjectWithClosures(java.lang.String objectPath, DBusInterfaceInfo interfaceInfo, org.gtk.gobject.Closure methodCallClosure, org.gtk.gobject.Closure getPropertyClosure, org.gtk.gobject.Closure setPropertyClosure) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dbus_connection_register_object_with_closures(handle(), Interop.allocateNativeString(objectPath).handle(), interfaceInfo.handle(), methodCallClosure.handle(), getPropertyClosure.handle(), setPropertyClosure.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Registers a whole subtree of dynamic objects.
     * 
     * The @enumerate and @introspection functions in @vtable are used to
     * convey, to remote callers, what nodes exist in the subtree rooted
     * by @object_path.
     * 
     * When handling remote calls into any node in the subtree, first the
     * @enumerate function is used to check if the node exists. If the node exists
     * or the {@link org.gtk.gio.DBusSubtreeFlags#DISPATCH_TO_UNENUMERATED_NODES} flag is set
     * the @introspection function is used to check if the node supports the
     * requested method. If so, the @dispatch function is used to determine
     * where to dispatch the call. The collected #GDBusInterfaceVTable and
     * #gpointer will be used to call into the interface vtable for processing
     * the request.
     * 
     * All calls into user-provided code will be invoked in the
     * {@link [thread-default main context]}{@link [g-main-context-push-thread-default]}
     * of the thread you are calling this method from.
     * 
     * If an existing subtree is already registered at @object_path or
     * then @error is set to <code>G_IO_ERROR_EXISTS.
     * 
     * Note</code> that it is valid to register regular objects (using
     * g_dbus_connection_register_object()) in a subtree registered with
     * g_dbus_connection_register_subtree() - if so, the subtree handler
     * is tried as the last resort. One way to think about a subtree
     * handler is to consider it a fallback handler for object paths not
     * registered via g_dbus_connection_register_object() or other bindings.
     * 
     * Note that @vtable will be copied so you cannot change it after
     * registration.
     * 
     * See this {@link [server]}{@link [gdbus-subtree-server]} for an example of how to use
     * this method.
     */
    public int registerSubtree(java.lang.String objectPath, DBusSubtreeVTable vtable, int flags, jdk.incubator.foreign.MemoryAddress userData, org.gtk.glib.DestroyNotify userDataFreeFunc) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dbus_connection_register_subtree(handle(), Interop.allocateNativeString(objectPath).handle(), vtable.handle(), flags, userData, 
                    Interop.cbDestroyNotifySymbol(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
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
        gtk_h.g_dbus_connection_remove_filter(handle(), filterId);
    }
    
    /**
     * Finishes an operation started with g_dbus_connection_send_message_with_reply().
     * 
     * Note that @error is only set if a local in-process error
     * occurred. That is to say that the returned #GDBusMessage object may
     * be of type <code>G_DBUS_MESSAGE_TYPE_ERROR.</code> Use
     * g_dbus_message_to_gerror() to transcode this to a #GError.
     * 
     * See this {@link [server]}{@link [gdbus-server]} and {@link [client]}{@link [gdbus-unix-fd-client]}
     * for an example of how to use this low-level API to send and receive
     * UNIX file descriptors.
     */
    public DBusMessage sendMessageWithReplyFinish(AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dbus_connection_send_message_with_reply_finish(handle(), res.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
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
     * all of a user&#39;s applications to quit when their bus connection goes away.
     * If you are setting @exit_on_close to <code>false</code> for the shared session
     * bus connection, you should make sure that your application exits
     * when the user session ends.
     */
    public void setExitOnClose(boolean exitOnClose) {
        gtk_h.g_dbus_connection_set_exit_on_close(handle(), exitOnClose ? 1 : 0);
    }
    
    /**
     * Subscribes to signals on @connection and invokes @callback with a whenever
     * the signal is received. Note that @callback will be invoked in the
     * {@link [thread-default main context]}{@link [g-main-context-push-thread-default]}
     * of the thread you are calling this method from.
     * 
     * If @connection is not a message bus connection, @sender must be
     * <code>NULL.
     * 
     * If</code> @sender is a well-known name note that @callback is invoked with
     * the unique name for the owner of @sender, not the well-known name
     * as one would expect. This is because the message bus rewrites the
     * name. As such, to avoid certain race conditions, users should be
     * tracking the name owner of the well-known name and use that when
     * processing the received signal.
     * 
     * If one of {@link org.gtk.gio.DBusSignalFlags#MATCH_ARG0_NAMESPACE} or
     * {@link org.gtk.gio.DBusSignalFlags#MATCH_ARG0_PATH} are given, @arg0 is
     * interpreted as part of a namespace or path.  The first argument
     * of a signal is matched against that part as specified by D-Bus.
     * 
     * If @user_data_free_func is non-<code>NULL,</code> it will be called (in the
     * thread-default main context of the thread you are calling this
     * method from) at some point after @user_data is no longer
     * needed. (It is not guaranteed to be called synchronously when the
     * signal is unsubscribed from, and may be called after @connection
     * has been destroyed.)
     * 
     * As @callback is potentially invoked in a different thread from where it&#8217;s
     * emitted, it&#8217;s possible for this to happen after
     * g_dbus_connection_signal_unsubscribe() has been called in another thread.
     * Due to this, @user_data should have a strong reference which is freed with
     * @user_data_free_func, rather than pointing to data whose lifecycle is tied
     * to the signal subscription. For example, if a #GObject is used to store the
     * subscription ID from g_dbus_connection_signal_subscribe(), a strong reference
     * to that #GObject must be passed to @user_data, and g_object_unref() passed to
     * @user_data_free_func. You are responsible for breaking the resulting
     * reference count cycle by explicitly unsubscribing from the signal when
     * dropping the last external reference to the #GObject. Alternatively, a weak
     * reference may be used.
     * 
     * It is guaranteed that if you unsubscribe from a signal using
     * g_dbus_connection_signal_unsubscribe() from the same thread which made the
     * corresponding g_dbus_connection_signal_subscribe() call, @callback will not
     * be invoked after g_dbus_connection_signal_unsubscribe() returns.
     * 
     * The returned subscription identifier is an opaque value which is guaranteed
     * to never be zero.
     * 
     * This function can never fail.
     */
    public int signalSubscribe(java.lang.String sender, java.lang.String interfaceName, java.lang.String member, java.lang.String objectPath, java.lang.String arg0, int flags, DBusSignalCallback callback) {
        try {
            var RESULT = gtk_h.g_dbus_connection_signal_subscribe(handle(), Interop.allocateNativeString(sender).handle(), Interop.allocateNativeString(interfaceName).handle(), Interop.allocateNativeString(member).handle(), Interop.allocateNativeString(objectPath).handle(), Interop.allocateNativeString(arg0).handle(), flags, 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbDBusSignalCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)), 
                    Interop.cbDestroyNotifySymbol());
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Unsubscribes from signals.
     * 
     * Note that there may still be D-Bus traffic to process (relating to this
     * signal subscription) in the current thread-default #GMainContext after this
     * function has returned. You should continue to iterate the #GMainContext
     * until the #GDestroyNotify function passed to
     * g_dbus_connection_signal_subscribe() is called, in order to avoid memory
     * leaks through callbacks queued on the #GMainContext after it&#8217;s stopped being
     * iterated.
     * Alternatively, any idle source with a priority lower than <code>G_PRIORITY_DEFAULT
     * that</code> was scheduled after unsubscription, also indicates that all resources
     * of this subscription are released.
     */
    public void signalUnsubscribe(int subscriptionId) {
        gtk_h.g_dbus_connection_signal_unsubscribe(handle(), subscriptionId);
    }
    
    /**
     * If @connection was created with
     * <code>G_DBUS_CONNECTION_FLAGS_DELAY_MESSAGE_PROCESSING,</code> this method
     * starts processing messages. Does nothing on if @connection wasn&#39;t
     * created with this flag or if the method has already been called.
     */
    public void startMessageProcessing() {
        gtk_h.g_dbus_connection_start_message_processing(handle());
    }
    
    /**
     * Reverses the effect of a previous call to
     * g_dbus_connection_export_action_group().
     * 
     * It is an error to call this function with an ID that wasn&#39;t returned
     * from g_dbus_connection_export_action_group() or to call it with the
     * same ID more than once.
     */
    public void unexportActionGroup(int exportId) {
        gtk_h.g_dbus_connection_unexport_action_group(handle(), exportId);
    }
    
    /**
     * Reverses the effect of a previous call to
     * g_dbus_connection_export_menu_model().
     * 
     * It is an error to call this function with an ID that wasn&#39;t returned
     * from g_dbus_connection_export_menu_model() or to call it with the
     * same ID more than once.
     */
    public void unexportMenuModel(int exportId) {
        gtk_h.g_dbus_connection_unexport_menu_model(handle(), exportId);
    }
    
    /**
     * Unregisters an object.
     */
    public boolean unregisterObject(int registrationId) {
        var RESULT = gtk_h.g_dbus_connection_unregister_object(handle(), registrationId);
        return (RESULT != 0);
    }
    
    /**
     * Unregisters a subtree.
     */
    public boolean unregisterSubtree(int registrationId) {
        var RESULT = gtk_h.g_dbus_connection_unregister_subtree(handle(), registrationId);
        return (RESULT != 0);
    }
    
    /**
     * Asynchronously sets up a D-Bus connection for exchanging D-Bus messages
     * with the end represented by @stream.
     * 
     * If @stream is a #GSocketConnection, then the corresponding #GSocket
     * will be put into non-blocking mode.
     * 
     * The D-Bus connection will interact with @stream from a worker thread.
     * As a result, the caller should not interact with @stream after this
     * method has been called, except by calling g_object_unref() on it.
     * 
     * If @observer is not <code>null</code> it may be used to control the
     * authentication process.
     * 
     * When the operation is finished, @callback will be invoked. You can
     * then call g_dbus_connection_new_finish() to get the result of the
     * operation.
     * 
     * This is an asynchronous failable constructor. See
     * g_dbus_connection_new_sync() for the synchronous
     * version.
     */
    public static void new_(IOStream stream, java.lang.String guid, int flags, DBusAuthObserver observer, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_dbus_connection_new(stream.handle(), Interop.allocateNativeString(guid).handle(), flags, observer.handle(), cancellable.handle(), 
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
     * Asynchronously connects and sets up a D-Bus client connection for
     * exchanging D-Bus messages with an endpoint specified by @address
     * which must be in the
     * {@link [D-Bus address format]}(https://dbus.freedesktop.org/doc/dbus-specification.html#addresses).
     * 
     * This constructor can only be used to initiate client-side
     * connections - use g_dbus_connection_new() if you need to act as the
     * server. In particular, @flags cannot contain the
     * <code>G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_SERVER,
     * %G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS</code> or
     * {@link org.gtk.gio.DBusConnectionFlags#AUTHENTICATION_REQUIRE_SAME_USER} flags.
     * 
     * When the operation is finished, @callback will be invoked. You can
     * then call g_dbus_connection_new_for_address_finish() to get the result of
     * the operation.
     * 
     * If @observer is not <code>null</code> it may be used to control the
     * authentication process.
     * 
     * This is an asynchronous failable constructor. See
     * g_dbus_connection_new_for_address_sync() for the synchronous
     * version.
     */
    public static void newForAddress(java.lang.String address, int flags, DBusAuthObserver observer, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_dbus_connection_new_for_address(Interop.allocateNativeString(address).handle(), flags, observer.handle(), cancellable.handle(), 
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
     *   @remote_peer_vanished is set to <code>false</code> and @error is <code>NULL.
     * 
     * -</code> If the remote peer closes the connection. In this case
     *   @remote_peer_vanished is set to <code>true</code> and @error is set.
     * 
     * - If the remote peer sends invalid or malformed data. In this
     *   case @remote_peer_vanished is set to <code>false</code> and @error is set.
     * 
     * Upon receiving this signal, you should give up your reference to
     * @connection. You are guaranteed that this signal is emitted only
     * once.
     */
    public SignalHandle onClosed(ClosedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, boolean.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDBusConnectionClosed", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("closed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
