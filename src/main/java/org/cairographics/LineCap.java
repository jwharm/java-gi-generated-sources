package org.cairographics;

public class LineCap extends io.github.jwharm.javagi.Enumeration {

    public static final LineCap BUTT = new LineCap(0);
    
    public static final LineCap ROUND = new LineCap(1);
    
    public static final LineCap SQUARE = new LineCap(2);
    
    public LineCap(int value) {
        super(value);
    }
    
}
