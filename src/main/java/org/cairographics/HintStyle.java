package org.cairographics;

public class HintStyle extends io.github.jwharm.javagi.Enumeration {

    public static final HintStyle DEFAULT = new HintStyle(0);
    
    public static final HintStyle NONE = new HintStyle(1);
    
    public static final HintStyle SLIGHT = new HintStyle(2);
    
    public static final HintStyle MEDIUM = new HintStyle(3);
    
    public static final HintStyle FULL = new HintStyle(4);
    
    public HintStyle(int value) {
        super(value);
    }
    
}
