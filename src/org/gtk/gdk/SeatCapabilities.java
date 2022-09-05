package org.gtk.gdk;

/**
 * Flags describing the seat capabilities.
 */
public class SeatCapabilities {

    /**
     * No input capabilities
     */
    public static final int NONE = 0;
    
    /**
     * The seat has a pointer (e.g. mouse)
     */
    public static final int POINTER = 1;
    
    /**
     * The seat has touchscreen(s) attached
     */
    public static final int TOUCH = 2;
    
    /**
     * The seat has drawing tablet(s) attached
     */
    public static final int TABLET_STYLUS = 4;
    
    /**
     * The seat has keyboard(s) attached
     */
    public static final int KEYBOARD = 8;
    
    /**
     * The seat has drawing tablet pad(s) attached
     */
    public static final int TABLET_PAD = 16;
    
    /**
     * The union of all pointing capabilities
     */
    public static final int ALL_POINTING = 7;
    
    /**
     * The union of all capabilities
     */
    public static final int ALL = 15;
    
}
