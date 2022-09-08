package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GDBusProxy is a base class used for proxies to access a D-Bus
 * interface on a remote object. A #GDBusProxy can be constructed for
 * both well-known and unique names.
 * 
 * By default, #GDBusProxy will cache all properties (and listen to
 * changes) of the remote object, and proxy all signals that get
 * emitted. This behaviour can be changed by passing suitable
 * #GDBusProxyFlags when the proxy is created. If the proxy is for a
 * well-known name, the property cache is flushed when the name owner
 * vanishes and reloaded when a name owner appears.
 * 
 * The unique name owner of the proxy's name is tracked and can be read from
 * #GDBusProxy:g-name-owner. Connect to the #GObject::notify signal to
 * get notified of changes. Additionally, only signals and property
 * changes emitted from the current name owner are considered and
 * calls are always sent to the current name owner. This avoids a
 * number of race conditions when the name is lost by one owner and
 * claimed by another. However, if no name owner currently exists,
 * then calls will be sent to the well-known name which may result in
 * the message bus launching an owner (unless
 * %G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START is set).
 * 
 * If the proxy is for a stateless D-Bus service, where the name owner may
 * be started and stopped between calls, the #GDBusProxy:g-name-owner tracking
 * of #GDBusProxy will cause the proxy to drop signal and property changes from
 * the service after it has restarted for the first time. When interacting
 * with a stateless D-Bus service, do not use #GDBusProxy — use direct D-Bus
 * method calls and signal connections.
 * 
 * The generic #GDBusProxy::g-properties-changed and
 * #GDBusProxy::g-signal signals are not very convenient to work with.
 * Therefore, the recommended way of working with proxies is to subclass
 * #GDBusProxy, and have more natural properties and signals in your derived
 * class. This [example][gdbus-example-gdbus-codegen] shows how this can
 * easily be done using the [gdbus-codegen][gdbus-codegen] tool.
 * 
 * A #GDBusProxy instance can be used from multiple threads but note
 * that all signals (e.g. #GDBusProxy::g-signal, #GDBusProxy::g-properties-changed
 * and #GObject::notify) are emitted in the
 * [thread-default main context][g-main-context-push-thread-default]
 * of the thread where the instance was constructed.
 * 
 * An example using a proxy for a well-known name can be found in
 * [gdbus-example-watch-proxy.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-watch-proxy.c)
 */
public class DBusProxy extends org.gtk.gobject.Object implements AsyncInitable, DBusInterface, Initable {

    public DBusProxy(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to DBusProxy */
    public static DBusProxy castFrom(org.gtk.gobject.Object gobject) {
        return new DBusProxy(gobject.getReference());
    }
    
    /**
     * Finishes an operation started with g_dbus_proxy_call().
     */
    public org.gtk.glib.Variant callFinish(AsyncResult res) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = gtk_h.g_dbus_proxy_call_finish(handle(), res.handle(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
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
     * If the #GDBusConnection associated with @proxy is disconnected then
     * the operation will fail with %G_IO_ERROR_CLOSED. If
     * @cancellable is canceled, the operation will fail with
     * %G_IO_ERROR_CANCELLED. If @parameters contains a value not
     * compatible with the D-Bus protocol, the operation fails with
     * %G_IO_ERROR_INVALID_ARGUMENT.
     * 
     * If the @parameters #GVariant is floating, it is consumed. This allows
     * convenient 'inline' use of g_variant_new(), e.g.:
     * |[<!-- language="C" -->
     *  g_dbus_proxy_call_sync (proxy,
     *                          "TwoStrings",
     *                          g_variant_new ("(ss)",
     *                                         "Thing One",
     *                                         "Thing Two"),
     *                          G_DBUS_CALL_FLAGS_NONE,
     *                          -1,
     *                          NULL,
     *                          &error);
     * ]|
     * 
     * The calling thread is blocked until a reply is received. See
     * g_dbus_proxy_call() for the asynchronous version of this
     * method.
     * 
     * If @proxy has an expected interface (see
     * #GDBusProxy:g-interface-info) and @method_name is referenced by it,
     * then the return value is checked against the return type.
     */
    public org.gtk.glib.Variant callSync(java.lang.String methodName, org.gtk.glib.Variant parameters, int flags, int timeoutMsec, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = gtk_h.g_dbus_proxy_call_sync(handle(), Interop.allocateNativeString(methodName).handle(), parameters.handle(), flags, timeoutMsec, cancellable.handle(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Finishes an operation started with g_dbus_proxy_call_with_unix_fd_list().
     */
    public org.gtk.glib.Variant callWithUnixFdListFinish(UnixFDList[] outFdList, AsyncResult res) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = gtk_h.g_dbus_proxy_call_with_unix_fd_list_finish(handle(), Interop.allocateNativeArray(outFdList), res.handle(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Like g_dbus_proxy_call_sync() but also takes and returns #GUnixFDList objects.
     * 
     * This method is only available on UNIX.
     */
    public org.gtk.glib.Variant callWithUnixFdListSync(java.lang.String methodName, org.gtk.glib.Variant parameters, int flags, int timeoutMsec, UnixFDList fdList, UnixFDList[] outFdList, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = gtk_h.g_dbus_proxy_call_with_unix_fd_list_sync(handle(), Interop.allocateNativeString(methodName).handle(), parameters.handle(), flags, timeoutMsec, fdList.handle(), Interop.allocateNativeArray(outFdList), cancellable.handle(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Looks up the value for a property from the cache. This call does no
     * blocking IO.
     * 
     * If @proxy has an expected interface (see
     * #GDBusProxy:g-interface-info) and @property_name is referenced by
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
     * See the #GDBusProxy:g-default-timeout property for more details.
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
     * Returns the #GDBusInterfaceInfo, if any, specifying the interface
     * that @proxy conforms to. See the #GDBusProxy:g-interface-info
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
     * When connected to a message bus, this will usually be non-%NULL.
     * However, it may be %NULL for a proxy that communicates using a peer-to-peer
     * pattern.
     */
    public java.lang.String getName() {
        var RESULT = gtk_h.g_dbus_proxy_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * The unique name that owns the name that @proxy is for or %NULL if
     * no-one currently owns that name. You may connect to the
     * #GObject::notify signal to track changes to the
     * #GDBusProxy:g-name-owner property.
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
     * If @value is not %NULL, sets the cached value for the property with
     * name @property_name to the value in @value.
     * 
     * If @value is %NULL, then the cached value is removed from the
     * property cache.
     * 
     * If @proxy has an expected interface (see
     * #GDBusProxy:g-interface-info) and @property_name is referenced by
     * it, then @value is checked against the type of the property.
     * 
     * If the @value #GVariant is floating, it is consumed. This allows
     * convenient 'inline' use of g_variant_new(), e.g.
     * |[<!-- language="C" -->
     *  g_dbus_proxy_set_cached_property (proxy,
     *                                    "SomeProperty",
     *                                    g_variant_new ("(si)",
     *                                                  "A String",
     *                                                  42));
     * ]|
     * 
     * Normally you will not need to use this method since @proxy
     * is tracking changes using the
     * `org.freedesktop.DBus.Properties.PropertiesChanged`
     * D-Bus signal. However, for performance reasons an object may
     * decide to not use this signal for some properties and instead
     * use a proprietary out-of-band mechanism to transmit changes.
     * 
     * As a concrete example, consider an object with a property
     * `ChatroomParticipants` which is an array of strings. Instead of
     * transmitting the same (long) array every time the property changes,
     * it is more efficient to only transmit the delta using e.g. signals
     * `ChatroomParticipantJoined(String name)` and
     * `ChatroomParticipantParted(String name)`.
     */
    public void setCachedProperty(java.lang.String propertyName, org.gtk.glib.Variant value) {
        gtk_h.g_dbus_proxy_set_cached_property(handle(), Interop.allocateNativeString(propertyName).handle(), value.handle());
    }
    
    /**
     * Sets the timeout to use if -1 (specifying default timeout) is
     * passed as @timeout_msec in the g_dbus_proxy_call() and
     * g_dbus_proxy_call_sync() functions.
     * 
     * See the #GDBusProxy:g-default-timeout property for more details.
     */
    public void setDefaultTimeout(int timeoutMsec) {
        gtk_h.g_dbus_proxy_set_default_timeout(handle(), timeoutMsec);
    }
    
    /**
     * Ensure that interactions with @proxy conform to the given
     * interface. See the #GDBusProxy:g-interface-info property for more
     * details.
     */
    public void setInterfaceInfo(DBusInterfaceInfo info) {
        gtk_h.g_dbus_proxy_set_interface_info(handle(), info.handle());
    }
    
    @FunctionalInterface
    public interface GPropertiesChangedHandler {
        void signalReceived(DBusProxy source, org.gtk.glib.Variant changedProperties, java.lang.String[] invalidatedProperties);
    }
    
    /**
     * Emitted when one or more D-Bus properties on @proxy changes. The
     * local cache has already been updated when this signal fires. Note
     * that both @changed_properties and @invalidated_properties are
     * guaranteed to never be %NULL (either may be empty though).
     * 
     * If the proxy has the flag
     * %G_DBUS_PROXY_FLAGS_GET_INVALIDATED_PROPERTIES set, then
     * @invalidated_properties will always be empty.
     * 
     * This signal corresponds to the
     * `PropertiesChanged` D-Bus signal on the
     * `org.freedesktop.DBus.Properties` interface.
     */
    public void onGPropertiesChanged(GPropertiesChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDBusProxyGPropertiesChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(this.handle(), Interop.allocateNativeString("g-properties-changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
     * 
     * Since 2.72 this signal supports detailed connections. You can connect to
     * the detailed signal `g-signal::x` in order to receive callbacks only when
     * signal `x` is received from the remote object.
     */
    public void onGSignal(GSignalHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDBusProxyGSignal", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(this.handle(), Interop.allocateNativeString("g-signal").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
