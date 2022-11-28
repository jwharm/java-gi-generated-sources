package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The result of gst_iterator_next().
 */
public class IteratorResult extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstIteratorResult";
    
    /**
     * No more items in the iterator
     */
    public static final IteratorResult DONE = new IteratorResult(0);
    
    /**
     * An item was retrieved
     */
    public static final IteratorResult OK = new IteratorResult(1);
    
    /**
     * Datastructure changed while iterating
     */
    public static final IteratorResult RESYNC = new IteratorResult(2);
    
    /**
     * An error happened
     */
    public static final IteratorResult ERROR = new IteratorResult(3);
    
    public IteratorResult(int value) {
        super(value);
    }
}
