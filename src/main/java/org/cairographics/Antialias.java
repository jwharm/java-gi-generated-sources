package org.cairographics;

public class Antialias extends io.github.jwharm.javagi.Enumeration {

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
