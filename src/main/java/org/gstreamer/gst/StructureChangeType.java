package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of a {@link MessageType#STRUCTURE_CHANGE}.
 */
public class StructureChangeType extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstStructureChangeType";
    
    /**
     * Pad linking is starting or done.
     */
    public static final StructureChangeType LINK = new StructureChangeType(0);
    
    /**
     * Pad unlinking is starting or done.
     */
    public static final StructureChangeType UNLINK = new StructureChangeType(1);
    
    public StructureChangeType(int value) {
        super(value);
    }
}
