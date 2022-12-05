package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum SCTESpliceDescriptor implements io.github.jwharm.javagi.Enumeration {
    AVAIL(0),
    DTMF(1),
    SEGMENTATION(2),
    TIME(3),
    AUDIO(4);
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsSCTESpliceDescriptor";
    
    private final int value;
    SCTESpliceDescriptor(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static SCTESpliceDescriptor of(int value) {
        return switch (value) {
            case 0 -> AVAIL;
            case 1 -> DTMF;
            case 2 -> SEGMENTATION;
            case 3 -> TIME;
            case 4 -> AUDIO;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
