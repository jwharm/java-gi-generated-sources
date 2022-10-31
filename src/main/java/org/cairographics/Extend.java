package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class Extend extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "cairo_extend_t";
    
    public static final Extend NONE = new Extend(0);
    
    public static final Extend REPEAT = new Extend(1);
    
    public static final Extend REFLECT = new Extend(2);
    
    public static final Extend PAD = new Extend(3);
    
    public Extend(int value) {
        super(value);
    }
}
