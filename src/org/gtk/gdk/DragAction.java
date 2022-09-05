package org.gtk.gdk;

/**
 * Used in `GdkDrop` and `GdkDrag` to indicate the actions that the
 * destination can and should do with the dropped data.
 */
public class DragAction {

    /**
     * Copy the data.
     */
    public static final int COPY = 1;
    
    /**
     * Move the data, i.e. first copy it, then delete
     *   it from the source using the DELETE target of the X selection protocol.
     */
    public static final int MOVE = 2;
    
    /**
     * Add a link to the data. Note that this is only
     *   useful if source and destination agree on what it means, and is not
     *   supported on all platforms.
     */
    public static final int LINK = 4;
    
    /**
     * Ask the user what to do with the data.
     */
    public static final int ASK = 8;
    
}
