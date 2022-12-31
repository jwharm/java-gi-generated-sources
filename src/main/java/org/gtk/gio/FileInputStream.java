package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
public class FileInputStream extends org.gtk.gio.InputStream implements org.gtk.gio.Seekable {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GFileInputStream";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gio.InputStream.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a FileInputStream proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected FileInputStream(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, FileInputStream> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new FileInputStream(input, ownership);
    
    /**
     * Queries a file input stream the given {@code attributes}. This function blocks
     * while querying the stream. For the asynchronous (non-blocking) version
     * of this function, see g_file_input_stream_query_info_async(). While the
     * stream is blocked, the stream will set the pending flag internally, and
     * any other operations on the stream will fail with {@link IOErrorEnum#PENDING}.
     * @param attributes a file attribute query string.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return a {@link FileInfo}, or {@code null} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.gio.FileInfo queryInfo(java.lang.String attributes, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_input_stream_query_info.invokeExact(
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
     * @param attributes a file attribute query string.
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @param callback callback to call when the request is satisfied
     */
    public void queryInfoAsync(java.lang.String attributes, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_file_input_stream_query_info_async.invokeExact(
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
     * Finishes an asynchronous info query operation.
     * @param result a {@link AsyncResult}.
     * @return {@link FileInfo}.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.gio.FileInfo queryInfoFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_input_stream_query_info_finish.invokeExact(
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
            RESULT = (long) DowncallHandles.g_file_input_stream_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link FileInputStream.Builder} object constructs a {@link FileInputStream} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link FileInputStream.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gio.InputStream.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link FileInputStream} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link FileInputStream}.
         * @return A new instance of {@code FileInputStream} with the properties 
         *         that were set in the Builder object.
         */
        public FileInputStream build() {
            return (FileInputStream) org.gtk.gobject.GObject.newWithProperties(
                FileInputStream.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_file_input_stream_query_info = Interop.downcallHandle(
            "g_file_input_stream_query_info",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_input_stream_query_info_async = Interop.downcallHandle(
            "g_file_input_stream_query_info_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_input_stream_query_info_finish = Interop.downcallHandle(
            "g_file_input_stream_query_info_finish",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_input_stream_get_type = Interop.downcallHandle(
            "g_file_input_stream_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
