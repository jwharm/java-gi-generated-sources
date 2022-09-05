package org.gtk.gdk;

/**
 * Positioning hints for aligning a surface relative to a rectangle.
 * 
 * These hints determine how the surface should be positioned in the case that
 * the surface would fall off-screen if placed in its ideal position.
 * 
 * For example, %GDK_ANCHOR_FLIP_X will replace %GDK_GRAVITY_NORTH_WEST with
 * %GDK_GRAVITY_NORTH_EAST and vice versa if the surface extends beyond the left
 * or right edges of the monitor.
 * 
 * If %GDK_ANCHOR_SLIDE_X is set, the surface can be shifted horizontally to fit
 * on-screen. If %GDK_ANCHOR_RESIZE_X is set, the surface can be shrunken
 * horizontally to fit.
 * 
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
