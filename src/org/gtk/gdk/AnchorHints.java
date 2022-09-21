package org.gtk.gdk;

/**
 * Positioning hints for aligning a surface relative to a rectangle.
 * <p>
 * These hints determine how the surface should be positioned in the case that
 * the surface would fall off-screen if placed in its ideal position.
 * <p>
 * For example, {@link AnchorHints#FLIP_X} will replace {@link Gravity#NORTH_WEST} with
 * {@link Gravity#NORTH_EAST} and vice versa if the surface extends beyond the left
 * or right edges of the monitor.
 * <p>
 * If {@link AnchorHints#SLIDE_X} is set, the surface can be shifted horizontally to fit
 * on-screen. If {@link AnchorHints#RESIZE_X} is set, the surface can be shrunken
 * horizontally to fit.
 * <p>
 * In general, when multiple flags are set, flipping should take precedence over
 * sliding, which should take precedence over resizing.
 */
public class AnchorHints {

    /**
     * allow flipping anchors horizontally
     */
    public static final int FLIP_X = 1;
    
    /**
     * allow flipping anchors vertically
     */
    public static final int FLIP_Y = 2;
    
    /**
     * allow sliding surface horizontally
     */
    public static final int SLIDE_X = 4;
    
    /**
     * allow sliding surface vertically
     */
    public static final int SLIDE_Y = 8;
    
    /**
     * allow resizing surface horizontally
     */
    public static final int RESIZE_X = 16;
    
    /**
     * allow resizing surface vertically
     */
    public static final int RESIZE_Y = 32;
    
    /**
     * allow flipping anchors on both axes
     */
    public static final int FLIP = 3;
    
    /**
     * allow sliding surface on both axes
     */
    public static final int SLIDE = 12;
    
    /**
     * allow resizing surface on both axes
     */
    public static final int RESIZE = 48;
    
}
