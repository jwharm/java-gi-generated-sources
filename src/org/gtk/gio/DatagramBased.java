package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link org.gtk.gio.DatagramBased} is a networking interface for representing datagram-based
 * communications. It is a more or less direct mapping of the core parts of the
 * BSD socket API in a portable GObject interface. It is implemented by
 * {@link org.gtk.gio.Socket}  which wraps the UNIX socket API on UNIX and winsock2 on Windows.
 * 
 * {@link org.gtk.gio.DatagramBased} is entirely platform independent, and is intended to be used
 * alongside higher-level networking APIs such as {@link org.gtk.gio.IOStream} 
 * 
 * It uses vectored scatter/gather I/O by default, allowing for many messages
 * to be sent or received in a single call. Where possible, implementations of
 * the interface should take advantage of vectored I/O to minimise processing
 * or system calls. For example, {@link org.gtk.gio.Socket} uses recvmmsg() and sendmmsg() where
 * possible. Callers should take advantage of scatter/gather I/O (the use of
 * multiple buffers per message) to avoid unnecessary copying of data to
 * assemble or disassemble a message.
 * 
 * Each {@link org.gtk.gio.DatagramBased} operation has a timeout parameter which may be negative
 * for blocking behaviour, zero for non-blocking behaviour, or positive for
 * timeout behaviour. A blocking operation blocks until finished or there is an
 * error. A non-blocking operation will return immediately with a
 * {@link org.gtk.gio.IOErrorEnum<code>#WOULD_BLOCK</code>  error if it cannot make progress. A timeout operation
 * will block until the operation is complete or the timeout expires; if the
 * timeout expires it will return what progress it made, or
 * {@link org.gtk.gio.IOErrorEnum<code>#TIMED_OUT</code>  if no progress was made. To know when a call would
 * successfully run you can call g_datagram_based_condition_check() or
 * g_datagram_based_condition_wait(). You can also use
 * g_datagram_based_create_source() and attach it to a {@link org.gtk.glib.MainContext} to get
 * callbacks when I/O is possible.
 * 
 * When running a non-blocking operation applications should always be able to
 * handle getting a {@link org.gtk.gio.IOErrorEnum<code>#WOULD_BLOCK</code>  error even when some other function
 * said that I/O was possible. This can easily happen in case of a race
 * condition in the application, but it can also happen for other reasons. For
 * instance, on Windows a socket is always seen as writable until a write
 * returns {@link org.gtk.gio.IOErrorEnum<code>#WOULD_BLOCK</code>  
 * 
 * As with {@link org.gtk.gio.Socket}  <code>#GDatagramBaseds</code> can be either connection oriented (for
 * example, SCTP) or connectionless (for example, UDP). <code>#GDatagramBaseds</code> must be
 * datagram-based, not stream-based. The interface does not cover connection
 * establishment &<code>#8212</code>  use methods on the underlying type to establish a connection
 * before sending and receiving data through the {@link org.gtk.gio.DatagramBased} API. For
 * connectionless socket types the target/source address is specified or
 * received in each I/O operation.
 * 
 * Like most other APIs in GLib, {@link org.gtk.gio.DatagramBased} is not inherently thread safe.
 * To use a {@link org.gtk.gio.DatagramBased} concurrently from multiple threads, you must
 * implement your own locking.
 */
public interface DatagramBased extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Checks on the readiness of @datagram_based to perform operations. The
     * operations specified in @condition are checked for and masked against the
     * currently-satisfied conditions on @datagram_based. The result is returned.
     * 
     * {@link org.gtk.glib.IOCondition<code>#IN</code>  will be set in the return value if data is available to read with
     * g_datagram_based_receive_messages(), or if the connection is closed remotely
     * (EOS); and if the datagram_based has not been closed locally using some
     * implementation-specific method (such as g_socket_close() or
     * g_socket_shutdown() with @shutdown_read set, if it&<code>#8217</code> s a {@link org.gtk.gio.Socket} .
     * 
     * If the connection is shut down or closed (by calling g_socket_close() or
     * g_socket_shutdown() with @shutdown_read set, if it&<code>#8217</code> s a {@link org.gtk.gio.Socket}  for
     * example), all calls to this function will return {@link org.gtk.gio.IOErrorEnum<code>#CLOSED</code>  
     * 
     * {@link org.gtk.glib.IOCondition<code>#OUT</code>  will be set if it is expected that at least one byte can be sent
     * using g_datagram_based_send_messages() without blocking. It will not be set
     * if the datagram_based has been closed locally.
     * 
     * {@link org.gtk.glib.IOCondition<code>#HUP</code>  will be set if the connection has been closed locally.
     * 
     * {@link org.gtk.glib.IOCondition<code>#ERR</code>  will be set if there was an asynchronous error in transmitting data
     * previously enqueued using g_datagram_based_send_messages().
     * 
     * Note that on Windows, it is possible for an operation to return
     * {@link org.gtk.gio.IOErrorEnum<code>#WOULD_BLOCK</code>  even immediately after
     * g_datagram_based_condition_check() has claimed that the {@link org.gtk.gio.DatagramBased} is
     * ready for writing. Rather than calling g_datagram_based_condition_check() and
     * then writing to the {@link org.gtk.gio.DatagramBased} if it succeeds, it is generally better to
     * simply try writing right away, and try again later if the initial attempt
     * returns {@link org.gtk.gio.IOErrorEnum<code>#WOULD_BLOCK</code>  
     * 
     * It is meaningless to specify {@link org.gtk.glib.IOCondition<code>#ERR</code>  or {@link org.gtk.glib.IOCondition<code>#HUP</code>  in @condition; these
     * conditions will always be set in the output if they are true. Apart from
     * these flags, the output is guaranteed to be masked by @condition.
     * 
     * This call never blocks.
     */
    public default int conditionCheck(int condition) {
        var RESULT = gtk_h.g_datagram_based_condition_check(handle(), condition);
        return RESULT;
    }
    
    /**
     * Waits for up to @timeout microseconds for condition to become true on
     * @datagram_based. If the condition is met, <code>true</code> is returned.
     * 
     * If @cancellable is cancelled before the condition is met, or if @timeout is
     * reached before the condition is met, then <code>false</code> is returned and @error is
     * set appropriately ({@link org.gtk.gio.IOErrorEnum<code>#CANCELLED</code>  or {@link org.gtk.gio.IOErrorEnum<code>#TIMED_OUT</code>  .
     */
    public default boolean conditionWait(int condition, long timeout, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_datagram_based_condition_wait(handle(), condition, timeout, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Creates a {@link org.gtk.glib.Source} that can be attached to a {@link org.gtk.glib.MainContext} to monitor for
     * the availability of the specified @condition on the {@link org.gtk.gio.DatagramBased}  The
     * {@link org.gtk.glib.Source} keeps a reference to the @datagram_based.
     * 
     * The callback on the source is of the {@link org.gtk.gio.DatagramBasedSourceFunc} type.
     * 
     * It is meaningless to specify {@link org.gtk.glib.IOCondition<code>#ERR</code>  or {@link org.gtk.glib.IOCondition<code>#HUP</code>  in @condition; these
     * conditions will always be reported in the callback if they are true.
     * 
     * If non-<code>null</code>  @cancellable can be used to cancel the source, which will
     * cause the source to trigger, reporting the current condition (which is
     * likely 0 unless cancellation happened at the same time as a condition
     * change). You can check for this in the callback using
     * g_cancellable_is_cancelled().
     */
    public default org.gtk.glib.Source createSource(int condition, Cancellable cancellable) {
        var RESULT = gtk_h.g_datagram_based_create_source(handle(), condition, cancellable.handle());
        return new org.gtk.glib.Source(References.get(RESULT, true));
    }
    
    /**
     * Receive one or more data messages from @datagram_based in one go.
     * <p>
     * @messages must point to an array of {@link org.gtk.gio.InputMessage} structs and
     * @num_messages must be the length of this array. Each {@link org.gtk.gio.InputMessage} contains a pointer to an array of {@link org.gtk.gio.InputVector} structs describing the
     * buffers that the data received in each message will be written to.
     * <p>
     * @flags modify how all messages are received. The commonly available
     * arguments for this are available in the {@link org.gtk.gio.SocketMsgFlags} enum, but the
     * values there are the same as the system values, and the flags
     * are passed in as-is, so you can pass in system-specific flags too. These
     * flags affect the overall receive operation. Flags affecting individual
     * messages are returned in {@link org.gtk.gio.InputMessage} flags.
     * <p>
     * The other members of {@link org.gtk.gio.InputMessage} are treated as described in its
     * documentation.
     * <p>
     * If @timeout is negative the call will block until @num_messages have been
     * received, the connection is closed remotely (EOS), @cancellable is cancelled,
     * or an error occurs.
     * <p>
     * If @timeout is 0 the call will return up to @num_messages without blocking,
     * or {@link org.gtk.gio.IOErrorEnum<code>#WOULD_BLOCK</code>  if no messages are queued in the operating system
     * to be received.
     * <p>
     * If @timeout is positive the call will block on the same conditions as if
     * @timeout were negative. If the timeout is reached
     * before any messages are received, {@link org.gtk.gio.IOErrorEnum<code>#TIMED_OUT</code>  is returned,
     * otherwise it will return the number of messages received before timing out.
     * (Note: This is effectively the behaviour of <code>MSG_WAITFORONE</code> with
     * recvmmsg().)
     * 
     * To be notified when messages are available, wait for the {@link org.gtk.glib.IOCondition<code>#IN</code>  condition.
     * Note though that you may still receive {@link org.gtk.gio.IOErrorEnum<code>#WOULD_BLOCK</code>  from
     * g_datagram_based_receive_messages() even if you were previously notified of a
     * {@link org.gtk.glib.IOCondition<code>#IN</code>  condition.
     * 
     * If the remote peer closes the connection, any messages queued in the
     * underlying receive buffer will be returned, and subsequent calls to
     * g_datagram_based_receive_messages() will return 0 (with no error set).
     * 
     * If the connection is shut down or closed (by calling g_socket_close() or
     * g_socket_shutdown() with @shutdown_read set, if it&<code>#8217</code> s a {@link org.gtk.gio.Socket}  for
     * example), all calls to this function will return {@link org.gtk.gio.IOErrorEnum<code>#CLOSED</code>  
     * 
     * On error -1 is returned and @error is set accordingly. An error will only
     * be returned if zero messages could be received; otherwise the number of
     * messages successfully received before the error will be returned. If
     * @cancellable is cancelled, {@link org.gtk.gio.IOErrorEnum<code>#CANCELLED</code>  is returned as with any
     * other error.
     */
    public default int receiveMessages(InputMessage[] messages, int numMessages, int flags, long timeout, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_datagram_based_receive_messages(handle(), Interop.allocateNativeArray(messages).handle(), numMessages, flags, timeout, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Send one or more data messages from @datagram_based in one go.
     * 
     * @messages must point to an array of {@link org.gtk.gio.OutputMessage} structs and
     * @num_messages must be the length of this array. Each {@link org.gtk.gio.OutputMessage} contains an address to send the data to, and a pointer to an array of
     * {@link org.gtk.gio.OutputVector} structs to describe the buffers that the data to be sent
     * for each message will be gathered from.
     * 
     * @flags modify how the message is sent. The commonly available arguments
     * for this are available in the {@link org.gtk.gio.SocketMsgFlags} enum, but the
     * values there are the same as the system values, and the flags
     * are passed in as-is, so you can pass in system-specific flags too.
     * 
     * The other members of {@link org.gtk.gio.OutputMessage} are treated as described in its
     * documentation.
     * 
     * If @timeout is negative the call will block until @num_messages have been
     * sent, @cancellable is cancelled, or an error occurs.
     * 
     * If @timeout is 0 the call will send up to @num_messages without blocking,
     * or will return {@link org.gtk.gio.IOErrorEnum<code>#WOULD_BLOCK</code>  if there is no space to send messages.
     * 
     * If @timeout is positive the call will block on the same conditions as if
     * @timeout were negative. If the timeout is reached before any messages are
     * sent, {@link org.gtk.gio.IOErrorEnum<code>#TIMED_OUT</code>  is returned, otherwise it will return the number
     * of messages sent before timing out.
     * 
     * To be notified when messages can be sent, wait for the {@link org.gtk.glib.IOCondition<code>#OUT</code>  condition.
     * Note though that you may still receive {@link org.gtk.gio.IOErrorEnum<code>#WOULD_BLOCK</code>  from
     * g_datagram_based_send_messages() even if you were previously notified of a
     * {@link org.gtk.glib.IOCondition<code>#OUT</code>  condition. (On Windows in particular, this is very common due to
     * the way the underlying APIs work.)
     * 
     * If the connection is shut down or closed (by calling g_socket_close() or
     * g_socket_shutdown() with @shutdown_write set, if it&<code>#8217</code> s a {@link org.gtk.gio.Socket}  for
     * example), all calls to this function will return {@link org.gtk.gio.IOErrorEnum<code>#CLOSED</code>  
     * 
     * On error -1 is returned and @error is set accordingly. An error will only
     * be returned if zero messages could be sent; otherwise the number of messages
     * successfully sent before the error will be returned. If @cancellable is
     * cancelled, {@link org.gtk.gio.IOErrorEnum<code>#CANCELLED</code>  is returned as with any other error.
     */
    public default int sendMessages(OutputMessage[] messages, int numMessages, int flags, long timeout, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_datagram_based_send_messages(handle(), Interop.allocateNativeArray(messages).handle(), numMessages, flags, timeout, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    class DatagramBasedImpl extends org.gtk.gobject.Object implements DatagramBased {
        public DatagramBasedImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
