package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class Content extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "cairo_content_t";
    
    public static final Content COLOR = new Content(4096);
    
    public static final Content ALPHA = new Content(8192);
    
    public static final Content COLOR_ALPHA = new Content(12288);
    
    public Content(int value) {
        super(value);
    }
}
