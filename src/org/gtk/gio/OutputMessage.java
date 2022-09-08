package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Structure used for scatter/gather data output when sending multiple
 * messages or packets in one go. You generally pass in an array of
 * #GOutputVectors and the operation will use all the buffers as if they
 * were one buffer.
 * 
 * If @address is %NULL then the message is sent to the default receiver
 * (as previously set by g_socket_connect()).
 */
public class OutputMessage extends io.github.jwharm.javagi.interop.ResourceBase {

    public OutputMessage(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
}
