package org.cairographics;

public class PatternType extends io.github.jwharm.javagi.Enumeration {

    public static final PatternType SOLID = new PatternType(0);
    
    public static final PatternType SURFACE = new PatternType(1);
    
    public static final PatternType LINEAR = new PatternType(2);
    
    public static final PatternType RADIAL = new PatternType(3);
    
    public static final PatternType MESH = new PatternType(4);
    
    public static final PatternType RASTER_SOURCE = new PatternType(5);
    
    public PatternType(int value) {
        super(value);
    }
    
}
