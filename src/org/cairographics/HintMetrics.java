package org.cairographics;

public class HintMetrics extends io.github.jwharm.javagi.Enumeration {

    public static final HintMetrics DEFAULT = new HintMetrics(0);
    
    public static final HintMetrics OFF = new HintMetrics(1);
    
    public static final HintMetrics ON = new HintMetrics(2);
    
    public HintMetrics(int value) {
        super(value);
    }
    
}
