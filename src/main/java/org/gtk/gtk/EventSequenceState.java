package org.gtk.gtk;

/**
 * Describes the state of a {@code Gesture}.
 */
public class EventSequenceState extends io.github.jwharm.javagi.Enumeration {

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
