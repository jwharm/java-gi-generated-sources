package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Indicates when this pad will become available.
 */
public class PadPresence extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstPadPresence";
    
    /**
     * the pad is always available
     */
    public static final PadPresence ALWAYS = new PadPresence(0);
    
    /**
     * the pad will become available depending on the media stream
     */
    public static final PadPresence SOMETIMES = new PadPresence(1);
    
    /**
     * the pad is only available on request with
     *  gst_element_request_pad().
     */
    public static final PadPresence REQUEST = new PadPresence(2);
    
    public PadPresence(int value) {
        super(value);
    }
}
