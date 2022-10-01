package org.cairographics;

public class RegionOverlap extends io.github.jwharm.javagi.Enumeration {

    public static final RegionOverlap IN = new RegionOverlap(0);
    
    public static final RegionOverlap OUT = new RegionOverlap(1);
    
    public static final RegionOverlap PART = new RegionOverlap(2);
    
    public RegionOverlap(int value) {
        super(value);
    }
    
}
