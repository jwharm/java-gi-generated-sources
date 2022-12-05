package org.gstreamer.play;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum PlaySnapshotFormat implements io.github.jwharm.javagi.Enumeration {
    /**
     * raw native format.
     */
    RAW_NATIVE(0),
    /**
     * raw xRGB format.
     */
    RAW_XRGB(1),
    /**
     * raw BGRx format.
     */
    RAW_BGRX(2),
    /**
     * jpeg format.
     */
    JPG(3),
    /**
     * png format.
     */
    PNG(4);
    
    private static final java.lang.String C_TYPE_NAME = "GstPlaySnapshotFormat";
    
    private final int value;
    PlaySnapshotFormat(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static PlaySnapshotFormat of(int value) {
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
