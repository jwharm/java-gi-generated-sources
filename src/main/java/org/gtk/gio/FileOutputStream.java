package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GFileOutputStream provides output streams that write their
 * content to a file.
 * <p>
 * GFileOutputStream implements {@link Seekable}, which allows the output
 * stream to jump to arbitrary positions in the file and to truncate
 * the file, provided the filesystem of the file supports these
 * operations.
 * <p>
 * To find the position of a file output stream, use g_seekable_tell().
 * To find out if a file output stream supports seeking, use
 * g_seekable_can_seek().To position a file output stream, use
 * g_seekable_seek(). To find out if a file output stream supports
 * truncating, use g_seekable_can_truncate(). To truncate a file output
 * stream, use g_seekable_truncate().
 */
public class FileOutputStream extends org.gtk.gio.OutputStream implements org.gtk.gio.Seekable {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GFileOutputStream";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gio.OutputStream.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a FileOutputStream proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected FileOutputStream(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, FileOutputStream> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new FileOutputStream(input, ownership);
    
    /**
     * Gets the entity tag for the file when it has been written.
     * This must be called after the stream has been written
     * and closed, as the etag can change while writing.
     * @return the entity tag for the stream.
     */
    public @Nullable java.lang.String getEtag() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_output_stream_get_etag.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Queries a file output stream for the given {@code attributes}.
     * This function blocks while querying the stream. For the asynchronous
     * version of this function, see g_file_output_stream_query_info_async().
     * While the stream is blocked, the stream will set the pending flag
     * internally, and any other operations on the stream will fail with
     * {@link IOErrorEnum#PENDING}.
     * <p>
     * Can fail if the stream was already closed (with {@code error} being set to
     * {@link IOErrorEnum#CLOSED}), the stream has pending operations (with {@code error} being
     * set to {@link IOErrorEnum#PENDING}), or if querying info is not supported for
     * the stream's interface (with {@code error} being set to {@link IOErrorEnum#NOT_SUPPORTED}). In
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
    public org.gtk.gio.FileInfo queryInfo(java.lang.String attributes, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_output_stream_query_info.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(attributes, null),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (org.gtk.gio.FileInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.FileInfo.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Asynchronously queries the {@code stream} for a {@link FileInfo}. When completed,
     * {@code callback} will be called with a {@link AsyncResult} which can be used to
     * finish the operation with g_file_output_stream_query_info_finish().
     * <p>
     * For the synchronous version of this function, see
     * g_file_output_stream_query_info().
     * @param attributes a file attribute query string.
     * @param ioPriority the [I/O priority][gio-GIOScheduler] of the request
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @param callback callback to call when the request is satisfied
     */
    public void queryInfoAsync(java.lang.String attributes, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_file_output_stream_query_info_async.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(attributes, null),
                    ioPriority,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finalizes the asynchronous query started
     * by g_file_output_stream_query_info_async().
     * @param result a {@link AsyncResult}.
     * @return A {@link FileInfo} for the finished query.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.gio.FileInfo queryInfoFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_output_stream_query_info_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (org.gtk.gio.FileInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.FileInfo.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_file_output_stream_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link FileOutputStream.Builder} object constructs a {@link FileOutputStream} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link FileOutputStream.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gio.OutputStream.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link FileOutputStream} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link FileOutputStream}.
         * @return A new instance of {@code FileOutputStream} with the properties 
         *         that were set in the Builder object.
         */
        public FileOutputStream build() {
            return (FileOutputStream) org.gtk.gobject.GObject.newWithProperties(
                FileOutputStream.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_file_output_stream_get_etag = Interop.downcallHandle(
            "g_file_output_stream_get_etag",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_output_stream_query_info = Interop.downcallHandle(
            "g_file_output_stream_query_info",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_output_stream_query_info_async = Interop.downcallHandle(
            "g_file_output_stream_query_info_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_output_stream_query_info_finish = Interop.downcallHandle(
            "g_file_output_stream_query_info_finish",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_output_stream_get_type = Interop.downcallHandle(
            "g_file_output_stream_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
