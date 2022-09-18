package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * GFileIOStream provides io streams that both read and write to the same
 * file handle.
 * 
 * GFileIOStream implements {@link org.gtk.gio.Seekable}  which allows the io
 * stream to jump to arbitrary positions in the file and to truncate
 * the file, provided the filesystem of the file supports these
 * operations.
 * 
 * To find the position of a file io stream, use
 * g_seekable_tell().
 * 
 * To find out if a file io stream supports seeking, use g_seekable_can_seek().
 * To position a file io stream, use g_seekable_seek().
 * To find out if a file io stream supports truncating, use
 * g_seekable_can_truncate(). To truncate a file io
 * stream, use g_seekable_truncate().
 * 
 * The default implementation of all the {@link org.gtk.gio.FileIOStream} operations
 * and the implementation of {@link org.gtk.gio.Seekable} just call into the same operations
 * on the output stream.
 */
public class FileIOStream extends IOStream implements Seekable {

    public FileIOStream(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to FileIOStream */
    public static FileIOStream castFrom(org.gtk.gobject.Object gobject) {
        return new FileIOStream(gobject.getReference());
    }
    
    /**
     * Gets the entity tag for the file when it has been written.
     * This must be called after the stream has been written
     * and closed, as the etag can change while writing.
     */
    public java.lang.String getEtag() {
        var RESULT = gtk_h.g_file_io_stream_get_etag(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Queries a file io stream for the given @attributes.
     * This function blocks while querying the stream. For the asynchronous
     * version of this function, see g_file_io_stream_query_info_async().
     * While the stream is blocked, the stream will set the pending flag
     * internally, and any other operations on the stream will fail with
     * {@link org.gtk.gio.IOErrorEnum<code>#PENDING</code>  
     * 
     * Can fail if the stream was already closed (with @error being set to
     * {@link org.gtk.gio.IOErrorEnum<code>#CLOSED</code>  , the stream has pending operations (with @error being
     * set to {@link org.gtk.gio.IOErrorEnum<code>#PENDING</code>  , or if querying info is not supported for
     * the stream&<code>#39</code> s interface (with @error being set to {@link org.gtk.gio.IOErrorEnum<code>#NOT_SUPPORTED</code>  . I
     * all cases of failure, <code>null</code> will be returned.
     * 
     * If @cancellable is not <code>null</code>  then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum<code>#CANCELLED</code>  will be set, and <code>null</code> will
     * be returned.
     */
    public FileInfo queryInfo(java.lang.String attributes, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_io_stream_query_info(handle(), Interop.allocateNativeString(attributes).handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new FileInfo(References.get(RESULT, true));
    }
    
    /**
     * Asynchronously queries the @stream for a {@link org.gtk.gio.FileInfo}  When completed,
     * @callback will be called with a {@link org.gtk.gio.AsyncResult} which can be used to
     * finish the operation with g_file_io_stream_query_info_finish().
     * 
     * For the synchronous version of this function, see
     * g_file_io_stream_query_info().
     */
    public void queryInfoAsync(java.lang.String attributes, int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_file_io_stream_query_info_async(handle(), Interop.allocateNativeString(attributes).handle(), ioPriority, cancellable.handle(), 
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
     * Finalizes the asynchronous query started
     * by g_file_io_stream_query_info_async().
     */
    public FileInfo queryInfoFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_io_stream_query_info_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new FileInfo(References.get(RESULT, true));
    }
    
}
