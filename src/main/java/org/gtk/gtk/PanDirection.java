package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes the panning direction of a {@link GesturePan}.
 */
public class PanDirection extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkPanDirection";
    
    /**
     * panned towards the left
     */
    public static final PanDirection LEFT = new PanDirection(0);
    
    /**
     * panned towards the right
     */
    public static final PanDirection RIGHT = new PanDirection(1);
    
    /**
     * panned upwards
     */
    public static final PanDirection UP = new PanDirection(2);
    
    /**
     * panned downwards
     */
    public static final PanDirection DOWN = new PanDirection(3);
    
    public PanDirection(int value) {
        super(value);
    }
}
