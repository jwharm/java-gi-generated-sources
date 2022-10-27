package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Structure used for scatter/gather data output when sending multiple
 * messages or packets in one go. You generally pass in an array of
 * {@code GOutputVectors} and the operation will use all the buffers as if they
 * were one buffer.
 * <p>
 * If {@code address} is {@code null} then the message is sent to the default receiver
 * (as previously set by g_socket_connect()).
 * @version 2.44
 */
public class OutputMessage extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.SocketAddress.getMemoryLayout().withName("address"),
        org.gtk.gio.OutputVector.getMemoryLayout().withName("vectors"),
        ValueLayout.JAVA_INT.withName("num_vectors"),
        ValueLayout.JAVA_INT.withName("bytes_sent"),
        Interop.valueLayout.ADDRESS.withName("control_messages"),
        ValueLayout.JAVA_INT.withName("num_control_messages")
    ).withName("GOutputMessage");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public OutputMessage(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
