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
 */
public class OutputMessage extends io.github.jwharm.javagi.ResourceBase {

    public OutputMessage(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
}
