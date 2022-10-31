package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * @version 2.22
 */
public class FileIOStream extends org.gtk.gio.IOStream implements org.gtk.gio.Seekable {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GFileIOStream";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.IOStream.getMemoryLayout().withName("parent_instance"),
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
    public org.gtk.gio.IOStream parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gio.IOStream(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public FileIOStream(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to FileIOStream if its GType is a (or inherits from) "GFileIOStream".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "FileIOStream" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GFileIOStream", a ClassCastException will be thrown.
     */
    public static FileIOStream castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GFileIOStream"))) {
            return new FileIOStream(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GFileIOStream");
        }
    }
    
    /**
     * Gets the entity tag for the file when it has been written.
     * This must be called after the stream has been written
     * and closed, as the etag can change while writing.
     * @return the entity tag for the stream.
     */
    public @Nullable java.lang.String getEtag() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_io_stream_get_etag.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
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
     * @param attributes a file attribute query string.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return a {@link FileInfo} for the {@code stream}, or {@code null} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.gio.FileInfo queryInfo(@NotNull java.lang.String attributes, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(attributes, "Parameter 'attributes' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_io_stream_query_info.invokeExact(
                    handle(),
                    Interop.allocateNativeString(attributes),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.FileInfo(Refcounted.get(RESULT, true));
    }
    
    /**
     * Asynchronously queries the {@code stream} for a {@link FileInfo}. When completed,
     * {@code callback} will be called with a {@link AsyncResult} which can be used to
     * finish the operation with g_file_io_stream_query_info_finish().
     * <p>
     * For the synchronous version of this function, see
     * g_file_io_stream_query_info().
     * @param attributes a file attribute query string.
     * @param ioPriority the [I/O priority][gio-GIOScheduler] of the request
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @param callback callback to call when the request is satisfied
     */
    public void queryInfoAsync(@NotNull java.lang.String attributes, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(attributes, "Parameter 'attributes' must not be null");
        try {
            DowncallHandles.g_file_io_stream_query_info_async.invokeExact(
                    handle(),
                    Interop.allocateNativeString(attributes),
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
     * Finalizes the asynchronous query started
     * by g_file_io_stream_query_info_async().
     * @param result a {@link AsyncResult}.
     * @return A {@link FileInfo} for the finished query.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.gio.FileInfo queryInfoFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_io_stream_query_info_finish.invokeExact(
                    handle(),
                    result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.FileInfo(Refcounted.get(RESULT, true));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_file_io_stream_get_etag = Interop.downcallHandle(
            "g_file_io_stream_get_etag",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_file_io_stream_query_info = Interop.downcallHandle(
            "g_file_io_stream_query_info",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_file_io_stream_query_info_async = Interop.downcallHandle(
            "g_file_io_stream_query_info_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_file_io_stream_query_info_finish = Interop.downcallHandle(
            "g_file_io_stream_query_info_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
