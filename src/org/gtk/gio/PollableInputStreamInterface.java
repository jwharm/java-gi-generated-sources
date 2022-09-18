package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The interface for pollable input streams.
 * 
 * The default implementation of @can_poll always returns <code>true</code> 
 * 
 * The default implementation of @read_nonblocking calls
 * g_pollable_input_stream_is_readable(), and then calls
 * g_input_stream_read() if it returns <code>true</code>  This means you only need
 * to override it if it is possible that your @is_readable
 * implementation may return <code>true</code> when the stream is not actually
 * readable.
 */
public class PollableInputStreamInterface extends io.github.jwharm.javagi.ResourceBase {

    public PollableInputStreamInterface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
}
