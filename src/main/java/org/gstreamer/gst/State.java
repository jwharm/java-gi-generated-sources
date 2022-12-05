package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The possible states an element can be in. States can be changed using
 * gst_element_set_state() and checked using gst_element_get_state().
 */
public enum State implements io.github.jwharm.javagi.Enumeration {
    /**
     * no pending state.
     */
    VOID_PENDING(0),
    /**
     * the NULL state or initial state of an element.
     */
    NULL(1),
    /**
     * the element is ready to go to PAUSED.
     */
    READY(2),
    /**
     * the element is PAUSED, it is ready to accept and
     *                          process data. Sink elements however only accept one
     *                          buffer and then block.
     */
    PAUSED(3),
    /**
     * the element is PLAYING, the {@link Clock} is running and
     *                          the data is flowing.
     */
    PLAYING(4);
    
    private static final java.lang.String C_TYPE_NAME = "GstState";
    
    private final int value;
    State(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static State of(int value) {
        return switch (value) {
            case 0 -> VOID_PENDING;
            case 1 -> NULL;
            case 2 -> READY;
            case 3 -> PAUSED;
            case 4 -> PLAYING;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
