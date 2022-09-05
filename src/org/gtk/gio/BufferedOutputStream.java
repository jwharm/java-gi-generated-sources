package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Buffered output stream implements #GFilterOutputStream and provides
 * for buffered writes.
 * 
 * By default, #GBufferedOutputStream's buffer size is set at 4 kilobytes.
 * 
 * To create a buffered output stream, use g_buffered_output_stream_new(),
 * or g_buffered_output_stream_new_sized() to specify the buffer's size
 * at construction.
 * 
 * To get the size of a buffer within a buffered input stream, use
 * g_buffered_output_stream_get_buffer_size(). To change the size of a
 * buffered output stream's buffer, use
 * g_buffered_output_stream_set_buffer_size(). Note that the buffer's
 * size cannot be reduced below the size of the data within the buffer.
 */
public class BufferedOutputStream extends FilterOutputStream implements Seekable {

    public BufferedOutputStream(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to BufferedOutputStream */
    public static BufferedOutputStream castFrom(org.gtk.gobject.Object gobject) {
        return new BufferedOutputStream(gobject.getProxy());
    }
    
    /**
     * Creates a new buffered output stream for a base stream.
     */
    public BufferedOutputStream(OutputStream baseStream) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_buffered_output_stream_new(baseStream.HANDLE()), true));
    }
    
    /**
     * Creates a new buffered output stream with a given buffer size.
     */
    public BufferedOutputStream(OutputStream baseStream, long size) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_buffered_output_stream_new_sized(baseStream.HANDLE(), size), true));
    }
    
    /**
     * Checks if the buffer automatically grows as data is added.
     */
    public boolean getAutoGrow() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_buffered_output_stream_get_auto_grow(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the size of the buffer in the @stream.
     */
    public long getBufferSize() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_buffered_output_stream_get_buffer_size(HANDLE());
        return RESULT;
    }
    
    /**
     * Sets whether or not the @stream's buffer should automatically grow.
     * If @auto_grow is true, then each write will just make the buffer
     * larger, and you must manually flush the buffer to actually write out
     * the data to the underlying stream.
     */
    public void setAutoGrow(boolean autoGrow) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_buffered_output_stream_set_auto_grow(HANDLE(), autoGrow ? 1 : 0);
    }
    
    /**
     * Sets the size of the internal buffer to @size.
     */
    public void setBufferSize(long size) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_buffered_output_stream_set_buffer_size(HANDLE(), size);
    }
    
}
