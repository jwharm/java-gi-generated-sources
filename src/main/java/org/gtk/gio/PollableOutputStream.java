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
 * @version 2.28
 */
public interface PollableOutputStream extends io.github.jwharm.javagi.Proxy {
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PollableOutputStreamImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PollableOutputStreamImpl(input);
    
    /**
     * Checks if {@code stream} is actually pollable. Some classes may implement
     * {@link PollableOutputStream} but have only certain instances of that
     * class be pollable. If this method returns {@code false}, then the behavior
     * of other {@link PollableOutputStream} methods is undefined.
     * <p>
     * For any given stream, the value returned by this method is constant;
     * a stream cannot switch from pollable to non-pollable or vice versa.
     * @return {@code true} if {@code stream} is pollable, {@code false} if not.
     */
    default boolean canPoll() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_pollable_output_stream_can_poll.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Creates a {@link org.gtk.glib.Source} that triggers when {@code stream} can be written, or
     * {@code cancellable} is triggered or an error occurs. The callback on the
     * source is of the {@link PollableSourceFunc} type.
     * <p>
     * As with g_pollable_output_stream_is_writable(), it is possible that
     * the stream may not actually be writable even after the source
     * triggers, so you should use g_pollable_output_stream_write_nonblocking()
     * rather than g_output_stream_write() from the callback.
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @return a new {@link org.gtk.glib.Source}
     */
    default org.gtk.glib.Source createSource(@Nullable org.gtk.gio.Cancellable cancellable) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_pollable_output_stream_create_source.invokeExact(
                    handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.Source.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Checks if {@code stream} can be written.
     * <p>
     * Note that some stream types may not be able to implement this 100%
     * reliably, and it is possible that a call to g_output_stream_write()
     * after this returns {@code true} would still block. To guarantee
     * non-blocking behavior, you should always use
     * g_pollable_output_stream_write_nonblocking(), which will return a
     * {@link IOErrorEnum#WOULD_BLOCK} error rather than blocking.
     * @return {@code true} if {@code stream} is writable, {@code false} if not. If an error
     *   has occurred on {@code stream}, this will result in
     *   g_pollable_output_stream_is_writable() returning {@code true}, and the
     *   next attempt to write will return the error.
     */
    default boolean isWritable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_pollable_output_stream_is_writable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
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
     * @param buffer a buffer to write
     *     data from
     * @param count the number of bytes you want to write
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @return the number of bytes written, or -1 on error (including
     *   {@link IOErrorEnum#WOULD_BLOCK}).
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default long writeNonblocking(byte[] buffer, long count, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            long RESULT;
            try {
                RESULT = (long) DowncallHandles.g_pollable_output_stream_write_nonblocking.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(buffer, false, SCOPE),
                        count,
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
     * Attempts to write the bytes contained in the {@code n_vectors} {@code vectors} to {@code stream},
     * as with g_output_stream_writev(). If {@code stream} is not currently writable,
     * this will immediately return %{@code G_POLLABLE_RETURN_WOULD_BLOCK}, and you can
     * use g_pollable_output_stream_create_source() to create a {@link org.gtk.glib.Source}
     * that will be triggered when {@code stream} is writable. {@code error} will <em>not</em> be
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
     * @param vectors the buffer containing the {@code GOutputVectors} to write.
     * @param nVectors the number of vectors to write
     * @param bytesWritten location to store the number of bytes that were
     *     written to the stream
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @return %{@code G_POLLABLE_RETURN_OK} on success, {@link PollableReturn#WOULD_BLOCK}
     * if the stream is not currently writable (and {@code error} is <em>not</em> set), or
     * {@link PollableReturn#FAILED} if there was an error in which case {@code error} will
     * be set.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default org.gtk.gio.PollableReturn writevNonblocking(org.gtk.gio.OutputVector[] vectors, long nVectors, Out<Long> bytesWritten, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment bytesWrittenPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_pollable_output_stream_writev_nonblocking.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(vectors, org.gtk.gio.OutputVector.getMemoryLayout(), false, SCOPE),
                        nVectors,
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
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_pollable_output_stream_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_pollable_output_stream_can_poll = Interop.downcallHandle(
                "g_pollable_output_stream_can_poll",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_pollable_output_stream_create_source = Interop.downcallHandle(
                "g_pollable_output_stream_create_source",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_pollable_output_stream_is_writable = Interop.downcallHandle(
                "g_pollable_output_stream_is_writable",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_pollable_output_stream_write_nonblocking = Interop.downcallHandle(
                "g_pollable_output_stream_write_nonblocking",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_pollable_output_stream_writev_nonblocking = Interop.downcallHandle(
                "g_pollable_output_stream_writev_nonblocking",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_pollable_output_stream_get_type = Interop.downcallHandle(
                "g_pollable_output_stream_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * The PollableOutputStreamImpl type represents a native instance of the PollableOutputStream interface.
     */
    class PollableOutputStreamImpl extends org.gtk.gobject.GObject implements PollableOutputStream {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of PollableOutputStream for the provided memory address.
         * @param address the memory address of the instance
         */
        public PollableOutputStreamImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_pollable_output_stream_get_type != null;
    }
}
