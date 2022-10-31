package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes changes in a sorter in more detail and allows users
 * to optimize resorting.
 */
public class SorterChange extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkSorterChange";
    
    /**
     * The sorter change cannot be described
     *   by any of the other enumeration values
     */
    public static final SorterChange DIFFERENT = new SorterChange(0);
    
    /**
     * The sort order was inverted. Comparisons
     *   that returned {@link Ordering#SMALLER} now return {@link Ordering#LARGER}
     *   and vice versa. Other comparisons return the same values as before.
     */
    public static final SorterChange INVERTED = new SorterChange(1);
    
    /**
     * The sorter is less strict: Comparisons
     *   may now return {@link Ordering#EQUAL} that did not do so before.
     */
    public static final SorterChange LESS_STRICT = new SorterChange(2);
    
    /**
     * The sorter is more strict: Comparisons
     *   that did return {@link Ordering#EQUAL} may not do so anymore.
     */
    public static final SorterChange MORE_STRICT = new SorterChange(3);
    
    public SorterChange(int value) {
        super(value);
    }
}
