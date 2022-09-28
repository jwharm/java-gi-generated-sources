package org.gtk.gio;

/**
 * Memory availability warning levels.
 * <p>
 * Note that because new values might be added, it is recommended that applications check
 * {@link MemoryMonitorWarningLevel} as ranges, for example:
 * <pre>{@code <!-- language="C" -->
 * if (warning_level > G_MEMORY_MONITOR_WARNING_LEVEL_LOW)
 *   drop_caches ();
 * }</pre>
 */
public class MemoryMonitorWarningLevel {

    /**
     * Memory on the device is low, processes
     *   should free up unneeded resources (for example, in-memory caches) so they can
     *   be used elsewhere.
     */
    public static final MemoryMonitorWarningLevel LOW = new MemoryMonitorWarningLevel(50);
    
    /**
     * Same as {@code G_MEMORY_MONITOR_WARNING_LEVEL_LOW}
     *   but the device has even less free memory, so processes should try harder to free
     *   up unneeded resources. If your process does not need to stay running, it is a
     *   good time for it to quit.
     */
    public static final MemoryMonitorWarningLevel MEDIUM = new MemoryMonitorWarningLevel(100);
    
    /**
     * The system will soon start terminating
     *   processes to reclaim memory, including background processes.
     */
    public static final MemoryMonitorWarningLevel CRITICAL = new MemoryMonitorWarningLevel(255);
    
    private int value;
    
    public MemoryMonitorWarningLevel(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(MemoryMonitorWarningLevel[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
