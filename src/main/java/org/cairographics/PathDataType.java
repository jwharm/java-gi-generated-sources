package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PathDataType extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "cairo_path_data_type_t";
    
    public static final PathDataType MOVE_TO = new PathDataType(0);
    
    public static final PathDataType LINE_TO = new PathDataType(1);
    
    public static final PathDataType CURVE_TO = new PathDataType(2);
    
    public static final PathDataType CLOSE_PATH = new PathDataType(3);
    
    public PathDataType(int value) {
        super(value);
    }
}
