package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Buffered output stream implements {@link FilterOutputStream} and provides
 * for buffered writes.
 * <p>
 * By default, {@link BufferedOutputStream}'s buffer size is set at 4 kilobytes.
 * <p>
 * To create a buffered output stream, use g_buffered_output_stream_new(),
 * or g_buffered_output_stream_new_sized() to specify the buffer's size
 * at construction.
 * <p>
 * To get the size of a buffer within a buffered input stream, use
 * g_buffered_output_stream_get_buffer_size(). To change the size of a
 * buffered output stream's buffer, use
 * g_buffered_output_stream_set_buffer_size(). Note that the buffer's
 * size cannot be reduced below the size of the data within the buffer.
 */
public class BufferedOutputStream extends FilterOutputStream implements Seekable {

    public BufferedOutputStream(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to BufferedOutputStream */
    public static BufferedOutputStream castFrom(org.gtk.gobject.Object gobject) {
        return new BufferedOutputStream(gobject.getReference());
    }
    
    private static Reference constructNew(OutputStream baseStream) {
        Reference RESULT = References.get(gtk_h.g_buffered_output_stream_new(baseStream.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new buffered output stream for a base stream.
     */
    public BufferedOutputStream(OutputStream baseStream) {
        super(constructNew(baseStream));
    }
    
    private static Reference constructNewSized(OutputStream baseStream, long size) {
        Reference RESULT = References.get(gtk_h.g_buffered_output_stream_new_sized(baseStream.handle(), size), true);
        return RESULT;
    }
    
    /**
     * Creates a new buffered output stream with a given buffer size.
     */
    public static BufferedOutputStream newSized(OutputStream baseStream, long size) {
        return new BufferedOutputStream(constructNewSized(baseStream, size));
    }
    
    /**
     * Checks if the buffer automatically grows as data is added.
     */
    public boolean getAutoGrow() {
        var RESULT = gtk_h.g_buffered_output_stream_get_auto_grow(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the size of the buffer in the {@code stream}.
     */
    public long getBufferSize() {
        var RESULT = gtk_h.g_buffered_output_stream_get_buffer_size(handle());
        return RESULT;
    }
    
    /**
     * Sets whether or not the {@code stream}'s buffer should automatically grow.
     * If {@code auto_grow} is true, then each write will just make the buffer
     * larger, and you must manually flush the buffer to actually write out
     * the data to the underlying stream.
     */
    public void setAutoGrow(boolean autoGrow) {
        gtk_h.g_buffered_output_stream_set_auto_grow(handle(), autoGrow ? 1 : 0);
    }
    
    /**
     * Sets the size of the internal buffer to {@code size}.
     */
    public void setBufferSize(long size) {
        gtk_h.g_buffered_output_stream_set_buffer_size(handle(), size);
    }
    
}
