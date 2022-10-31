package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link SocketClient} is a lightweight high-level utility class for connecting to
 * a network host using a connection oriented socket type.
 * <p>
 * You create a {@link SocketClient} object, set any options you want, and then
 * call a sync or async connect operation, which returns a {@link SocketConnection}
 * subclass on success.
 * <p>
 * The type of the {@link SocketConnection} object returned depends on the type of
 * the underlying socket that is in use. For instance, for a TCP/IP connection
 * it will be a {@link TcpConnection}.
 * <p>
 * As {@link SocketClient} is a lightweight object, you don't need to cache it. You
 * can just create a new one any time you need one.
 * @version 2.22
 */
public class SocketClient extends org.gtk.gobject.Object {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSocketClient";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gobject.Object parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gobject.Object(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public SocketClient(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to SocketClient if its GType is a (or inherits from) "GSocketClient".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "SocketClient" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GSocketClient", a ClassCastException will be thrown.
     */
    public static SocketClient castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GSocketClient"))) {
            return new SocketClient(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GSocketClient");
        }
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_socket_client_new.invokeExact(), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link SocketClient} with the default options.
     */
    public SocketClient() {
        super(constructNew());
    }
    
    /**
     * Enable proxy protocols to be handled by the application. When the
     * indicated proxy protocol is returned by the {@link ProxyResolver},
     * {@link SocketClient} will consider this protocol as supported but will
     * not try to find a {@link Proxy} instance to handle handshaking. The
     * application must check for this case by calling
     * g_socket_connection_get_remote_address() on the returned
     * {@link SocketConnection}, and seeing if it's a {@link ProxyAddress} of the
     * appropriate type, to determine whether or not it needs to handle
     * the proxy handshaking itself.
     * <p>
     * This should be used for proxy protocols that are dialects of
     * another protocol such as HTTP proxy. It also allows cohabitation of
     * proxy protocols that are reused between protocols. A good example
     * is HTTP. It can be used to proxy HTTP, FTP and Gopher and can also
     * be use as generic socket proxy through the HTTP CONNECT method.
     * <p>
     * When the proxy is detected as being an application proxy, TLS handshake
     * will be skipped. This is required to let the application do the proxy
     * specific handshake.
     * @param protocol The proxy protocol
     */
    public void addApplicationProxy(@NotNull java.lang.String protocol) {
        java.util.Objects.requireNonNull(protocol, "Parameter 'protocol' must not be null");
        try {
            DowncallHandles.g_socket_client_add_application_proxy.invokeExact(
                    handle(),
                    Interop.allocateNativeString(protocol));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Tries to resolve the {@code connectable} and make a network connection to it.
     * <p>
     * Upon a successful connection, a new {@link SocketConnection} is constructed
     * and returned.  The caller owns this new object and must drop their
     * reference to it when finished with it.
     * <p>
     * The type of the {@link SocketConnection} object returned depends on the type of
     * the underlying socket that is used. For instance, for a TCP/IP connection
     * it will be a {@link TcpConnection}.
     * <p>
     * The socket created will be the same family as the address that the
     * {@code connectable} resolves to, unless family is set with g_socket_client_set_family()
     * or indirectly via g_socket_client_set_local_address(). The socket type
     * defaults to {@link SocketType#STREAM} but can be set with
     * g_socket_client_set_socket_type().
     * <p>
     * If a local address is specified with g_socket_client_set_local_address() the
     * socket will be bound to this address before connecting.
     * @param connectable a {@link SocketConnectable} specifying the remote address.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return a {@link SocketConnection} on success, {@code null} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.gio.SocketConnection connect(@NotNull org.gtk.gio.SocketConnectable connectable, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(connectable, "Parameter 'connectable' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_socket_client_connect.invokeExact(
                    handle(),
                    connectable.handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.SocketConnection(Refcounted.get(RESULT, true));
    }
    
    /**
     * This is the asynchronous version of g_socket_client_connect().
     * <p>
     * You may wish to prefer the asynchronous version even in synchronous
     * command line programs because, since 2.60, it implements
     * <a href="https://tools.ietf.org/html/rfc8305">RFC 8305</a> "Happy Eyeballs"
     * recommendations to work around long connection timeouts in networks
     * where IPv6 is broken by performing an IPv4 connection simultaneously
     * without waiting for IPv6 to time out, which is not supported by the
     * synchronous call. (This is not an API guarantee, and may change in
     * the future.)
     * <p>
     * When the operation is finished {@code callback} will be
     * called. You can then call g_socket_client_connect_finish() to get
     * the result of the operation.
     * @param connectable a {@link SocketConnectable} specifying the remote address.
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @param callback a {@link AsyncReadyCallback}
     */
    public void connectAsync(@NotNull org.gtk.gio.SocketConnectable connectable, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(connectable, "Parameter 'connectable' must not be null");
        try {
            DowncallHandles.g_socket_client_connect_async.invokeExact(
                    handle(),
                    connectable.handle(),
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
     * Finishes an async connect operation. See g_socket_client_connect_async()
     * @param result a {@link AsyncResult}.
     * @return a {@link SocketConnection} on success, {@code null} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.gio.SocketConnection connectFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_socket_client_connect_finish.invokeExact(
                    handle(),
                    result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.SocketConnection(Refcounted.get(RESULT, true));
    }
    
    /**
     * This is a helper function for g_socket_client_connect().
     * <p>
     * Attempts to create a TCP connection to the named host.
     * <p>
     * {@code host_and_port} may be in any of a number of recognized formats; an IPv6
     * address, an IPv4 address, or a domain name (in which case a DNS
     * lookup is performed).  Quoting with [] is supported for all address
     * types.  A port override may be specified in the usual way with a
     * colon.  Ports may be given as decimal numbers or symbolic names (in
     * which case an /etc/services lookup is performed).
     * <p>
     * If no port override is given in {@code host_and_port} then {@code default_port} will be
     * used as the port number to connect to.
     * <p>
     * In general, {@code host_and_port} is expected to be provided by the user (allowing
     * them to give the hostname, and a port override if necessary) and
     * {@code default_port} is expected to be provided by the application.
     * <p>
     * In the case that an IP address is given, a single connection
     * attempt is made.  In the case that a name is given, multiple
     * connection attempts may be made, in turn and according to the
     * number of address records in DNS, until a connection succeeds.
     * <p>
     * Upon a successful connection, a new {@link SocketConnection} is constructed
     * and returned.  The caller owns this new object and must drop their
     * reference to it when finished with it.
     * <p>
     * In the event of any failure (DNS error, service not found, no hosts
     * connectable) {@code null} is returned and {@code error} (if non-{@code null}) is set
     * accordingly.
     * @param hostAndPort the name and optionally port of the host to connect to
     * @param defaultPort the default port to connect to
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @return a {@link SocketConnection} on success, {@code null} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.gio.SocketConnection connectToHost(@NotNull java.lang.String hostAndPort, short defaultPort, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(hostAndPort, "Parameter 'hostAndPort' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_socket_client_connect_to_host.invokeExact(
                    handle(),
                    Interop.allocateNativeString(hostAndPort),
                    defaultPort,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.SocketConnection(Refcounted.get(RESULT, true));
    }
    
    /**
     * This is the asynchronous version of g_socket_client_connect_to_host().
     * <p>
     * When the operation is finished {@code callback} will be
     * called. You can then call g_socket_client_connect_to_host_finish() to get
     * the result of the operation.
     * @param hostAndPort the name and optionally the port of the host to connect to
     * @param defaultPort the default port to connect to
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @param callback a {@link AsyncReadyCallback}
     */
    public void connectToHostAsync(@NotNull java.lang.String hostAndPort, short defaultPort, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(hostAndPort, "Parameter 'hostAndPort' must not be null");
        try {
            DowncallHandles.g_socket_client_connect_to_host_async.invokeExact(
                    handle(),
                    Interop.allocateNativeString(hostAndPort),
                    defaultPort,
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
     * Finishes an async connect operation. See g_socket_client_connect_to_host_async()
     * @param result a {@link AsyncResult}.
     * @return a {@link SocketConnection} on success, {@code null} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.gio.SocketConnection connectToHostFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_socket_client_connect_to_host_finish.invokeExact(
                    handle(),
                    result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.SocketConnection(Refcounted.get(RESULT, true));
    }
    
    /**
     * Attempts to create a TCP connection to a service.
     * <p>
     * This call looks up the SRV record for {@code service} at {@code domain} for the
     * "tcp" protocol.  It then attempts to connect, in turn, to each of
     * the hosts providing the service until either a connection succeeds
     * or there are no hosts remaining.
     * <p>
     * Upon a successful connection, a new {@link SocketConnection} is constructed
     * and returned.  The caller owns this new object and must drop their
     * reference to it when finished with it.
     * <p>
     * In the event of any failure (DNS error, service not found, no hosts
     * connectable) {@code null} is returned and {@code error} (if non-{@code null}) is set
     * accordingly.
     * @param domain a domain name
     * @param service the name of the service to connect to
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @return a {@link SocketConnection} if successful, or {@code null} on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.gio.SocketConnection connectToService(@NotNull java.lang.String domain, @NotNull java.lang.String service, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(domain, "Parameter 'domain' must not be null");
        java.util.Objects.requireNonNull(service, "Parameter 'service' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_socket_client_connect_to_service.invokeExact(
                    handle(),
                    Interop.allocateNativeString(domain),
                    Interop.allocateNativeString(service),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.SocketConnection(Refcounted.get(RESULT, true));
    }
    
    /**
     * This is the asynchronous version of
     * g_socket_client_connect_to_service().
     * @param domain a domain name
     * @param service the name of the service to connect to
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @param callback a {@link AsyncReadyCallback}
     */
    public void connectToServiceAsync(@NotNull java.lang.String domain, @NotNull java.lang.String service, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(domain, "Parameter 'domain' must not be null");
        java.util.Objects.requireNonNull(service, "Parameter 'service' must not be null");
        try {
            DowncallHandles.g_socket_client_connect_to_service_async.invokeExact(
                    handle(),
                    Interop.allocateNativeString(domain),
                    Interop.allocateNativeString(service),
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
     * Finishes an async connect operation. See g_socket_client_connect_to_service_async()
     * @param result a {@link AsyncResult}.
     * @return a {@link SocketConnection} on success, {@code null} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.gio.SocketConnection connectToServiceFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_socket_client_connect_to_service_finish.invokeExact(
                    handle(),
                    result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.SocketConnection(Refcounted.get(RESULT, true));
    }
    
    /**
     * This is a helper function for g_socket_client_connect().
     * <p>
     * Attempts to create a TCP connection with a network URI.
     * <p>
     * {@code uri} may be any valid URI containing an "authority" (hostname/port)
     * component. If a port is not specified in the URI, {@code default_port}
     * will be used. TLS will be negotiated if {@link SocketClient}:tls is {@code true}.
     * ({@link SocketClient} does not know to automatically assume TLS for
     * certain URI schemes.)
     * <p>
     * Using this rather than g_socket_client_connect() or
     * g_socket_client_connect_to_host() allows {@link SocketClient} to
     * determine when to use application-specific proxy protocols.
     * <p>
     * Upon a successful connection, a new {@link SocketConnection} is constructed
     * and returned.  The caller owns this new object and must drop their
     * reference to it when finished with it.
     * <p>
     * In the event of any failure (DNS error, service not found, no hosts
     * connectable) {@code null} is returned and {@code error} (if non-{@code null}) is set
     * accordingly.
     * @param uri A network URI
     * @param defaultPort the default port to connect to
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @return a {@link SocketConnection} on success, {@code null} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.gio.SocketConnection connectToUri(@NotNull java.lang.String uri, short defaultPort, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_socket_client_connect_to_uri.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri),
                    defaultPort,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.SocketConnection(Refcounted.get(RESULT, true));
    }
    
    /**
     * This is the asynchronous version of g_socket_client_connect_to_uri().
     * <p>
     * When the operation is finished {@code callback} will be
     * called. You can then call g_socket_client_connect_to_uri_finish() to get
     * the result of the operation.
     * @param uri a network uri
     * @param defaultPort the default port to connect to
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @param callback a {@link AsyncReadyCallback}
     */
    public void connectToUriAsync(@NotNull java.lang.String uri, short defaultPort, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        try {
            DowncallHandles.g_socket_client_connect_to_uri_async.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri),
                    defaultPort,
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
     * Finishes an async connect operation. See g_socket_client_connect_to_uri_async()
     * @param result a {@link AsyncResult}.
     * @return a {@link SocketConnection} on success, {@code null} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.gio.SocketConnection connectToUriFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_socket_client_connect_to_uri_finish.invokeExact(
                    handle(),
                    result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.SocketConnection(Refcounted.get(RESULT, true));
    }
    
    /**
     * Gets the proxy enable state; see g_socket_client_set_enable_proxy()
     * @return whether proxying is enabled
     */
    public boolean getEnableProxy() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_client_get_enable_proxy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the socket family of the socket client.
     * <p>
     * See g_socket_client_set_family() for details.
     * @return a {@link SocketFamily}
     */
    public @NotNull org.gtk.gio.SocketFamily getFamily() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_client_get_family.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.SocketFamily(RESULT);
    }
    
    /**
     * Gets the local address of the socket client.
     * <p>
     * See g_socket_client_set_local_address() for details.
     * @return a {@link SocketAddress} or {@code null}. Do not free.
     */
    public @Nullable org.gtk.gio.SocketAddress getLocalAddress() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_socket_client_get_local_address.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.SocketAddress(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the protocol name type of the socket client.
     * <p>
     * See g_socket_client_set_protocol() for details.
     * @return a {@link SocketProtocol}
     */
    public @NotNull org.gtk.gio.SocketProtocol getProtocol() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_client_get_protocol.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.SocketProtocol(RESULT);
    }
    
    /**
     * Gets the {@link ProxyResolver} being used by {@code client}. Normally, this will
     * be the resolver returned by g_proxy_resolver_get_default(), but you
     * can override it with g_socket_client_set_proxy_resolver().
     * @return The {@link ProxyResolver} being used by
     *   {@code client}.
     */
    public @NotNull org.gtk.gio.ProxyResolver getProxyResolver() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_socket_client_get_proxy_resolver.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.ProxyResolver.ProxyResolverImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the socket type of the socket client.
     * <p>
     * See g_socket_client_set_socket_type() for details.
     * @return a {@link SocketFamily}
     */
    public @NotNull org.gtk.gio.SocketType getSocketType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_client_get_socket_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.SocketType(RESULT);
    }
    
    /**
     * Gets the I/O timeout time for sockets created by {@code client}.
     * <p>
     * See g_socket_client_set_timeout() for details.
     * @return the timeout in seconds
     */
    public int getTimeout() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_client_get_timeout.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets whether {@code client} creates TLS connections. See
     * g_socket_client_set_tls() for details.
     * @return whether {@code client} uses TLS
     */
    public boolean getTls() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_client_get_tls.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the TLS validation flags used creating TLS connections via
     * {@code client}.
     * <p>
     * This function does not work as originally designed and is impossible
     * to use correctly. See {@link SocketClient}:tls-validation-flags for more
     * information.
     * @return the TLS validation flags
     * @deprecated Do not attempt to ignore validation errors.
     */
    @Deprecated
    public @NotNull org.gtk.gio.TlsCertificateFlags getTlsValidationFlags() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_client_get_tls_validation_flags.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.TlsCertificateFlags(RESULT);
    }
    
    /**
     * Sets whether or not {@code client} attempts to make connections via a
     * proxy server. When enabled (the default), {@link SocketClient} will use a
     * {@link ProxyResolver} to determine if a proxy protocol such as SOCKS is
     * needed, and automatically do the necessary proxy negotiation.
     * <p>
     * See also g_socket_client_set_proxy_resolver().
     * @param enable whether to enable proxies
     */
    public void setEnableProxy(boolean enable) {
        try {
            DowncallHandles.g_socket_client_set_enable_proxy.invokeExact(
                    handle(),
                    enable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the socket family of the socket client.
     * If this is set to something other than {@link SocketFamily#INVALID}
     * then the sockets created by this object will be of the specified
     * family.
     * <p>
     * This might be useful for instance if you want to force the local
     * connection to be an ipv4 socket, even though the address might
     * be an ipv6 mapped to ipv4 address.
     * @param family a {@link SocketFamily}
     */
    public void setFamily(@NotNull org.gtk.gio.SocketFamily family) {
        java.util.Objects.requireNonNull(family, "Parameter 'family' must not be null");
        try {
            DowncallHandles.g_socket_client_set_family.invokeExact(
                    handle(),
                    family.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the local address of the socket client.
     * The sockets created by this object will bound to the
     * specified address (if not {@code null}) before connecting.
     * <p>
     * This is useful if you want to ensure that the local
     * side of the connection is on a specific port, or on
     * a specific interface.
     * @param address a {@link SocketAddress}, or {@code null}
     */
    public void setLocalAddress(@Nullable org.gtk.gio.SocketAddress address) {
        try {
            DowncallHandles.g_socket_client_set_local_address.invokeExact(
                    handle(),
                    (Addressable) (address == null ? MemoryAddress.NULL : address.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the protocol of the socket client.
     * The sockets created by this object will use of the specified
     * protocol.
     * <p>
     * If {@code protocol} is {@link SocketProtocol#DEFAULT} that means to use the default
     * protocol for the socket family and type.
     * @param protocol a {@link SocketProtocol}
     */
    public void setProtocol(@NotNull org.gtk.gio.SocketProtocol protocol) {
        java.util.Objects.requireNonNull(protocol, "Parameter 'protocol' must not be null");
        try {
            DowncallHandles.g_socket_client_set_protocol.invokeExact(
                    handle(),
                    protocol.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Overrides the {@link ProxyResolver} used by {@code client}. You can call this if
     * you want to use specific proxies, rather than using the system
     * default proxy settings.
     * <p>
     * Note that whether or not the proxy resolver is actually used
     * depends on the setting of {@link SocketClient}:enable-proxy, which is not
     * changed by this function (but which is {@code true} by default)
     * @param proxyResolver a {@link ProxyResolver}, or {@code null} for the
     *   default.
     */
    public void setProxyResolver(@Nullable org.gtk.gio.ProxyResolver proxyResolver) {
        try {
            DowncallHandles.g_socket_client_set_proxy_resolver.invokeExact(
                    handle(),
                    (Addressable) (proxyResolver == null ? MemoryAddress.NULL : proxyResolver.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the socket type of the socket client.
     * The sockets created by this object will be of the specified
     * type.
     * <p>
     * It doesn't make sense to specify a type of {@link SocketType#DATAGRAM},
     * as GSocketClient is used for connection oriented services.
     * @param type a {@link SocketType}
     */
    public void setSocketType(@NotNull org.gtk.gio.SocketType type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        try {
            DowncallHandles.g_socket_client_set_socket_type.invokeExact(
                    handle(),
                    type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the I/O timeout for sockets created by {@code client}. {@code timeout} is a
     * time in seconds, or 0 for no timeout (the default).
     * <p>
     * The timeout value affects the initial connection attempt as well,
     * so setting this may cause calls to g_socket_client_connect(), etc,
     * to fail with {@link IOErrorEnum#TIMED_OUT}.
     * @param timeout the timeout
     */
    public void setTimeout(int timeout) {
        try {
            DowncallHandles.g_socket_client_set_timeout.invokeExact(
                    handle(),
                    timeout);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether {@code client} creates TLS (aka SSL) connections. If {@code tls} is
     * {@code true}, {@code client} will wrap its connections in a {@link TlsClientConnection}
     * and perform a TLS handshake when connecting.
     * <p>
     * Note that since {@link SocketClient} must return a {@link SocketConnection},
     * but {@link TlsClientConnection} is not a {@link SocketConnection}, this
     * actually wraps the resulting {@link TlsClientConnection} in a
     * {@link TcpWrapperConnection} when returning it. You can use
     * g_tcp_wrapper_connection_get_base_io_stream() on the return value
     * to extract the {@link TlsClientConnection}.
     * <p>
     * If you need to modify the behavior of the TLS handshake (eg, by
     * setting a client-side certificate to use, or connecting to the
     * {@link TlsConnection}::accept-certificate signal), you can connect to
     * {@code client}'s {@link SocketClient}::event signal and wait for it to be
     * emitted with {@link SocketClientEvent#TLS_HANDSHAKING}, which will give you
     * a chance to see the {@link TlsClientConnection} before the handshake
     * starts.
     * @param tls whether to use TLS
     */
    public void setTls(boolean tls) {
        try {
            DowncallHandles.g_socket_client_set_tls.invokeExact(
                    handle(),
                    tls ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the TLS validation flags used when creating TLS connections
     * via {@code client}. The default value is {@link TlsCertificateFlags#VALIDATE_ALL}.
     * <p>
     * This function does not work as originally designed and is impossible
     * to use correctly. See {@link SocketClient}:tls-validation-flags for more
     * information.
     * @param flags the validation flags
     * @deprecated Do not attempt to ignore validation errors.
     */
    @Deprecated
    public void setTlsValidationFlags(@NotNull org.gtk.gio.TlsCertificateFlags flags) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_socket_client_set_tls_validation_flags.invokeExact(
                    handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Event {
        void signalReceived(SocketClient source, @NotNull org.gtk.gio.SocketClientEvent event, @NotNull org.gtk.gio.SocketConnectable connectable, @Nullable org.gtk.gio.IOStream connection);
    }
    
    /**
     * Emitted when {@code client}'s activity on {@code connectable} changes state.
     * Among other things, this can be used to provide progress
     * information about a network connection in the UI. The meanings of
     * the different {@code event} values are as follows:
     * <ul>
     * <li>{@link SocketClientEvent#RESOLVING}: {@code client} is about to look up {@code connectable}
     *   in DNS. {@code connection} will be {@code null}.
     * </ul>
     * <ul>
     * <li>{@link SocketClientEvent#RESOLVED}:  {@code client} has successfully resolved
     *   {@code connectable} in DNS. {@code connection} will be {@code null}.
     * </ul>
     * <ul>
     * <li>{@link SocketClientEvent#CONNECTING}: {@code client} is about to make a connection
     *   to a remote host; either a proxy server or the destination server
     *   itself. {@code connection} is the {@link SocketConnection}, which is not yet
     *   connected.  Since GLib 2.40, you can access the remote
     *   address via g_socket_connection_get_remote_address().
     * </ul>
     * <ul>
     * <li>{@link SocketClientEvent#CONNECTED}: {@code client} has successfully connected
     *   to a remote host. {@code connection} is the connected {@link SocketConnection}.
     * </ul>
     * <ul>
     * <li>{@link SocketClientEvent#PROXY_NEGOTIATING}: {@code client} is about to negotiate
     *   with a proxy to get it to connect to {@code connectable}. {@code connection} is
     *   the {@link SocketConnection} to the proxy server.
     * </ul>
     * <ul>
     * <li>{@link SocketClientEvent#PROXY_NEGOTIATED}: {@code client} has negotiated a
     *   connection to {@code connectable} through a proxy server. {@code connection} is
     *   the stream returned from g_proxy_connect(), which may or may not
     *   be a {@link SocketConnection}.
     * </ul>
     * <ul>
     * <li>{@link SocketClientEvent#TLS_HANDSHAKING}: {@code client} is about to begin a TLS
     *   handshake. {@code connection} is a {@link TlsClientConnection}.
     * </ul>
     * <ul>
     * <li>{@link SocketClientEvent#TLS_HANDSHAKED}: {@code client} has successfully completed
     *   the TLS handshake. {@code connection} is a {@link TlsClientConnection}.
     * </ul>
     * <ul>
     * <li>{@link SocketClientEvent#COMPLETE}: {@code client} has either successfully connected
     *   to {@code connectable} (in which case {@code connection} is the {@link SocketConnection}
     *   that it will be returning to the caller) or has failed (in which
     *   case {@code connection} is {@code null} and the client is about to return an error).
     * </ul>
     * <p>
     * Each event except {@link SocketClientEvent#COMPLETE} may be emitted
     * multiple times (or not at all) for a given connectable (in
     * particular, if {@code client} ends up attempting to connect to more than
     * one address). However, if {@code client} emits the {@link SocketClient}::event
     * signal at all for a given connectable, then it will always emit
     * it with {@link SocketClientEvent#COMPLETE} when it is done.
     * <p>
     * Note that there may be additional {@link SocketClientEvent} values in
     * the future; unrecognized {@code event} values should be ignored.
     */
    public Signal<SocketClient.Event> onEvent(SocketClient.Event handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("event"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SocketClient.Callbacks.class, "signalSocketClientEvent",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<SocketClient.Event>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_socket_client_new = Interop.downcallHandle(
            "g_socket_client_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_client_add_application_proxy = Interop.downcallHandle(
            "g_socket_client_add_application_proxy",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_client_connect = Interop.downcallHandle(
            "g_socket_client_connect",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_client_connect_async = Interop.downcallHandle(
            "g_socket_client_connect_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_client_connect_finish = Interop.downcallHandle(
            "g_socket_client_connect_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_client_connect_to_host = Interop.downcallHandle(
            "g_socket_client_connect_to_host",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_SHORT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_client_connect_to_host_async = Interop.downcallHandle(
            "g_socket_client_connect_to_host_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_SHORT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_client_connect_to_host_finish = Interop.downcallHandle(
            "g_socket_client_connect_to_host_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_client_connect_to_service = Interop.downcallHandle(
            "g_socket_client_connect_to_service",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_client_connect_to_service_async = Interop.downcallHandle(
            "g_socket_client_connect_to_service_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_client_connect_to_service_finish = Interop.downcallHandle(
            "g_socket_client_connect_to_service_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_client_connect_to_uri = Interop.downcallHandle(
            "g_socket_client_connect_to_uri",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_SHORT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_client_connect_to_uri_async = Interop.downcallHandle(
            "g_socket_client_connect_to_uri_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_SHORT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_client_connect_to_uri_finish = Interop.downcallHandle(
            "g_socket_client_connect_to_uri_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_client_get_enable_proxy = Interop.downcallHandle(
            "g_socket_client_get_enable_proxy",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_client_get_family = Interop.downcallHandle(
            "g_socket_client_get_family",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_client_get_local_address = Interop.downcallHandle(
            "g_socket_client_get_local_address",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_client_get_protocol = Interop.downcallHandle(
            "g_socket_client_get_protocol",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_client_get_proxy_resolver = Interop.downcallHandle(
            "g_socket_client_get_proxy_resolver",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_client_get_socket_type = Interop.downcallHandle(
            "g_socket_client_get_socket_type",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_client_get_timeout = Interop.downcallHandle(
            "g_socket_client_get_timeout",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_client_get_tls = Interop.downcallHandle(
            "g_socket_client_get_tls",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_client_get_tls_validation_flags = Interop.downcallHandle(
            "g_socket_client_get_tls_validation_flags",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_client_set_enable_proxy = Interop.downcallHandle(
            "g_socket_client_set_enable_proxy",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_socket_client_set_family = Interop.downcallHandle(
            "g_socket_client_set_family",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_socket_client_set_local_address = Interop.downcallHandle(
            "g_socket_client_set_local_address",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_client_set_protocol = Interop.downcallHandle(
            "g_socket_client_set_protocol",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_socket_client_set_proxy_resolver = Interop.downcallHandle(
            "g_socket_client_set_proxy_resolver",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_client_set_socket_type = Interop.downcallHandle(
            "g_socket_client_set_socket_type",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_socket_client_set_timeout = Interop.downcallHandle(
            "g_socket_client_set_timeout",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_socket_client_set_tls = Interop.downcallHandle(
            "g_socket_client_set_tls",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_socket_client_set_tls_validation_flags = Interop.downcallHandle(
            "g_socket_client_set_tls_validation_flags",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
    
    private static class Callbacks {
        
        public static void signalSocketClientEvent(MemoryAddress source, int event, MemoryAddress connectable, MemoryAddress connection, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (SocketClient.Event) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new SocketClient(Refcounted.get(source)), new org.gtk.gio.SocketClientEvent(event), new org.gtk.gio.SocketConnectable.SocketConnectableImpl(Refcounted.get(connectable, false)), new org.gtk.gio.IOStream(Refcounted.get(connection, false)));
        }
    }
}
