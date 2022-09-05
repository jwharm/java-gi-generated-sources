package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
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

    public Resolver(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to Resolver */
    public static Resolver castFrom(org.gtk.gobject.Object gobject) {
        return new Resolver(gobject.getProxy());
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
    public java.lang.String lookupByAddress(InetAddress address, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_resolver_lookup_by_address(HANDLE(), address.HANDLE(), cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieves the result of a previous call to
     * g_resolver_lookup_by_address_async().
     * 
     * If the DNS resolution failed, @error (if non-%NULL) will be set to
     * a value from #GResolverError. If the operation was cancelled,
     * @error will be set to %G_IO_ERROR_CANCELLED.
     */
    public java.lang.String lookupByAddressFinish(AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_resolver_lookup_by_address_finish(HANDLE(), result.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
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
    public org.gtk.glib.List lookupByName(java.lang.String hostname, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_resolver_lookup_by_name(HANDLE(), Interop.allocateNativeString(hostname).HANDLE(), cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new org.gtk.glib.List(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Retrieves the result of a call to
     * g_resolver_lookup_by_name_async().
     * 
     * If the DNS resolution failed, @error (if non-%NULL) will be set to
     * a value from #GResolverError. If the operation was cancelled,
     * @error will be set to %G_IO_ERROR_CANCELLED.
     */
    public org.gtk.glib.List lookupByNameFinish(AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_resolver_lookup_by_name_finish(HANDLE(), result.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new org.gtk.glib.List(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * This differs from g_resolver_lookup_by_name() in that you can modify
     * the lookup behavior with @flags. For example this can be used to limit
     * results with %G_RESOLVER_NAME_LOOKUP_FLAGS_IPV4_ONLY.
     */
    public org.gtk.glib.List lookupByNameWithFlags(java.lang.String hostname, int flags, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_resolver_lookup_by_name_with_flags(HANDLE(), Interop.allocateNativeString(hostname).HANDLE(), flags, cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new org.gtk.glib.List(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Retrieves the result of a call to
     * g_resolver_lookup_by_name_with_flags_async().
     * 
     * If the DNS resolution failed, @error (if non-%NULL) will be set to
     * a value from #GResolverError. If the operation was cancelled,
     * @error will be set to %G_IO_ERROR_CANCELLED.
     */
    public org.gtk.glib.List lookupByNameWithFlagsFinish(AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_resolver_lookup_by_name_with_flags_finish(HANDLE(), result.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new org.gtk.glib.List(ProxyFactory.get(RESULT, true));
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
    public org.gtk.glib.List lookupRecords(java.lang.String rrname, ResolverRecordType recordType, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_resolver_lookup_records(HANDLE(), Interop.allocateNativeString(rrname).HANDLE(), recordType.getValue(), cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new org.gtk.glib.List(ProxyFactory.get(RESULT, true));
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
    public org.gtk.glib.List lookupRecordsFinish(AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_resolver_lookup_records_finish(HANDLE(), result.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new org.gtk.glib.List(ProxyFactory.get(RESULT, true));
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
    public org.gtk.glib.List lookupService(java.lang.String service, java.lang.String protocol, java.lang.String domain, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_resolver_lookup_service(HANDLE(), Interop.allocateNativeString(service).HANDLE(), Interop.allocateNativeString(protocol).HANDLE(), Interop.allocateNativeString(domain).HANDLE(), cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new org.gtk.glib.List(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Retrieves the result of a previous call to
     * g_resolver_lookup_service_async().
     * 
     * If the DNS resolution failed, @error (if non-%NULL) will be set to
     * a value from #GResolverError. If the operation was cancelled,
     * @error will be set to %G_IO_ERROR_CANCELLED.
     */
    public org.gtk.glib.List lookupServiceFinish(AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_resolver_lookup_service_finish(HANDLE(), result.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new org.gtk.glib.List(ProxyFactory.get(RESULT, true));
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_resolver_set_default(HANDLE());
    }
    
    @FunctionalInterface
    public interface ReloadHandler {
        void signalReceived(Resolver source);
    }
    
    /**
     * Emitted when the resolver notices that the system resolver
     * configuration has changed.
     */
    public void onReload(ReloadHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalResolverReload", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("reload").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
