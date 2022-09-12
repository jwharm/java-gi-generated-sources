package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * GFileOutputStream provides output streams that write their
 * content to a file.
 * 
 * GFileOutputStream implements #GSeekable, which allows the output
 * stream to jump to arbitrary positions in the file and to truncate
 * the file, provided the filesystem of the file supports these
 * operations.
 * 
 * To find the position of a file output stream, use g_seekable_tell().
 * To find out if a file output stream supports seeking, use
 * g_seekable_can_seek().To position a file output stream, use
 * g_seekable_seek(). To find out if a file output stream supports
 * truncating, use g_seekable_can_truncate(). To truncate a file output
 * stream, use g_seekable_truncate().
 */
public class FileOutputStream extends OutputStream implements Seekable {

    public FileOutputStream(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to FileOutputStream */
    public static FileOutputStream castFrom(org.gtk.gobject.Object gobject) {
        return new FileOutputStream(gobject.getReference());
    }
    
    /**
     * Gets the entity tag for the file when it has been written.
     * This must be called after the stream has been written
     * and closed, as the etag can change while writing.
     */
    public java.lang.String getEtag() {
        var RESULT = gtk_h.g_file_output_stream_get_etag(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Queries a file output stream for the given @attributes.
     * This function blocks while querying the stream. For the asynchronous
     * version of this function, see g_file_output_stream_query_info_async().
     * While the stream is blocked, the stream will set the pending flag
     * internally, and any other operations on the stream will fail with
     * %G_IO_ERROR_PENDING.
     * 
     * Can fail if the stream was already closed (with @error being set to
     * %G_IO_ERROR_CLOSED), the stream has pending operations (with @error being
     * set to %G_IO_ERROR_PENDING), or if querying info is not supported for
     * the stream's interface (with @error being set to %G_IO_ERROR_NOT_SUPPORTED). In
     * all cases of failure, %NULL will be returned.
     * 
     * If @cancellable is not %NULL, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be set, and %NULL will
     * be returned.
     */
    public FileInfo queryInfo(java.lang.String attributes, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_output_stream_query_info(handle(), Interop.allocateNativeString(attributes).handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new FileInfo(References.get(RESULT, true));
    }
    
    /**
     * Asynchronously queries the @stream for a #GFileInfo. When completed,
     * @callback will be called with a #GAsyncResult which can be used to
     * finish the operation with g_file_output_stream_query_info_finish().
     * 
     * For the synchronous version of this function, see
     * g_file_output_stream_query_info().
     */
    public void queryInfoAsync(java.lang.String attributes, int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_file_output_stream_query_info_async(handle(), Interop.allocateNativeString(attributes).handle(), ioPriority, cancellable.handle(), 
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
     * by g_file_output_stream_query_info_async().
     */
    public FileInfo queryInfoFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_output_stream_query_info_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new FileInfo(References.get(RESULT, true));
    }
    
}
