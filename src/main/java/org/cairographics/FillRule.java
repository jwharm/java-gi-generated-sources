package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class FillRule extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "cairo_fill_rule_t";
    
    public static final FillRule WINDING = new FillRule(0);
    
    public static final FillRule EVEN_ODD = new FillRule(1);
    
    public FillRule(int value) {
        super(value);
    }
}
