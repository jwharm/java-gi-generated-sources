package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class Antialias extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public static final Antialias DEFAULT = new Antialias(0);
    
    public static final Antialias NONE = new Antialias(1);
    
    public static final Antialias GRAY = new Antialias(2);
    
    public static final Antialias SUBPIXEL = new Antialias(3);
    
    public static final Antialias FAST = new Antialias(4);
    
    public static final Antialias GOOD = new Antialias(5);
    
    public static final Antialias BEST = new Antialias(6);
    
    public Antialias(int value) {
        super(value);
    }
}
