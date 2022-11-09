package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GResolver";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gobject.Object parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gobject.Object(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a Resolver proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Resolver(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Resolver if its GType is a (or inherits from) "GResolver".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "Resolver" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GResolver", a ClassCastException will be thrown.
     */
    public static Resolver castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GResolver"))) {
            return new Resolver(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GResolver");
        }
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
     * @param address the address to reverse-resolve
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @return a hostname (either ASCII-only, or in ASCII-encoded
     *     form), or {@code null} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull java.lang.String lookupByAddress(@NotNull org.gtk.gio.InetAddress address, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(address, "Parameter 'address' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_resolver_lookup_by_address.invokeExact(
                    handle(),
                    address.handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Begins asynchronously reverse-resolving {@code address} to determine its
     * associated hostname, and eventually calls {@code callback}, which must
     * call g_resolver_lookup_by_address_finish() to get the final result.
     * @param address the address to reverse-resolve
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @param callback callback to call after resolution completes
     */
    public void lookupByAddressAsync(@NotNull org.gtk.gio.InetAddress address, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(address, "Parameter 'address' must not be null");
        try {
            DowncallHandles.g_resolver_lookup_by_address_async.invokeExact(
                    handle(),
                    address.handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the result of a previous call to
     * g_resolver_lookup_by_address_async().
     * <p>
     * If the DNS resolution failed, {@code error} (if non-{@code null}) will be set to
     * a value from {@link ResolverError}. If the operation was cancelled,
     * {@code error} will be set to {@link IOErrorEnum#CANCELLED}.
     * @param result the result passed to your {@link AsyncReadyCallback}
     * @return a hostname (either ASCII-only, or in ASCII-encoded
     * form), or {@code null} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull java.lang.String lookupByAddressFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_resolver_lookup_by_address_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Interop.getStringFrom(RESULT);
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
     * @param hostname the hostname to look up
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @return a non-empty {@link org.gtk.glib.List}
     * of {@link InetAddress}, or {@code null} on error. You
     * must unref each of the addresses and free the list when you are
     * done with it. (You can use g_resolver_free_addresses() to do this.)
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.glib.List lookupByName(@NotNull java.lang.String hostname, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(hostname, "Parameter 'hostname' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_resolver_lookup_by_name.invokeExact(
                    handle(),
                    Interop.allocateNativeString(hostname),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
    }
    
    /**
     * Begins asynchronously resolving {@code hostname} to determine its
     * associated IP address(es), and eventually calls {@code callback}, which
     * must call g_resolver_lookup_by_name_finish() to get the result.
     * See g_resolver_lookup_by_name() for more details.
     * @param hostname the hostname to look up the address of
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @param callback callback to call after resolution completes
     */
    public void lookupByNameAsync(@NotNull java.lang.String hostname, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(hostname, "Parameter 'hostname' must not be null");
        try {
            DowncallHandles.g_resolver_lookup_by_name_async.invokeExact(
                    handle(),
                    Interop.allocateNativeString(hostname),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the result of a call to
     * g_resolver_lookup_by_name_async().
     * <p>
     * If the DNS resolution failed, {@code error} (if non-{@code null}) will be set to
     * a value from {@link ResolverError}. If the operation was cancelled,
     * {@code error} will be set to {@link IOErrorEnum#CANCELLED}.
     * @param result the result passed to your {@link AsyncReadyCallback}
     * @return a {@link org.gtk.glib.List}
     * of {@link InetAddress}, or {@code null} on error. See g_resolver_lookup_by_name()
     * for more details.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.glib.List lookupByNameFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_resolver_lookup_by_name_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
    }
    
    /**
     * This differs from g_resolver_lookup_by_name() in that you can modify
     * the lookup behavior with {@code flags}. For example this can be used to limit
     * results with {@link ResolverNameLookupFlags#IPV4_ONLY}.
     * @param hostname the hostname to look up
     * @param flags extra {@link ResolverNameLookupFlags} for the lookup
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @return a non-empty {@link org.gtk.glib.List}
     * of {@link InetAddress}, or {@code null} on error. You
     * must unref each of the addresses and free the list when you are
     * done with it. (You can use g_resolver_free_addresses() to do this.)
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.glib.List lookupByNameWithFlags(@NotNull java.lang.String hostname, @NotNull org.gtk.gio.ResolverNameLookupFlags flags, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(hostname, "Parameter 'hostname' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_resolver_lookup_by_name_with_flags.invokeExact(
                    handle(),
                    Interop.allocateNativeString(hostname),
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
    }
    
    /**
     * Begins asynchronously resolving {@code hostname} to determine its
     * associated IP address(es), and eventually calls {@code callback}, which
     * must call g_resolver_lookup_by_name_with_flags_finish() to get the result.
     * See g_resolver_lookup_by_name() for more details.
     * @param hostname the hostname to look up the address of
     * @param flags extra {@link ResolverNameLookupFlags} for the lookup
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @param callback callback to call after resolution completes
     */
    public void lookupByNameWithFlagsAsync(@NotNull java.lang.String hostname, @NotNull org.gtk.gio.ResolverNameLookupFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(hostname, "Parameter 'hostname' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_resolver_lookup_by_name_with_flags_async.invokeExact(
                    handle(),
                    Interop.allocateNativeString(hostname),
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the result of a call to
     * g_resolver_lookup_by_name_with_flags_async().
     * <p>
     * If the DNS resolution failed, {@code error} (if non-{@code null}) will be set to
     * a value from {@link ResolverError}. If the operation was cancelled,
     * {@code error} will be set to {@link IOErrorEnum#CANCELLED}.
     * @param result the result passed to your {@link AsyncReadyCallback}
     * @return a {@link org.gtk.glib.List}
     * of {@link InetAddress}, or {@code null} on error. See g_resolver_lookup_by_name()
     * for more details.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.glib.List lookupByNameWithFlagsFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_resolver_lookup_by_name_with_flags_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
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
     * @param rrname the DNS name to look up the record for
     * @param recordType the type of DNS record to look up
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @return a non-empty {@link org.gtk.glib.List} of
     * {@link org.gtk.glib.Variant}, or {@code null} on error. You must free each of the records and the list
     * when you are done with it. (You can use g_list_free_full() with
     * g_variant_unref() to do this.)
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.glib.List lookupRecords(@NotNull java.lang.String rrname, @NotNull org.gtk.gio.ResolverRecordType recordType, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(rrname, "Parameter 'rrname' must not be null");
        java.util.Objects.requireNonNull(recordType, "Parameter 'recordType' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_resolver_lookup_records.invokeExact(
                    handle(),
                    Interop.allocateNativeString(rrname),
                    recordType.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
    }
    
    /**
     * Begins asynchronously performing a DNS lookup for the given
     * {@code rrname}, and eventually calls {@code callback}, which must call
     * g_resolver_lookup_records_finish() to get the final result. See
     * g_resolver_lookup_records() for more details.
     * @param rrname the DNS name to look up the record for
     * @param recordType the type of DNS record to look up
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @param callback callback to call after resolution completes
     */
    public void lookupRecordsAsync(@NotNull java.lang.String rrname, @NotNull org.gtk.gio.ResolverRecordType recordType, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(rrname, "Parameter 'rrname' must not be null");
        java.util.Objects.requireNonNull(recordType, "Parameter 'recordType' must not be null");
        try {
            DowncallHandles.g_resolver_lookup_records_async.invokeExact(
                    handle(),
                    Interop.allocateNativeString(rrname),
                    recordType.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
     * @param result the result passed to your {@link AsyncReadyCallback}
     * @return a non-empty {@link org.gtk.glib.List} of
     * {@link org.gtk.glib.Variant}, or {@code null} on error. You must free each of the records and the list
     * when you are done with it. (You can use g_list_free_full() with
     * g_variant_unref() to do this.)
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.glib.List lookupRecordsFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_resolver_lookup_records_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
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
     * @param service the service type to look up (eg, "ldap")
     * @param protocol the networking protocol to use for {@code service} (eg, "tcp")
     * @param domain the DNS domain to look up the service in
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @return a non-empty {@link org.gtk.glib.List} of
     * {@link SrvTarget}, or {@code null} on error. You must free each of the targets and the
     * list when you are done with it. (You can use g_resolver_free_targets() to do
     * this.)
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.glib.List lookupService(@NotNull java.lang.String service, @NotNull java.lang.String protocol, @NotNull java.lang.String domain, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(service, "Parameter 'service' must not be null");
        java.util.Objects.requireNonNull(protocol, "Parameter 'protocol' must not be null");
        java.util.Objects.requireNonNull(domain, "Parameter 'domain' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_resolver_lookup_service.invokeExact(
                    handle(),
                    Interop.allocateNativeString(service),
                    Interop.allocateNativeString(protocol),
                    Interop.allocateNativeString(domain),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
    }
    
    /**
     * Begins asynchronously performing a DNS SRV lookup for the given
     * {@code service} and {@code protocol} in the given {@code domain}, and eventually calls
     * {@code callback}, which must call g_resolver_lookup_service_finish() to
     * get the final result. See g_resolver_lookup_service() for more
     * details.
     * @param service the service type to look up (eg, "ldap")
     * @param protocol the networking protocol to use for {@code service} (eg, "tcp")
     * @param domain the DNS domain to look up the service in
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @param callback callback to call after resolution completes
     */
    public void lookupServiceAsync(@NotNull java.lang.String service, @NotNull java.lang.String protocol, @NotNull java.lang.String domain, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(service, "Parameter 'service' must not be null");
        java.util.Objects.requireNonNull(protocol, "Parameter 'protocol' must not be null");
        java.util.Objects.requireNonNull(domain, "Parameter 'domain' must not be null");
        try {
            DowncallHandles.g_resolver_lookup_service_async.invokeExact(
                    handle(),
                    Interop.allocateNativeString(service),
                    Interop.allocateNativeString(protocol),
                    Interop.allocateNativeString(domain),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the result of a previous call to
     * g_resolver_lookup_service_async().
     * <p>
     * If the DNS resolution failed, {@code error} (if non-{@code null}) will be set to
     * a value from {@link ResolverError}. If the operation was cancelled,
     * {@code error} will be set to {@link IOErrorEnum#CANCELLED}.
     * @param result the result passed to your {@link AsyncReadyCallback}
     * @return a non-empty {@link org.gtk.glib.List} of
     * {@link SrvTarget}, or {@code null} on error. See g_resolver_lookup_service() for more
     * details.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.glib.List lookupServiceFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_resolver_lookup_service_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
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
        try {
            DowncallHandles.g_resolver_set_default.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Frees {@code addresses} (which should be the return value from
     * g_resolver_lookup_by_name() or g_resolver_lookup_by_name_finish()).
     * (This is a convenience method; you can also simply free the results
     * by hand.)
     * @param addresses a {@link org.gtk.glib.List} of {@link InetAddress}
     */
    public static void freeAddresses(@NotNull org.gtk.glib.List addresses) {
        java.util.Objects.requireNonNull(addresses, "Parameter 'addresses' must not be null");
        try {
            DowncallHandles.g_resolver_free_addresses.invokeExact(
                    addresses.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Frees {@code targets} (which should be the return value from
     * g_resolver_lookup_service() or g_resolver_lookup_service_finish()).
     * (This is a convenience method; you can also simply free the
     * results by hand.)
     * @param targets a {@link org.gtk.glib.List} of {@link SrvTarget}
     */
    public static void freeTargets(@NotNull org.gtk.glib.List targets) {
        java.util.Objects.requireNonNull(targets, "Parameter 'targets' must not be null");
        try {
            DowncallHandles.g_resolver_free_targets.invokeExact(
                    targets.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the default {@link Resolver}. You should unref it when you are done
     * with it. {@link Resolver} may use its reference count as a hint about how
     * many threads it should allocate for concurrent DNS resolutions.
     * @return the default {@link Resolver}.
     */
    public static @NotNull org.gtk.gio.Resolver getDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_resolver_get_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.Resolver(RESULT, Ownership.FULL);
    }
    
    @FunctionalInterface
    public interface Reload {
        void signalReceived(Resolver source);
    }
    
    /**
     * Emitted when the resolver notices that the system resolver
     * configuration has changed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Resolver.Reload> onReload(Resolver.Reload handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("reload"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Resolver.Callbacks.class, "signalResolverReload",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Resolver.Reload>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_resolver_lookup_by_address = Interop.downcallHandle(
            "g_resolver_lookup_by_address",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_resolver_lookup_by_address_async = Interop.downcallHandle(
            "g_resolver_lookup_by_address_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_resolver_lookup_by_address_finish = Interop.downcallHandle(
            "g_resolver_lookup_by_address_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_resolver_lookup_by_name = Interop.downcallHandle(
            "g_resolver_lookup_by_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_resolver_lookup_by_name_async = Interop.downcallHandle(
            "g_resolver_lookup_by_name_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_resolver_lookup_by_name_finish = Interop.downcallHandle(
            "g_resolver_lookup_by_name_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_resolver_lookup_by_name_with_flags = Interop.downcallHandle(
            "g_resolver_lookup_by_name_with_flags",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_resolver_lookup_by_name_with_flags_async = Interop.downcallHandle(
            "g_resolver_lookup_by_name_with_flags_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_resolver_lookup_by_name_with_flags_finish = Interop.downcallHandle(
            "g_resolver_lookup_by_name_with_flags_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_resolver_lookup_records = Interop.downcallHandle(
            "g_resolver_lookup_records",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_resolver_lookup_records_async = Interop.downcallHandle(
            "g_resolver_lookup_records_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_resolver_lookup_records_finish = Interop.downcallHandle(
            "g_resolver_lookup_records_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_resolver_lookup_service = Interop.downcallHandle(
            "g_resolver_lookup_service",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_resolver_lookup_service_async = Interop.downcallHandle(
            "g_resolver_lookup_service_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_resolver_lookup_service_finish = Interop.downcallHandle(
            "g_resolver_lookup_service_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_resolver_set_default = Interop.downcallHandle(
            "g_resolver_set_default",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_resolver_free_addresses = Interop.downcallHandle(
            "g_resolver_free_addresses",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_resolver_free_targets = Interop.downcallHandle(
            "g_resolver_free_targets",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_resolver_get_default = Interop.downcallHandle(
            "g_resolver_get_default",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalResolverReload(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Resolver.Reload) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Resolver(source, Ownership.UNKNOWN));
        }
    }
}
