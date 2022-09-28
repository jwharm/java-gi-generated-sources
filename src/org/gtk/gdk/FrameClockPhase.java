package org.gtk.gdk;

/**
 * Used to represent the different paint clock phases that can be requested.
 * <p>
 * The elements of the enumeration correspond to the signals of {@code GdkFrameClock}.
 */
public class FrameClockPhase {

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
     * corresponds to GdkFrameClock::layout. Should not be handled by applicatiosn.
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
    
    private int value;
    
    public FrameClockPhase(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(FrameClockPhase[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public FrameClockPhase combined(FrameClockPhase mask) {
        return new FrameClockPhase(this.getValue() | mask.getValue());
    }
    
    public static FrameClockPhase combined(FrameClockPhase mask, FrameClockPhase... masks) {
        int value = mask.getValue();
        for (FrameClockPhase arg : masks) {
            value |= arg.getValue();
        }
        return new FrameClockPhase(value);
    }
    
}
