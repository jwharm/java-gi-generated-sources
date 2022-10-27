package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class LineCap extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public static final LineCap BUTT = new LineCap(0);
    
    public static final LineCap ROUND = new LineCap(1);
    
    public static final LineCap SQUARE = new LineCap(2);
    
    public LineCap(int value) {
        super(value);
    }
}
