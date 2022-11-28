package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The possible return values from a state change function such as
 * gst_element_set_state(). Only {@code GST_STATE_CHANGE_FAILURE} is a real failure.
 */
public class StateChangeReturn extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstStateChangeReturn";
    
    /**
     * the state change failed
     */
    public static final StateChangeReturn FAILURE = new StateChangeReturn(0);
    
    /**
     * the state change succeeded
     */
    public static final StateChangeReturn SUCCESS = new StateChangeReturn(1);
    
    /**
     * the state change will happen asynchronously
     */
    public static final StateChangeReturn ASYNC = new StateChangeReturn(2);
    
    /**
     * the state change succeeded but the element
     *                               cannot produce data in {@link State#PAUSED}.
     *                               This typically happens with live sources.
     */
    public static final StateChangeReturn NO_PREROLL = new StateChangeReturn(3);
    
    public StateChangeReturn(int value) {
        super(value);
    }
}
