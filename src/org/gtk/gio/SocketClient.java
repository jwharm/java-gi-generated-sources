package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GSocketClient is a lightweight high-level utility class for connecting to
 * a network host using a connection oriented socket type.
 * 
 * You create a #GSocketClient object, set any options you want, and then
 * call a sync or async connect operation, which returns a #GSocketConnection
 * subclass on success.
 * 
 * The type of the #GSocketConnection object returned depends on the type of
 * the underlying socket that is in use. For instance, for a TCP/IP connection
 * it will be a #GTcpConnection.
 * 
 * As #GSocketClient is a lightweight object, you don't need to cache it. You
 * can just create a new one any time you need one.
 */
public class SocketClient extends org.gtk.gobject.Object {

    public SocketClient(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to SocketClient */
    public static SocketClient castFrom(org.gtk.gobject.Object gobject) {
        return new SocketClient(gobject.getReference());
    }
    
    /**
     * Creates a new #GSocketClient with the default options.
     */
    public SocketClient() {
        super(References.get(gtk_h.g_socket_client_new(), true));
    }
    
    /**
     * Enable proxy protocols to be handled by the application. When the
     * indicated proxy protocol is returned by the #GProxyResolver,
     * #GSocketClient will consider this protocol as supported but will
     * not try to find a #GProxy instance to handle handshaking. The
     * application must check for this case by calling
     * g_socket_connection_get_remote_address() on the returned
     * #GSocketConnection, and seeing if it's a #GProxyAddress of the
     * appropriate type, to determine whether or not it needs to handle
     * the proxy handshaking itself.
     * 
     * This should be used for proxy protocols that are dialects of
     * another protocol such as HTTP proxy. It also allows cohabitation of
     * proxy protocols that are reused between protocols. A good example
     * is HTTP. It can be used to proxy HTTP, FTP and Gopher and can also
     * be use as generic socket proxy through the HTTP CONNECT method.
     * 
     * When the proxy is detected as being an application proxy, TLS handshake
     * will be skipped. This is required to let the application do the proxy
     * specific handshake.
     */
    public void addApplicationProxy(java.lang.String protocol) {
        gtk_h.g_socket_client_add_application_proxy(handle(), Interop.allocateNativeString(protocol).handle());
    }
    
    /**
     * Tries to resolve the @connectable and make a network connection to it.
     * 
     * Upon a successful connection, a new #GSocketConnection is constructed
     * and returned.  The caller owns this new object and must drop their
     * reference to it when finished with it.
     * 
     * The type of the #GSocketConnection object returned depends on the type of
     * the underlying socket that is used. For instance, for a TCP/IP connection
     * it will be a #GTcpConnection.
     * 
     * The socket created will be the same family as the address that the
     * @connectable resolves to, unless family is set with g_socket_client_set_family()
     * or indirectly via g_socket_client_set_local_address(). The socket type
     * defaults to %G_SOCKET_TYPE_STREAM but can be set with
     * g_socket_client_set_socket_type().
     * 
     * If a local address is specified with g_socket_client_set_local_address() the
     * socket will be bound to this address before connecting.
     */
    public SocketConnection connect(SocketConnectable connectable, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_client_connect(handle(), connectable.handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new SocketConnection(References.get(RESULT, true));
    }
    
    /**
     * Finishes an async connect operation. See g_socket_client_connect_async()
     */
    public SocketConnection connectFinish(AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_client_connect_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new SocketConnection(References.get(RESULT, true));
    }
    
    /**
     * This is a helper function for g_socket_client_connect().
     * 
     * Attempts to create a TCP connection to the named host.
     * 
     * @host_and_port may be in any of a number of recognized formats; an IPv6
     * address, an IPv4 address, or a domain name (in which case a DNS
     * lookup is performed).  Quoting with [] is supported for all address
     * types.  A port override may be specified in the usual way with a
     * colon.  Ports may be given as decimal numbers or symbolic names (in
     * which case an /etc/services lookup is performed).
     * 
     * If no port override is given in @host_and_port then @default_port will be
     * used as the port number to connect to.
     * 
     * In general, @host_and_port is expected to be provided by the user (allowing
     * them to give the hostname, and a port override if necessary) and
     * @default_port is expected to be provided by the application.
     * 
     * In the case that an IP address is given, a single connection
     * attempt is made.  In the case that a name is given, multiple
     * connection attempts may be made, in turn and according to the
     * number of address records in DNS, until a connection succeeds.
     * 
     * Upon a successful connection, a new #GSocketConnection is constructed
     * and returned.  The caller owns this new object and must drop their
     * reference to it when finished with it.
     * 
     * In the event of any failure (DNS error, service not found, no hosts
     * connectable) %NULL is returned and @error (if non-%NULL) is set
     * accordingly.
     */
    public SocketConnection connectToHost(java.lang.String hostAndPort, short defaultPort, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_client_connect_to_host(handle(), Interop.allocateNativeString(hostAndPort).handle(), defaultPort, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new SocketConnection(References.get(RESULT, true));
    }
    
    /**
     * Finishes an async connect operation. See g_socket_client_connect_to_host_async()
     */
    public SocketConnection connectToHostFinish(AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_client_connect_to_host_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new SocketConnection(References.get(RESULT, true));
    }
    
    /**
     * Attempts to create a TCP connection to a service.
     * 
     * This call looks up the SRV record for @service at @domain for the
     * "tcp" protocol.  It then attempts to connect, in turn, to each of
     * the hosts providing the service until either a connection succeeds
     * or there are no hosts remaining.
     * 
     * Upon a successful connection, a new #GSocketConnection is constructed
     * and returned.  The caller owns this new object and must drop their
     * reference to it when finished with it.
     * 
     * In the event of any failure (DNS error, service not found, no hosts
     * connectable) %NULL is returned and @error (if non-%NULL) is set
     * accordingly.
     */
    public SocketConnection connectToService(java.lang.String domain, java.lang.String service, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_client_connect_to_service(handle(), Interop.allocateNativeString(domain).handle(), Interop.allocateNativeString(service).handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new SocketConnection(References.get(RESULT, true));
    }
    
    /**
     * Finishes an async connect operation. See g_socket_client_connect_to_service_async()
     */
    public SocketConnection connectToServiceFinish(AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_client_connect_to_service_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new SocketConnection(References.get(RESULT, true));
    }
    
    /**
     * This is a helper function for g_socket_client_connect().
     * 
     * Attempts to create a TCP connection with a network URI.
     * 
     * @uri may be any valid URI containing an "authority" (hostname/port)
     * component. If a port is not specified in the URI, @default_port
     * will be used. TLS will be negotiated if #GSocketClient:tls is %TRUE.
     * (#GSocketClient does not know to automatically assume TLS for
     * certain URI schemes.)
     * 
     * Using this rather than g_socket_client_connect() or
     * g_socket_client_connect_to_host() allows #GSocketClient to
     * determine when to use application-specific proxy protocols.
     * 
     * Upon a successful connection, a new #GSocketConnection is constructed
     * and returned.  The caller owns this new object and must drop their
     * reference to it when finished with it.
     * 
     * In the event of any failure (DNS error, service not found, no hosts
     * connectable) %NULL is returned and @error (if non-%NULL) is set
     * accordingly.
     */
    public SocketConnection connectToUri(java.lang.String uri, short defaultPort, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_client_connect_to_uri(handle(), Interop.allocateNativeString(uri).handle(), defaultPort, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new SocketConnection(References.get(RESULT, true));
    }
    
    /**
     * Finishes an async connect operation. See g_socket_client_connect_to_uri_async()
     */
    public SocketConnection connectToUriFinish(AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_client_connect_to_uri_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new SocketConnection(References.get(RESULT, true));
    }
    
    /**
     * Gets the proxy enable state; see g_socket_client_set_enable_proxy()
     */
    public boolean getEnableProxy() {
        var RESULT = gtk_h.g_socket_client_get_enable_proxy(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the socket family of the socket client.
     * 
     * See g_socket_client_set_family() for details.
     */
    public SocketFamily getFamily() {
        var RESULT = gtk_h.g_socket_client_get_family(handle());
        return SocketFamily.fromValue(RESULT);
    }
    
    /**
     * Gets the local address of the socket client.
     * 
     * See g_socket_client_set_local_address() for details.
     */
    public SocketAddress getLocalAddress() {
        var RESULT = gtk_h.g_socket_client_get_local_address(handle());
        return new SocketAddress(References.get(RESULT, false));
    }
    
    /**
     * Gets the protocol name type of the socket client.
     * 
     * See g_socket_client_set_protocol() for details.
     */
    public SocketProtocol getProtocol() {
        var RESULT = gtk_h.g_socket_client_get_protocol(handle());
        return SocketProtocol.fromValue(RESULT);
    }
    
    /**
     * Gets the #GProxyResolver being used by @client. Normally, this will
     * be the resolver returned by g_proxy_resolver_get_default(), but you
     * can override it with g_socket_client_set_proxy_resolver().
     */
    public ProxyResolver getProxyResolver() {
        var RESULT = gtk_h.g_socket_client_get_proxy_resolver(handle());
        return new ProxyResolver.ProxyResolverImpl(References.get(RESULT, false));
    }
    
    /**
     * Gets the socket type of the socket client.
     * 
     * See g_socket_client_set_socket_type() for details.
     */
    public SocketType getSocketType() {
        var RESULT = gtk_h.g_socket_client_get_socket_type(handle());
        return SocketType.fromValue(RESULT);
    }
    
    /**
     * Gets the I/O timeout time for sockets created by @client.
     * 
     * See g_socket_client_set_timeout() for details.
     */
    public int getTimeout() {
        var RESULT = gtk_h.g_socket_client_get_timeout(handle());
        return RESULT;
    }
    
    /**
     * Gets whether @client creates TLS connections. See
     * g_socket_client_set_tls() for details.
     */
    public boolean getTls() {
        var RESULT = gtk_h.g_socket_client_get_tls(handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets whether or not @client attempts to make connections via a
     * proxy server. When enabled (the default), #GSocketClient will use a
     * #GProxyResolver to determine if a proxy protocol such as SOCKS is
     * needed, and automatically do the necessary proxy negotiation.
     * 
     * See also g_socket_client_set_proxy_resolver().
     */
    public void setEnableProxy(boolean enable) {
        gtk_h.g_socket_client_set_enable_proxy(handle(), enable ? 1 : 0);
    }
    
    /**
     * Sets the socket family of the socket client.
     * If this is set to something other than %G_SOCKET_FAMILY_INVALID
     * then the sockets created by this object will be of the specified
     * family.
     * 
     * This might be useful for instance if you want to force the local
     * connection to be an ipv4 socket, even though the address might
     * be an ipv6 mapped to ipv4 address.
     */
    public void setFamily(SocketFamily family) {
        gtk_h.g_socket_client_set_family(handle(), family.getValue());
    }
    
    /**
     * Sets the local address of the socket client.
     * The sockets created by this object will bound to the
     * specified address (if not %NULL) before connecting.
     * 
     * This is useful if you want to ensure that the local
     * side of the connection is on a specific port, or on
     * a specific interface.
     */
    public void setLocalAddress(SocketAddress address) {
        gtk_h.g_socket_client_set_local_address(handle(), address.handle());
    }
    
    /**
     * Sets the protocol of the socket client.
     * The sockets created by this object will use of the specified
     * protocol.
     * 
     * If @protocol is %G_SOCKET_PROTOCOL_DEFAULT that means to use the default
     * protocol for the socket family and type.
     */
    public void setProtocol(SocketProtocol protocol) {
        gtk_h.g_socket_client_set_protocol(handle(), protocol.getValue());
    }
    
    /**
     * Overrides the #GProxyResolver used by @client. You can call this if
     * you want to use specific proxies, rather than using the system
     * default proxy settings.
     * 
     * Note that whether or not the proxy resolver is actually used
     * depends on the setting of #GSocketClient:enable-proxy, which is not
     * changed by this function (but which is %TRUE by default)
     */
    public void setProxyResolver(ProxyResolver proxyResolver) {
        gtk_h.g_socket_client_set_proxy_resolver(handle(), proxyResolver.handle());
    }
    
    /**
     * Sets the socket type of the socket client.
     * The sockets created by this object will be of the specified
     * type.
     * 
     * It doesn't make sense to specify a type of %G_SOCKET_TYPE_DATAGRAM,
     * as GSocketClient is used for connection oriented services.
     */
    public void setSocketType(SocketType type) {
        gtk_h.g_socket_client_set_socket_type(handle(), type.getValue());
    }
    
    /**
     * Sets the I/O timeout for sockets created by @client. @timeout is a
     * time in seconds, or 0 for no timeout (the default).
     * 
     * The timeout value affects the initial connection attempt as well,
     * so setting this may cause calls to g_socket_client_connect(), etc,
     * to fail with %G_IO_ERROR_TIMED_OUT.
     */
    public void setTimeout(int timeout) {
        gtk_h.g_socket_client_set_timeout(handle(), timeout);
    }
    
    /**
     * Sets whether @client creates TLS (aka SSL) connections. If @tls is
     * %TRUE, @client will wrap its connections in a #GTlsClientConnection
     * and perform a TLS handshake when connecting.
     * 
     * Note that since #GSocketClient must return a #GSocketConnection,
     * but #GTlsClientConnection is not a #GSocketConnection, this
     * actually wraps the resulting #GTlsClientConnection in a
     * #GTcpWrapperConnection when returning it. You can use
     * g_tcp_wrapper_connection_get_base_io_stream() on the return value
     * to extract the #GTlsClientConnection.
     * 
     * If you need to modify the behavior of the TLS handshake (eg, by
     * setting a client-side certificate to use, or connecting to the
     * #GTlsConnection::accept-certificate signal), you can connect to
     * @client's #GSocketClient::event signal and wait for it to be
     * emitted with %G_SOCKET_CLIENT_TLS_HANDSHAKING, which will give you
     * a chance to see the #GTlsClientConnection before the handshake
     * starts.
     */
    public void setTls(boolean tls) {
        gtk_h.g_socket_client_set_tls(handle(), tls ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface EventHandler {
        void signalReceived(SocketClient source, SocketClientEvent event, SocketConnectable connectable, IOStream connection);
    }
    
    /**
     * Emitted when @client's activity on @connectable changes state.
     * Among other things, this can be used to provide progress
     * information about a network connection in the UI. The meanings of
     * the different @event values are as follows:
     * 
     * - %G_SOCKET_CLIENT_RESOLVING: @client is about to look up @connectable
     *   in DNS. @connection will be %NULL.
     * 
     * - %G_SOCKET_CLIENT_RESOLVED:  @client has successfully resolved
     *   @connectable in DNS. @connection will be %NULL.
     * 
     * - %G_SOCKET_CLIENT_CONNECTING: @client is about to make a connection
     *   to a remote host; either a proxy server or the destination server
     *   itself. @connection is the #GSocketConnection, which is not yet
     *   connected.  Since GLib 2.40, you can access the remote
     *   address via g_socket_connection_get_remote_address().
     * 
     * - %G_SOCKET_CLIENT_CONNECTED: @client has successfully connected
     *   to a remote host. @connection is the connected #GSocketConnection.
     * 
     * - %G_SOCKET_CLIENT_PROXY_NEGOTIATING: @client is about to negotiate
     *   with a proxy to get it to connect to @connectable. @connection is
     *   the #GSocketConnection to the proxy server.
     * 
     * - %G_SOCKET_CLIENT_PROXY_NEGOTIATED: @client has negotiated a
     *   connection to @connectable through a proxy server. @connection is
     *   the stream returned from g_proxy_connect(), which may or may not
     *   be a #GSocketConnection.
     * 
     * - %G_SOCKET_CLIENT_TLS_HANDSHAKING: @client is about to begin a TLS
     *   handshake. @connection is a #GTlsClientConnection.
     * 
     * - %G_SOCKET_CLIENT_TLS_HANDSHAKED: @client has successfully completed
     *   the TLS handshake. @connection is a #GTlsClientConnection.
     * 
     * - %G_SOCKET_CLIENT_COMPLETE: @client has either successfully connected
     *   to @connectable (in which case @connection is the #GSocketConnection
     *   that it will be returning to the caller) or has failed (in which
     *   case @connection is %NULL and the client is about to return an error).
     * 
     * Each event except %G_SOCKET_CLIENT_COMPLETE may be emitted
     * multiple times (or not at all) for a given connectable (in
     * particular, if @client ends up attempting to connect to more than
     * one address). However, if @client emits the #GSocketClient::event
     * signal at all for a given connectable, then it will always emit
     * it with %G_SOCKET_CLIENT_COMPLETE when it is done.
     * 
     * Note that there may be additional #GSocketClientEvent values in
     * the future; unrecognized @event values should be ignored.
     */
    public void onEvent(EventHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSocketClientEvent", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("event").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
