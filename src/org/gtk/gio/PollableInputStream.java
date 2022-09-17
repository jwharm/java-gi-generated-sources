package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GPollableInputStream is implemented by #GInputStreams that
 * can be polled for readiness to read. This can be used when
 * interfacing with a non-GIO API that expects
 * UNIX-file-descriptor-style asynchronous I/O rather than GIO-style.
 */
public interface PollableInputStream extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Checks if @stream is actually pollable. Some classes may implement
     * #GPollableInputStream but have only certain instances of that class
     * be pollable. If this method returns <code>FALSE,</code> then the behavior of
     * other #GPollableInputStream methods is undefined.
     * 
     * For any given stream, the value returned by this method is constant;
     * a stream cannot switch from pollable to non-pollable or vice versa.
     */
    public default boolean canPoll() {
        var RESULT = gtk_h.g_pollable_input_stream_can_poll(handle());
        return (RESULT != 0);
    }
    
    /**
     * Creates a #GSource that triggers when @stream can be read, or
     * @cancellable is triggered or an error occurs. The callback on the
     * source is of the #GPollableSourceFunc type.
     * 
     * As with g_pollable_input_stream_is_readable(), it is possible that
     * the stream may not actually be readable even after the source
     * triggers, so you should use g_pollable_input_stream_read_nonblocking()
     * rather than g_input_stream_read() from the callback.
     */
    public default org.gtk.glib.Source createSource(Cancellable cancellable) {
        var RESULT = gtk_h.g_pollable_input_stream_create_source(handle(), cancellable.handle());
        return new org.gtk.glib.Source(References.get(RESULT, true));
    }
    
    /**
     * Checks if @stream can be read.
     * 
     * Note that some stream types may not be able to implement this 100<code>
     * reliably,</code> and it is possible that a call to g_input_stream_read()
     * after this returns <code>true</code> would still block. To guarantee
     * non-blocking behavior, you should always use
     * g_pollable_input_stream_read_nonblocking(), which will return a
     * {@link org.gtk.gio.IOErrorEnum#WOULD_BLOCK} error rather than blocking.
     */
    public default boolean isReadable() {
        var RESULT = gtk_h.g_pollable_input_stream_is_readable(handle());
        return (RESULT != 0);
    }
    
    /**
     * Attempts to read up to @count bytes from @stream into @buffer, as
     * with g_input_stream_read(). If @stream is not currently readable,
     * this will immediately return <code>G_IO_ERROR_WOULD_BLOCK,</code> and you can
     * use g_pollable_input_stream_create_source() to create a #GSource
     * that will be triggered when @stream is readable.
     * 
     * Note that since this method never blocks, you cannot actually
     * use @cancellable to cancel it. However, it will return an error
     * if @cancellable has already been cancelled when you call, which
     * may happen if you call this method after a source triggers due
     * to having been cancelled.
     */
    public default long readNonblocking(byte[] buffer, long count, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_pollable_input_stream_read_nonblocking(handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, buffer)).handle(), count, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    class PollableInputStreamImpl extends org.gtk.gobject.Object implements PollableInputStream {
        public PollableInputStreamImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
