package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class Format extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public static final Format INVALID = new Format(-1);
    
    public static final Format ARGB32 = new Format(0);
    
    public static final Format RGB24 = new Format(1);
    
    public static final Format A8 = new Format(2);
    
    public static final Format A1 = new Format(3);
    
    public static final Format RGB16_565 = new Format(4);
    
    public static final Format RGB30 = new Format(5);
    
    public Format(int value) {
        super(value);
    }
}
