package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum PathDataType implements io.github.jwharm.javagi.Enumeration {
    MOVE_TO(0),
    LINE_TO(1),
    CURVE_TO(2),
    CLOSE_PATH(3);
    
    private static final java.lang.String C_TYPE_NAME = "cairo_path_data_type_t";
    
    private final int value;
    PathDataType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static PathDataType of(int value) {
        return switch (value) {
            case 0 -> MOVE_TO;
            case 1 -> LINE_TO;
            case 2 -> CURVE_TO;
            case 3 -> CLOSE_PATH;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
