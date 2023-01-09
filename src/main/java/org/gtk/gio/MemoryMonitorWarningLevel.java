package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Memory availability warning levels.
 * <p>
 * Note that because new values might be added, it is recommended that applications check
 * {@link MemoryMonitorWarningLevel} as ranges, for example:
 * <pre>{@code <!-- language="C" -->
 * if (warning_level > G_MEMORY_MONITOR_WARNING_LEVEL_LOW)
 *   drop_caches ();
 * }</pre>
 * @version 2.64
 */
public enum MemoryMonitorWarningLevel implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory on the device is low, processes
     *   should free up unneeded resources (for example, in-memory caches) so they can
     *   be used elsewhere.
     */
    LOW(50),
    
    /**
     * Same as {@code G_MEMORY_MONITOR_WARNING_LEVEL_LOW}
     *   but the device has even less free memory, so processes should try harder to free
     *   up unneeded resources. If your process does not need to stay running, it is a
     *   good time for it to quit.
     */
    MEDIUM(100),
    
    /**
     * The system will soon start terminating
     *   processes to reclaim memory, including background processes.
     */
    CRITICAL(255);
    
    private static final java.lang.String C_TYPE_NAME = "GMemoryMonitorWarningLevel";
    
    private final int value;
    
    /**
     * Create a new MemoryMonitorWarningLevel for the provided value
     * @param numeric value the enum value
     */
    MemoryMonitorWarningLevel(int value) {
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
     * Create a new MemoryMonitorWarningLevel for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static MemoryMonitorWarningLevel of(int value) {
        return switch (value) {
            case 50 -> LOW;
            case 100 -> MEDIUM;
            case 255 -> CRITICAL;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
