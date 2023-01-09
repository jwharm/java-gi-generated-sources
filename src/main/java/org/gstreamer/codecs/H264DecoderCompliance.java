package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum H264DecoderCompliance implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * The decoder behavior is
     *     automatically choosen.
     */
    AUTO(0),
    
    /**
     * The decoder behavior strictly
     *     conforms to the SPEC. All the decoder behaviors conform to the
     *     SPEC, not including any nonstandard behavior which is not
     *     mentioned in the SPEC.
     */
    STRICT(1),
    
    /**
     * The decoder behavior normally
     *     conforms to the SPEC. Most behaviors conform to the SPEC but
     *     including some nonstandard features which are widely used or
     *     often used in the industry practice. This meets the request of
     *     real streams and usages, but may not 100% conform to the
     *     SPEC. It has very low risk. E.g., we will output pictures
     *     without waiting DPB being full for the lower latency, which may
     *     cause B frame disorder when there are reference frames with
     *     smaller POC after it in decoder order. And the baseline profile
     *     may be mapped to the constrained-baseline profile, but it may
     *     have problems when a real baseline stream comes with FMO or
     *     ASO.
     */
    NORMAL(2),
    
    /**
     * The decoder behavior
     *     flexibly conforms to the SPEC. It uses the nonstandard features
     *     more aggressively in order to get better performance(for
     *     example, lower latency). It may change the result of the
     *     decoder and should be used carefully. Besides including all
     *     risks in <em>normal</em> mode, it has more risks, such as frames
     *     disorder when reference frames POC decrease in decoder order.
     */
    FLEXIBLE(3);
    
    private static final java.lang.String C_TYPE_NAME = "GstH264DecoderCompliance";
    
    private final int value;
    
    /**
     * Create a new H264DecoderCompliance for the provided value
     * @param numeric value the enum value
     */
    H264DecoderCompliance(int value) {
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
     * Create a new H264DecoderCompliance for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static H264DecoderCompliance of(int value) {
        return switch (value) {
            case 0 -> AUTO;
            case 1 -> STRICT;
            case 2 -> NORMAL;
            case 3 -> FLEXIBLE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
