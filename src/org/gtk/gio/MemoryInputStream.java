package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GMemoryInputStream is a class for using arbitrary
 * memory chunks as input for GIO streaming input operations.
 * 
 * As of GLib 2.34, #GMemoryInputStream implements
 * #GPollableInputStream.
 */
public class MemoryInputStream extends InputStream implements PollableInputStream, Seekable {

    public MemoryInputStream(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to MemoryInputStream */
    public static MemoryInputStream castFrom(org.gtk.gobject.Object gobject) {
        return new MemoryInputStream(gobject.getProxy());
    }
    
    /**
     * Creates a new empty #GMemoryInputStream.
     */
    public MemoryInputStream() {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_memory_input_stream_new(), true));
    }
    
    /**
     * Creates a new #GMemoryInputStream with data from the given @bytes.
     */
    public MemoryInputStream(org.gtk.glib.Bytes bytes) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_memory_input_stream_new_from_bytes(bytes.HANDLE()), true));
    }
    
    /**
     * Appends @bytes to data that can be read from the input stream.
     */
    public void addBytes(org.gtk.glib.Bytes bytes) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_memory_input_stream_add_bytes(HANDLE(), bytes.HANDLE());
    }
    
}
