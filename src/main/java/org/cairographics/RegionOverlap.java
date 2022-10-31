package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class RegionOverlap extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "cairo_region_overlap_t";
    
    public static final RegionOverlap IN = new RegionOverlap(0);
    
    public static final RegionOverlap OUT = new RegionOverlap(1);
    
    public static final RegionOverlap PART = new RegionOverlap(2);
    
    public RegionOverlap(int value) {
        super(value);
    }
}
