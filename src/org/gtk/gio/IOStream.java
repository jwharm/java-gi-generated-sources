package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * GIOStream represents an object that has both read and write streams.
 * Generally the two streams act as separate input and output streams,
 * but they share some common resources and state. For instance, for
 * seekable streams, both streams may use the same position.
 * 
 * Examples of #GIOStream objects are #GSocketConnection, which represents
 * a two-way network connection; and #GFileIOStream, which represents a
 * file handle opened in read-write mode.
 * 
 * To do the actual reading and writing you need to get the substreams
 * with g_io_stream_get_input_stream() and g_io_stream_get_output_stream().
 * 
 * The #GIOStream object owns the input and the output streams, not the other
 * way around, so keeping the substreams alive will not keep the #GIOStream
 * object alive. If the #GIOStream object is freed it will be closed, thus
 * closing the substreams, so even if the substreams stay alive they will
 * always return %G_IO_ERROR_CLOSED for all operations.
 * 
 * To close a stream use g_io_stream_close() which will close the common
 * stream object and also the individual substreams. You can also close
 * the substreams themselves. In most cases this only marks the
 * substream as closed, so further I/O on it fails but common state in the
 * #GIOStream may still be open. However, some streams may support
 * "half-closed" states where one direction of the stream is actually shut down.
 * 
 * Operations on #GIOStreams cannot be started while another operation on the
 * #GIOStream or its substreams is in progress. Specifically, an application can
 * read from the #GInputStream and write to the #GOutputStream simultaneously
 * (either in separate threads, or as asynchronous operations in the same
 * thread), but an application cannot start any #GIOStream operation while there
 * is a #GIOStream, #GInputStream or #GOutputStream operation in progress, and
 * an application can’t start any #GInputStream or #GOutputStream operation
 * while there is a #GIOStream operation in progress.
 * 
 * This is a product of individual stream operations being associated with a
 * given #GMainContext (the thread-default context at the time the operation was
 * started), rather than entire streams being associated with a single
 * #GMainContext.
 * 
 * GIO may run operations on #GIOStreams from other (worker) threads, and this
 * may be exposed to application code in the behaviour of wrapper streams, such
 * as #GBufferedInputStream or #GTlsConnection. With such wrapper APIs,
 * application code may only run operations on the base (wrapped) stream when
 * the wrapper stream is idle. Note that the semantics of such operations may
 * not be well-defined due to the state the wrapper stream leaves the base
 * stream in (though they are guaranteed not to crash).
 */
public class IOStream extends org.gtk.gobject.Object {

    public IOStream(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to IOStream */
    public static IOStream castFrom(org.gtk.gobject.Object gobject) {
        return new IOStream(gobject.getProxy());
    }
    
    /**
     * Clears the pending flag on @stream.
     */
    public void clearPending() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_io_stream_clear_pending(HANDLE());
    }
    
    /**
     * Closes the stream, releasing resources related to it. This will also
     * close the individual input and output streams, if they are not already
     * closed.
     * 
     * Once the stream is closed, all other operations will return
     * %G_IO_ERROR_CLOSED. Closing a stream multiple times will not
     * return an error.
     * 
     * Closing a stream will automatically flush any outstanding buffers
     * in the stream.
     * 
     * Streams will be automatically closed when the last reference
     * is dropped, but you might want to call this function to make sure
     * resources are released as early as possible.
     * 
     * Some streams might keep the backing store of the stream (e.g. a file
     * descriptor) open after the stream is closed. See the documentation for
     * the individual stream for details.
     * 
     * On failure the first error that happened will be reported, but the
     * close operation will finish as much as possible. A stream that failed
     * to close will still return %G_IO_ERROR_CLOSED for all operations.
     * Still, it is important to check and report the error to the user,
     * otherwise there might be a loss of data as all data might not be written.
     * 
     * If @cancellable is not NULL, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * Cancelling a close will still leave the stream closed, but some streams
     * can use a faster close that doesn't block to e.g. check errors.
     * 
     * The default implementation of this method just calls close on the
     * individual input/output streams.
     */
    public boolean close(Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_io_stream_close(HANDLE(), cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Closes a stream.
     */
    public boolean closeFinish(AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_io_stream_close_finish(HANDLE(), result.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Gets the input stream for this object. This is used
     * for reading.
     */
    public InputStream getInputStream() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_io_stream_get_input_stream(HANDLE());
        return new InputStream(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Gets the output stream for this object. This is used for
     * writing.
     */
    public OutputStream getOutputStream() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_io_stream_get_output_stream(HANDLE());
        return new OutputStream(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Checks if a stream has pending actions.
     */
    public boolean hasPending() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_io_stream_has_pending(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Checks if a stream is closed.
     */
    public boolean isClosed() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_io_stream_is_closed(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Sets @stream to have actions pending. If the pending flag is
     * already set or @stream is closed, it will return %FALSE and set
     * @error.
     */
    public boolean setPending() throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_io_stream_set_pending(HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
}
