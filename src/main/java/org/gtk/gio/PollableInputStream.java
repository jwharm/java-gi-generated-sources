package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link PollableInputStream} is implemented by {@code GInputStreams} that
 * can be polled for readiness to read. This can be used when
 * interfacing with a non-GIO API that expects
 * UNIX-file-descriptor-style asynchronous I/O rather than GIO-style.
 * @version 2.28
 */
public interface PollableInputStream extends io.github.jwharm.javagi.Proxy {
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PollableInputStreamImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PollableInputStreamImpl(input);
    
    /**
     * Checks if {@code stream} is actually pollable. Some classes may implement
     * {@link PollableInputStream} but have only certain instances of that class
     * be pollable. If this method returns {@code false}, then the behavior of
     * other {@link PollableInputStream} methods is undefined.
     * <p>
     * For any given stream, the value returned by this method is constant;
     * a stream cannot switch from pollable to non-pollable or vice versa.
     * @return {@code true} if {@code stream} is pollable, {@code false} if not.
     */
    default boolean canPoll() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_pollable_input_stream_can_poll.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Creates a {@link org.gtk.glib.Source} that triggers when {@code stream} can be read, or
     * {@code cancellable} is triggered or an error occurs. The callback on the
     * source is of the {@link PollableSourceFunc} type.
     * <p>
     * As with g_pollable_input_stream_is_readable(), it is possible that
     * the stream may not actually be readable even after the source
     * triggers, so you should use g_pollable_input_stream_read_nonblocking()
     * rather than g_input_stream_read() from the callback.
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @return a new {@link org.gtk.glib.Source}
     */
    default org.gtk.glib.Source createSource(@Nullable org.gtk.gio.Cancellable cancellable) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_pollable_input_stream_create_source.invokeExact(
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
     * Checks if {@code stream} can be read.
     * <p>
     * Note that some stream types may not be able to implement this 100%
     * reliably, and it is possible that a call to g_input_stream_read()
     * after this returns {@code true} would still block. To guarantee
     * non-blocking behavior, you should always use
     * g_pollable_input_stream_read_nonblocking(), which will return a
     * {@link IOErrorEnum#WOULD_BLOCK} error rather than blocking.
     * @return {@code true} if {@code stream} is readable, {@code false} if not. If an error
     *   has occurred on {@code stream}, this will result in
     *   g_pollable_input_stream_is_readable() returning {@code true}, and the
     *   next attempt to read will return the error.
     */
    default boolean isReadable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_pollable_input_stream_is_readable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
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
     * @param buffer a
     *     buffer to read data into (which should be at least {@code count} bytes long).
     * @param count the number of bytes you want to read
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @return the number of bytes read, or -1 on error (including
     *   {@link IOErrorEnum#WOULD_BLOCK}).
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default long readNonblocking(Out<byte[]> buffer, long count, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment bufferPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            long RESULT;
            try {
                RESULT = (long) DowncallHandles.g_pollable_input_stream_read_nonblocking.invokeExact(
                        handle(),
                        (Addressable) bufferPOINTER.address(),
                        count,
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            buffer.set(MemorySegment.ofAddress(bufferPOINTER.get(Interop.valueLayout.ADDRESS, 0), count * Interop.valueLayout.C_BYTE.byteSize(), SCOPE).toArray(Interop.valueLayout.C_BYTE));
            return RESULT;
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_pollable_input_stream_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_pollable_input_stream_can_poll = Interop.downcallHandle(
                "g_pollable_input_stream_can_poll",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_pollable_input_stream_create_source = Interop.downcallHandle(
                "g_pollable_input_stream_create_source",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_pollable_input_stream_is_readable = Interop.downcallHandle(
                "g_pollable_input_stream_is_readable",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_pollable_input_stream_read_nonblocking = Interop.downcallHandle(
                "g_pollable_input_stream_read_nonblocking",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_pollable_input_stream_get_type = Interop.downcallHandle(
                "g_pollable_input_stream_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * The PollableInputStreamImpl type represents a native instance of the PollableInputStream interface.
     */
    class PollableInputStreamImpl extends org.gtk.gobject.GObject implements PollableInputStream {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of PollableInputStream for the provided memory address.
         * @param address the memory address of the instance
         */
        public PollableInputStreamImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_pollable_input_stream_get_type != null;
    }
}
