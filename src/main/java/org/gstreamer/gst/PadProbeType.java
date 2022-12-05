package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The different probing types that can occur. When either one of
 * {@code GST_PAD_PROBE_TYPE_IDLE} or {@code GST_PAD_PROBE_TYPE_BLOCK} is used, the probe will be a
 * blocking probe.
 */
public class PadProbeType extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstPadProbeType";
    
    /**
     * invalid probe type
     */
    public static final PadProbeType INVALID = new PadProbeType(0);
    
    /**
     * probe idle pads and block while the callback is called
     */
    public static final PadProbeType IDLE = new PadProbeType(1);
    
    /**
     * probe and block pads
     */
    public static final PadProbeType BLOCK = new PadProbeType(2);
    
    /**
     * probe buffers
     */
    public static final PadProbeType BUFFER = new PadProbeType(16);
    
    /**
     * probe buffer lists
     */
    public static final PadProbeType BUFFER_LIST = new PadProbeType(32);
    
    /**
     * probe downstream events
     */
    public static final PadProbeType EVENT_DOWNSTREAM = new PadProbeType(64);
    
    /**
     * probe upstream events
     */
    public static final PadProbeType EVENT_UPSTREAM = new PadProbeType(128);
    
    /**
     * probe flush events. This probe has to be
     *     explicitly enabled and is not included in the
     *     {@code GST_PAD_PROBE_TYPE_EVENT_DOWNSTREAM} or
     *     {@code GST_PAD_PROBE_TYPE_EVENT_UPSTREAM} probe types.
     */
    public static final PadProbeType EVENT_FLUSH = new PadProbeType(256);
    
    /**
     * probe downstream queries
     */
    public static final PadProbeType QUERY_DOWNSTREAM = new PadProbeType(512);
    
    /**
     * probe upstream queries
     */
    public static final PadProbeType QUERY_UPSTREAM = new PadProbeType(1024);
    
    /**
     * probe push
     */
    public static final PadProbeType PUSH = new PadProbeType(4096);
    
    /**
     * probe pull
     */
    public static final PadProbeType PULL = new PadProbeType(8192);
    
    /**
     * probe and block at the next opportunity, at data flow or when idle
     */
    public static final PadProbeType BLOCKING = new PadProbeType(3);
    
    /**
     * probe downstream data (buffers, buffer lists, and events)
     */
    public static final PadProbeType DATA_DOWNSTREAM = new PadProbeType(112);
    
    /**
     * probe upstream data (events)
     */
    public static final PadProbeType DATA_UPSTREAM = new PadProbeType(128);
    
    /**
     * probe upstream and downstream data (buffers, buffer lists, and events)
     */
    public static final PadProbeType DATA_BOTH = new PadProbeType(240);
    
    /**
     * probe and block downstream data (buffers, buffer lists, and events)
     */
    public static final PadProbeType BLOCK_DOWNSTREAM = new PadProbeType(114);
    
    /**
     * probe and block upstream data (events)
     */
    public static final PadProbeType BLOCK_UPSTREAM = new PadProbeType(130);
    
    /**
     * probe upstream and downstream events
     */
    public static final PadProbeType EVENT_BOTH = new PadProbeType(192);
    
    /**
     * probe upstream and downstream queries
     */
    public static final PadProbeType QUERY_BOTH = new PadProbeType(1536);
    
    /**
     * probe upstream events and queries and downstream buffers, buffer lists, events and queries
     */
    public static final PadProbeType ALL_BOTH = new PadProbeType(1776);
    
    /**
     * probe push and pull
     */
    public static final PadProbeType SCHEDULING = new PadProbeType(12288);
    
    public PadProbeType(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public PadProbeType or(PadProbeType mask) {
        return new PadProbeType(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static PadProbeType combined(PadProbeType mask, PadProbeType... masks) {
        int value = mask.getValue();        for (PadProbeType arg : masks) {
            value |= arg.getValue();
        }
        return new PadProbeType(value);
    }
}
