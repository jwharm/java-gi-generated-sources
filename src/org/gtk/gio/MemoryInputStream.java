package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * {@link MemoryInputStream} is a class for using arbitrary
 * memory chunks as input for GIO streaming input operations.
 * <p>
 * As of GLib 2.34, {@link MemoryInputStream} implements
 * {@link PollableInputStream}.
 */
public class MemoryInputStream extends InputStream implements PollableInputStream, Seekable {

    public MemoryInputStream(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to MemoryInputStream */
    public static MemoryInputStream castFrom(org.gtk.gobject.Object gobject) {
        return new MemoryInputStream(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.g_memory_input_stream_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new empty {@link MemoryInputStream}.
     */
    public MemoryInputStream() {
        super(constructNew());
    }
    
    private static Reference constructNewFromBytes(org.gtk.glib.Bytes bytes) {
        Reference RESULT = References.get(gtk_h.g_memory_input_stream_new_from_bytes(bytes.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link MemoryInputStream} with data from the given {@code bytes}.
     */
    public static MemoryInputStream newFromBytes(org.gtk.glib.Bytes bytes) {
        return new MemoryInputStream(constructNewFromBytes(bytes));
    }
    
    /**
     * Appends {@code bytes} to data that can be read from the input stream.
     */
    public void addBytes(org.gtk.glib.Bytes bytes) {
        gtk_h.g_memory_input_stream_add_bytes(handle(), bytes.handle());
    }
    
}
