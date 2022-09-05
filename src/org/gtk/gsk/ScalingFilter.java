package org.gtk.gsk;

/**
 * The filters used when scaling texture data.
 * 
 * The actual implementation of each filter is deferred to the
 * rendering pipeline.
 */
public enum ScalingFilter {

    /**
     * linear interpolation filter
     */
    LINEAR,
    
    /**
     * nearest neighbor interpolation filter
     */
    NEAREST,
    
    /**
     * linear interpolation along each axis,
     *   plus mipmap generation, with linear interpolation along the mipmap
     *   levels
     */
    TRILINEAR;
    
    public static ScalingFilter fromValue(int value) {
        return switch(value) {
            case 0 -> LINEAR;
            case 1 -> NEAREST;
            case 2 -> TRILINEAR;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case LINEAR -> 0;
            case NEAREST -> 1;
            case TRILINEAR -> 2;
        };
    }

}
