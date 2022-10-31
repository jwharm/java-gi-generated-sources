package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class SubpixelOrder extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "cairo_subpixel_order_t";
    
    public static final SubpixelOrder DEFAULT = new SubpixelOrder(0);
    
    public static final SubpixelOrder RGB = new SubpixelOrder(1);
    
    public static final SubpixelOrder BGR = new SubpixelOrder(2);
    
    public static final SubpixelOrder VRGB = new SubpixelOrder(3);
    
    public static final SubpixelOrder VBGR = new SubpixelOrder(4);
    
    public SubpixelOrder(int value) {
        super(value);
    }
}
