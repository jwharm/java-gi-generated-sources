package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class LineCap extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "cairo_line_cap_t";
    
    public static final LineCap BUTT = new LineCap(0);
    
    public static final LineCap ROUND = new LineCap(1);
    
    public static final LineCap SQUARE = new LineCap(2);
    
    public LineCap(int value) {
        super(value);
    }
}
