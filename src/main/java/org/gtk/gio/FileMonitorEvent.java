package org.gtk.gio;

/**
 * Specifies what type of event a monitor event is.
 */
public class FileMonitorEvent extends io.github.jwharm.javagi.Enumeration {

    /**
     * a file changed.
     */
    public static final FileMonitorEvent CHANGED = new FileMonitorEvent(0);
    
    /**
     * a hint that this was probably the last change in a set of changes.
     */
    public static final FileMonitorEvent CHANGES_DONE_HINT = new FileMonitorEvent(1);
    
    /**
     * a file was deleted.
     */
    public static final FileMonitorEvent DELETED = new FileMonitorEvent(2);
    
    /**
     * a file was created.
     */
    public static final FileMonitorEvent CREATED = new FileMonitorEvent(3);
    
    /**
     * a file attribute was changed.
     */
    public static final FileMonitorEvent ATTRIBUTE_CHANGED = new FileMonitorEvent(4);
    
    /**
     * the file location will soon be unmounted.
     */
    public static final FileMonitorEvent PRE_UNMOUNT = new FileMonitorEvent(5);
    
    /**
     * the file location was unmounted.
     */
    public static final FileMonitorEvent UNMOUNTED = new FileMonitorEvent(6);
    
    /**
     * the file was moved -- only sent if the
     *   (deprecated) {@link FileMonitorFlags#SEND_MOVED} flag is set
     */
    public static final FileMonitorEvent MOVED = new FileMonitorEvent(7);
    
    /**
     * the file was renamed within the
     *   current directory -- only sent if the {@link FileMonitorFlags#WATCH_MOVES}
     *   flag is set.  Since: 2.46.
     */
    public static final FileMonitorEvent RENAMED = new FileMonitorEvent(8);
    
    /**
     * the file was moved into the
     *   monitored directory from another location -- only sent if the
     *   {@link FileMonitorFlags#WATCH_MOVES} flag is set.  Since: 2.46.
     */
    public static final FileMonitorEvent MOVED_IN = new FileMonitorEvent(9);
    
    /**
     * the file was moved out of the
     *   monitored directory to another location -- only sent if the
     *   {@link FileMonitorFlags#WATCH_MOVES} flag is set.  Since: 2.46
     */
    public static final FileMonitorEvent MOVED_OUT = new FileMonitorEvent(10);
    
    public FileMonitorEvent(int value) {
        super(value);
    }
    
}
