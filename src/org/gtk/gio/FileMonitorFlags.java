package org.gtk.gio;

/**
 * Flags used to set what a #GFileMonitor will watch for.
 */
public class FileMonitorFlags {

    /**
     * No flags set.
     */
    public static final int NONE = 0;
    
    /**
     * Watch for mount events.
     */
    public static final int WATCH_MOUNTS = 1;
    
    /**
     * Pair DELETED and CREATED events caused
     *   by file renames (moves) and send a single G_FILE_MONITOR_EVENT_MOVED
     *   event instead (NB: not supported on all backends; the default
     *   behaviour -without specifying this flag- is to send single DELETED
     *   and CREATED events).  Deprecated since 2.46: use
     *   %G_FILE_MONITOR_WATCH_MOVES instead.
     */
    public static final int SEND_MOVED = 2;
    
    /**
     * Watch for changes to the file made
     *   via another hard link. Since 2.36.
     */
    public static final int WATCH_HARD_LINKS = 4;
    
    /**
     * Watch for rename operations on a
     *   monitored directory.  This causes %G_FILE_MONITOR_EVENT_RENAMED,
     *   %G_FILE_MONITOR_EVENT_MOVED_IN and %G_FILE_MONITOR_EVENT_MOVED_OUT
     *   events to be emitted when possible.  Since: 2.46.
     */
    public static final int WATCH_MOVES = 8;
    
}
