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
    
    private static final java.lang.String C_TYPE_NAME = "AdwFoldThresholdPolicy";
    
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
