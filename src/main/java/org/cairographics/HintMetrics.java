package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class HintMetrics extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "cairo_hint_metrics_t";
    
    public static final HintMetrics DEFAULT = new HintMetrics(0);
    
    public static final HintMetrics OFF = new HintMetrics(1);
    
    public static final HintMetrics ON = new HintMetrics(2);
    
    public HintMetrics(int value) {
        super(value);
    }
}
