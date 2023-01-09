package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Pad state flags
 */
public class PadFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstPadFlags";
    
    /**
     * is dataflow on a pad blocked
     */
    public static final PadFlags BLOCKED = new PadFlags(16);
    
    /**
     * is pad flushing
     */
    public static final PadFlags FLUSHING = new PadFlags(32);
    
    /**
     * is pad in EOS state
     */
    public static final PadFlags EOS = new PadFlags(64);
    
    /**
     * is pad currently blocking on a buffer or event
     */
    public static final PadFlags BLOCKING = new PadFlags(128);
    
    /**
     * ensure that there is a parent object before calling
     *                       into the pad callbacks.
     */
    public static final PadFlags NEED_PARENT = new PadFlags(256);
    
    /**
     * the pad should be reconfigured/renegotiated.
     *                            The flag has to be unset manually after
     *                            reconfiguration happened.
     */
    public static final PadFlags NEED_RECONFIGURE = new PadFlags(512);
    
    /**
     * the pad has pending events
     */
    public static final PadFlags PENDING_EVENTS = new PadFlags(1024);
    
    /**
     * the pad is using fixed caps. This means that
     *     once the caps are set on the pad, the default caps query function
     *     will only return those caps.
     */
    public static final PadFlags FIXED_CAPS = new PadFlags(2048);
    
    /**
     * the default event and query handler will forward
     *                      all events and queries to the internally linked pads
     *                      instead of discarding them.
     */
    public static final PadFlags PROXY_CAPS = new PadFlags(4096);
    
    /**
     * the default query handler will forward
     *                      allocation queries to the internally linked pads
     *                      instead of discarding them.
     */
    public static final PadFlags PROXY_ALLOCATION = new PadFlags(8192);
    
    /**
     * the default query handler will forward
     *                      scheduling queries to the internally linked pads
     *                      instead of discarding them.
     */
    public static final PadFlags PROXY_SCHEDULING = new PadFlags(16384);
    
    /**
     * the default accept-caps handler will check
     *                      it the caps intersect the query-caps result instead
     *                      of checking for a subset. This is interesting for
     *                      parsers that can accept incompletely specified caps.
     */
    public static final PadFlags ACCEPT_INTERSECT = new PadFlags(32768);
    
    /**
     * the default accept-caps handler will use
     *                      the template pad caps instead of query caps to
     *                      compare with the accept caps. Use this in combination
     *                      with {@link PadFlags#ACCEPT_INTERSECT}. (Since: 1.6)
     */
    public static final PadFlags ACCEPT_TEMPLATE = new PadFlags(65536);
    
    /**
     * offset to define more flags
     */
    public static final PadFlags LAST = new PadFlags(1048576);
    
    /**
     * Create a new PadFlags with the provided value
     */
    public PadFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public PadFlags or(PadFlags... masks) {
        int value = this.getValue();
        for (PadFlags arg : masks) {
            value |= arg.getValue();
        }
        return new PadFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static PadFlags combined(PadFlags mask, PadFlags... masks) {
        int value = mask.getValue();
        for (PadFlags arg : masks) {
            value |= arg.getValue();
        }
        return new PadFlags(value);
    }
}
