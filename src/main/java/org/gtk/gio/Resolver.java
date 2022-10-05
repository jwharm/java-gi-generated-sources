package org.gtk.gio;

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

    public Resolver(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Resolver */
    public static Resolver castFrom(org.gtk.gobject.Object gobject) {
        return new Resolver(gobject.refcounted());
    }
    
    static final MethodHandle g_resolver_lookup_by_address = Interop.downcallHandle(
        "g_resolver_lookup_by_address",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (MemoryAddress) g_resolver_lookup_by_address.invokeExact(handle(), address.handle(), cancellable.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_resolver_lookup_by_address_async = Interop.downcallHandle(
        "g_resolver_lookup_by_address_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Begins asynchronously reverse-resolving {@code address} to determine its
     * associated hostname, and eventually calls {@code callback}, which must
     * call g_resolver_lookup_by_address_finish() to get the final result.
     */
    public void lookupByAddressAsync(InetAddress address, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_resolver_lookup_by_address_async.invokeExact(handle(), address.handle(), cancellable.handle(), 
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
    
    static final MethodHandle g_resolver_lookup_by_address_finish = Interop.downcallHandle(
        "g_resolver_lookup_by_address_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (MemoryAddress) g_resolver_lookup_by_address_finish.invokeExact(handle(), result.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_resolver_lookup_by_name = Interop.downcallHandle(
        "g_resolver_lookup_by_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (MemoryAddress) g_resolver_lookup_by_name.invokeExact(handle(), Interop.allocateNativeString(hostname).handle(), cancellable.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new org.gtk.glib.List(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_resolver_lookup_by_name_async = Interop.downcallHandle(
        "g_resolver_lookup_by_name_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Begins asynchronously resolving {@code hostname} to determine its
     * associated IP address(es), and eventually calls {@code callback}, which
     * must call g_resolver_lookup_by_name_finish() to get the result.
     * See g_resolver_lookup_by_name() for more details.
     */
    public void lookupByNameAsync(java.lang.String hostname, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_resolver_lookup_by_name_async.invokeExact(handle(), Interop.allocateNativeString(hostname).handle(), cancellable.handle(), 
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
    
    static final MethodHandle g_resolver_lookup_by_name_finish = Interop.downcallHandle(
        "g_resolver_lookup_by_name_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (MemoryAddress) g_resolver_lookup_by_name_finish.invokeExact(handle(), result.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new org.gtk.glib.List(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_resolver_lookup_by_name_with_flags = Interop.downcallHandle(
        "g_resolver_lookup_by_name_with_flags",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * This differs from g_resolver_lookup_by_name() in that you can modify
     * the lookup behavior with {@code flags}. For example this can be used to limit
     * results with {@link ResolverNameLookupFlags#IPV4_ONLY}.
     */
    public org.gtk.glib.List lookupByNameWithFlags(java.lang.String hostname, ResolverNameLookupFlags flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_resolver_lookup_by_name_with_flags.invokeExact(handle(), Interop.allocateNativeString(hostname).handle(), flags.getValue(), cancellable.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new org.gtk.glib.List(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_resolver_lookup_by_name_with_flags_async = Interop.downcallHandle(
        "g_resolver_lookup_by_name_with_flags_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Begins asynchronously resolving {@code hostname} to determine its
     * associated IP address(es), and eventually calls {@code callback}, which
     * must call g_resolver_lookup_by_name_with_flags_finish() to get the result.
     * See g_resolver_lookup_by_name() for more details.
     */
    public void lookupByNameWithFlagsAsync(java.lang.String hostname, ResolverNameLookupFlags flags, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_resolver_lookup_by_name_with_flags_async.invokeExact(handle(), Interop.allocateNativeString(hostname).handle(), flags.getValue(), cancellable.handle(), 
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
    
    static final MethodHandle g_resolver_lookup_by_name_with_flags_finish = Interop.downcallHandle(
        "g_resolver_lookup_by_name_with_flags_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (MemoryAddress) g_resolver_lookup_by_name_with_flags_finish.invokeExact(handle(), result.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new org.gtk.glib.List(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_resolver_lookup_records = Interop.downcallHandle(
        "g_resolver_lookup_records",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (MemoryAddress) g_resolver_lookup_records.invokeExact(handle(), Interop.allocateNativeString(rrname).handle(), recordType.getValue(), cancellable.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new org.gtk.glib.List(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_resolver_lookup_records_async = Interop.downcallHandle(
        "g_resolver_lookup_records_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Begins asynchronously performing a DNS lookup for the given
     * {@code rrname}, and eventually calls {@code callback}, which must call
     * g_resolver_lookup_records_finish() to get the final result. See
     * g_resolver_lookup_records() for more details.
     */
    public void lookupRecordsAsync(java.lang.String rrname, ResolverRecordType recordType, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_resolver_lookup_records_async.invokeExact(handle(), Interop.allocateNativeString(rrname).handle(), recordType.getValue(), cancellable.handle(), 
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
    
    static final MethodHandle g_resolver_lookup_records_finish = Interop.downcallHandle(
        "g_resolver_lookup_records_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (MemoryAddress) g_resolver_lookup_records_finish.invokeExact(handle(), result.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new org.gtk.glib.List(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_resolver_lookup_service = Interop.downcallHandle(
        "g_resolver_lookup_service",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (MemoryAddress) g_resolver_lookup_service.invokeExact(handle(), Interop.allocateNativeString(service).handle(), Interop.allocateNativeString(protocol).handle(), Interop.allocateNativeString(domain).handle(), cancellable.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new org.gtk.glib.List(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_resolver_lookup_service_async = Interop.downcallHandle(
        "g_resolver_lookup_service_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Begins asynchronously performing a DNS SRV lookup for the given
     * {@code service} and {@code protocol} in the given {@code domain}, and eventually calls
     * {@code callback}, which must call g_resolver_lookup_service_finish() to
     * get the final result. See g_resolver_lookup_service() for more
     * details.
     */
    public void lookupServiceAsync(java.lang.String service, java.lang.String protocol, java.lang.String domain, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_resolver_lookup_service_async.invokeExact(handle(), Interop.allocateNativeString(service).handle(), Interop.allocateNativeString(protocol).handle(), Interop.allocateNativeString(domain).handle(), cancellable.handle(), 
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
    
    static final MethodHandle g_resolver_lookup_service_finish = Interop.downcallHandle(
        "g_resolver_lookup_service_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (MemoryAddress) g_resolver_lookup_service_finish.invokeExact(handle(), result.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new org.gtk.glib.List(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_resolver_set_default = Interop.downcallHandle(
        "g_resolver_set_default",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
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
        try {
            g_resolver_set_default.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_resolver_free_addresses = Interop.downcallHandle(
        "g_resolver_free_addresses",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees {@code addresses} (which should be the return value from
     * g_resolver_lookup_by_name() or g_resolver_lookup_by_name_finish()).
     * (This is a convenience method; you can also simply free the results
     * by hand.)
     */
    public static void freeAddresses(org.gtk.glib.List addresses) {
        try {
            g_resolver_free_addresses.invokeExact(addresses.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_resolver_free_targets = Interop.downcallHandle(
        "g_resolver_free_targets",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees {@code targets} (which should be the return value from
     * g_resolver_lookup_service() or g_resolver_lookup_service_finish()).
     * (This is a convenience method; you can also simply free the
     * results by hand.)
     */
    public static void freeTargets(org.gtk.glib.List targets) {
        try {
            g_resolver_free_targets.invokeExact(targets.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_resolver_get_default = Interop.downcallHandle(
        "g_resolver_get_default",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the default {@link Resolver}. You should unref it when you are done
     * with it. {@link Resolver} may use its reference count as a hint about how
     * many threads it should allocate for concurrent DNS resolutions.
     */
    public static Resolver getDefault() {
        try {
            var RESULT = (MemoryAddress) g_resolver_get_default.invokeExact();
            return new Resolver(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("reload").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Resolver.Callbacks.class, "signalResolverReload",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalResolverReload(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Resolver.ReloadHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Resolver(Refcounted.get(source)));
        }
        
    }
}
