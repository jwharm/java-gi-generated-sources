package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes the state of a {@code Gdk.EventSequence] in a [class@Gesture}.
 */
public class EventSequenceState extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * The sequence is handled, but not grabbed.
     */
    public static final EventSequenceState NONE = new EventSequenceState(0);
    
    /**
     * The sequence is handled and grabbed.
     */
    public static final EventSequenceState CLAIMED = new EventSequenceState(1);
    
    /**
     * The sequence is denied.
     */
    public static final EventSequenceState DENIED = new EventSequenceState(2);
    
    public EventSequenceState(int value) {
        super(value);
    }
}
