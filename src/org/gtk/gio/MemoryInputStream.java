package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
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

    public MemoryInputStream(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to MemoryInputStream */
    public static MemoryInputStream castFrom(org.gtk.gobject.Object gobject) {
        return new MemoryInputStream(gobject.getReference());
    }
    
    /**
     * Creates a new empty #GMemoryInputStream.
     */
    public MemoryInputStream() {
        super(References.get(gtk_h.g_memory_input_stream_new(), true));
    }
    
    /**
     * Creates a new #GMemoryInputStream with data from the given @bytes.
     */
    public MemoryInputStream(org.gtk.glib.Bytes bytes) {
        super(References.get(gtk_h.g_memory_input_stream_new_from_bytes(bytes.handle()), true));
    }
    
    /**
     * Appends @bytes to data that can be read from the input stream.
     */
    public void addBytes(org.gtk.glib.Bytes bytes) {
        gtk_h.g_memory_input_stream_add_bytes(handle(), bytes.handle());
    }
    
}
