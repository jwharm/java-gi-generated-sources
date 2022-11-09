package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link DatagramBased} is a networking interface for representing datagram-based
 * communications. It is a more or less direct mapping of the core parts of the
 * BSD socket API in a portable GObject interface. It is implemented by
 * {@link Socket}, which wraps the UNIX socket API on UNIX and winsock2 on Windows.
 * <p>
 * {@link DatagramBased} is entirely platform independent, and is intended to be used
 * alongside higher-level networking APIs such as {@link IOStream}.
 * <p>
 * It uses vectored scatter/gather I/O by default, allowing for many messages
 * to be sent or received in a single call. Where possible, implementations of
 * the interface should take advantage of vectored I/O to minimise processing
 * or system calls. For example, {@link Socket} uses recvmmsg() and sendmmsg() where
 * possible. Callers should take advantage of scatter/gather I/O (the use of
 * multiple buffers per message) to avoid unnecessary copying of data to
 * assemble or disassemble a message.
 * <p>
 * Each {@link DatagramBased} operation has a timeout parameter which may be negative
 * for blocking behaviour, zero for non-blocking behaviour, or positive for
 * timeout behaviour. A blocking operation blocks until finished or there is an
 * error. A non-blocking operation will return immediately with a
 * {@link IOErrorEnum#WOULD_BLOCK} error if it cannot make progress. A timeout operation
 * will block until the operation is complete or the timeout expires; if the
 * timeout expires it will return what progress it made, or
 * {@link IOErrorEnum#TIMED_OUT} if no progress was made. To know when a call would
 * successfully run you can call g_datagram_based_condition_check() or
 * g_datagram_based_condition_wait(). You can also use
 * g_datagram_based_create_source() and attach it to a {@link org.gtk.glib.MainContext} to get
 * callbacks when I/O is possible.
 * <p>
 * When running a non-blocking operation applications should always be able to
 * handle getting a {@link IOErrorEnum#WOULD_BLOCK} error even when some other function
 * said that I/O was possible. This can easily happen in case of a race
 * condition in the application, but it can also happen for other reasons. For
 * instance, on Windows a socket is always seen as writable until a write
 * returns {@link IOErrorEnum#WOULD_BLOCK}.
 * <p>
 * As with {@link Socket}, {@code GDatagramBaseds} can be either connection oriented (for
 * example, SCTP) or connectionless (for example, UDP). {@code GDatagramBaseds} must be
 * datagram-based, not stream-based. The interface does not cover connection
 * establishment — use methods on the underlying type to establish a connection
 * before sending and receiving data through the {@link DatagramBased} API. For
 * connectionless socket types the target/source address is specified or
 * received in each I/O operation.
 * <p>
 * Like most other APIs in GLib, {@link DatagramBased} is not inherently thread safe.
 * To use a {@link DatagramBased} concurrently from multiple threads, you must
 * implement your own locking.
 * @version 2.48
 */
public interface DatagramBased extends io.github.jwharm.javagi.Proxy {
    
    /**
     * Cast object to DatagramBased if its GType is a (or inherits from) "GDatagramBased".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "DatagramBased" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GDatagramBased", a ClassCastException will be thrown.
     */
    public static DatagramBased castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GDatagramBased"))) {
            return new DatagramBasedImpl(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GDatagramBased");
        }
    }
    
    /**
     * Checks on the readiness of {@code datagram_based} to perform operations. The
     * operations specified in {@code condition} are checked for and masked against the
     * currently-satisfied conditions on {@code datagram_based}. The result is returned.
     * <p>
     * {@link org.gtk.glib.IOCondition#IN} will be set in the return value if data is available to read with
     * g_datagram_based_receive_messages(), or if the connection is closed remotely
     * (EOS); and if the datagram_based has not been closed locally using some
     * implementation-specific method (such as g_socket_close() or
     * g_socket_shutdown() with {@code shutdown_read} set, if it’s a {@link Socket}).
     * <p>
     * If the connection is shut down or closed (by calling g_socket_close() or
     * g_socket_shutdown() with {@code shutdown_read} set, if it’s a {@link Socket}, for
     * example), all calls to this function will return {@link IOErrorEnum#CLOSED}.
     * <p>
     * {@link org.gtk.glib.IOCondition#OUT} will be set if it is expected that at least one byte can be sent
     * using g_datagram_based_send_messages() without blocking. It will not be set
     * if the datagram_based has been closed locally.
     * <p>
     * {@link org.gtk.glib.IOCondition#HUP} will be set if the connection has been closed locally.
     * <p>
     * {@link org.gtk.glib.IOCondition#ERR} will be set if there was an asynchronous error in transmitting data
     * previously enqueued using g_datagram_based_send_messages().
     * <p>
     * Note that on Windows, it is possible for an operation to return
     * {@link IOErrorEnum#WOULD_BLOCK} even immediately after
     * g_datagram_based_condition_check() has claimed that the {@link DatagramBased} is
     * ready for writing. Rather than calling g_datagram_based_condition_check() and
     * then writing to the {@link DatagramBased} if it succeeds, it is generally better to
     * simply try writing right away, and try again later if the initial attempt
     * returns {@link IOErrorEnum#WOULD_BLOCK}.
     * <p>
     * It is meaningless to specify {@link org.gtk.glib.IOCondition#ERR} or {@link org.gtk.glib.IOCondition#HUP} in {@code condition}; these
     * conditions will always be set in the output if they are true. Apart from
     * these flags, the output is guaranteed to be masked by {@code condition}.
     * <p>
     * This call never blocks.
     * @param condition a {@link org.gtk.glib.IOCondition} mask to check
     * @return the {@link org.gtk.glib.IOCondition} mask of the current state
     */
    default @NotNull org.gtk.glib.IOCondition conditionCheck(@NotNull org.gtk.glib.IOCondition condition) {
        java.util.Objects.requireNonNull(condition, "Parameter 'condition' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_datagram_based_condition_check.invokeExact(
                    handle(),
                    condition.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.IOCondition(RESULT);
    }
    
    /**
     * Waits for up to {@code timeout} microseconds for condition to become true on
     * {@code datagram_based}. If the condition is met, {@code true} is returned.
     * <p>
     * If {@code cancellable} is cancelled before the condition is met, or if {@code timeout} is
     * reached before the condition is met, then {@code false} is returned and {@code error} is
     * set appropriately ({@link IOErrorEnum#CANCELLED} or {@link IOErrorEnum#TIMED_OUT}).
     * @param condition a {@link org.gtk.glib.IOCondition} mask to wait for
     * @param timeout the maximum time (in microseconds) to wait, 0 to not block, or -1
     *   to block indefinitely
     * @param cancellable a {@link Cancellable}
     * @return {@code true} if the condition was met, {@code false} otherwise
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean conditionWait(@NotNull org.gtk.glib.IOCondition condition, long timeout, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(condition, "Parameter 'condition' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_datagram_based_condition_wait.invokeExact(
                    handle(),
                    condition.getValue(),
                    timeout,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Creates a {@link org.gtk.glib.Source} that can be attached to a {@link org.gtk.glib.MainContext} to monitor for
     * the availability of the specified {@code condition} on the {@link DatagramBased}. The
     * {@link org.gtk.glib.Source} keeps a reference to the {@code datagram_based}.
     * <p>
     * The callback on the source is of the {@link DatagramBasedSourceFunc} type.
     * <p>
     * It is meaningless to specify {@link org.gtk.glib.IOCondition#ERR} or {@link org.gtk.glib.IOCondition#HUP} in {@code condition}; these
     * conditions will always be reported in the callback if they are true.
     * <p>
     * If non-{@code null}, {@code cancellable} can be used to cancel the source, which will
     * cause the source to trigger, reporting the current condition (which is
     * likely 0 unless cancellation happened at the same time as a condition
     * change). You can check for this in the callback using
     * g_cancellable_is_cancelled().
     * @param condition a {@link org.gtk.glib.IOCondition} mask to monitor
     * @param cancellable a {@link Cancellable}
     * @return a newly allocated {@link org.gtk.glib.Source}
     */
    default @NotNull org.gtk.glib.Source createSource(@NotNull org.gtk.glib.IOCondition condition, @Nullable org.gtk.gio.Cancellable cancellable) {
        java.util.Objects.requireNonNull(condition, "Parameter 'condition' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_datagram_based_create_source.invokeExact(
                    handle(),
                    condition.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Source(RESULT, Ownership.FULL);
    }
    
    /**
     * Receive one or more data messages from {@code datagram_based} in one go.
     * <p>
     * {@code messages} must point to an array of {@link InputMessage} structs and
     * {@code num_messages} must be the length of this array. Each {@link InputMessage}
     * contains a pointer to an array of {@link InputVector} structs describing the
     * buffers that the data received in each message will be written to.
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
     * If {@code timeout} is negative the call will block until {@code num_messages} have been
     * received, the connection is closed remotely (EOS), {@code cancellable} is cancelled,
     * or an error occurs.
     * <p>
     * If {@code timeout} is 0 the call will return up to {@code num_messages} without blocking,
     * or {@link IOErrorEnum#WOULD_BLOCK} if no messages are queued in the operating system
     * to be received.
     * <p>
     * If {@code timeout} is positive the call will block on the same conditions as if
     * {@code timeout} were negative. If the timeout is reached
     * before any messages are received, {@link IOErrorEnum#TIMED_OUT} is returned,
     * otherwise it will return the number of messages received before timing out.
     * (Note: This is effectively the behaviour of {@code MSG_WAITFORONE} with
     * recvmmsg().)
     * <p>
     * To be notified when messages are available, wait for the {@link org.gtk.glib.IOCondition#IN} condition.
     * Note though that you may still receive {@link IOErrorEnum#WOULD_BLOCK} from
     * g_datagram_based_receive_messages() even if you were previously notified of a
     * {@link org.gtk.glib.IOCondition#IN} condition.
     * <p>
     * If the remote peer closes the connection, any messages queued in the
     * underlying receive buffer will be returned, and subsequent calls to
     * g_datagram_based_receive_messages() will return 0 (with no error set).
     * <p>
     * If the connection is shut down or closed (by calling g_socket_close() or
     * g_socket_shutdown() with {@code shutdown_read} set, if it’s a {@link Socket}, for
     * example), all calls to this function will return {@link IOErrorEnum#CLOSED}.
     * <p>
     * On error -1 is returned and {@code error} is set accordingly. An error will only
     * be returned if zero messages could be received; otherwise the number of
     * messages successfully received before the error will be returned. If
     * {@code cancellable} is cancelled, {@link IOErrorEnum#CANCELLED} is returned as with any
     * other error.
     * @param messages an array of {@link InputMessage} structs
     * @param numMessages the number of elements in {@code messages}
     * @param flags an int containing {@link SocketMsgFlags} flags for the overall operation
     * @param timeout the maximum time (in microseconds) to wait, 0 to not block, or -1
     *   to block indefinitely
     * @param cancellable a {@code GCancellable}
     * @return number of messages received, or -1 on error. Note that the number
     *     of messages received may be smaller than {@code num_messages} if {@code timeout} is
     *     zero or positive, if the peer closed the connection, or if {@code num_messages}
     *     was larger than {@code UIO_MAXIOV} (1024), in which case the caller may re-try
     *     to receive the remaining messages.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default int receiveMessages(@NotNull org.gtk.gio.InputMessage[] messages, int numMessages, int flags, long timeout, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(messages, "Parameter 'messages' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_datagram_based_receive_messages.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(messages, false),
                    numMessages,
                    flags,
                    timeout,
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
    
    /**
     * Send one or more data messages from {@code datagram_based} in one go.
     * <p>
     * {@code messages} must point to an array of {@link OutputMessage} structs and
     * {@code num_messages} must be the length of this array. Each {@link OutputMessage}
     * contains an address to send the data to, and a pointer to an array of
     * {@link OutputVector} structs to describe the buffers that the data to be sent
     * for each message will be gathered from.
     * <p>
     * {@code flags} modify how the message is sent. The commonly available arguments
     * for this are available in the {@link SocketMsgFlags} enum, but the
     * values there are the same as the system values, and the flags
     * are passed in as-is, so you can pass in system-specific flags too.
     * <p>
     * The other members of {@link OutputMessage} are treated as described in its
     * documentation.
     * <p>
     * If {@code timeout} is negative the call will block until {@code num_messages} have been
     * sent, {@code cancellable} is cancelled, or an error occurs.
     * <p>
     * If {@code timeout} is 0 the call will send up to {@code num_messages} without blocking,
     * or will return {@link IOErrorEnum#WOULD_BLOCK} if there is no space to send messages.
     * <p>
     * If {@code timeout} is positive the call will block on the same conditions as if
     * {@code timeout} were negative. If the timeout is reached before any messages are
     * sent, {@link IOErrorEnum#TIMED_OUT} is returned, otherwise it will return the number
     * of messages sent before timing out.
     * <p>
     * To be notified when messages can be sent, wait for the {@link org.gtk.glib.IOCondition#OUT} condition.
     * Note though that you may still receive {@link IOErrorEnum#WOULD_BLOCK} from
     * g_datagram_based_send_messages() even if you were previously notified of a
     * {@link org.gtk.glib.IOCondition#OUT} condition. (On Windows in particular, this is very common due to
     * the way the underlying APIs work.)
     * <p>
     * If the connection is shut down or closed (by calling g_socket_close() or
     * g_socket_shutdown() with {@code shutdown_write} set, if it’s a {@link Socket}, for
     * example), all calls to this function will return {@link IOErrorEnum#CLOSED}.
     * <p>
     * On error -1 is returned and {@code error} is set accordingly. An error will only
     * be returned if zero messages could be sent; otherwise the number of messages
     * successfully sent before the error will be returned. If {@code cancellable} is
     * cancelled, {@link IOErrorEnum#CANCELLED} is returned as with any other error.
     * @param messages an array of {@link OutputMessage} structs
     * @param numMessages the number of elements in {@code messages}
     * @param flags an int containing {@link SocketMsgFlags} flags
     * @param timeout the maximum time (in microseconds) to wait, 0 to not block, or -1
     *   to block indefinitely
     * @param cancellable a {@code GCancellable}
     * @return number of messages sent, or -1 on error. Note that the number of
     *     messages sent may be smaller than {@code num_messages} if {@code timeout} is zero
     *     or positive, or if {@code num_messages} was larger than {@code UIO_MAXIOV} (1024), in
     *     which case the caller may re-try to send the remaining messages.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default int sendMessages(@NotNull org.gtk.gio.OutputMessage[] messages, int numMessages, int flags, long timeout, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(messages, "Parameter 'messages' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_datagram_based_send_messages.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(messages, false),
                    numMessages,
                    flags,
                    timeout,
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
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_datagram_based_condition_check = Interop.downcallHandle(
            "g_datagram_based_condition_check",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_datagram_based_condition_wait = Interop.downcallHandle(
            "g_datagram_based_condition_wait",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_datagram_based_create_source = Interop.downcallHandle(
            "g_datagram_based_create_source",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_datagram_based_receive_messages = Interop.downcallHandle(
            "g_datagram_based_receive_messages",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_datagram_based_send_messages = Interop.downcallHandle(
            "g_datagram_based_send_messages",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
    
    class DatagramBasedImpl extends org.gtk.gobject.Object implements DatagramBased {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public DatagramBasedImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
