package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum DVBCodeRate implements io.github.jwharm.javagi.Enumeration {
    NONE(0),
    _1_2(1),
    _2_3(2),
    _3_4(3),
    _4_5(4),
    _5_6(5),
    _6_7(6),
    _7_8(7),
    _8_9(8),
    AUTO(9),
    _3_5(10),
    _9_10(11),
    _2_5(12);
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsDVBCodeRate";
    
    private final int value;
    DVBCodeRate(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static DVBCodeRate of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> _1_2;
            case 2 -> _2_3;
            case 3 -> _3_4;
            case 4 -> _4_5;
            case 5 -> _5_6;
            case 6 -> _6_7;
            case 7 -> _7_8;
            case 8 -> _8_9;
            case 9 -> AUTO;
            case 10 -> _3_5;
            case 11 -> _9_10;
            case 12 -> _2_5;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
