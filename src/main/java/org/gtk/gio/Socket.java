package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link Socket} is a low-level networking primitive. It is a more or less
 * direct mapping of the BSD socket API in a portable GObject based API.
 * It supports both the UNIX socket implementations and winsock2 on Windows.
 * <p>
 * {@link Socket} is the platform independent base upon which the higher level
 * network primitives are based. Applications are not typically meant to
 * use it directly, but rather through classes like {@link SocketClient},
 * {@link SocketService} and {@link SocketConnection}. However there may be cases where
 * direct use of {@link Socket} is useful.
 * <p>
 * {@link Socket} implements the {@link Initable} interface, so if it is manually constructed
 * by e.g. g_object_new() you must call g_initable_init() and check the
 * results before using the object. This is done automatically in
 * g_socket_new() and g_socket_new_from_fd(), so these functions can return
 * {@code null}.
 * <p>
 * Sockets operate in two general modes, blocking or non-blocking. When
 * in blocking mode all operations (which don’t take an explicit blocking
 * parameter) block until the requested operation
 * is finished or there is an error. In non-blocking mode all calls that
 * would block return immediately with a {@link IOErrorEnum#WOULD_BLOCK} error.
 * To know when a call would successfully run you can call g_socket_condition_check(),
 * or g_socket_condition_wait(). You can also use g_socket_create_source() and
 * attach it to a {@link org.gtk.glib.MainContext} to get callbacks when I/O is possible.
 * Note that all sockets are always set to non blocking mode in the system, and
 * blocking mode is emulated in GSocket.
 * <p>
 * When working in non-blocking mode applications should always be able to
 * handle getting a {@link IOErrorEnum#WOULD_BLOCK} error even when some other
 * function said that I/O was possible. This can easily happen in case
 * of a race condition in the application, but it can also happen for other
 * reasons. For instance, on Windows a socket is always seen as writable
 * until a write returns {@link IOErrorEnum#WOULD_BLOCK}.
 * <p>
 * {@code GSockets} can be either connection oriented or datagram based.
 * For connection oriented types you must first establish a connection by
 * either connecting to an address or accepting a connection from another
 * address. For connectionless socket types the target/source address is
 * specified or received in each I/O operation.
 * <p>
 * All socket file descriptors are set to be close-on-exec.
 * <p>
 * Note that creating a {@link Socket} causes the signal {@code SIGPIPE} to be
 * ignored for the remainder of the program. If you are writing a
 * command-line utility that uses {@link Socket}, you may need to take into
 * account the fact that your program will not automatically be killed
 * if it tries to write to {@code stdout} after it has been closed.
 * <p>
 * Like most other APIs in GLib, {@link Socket} is not inherently thread safe. To use
 * a {@link Socket} concurrently from multiple threads, you must implement your own
 * locking.
 */
public class Socket extends org.gtk.gobject.Object implements DatagramBased, Initable {

    public Socket(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Socket */
    public static Socket castFrom(org.gtk.gobject.Object gobject) {
        return new Socket(gobject.getReference());
    }
    
    private static Reference constructNew(SocketFamily family, SocketType type, SocketProtocol protocol) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.g_socket_new(family.getValue(), type.getValue(), protocol.getValue(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link Socket} with the defined family, type and protocol.
     * If {@code protocol} is 0 ({@link SocketProtocol#DEFAULT}) the default protocol type
     * for the family and type is used.
     * <p>
     * The {@code protocol} is a family and type specific int that specifies what
     * kind of protocol to use. {@link SocketProtocol} lists several common ones.
     * Many families only support one protocol, and use 0 for this, others
     * support several and using 0 means to use the default protocol for
     * the family and type.
     * <p>
     * The protocol id is passed directly to the operating
     * system, so you can use protocols not listed in {@link SocketProtocol} if you
     * know the protocol number used for it.
     */
    public Socket(SocketFamily family, SocketType type, SocketProtocol protocol) throws GErrorException {
        super(constructNew(family, type, protocol));
    }
    
    private static Reference constructNewFromFd(int fd) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.g_socket_new_from_fd(fd, GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link Socket} from a native file descriptor
     * or winsock SOCKET handle.
     * <p>
     * This reads all the settings from the file descriptor so that
     * all properties should work. Note that the file descriptor
     * will be set to non-blocking mode, independent on the blocking
     * mode of the {@link Socket}.
     * <p>
     * On success, the returned {@link Socket} takes ownership of {@code fd}. On failure, the
     * caller must close {@code fd} themselves.
     * <p>
     * Since GLib 2.46, it is no longer a fatal error to call this on a non-socket
     * descriptor.  Instead, a GError will be set with code {@link IOErrorEnum#FAILED}
     */
    public static Socket newFromFd(int fd) throws GErrorException {
        return new Socket(constructNewFromFd(fd));
    }
    
    /**
     * Accept incoming connections on a connection-based socket. This removes
     * the first outstanding connection request from the listening socket and
     * creates a {@link Socket} object for it.
     * <p>
     * The {@code socket} must be bound to a local address with g_socket_bind() and
     * must be listening for incoming connections (g_socket_listen()).
     * <p>
     * If there are no outstanding connections then the operation will block
     * or return {@link IOErrorEnum#WOULD_BLOCK} if non-blocking I/O is enabled.
     * To be notified of an incoming connection, wait for the {@link org.gtk.glib.IOCondition#IN} condition.
     */
    public Socket accept(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_accept(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new Socket(References.get(RESULT, true));
    }
    
    /**
     * When a socket is created it is attached to an address family, but it
     * doesn't have an address in this family. g_socket_bind() assigns the
     * address (sometimes called name) of the socket.
     * <p>
     * It is generally required to bind to a local address before you can
     * receive connections. (See g_socket_listen() and g_socket_accept() ).
     * In certain situations, you may also want to bind a socket that will be
     * used to initiate connections, though this is not normally required.
     * <p>
     * If {@code socket} is a TCP socket, then {@code allow_reuse} controls the setting
     * of the {@code SO_REUSEADDR} socket option; normally it should be {@code true} for
     * server sockets (sockets that you will eventually call
     * g_socket_accept() on), and {@code false} for client sockets. (Failing to
     * set this flag on a server socket may cause g_socket_bind() to return
     * {@link IOErrorEnum#ADDRESS_IN_USE} if the server program is stopped and then
     * immediately restarted.)
     * <p>
     * If {@code socket} is a UDP socket, then {@code allow_reuse} determines whether or
     * not other UDP sockets can be bound to the same address at the same
     * time. In particular, you can have several UDP sockets bound to the
     * same address, and they will all receive all of the multicast and
     * broadcast packets sent to that address. (The behavior of unicast
     * UDP packets to an address with multiple listeners is not defined.)
     */
    public boolean bind(SocketAddress address, boolean allowReuse) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_bind(handle(), address.handle(), allowReuse ? 1 : 0, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks and resets the pending connect error for the socket.
     * This is used to check for errors when g_socket_connect() is
     * used in non-blocking mode.
     */
    public boolean checkConnectResult() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_check_connect_result(handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Closes the socket, shutting down any active connection.
     * <p>
     * Closing a socket does not wait for all outstanding I/O operations
     * to finish, so the caller should not rely on them to be guaranteed
     * to complete even if the close returns with no error.
     * <p>
     * Once the socket is closed, all other operations will return
     * {@link IOErrorEnum#CLOSED}. Closing a socket multiple times will not
     * return an error.
     * <p>
     * Sockets will be automatically closed when the last reference
     * is dropped, but you might want to call this function to make sure
     * resources are released as early as possible.
     * <p>
     * Beware that due to the way that TCP works, it is possible for
     * recently-sent data to be lost if either you close a socket while the
     * {@link org.gtk.glib.IOCondition#IN} condition is set, or else if the remote connection tries to
     * send something to you after you close the socket but before it has
     * finished reading all of the data you sent. There is no easy generic
     * way to avoid this problem; the easiest fix is to design the network
     * protocol such that the client will never send data "out of turn".
     * Another solution is for the server to half-close the connection by
     * calling g_socket_shutdown() with only the {@code shutdown_write} flag set,
     * and then wait for the client to notice this and close its side of the
     * connection, after which the server can safely call g_socket_close().
     * (This is what {@link TcpConnection} does if you call
     * g_tcp_connection_set_graceful_disconnect(). But of course, this
     * only works if the client will close its connection after the server
     * does.)
     */
    public boolean close() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_close(handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks on the readiness of {@code socket} to perform operations.
     * The operations specified in {@code condition} are checked for and masked
     * against the currently-satisfied conditions on {@code socket}. The result
     * is returned.
     * <p>
     * Note that on Windows, it is possible for an operation to return
     * {@link IOErrorEnum#WOULD_BLOCK} even immediately after
     * g_socket_condition_check() has claimed that the socket is ready for
     * writing. Rather than calling g_socket_condition_check() and then
     * writing to the socket if it succeeds, it is generally better to
     * simply try writing to the socket right away, and try again later if
     * the initial attempt returns {@link IOErrorEnum#WOULD_BLOCK}.
     * <p>
     * It is meaningless to specify {@link org.gtk.glib.IOCondition#ERR} or {@link org.gtk.glib.IOCondition#HUP} in condition;
     * these conditions will always be set in the output if they are true.
     * <p>
     * This call never blocks.
     */
    public org.gtk.glib.IOCondition conditionCheck(org.gtk.glib.IOCondition condition) {
        var RESULT = gtk_h.g_socket_condition_check(handle(), condition.getValue());
        return new org.gtk.glib.IOCondition(RESULT);
    }
    
    /**
     * Waits for up to {@code timeout_us} microseconds for {@code condition} to become true
     * on {@code socket}. If the condition is met, {@code true} is returned.
     * <p>
     * If {@code cancellable} is cancelled before the condition is met, or if
     * {@code timeout_us} (or the socket's {@link Socket}:timeout) is reached before the
     * condition is met, then {@code false} is returned and {@code error}, if non-{@code null},
     * is set to the appropriate value ({@link IOErrorEnum#CANCELLED} or
     * {@link IOErrorEnum#TIMED_OUT}).
     * <p>
     * If you don't want a timeout, use g_socket_condition_wait().
     * (Alternatively, you can pass -1 for {@code timeout_us}.)
     * <p>
     * Note that although {@code timeout_us} is in microseconds for consistency with
     * other GLib APIs, this function actually only has millisecond
     * resolution, and the behavior is undefined if {@code timeout_us} is not an
     * exact number of milliseconds.
     */
    public boolean conditionTimedWait(org.gtk.glib.IOCondition condition, long timeoutUs, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_condition_timed_wait(handle(), condition.getValue(), timeoutUs, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Waits for {@code condition} to become true on {@code socket}. When the condition
     * is met, {@code true} is returned.
     * <p>
     * If {@code cancellable} is cancelled before the condition is met, or if the
     * socket has a timeout set and it is reached before the condition is
     * met, then {@code false} is returned and {@code error}, if non-{@code null}, is set to
     * the appropriate value ({@link IOErrorEnum#CANCELLED} or
     * {@link IOErrorEnum#TIMED_OUT}).
     * <p>
     * See also g_socket_condition_timed_wait().
     */
    public boolean conditionWait(org.gtk.glib.IOCondition condition, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_condition_wait(handle(), condition.getValue(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Connect the socket to the specified remote address.
     * <p>
     * For connection oriented socket this generally means we attempt to make
     * a connection to the {@code address}. For a connection-less socket it sets
     * the default address for g_socket_send() and discards all incoming datagrams
     * from other sources.
     * <p>
     * Generally connection oriented sockets can only connect once, but
     * connection-less sockets can connect multiple times to change the
     * default address.
     * <p>
     * If the connect call needs to do network I/O it will block, unless
     * non-blocking I/O is enabled. Then {@link IOErrorEnum#PENDING} is returned
     * and the user can be notified of the connection finishing by waiting
     * for the G_IO_OUT condition. The result of the connection must then be
     * checked with g_socket_check_connect_result().
     */
    public boolean connect(SocketAddress address, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_connect(handle(), address.handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Creates a {@link SocketConnection} subclass of the right type for
     * {@code socket}.
     */
    public SocketConnection connectionFactoryCreateConnection() {
        var RESULT = gtk_h.g_socket_connection_factory_create_connection(handle());
        return new SocketConnection(References.get(RESULT, true));
    }
    
    /**
     * Creates a {@link org.gtk.glib.Source} that can be attached to a {@code GMainContext} to monitor
     * for the availability of the specified {@code condition} on the socket. The {@link org.gtk.glib.Source}
     * keeps a reference to the {@code socket}.
     * <p>
     * The callback on the source is of the {@link SocketSourceFunc} type.
     * <p>
     * It is meaningless to specify {@link org.gtk.glib.IOCondition#ERR} or {@link org.gtk.glib.IOCondition#HUP} in {@code condition};
     * these conditions will always be reported output if they are true.
     * <p>
     * {@code cancellable} if not {@code null} can be used to cancel the source, which will
     * cause the source to trigger, reporting the current condition (which
     * is likely 0 unless cancellation happened at the same time as a
     * condition change). You can check for this in the callback using
     * g_cancellable_is_cancelled().
     * <p>
     * If {@code socket} has a timeout set, and it is reached before {@code condition}
     * occurs, the source will then trigger anyway, reporting {@link org.gtk.glib.IOCondition#IN} or
     * {@link org.gtk.glib.IOCondition#OUT} depending on {@code condition}. However, {@code socket} will have been
     * marked as having had a timeout, and so the next {@link Socket} I/O method
     * you call will then fail with a {@link IOErrorEnum#TIMED_OUT}.
     */
    public org.gtk.glib.Source createSource(org.gtk.glib.IOCondition condition, Cancellable cancellable) {
        var RESULT = gtk_h.g_socket_create_source(handle(), condition.getValue(), cancellable.handle());
        return new org.gtk.glib.Source(References.get(RESULT, true));
    }
    
    /**
     * Get the amount of data pending in the OS input buffer, without blocking.
     * <p>
     * If {@code socket} is a UDP or SCTP socket, this will return the size of
     * just the next packet, even if additional packets are buffered after
     * that one.
     * <p>
     * Note that on Windows, this function is rather inefficient in the
     * UDP case, and so if you know any plausible upper bound on the size
     * of the incoming packet, it is better to just do a
     * g_socket_receive() with a buffer of that size, rather than calling
     * g_socket_get_available_bytes() first and then doing a receive of
     * exactly the right size.
     */
    public long getAvailableBytes() {
        var RESULT = gtk_h.g_socket_get_available_bytes(handle());
        return RESULT;
    }
    
    /**
     * Gets the blocking mode of the socket. For details on blocking I/O,
     * see g_socket_set_blocking().
     */
    public boolean getBlocking() {
        var RESULT = gtk_h.g_socket_get_blocking(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the broadcast setting on {@code socket}; if {@code true},
     * it is possible to send packets to broadcast
     * addresses.
     */
    public boolean getBroadcast() {
        var RESULT = gtk_h.g_socket_get_broadcast(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns the credentials of the foreign process connected to this
     * socket, if any (e.g. it is only supported for {@link SocketFamily#UNIX}
     * sockets).
     * <p>
     * If this operation isn't supported on the OS, the method fails with
     * the {@link IOErrorEnum#NOT_SUPPORTED} error. On Linux this is implemented
     * by reading the {@code SO_PEERCRED} option on the underlying socket.
     * <p>
     * This method can be expected to be available on the following platforms:
     * <p>
     * <ul>
     * <li>Linux since GLib 2.26
     * <li>OpenBSD since GLib 2.30
     * <li>Solaris, Illumos and OpenSolaris since GLib 2.40
     * <li>NetBSD since GLib 2.42
     * <li>macOS, tvOS, iOS since GLib 2.66
     * </ul>
     * <p>
     * Other ways to obtain credentials from a foreign peer includes the
     * {@link UnixCredentialsMessage} type and
     * g_unix_connection_send_credentials() /
     * g_unix_connection_receive_credentials() functions.
     */
    public Credentials getCredentials() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_get_credentials(handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new Credentials(References.get(RESULT, true));
    }
    
    /**
     * Gets the socket family of the socket.
     */
    public SocketFamily getFamily() {
        var RESULT = gtk_h.g_socket_get_family(handle());
        return new SocketFamily(RESULT);
    }
    
    /**
     * Returns the underlying OS socket object. On unix this
     * is a socket file descriptor, and on Windows this is
     * a Winsock2 SOCKET handle. This may be useful for
     * doing platform specific or otherwise unusual operations
     * on the socket.
     */
    public int getFd() {
        var RESULT = gtk_h.g_socket_get_fd(handle());
        return RESULT;
    }
    
    /**
     * Gets the keepalive mode of the socket. For details on this,
     * see g_socket_set_keepalive().
     */
    public boolean getKeepalive() {
        var RESULT = gtk_h.g_socket_get_keepalive(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the listen backlog setting of the socket. For details on this,
     * see g_socket_set_listen_backlog().
     */
    public int getListenBacklog() {
        var RESULT = gtk_h.g_socket_get_listen_backlog(handle());
        return RESULT;
    }
    
    /**
     * Try to get the local address of a bound socket. This is only
     * useful if the socket has been bound to a local address,
     * either explicitly or implicitly when connecting.
     */
    public SocketAddress getLocalAddress() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_get_local_address(handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new SocketAddress(References.get(RESULT, true));
    }
    
    /**
     * Gets the multicast loopback setting on {@code socket}; if {@code true} (the
     * default), outgoing multicast packets will be looped back to
     * multicast listeners on the same host.
     */
    public boolean getMulticastLoopback() {
        var RESULT = gtk_h.g_socket_get_multicast_loopback(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the multicast time-to-live setting on {@code socket}; see
     * g_socket_set_multicast_ttl() for more details.
     */
    public int getMulticastTtl() {
        var RESULT = gtk_h.g_socket_get_multicast_ttl(handle());
        return RESULT;
    }
    
    /**
     * Gets the value of an integer-valued option on {@code socket}, as with
     * getsockopt(). (If you need to fetch a  non-integer-valued option,
     * you will need to call getsockopt() directly.)
     * <p>
     * The [&lt;gio/gnetworking.h&gt;][gio-gnetworking.h]
     * header pulls in system headers that will define most of the
     * standard/portable socket options. For unusual socket protocols or
     * platform-dependent options, you may need to include additional
     * headers.
     * <p>
     * Note that even for socket options that are a single byte in size,
     * {@code value} is still a pointer to a {@code gint} variable, not a {@code guchar};
     * g_socket_get_option() will handle the conversion internally.
     */
    public boolean getOption(int level, int optname, PointerInteger value) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_get_option(handle(), level, optname, value.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the socket protocol id the socket was created with.
     * In case the protocol is unknown, -1 is returned.
     */
    public SocketProtocol getProtocol() {
        var RESULT = gtk_h.g_socket_get_protocol(handle());
        return new SocketProtocol(RESULT);
    }
    
    /**
     * Try to get the remote address of a connected socket. This is only
     * useful for connection oriented sockets that have been connected.
     */
    public SocketAddress getRemoteAddress() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_get_remote_address(handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new SocketAddress(References.get(RESULT, true));
    }
    
    /**
     * Gets the socket type of the socket.
     */
    public SocketType getSocketType() {
        var RESULT = gtk_h.g_socket_get_socket_type(handle());
        return new SocketType(RESULT);
    }
    
    /**
     * Gets the timeout setting of the socket. For details on this, see
     * g_socket_set_timeout().
     */
    public int getTimeout() {
        var RESULT = gtk_h.g_socket_get_timeout(handle());
        return RESULT;
    }
    
    /**
     * Gets the unicast time-to-live setting on {@code socket}; see
     * g_socket_set_ttl() for more details.
     */
    public int getTtl() {
        var RESULT = gtk_h.g_socket_get_ttl(handle());
        return RESULT;
    }
    
    /**
     * Checks whether a socket is closed.
     */
    public boolean isClosed() {
        var RESULT = gtk_h.g_socket_is_closed(handle());
        return RESULT != 0;
    }
    
    /**
     * Check whether the socket is connected. This is only useful for
     * connection-oriented sockets.
     * <p>
     * If using g_socket_shutdown(), this function will return {@code true} until the
     * socket has been shut down for reading and writing. If you do a non-blocking
     * connect, this function will not return {@code true} until after you call
     * g_socket_check_connect_result().
     */
    public boolean isConnected() {
        var RESULT = gtk_h.g_socket_is_connected(handle());
        return RESULT != 0;
    }
    
    /**
     * Registers {@code socket} to receive multicast messages sent to {@code group}.
     * {@code socket} must be a {@link SocketType#DATAGRAM} socket, and must have
     * been bound to an appropriate interface and port with
     * g_socket_bind().
     * <p>
     * If {@code iface} is {@code null}, the system will automatically pick an interface
     * to bind to based on {@code group}.
     * <p>
     * If {@code source_specific} is {@code true}, source-specific multicast as defined
     * in RFC 4604 is used. Note that on older platforms this may fail
     * with a {@link IOErrorEnum#NOT_SUPPORTED} error.
     * <p>
     * To bind to a given source-specific multicast address, use
     * g_socket_join_multicast_group_ssm() instead.
     */
    public boolean joinMulticastGroup(InetAddress group, boolean sourceSpecific, java.lang.String iface) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_join_multicast_group(handle(), group.handle(), sourceSpecific ? 1 : 0, Interop.allocateNativeString(iface).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Registers {@code socket} to receive multicast messages sent to {@code group}.
     * {@code socket} must be a {@link SocketType#DATAGRAM} socket, and must have
     * been bound to an appropriate interface and port with
     * g_socket_bind().
     * <p>
     * If {@code iface} is {@code null}, the system will automatically pick an interface
     * to bind to based on {@code group}.
     * <p>
     * If {@code source_specific} is not {@code null}, use source-specific multicast as
     * defined in RFC 4604. Note that on older platforms this may fail
     * with a {@link IOErrorEnum#NOT_SUPPORTED} error.
     * <p>
     * Note that this function can be called multiple times for the same
     * {@code group} with different {@code source_specific} in order to receive multicast
     * packets from more than one source.
     */
    public boolean joinMulticastGroupSsm(InetAddress group, InetAddress sourceSpecific, java.lang.String iface) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_join_multicast_group_ssm(handle(), group.handle(), sourceSpecific.handle(), Interop.allocateNativeString(iface).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Removes {@code socket} from the multicast group defined by {@code group}, {@code iface},
     * and {@code source_specific} (which must all have the same values they had
     * when you joined the group).
     * <p>
     * {@code socket} remains bound to its address and port, and can still receive
     * unicast messages after calling this.
     * <p>
     * To unbind to a given source-specific multicast address, use
     * g_socket_leave_multicast_group_ssm() instead.
     */
    public boolean leaveMulticastGroup(InetAddress group, boolean sourceSpecific, java.lang.String iface) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_leave_multicast_group(handle(), group.handle(), sourceSpecific ? 1 : 0, Interop.allocateNativeString(iface).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Removes {@code socket} from the multicast group defined by {@code group}, {@code iface},
     * and {@code source_specific} (which must all have the same values they had
     * when you joined the group).
     * <p>
     * {@code socket} remains bound to its address and port, and can still receive
     * unicast messages after calling this.
     */
    public boolean leaveMulticastGroupSsm(InetAddress group, InetAddress sourceSpecific, java.lang.String iface) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_leave_multicast_group_ssm(handle(), group.handle(), sourceSpecific.handle(), Interop.allocateNativeString(iface).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Marks the socket as a server socket, i.e. a socket that is used
     * to accept incoming requests using g_socket_accept().
     * <p>
     * Before calling this the socket must be bound to a local address using
     * g_socket_bind().
     * <p>
     * To set the maximum amount of outstanding clients, use
     * g_socket_set_listen_backlog().
     */
    public boolean listen() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_listen(handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Receive data (up to {@code size} bytes) from a socket. This is mainly used by
     * connection-oriented sockets; it is identical to g_socket_receive_from()
     * with {@code address} set to {@code null}.
     * <p>
     * For {@link SocketType#DATAGRAM} and {@link SocketType#SEQPACKET} sockets,
     * g_socket_receive() will always read either 0 or 1 complete messages from
     * the socket. If the received message is too large to fit in {@code buffer}, then
     * the data beyond {@code size} bytes will be discarded, without any explicit
     * indication that this has occurred.
     * <p>
     * For {@link SocketType#STREAM} sockets, g_socket_receive() can return any
     * number of bytes, up to {@code size}. If more than {@code size} bytes have been
     * received, the additional data will be returned in future calls to
     * g_socket_receive().
     * <p>
     * If the socket is in blocking mode the call will block until there
     * is some data to receive, the connection is closed, or there is an
     * error. If there is no data available and the socket is in
     * non-blocking mode, a {@link IOErrorEnum#WOULD_BLOCK} error will be
     * returned. To be notified when data is available, wait for the
     * {@link org.gtk.glib.IOCondition#IN} condition.
     * <p>
     * On error -1 is returned and {@code error} is set accordingly.
     */
    public long receive(byte[] buffer, long size, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_receive(handle(), Interop.allocateNativeArray(buffer).handle(), size, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Receive data (up to {@code size} bytes) from a socket.
     * <p>
     * If {@code address} is non-{@code null} then {@code address} will be set equal to the
     * source address of the received packet.
     * {@code address} is owned by the caller.
     * <p>
     * See g_socket_receive() for additional information.
     */
    public long receiveFrom(SocketAddress[] address, byte[] buffer, long size, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_receive_from(handle(), Interop.allocateNativeArray(address).handle(), Interop.allocateNativeArray(buffer).handle(), size, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Receive data from a socket.  For receiving multiple messages, see
     * g_socket_receive_messages(); for easier use, see
     * g_socket_receive() and g_socket_receive_from().
     * <p>
     * If {@code address} is non-{@code null} then {@code address} will be set equal to the
     * source address of the received packet.
     * {@code address} is owned by the caller.
     * <p>
     * {@code vector} must point to an array of {@link InputVector} structs and
     * {@code num_vectors} must be the length of this array.  These structs
     * describe the buffers that received data will be scattered into.
     * If {@code num_vectors} is -1, then {@code vectors} is assumed to be terminated
     * by a {@link InputVector} with a {@code null} buffer pointer.
     * <p>
     * As a special case, if {@code num_vectors} is 0 (in which case, {@code vectors}
     * may of course be {@code null}), then a single byte is received and
     * discarded. This is to facilitate the common practice of sending a
     * single '\\0' byte for the purposes of transferring ancillary data.
     * <p>
     * {@code messages}, if non-{@code null}, will be set to point to a newly-allocated
     * array of {@link SocketControlMessage} instances or {@code null} if no such
     * messages was received. These correspond to the control messages
     * received from the kernel, one {@link SocketControlMessage} per message
     * from the kernel. This array is {@code null}-terminated and must be freed
     * by the caller using g_free() after calling g_object_unref() on each
     * element. If {@code messages} is {@code null}, any control messages received will
     * be discarded.
     * <p>
     * {@code num_messages}, if non-{@code null}, will be set to the number of control
     * messages received.
     * <p>
     * If both {@code messages} and {@code num_messages} are non-{@code null}, then
     * {@code num_messages} gives the number of {@link SocketControlMessage} instances
     * in {@code messages} (ie: not including the {@code null} terminator).
     * <p>
     * {@code flags} is an in/out parameter. The commonly available arguments
     * for this are available in the {@link SocketMsgFlags} enum, but the
     * values there are the same as the system values, and the flags
     * are passed in as-is, so you can pass in system-specific flags too
     * (and g_socket_receive_message() may pass system-specific flags out).
     * Flags passed in to the parameter affect the receive operation; flags returned
     * out of it are relevant to the specific returned message.
     * <p>
     * As with g_socket_receive(), data may be discarded if {@code socket} is
     * {@link SocketType#DATAGRAM} or {@link SocketType#SEQPACKET} and you do not
     * provide enough buffer space to read a complete message. You can pass
     * {@link SocketMsgFlags#PEEK} in {@code flags} to peek at the current message without
     * removing it from the receive queue, but there is no portable way to find
     * out the length of the message other than by reading it into a
     * sufficiently-large buffer.
     * <p>
     * If the socket is in blocking mode the call will block until there
     * is some data to receive, the connection is closed, or there is an
     * error. If there is no data available and the socket is in
     * non-blocking mode, a {@link IOErrorEnum#WOULD_BLOCK} error will be
     * returned. To be notified when data is available, wait for the
     * {@link org.gtk.glib.IOCondition#IN} condition.
     * <p>
     * On error -1 is returned and {@code error} is set accordingly.
     */
    public long receiveMessage(SocketAddress[] address, InputVector[] vectors, int numVectors, SocketControlMessage[] messages, PointerInteger numMessages, PointerInteger flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_receive_message(handle(), Interop.allocateNativeArray(address).handle(), Interop.allocateNativeArray(vectors).handle(), numVectors, Interop.allocateNativeArray(messages).handle(), numMessages.handle(), flags.handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Receive multiple data messages from {@code socket} in one go.  This is the most
     * complicated and fully-featured version of this call. For easier use, see
     * g_socket_receive(), g_socket_receive_from(), and g_socket_receive_message().
     * <p>
     * {@code messages} must point to an array of {@link InputMessage} structs and
     * {@code num_messages} must be the length of this array. Each {@link InputMessage}
     * contains a pointer to an array of {@link InputVector} structs describing the
     * buffers that the data received in each message will be written to. Using
     * multiple {@code GInputVectors} is more memory-efficient than manually copying data
     * out of a single buffer to multiple sources, and more system-call-efficient
     * than making multiple calls to g_socket_receive(), such as in scenarios where
     * a lot of data packets need to be received (e.g. high-bandwidth video
     * streaming over RTP/UDP).
     * <p>
     * {@code flags} modify how all messages are received. The commonly available
     * arguments for this are available in the {@link SocketMsgFlags} enum, but the
     * values there are the same as the system values, and the flags
     * are passed in as-is, so you can pass in system-specific flags too. These
     * flags affect the overall receive operation. Flags affecting individual
     * messages are returned in {@link InputMessage}.flags.
     * <p>
     * The other members of {@link InputMessage} are treated as described in its
     * documentation.
     * <p>
     * If {@link Socket}:blocking is {@code true} the call will block until {@code num_messages} have
     * been received, or the end of the stream is reached.
     * <p>
     * If {@link Socket}:blocking is {@code false} the call will return up to {@code num_messages}
     * without blocking, or {@link IOErrorEnum#WOULD_BLOCK} if no messages are queued in the
     * operating system to be received.
     * <p>
     * In blocking mode, if {@link Socket}:timeout is positive and is reached before any
     * messages are received, {@link IOErrorEnum#TIMED_OUT} is returned, otherwise up to
     * {@code num_messages} are returned. (Note: This is effectively the
     * behaviour of {@code MSG_WAITFORONE} with recvmmsg().)
     * <p>
     * To be notified when messages are available, wait for the
     * {@link org.gtk.glib.IOCondition#IN} condition. Note though that you may still receive
     * {@link IOErrorEnum#WOULD_BLOCK} from g_socket_receive_messages() even if you were
     * previously notified of a {@link org.gtk.glib.IOCondition#IN} condition.
     * <p>
     * If the remote peer closes the connection, any messages queued in the
     * operating system will be returned, and subsequent calls to
     * g_socket_receive_messages() will return 0 (with no error set).
     * <p>
     * On error -1 is returned and {@code error} is set accordingly. An error will only
     * be returned if zero messages could be received; otherwise the number of
     * messages successfully received before the error will be returned.
     */
    public int receiveMessages(InputMessage[] messages, int numMessages, int flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_receive_messages(handle(), Interop.allocateNativeArray(messages).handle(), numMessages, flags, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * This behaves exactly the same as g_socket_receive(), except that
     * the choice of blocking or non-blocking behavior is determined by
     * the {@code blocking} argument rather than by {@code socket}'s properties.
     */
    public long receiveWithBlocking(byte[] buffer, long size, boolean blocking, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_receive_with_blocking(handle(), Interop.allocateNativeArray(buffer).handle(), size, blocking ? 1 : 0, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Tries to send {@code size} bytes from {@code buffer} on the socket. This is
     * mainly used by connection-oriented sockets; it is identical to
     * g_socket_send_to() with {@code address} set to {@code null}.
     * <p>
     * If the socket is in blocking mode the call will block until there is
     * space for the data in the socket queue. If there is no space available
     * and the socket is in non-blocking mode a {@link IOErrorEnum#WOULD_BLOCK} error
     * will be returned. To be notified when space is available, wait for the
     * {@link org.gtk.glib.IOCondition#OUT} condition. Note though that you may still receive
     * {@link IOErrorEnum#WOULD_BLOCK} from g_socket_send() even if you were previously
     * notified of a {@link org.gtk.glib.IOCondition#OUT} condition. (On Windows in particular, this is
     * very common due to the way the underlying APIs work.)
     * <p>
     * On error -1 is returned and {@code error} is set accordingly.
     */
    public long send(byte[] buffer, long size, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_send(handle(), Interop.allocateNativeArray(buffer).handle(), size, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Send data to {@code address} on {@code socket}.  For sending multiple messages see
     * g_socket_send_messages(); for easier use, see
     * g_socket_send() and g_socket_send_to().
     * <p>
     * If {@code address} is {@code null} then the message is sent to the default receiver
     * (set by g_socket_connect()).
     * <p>
     * {@code vectors} must point to an array of {@link OutputVector} structs and
     * {@code num_vectors} must be the length of this array. (If {@code num_vectors} is -1,
     * then {@code vectors} is assumed to be terminated by a {@link OutputVector} with a
     * {@code null} buffer pointer.) The {@link OutputVector} structs describe the buffers
     * that the sent data will be gathered from. Using multiple
     * {@code GOutputVectors} is more memory-efficient than manually copying
     * data from multiple sources into a single buffer, and more
     * network-efficient than making multiple calls to g_socket_send().
     * <p>
     * {@code messages}, if non-{@code null}, is taken to point to an array of {@code num_messages}
     * {@link SocketControlMessage} instances. These correspond to the control
     * messages to be sent on the socket.
     * If {@code num_messages} is -1 then {@code messages} is treated as a {@code null}-terminated
     * array.
     * <p>
     * {@code flags} modify how the message is sent. The commonly available arguments
     * for this are available in the {@link SocketMsgFlags} enum, but the
     * values there are the same as the system values, and the flags
     * are passed in as-is, so you can pass in system-specific flags too.
     * <p>
     * If the socket is in blocking mode the call will block until there is
     * space for the data in the socket queue. If there is no space available
     * and the socket is in non-blocking mode a {@link IOErrorEnum#WOULD_BLOCK} error
     * will be returned. To be notified when space is available, wait for the
     * {@link org.gtk.glib.IOCondition#OUT} condition. Note though that you may still receive
     * {@link IOErrorEnum#WOULD_BLOCK} from g_socket_send() even if you were previously
     * notified of a {@link org.gtk.glib.IOCondition#OUT} condition. (On Windows in particular, this is
     * very common due to the way the underlying APIs work.)
     * <p>
     * The sum of the sizes of each {@link OutputVector} in vectors must not be
     * greater than {@code G_MAXSSIZE}. If the message can be larger than this,
     * then it is mandatory to use the g_socket_send_message_with_timeout()
     * function.
     * <p>
     * On error -1 is returned and {@code error} is set accordingly.
     */
    public long sendMessage(SocketAddress address, OutputVector[] vectors, int numVectors, SocketControlMessage[] messages, int numMessages, int flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_send_message(handle(), address.handle(), Interop.allocateNativeArray(vectors).handle(), numVectors, Interop.allocateNativeArray(messages).handle(), numMessages, flags, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * This behaves exactly the same as g_socket_send_message(), except that
     * the choice of timeout behavior is determined by the {@code timeout_us} argument
     * rather than by {@code socket}'s properties.
     * <p>
     * On error {@link PollableReturn#FAILED} is returned and {@code error} is set accordingly, or
     * if the socket is currently not writable {@link PollableReturn#WOULD_BLOCK} is
     * returned. {@code bytes_written} will contain 0 in both cases.
     */
    public PollableReturn sendMessageWithTimeout(SocketAddress address, OutputVector[] vectors, int numVectors, SocketControlMessage[] messages, int numMessages, int flags, long timeoutUs, PointerLong bytesWritten, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_send_message_with_timeout(handle(), address.handle(), Interop.allocateNativeArray(vectors).handle(), numVectors, Interop.allocateNativeArray(messages).handle(), numMessages, flags, timeoutUs, bytesWritten.handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new PollableReturn(RESULT);
    }
    
    /**
     * Send multiple data messages from {@code socket} in one go.  This is the most
     * complicated and fully-featured version of this call. For easier use, see
     * g_socket_send(), g_socket_send_to(), and g_socket_send_message().
     * <p>
     * {@code messages} must point to an array of {@link OutputMessage} structs and
     * {@code num_messages} must be the length of this array. Each {@link OutputMessage}
     * contains an address to send the data to, and a pointer to an array of
     * {@link OutputVector} structs to describe the buffers that the data to be sent
     * for each message will be gathered from. Using multiple {@code GOutputVectors} is
     * more memory-efficient than manually copying data from multiple sources
     * into a single buffer, and more network-efficient than making multiple
     * calls to g_socket_send(). Sending multiple messages in one go avoids the
     * overhead of making a lot of syscalls in scenarios where a lot of data
     * packets need to be sent (e.g. high-bandwidth video streaming over RTP/UDP),
     * or where the same data needs to be sent to multiple recipients.
     * <p>
     * {@code flags} modify how the message is sent. The commonly available arguments
     * for this are available in the {@link SocketMsgFlags} enum, but the
     * values there are the same as the system values, and the flags
     * are passed in as-is, so you can pass in system-specific flags too.
     * <p>
     * If the socket is in blocking mode the call will block until there is
     * space for all the data in the socket queue. If there is no space available
     * and the socket is in non-blocking mode a {@link IOErrorEnum#WOULD_BLOCK} error
     * will be returned if no data was written at all, otherwise the number of
     * messages sent will be returned. To be notified when space is available,
     * wait for the {@link org.gtk.glib.IOCondition#OUT} condition. Note though that you may still receive
     * {@link IOErrorEnum#WOULD_BLOCK} from g_socket_send() even if you were previously
     * notified of a {@link org.gtk.glib.IOCondition#OUT} condition. (On Windows in particular, this is
     * very common due to the way the underlying APIs work.)
     * <p>
     * On error -1 is returned and {@code error} is set accordingly. An error will only
     * be returned if zero messages could be sent; otherwise the number of messages
     * successfully sent before the error will be returned.
     */
    public int sendMessages(OutputMessage[] messages, int numMessages, int flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_send_messages(handle(), Interop.allocateNativeArray(messages).handle(), numMessages, flags, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Tries to send {@code size} bytes from {@code buffer} to {@code address}. If {@code address} is
     * {@code null} then the message is sent to the default receiver (set by
     * g_socket_connect()).
     * <p>
     * See g_socket_send() for additional information.
     */
    public long sendTo(SocketAddress address, byte[] buffer, long size, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_send_to(handle(), address.handle(), Interop.allocateNativeArray(buffer).handle(), size, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * This behaves exactly the same as g_socket_send(), except that
     * the choice of blocking or non-blocking behavior is determined by
     * the {@code blocking} argument rather than by {@code socket}'s properties.
     */
    public long sendWithBlocking(byte[] buffer, long size, boolean blocking, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_send_with_blocking(handle(), Interop.allocateNativeArray(buffer).handle(), size, blocking ? 1 : 0, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Sets the blocking mode of the socket. In blocking mode
     * all operations (which don’t take an explicit blocking parameter) block until
     * they succeed or there is an error. In
     * non-blocking mode all functions return results immediately or
     * with a {@link IOErrorEnum#WOULD_BLOCK} error.
     * <p>
     * All sockets are created in blocking mode. However, note that the
     * platform level socket is always non-blocking, and blocking mode
     * is a GSocket level feature.
     */
    public void setBlocking(boolean blocking) {
        gtk_h.g_socket_set_blocking(handle(), blocking ? 1 : 0);
    }
    
    /**
     * Sets whether {@code socket} should allow sending to broadcast addresses.
     * This is {@code false} by default.
     */
    public void setBroadcast(boolean broadcast) {
        gtk_h.g_socket_set_broadcast(handle(), broadcast ? 1 : 0);
    }
    
    /**
     * Sets or unsets the {@code SO_KEEPALIVE} flag on the underlying socket. When
     * this flag is set on a socket, the system will attempt to verify that the
     * remote socket endpoint is still present if a sufficiently long period of
     * time passes with no data being exchanged. If the system is unable to
     * verify the presence of the remote endpoint, it will automatically close
     * the connection.
     * <p>
     * This option is only functional on certain kinds of sockets. (Notably,
     * {@link SocketProtocol#TCP} sockets.)
     * <p>
     * The exact time between pings is system- and protocol-dependent, but will
     * normally be at least two hours. Most commonly, you would set this flag
     * on a server socket if you want to allow clients to remain idle for long
     * periods of time, but also want to ensure that connections are eventually
     * garbage-collected if clients crash or become unreachable.
     */
    public void setKeepalive(boolean keepalive) {
        gtk_h.g_socket_set_keepalive(handle(), keepalive ? 1 : 0);
    }
    
    /**
     * Sets the maximum number of outstanding connections allowed
     * when listening on this socket. If more clients than this are
     * connecting to the socket and the application is not handling them
     * on time then the new connections will be refused.
     * <p>
     * Note that this must be called before g_socket_listen() and has no
     * effect if called after that.
     */
    public void setListenBacklog(int backlog) {
        gtk_h.g_socket_set_listen_backlog(handle(), backlog);
    }
    
    /**
     * Sets whether outgoing multicast packets will be received by sockets
     * listening on that multicast address on the same host. This is {@code true}
     * by default.
     */
    public void setMulticastLoopback(boolean loopback) {
        gtk_h.g_socket_set_multicast_loopback(handle(), loopback ? 1 : 0);
    }
    
    /**
     * Sets the time-to-live for outgoing multicast datagrams on {@code socket}.
     * By default, this is 1, meaning that multicast packets will not leave
     * the local network.
     */
    public void setMulticastTtl(int ttl) {
        gtk_h.g_socket_set_multicast_ttl(handle(), ttl);
    }
    
    /**
     * Sets the value of an integer-valued option on {@code socket}, as with
     * setsockopt(). (If you need to set a non-integer-valued option,
     * you will need to call setsockopt() directly.)
     * <p>
     * The [&lt;gio/gnetworking.h&gt;][gio-gnetworking.h]
     * header pulls in system headers that will define most of the
     * standard/portable socket options. For unusual socket protocols or
     * platform-dependent options, you may need to include additional
     * headers.
     */
    public boolean setOption(int level, int optname, int value) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_set_option(handle(), level, optname, value, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets the time in seconds after which I/O operations on {@code socket} will
     * time out if they have not yet completed.
     * <p>
     * On a blocking socket, this means that any blocking {@link Socket}
     * operation will time out after {@code timeout} seconds of inactivity,
     * returning {@link IOErrorEnum#TIMED_OUT}.
     * <p>
     * On a non-blocking socket, calls to g_socket_condition_wait() will
     * also fail with {@link IOErrorEnum#TIMED_OUT} after the given time. Sources
     * created with g_socket_create_source() will trigger after
     * {@code timeout} seconds of inactivity, with the requested condition
     * set, at which point calling g_socket_receive(), g_socket_send(),
     * g_socket_check_connect_result(), etc, will fail with
     * {@link IOErrorEnum#TIMED_OUT}.
     * <p>
     * If {@code timeout} is 0 (the default), operations will never time out
     * on their own.
     * <p>
     * Note that if an I/O operation is interrupted by a signal, this may
     * cause the timeout to be reset.
     */
    public void setTimeout(int timeout) {
        gtk_h.g_socket_set_timeout(handle(), timeout);
    }
    
    /**
     * Sets the time-to-live for outgoing unicast packets on {@code socket}.
     * By default the platform-specific default value is used.
     */
    public void setTtl(int ttl) {
        gtk_h.g_socket_set_ttl(handle(), ttl);
    }
    
    /**
     * Shut down part or all of a full-duplex connection.
     * <p>
     * If {@code shutdown_read} is {@code true} then the receiving side of the connection
     * is shut down, and further reading is disallowed.
     * <p>
     * If {@code shutdown_write} is {@code true} then the sending side of the connection
     * is shut down, and further writing is disallowed.
     * <p>
     * It is allowed for both {@code shutdown_read} and {@code shutdown_write} to be {@code true}.
     * <p>
     * One example where it is useful to shut down only one side of a connection is
     * graceful disconnect for TCP connections where you close the sending side,
     * then wait for the other side to close the connection, thus ensuring that the
     * other side saw all sent data.
     */
    public boolean shutdown(boolean shutdownRead, boolean shutdownWrite) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_shutdown(handle(), shutdownRead ? 1 : 0, shutdownWrite ? 1 : 0, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks if a socket is capable of speaking IPv4.
     * <p>
     * IPv4 sockets are capable of speaking IPv4.  On some operating systems
     * and under some combinations of circumstances IPv6 sockets are also
     * capable of speaking IPv4.  See RFC 3493 section 3.7 for more
     * information.
     * <p>
     * No other types of sockets are currently considered as being capable
     * of speaking IPv4.
     */
    public boolean speaksIpv4() {
        var RESULT = gtk_h.g_socket_speaks_ipv4(handle());
        return RESULT != 0;
    }
    
}
