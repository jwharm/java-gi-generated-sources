package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The interface for pollable output streams.
 * <p>
 * The default implementation of {@code can_poll} always returns {@code true}.
 * <p>
 * The default implementation of {@code write_nonblocking} calls
 * g_pollable_output_stream_is_writable(), and then calls
 * g_output_stream_write() if it returns {@code true}. This means you only
 * need to override it if it is possible that your {@code is_writable}
 * implementation may return {@code true} when the stream is not actually
 * writable.
 * <p>
 * The default implementation of {@code writev_nonblocking} calls
 * g_pollable_output_stream_write_nonblocking() for each vector, and converts
 * its return value and error (if set) to a {@link PollableReturn}. You should
 * override this where possible to avoid having to allocate a {@link org.gtk.glib.Error} to return
 * {@link IOErrorEnum#WOULD_BLOCK}.
 */
public class PollableOutputStreamInterface extends io.github.jwharm.javagi.ResourceBase {

    public PollableOutputStreamInterface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public PollableOutputStreamInterface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GPollableOutputStreamInterface.allocate(Interop.getAllocator()).address()));
    }
    
}
