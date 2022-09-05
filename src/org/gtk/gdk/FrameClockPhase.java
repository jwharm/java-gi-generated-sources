package org.gtk.gdk;

/**
 * Used to represent the different paint clock phases that can be requested.
 * 
 * The elements of the enumeration correspond to the signals of `GdkFrameClock`.
 */
public class FrameClockPhase {

    /**
     * no phase
     */
    public static final int NONE = 0;
    
    /**
     * corresponds to GdkFrameClock::flush-events. Should not be handled by applications.
     */
    public static final int FLUSH_EVENTS = 1;
    
    /**
     * corresponds to GdkFrameClock::before-paint. Should not be handled by applications.
     */
    public static final int BEFORE_PAINT = 2;
    
    /**
     * corresponds to GdkFrameClock::update.
     */
    public static final int UPDATE = 4;
    
    /**
     * corresponds to GdkFrameClock::layout. Should not be handled by applicatiosn.
     */
    public static final int LAYOUT = 8;
    
    /**
     * corresponds to GdkFrameClock::paint.
     */
    public static final int PAINT = 16;
    
    /**
     * corresponds to GdkFrameClock::resume-events. Should not be handled by applications.
     */
    public static final int RESUME_EVENTS = 32;
    
    /**
     * corresponds to GdkFrameClock::after-paint. Should not be handled by applications.
     */
    public static final int AFTER_PAINT = 64;
    
}
