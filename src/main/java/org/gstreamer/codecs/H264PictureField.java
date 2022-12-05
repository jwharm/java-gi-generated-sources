package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum H264PictureField implements io.github.jwharm.javagi.Enumeration {
    FRAME(0),
    TOP_FIELD(1),
    BOTTOM_FIELD(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstH264PictureField";
    
    private final int value;
    H264PictureField(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static H264PictureField of(int value) {
        return switch (value) {
            case 0 -> FRAME;
            case 1 -> TOP_FIELD;
            case 2 -> BOTTOM_FIELD;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
