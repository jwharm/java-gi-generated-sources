package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class HintMetrics extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public static final HintMetrics DEFAULT = new HintMetrics(0);
    
    public static final HintMetrics OFF = new HintMetrics(1);
    
    public static final HintMetrics ON = new HintMetrics(2);
    
    public HintMetrics(int value) {
        super(value);
    }
}
