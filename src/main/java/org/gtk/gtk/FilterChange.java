package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes changes in a filter in more detail and allows objects
 * using the filter to optimize refiltering items.
 * <p>
 * If you are writing an implementation and are not sure which
 * value to pass, {@link FilterChange#DIFFERENT} is always a correct
 * choice.
 */
public class FilterChange extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkFilterChange";
    
    /**
     * The filter change cannot be
     *   described with any of the other enumeration values.
     */
    public static final FilterChange DIFFERENT = new FilterChange(0);
    
    /**
     * The filter is less strict than
     *   it was before: All items that it used to return {@code true} for
     *   still return {@code true}, others now may, too.
     */
    public static final FilterChange LESS_STRICT = new FilterChange(1);
    
    /**
     * The filter is more strict than
     *   it was before: All items that it used to return {@code false} for
     *   still return {@code false}, others now may, too.
     */
    public static final FilterChange MORE_STRICT = new FilterChange(2);
    
    public FilterChange(int value) {
        super(value);
    }
}
