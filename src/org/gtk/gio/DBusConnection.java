package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@link DBusConnection} type is used for D-Bus connections to remote
 * peers such as a message buses. It is a low-level API that offers a
 * lot of flexibility. For instance, it lets you establish a connection
 * over any transport that can by represented as a {@link IOStream}.
 * <p>
 * This class is rarely used directly in D-Bus clients. If you are writing
 * a D-Bus client, it is often easier to use the g_bus_own_name(),
 * g_bus_watch_name() or g_dbus_proxy_new_for_bus() APIs.
 * <p>
 * As an exception to the usual GLib rule that a particular object must not
 * be used by two threads at the same time, {@link DBusConnection}'s methods may be
 * called from any thread. This is so that g_bus_get() and g_bus_get_sync()
 * can safely return the same {@link DBusConnection} when called from any thread.
 * <p>
 * Most of the ways to obtain a {@link DBusConnection} automatically initialize it
 * (i.e. connect to D-Bus): for instance, g_dbus_connection_new() and
 * g_bus_get(), and the synchronous versions of those methods, give you an
 * initialized connection. Language bindings for GIO should use
 * g_initable_new() or g_async_initable_new_async(), which also initialize the
 * connection.
 * <p>
 * If you construct an uninitialized {@link DBusConnection}, such as via
 * g_object_new(), you must initialize it via g_initable_init() or
 * g_async_initable_init_async() before using its methods or properties.
 * Calling methods or accessing properties on a {@link DBusConnection} that has not
 * completed initialization successfully is considered to be invalid, and leads
 * to undefined behaviour. In particular, if initialization fails with a
 * {@link org.gtk.glib.Error}, the only valid thing you can do with that {@link DBusConnection} is to
 * free it with g_object_unref().
 * <p>
 * <h2>An example D-Bus server # {#gdbus-server}</h2>
 * <p>
 * Here is an example for a D-Bus server:
 * <a href="https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-server.c">gdbus-example-server.c</a>
 * <p>
 * <h2>An example for exporting a subtree # {#gdbus-subtree-server}</h2>
 * <p>
 * Here is an example for exporting a subtree:
 * <a href="https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-subtree.c">gdbus-example-subtree.c</a>
 * <p>
 * <h2>An example for file descriptor passing # {#gdbus-unix-fd-client}</h2>
 * <p>
 * Here is an example for passing UNIX file descriptors:
 * <a href="https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-unix-fd-client.c">gdbus-unix-fd-client.c</a>
 * <p>
 * <h2>An example for exporting a GObject # {#gdbus-export}</h2>
 * <p>
 * Here is an example for exporting a {@link org.gtk.gobject.Object}:
 * <a href="https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-export.c">gdbus-example-export.c</a>
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
    
    private static Reference constructNewForAddressSync(java.lang.String address, DBusConnectionFlags flags, DBusAuthObserver observer, Cancellable cancellable) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.g_dbus_connection_new_for_address_sync(Interop.allocateNativeString(address).handle(), flags.getValue(), observer.handle(), cancellable.handle(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Synchronously connects and sets up a D-Bus client connection for
     * exchanging D-Bus messages with an endpoint specified by {@code address}
     * which must be in the
     * <a href="https://dbus.freedesktop.org/doc/dbus-specification.html#addresses">D-Bus address format</a>.
     * <p>
     * This constructor can only be used to initiate client-side
     * connections - use g_dbus_connection_new_sync() if you need to act
     * as the server. In particular, {@code flags} cannot contain the
     * {@link DBusConnectionFlags#AUTHENTICATION_SERVER},
     * {@link DBusConnectionFlags#AUTHENTICATION_ALLOW_ANONYMOUS} or
     * {@link DBusConnectionFlags#AUTHENTICATION_REQUIRE_SAME_USER} flags.
     * <p>
     * This is a synchronous failable constructor. See
     * g_dbus_connection_new_for_address() for the asynchronous version.
     * <p>
     * If {@code observer} is not {@code null} it may be used to control the
     * authentication process.
     */
    public static DBusConnection newForAddressSync(java.lang.String address, DBusConnectionFlags flags, DBusAuthObserver observer, Cancellable cancellable) throws GErrorException {
        return new DBusConnection(constructNewForAddressSync(address, flags, observer, cancellable));
    }
    
    private static Reference constructNewSync(IOStream stream, java.lang.String guid, DBusConnectionFlags flags, DBusAuthObserver observer, Cancellable cancellable) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.g_dbus_connection_new_sync(stream.handle(), Interop.allocateNativeString(guid).handle(), flags.getValue(), observer.handle(), cancellable.handle(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Synchronously sets up a D-Bus connection for exchanging D-Bus messages
     * with the end represented by {@code stream}.
     * <p>
     * If {@code stream} is a {@link SocketConnection}, then the corresponding {@link Socket}
     * will be put into non-blocking mode.
     * <p>
     * The D-Bus connection will interact with {@code stream} from a worker thread.
     * As a result, the caller should not interact with {@code stream} after this
     * method has been called, except by calling g_object_unref() on it.
     * <p>
     * If {@code observer} is not {@code null} it may be used to control the
     * authentication process.
     * <p>
     * This is a synchronous failable constructor. See
     * g_dbus_connection_new() for the asynchronous version.
     */
    public static DBusConnection newSync(IOStream stream, java.lang.String guid, DBusConnectionFlags flags, DBusAuthObserver observer, Cancellable cancellable) throws GErrorException {
        return new DBusConnection(constructNewSync(stream, guid, flags, observer, cancellable));
    }
    
    /**
     * Adds a message filter. Filters are handlers that are run on all
     * incoming and outgoing messages, prior to standard dispatch. Filters
     * are run in the order that they were added.  The same handler can be
     * added as a filter more than once, in which case it will be run more
     * than once.  Filters added during a filter callback won't be run on
     * the message being processed. Filter functions are allowed to modify
     * and even drop messages.
     * <p>
     * Note that filters are run in a dedicated message handling thread so
     * they can't block and, generally, can't do anything but signal a
     * worker thread. Also note that filters are rarely needed - use API
     * such as g_dbus_connection_send_message_with_reply(),
     * g_dbus_connection_signal_subscribe() or g_dbus_connection_call() instead.
     * <p>
     * If a filter consumes an incoming message the message is not
     * dispatched anywhere else - not even the standard dispatch machinery
     * (that API such as g_dbus_connection_signal_subscribe() and
     * g_dbus_connection_send_message_with_reply() relies on) will see the
     * message. Similarly, if a filter consumes an outgoing message, the
     * message will not be sent to the other peer.
     * <p>
     * If {@code user_data_free_func} is non-{@code null}, it will be called (in the
     * thread-default main context of the thread you are calling this
     * method from) at some point after {@code user_data} is no longer
     * needed. (It is not guaranteed to be called synchronously when the
     * filter is removed, and may be called after {@code connection} has been
     * destroyed.)
     */
    public int addFilter(DBusMessageFilterFunction filterFunction) {
        try {
            var RESULT = gtk_h.g_dbus_connection_add_filter(handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbDBusMessageFilterFunction",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, boolean.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(filterFunction.hashCode(), filterFunction)), 
                    Interop.cbDestroyNotifySymbol());
            return RESULT;
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Asynchronously invokes the {@code method_name} method on the
     * {@code interface_name} D-Bus interface on the remote object at
     * {@code object_path} owned by {@code bus_name}.
     * <p>
     * If {@code connection} is closed then the operation will fail with
     * {@link IOErrorEnum#CLOSED}. If {@code cancellable} is canceled, the operation will
     * fail with {@link IOErrorEnum#CANCELLED}. If {@code parameters} contains a value
     * not compatible with the D-Bus protocol, the operation fails with
     * {@link IOErrorEnum#INVALID_ARGUMENT}.
     * <p>
     * If {@code reply_type} is non-{@code null} then the reply will be checked for having this type and an
     * error will be raised if it does not match.  Said another way, if you give a {@code reply_type}
     * then any non-{@code null} return value will be of this type. Unless it’s
     * {@code G_VARIANT_TYPE_UNIT}, the {@code reply_type} will be a tuple containing one or more
     * values.
     * <p>
     * If the {@code parameters} {@link org.gtk.glib.Variant} is floating, it is consumed. This allows
     * convenient 'inline' use of g_variant_new(), e.g.:
     * <pre>{@code <!-- language="C" -->
     *  g_dbus_connection_call (connection,
     *                          "org.freedesktop.StringThings",
     *                          "/org/freedesktop/StringThings",
     *                          "org.freedesktop.StringThings",
     *                          "TwoStrings",
     *                          g_variant_new ("(ss)",
     *                                         "Thing One",
     *                                         "Thing Two"),
     *                          NULL,
     *                          G_DBUS_CALL_FLAGS_NONE,
     *                          -1,
     *                          NULL,
     *                          (GAsyncReadyCallback) two_strings_done,
     *                          NULL);
     * }</pre>
     * <p>
     * This is an asynchronous method. When the operation is finished,
     * {@code callback} will be invoked in the
     * [thread-default main context][g-main-context-push-thread-default]
     * of the thread you are calling this method from. You can then call
     * g_dbus_connection_call_finish() to get the result of the operation.
     * See g_dbus_connection_call_sync() for the synchronous version of this
     * function.
     * <p>
     * If {@code callback} is {@code null} then the D-Bus method call message will be sent with
     * the {@link DBusMessageFlags#NO_REPLY_EXPECTED} flag set.
     */
    public void call(java.lang.String busName, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String methodName, org.gtk.glib.Variant parameters, org.gtk.glib.VariantType replyType, DBusCallFlags flags, int timeoutMsec, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_dbus_connection_call(handle(), Interop.allocateNativeString(busName).handle(), Interop.allocateNativeString(objectPath).handle(), Interop.allocateNativeString(interfaceName).handle(), Interop.allocateNativeString(methodName).handle(), parameters.handle(), replyType.handle(), flags.getValue(), timeoutMsec, cancellable.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
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
     * Synchronously invokes the {@code method_name} method on the
     * {@code interface_name} D-Bus interface on the remote object at
     * {@code object_path} owned by {@code bus_name}.
     * <p>
     * If {@code connection} is closed then the operation will fail with
     * {@link IOErrorEnum#CLOSED}. If {@code cancellable} is canceled, the
     * operation will fail with {@link IOErrorEnum#CANCELLED}. If {@code parameters}
     * contains a value not compatible with the D-Bus protocol, the operation
     * fails with {@link IOErrorEnum#INVALID_ARGUMENT}.
     * <p>
     * If {@code reply_type} is non-{@code null} then the reply will be checked for having
     * this type and an error will be raised if it does not match.  Said
     * another way, if you give a {@code reply_type} then any non-{@code null} return
     * value will be of this type.
     * <p>
     * If the {@code parameters} {@link org.gtk.glib.Variant} is floating, it is consumed.
     * This allows convenient 'inline' use of g_variant_new(), e.g.:
     * <pre>{@code <!-- language="C" -->
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
     * }</pre>
     * <p>
     * The calling thread is blocked until a reply is received. See
     * g_dbus_connection_call() for the asynchronous version of
     * this method.
     */
    public org.gtk.glib.Variant callSync(java.lang.String busName, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String methodName, org.gtk.glib.Variant parameters, org.gtk.glib.VariantType replyType, DBusCallFlags flags, int timeoutMsec, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dbus_connection_call_sync(handle(), Interop.allocateNativeString(busName).handle(), Interop.allocateNativeString(objectPath).handle(), Interop.allocateNativeString(interfaceName).handle(), Interop.allocateNativeString(methodName).handle(), parameters.handle(), replyType.handle(), flags.getValue(), timeoutMsec, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Like g_dbus_connection_call() but also takes a {@link UnixFDList} object.
     * <p>
     * The file descriptors normally correspond to {@code G_VARIANT_TYPE_HANDLE}
     * values in the body of the message. For example, if a message contains
     * two file descriptors, {@code fd_list} would have length 2, and
     * {@code g_variant_new_handle (0)} and {@code g_variant_new_handle (1)} would appear
     * somewhere in the body of the message (not necessarily in that order!)
     * to represent the file descriptors at indexes 0 and 1 respectively.
     * <p>
     * When designing D-Bus APIs that are intended to be interoperable,
     * please note that non-GDBus implementations of D-Bus can usually only
     * access file descriptors if they are referenced in this way by a
     * value of type {@code G_VARIANT_TYPE_HANDLE} in the body of the message.
     * <p>
     * This method is only available on UNIX.
     */
    public void callWithUnixFdList(java.lang.String busName, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String methodName, org.gtk.glib.Variant parameters, org.gtk.glib.VariantType replyType, DBusCallFlags flags, int timeoutMsec, UnixFDList fdList, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_dbus_connection_call_with_unix_fd_list(handle(), Interop.allocateNativeString(busName).handle(), Interop.allocateNativeString(objectPath).handle(), Interop.allocateNativeString(interfaceName).handle(), Interop.allocateNativeString(methodName).handle(), parameters.handle(), replyType.handle(), flags.getValue(), timeoutMsec, fdList.handle(), cancellable.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an operation started with g_dbus_connection_call_with_unix_fd_list().
     * <p>
     * The file descriptors normally correspond to {@code G_VARIANT_TYPE_HANDLE}
     * values in the body of the message. For example,
     * if g_variant_get_handle() returns 5, that is intended to be a reference
     * to the file descriptor that can be accessed by
     * {@code g_unix_fd_list_get (*out_fd_list, 5, ...)}.
     * <p>
     * When designing D-Bus APIs that are intended to be interoperable,
     * please note that non-GDBus implementations of D-Bus can usually only
     * access file descriptors if they are referenced in this way by a
     * value of type {@code G_VARIANT_TYPE_HANDLE} in the body of the message.
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
     * Like g_dbus_connection_call_sync() but also takes and returns {@link UnixFDList} objects.
     * See g_dbus_connection_call_with_unix_fd_list() and
     * g_dbus_connection_call_with_unix_fd_list_finish() for more details.
     * <p>
     * This method is only available on UNIX.
     */
    public org.gtk.glib.Variant callWithUnixFdListSync(java.lang.String busName, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String methodName, org.gtk.glib.Variant parameters, org.gtk.glib.VariantType replyType, DBusCallFlags flags, int timeoutMsec, UnixFDList fdList, UnixFDList[] outFdList, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dbus_connection_call_with_unix_fd_list_sync(handle(), Interop.allocateNativeString(busName).handle(), Interop.allocateNativeString(objectPath).handle(), Interop.allocateNativeString(interfaceName).handle(), Interop.allocateNativeString(methodName).handle(), parameters.handle(), replyType.handle(), flags.getValue(), timeoutMsec, fdList.handle(), Interop.allocateNativeArray(outFdList).handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Closes {@code connection}. Note that this never causes the process to
     * exit (this might only happen if the other end of a shared message
     * bus connection disconnects, see {@link DBusConnection}:exit-on-close).
     * <p>
     * Once the connection is closed, operations such as sending a message
     * will return with the error {@link IOErrorEnum#CLOSED}. Closing a connection
     * will not automatically flush the connection so queued messages may
     * be lost. Use g_dbus_connection_flush() if you need such guarantees.
     * <p>
     * If {@code connection} is already closed, this method fails with
     * {@link IOErrorEnum#CLOSED}.
     * <p>
     * When {@code connection} has been closed, the {@link DBusConnection}::closed
     * signal is emitted in the
     * [thread-default main context][g-main-context-push-thread-default]
     * of the thread that {@code connection} was constructed in.
     * <p>
     * This is an asynchronous method. When the operation is finished,
     * {@code callback} will be invoked in the
     * [thread-default main context][g-main-context-push-thread-default]
     * of the thread you are calling this method from. You can
     * then call g_dbus_connection_close_finish() to get the result of the
     * operation. See g_dbus_connection_close_sync() for the synchronous
     * version.
     */
    public void close(Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_dbus_connection_close(handle(), cancellable.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
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
     * Synchronously closes {@code connection}. The calling thread is blocked
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
     * <p>
     * If the parameters GVariant is floating, it is consumed.
     * <p>
     * This can only fail if {@code parameters} is not compatible with the D-Bus protocol
     * ({@link IOErrorEnum#INVALID_ARGUMENT}), or if {@code connection} has been closed
     * ({@link IOErrorEnum#CLOSED}).
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
     * Exports {@code action_group} on {@code connection} at {@code object_path}.
     * <p>
     * The implemented D-Bus API should be considered private.  It is
     * subject to change in the future.
     * <p>
     * A given object path can only have one action group exported on it.
     * If this constraint is violated, the export will fail and 0 will be
     * returned (with {@code error} set accordingly).
     * <p>
     * You can unexport the action group using
     * g_dbus_connection_unexport_action_group() with the return value of
     * this function.
     * <p>
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
     * Exports {@code menu} on {@code connection} at {@code object_path}.
     * <p>
     * The implemented D-Bus API should be considered private.
     * It is subject to change in the future.
     * <p>
     * An object path can only have one menu model exported on it. If this
     * constraint is violated, the export will fail and 0 will be
     * returned (with {@code error} set accordingly).
     * <p>
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
     * Asynchronously flushes {@code connection}, that is, writes all queued
     * outgoing message to the transport and then flushes the transport
     * (using g_output_stream_flush_async()). This is useful in programs
     * that wants to emit a D-Bus signal and then exit immediately. Without
     * flushing the connection, there is no guaranteed that the message has
     * been sent to the networking buffers in the OS kernel.
     * <p>
     * This is an asynchronous method. When the operation is finished,
     * {@code callback} will be invoked in the
     * [thread-default main context][g-main-context-push-thread-default]
     * of the thread you are calling this method from. You can
     * then call g_dbus_connection_flush_finish() to get the result of the
     * operation. See g_dbus_connection_flush_sync() for the synchronous
     * version.
     */
    public void flush(Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_dbus_connection_flush(handle(), cancellable.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
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
     * Synchronously flushes {@code connection}. The calling thread is blocked
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
    public DBusCapabilityFlags getCapabilities() {
        var RESULT = gtk_h.g_dbus_connection_get_capabilities(handle());
        return new DBusCapabilityFlags(RESULT);
    }
    
    /**
     * Gets whether the process is terminated when {@code connection} is
     * closed by the remote peer. See
     * {@link DBusConnection}:exit-on-close for more details.
     */
    public boolean getExitOnClose() {
        var RESULT = gtk_h.g_dbus_connection_get_exit_on_close(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the flags used to construct this connection
     */
    public DBusConnectionFlags getFlags() {
        var RESULT = gtk_h.g_dbus_connection_get_flags(handle());
        return new DBusConnectionFlags(RESULT);
    }
    
    /**
     * The GUID of the peer performing the role of server when
     * authenticating. See {@link DBusConnection}:guid for more details.
     */
    public java.lang.String getGuid() {
        var RESULT = gtk_h.g_dbus_connection_get_guid(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieves the last serial number assigned to a {@link DBusMessage} on
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
     * return {@code null} unless {@code connection} acted as a server
     * (e.g. {@link DBusConnectionFlags#AUTHENTICATION_SERVER} was passed)
     * when set up and the client passed credentials as part of the
     * authentication process.
     * <p>
     * In a message bus setup, the message bus is always the server and
     * each application is a client. So this method will always return
     * {@code null} for message bus clients.
     */
    public Credentials getPeerCredentials() {
        var RESULT = gtk_h.g_dbus_connection_get_peer_credentials(handle());
        return new Credentials(References.get(RESULT, false));
    }
    
    /**
     * Gets the underlying stream used for IO.
     * <p>
     * While the {@link DBusConnection} is active, it will interact with this
     * stream from a worker thread, so it is not safe to interact with
     * the stream directly.
     */
    public IOStream getStream() {
        var RESULT = gtk_h.g_dbus_connection_get_stream(handle());
        return new IOStream(References.get(RESULT, false));
    }
    
    /**
     * Gets the unique name of {@code connection} as assigned by the message
     * bus. This can also be used to figure out if {@code connection} is a
     * message bus connection.
     */
    public java.lang.String getUniqueName() {
        var RESULT = gtk_h.g_dbus_connection_get_unique_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets whether {@code connection} is closed.
     */
    public boolean isClosed() {
        var RESULT = gtk_h.g_dbus_connection_is_closed(handle());
        return (RESULT != 0);
    }
    
    /**
     * Registers callbacks for exported objects at {@code object_path} with the
     * D-Bus interface that is described in {@code interface_info}.
     * <p>
     * Calls to functions in {@code vtable} (and {@code user_data_free_func}) will happen
     * in the
     * [thread-default main context][g-main-context-push-thread-default]
     * of the thread you are calling this method from.
     * <p>
     * Note that all {@link org.gtk.glib.Variant} values passed to functions in {@code vtable} will match
     * the signature given in {@code interface_info} - if a remote caller passes
     * incorrect values, the {@code org.freedesktop.DBus.Error.InvalidArgs}
     * is returned to the remote caller.
     * <p>
     * Additionally, if the remote caller attempts to invoke methods or
     * access properties not mentioned in {@code interface_info} the
     * {@code org.freedesktop.DBus.Error.UnknownMethod} resp.
     * {@code org.freedesktop.DBus.Error.InvalidArgs} errors
     * are returned to the caller.
     * <p>
     * It is considered a programming error if the
     * {@link DBusInterfaceGetPropertyFunc} function in {@code vtable} returns a
     * {@link org.gtk.glib.Variant} of incorrect type.
     * <p>
     * If an existing callback is already registered at {@code object_path} and
     * {@code interface_name}, then {@code error} is set to {@link IOErrorEnum#EXISTS}.
     * <p>
     * GDBus automatically implements the standard D-Bus interfaces
     * org.freedesktop.DBus.Properties, org.freedesktop.DBus.Introspectable
     * and org.freedesktop.Peer, so you don't have to implement those for the
     * objects you export. You can implement org.freedesktop.DBus.Properties
     * yourself, e.g. to handle getting and setting of properties asynchronously.
     * <p>
     * Note that the reference count on {@code interface_info} will be
     * incremented by 1 (unless allocated statically, e.g. if the
     * reference count is -1, see g_dbus_interface_info_ref()) for as long
     * as the object is exported. Also note that {@code vtable} will be copied.
     * <p>
     * See this [server][gdbus-server] for an example of how to use this method.
     */
    public int registerObject(java.lang.String objectPath, DBusInterfaceInfo interfaceInfo, DBusInterfaceVTable vtable, java.lang.foreign.MemoryAddress userData, org.gtk.glib.DestroyNotify userDataFreeFunc) throws io.github.jwharm.javagi.GErrorException {
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
     * {@link DBusInterfaceVTable} for easier binding in other languages.
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
     * <p>
     * The {@code enumerate} and {@code introspection} functions in {@code vtable} are used to
     * convey, to remote callers, what nodes exist in the subtree rooted
     * by {@code object_path}.
     * <p>
     * When handling remote calls into any node in the subtree, first the
     * {@code enumerate} function is used to check if the node exists. If the node exists
     * or the {@link DBusSubtreeFlags#DISPATCH_TO_UNENUMERATED_NODES} flag is set
     * the {@code introspection} function is used to check if the node supports the
     * requested method. If so, the {@code dispatch} function is used to determine
     * where to dispatch the call. The collected {@link DBusInterfaceVTable} and
     * {@code gpointer} will be used to call into the interface vtable for processing
     * the request.
     * <p>
     * All calls into user-provided code will be invoked in the
     * [thread-default main context][g-main-context-push-thread-default]
     * of the thread you are calling this method from.
     * <p>
     * If an existing subtree is already registered at {@code object_path} or
     * then {@code error} is set to {@link IOErrorEnum#EXISTS}.
     * <p>
     * Note that it is valid to register regular objects (using
     * g_dbus_connection_register_object()) in a subtree registered with
     * g_dbus_connection_register_subtree() - if so, the subtree handler
     * is tried as the last resort. One way to think about a subtree
     * handler is to consider it a fallback handler for object paths not
     * registered via g_dbus_connection_register_object() or other bindings.
     * <p>
     * Note that {@code vtable} will be copied so you cannot change it after
     * registration.
     * <p>
     * See this [server][gdbus-subtree-server] for an example of how to use
     * this method.
     */
    public int registerSubtree(java.lang.String objectPath, DBusSubtreeVTable vtable, DBusSubtreeFlags flags, java.lang.foreign.MemoryAddress userData, org.gtk.glib.DestroyNotify userDataFreeFunc) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dbus_connection_register_subtree(handle(), Interop.allocateNativeString(objectPath).handle(), vtable.handle(), flags.getValue(), userData, 
                    Interop.cbDestroyNotifySymbol(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Removes a filter.
     * <p>
     * Note that since filters run in a different thread, there is a race
     * condition where it is possible that the filter will be running even
     * after calling g_dbus_connection_remove_filter(), so you cannot just
     * free data that the filter might be using. Instead, you should pass
     * a {@link org.gtk.glib.DestroyNotify} to g_dbus_connection_add_filter(), which will be
     * called when it is guaranteed that the data is no longer needed.
     */
    public void removeFilter(int filterId) {
        gtk_h.g_dbus_connection_remove_filter(handle(), filterId);
    }
    
    /**
     * Asynchronously sends {@code message} to the peer represented by {@code connection}.
     * <p>
     * Unless {@code flags} contain the
     * {@link DBusSendMessageFlags#PRESERVE_SERIAL} flag, the serial number
     * will be assigned by {@code connection} and set on {@code message} via
     * g_dbus_message_set_serial(). If {@code out_serial} is not {@code null}, then the
     * serial number used will be written to this location prior to
     * submitting the message to the underlying transport. While it has a {@code volatile}
     * qualifier, this is a historical artifact and the argument passed to it should
     * not be {@code volatile}.
     * <p>
     * If {@code connection} is closed then the operation will fail with
     * {@link IOErrorEnum#CLOSED}. If {@code message} is not well-formed,
     * the operation fails with {@link IOErrorEnum#INVALID_ARGUMENT}.
     * <p>
     * See this [server][gdbus-server] and [client][gdbus-unix-fd-client]
     * for an example of how to use this low-level API to send and receive
     * UNIX file descriptors.
     * <p>
     * Note that {@code message} must be unlocked, unless {@code flags} contain the
     * {@link DBusSendMessageFlags#PRESERVE_SERIAL} flag.
     */
    public boolean sendMessage(DBusMessage message, DBusSendMessageFlags flags, PointerInteger outSerial) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dbus_connection_send_message(handle(), message.handle(), flags.getValue(), outSerial.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Asynchronously sends {@code message} to the peer represented by {@code connection}.
     * <p>
     * Unless {@code flags} contain the
     * {@link DBusSendMessageFlags#PRESERVE_SERIAL} flag, the serial number
     * will be assigned by {@code connection} and set on {@code message} via
     * g_dbus_message_set_serial(). If {@code out_serial} is not {@code null}, then the
     * serial number used will be written to this location prior to
     * submitting the message to the underlying transport. While it has a {@code volatile}
     * qualifier, this is a historical artifact and the argument passed to it should
     * not be {@code volatile}.
     * <p>
     * If {@code connection} is closed then the operation will fail with
     * {@link IOErrorEnum#CLOSED}. If {@code cancellable} is canceled, the operation will
     * fail with {@link IOErrorEnum#CANCELLED}. If {@code message} is not well-formed,
     * the operation fails with {@link IOErrorEnum#INVALID_ARGUMENT}.
     * <p>
     * This is an asynchronous method. When the operation is finished, {@code callback}
     * will be invoked in the
     * [thread-default main context][g-main-context-push-thread-default]
     * of the thread you are calling this method from. You can then call
     * g_dbus_connection_send_message_with_reply_finish() to get the result of the operation.
     * See g_dbus_connection_send_message_with_reply_sync() for the synchronous version.
     * <p>
     * Note that {@code message} must be unlocked, unless {@code flags} contain the
     * {@link DBusSendMessageFlags#PRESERVE_SERIAL} flag.
     * <p>
     * See this [server][gdbus-server] and [client][gdbus-unix-fd-client]
     * for an example of how to use this low-level API to send and receive
     * UNIX file descriptors.
     */
    public void sendMessageWithReply(DBusMessage message, DBusSendMessageFlags flags, int timeoutMsec, PointerInteger outSerial, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_dbus_connection_send_message_with_reply(handle(), message.handle(), flags.getValue(), timeoutMsec, outSerial.handle(), cancellable.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an operation started with g_dbus_connection_send_message_with_reply().
     * <p>
     * Note that {@code error} is only set if a local in-process error
     * occurred. That is to say that the returned {@link DBusMessage} object may
     * be of type {@link DBusMessageType#ERROR}. Use
     * g_dbus_message_to_gerror() to transcode this to a {@link org.gtk.glib.Error}.
     * <p>
     * See this [server][gdbus-server] and [client][gdbus-unix-fd-client]
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
     * Synchronously sends {@code message} to the peer represented by {@code connection}
     * and blocks the calling thread until a reply is received or the
     * timeout is reached. See g_dbus_connection_send_message_with_reply()
     * for the asynchronous version of this method.
     * <p>
     * Unless {@code flags} contain the
     * {@link DBusSendMessageFlags#PRESERVE_SERIAL} flag, the serial number
     * will be assigned by {@code connection} and set on {@code message} via
     * g_dbus_message_set_serial(). If {@code out_serial} is not {@code null}, then the
     * serial number used will be written to this location prior to
     * submitting the message to the underlying transport. While it has a {@code volatile}
     * qualifier, this is a historical artifact and the argument passed to it should
     * not be {@code volatile}.
     * <p>
     * If {@code connection} is closed then the operation will fail with
     * {@link IOErrorEnum#CLOSED}. If {@code cancellable} is canceled, the operation will
     * fail with {@link IOErrorEnum#CANCELLED}. If {@code message} is not well-formed,
     * the operation fails with {@link IOErrorEnum#INVALID_ARGUMENT}.
     * <p>
     * Note that {@code error} is only set if a local in-process error
     * occurred. That is to say that the returned {@link DBusMessage} object may
     * be of type {@link DBusMessageType#ERROR}. Use
     * g_dbus_message_to_gerror() to transcode this to a {@link org.gtk.glib.Error}.
     * <p>
     * See this [server][gdbus-server] and [client][gdbus-unix-fd-client]
     * for an example of how to use this low-level API to send and receive
     * UNIX file descriptors.
     * <p>
     * Note that {@code message} must be unlocked, unless {@code flags} contain the
     * {@link DBusSendMessageFlags#PRESERVE_SERIAL} flag.
     */
    public DBusMessage sendMessageWithReplySync(DBusMessage message, DBusSendMessageFlags flags, int timeoutMsec, PointerInteger outSerial, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dbus_connection_send_message_with_reply_sync(handle(), message.handle(), flags.getValue(), timeoutMsec, outSerial.handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new DBusMessage(References.get(RESULT, true));
    }
    
    /**
     * Sets whether the process should be terminated when {@code connection} is
     * closed by the remote peer. See {@link DBusConnection}:exit-on-close for
     * more details.
     * <p>
     * Note that this function should be used with care. Most modern UNIX
     * desktops tie the notion of a user session with the session bus, and expect
     * all of a user's applications to quit when their bus connection goes away.
     * If you are setting {@code exit_on_close} to {@code false} for the shared session
     * bus connection, you should make sure that your application exits
     * when the user session ends.
     */
    public void setExitOnClose(boolean exitOnClose) {
        gtk_h.g_dbus_connection_set_exit_on_close(handle(), exitOnClose ? 1 : 0);
    }
    
    /**
     * Subscribes to signals on {@code connection} and invokes {@code callback} with a whenever
     * the signal is received. Note that {@code callback} will be invoked in the
     * [thread-default main context][g-main-context-push-thread-default]
     * of the thread you are calling this method from.
     * <p>
     * If {@code connection} is not a message bus connection, {@code sender} must be
     * {@code null}.
     * <p>
     * If {@code sender} is a well-known name note that {@code callback} is invoked with
     * the unique name for the owner of {@code sender}, not the well-known name
     * as one would expect. This is because the message bus rewrites the
     * name. As such, to avoid certain race conditions, users should be
     * tracking the name owner of the well-known name and use that when
     * processing the received signal.
     * <p>
     * If one of {@link DBusSignalFlags#MATCH_ARG0_NAMESPACE} or
     * {@link DBusSignalFlags#MATCH_ARG0_PATH} are given, {@code arg0} is
     * interpreted as part of a namespace or path.  The first argument
     * of a signal is matched against that part as specified by D-Bus.
     * <p>
     * If {@code user_data_free_func} is non-{@code null}, it will be called (in the
     * thread-default main context of the thread you are calling this
     * method from) at some point after {@code user_data} is no longer
     * needed. (It is not guaranteed to be called synchronously when the
     * signal is unsubscribed from, and may be called after {@code connection}
     * has been destroyed.)
     * <p>
     * As {@code callback} is potentially invoked in a different thread from where it’s
     * emitted, it’s possible for this to happen after
     * g_dbus_connection_signal_unsubscribe() has been called in another thread.
     * Due to this, {@code user_data} should have a strong reference which is freed with
     * {@code user_data_free_func}, rather than pointing to data whose lifecycle is tied
     * to the signal subscription. For example, if a {@link org.gtk.gobject.Object} is used to store the
     * subscription ID from g_dbus_connection_signal_subscribe(), a strong reference
     * to that {@link org.gtk.gobject.Object} must be passed to {@code user_data}, and g_object_unref() passed to
     * {@code user_data_free_func}. You are responsible for breaking the resulting
     * reference count cycle by explicitly unsubscribing from the signal when
     * dropping the last external reference to the {@link org.gtk.gobject.Object}. Alternatively, a weak
     * reference may be used.
     * <p>
     * It is guaranteed that if you unsubscribe from a signal using
     * g_dbus_connection_signal_unsubscribe() from the same thread which made the
     * corresponding g_dbus_connection_signal_subscribe() call, {@code callback} will not
     * be invoked after g_dbus_connection_signal_unsubscribe() returns.
     * <p>
     * The returned subscription identifier is an opaque value which is guaranteed
     * to never be zero.
     * <p>
     * This function can never fail.
     */
    public int signalSubscribe(java.lang.String sender, java.lang.String interfaceName, java.lang.String member, java.lang.String objectPath, java.lang.String arg0, DBusSignalFlags flags, DBusSignalCallback callback) {
        try {
            var RESULT = gtk_h.g_dbus_connection_signal_subscribe(handle(), Interop.allocateNativeString(sender).handle(), Interop.allocateNativeString(interfaceName).handle(), Interop.allocateNativeString(member).handle(), Interop.allocateNativeString(objectPath).handle(), Interop.allocateNativeString(arg0).handle(), flags.getValue(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbDBusSignalCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)), 
                    Interop.cbDestroyNotifySymbol());
            return RESULT;
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Unsubscribes from signals.
     * <p>
     * Note that there may still be D-Bus traffic to process (relating to this
     * signal subscription) in the current thread-default {@link org.gtk.glib.MainContext} after this
     * function has returned. You should continue to iterate the {@link org.gtk.glib.MainContext}
     * until the {@link org.gtk.glib.DestroyNotify} function passed to
     * g_dbus_connection_signal_subscribe() is called, in order to avoid memory
     * leaks through callbacks queued on the {@link org.gtk.glib.MainContext} after it’s stopped being
     * iterated.
     * Alternatively, any idle source with a priority lower than {@code G_PRIORITY_DEFAULT}
     * that was scheduled after unsubscription, also indicates that all resources
     * of this subscription are released.
     */
    public void signalUnsubscribe(int subscriptionId) {
        gtk_h.g_dbus_connection_signal_unsubscribe(handle(), subscriptionId);
    }
    
    /**
     * If {@code connection} was created with
     * {@link DBusConnectionFlags#DELAY_MESSAGE_PROCESSING}, this method
     * starts processing messages. Does nothing on if {@code connection} wasn't
     * created with this flag or if the method has already been called.
     */
    public void startMessageProcessing() {
        gtk_h.g_dbus_connection_start_message_processing(handle());
    }
    
    /**
     * Reverses the effect of a previous call to
     * g_dbus_connection_export_action_group().
     * <p>
     * It is an error to call this function with an ID that wasn't returned
     * from g_dbus_connection_export_action_group() or to call it with the
     * same ID more than once.
     */
    public void unexportActionGroup(int exportId) {
        gtk_h.g_dbus_connection_unexport_action_group(handle(), exportId);
    }
    
    /**
     * Reverses the effect of a previous call to
     * g_dbus_connection_export_menu_model().
     * <p>
     * It is an error to call this function with an ID that wasn't returned
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
     * with the end represented by {@code stream}.
     * <p>
     * If {@code stream} is a {@link SocketConnection}, then the corresponding {@link Socket}
     * will be put into non-blocking mode.
     * <p>
     * The D-Bus connection will interact with {@code stream} from a worker thread.
     * As a result, the caller should not interact with {@code stream} after this
     * method has been called, except by calling g_object_unref() on it.
     * <p>
     * If {@code observer} is not {@code null} it may be used to control the
     * authentication process.
     * <p>
     * When the operation is finished, {@code callback} will be invoked. You can
     * then call g_dbus_connection_new_finish() to get the result of the
     * operation.
     * <p>
     * This is an asynchronous failable constructor. See
     * g_dbus_connection_new_sync() for the synchronous
     * version.
     */
    public static void new_(IOStream stream, java.lang.String guid, DBusConnectionFlags flags, DBusAuthObserver observer, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_dbus_connection_new(stream.handle(), Interop.allocateNativeString(guid).handle(), flags.getValue(), observer.handle(), cancellable.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Asynchronously connects and sets up a D-Bus client connection for
     * exchanging D-Bus messages with an endpoint specified by {@code address}
     * which must be in the
     * <a href="https://dbus.freedesktop.org/doc/dbus-specification.html#addresses">D-Bus address format</a>.
     * <p>
     * This constructor can only be used to initiate client-side
     * connections - use g_dbus_connection_new() if you need to act as the
     * server. In particular, {@code flags} cannot contain the
     * {@link DBusConnectionFlags#AUTHENTICATION_SERVER},
     * {@link DBusConnectionFlags#AUTHENTICATION_ALLOW_ANONYMOUS} or
     * {@link DBusConnectionFlags#AUTHENTICATION_REQUIRE_SAME_USER} flags.
     * <p>
     * When the operation is finished, {@code callback} will be invoked. You can
     * then call g_dbus_connection_new_for_address_finish() to get the result of
     * the operation.
     * <p>
     * If {@code observer} is not {@code null} it may be used to control the
     * authentication process.
     * <p>
     * This is an asynchronous failable constructor. See
     * g_dbus_connection_new_for_address_sync() for the synchronous
     * version.
     */
    public static void newForAddress(java.lang.String address, DBusConnectionFlags flags, DBusAuthObserver observer, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_dbus_connection_new_for_address(Interop.allocateNativeString(address).handle(), flags.getValue(), observer.handle(), cancellable.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ClosedHandler {
        void signalReceived(DBusConnection source, boolean remotePeerVanished, org.gtk.glib.Error error);
    }
    
    /**
     * Emitted when the connection is closed.
     * <p>
     * The cause of this event can be
     * <p>
     * <ul>
     * <li>If g_dbus_connection_close() is called. In this case
     *   {@code remote_peer_vanished} is set to {@code false} and {@code error} is {@code null}.
     * </ul>
     * <p>
     * <ul>
     * <li>If the remote peer closes the connection. In this case
     *   {@code remote_peer_vanished} is set to {@code true} and {@code error} is set.
     * </ul>
     * <p>
     * <ul>
     * <li>If the remote peer sends invalid or malformed data. In this
     *   case {@code remote_peer_vanished} is set to {@code false} and {@code error} is set.
     * </ul>
     * <p>
     * Upon receiving this signal, you should give up your reference to
     * {@code connection}. You are guaranteed that this signal is emitted only
     * once.
     */
    public SignalHandle onClosed(ClosedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("closed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DBusConnection.class, "__signalDBusConnectionClosed",
                        MethodType.methodType(void.class, MemoryAddress.class, boolean.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalDBusConnectionClosed(MemoryAddress source, boolean remotePeerVanished, MemoryAddress error, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DBusConnection.ClosedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new DBusConnection(References.get(source)), remotePeerVanished, new org.gtk.glib.Error(References.get(error, false)));
    }
    
}
