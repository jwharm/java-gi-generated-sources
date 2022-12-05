package org.gstreamer.pbutils;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Result values for the discovery process.
 */
public enum DiscovererResult implements io.github.jwharm.javagi.Enumeration {
    /**
     * The discovery was successful
     */
    OK(0),
    /**
     * the URI is invalid
     */
    URI_INVALID(1),
    /**
     * an error happened and the GError is set
     */
    ERROR(2),
    /**
     * the discovery timed-out
     */
    TIMEOUT(3),
    /**
     * the discoverer was already discovering a file
     */
    BUSY(4),
    /**
     * Some plugins are missing for full discovery
     */
    MISSING_PLUGINS(5);
    
    private static final java.lang.String C_TYPE_NAME = "GstDiscovererResult";
    
    private final int value;
    DiscovererResult(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static DiscovererResult of(int value) {
        return switch (value) {
            case 0 -> OK;
            case 1 -> URI_INVALID;
            case 2 -> ERROR;
            case 3 -> TIMEOUT;
            case 4 -> BUSY;
            case 5 -> MISSING_PLUGINS;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
