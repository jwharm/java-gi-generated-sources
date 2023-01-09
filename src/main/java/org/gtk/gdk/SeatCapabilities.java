package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags describing the seat capabilities.
 */
public class SeatCapabilities extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GdkSeatCapabilities";
    
    /**
     * No input capabilities
     */
    public static final SeatCapabilities NONE = new SeatCapabilities(0);
    
    /**
     * The seat has a pointer (e.g. mouse)
     */
    public static final SeatCapabilities POINTER = new SeatCapabilities(1);
    
    /**
     * The seat has touchscreen(s) attached
     */
    public static final SeatCapabilities TOUCH = new SeatCapabilities(2);
    
    /**
     * The seat has drawing tablet(s) attached
     */
    public static final SeatCapabilities TABLET_STYLUS = new SeatCapabilities(4);
    
    /**
     * The seat has keyboard(s) attached
     */
    public static final SeatCapabilities KEYBOARD = new SeatCapabilities(8);
    
    /**
     * The seat has drawing tablet pad(s) attached
     */
    public static final SeatCapabilities TABLET_PAD = new SeatCapabilities(16);
    
    /**
     * The union of all pointing capabilities
     */
    public static final SeatCapabilities ALL_POINTING = new SeatCapabilities(7);
    
    /**
     * The union of all capabilities
     */
    public static final SeatCapabilities ALL = new SeatCapabilities(15);
    
    /**
     * Create a new SeatCapabilities with the provided value
     */
    public SeatCapabilities(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public SeatCapabilities or(SeatCapabilities... masks) {
        int value = this.getValue();
        for (SeatCapabilities arg : masks) {
            value |= arg.getValue();
        }
        return new SeatCapabilities(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static SeatCapabilities combined(SeatCapabilities mask, SeatCapabilities... masks) {
        int value = mask.getValue();
        for (SeatCapabilities arg : masks) {
            value |= arg.getValue();
        }
        return new SeatCapabilities(value);
    }
}
