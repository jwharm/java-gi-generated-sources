package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class SliceConfig extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public static final SliceConfig ALWAYS_MALLOC = new SliceConfig(1);
    
    public static final SliceConfig BYPASS_MAGAZINES = new SliceConfig(2);
    
    public static final SliceConfig WORKING_SET_MSECS = new SliceConfig(3);
    
    public static final SliceConfig COLOR_INCREMENT = new SliceConfig(4);
    
    public static final SliceConfig CHUNK_SIZES = new SliceConfig(5);
    
    public static final SliceConfig CONTENTION_COUNTER = new SliceConfig(6);
    
    public SliceConfig(int value) {
        super(value);
    }
}
