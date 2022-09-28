package org.cairographics;

public class SubpixelOrder extends io.github.jwharm.javagi.Enumeration {

    public static final SubpixelOrder DEFAULT = new SubpixelOrder(0);
    
    public static final SubpixelOrder RGB = new SubpixelOrder(1);
    
    public static final SubpixelOrder BGR = new SubpixelOrder(2);
    
    public static final SubpixelOrder VRGB = new SubpixelOrder(3);
    
    public static final SubpixelOrder VBGR = new SubpixelOrder(4);
    
    public SubpixelOrder(int value) {
        super(value);
    }
    
}
