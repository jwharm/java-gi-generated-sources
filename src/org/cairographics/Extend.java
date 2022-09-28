package org.cairographics;

public class Extend extends io.github.jwharm.javagi.Enumeration {

    public static final Extend NONE = new Extend(0);
    
    public static final Extend REPEAT = new Extend(1);
    
    public static final Extend REFLECT = new Extend(2);
    
    public static final Extend PAD = new Extend(3);
    
    public Extend(int value) {
        super(value);
    }
    
}
