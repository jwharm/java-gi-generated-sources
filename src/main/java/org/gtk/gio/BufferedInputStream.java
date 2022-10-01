package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
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
    
    private static Refcounted constructNew(InputStream baseStream) {
        Refcounted RESULT = Refcounted.get(gtk_h.g_buffered_input_stream_new(baseStream.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link InputStream} from the given {@code base_stream}, with
     * a buffer set to the default size (4 kilobytes).
     */
    public BufferedInputStream(InputStream baseStream) {
        super(constructNew(baseStream));
    }
    
    private static Refcounted constructNewSized(InputStream baseStream, long size) {
        Refcounted RESULT = Refcounted.get(gtk_h.g_buffered_input_stream_new_sized(baseStream.handle(), size), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link BufferedInputStream} from the given {@code base_stream},
     * with a buffer set to {@code size}.
     */
    public static BufferedInputStream newSized(InputStream baseStream, long size) {
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
     */
    public long fill(long count, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_buffered_input_stream_fill(handle(), count, cancellable.handle(), GERROR);
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
     */
    public void fillAsync(long count, int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_buffered_input_stream_fill_async(handle(), count, ioPriority, cancellable.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an asynchronous read.
     */
    public long fillFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_buffered_input_stream_fill_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Gets the size of the available data within the stream.
     */
    public long getAvailable() {
        var RESULT = gtk_h.g_buffered_input_stream_get_available(handle());
        return RESULT;
    }
    
    /**
     * Gets the size of the input buffer.
     */
    public long getBufferSize() {
        var RESULT = gtk_h.g_buffered_input_stream_get_buffer_size(handle());
        return RESULT;
    }
    
    /**
     * Peeks in the buffer, copying data of size {@code count} into {@code buffer},
     * offset {@code offset} bytes.
     */
    public long peek(byte[] buffer, long offset, long count) {
        var RESULT = gtk_h.g_buffered_input_stream_peek(handle(), Interop.allocateNativeArray(buffer).handle(), offset, count);
        return RESULT;
    }
    
    /**
     * Returns the buffer with the currently available bytes. The returned
     * buffer must not be modified and will become invalid when reading from
     * the stream or filling the buffer.
     */
    public PointerIterator<Byte> peekBuffer(PointerLong count) {
        var RESULT = gtk_h.g_buffered_input_stream_peek_buffer(handle(), count.handle());
        return new PointerByte(RESULT).iterator();
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
     */
    public int readInt(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_buffered_input_stream_read_byte(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Sets the size of the internal buffer of {@code stream} to {@code size}, or to the
     * size of the contents of the buffer. The buffer can never be resized
     * smaller than its current contents.
     */
    public void setBufferSize(long size) {
        gtk_h.g_buffered_input_stream_set_buffer_size(handle(), size);
    }
    
}
