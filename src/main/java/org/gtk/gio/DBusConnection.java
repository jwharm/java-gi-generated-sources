package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * <strong>An example D-Bus server # {#gdbus-server}</strong><br/>
 * Here is an example for a D-Bus server:
 * <a href="https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-server.c">gdbus-example-server.c</a>
 * <p>
 * <strong>An example for exporting a subtree # {#gdbus-subtree-server}</strong><br/>
 * Here is an example for exporting a subtree:
 * <a href="https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-subtree.c">gdbus-example-subtree.c</a>
 * <p>
 * <strong>An example for file descriptor passing # {#gdbus-unix-fd-client}</strong><br/>
 * Here is an example for passing UNIX file descriptors:
 * <a href="https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-unix-fd-client.c">gdbus-unix-fd-client.c</a>
 * <p>
 * <strong>An example for exporting a GObject # {#gdbus-export}</strong><br/>
 * Here is an example for exporting a {@link org.gtk.gobject.GObject}:
 * <a href="https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-export.c">gdbus-example-export.c</a>
 * @version 2.26
 */
public class DBusConnection extends org.gtk.gobject.GObject implements org.gtk.gio.AsyncInitable, org.gtk.gio.Initable {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusConnection";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a DBusConnection proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DBusConnection(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DBusConnection> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DBusConnection(input, ownership);
    
    private static MemoryAddress constructNewFinish(org.gtk.gio.AsyncResult res) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_connection_new_finish.invokeExact(
                    res.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Finishes an operation started with g_dbus_connection_new().
     * @param res a {@link AsyncResult} obtained from the {@link AsyncReadyCallback}
     *     passed to g_dbus_connection_new().
     * @return a {@link DBusConnection} or {@code null} if {@code error} is set. Free
     *     with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static DBusConnection newFinish(org.gtk.gio.AsyncResult res) throws GErrorException {
        var RESULT = constructNewFinish(res);
        return (org.gtk.gio.DBusConnection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.DBusConnection.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewForAddressFinish(org.gtk.gio.AsyncResult res) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_connection_new_for_address_finish.invokeExact(
                    res.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Finishes an operation started with g_dbus_connection_new_for_address().
     * @param res a {@link AsyncResult} obtained from the {@link AsyncReadyCallback} passed
     *     to g_dbus_connection_new()
     * @return a {@link DBusConnection} or {@code null} if {@code error} is set.
     *     Free with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static DBusConnection newForAddressFinish(org.gtk.gio.AsyncResult res) throws GErrorException {
        var RESULT = constructNewForAddressFinish(res);
        return (org.gtk.gio.DBusConnection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.DBusConnection.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewForAddressSync(java.lang.String address, org.gtk.gio.DBusConnectionFlags flags, @Nullable org.gtk.gio.DBusAuthObserver observer, @Nullable org.gtk.gio.Cancellable cancellable) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_connection_new_for_address_sync.invokeExact(
                    Marshal.stringToAddress.marshal(address, null),
                    flags.getValue(),
                    (Addressable) (observer == null ? MemoryAddress.NULL : observer.handle()),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param address a D-Bus address
     * @param flags flags describing how to make the connection
     * @param observer a {@link DBusAuthObserver} or {@code null}
     * @param cancellable a {@link Cancellable} or {@code null}
     * @return a {@link DBusConnection} or {@code null} if {@code error} is set.
     *     Free with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static DBusConnection newForAddressSync(java.lang.String address, org.gtk.gio.DBusConnectionFlags flags, @Nullable org.gtk.gio.DBusAuthObserver observer, @Nullable org.gtk.gio.Cancellable cancellable) throws GErrorException {
        var RESULT = constructNewForAddressSync(address, flags, observer, cancellable);
        return (org.gtk.gio.DBusConnection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.DBusConnection.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewSync(org.gtk.gio.IOStream stream, @Nullable java.lang.String guid, org.gtk.gio.DBusConnectionFlags flags, @Nullable org.gtk.gio.DBusAuthObserver observer, @Nullable org.gtk.gio.Cancellable cancellable) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_connection_new_sync.invokeExact(
                    stream.handle(),
                    (Addressable) (guid == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(guid, null)),
                    flags.getValue(),
                    (Addressable) (observer == null ? MemoryAddress.NULL : observer.handle()),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param stream a {@link IOStream}
     * @param guid the GUID to use if authenticating as a server or {@code null}
     * @param flags flags describing how to make the connection
     * @param observer a {@link DBusAuthObserver} or {@code null}
     * @param cancellable a {@link Cancellable} or {@code null}
     * @return a {@link DBusConnection} or {@code null} if {@code error} is set.
     *     Free with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static DBusConnection newSync(org.gtk.gio.IOStream stream, @Nullable java.lang.String guid, org.gtk.gio.DBusConnectionFlags flags, @Nullable org.gtk.gio.DBusAuthObserver observer, @Nullable org.gtk.gio.Cancellable cancellable) throws GErrorException {
        var RESULT = constructNewSync(stream, guid, flags, observer, cancellable);
        return (org.gtk.gio.DBusConnection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.DBusConnection.fromAddress).marshal(RESULT, Ownership.FULL);
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
     * @param filterFunction a filter function
     * @param userDataFreeFunc function to free {@code user_data} with when filter
     *     is removed or {@code null}
     * @return a filter identifier that can be used with
     *     g_dbus_connection_remove_filter()
     */
    public int addFilter(org.gtk.gio.DBusMessageFilterFunction filterFunction, org.gtk.glib.DestroyNotify userDataFreeFunc) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_connection_add_filter.invokeExact(
                    handle(),
                    (Addressable) filterFunction.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) userDataFreeFunc.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
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
     * @param busName a unique or well-known bus name or {@code null} if
     *     {@code connection} is not a message bus connection
     * @param objectPath path of remote object
     * @param interfaceName D-Bus interface to invoke method on
     * @param methodName the name of the method to invoke
     * @param parameters a {@link org.gtk.glib.Variant} tuple with parameters for the method
     *     or {@code null} if not passing parameters
     * @param replyType the expected type of the reply (which will be a
     *     tuple), or {@code null}
     * @param flags flags from the {@link DBusCallFlags} enumeration
     * @param timeoutMsec the timeout in milliseconds, -1 to use the default
     *     timeout or {@code G_MAXINT} for no timeout
     * @param cancellable a {@link Cancellable} or {@code null}
     * @param callback a {@link AsyncReadyCallback} to call when the request
     *     is satisfied or {@code null} if you don't care about the result of the
     *     method invocation
     */
    public void call(@Nullable java.lang.String busName, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String methodName, @Nullable org.gtk.glib.Variant parameters, @Nullable org.gtk.glib.VariantType replyType, org.gtk.gio.DBusCallFlags flags, int timeoutMsec, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_dbus_connection_call.invokeExact(
                    handle(),
                    (Addressable) (busName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(busName, null)),
                    Marshal.stringToAddress.marshal(objectPath, null),
                    Marshal.stringToAddress.marshal(interfaceName, null),
                    Marshal.stringToAddress.marshal(methodName, null),
                    (Addressable) (parameters == null ? MemoryAddress.NULL : parameters.handle()),
                    (Addressable) (replyType == null ? MemoryAddress.NULL : replyType.handle()),
                    flags.getValue(),
                    timeoutMsec,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an operation started with g_dbus_connection_call().
     * @param res a {@link AsyncResult} obtained from the {@link AsyncReadyCallback} passed to g_dbus_connection_call()
     * @return {@code null} if {@code error} is set. Otherwise a non-floating
     *     {@link org.gtk.glib.Variant} tuple with return values. Free with g_variant_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.glib.Variant callFinish(org.gtk.gio.AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_connection_call_finish.invokeExact(
                    handle(),
                    res.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.FULL);
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
     * @param busName a unique or well-known bus name or {@code null} if
     *     {@code connection} is not a message bus connection
     * @param objectPath path of remote object
     * @param interfaceName D-Bus interface to invoke method on
     * @param methodName the name of the method to invoke
     * @param parameters a {@link org.gtk.glib.Variant} tuple with parameters for the method
     *     or {@code null} if not passing parameters
     * @param replyType the expected type of the reply, or {@code null}
     * @param flags flags from the {@link DBusCallFlags} enumeration
     * @param timeoutMsec the timeout in milliseconds, -1 to use the default
     *     timeout or {@code G_MAXINT} for no timeout
     * @param cancellable a {@link Cancellable} or {@code null}
     * @return {@code null} if {@code error} is set. Otherwise a non-floating
     *     {@link org.gtk.glib.Variant} tuple with return values. Free with g_variant_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.glib.Variant callSync(@Nullable java.lang.String busName, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String methodName, @Nullable org.gtk.glib.Variant parameters, @Nullable org.gtk.glib.VariantType replyType, org.gtk.gio.DBusCallFlags flags, int timeoutMsec, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_connection_call_sync.invokeExact(
                    handle(),
                    (Addressable) (busName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(busName, null)),
                    Marshal.stringToAddress.marshal(objectPath, null),
                    Marshal.stringToAddress.marshal(interfaceName, null),
                    Marshal.stringToAddress.marshal(methodName, null),
                    (Addressable) (parameters == null ? MemoryAddress.NULL : parameters.handle()),
                    (Addressable) (replyType == null ? MemoryAddress.NULL : replyType.handle()),
                    flags.getValue(),
                    timeoutMsec,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.FULL);
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
     * @param busName a unique or well-known bus name or {@code null} if
     *     {@code connection} is not a message bus connection
     * @param objectPath path of remote object
     * @param interfaceName D-Bus interface to invoke method on
     * @param methodName the name of the method to invoke
     * @param parameters a {@link org.gtk.glib.Variant} tuple with parameters for the method
     *     or {@code null} if not passing parameters
     * @param replyType the expected type of the reply, or {@code null}
     * @param flags flags from the {@link DBusCallFlags} enumeration
     * @param timeoutMsec the timeout in milliseconds, -1 to use the default
     *     timeout or {@code G_MAXINT} for no timeout
     * @param fdList a {@link UnixFDList} or {@code null}
     * @param cancellable a {@link Cancellable} or {@code null}
     * @param callback a {@link AsyncReadyCallback} to call when the request is
     *     satisfied or {@code null} if you don't * care about the result of the
     *     method invocation
     */
    public void callWithUnixFdList(@Nullable java.lang.String busName, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String methodName, @Nullable org.gtk.glib.Variant parameters, @Nullable org.gtk.glib.VariantType replyType, org.gtk.gio.DBusCallFlags flags, int timeoutMsec, @Nullable org.gtk.gio.UnixFDList fdList, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_dbus_connection_call_with_unix_fd_list.invokeExact(
                    handle(),
                    (Addressable) (busName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(busName, null)),
                    Marshal.stringToAddress.marshal(objectPath, null),
                    Marshal.stringToAddress.marshal(interfaceName, null),
                    Marshal.stringToAddress.marshal(methodName, null),
                    (Addressable) (parameters == null ? MemoryAddress.NULL : parameters.handle()),
                    (Addressable) (replyType == null ? MemoryAddress.NULL : replyType.handle()),
                    flags.getValue(),
                    timeoutMsec,
                    (Addressable) (fdList == null ? MemoryAddress.NULL : fdList.handle()),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
     * @param outFdList return location for a {@link UnixFDList} or {@code null}
     * @param res a {@link AsyncResult} obtained from the {@link AsyncReadyCallback} passed to
     *     g_dbus_connection_call_with_unix_fd_list()
     * @return {@code null} if {@code error} is set. Otherwise a non-floating
     *     {@link org.gtk.glib.Variant} tuple with return values. Free with g_variant_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.glib.Variant callWithUnixFdListFinish(@Nullable Out<org.gtk.gio.UnixFDList> outFdList, org.gtk.gio.AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment outFdListPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_connection_call_with_unix_fd_list_finish.invokeExact(
                    handle(),
                    (Addressable) (outFdList == null ? MemoryAddress.NULL : (Addressable) outFdListPOINTER.address()),
                    res.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        if (outFdList != null) outFdList.set((org.gtk.gio.UnixFDList) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(outFdListPOINTER.get(Interop.valueLayout.ADDRESS, 0))), org.gtk.gio.UnixFDList.fromAddress).marshal(outFdListPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Like g_dbus_connection_call_sync() but also takes and returns {@link UnixFDList} objects.
     * See g_dbus_connection_call_with_unix_fd_list() and
     * g_dbus_connection_call_with_unix_fd_list_finish() for more details.
     * <p>
     * This method is only available on UNIX.
     * @param busName a unique or well-known bus name or {@code null}
     *     if {@code connection} is not a message bus connection
     * @param objectPath path of remote object
     * @param interfaceName D-Bus interface to invoke method on
     * @param methodName the name of the method to invoke
     * @param parameters a {@link org.gtk.glib.Variant} tuple with parameters for
     *     the method or {@code null} if not passing parameters
     * @param replyType the expected type of the reply, or {@code null}
     * @param flags flags from the {@link DBusCallFlags} enumeration
     * @param timeoutMsec the timeout in milliseconds, -1 to use the default
     *     timeout or {@code G_MAXINT} for no timeout
     * @param fdList a {@link UnixFDList} or {@code null}
     * @param outFdList return location for a {@link UnixFDList} or {@code null}
     * @param cancellable a {@link Cancellable} or {@code null}
     * @return {@code null} if {@code error} is set. Otherwise a non-floating
     *     {@link org.gtk.glib.Variant} tuple with return values. Free with g_variant_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.glib.Variant callWithUnixFdListSync(@Nullable java.lang.String busName, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String methodName, @Nullable org.gtk.glib.Variant parameters, @Nullable org.gtk.glib.VariantType replyType, org.gtk.gio.DBusCallFlags flags, int timeoutMsec, @Nullable org.gtk.gio.UnixFDList fdList, @Nullable Out<org.gtk.gio.UnixFDList> outFdList, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment outFdListPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_connection_call_with_unix_fd_list_sync.invokeExact(
                    handle(),
                    (Addressable) (busName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(busName, null)),
                    Marshal.stringToAddress.marshal(objectPath, null),
                    Marshal.stringToAddress.marshal(interfaceName, null),
                    Marshal.stringToAddress.marshal(methodName, null),
                    (Addressable) (parameters == null ? MemoryAddress.NULL : parameters.handle()),
                    (Addressable) (replyType == null ? MemoryAddress.NULL : replyType.handle()),
                    flags.getValue(),
                    timeoutMsec,
                    (Addressable) (fdList == null ? MemoryAddress.NULL : fdList.handle()),
                    (Addressable) (outFdList == null ? MemoryAddress.NULL : (Addressable) outFdListPOINTER.address()),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        if (outFdList != null) outFdList.set((org.gtk.gio.UnixFDList) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(outFdListPOINTER.get(Interop.valueLayout.ADDRESS, 0))), org.gtk.gio.UnixFDList.fromAddress).marshal(outFdListPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.FULL);
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
     * @param cancellable a {@link Cancellable} or {@code null}
     * @param callback a {@link AsyncReadyCallback} to call when the request is
     *     satisfied or {@code null} if you don't care about the result
     */
    public void close(@Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_dbus_connection_close.invokeExact(
                    handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an operation started with g_dbus_connection_close().
     * @param res a {@link AsyncResult} obtained from the {@link AsyncReadyCallback} passed
     *     to g_dbus_connection_close()
     * @return {@code true} if the operation succeeded, {@code false} if {@code error} is set
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean closeFinish(org.gtk.gio.AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_connection_close_finish.invokeExact(
                    handle(),
                    res.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Synchronously closes {@code connection}. The calling thread is blocked
     * until this is done. See g_dbus_connection_close() for the
     * asynchronous version of this method and more details about what it
     * does.
     * @param cancellable a {@link Cancellable} or {@code null}
     * @return {@code true} if the operation succeeded, {@code false} if {@code error} is set
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean closeSync(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_connection_close_sync.invokeExact(
                    handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Emits a signal.
     * <p>
     * If the parameters GVariant is floating, it is consumed.
     * <p>
     * This can only fail if {@code parameters} is not compatible with the D-Bus protocol
     * ({@link IOErrorEnum#INVALID_ARGUMENT}), or if {@code connection} has been closed
     * ({@link IOErrorEnum#CLOSED}).
     * @param destinationBusName the unique bus name for the destination
     *     for the signal or {@code null} to emit to all listeners
     * @param objectPath path of remote object
     * @param interfaceName D-Bus interface to emit a signal on
     * @param signalName the name of the signal to emit
     * @param parameters a {@link org.gtk.glib.Variant} tuple with parameters for the signal
     *              or {@code null} if not passing parameters
     * @return {@code true} unless {@code error} is set
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean emitSignal(@Nullable java.lang.String destinationBusName, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String signalName, @Nullable org.gtk.glib.Variant parameters) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_connection_emit_signal.invokeExact(
                    handle(),
                    (Addressable) (destinationBusName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(destinationBusName, null)),
                    Marshal.stringToAddress.marshal(objectPath, null),
                    Marshal.stringToAddress.marshal(interfaceName, null),
                    Marshal.stringToAddress.marshal(signalName, null),
                    (Addressable) (parameters == null ? MemoryAddress.NULL : parameters.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
     * @param objectPath a D-Bus object path
     * @param actionGroup a {@link ActionGroup}
     * @return the ID of the export (never zero), or 0 in case of failure
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public int exportActionGroup(java.lang.String objectPath, org.gtk.gio.ActionGroup actionGroup) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_connection_export_action_group.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(objectPath, null),
                    actionGroup.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param objectPath a D-Bus object path
     * @param menu a {@link MenuModel}
     * @return the ID of the export (never zero), or 0 in case of failure
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public int exportMenuModel(java.lang.String objectPath, org.gtk.gio.MenuModel menu) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_connection_export_menu_model.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(objectPath, null),
                    menu.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param cancellable a {@link Cancellable} or {@code null}
     * @param callback a {@link AsyncReadyCallback} to call when the
     *     request is satisfied or {@code null} if you don't care about the result
     */
    public void flush(@Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_dbus_connection_flush.invokeExact(
                    handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an operation started with g_dbus_connection_flush().
     * @param res a {@link AsyncResult} obtained from the {@link AsyncReadyCallback} passed
     *     to g_dbus_connection_flush()
     * @return {@code true} if the operation succeeded, {@code false} if {@code error} is set
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean flushFinish(org.gtk.gio.AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_connection_flush_finish.invokeExact(
                    handle(),
                    res.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Synchronously flushes {@code connection}. The calling thread is blocked
     * until this is done. See g_dbus_connection_flush() for the
     * asynchronous version of this method and more details about what it
     * does.
     * @param cancellable a {@link Cancellable} or {@code null}
     * @return {@code true} if the operation succeeded, {@code false} if {@code error} is set
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean flushSync(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_connection_flush_sync.invokeExact(
                    handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the capabilities negotiated with the remote peer
     * @return zero or more flags from the {@link DBusCapabilityFlags} enumeration
     */
    public org.gtk.gio.DBusCapabilityFlags getCapabilities() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_connection_get_capabilities.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DBusCapabilityFlags(RESULT);
    }
    
    /**
     * Gets whether the process is terminated when {@code connection} is
     * closed by the remote peer. See
     * {@link DBusConnection}:exit-on-close for more details.
     * @return whether the process is terminated when {@code connection} is
     *     closed by the remote peer
     */
    public boolean getExitOnClose() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_connection_get_exit_on_close.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the flags used to construct this connection
     * @return zero or more flags from the {@link DBusConnectionFlags} enumeration
     */
    public org.gtk.gio.DBusConnectionFlags getFlags() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_connection_get_flags.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DBusConnectionFlags(RESULT);
    }
    
    /**
     * The GUID of the peer performing the role of server when
     * authenticating. See {@link DBusConnection}:guid for more details.
     * @return The GUID. Do not free this string, it is owned by
     *     {@code connection}.
     */
    public java.lang.String getGuid() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_connection_get_guid.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Retrieves the last serial number assigned to a {@link DBusMessage} on
     * the current thread. This includes messages sent via both low-level
     * API such as g_dbus_connection_send_message() as well as
     * high-level API such as g_dbus_connection_emit_signal(),
     * g_dbus_connection_call() or g_dbus_proxy_call().
     * @return the last used serial or zero when no message has been sent
     *     within the current thread
     */
    public int getLastSerial() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_connection_get_last_serial.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @return a {@link Credentials} or {@code null} if not
     *     available. Do not free this object, it is owned by {@code connection}.
     */
    public @Nullable org.gtk.gio.Credentials getPeerCredentials() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_connection_get_peer_credentials.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.Credentials) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.Credentials.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the underlying stream used for IO.
     * <p>
     * While the {@link DBusConnection} is active, it will interact with this
     * stream from a worker thread, so it is not safe to interact with
     * the stream directly.
     * @return the stream used for IO
     */
    public org.gtk.gio.IOStream getStream() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_connection_get_stream.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.IOStream) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.IOStream.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the unique name of {@code connection} as assigned by the message
     * bus. This can also be used to figure out if {@code connection} is a
     * message bus connection.
     * @return the unique name or {@code null} if {@code connection} is not a message
     *     bus connection. Do not free this string, it is owned by
     *     {@code connection}.
     */
    public @Nullable java.lang.String getUniqueName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_connection_get_unique_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets whether {@code connection} is closed.
     * @return {@code true} if the connection is closed, {@code false} otherwise
     */
    public boolean isClosed() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_connection_is_closed.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Version of g_dbus_connection_register_object() using closures instead of a
     * {@link DBusInterfaceVTable} for easier binding in other languages.
     * @param objectPath The object path to register at.
     * @param interfaceInfo Introspection data for the interface.
     * @param methodCallClosure {@link org.gtk.gobject.Closure} for handling incoming method calls.
     * @param getPropertyClosure {@link org.gtk.gobject.Closure} for getting a property.
     * @param setPropertyClosure {@link org.gtk.gobject.Closure} for setting a property.
     * @return 0 if {@code error} is set, otherwise a registration ID (never 0)
     * that can be used with g_dbus_connection_unregister_object() .
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public int registerObject(java.lang.String objectPath, org.gtk.gio.DBusInterfaceInfo interfaceInfo, @Nullable org.gtk.gobject.Closure methodCallClosure, @Nullable org.gtk.gobject.Closure getPropertyClosure, @Nullable org.gtk.gobject.Closure setPropertyClosure) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_connection_register_object_with_closures.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(objectPath, null),
                    interfaceInfo.handle(),
                    (Addressable) (methodCallClosure == null ? MemoryAddress.NULL : methodCallClosure.handle()),
                    (Addressable) (getPropertyClosure == null ? MemoryAddress.NULL : getPropertyClosure.handle()),
                    (Addressable) (setPropertyClosure == null ? MemoryAddress.NULL : setPropertyClosure.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param objectPath the object path to register the subtree at
     * @param vtable a {@link DBusSubtreeVTable} to enumerate, introspect and
     *     dispatch nodes in the subtree
     * @param flags flags used to fine tune the behavior of the subtree
     * @param userDataFreeFunc function to call when the subtree is unregistered
     * @return 0 if {@code error} is set, otherwise a subtree registration ID (never 0)
     * that can be used with g_dbus_connection_unregister_subtree()
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public int registerSubtree(java.lang.String objectPath, org.gtk.gio.DBusSubtreeVTable vtable, org.gtk.gio.DBusSubtreeFlags flags, org.gtk.glib.DestroyNotify userDataFreeFunc) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_connection_register_subtree.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(objectPath, null),
                    vtable.handle(),
                    flags.getValue(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) userDataFreeFunc.toCallback(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param filterId an identifier obtained from g_dbus_connection_add_filter()
     */
    public void removeFilter(int filterId) {
        try {
            DowncallHandles.g_dbus_connection_remove_filter.invokeExact(
                    handle(),
                    filterId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param message a {@link DBusMessage}
     * @param flags flags affecting how the message is sent
     * @param outSerial return location for serial number assigned
     *     to {@code message} when sending it or {@code null}
     * @return {@code true} if the message was well-formed and queued for
     *     transmission, {@code false} if {@code error} is set
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean sendMessage(org.gtk.gio.DBusMessage message, org.gtk.gio.DBusSendMessageFlags flags, Out<Integer> outSerial) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment outSerialPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_connection_send_message.invokeExact(
                    handle(),
                    message.handle(),
                    flags.getValue(),
                    (Addressable) (outSerial == null ? MemoryAddress.NULL : (Addressable) outSerialPOINTER.address()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        if (outSerial != null) outSerial.set(outSerialPOINTER.get(Interop.valueLayout.C_INT, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
     * @param message a {@link DBusMessage}
     * @param flags flags affecting how the message is sent
     * @param timeoutMsec the timeout in milliseconds, -1 to use the default
     *     timeout or {@code G_MAXINT} for no timeout
     * @param outSerial return location for serial number assigned
     *     to {@code message} when sending it or {@code null}
     * @param cancellable a {@link Cancellable} or {@code null}
     * @param callback a {@link AsyncReadyCallback} to call when the request
     *     is satisfied or {@code null} if you don't care about the result
     */
    public void sendMessageWithReply(org.gtk.gio.DBusMessage message, org.gtk.gio.DBusSendMessageFlags flags, int timeoutMsec, Out<Integer> outSerial, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        MemorySegment outSerialPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.g_dbus_connection_send_message_with_reply.invokeExact(
                    handle(),
                    message.handle(),
                    flags.getValue(),
                    timeoutMsec,
                    (Addressable) (outSerial == null ? MemoryAddress.NULL : (Addressable) outSerialPOINTER.address()),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (outSerial != null) outSerial.set(outSerialPOINTER.get(Interop.valueLayout.C_INT, 0));
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
     * @param res a {@link AsyncResult} obtained from the {@link AsyncReadyCallback} passed to
     *     g_dbus_connection_send_message_with_reply()
     * @return a locked {@link DBusMessage} or {@code null} if {@code error} is set
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.gio.DBusMessage sendMessageWithReplyFinish(org.gtk.gio.AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_connection_send_message_with_reply_finish.invokeExact(
                    handle(),
                    res.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (org.gtk.gio.DBusMessage) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.DBusMessage.fromAddress).marshal(RESULT, Ownership.FULL);
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
     * @param message a {@link DBusMessage}
     * @param flags flags affecting how the message is sent.
     * @param timeoutMsec the timeout in milliseconds, -1 to use the default
     *     timeout or {@code G_MAXINT} for no timeout
     * @param outSerial return location for serial number
     *     assigned to {@code message} when sending it or {@code null}
     * @param cancellable a {@link Cancellable} or {@code null}
     * @return a locked {@link DBusMessage} that is the reply
     *     to {@code message} or {@code null} if {@code error} is set
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.gio.DBusMessage sendMessageWithReplySync(org.gtk.gio.DBusMessage message, org.gtk.gio.DBusSendMessageFlags flags, int timeoutMsec, Out<Integer> outSerial, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment outSerialPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_connection_send_message_with_reply_sync.invokeExact(
                    handle(),
                    message.handle(),
                    flags.getValue(),
                    timeoutMsec,
                    (Addressable) (outSerial == null ? MemoryAddress.NULL : (Addressable) outSerialPOINTER.address()),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        if (outSerial != null) outSerial.set(outSerialPOINTER.get(Interop.valueLayout.C_INT, 0));
        return (org.gtk.gio.DBusMessage) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.DBusMessage.fromAddress).marshal(RESULT, Ownership.FULL);
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
     * @param exitOnClose whether the process should be terminated
     *     when {@code connection} is closed by the remote peer
     */
    public void setExitOnClose(boolean exitOnClose) {
        try {
            DowncallHandles.g_dbus_connection_set_exit_on_close.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(exitOnClose, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * to the signal subscription. For example, if a {@link org.gtk.gobject.GObject} is used to store the
     * subscription ID from g_dbus_connection_signal_subscribe(), a strong reference
     * to that {@link org.gtk.gobject.GObject} must be passed to {@code user_data}, and g_object_unref() passed to
     * {@code user_data_free_func}. You are responsible for breaking the resulting
     * reference count cycle by explicitly unsubscribing from the signal when
     * dropping the last external reference to the {@link org.gtk.gobject.GObject}. Alternatively, a weak
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
     * @param sender sender name to match on (unique or well-known name)
     *     or {@code null} to listen from all senders
     * @param interfaceName D-Bus interface name to match on or {@code null} to
     *     match on all interfaces
     * @param member D-Bus signal name to match on or {@code null} to match on
     *     all signals
     * @param objectPath object path to match on or {@code null} to match on
     *     all object paths
     * @param arg0 contents of first string argument to match on or {@code null}
     *     to match on all kinds of arguments
     * @param flags {@link DBusSignalFlags} describing how arg0 is used in subscribing to the
     *     signal
     * @param callback callback to invoke when there is a signal matching the requested data
     * @param userDataFreeFunc function to free {@code user_data} with when
     *     subscription is removed or {@code null}
     * @return a subscription identifier that can be used with g_dbus_connection_signal_unsubscribe()
     */
    public int signalSubscribe(@Nullable java.lang.String sender, @Nullable java.lang.String interfaceName, @Nullable java.lang.String member, @Nullable java.lang.String objectPath, @Nullable java.lang.String arg0, org.gtk.gio.DBusSignalFlags flags, org.gtk.gio.DBusSignalCallback callback, @Nullable org.gtk.glib.DestroyNotify userDataFreeFunc) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_connection_signal_subscribe.invokeExact(
                    handle(),
                    (Addressable) (sender == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(sender, null)),
                    (Addressable) (interfaceName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(interfaceName, null)),
                    (Addressable) (member == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(member, null)),
                    (Addressable) (objectPath == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(objectPath, null)),
                    (Addressable) (arg0 == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(arg0, null)),
                    flags.getValue(),
                    (Addressable) callback.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (userDataFreeFunc == null ? MemoryAddress.NULL : (Addressable) userDataFreeFunc.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
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
     * @param subscriptionId a subscription id obtained from
     *     g_dbus_connection_signal_subscribe()
     */
    public void signalUnsubscribe(int subscriptionId) {
        try {
            DowncallHandles.g_dbus_connection_signal_unsubscribe.invokeExact(
                    handle(),
                    subscriptionId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If {@code connection} was created with
     * {@link DBusConnectionFlags#DELAY_MESSAGE_PROCESSING}, this method
     * starts processing messages. Does nothing on if {@code connection} wasn't
     * created with this flag or if the method has already been called.
     */
    public void startMessageProcessing() {
        try {
            DowncallHandles.g_dbus_connection_start_message_processing.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Reverses the effect of a previous call to
     * g_dbus_connection_export_action_group().
     * <p>
     * It is an error to call this function with an ID that wasn't returned
     * from g_dbus_connection_export_action_group() or to call it with the
     * same ID more than once.
     * @param exportId the ID from g_dbus_connection_export_action_group()
     */
    public void unexportActionGroup(int exportId) {
        try {
            DowncallHandles.g_dbus_connection_unexport_action_group.invokeExact(
                    handle(),
                    exportId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Reverses the effect of a previous call to
     * g_dbus_connection_export_menu_model().
     * <p>
     * It is an error to call this function with an ID that wasn't returned
     * from g_dbus_connection_export_menu_model() or to call it with the
     * same ID more than once.
     * @param exportId the ID from g_dbus_connection_export_menu_model()
     */
    public void unexportMenuModel(int exportId) {
        try {
            DowncallHandles.g_dbus_connection_unexport_menu_model.invokeExact(
                    handle(),
                    exportId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unregisters an object.
     * @param registrationId a registration id obtained from
     *     g_dbus_connection_register_object()
     * @return {@code true} if the object was unregistered, {@code false} otherwise
     */
    public boolean unregisterObject(int registrationId) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_connection_unregister_object.invokeExact(
                    handle(),
                    registrationId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Unregisters a subtree.
     * @param registrationId a subtree registration id obtained from
     *     g_dbus_connection_register_subtree()
     * @return {@code true} if the subtree was unregistered, {@code false} otherwise
     */
    public boolean unregisterSubtree(int registrationId) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_connection_unregister_subtree.invokeExact(
                    handle(),
                    registrationId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_dbus_connection_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
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
     * @param stream a {@link IOStream}
     * @param guid the GUID to use if authenticating as a server or {@code null}
     * @param flags flags describing how to make the connection
     * @param observer a {@link DBusAuthObserver} or {@code null}
     * @param cancellable a {@link Cancellable} or {@code null}
     * @param callback a {@link AsyncReadyCallback} to call when the request is satisfied
     */
    public static void new_(org.gtk.gio.IOStream stream, @Nullable java.lang.String guid, org.gtk.gio.DBusConnectionFlags flags, @Nullable org.gtk.gio.DBusAuthObserver observer, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_dbus_connection_new.invokeExact(
                    stream.handle(),
                    (Addressable) (guid == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(guid, null)),
                    flags.getValue(),
                    (Addressable) (observer == null ? MemoryAddress.NULL : observer.handle()),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
     * @param address a D-Bus address
     * @param flags flags describing how to make the connection
     * @param observer a {@link DBusAuthObserver} or {@code null}
     * @param cancellable a {@link Cancellable} or {@code null}
     * @param callback a {@link AsyncReadyCallback} to call when the request is satisfied
     */
    public static void newForAddress(java.lang.String address, org.gtk.gio.DBusConnectionFlags flags, @Nullable org.gtk.gio.DBusAuthObserver observer, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_dbus_connection_new_for_address.invokeExact(
                    Marshal.stringToAddress.marshal(address, null),
                    flags.getValue(),
                    (Addressable) (observer == null ? MemoryAddress.NULL : observer.handle()),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Closed {
        void run(boolean remotePeerVanished, @Nullable org.gtk.glib.Error error);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceDBusConnection, int remotePeerVanished, MemoryAddress error) {
            run(Marshal.integerToBoolean.marshal(remotePeerVanished, null).booleanValue(), org.gtk.glib.Error.fromAddress.marshal(error, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Closed.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when the connection is closed.
     * <p>
     * The cause of this event can be
     * <ul>
     * <li>If g_dbus_connection_close() is called. In this case
     *   {@code remote_peer_vanished} is set to {@code false} and {@code error} is {@code null}.
     * </ul>
     * <ul>
     * <li>If the remote peer closes the connection. In this case
     *   {@code remote_peer_vanished} is set to {@code true} and {@code error} is set.
     * </ul>
     * <ul>
     * <li>If the remote peer sends invalid or malformed data. In this
     *   case {@code remote_peer_vanished} is set to {@code false} and {@code error} is set.
     * </ul>
     * <p>
     * Upon receiving this signal, you should give up your reference to
     * {@code connection}. You are guaranteed that this signal is emitted only
     * once.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DBusConnection.Closed> onClosed(DBusConnection.Closed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("closed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link DBusConnection.Builder} object constructs a {@link DBusConnection} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link DBusConnection.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link DBusConnection} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DBusConnection}.
         * @return A new instance of {@code DBusConnection} with the properties 
         *         that were set in the Builder object.
         */
        public DBusConnection build() {
            return (DBusConnection) org.gtk.gobject.GObject.newWithProperties(
                DBusConnection.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * A D-Bus address specifying potential endpoints that can be used
         * when establishing the connection.
         * @param address The value for the {@code address} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAddress(java.lang.String address) {
            names.add("address");
            values.add(org.gtk.gobject.Value.create(address));
            return this;
        }
        
        /**
         * A {@link DBusAuthObserver} object to assist in the authentication process or {@code null}.
         * @param authenticationObserver The value for the {@code authentication-observer} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAuthenticationObserver(org.gtk.gio.DBusAuthObserver authenticationObserver) {
            names.add("authentication-observer");
            values.add(org.gtk.gobject.Value.create(authenticationObserver));
            return this;
        }
        
        /**
         * Flags from the {@link DBusCapabilityFlags} enumeration
         * representing connection features negotiated with the other peer.
         * @param capabilities The value for the {@code capabilities} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCapabilities(org.gtk.gio.DBusCapabilityFlags capabilities) {
            names.add("capabilities");
            values.add(org.gtk.gobject.Value.create(capabilities));
            return this;
        }
        
        /**
         * A boolean specifying whether the connection has been closed.
         * @param closed The value for the {@code closed} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setClosed(boolean closed) {
            names.add("closed");
            values.add(org.gtk.gobject.Value.create(closed));
            return this;
        }
        
        /**
         * A boolean specifying whether the process will be terminated (by
         * calling {@code raise(SIGTERM)}) if the connection is closed by the
         * remote peer.
         * <p>
         * Note that {@link DBusConnection} objects returned by g_bus_get_finish()
         * and g_bus_get_sync() will (usually) have this property set to {@code true}.
         * @param exitOnClose The value for the {@code exit-on-close} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setExitOnClose(boolean exitOnClose) {
            names.add("exit-on-close");
            values.add(org.gtk.gobject.Value.create(exitOnClose));
            return this;
        }
        
        /**
         * Flags from the {@link DBusConnectionFlags} enumeration.
         * @param flags The value for the {@code flags} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFlags(org.gtk.gio.DBusConnectionFlags flags) {
            names.add("flags");
            values.add(org.gtk.gobject.Value.create(flags));
            return this;
        }
        
        /**
         * The GUID of the peer performing the role of server when
         * authenticating.
         * <p>
         * If you are constructing a {@link DBusConnection} and pass
         * {@link DBusConnectionFlags#AUTHENTICATION_SERVER} in the
         * {@link DBusConnection}:flags property then you <strong>must</strong> also set this
         * property to a valid guid.
         * <p>
         * If you are constructing a {@link DBusConnection} and pass
         * {@link DBusConnectionFlags#AUTHENTICATION_CLIENT} in the
         * {@link DBusConnection}:flags property you will be able to read the GUID
         * of the other peer here after the connection has been successfully
         * initialized.
         * <p>
         * Note that the
         * <a href="https://dbus.freedesktop.org/doc/dbus-specification.html#addresses">D-Bus specification</a>
         * uses the term ‘UUID’ to refer to this, whereas GLib consistently uses the
         * term ‘GUID’ for historical reasons.
         * <p>
         * Despite its name, the format of {@link DBusConnection}:guid does not follow
         * <a href="https://datatracker.ietf.org/doc/html/rfc4122">RFC 4122</a> or the Microsoft
         * GUID format.
         * @param guid The value for the {@code guid} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGuid(java.lang.String guid) {
            names.add("guid");
            values.add(org.gtk.gobject.Value.create(guid));
            return this;
        }
        
        /**
         * The underlying {@link IOStream} used for I/O.
         * <p>
         * If this is passed on construction and is a {@link SocketConnection},
         * then the corresponding {@link Socket} will be put into non-blocking mode.
         * <p>
         * While the {@link DBusConnection} is active, it will interact with this
         * stream from a worker thread, so it is not safe to interact with
         * the stream directly.
         * @param stream The value for the {@code stream} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setStream(org.gtk.gio.IOStream stream) {
            names.add("stream");
            values.add(org.gtk.gobject.Value.create(stream));
            return this;
        }
        
        /**
         * The unique name as assigned by the message bus or {@code null} if the
         * connection is not open or not a message bus connection.
         * @param uniqueName The value for the {@code unique-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUniqueName(java.lang.String uniqueName) {
            names.add("unique-name");
            values.add(org.gtk.gobject.Value.create(uniqueName));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_dbus_connection_new_finish = Interop.downcallHandle(
            "g_dbus_connection_new_finish",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_connection_new_for_address_finish = Interop.downcallHandle(
            "g_dbus_connection_new_for_address_finish",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_connection_new_for_address_sync = Interop.downcallHandle(
            "g_dbus_connection_new_for_address_sync",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_connection_new_sync = Interop.downcallHandle(
            "g_dbus_connection_new_sync",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_connection_add_filter = Interop.downcallHandle(
            "g_dbus_connection_add_filter",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_connection_call = Interop.downcallHandle(
            "g_dbus_connection_call",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_connection_call_finish = Interop.downcallHandle(
            "g_dbus_connection_call_finish",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_connection_call_sync = Interop.downcallHandle(
            "g_dbus_connection_call_sync",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_connection_call_with_unix_fd_list = Interop.downcallHandle(
            "g_dbus_connection_call_with_unix_fd_list",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_connection_call_with_unix_fd_list_finish = Interop.downcallHandle(
            "g_dbus_connection_call_with_unix_fd_list_finish",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_connection_call_with_unix_fd_list_sync = Interop.downcallHandle(
            "g_dbus_connection_call_with_unix_fd_list_sync",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_connection_close = Interop.downcallHandle(
            "g_dbus_connection_close",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_connection_close_finish = Interop.downcallHandle(
            "g_dbus_connection_close_finish",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_connection_close_sync = Interop.downcallHandle(
            "g_dbus_connection_close_sync",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_connection_emit_signal = Interop.downcallHandle(
            "g_dbus_connection_emit_signal",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_connection_export_action_group = Interop.downcallHandle(
            "g_dbus_connection_export_action_group",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_connection_export_menu_model = Interop.downcallHandle(
            "g_dbus_connection_export_menu_model",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_connection_flush = Interop.downcallHandle(
            "g_dbus_connection_flush",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_connection_flush_finish = Interop.downcallHandle(
            "g_dbus_connection_flush_finish",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_connection_flush_sync = Interop.downcallHandle(
            "g_dbus_connection_flush_sync",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_connection_get_capabilities = Interop.downcallHandle(
            "g_dbus_connection_get_capabilities",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_connection_get_exit_on_close = Interop.downcallHandle(
            "g_dbus_connection_get_exit_on_close",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_connection_get_flags = Interop.downcallHandle(
            "g_dbus_connection_get_flags",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_connection_get_guid = Interop.downcallHandle(
            "g_dbus_connection_get_guid",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_connection_get_last_serial = Interop.downcallHandle(
            "g_dbus_connection_get_last_serial",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_connection_get_peer_credentials = Interop.downcallHandle(
            "g_dbus_connection_get_peer_credentials",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_connection_get_stream = Interop.downcallHandle(
            "g_dbus_connection_get_stream",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_connection_get_unique_name = Interop.downcallHandle(
            "g_dbus_connection_get_unique_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_connection_is_closed = Interop.downcallHandle(
            "g_dbus_connection_is_closed",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_connection_register_object_with_closures = Interop.downcallHandle(
            "g_dbus_connection_register_object_with_closures",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_connection_register_subtree = Interop.downcallHandle(
            "g_dbus_connection_register_subtree",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_connection_remove_filter = Interop.downcallHandle(
            "g_dbus_connection_remove_filter",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_dbus_connection_send_message = Interop.downcallHandle(
            "g_dbus_connection_send_message",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_connection_send_message_with_reply = Interop.downcallHandle(
            "g_dbus_connection_send_message_with_reply",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_connection_send_message_with_reply_finish = Interop.downcallHandle(
            "g_dbus_connection_send_message_with_reply_finish",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_connection_send_message_with_reply_sync = Interop.downcallHandle(
            "g_dbus_connection_send_message_with_reply_sync",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_connection_set_exit_on_close = Interop.downcallHandle(
            "g_dbus_connection_set_exit_on_close",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_dbus_connection_signal_subscribe = Interop.downcallHandle(
            "g_dbus_connection_signal_subscribe",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_connection_signal_unsubscribe = Interop.downcallHandle(
            "g_dbus_connection_signal_unsubscribe",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_dbus_connection_start_message_processing = Interop.downcallHandle(
            "g_dbus_connection_start_message_processing",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_connection_unexport_action_group = Interop.downcallHandle(
            "g_dbus_connection_unexport_action_group",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_dbus_connection_unexport_menu_model = Interop.downcallHandle(
            "g_dbus_connection_unexport_menu_model",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_dbus_connection_unregister_object = Interop.downcallHandle(
            "g_dbus_connection_unregister_object",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_dbus_connection_unregister_subtree = Interop.downcallHandle(
            "g_dbus_connection_unregister_subtree",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_dbus_connection_get_type = Interop.downcallHandle(
            "g_dbus_connection_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_dbus_connection_new = Interop.downcallHandle(
            "g_dbus_connection_new",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_connection_new_for_address = Interop.downcallHandle(
            "g_dbus_connection_new_for_address",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
