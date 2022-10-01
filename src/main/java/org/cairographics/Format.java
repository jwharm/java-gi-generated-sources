package org.cairographics;

public class Format extends io.github.jwharm.javagi.Enumeration {

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
