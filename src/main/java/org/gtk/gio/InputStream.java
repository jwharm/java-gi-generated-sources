package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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

    public InputStream(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to InputStream */
    public static InputStream castFrom(org.gtk.gobject.Object gobject) {
        return new InputStream(gobject.refcounted());
    }
    
    static final MethodHandle g_input_stream_clear_pending = Interop.downcallHandle(
        "g_input_stream_clear_pending",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Clears the pending flag on {@code stream}.
     */
    public void clearPending() {
        try {
            g_input_stream_clear_pending.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_input_stream_close = Interop.downcallHandle(
        "g_input_stream_close",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public boolean close(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_input_stream_close.invokeExact(handle(), cancellable.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_input_stream_close_async = Interop.downcallHandle(
        "g_input_stream_close_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public void closeAsync(int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_input_stream_close_async.invokeExact(handle(), ioPriority, cancellable.handle(), 
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
    
    static final MethodHandle g_input_stream_close_finish = Interop.downcallHandle(
        "g_input_stream_close_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes closing a stream asynchronously, started from g_input_stream_close_async().
     */
    public boolean closeFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_input_stream_close_finish.invokeExact(handle(), result.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_input_stream_has_pending = Interop.downcallHandle(
        "g_input_stream_has_pending",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if an input stream has pending actions.
     */
    public boolean hasPending() {
        try {
            var RESULT = (int) g_input_stream_has_pending.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_input_stream_is_closed = Interop.downcallHandle(
        "g_input_stream_is_closed",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if an input stream is closed.
     */
    public boolean isClosed() {
        try {
            var RESULT = (int) g_input_stream_is_closed.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_input_stream_read = Interop.downcallHandle(
        "g_input_stream_read",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
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
     */
    public long read(byte[] buffer, long count, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (long) g_input_stream_read.invokeExact(handle(), Interop.allocateNativeArray(buffer).handle(), count, cancellable.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_input_stream_read_all = Interop.downcallHandle(
        "g_input_stream_read_all",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public boolean readAll(byte[] buffer, long count, PointerLong bytesRead, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_input_stream_read_all.invokeExact(handle(), Interop.allocateNativeArray(buffer).handle(), count, bytesRead.handle(), cancellable.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_input_stream_read_all_async = Interop.downcallHandle(
        "g_input_stream_read_all_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public void readAllAsync(byte[] buffer, long count, int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_input_stream_read_all_async.invokeExact(handle(), Interop.allocateNativeArray(buffer).handle(), count, ioPriority, cancellable.handle(), 
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
    
    static final MethodHandle g_input_stream_read_all_finish = Interop.downcallHandle(
        "g_input_stream_read_all_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public boolean readAllFinish(AsyncResult result, PointerLong bytesRead) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_input_stream_read_all_finish.invokeExact(handle(), result.handle(), bytesRead.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_input_stream_read_async = Interop.downcallHandle(
        "g_input_stream_read_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public void readAsync(byte[] buffer, long count, int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_input_stream_read_async.invokeExact(handle(), Interop.allocateNativeArray(buffer).handle(), count, ioPriority, cancellable.handle(), 
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
    
    static final MethodHandle g_input_stream_read_bytes = Interop.downcallHandle(
        "g_input_stream_read_bytes",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
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
     */
    public org.gtk.glib.Bytes readBytes(long count, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_input_stream_read_bytes.invokeExact(handle(), count, cancellable.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new org.gtk.glib.Bytes(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_input_stream_read_bytes_async = Interop.downcallHandle(
        "g_input_stream_read_bytes_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public void readBytesAsync(long count, int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_input_stream_read_bytes_async.invokeExact(handle(), count, ioPriority, cancellable.handle(), 
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
    
    static final MethodHandle g_input_stream_read_bytes_finish = Interop.downcallHandle(
        "g_input_stream_read_bytes_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an asynchronous stream read-into-{@link org.gtk.glib.Bytes} operation.
     */
    public org.gtk.glib.Bytes readBytesFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_input_stream_read_bytes_finish.invokeExact(handle(), result.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new org.gtk.glib.Bytes(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_input_stream_read_finish = Interop.downcallHandle(
        "g_input_stream_read_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an asynchronous stream read operation.
     */
    public long readFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (long) g_input_stream_read_finish.invokeExact(handle(), result.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_input_stream_set_pending = Interop.downcallHandle(
        "g_input_stream_set_pending",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code stream} to have actions pending. If the pending flag is
     * already set or {@code stream} is closed, it will return {@code false} and set
     * {@code error}.
     */
    public boolean setPending() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_input_stream_set_pending.invokeExact(handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_input_stream_skip = Interop.downcallHandle(
        "g_input_stream_skip",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
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
     */
    public long skip(long count, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (long) g_input_stream_skip.invokeExact(handle(), count, cancellable.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_input_stream_skip_async = Interop.downcallHandle(
        "g_input_stream_skip_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public void skipAsync(long count, int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_input_stream_skip_async.invokeExact(handle(), count, ioPriority, cancellable.handle(), 
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
    
    static final MethodHandle g_input_stream_skip_finish = Interop.downcallHandle(
        "g_input_stream_skip_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes a stream skip operation.
     */
    public long skipFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (long) g_input_stream_skip_finish.invokeExact(handle(), result.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}