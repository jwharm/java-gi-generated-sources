package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class FontType extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public static final FontType TOY = new FontType(0);
    
    public static final FontType FT = new FontType(1);
    
    public static final FontType WIN32 = new FontType(2);
    
    public static final FontType QUARTZ = new FontType(3);
    
    public static final FontType USER = new FontType(4);
    
    public FontType(int value) {
        super(value);
    }
}
