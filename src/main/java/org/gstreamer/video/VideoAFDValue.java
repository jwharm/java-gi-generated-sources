package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Enumeration of the various values for Active Format Description (AFD)
 * <p>
 * AFD should be included in video user data whenever the rectangular
 * picture area containing useful information does not extend to the full height or width of the coded
 * frame. AFD data may also be included in user data when the rectangular picture area containing
 * useful information extends to the full height and width of the coded frame.
 * <p>
 * For details, see Table 6.14 Active Format in:
 * <p>
 * ATSC Digital Television Standard:
 * Part 4 – MPEG-2 Video System Characteristics
 * <p>
 * https://www.atsc.org/wp-content/uploads/2015/03/a_53-Part-4-2009.pdf
 * <p>
 * and Active Format Description in Complete list of AFD codes
 * <p>
 * https://en.wikipedia.org/wiki/Active_Format_Description{@code Complete_list_of_AFD_codes}
 * <p>
 * and SMPTE ST2016-1
 * <p>
 * Notes:
 * <p>
 * 1) AFD 0 is undefined for ATSC and SMPTE ST2016-1, indicating that AFD data is not available:
 * If Bar Data is not present, AFD '0000' indicates that exact information
 * is not available and the active image should be assumed to be the same as the coded frame. AFD '0000'.
 * AFD '0000' accompanied by Bar Data signals that the active image’s aspect ratio is narrower than 16:9,
 * but is not 4:3 or 14:9. As the exact aspect ratio cannot be conveyed by AFD alone, wherever possible,
 * AFD ‘0000’ should be accompanied by Bar Data to define the exact vertical or horizontal extent
 * of the active image.
 * 2) AFD 0 is reserved for DVB/ETSI
 * 3) values 1, 5, 6, 7, and 12 are reserved for both ATSC and DVB/ETSI
 * 4) values 2 and 3 are not recommended for ATSC, but are valid for DVB/ETSI
 * @version 1.18
 */
public enum VideoAFDValue implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Unavailable (see note 0 below).
     */
    UNAVAILABLE(0),
    
    /**
     * For 4:3 coded frame, letterbox 16:9 image,
     *      at top of the coded frame. For 16:9 coded frame, full frame 16:9 image,
     *      the same as the coded frame.
     */
    _16_9_TOP_ALIGNED(2),
    
    /**
     * For 4:3 coded frame, letterbox 14:9 image,
     *      at top of the coded frame. For 16:9 coded frame, pillarbox 14:9 image,
     *      horizontally centered in the coded frame.
     */
    _14_9_TOP_ALIGNED(3),
    
    /**
     * For 4:3 coded frame, letterbox image with an aspect ratio
     *      greater than 16:9, vertically centered in the coded frame. For 16:9 coded frame,
     *      letterbox image with an aspect ratio greater than 16:9.
     */
    GREATER_THAN_16_9(4),
    
    /**
     * For 4:3 coded frame, full frame 4:3 image,
     *      the same as the coded frame. For 16:9 coded frame, full frame 16:9 image, the same as
     *      the coded frame.
     */
    _4_3_FULL_16_9_FULL(8),
    
    /**
     * For 4:3 coded frame, full frame 4:3 image, the same as
     *      the coded frame. For 16:9 coded frame, pillarbox 4:3 image, horizontally centered in the
     *      coded frame.
     */
    _4_3_FULL_4_3_PILLAR(9),
    
    /**
     * For 4:3 coded frame, letterbox 16:9 image, vertically centered in
     *      the coded frame with all image areas protected. For 16:9 coded frame, full frame 16:9 image,
     *      with all image areas protected.
     */
    _16_9_LETTER_16_9_FULL(10),
    
    /**
     * For 4:3 coded frame, letterbox 14:9 image, vertically centered in
     *      the coded frame. For 16:9 coded frame, pillarbox 14:9 image, horizontally centered in the
     *      coded frame.
     */
    _14_9_LETTER_14_9_PILLAR(11),
    
    /**
     * For 4:3 coded frame, full frame 4:3 image, with alternative 14:9
     *      center. For 16:9 coded frame, pillarbox 4:3 image, with alternative 14:9 center.
     */
    _4_3_FULL_14_9_CENTER(13),
    
    /**
     * For 4:3 coded frame, letterbox 16:9 image, with alternative 14:9
     *      center. For 16:9 coded frame, full frame 16:9 image, with alternative 14:9 center.
     */
    _16_9_LETTER_14_9_CENTER(14),
    
    /**
     * For 4:3 coded frame, letterbox 16:9 image, with alternative 4:3
     *      center. For 16:9 coded frame, full frame 16:9 image, with alternative 4:3 center.
     */
    _16_9_LETTER_4_3_CENTER(15);
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoAFDValue";
    
    private final int value;
    
    /**
     * Create a new VideoAFDValue for the provided value
     * @param numeric value the enum value
     */
    VideoAFDValue(int value) {
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
     * Create a new VideoAFDValue for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static VideoAFDValue of(int value) {
        return switch (value) {
            case 0 -> UNAVAILABLE;
            case 2 -> _16_9_TOP_ALIGNED;
            case 3 -> _14_9_TOP_ALIGNED;
            case 4 -> GREATER_THAN_16_9;
            case 8 -> _4_3_FULL_16_9_FULL;
            case 9 -> _4_3_FULL_4_3_PILLAR;
            case 10 -> _16_9_LETTER_16_9_FULL;
            case 11 -> _14_9_LETTER_14_9_PILLAR;
            case 13 -> _4_3_FULL_14_9_CENTER;
            case 14 -> _16_9_LETTER_14_9_CENTER;
            case 15 -> _16_9_LETTER_4_3_CENTER;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
