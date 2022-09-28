package org.cairographics;

public class LineJoin extends io.github.jwharm.javagi.Enumeration {

    public static final LineJoin MITER = new LineJoin(0);
    
    public static final LineJoin ROUND = new LineJoin(1);
    
    public static final LineJoin BEVEL = new LineJoin(2);
    
    public LineJoin(int value) {
        super(value);
    }
    
}
