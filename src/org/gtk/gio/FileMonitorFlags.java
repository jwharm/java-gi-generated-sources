package org.gtk.gio;

/**
 * Flags used to set what a {@link org.gtk.gio.FileMonitor} will watch for.
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
     *   {@link org.gtk.gio.FileMonitorFlags<code>#WATCH_MOVES</code>  instead.
     */
    public static final int SEND_MOVED = 2;
    
    /**
     * Watch for changes to the file made
     *   via another hard link. Since 2.36.
     */
    public static final int WATCH_HARD_LINKS = 4;
    
    /**
     * Watch for rename operations on a
     *   monitored directory.  This causes {@link org.gtk.gio.FileMonitorEvent<code>#RENAMED</code>  
     *   {@link org.gtk.gio.FileMonitorEvent<code>#MOVED_IN</code>  and {@link org.gtk.gio.FileMonitorEvent<code>#MOVED_OUT</code>    events to be emitted when possible.  Since: 2.46.
     */
    public static final int WATCH_MOVES = 8;
    
}
