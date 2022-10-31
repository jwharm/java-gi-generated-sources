package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class FontSlant extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "cairo_font_slant_t";
    
    public static final FontSlant NORMAL = new FontSlant(0);
    
    public static final FontSlant ITALIC = new FontSlant(1);
    
    public static final FontSlant OBLIQUE = new FontSlant(2);
    
    public FontSlant(int value) {
        super(value);
    }
}
