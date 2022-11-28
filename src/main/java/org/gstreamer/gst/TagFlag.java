package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Extra tag flags used when registering tags.
 */
public class TagFlag extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstTagFlag";
    
    /**
     * undefined flag
     */
    public static final TagFlag UNDEFINED = new TagFlag(0);
    
    /**
     * tag is meta data
     */
    public static final TagFlag META = new TagFlag(1);
    
    /**
     * tag is encoded
     */
    public static final TagFlag ENCODED = new TagFlag(2);
    
    /**
     * tag is decoded
     */
    public static final TagFlag DECODED = new TagFlag(3);
    
    /**
     * number of tag flags
     */
    public static final TagFlag COUNT = new TagFlag(4);
    
    public TagFlag(int value) {
        super(value);
    }
}
