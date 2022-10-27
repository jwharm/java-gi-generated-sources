package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags describing the seat capabilities.
 */
public class SeatCapabilities extends io.github.jwharm.javagi.Bitfield {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
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
    
    public SeatCapabilities(int value) {
        super(value);
    }
}
