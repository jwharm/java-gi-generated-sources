package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GResolver provides cancellable synchronous and asynchronous DNS
 * resolution, for hostnames (g_resolver_lookup_by_address(),
 * g_resolver_lookup_by_name() and their async variants) and SRV
 * (service) records (g_resolver_lookup_service()).
 * 
 * #GNetworkAddress and #GNetworkService provide wrappers around
 * #GResolver functionality that also implement #GSocketConnectable,
 * making it easy to connect to a remote host/service.
 */
public class Resolver extends org.gtk.gobject.Object {

    public Resolver(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Resolver */
    public static Resolver castFrom(org.gtk.gobject.Object gobject) {
        return new Resolver(gobject.getReference());
    }
    
    /**
     * Synchronously reverse-resolves @address to determine its
     * associated hostname.
     * 
     * If the DNS resolution fails, @error (if non-%NULL) will be set to
     * a value from #GResolverError.
     * 
     * If @cancellable is non-%NULL, it can be used to cancel the
     * operation, in which case @error (if non-%NULL) will be set to
     * %G_IO_ERROR_CANCELLED.
     */
    public java.lang.String lookupByAddress(InetAddress address, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_resolver_lookup_by_address(handle(), address.handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Begins asynchronously reverse-resolving @address to determine its
     * associated hostname, and eventually calls @callback, which must
     * call g_resolver_lookup_by_address_finish() to get the final result.
     */
    public void lookupByAddressAsync(InetAddress address, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_resolver_lookup_by_address_async(handle(), address.handle(), cancellable.handle(), 
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
     * Retrieves the result of a previous call to
     * g_resolver_lookup_by_address_async().
     * 
     * If the DNS resolution failed, @error (if non-%NULL) will be set to
     * a value from #GResolverError. If the operation was cancelled,
     * @error will be set to %G_IO_ERROR_CANCELLED.
     */
    public java.lang.String lookupByAddressFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_resolver_lookup_by_address_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Synchronously resolves @hostname to determine its associated IP
     * address(es). @hostname may be an ASCII-only or UTF-8 hostname, or
     * the textual form of an IP address (in which case this just becomes
     * a wrapper around g_inet_address_new_from_string()).
     * 
     * On success, g_resolver_lookup_by_name() will return a non-empty #GList of
     * #GInetAddress, sorted in order of preference and guaranteed to not
     * contain duplicates. That is, if using the result to connect to
     * @hostname, you should attempt to connect to the first address
     * first, then the second if the first fails, etc. If you are using
     * the result to listen on a socket, it is appropriate to add each
     * result using e.g. g_socket_listener_add_address().
     * 
     * If the DNS resolution fails, @error (if non-%NULL) will be set to a
     * value from #GResolverError and %NULL will be returned.
     * 
     * If @cancellable is non-%NULL, it can be used to cancel the
     * operation, in which case @error (if non-%NULL) will be set to
     * %G_IO_ERROR_CANCELLED.
     * 
     * If you are planning to connect to a socket on the resolved IP
     * address, it may be easier to create a #GNetworkAddress and use its
     * #GSocketConnectable interface.
     */
    public org.gtk.glib.List lookupByName(java.lang.String hostname, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_resolver_lookup_by_name(handle(), Interop.allocateNativeString(hostname).handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Begins asynchronously resolving @hostname to determine its
     * associated IP address(es), and eventually calls @callback, which
     * must call g_resolver_lookup_by_name_finish() to get the result.
     * See g_resolver_lookup_by_name() for more details.
     */
    public void lookupByNameAsync(java.lang.String hostname, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_resolver_lookup_by_name_async(handle(), Interop.allocateNativeString(hostname).handle(), cancellable.handle(), 
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
     * Retrieves the result of a call to
     * g_resolver_lookup_by_name_async().
     * 
     * If the DNS resolution failed, @error (if non-%NULL) will be set to
     * a value from #GResolverError. If the operation was cancelled,
     * @error will be set to %G_IO_ERROR_CANCELLED.
     */
    public org.gtk.glib.List lookupByNameFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_resolver_lookup_by_name_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * This differs from g_resolver_lookup_by_name() in that you can modify
     * the lookup behavior with @flags. For example this can be used to limit
     * results with %G_RESOLVER_NAME_LOOKUP_FLAGS_IPV4_ONLY.
     */
    public org.gtk.glib.List lookupByNameWithFlags(java.lang.String hostname, int flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_resolver_lookup_by_name_with_flags(handle(), Interop.allocateNativeString(hostname).handle(), flags, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Begins asynchronously resolving @hostname to determine its
     * associated IP address(es), and eventually calls @callback, which
     * must call g_resolver_lookup_by_name_with_flags_finish() to get the result.
     * See g_resolver_lookup_by_name() for more details.
     */
    public void lookupByNameWithFlagsAsync(java.lang.String hostname, int flags, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_resolver_lookup_by_name_with_flags_async(handle(), Interop.allocateNativeString(hostname).handle(), flags, cancellable.handle(), 
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
     * Retrieves the result of a call to
     * g_resolver_lookup_by_name_with_flags_async().
     * 
     * If the DNS resolution failed, @error (if non-%NULL) will be set to
     * a value from #GResolverError. If the operation was cancelled,
     * @error will be set to %G_IO_ERROR_CANCELLED.
     */
    public org.gtk.glib.List lookupByNameWithFlagsFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_resolver_lookup_by_name_with_flags_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Synchronously performs a DNS record lookup for the given @rrname and returns
     * a list of records as #GVariant tuples. See #GResolverRecordType for
     * information on what the records contain for each @record_type.
     * 
     * If the DNS resolution fails, @error (if non-%NULL) will be set to
     * a value from #GResolverError and %NULL will be returned.
     * 
     * If @cancellable is non-%NULL, it can be used to cancel the
     * operation, in which case @error (if non-%NULL) will be set to
     * %G_IO_ERROR_CANCELLED.
     */
    public org.gtk.glib.List lookupRecords(java.lang.String rrname, ResolverRecordType recordType, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_resolver_lookup_records(handle(), Interop.allocateNativeString(rrname).handle(), recordType.getValue(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Begins asynchronously performing a DNS lookup for the given
     * @rrname, and eventually calls @callback, which must call
     * g_resolver_lookup_records_finish() to get the final result. See
     * g_resolver_lookup_records() for more details.
     */
    public void lookupRecordsAsync(java.lang.String rrname, ResolverRecordType recordType, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_resolver_lookup_records_async(handle(), Interop.allocateNativeString(rrname).handle(), recordType.getValue(), cancellable.handle(), 
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
     * Retrieves the result of a previous call to
     * g_resolver_lookup_records_async(). Returns a non-empty list of records as
     * #GVariant tuples. See #GResolverRecordType for information on what the
     * records contain.
     * 
     * If the DNS resolution failed, @error (if non-%NULL) will be set to
     * a value from #GResolverError. If the operation was cancelled,
     * @error will be set to %G_IO_ERROR_CANCELLED.
     */
    public org.gtk.glib.List lookupRecordsFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_resolver_lookup_records_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Synchronously performs a DNS SRV lookup for the given @service and
     * @protocol in the given @domain and returns an array of #GSrvTarget.
     * @domain may be an ASCII-only or UTF-8 hostname. Note also that the
     * @service and @protocol arguments do not include the leading underscore
     * that appears in the actual DNS entry.
     * 
     * On success, g_resolver_lookup_service() will return a non-empty #GList of
     * #GSrvTarget, sorted in order of preference. (That is, you should
     * attempt to connect to the first target first, then the second if
     * the first fails, etc.)
     * 
     * If the DNS resolution fails, @error (if non-%NULL) will be set to
     * a value from #GResolverError and %NULL will be returned.
     * 
     * If @cancellable is non-%NULL, it can be used to cancel the
     * operation, in which case @error (if non-%NULL) will be set to
     * %G_IO_ERROR_CANCELLED.
     * 
     * If you are planning to connect to the service, it is usually easier
     * to create a #GNetworkService and use its #GSocketConnectable
     * interface.
     */
    public org.gtk.glib.List lookupService(java.lang.String service, java.lang.String protocol, java.lang.String domain, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_resolver_lookup_service(handle(), Interop.allocateNativeString(service).handle(), Interop.allocateNativeString(protocol).handle(), Interop.allocateNativeString(domain).handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Begins asynchronously performing a DNS SRV lookup for the given
     * @service and @protocol in the given @domain, and eventually calls
     * @callback, which must call g_resolver_lookup_service_finish() to
     * get the final result. See g_resolver_lookup_service() for more
     * details.
     */
    public void lookupServiceAsync(java.lang.String service, java.lang.String protocol, java.lang.String domain, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_resolver_lookup_service_async(handle(), Interop.allocateNativeString(service).handle(), Interop.allocateNativeString(protocol).handle(), Interop.allocateNativeString(domain).handle(), cancellable.handle(), 
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
     * Retrieves the result of a previous call to
     * g_resolver_lookup_service_async().
     * 
     * If the DNS resolution failed, @error (if non-%NULL) will be set to
     * a value from #GResolverError. If the operation was cancelled,
     * @error will be set to %G_IO_ERROR_CANCELLED.
     */
    public org.gtk.glib.List lookupServiceFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_resolver_lookup_service_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Sets @resolver to be the application's default resolver (reffing
     * @resolver, and unreffing the previous default resolver, if any).
     * Future calls to g_resolver_get_default() will return this resolver.
     * 
     * This can be used if an application wants to perform any sort of DNS
     * caching or "pinning"; it can implement its own #GResolver that
     * calls the original default resolver for DNS operations, and
     * implements its own cache policies on top of that, and then set
     * itself as the default resolver for all later code to use.
     */
    public void setDefault() {
        gtk_h.g_resolver_set_default(handle());
    }
    
    /**
     * Frees @addresses (which should be the return value from
     * g_resolver_lookup_by_name() or g_resolver_lookup_by_name_finish()).
     * (This is a convenience method; you can also simply free the results
     * by hand.)
     */
    public static void freeAddresses(org.gtk.glib.List addresses) {
        gtk_h.g_resolver_free_addresses(addresses.handle());
    }
    
    /**
     * Frees @targets (which should be the return value from
     * g_resolver_lookup_service() or g_resolver_lookup_service_finish()).
     * (This is a convenience method; you can also simply free the
     * results by hand.)
     */
    public static void freeTargets(org.gtk.glib.List targets) {
        gtk_h.g_resolver_free_targets(targets.handle());
    }
    
    /**
     * Gets the default #GResolver. You should unref it when you are done
     * with it. #GResolver may use its reference count as a hint about how
     * many threads it should allocate for concurrent DNS resolutions.
     */
    public static Resolver getDefault() {
        var RESULT = gtk_h.g_resolver_get_default();
        return new Resolver(References.get(RESULT, true));
    }
    
    @FunctionalInterface
    public interface ReloadHandler {
        void signalReceived(Resolver source);
    }
    
    /**
     * Emitted when the resolver notices that the system resolver
     * configuration has changed.
     */
    public SignalHandle onReload(ReloadHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalResolverReload", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("reload").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
