package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of a pad action.
 */
public class PadActionType extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkPadActionType";
    
    /**
     * Action is triggered by a pad button
     */
    public static final PadActionType BUTTON = new PadActionType(0);
    
    /**
     * Action is triggered by a pad ring
     */
    public static final PadActionType RING = new PadActionType(1);
    
    /**
     * Action is triggered by a pad strip
     */
    public static final PadActionType STRIP = new PadActionType(2);
    
    public PadActionType(int value) {
        super(value);
    }
}
