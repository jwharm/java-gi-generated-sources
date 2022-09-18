package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Buffered input stream implements {@link org.gtk.gio.FilterInputStream} and provides
 * for buffered reads.
 * 
 * By default, {@link org.gtk.gio.BufferedInputStream} <code>#39</code> s buffer size is set at 4 kilobytes.
 * 
 * To create a buffered input stream, use g_buffered_input_stream_new(),
 * or g_buffered_input_stream_new_sized() to specify the buffer&<code>#39</code> s size at
 * construction.
 * 
 * To get the size of a buffer within a buffered input stream, use
 * g_buffered_input_stream_get_buffer_size(). To change the size of a
 * buffered input stream&<code>#39</code> s buffer, use
 * g_buffered_input_stream_set_buffer_size(). Note that the buffer&<code>#39</code> s size
 * cannot be reduced below the size of the data within the buffer.
 */
public class BufferedInputStream extends FilterInputStream implements Seekable {

    public BufferedInputStream(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to BufferedInputStream */
    public static BufferedInputStream castFrom(org.gtk.gobject.Object gobject) {
        return new BufferedInputStream(gobject.getReference());
    }
    
    private static Reference constructNew(InputStream baseStream) {
        Reference RESULT = References.get(gtk_h.g_buffered_input_stream_new(baseStream.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link org.gtk.gio.InputStream} from the given @base_stream, with
     * a buffer set to the default size (4 kilobytes).
     */
    public BufferedInputStream(InputStream baseStream) {
        super(constructNew(baseStream));
    }
    
    private static Reference constructNewSized(InputStream baseStream, long size) {
        Reference RESULT = References.get(gtk_h.g_buffered_input_stream_new_sized(baseStream.handle(), size), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link org.gtk.gio.BufferedInputStream} from the given @base_stream,
     * with a buffer set to @size.
     */
    public static BufferedInputStream newSized(InputStream baseStream, long size) {
        return new BufferedInputStream(constructNewSized(baseStream, size));
    }
    
    /**
     * Tries to read @count bytes from the stream into the buffer.
     * Will block during this read.
     * 
     * If @count is zero, returns zero and does nothing. A value of @count
     * larger than <code>G_MAXSSIZE</code> will cause a {@link org.gtk.gio.IOErrorEnum<code>#INVALID_ARGUMENT</code>  error.
     * 
     * On success, the number of bytes read into the buffer is returned.
     * It is not an error if this is not the same as the requested size, as it
     * can happen e.g. near the end of a file. Zero is returned on end of file
     * (or if @count is zero),  but never otherwise.
     * 
     * If @count is -1 then the attempted read size is equal to the number of
     * bytes that are required to fill the buffer.
     * 
     * If @cancellable is not <code>null</code>  then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum<code>#CANCELLED</code>  will be returned. If an
     * operation was partially finished when the operation was cancelled the
     * partial result will be returned, without an error.
     * 
     * On error -1 is returned and @error is set accordingly.
     * 
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
     * Reads data into @stream&<code>#39</code> s buffer asynchronously, up to @count size.
     * @io_priority can be used to prioritize reads. For the synchronous
     * version of this function, see g_buffered_input_stream_fill().
     * 
     * If @count is -1 then the attempted read size is equal to the number
     * of bytes that are required to fill the buffer.
     */
    public void fillAsync(long count, int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_buffered_input_stream_fill_async(handle(), count, ioPriority, cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
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
     * Peeks in the buffer, copying data of size @count into @buffer,
     * offset @offset bytes.
     */
    public long peek(byte[] buffer, long offset, long count) {
        var RESULT = gtk_h.g_buffered_input_stream_peek(handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, buffer)).handle(), offset, count);
        return RESULT;
    }
    
    /**
     * Tries to read a single byte from the stream or the buffer. Will block
     * during this read.
     * 
     * On success, the byte read from the stream is returned. On end of stream
     * -1 is returned but it&<code>#39</code> s not an exceptional error and @error is not set.
     * 
     * If @cancellable is not <code>null</code>  then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum<code>#CANCELLED</code>  will be returned. If an
     * operation was partially finished when the operation was cancelled the
     * partial result will be returned, without an error.
     * 
     * On error -1 is returned and @error is set accordingly.
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
     * Sets the size of the internal buffer of @stream to @size, or to the
     * size of the contents of the buffer. The buffer can never be resized
     * smaller than its current contents.
     */
    public void setBufferSize(long size) {
        gtk_h.g_buffered_input_stream_set_buffer_size(handle(), size);
    }
    
}
