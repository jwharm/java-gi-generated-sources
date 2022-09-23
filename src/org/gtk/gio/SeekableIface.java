package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Provides an interface for implementing seekable functionality on I/O Streams.
 */
public class SeekableIface extends io.github.jwharm.javagi.ResourceBase {

    public SeekableIface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public SeekableIface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GSeekableIface.allocate(Interop.getAllocator()).address()));
    }
    
}
