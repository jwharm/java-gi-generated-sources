package org.gtk.gio;

/**
 * Memory availability warning levels.
 * 
 * Note that because new values might be added, it is recommended that applications check
 * #GMemoryMonitorWarningLevel as ranges, for example:
 * |{@link [&#60;!-- language=&#34;C&#34; --&#62;
 * if (warning_level &#62; G_MEMORY_MONITOR_WARNING_LEVEL_LOW)
 *   drop_caches ();
 * ]}|
 */
public enum MemoryMonitorWarningLevel {

    /**
     * Memory on the device is low, processes
     *   should free up unneeded resources (for example, in-memory caches) so they can
     *   be used elsewhere.
     */
    LOW,
    
    /**
     * Same as @G_MEMORY_MONITOR_WARNING_LEVEL_LOW
     *   but the device has even less free memory, so processes should try harder to free
     *   up unneeded resources. If your process does not need to stay running, it is a
     *   good time for it to quit.
     */
    MEDIUM,
    
    /**
     * The system will soon start terminating
     *   processes to reclaim memory, including background processes.
     */
    CRITICAL;
    
    public static MemoryMonitorWarningLevel fromValue(int value) {
        return switch(value) {
            case 50 -> LOW;
            case 100 -> MEDIUM;
            case 255 -> CRITICAL;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case LOW -> 50;
            case MEDIUM -> 100;
            case CRITICAL -> 255;
        };
    }

}
