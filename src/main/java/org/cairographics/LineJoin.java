package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class LineJoin extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public static final LineJoin MITER = new LineJoin(0);
    
    public static final LineJoin ROUND = new LineJoin(1);
    
    public static final LineJoin BEVEL = new LineJoin(2);
    
    public LineJoin(int value) {
        super(value);
    }
}
