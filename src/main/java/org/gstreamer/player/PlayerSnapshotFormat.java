package org.gstreamer.player;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum PlayerSnapshotFormat implements io.github.jwharm.javagi.Enumeration {
    
    RAW_NATIVE(0),
    
    RAW_XRGB(1),
    
    RAW_BGRX(2),
    
    JPG(3),
    
    PNG(4);
    
    private static final java.lang.String C_TYPE_NAME = "GstPlayerSnapshotFormat";
    
    private final int value;
    
    /**
     * Create a new PlayerSnapshotFormat for the provided value
     * @param numeric value the enum value
     */
    PlayerSnapshotFormat(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new PlayerSnapshotFormat for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static PlayerSnapshotFormat of(int value) {
        return switch (value) {
            case 0 -> RAW_NATIVE;
            case 1 -> RAW_XRGB;
            case 2 -> RAW_BGRX;
            case 3 -> JPG;
            case 4 -> PNG;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
