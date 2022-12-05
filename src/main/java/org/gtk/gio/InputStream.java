package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link InputStream} has functions to read from a stream (g_input_stream_read()),
 * to close a stream (g_input_stream_close()) and to skip some content
 * (g_input_stream_skip()).
 * <p>
 * To copy the content of an input stream to an output stream without
 * manually handling the reads and writes, use g_output_stream_splice().
 * <p>
 * See the documentation for {@link IOStream} for details of thread safety of
 * streaming APIs.
 * <p>
 * All of these functions have async variants too.
 */
public class InputStream extends org.gtk.gobject.Object {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GInputStream";
    
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
     * Create a InputStream proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public InputStream(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to InputStream if its GType is a (or inherits from) "GInputStream".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code InputStream} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GInputStream", a ClassCastException will be thrown.
     */
    public static InputStream castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), InputStream.getType())) {
            return new InputStream(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GInputStream");
        }
    }
    
    /**
     * Clears the pending flag on {@code stream}.
     */
    public void clearPending() {
        try {
            DowncallHandles.g_input_stream_clear_pending.invokeExact(
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
     * is important to check and report the error to the user.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * Cancelling a close will still leave the stream closed, but some streams
     * can use a faster close that doesn't block to e.g. check errors.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return {@code true} on success, {@code false} on failure
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean close(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_input_stream_close.invokeExact(
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
     * Requests an asynchronous closes of the stream, releasing resources related to it.
     * When the operation is finished {@code callback} will be called.
     * You can then call g_input_stream_close_finish() to get the result of the
     * operation.
     * <p>
     * For behaviour details see g_input_stream_close().
     * <p>
     * The asynchronous methods have a default fallback that uses threads to implement
     * asynchronicity, so they are optional for inheriting classes. However, if you
     * override one you must override all.
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional cancellable object
     * @param callback callback to call when the request is satisfied
     */
    public void closeAsync(int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_input_stream_close_async.invokeExact(
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
     * Finishes closing a stream asynchronously, started from g_input_stream_close_async().
     * @param result a {@link AsyncResult}.
     * @return {@code true} if the stream was closed successfully.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean closeFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_input_stream_close_finish.invokeExact(
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
     * Checks if an input stream has pending actions.
     * @return {@code true} if {@code stream} has pending actions.
     */
    public boolean hasPending() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_input_stream_has_pending.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks if an input stream is closed.
     * @return {@code true} if the stream is closed.
     */
    public boolean isClosed() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_input_stream_is_closed.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Tries to read {@code count} bytes from the stream into the buffer starting at
     * {@code buffer}. Will block during this read.
     * <p>
     * If count is zero returns zero and does nothing. A value of {@code count}
     * larger than {@code G_MAXSSIZE} will cause a {@link IOErrorEnum#INVALID_ARGUMENT} error.
     * <p>
     * On success, the number of bytes read into the buffer is returned.
     * It is not an error if this is not the same as the requested size, as it
     * can happen e.g. near the end of a file. Zero is returned on end of file
     * (or if {@code count} is zero),  but never otherwise.
     * <p>
     * The returned {@code buffer} is not a nul-terminated string, it can contain nul bytes
     * at any position, and this function doesn't nul-terminate the {@code buffer}.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned. If an
     * operation was partially finished when the operation was cancelled the
     * partial result will be returned, without an error.
     * <p>
     * On error -1 is returned and {@code error} is set accordingly.
     * @param buffer a buffer to read data into (which should be at least count bytes long).
     * @param count the number of bytes that will be read from the stream
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return Number of bytes read, or -1 on error, or 0 on end of file.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public long read(@NotNull Out<byte[]> buffer, long count, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        MemorySegment bufferPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_input_stream_read.invokeExact(
                    handle(),
                    (Addressable) bufferPOINTER.address(),
                    count,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        buffer.set(MemorySegment.ofAddress(bufferPOINTER.get(Interop.valueLayout.ADDRESS, 0), count * Interop.valueLayout.C_BYTE.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_BYTE));
        return RESULT;
    }
    
    /**
     * Tries to read {@code count} bytes from the stream into the buffer starting at
     * {@code buffer}. Will block during this read.
     * <p>
     * This function is similar to g_input_stream_read(), except it tries to
     * read as many bytes as requested, only stopping on an error or end of stream.
     * <p>
     * On a successful read of {@code count} bytes, or if we reached the end of the
     * stream,  {@code true} is returned, and {@code bytes_read} is set to the number of bytes
     * read into {@code buffer}.
     * <p>
     * If there is an error during the operation {@code false} is returned and {@code error}
     * is set to indicate the error status.
     * <p>
     * As a special exception to the normal conventions for functions that
     * use {@link org.gtk.glib.Error}, if this function returns {@code false} (and sets {@code error}) then
     * {@code bytes_read} will be set to the number of bytes that were successfully
     * read before the error was encountered.  This functionality is only
     * available from C.  If you need it from another language then you must
     * write your own loop around g_input_stream_read().
     * @param buffer a buffer to read data into (which should be at least count bytes long).
     * @param count the number of bytes that will be read from the stream
     * @param bytesRead location to store the number of bytes that was read from the stream
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return {@code true} on success, {@code false} if there was an error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean readAll(@NotNull Out<byte[]> buffer, long count, Out<Long> bytesRead, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        MemorySegment bufferPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(bytesRead, "Parameter 'bytesRead' must not be null");
        MemorySegment bytesReadPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_input_stream_read_all.invokeExact(
                    handle(),
                    (Addressable) bufferPOINTER.address(),
                    count,
                    (Addressable) bytesReadPOINTER.address(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        bytesRead.set(bytesReadPOINTER.get(Interop.valueLayout.C_LONG, 0));
        buffer.set(MemorySegment.ofAddress(bufferPOINTER.get(Interop.valueLayout.ADDRESS, 0), count * Interop.valueLayout.C_BYTE.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_BYTE));
        return RESULT != 0;
    }
    
    /**
     * Request an asynchronous read of {@code count} bytes from the stream into the
     * buffer starting at {@code buffer}.
     * <p>
     * This is the asynchronous equivalent of g_input_stream_read_all().
     * <p>
     * Call g_input_stream_read_all_finish() to collect the result.
     * <p>
     * Any outstanding I/O request with higher priority (lower numerical
     * value) will be executed before an outstanding request with lower
     * priority. Default priority is {@code G_PRIORITY_DEFAULT}.
     * @param buffer a buffer to read data into (which should be at least count bytes long)
     * @param count the number of bytes that will be read from the stream
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore
     * @param callback callback to call when the request is satisfied
     */
    public void readAllAsync(@NotNull Out<byte[]> buffer, long count, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        MemorySegment bufferPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.g_input_stream_read_all_async.invokeExact(
                    handle(),
                    (Addressable) bufferPOINTER.address(),
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
        buffer.set(MemorySegment.ofAddress(bufferPOINTER.get(Interop.valueLayout.ADDRESS, 0), count * Interop.valueLayout.C_BYTE.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_BYTE));
    }
    
    /**
     * Finishes an asynchronous stream read operation started with
     * g_input_stream_read_all_async().
     * <p>
     * As a special exception to the normal conventions for functions that
     * use {@link org.gtk.glib.Error}, if this function returns {@code false} (and sets {@code error}) then
     * {@code bytes_read} will be set to the number of bytes that were successfully
     * read before the error was encountered.  This functionality is only
     * available from C.  If you need it from another language then you must
     * write your own loop around g_input_stream_read_async().
     * @param result a {@link AsyncResult}
     * @param bytesRead location to store the number of bytes that was read from the stream
     * @return {@code true} on success, {@code false} if there was an error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean readAllFinish(@NotNull org.gtk.gio.AsyncResult result, Out<Long> bytesRead) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        java.util.Objects.requireNonNull(bytesRead, "Parameter 'bytesRead' must not be null");
        MemorySegment bytesReadPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_input_stream_read_all_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) bytesReadPOINTER.address(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        bytesRead.set(bytesReadPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return RESULT != 0;
    }
    
    /**
     * Request an asynchronous read of {@code count} bytes from the stream into the buffer
     * starting at {@code buffer}. When the operation is finished {@code callback} will be called.
     * You can then call g_input_stream_read_finish() to get the result of the
     * operation.
     * <p>
     * During an async request no other sync and async calls are allowed on {@code stream}, and will
     * result in {@link IOErrorEnum#PENDING} errors.
     * <p>
     * A value of {@code count} larger than {@code G_MAXSSIZE} will cause a {@link IOErrorEnum#INVALID_ARGUMENT} error.
     * <p>
     * On success, the number of bytes read into the buffer will be passed to the
     * callback. It is not an error if this is not the same as the requested size, as it
     * can happen e.g. near the end of a file, but generally we try to read
     * as many bytes as requested. Zero is returned on end of file
     * (or if {@code count} is zero),  but never otherwise.
     * <p>
     * Any outstanding i/o request with higher priority (lower numerical value) will
     * be executed before an outstanding request with lower priority. Default
     * priority is {@code G_PRIORITY_DEFAULT}.
     * <p>
     * The asynchronous methods have a default fallback that uses threads to implement
     * asynchronicity, so they are optional for inheriting classes. However, if you
     * override one you must override all.
     * @param buffer a buffer to read data into (which should be at least count bytes long).
     * @param count the number of bytes that will be read from the stream
     * @param ioPriority the [I/O priority][io-priority]
     * of the request.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @param callback callback to call when the request is satisfied
     */
    public void readAsync(@NotNull Out<byte[]> buffer, long count, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        MemorySegment bufferPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.g_input_stream_read_async.invokeExact(
                    handle(),
                    (Addressable) bufferPOINTER.address(),
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
        buffer.set(MemorySegment.ofAddress(bufferPOINTER.get(Interop.valueLayout.ADDRESS, 0), count * Interop.valueLayout.C_BYTE.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_BYTE));
    }
    
    /**
     * Like g_input_stream_read(), this tries to read {@code count} bytes from
     * the stream in a blocking fashion. However, rather than reading into
     * a user-supplied buffer, this will create a new {@link org.gtk.glib.Bytes} containing
     * the data that was read. This may be easier to use from language
     * bindings.
     * <p>
     * If count is zero, returns a zero-length {@link org.gtk.glib.Bytes} and does nothing. A
     * value of {@code count} larger than {@code G_MAXSSIZE} will cause a
     * {@link IOErrorEnum#INVALID_ARGUMENT} error.
     * <p>
     * On success, a new {@link org.gtk.glib.Bytes} is returned. It is not an error if the
     * size of this object is not the same as the requested size, as it
     * can happen e.g. near the end of a file. A zero-length {@link org.gtk.glib.Bytes} is
     * returned on end of file (or if {@code count} is zero), but never
     * otherwise.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned. If an
     * operation was partially finished when the operation was cancelled the
     * partial result will be returned, without an error.
     * <p>
     * On error {@code null} is returned and {@code error} is set accordingly.
     * @param count maximum number of bytes that will be read from the stream. Common
     * values include 4096 and 8192.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return a new {@link org.gtk.glib.Bytes}, or {@code null} on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.glib.Bytes readBytes(long count, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_input_stream_read_bytes.invokeExact(
                    handle(),
                    count,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.Bytes(RESULT, Ownership.FULL);
    }
    
    /**
     * Request an asynchronous read of {@code count} bytes from the stream into a
     * new {@link org.gtk.glib.Bytes}. When the operation is finished {@code callback} will be
     * called. You can then call g_input_stream_read_bytes_finish() to get the
     * result of the operation.
     * <p>
     * During an async request no other sync and async calls are allowed
     * on {@code stream}, and will result in {@link IOErrorEnum#PENDING} errors.
     * <p>
     * A value of {@code count} larger than {@code G_MAXSSIZE} will cause a
     * {@link IOErrorEnum#INVALID_ARGUMENT} error.
     * <p>
     * On success, the new {@link org.gtk.glib.Bytes} will be passed to the callback. It is
     * not an error if this is smaller than the requested size, as it can
     * happen e.g. near the end of a file, but generally we try to read as
     * many bytes as requested. Zero is returned on end of file (or if
     * {@code count} is zero), but never otherwise.
     * <p>
     * Any outstanding I/O request with higher priority (lower numerical
     * value) will be executed before an outstanding request with lower
     * priority. Default priority is {@code G_PRIORITY_DEFAULT}.
     * @param count the number of bytes that will be read from the stream
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @param callback callback to call when the request is satisfied
     */
    public void readBytesAsync(long count, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_input_stream_read_bytes_async.invokeExact(
                    handle(),
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
     * Finishes an asynchronous stream read-into-{@link org.gtk.glib.Bytes} operation.
     * @param result a {@link AsyncResult}.
     * @return the newly-allocated {@link org.gtk.glib.Bytes}, or {@code null} on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.glib.Bytes readBytesFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_input_stream_read_bytes_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.Bytes(RESULT, Ownership.FULL);
    }
    
    /**
     * Finishes an asynchronous stream read operation.
     * @param result a {@link AsyncResult}.
     * @return number of bytes read in, or -1 on error, or 0 on end of file.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public long readFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_input_stream_read_finish.invokeExact(
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
            RESULT = (int) DowncallHandles.g_input_stream_set_pending.invokeExact(
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
     * Tries to skip {@code count} bytes from the stream. Will block during the operation.
     * <p>
     * This is identical to g_input_stream_read(), from a behaviour standpoint,
     * but the bytes that are skipped are not returned to the user. Some
     * streams have an implementation that is more efficient than reading the data.
     * <p>
     * This function is optional for inherited classes, as the default implementation
     * emulates it using read.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned. If an
     * operation was partially finished when the operation was cancelled the
     * partial result will be returned, without an error.
     * @param count the number of bytes that will be skipped from the stream
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return Number of bytes skipped, or -1 on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public long skip(long count, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_input_stream_skip.invokeExact(
                    handle(),
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
     * Request an asynchronous skip of {@code count} bytes from the stream.
     * When the operation is finished {@code callback} will be called.
     * You can then call g_input_stream_skip_finish() to get the result
     * of the operation.
     * <p>
     * During an async request no other sync and async calls are allowed,
     * and will result in {@link IOErrorEnum#PENDING} errors.
     * <p>
     * A value of {@code count} larger than {@code G_MAXSSIZE} will cause a {@link IOErrorEnum#INVALID_ARGUMENT} error.
     * <p>
     * On success, the number of bytes skipped will be passed to the callback.
     * It is not an error if this is not the same as the requested size, as it
     * can happen e.g. near the end of a file, but generally we try to skip
     * as many bytes as requested. Zero is returned on end of file
     * (or if {@code count} is zero), but never otherwise.
     * <p>
     * Any outstanding i/o request with higher priority (lower numerical value)
     * will be executed before an outstanding request with lower priority.
     * Default priority is {@code G_PRIORITY_DEFAULT}.
     * <p>
     * The asynchronous methods have a default fallback that uses threads to
     * implement asynchronicity, so they are optional for inheriting classes.
     * However, if you override one, you must override all.
     * @param count the number of bytes that will be skipped from the stream
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @param callback callback to call when the request is satisfied
     */
    public void skipAsync(long count, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_input_stream_skip_async.invokeExact(
                    handle(),
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
     * Finishes a stream skip operation.
     * @param result a {@link AsyncResult}.
     * @return the size of the bytes skipped, or {@code -1} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public long skipFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_input_stream_skip_finish.invokeExact(
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
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_input_stream_get_type.invokeExact();
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
         * A {@link InputStream.Build} object constructs a {@link InputStream} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link InputStream} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link InputStream} using {@link InputStream#castFrom}.
         * @return A new instance of {@code InputStream} with the properties 
         *         that were set in the Build object.
         */
        public InputStream construct() {
            return InputStream.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    InputStream.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_input_stream_clear_pending = Interop.downcallHandle(
            "g_input_stream_clear_pending",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_input_stream_close = Interop.downcallHandle(
            "g_input_stream_close",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_input_stream_close_async = Interop.downcallHandle(
            "g_input_stream_close_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_input_stream_close_finish = Interop.downcallHandle(
            "g_input_stream_close_finish",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_input_stream_has_pending = Interop.downcallHandle(
            "g_input_stream_has_pending",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_input_stream_is_closed = Interop.downcallHandle(
            "g_input_stream_is_closed",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_input_stream_read = Interop.downcallHandle(
            "g_input_stream_read",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_input_stream_read_all = Interop.downcallHandle(
            "g_input_stream_read_all",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_input_stream_read_all_async = Interop.downcallHandle(
            "g_input_stream_read_all_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_input_stream_read_all_finish = Interop.downcallHandle(
            "g_input_stream_read_all_finish",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_input_stream_read_async = Interop.downcallHandle(
            "g_input_stream_read_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_input_stream_read_bytes = Interop.downcallHandle(
            "g_input_stream_read_bytes",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_input_stream_read_bytes_async = Interop.downcallHandle(
            "g_input_stream_read_bytes_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_input_stream_read_bytes_finish = Interop.downcallHandle(
            "g_input_stream_read_bytes_finish",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_input_stream_read_finish = Interop.downcallHandle(
            "g_input_stream_read_finish",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_input_stream_set_pending = Interop.downcallHandle(
            "g_input_stream_set_pending",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_input_stream_skip = Interop.downcallHandle(
            "g_input_stream_skip",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_input_stream_skip_async = Interop.downcallHandle(
            "g_input_stream_skip_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_input_stream_skip_finish = Interop.downcallHandle(
            "g_input_stream_skip_finish",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_input_stream_get_type = Interop.downcallHandle(
            "g_input_stream_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
