package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A set of buffer flags used to describe properties of a {@link Buffer}.
 */
public class BufferFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstBufferFlags";
    
    /**
     * the buffer is live data and should be discarded in
     *                                 the PAUSED state.
     */
    public static final BufferFlags LIVE = new BufferFlags(16);
    
    /**
     * the buffer contains data that should be dropped
     *                                 because it will be clipped against the segment
     *                                 boundaries or because it does not contain data
     *                                 that should be shown to the user.
     */
    public static final BufferFlags DECODE_ONLY = new BufferFlags(32);
    
    /**
     * the buffer marks a data discontinuity in the stream.
     *                                 This typically occurs after a seek or a dropped buffer
     *                                 from a live or network source.
     */
    public static final BufferFlags DISCONT = new BufferFlags(64);
    
    /**
     * the buffer timestamps might have a discontinuity
     *                                 and this buffer is a good point to resynchronize.
     */
    public static final BufferFlags RESYNC = new BufferFlags(128);
    
    /**
     * the buffer data is corrupted.
     */
    public static final BufferFlags CORRUPTED = new BufferFlags(256);
    
    /**
     * the buffer contains a media specific marker. for
     *                                 video this is the end of a frame boundary, for audio
     *                                 this is the start of a talkspurt.
     */
    public static final BufferFlags MARKER = new BufferFlags(512);
    
    /**
     * the buffer contains header information that is
     *                                 needed to decode the following data.
     */
    public static final BufferFlags HEADER = new BufferFlags(1024);
    
    /**
     * the buffer has been created to fill a gap in the
     *                                 stream and contains media neutral data (elements can
     *                                 switch to optimized code path that ignores the buffer
     *                                 content).
     */
    public static final BufferFlags GAP = new BufferFlags(2048);
    
    /**
     * the buffer can be dropped without breaking the
     *                                 stream, for example to reduce bandwidth.
     */
    public static final BufferFlags DROPPABLE = new BufferFlags(4096);
    
    /**
     * this unit cannot be decoded independently.
     */
    public static final BufferFlags DELTA_UNIT = new BufferFlags(8192);
    
    /**
     * this flag is set when memory of the buffer
     *                                 is added/removed
     */
    public static final BufferFlags TAG_MEMORY = new BufferFlags(16384);
    
    /**
     * Elements which write to disk or permanent storage should ensure the data
     * is synced after writing the contents of this buffer.
     */
    public static final BufferFlags SYNC_AFTER = new BufferFlags(32768);
    
    /**
     * This buffer is important and should not be dropped.
     * <p>
     * This can be used to mark important buffers, e.g. to flag RTP packets
     * carrying keyframes or codec setup data for RTP Forward Error Correction
     * purposes, or to prevent still video frames from being dropped by elements
     * due to QoS.
     */
    public static final BufferFlags NON_DROPPABLE = new BufferFlags(65536);
    
    /**
     * additional media specific flags can be added starting from
     *                                 this flag.
     */
    public static final BufferFlags LAST = new BufferFlags(1048576);
    
    public BufferFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public BufferFlags or(BufferFlags mask) {
        return new BufferFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static BufferFlags combined(BufferFlags mask, BufferFlags... masks) {
        int value = mask.getValue();        for (BufferFlags arg : masks) {
            value |= arg.getValue();
        }
        return new BufferFlags(value);
    }
}
