package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies what type of event a monitor event is.
 */
public enum FileMonitorEvent implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * a file changed.
     */
    CHANGED(0),
    
    /**
     * a hint that this was probably the last change in a set of changes.
     */
    CHANGES_DONE_HINT(1),
    
    /**
     * a file was deleted.
     */
    DELETED(2),
    
    /**
     * a file was created.
     */
    CREATED(3),
    
    /**
     * a file attribute was changed.
     */
    ATTRIBUTE_CHANGED(4),
    
    /**
     * the file location will soon be unmounted.
     */
    PRE_UNMOUNT(5),
    
    /**
     * the file location was unmounted.
     */
    UNMOUNTED(6),
    
    /**
     * the file was moved -- only sent if the
     *   (deprecated) {@link FileMonitorFlags#SEND_MOVED} flag is set
     */
    MOVED(7),
    
    /**
     * the file was renamed within the
     *   current directory -- only sent if the {@link FileMonitorFlags#WATCH_MOVES}
     *   flag is set.  Since: 2.46.
     */
    RENAMED(8),
    
    /**
     * the file was moved into the
     *   monitored directory from another location -- only sent if the
     *   {@link FileMonitorFlags#WATCH_MOVES} flag is set.  Since: 2.46.
     */
    MOVED_IN(9),
    
    /**
     * the file was moved out of the
     *   monitored directory to another location -- only sent if the
     *   {@link FileMonitorFlags#WATCH_MOVES} flag is set.  Since: 2.46
     */
    MOVED_OUT(10);
    
    private static final java.lang.String C_TYPE_NAME = "GFileMonitorEvent";
    
    private final int value;
    
    /**
     * Create a new FileMonitorEvent for the provided value
     * @param numeric value the enum value
     */
    FileMonitorEvent(int value) {
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
     * Create a new FileMonitorEvent for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static FileMonitorEvent of(int value) {
        return switch (value) {
            case 0 -> CHANGED;
            case 1 -> CHANGES_DONE_HINT;
            case 2 -> DELETED;
            case 3 -> CREATED;
            case 4 -> ATTRIBUTE_CHANGED;
            case 5 -> PRE_UNMOUNT;
            case 6 -> UNMOUNTED;
            case 7 -> MOVED;
            case 8 -> RENAMED;
            case 9 -> MOVED_IN;
            case 10 -> MOVED_OUT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
