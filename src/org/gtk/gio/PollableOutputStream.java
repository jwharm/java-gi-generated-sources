package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GPollableOutputStream is implemented by #GOutputStreams that
 * can be polled for readiness to write. This can be used when
 * interfacing with a non-GIO API that expects
 * UNIX-file-descriptor-style asynchronous I/O rather than GIO-style.
 */
public interface PollableOutputStream extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Checks if @stream is actually pollable. Some classes may implement
     * #GPollableOutputStream but have only certain instances of that
     * class be pollable. If this method returns %FALSE, then the behavior
     * of other #GPollableOutputStream methods is undefined.
     * 
     * For any given stream, the value returned by this method is constant;
     * a stream cannot switch from pollable to non-pollable or vice versa.
     */
    public default boolean canPoll() {
        var RESULT = gtk_h.g_pollable_output_stream_can_poll(handle());
        return (RESULT != 0);
    }
    
    /**
     * Creates a #GSource that triggers when @stream can be written, or
     * @cancellable is triggered or an error occurs. The callback on the
     * source is of the #GPollableSourceFunc type.
     * 
     * As with g_pollable_output_stream_is_writable(), it is possible that
     * the stream may not actually be writable even after the source
     * triggers, so you should use g_pollable_output_stream_write_nonblocking()
     * rather than g_output_stream_write() from the callback.
     */
    public default org.gtk.glib.Source createSource(Cancellable cancellable) {
        var RESULT = gtk_h.g_pollable_output_stream_create_source(handle(), cancellable.handle());
        return new org.gtk.glib.Source(References.get(RESULT, true));
    }
    
    /**
     * Checks if @stream can be written.
     * 
     * Note that some stream types may not be able to implement this 100%
     * reliably, and it is possible that a call to g_output_stream_write()
     * after this returns %TRUE would still block. To guarantee
     * non-blocking behavior, you should always use
     * g_pollable_output_stream_write_nonblocking(), which will return a
     * %G_IO_ERROR_WOULD_BLOCK error rather than blocking.
     */
    public default boolean isWritable() {
        var RESULT = gtk_h.g_pollable_output_stream_is_writable(handle());
        return (RESULT != 0);
    }
    
    /**
     * Attempts to write up to @count bytes from @buffer to @stream, as
     * with g_output_stream_write(). If @stream is not currently writable,
     * this will immediately return %G_IO_ERROR_WOULD_BLOCK, and you can
     * use g_pollable_output_stream_create_source() to create a #GSource
     * that will be triggered when @stream is writable.
     * 
     * Note that since this method never blocks, you cannot actually
     * use @cancellable to cancel it. However, it will return an error
     * if @cancellable has already been cancelled when you call, which
     * may happen if you call this method after a source triggers due
     * to having been cancelled.
     * 
     * Also note that if %G_IO_ERROR_WOULD_BLOCK is returned some underlying
     * transports like D/TLS require that you re-send the same @buffer and
     * @count in the next write call.
     */
    public default long writeNonblocking(byte[] buffer, long count, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_pollable_output_stream_write_nonblocking(handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, buffer)).handle(), count, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    class PollableOutputStreamImpl extends org.gtk.gobject.Object implements PollableOutputStream {
        public PollableOutputStreamImpl(io.github.jwharm.javagi.interop.Reference reference) {
            super(reference);
        }
    }
}
