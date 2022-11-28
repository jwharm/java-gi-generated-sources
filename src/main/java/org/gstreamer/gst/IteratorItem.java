package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The result of a {@link IteratorItemFunction}.
 */
public class IteratorItem extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstIteratorItem";
    
    /**
     * Skip this item
     */
    public static final IteratorItem SKIP = new IteratorItem(0);
    
    /**
     * Return item
     */
    public static final IteratorItem PASS = new IteratorItem(1);
    
    /**
     * Stop after this item.
     */
    public static final IteratorItem END = new IteratorItem(2);
    
    public IteratorItem(int value) {
        super(value);
    }
}
