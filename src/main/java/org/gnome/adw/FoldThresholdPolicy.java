package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Determines when {@link Flap} will fold.
 * @version 1.0
 */
public class FoldThresholdPolicy extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Folding is based on the minimum size
     */
    public static final FoldThresholdPolicy MINIMUM = new FoldThresholdPolicy(0);
    
    /**
     * Folding is based on the natural size
     */
    public static final FoldThresholdPolicy NATURAL = new FoldThresholdPolicy(1);
    
    public FoldThresholdPolicy(int value) {
        super(value);
    }
}
