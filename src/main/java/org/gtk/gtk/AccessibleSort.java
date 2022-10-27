package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The possible values for the {@link AccessibleProperty#SORT}
 * accessible property.
 */
public class AccessibleSort extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * There is no defined sort applied to the column.
     */
    public static final AccessibleSort NONE = new AccessibleSort(0);
    
    /**
     * Items are sorted in ascending order by this column.
     */
    public static final AccessibleSort ASCENDING = new AccessibleSort(1);
    
    /**
     * Items are sorted in descending order by this column.
     */
    public static final AccessibleSort DESCENDING = new AccessibleSort(2);
    
    /**
     * A sort algorithm other than ascending or
     *    descending has been applied.
     */
    public static final AccessibleSort OTHER = new AccessibleSort(3);
    
    public AccessibleSort(int value) {
        super(value);
    }
}
