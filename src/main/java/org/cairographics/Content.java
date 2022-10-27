package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class Content extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public static final Content COLOR = new Content(4096);
    
    public static final Content ALPHA = new Content(8192);
    
    public static final Content COLOR_ALPHA = new Content(12288);
    
    public Content(int value) {
        super(value);
    }
}
