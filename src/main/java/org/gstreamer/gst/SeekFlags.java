package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags to be used with gst_element_seek() or gst_event_new_seek(). All flags
 * can be used together.
 * <p>
 * A non flushing seek might take some time to perform as the currently
 * playing data in the pipeline will not be cleared.
 * <p>
 * An accurate seek might be slower for formats that don't have any indexes
 * or timestamp markers in the stream. Specifying this flag might require a
 * complete scan of the file in those cases.
 * <p>
 * When performing a segment seek: after the playback of the segment completes,
 * no EOS will be emitted by the element that performed the seek, but a
 * {@link MessageType#SEGMENT_DONE} message will be posted on the bus by the element.
 * When this message is posted, it is possible to send a new seek event to
 * continue playback. With this seek method it is possible to perform seamless
 * looping or simple linear editing.
 * <p>
 * When only changing the playback rate and not the direction, the
 * {@link SeekFlags#INSTANT_RATE_CHANGE} flag can be used for a non-flushing seek
 * to signal that the rate change should be applied immediately. This requires
 * special support in the seek handlers (e.g. demuxers) and any elements
 * synchronizing to the clock, and in general can't work in all cases (for example
 * UDP streaming where the delivery rate is controlled by a remote server). The
 * instant-rate-change mode supports changing the trickmode-related GST_SEEK_ flags,
 * but can't be used in conjunction with other seek flags that affect the new
 * playback position - as the playback position will not be changing.
 * <p>
 * When doing fast forward (rate &gt; 1.0) or fast reverse (rate &lt; -1.0) trickmode
 * playback, the {@link SeekFlags#TRICKMODE} flag can be used to instruct decoders
 * and demuxers to adjust the playback rate by skipping frames. This can improve
 * performance and decrease CPU usage because not all frames need to be decoded.
 * <p>
 * Beyond that, the {@link SeekFlags#TRICKMODE_KEY_UNITS} flag can be used to
 * request that decoders skip all frames except key units, and
 * {@link SeekFlags#TRICKMODE_NO_AUDIO} flags can be used to request that audio
 * decoders do no decoding at all, and simple output silence.
 * <p>
 * The {@link SeekFlags#SNAP_BEFORE} flag can be used to snap to the previous
 * relevant location, and the {@link SeekFlags#SNAP_AFTER} flag can be used to
 * select the next relevant location. If {@link SeekFlags#KEY_UNIT} is specified,
 * the relevant location is a keyframe. If both flags are specified, the nearest
 * of these locations will be selected. If none are specified, the implementation is
 * free to select whichever it wants.
 * <p>
 * The before and after here are in running time, so when playing backwards,
 * the next location refers to the one that will played in next, and not the
 * one that is located after in the actual source stream.
 * <p>
 * Also see part-seeking.txt in the GStreamer design documentation for more
 * details on the meaning of these flags and the behaviour expected of
 * elements that handle them.
 */
public class SeekFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstSeekFlags";
    
    /**
     * no flag
     */
    public static final SeekFlags NONE = new SeekFlags(0);
    
    /**
     * flush pipeline
     */
    public static final SeekFlags FLUSH = new SeekFlags(1);
    
    /**
     * accurate position is requested, this might
     *                     be considerably slower for some formats.
     */
    public static final SeekFlags ACCURATE = new SeekFlags(2);
    
    /**
     * seek to the nearest keyframe. This might be
     *                     faster but less accurate.
     */
    public static final SeekFlags KEY_UNIT = new SeekFlags(4);
    
    /**
     * perform a segment seek.
     */
    public static final SeekFlags SEGMENT = new SeekFlags(8);
    
    /**
     * when doing fast forward or fast reverse playback, allow
     *                     elements to skip frames instead of generating all
     *                     frames. (Since: 1.6)
     */
    public static final SeekFlags TRICKMODE = new SeekFlags(16);
    
    /**
     * Deprecated backward compatibility flag, replaced
     *                     by {@link SeekFlags#TRICKMODE}
     */
    public static final SeekFlags SKIP = new SeekFlags(16);
    
    /**
     * go to a location before the requested position,
     *                     if {@link SeekFlags#KEY_UNIT} this means the keyframe at or before
     *                     the requested position the one at or before the seek target.
     */
    public static final SeekFlags SNAP_BEFORE = new SeekFlags(32);
    
    /**
     * go to a location after the requested position,
     *                     if {@link SeekFlags#KEY_UNIT} this means the keyframe at of after the
     *                     requested position.
     */
    public static final SeekFlags SNAP_AFTER = new SeekFlags(64);
    
    /**
     * go to a position near the requested position,
     *                     if {@link SeekFlags#KEY_UNIT} this means the keyframe closest
     *                     to the requested position, if both keyframes are at an equal
     *                     distance, behaves like {@link SeekFlags#SNAP_BEFORE}.
     */
    public static final SeekFlags SNAP_NEAREST = new SeekFlags(96);
    
    /**
     * when doing fast forward or fast reverse
     *                     playback, request that elements only decode keyframes
     *                     and skip all other content, for formats that have
     *                     keyframes. (Since: 1.6)
     */
    public static final SeekFlags TRICKMODE_KEY_UNITS = new SeekFlags(128);
    
    /**
     * when doing fast forward or fast reverse
     *                     playback, request that audio decoder elements skip
     *                     decoding and output only gap events or silence. (Since: 1.6)
     */
    public static final SeekFlags TRICKMODE_NO_AUDIO = new SeekFlags(256);
    
    /**
     * When doing fast forward or fast reverse
     *                     playback, request that elements only decode keyframes and
     *                     forward predicted frames and skip all other content (for example
     *                     B-Frames), for formats that have keyframes and forward predicted
     *                     frames. (Since: 1.18)
     */
    public static final SeekFlags TRICKMODE_FORWARD_PREDICTED = new SeekFlags(512);
    
    /**
     * Signals that a rate change should be
     *                     applied immediately. Only valid if start/stop position
     *                     are GST_CLOCK_TIME_NONE, the playback direction does not change
     *                     and the seek is not flushing. (Since: 1.18)
     */
    public static final SeekFlags INSTANT_RATE_CHANGE = new SeekFlags(1024);
    
    public SeekFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public SeekFlags or(SeekFlags mask) {
        return new SeekFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static SeekFlags combined(SeekFlags mask, SeekFlags... masks) {
        int value = mask.getValue();        for (SeekFlags arg : masks) {
            value |= arg.getValue();
        }
        return new SeekFlags(value);
    }
}
