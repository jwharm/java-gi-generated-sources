package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * GFileInputStream provides input streams that take their
 * content from a file.
 * <p>
 * GFileInputStream implements {@link Seekable}, which allows the input
 * stream to jump to arbitrary positions in the file, provided the
 * filesystem of the file allows it. To find the position of a file
 * input stream, use g_seekable_tell(). To find out if a file input
 * stream supports seeking, use g_seekable_can_seek().
 * To position a file input stream, use g_seekable_seek().
 */
public class FileInputStream extends InputStream implements Seekable {

    public FileInputStream(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to FileInputStream */
    public static FileInputStream castFrom(org.gtk.gobject.Object gobject) {
        return new FileInputStream(gobject.refcounted());
    }
    
    static final MethodHandle g_file_input_stream_query_info = Interop.downcallHandle(
        "g_file_input_stream_query_info",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Queries a file input stream the given {@code attributes}. This function blocks
     * while querying the stream. For the asynchronous (non-blocking) version
     * of this function, see g_file_input_stream_query_info_async(). While the
     * stream is blocked, the stream will set the pending flag internally, and
     * any other operations on the stream will fail with {@link IOErrorEnum#PENDING}.
     */
    public FileInfo queryInfo(java.lang.String attributes, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_input_stream_query_info.invokeExact(handle(), Interop.allocateNativeString(attributes).handle(), cancellable.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new FileInfo(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_input_stream_query_info_async = Interop.downcallHandle(
        "g_file_input_stream_query_info_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Queries the stream information asynchronously.
     * When the operation is finished {@code callback} will be called.
     * You can then call g_file_input_stream_query_info_finish()
     * to get the result of the operation.
     * <p>
     * For the synchronous version of this function,
     * see g_file_input_stream_query_info().
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be set
     */
    public void queryInfoAsync(java.lang.String attributes, int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_file_input_stream_query_info_async.invokeExact(handle(), Interop.allocateNativeString(attributes).handle(), ioPriority, cancellable.handle(), 
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
    
    static final MethodHandle g_file_input_stream_query_info_finish = Interop.downcallHandle(
        "g_file_input_stream_query_info_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an asynchronous info query operation.
     */
    public FileInfo queryInfoFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_input_stream_query_info_finish.invokeExact(handle(), result.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new FileInfo(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
