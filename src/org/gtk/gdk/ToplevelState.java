package org.gtk.gdk;

/**
 * Specifies the state of a toplevel surface.
 * 
 * On platforms that support information about individual edges, the
 * {@link org.gtk.gdk.ToplevelState#TILED} state will be set whenever any of the individual
 * tiled states is set. On platforms that lack that support, the tiled state
 * will give an indication of tiledness without any of the per-edge states
 * being set.
 */
public class ToplevelState {

    /**
     * the surface is minimized
     */
    public static final int MINIMIZED = 1;
    
    /**
     * the surface is maximized
     */
    public static final int MAXIMIZED = 2;
    
    /**
     * the surface is sticky
     */
    public static final int STICKY = 4;
    
    /**
     * the surface is maximized without decorations
     */
    public static final int FULLSCREEN = 8;
    
    /**
     * the surface is kept above other surfaces
     */
    public static final int ABOVE = 16;
    
    /**
     * the surface is kept below other surfaces
     */
    public static final int BELOW = 32;
    
    /**
     * the surface is presented as focused (with active decorations)
     */
    public static final int FOCUSED = 64;
    
    /**
     * the surface is in a tiled state
     */
    public static final int TILED = 128;
    
    /**
     * whether the top edge is tiled
     */
    public static final int TOP_TILED = 256;
    
    /**
     * whether the top edge is resizable
     */
    public static final int TOP_RESIZABLE = 512;
    
    /**
     * whether the right edge is tiled
     */
    public static final int RIGHT_TILED = 1024;
    
    /**
     * whether the right edge is resizable
     */
    public static final int RIGHT_RESIZABLE = 2048;
    
    /**
     * whether the bottom edge is tiled
     */
    public static final int BOTTOM_TILED = 4096;
    
    /**
     * whether the bottom edge is resizable
     */
    public static final int BOTTOM_RESIZABLE = 8192;
    
    /**
     * whether the left edge is tiled
     */
    public static final int LEFT_TILED = 16384;
    
    /**
     * whether the left edge is resizable
     */
    public static final int LEFT_RESIZABLE = 32768;
    
}
