package org.gtk.gdkpixbuf;

/**
 * Interpolation modes for scaling functions.
 * <p>
 * The {@code GDK_INTERP_NEAREST} mode is the fastest scaling method, but has
 * horrible quality when scaling down; {@code GDK_INTERP_BILINEAR} is the best
 * choice if you aren't sure what to choose, it has a good speed/quality
 * balance.
 * <p>
 * <strong>*Note*</strong>: Cubic filtering is missing from the list; hyperbolic
 * interpolation is just as fast and results in higher quality.
 */
public enum InterpType {

    /**
     * Nearest neighbor sampling; this is the fastest
     *  and lowest quality mode. Quality is normally unacceptable when scaling
     *  down, but may be OK when scaling up.
     */
    NEAREST,
    
    /**
     * This is an accurate simulation of the PostScript
     *  image operator without any interpolation enabled.  Each pixel is
     *  rendered as a tiny parallelogram of solid color, the edges of which
     *  are implemented with antialiasing.  It resembles nearest neighbor for
     *  enlargement, and bilinear for reduction.
     */
    TILES,
    
    /**
     * Best quality/speed balance; use this mode by
     *  default. Bilinear interpolation.  For enlargement, it is
     *  equivalent to point-sampling the ideal bilinear-interpolated image.
     *  For reduction, it is equivalent to laying down small tiles and
     *  integrating over the coverage area.
     */
    BILINEAR,
    
    /**
     * This is the slowest and highest quality
     *  reconstruction function. It is derived from the hyperbolic filters in
     *  Wolberg's "Digital Image Warping", and is formally defined as the
     *  hyperbolic-filter sampling the ideal hyperbolic-filter interpolated
     *  image (the filter is designed to be idempotent for 1:1 pixel mapping).
     *  <strong>*Deprecated*</strong>: this interpolation filter is deprecated, as in reality
     *  it has a lower quality than the {@code GDK_INTERP_BILINEAR} filter
     *  (Since: 2.38)
     */
    HYPER;
    
    public static InterpType fromValue(int value) {
        return switch(value) {
            case 0 -> NEAREST;
            case 1 -> TILES;
            case 2 -> BILINEAR;
            case 3 -> HYPER;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NEAREST -> 0;
            case TILES -> 1;
            case BILINEAR -> 2;
            case HYPER -> 3;
        };
    }

}
