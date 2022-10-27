package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes the type of order that a {@code GtkSorter} may produce.
 */
public class SorterOrder extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * A partial order. Any {@code GtkOrdering} is possible.
     */
    public static final SorterOrder PARTIAL = new SorterOrder(0);
    
    /**
     * No order, all elements are considered equal.
     *   gtk_sorter_compare() will only return {@link Ordering#EQUAL}.
     */
    public static final SorterOrder NONE = new SorterOrder(1);
    
    /**
     * A total order. gtk_sorter_compare() will only
     *   return {@link Ordering#EQUAL} if an item is compared with itself. Two
     *   different items will never cause this value to be returned.
     */
    public static final SorterOrder TOTAL = new SorterOrder(2);
    
    public SorterOrder(int value) {
        super(value);
    }
}
