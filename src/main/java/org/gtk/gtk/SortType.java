package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Determines the direction of a sort.
 */
public class SortType extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Sorting is in ascending order.
     */
    public static final SortType ASCENDING = new SortType(0);
    
    /**
     * Sorting is in descending order.
     */
    public static final SortType DESCENDING = new SortType(1);
    
    public SortType(int value) {
        super(value);
    }
}
