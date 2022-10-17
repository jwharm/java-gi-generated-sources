package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link PollableOutputStream} is implemented by {@code GOutputStreams} that
 * can be polled for readiness to write. This can be used when
 * interfacing with a non-GIO API that expects
 * UNIX-file-descriptor-style asynchronous I/O rather than GIO-style.
 */
public interface PollableOutputStream extends io.github.jwharm.javagi.Proxy {

    @ApiStatus.Internal static final MethodHandle g_pollable_output_stream_can_poll = Interop.downcallHandle(
        "g_pollable_output_stream_can_poll",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if {@code stream} is actually pollable. Some classes may implement
     * {@link PollableOutputStream} but have only certain instances of that
     * class be pollable. If this method returns {@code false}, then the behavior
     * of other {@link PollableOutputStream} methods is undefined.
     * <p>
     * For any given stream, the value returned by this method is constant;
     * a stream cannot switch from pollable to non-pollable or vice versa.
     */
    default boolean canPoll() {
        int RESULT;
        try {
            RESULT = (int) g_pollable_output_stream_can_poll.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle g_pollable_output_stream_create_source = Interop.downcallHandle(
        "g_pollable_output_stream_create_source",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a {@link org.gtk.glib.Source} that triggers when {@code stream} can be written, or
     * {@code cancellable} is triggered or an error occurs. The callback on the
     * source is of the {@link PollableSourceFunc} type.
     * <p>
     * As with g_pollable_output_stream_is_writable(), it is possible that
     * the stream may not actually be writable even after the source
     * triggers, so you should use g_pollable_output_stream_write_nonblocking()
     * rather than g_output_stream_write() from the callback.
     */
    default @NotNull org.gtk.glib.Source createSource(@Nullable Cancellable cancellable) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_pollable_output_stream_create_source.invokeExact(handle(), cancellable.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Source(Refcounted.get(RESULT, true));
    }
    
    @ApiStatus.Internal static final MethodHandle g_pollable_output_stream_is_writable = Interop.downcallHandle(
        "g_pollable_output_stream_is_writable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if {@code stream} can be written.
     * <p>
     * Note that some stream types may not be able to implement this 100%
     * reliably, and it is possible that a call to g_output_stream_write()
     * after this returns {@code true} would still block. To guarantee
     * non-blocking behavior, you should always use
     * g_pollable_output_stream_write_nonblocking(), which will return a
     * {@link IOErrorEnum#WOULD_BLOCK} error rather than blocking.
     */
    default boolean isWritable() {
        int RESULT;
        try {
            RESULT = (int) g_pollable_output_stream_is_writable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle g_pollable_output_stream_write_nonblocking = Interop.downcallHandle(
        "g_pollable_output_stream_write_nonblocking",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Attempts to write up to {@code count} bytes from {@code buffer} to {@code stream}, as
     * with g_output_stream_write(). If {@code stream} is not currently writable,
     * this will immediately return {@link IOErrorEnum#WOULD_BLOCK}, and you can
     * use g_pollable_output_stream_create_source() to create a {@link org.gtk.glib.Source}
     * that will be triggered when {@code stream} is writable.
     * <p>
     * Note that since this method never blocks, you cannot actually
     * use {@code cancellable} to cancel it. However, it will return an error
     * if {@code cancellable} has already been cancelled when you call, which
     * may happen if you call this method after a source triggers due
     * to having been cancelled.
     * <p>
     * Also note that if {@link IOErrorEnum#WOULD_BLOCK} is returned some underlying
     * transports like D/TLS require that you re-send the same {@code buffer} and
     * {@code count} in the next write call.
     */
    default long writeNonblocking(@NotNull byte[] buffer, @NotNull long count, @Nullable Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        long RESULT;
        try {
            RESULT = (long) g_pollable_output_stream_write_nonblocking.invokeExact(handle(), Interop.allocateNativeArray(buffer), count, cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    @ApiStatus.Internal static final MethodHandle g_pollable_output_stream_writev_nonblocking = Interop.downcallHandle(
        "g_pollable_output_stream_writev_nonblocking",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Attempts to write the bytes contained in the {@code n_vectors} {@code vectors} to {@code stream},
     * as with g_output_stream_writev(). If {@code stream} is not currently writable,
     * this will immediately return %{@code G_POLLABLE_RETURN_WOULD_BLOCK}, and you can
     * use g_pollable_output_stream_create_source() to create a {@link org.gtk.glib.Source}
     * that will be triggered when {@code stream} is writable. {@code error} will <strong>not</strong> be
     * set in that case.
     * <p>
     * Note that since this method never blocks, you cannot actually
     * use {@code cancellable} to cancel it. However, it will return an error
     * if {@code cancellable} has already been cancelled when you call, which
     * may happen if you call this method after a source triggers due
     * to having been cancelled.
     * <p>
     * Also note that if {@link PollableReturn#WOULD_BLOCK} is returned some underlying
     * transports like D/TLS require that you re-send the same {@code vectors} and
     * {@code n_vectors} in the next write call.
     */
    default @NotNull PollableReturn writevNonblocking(@NotNull OutputVector[] vectors, @NotNull long nVectors, @NotNull Out<Long> bytesWritten, @Nullable Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment bytesWrittenPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        int RESULT;
        try {
            RESULT = (int) g_pollable_output_stream_writev_nonblocking.invokeExact(handle(), Interop.allocateNativeArray(vectors), nVectors, (Addressable) bytesWrittenPOINTER.address(), cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        bytesWritten.set(bytesWrittenPOINTER.get(ValueLayout.JAVA_LONG, 0));
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new PollableReturn(RESULT);
    }
    
    class PollableOutputStreamImpl extends org.gtk.gobject.Object implements PollableOutputStream {
        public PollableOutputStreamImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
