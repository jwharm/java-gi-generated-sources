package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link DBusProxy} is a base class used for proxies to access a D-Bus
 * interface on a remote object. A {@link DBusProxy} can be constructed for
 * both well-known and unique names.
 * <p>
 * By default, {@link DBusProxy} will cache all properties (and listen to
 * changes) of the remote object, and proxy all signals that get
 * emitted. This behaviour can be changed by passing suitable
 * {@link DBusProxyFlags} when the proxy is created. If the proxy is for a
 * well-known name, the property cache is flushed when the name owner
 * vanishes and reloaded when a name owner appears.
 * <p>
 * The unique name owner of the proxy's name is tracked and can be read from
 * {@link DBusProxy}:g-name-owner. Connect to the {@link org.gtk.gobject.GObject}::notify signal to
 * get notified of changes. Additionally, only signals and property
 * changes emitted from the current name owner are considered and
 * calls are always sent to the current name owner. This avoids a
 * number of race conditions when the name is lost by one owner and
 * claimed by another. However, if no name owner currently exists,
 * then calls will be sent to the well-known name which may result in
 * the message bus launching an owner (unless
 * {@link DBusProxyFlags#DO_NOT_AUTO_START} is set).
 * <p>
 * If the proxy is for a stateless D-Bus service, where the name owner may
 * be started and stopped between calls, the {@link DBusProxy}:g-name-owner tracking
 * of {@link DBusProxy} will cause the proxy to drop signal and property changes from
 * the service after it has restarted for the first time. When interacting
 * with a stateless D-Bus service, do not use {@link DBusProxy} — use direct D-Bus
 * method calls and signal connections.
 * <p>
 * The generic {@link DBusProxy}::g-properties-changed and
 * {@link DBusProxy}::g-signal signals are not very convenient to work with.
 * Therefore, the recommended way of working with proxies is to subclass
 * {@link DBusProxy}, and have more natural properties and signals in your derived
 * class. This [example][gdbus-example-gdbus-codegen] shows how this can
 * easily be done using the [gdbus-codegen][gdbus-codegen] tool.
 * <p>
 * A {@link DBusProxy} instance can be used from multiple threads but note
 * that all signals (e.g. {@link DBusProxy}::g-signal, {@link DBusProxy}::g-properties-changed
 * and {@link org.gtk.gobject.GObject}::notify) are emitted in the
 * [thread-default main context][g-main-context-push-thread-default]
 * of the thread where the instance was constructed.
 * <p>
 * An example using a proxy for a well-known name can be found in
 * <a href="https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-watch-proxy.c">gdbus-example-watch-proxy.c</a>
 * @version 2.26
 */
public class DBusProxy extends org.gtk.gobject.GObject implements org.gtk.gio.AsyncInitable, org.gtk.gio.DBusInterface, org.gtk.gio.Initable {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusProxy";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a DBusProxy proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DBusProxy(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DBusProxy> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DBusProxy(input, ownership);
    
    private static MemoryAddress constructNewFinish(org.gtk.gio.AsyncResult res) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_proxy_new_finish.invokeExact(
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
     * Finishes creating a {@link DBusProxy}.
     * @param res A {@link AsyncResult} obtained from the {@link AsyncReadyCallback} function passed to g_dbus_proxy_new().
     * @return A {@link DBusProxy} or {@code null} if {@code error} is set.
     *    Free with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static DBusProxy newFinish(org.gtk.gio.AsyncResult res) throws GErrorException {
        var RESULT = constructNewFinish(res);
        return (org.gtk.gio.DBusProxy) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.DBusProxy.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewForBusFinish(org.gtk.gio.AsyncResult res) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_proxy_new_for_bus_finish.invokeExact(
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
     * Finishes creating a {@link DBusProxy}.
     * @param res A {@link AsyncResult} obtained from the {@link AsyncReadyCallback} function passed to g_dbus_proxy_new_for_bus().
     * @return A {@link DBusProxy} or {@code null} if {@code error} is set.
     *    Free with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static DBusProxy newForBusFinish(org.gtk.gio.AsyncResult res) throws GErrorException {
        var RESULT = constructNewForBusFinish(res);
        return (org.gtk.gio.DBusProxy) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.DBusProxy.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewForBusSync(org.gtk.gio.BusType busType, org.gtk.gio.DBusProxyFlags flags, @Nullable org.gtk.gio.DBusInterfaceInfo info, java.lang.String name, java.lang.String objectPath, java.lang.String interfaceName, @Nullable org.gtk.gio.Cancellable cancellable) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_proxy_new_for_bus_sync.invokeExact(
                    busType.getValue(),
                    flags.getValue(),
                    (Addressable) (info == null ? MemoryAddress.NULL : info.handle()),
                    Marshal.stringToAddress.marshal(name, null),
                    Marshal.stringToAddress.marshal(objectPath, null),
                    Marshal.stringToAddress.marshal(interfaceName, null),
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
     * Like g_dbus_proxy_new_sync() but takes a {@link BusType} instead of a {@link DBusConnection}.
     * <p>
     * {@link DBusProxy} is used in this [example][gdbus-wellknown-proxy].
     * @param busType A {@link BusType}.
     * @param flags Flags used when constructing the proxy.
     * @param info A {@link DBusInterfaceInfo} specifying the minimal interface
     *        that {@code proxy} conforms to or {@code null}.
     * @param name A bus name (well-known or unique).
     * @param objectPath An object path.
     * @param interfaceName A D-Bus interface name.
     * @param cancellable A {@link Cancellable} or {@code null}.
     * @return A {@link DBusProxy} or {@code null} if error is set.
     *    Free with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static DBusProxy newForBusSync(org.gtk.gio.BusType busType, org.gtk.gio.DBusProxyFlags flags, @Nullable org.gtk.gio.DBusInterfaceInfo info, java.lang.String name, java.lang.String objectPath, java.lang.String interfaceName, @Nullable org.gtk.gio.Cancellable cancellable) throws GErrorException {
        var RESULT = constructNewForBusSync(busType, flags, info, name, objectPath, interfaceName, cancellable);
        return (org.gtk.gio.DBusProxy) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.DBusProxy.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewSync(org.gtk.gio.DBusConnection connection, org.gtk.gio.DBusProxyFlags flags, @Nullable org.gtk.gio.DBusInterfaceInfo info, @Nullable java.lang.String name, java.lang.String objectPath, java.lang.String interfaceName, @Nullable org.gtk.gio.Cancellable cancellable) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_proxy_new_sync.invokeExact(
                    connection.handle(),
                    flags.getValue(),
                    (Addressable) (info == null ? MemoryAddress.NULL : info.handle()),
                    (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, null)),
                    Marshal.stringToAddress.marshal(objectPath, null),
                    Marshal.stringToAddress.marshal(interfaceName, null),
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
     * Creates a proxy for accessing {@code interface_name} on the remote object
     * at {@code object_path} owned by {@code name} at {@code connection} and synchronously
     * loads D-Bus properties unless the
     * {@link DBusProxyFlags#DO_NOT_LOAD_PROPERTIES} flag is used.
     * <p>
     * If the {@link DBusProxyFlags#DO_NOT_CONNECT_SIGNALS} flag is not set, also sets up
     * match rules for signals. Connect to the {@link DBusProxy}::g-signal signal
     * to handle signals from the remote object.
     * <p>
     * If both {@link DBusProxyFlags#DO_NOT_LOAD_PROPERTIES} and
     * {@link DBusProxyFlags#DO_NOT_CONNECT_SIGNALS} are set, this constructor is
     * guaranteed to return immediately without blocking.
     * <p>
     * If {@code name} is a well-known name and the
     * {@link DBusProxyFlags#DO_NOT_AUTO_START} and {@link DBusProxyFlags#DO_NOT_AUTO_START_AT_CONSTRUCTION}
     * flags aren't set and no name owner currently exists, the message bus
     * will be requested to launch a name owner for the name.
     * <p>
     * This is a synchronous failable constructor. See g_dbus_proxy_new()
     * and g_dbus_proxy_new_finish() for the asynchronous version.
     * <p>
     * {@link DBusProxy} is used in this [example][gdbus-wellknown-proxy].
     * @param connection A {@link DBusConnection}.
     * @param flags Flags used when constructing the proxy.
     * @param info A {@link DBusInterfaceInfo} specifying the minimal interface that {@code proxy} conforms to or {@code null}.
     * @param name A bus name (well-known or unique) or {@code null} if {@code connection} is not a message bus connection.
     * @param objectPath An object path.
     * @param interfaceName A D-Bus interface name.
     * @param cancellable A {@link Cancellable} or {@code null}.
     * @return A {@link DBusProxy} or {@code null} if error is set.
     *    Free with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static DBusProxy newSync(org.gtk.gio.DBusConnection connection, org.gtk.gio.DBusProxyFlags flags, @Nullable org.gtk.gio.DBusInterfaceInfo info, @Nullable java.lang.String name, java.lang.String objectPath, java.lang.String interfaceName, @Nullable org.gtk.gio.Cancellable cancellable) throws GErrorException {
        var RESULT = constructNewSync(connection, flags, info, name, objectPath, interfaceName, cancellable);
        return (org.gtk.gio.DBusProxy) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.DBusProxy.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Asynchronously invokes the {@code method_name} method on {@code proxy}.
     * <p>
     * If {@code method_name} contains any dots, then {@code name} is split into interface and
     * method name parts. This allows using {@code proxy} for invoking methods on
     * other interfaces.
     * <p>
     * If the {@link DBusConnection} associated with {@code proxy} is closed then
     * the operation will fail with {@link IOErrorEnum#CLOSED}. If
     * {@code cancellable} is canceled, the operation will fail with
     * {@link IOErrorEnum#CANCELLED}. If {@code parameters} contains a value not
     * compatible with the D-Bus protocol, the operation fails with
     * {@link IOErrorEnum#INVALID_ARGUMENT}.
     * <p>
     * If the {@code parameters} {@link org.gtk.glib.Variant} is floating, it is consumed. This allows
     * convenient 'inline' use of g_variant_new(), e.g.:
     * <pre>{@code <!-- language="C" -->
     *  g_dbus_proxy_call (proxy,
     *                     "TwoStrings",
     *                     g_variant_new ("(ss)",
     *                                    "Thing One",
     *                                    "Thing Two"),
     *                     G_DBUS_CALL_FLAGS_NONE,
     *                     -1,
     *                     NULL,
     *                     (GAsyncReadyCallback) two_strings_done,
     *                     &data);
     * }</pre>
     * <p>
     * If {@code proxy} has an expected interface (see
     * {@link DBusProxy}:g-interface-info) and {@code method_name} is referenced by it,
     * then the return value is checked against the return type.
     * <p>
     * This is an asynchronous method. When the operation is finished,
     * {@code callback} will be invoked in the
     * [thread-default main context][g-main-context-push-thread-default]
     * of the thread you are calling this method from.
     * You can then call g_dbus_proxy_call_finish() to get the result of
     * the operation. See g_dbus_proxy_call_sync() for the synchronous
     * version of this method.
     * <p>
     * If {@code callback} is {@code null} then the D-Bus method call message will be sent with
     * the {@link DBusMessageFlags#NO_REPLY_EXPECTED} flag set.
     * @param methodName Name of method to invoke.
     * @param parameters A {@link org.gtk.glib.Variant} tuple with parameters for the signal or {@code null} if not passing parameters.
     * @param flags Flags from the {@link DBusCallFlags} enumeration.
     * @param timeoutMsec The timeout in milliseconds (with {@code G_MAXINT} meaning
     *                "infinite") or -1 to use the proxy default timeout.
     * @param cancellable A {@link Cancellable} or {@code null}.
     * @param callback A {@link AsyncReadyCallback} to call when the request is satisfied or {@code null} if you don't
     * care about the result of the method invocation.
     */
    public void call(java.lang.String methodName, @Nullable org.gtk.glib.Variant parameters, org.gtk.gio.DBusCallFlags flags, int timeoutMsec, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_dbus_proxy_call.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(methodName, null),
                    (Addressable) (parameters == null ? MemoryAddress.NULL : parameters.handle()),
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
     * Finishes an operation started with g_dbus_proxy_call().
     * @param res A {@link AsyncResult} obtained from the {@link AsyncReadyCallback} passed to g_dbus_proxy_call().
     * @return {@code null} if {@code error} is set. Otherwise a {@link org.gtk.glib.Variant} tuple with
     * return values. Free with g_variant_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.glib.Variant callFinish(org.gtk.gio.AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_proxy_call_finish.invokeExact(
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
     * Synchronously invokes the {@code method_name} method on {@code proxy}.
     * <p>
     * If {@code method_name} contains any dots, then {@code name} is split into interface and
     * method name parts. This allows using {@code proxy} for invoking methods on
     * other interfaces.
     * <p>
     * If the {@link DBusConnection} associated with {@code proxy} is disconnected then
     * the operation will fail with {@link IOErrorEnum#CLOSED}. If
     * {@code cancellable} is canceled, the operation will fail with
     * {@link IOErrorEnum#CANCELLED}. If {@code parameters} contains a value not
     * compatible with the D-Bus protocol, the operation fails with
     * {@link IOErrorEnum#INVALID_ARGUMENT}.
     * <p>
     * If the {@code parameters} {@link org.gtk.glib.Variant} is floating, it is consumed. This allows
     * convenient 'inline' use of g_variant_new(), e.g.:
     * <pre>{@code <!-- language="C" -->
     *  g_dbus_proxy_call_sync (proxy,
     *                          "TwoStrings",
     *                          g_variant_new ("(ss)",
     *                                         "Thing One",
     *                                         "Thing Two"),
     *                          G_DBUS_CALL_FLAGS_NONE,
     *                          -1,
     *                          NULL,
     *                          &error);
     * }</pre>
     * <p>
     * The calling thread is blocked until a reply is received. See
     * g_dbus_proxy_call() for the asynchronous version of this
     * method.
     * <p>
     * If {@code proxy} has an expected interface (see
     * {@link DBusProxy}:g-interface-info) and {@code method_name} is referenced by it,
     * then the return value is checked against the return type.
     * @param methodName Name of method to invoke.
     * @param parameters A {@link org.gtk.glib.Variant} tuple with parameters for the signal
     *              or {@code null} if not passing parameters.
     * @param flags Flags from the {@link DBusCallFlags} enumeration.
     * @param timeoutMsec The timeout in milliseconds (with {@code G_MAXINT} meaning
     *                "infinite") or -1 to use the proxy default timeout.
     * @param cancellable A {@link Cancellable} or {@code null}.
     * @return {@code null} if {@code error} is set. Otherwise a {@link org.gtk.glib.Variant} tuple with
     * return values. Free with g_variant_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.glib.Variant callSync(java.lang.String methodName, @Nullable org.gtk.glib.Variant parameters, org.gtk.gio.DBusCallFlags flags, int timeoutMsec, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_proxy_call_sync.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(methodName, null),
                    (Addressable) (parameters == null ? MemoryAddress.NULL : parameters.handle()),
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
     * Like g_dbus_proxy_call() but also takes a {@link UnixFDList} object.
     * <p>
     * This method is only available on UNIX.
     * @param methodName Name of method to invoke.
     * @param parameters A {@link org.gtk.glib.Variant} tuple with parameters for the signal or {@code null} if not passing parameters.
     * @param flags Flags from the {@link DBusCallFlags} enumeration.
     * @param timeoutMsec The timeout in milliseconds (with {@code G_MAXINT} meaning
     *                "infinite") or -1 to use the proxy default timeout.
     * @param fdList A {@link UnixFDList} or {@code null}.
     * @param cancellable A {@link Cancellable} or {@code null}.
     * @param callback A {@link AsyncReadyCallback} to call when the request is satisfied or {@code null} if you don't
     * care about the result of the method invocation.
     */
    public void callWithUnixFdList(java.lang.String methodName, @Nullable org.gtk.glib.Variant parameters, org.gtk.gio.DBusCallFlags flags, int timeoutMsec, @Nullable org.gtk.gio.UnixFDList fdList, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_dbus_proxy_call_with_unix_fd_list.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(methodName, null),
                    (Addressable) (parameters == null ? MemoryAddress.NULL : parameters.handle()),
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
     * Finishes an operation started with g_dbus_proxy_call_with_unix_fd_list().
     * @param outFdList Return location for a {@link UnixFDList} or {@code null}.
     * @param res A {@link AsyncResult} obtained from the {@link AsyncReadyCallback} passed to g_dbus_proxy_call_with_unix_fd_list().
     * @return {@code null} if {@code error} is set. Otherwise a {@link org.gtk.glib.Variant} tuple with
     * return values. Free with g_variant_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.glib.Variant callWithUnixFdListFinish(@Nullable Out<org.gtk.gio.UnixFDList> outFdList, org.gtk.gio.AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment outFdListPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_proxy_call_with_unix_fd_list_finish.invokeExact(
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
     * Like g_dbus_proxy_call_sync() but also takes and returns {@link UnixFDList} objects.
     * <p>
     * This method is only available on UNIX.
     * @param methodName Name of method to invoke.
     * @param parameters A {@link org.gtk.glib.Variant} tuple with parameters for the signal
     *              or {@code null} if not passing parameters.
     * @param flags Flags from the {@link DBusCallFlags} enumeration.
     * @param timeoutMsec The timeout in milliseconds (with {@code G_MAXINT} meaning
     *                "infinite") or -1 to use the proxy default timeout.
     * @param fdList A {@link UnixFDList} or {@code null}.
     * @param outFdList Return location for a {@link UnixFDList} or {@code null}.
     * @param cancellable A {@link Cancellable} or {@code null}.
     * @return {@code null} if {@code error} is set. Otherwise a {@link org.gtk.glib.Variant} tuple with
     * return values. Free with g_variant_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.glib.Variant callWithUnixFdListSync(java.lang.String methodName, @Nullable org.gtk.glib.Variant parameters, org.gtk.gio.DBusCallFlags flags, int timeoutMsec, @Nullable org.gtk.gio.UnixFDList fdList, @Nullable Out<org.gtk.gio.UnixFDList> outFdList, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment outFdListPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_proxy_call_with_unix_fd_list_sync.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(methodName, null),
                    (Addressable) (parameters == null ? MemoryAddress.NULL : parameters.handle()),
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
     * Looks up the value for a property from the cache. This call does no
     * blocking IO.
     * <p>
     * If {@code proxy} has an expected interface (see
     * {@link DBusProxy}:g-interface-info) and {@code property_name} is referenced by
     * it, then {@code value} is checked against the type of the property.
     * @param propertyName Property name.
     * @return A reference to the {@link org.gtk.glib.Variant} instance
     *    that holds the value for {@code property_name} or {@code null} if the value is not in
     *    the cache. The returned reference must be freed with g_variant_unref().
     */
    public @Nullable org.gtk.glib.Variant getCachedProperty(java.lang.String propertyName) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_proxy_get_cached_property.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(propertyName, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the names of all cached properties on {@code proxy}.
     * @return A
     *          {@code null}-terminated array of strings or {@code null} if
     *          {@code proxy} has no cached properties. Free the returned array with
     *          g_strfreev().
     */
    public @Nullable PointerString getCachedPropertyNames() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_proxy_get_cached_property_names.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Gets the connection {@code proxy} is for.
     * @return A {@link DBusConnection} owned by {@code proxy}. Do not free.
     */
    public org.gtk.gio.DBusConnection getConnection() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_proxy_get_connection.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.DBusConnection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.DBusConnection.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the timeout to use if -1 (specifying default timeout) is
     * passed as {@code timeout_msec} in the g_dbus_proxy_call() and
     * g_dbus_proxy_call_sync() functions.
     * <p>
     * See the {@link DBusProxy}:g-default-timeout property for more details.
     * @return Timeout to use for {@code proxy}.
     */
    public int getDefaultTimeout() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_proxy_get_default_timeout.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the flags that {@code proxy} was constructed with.
     * @return Flags from the {@link DBusProxyFlags} enumeration.
     */
    public org.gtk.gio.DBusProxyFlags getFlags() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_proxy_get_flags.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DBusProxyFlags(RESULT);
    }
    
    /**
     * Returns the {@link DBusInterfaceInfo}, if any, specifying the interface
     * that {@code proxy} conforms to. See the {@link DBusProxy}:g-interface-info
     * property for more details.
     * @return A {@link DBusInterfaceInfo} or {@code null}.
     *    Do not unref the returned object, it is owned by {@code proxy}.
     */
    public @Nullable org.gtk.gio.DBusInterfaceInfo getInterfaceInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_proxy_get_interface_info.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gio.DBusInterfaceInfo.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the D-Bus interface name {@code proxy} is for.
     * @return A string owned by {@code proxy}. Do not free.
     */
    public java.lang.String getInterfaceName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_proxy_get_interface_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the name that {@code proxy} was constructed for.
     * <p>
     * When connected to a message bus, this will usually be non-{@code null}.
     * However, it may be {@code null} for a proxy that communicates using a peer-to-peer
     * pattern.
     * @return A string owned by {@code proxy}. Do not free.
     */
    public @Nullable java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_proxy_get_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * The unique name that owns the name that {@code proxy} is for or {@code null} if
     * no-one currently owns that name. You may connect to the
     * {@link org.gtk.gobject.GObject}::notify signal to track changes to the
     * {@link DBusProxy}:g-name-owner property.
     * @return The name owner or {@code null} if no name
     *    owner exists. Free with g_free().
     */
    public @Nullable java.lang.String getNameOwner() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_proxy_get_name_owner.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the object path {@code proxy} is for.
     * @return A string owned by {@code proxy}. Do not free.
     */
    public java.lang.String getObjectPath() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_proxy_get_object_path.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * If {@code value} is not {@code null}, sets the cached value for the property with
     * name {@code property_name} to the value in {@code value}.
     * <p>
     * If {@code value} is {@code null}, then the cached value is removed from the
     * property cache.
     * <p>
     * If {@code proxy} has an expected interface (see
     * {@link DBusProxy}:g-interface-info) and {@code property_name} is referenced by
     * it, then {@code value} is checked against the type of the property.
     * <p>
     * If the {@code value} {@link org.gtk.glib.Variant} is floating, it is consumed. This allows
     * convenient 'inline' use of g_variant_new(), e.g.
     * <pre>{@code <!-- language="C" -->
     *  g_dbus_proxy_set_cached_property (proxy,
     *                                    "SomeProperty",
     *                                    g_variant_new ("(si)",
     *                                                  "A String",
     *                                                  42));
     * }</pre>
     * <p>
     * Normally you will not need to use this method since {@code proxy}
     * is tracking changes using the
     * {@code org.freedesktop.DBus.Properties.PropertiesChanged}
     * D-Bus signal. However, for performance reasons an object may
     * decide to not use this signal for some properties and instead
     * use a proprietary out-of-band mechanism to transmit changes.
     * <p>
     * As a concrete example, consider an object with a property
     * {@code ChatroomParticipants} which is an array of strings. Instead of
     * transmitting the same (long) array every time the property changes,
     * it is more efficient to only transmit the delta using e.g. signals
     * {@code ChatroomParticipantJoined(String name)} and
     * {@code ChatroomParticipantParted(String name)}.
     * @param propertyName Property name.
     * @param value Value for the property or {@code null} to remove it from the cache.
     */
    public void setCachedProperty(java.lang.String propertyName, @Nullable org.gtk.glib.Variant value) {
        try {
            DowncallHandles.g_dbus_proxy_set_cached_property.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(propertyName, null),
                    (Addressable) (value == null ? MemoryAddress.NULL : value.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the timeout to use if -1 (specifying default timeout) is
     * passed as {@code timeout_msec} in the g_dbus_proxy_call() and
     * g_dbus_proxy_call_sync() functions.
     * <p>
     * See the {@link DBusProxy}:g-default-timeout property for more details.
     * @param timeoutMsec Timeout in milliseconds.
     */
    public void setDefaultTimeout(int timeoutMsec) {
        try {
            DowncallHandles.g_dbus_proxy_set_default_timeout.invokeExact(
                    handle(),
                    timeoutMsec);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Ensure that interactions with {@code proxy} conform to the given
     * interface. See the {@link DBusProxy}:g-interface-info property for more
     * details.
     * @param info Minimum interface this proxy conforms to
     *    or {@code null} to unset.
     */
    public void setInterfaceInfo(@Nullable org.gtk.gio.DBusInterfaceInfo info) {
        try {
            DowncallHandles.g_dbus_proxy_set_interface_info.invokeExact(
                    handle(),
                    (Addressable) (info == null ? MemoryAddress.NULL : info.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_dbus_proxy_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Creates a proxy for accessing {@code interface_name} on the remote object
     * at {@code object_path} owned by {@code name} at {@code connection} and asynchronously
     * loads D-Bus properties unless the
     * {@link DBusProxyFlags#DO_NOT_LOAD_PROPERTIES} flag is used. Connect to
     * the {@link DBusProxy}::g-properties-changed signal to get notified about
     * property changes.
     * <p>
     * If the {@link DBusProxyFlags#DO_NOT_CONNECT_SIGNALS} flag is not set, also sets up
     * match rules for signals. Connect to the {@link DBusProxy}::g-signal signal
     * to handle signals from the remote object.
     * <p>
     * If both {@link DBusProxyFlags#DO_NOT_LOAD_PROPERTIES} and
     * {@link DBusProxyFlags#DO_NOT_CONNECT_SIGNALS} are set, this constructor is
     * guaranteed to complete immediately without blocking.
     * <p>
     * If {@code name} is a well-known name and the
     * {@link DBusProxyFlags#DO_NOT_AUTO_START} and {@link DBusProxyFlags#DO_NOT_AUTO_START_AT_CONSTRUCTION}
     * flags aren't set and no name owner currently exists, the message bus
     * will be requested to launch a name owner for the name.
     * <p>
     * This is a failable asynchronous constructor - when the proxy is
     * ready, {@code callback} will be invoked and you can use
     * g_dbus_proxy_new_finish() to get the result.
     * <p>
     * See g_dbus_proxy_new_sync() and for a synchronous version of this constructor.
     * <p>
     * {@link DBusProxy} is used in this [example][gdbus-wellknown-proxy].
     * @param connection A {@link DBusConnection}.
     * @param flags Flags used when constructing the proxy.
     * @param info A {@link DBusInterfaceInfo} specifying the minimal interface that {@code proxy} conforms to or {@code null}.
     * @param name A bus name (well-known or unique) or {@code null} if {@code connection} is not a message bus connection.
     * @param objectPath An object path.
     * @param interfaceName A D-Bus interface name.
     * @param cancellable A {@link Cancellable} or {@code null}.
     * @param callback Callback function to invoke when the proxy is ready.
     */
    public static void new_(org.gtk.gio.DBusConnection connection, org.gtk.gio.DBusProxyFlags flags, @Nullable org.gtk.gio.DBusInterfaceInfo info, @Nullable java.lang.String name, java.lang.String objectPath, java.lang.String interfaceName, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_dbus_proxy_new.invokeExact(
                    connection.handle(),
                    flags.getValue(),
                    (Addressable) (info == null ? MemoryAddress.NULL : info.handle()),
                    (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, null)),
                    Marshal.stringToAddress.marshal(objectPath, null),
                    Marshal.stringToAddress.marshal(interfaceName, null),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Like g_dbus_proxy_new() but takes a {@link BusType} instead of a {@link DBusConnection}.
     * <p>
     * {@link DBusProxy} is used in this [example][gdbus-wellknown-proxy].
     * @param busType A {@link BusType}.
     * @param flags Flags used when constructing the proxy.
     * @param info A {@link DBusInterfaceInfo} specifying the minimal interface that {@code proxy} conforms to or {@code null}.
     * @param name A bus name (well-known or unique).
     * @param objectPath An object path.
     * @param interfaceName A D-Bus interface name.
     * @param cancellable A {@link Cancellable} or {@code null}.
     * @param callback Callback function to invoke when the proxy is ready.
     */
    public static void newForBus(org.gtk.gio.BusType busType, org.gtk.gio.DBusProxyFlags flags, @Nullable org.gtk.gio.DBusInterfaceInfo info, java.lang.String name, java.lang.String objectPath, java.lang.String interfaceName, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_dbus_proxy_new_for_bus.invokeExact(
                    busType.getValue(),
                    flags.getValue(),
                    (Addressable) (info == null ? MemoryAddress.NULL : info.handle()),
                    Marshal.stringToAddress.marshal(name, null),
                    Marshal.stringToAddress.marshal(objectPath, null),
                    Marshal.stringToAddress.marshal(interfaceName, null),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface GPropertiesChanged {
        void run(org.gtk.glib.Variant changedProperties, PointerString invalidatedProperties);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceDBusProxy, MemoryAddress changedProperties, MemoryAddress invalidatedProperties) {
            run(org.gtk.glib.Variant.fromAddress.marshal(changedProperties, Ownership.NONE), new PointerString(invalidatedProperties));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GPropertiesChanged.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when one or more D-Bus properties on {@code proxy} changes. The
     * local cache has already been updated when this signal fires. Note
     * that both {@code changed_properties} and {@code invalidated_properties} are
     * guaranteed to never be {@code null} (either may be empty though).
     * <p>
     * If the proxy has the flag
     * {@link DBusProxyFlags#GET_INVALIDATED_PROPERTIES} set, then
     * {@code invalidated_properties} will always be empty.
     * <p>
     * This signal corresponds to the
     * {@code PropertiesChanged} D-Bus signal on the
     * {@code org.freedesktop.DBus.Properties} interface.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DBusProxy.GPropertiesChanged> onGPropertiesChanged(DBusProxy.GPropertiesChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("g-properties-changed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface GSignal {
        void run(@Nullable java.lang.String senderName, java.lang.String signalName, org.gtk.glib.Variant parameters);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceDBusProxy, MemoryAddress senderName, MemoryAddress signalName, MemoryAddress parameters) {
            run(Marshal.addressToString.marshal(senderName, null), Marshal.addressToString.marshal(signalName, null), org.gtk.glib.Variant.fromAddress.marshal(parameters, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GSignal.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when a signal from the remote object and interface that {@code proxy} is for, has been received.
     * <p>
     * Since 2.72 this signal supports detailed connections. You can connect to
     * the detailed signal {@code g-signal::x} in order to receive callbacks only when
     * signal {@code x} is received from the remote object.
     * @param detail The signal detail
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DBusProxy.GSignal> onGSignal(@Nullable String detail, DBusProxy.GSignal handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("g-signal" + ((detail == null || detail.isBlank()) ? "" : ("::" + detail))), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link DBusProxy.Builder} object constructs a {@link DBusProxy} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link DBusProxy.Builder#build()}. 
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
         * Finish building the {@link DBusProxy} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DBusProxy}.
         * @return A new instance of {@code DBusProxy} with the properties 
         *         that were set in the Builder object.
         */
        public DBusProxy build() {
            return (DBusProxy) org.gtk.gobject.GObject.newWithProperties(
                DBusProxy.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * If this property is not {@link BusType#NONE}, then
         * {@link DBusProxy}:g-connection must be {@code null} and will be set to the
         * {@link DBusConnection} obtained by calling g_bus_get() with the value
         * of this property.
         * @param gBusType The value for the {@code g-bus-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGBusType(org.gtk.gio.BusType gBusType) {
            names.add("g-bus-type");
            values.add(org.gtk.gobject.Value.create(gBusType));
            return this;
        }
        
        /**
         * The {@link DBusConnection} the proxy is for.
         * @param gConnection The value for the {@code g-connection} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGConnection(org.gtk.gio.DBusConnection gConnection) {
            names.add("g-connection");
            values.add(org.gtk.gobject.Value.create(gConnection));
            return this;
        }
        
        /**
         * The timeout to use if -1 (specifying default timeout) is passed
         * as {@code timeout_msec} in the g_dbus_proxy_call() and
         * g_dbus_proxy_call_sync() functions.
         * <p>
         * This allows applications to set a proxy-wide timeout for all
         * remote method invocations on the proxy. If this property is -1,
         * the default timeout (typically 25 seconds) is used. If set to
         * {@code G_MAXINT}, then no timeout is used.
         * @param gDefaultTimeout The value for the {@code g-default-timeout} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGDefaultTimeout(int gDefaultTimeout) {
            names.add("g-default-timeout");
            values.add(org.gtk.gobject.Value.create(gDefaultTimeout));
            return this;
        }
        
        /**
         * Flags from the {@link DBusProxyFlags} enumeration.
         * @param gFlags The value for the {@code g-flags} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGFlags(org.gtk.gio.DBusProxyFlags gFlags) {
            names.add("g-flags");
            values.add(org.gtk.gobject.Value.create(gFlags));
            return this;
        }
        
        /**
         * Ensure that interactions with this proxy conform to the given
         * interface. This is mainly to ensure that malformed data received
         * from the other peer is ignored. The given {@link DBusInterfaceInfo} is
         * said to be the "expected interface".
         * <p>
         * The checks performed are:
         * <ul>
         * <li>When completing a method call, if the type signature of
         *   the reply message isn't what's expected, the reply is
         *   discarded and the {@link org.gtk.glib.Error} is set to {@link IOErrorEnum#INVALID_ARGUMENT}.
         * </ul>
         * <ul>
         * <li>Received signals that have a type signature mismatch are dropped and
         *   a warning is logged via g_warning().
         * </ul>
         * <ul>
         * <li>Properties received via the initial {@code GetAll()} call or via the
         *   {@code ::PropertiesChanged} signal (on the
         *   <a href="http://dbus.freedesktop.org/doc/dbus-specification.html#standard-interfaces-properties">org.freedesktop.DBus.Properties</a>
         *   interface) or set using g_dbus_proxy_set_cached_property()
         *   with a type signature mismatch are ignored and a warning is
         *   logged via g_warning().
         * </ul>
         * <p>
         * Note that these checks are never done on methods, signals and
         * properties that are not referenced in the given
         * {@link DBusInterfaceInfo}, since extending a D-Bus interface on the
         * service-side is not considered an ABI break.
         * @param gInterfaceInfo The value for the {@code g-interface-info} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGInterfaceInfo(org.gtk.gio.DBusInterfaceInfo gInterfaceInfo) {
            names.add("g-interface-info");
            values.add(org.gtk.gobject.Value.create(gInterfaceInfo));
            return this;
        }
        
        /**
         * The D-Bus interface name the proxy is for.
         * @param gInterfaceName The value for the {@code g-interface-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGInterfaceName(java.lang.String gInterfaceName) {
            names.add("g-interface-name");
            values.add(org.gtk.gobject.Value.create(gInterfaceName));
            return this;
        }
        
        /**
         * The well-known or unique name that the proxy is for.
         * @param gName The value for the {@code g-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGName(java.lang.String gName) {
            names.add("g-name");
            values.add(org.gtk.gobject.Value.create(gName));
            return this;
        }
        
        /**
         * The unique name that owns {@link DBusProxy}:g-name or {@code null} if no-one
         * currently owns that name. You may connect to {@link org.gtk.gobject.GObject}::notify signal to
         * track changes to this property.
         * @param gNameOwner The value for the {@code g-name-owner} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGNameOwner(java.lang.String gNameOwner) {
            names.add("g-name-owner");
            values.add(org.gtk.gobject.Value.create(gNameOwner));
            return this;
        }
        
        /**
         * The object path the proxy is for.
         * @param gObjectPath The value for the {@code g-object-path} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGObjectPath(java.lang.String gObjectPath) {
            names.add("g-object-path");
            values.add(org.gtk.gobject.Value.create(gObjectPath));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_dbus_proxy_new_finish = Interop.downcallHandle(
            "g_dbus_proxy_new_finish",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_proxy_new_for_bus_finish = Interop.downcallHandle(
            "g_dbus_proxy_new_for_bus_finish",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_proxy_new_for_bus_sync = Interop.downcallHandle(
            "g_dbus_proxy_new_for_bus_sync",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_proxy_new_sync = Interop.downcallHandle(
            "g_dbus_proxy_new_sync",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_proxy_call = Interop.downcallHandle(
            "g_dbus_proxy_call",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_proxy_call_finish = Interop.downcallHandle(
            "g_dbus_proxy_call_finish",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_proxy_call_sync = Interop.downcallHandle(
            "g_dbus_proxy_call_sync",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_proxy_call_with_unix_fd_list = Interop.downcallHandle(
            "g_dbus_proxy_call_with_unix_fd_list",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_proxy_call_with_unix_fd_list_finish = Interop.downcallHandle(
            "g_dbus_proxy_call_with_unix_fd_list_finish",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_proxy_call_with_unix_fd_list_sync = Interop.downcallHandle(
            "g_dbus_proxy_call_with_unix_fd_list_sync",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_proxy_get_cached_property = Interop.downcallHandle(
            "g_dbus_proxy_get_cached_property",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_proxy_get_cached_property_names = Interop.downcallHandle(
            "g_dbus_proxy_get_cached_property_names",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_proxy_get_connection = Interop.downcallHandle(
            "g_dbus_proxy_get_connection",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_proxy_get_default_timeout = Interop.downcallHandle(
            "g_dbus_proxy_get_default_timeout",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_proxy_get_flags = Interop.downcallHandle(
            "g_dbus_proxy_get_flags",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_proxy_get_interface_info = Interop.downcallHandle(
            "g_dbus_proxy_get_interface_info",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_proxy_get_interface_name = Interop.downcallHandle(
            "g_dbus_proxy_get_interface_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_proxy_get_name = Interop.downcallHandle(
            "g_dbus_proxy_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_proxy_get_name_owner = Interop.downcallHandle(
            "g_dbus_proxy_get_name_owner",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_proxy_get_object_path = Interop.downcallHandle(
            "g_dbus_proxy_get_object_path",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_proxy_set_cached_property = Interop.downcallHandle(
            "g_dbus_proxy_set_cached_property",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_proxy_set_default_timeout = Interop.downcallHandle(
            "g_dbus_proxy_set_default_timeout",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_dbus_proxy_set_interface_info = Interop.downcallHandle(
            "g_dbus_proxy_set_interface_info",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_proxy_get_type = Interop.downcallHandle(
            "g_dbus_proxy_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_dbus_proxy_new = Interop.downcallHandle(
            "g_dbus_proxy_new",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_proxy_new_for_bus = Interop.downcallHandle(
            "g_dbus_proxy_new_for_bus",
            FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
