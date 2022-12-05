package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum AtscMGTTableType implements io.github.jwharm.javagi.Enumeration {
    EIT0(256),
    EIT127(383),
    ETT0(512),
    ETT127(639);
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsAtscMGTTableType";
    
    private final int value;
    AtscMGTTableType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static AtscMGTTableType of(int value) {
        return switch (value) {
            case 256 -> EIT0;
            case 383 -> EIT127;
            case 512 -> ETT0;
            case 639 -> ETT127;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
