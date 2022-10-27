package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class HintStyle extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public static final HintStyle DEFAULT = new HintStyle(0);
    
    public static final HintStyle NONE = new HintStyle(1);
    
    public static final HintStyle SLIGHT = new HintStyle(2);
    
    public static final HintStyle MEDIUM = new HintStyle(3);
    
    public static final HintStyle FULL = new HintStyle(4);
    
    public HintStyle(int value) {
        super(value);
    }
}
