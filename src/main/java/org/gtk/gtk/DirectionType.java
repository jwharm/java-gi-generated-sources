package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Focus movement types.
 */
public class DirectionType extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkDirectionType";
    
    /**
     * Move forward.
     */
    public static final DirectionType TAB_FORWARD = new DirectionType(0);
    
    /**
     * Move backward.
     */
    public static final DirectionType TAB_BACKWARD = new DirectionType(1);
    
    /**
     * Move up.
     */
    public static final DirectionType UP = new DirectionType(2);
    
    /**
     * Move down.
     */
    public static final DirectionType DOWN = new DirectionType(3);
    
    /**
     * Move left.
     */
    public static final DirectionType LEFT = new DirectionType(4);
    
    /**
     * Move right.
     */
    public static final DirectionType RIGHT = new DirectionType(5);
    
    public DirectionType(int value) {
        super(value);
    }
}
