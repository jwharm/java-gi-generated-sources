package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Indicates which monitor a surface should span over when in fullscreen mode.
 */
public enum FullscreenMode implements io.github.jwharm.javagi.Enumeration {
    /**
     * Fullscreen on current monitor only.
     */
    CURRENT_MONITOR(0),
    /**
     * Span across all monitors when fullscreen.
     */
    ALL_MONITORS(1);
    
    private static final java.lang.String C_TYPE_NAME = "GdkFullscreenMode";
    
    private final int value;
    FullscreenMode(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static FullscreenMode of(int value) {
        return switch (value) {
            case 0 -> CURRENT_MONITOR;
            case 1 -> ALL_MONITORS;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
