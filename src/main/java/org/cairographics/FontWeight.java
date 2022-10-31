package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class FontWeight extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "cairo_font_weight_t";
    
    public static final FontWeight NORMAL = new FontWeight(0);
    
    public static final FontWeight BOLD = new FontWeight(1);
    
    public FontWeight(int value) {
        super(value);
    }
}
