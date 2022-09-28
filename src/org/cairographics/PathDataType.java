package org.cairographics;

public class PathDataType extends io.github.jwharm.javagi.Enumeration {

    public static final PathDataType MOVE_TO = new PathDataType(0);
    
    public static final PathDataType LINE_TO = new PathDataType(1);
    
    public static final PathDataType CURVE_TO = new PathDataType(2);
    
    public static final PathDataType CLOSE_PATH = new PathDataType(3);
    
    public PathDataType(int value) {
        super(value);
    }
    
}
