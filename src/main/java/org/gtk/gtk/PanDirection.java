package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes the panning direction of a {@link GesturePan}.
 */
public class PanDirection extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
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
