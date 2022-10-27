package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PatternType extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public static final PatternType SOLID = new PatternType(0);
    
    public static final PatternType SURFACE = new PatternType(1);
    
    public static final PatternType LINEAR = new PatternType(2);
    
    public static final PatternType RADIAL = new PatternType(3);
    
    public static final PatternType MESH = new PatternType(4);
    
    public static final PatternType RASTER_SOURCE = new PatternType(5);
    
    public PatternType(int value) {
        super(value);
    }
}
