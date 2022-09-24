package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 */
public class IOStream extends org.gtk.gobject.Object {

    public IOStream(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to IOStream */
    public static IOStream castFrom(org.gtk.gobject.Object gobject) {
        return new IOStream(gobject.getReference());
    }
    
    /**
     * Clears the pending flag on {@code stream}.
     */
    public void clearPending() {
        gtk_h.g_io_stream_clear_pending(handle());
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
     */
    public boolean close(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_io_stream_close(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
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
     */
    public void closeAsync(int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_io_stream_close_async(handle(), ioPriority, cancellable.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Closes a stream.
     */
    public boolean closeFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_io_stream_close_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Gets the input stream for this object. This is used
     * for reading.
     */
    public InputStream getInputStream() {
        var RESULT = gtk_h.g_io_stream_get_input_stream(handle());
        return new InputStream(References.get(RESULT, false));
    }
    
    /**
     * Gets the output stream for this object. This is used for
     * writing.
     */
    public OutputStream getOutputStream() {
        var RESULT = gtk_h.g_io_stream_get_output_stream(handle());
        return new OutputStream(References.get(RESULT, false));
    }
    
    /**
     * Checks if a stream has pending actions.
     */
    public boolean hasPending() {
        var RESULT = gtk_h.g_io_stream_has_pending(handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if a stream is closed.
     */
    public boolean isClosed() {
        var RESULT = gtk_h.g_io_stream_is_closed(handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets {@code stream} to have actions pending. If the pending flag is
     * already set or {@code stream} is closed, it will return {@code false} and set
     * {@code error}.
     */
    public boolean setPending() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_io_stream_set_pending(handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Asynchronously splice the output stream of {@code stream1} to the input stream of
     * {@code stream2}, and splice the output stream of {@code stream2} to the input stream of
     * {@code stream1}.
     * <p>
     * When the operation is finished {@code callback} will be called.
     * You can then call g_io_stream_splice_finish() to get the
     * result of the operation.
     */
    public void spliceAsync(IOStream stream2, int flags, int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_io_stream_splice_async(handle(), stream2.handle(), flags, ioPriority, cancellable.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an asynchronous io stream splice operation.
     */
    public static boolean spliceFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_io_stream_splice_finish(result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
}
