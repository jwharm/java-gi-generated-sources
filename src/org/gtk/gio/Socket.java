package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GSocket is a low-level networking primitive. It is a more or less
 * direct mapping of the BSD socket API in a portable GObject based API.
 * It supports both the UNIX socket implementations and winsock2 on Windows.
 * 
 * #GSocket is the platform independent base upon which the higher level
 * network primitives are based. Applications are not typically meant to
 * use it directly, but rather through classes like #GSocketClient,
 * #GSocketService and #GSocketConnection. However there may be cases where
 * direct use of #GSocket is useful.
 * 
 * #GSocket implements the #GInitable interface, so if it is manually constructed
 * by e.g. g_object_new() you must call g_initable_init() and check the
 * results before using the object. This is done automatically in
 * g_socket_new() and g_socket_new_from_fd(), so these functions can return
 * %NULL.
 * 
 * Sockets operate in two general modes, blocking or non-blocking. When
 * in blocking mode all operations (which don’t take an explicit blocking
 * parameter) block until the requested operation
 * is finished or there is an error. In non-blocking mode all calls that
 * would block return immediately with a %G_IO_ERROR_WOULD_BLOCK error.
 * To know when a call would successfully run you can call g_socket_condition_check(),
 * or g_socket_condition_wait(). You can also use g_socket_create_source() and
 * attach it to a #GMainContext to get callbacks when I/O is possible.
 * Note that all sockets are always set to non blocking mode in the system, and
 * blocking mode is emulated in GSocket.
 * 
 * When working in non-blocking mode applications should always be able to
 * handle getting a %G_IO_ERROR_WOULD_BLOCK error even when some other
 * function said that I/O was possible. This can easily happen in case
 * of a race condition in the application, but it can also happen for other
 * reasons. For instance, on Windows a socket is always seen as writable
 * until a write returns %G_IO_ERROR_WOULD_BLOCK.
 * 
 * #GSockets can be either connection oriented or datagram based.
 * For connection oriented types you must first establish a connection by
 * either connecting to an address or accepting a connection from another
 * address. For connectionless socket types the target/source address is
 * specified or received in each I/O operation.
 * 
 * All socket file descriptors are set to be close-on-exec.
 * 
 * Note that creating a #GSocket causes the signal %SIGPIPE to be
 * ignored for the remainder of the program. If you are writing a
 * command-line utility that uses #GSocket, you may need to take into
 * account the fact that your program will not automatically be killed
 * if it tries to write to %stdout after it has been closed.
 * 
 * Like most other APIs in GLib, #GSocket is not inherently thread safe. To use
 * a #GSocket concurrently from multiple threads, you must implement your own
 * locking.
 */
public class Socket extends org.gtk.gobject.Object implements DatagramBased, Initable {

    public Socket(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to Socket */
    public static Socket castFrom(org.gtk.gobject.Object gobject) {
        return new Socket(gobject.getProxy());
    }
    
    /**
     * Accept incoming connections on a connection-based socket. This removes
     * the first outstanding connection request from the listening socket and
     * creates a #GSocket object for it.
     * 
     * The @socket must be bound to a local address with g_socket_bind() and
     * must be listening for incoming connections (g_socket_listen()).
     * 
     * If there are no outstanding connections then the operation will block
     * or return %G_IO_ERROR_WOULD_BLOCK if non-blocking I/O is enabled.
     * To be notified of an incoming connection, wait for the %G_IO_IN condition.
     */
    public Socket accept(Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_accept(HANDLE(), cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new Socket(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * When a socket is created it is attached to an address family, but it
     * doesn't have an address in this family. g_socket_bind() assigns the
     * address (sometimes called name) of the socket.
     * 
     * It is generally required to bind to a local address before you can
     * receive connections. (See g_socket_listen() and g_socket_accept() ).
     * In certain situations, you may also want to bind a socket that will be
     * used to initiate connections, though this is not normally required.
     * 
     * If @socket is a TCP socket, then @allow_reuse controls the setting
     * of the `SO_REUSEADDR` socket option; normally it should be %TRUE for
     * server sockets (sockets that you will eventually call
     * g_socket_accept() on), and %FALSE for client sockets. (Failing to
     * set this flag on a server socket may cause g_socket_bind() to return
     * %G_IO_ERROR_ADDRESS_IN_USE if the server program is stopped and then
     * immediately restarted.)
     * 
     * If @socket is a UDP socket, then @allow_reuse determines whether or
     * not other UDP sockets can be bound to the same address at the same
     * time. In particular, you can have several UDP sockets bound to the
     * same address, and they will all receive all of the multicast and
     * broadcast packets sent to that address. (The behavior of unicast
     * UDP packets to an address with multiple listeners is not defined.)
     */
    public boolean bind(SocketAddress address, boolean allowReuse) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_bind(HANDLE(), address.HANDLE(), allowReuse ? 1 : 0, GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Checks and resets the pending connect error for the socket.
     * This is used to check for errors when g_socket_connect() is
     * used in non-blocking mode.
     */
    public boolean checkConnectResult() throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_check_connect_result(HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Closes the socket, shutting down any active connection.
     * 
     * Closing a socket does not wait for all outstanding I/O operations
     * to finish, so the caller should not rely on them to be guaranteed
     * to complete even if the close returns with no error.
     * 
     * Once the socket is closed, all other operations will return
     * %G_IO_ERROR_CLOSED. Closing a socket multiple times will not
     * return an error.
     * 
     * Sockets will be automatically closed when the last reference
     * is dropped, but you might want to call this function to make sure
     * resources are released as early as possible.
     * 
     * Beware that due to the way that TCP works, it is possible for
     * recently-sent data to be lost if either you close a socket while the
     * %G_IO_IN condition is set, or else if the remote connection tries to
     * send something to you after you close the socket but before it has
     * finished reading all of the data you sent. There is no easy generic
     * way to avoid this problem; the easiest fix is to design the network
     * protocol such that the client will never send data "out of turn".
     * Another solution is for the server to half-close the connection by
     * calling g_socket_shutdown() with only the @shutdown_write flag set,
     * and then wait for the client to notice this and close its side of the
     * connection, after which the server can safely call g_socket_close().
     * (This is what #GTcpConnection does if you call
     * g_tcp_connection_set_graceful_disconnect(). But of course, this
     * only works if the client will close its connection after the server
     * does.)
     */
    public boolean close() throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_close(HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Checks on the readiness of @socket to perform operations.
     * The operations specified in @condition are checked for and masked
     * against the currently-satisfied conditions on @socket. The result
     * is returned.
     * 
     * Note that on Windows, it is possible for an operation to return
     * %G_IO_ERROR_WOULD_BLOCK even immediately after
     * g_socket_condition_check() has claimed that the socket is ready for
     * writing. Rather than calling g_socket_condition_check() and then
     * writing to the socket if it succeeds, it is generally better to
     * simply try writing to the socket right away, and try again later if
     * the initial attempt returns %G_IO_ERROR_WOULD_BLOCK.
     * 
     * It is meaningless to specify %G_IO_ERR or %G_IO_HUP in condition;
     * these conditions will always be set in the output if they are true.
     * 
     * This call never blocks.
     */
    public int conditionCheck(int condition) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_condition_check(HANDLE(), condition);
        return RESULT;
    }
    
    /**
     * Waits for up to @timeout_us microseconds for @condition to become true
     * on @socket. If the condition is met, %TRUE is returned.
     * 
     * If @cancellable is cancelled before the condition is met, or if
     * @timeout_us (or the socket's #GSocket:timeout) is reached before the
     * condition is met, then %FALSE is returned and @error, if non-%NULL,
     * is set to the appropriate value (%G_IO_ERROR_CANCELLED or
     * %G_IO_ERROR_TIMED_OUT).
     * 
     * If you don't want a timeout, use g_socket_condition_wait().
     * (Alternatively, you can pass -1 for @timeout_us.)
     * 
     * Note that although @timeout_us is in microseconds for consistency with
     * other GLib APIs, this function actually only has millisecond
     * resolution, and the behavior is undefined if @timeout_us is not an
     * exact number of milliseconds.
     */
    public boolean conditionTimedWait(int condition, long timeoutUs, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_condition_timed_wait(HANDLE(), condition, timeoutUs, cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Waits for @condition to become true on @socket. When the condition
     * is met, %TRUE is returned.
     * 
     * If @cancellable is cancelled before the condition is met, or if the
     * socket has a timeout set and it is reached before the condition is
     * met, then %FALSE is returned and @error, if non-%NULL, is set to
     * the appropriate value (%G_IO_ERROR_CANCELLED or
     * %G_IO_ERROR_TIMED_OUT).
     * 
     * See also g_socket_condition_timed_wait().
     */
    public boolean conditionWait(int condition, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_condition_wait(HANDLE(), condition, cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Connect the socket to the specified remote address.
     * 
     * For connection oriented socket this generally means we attempt to make
     * a connection to the @address. For a connection-less socket it sets
     * the default address for g_socket_send() and discards all incoming datagrams
     * from other sources.
     * 
     * Generally connection oriented sockets can only connect once, but
     * connection-less sockets can connect multiple times to change the
     * default address.
     * 
     * If the connect call needs to do network I/O it will block, unless
     * non-blocking I/O is enabled. Then %G_IO_ERROR_PENDING is returned
     * and the user can be notified of the connection finishing by waiting
     * for the G_IO_OUT condition. The result of the connection must then be
     * checked with g_socket_check_connect_result().
     */
    public boolean connect(SocketAddress address, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_connect(HANDLE(), address.HANDLE(), cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Creates a #GSocketConnection subclass of the right type for
     * @socket.
     */
    public SocketConnection connectionFactoryCreateConnection() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_connection_factory_create_connection(HANDLE());
        return new SocketConnection(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Creates a #GSource that can be attached to a %GMainContext to monitor
     * for the availability of the specified @condition on the socket. The #GSource
     * keeps a reference to the @socket.
     * 
     * The callback on the source is of the #GSocketSourceFunc type.
     * 
     * It is meaningless to specify %G_IO_ERR or %G_IO_HUP in @condition;
     * these conditions will always be reported output if they are true.
     * 
     * @cancellable if not %NULL can be used to cancel the source, which will
     * cause the source to trigger, reporting the current condition (which
     * is likely 0 unless cancellation happened at the same time as a
     * condition change). You can check for this in the callback using
     * g_cancellable_is_cancelled().
     * 
     * If @socket has a timeout set, and it is reached before @condition
     * occurs, the source will then trigger anyway, reporting %G_IO_IN or
     * %G_IO_OUT depending on @condition. However, @socket will have been
     * marked as having had a timeout, and so the next #GSocket I/O method
     * you call will then fail with a %G_IO_ERROR_TIMED_OUT.
     */
    public org.gtk.glib.Source createSource(int condition, Cancellable cancellable) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_create_source(HANDLE(), condition, cancellable.HANDLE());
        return new org.gtk.glib.Source(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Get the amount of data pending in the OS input buffer, without blocking.
     * 
     * If @socket is a UDP or SCTP socket, this will return the size of
     * just the next packet, even if additional packets are buffered after
     * that one.
     * 
     * Note that on Windows, this function is rather inefficient in the
     * UDP case, and so if you know any plausible upper bound on the size
     * of the incoming packet, it is better to just do a
     * g_socket_receive() with a buffer of that size, rather than calling
     * g_socket_get_available_bytes() first and then doing a receive of
     * exactly the right size.
     */
    public long getAvailableBytes() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_get_available_bytes(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the blocking mode of the socket. For details on blocking I/O,
     * see g_socket_set_blocking().
     */
    public boolean getBlocking() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_get_blocking(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the broadcast setting on @socket; if %TRUE,
     * it is possible to send packets to broadcast
     * addresses.
     */
    public boolean getBroadcast() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_get_broadcast(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns the credentials of the foreign process connected to this
     * socket, if any (e.g. it is only supported for %G_SOCKET_FAMILY_UNIX
     * sockets).
     * 
     * If this operation isn't supported on the OS, the method fails with
     * the %G_IO_ERROR_NOT_SUPPORTED error. On Linux this is implemented
     * by reading the %SO_PEERCRED option on the underlying socket.
     * 
     * This method can be expected to be available on the following platforms:
     * 
     * - Linux since GLib 2.26
     * - OpenBSD since GLib 2.30
     * - Solaris, Illumos and OpenSolaris since GLib 2.40
     * - NetBSD since GLib 2.42
     * - macOS, tvOS, iOS since GLib 2.66
     * 
     * Other ways to obtain credentials from a foreign peer includes the
     * #GUnixCredentialsMessage type and
     * g_unix_connection_send_credentials() /
     * g_unix_connection_receive_credentials() functions.
     */
    public Credentials getCredentials() throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_get_credentials(HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new Credentials(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Gets the socket family of the socket.
     */
    public SocketFamily getFamily() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_get_family(HANDLE());
        return SocketFamily.fromValue(RESULT);
    }
    
    /**
     * Returns the underlying OS socket object. On unix this
     * is a socket file descriptor, and on Windows this is
     * a Winsock2 SOCKET handle. This may be useful for
     * doing platform specific or otherwise unusual operations
     * on the socket.
     */
    public int getFd() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_get_fd(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the keepalive mode of the socket. For details on this,
     * see g_socket_set_keepalive().
     */
    public boolean getKeepalive() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_get_keepalive(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the listen backlog setting of the socket. For details on this,
     * see g_socket_set_listen_backlog().
     */
    public int getListenBacklog() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_get_listen_backlog(HANDLE());
        return RESULT;
    }
    
    /**
     * Try to get the local address of a bound socket. This is only
     * useful if the socket has been bound to a local address,
     * either explicitly or implicitly when connecting.
     */
    public SocketAddress getLocalAddress() throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_get_local_address(HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new SocketAddress(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Gets the multicast loopback setting on @socket; if %TRUE (the
     * default), outgoing multicast packets will be looped back to
     * multicast listeners on the same host.
     */
    public boolean getMulticastLoopback() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_get_multicast_loopback(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the multicast time-to-live setting on @socket; see
     * g_socket_set_multicast_ttl() for more details.
     */
    public int getMulticastTtl() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_get_multicast_ttl(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the socket protocol id the socket was created with.
     * In case the protocol is unknown, -1 is returned.
     */
    public SocketProtocol getProtocol() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_get_protocol(HANDLE());
        return SocketProtocol.fromValue(RESULT);
    }
    
    /**
     * Try to get the remote address of a connected socket. This is only
     * useful for connection oriented sockets that have been connected.
     */
    public SocketAddress getRemoteAddress() throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_get_remote_address(HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new SocketAddress(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Gets the socket type of the socket.
     */
    public SocketType getSocketType() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_get_socket_type(HANDLE());
        return SocketType.fromValue(RESULT);
    }
    
    /**
     * Gets the timeout setting of the socket. For details on this, see
     * g_socket_set_timeout().
     */
    public int getTimeout() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_get_timeout(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the unicast time-to-live setting on @socket; see
     * g_socket_set_ttl() for more details.
     */
    public int getTtl() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_get_ttl(HANDLE());
        return RESULT;
    }
    
    /**
     * Checks whether a socket is closed.
     */
    public boolean isClosed() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_is_closed(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Check whether the socket is connected. This is only useful for
     * connection-oriented sockets.
     * 
     * If using g_socket_shutdown(), this function will return %TRUE until the
     * socket has been shut down for reading and writing. If you do a non-blocking
     * connect, this function will not return %TRUE until after you call
     * g_socket_check_connect_result().
     */
    public boolean isConnected() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_is_connected(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Registers @socket to receive multicast messages sent to @group.
     * @socket must be a %G_SOCKET_TYPE_DATAGRAM socket, and must have
     * been bound to an appropriate interface and port with
     * g_socket_bind().
     * 
     * If @iface is %NULL, the system will automatically pick an interface
     * to bind to based on @group.
     * 
     * If @source_specific is %TRUE, source-specific multicast as defined
     * in RFC 4604 is used. Note that on older platforms this may fail
     * with a %G_IO_ERROR_NOT_SUPPORTED error.
     * 
     * To bind to a given source-specific multicast address, use
     * g_socket_join_multicast_group_ssm() instead.
     */
    public boolean joinMulticastGroup(InetAddress group, boolean sourceSpecific, java.lang.String iface) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_join_multicast_group(HANDLE(), group.HANDLE(), sourceSpecific ? 1 : 0, Interop.getAllocator().allocateUtf8String(iface), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Registers @socket to receive multicast messages sent to @group.
     * @socket must be a %G_SOCKET_TYPE_DATAGRAM socket, and must have
     * been bound to an appropriate interface and port with
     * g_socket_bind().
     * 
     * If @iface is %NULL, the system will automatically pick an interface
     * to bind to based on @group.
     * 
     * If @source_specific is not %NULL, use source-specific multicast as
     * defined in RFC 4604. Note that on older platforms this may fail
     * with a %G_IO_ERROR_NOT_SUPPORTED error.
     * 
     * Note that this function can be called multiple times for the same
     * @group with different @source_specific in order to receive multicast
     * packets from more than one source.
     */
    public boolean joinMulticastGroupSsm(InetAddress group, InetAddress sourceSpecific, java.lang.String iface) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_join_multicast_group_ssm(HANDLE(), group.HANDLE(), sourceSpecific.HANDLE(), Interop.getAllocator().allocateUtf8String(iface), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Removes @socket from the multicast group defined by @group, @iface,
     * and @source_specific (which must all have the same values they had
     * when you joined the group).
     * 
     * @socket remains bound to its address and port, and can still receive
     * unicast messages after calling this.
     * 
     * To unbind to a given source-specific multicast address, use
     * g_socket_leave_multicast_group_ssm() instead.
     */
    public boolean leaveMulticastGroup(InetAddress group, boolean sourceSpecific, java.lang.String iface) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_leave_multicast_group(HANDLE(), group.HANDLE(), sourceSpecific ? 1 : 0, Interop.getAllocator().allocateUtf8String(iface), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Removes @socket from the multicast group defined by @group, @iface,
     * and @source_specific (which must all have the same values they had
     * when you joined the group).
     * 
     * @socket remains bound to its address and port, and can still receive
     * unicast messages after calling this.
     */
    public boolean leaveMulticastGroupSsm(InetAddress group, InetAddress sourceSpecific, java.lang.String iface) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_leave_multicast_group_ssm(HANDLE(), group.HANDLE(), sourceSpecific.HANDLE(), Interop.getAllocator().allocateUtf8String(iface), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Marks the socket as a server socket, i.e. a socket that is used
     * to accept incoming requests using g_socket_accept().
     * 
     * Before calling this the socket must be bound to a local address using
     * g_socket_bind().
     * 
     * To set the maximum amount of outstanding clients, use
     * g_socket_set_listen_backlog().
     */
    public boolean listen() throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_listen(HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Receive data (up to @size bytes) from a socket. This is mainly used by
     * connection-oriented sockets; it is identical to g_socket_receive_from()
     * with @address set to %NULL.
     * 
     * For %G_SOCKET_TYPE_DATAGRAM and %G_SOCKET_TYPE_SEQPACKET sockets,
     * g_socket_receive() will always read either 0 or 1 complete messages from
     * the socket. If the received message is too large to fit in @buffer, then
     * the data beyond @size bytes will be discarded, without any explicit
     * indication that this has occurred.
     * 
     * For %G_SOCKET_TYPE_STREAM sockets, g_socket_receive() can return any
     * number of bytes, up to @size. If more than @size bytes have been
     * received, the additional data will be returned in future calls to
     * g_socket_receive().
     * 
     * If the socket is in blocking mode the call will block until there
     * is some data to receive, the connection is closed, or there is an
     * error. If there is no data available and the socket is in
     * non-blocking mode, a %G_IO_ERROR_WOULD_BLOCK error will be
     * returned. To be notified when data is available, wait for the
     * %G_IO_IN condition.
     * 
     * On error -1 is returned and @error is set accordingly.
     */
    public long receive(byte[] buffer, long size, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_receive(HANDLE(), Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, buffer), size, cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Receive data (up to @size bytes) from a socket.
     * 
     * If @address is non-%NULL then @address will be set equal to the
     * source address of the received packet.
     * @address is owned by the caller.
     * 
     * See g_socket_receive() for additional information.
     */
    public long receiveFrom(SocketAddress[] address, byte[] buffer, long size, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_receive_from(HANDLE(), Interop.allocateNativeArray(address), Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, buffer), size, cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Receive multiple data messages from @socket in one go.  This is the most
     * complicated and fully-featured version of this call. For easier use, see
     * g_socket_receive(), g_socket_receive_from(), and g_socket_receive_message().
     * 
     * @messages must point to an array of #GInputMessage structs and
     * @num_messages must be the length of this array. Each #GInputMessage
     * contains a pointer to an array of #GInputVector structs describing the
     * buffers that the data received in each message will be written to. Using
     * multiple #GInputVectors is more memory-efficient than manually copying data
     * out of a single buffer to multiple sources, and more system-call-efficient
     * than making multiple calls to g_socket_receive(), such as in scenarios where
     * a lot of data packets need to be received (e.g. high-bandwidth video
     * streaming over RTP/UDP).
     * 
     * @flags modify how all messages are received. The commonly available
     * arguments for this are available in the #GSocketMsgFlags enum, but the
     * values there are the same as the system values, and the flags
     * are passed in as-is, so you can pass in system-specific flags too. These
     * flags affect the overall receive operation. Flags affecting individual
     * messages are returned in #GInputMessage.flags.
     * 
     * The other members of #GInputMessage are treated as described in its
     * documentation.
     * 
     * If #GSocket:blocking is %TRUE the call will block until @num_messages have
     * been received, or the end of the stream is reached.
     * 
     * If #GSocket:blocking is %FALSE the call will return up to @num_messages
     * without blocking, or %G_IO_ERROR_WOULD_BLOCK if no messages are queued in the
     * operating system to be received.
     * 
     * In blocking mode, if #GSocket:timeout is positive and is reached before any
     * messages are received, %G_IO_ERROR_TIMED_OUT is returned, otherwise up to
     * @num_messages are returned. (Note: This is effectively the
     * behaviour of `MSG_WAITFORONE` with recvmmsg().)
     * 
     * To be notified when messages are available, wait for the
     * %G_IO_IN condition. Note though that you may still receive
     * %G_IO_ERROR_WOULD_BLOCK from g_socket_receive_messages() even if you were
     * previously notified of a %G_IO_IN condition.
     * 
     * If the remote peer closes the connection, any messages queued in the
     * operating system will be returned, and subsequent calls to
     * g_socket_receive_messages() will return 0 (with no error set).
     * 
     * On error -1 is returned and @error is set accordingly. An error will only
     * be returned if zero messages could be received; otherwise the number of
     * messages successfully received before the error will be returned.
     */
    public int receiveMessages(InputMessage[] messages, int numMessages, int flags, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_receive_messages(HANDLE(), Interop.allocateNativeArray(messages), numMessages, flags, cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * This behaves exactly the same as g_socket_receive(), except that
     * the choice of blocking or non-blocking behavior is determined by
     * the @blocking argument rather than by @socket's properties.
     */
    public long receiveWithBlocking(byte[] buffer, long size, boolean blocking, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_receive_with_blocking(HANDLE(), Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, buffer), size, blocking ? 1 : 0, cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Tries to send @size bytes from @buffer on the socket. This is
     * mainly used by connection-oriented sockets; it is identical to
     * g_socket_send_to() with @address set to %NULL.
     * 
     * If the socket is in blocking mode the call will block until there is
     * space for the data in the socket queue. If there is no space available
     * and the socket is in non-blocking mode a %G_IO_ERROR_WOULD_BLOCK error
     * will be returned. To be notified when space is available, wait for the
     * %G_IO_OUT condition. Note though that you may still receive
     * %G_IO_ERROR_WOULD_BLOCK from g_socket_send() even if you were previously
     * notified of a %G_IO_OUT condition. (On Windows in particular, this is
     * very common due to the way the underlying APIs work.)
     * 
     * On error -1 is returned and @error is set accordingly.
     */
    public long send(byte[] buffer, long size, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_send(HANDLE(), Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, buffer), size, cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Send data to @address on @socket.  For sending multiple messages see
     * g_socket_send_messages(); for easier use, see
     * g_socket_send() and g_socket_send_to().
     * 
     * If @address is %NULL then the message is sent to the default receiver
     * (set by g_socket_connect()).
     * 
     * @vectors must point to an array of #GOutputVector structs and
     * @num_vectors must be the length of this array. (If @num_vectors is -1,
     * then @vectors is assumed to be terminated by a #GOutputVector with a
     * %NULL buffer pointer.) The #GOutputVector structs describe the buffers
     * that the sent data will be gathered from. Using multiple
     * #GOutputVectors is more memory-efficient than manually copying
     * data from multiple sources into a single buffer, and more
     * network-efficient than making multiple calls to g_socket_send().
     * 
     * @messages, if non-%NULL, is taken to point to an array of @num_messages
     * #GSocketControlMessage instances. These correspond to the control
     * messages to be sent on the socket.
     * If @num_messages is -1 then @messages is treated as a %NULL-terminated
     * array.
     * 
     * @flags modify how the message is sent. The commonly available arguments
     * for this are available in the #GSocketMsgFlags enum, but the
     * values there are the same as the system values, and the flags
     * are passed in as-is, so you can pass in system-specific flags too.
     * 
     * If the socket is in blocking mode the call will block until there is
     * space for the data in the socket queue. If there is no space available
     * and the socket is in non-blocking mode a %G_IO_ERROR_WOULD_BLOCK error
     * will be returned. To be notified when space is available, wait for the
     * %G_IO_OUT condition. Note though that you may still receive
     * %G_IO_ERROR_WOULD_BLOCK from g_socket_send() even if you were previously
     * notified of a %G_IO_OUT condition. (On Windows in particular, this is
     * very common due to the way the underlying APIs work.)
     * 
     * The sum of the sizes of each #GOutputVector in vectors must not be
     * greater than %G_MAXSSIZE. If the message can be larger than this,
     * then it is mandatory to use the g_socket_send_message_with_timeout()
     * function.
     * 
     * On error -1 is returned and @error is set accordingly.
     */
    public long sendMessage(SocketAddress address, OutputVector[] vectors, int numVectors, SocketControlMessage[] messages, int numMessages, int flags, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_send_message(HANDLE(), address.HANDLE(), Interop.allocateNativeArray(vectors), numVectors, Interop.allocateNativeArray(messages), numMessages, flags, cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Send multiple data messages from @socket in one go.  This is the most
     * complicated and fully-featured version of this call. For easier use, see
     * g_socket_send(), g_socket_send_to(), and g_socket_send_message().
     * 
     * @messages must point to an array of #GOutputMessage structs and
     * @num_messages must be the length of this array. Each #GOutputMessage
     * contains an address to send the data to, and a pointer to an array of
     * #GOutputVector structs to describe the buffers that the data to be sent
     * for each message will be gathered from. Using multiple #GOutputVectors is
     * more memory-efficient than manually copying data from multiple sources
     * into a single buffer, and more network-efficient than making multiple
     * calls to g_socket_send(). Sending multiple messages in one go avoids the
     * overhead of making a lot of syscalls in scenarios where a lot of data
     * packets need to be sent (e.g. high-bandwidth video streaming over RTP/UDP),
     * or where the same data needs to be sent to multiple recipients.
     * 
     * @flags modify how the message is sent. The commonly available arguments
     * for this are available in the #GSocketMsgFlags enum, but the
     * values there are the same as the system values, and the flags
     * are passed in as-is, so you can pass in system-specific flags too.
     * 
     * If the socket is in blocking mode the call will block until there is
     * space for all the data in the socket queue. If there is no space available
     * and the socket is in non-blocking mode a %G_IO_ERROR_WOULD_BLOCK error
     * will be returned if no data was written at all, otherwise the number of
     * messages sent will be returned. To be notified when space is available,
     * wait for the %G_IO_OUT condition. Note though that you may still receive
     * %G_IO_ERROR_WOULD_BLOCK from g_socket_send() even if you were previously
     * notified of a %G_IO_OUT condition. (On Windows in particular, this is
     * very common due to the way the underlying APIs work.)
     * 
     * On error -1 is returned and @error is set accordingly. An error will only
     * be returned if zero messages could be sent; otherwise the number of messages
     * successfully sent before the error will be returned.
     */
    public int sendMessages(OutputMessage[] messages, int numMessages, int flags, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_send_messages(HANDLE(), Interop.allocateNativeArray(messages), numMessages, flags, cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Tries to send @size bytes from @buffer to @address. If @address is
     * %NULL then the message is sent to the default receiver (set by
     * g_socket_connect()).
     * 
     * See g_socket_send() for additional information.
     */
    public long sendTo(SocketAddress address, byte[] buffer, long size, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_send_to(HANDLE(), address.HANDLE(), Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, buffer), size, cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * This behaves exactly the same as g_socket_send(), except that
     * the choice of blocking or non-blocking behavior is determined by
     * the @blocking argument rather than by @socket's properties.
     */
    public long sendWithBlocking(byte[] buffer, long size, boolean blocking, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_send_with_blocking(HANDLE(), Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, buffer), size, blocking ? 1 : 0, cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Sets the blocking mode of the socket. In blocking mode
     * all operations (which don’t take an explicit blocking parameter) block until
     * they succeed or there is an error. In
     * non-blocking mode all functions return results immediately or
     * with a %G_IO_ERROR_WOULD_BLOCK error.
     * 
     * All sockets are created in blocking mode. However, note that the
     * platform level socket is always non-blocking, and blocking mode
     * is a GSocket level feature.
     */
    public void setBlocking(boolean blocking) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_set_blocking(HANDLE(), blocking ? 1 : 0);
    }
    
    /**
     * Sets whether @socket should allow sending to broadcast addresses.
     * This is %FALSE by default.
     */
    public void setBroadcast(boolean broadcast) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_set_broadcast(HANDLE(), broadcast ? 1 : 0);
    }
    
    /**
     * Sets or unsets the %SO_KEEPALIVE flag on the underlying socket. When
     * this flag is set on a socket, the system will attempt to verify that the
     * remote socket endpoint is still present if a sufficiently long period of
     * time passes with no data being exchanged. If the system is unable to
     * verify the presence of the remote endpoint, it will automatically close
     * the connection.
     * 
     * This option is only functional on certain kinds of sockets. (Notably,
     * %G_SOCKET_PROTOCOL_TCP sockets.)
     * 
     * The exact time between pings is system- and protocol-dependent, but will
     * normally be at least two hours. Most commonly, you would set this flag
     * on a server socket if you want to allow clients to remain idle for long
     * periods of time, but also want to ensure that connections are eventually
     * garbage-collected if clients crash or become unreachable.
     */
    public void setKeepalive(boolean keepalive) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_set_keepalive(HANDLE(), keepalive ? 1 : 0);
    }
    
    /**
     * Sets the maximum number of outstanding connections allowed
     * when listening on this socket. If more clients than this are
     * connecting to the socket and the application is not handling them
     * on time then the new connections will be refused.
     * 
     * Note that this must be called before g_socket_listen() and has no
     * effect if called after that.
     */
    public void setListenBacklog(int backlog) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_set_listen_backlog(HANDLE(), backlog);
    }
    
    /**
     * Sets whether outgoing multicast packets will be received by sockets
     * listening on that multicast address on the same host. This is %TRUE
     * by default.
     */
    public void setMulticastLoopback(boolean loopback) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_set_multicast_loopback(HANDLE(), loopback ? 1 : 0);
    }
    
    /**
     * Sets the time-to-live for outgoing multicast datagrams on @socket.
     * By default, this is 1, meaning that multicast packets will not leave
     * the local network.
     */
    public void setMulticastTtl(int ttl) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_set_multicast_ttl(HANDLE(), ttl);
    }
    
    /**
     * Sets the value of an integer-valued option on @socket, as with
     * setsockopt(). (If you need to set a non-integer-valued option,
     * you will need to call setsockopt() directly.)
     * 
     * The [<gio/gnetworking.h>][gio-gnetworking.h]
     * header pulls in system headers that will define most of the
     * standard/portable socket options. For unusual socket protocols or
     * platform-dependent options, you may need to include additional
     * headers.
     */
    public boolean setOption(int level, int optname, int value) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_set_option(HANDLE(), level, optname, value, GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Sets the time in seconds after which I/O operations on @socket will
     * time out if they have not yet completed.
     * 
     * On a blocking socket, this means that any blocking #GSocket
     * operation will time out after @timeout seconds of inactivity,
     * returning %G_IO_ERROR_TIMED_OUT.
     * 
     * On a non-blocking socket, calls to g_socket_condition_wait() will
     * also fail with %G_IO_ERROR_TIMED_OUT after the given time. Sources
     * created with g_socket_create_source() will trigger after
     * @timeout seconds of inactivity, with the requested condition
     * set, at which point calling g_socket_receive(), g_socket_send(),
     * g_socket_check_connect_result(), etc, will fail with
     * %G_IO_ERROR_TIMED_OUT.
     * 
     * If @timeout is 0 (the default), operations will never time out
     * on their own.
     * 
     * Note that if an I/O operation is interrupted by a signal, this may
     * cause the timeout to be reset.
     */
    public void setTimeout(int timeout) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_set_timeout(HANDLE(), timeout);
    }
    
    /**
     * Sets the time-to-live for outgoing unicast packets on @socket.
     * By default the platform-specific default value is used.
     */
    public void setTtl(int ttl) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_set_ttl(HANDLE(), ttl);
    }
    
    /**
     * Shut down part or all of a full-duplex connection.
     * 
     * If @shutdown_read is %TRUE then the receiving side of the connection
     * is shut down, and further reading is disallowed.
     * 
     * If @shutdown_write is %TRUE then the sending side of the connection
     * is shut down, and further writing is disallowed.
     * 
     * It is allowed for both @shutdown_read and @shutdown_write to be %TRUE.
     * 
     * One example where it is useful to shut down only one side of a connection is
     * graceful disconnect for TCP connections where you close the sending side,
     * then wait for the other side to close the connection, thus ensuring that the
     * other side saw all sent data.
     */
    public boolean shutdown(boolean shutdownRead, boolean shutdownWrite) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_shutdown(HANDLE(), shutdownRead ? 1 : 0, shutdownWrite ? 1 : 0, GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Checks if a socket is capable of speaking IPv4.
     * 
     * IPv4 sockets are capable of speaking IPv4.  On some operating systems
     * and under some combinations of circumstances IPv6 sockets are also
     * capable of speaking IPv4.  See RFC 3493 section 3.7 for more
     * information.
     * 
     * No other types of sockets are currently considered as being capable
     * of speaking IPv4.
     */
    public boolean speaksIpv4() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_speaks_ipv4(HANDLE());
        return (RESULT != 0);
    }
    
}