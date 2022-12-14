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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gio.FilterInputStream.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a BufferedInputStream proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected BufferedInputStream(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, BufferedInputStream> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new BufferedInputStream(input);
    
    private static MemoryAddress constructNew(org.gtk.gio.InputStream baseStream) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_buffered_input_stream_new.invokeExact(baseStream.handle());
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
    public BufferedInputStream(org.gtk.gio.InputStream baseStream) {
        super(constructNew(baseStream));
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewSized(org.gtk.gio.InputStream baseStream, long size) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_buffered_input_stream_new_sized.invokeExact(
                    baseStream.handle(),
                    size);
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
    public static BufferedInputStream newSized(org.gtk.gio.InputStream baseStream, long size) {
        var RESULT = constructNewSized(baseStream, size);
        var OBJECT = (org.gtk.gio.BufferedInputStream) Interop.register(RESULT, org.gtk.gio.BufferedInputStream.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            long RESULT;
            try {
                RESULT = (long) DowncallHandles.g_buffered_input_stream_fill.invokeExact(
                        handle(),
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
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
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
    public long fillFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            long RESULT;
            try {
                RESULT = (long) DowncallHandles.g_buffered_input_stream_fill_finish.invokeExact(
                        handle(),
                        result.handle(),
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
     * Gets the size of the available data within the stream.
     * @return size of the available stream.
     */
    public long getAvailable() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_buffered_input_stream_get_available.invokeExact(handle());
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
            RESULT = (long) DowncallHandles.g_buffered_input_stream_get_buffer_size.invokeExact(handle());
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            long RESULT;
            try {
                RESULT = (long) DowncallHandles.g_buffered_input_stream_peek.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(buffer, false, SCOPE),
                        offset,
                        count);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Returns the buffer with the currently available bytes. The returned
     * buffer must not be modified and will become invalid when reading from
     * the stream or filling the buffer.
     * @param count a {@code gsize} to get the number of bytes available in the buffer
     * @return read-only buffer
     */
    public byte[] peekBuffer(Out<Long> count) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment countPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_buffered_input_stream_peek_buffer.invokeExact(
                        handle(),
                        (Addressable) countPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    count.set(countPOINTER.get(Interop.valueLayout.C_LONG, 0));
            return MemorySegment.ofAddress(RESULT.get(Interop.valueLayout.ADDRESS, 0), count.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), SCOPE).toArray(Interop.valueLayout.C_BYTE);
        }
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_buffered_input_stream_read_byte.invokeExact(
                        handle(),
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_buffered_input_stream_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link BufferedInputStream.Builder} object constructs a {@link BufferedInputStream} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link BufferedInputStream.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gio.FilterInputStream.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link BufferedInputStream} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link BufferedInputStream}.
         * @return A new instance of {@code BufferedInputStream} with the properties 
         *         that were set in the Builder object.
         */
        public BufferedInputStream build() {
            return (BufferedInputStream) org.gtk.gobject.GObject.newWithProperties(
                BufferedInputStream.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setBufferSize(int bufferSize) {
            names.add("buffer-size");
            values.add(org.gtk.gobject.Value.create(bufferSize));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_buffered_input_stream_new = Interop.downcallHandle(
                "g_buffered_input_stream_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_buffered_input_stream_new_sized = Interop.downcallHandle(
                "g_buffered_input_stream_new_sized",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_buffered_input_stream_fill = Interop.downcallHandle(
                "g_buffered_input_stream_fill",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_buffered_input_stream_fill_async = Interop.downcallHandle(
                "g_buffered_input_stream_fill_async",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_buffered_input_stream_fill_finish = Interop.downcallHandle(
                "g_buffered_input_stream_fill_finish",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_buffered_input_stream_get_available = Interop.downcallHandle(
                "g_buffered_input_stream_get_available",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_buffered_input_stream_get_buffer_size = Interop.downcallHandle(
                "g_buffered_input_stream_get_buffer_size",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_buffered_input_stream_peek = Interop.downcallHandle(
                "g_buffered_input_stream_peek",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_buffered_input_stream_peek_buffer = Interop.downcallHandle(
                "g_buffered_input_stream_peek_buffer",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_buffered_input_stream_read_byte = Interop.downcallHandle(
                "g_buffered_input_stream_read_byte",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_buffered_input_stream_set_buffer_size = Interop.downcallHandle(
                "g_buffered_input_stream_set_buffer_size",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_buffered_input_stream_get_type = Interop.downcallHandle(
                "g_buffered_input_stream_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_buffered_input_stream_get_type != null;
    }
}
