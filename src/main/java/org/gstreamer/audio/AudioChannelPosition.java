package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Audio channel positions.
 * <p>
 * These are the channels defined in SMPTE 2036-2-2008
 * Table 1 for 22.2 audio systems with the Surround and Wide channels from
 * DTS Coherent Acoustics (v.1.3.1) and 10.2 and 7.1 layouts. In the caps the
 * actual channel layout is expressed with a channel count and a channel mask,
 * which describes the existing channels. The positions in the bit mask correspond
 * to the enum values.
 * For negotiation it is allowed to have more bits set in the channel mask than
 * the number of channels to specify the allowed channel positions but this is
 * not allowed in negotiated caps. It is not allowed in any situation other
 * than the one mentioned below to have less bits set in the channel mask than
 * the number of channels.
 * <p>
 * {@code GST_AUDIO_CHANNEL_POSITION_MONO} can only be used with a single mono channel that
 * has no direction information and would be mixed into all directional channels.
 * This is expressed in caps by having a single channel and no channel mask.
 * <p>
 * {@code GST_AUDIO_CHANNEL_POSITION_NONE} can only be used if all channels have this position.
 * This is expressed in caps by having a channel mask with no bits set.
 * <p>
 * As another special case it is allowed to have two channels without a channel mask.
 * This implicitly means that this is a stereo stream with a front left and front right
 * channel.
 */
public enum AudioChannelPosition implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * used for position-less channels, e.g.
     *     from a sound card that records 1024 channels; mutually exclusive with
     *     any other channel position
     */
    NONE(-3),
    
    /**
     * Mono without direction;
     *     can only be used with 1 channel
     */
    MONO(-2),
    
    /**
     * invalid position
     */
    INVALID(-1),
    
    /**
     * Front left
     */
    FRONT_LEFT(0),
    
    /**
     * Front right
     */
    FRONT_RIGHT(1),
    
    /**
     * Front center
     */
    FRONT_CENTER(2),
    
    /**
     * Low-frequency effects 1 (subwoofer)
     */
    LFE1(3),
    
    /**
     * Rear left
     */
    REAR_LEFT(4),
    
    /**
     * Rear right
     */
    REAR_RIGHT(5),
    
    /**
     * Front left of center
     */
    FRONT_LEFT_OF_CENTER(6),
    
    /**
     * Front right of center
     */
    FRONT_RIGHT_OF_CENTER(7),
    
    /**
     * Rear center
     */
    REAR_CENTER(8),
    
    /**
     * Low-frequency effects 2 (subwoofer)
     */
    LFE2(9),
    
    /**
     * Side left
     */
    SIDE_LEFT(10),
    
    /**
     * Side right
     */
    SIDE_RIGHT(11),
    
    /**
     * Top front left
     */
    TOP_FRONT_LEFT(12),
    
    /**
     * Top front right
     */
    TOP_FRONT_RIGHT(13),
    
    /**
     * Top front center
     */
    TOP_FRONT_CENTER(14),
    
    /**
     * Top center
     */
    TOP_CENTER(15),
    
    /**
     * Top rear left
     */
    TOP_REAR_LEFT(16),
    
    /**
     * Top rear right
     */
    TOP_REAR_RIGHT(17),
    
    /**
     * Top side right
     */
    TOP_SIDE_LEFT(18),
    
    /**
     * Top rear right
     */
    TOP_SIDE_RIGHT(19),
    
    /**
     * Top rear center
     */
    TOP_REAR_CENTER(20),
    
    /**
     * Bottom front center
     */
    BOTTOM_FRONT_CENTER(21),
    
    /**
     * Bottom front left
     */
    BOTTOM_FRONT_LEFT(22),
    
    /**
     * Bottom front right
     */
    BOTTOM_FRONT_RIGHT(23),
    
    /**
     * Wide left (between front left and side left)
     */
    WIDE_LEFT(24),
    
    /**
     * Wide right (between front right and side right)
     */
    WIDE_RIGHT(25),
    
    /**
     * Surround left (between rear left and side left)
     */
    SURROUND_LEFT(26),
    
    /**
     * Surround right (between rear right and side right)
     */
    SURROUND_RIGHT(27);
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioChannelPosition";
    
    private final int value;
    
    /**
     * Create a new AudioChannelPosition for the provided value
     * @param numeric value the enum value
     */
    AudioChannelPosition(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new AudioChannelPosition for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static AudioChannelPosition of(int value) {
        return switch (value) {
            case -3 -> NONE;
            case -2 -> MONO;
            case -1 -> INVALID;
            case 0 -> FRONT_LEFT;
            case 1 -> FRONT_RIGHT;
            case 2 -> FRONT_CENTER;
            case 3 -> LFE1;
            case 4 -> REAR_LEFT;
            case 5 -> REAR_RIGHT;
            case 6 -> FRONT_LEFT_OF_CENTER;
            case 7 -> FRONT_RIGHT_OF_CENTER;
            case 8 -> REAR_CENTER;
            case 9 -> LFE2;
            case 10 -> SIDE_LEFT;
            case 11 -> SIDE_RIGHT;
            case 12 -> TOP_FRONT_LEFT;
            case 13 -> TOP_FRONT_RIGHT;
            case 14 -> TOP_FRONT_CENTER;
            case 15 -> TOP_CENTER;
            case 16 -> TOP_REAR_LEFT;
            case 17 -> TOP_REAR_RIGHT;
            case 18 -> TOP_SIDE_LEFT;
            case 19 -> TOP_SIDE_RIGHT;
            case 20 -> TOP_REAR_CENTER;
            case 21 -> BOTTOM_FRONT_CENTER;
            case 22 -> BOTTOM_FRONT_LEFT;
            case 23 -> BOTTOM_FRONT_RIGHT;
            case 24 -> WIDE_LEFT;
            case 25 -> WIDE_RIGHT;
            case 26 -> SURROUND_LEFT;
            case 27 -> SURROUND_RIGHT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
