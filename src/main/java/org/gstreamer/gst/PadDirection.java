package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The direction of a pad.
 */
public class PadDirection extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstPadDirection";
    
    /**
     * direction is unknown.
     */
    public static final PadDirection UNKNOWN = new PadDirection(0);
    
    /**
     * the pad is a source pad.
     */
    public static final PadDirection SRC = new PadDirection(1);
    
    /**
     * the pad is a sink pad.
     */
    public static final PadDirection SINK = new PadDirection(2);
    
    public PadDirection(int value) {
        super(value);
    }
}
