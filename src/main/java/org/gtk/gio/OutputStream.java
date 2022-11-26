package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link OutputStream} has functions to write to a stream (g_output_stream_write()),
 * to close a stream (g_output_stream_close()) and to flush pending writes
 * (g_output_stream_flush()).
 * <p>
 * To copy the content of an input stream to an output stream without
 * manually handling the reads and writes, use g_output_stream_splice().
 * <p>
 * See the documentation for {@link IOStream} for details of thread safety of
 * streaming APIs.
 * <p>
 * All of these functions have async variants too.
 */
public class OutputStream extends org.gtk.gobject.Object {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GOutputStream";
    
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
     * Create a OutputStream proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public OutputStream(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to OutputStream if its GType is a (or inherits from) "GOutputStream".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code OutputStream} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GOutputStream", a ClassCastException will be thrown.
     */
    public static OutputStream castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), OutputStream.getType())) {
            return new OutputStream(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GOutputStream");
        }
    }
    
    /**
     * Clears the pending flag on {@code stream}.
     */
    public void clearPending() {
        try {
            DowncallHandles.g_output_stream_clear_pending.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Closes the stream, releasing resources related to it.
     * <p>
     * Once the stream is closed, all other operations will return {@link IOErrorEnum#CLOSED}.
     * Closing a stream multiple times will not return an error.
     * <p>
     * Closing a stream will automatically flush any outstanding buffers in the
     * stream.
     * <p>
     * Streams will be automatically closed when the last reference
     * is dropped, but you might want to call this function to make sure
     * resources are released as early as possible.
     * <p>
     * Some streams might keep the backing store of the stream (e.g. a file descriptor)
     * open after the stream is closed. See the documentation for the individual
     * stream for details.
     * <p>
     * On failure the first error that happened will be reported, but the close
     * operation will finish as much as possible. A stream that failed to
     * close will still return {@link IOErrorEnum#CLOSED} for all operations. Still, it
     * is important to check and report the error to the user, otherwise
     * there might be a loss of data as all data might not be written.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * Cancelling a close will still leave the stream closed, but there some streams
     * can use a faster close that doesn't block to e.g. check errors. On
     * cancellation (as with any error) there is no guarantee that all written
     * data will reach the target.
     * @param cancellable optional cancellable object
     * @return {@code true} on success, {@code false} on failure
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean close(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_output_stream_close.invokeExact(
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
     * called. You can then call g_output_stream_close_finish() to get
     * the result of the operation.
     * <p>
     * For behaviour details see g_output_stream_close().
     * <p>
     * The asynchronous methods have a default fallback that uses threads
     * to implement asynchronicity, so they are optional for inheriting
     * classes. However, if you override one you must override all.
     * @param ioPriority the io priority of the request.
     * @param cancellable optional cancellable object
     * @param callback callback to call when the request is satisfied
     */
    public void closeAsync(int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_output_stream_close_async.invokeExact(
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
     * Closes an output stream.
     * @param result a {@link AsyncResult}.
     * @return {@code true} if stream was successfully closed, {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean closeFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_output_stream_close_finish.invokeExact(
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
     * Forces a write of all user-space buffered data for the given
     * {@code stream}. Will block during the operation. Closing the stream will
     * implicitly cause a flush.
     * <p>
     * This function is optional for inherited classes.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * @param cancellable optional cancellable object
     * @return {@code true} on success, {@code false} on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean flush(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_output_stream_flush.invokeExact(
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
     * Forces an asynchronous write of all user-space buffered data for
     * the given {@code stream}.
     * For behaviour details see g_output_stream_flush().
     * <p>
     * When the operation is finished {@code callback} will be
     * called. You can then call g_output_stream_flush_finish() to get the
     * result of the operation.
     * @param ioPriority the io priority of the request.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @param callback a {@link AsyncReadyCallback} to call when the request is satisfied
     */
    public void flushAsync(int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_output_stream_flush_async.invokeExact(
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
     * Finishes flushing an output stream.
     * @param result a GAsyncResult.
     * @return {@code true} if flush operation succeeded, {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean flushFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_output_stream_flush_finish.invokeExact(
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
     * Checks if an output stream has pending actions.
     * @return {@code true} if {@code stream} has pending actions.
     */
    public boolean hasPending() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_output_stream_has_pending.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks if an output stream has already been closed.
     * @return {@code true} if {@code stream} is closed. {@code false} otherwise.
     */
    public boolean isClosed() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_output_stream_is_closed.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks if an output stream is being closed. This can be
     * used inside e.g. a flush implementation to see if the
     * flush (or other i/o operation) is called from within
     * the closing operation.
     * @return {@code true} if {@code stream} is being closed. {@code false} otherwise.
     */
    public boolean isClosing() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_output_stream_is_closing.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * This is a utility function around g_output_stream_write_all(). It
     * uses g_strdup_vprintf() to turn {@code format} and {@code .}.. into a string that
     * is then written to {@code stream}.
     * <p>
     * See the documentation of g_output_stream_write_all() about the
     * behavior of the actual write operation.
     * <p>
     * Note that partial writes cannot be properly checked with this
     * function due to the variable length of the written string, if you
     * need precise control over partial write failures, you need to
     * create you own printf()-like wrapper around g_output_stream_write()
     * or g_output_stream_write_all().
     * @param bytesWritten location to store the number of bytes that was
     *     written to the stream
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @param error location to store the error occurring, or {@code null} to ignore
     * @param format the format string. See the printf() documentation
     * @param varargs the parameters to insert into the format string
     * @return {@code true} on success, {@code false} if there was an error
     */
    public boolean printf(Out<Long> bytesWritten, @Nullable org.gtk.gio.Cancellable cancellable, @NotNull PointerProxy<org.gtk.glib.Error> error, @NotNull java.lang.String format, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(bytesWritten, "Parameter 'bytesWritten' must not be null");
        MemorySegment bytesWrittenPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_output_stream_printf.invokeExact(
                    handle(),
                    (Addressable) bytesWrittenPOINTER.address(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    error.handle(),
                    Interop.allocateNativeString(format),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        bytesWritten.set(bytesWrittenPOINTER.get(Interop.valueLayout.C_LONG, 0));
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
            RESULT = (int) DowncallHandles.g_output_stream_set_pending.invokeExact(
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
     * Splices an input stream into an output stream.
     * @param source a {@link InputStream}.
     * @param flags a set of {@link OutputStreamSpliceFlags}.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return a {@code gssize} containing the size of the data spliced, or
     *     -1 if an error occurred. Note that if the number of bytes
     *     spliced is greater than {@code G_MAXSSIZE}, then that will be
     *     returned, and there is no way to determine the actual number
     *     of bytes spliced.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public long splice(@NotNull org.gtk.gio.InputStream source, @NotNull org.gtk.gio.OutputStreamSpliceFlags flags, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(source, "Parameter 'source' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_output_stream_splice.invokeExact(
                    handle(),
                    source.handle(),
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Splices a stream asynchronously.
     * When the operation is finished {@code callback} will be called.
     * You can then call g_output_stream_splice_finish() to get the
     * result of the operation.
     * <p>
     * For the synchronous, blocking version of this function, see
     * g_output_stream_splice().
     * @param source a {@link InputStream}.
     * @param flags a set of {@link OutputStreamSpliceFlags}.
     * @param ioPriority the io priority of the request.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @param callback a {@link AsyncReadyCallback}.
     */
    public void spliceAsync(@NotNull org.gtk.gio.InputStream source, @NotNull org.gtk.gio.OutputStreamSpliceFlags flags, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(source, "Parameter 'source' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_output_stream_splice_async.invokeExact(
                    handle(),
                    source.handle(),
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
     * Finishes an asynchronous stream splice operation.
     * @param result a {@link AsyncResult}.
     * @return a {@code gssize} of the number of bytes spliced. Note that if the
     *     number of bytes spliced is greater than {@code G_MAXSSIZE}, then that
     *     will be returned, and there is no way to determine the actual
     *     number of bytes spliced.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public long spliceFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_output_stream_splice_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * This is a utility function around g_output_stream_write_all(). It
     * uses g_strdup_vprintf() to turn {@code format} and {@code args} into a string that
     * is then written to {@code stream}.
     * <p>
     * See the documentation of g_output_stream_write_all() about the
     * behavior of the actual write operation.
     * <p>
     * Note that partial writes cannot be properly checked with this
     * function due to the variable length of the written string, if you
     * need precise control over partial write failures, you need to
     * create you own printf()-like wrapper around g_output_stream_write()
     * or g_output_stream_write_all().
     * @param bytesWritten location to store the number of bytes that was
     *     written to the stream
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @param error location to store the error occurring, or {@code null} to ignore
     * @param format the format string. See the printf() documentation
     * @param args the parameters to insert into the format string
     * @return {@code true} on success, {@code false} if there was an error
     */
    public boolean vprintf(Out<Long> bytesWritten, @Nullable org.gtk.gio.Cancellable cancellable, @NotNull PointerProxy<org.gtk.glib.Error> error, @NotNull java.lang.String format, @NotNull VaList args) {
        java.util.Objects.requireNonNull(bytesWritten, "Parameter 'bytesWritten' must not be null");
        MemorySegment bytesWrittenPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        java.util.Objects.requireNonNull(args, "Parameter 'args' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_output_stream_vprintf.invokeExact(
                    handle(),
                    (Addressable) bytesWrittenPOINTER.address(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    error.handle(),
                    Interop.allocateNativeString(format),
                    args);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        bytesWritten.set(bytesWrittenPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return RESULT != 0;
    }
    
    /**
     * Tries to write {@code count} bytes from {@code buffer} into the stream. Will block
     * during the operation.
     * <p>
     * If count is 0, returns 0 and does nothing. A value of {@code count}
     * larger than {@code G_MAXSSIZE} will cause a {@link IOErrorEnum#INVALID_ARGUMENT} error.
     * <p>
     * On success, the number of bytes written to the stream is returned.
     * It is not an error if this is not the same as the requested size, as it
     * can happen e.g. on a partial I/O error, or if there is not enough
     * storage in the stream. All writes block until at least one byte
     * is written or an error occurs; 0 is never returned (unless
     * {@code count} is 0).
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned. If an
     * operation was partially finished when the operation was cancelled the
     * partial result will be returned, without an error.
     * <p>
     * On error -1 is returned and {@code error} is set accordingly.
     * @param buffer the buffer containing the data to write.
     * @param count the number of bytes to write
     * @param cancellable optional cancellable object
     * @return Number of bytes written, or -1 on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public long write(@NotNull byte[] buffer, long count, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_output_stream_write.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(buffer, false),
                    count,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Tries to write {@code count} bytes from {@code buffer} into the stream. Will block
     * during the operation.
     * <p>
     * This function is similar to g_output_stream_write(), except it tries to
     * write as many bytes as requested, only stopping on an error.
     * <p>
     * On a successful write of {@code count} bytes, {@code true} is returned, and {@code bytes_written}
     * is set to {@code count}.
     * <p>
     * If there is an error during the operation {@code false} is returned and {@code error}
     * is set to indicate the error status.
     * <p>
     * As a special exception to the normal conventions for functions that
     * use {@link org.gtk.glib.Error}, if this function returns {@code false} (and sets {@code error}) then
     * {@code bytes_written} will be set to the number of bytes that were
     * successfully written before the error was encountered.  This
     * functionality is only available from C.  If you need it from another
     * language then you must write your own loop around
     * g_output_stream_write().
     * @param buffer the buffer containing the data to write.
     * @param count the number of bytes to write
     * @param bytesWritten location to store the number of bytes that was
     *     written to the stream
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return {@code true} on success, {@code false} if there was an error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean writeAll(@NotNull byte[] buffer, long count, Out<Long> bytesWritten, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        java.util.Objects.requireNonNull(bytesWritten, "Parameter 'bytesWritten' must not be null");
        MemorySegment bytesWrittenPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_output_stream_write_all.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(buffer, false),
                    count,
                    (Addressable) bytesWrittenPOINTER.address(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        bytesWritten.set(bytesWrittenPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return RESULT != 0;
    }
    
    /**
     * Request an asynchronous write of {@code count} bytes from {@code buffer} into
     * the stream. When the operation is finished {@code callback} will be called.
     * You can then call g_output_stream_write_all_finish() to get the result of the
     * operation.
     * <p>
     * This is the asynchronous version of g_output_stream_write_all().
     * <p>
     * Call g_output_stream_write_all_finish() to collect the result.
     * <p>
     * Any outstanding I/O request with higher priority (lower numerical
     * value) will be executed before an outstanding request with lower
     * priority. Default priority is {@code G_PRIORITY_DEFAULT}.
     * <p>
     * Note that no copy of {@code buffer} will be made, so it must stay valid
     * until {@code callback} is called.
     * @param buffer the buffer containing the data to write
     * @param count the number of bytes to write
     * @param ioPriority the io priority of the request
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore
     * @param callback callback to call when the request is satisfied
     */
    public void writeAllAsync(@NotNull byte[] buffer, long count, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        try {
            DowncallHandles.g_output_stream_write_all_async.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(buffer, false),
                    count,
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
     * Finishes an asynchronous stream write operation started with
     * g_output_stream_write_all_async().
     * <p>
     * As a special exception to the normal conventions for functions that
     * use {@link org.gtk.glib.Error}, if this function returns {@code false} (and sets {@code error}) then
     * {@code bytes_written} will be set to the number of bytes that were
     * successfully written before the error was encountered.  This
     * functionality is only available from C.  If you need it from another
     * language then you must write your own loop around
     * g_output_stream_write_async().
     * @param result a {@link AsyncResult}
     * @param bytesWritten location to store the number of bytes that was written to the stream
     * @return {@code true} on success, {@code false} if there was an error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean writeAllFinish(@NotNull org.gtk.gio.AsyncResult result, Out<Long> bytesWritten) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        java.util.Objects.requireNonNull(bytesWritten, "Parameter 'bytesWritten' must not be null");
        MemorySegment bytesWrittenPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_output_stream_write_all_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) bytesWrittenPOINTER.address(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        bytesWritten.set(bytesWrittenPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return RESULT != 0;
    }
    
    /**
     * Request an asynchronous write of {@code count} bytes from {@code buffer} into
     * the stream. When the operation is finished {@code callback} will be called.
     * You can then call g_output_stream_write_finish() to get the result of the
     * operation.
     * <p>
     * During an async request no other sync and async calls are allowed,
     * and will result in {@link IOErrorEnum#PENDING} errors.
     * <p>
     * A value of {@code count} larger than {@code G_MAXSSIZE} will cause a
     * {@link IOErrorEnum#INVALID_ARGUMENT} error.
     * <p>
     * On success, the number of bytes written will be passed to the
     * {@code callback}. It is not an error if this is not the same as the
     * requested size, as it can happen e.g. on a partial I/O error,
     * but generally we try to write as many bytes as requested.
     * <p>
     * You are guaranteed that this method will never fail with
     * {@link IOErrorEnum#WOULD_BLOCK} - if {@code stream} can't accept more data, the
     * method will just wait until this changes.
     * <p>
     * Any outstanding I/O request with higher priority (lower numerical
     * value) will be executed before an outstanding request with lower
     * priority. Default priority is {@code G_PRIORITY_DEFAULT}.
     * <p>
     * The asynchronous methods have a default fallback that uses threads
     * to implement asynchronicity, so they are optional for inheriting
     * classes. However, if you override one you must override all.
     * <p>
     * For the synchronous, blocking version of this function, see
     * g_output_stream_write().
     * <p>
     * Note that no copy of {@code buffer} will be made, so it must stay valid
     * until {@code callback} is called. See g_output_stream_write_bytes_async()
     * for a {@link org.gtk.glib.Bytes} version that will automatically hold a reference to
     * the contents (without copying) for the duration of the call.
     * @param buffer the buffer containing the data to write.
     * @param count the number of bytes to write
     * @param ioPriority the io priority of the request.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @param callback callback to call when the request is satisfied
     */
    public void writeAsync(@NotNull byte[] buffer, long count, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        try {
            DowncallHandles.g_output_stream_write_async.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(buffer, false),
                    count,
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
     * A wrapper function for g_output_stream_write() which takes a
     * {@link org.gtk.glib.Bytes} as input.  This can be more convenient for use by language
     * bindings or in other cases where the refcounted nature of {@link org.gtk.glib.Bytes}
     * is helpful over a bare pointer interface.
     * <p>
     * However, note that this function may still perform partial writes,
     * just like g_output_stream_write().  If that occurs, to continue
     * writing, you will need to create a new {@link org.gtk.glib.Bytes} containing just the
     * remaining bytes, using g_bytes_new_from_bytes(). Passing the same
     * {@link org.gtk.glib.Bytes} instance multiple times potentially can result in duplicated
     * data in the output stream.
     * @param bytes the {@link org.gtk.glib.Bytes} to write
     * @param cancellable optional cancellable object
     * @return Number of bytes written, or -1 on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public long writeBytes(@NotNull org.gtk.glib.Bytes bytes, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(bytes, "Parameter 'bytes' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_output_stream_write_bytes.invokeExact(
                    handle(),
                    bytes.handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * This function is similar to g_output_stream_write_async(), but
     * takes a {@link org.gtk.glib.Bytes} as input.  Due to the refcounted nature of {@link org.gtk.glib.Bytes},
     * this allows the stream to avoid taking a copy of the data.
     * <p>
     * However, note that this function may still perform partial writes,
     * just like g_output_stream_write_async(). If that occurs, to continue
     * writing, you will need to create a new {@link org.gtk.glib.Bytes} containing just the
     * remaining bytes, using g_bytes_new_from_bytes(). Passing the same
     * {@link org.gtk.glib.Bytes} instance multiple times potentially can result in duplicated
     * data in the output stream.
     * <p>
     * For the synchronous, blocking version of this function, see
     * g_output_stream_write_bytes().
     * @param bytes The bytes to write
     * @param ioPriority the io priority of the request.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @param callback callback to call when the request is satisfied
     */
    public void writeBytesAsync(@NotNull org.gtk.glib.Bytes bytes, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(bytes, "Parameter 'bytes' must not be null");
        try {
            DowncallHandles.g_output_stream_write_bytes_async.invokeExact(
                    handle(),
                    bytes.handle(),
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
     * Finishes a stream write-from-{@link org.gtk.glib.Bytes} operation.
     * @param result a {@link AsyncResult}.
     * @return a {@code gssize} containing the number of bytes written to the stream.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public long writeBytesFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_output_stream_write_bytes_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Finishes a stream write operation.
     * @param result a {@link AsyncResult}.
     * @return a {@code gssize} containing the number of bytes written to the stream.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public long writeFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_output_stream_write_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Tries to write the bytes contained in the {@code n_vectors} {@code vectors} into the
     * stream. Will block during the operation.
     * <p>
     * If {@code n_vectors} is 0 or the sum of all bytes in {@code vectors} is 0, returns 0 and
     * does nothing.
     * <p>
     * On success, the number of bytes written to the stream is returned.
     * It is not an error if this is not the same as the requested size, as it
     * can happen e.g. on a partial I/O error, or if there is not enough
     * storage in the stream. All writes block until at least one byte
     * is written or an error occurs; 0 is never returned (unless
     * {@code n_vectors} is 0 or the sum of all bytes in {@code vectors} is 0).
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned. If an
     * operation was partially finished when the operation was cancelled the
     * partial result will be returned, without an error.
     * <p>
     * Some implementations of g_output_stream_writev() may have limitations on the
     * aggregate buffer size, and will return {@link IOErrorEnum#INVALID_ARGUMENT} if these
     * are exceeded. For example, when writing to a local file on UNIX platforms,
     * the aggregate buffer size must not exceed {@code G_MAXSSIZE} bytes.
     * @param vectors the buffer containing the {@code GOutputVectors} to write.
     * @param nVectors the number of vectors to write
     * @param bytesWritten location to store the number of bytes that were
     *     written to the stream
     * @param cancellable optional cancellable object
     * @return {@code true} on success, {@code false} if there was an error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean writev(@NotNull org.gtk.gio.OutputVector[] vectors, long nVectors, Out<Long> bytesWritten, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(vectors, "Parameter 'vectors' must not be null");
        java.util.Objects.requireNonNull(bytesWritten, "Parameter 'bytesWritten' must not be null");
        MemorySegment bytesWrittenPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_output_stream_writev.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(vectors, org.gtk.gio.OutputVector.getMemoryLayout(), false),
                    nVectors,
                    (Addressable) bytesWrittenPOINTER.address(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        bytesWritten.set(bytesWrittenPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return RESULT != 0;
    }
    
    /**
     * Tries to write the bytes contained in the {@code n_vectors} {@code vectors} into the
     * stream. Will block during the operation.
     * <p>
     * This function is similar to g_output_stream_writev(), except it tries to
     * write as many bytes as requested, only stopping on an error.
     * <p>
     * On a successful write of all {@code n_vectors} vectors, {@code true} is returned, and
     * {@code bytes_written} is set to the sum of all the sizes of {@code vectors}.
     * <p>
     * If there is an error during the operation {@code false} is returned and {@code error}
     * is set to indicate the error status.
     * <p>
     * As a special exception to the normal conventions for functions that
     * use {@link org.gtk.glib.Error}, if this function returns {@code false} (and sets {@code error}) then
     * {@code bytes_written} will be set to the number of bytes that were
     * successfully written before the error was encountered.  This
     * functionality is only available from C. If you need it from another
     * language then you must write your own loop around
     * g_output_stream_write().
     * <p>
     * The content of the individual elements of {@code vectors} might be changed by this
     * function.
     * @param vectors the buffer containing the {@code GOutputVectors} to write.
     * @param nVectors the number of vectors to write
     * @param bytesWritten location to store the number of bytes that were
     *     written to the stream
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return {@code true} on success, {@code false} if there was an error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean writevAll(@NotNull org.gtk.gio.OutputVector[] vectors, long nVectors, Out<Long> bytesWritten, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(vectors, "Parameter 'vectors' must not be null");
        java.util.Objects.requireNonNull(bytesWritten, "Parameter 'bytesWritten' must not be null");
        MemorySegment bytesWrittenPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_output_stream_writev_all.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(vectors, org.gtk.gio.OutputVector.getMemoryLayout(), false),
                    nVectors,
                    (Addressable) bytesWrittenPOINTER.address(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        bytesWritten.set(bytesWrittenPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return RESULT != 0;
    }
    
    /**
     * Request an asynchronous write of the bytes contained in the {@code n_vectors} {@code vectors} into
     * the stream. When the operation is finished {@code callback} will be called.
     * You can then call g_output_stream_writev_all_finish() to get the result of the
     * operation.
     * <p>
     * This is the asynchronous version of g_output_stream_writev_all().
     * <p>
     * Call g_output_stream_writev_all_finish() to collect the result.
     * <p>
     * Any outstanding I/O request with higher priority (lower numerical
     * value) will be executed before an outstanding request with lower
     * priority. Default priority is {@code G_PRIORITY_DEFAULT}.
     * <p>
     * Note that no copy of {@code vectors} will be made, so it must stay valid
     * until {@code callback} is called. The content of the individual elements
     * of {@code vectors} might be changed by this function.
     * @param vectors the buffer containing the {@code GOutputVectors} to write.
     * @param nVectors the number of vectors to write
     * @param ioPriority the I/O priority of the request
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore
     * @param callback callback to call when the request is satisfied
     */
    public void writevAllAsync(@NotNull org.gtk.gio.OutputVector[] vectors, long nVectors, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(vectors, "Parameter 'vectors' must not be null");
        try {
            DowncallHandles.g_output_stream_writev_all_async.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(vectors, org.gtk.gio.OutputVector.getMemoryLayout(), false),
                    nVectors,
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
     * Finishes an asynchronous stream write operation started with
     * g_output_stream_writev_all_async().
     * <p>
     * As a special exception to the normal conventions for functions that
     * use {@link org.gtk.glib.Error}, if this function returns {@code false} (and sets {@code error}) then
     * {@code bytes_written} will be set to the number of bytes that were
     * successfully written before the error was encountered.  This
     * functionality is only available from C.  If you need it from another
     * language then you must write your own loop around
     * g_output_stream_writev_async().
     * @param result a {@link AsyncResult}
     * @param bytesWritten location to store the number of bytes that were written to the stream
     * @return {@code true} on success, {@code false} if there was an error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean writevAllFinish(@NotNull org.gtk.gio.AsyncResult result, Out<Long> bytesWritten) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        java.util.Objects.requireNonNull(bytesWritten, "Parameter 'bytesWritten' must not be null");
        MemorySegment bytesWrittenPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_output_stream_writev_all_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) bytesWrittenPOINTER.address(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        bytesWritten.set(bytesWrittenPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return RESULT != 0;
    }
    
    /**
     * Request an asynchronous write of the bytes contained in {@code n_vectors} {@code vectors} into
     * the stream. When the operation is finished {@code callback} will be called.
     * You can then call g_output_stream_writev_finish() to get the result of the
     * operation.
     * <p>
     * During an async request no other sync and async calls are allowed,
     * and will result in {@link IOErrorEnum#PENDING} errors.
     * <p>
     * On success, the number of bytes written will be passed to the
     * {@code callback}. It is not an error if this is not the same as the
     * requested size, as it can happen e.g. on a partial I/O error,
     * but generally we try to write as many bytes as requested.
     * <p>
     * You are guaranteed that this method will never fail with
     * {@link IOErrorEnum#WOULD_BLOCK} — if {@code stream} can't accept more data, the
     * method will just wait until this changes.
     * <p>
     * Any outstanding I/O request with higher priority (lower numerical
     * value) will be executed before an outstanding request with lower
     * priority. Default priority is {@code G_PRIORITY_DEFAULT}.
     * <p>
     * The asynchronous methods have a default fallback that uses threads
     * to implement asynchronicity, so they are optional for inheriting
     * classes. However, if you override one you must override all.
     * <p>
     * For the synchronous, blocking version of this function, see
     * g_output_stream_writev().
     * <p>
     * Note that no copy of {@code vectors} will be made, so it must stay valid
     * until {@code callback} is called.
     * @param vectors the buffer containing the {@code GOutputVectors} to write.
     * @param nVectors the number of vectors to write
     * @param ioPriority the I/O priority of the request.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @param callback callback to call when the request is satisfied
     */
    public void writevAsync(@NotNull org.gtk.gio.OutputVector[] vectors, long nVectors, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(vectors, "Parameter 'vectors' must not be null");
        try {
            DowncallHandles.g_output_stream_writev_async.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(vectors, org.gtk.gio.OutputVector.getMemoryLayout(), false),
                    nVectors,
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
     * Finishes a stream writev operation.
     * @param result a {@link AsyncResult}.
     * @param bytesWritten location to store the number of bytes that were written to the stream
     * @return {@code true} on success, {@code false} if there was an error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean writevFinish(@NotNull org.gtk.gio.AsyncResult result, Out<Long> bytesWritten) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        java.util.Objects.requireNonNull(bytesWritten, "Parameter 'bytesWritten' must not be null");
        MemorySegment bytesWrittenPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_output_stream_writev_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) bytesWrittenPOINTER.address(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        bytesWritten.set(bytesWrittenPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return RESULT != 0;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_output_stream_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link OutputStream.Build} object constructs a {@link OutputStream} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link OutputStream} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link OutputStream} using {@link OutputStream#castFrom}.
         * @return A new instance of {@code OutputStream} with the properties 
         *         that were set in the Build object.
         */
        public OutputStream construct() {
            return OutputStream.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    OutputStream.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_output_stream_clear_pending = Interop.downcallHandle(
            "g_output_stream_clear_pending",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_output_stream_close = Interop.downcallHandle(
            "g_output_stream_close",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_output_stream_close_async = Interop.downcallHandle(
            "g_output_stream_close_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_output_stream_close_finish = Interop.downcallHandle(
            "g_output_stream_close_finish",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_output_stream_flush = Interop.downcallHandle(
            "g_output_stream_flush",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_output_stream_flush_async = Interop.downcallHandle(
            "g_output_stream_flush_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_output_stream_flush_finish = Interop.downcallHandle(
            "g_output_stream_flush_finish",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_output_stream_has_pending = Interop.downcallHandle(
            "g_output_stream_has_pending",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_output_stream_is_closed = Interop.downcallHandle(
            "g_output_stream_is_closed",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_output_stream_is_closing = Interop.downcallHandle(
            "g_output_stream_is_closing",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_output_stream_printf = Interop.downcallHandle(
            "g_output_stream_printf",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle g_output_stream_set_pending = Interop.downcallHandle(
            "g_output_stream_set_pending",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_output_stream_splice = Interop.downcallHandle(
            "g_output_stream_splice",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_output_stream_splice_async = Interop.downcallHandle(
            "g_output_stream_splice_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_output_stream_splice_finish = Interop.downcallHandle(
            "g_output_stream_splice_finish",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_output_stream_vprintf = Interop.downcallHandle(
            "g_output_stream_vprintf",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_output_stream_write = Interop.downcallHandle(
            "g_output_stream_write",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_output_stream_write_all = Interop.downcallHandle(
            "g_output_stream_write_all",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_output_stream_write_all_async = Interop.downcallHandle(
            "g_output_stream_write_all_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_output_stream_write_all_finish = Interop.downcallHandle(
            "g_output_stream_write_all_finish",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_output_stream_write_async = Interop.downcallHandle(
            "g_output_stream_write_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_output_stream_write_bytes = Interop.downcallHandle(
            "g_output_stream_write_bytes",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_output_stream_write_bytes_async = Interop.downcallHandle(
            "g_output_stream_write_bytes_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_output_stream_write_bytes_finish = Interop.downcallHandle(
            "g_output_stream_write_bytes_finish",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_output_stream_write_finish = Interop.downcallHandle(
            "g_output_stream_write_finish",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_output_stream_writev = Interop.downcallHandle(
            "g_output_stream_writev",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_output_stream_writev_all = Interop.downcallHandle(
            "g_output_stream_writev_all",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_output_stream_writev_all_async = Interop.downcallHandle(
            "g_output_stream_writev_all_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_output_stream_writev_all_finish = Interop.downcallHandle(
            "g_output_stream_writev_all_finish",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_output_stream_writev_async = Interop.downcallHandle(
            "g_output_stream_writev_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_output_stream_writev_finish = Interop.downcallHandle(
            "g_output_stream_writev_finish",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_output_stream_get_type = Interop.downcallHandle(
            "g_output_stream_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
