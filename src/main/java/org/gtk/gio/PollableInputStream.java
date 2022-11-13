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
     * Cast object to PollableInputStream if its GType is a (or inherits from) "GPollableInputStream".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code PollableInputStream} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GPollableInputStream", a ClassCastException will be thrown.
     */
    public static PollableInputStream castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GPollableInputStream"))) {
            return new PollableInputStreamImpl(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GPollableInputStream");
        }
    }
    
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
            RESULT = (int) DowncallHandles.g_pollable_input_stream_can_poll.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    default @NotNull org.gtk.glib.Source createSource(@Nullable org.gtk.gio.Cancellable cancellable) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_pollable_input_stream_create_source.invokeExact(
                    handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Source(RESULT, Ownership.FULL);
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
            RESULT = (int) DowncallHandles.g_pollable_input_stream_is_readable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    default long readNonblocking(@NotNull Out<byte[]> buffer, long count, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment bufferPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
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
        buffer.set(MemorySegment.ofAddress(bufferPOINTER.get(ValueLayout.ADDRESS, 0), count * ValueLayout.JAVA_BYTE.byteSize(), Interop.getScope()).toArray(ValueLayout.JAVA_BYTE));
        return RESULT;
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_pollable_input_stream_can_poll = Interop.downcallHandle(
            "g_pollable_input_stream_can_poll",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_pollable_input_stream_create_source = Interop.downcallHandle(
            "g_pollable_input_stream_create_source",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_pollable_input_stream_is_readable = Interop.downcallHandle(
            "g_pollable_input_stream_is_readable",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_pollable_input_stream_read_nonblocking = Interop.downcallHandle(
            "g_pollable_input_stream_read_nonblocking",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
    
    class PollableInputStreamImpl extends org.gtk.gobject.Object implements PollableInputStream {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public PollableInputStreamImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
