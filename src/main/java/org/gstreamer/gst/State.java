package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The possible states an element can be in. States can be changed using
 * gst_element_set_state() and checked using gst_element_get_state().
 */
public class State extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstState";
    
    /**
     * no pending state.
     */
    public static final State VOID_PENDING = new State(0);
    
    /**
     * the NULL state or initial state of an element.
     */
    public static final State NULL = new State(1);
    
    /**
     * the element is ready to go to PAUSED.
     */
    public static final State READY = new State(2);
    
    /**
     * the element is PAUSED, it is ready to accept and
     *                          process data. Sink elements however only accept one
     *                          buffer and then block.
     */
    public static final State PAUSED = new State(3);
    
    /**
     * the element is PLAYING, the {@link Clock} is running and
     *                          the data is flowing.
     */
    public static final State PLAYING = new State(4);
    
    public State(int value) {
        super(value);
    }
}
