package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * GFileIOStream provides io streams that both read and write to the same
 * file handle.
 * <p>
 * GFileIOStream implements {@link Seekable}, which allows the io
 * stream to jump to arbitrary positions in the file and to truncate
 * the file, provided the filesystem of the file supports these
 * operations.
 * <p>
 * To find the position of a file io stream, use
 * g_seekable_tell().
 * <p>
 * To find out if a file io stream supports seeking, use g_seekable_can_seek().
 * To position a file io stream, use g_seekable_seek().
 * To find out if a file io stream supports truncating, use
 * g_seekable_can_truncate(). To truncate a file io
 * stream, use g_seekable_truncate().
 * <p>
 * The default implementation of all the {@link FileIOStream} operations
 * and the implementation of {@link Seekable} just call into the same operations
 * on the output stream.
 */
public class FileIOStream extends IOStream implements Seekable {

    public FileIOStream(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to FileIOStream */
    public static FileIOStream castFrom(org.gtk.gobject.Object gobject) {
        return new FileIOStream(gobject.refcounted());
    }
    
    static final MethodHandle g_file_io_stream_get_etag = Interop.downcallHandle(
        "g_file_io_stream_get_etag",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the entity tag for the file when it has been written.
     * This must be called after the stream has been written
     * and closed, as the etag can change while writing.
     */
    public java.lang.String getEtag() {
        try {
            var RESULT = (MemoryAddress) g_file_io_stream_get_etag.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_io_stream_query_info = Interop.downcallHandle(
        "g_file_io_stream_query_info",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Queries a file io stream for the given {@code attributes}.
     * This function blocks while querying the stream. For the asynchronous
     * version of this function, see g_file_io_stream_query_info_async().
     * While the stream is blocked, the stream will set the pending flag
     * internally, and any other operations on the stream will fail with
     * {@link IOErrorEnum#PENDING}.
     * <p>
     * Can fail if the stream was already closed (with {@code error} being set to
     * {@link IOErrorEnum#CLOSED}), the stream has pending operations (with {@code error} being
     * set to {@link IOErrorEnum#PENDING}), or if querying info is not supported for
     * the stream's interface (with {@code error} being set to {@link IOErrorEnum#NOT_SUPPORTED}). I
     * all cases of failure, {@code null} will be returned.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be set, and {@code null} will
     * be returned.
     */
    public FileInfo queryInfo(java.lang.String attributes, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_io_stream_query_info.invokeExact(handle(), Interop.allocateNativeString(attributes).handle(), cancellable.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new FileInfo(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_io_stream_query_info_async = Interop.downcallHandle(
        "g_file_io_stream_query_info_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Asynchronously queries the {@code stream} for a {@link FileInfo}. When completed,
     * {@code callback} will be called with a {@link AsyncResult} which can be used to
     * finish the operation with g_file_io_stream_query_info_finish().
     * <p>
     * For the synchronous version of this function, see
     * g_file_io_stream_query_info().
     */
    public void queryInfoAsync(java.lang.String attributes, int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_file_io_stream_query_info_async.invokeExact(handle(), Interop.allocateNativeString(attributes).handle(), ioPriority, cancellable.handle(), 
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
    
    static final MethodHandle g_file_io_stream_query_info_finish = Interop.downcallHandle(
        "g_file_io_stream_query_info_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finalizes the asynchronous query started
     * by g_file_io_stream_query_info_async().
     */
    public FileInfo queryInfoFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_io_stream_query_info_finish.invokeExact(handle(), result.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new FileInfo(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
