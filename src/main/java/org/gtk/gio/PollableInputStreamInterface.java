package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The interface for pollable input streams.
 * <p>
 * The default implementation of {@code can_poll} always returns {@code true}.
 * <p>
 * The default implementation of {@code read_nonblocking} calls
 * g_pollable_input_stream_is_readable(), and then calls
 * g_input_stream_read() if it returns {@code true}. This means you only need
 * to override it if it is possible that your {@code is_readable}
 * implementation may return {@code true} when the stream is not actually
 * readable.
 * @version 2.28
 */
public class PollableInputStreamInterface extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("can_poll"),
        Interop.valueLayout.ADDRESS.withName("is_readable"),
        Interop.valueLayout.ADDRESS.withName("create_source"),
        Interop.valueLayout.ADDRESS.withName("read_nonblocking")
    ).withName("GPollableInputStreamInterface");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public PollableInputStreamInterface(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
