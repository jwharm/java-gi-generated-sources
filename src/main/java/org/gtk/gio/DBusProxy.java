package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 * {@link DBusProxy}:g-name-owner. Connect to the {@link org.gtk.gobject.Object}::notify signal to
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
 * and {@link org.gtk.gobject.Object}::notify) are emitted in the
 * [thread-default main context][g-main-context-push-thread-default]
 * of the thread where the instance was constructed.
 * <p>
 * An example using a proxy for a well-known name can be found in
 * <a href="https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-watch-proxy.c">gdbus-example-watch-proxy.c</a>
 */
public class DBusProxy extends org.gtk.gobject.Object implements AsyncInitable, DBusInterface, Initable {

    public DBusProxy(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to DBusProxy */
    public static DBusProxy castFrom(org.gtk.gobject.Object gobject) {
        return new DBusProxy(gobject.refcounted());
    }
    
    static final MethodHandle g_dbus_proxy_new_finish = Interop.downcallHandle(
        "g_dbus_proxy_new_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFinish(AsyncResult res) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_dbus_proxy_new_finish.invokeExact(res.handle(), (Addressable) GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes creating a {@link DBusProxy}.
     */
    public static DBusProxy newFinish(AsyncResult res) throws GErrorException {
        return new DBusProxy(constructNewFinish(res));
    }
    
    static final MethodHandle g_dbus_proxy_new_for_bus_finish = Interop.downcallHandle(
        "g_dbus_proxy_new_for_bus_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewForBusFinish(AsyncResult res) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_dbus_proxy_new_for_bus_finish.invokeExact(res.handle(), (Addressable) GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes creating a {@link DBusProxy}.
     */
    public static DBusProxy newForBusFinish(AsyncResult res) throws GErrorException {
        return new DBusProxy(constructNewForBusFinish(res));
    }
    
    static final MethodHandle g_dbus_proxy_new_for_bus_sync = Interop.downcallHandle(
        "g_dbus_proxy_new_for_bus_sync",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewForBusSync(BusType busType, DBusProxyFlags flags, DBusInterfaceInfo info, java.lang.String name, java.lang.String objectPath, java.lang.String interfaceName, Cancellable cancellable) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_dbus_proxy_new_for_bus_sync.invokeExact(busType.getValue(), flags.getValue(), info.handle(), Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(objectPath).handle(), Interop.allocateNativeString(interfaceName).handle(), cancellable.handle(), (Addressable) GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Like g_dbus_proxy_new_sync() but takes a {@link BusType} instead of a {@link DBusConnection}.
     * <p>
     * {@link DBusProxy} is used in this [example][gdbus-wellknown-proxy].
     */
    public static DBusProxy newForBusSync(BusType busType, DBusProxyFlags flags, DBusInterfaceInfo info, java.lang.String name, java.lang.String objectPath, java.lang.String interfaceName, Cancellable cancellable) throws GErrorException {
        return new DBusProxy(constructNewForBusSync(busType, flags, info, name, objectPath, interfaceName, cancellable));
    }
    
    static final MethodHandle g_dbus_proxy_new_sync = Interop.downcallHandle(
        "g_dbus_proxy_new_sync",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewSync(DBusConnection connection, DBusProxyFlags flags, DBusInterfaceInfo info, java.lang.String name, java.lang.String objectPath, java.lang.String interfaceName, Cancellable cancellable) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_dbus_proxy_new_sync.invokeExact(connection.handle(), flags.getValue(), info.handle(), Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(objectPath).handle(), Interop.allocateNativeString(interfaceName).handle(), cancellable.handle(), (Addressable) GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     */
    public static DBusProxy newSync(DBusConnection connection, DBusProxyFlags flags, DBusInterfaceInfo info, java.lang.String name, java.lang.String objectPath, java.lang.String interfaceName, Cancellable cancellable) throws GErrorException {
        return new DBusProxy(constructNewSync(connection, flags, info, name, objectPath, interfaceName, cancellable));
    }
    
    static final MethodHandle g_dbus_proxy_call = Interop.downcallHandle(
        "g_dbus_proxy_call",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public void call(java.lang.String methodName, org.gtk.glib.Variant parameters, DBusCallFlags flags, int timeoutMsec, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_dbus_proxy_call.invokeExact(handle(), Interop.allocateNativeString(methodName).handle(), parameters.handle(), flags.getValue(), timeoutMsec, cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_proxy_call_finish = Interop.downcallHandle(
        "g_dbus_proxy_call_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an operation started with g_dbus_proxy_call().
     */
    public org.gtk.glib.Variant callFinish(AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_dbus_proxy_call_finish.invokeExact(handle(), res.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new org.gtk.glib.Variant(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_proxy_call_sync = Interop.downcallHandle(
        "g_dbus_proxy_call_sync",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public org.gtk.glib.Variant callSync(java.lang.String methodName, org.gtk.glib.Variant parameters, DBusCallFlags flags, int timeoutMsec, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_dbus_proxy_call_sync.invokeExact(handle(), Interop.allocateNativeString(methodName).handle(), parameters.handle(), flags.getValue(), timeoutMsec, cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new org.gtk.glib.Variant(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_proxy_call_with_unix_fd_list = Interop.downcallHandle(
        "g_dbus_proxy_call_with_unix_fd_list",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Like g_dbus_proxy_call() but also takes a {@link UnixFDList} object.
     * <p>
     * This method is only available on UNIX.
     */
    public void callWithUnixFdList(java.lang.String methodName, org.gtk.glib.Variant parameters, DBusCallFlags flags, int timeoutMsec, UnixFDList fdList, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_dbus_proxy_call_with_unix_fd_list.invokeExact(handle(), Interop.allocateNativeString(methodName).handle(), parameters.handle(), flags.getValue(), timeoutMsec, fdList.handle(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_proxy_call_with_unix_fd_list_finish = Interop.downcallHandle(
        "g_dbus_proxy_call_with_unix_fd_list_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an operation started with g_dbus_proxy_call_with_unix_fd_list().
     */
    public org.gtk.glib.Variant callWithUnixFdListFinish(PointerProxy<UnixFDList> outFdList, AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_dbus_proxy_call_with_unix_fd_list_finish.invokeExact(handle(), outFdList.handle(), res.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new org.gtk.glib.Variant(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_proxy_call_with_unix_fd_list_sync = Interop.downcallHandle(
        "g_dbus_proxy_call_with_unix_fd_list_sync",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Like g_dbus_proxy_call_sync() but also takes and returns {@link UnixFDList} objects.
     * <p>
     * This method is only available on UNIX.
     */
    public org.gtk.glib.Variant callWithUnixFdListSync(java.lang.String methodName, org.gtk.glib.Variant parameters, DBusCallFlags flags, int timeoutMsec, UnixFDList fdList, PointerProxy<UnixFDList> outFdList, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_dbus_proxy_call_with_unix_fd_list_sync.invokeExact(handle(), Interop.allocateNativeString(methodName).handle(), parameters.handle(), flags.getValue(), timeoutMsec, fdList.handle(), outFdList.handle(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new org.gtk.glib.Variant(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_proxy_get_cached_property = Interop.downcallHandle(
        "g_dbus_proxy_get_cached_property",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks up the value for a property from the cache. This call does no
     * blocking IO.
     * <p>
     * If {@code proxy} has an expected interface (see
     * {@link DBusProxy}:g-interface-info) and {@code property_name} is referenced by
     * it, then {@code value} is checked against the type of the property.
     */
    public org.gtk.glib.Variant getCachedProperty(java.lang.String propertyName) {
        try {
            var RESULT = (MemoryAddress) g_dbus_proxy_get_cached_property.invokeExact(handle(), Interop.allocateNativeString(propertyName).handle());
            return new org.gtk.glib.Variant(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_proxy_get_cached_property_names = Interop.downcallHandle(
        "g_dbus_proxy_get_cached_property_names",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the names of all cached properties on {@code proxy}.
     */
    public PointerString getCachedPropertyNames() {
        try {
            var RESULT = (MemoryAddress) g_dbus_proxy_get_cached_property_names.invokeExact(handle());
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_proxy_get_connection = Interop.downcallHandle(
        "g_dbus_proxy_get_connection",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the connection {@code proxy} is for.
     */
    public DBusConnection getConnection() {
        try {
            var RESULT = (MemoryAddress) g_dbus_proxy_get_connection.invokeExact(handle());
            return new DBusConnection(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_proxy_get_default_timeout = Interop.downcallHandle(
        "g_dbus_proxy_get_default_timeout",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the timeout to use if -1 (specifying default timeout) is
     * passed as {@code timeout_msec} in the g_dbus_proxy_call() and
     * g_dbus_proxy_call_sync() functions.
     * <p>
     * See the {@link DBusProxy}:g-default-timeout property for more details.
     */
    public int getDefaultTimeout() {
        try {
            var RESULT = (int) g_dbus_proxy_get_default_timeout.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_proxy_get_flags = Interop.downcallHandle(
        "g_dbus_proxy_get_flags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the flags that {@code proxy} was constructed with.
     */
    public DBusProxyFlags getFlags() {
        try {
            var RESULT = (int) g_dbus_proxy_get_flags.invokeExact(handle());
            return new DBusProxyFlags(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_proxy_get_interface_info = Interop.downcallHandle(
        "g_dbus_proxy_get_interface_info",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@link DBusInterfaceInfo}, if any, specifying the interface
     * that {@code proxy} conforms to. See the {@link DBusProxy}:g-interface-info
     * property for more details.
     */
    public DBusInterfaceInfo getInterfaceInfo() {
        try {
            var RESULT = (MemoryAddress) g_dbus_proxy_get_interface_info.invokeExact(handle());
            return new DBusInterfaceInfo(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_proxy_get_interface_name = Interop.downcallHandle(
        "g_dbus_proxy_get_interface_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the D-Bus interface name {@code proxy} is for.
     */
    public java.lang.String getInterfaceName() {
        try {
            var RESULT = (MemoryAddress) g_dbus_proxy_get_interface_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_proxy_get_name = Interop.downcallHandle(
        "g_dbus_proxy_get_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the name that {@code proxy} was constructed for.
     * <p>
     * When connected to a message bus, this will usually be non-{@code null}.
     * However, it may be {@code null} for a proxy that communicates using a peer-to-peer
     * pattern.
     */
    public java.lang.String getName() {
        try {
            var RESULT = (MemoryAddress) g_dbus_proxy_get_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_proxy_get_name_owner = Interop.downcallHandle(
        "g_dbus_proxy_get_name_owner",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * The unique name that owns the name that {@code proxy} is for or {@code null} if
     * no-one currently owns that name. You may connect to the
     * {@link org.gtk.gobject.Object}::notify signal to track changes to the
     * {@link DBusProxy}:g-name-owner property.
     */
    public java.lang.String getNameOwner() {
        try {
            var RESULT = (MemoryAddress) g_dbus_proxy_get_name_owner.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_proxy_get_object_path = Interop.downcallHandle(
        "g_dbus_proxy_get_object_path",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the object path {@code proxy} is for.
     */
    public java.lang.String getObjectPath() {
        try {
            var RESULT = (MemoryAddress) g_dbus_proxy_get_object_path.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_proxy_set_cached_property = Interop.downcallHandle(
        "g_dbus_proxy_set_cached_property",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public void setCachedProperty(java.lang.String propertyName, org.gtk.glib.Variant value) {
        try {
            g_dbus_proxy_set_cached_property.invokeExact(handle(), Interop.allocateNativeString(propertyName).handle(), value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_proxy_set_default_timeout = Interop.downcallHandle(
        "g_dbus_proxy_set_default_timeout",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the timeout to use if -1 (specifying default timeout) is
     * passed as {@code timeout_msec} in the g_dbus_proxy_call() and
     * g_dbus_proxy_call_sync() functions.
     * <p>
     * See the {@link DBusProxy}:g-default-timeout property for more details.
     */
    public void setDefaultTimeout(int timeoutMsec) {
        try {
            g_dbus_proxy_set_default_timeout.invokeExact(handle(), timeoutMsec);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_proxy_set_interface_info = Interop.downcallHandle(
        "g_dbus_proxy_set_interface_info",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Ensure that interactions with {@code proxy} conform to the given
     * interface. See the {@link DBusProxy}:g-interface-info property for more
     * details.
     */
    public void setInterfaceInfo(DBusInterfaceInfo info) {
        try {
            g_dbus_proxy_set_interface_info.invokeExact(handle(), info.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_proxy_new = Interop.downcallHandle(
        "g_dbus_proxy_new",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public static void new_(DBusConnection connection, DBusProxyFlags flags, DBusInterfaceInfo info, java.lang.String name, java.lang.String objectPath, java.lang.String interfaceName, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_dbus_proxy_new.invokeExact(connection.handle(), flags.getValue(), info.handle(), Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(objectPath).handle(), Interop.allocateNativeString(interfaceName).handle(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_proxy_new_for_bus = Interop.downcallHandle(
        "g_dbus_proxy_new_for_bus",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Like g_dbus_proxy_new() but takes a {@link BusType} instead of a {@link DBusConnection}.
     * <p>
     * {@link DBusProxy} is used in this [example][gdbus-wellknown-proxy].
     */
    public static void newForBus(BusType busType, DBusProxyFlags flags, DBusInterfaceInfo info, java.lang.String name, java.lang.String objectPath, java.lang.String interfaceName, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_dbus_proxy_new_for_bus.invokeExact(busType.getValue(), flags.getValue(), info.handle(), Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(objectPath).handle(), Interop.allocateNativeString(interfaceName).handle(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface GPropertiesChangedHandler {
        void signalReceived(DBusProxy source, org.gtk.glib.Variant changedProperties, PointerString invalidatedProperties);
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
     */
    public SignalHandle onGPropertiesChanged(GPropertiesChangedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("g-properties-changed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DBusProxy.Callbacks.class, "signalDBusProxyGPropertiesChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface GSignalHandler {
        void signalReceived(DBusProxy source, java.lang.String senderName, java.lang.String signalName, org.gtk.glib.Variant parameters);
    }
    
    /**
     * Emitted when a signal from the remote object and interface that {@code proxy} is for, has been received.
     * <p>
     * Since 2.72 this signal supports detailed connections. You can connect to
     * the detailed signal {@code g-signal::x} in order to receive callbacks only when
     * signal {@code x} is received from the remote object.
     */
    public SignalHandle onGSignal(GSignalHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("g-signal").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DBusProxy.Callbacks.class, "signalDBusProxyGSignal",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalDBusProxyGPropertiesChanged(MemoryAddress source, MemoryAddress changedProperties, MemoryAddress invalidatedProperties, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (DBusProxy.GPropertiesChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new DBusProxy(Refcounted.get(source)), new org.gtk.glib.Variant(Refcounted.get(changedProperties, false)), new PointerString(invalidatedProperties));
        }
        
        public static void signalDBusProxyGSignal(MemoryAddress source, MemoryAddress senderName, MemoryAddress signalName, MemoryAddress parameters, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (DBusProxy.GSignalHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new DBusProxy(Refcounted.get(source)), senderName.getUtf8String(0), signalName.getUtf8String(0), new org.gtk.glib.Variant(Refcounted.get(parameters, false)));
        }
        
    }
}
