package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class FontSlant extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public static final FontSlant NORMAL = new FontSlant(0);
    
    public static final FontSlant ITALIC = new FontSlant(1);
    
    public static final FontSlant OBLIQUE = new FontSlant(2);
    
    public FontSlant(int value) {
        super(value);
    }
}
