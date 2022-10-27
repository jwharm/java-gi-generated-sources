package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class Filter extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public static final Filter FAST = new Filter(0);
    
    public static final Filter GOOD = new Filter(1);
    
    public static final Filter BEST = new Filter(2);
    
    public static final Filter NEAREST = new Filter(3);
    
    public static final Filter BILINEAR = new Filter(4);
    
    public static final Filter GAUSSIAN = new Filter(5);
    
    public Filter(int value) {
        super(value);
    }
}
