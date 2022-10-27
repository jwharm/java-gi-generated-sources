package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PathDataType extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public static final PathDataType MOVE_TO = new PathDataType(0);
    
    public static final PathDataType LINE_TO = new PathDataType(1);
    
    public static final PathDataType CURVE_TO = new PathDataType(2);
    
    public static final PathDataType CLOSE_PATH = new PathDataType(3);
    
    public PathDataType(int value) {
        super(value);
    }
}
