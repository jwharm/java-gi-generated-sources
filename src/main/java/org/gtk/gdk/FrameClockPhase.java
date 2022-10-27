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
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
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
    
    public FrameClockPhase(int value) {
        super(value);
    }
}
