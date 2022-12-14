package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Used to represent the different paint clock phases that can be requested.
 * <p>
 * The elements of the enumeration correspond to the signals of {@code GdkFrameClock}.
 */
public class FrameClockPhase extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GdkFrameClockPhase";
    
    /**
     * no phase
     */
    public static final FrameClockPhase NONE = new FrameClockPhase(0);
    
    /**
     * corresponds to GdkFrameClock::flush-events. Should not be handled by applications.
     */
    public static final FrameClockPhase FLUSH_EVENTS = new FrameClockPhase(1);
    
    /**
     * corresponds to GdkFrameClock::before-paint. Should not be handled by applications.
     */
    public static final FrameClockPhase BEFORE_PAINT = new FrameClockPhase(2);
    
    /**
     * corresponds to GdkFrameClock::update.
     */
    public static final FrameClockPhase UPDATE = new FrameClockPhase(4);
    
    /**
     * corresponds to GdkFrameClock::layout. Should not be handled by applications.
     */
    public static final FrameClockPhase LAYOUT = new FrameClockPhase(8);
    
    /**
     * corresponds to GdkFrameClock::paint.
     */
    public static final FrameClockPhase PAINT = new FrameClockPhase(16);
    
    /**
     * corresponds to GdkFrameClock::resume-events. Should not be handled by applications.
     */
    public static final FrameClockPhase RESUME_EVENTS = new FrameClockPhase(32);
    
    /**
     * corresponds to GdkFrameClock::after-paint. Should not be handled by applications.
     */
    public static final FrameClockPhase AFTER_PAINT = new FrameClockPhase(64);
    
    /**
     * Create a new FrameClockPhase with the provided value
     */
    public FrameClockPhase(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public FrameClockPhase or(FrameClockPhase... masks) {
        int value = this.getValue();
        for (FrameClockPhase arg : masks) {
            value |= arg.getValue();
        }
        return new FrameClockPhase(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static FrameClockPhase combined(FrameClockPhase mask, FrameClockPhase... masks) {
        int value = mask.getValue();
        for (FrameClockPhase arg : masks) {
            value |= arg.getValue();
        }
        return new FrameClockPhase(value);
    }
}
