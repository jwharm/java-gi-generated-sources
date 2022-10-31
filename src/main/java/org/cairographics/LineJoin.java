package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class LineJoin extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "cairo_line_join_t";
    
    public static final LineJoin MITER = new LineJoin(0);
    
    public static final LineJoin ROUND = new LineJoin(1);
    
    public static final LineJoin BEVEL = new LineJoin(2);
    
    public LineJoin(int value) {
        super(value);
    }
}
