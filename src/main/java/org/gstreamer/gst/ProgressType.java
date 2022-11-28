package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of a {@link MessageType#PROGRESS}. The progress messages inform the
 * application of the status of asynchronous tasks.
 */
public class ProgressType extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstProgressType";
    
    /**
     * A new task started.
     */
    public static final ProgressType START = new ProgressType(0);
    
    /**
     * A task completed and a new one continues.
     */
    public static final ProgressType CONTINUE = new ProgressType(1);
    
    /**
     * A task completed.
     */
    public static final ProgressType COMPLETE = new ProgressType(2);
    
    /**
     * A task was canceled.
     */
    public static final ProgressType CANCELED = new ProgressType(3);
    
    /**
     * A task caused an error. An error message is also
     *          posted on the bus.
     */
    public static final ProgressType ERROR = new ProgressType(4);
    
    public ProgressType(int value) {
        super(value);
    }
}
