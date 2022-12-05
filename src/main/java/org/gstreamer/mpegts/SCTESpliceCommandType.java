package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum SCTESpliceCommandType implements io.github.jwharm.javagi.Enumeration {
    NULL(0),
    SCHEDULE(4),
    INSERT(5),
    TIME(6),
    BANDWIDTH(7),
    PRIVATE(255);
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsSCTESpliceCommandType";
    
    private final int value;
    SCTESpliceCommandType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static SCTESpliceCommandType of(int value) {
        return switch (value) {
            case 0 -> NULL;
            case 4 -> SCHEDULE;
            case 5 -> INSERT;
            case 6 -> TIME;
            case 7 -> BANDWIDTH;
            case 255 -> PRIVATE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
