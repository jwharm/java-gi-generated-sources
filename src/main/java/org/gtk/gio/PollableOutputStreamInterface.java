package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * @version 2.28
 */
public class PollableOutputStreamInterface extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("can_poll"),
        Interop.valueLayout.ADDRESS.withName("is_writable"),
        Interop.valueLayout.ADDRESS.withName("create_source"),
        Interop.valueLayout.ADDRESS.withName("write_nonblocking"),
        Interop.valueLayout.ADDRESS.withName("writev_nonblocking")
    ).withName("GPollableOutputStreamInterface");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public PollableOutputStreamInterface(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
