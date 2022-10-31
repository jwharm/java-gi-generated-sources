package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the state of a toplevel surface.
 * <p>
 * On platforms that support information about individual edges, the
 * {@link ToplevelState#TILED} state will be set whenever any of the individual
 * tiled states is set. On platforms that lack that support, the tiled state
 * will give an indication of tiledness without any of the per-edge states
 * being set.
 */
public class ToplevelState extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GdkToplevelState";
    
    /**
     * the surface is minimized
     */
    public static final ToplevelState MINIMIZED = new ToplevelState(1);
    
    /**
     * the surface is maximized
     */
    public static final ToplevelState MAXIMIZED = new ToplevelState(2);
    
    /**
     * the surface is sticky
     */
    public static final ToplevelState STICKY = new ToplevelState(4);
    
    /**
     * the surface is maximized without decorations
     */
    public static final ToplevelState FULLSCREEN = new ToplevelState(8);
    
    /**
     * the surface is kept above other surfaces
     */
    public static final ToplevelState ABOVE = new ToplevelState(16);
    
    /**
     * the surface is kept below other surfaces
     */
    public static final ToplevelState BELOW = new ToplevelState(32);
    
    /**
     * the surface is presented as focused (with active decorations)
     */
    public static final ToplevelState FOCUSED = new ToplevelState(64);
    
    /**
     * the surface is in a tiled state
     */
    public static final ToplevelState TILED = new ToplevelState(128);
    
    /**
     * whether the top edge is tiled
     */
    public static final ToplevelState TOP_TILED = new ToplevelState(256);
    
    /**
     * whether the top edge is resizable
     */
    public static final ToplevelState TOP_RESIZABLE = new ToplevelState(512);
    
    /**
     * whether the right edge is tiled
     */
    public static final ToplevelState RIGHT_TILED = new ToplevelState(1024);
    
    /**
     * whether the right edge is resizable
     */
    public static final ToplevelState RIGHT_RESIZABLE = new ToplevelState(2048);
    
    /**
     * whether the bottom edge is tiled
     */
    public static final ToplevelState BOTTOM_TILED = new ToplevelState(4096);
    
    /**
     * whether the bottom edge is resizable
     */
    public static final ToplevelState BOTTOM_RESIZABLE = new ToplevelState(8192);
    
    /**
     * whether the left edge is tiled
     */
    public static final ToplevelState LEFT_TILED = new ToplevelState(16384);
    
    /**
     * whether the left edge is resizable
     */
    public static final ToplevelState LEFT_RESIZABLE = new ToplevelState(32768);
    
    public ToplevelState(int value) {
        super(value);
    }
}
