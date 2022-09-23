package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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

    public OutputMessage(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public OutputMessage() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GOutputMessage.allocate(Interop.getAllocator()).address()));
    }
    
}
