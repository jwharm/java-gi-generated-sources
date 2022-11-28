package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The result of a {@link Promise}
 * @version 1.14
 */
public class PromiseResult extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstPromiseResult";
    
    /**
     * Initial state. Waiting for transition to any
     * 	other state.
     */
    public static final PromiseResult PENDING = new PromiseResult(0);
    
    /**
     * Interrupted by the consumer as it doesn't
     * 	want the value anymore.
     */
    public static final PromiseResult INTERRUPTED = new PromiseResult(1);
    
    /**
     * A producer marked a reply
     */
    public static final PromiseResult REPLIED = new PromiseResult(2);
    
    /**
     * The promise expired (the carrying object
     * 	lost all refs) and the promise will never be fulfilled.
     */
    public static final PromiseResult EXPIRED = new PromiseResult(3);
    
    public PromiseResult(int value) {
        super(value);
    }
}
