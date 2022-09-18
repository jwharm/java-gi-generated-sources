package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * {@link org.gtk.gio.DBusProxy} is a base class used for proxies to access a D-Bus
 * interface on a remote object. A {@link org.gtk.gio.DBusProxy} can be constructed for
 * both well-known and unique names.
 * 
 * By default, {@link org.gtk.gio.DBusProxy} will cache all properties (and listen to
 * changes) of the remote object, and proxy all signals that get
 * emitted. This behaviour can be changed by passing suitable
 * {@link org.gtk.gio.DBusProxyFlags} when the proxy is created. If the proxy is for a
 * well-known name, the property cache is flushed when the name owner
 * vanishes and reloaded when a name owner appears.
 * 
 * The unique name owner of the proxy&<code>#39</code> s name is tracked and can be read from
 * {@link org.gtk.gio.DBusProxy} g-name-owner. Connect to the {@link org.gtk.gobject.Object} :notify signal to
 * get notified of changes. Additionally, only signals and property
 * changes emitted from the current name owner are considered and
 * calls are always sent to the current name owner. This avoids a
 * number of race conditions when the name is lost by one owner and
 * claimed by another. However, if no name owner currently exists,
 * then calls will be sent to the well-known name which may result in
 * the message bus launching an owner (unless
 * {@link org.gtk.gio.DBusProxyFlags<code>#DO_NOT_AUTO_START</code>  is set).
 * 
 * If the proxy is for a stateless D-Bus service, where the name owner may
 * be started and stopped between calls, the {@link org.gtk.gio.DBusProxy} g-name-owner tracking
 * of {@link org.gtk.gio.DBusProxy} will cause the proxy to drop signal and property changes from
 * the service after it has restarted for the first time. When interacting
 * with a stateless D-Bus service, do not use {@link org.gtk.gio.DBusProxy} &<code>#8212</code>  use direct D-Bus
 * method calls and signal connections.
 * 
 * The generic {@link org.gtk.gio.DBusProxy} :g-properties-changed and
 * {@link org.gtk.gio.DBusProxy} :g-signal signals are not very convenient to work with.
 * Therefore, the recommended way of working with proxies is to subclass
 * {@link org.gtk.gio.DBusProxy}  and have more natural properties and signals in your derived
 * class. This {@link [example]}{@link [gdbus-example-gdbus-codegen]} shows how this can
 * easily be done using the {@link [gdbus-codegen]}{@link [gdbus-codegen]} tool.
 * 
 * A {@link org.gtk.gio.DBusProxy} instance can be used from multiple threads but note
 * that all signals (e.g. {@link org.gtk.gio.DBusProxy} :g-signal, {@link org.gtk.gio.DBusProxy} :g-properties-changed
 * and {@link org.gtk.gobject.Object} :notify) are emitted in the
 * {@link [thread-default main context]}{@link [g-main-context-push-thread-default]}
 * of the thread where the instance was constructed.
 * 
 * An example using a proxy for a well-known name can be found in
 * {@link [gdbus-example-watch-proxy.c]}(https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-watch-proxy.c)
 */
public class DBusProxy extends org.gtk.gobject.Object implements AsyncInitable, DBusInterface, Initable {

    public DBusProxy(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to DBusProxy */
    public static DBusProxy castFrom(org.gtk.gobject.Object gobject) {
        return new DBusProxy(gobject.getReference());
    }
    
    private static Reference constructNewFinish(AsyncResult res) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.g_dbus_proxy_new_finish(res.handle(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Finishes creating a {@link org.gtk.gio.DBusProxy}
     */
    public static DBusProxy newFinish(AsyncResult res) throws GErrorException {
        return new DBusProxy(constructNewFinish(res));
    }
    
    private static Reference constructNewForBusFinish(AsyncResult res) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.g_dbus_proxy_new_for_bus_finish(res.handle(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Finishes creating a {@link org.gtk.gio.DBusProxy}
     */
    public static DBusProxy newForBusFinish(AsyncResult res) throws GErrorException {
        return new DBusProxy(constructNewForBusFinish(res));
    }
    
    private static Reference constructNewForBusSync(BusType busType, int flags, DBusInterfaceInfo info, java.lang.String name, java.lang.String objectPath, java.lang.String interfaceName, Cancellable cancellable) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.g_dbus_proxy_new_for_bus_sync(busType.getValue(), flags, info.handle(), Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(objectPath).handle(), Interop.allocateNativeString(interfaceName).handle(), cancellable.handle(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Like g_dbus_proxy_new_sync() but takes a {@link org.gtk.gio.BusType} instead of a {@link org.gtk.gio.DBusConnection} 
     * 
     * {@link org.gtk.gio.DBusProxy} is used in this {@link [example]}{@link [gdbus-wellknown-proxy]}.
     */
    public static DBusProxy newForBusSync(BusType busType, int flags, DBusInterfaceInfo info, java.lang.String name, java.lang.String objectPath, java.lang.String interfaceName, Cancellable cancellable) throws GErrorException {
        return new DBusProxy(constructNewForBusSync(busType, flags, info, name, objectPath, interfaceName, cancellable));
    }
    
    private static Reference constructNewSync(DBusConnection connection, int flags, DBusInterfaceInfo info, java.lang.String name, java.lang.String objectPath, java.lang.String interfaceName, Cancellable cancellable) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.g_dbus_proxy_new_sync(connection.handle(), flags, info.handle(), Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(objectPath).handle(), Interop.allocateNativeString(interfaceName).handle(), cancellable.handle(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a proxy for accessing @interface_name on the remote object
     * at @object_path owned by @name at @connection and synchronously
     * loads D-Bus properties unless the
     * {@link org.gtk.gio.DBusProxyFlags<code>#DO_NOT_LOAD_PROPERTIES</code>  flag is used.
     * 
     * If the {@link org.gtk.gio.DBusProxyFlags<code>#DO_NOT_CONNECT_SIGNALS</code>  flag is not set, also sets up
     * match rules for signals. Connect to the {@link org.gtk.gio.DBusProxy} :g-signal signal
     * to handle signals from the remote object.
     * 
     * If both {@link org.gtk.gio.DBusProxyFlags<code>#DO_NOT_LOAD_PROPERTIES</code>  and
     * {@link org.gtk.gio.DBusProxyFlags<code>#DO_NOT_CONNECT_SIGNALS</code>  are set, this constructor is
     * guaranteed to return immediately without blocking.
     * 
     * If @name is a well-known name and the
     * {@link org.gtk.gio.DBusProxyFlags<code>#DO_NOT_AUTO_START</code>  and {@link org.gtk.gio.DBusProxyFlags<code>#DO_NOT_AUTO_START_AT_CONSTRUCTION</code>  flags aren&<code>#39</code> t set and no name owner currently exists, the message bus
     * will be requested to launch a name owner for the name.
     * 
     * This is a synchronous failable constructor. See g_dbus_proxy_new()
     * and g_dbus_proxy_new_finish() for the asynchronous version.
     * 
     * {@link org.gtk.gio.DBusProxy} is used in this {@link [example]}{@link [gdbus-wellknown-proxy]}.
     */
    public static DBusProxy newSync(DBusConnection connection, int flags, DBusInterfaceInfo info, java.lang.String name, java.lang.String objectPath, java.lang.String interfaceName, Cancellable cancellable) throws GErrorException {
        return new DBusProxy(constructNewSync(connection, flags, info, name, objectPath, interfaceName, cancellable));
    }
    
    /**
     * Asynchronously invokes the @method_name method on @proxy.
     * 
     * If @method_name contains any dots, then @name is split into interface and
     * method name parts. This allows using @proxy for invoking methods on
     * other interfaces.
     * 
     * If the {@link org.gtk.gio.DBusConnection} associated with @proxy is closed then
     * the operation will fail with {@link org.gtk.gio.IOErrorEnum<code>#CLOSED</code>   If
     * @cancellable is canceled, the operation will fail with
     * {@link org.gtk.gio.IOErrorEnum<code>#CANCELLED</code>   If @parameters contains a value not
     * compatible with the D-Bus protocol, the operation fails with
     * {@link org.gtk.gio.IOErrorEnum<code>#INVALID_ARGUMENT</code>  
     * 
     * If the @parameters {@link org.gtk.glib.Variant} is floating, it is consumed. This allows
     * convenient &<code>#39</code> inline&<code>#39</code>  use of g_variant_new(), e.g.:
     * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
     *  g_dbus_proxy_call (proxy,
     *                     &<code>#34</code> TwoStrings&<code>#34</code> ,
     *                     g_variant_new (&<code>#34</code> (ss)&<code>#34</code> ,
     *                                    &<code>#34</code> Thing One&<code>#34</code> ,
     *                                    &<code>#34</code> Thing Two&<code>#34</code> ),
     *                     G_DBUS_CALL_FLAGS_NONE,
     *                     -1,
     *                     NULL,
     *                     (GAsyncReadyCallback) two_strings_done,
     *                     &<code>#38</code> data);
     * ]}|
     * 
     * If @proxy has an expected interface (see
     * {@link org.gtk.gio.DBusProxy} g-interface-info) and @method_name is referenced by it,
     * then the return value is checked against the return type.
     * 
     * This is an asynchronous method. When the operation is finished,
     * @callback will be invoked in the
     * {@link [thread-default main context]}{@link [g-main-context-push-thread-default]}
     * of the thread you are calling this method from.
     * You can then call g_dbus_proxy_call_finish() to get the result of
     * the operation. See g_dbus_proxy_call_sync() for the synchronous
     * version of this method.
     * 
     * If @callback is <code>null</code> then the D-Bus method call message will be sent with
     * the {@link org.gtk.gio.DBusMessageFlags<code>#NO_REPLY_EXPECTED</code>  flag set.
     */
    public void call(java.lang.String methodName, org.gtk.glib.Variant parameters, int flags, int timeoutMsec, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_dbus_proxy_call(handle(), Interop.allocateNativeString(methodName).handle(), parameters.handle(), flags, timeoutMsec, cancellable.handle(), 
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
     * Finishes an operation started with g_dbus_proxy_call().
     */
    public org.gtk.glib.Variant callFinish(AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dbus_proxy_call_finish(handle(), res.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Synchronously invokes the @method_name method on @proxy.
     * 
     * If @method_name contains any dots, then @name is split into interface and
     * method name parts. This allows using @proxy for invoking methods on
     * other interfaces.
     * 
     * If the {@link org.gtk.gio.DBusConnection} associated with @proxy is disconnected then
     * the operation will fail with {@link org.gtk.gio.IOErrorEnum<code>#CLOSED</code>   If
     * @cancellable is canceled, the operation will fail with
     * {@link org.gtk.gio.IOErrorEnum<code>#CANCELLED</code>   If @parameters contains a value not
     * compatible with the D-Bus protocol, the operation fails with
     * {@link org.gtk.gio.IOErrorEnum<code>#INVALID_ARGUMENT</code>  
     * 
     * If the @parameters {@link org.gtk.glib.Variant} is floating, it is consumed. This allows
     * convenient &<code>#39</code> inline&<code>#39</code>  use of g_variant_new(), e.g.:
     * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
     *  g_dbus_proxy_call_sync (proxy,
     *                          &<code>#34</code> TwoStrings&<code>#34</code> ,
     *                          g_variant_new (&<code>#34</code> (ss)&<code>#34</code> ,
     *                                         &<code>#34</code> Thing One&<code>#34</code> ,
     *                                         &<code>#34</code> Thing Two&<code>#34</code> ),
     *                          G_DBUS_CALL_FLAGS_NONE,
     *                          -1,
     *                          NULL,
     *                          &<code>#38</code> error);
     * ]}|
     * 
     * The calling thread is blocked until a reply is received. See
     * g_dbus_proxy_call() for the asynchronous version of this
     * method.
     * 
     * If @proxy has an expected interface (see
     * {@link org.gtk.gio.DBusProxy} g-interface-info) and @method_name is referenced by it,
     * then the return value is checked against the return type.
     */
    public org.gtk.glib.Variant callSync(java.lang.String methodName, org.gtk.glib.Variant parameters, int flags, int timeoutMsec, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dbus_proxy_call_sync(handle(), Interop.allocateNativeString(methodName).handle(), parameters.handle(), flags, timeoutMsec, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Like g_dbus_proxy_call() but also takes a {@link org.gtk.gio.UnixFDList} object.
     * 
     * This method is only available on UNIX.
     */
    public void callWithUnixFdList(java.lang.String methodName, org.gtk.glib.Variant parameters, int flags, int timeoutMsec, UnixFDList fdList, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_dbus_proxy_call_with_unix_fd_list(handle(), Interop.allocateNativeString(methodName).handle(), parameters.handle(), flags, timeoutMsec, fdList.handle(), cancellable.handle(), 
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
     * Finishes an operation started with g_dbus_proxy_call_with_unix_fd_list().
     */
    public org.gtk.glib.Variant callWithUnixFdListFinish(UnixFDList[] outFdList, AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dbus_proxy_call_with_unix_fd_list_finish(handle(), Interop.allocateNativeArray(outFdList).handle(), res.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Like g_dbus_proxy_call_sync() but also takes and returns {@link org.gtk.gio.UnixFDList} objects.
     * 
     * This method is only available on UNIX.
     */
    public org.gtk.glib.Variant callWithUnixFdListSync(java.lang.String methodName, org.gtk.glib.Variant parameters, int flags, int timeoutMsec, UnixFDList fdList, UnixFDList[] outFdList, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dbus_proxy_call_with_unix_fd_list_sync(handle(), Interop.allocateNativeString(methodName).handle(), parameters.handle(), flags, timeoutMsec, fdList.handle(), Interop.allocateNativeArray(outFdList).handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Looks up the value for a property from the cache. This call does no
     * blocking IO.
     * 
     * If @proxy has an expected interface (see
     * {@link org.gtk.gio.DBusProxy} g-interface-info) and @property_name is referenced by
     * it, then @value is checked against the type of the property.
     */
    public org.gtk.glib.Variant getCachedProperty(java.lang.String propertyName) {
        var RESULT = gtk_h.g_dbus_proxy_get_cached_property(handle(), Interop.allocateNativeString(propertyName).handle());
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Gets the connection @proxy is for.
     */
    public DBusConnection getConnection() {
        var RESULT = gtk_h.g_dbus_proxy_get_connection(handle());
        return new DBusConnection(References.get(RESULT, false));
    }
    
    /**
     * Gets the timeout to use if -1 (specifying default timeout) is
     * passed as @timeout_msec in the g_dbus_proxy_call() and
     * g_dbus_proxy_call_sync() functions.
     * 
     * See the {@link org.gtk.gio.DBusProxy} g-default-timeout property for more details.
     */
    public int getDefaultTimeout() {
        var RESULT = gtk_h.g_dbus_proxy_get_default_timeout(handle());
        return RESULT;
    }
    
    /**
     * Gets the flags that @proxy was constructed with.
     */
    public int getFlags() {
        var RESULT = gtk_h.g_dbus_proxy_get_flags(handle());
        return RESULT;
    }
    
    /**
     * Returns the {@link org.gtk.gio.DBusInterfaceInfo}  if any, specifying the interface
     * that @proxy conforms to. See the {@link org.gtk.gio.DBusProxy} g-interface-info
     * property for more details.
     */
    public DBusInterfaceInfo getInterfaceInfo() {
        var RESULT = gtk_h.g_dbus_proxy_get_interface_info(handle());
        return new DBusInterfaceInfo(References.get(RESULT, false));
    }
    
    /**
     * Gets the D-Bus interface name @proxy is for.
     */
    public java.lang.String getInterfaceName() {
        var RESULT = gtk_h.g_dbus_proxy_get_interface_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the name that @proxy was constructed for.
     * 
     * When connected to a message bus, this will usually be non-<code>null</code> 
     * However, it may be <code>null</code> for a proxy that communicates using a peer-to-peer
     * pattern.
     */
    public java.lang.String getName() {
        var RESULT = gtk_h.g_dbus_proxy_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * The unique name that owns the name that @proxy is for or <code>null</code> if
     * no-one currently owns that name. You may connect to the
     * {@link org.gtk.gobject.Object} :notify signal to track changes to the
     * {@link org.gtk.gio.DBusProxy} g-name-owner property.
     */
    public java.lang.String getNameOwner() {
        var RESULT = gtk_h.g_dbus_proxy_get_name_owner(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the object path @proxy is for.
     */
    public java.lang.String getObjectPath() {
        var RESULT = gtk_h.g_dbus_proxy_get_object_path(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * If @value is not <code>null</code>  sets the cached value for the property with
     * name @property_name to the value in @value.
     * <p>
     * If @value is <code>null</code>  then the cached value is removed from the
     * property cache.
     * <p>
     * If @proxy has an expected interface (see
     * {@link org.gtk.gio.DBusProxy} g-interface-info) and @property_name is referenced by
     * it, then @value is checked against the type of the property.
     * <p>
     * If the @value {@link org.gtk.glib.Variant} is floating, it is consumed. This allows
     * convenient &<code>#39</code> inline&<code>#39</code>  use of g_variant_new(), e.g.
     * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
     *  g_dbus_proxy_set_cached_property (proxy,
     *                                    &<code>#34</code> SomeProperty&<code>#34</code> ,
     *                                    g_variant_new (&<code>#34</code> (si)&<code>#34</code> ,
     *                                                  &<code>#34</code> A String&<code>#34</code> ,
     *                                                  42));
     * ]}|
     * <p>
     * Normally you will not need to use this method since @proxy
     * is tracking changes using the<code>org.freedesktop.DBus.Properties.PropertiesChanged</code>
     * D-Bus signal. However, for performance reasons an object may
     * decide to not use this signal for some properties and instead
     * use a proprietary out-of-band mechanism to transmit changes.
     * <p>
     * As a concrete example, consider an object with a property<code>ChatroomParticipants</code> which is an array of strings. Instead of
     * transmitting the same (long) array every time the property changes,
     * it is more efficient to only transmit the delta using e.g. signals<code>ChatroomParticipantJoined(String name)</code> and<code>ChatroomParticipantParted(String name)</code>.
     */
    public void setCachedProperty(java.lang.String propertyName, org.gtk.glib.Variant value) {
        gtk_h.g_dbus_proxy_set_cached_property(handle(), Interop.allocateNativeString(propertyName).handle(), value.handle());
    }
    
    /**
     * Sets the timeout to use if -1 (specifying default timeout) is
     * passed as @timeout_msec in the g_dbus_proxy_call() and
     * g_dbus_proxy_call_sync() functions.
     * 
     * See the {@link org.gtk.gio.DBusProxy} g-default-timeout property for more details.
     */
    public void setDefaultTimeout(int timeoutMsec) {
        gtk_h.g_dbus_proxy_set_default_timeout(handle(), timeoutMsec);
    }
    
    /**
     * Ensure that interactions with @proxy conform to the given
     * interface. See the {@link org.gtk.gio.DBusProxy} g-interface-info property for more
     * details.
     */
    public void setInterfaceInfo(DBusInterfaceInfo info) {
        gtk_h.g_dbus_proxy_set_interface_info(handle(), info.handle());
    }
    
    /**
     * Creates a proxy for accessing @interface_name on the remote object
     * at @object_path owned by @name at @connection and asynchronously
     * loads D-Bus properties unless the
     * {@link org.gtk.gio.DBusProxyFlags<code>#DO_NOT_LOAD_PROPERTIES</code>  flag is used. Connect to
     * the {@link org.gtk.gio.DBusProxy} :g-properties-changed signal to get notified about
     * property changes.
     * 
     * If the {@link org.gtk.gio.DBusProxyFlags<code>#DO_NOT_CONNECT_SIGNALS</code>  flag is not set, also sets up
     * match rules for signals. Connect to the {@link org.gtk.gio.DBusProxy} :g-signal signal
     * to handle signals from the remote object.
     * 
     * If both {@link org.gtk.gio.DBusProxyFlags<code>#DO_NOT_LOAD_PROPERTIES</code>  and
     * {@link org.gtk.gio.DBusProxyFlags<code>#DO_NOT_CONNECT_SIGNALS</code>  are set, this constructor is
     * guaranteed to complete immediately without blocking.
     * 
     * If @name is a well-known name and the
     * {@link org.gtk.gio.DBusProxyFlags<code>#DO_NOT_AUTO_START</code>  and {@link org.gtk.gio.DBusProxyFlags<code>#DO_NOT_AUTO_START_AT_CONSTRUCTION</code>  flags aren&<code>#39</code> t set and no name owner currently exists, the message bus
     * will be requested to launch a name owner for the name.
     * 
     * This is a failable asynchronous constructor - when the proxy is
     * ready, @callback will be invoked and you can use
     * g_dbus_proxy_new_finish() to get the result.
     * 
     * See g_dbus_proxy_new_sync() and for a synchronous version of this constructor.
     * 
     * {@link org.gtk.gio.DBusProxy} is used in this {@link [example]}{@link [gdbus-wellknown-proxy]}.
     */
    public static void new_(DBusConnection connection, int flags, DBusInterfaceInfo info, java.lang.String name, java.lang.String objectPath, java.lang.String interfaceName, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_dbus_proxy_new(connection.handle(), flags, info.handle(), Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(objectPath).handle(), Interop.allocateNativeString(interfaceName).handle(), cancellable.handle(), 
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
     * Like g_dbus_proxy_new() but takes a {@link org.gtk.gio.BusType} instead of a {@link org.gtk.gio.DBusConnection} 
     * 
     * {@link org.gtk.gio.DBusProxy} is used in this {@link [example]}{@link [gdbus-wellknown-proxy]}.
     */
    public static void newForBus(BusType busType, int flags, DBusInterfaceInfo info, java.lang.String name, java.lang.String objectPath, java.lang.String interfaceName, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_dbus_proxy_new_for_bus(busType.getValue(), flags, info.handle(), Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(objectPath).handle(), Interop.allocateNativeString(interfaceName).handle(), cancellable.handle(), 
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
    public interface GPropertiesChangedHandler {
        void signalReceived(DBusProxy source, org.gtk.glib.Variant changedProperties, java.lang.String[] invalidatedProperties);
    }
    
    /**
     * Emitted when one or more D-Bus properties on @proxy changes. The
     * local cache has already been updated when this signal fires. Note
     * that both @changed_properties and @invalidated_properties are
     * guaranteed to never be <code>null</code> (either may be empty though).
     * <p>
     * If the proxy has the flag
     * {@link org.gtk.gio.DBusProxyFlags<code>#GET_INVALIDATED_PROPERTIES</code>  set, then
     * @invalidated_properties will always be empty.
     * <p>
     * This signal corresponds to the<code>PropertiesChanged</code> D-Bus signal on the<code>org.freedesktop.DBus.Properties</code> interface.
     */
    public SignalHandle onGPropertiesChanged(GPropertiesChangedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDBusProxyGPropertiesChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("g-properties-changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface GSignalHandler {
        void signalReceived(DBusProxy source, java.lang.String senderName, java.lang.String signalName, org.gtk.glib.Variant parameters);
    }
    
    /**
     * Emitted when a signal from the remote object and interface that @proxy is for, has been received.
     * <p>
     * Since 2.72 this signal supports detailed connections. You can connect to
     * the detailed signal <code>g-signal::x</code> in order to receive callbacks only when
     * signal <code>x</code> is received from the remote object.
     */
    public SignalHandle onGSignal(GSignalHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDBusProxyGSignal", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("g-signal").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
