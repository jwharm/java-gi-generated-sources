package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class AggregatorStartTimeSelection extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstAggregatorStartTimeSelection";
    
    /**
     * Start at running time 0.
     */
    public static final AggregatorStartTimeSelection ZERO = new AggregatorStartTimeSelection(0);
    
    /**
     * Start at the running time of
     * the first buffer that is received.
     */
    public static final AggregatorStartTimeSelection FIRST = new AggregatorStartTimeSelection(1);
    
    /**
     * Start at the running time
     * selected by the {@code start-time} property.
     */
    public static final AggregatorStartTimeSelection SET = new AggregatorStartTimeSelection(2);
    
    public AggregatorStartTimeSelection(int value) {
        super(value);
    }
}
