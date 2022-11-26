package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GIOStream represents an object that has both read and write streams.
 * Generally the two streams act as separate input and output streams,
 * but they share some common resources and state. For instance, for
 * seekable streams, both streams may use the same position.
 * <p>
 * Examples of {@link IOStream} objects are {@link SocketConnection}, which represents
 * a two-way network connection; and {@link FileIOStream}, which represents a
 * file handle opened in read-write mode.
 * <p>
 * To do the actual reading and writing you need to get the substreams
 * with g_io_stream_get_input_stream() and g_io_stream_get_output_stream().
 * <p>
 * The {@link IOStream} object owns the input and the output streams, not the other
 * way around, so keeping the substreams alive will not keep the {@link IOStream}
 * object alive. If the {@link IOStream} object is freed it will be closed, thus
 * closing the substreams, so even if the substreams stay alive they will
 * always return {@link IOErrorEnum#CLOSED} for all operations.
 * <p>
 * To close a stream use g_io_stream_close() which will close the common
 * stream object and also the individual substreams. You can also close
 * the substreams themselves. In most cases this only marks the
 * substream as closed, so further I/O on it fails but common state in the
 * {@link IOStream} may still be open. However, some streams may support
 * "half-closed" states where one direction of the stream is actually shut down.
 * <p>
 * Operations on {@code GIOStreams} cannot be started while another operation on the
 * {@link IOStream} or its substreams is in progress. Specifically, an application can
 * read from the {@link InputStream} and write to the {@link OutputStream} simultaneously
 * (either in separate threads, or as asynchronous operations in the same
 * thread), but an application cannot start any {@link IOStream} operation while there
 * is a {@link IOStream}, {@link InputStream} or {@link OutputStream} operation in progress, and
 * an application can’t start any {@link InputStream} or {@link OutputStream} operation
 * while there is a {@link IOStream} operation in progress.
 * <p>
 * This is a product of individual stream operations being associated with a
 * given {@link org.gtk.glib.MainContext} (the thread-default context at the time the operation was
 * started), rather than entire streams being associated with a single
 * {@link org.gtk.glib.MainContext}.
 * <p>
 * GIO may run operations on {@code GIOStreams} from other (worker) threads, and this
 * may be exposed to application code in the behaviour of wrapper streams, such
 * as {@link BufferedInputStream} or {@link TlsConnection}. With such wrapper APIs,
 * application code may only run operations on the base (wrapped) stream when
 * the wrapper stream is idle. Note that the semantics of such operations may
 * not be well-defined due to the state the wrapper stream leaves the base
 * stream in (though they are guaranteed not to crash).
 * @version 2.22
 */
public class IOStream extends org.gtk.gobject.Object {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GIOStream";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gobject.Object parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gobject.Object(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a IOStream proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public IOStream(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to IOStream if its GType is a (or inherits from) "GIOStream".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code IOStream} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GIOStream", a ClassCastException will be thrown.
     */
    public static IOStream castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), IOStream.getType())) {
            return new IOStream(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GIOStream");
        }
    }
    
    /**
     * Clears the pending flag on {@code stream}.
     */
    public void clearPending() {
        try {
            DowncallHandles.g_io_stream_clear_pending.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Closes the stream, releasing resources related to it. This will also
     * close the individual input and output streams, if they are not already
     * closed.
     * <p>
     * Once the stream is closed, all other operations will return
     * {@link IOErrorEnum#CLOSED}. Closing a stream multiple times will not
     * return an error.
     * <p>
     * Closing a stream will automatically flush any outstanding buffers
     * in the stream.
     * <p>
     * Streams will be automatically closed when the last reference
     * is dropped, but you might want to call this function to make sure
     * resources are released as early as possible.
     * <p>
     * Some streams might keep the backing store of the stream (e.g. a file
     * descriptor) open after the stream is closed. See the documentation for
     * the individual stream for details.
     * <p>
     * On failure the first error that happened will be reported, but the
     * close operation will finish as much as possible. A stream that failed
     * to close will still return {@link IOErrorEnum#CLOSED} for all operations.
     * Still, it is important to check and report the error to the user,
     * otherwise there might be a loss of data as all data might not be written.
     * <p>
     * If {@code cancellable} is not NULL, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * Cancelling a close will still leave the stream closed, but some streams
     * can use a faster close that doesn't block to e.g. check errors.
     * <p>
     * The default implementation of this method just calls close on the
     * individual input/output streams.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore
     * @return {@code true} on success, {@code false} on failure
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean close(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_io_stream_close.invokeExact(
                    handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Requests an asynchronous close of the stream, releasing resources
     * related to it. When the operation is finished {@code callback} will be
     * called. You can then call g_io_stream_close_finish() to get
     * the result of the operation.
     * <p>
     * For behaviour details see g_io_stream_close().
     * <p>
     * The asynchronous methods have a default fallback that uses threads
     * to implement asynchronicity, so they are optional for inheriting
     * classes. However, if you override one you must override all.
     * @param ioPriority the io priority of the request
     * @param cancellable optional cancellable object
     * @param callback callback to call when the request is satisfied
     */
    public void closeAsync(int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_io_stream_close_async.invokeExact(
                    handle(),
                    ioPriority,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Closes a stream.
     * @param result a {@link AsyncResult}
     * @return {@code true} if stream was successfully closed, {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean closeFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_io_stream_close_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the input stream for this object. This is used
     * for reading.
     * @return a {@link InputStream}, owned by the {@link IOStream}.
     * Do not free.
     */
    public @NotNull org.gtk.gio.InputStream getInputStream() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_io_stream_get_input_stream.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.InputStream(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the output stream for this object. This is used for
     * writing.
     * @return a {@link OutputStream}, owned by the {@link IOStream}.
     * Do not free.
     */
    public @NotNull org.gtk.gio.OutputStream getOutputStream() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_io_stream_get_output_stream.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.OutputStream(RESULT, Ownership.NONE);
    }
    
    /**
     * Checks if a stream has pending actions.
     * @return {@code true} if {@code stream} has pending actions.
     */
    public boolean hasPending() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_io_stream_has_pending.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks if a stream is closed.
     * @return {@code true} if the stream is closed.
     */
    public boolean isClosed() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_io_stream_is_closed.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets {@code stream} to have actions pending. If the pending flag is
     * already set or {@code stream} is closed, it will return {@code false} and set
     * {@code error}.
     * @return {@code true} if pending was previously unset and is now set.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean setPending() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_io_stream_set_pending.invokeExact(
                    handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Asynchronously splice the output stream of {@code stream1} to the input stream of
     * {@code stream2}, and splice the output stream of {@code stream2} to the input stream of
     * {@code stream1}.
     * <p>
     * When the operation is finished {@code callback} will be called.
     * You can then call g_io_stream_splice_finish() to get the
     * result of the operation.
     * @param stream2 a {@link IOStream}.
     * @param flags a set of {@link IOStreamSpliceFlags}.
     * @param ioPriority the io priority of the request.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @param callback a {@link AsyncReadyCallback}.
     */
    public void spliceAsync(@NotNull org.gtk.gio.IOStream stream2, @NotNull org.gtk.gio.IOStreamSpliceFlags flags, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(stream2, "Parameter 'stream2' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_io_stream_splice_async.invokeExact(
                    handle(),
                    stream2.handle(),
                    flags.getValue(),
                    ioPriority,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_io_stream_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Finishes an asynchronous io stream splice operation.
     * @param result a {@link AsyncResult}.
     * @return {@code true} on success, {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static boolean spliceFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_io_stream_splice_finish.invokeExact(
                    result.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link IOStream.Build} object constructs a {@link IOStream} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link IOStream} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link IOStream} using {@link IOStream#castFrom}.
         * @return A new instance of {@code IOStream} with the properties 
         *         that were set in the Build object.
         */
        public IOStream construct() {
            return IOStream.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    IOStream.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setClosed(boolean closed) {
            names.add("closed");
            values.add(org.gtk.gobject.Value.create(closed));
            return this;
        }
        
        public Build setInputStream(org.gtk.gio.InputStream inputStream) {
            names.add("input-stream");
            values.add(org.gtk.gobject.Value.create(inputStream));
            return this;
        }
        
        public Build setOutputStream(org.gtk.gio.OutputStream outputStream) {
            names.add("output-stream");
            values.add(org.gtk.gobject.Value.create(outputStream));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_io_stream_clear_pending = Interop.downcallHandle(
            "g_io_stream_clear_pending",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_io_stream_close = Interop.downcallHandle(
            "g_io_stream_close",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_io_stream_close_async = Interop.downcallHandle(
            "g_io_stream_close_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_io_stream_close_finish = Interop.downcallHandle(
            "g_io_stream_close_finish",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_io_stream_get_input_stream = Interop.downcallHandle(
            "g_io_stream_get_input_stream",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_io_stream_get_output_stream = Interop.downcallHandle(
            "g_io_stream_get_output_stream",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_io_stream_has_pending = Interop.downcallHandle(
            "g_io_stream_has_pending",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_io_stream_is_closed = Interop.downcallHandle(
            "g_io_stream_is_closed",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_io_stream_set_pending = Interop.downcallHandle(
            "g_io_stream_set_pending",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_io_stream_splice_async = Interop.downcallHandle(
            "g_io_stream_splice_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_io_stream_get_type = Interop.downcallHandle(
            "g_io_stream_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_io_stream_splice_finish = Interop.downcallHandle(
            "g_io_stream_splice_finish",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
