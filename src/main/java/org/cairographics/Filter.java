package org.cairographics;

public class Filter extends io.github.jwharm.javagi.Enumeration {

    public static final Filter FAST = new Filter(0);
    
    public static final Filter GOOD = new Filter(1);
    
    public static final Filter BEST = new Filter(2);
    
    public static final Filter NEAREST = new Filter(3);
    
    public static final Filter BILINEAR = new Filter(4);
    
    public static final Filter GAUSSIAN = new Filter(5);
    
    public Filter(int value) {
        super(value);
    }
    
}
