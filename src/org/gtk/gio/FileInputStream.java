package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * GFileInputStream provides input streams that take their
 * content from a file.
 * 
 * GFileInputStream implements #GSeekable, which allows the input
 * stream to jump to arbitrary positions in the file, provided the
 * filesystem of the file allows it. To find the position of a file
 * input stream, use g_seekable_tell(). To find out if a file input
 * stream supports seeking, use g_seekable_can_seek().
 * To position a file input stream, use g_seekable_seek().
 */
public class FileInputStream extends InputStream implements Seekable {

    public FileInputStream(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to FileInputStream */
    public static FileInputStream castFrom(org.gtk.gobject.Object gobject) {
        return new FileInputStream(gobject.getReference());
    }
    
    /**
     * Queries a file input stream the given @attributes. This function blocks
     * while querying the stream. For the asynchronous (non-blocking) version
     * of this function, see g_file_input_stream_query_info_async(). While the
     * stream is blocked, the stream will set the pending flag internally, and
     * any other operations on the stream will fail with 
     *             
     *           
     *         
     *       
     *       
     *         
     *         
     *           
     *         
     *         
     *           
     *             
     *           
     *           
     *             
     *           
     *           
     *             
     *           
     *           
     *             
     *           
     *         
     *       
     *       
     *         
     *         
     *           
     *         
     *         
     *           
     *             
     *           
     *         
     *       
     *       
     *         Queries a file input stream the given @attributes. This function blocks
     * while querying the stream. For the asynchronous (non-blocking) version
     * of this function, see g_file_input_stream_query_info_async(). While the
     * stream is blocked, the stream will set the pending flag internally, and
     * any other operations on the stream will fail with %G_IO_ERROR_PENDING.
     */
    public FileInfo queryInfo(java.lang.String attributes, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_input_stream_query_info(handle(), Interop.allocateNativeString(attributes).handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new FileInfo(References.get(RESULT, true));
    }
    
    /**
     * Queries the stream information asynchronously.
     * When the operation is finished @callback will be called.
     * You can then call g_file_input_stream_query_info_finish()
     * to get the result of the operation.
     * 
     * For the synchronous version of this function,
     * see g_file_input_stream_query_info().
     * 
     * If @cancellable is not <code>NULL,</code> then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be set
     */
    public void queryInfoAsync(java.lang.String attributes, int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_file_input_stream_query_info_async(handle(), Interop.allocateNativeString(attributes).handle(), ioPriority, cancellable.handle(), 
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
     * Finishes an asynchronous info query operation.
     */
    public FileInfo queryInfoFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_input_stream_query_info_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new FileInfo(References.get(RESULT, true));
    }
    
}
