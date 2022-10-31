package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Determines a surface edge or corner.
 */
public class SurfaceEdge extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GdkSurfaceEdge";
    
    /**
     * the top left corner.
     */
    public static final SurfaceEdge NORTH_WEST = new SurfaceEdge(0);
    
    /**
     * the top edge.
     */
    public static final SurfaceEdge NORTH = new SurfaceEdge(1);
    
    /**
     * the top right corner.
     */
    public static final SurfaceEdge NORTH_EAST = new SurfaceEdge(2);
    
    /**
     * the left edge.
     */
    public static final SurfaceEdge WEST = new SurfaceEdge(3);
    
    /**
     * the right edge.
     */
    public static final SurfaceEdge EAST = new SurfaceEdge(4);
    
    /**
     * the lower left corner.
     */
    public static final SurfaceEdge SOUTH_WEST = new SurfaceEdge(5);
    
    /**
     * the lower edge.
     */
    public static final SurfaceEdge SOUTH = new SurfaceEdge(6);
    
    /**
     * the lower right corner.
     */
    public static final SurfaceEdge SOUTH_EAST = new SurfaceEdge(7);
    
    public SurfaceEdge(int value) {
        super(value);
    }
}
