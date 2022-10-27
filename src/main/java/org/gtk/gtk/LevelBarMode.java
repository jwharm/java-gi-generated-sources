package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes how {@link LevelBar} contents should be rendered.
 * <p>
 * Note that this enumeration could be extended with additional modes
 * in the future.
 */
public class LevelBarMode extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * the bar has a continuous mode
     */
    public static final LevelBarMode CONTINUOUS = new LevelBarMode(0);
    
    /**
     * the bar has a discrete mode
     */
    public static final LevelBarMode DISCRETE = new LevelBarMode(1);
    
    public LevelBarMode(int value) {
        super(value);
    }
}
