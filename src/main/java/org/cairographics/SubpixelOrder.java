package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class SubpixelOrder extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public static final SubpixelOrder DEFAULT = new SubpixelOrder(0);
    
    public static final SubpixelOrder RGB = new SubpixelOrder(1);
    
    public static final SubpixelOrder BGR = new SubpixelOrder(2);
    
    public static final SubpixelOrder VRGB = new SubpixelOrder(3);
    
    public static final SubpixelOrder VBGR = new SubpixelOrder(4);
    
    public SubpixelOrder(int value) {
        super(value);
    }
}
