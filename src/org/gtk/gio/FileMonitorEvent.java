package org.gtk.gio;

/**
 * Specifies what type of event a monitor event is.
 */
public enum FileMonitorEvent {

    /**
     * a file changed.
     */
    CHANGED,
    
    /**
     * a hint that this was probably the last change in a set of changes.
     */
    CHANGES_DONE_HINT,
    
    /**
     * a file was deleted.
     */
    DELETED,
    
    /**
     * a file was created.
     */
    CREATED,
    
    /**
     * a file attribute was changed.
     */
    ATTRIBUTE_CHANGED,
    
    /**
     * the file location will soon be unmounted.
     */
    PRE_UNMOUNT,
    
    /**
     * the file location was unmounted.
     */
    UNMOUNTED,
    
    /**
     * the file was moved -- only sent if the
     *   (deprecated) {@link FileMonitorFlags#SEND_MOVED} flag is set
     */
    MOVED,
    
    /**
     * the file was renamed within the
     *   current directory -- only sent if the {@link FileMonitorFlags#WATCH_MOVES}
     *   flag is set.  Since: 2.46.
     */
    RENAMED,
    
    /**
     * the file was moved into the
     *   monitored directory from another location -- only sent if the
     *   {@link FileMonitorFlags#WATCH_MOVES} flag is set.  Since: 2.46.
     */
    MOVED_IN,
    
    /**
     * the file was moved out of the
     *   monitored directory to another location -- only sent if the
     *   {@link FileMonitorFlags#WATCH_MOVES} flag is set.  Since: 2.46
     */
    MOVED_OUT;
    
    public static FileMonitorEvent fromValue(int value) {
        return switch(value) {
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
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case CHANGED -> 0;
            case CHANGES_DONE_HINT -> 1;
            case DELETED -> 2;
            case CREATED -> 3;
            case ATTRIBUTE_CHANGED -> 4;
            case PRE_UNMOUNT -> 5;
            case UNMOUNTED -> 6;
            case MOVED -> 7;
            case RENAMED -> 8;
            case MOVED_IN -> 9;
            case MOVED_OUT -> 10;
        };
    }

}
