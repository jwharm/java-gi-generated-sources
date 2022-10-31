package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class HintStyle extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "cairo_hint_style_t";
    
    public static final HintStyle DEFAULT = new HintStyle(0);
    
    public static final HintStyle NONE = new HintStyle(1);
    
    public static final HintStyle SLIGHT = new HintStyle(2);
    
    public static final HintStyle MEDIUM = new HintStyle(3);
    
    public static final HintStyle FULL = new HintStyle(4);
    
    public HintStyle(int value) {
        super(value);
    }
}
