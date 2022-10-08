package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Buffered input stream implements {@link FilterInputStream} and provides
 * for buffered reads.
 * <p>
 * By default, {@link BufferedInputStream}'s buffer size is set at 4 kilobytes.
 * <p>
 * To create a buffered input stream, use g_buffered_input_stream_new(),
 * or g_buffered_input_stream_new_sized() to specify the buffer's size at
 * construction.
 * <p>
 * To get the size of a buffer within a buffered input stream, use
 * g_buffered_input_stream_get_buffer_size(). To change the size of a
 * buffered input stream's buffer, use
 * g_buffered_input_stream_set_buffer_size(). Note that the buffer's size
 * cannot be reduced below the size of the data within the buffer.
 */
public class BufferedInputStream extends FilterInputStream implements Seekable {

    public BufferedInputStream(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to BufferedInputStream */
    public static BufferedInputStream castFrom(org.gtk.gobject.Object gobject) {
        return new BufferedInputStream(gobject.refcounted());
    }
    
    static final MethodHandle g_buffered_input_stream_new = Interop.downcallHandle(
        "g_buffered_input_stream_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(InputStream baseStream) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_buffered_input_stream_new.invokeExact(baseStream.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link InputStream} from the given {@code base_stream}, with
     * a buffer set to the default size (4 kilobytes).
     */
    public BufferedInputStream(InputStream baseStream) {
        super(constructNew(baseStream));
    }
    
    static final MethodHandle g_buffered_input_stream_new_sized = Interop.downcallHandle(
        "g_buffered_input_stream_new_sized",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    private static Refcounted constructNewSized(InputStream baseStream, long size) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_buffered_input_stream_new_sized.invokeExact(baseStream.handle(), size), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link BufferedInputStream} from the given {@code base_stream},
     * with a buffer set to {@code size}.
     */
    public static BufferedInputStream newSized(InputStream baseStream, long size) {
        return new BufferedInputStream(constructNewSized(baseStream, size));
    }
    
    static final MethodHandle g_buffered_input_stream_fill = Interop.downcallHandle(
        "g_buffered_input_stream_fill",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Tries to read {@code count} bytes from the stream into the buffer.
     * Will block during this read.
     * <p>
     * If {@code count} is zero, returns zero and does nothing. A value of {@code count}
     * larger than {@code G_MAXSSIZE} will cause a {@link IOErrorEnum#INVALID_ARGUMENT} error.
     * <p>
     * On success, the number of bytes read into the buffer is returned.
     * It is not an error if this is not the same as the requested size, as it
     * can happen e.g. near the end of a file. Zero is returned on end of file
     * (or if {@code count} is zero),  but never otherwise.
     * <p>
     * If {@code count} is -1 then the attempted read size is equal to the number of
     * bytes that are required to fill the buffer.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned. If an
     * operation was partially finished when the operation was cancelled the
     * partial result will be returned, without an error.
     * <p>
     * On error -1 is returned and {@code error} is set accordingly.
     * <p>
     * For the asynchronous, non-blocking, version of this function, see
     * g_buffered_input_stream_fill_async().
     */
    public long fill(long count, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (long) g_buffered_input_stream_fill.invokeExact(handle(), count, cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_buffered_input_stream_fill_async = Interop.downcallHandle(
        "g_buffered_input_stream_fill_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Reads data into {@code stream}'s buffer asynchronously, up to {@code count} size.
     * {@code io_priority} can be used to prioritize reads. For the synchronous
     * version of this function, see g_buffered_input_stream_fill().
     * <p>
     * If {@code count} is -1 then the attempted read size is equal to the number
     * of bytes that are required to fill the buffer.
     */
    public void fillAsync(long count, int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_buffered_input_stream_fill_async.invokeExact(handle(), count, ioPriority, cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_buffered_input_stream_fill_finish = Interop.downcallHandle(
        "g_buffered_input_stream_fill_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an asynchronous read.
     */
    public long fillFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (long) g_buffered_input_stream_fill_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_buffered_input_stream_get_available = Interop.downcallHandle(
        "g_buffered_input_stream_get_available",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the size of the available data within the stream.
     */
    public long getAvailable() {
        try {
            var RESULT = (long) g_buffered_input_stream_get_available.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_buffered_input_stream_get_buffer_size = Interop.downcallHandle(
        "g_buffered_input_stream_get_buffer_size",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the size of the input buffer.
     */
    public long getBufferSize() {
        try {
            var RESULT = (long) g_buffered_input_stream_get_buffer_size.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_buffered_input_stream_peek = Interop.downcallHandle(
        "g_buffered_input_stream_peek",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Peeks in the buffer, copying data of size {@code count} into {@code buffer},
     * offset {@code offset} bytes.
     */
    public long peek(byte[] buffer, long offset, long count) {
        try {
            var RESULT = (long) g_buffered_input_stream_peek.invokeExact(handle(), Interop.allocateNativeArray(buffer).handle(), offset, count);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_buffered_input_stream_peek_buffer = Interop.downcallHandle(
        "g_buffered_input_stream_peek_buffer",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the buffer with the currently available bytes. The returned
     * buffer must not be modified and will become invalid when reading from
     * the stream or filling the buffer.
     */
    public PointerByte peekBuffer(PointerLong count) {
        try {
            var RESULT = (MemoryAddress) g_buffered_input_stream_peek_buffer.invokeExact(handle(), count.handle());
            return new PointerByte(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_buffered_input_stream_read_byte = Interop.downcallHandle(
        "g_buffered_input_stream_read_byte",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Tries to read a single byte from the stream or the buffer. Will block
     * during this read.
     * <p>
     * On success, the byte read from the stream is returned. On end of stream
     * -1 is returned but it's not an exceptional error and {@code error} is not set.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned. If an
     * operation was partially finished when the operation was cancelled the
     * partial result will be returned, without an error.
     * <p>
     * On error -1 is returned and {@code error} is set accordingly.
     */
    public int readInt(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_buffered_input_stream_read_byte.invokeExact(handle(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_buffered_input_stream_set_buffer_size = Interop.downcallHandle(
        "g_buffered_input_stream_set_buffer_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Sets the size of the internal buffer of {@code stream} to {@code size}, or to the
     * size of the contents of the buffer. The buffer can never be resized
     * smaller than its current contents.
     */
    public void setBufferSize(long size) {
        try {
            g_buffered_input_stream_set_buffer_size.invokeExact(handle(), size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
