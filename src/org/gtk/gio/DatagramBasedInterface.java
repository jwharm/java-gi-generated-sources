package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Provides an interface for socket-like objects which have datagram semantics,
 * following the Berkeley sockets API. The interface methods are thin wrappers
 * around the corresponding virtual methods, and no pre-processing of inputs is
 * implemented — so implementations of this API must handle all functionality
 * documented in the interface methods.
 */
public class DatagramBasedInterface extends io.github.jwharm.javagi.interop.ResourceBase {

    public DatagramBasedInterface(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
}