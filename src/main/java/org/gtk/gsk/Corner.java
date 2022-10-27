package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The corner indices used by {@code GskRoundedRect}.
 */
public class Corner extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * The top left corner
     */
    public static final Corner TOP_LEFT = new Corner(0);
    
    /**
     * The top right corner
     */
    public static final Corner TOP_RIGHT = new Corner(1);
    
    /**
     * The bottom right corner
     */
    public static final Corner BOTTOM_RIGHT = new Corner(2);
    
    /**
     * The bottom left corner
     */
    public static final Corner BOTTOM_LEFT = new Corner(3);
    
    public Corner(int value) {
        super(value);
    }
}
