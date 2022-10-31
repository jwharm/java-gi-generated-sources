package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TextClusterFlags extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "cairo_text_cluster_flags_t";
    
    public static final TextClusterFlags BACKWARD = new TextClusterFlags(1);
    
    public TextClusterFlags(int value) {
        super(value);
    }
}
