package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * @version 2.22
 */
public class Socket extends org.gtk.gobject.GObject implements org.gtk.gio.DatagramBased, org.gtk.gio.Initable {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSocket";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a Socket proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Socket(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Socket> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Socket(input);
    
    private static MemoryAddress constructNew(org.gtk.gio.SocketFamily family, org.gtk.gio.SocketType type, org.gtk.gio.SocketProtocol protocol) throws GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_socket_new.invokeExact(
                        family.getValue(),
                        type.getValue(),
                        protocol.getValue(),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        }
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
     * @param family the socket family to use, e.g. {@link SocketFamily#IPV4}.
     * @param type the socket type to use.
     * @param protocol the id of the protocol to use, or 0 for default.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public Socket(org.gtk.gio.SocketFamily family, org.gtk.gio.SocketType type, org.gtk.gio.SocketProtocol protocol) throws GErrorException {
        super(constructNew(family, type, protocol));
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewFromFd(int fd) throws GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_socket_new_from_fd.invokeExact(fd,(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        }
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
     * @param fd a native socket file descriptor.
     * @return a {@link Socket} or {@code null} on error.
     *     Free the returned object with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static Socket newFromFd(int fd) throws GErrorException {
        var RESULT = constructNewFromFd(fd);
        var OBJECT = (org.gtk.gio.Socket) Interop.register(RESULT, org.gtk.gio.Socket.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
     * @param cancellable a {@code GCancellable} or {@code null}
     * @return a new {@link Socket}, or {@code null} on error.
     *     Free the returned object with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.gio.Socket accept(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_socket_accept.invokeExact(
                        handle(),
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            var OBJECT = (org.gtk.gio.Socket) Interop.register(RESULT, org.gtk.gio.Socket.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
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
     * @param address a {@link SocketAddress} specifying the local address.
     * @param allowReuse whether to allow reusing this address
     * @return {@code true} on success, {@code false} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean bind(org.gtk.gio.SocketAddress address, boolean allowReuse) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_socket_bind.invokeExact(
                        handle(),
                        address.handle(),
                        Marshal.booleanToInteger.marshal(allowReuse, null).intValue(),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Checks and resets the pending connect error for the socket.
     * This is used to check for errors when g_socket_connect() is
     * used in non-blocking mode.
     * @return {@code true} if no error, {@code false} otherwise, setting {@code error} to the error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean checkConnectResult() throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_socket_check_connect_result.invokeExact(handle(),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
     * @return {@code true} on success, {@code false} on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean close() throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_socket_close.invokeExact(handle(),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
     * @param condition a {@link org.gtk.glib.IOCondition} mask to check
     * @return the {@code GIOCondition} mask of the current state
     */
    public org.gtk.glib.IOCondition conditionCheck(org.gtk.glib.IOCondition condition) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_condition_check.invokeExact(
                    handle(),
                    condition.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param condition a {@link org.gtk.glib.IOCondition} mask to wait for
     * @param timeoutUs the maximum time (in microseconds) to wait, or -1
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @return {@code true} if the condition was met, {@code false} otherwise
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean conditionTimedWait(org.gtk.glib.IOCondition condition, long timeoutUs, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_socket_condition_timed_wait.invokeExact(
                        handle(),
                        condition.getValue(),
                        timeoutUs,
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
     * @param condition a {@link org.gtk.glib.IOCondition} mask to wait for
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @return {@code true} if the condition was met, {@code false} otherwise
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean conditionWait(org.gtk.glib.IOCondition condition, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_socket_condition_wait.invokeExact(
                        handle(),
                        condition.getValue(),
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
     * @param address a {@link SocketAddress} specifying the remote address.
     * @param cancellable a {@code GCancellable} or {@code null}
     * @return {@code true} if connected, {@code false} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean connect(org.gtk.gio.SocketAddress address, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_socket_connect.invokeExact(
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
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Creates a {@link SocketConnection} subclass of the right type for
     * {@code socket}.
     * @return a {@link SocketConnection}
     */
    public org.gtk.gio.SocketConnection connectionFactoryCreateConnection() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_socket_connection_factory_create_connection.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gtk.gio.SocketConnection) Interop.register(RESULT, org.gtk.gio.SocketConnection.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
     * @param condition a {@link org.gtk.glib.IOCondition} mask to monitor
     * @param cancellable a {@code GCancellable} or {@code null}
     * @return a newly allocated {@code GSource}, free with g_source_unref().
     */
    public org.gtk.glib.Source createSource(org.gtk.glib.IOCondition condition, @Nullable org.gtk.gio.Cancellable cancellable) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_socket_create_source.invokeExact(
                    handle(),
                    condition.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.Source.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
     * @return the number of bytes that can be read from the socket
     * without blocking or truncating, or -1 on error.
     */
    public long getAvailableBytes() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_socket_get_available_bytes.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the blocking mode of the socket. For details on blocking I/O,
     * see g_socket_set_blocking().
     * @return {@code true} if blocking I/O is used, {@code false} otherwise.
     */
    public boolean getBlocking() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_get_blocking.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the broadcast setting on {@code socket}; if {@code true},
     * it is possible to send packets to broadcast
     * addresses.
     * @return the broadcast setting on {@code socket}
     */
    public boolean getBroadcast() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_get_broadcast.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
     * @return {@code null} if {@code error} is set, otherwise a {@link Credentials} object
     * that must be freed with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.gio.Credentials getCredentials() throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_socket_get_credentials.invokeExact(handle(),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            var OBJECT = (org.gtk.gio.Credentials) Interop.register(RESULT, org.gtk.gio.Credentials.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Gets the socket family of the socket.
     * @return a {@link SocketFamily}
     */
    public org.gtk.gio.SocketFamily getFamily() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_get_family.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gio.SocketFamily.of(RESULT);
    }
    
    /**
     * Returns the underlying OS socket object. On unix this
     * is a socket file descriptor, and on Windows this is
     * a Winsock2 SOCKET handle. This may be useful for
     * doing platform specific or otherwise unusual operations
     * on the socket.
     * @return the file descriptor of the socket.
     */
    public int getFd() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_get_fd.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the keepalive mode of the socket. For details on this,
     * see g_socket_set_keepalive().
     * @return {@code true} if keepalive is active, {@code false} otherwise.
     */
    public boolean getKeepalive() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_get_keepalive.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the listen backlog setting of the socket. For details on this,
     * see g_socket_set_listen_backlog().
     * @return the maximum number of pending connections.
     */
    public int getListenBacklog() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_get_listen_backlog.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Try to get the local address of a bound socket. This is only
     * useful if the socket has been bound to a local address,
     * either explicitly or implicitly when connecting.
     * @return a {@link SocketAddress} or {@code null} on error.
     *     Free the returned object with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.gio.SocketAddress getLocalAddress() throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_socket_get_local_address.invokeExact(handle(),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            var OBJECT = (org.gtk.gio.SocketAddress) Interop.register(RESULT, org.gtk.gio.SocketAddress.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Gets the multicast loopback setting on {@code socket}; if {@code true} (the
     * default), outgoing multicast packets will be looped back to
     * multicast listeners on the same host.
     * @return the multicast loopback setting on {@code socket}
     */
    public boolean getMulticastLoopback() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_get_multicast_loopback.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the multicast time-to-live setting on {@code socket}; see
     * g_socket_set_multicast_ttl() for more details.
     * @return the multicast time-to-live setting on {@code socket}
     */
    public int getMulticastTtl() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_get_multicast_ttl.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param level the "API level" of the option (eg, {@code SOL_SOCKET})
     * @param optname the "name" of the option (eg, {@code SO_BROADCAST})
     * @param value return location for the option value
     * @return success or failure. On failure, {@code error} will be set, and
     *   the system error value ({@code errno} or WSAGetLastError()) will still
     *   be set to the result of the getsockopt() call.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean getOption(int level, int optname, Out<Integer> value) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment valuePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_socket_get_option.invokeExact(
                        handle(),
                        level,
                        optname,
                        (Addressable) valuePOINTER.address(),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    value.set(valuePOINTER.get(Interop.valueLayout.C_INT, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Gets the socket protocol id the socket was created with.
     * In case the protocol is unknown, -1 is returned.
     * @return a protocol id, or -1 if unknown
     */
    public org.gtk.gio.SocketProtocol getProtocol() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_get_protocol.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gio.SocketProtocol.of(RESULT);
    }
    
    /**
     * Try to get the remote address of a connected socket. This is only
     * useful for connection oriented sockets that have been connected.
     * @return a {@link SocketAddress} or {@code null} on error.
     *     Free the returned object with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.gio.SocketAddress getRemoteAddress() throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_socket_get_remote_address.invokeExact(handle(),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            var OBJECT = (org.gtk.gio.SocketAddress) Interop.register(RESULT, org.gtk.gio.SocketAddress.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Gets the socket type of the socket.
     * @return a {@link SocketType}
     */
    public org.gtk.gio.SocketType getSocketType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_get_socket_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gio.SocketType.of(RESULT);
    }
    
    /**
     * Gets the timeout setting of the socket. For details on this, see
     * g_socket_set_timeout().
     * @return the timeout in seconds
     */
    public int getTimeout() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_get_timeout.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the unicast time-to-live setting on {@code socket}; see
     * g_socket_set_ttl() for more details.
     * @return the time-to-live setting on {@code socket}
     */
    public int getTtl() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_get_ttl.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks whether a socket is closed.
     * @return {@code true} if socket is closed, {@code false} otherwise
     */
    public boolean isClosed() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_is_closed.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Check whether the socket is connected. This is only useful for
     * connection-oriented sockets.
     * <p>
     * If using g_socket_shutdown(), this function will return {@code true} until the
     * socket has been shut down for reading and writing. If you do a non-blocking
     * connect, this function will not return {@code true} until after you call
     * g_socket_check_connect_result().
     * @return {@code true} if socket is connected, {@code false} otherwise.
     */
    public boolean isConnected() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_is_connected.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
     * @param group a {@link InetAddress} specifying the group address to join.
     * @param sourceSpecific {@code true} if source-specific multicast should be used
     * @param iface Name of the interface to use, or {@code null}
     * @return {@code true} on success, {@code false} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean joinMulticastGroup(org.gtk.gio.InetAddress group, boolean sourceSpecific, @Nullable java.lang.String iface) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_socket_join_multicast_group.invokeExact(
                        handle(),
                        group.handle(),
                        Marshal.booleanToInteger.marshal(sourceSpecific, null).intValue(),
                        (Addressable) (iface == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(iface, SCOPE)),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
     * @param group a {@link InetAddress} specifying the group address to join.
     * @param sourceSpecific a {@link InetAddress} specifying the
     * source-specific multicast address or {@code null} to ignore.
     * @param iface Name of the interface to use, or {@code null}
     * @return {@code true} on success, {@code false} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean joinMulticastGroupSsm(org.gtk.gio.InetAddress group, @Nullable org.gtk.gio.InetAddress sourceSpecific, @Nullable java.lang.String iface) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_socket_join_multicast_group_ssm.invokeExact(
                        handle(),
                        group.handle(),
                        (Addressable) (sourceSpecific == null ? MemoryAddress.NULL : sourceSpecific.handle()),
                        (Addressable) (iface == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(iface, SCOPE)),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
     * @param group a {@link InetAddress} specifying the group address to leave.
     * @param sourceSpecific {@code true} if source-specific multicast was used
     * @param iface Interface used
     * @return {@code true} on success, {@code false} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean leaveMulticastGroup(org.gtk.gio.InetAddress group, boolean sourceSpecific, @Nullable java.lang.String iface) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_socket_leave_multicast_group.invokeExact(
                        handle(),
                        group.handle(),
                        Marshal.booleanToInteger.marshal(sourceSpecific, null).intValue(),
                        (Addressable) (iface == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(iface, SCOPE)),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Removes {@code socket} from the multicast group defined by {@code group}, {@code iface},
     * and {@code source_specific} (which must all have the same values they had
     * when you joined the group).
     * <p>
     * {@code socket} remains bound to its address and port, and can still receive
     * unicast messages after calling this.
     * @param group a {@link InetAddress} specifying the group address to leave.
     * @param sourceSpecific a {@link InetAddress} specifying the
     * source-specific multicast address or {@code null} to ignore.
     * @param iface Name of the interface to use, or {@code null}
     * @return {@code true} on success, {@code false} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean leaveMulticastGroupSsm(org.gtk.gio.InetAddress group, @Nullable org.gtk.gio.InetAddress sourceSpecific, @Nullable java.lang.String iface) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_socket_leave_multicast_group_ssm.invokeExact(
                        handle(),
                        group.handle(),
                        (Addressable) (sourceSpecific == null ? MemoryAddress.NULL : sourceSpecific.handle()),
                        (Addressable) (iface == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(iface, SCOPE)),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
     * @return {@code true} on success, {@code false} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean listen() throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_socket_listen.invokeExact(handle(),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
     * @param buffer a buffer to read data into (which should be at least {@code size} bytes long).
     * @param size the number of bytes you want to read from the socket
     * @param cancellable a {@code GCancellable} or {@code null}
     * @return Number of bytes read, or 0 if the connection was closed by
     * the peer, or -1 on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public long receive(Out<byte[]> buffer, long size, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment bufferPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            long RESULT;
            try {
                RESULT = (long) DowncallHandles.g_socket_receive.invokeExact(
                        handle(),
                        (Addressable) bufferPOINTER.address(),
                        size,
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            buffer.set(MemorySegment.ofAddress(bufferPOINTER.get(Interop.valueLayout.ADDRESS, 0), size * Interop.valueLayout.C_BYTE.byteSize(), SCOPE).toArray(Interop.valueLayout.C_BYTE));
            return RESULT;
        }
    }
    
    /**
     * Receive data (up to {@code size} bytes) from a socket.
     * <p>
     * If {@code address} is non-{@code null} then {@code address} will be set equal to the
     * source address of the received packet.
     * {@code address} is owned by the caller.
     * <p>
     * See g_socket_receive() for additional information.
     * @param address a pointer to a {@link SocketAddress}
     *     pointer, or {@code null}
     * @param buffer a buffer to read data into (which should be at least {@code size} bytes long).
     * @param size the number of bytes you want to read from the socket
     * @param cancellable a {@code GCancellable} or {@code null}
     * @return Number of bytes read, or 0 if the connection was closed by
     * the peer, or -1 on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public long receiveFrom(@Nullable Out<org.gtk.gio.SocketAddress> address, Out<byte[]> buffer, long size, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment addressPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment bufferPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            long RESULT;
            try {
                RESULT = (long) DowncallHandles.g_socket_receive_from.invokeExact(
                        handle(),
                        (Addressable) (address == null ? MemoryAddress.NULL : (Addressable) addressPOINTER.address()),
                        (Addressable) bufferPOINTER.address(),
                        size,
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    if (address != null) address.set((org.gtk.gio.SocketAddress) Interop.register(addressPOINTER.get(Interop.valueLayout.ADDRESS, 0), org.gtk.gio.SocketAddress.fromAddress).marshal(addressPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            buffer.set(MemorySegment.ofAddress(bufferPOINTER.get(Interop.valueLayout.ADDRESS, 0), size * Interop.valueLayout.C_BYTE.byteSize(), SCOPE).toArray(Interop.valueLayout.C_BYTE));
            return RESULT;
        }
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
     * @param address a pointer to a {@link SocketAddress}
     *     pointer, or {@code null}
     * @param vectors an array of {@link InputVector} structs
     * @param numVectors the number of elements in {@code vectors}, or -1
     * @param messages a pointer
     *    which may be filled with an array of {@code GSocketControlMessages}, or {@code null}
     * @param numMessages a pointer which will be filled with the number of
     *    elements in {@code messages}, or {@code null}
     * @param flags a pointer to an int containing {@link SocketMsgFlags} flags,
     *    which may additionally contain
     *    <a href="http://man7.org/linux/man-pages/man2/recv.2.html">other platform specific flags</a>
     * @param cancellable a {@code GCancellable} or {@code null}
     * @return Number of bytes read, or 0 if the connection was closed by
     * the peer, or -1 on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public long receiveMessage(@Nullable Out<org.gtk.gio.SocketAddress> address, org.gtk.gio.InputVector[] vectors, int numVectors, @Nullable Out<org.gtk.gio.SocketControlMessage[]> messages, Out<Integer> numMessages, Out<Integer> flags, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment addressPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment messagesPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment numMessagesPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment flagsPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            long RESULT;
            try {
                RESULT = (long) DowncallHandles.g_socket_receive_message.invokeExact(
                        handle(),
                        (Addressable) (address == null ? MemoryAddress.NULL : (Addressable) addressPOINTER.address()),
                        Interop.allocateNativeArray(vectors, org.gtk.gio.InputVector.getMemoryLayout(), false, SCOPE),
                        numVectors,
                        (Addressable) (messages == null ? MemoryAddress.NULL : (Addressable) messagesPOINTER.address()),
                        (Addressable) numMessagesPOINTER.address(),
                        (Addressable) flagsPOINTER.address(),
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    if (address != null) address.set((org.gtk.gio.SocketAddress) Interop.register(addressPOINTER.get(Interop.valueLayout.ADDRESS, 0), org.gtk.gio.SocketAddress.fromAddress).marshal(addressPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    numMessages.set(numMessagesPOINTER.get(Interop.valueLayout.C_INT, 0));
                    flags.set(flagsPOINTER.get(Interop.valueLayout.C_INT, 0));
            org.gtk.gio.SocketControlMessage[] messagesARRAY = new org.gtk.gio.SocketControlMessage[numMessages.get().intValue()];
            for (int I = 0; I < numMessages.get().intValue(); I++) {
                var OBJ = messagesPOINTER.get(Interop.valueLayout.ADDRESS, I);
                messagesARRAY[I] = (org.gtk.gio.SocketControlMessage) Interop.register(OBJ, org.gtk.gio.SocketControlMessage.fromAddress).marshal(OBJ, null);
                }
            messages.set(messagesARRAY);
            return RESULT;
        }
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
     * @param messages an array of {@link InputMessage} structs
     * @param numMessages the number of elements in {@code messages}
     * @param flags an int containing {@link SocketMsgFlags} flags for the overall operation,
     *    which may additionally contain
     *    <a href="http://man7.org/linux/man-pages/man2/recv.2.html">other platform specific flags</a>
     * @param cancellable a {@code GCancellable} or {@code null}
     * @return number of messages received, or -1 on error. Note that the number
     *     of messages received may be smaller than {@code num_messages} if in non-blocking
     *     mode, if the peer closed the connection, or if {@code num_messages}
     *     was larger than {@code UIO_MAXIOV} (1024), in which case the caller may re-try
     *     to receive the remaining messages.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public int receiveMessages(org.gtk.gio.InputMessage[] messages, int numMessages, int flags, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_socket_receive_messages.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(messages, org.gtk.gio.InputMessage.getMemoryLayout(), false, SCOPE),
                        numMessages,
                        flags,
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        }
    }
    
    /**
     * This behaves exactly the same as g_socket_receive(), except that
     * the choice of blocking or non-blocking behavior is determined by
     * the {@code blocking} argument rather than by {@code socket}'s properties.
     * @param buffer a buffer to read data into (which should be at least {@code size} bytes long).
     * @param size the number of bytes you want to read from the socket
     * @param blocking whether to do blocking or non-blocking I/O
     * @param cancellable a {@code GCancellable} or {@code null}
     * @return Number of bytes read, or 0 if the connection was closed by
     * the peer, or -1 on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public long receiveWithBlocking(Out<byte[]> buffer, long size, boolean blocking, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment bufferPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            long RESULT;
            try {
                RESULT = (long) DowncallHandles.g_socket_receive_with_blocking.invokeExact(
                        handle(),
                        (Addressable) bufferPOINTER.address(),
                        size,
                        Marshal.booleanToInteger.marshal(blocking, null).intValue(),
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            buffer.set(MemorySegment.ofAddress(bufferPOINTER.get(Interop.valueLayout.ADDRESS, 0), size * Interop.valueLayout.C_BYTE.byteSize(), SCOPE).toArray(Interop.valueLayout.C_BYTE));
            return RESULT;
        }
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
     * @param buffer the buffer
     *     containing the data to send.
     * @param size the number of bytes to send
     * @param cancellable a {@code GCancellable} or {@code null}
     * @return Number of bytes written (which may be less than {@code size}), or -1
     * on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public long send(byte[] buffer, long size, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            long RESULT;
            try {
                RESULT = (long) DowncallHandles.g_socket_send.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(buffer, false, SCOPE),
                        size,
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        }
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
     * @param address a {@link SocketAddress}, or {@code null}
     * @param vectors an array of {@link OutputVector} structs
     * @param numVectors the number of elements in {@code vectors}, or -1
     * @param messages a pointer to an
     *   array of {@code GSocketControlMessages}, or {@code null}.
     * @param numMessages number of elements in {@code messages}, or -1.
     * @param flags an int containing {@link SocketMsgFlags} flags, which may additionally
     *    contain <a href="http://man7.org/linux/man-pages/man2/recv.2.html">other platform specific flags</a>
     * @param cancellable a {@code GCancellable} or {@code null}
     * @return Number of bytes written (which may be less than {@code size}), or -1
     * on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public long sendMessage(@Nullable org.gtk.gio.SocketAddress address, org.gtk.gio.OutputVector[] vectors, int numVectors, @Nullable org.gtk.gio.SocketControlMessage[] messages, int numMessages, int flags, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            long RESULT;
            try {
                RESULT = (long) DowncallHandles.g_socket_send_message.invokeExact(
                        handle(),
                        (Addressable) (address == null ? MemoryAddress.NULL : address.handle()),
                        Interop.allocateNativeArray(vectors, org.gtk.gio.OutputVector.getMemoryLayout(), false, SCOPE),
                        numVectors,
                        (Addressable) (messages == null ? MemoryAddress.NULL : Interop.allocateNativeArray(messages, false, SCOPE)),
                        numMessages,
                        flags,
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        }
    }
    
    /**
     * This behaves exactly the same as g_socket_send_message(), except that
     * the choice of timeout behavior is determined by the {@code timeout_us} argument
     * rather than by {@code socket}'s properties.
     * <p>
     * On error {@link PollableReturn#FAILED} is returned and {@code error} is set accordingly, or
     * if the socket is currently not writable {@link PollableReturn#WOULD_BLOCK} is
     * returned. {@code bytes_written} will contain 0 in both cases.
     * @param address a {@link SocketAddress}, or {@code null}
     * @param vectors an array of {@link OutputVector} structs
     * @param numVectors the number of elements in {@code vectors}, or -1
     * @param messages a pointer to an
     *   array of {@code GSocketControlMessages}, or {@code null}.
     * @param numMessages number of elements in {@code messages}, or -1.
     * @param flags an int containing {@link SocketMsgFlags} flags, which may additionally
     *    contain <a href="http://man7.org/linux/man-pages/man2/recv.2.html">other platform specific flags</a>
     * @param timeoutUs the maximum time (in microseconds) to wait, or -1
     * @param bytesWritten location to store the number of bytes that were written to the socket
     * @param cancellable a {@code GCancellable} or {@code null}
     * @return {@link PollableReturn#OK} if all data was successfully written,
     * {@link PollableReturn#WOULD_BLOCK} if the socket is currently not writable, or
     * {@link PollableReturn#FAILED} if an error happened and {@code error} is set.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.gio.PollableReturn sendMessageWithTimeout(@Nullable org.gtk.gio.SocketAddress address, org.gtk.gio.OutputVector[] vectors, int numVectors, @Nullable org.gtk.gio.SocketControlMessage[] messages, int numMessages, int flags, long timeoutUs, Out<Long> bytesWritten, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment bytesWrittenPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_socket_send_message_with_timeout.invokeExact(
                        handle(),
                        (Addressable) (address == null ? MemoryAddress.NULL : address.handle()),
                        Interop.allocateNativeArray(vectors, org.gtk.gio.OutputVector.getMemoryLayout(), false, SCOPE),
                        numVectors,
                        (Addressable) (messages == null ? MemoryAddress.NULL : Interop.allocateNativeArray(messages, false, SCOPE)),
                        numMessages,
                        flags,
                        timeoutUs,
                        (Addressable) (bytesWritten == null ? MemoryAddress.NULL : (Addressable) bytesWrittenPOINTER.address()),
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    if (bytesWritten != null) bytesWritten.set(bytesWrittenPOINTER.get(Interop.valueLayout.C_LONG, 0));
            return org.gtk.gio.PollableReturn.of(RESULT);
        }
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
     * @param messages an array of {@link OutputMessage} structs
     * @param numMessages the number of elements in {@code messages}
     * @param flags an int containing {@link SocketMsgFlags} flags, which may additionally
     *    contain <a href="http://man7.org/linux/man-pages/man2/recv.2.html">other platform specific flags</a>
     * @param cancellable a {@code GCancellable} or {@code null}
     * @return number of messages sent, or -1 on error. Note that the number of
     *     messages sent may be smaller than {@code num_messages} if the socket is
     *     non-blocking or if {@code num_messages} was larger than UIO_MAXIOV (1024),
     *     in which case the caller may re-try to send the remaining messages.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public int sendMessages(org.gtk.gio.OutputMessage[] messages, int numMessages, int flags, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_socket_send_messages.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(messages, org.gtk.gio.OutputMessage.getMemoryLayout(), false, SCOPE),
                        numMessages,
                        flags,
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        }
    }
    
    /**
     * Tries to send {@code size} bytes from {@code buffer} to {@code address}. If {@code address} is
     * {@code null} then the message is sent to the default receiver (set by
     * g_socket_connect()).
     * <p>
     * See g_socket_send() for additional information.
     * @param address a {@link SocketAddress}, or {@code null}
     * @param buffer the buffer
     *     containing the data to send.
     * @param size the number of bytes to send
     * @param cancellable a {@code GCancellable} or {@code null}
     * @return Number of bytes written (which may be less than {@code size}), or -1
     * on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public long sendTo(@Nullable org.gtk.gio.SocketAddress address, byte[] buffer, long size, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            long RESULT;
            try {
                RESULT = (long) DowncallHandles.g_socket_send_to.invokeExact(
                        handle(),
                        (Addressable) (address == null ? MemoryAddress.NULL : address.handle()),
                        Interop.allocateNativeArray(buffer, false, SCOPE),
                        size,
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        }
    }
    
    /**
     * This behaves exactly the same as g_socket_send(), except that
     * the choice of blocking or non-blocking behavior is determined by
     * the {@code blocking} argument rather than by {@code socket}'s properties.
     * @param buffer the buffer
     *     containing the data to send.
     * @param size the number of bytes to send
     * @param blocking whether to do blocking or non-blocking I/O
     * @param cancellable a {@code GCancellable} or {@code null}
     * @return Number of bytes written (which may be less than {@code size}), or -1
     * on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public long sendWithBlocking(byte[] buffer, long size, boolean blocking, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            long RESULT;
            try {
                RESULT = (long) DowncallHandles.g_socket_send_with_blocking.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(buffer, false, SCOPE),
                        size,
                        Marshal.booleanToInteger.marshal(blocking, null).intValue(),
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        }
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
     * @param blocking Whether to use blocking I/O or not.
     */
    public void setBlocking(boolean blocking) {
        try {
            DowncallHandles.g_socket_set_blocking.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(blocking, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether {@code socket} should allow sending to broadcast addresses.
     * This is {@code false} by default.
     * @param broadcast whether {@code socket} should allow sending to broadcast
     *     addresses
     */
    public void setBroadcast(boolean broadcast) {
        try {
            DowncallHandles.g_socket_set_broadcast.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(broadcast, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param keepalive Value for the keepalive flag
     */
    public void setKeepalive(boolean keepalive) {
        try {
            DowncallHandles.g_socket_set_keepalive.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(keepalive, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the maximum number of outstanding connections allowed
     * when listening on this socket. If more clients than this are
     * connecting to the socket and the application is not handling them
     * on time then the new connections will be refused.
     * <p>
     * Note that this must be called before g_socket_listen() and has no
     * effect if called after that.
     * @param backlog the maximum number of pending connections.
     */
    public void setListenBacklog(int backlog) {
        try {
            DowncallHandles.g_socket_set_listen_backlog.invokeExact(
                    handle(),
                    backlog);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether outgoing multicast packets will be received by sockets
     * listening on that multicast address on the same host. This is {@code true}
     * by default.
     * @param loopback whether {@code socket} should receive messages sent to its
     *   multicast groups from the local host
     */
    public void setMulticastLoopback(boolean loopback) {
        try {
            DowncallHandles.g_socket_set_multicast_loopback.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(loopback, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the time-to-live for outgoing multicast datagrams on {@code socket}.
     * By default, this is 1, meaning that multicast packets will not leave
     * the local network.
     * @param ttl the time-to-live value for all multicast datagrams on {@code socket}
     */
    public void setMulticastTtl(int ttl) {
        try {
            DowncallHandles.g_socket_set_multicast_ttl.invokeExact(
                    handle(),
                    ttl);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param level the "API level" of the option (eg, {@code SOL_SOCKET})
     * @param optname the "name" of the option (eg, {@code SO_BROADCAST})
     * @param value the value to set the option to
     * @return success or failure. On failure, {@code error} will be set, and
     *   the system error value ({@code errno} or WSAGetLastError()) will still
     *   be set to the result of the setsockopt() call.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean setOption(int level, int optname, int value) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_socket_set_option.invokeExact(
                        handle(),
                        level,
                        optname,
                        value,
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
     * @param timeout the timeout for {@code socket}, in seconds, or 0 for none
     */
    public void setTimeout(int timeout) {
        try {
            DowncallHandles.g_socket_set_timeout.invokeExact(
                    handle(),
                    timeout);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the time-to-live for outgoing unicast packets on {@code socket}.
     * By default the platform-specific default value is used.
     * @param ttl the time-to-live value for all unicast packets on {@code socket}
     */
    public void setTtl(int ttl) {
        try {
            DowncallHandles.g_socket_set_ttl.invokeExact(
                    handle(),
                    ttl);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param shutdownRead whether to shut down the read side
     * @param shutdownWrite whether to shut down the write side
     * @return {@code true} on success, {@code false} on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean shutdown(boolean shutdownRead, boolean shutdownWrite) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_socket_shutdown.invokeExact(
                        handle(),
                        Marshal.booleanToInteger.marshal(shutdownRead, null).intValue(),
                        Marshal.booleanToInteger.marshal(shutdownWrite, null).intValue(),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
     * @return {@code true} if this socket can be used with IPv4.
     */
    public boolean speaksIpv4() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_speaks_ipv4.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_socket_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link Socket.Builder} object constructs a {@link Socket} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Socket.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Socket} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Socket}.
         * @return A new instance of {@code Socket} with the properties 
         *         that were set in the Builder object.
         */
        public Socket build() {
            return (Socket) org.gtk.gobject.GObject.newWithProperties(
                Socket.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setBlocking(boolean blocking) {
            names.add("blocking");
            values.add(org.gtk.gobject.Value.create(blocking));
            return this;
        }
        
        /**
         * Whether the socket should allow sending to broadcast addresses.
         * @param broadcast The value for the {@code broadcast} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBroadcast(boolean broadcast) {
            names.add("broadcast");
            values.add(org.gtk.gobject.Value.create(broadcast));
            return this;
        }
        
        public Builder setFamily(org.gtk.gio.SocketFamily family) {
            names.add("family");
            values.add(org.gtk.gobject.Value.create(family));
            return this;
        }
        
        public Builder setFd(int fd) {
            names.add("fd");
            values.add(org.gtk.gobject.Value.create(fd));
            return this;
        }
        
        public Builder setKeepalive(boolean keepalive) {
            names.add("keepalive");
            values.add(org.gtk.gobject.Value.create(keepalive));
            return this;
        }
        
        public Builder setListenBacklog(int listenBacklog) {
            names.add("listen-backlog");
            values.add(org.gtk.gobject.Value.create(listenBacklog));
            return this;
        }
        
        public Builder setLocalAddress(org.gtk.gio.SocketAddress localAddress) {
            names.add("local-address");
            values.add(org.gtk.gobject.Value.create(localAddress));
            return this;
        }
        
        /**
         * Whether outgoing multicast packets loop back to the local host.
         * @param multicastLoopback The value for the {@code multicast-loopback} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMulticastLoopback(boolean multicastLoopback) {
            names.add("multicast-loopback");
            values.add(org.gtk.gobject.Value.create(multicastLoopback));
            return this;
        }
        
        /**
         * Time-to-live out outgoing multicast packets
         * @param multicastTtl The value for the {@code multicast-ttl} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMulticastTtl(int multicastTtl) {
            names.add("multicast-ttl");
            values.add(org.gtk.gobject.Value.create(multicastTtl));
            return this;
        }
        
        public Builder setProtocol(org.gtk.gio.SocketProtocol protocol) {
            names.add("protocol");
            values.add(org.gtk.gobject.Value.create(protocol));
            return this;
        }
        
        public Builder setRemoteAddress(org.gtk.gio.SocketAddress remoteAddress) {
            names.add("remote-address");
            values.add(org.gtk.gobject.Value.create(remoteAddress));
            return this;
        }
        
        /**
         * The timeout in seconds on socket I/O
         * @param timeout The value for the {@code timeout} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTimeout(int timeout) {
            names.add("timeout");
            values.add(org.gtk.gobject.Value.create(timeout));
            return this;
        }
        
        /**
         * Time-to-live for outgoing unicast packets
         * @param ttl The value for the {@code ttl} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTtl(int ttl) {
            names.add("ttl");
            values.add(org.gtk.gobject.Value.create(ttl));
            return this;
        }
        
        public Builder setType(org.gtk.gio.SocketType type) {
            names.add("type");
            values.add(org.gtk.gobject.Value.create(type));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_socket_new = Interop.downcallHandle(
                "g_socket_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_new_from_fd = Interop.downcallHandle(
                "g_socket_new_from_fd",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_accept = Interop.downcallHandle(
                "g_socket_accept",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_bind = Interop.downcallHandle(
                "g_socket_bind",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_check_connect_result = Interop.downcallHandle(
                "g_socket_check_connect_result",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_close = Interop.downcallHandle(
                "g_socket_close",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_condition_check = Interop.downcallHandle(
                "g_socket_condition_check",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_socket_condition_timed_wait = Interop.downcallHandle(
                "g_socket_condition_timed_wait",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_condition_wait = Interop.downcallHandle(
                "g_socket_condition_wait",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_connect = Interop.downcallHandle(
                "g_socket_connect",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_connection_factory_create_connection = Interop.downcallHandle(
                "g_socket_connection_factory_create_connection",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_create_source = Interop.downcallHandle(
                "g_socket_create_source",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_get_available_bytes = Interop.downcallHandle(
                "g_socket_get_available_bytes",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_get_blocking = Interop.downcallHandle(
                "g_socket_get_blocking",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_get_broadcast = Interop.downcallHandle(
                "g_socket_get_broadcast",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_get_credentials = Interop.downcallHandle(
                "g_socket_get_credentials",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_get_family = Interop.downcallHandle(
                "g_socket_get_family",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_get_fd = Interop.downcallHandle(
                "g_socket_get_fd",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_get_keepalive = Interop.downcallHandle(
                "g_socket_get_keepalive",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_get_listen_backlog = Interop.downcallHandle(
                "g_socket_get_listen_backlog",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_get_local_address = Interop.downcallHandle(
                "g_socket_get_local_address",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_get_multicast_loopback = Interop.downcallHandle(
                "g_socket_get_multicast_loopback",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_get_multicast_ttl = Interop.downcallHandle(
                "g_socket_get_multicast_ttl",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_get_option = Interop.downcallHandle(
                "g_socket_get_option",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_get_protocol = Interop.downcallHandle(
                "g_socket_get_protocol",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_get_remote_address = Interop.downcallHandle(
                "g_socket_get_remote_address",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_get_socket_type = Interop.downcallHandle(
                "g_socket_get_socket_type",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_get_timeout = Interop.downcallHandle(
                "g_socket_get_timeout",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_get_ttl = Interop.downcallHandle(
                "g_socket_get_ttl",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_is_closed = Interop.downcallHandle(
                "g_socket_is_closed",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_is_connected = Interop.downcallHandle(
                "g_socket_is_connected",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_join_multicast_group = Interop.downcallHandle(
                "g_socket_join_multicast_group",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_join_multicast_group_ssm = Interop.downcallHandle(
                "g_socket_join_multicast_group_ssm",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_leave_multicast_group = Interop.downcallHandle(
                "g_socket_leave_multicast_group",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_leave_multicast_group_ssm = Interop.downcallHandle(
                "g_socket_leave_multicast_group_ssm",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_listen = Interop.downcallHandle(
                "g_socket_listen",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_receive = Interop.downcallHandle(
                "g_socket_receive",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_receive_from = Interop.downcallHandle(
                "g_socket_receive_from",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_receive_message = Interop.downcallHandle(
                "g_socket_receive_message",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_receive_messages = Interop.downcallHandle(
                "g_socket_receive_messages",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_receive_with_blocking = Interop.downcallHandle(
                "g_socket_receive_with_blocking",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_send = Interop.downcallHandle(
                "g_socket_send",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_send_message = Interop.downcallHandle(
                "g_socket_send_message",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_send_message_with_timeout = Interop.downcallHandle(
                "g_socket_send_message_with_timeout",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_send_messages = Interop.downcallHandle(
                "g_socket_send_messages",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_send_to = Interop.downcallHandle(
                "g_socket_send_to",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_send_with_blocking = Interop.downcallHandle(
                "g_socket_send_with_blocking",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_set_blocking = Interop.downcallHandle(
                "g_socket_set_blocking",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_socket_set_broadcast = Interop.downcallHandle(
                "g_socket_set_broadcast",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_socket_set_keepalive = Interop.downcallHandle(
                "g_socket_set_keepalive",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_socket_set_listen_backlog = Interop.downcallHandle(
                "g_socket_set_listen_backlog",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_socket_set_multicast_loopback = Interop.downcallHandle(
                "g_socket_set_multicast_loopback",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_socket_set_multicast_ttl = Interop.downcallHandle(
                "g_socket_set_multicast_ttl",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_socket_set_option = Interop.downcallHandle(
                "g_socket_set_option",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_set_timeout = Interop.downcallHandle(
                "g_socket_set_timeout",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_socket_set_ttl = Interop.downcallHandle(
                "g_socket_set_ttl",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_socket_shutdown = Interop.downcallHandle(
                "g_socket_shutdown",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_speaks_ipv4 = Interop.downcallHandle(
                "g_socket_speaks_ipv4",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_get_type = Interop.downcallHandle(
                "g_socket_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_socket_get_type != null;
    }
}
