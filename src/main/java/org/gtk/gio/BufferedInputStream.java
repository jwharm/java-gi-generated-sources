package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
public class BufferedInputStream extends org.gtk.gio.FilterInputStream implements org.gtk.gio.Seekable {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GBufferedInputStream";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.FilterInputStream.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gio.FilterInputStream parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gio.FilterInputStream(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public BufferedInputStream(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to BufferedInputStream if its GType is a (or inherits from) "GBufferedInputStream".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "BufferedInputStream" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GBufferedInputStream", a ClassCastException will be thrown.
     */
    public static BufferedInputStream castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GBufferedInputStream"))) {
            return new BufferedInputStream(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GBufferedInputStream");
        }
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.gio.InputStream baseStream) {
        java.util.Objects.requireNonNull(baseStream, "Parameter 'baseStream' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_buffered_input_stream_new.invokeExact(
                    baseStream.handle()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link InputStream} from the given {@code base_stream}, with
     * a buffer set to the default size (4 kilobytes).
     * @param baseStream a {@link InputStream}
     */
    public BufferedInputStream(@NotNull org.gtk.gio.InputStream baseStream) {
        super(constructNew(baseStream));
    }
    
    private static Refcounted constructNewSized(@NotNull org.gtk.gio.InputStream baseStream, long size) {
        java.util.Objects.requireNonNull(baseStream, "Parameter 'baseStream' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_buffered_input_stream_new_sized.invokeExact(
                    baseStream.handle(),
                    size), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link BufferedInputStream} from the given {@code base_stream},
     * with a buffer set to {@code size}.
     * @param baseStream a {@link InputStream}
     * @param size a {@code gsize}
     * @return a {@link InputStream}.
     */
    public static BufferedInputStream newSized(@NotNull org.gtk.gio.InputStream baseStream, long size) {
        return new BufferedInputStream(constructNewSized(baseStream, size));
    }
    
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
     * @param count the number of bytes that will be read from the stream
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore
     * @return the number of bytes read into {@code stream}'s buffer, up to {@code count},
     *     or -1 on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public long fill(long count, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_buffered_input_stream_fill.invokeExact(
                    handle(),
                    count,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Reads data into {@code stream}'s buffer asynchronously, up to {@code count} size.
     * {@code io_priority} can be used to prioritize reads. For the synchronous
     * version of this function, see g_buffered_input_stream_fill().
     * <p>
     * If {@code count} is -1 then the attempted read size is equal to the number
     * of bytes that are required to fill the buffer.
     * @param count the number of bytes that will be read from the stream
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional {@link Cancellable} object
     * @param callback a {@link AsyncReadyCallback}
     */
    public void fillAsync(long count, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_buffered_input_stream_fill_async.invokeExact(
                    handle(),
                    count,
                    ioPriority,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an asynchronous read.
     * @param result a {@link AsyncResult}
     * @return a {@code gssize} of the read stream, or {@code -1} on an error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public long fillFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_buffered_input_stream_fill_finish.invokeExact(
                    handle(),
                    result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Gets the size of the available data within the stream.
     * @return size of the available stream.
     */
    public long getAvailable() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_buffered_input_stream_get_available.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the size of the input buffer.
     * @return the current buffer size.
     */
    public long getBufferSize() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_buffered_input_stream_get_buffer_size.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Peeks in the buffer, copying data of size {@code count} into {@code buffer},
     * offset {@code offset} bytes.
     * @param buffer a pointer to
     *   an allocated chunk of memory
     * @param offset a {@code gsize}
     * @param count a {@code gsize}
     * @return a {@code gsize} of the number of bytes peeked, or -1 on error.
     */
    public long peek(byte[] buffer, long offset, long count) {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_buffered_input_stream_peek.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(buffer, false),
                    offset,
                    count);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the buffer with the currently available bytes. The returned
     * buffer must not be modified and will become invalid when reading from
     * the stream or filling the buffer.
     * @param count a {@code gsize} to get the number of bytes available in the buffer
     * @return read-only buffer
     */
    public @NotNull byte[] peekBuffer(Out<Long> count) {
        java.util.Objects.requireNonNull(count, "Parameter 'count' must not be null");
        MemorySegment countPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_buffered_input_stream_peek_buffer.invokeExact(
                    handle(),
                    (Addressable) countPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        count.set(countPOINTER.get(ValueLayout.JAVA_LONG, 0));
        return MemorySegment.ofAddress(RESULT.get(ValueLayout.ADDRESS, 0), count.get().intValue() * ValueLayout.JAVA_BYTE.byteSize(), Interop.getScope()).toArray(ValueLayout.JAVA_BYTE);
    }
    
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
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore
     * @return the byte read from the {@code stream}, or -1 on end of stream or error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public int readInt(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_buffered_input_stream_read_byte.invokeExact(
                    handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Sets the size of the internal buffer of {@code stream} to {@code size}, or to the
     * size of the contents of the buffer. The buffer can never be resized
     * smaller than its current contents.
     * @param size a {@code gsize}
     */
    public void setBufferSize(long size) {
        try {
            DowncallHandles.g_buffered_input_stream_set_buffer_size.invokeExact(
                    handle(),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_buffered_input_stream_new = Interop.downcallHandle(
            "g_buffered_input_stream_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_buffered_input_stream_new_sized = Interop.downcallHandle(
            "g_buffered_input_stream_new_sized",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
        );
        
        private static final MethodHandle g_buffered_input_stream_fill = Interop.downcallHandle(
            "g_buffered_input_stream_fill",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_buffered_input_stream_fill_async = Interop.downcallHandle(
            "g_buffered_input_stream_fill_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_buffered_input_stream_fill_finish = Interop.downcallHandle(
            "g_buffered_input_stream_fill_finish",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_buffered_input_stream_get_available = Interop.downcallHandle(
            "g_buffered_input_stream_get_available",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_buffered_input_stream_get_buffer_size = Interop.downcallHandle(
            "g_buffered_input_stream_get_buffer_size",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_buffered_input_stream_peek = Interop.downcallHandle(
            "g_buffered_input_stream_peek",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
        );
        
        private static final MethodHandle g_buffered_input_stream_peek_buffer = Interop.downcallHandle(
            "g_buffered_input_stream_peek_buffer",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_buffered_input_stream_read_byte = Interop.downcallHandle(
            "g_buffered_input_stream_read_byte",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_buffered_input_stream_set_buffer_size = Interop.downcallHandle(
            "g_buffered_input_stream_set_buffer_size",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
        );
    }
}
