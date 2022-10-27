package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class RegionOverlap extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public static final RegionOverlap IN = new RegionOverlap(0);
    
    public static final RegionOverlap OUT = new RegionOverlap(1);
    
    public static final RegionOverlap PART = new RegionOverlap(2);
    
    public RegionOverlap(int value) {
        super(value);
    }
}
