package org.gtk.gio;

/**
 * Flags used to set what a {@link FileMonitor} will watch for.
 */
public class FileMonitorFlags extends io.github.jwharm.javagi.Bitfield {

    /**
     * No flags set.
     */
    public static final FileMonitorFlags NONE = new FileMonitorFlags(0);
    
    /**
     * Watch for mount events.
     */
    public static final FileMonitorFlags WATCH_MOUNTS = new FileMonitorFlags(1);
    
    /**
     * Pair DELETED and CREATED events caused
     *   by file renames (moves) and send a single G_FILE_MONITOR_EVENT_MOVED
     *   event instead (NB: not supported on all backends; the default
     *   behaviour -without specifying this flag- is to send single DELETED
     *   and CREATED events).  Deprecated since 2.46: use
     *   {@link FileMonitorFlags#WATCH_MOVES} instead.
     */
    public static final FileMonitorFlags SEND_MOVED = new FileMonitorFlags(2);
    
    /**
     * Watch for changes to the file made
     *   via another hard link. Since 2.36.
     */
    public static final FileMonitorFlags WATCH_HARD_LINKS = new FileMonitorFlags(4);
    
    /**
     * Watch for rename operations on a
     *   monitored directory.  This causes {@link FileMonitorEvent#RENAMED},
     *   {@link FileMonitorEvent#MOVED_IN} and {@link FileMonitorEvent#MOVED_OUT}
     *   events to be emitted when possible.  Since: 2.46.
     */
    public static final FileMonitorFlags WATCH_MOVES = new FileMonitorFlags(8);
    
    public FileMonitorFlags(int value) {
        super(value);
    }
    
}
