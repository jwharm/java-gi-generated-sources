package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link Resolver} provides cancellable synchronous and asynchronous DNS
 * resolution, for hostnames (g_resolver_lookup_by_address(),
 * g_resolver_lookup_by_name() and their async variants) and SRV
 * (service) records (g_resolver_lookup_service()).
 * <p>
 * {@link NetworkAddress} and {@link NetworkService} provide wrappers around
 * {@link Resolver} functionality that also implement {@link SocketConnectable},
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
     * Synchronously reverse-resolves {@code address} to determine its
     * associated hostname.
     * <p>
     * If the DNS resolution fails, {@code error} (if non-{@code null}) will be set to
     * a value from {@link ResolverError}.
     * <p>
     * If {@code cancellable} is non-{@code null}, it can be used to cancel the
     * operation, in which case {@code error} (if non-{@code null}) will be set to
     * {@link IOErrorEnum#CANCELLED}.
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
     * Begins asynchronously reverse-resolving {@code address} to determine its
     * associated hostname, and eventually calls {@code callback}, which must
     * call g_resolver_lookup_by_address_finish() to get the final result.
     */
    public void lookupByAddressAsync(InetAddress address, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_resolver_lookup_by_address_async(handle(), address.handle(), cancellable.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Retrieves the result of a previous call to
     * g_resolver_lookup_by_address_async().
     * <p>
     * If the DNS resolution failed, {@code error} (if non-{@code null}) will be set to
     * a value from {@link ResolverError}. If the operation was cancelled,
     * {@code error} will be set to {@link IOErrorEnum#CANCELLED}.
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
     * Synchronously resolves {@code hostname} to determine its associated IP
     * address(es). {@code hostname} may be an ASCII-only or UTF-8 hostname, or
     * the textual form of an IP address (in which case this just becomes
     * a wrapper around g_inet_address_new_from_string()).
     * <p>
     * On success, g_resolver_lookup_by_name() will return a non-empty {@link org.gtk.glib.List} of
     * {@link InetAddress}, sorted in order of preference and guaranteed to not
     * contain duplicates. That is, if using the result to connect to
     * {@code hostname}, you should attempt to connect to the first address
     * first, then the second if the first fails, etc. If you are using
     * the result to listen on a socket, it is appropriate to add each
     * result using e.g. g_socket_listener_add_address().
     * <p>
     * If the DNS resolution fails, {@code error} (if non-{@code null}) will be set to a
     * value from {@link ResolverError} and {@code null} will be returned.
     * <p>
     * If {@code cancellable} is non-{@code null}, it can be used to cancel the
     * operation, in which case {@code error} (if non-{@code null}) will be set to
     * {@link IOErrorEnum#CANCELLED}.
     * <p>
     * If you are planning to connect to a socket on the resolved IP
     * address, it may be easier to create a {@link NetworkAddress} and use its
     * {@link SocketConnectable} interface.
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
     * Begins asynchronously resolving {@code hostname} to determine its
     * associated IP address(es), and eventually calls {@code callback}, which
     * must call g_resolver_lookup_by_name_finish() to get the result.
     * See g_resolver_lookup_by_name() for more details.
     */
    public void lookupByNameAsync(java.lang.String hostname, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_resolver_lookup_by_name_async(handle(), Interop.allocateNativeString(hostname).handle(), cancellable.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Retrieves the result of a call to
     * g_resolver_lookup_by_name_async().
     * <p>
     * If the DNS resolution failed, {@code error} (if non-{@code null}) will be set to
     * a value from {@link ResolverError}. If the operation was cancelled,
     * {@code error} will be set to {@link IOErrorEnum#CANCELLED}.
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
     * the lookup behavior with {@code flags}. For example this can be used to limit
     * results with {@link ResolverNameLookupFlags#IPV4_ONLY}.
     */
    public org.gtk.glib.List lookupByNameWithFlags(java.lang.String hostname, ResolverNameLookupFlags flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_resolver_lookup_by_name_with_flags(handle(), Interop.allocateNativeString(hostname).handle(), flags.getValue(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Begins asynchronously resolving {@code hostname} to determine its
     * associated IP address(es), and eventually calls {@code callback}, which
     * must call g_resolver_lookup_by_name_with_flags_finish() to get the result.
     * See g_resolver_lookup_by_name() for more details.
     */
    public void lookupByNameWithFlagsAsync(java.lang.String hostname, ResolverNameLookupFlags flags, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_resolver_lookup_by_name_with_flags_async(handle(), Interop.allocateNativeString(hostname).handle(), flags.getValue(), cancellable.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Retrieves the result of a call to
     * g_resolver_lookup_by_name_with_flags_async().
     * <p>
     * If the DNS resolution failed, {@code error} (if non-{@code null}) will be set to
     * a value from {@link ResolverError}. If the operation was cancelled,
     * {@code error} will be set to {@link IOErrorEnum#CANCELLED}.
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
     * Synchronously performs a DNS record lookup for the given {@code rrname} and returns
     * a list of records as {@link org.gtk.glib.Variant} tuples. See {@link ResolverRecordType} for
     * information on what the records contain for each {@code record_type}.
     * <p>
     * If the DNS resolution fails, {@code error} (if non-{@code null}) will be set to
     * a value from {@link ResolverError} and {@code null} will be returned.
     * <p>
     * If {@code cancellable} is non-{@code null}, it can be used to cancel the
     * operation, in which case {@code error} (if non-{@code null}) will be set to
     * {@link IOErrorEnum#CANCELLED}.
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
     * {@code rrname}, and eventually calls {@code callback}, which must call
     * g_resolver_lookup_records_finish() to get the final result. See
     * g_resolver_lookup_records() for more details.
     */
    public void lookupRecordsAsync(java.lang.String rrname, ResolverRecordType recordType, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_resolver_lookup_records_async(handle(), Interop.allocateNativeString(rrname).handle(), recordType.getValue(), cancellable.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Retrieves the result of a previous call to
     * g_resolver_lookup_records_async(). Returns a non-empty list of records as
     * {@link org.gtk.glib.Variant} tuples. See {@link ResolverRecordType} for information on what the
     * records contain.
     * <p>
     * If the DNS resolution failed, {@code error} (if non-{@code null}) will be set to
     * a value from {@link ResolverError}. If the operation was cancelled,
     * {@code error} will be set to {@link IOErrorEnum#CANCELLED}.
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
     * Synchronously performs a DNS SRV lookup for the given {@code service} and
     * {@code protocol} in the given {@code domain} and returns an array of {@link SrvTarget}.
     * {@code domain} may be an ASCII-only or UTF-8 hostname. Note also that the
     * {@code service} and {@code protocol} arguments do not include the leading underscore
     * that appears in the actual DNS entry.
     * <p>
     * On success, g_resolver_lookup_service() will return a non-empty {@link org.gtk.glib.List} of
     * {@link SrvTarget}, sorted in order of preference. (That is, you should
     * attempt to connect to the first target first, then the second if
     * the first fails, etc.)
     * <p>
     * If the DNS resolution fails, {@code error} (if non-{@code null}) will be set to
     * a value from {@link ResolverError} and {@code null} will be returned.
     * <p>
     * If {@code cancellable} is non-{@code null}, it can be used to cancel the
     * operation, in which case {@code error} (if non-{@code null}) will be set to
     * {@link IOErrorEnum#CANCELLED}.
     * <p>
     * If you are planning to connect to the service, it is usually easier
     * to create a {@link NetworkService} and use its {@link SocketConnectable}
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
     * {@code service} and {@code protocol} in the given {@code domain}, and eventually calls
     * {@code callback}, which must call g_resolver_lookup_service_finish() to
     * get the final result. See g_resolver_lookup_service() for more
     * details.
     */
    public void lookupServiceAsync(java.lang.String service, java.lang.String protocol, java.lang.String domain, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_resolver_lookup_service_async(handle(), Interop.allocateNativeString(service).handle(), Interop.allocateNativeString(protocol).handle(), Interop.allocateNativeString(domain).handle(), cancellable.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Retrieves the result of a previous call to
     * g_resolver_lookup_service_async().
     * <p>
     * If the DNS resolution failed, {@code error} (if non-{@code null}) will be set to
     * a value from {@link ResolverError}. If the operation was cancelled,
     * {@code error} will be set to {@link IOErrorEnum#CANCELLED}.
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
     * Sets {@code resolver} to be the application's default resolver (reffing
     * {@code resolver}, and unreffing the previous default resolver, if any).
     * Future calls to g_resolver_get_default() will return this resolver.
     * <p>
     * This can be used if an application wants to perform any sort of DNS
     * caching or "pinning"; it can implement its own {@link Resolver} that
     * calls the original default resolver for DNS operations, and
     * implements its own cache policies on top of that, and then set
     * itself as the default resolver for all later code to use.
     */
    public void setDefault() {
        gtk_h.g_resolver_set_default(handle());
    }
    
    /**
     * Frees {@code addresses} (which should be the return value from
     * g_resolver_lookup_by_name() or g_resolver_lookup_by_name_finish()).
     * (This is a convenience method; you can also simply free the results
     * by hand.)
     */
    public static void freeAddresses(org.gtk.glib.List addresses) {
        gtk_h.g_resolver_free_addresses(addresses.handle());
    }
    
    /**
     * Frees {@code targets} (which should be the return value from
     * g_resolver_lookup_service() or g_resolver_lookup_service_finish()).
     * (This is a convenience method; you can also simply free the
     * results by hand.)
     */
    public static void freeTargets(org.gtk.glib.List targets) {
        gtk_h.g_resolver_free_targets(targets.handle());
    }
    
    /**
     * Gets the default {@link Resolver}. You should unref it when you are done
     * with it. {@link Resolver} may use its reference count as a hint about how
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("reload").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Resolver.class, "__signalResolverReload",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalResolverReload(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (Resolver.ReloadHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Resolver(References.get(source)));
    }
    
}
