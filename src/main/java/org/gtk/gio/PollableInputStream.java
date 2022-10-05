package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link PollableInputStream} is implemented by {@code GInputStreams} that
 * can be polled for readiness to read. This can be used when
 * interfacing with a non-GIO API that expects
 * UNIX-file-descriptor-style asynchronous I/O rather than GIO-style.
 */
public interface PollableInputStream extends io.github.jwharm.javagi.Proxy {

    static final MethodHandle g_pollable_input_stream_can_poll = Interop.downcallHandle(
        "g_pollable_input_stream_can_poll",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if {@code stream} is actually pollable. Some classes may implement
     * {@link PollableInputStream} but have only certain instances of that class
     * be pollable. If this method returns {@code false}, then the behavior of
     * other {@link PollableInputStream} methods is undefined.
     * <p>
     * For any given stream, the value returned by this method is constant;
     * a stream cannot switch from pollable to non-pollable or vice versa.
     */
    public default boolean canPoll() {
        try {
            var RESULT = (int) g_pollable_input_stream_can_poll.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_pollable_input_stream_create_source = Interop.downcallHandle(
        "g_pollable_input_stream_create_source",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a {@link org.gtk.glib.Source} that triggers when {@code stream} can be read, or
     * {@code cancellable} is triggered or an error occurs. The callback on the
     * source is of the {@link PollableSourceFunc} type.
     * <p>
     * As with g_pollable_input_stream_is_readable(), it is possible that
     * the stream may not actually be readable even after the source
     * triggers, so you should use g_pollable_input_stream_read_nonblocking()
     * rather than g_input_stream_read() from the callback.
     */
    public default org.gtk.glib.Source createSource(Cancellable cancellable) {
        try {
            var RESULT = (MemoryAddress) g_pollable_input_stream_create_source.invokeExact(handle(), cancellable.handle());
            return new org.gtk.glib.Source(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_pollable_input_stream_is_readable = Interop.downcallHandle(
        "g_pollable_input_stream_is_readable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if {@code stream} can be read.
     * <p>
     * Note that some stream types may not be able to implement this 100%
     * reliably, and it is possible that a call to g_input_stream_read()
     * after this returns {@code true} would still block. To guarantee
     * non-blocking behavior, you should always use
     * g_pollable_input_stream_read_nonblocking(), which will return a
     * {@link IOErrorEnum#WOULD_BLOCK} error rather than blocking.
     */
    public default boolean isReadable() {
        try {
            var RESULT = (int) g_pollable_input_stream_is_readable.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_pollable_input_stream_read_nonblocking = Interop.downcallHandle(
        "g_pollable_input_stream_read_nonblocking",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Attempts to read up to {@code count} bytes from {@code stream} into {@code buffer}, as
     * with g_input_stream_read(). If {@code stream} is not currently readable,
     * this will immediately return {@link IOErrorEnum#WOULD_BLOCK}, and you can
     * use g_pollable_input_stream_create_source() to create a {@link org.gtk.glib.Source}
     * that will be triggered when {@code stream} is readable.
     * <p>
     * Note that since this method never blocks, you cannot actually
     * use {@code cancellable} to cancel it. However, it will return an error
     * if {@code cancellable} has already been cancelled when you call, which
     * may happen if you call this method after a source triggers due
     * to having been cancelled.
     */
    public default long readNonblocking(byte[] buffer, long count, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (long) g_pollable_input_stream_read_nonblocking.invokeExact(handle(), Interop.allocateNativeArray(buffer).handle(), count, cancellable.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    class PollableInputStreamImpl extends org.gtk.gobject.Object implements PollableInputStream {
        public PollableInputStreamImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
