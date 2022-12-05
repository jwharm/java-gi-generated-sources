package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The different search modes.
 */
public enum SearchMode implements io.github.jwharm.javagi.Enumeration {
    /**
     * Only search for exact matches.
     */
    EXACT(0),
    /**
     * Search for an exact match or the element just before.
     */
    BEFORE(1),
    /**
     * Search for an exact match or the element just after.
     */
    AFTER(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstSearchMode";
    
    private final int value;
    SearchMode(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static SearchMode of(int value) {
        return switch (value) {
            case 0 -> EXACT;
            case 1 -> BEFORE;
            case 2 -> AFTER;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
