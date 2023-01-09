package org.gstreamer.tag;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Type of image contained in an image tag (specified as "image-type" field in
 * the info structure in the image's {@link org.gstreamer.gst.Sample})
 */
public enum TagImageType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * No image type. Can be used to
     *      tell functions such as gst_tag_image_data_to_image_sample() that no
     *      image type should be set.
     */
    NONE(-1),
    
    /**
     * Undefined/other image type
     */
    UNDEFINED(0),
    
    /**
     * Cover (front)
     */
    FRONT_COVER(1),
    
    /**
     * Cover (back)
     */
    BACK_COVER(2),
    
    /**
     * Leaflet page
     */
    LEAFLET_PAGE(3),
    
    /**
     * Medium (e.g. label side of CD)
     */
    MEDIUM(4),
    
    /**
     * Lead artist/lead performer/soloist
     */
    LEAD_ARTIST(5),
    
    /**
     * Artist/performer
     */
    ARTIST(6),
    
    /**
     * Conductor
     */
    CONDUCTOR(7),
    
    /**
     * Band/orchestra
     */
    BAND_ORCHESTRA(8),
    
    /**
     * Composer
     */
    COMPOSER(9),
    
    /**
     * Lyricist/text writer
     */
    LYRICIST(10),
    
    /**
     * Recording location
     */
    RECORDING_LOCATION(11),
    
    /**
     * During recording
     */
    DURING_RECORDING(12),
    
    /**
     * During performance
     */
    DURING_PERFORMANCE(13),
    
    /**
     * Movie/video screen capture
     */
    VIDEO_CAPTURE(14),
    
    /**
     * A fish as funny as the ID3v2 spec
     */
    FISH(15),
    
    /**
     * Illustration
     */
    ILLUSTRATION(16),
    
    /**
     * Band/artist logotype
     */
    BAND_ARTIST_LOGO(17),
    
    /**
     * Publisher/studio logotype
     */
    PUBLISHER_STUDIO_LOGO(18);
    
    private static final java.lang.String C_TYPE_NAME = "GstTagImageType";
    
    private final int value;
    
    /**
     * Create a new TagImageType for the provided value
     * @param numeric value the enum value
     */
    TagImageType(int value) {
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
     * Create a new TagImageType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static TagImageType of(int value) {
        return switch (value) {
            case -1 -> NONE;
            case 0 -> UNDEFINED;
            case 1 -> FRONT_COVER;
            case 2 -> BACK_COVER;
            case 3 -> LEAFLET_PAGE;
            case 4 -> MEDIUM;
            case 5 -> LEAD_ARTIST;
            case 6 -> ARTIST;
            case 7 -> CONDUCTOR;
            case 8 -> BAND_ORCHESTRA;
            case 9 -> COMPOSER;
            case 10 -> LYRICIST;
            case 11 -> RECORDING_LOCATION;
            case 12 -> DURING_RECORDING;
            case 13 -> DURING_PERFORMANCE;
            case 14 -> VIDEO_CAPTURE;
            case 15 -> FISH;
            case 16 -> ILLUSTRATION;
            case 17 -> BAND_ARTIST_LOGO;
            case 18 -> PUBLISHER_STUDIO_LOGO;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
