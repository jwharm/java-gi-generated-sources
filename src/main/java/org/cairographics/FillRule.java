package org.cairographics;

public class FillRule extends io.github.jwharm.javagi.Enumeration {

    public static final FillRule WINDING = new FillRule(0);
    
    public static final FillRule EVEN_ODD = new FillRule(1);
    
    public FillRule(int value) {
        super(value);
    }
    
}
