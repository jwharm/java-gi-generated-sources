package org.gtk.gdk;

/**
 * Specifies the crossing mode for enter and leave events.
 */
public class CrossingMode extends io.github.jwharm.javagi.Enumeration {

    /**
     * crossing because of pointer motion.
     */
    public static final CrossingMode NORMAL = new CrossingMode(0);
    
    /**
     * crossing because a grab is activated.
     */
    public static final CrossingMode GRAB = new CrossingMode(1);
    
    /**
     * crossing because a grab is deactivated.
     */
    public static final CrossingMode UNGRAB = new CrossingMode(2);
    
    /**
     * crossing because a GTK grab is activated.
     */
    public static final CrossingMode GTK_GRAB = new CrossingMode(3);
    
    /**
     * crossing because a GTK grab is deactivated.
     */
    public static final CrossingMode GTK_UNGRAB = new CrossingMode(4);
    
    /**
     * crossing because a GTK widget changed
     *   state (e.g. sensitivity).
     */
    public static final CrossingMode STATE_CHANGED = new CrossingMode(5);
    
    /**
     * crossing because a touch sequence has begun,
     *   this event is synthetic as the pointer might have not left the surface.
     */
    public static final CrossingMode TOUCH_BEGIN = new CrossingMode(6);
    
    /**
     * crossing because a touch sequence has ended,
     *   this event is synthetic as the pointer might have not left the surface.
     */
    public static final CrossingMode TOUCH_END = new CrossingMode(7);
    
    /**
     * crossing because of a device switch (i.e.
     *   a mouse taking control of the pointer after a touch device), this event
     *   is synthetic as the pointer didn’t leave the surface.
     */
    public static final CrossingMode DEVICE_SWITCH = new CrossingMode(8);
    
    public CrossingMode(int value) {
        super(value);
    }
    
}
