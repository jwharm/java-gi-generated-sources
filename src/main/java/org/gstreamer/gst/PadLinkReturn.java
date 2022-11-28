package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Result values from gst_pad_link and friends.
 */
public class PadLinkReturn extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstPadLinkReturn";
    
    /**
     * link succeeded
     */
    public static final PadLinkReturn OK = new PadLinkReturn(0);
    
    /**
     * pads have no common grandparent
     */
    public static final PadLinkReturn WRONG_HIERARCHY = new PadLinkReturn(0);
    
    /**
     * pad was already linked
     */
    public static final PadLinkReturn WAS_LINKED = new PadLinkReturn(0);
    
    /**
     * pads have wrong direction
     */
    public static final PadLinkReturn WRONG_DIRECTION = new PadLinkReturn(0);
    
    /**
     * pads do not have common format
     */
    public static final PadLinkReturn NOFORMAT = new PadLinkReturn(0);
    
    /**
     * pads cannot cooperate in scheduling
     */
    public static final PadLinkReturn NOSCHED = new PadLinkReturn(0);
    
    /**
     * refused for some reason
     */
    public static final PadLinkReturn REFUSED = new PadLinkReturn(0);
    
    public PadLinkReturn(int value) {
        super(value);
    }
}
