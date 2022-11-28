package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The result values for a GstBusSyncHandler.
 */
public class BusSyncReply extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstBusSyncReply";
    
    /**
     * drop the message
     */
    public static final BusSyncReply DROP = new BusSyncReply(0);
    
    /**
     * pass the message to the async queue
     */
    public static final BusSyncReply PASS = new BusSyncReply(1);
    
    /**
     * pass message to async queue, continue if message is handled
     */
    public static final BusSyncReply ASYNC = new BusSyncReply(2);
    
    public BusSyncReply(int value) {
        super(value);
    }
}
