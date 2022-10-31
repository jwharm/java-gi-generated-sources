package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes the known strictness of a filter.
 * <p>
 * Note that for filters where the strictness is not known,
 * {@link FilterMatch#SOME} is always an acceptable value,
 * even if a filter does match all or no items.
 */
public class FilterMatch extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkFilterMatch";
    
    /**
     * The filter matches some items,
     *   gtk_filter_match() may return {@code true} or {@code false}
     */
    public static final FilterMatch SOME = new FilterMatch(0);
    
    /**
     * The filter does not match any item,
     *   gtk_filter_match() will always return {@code false}.
     */
    public static final FilterMatch NONE = new FilterMatch(1);
    
    /**
     * The filter matches all items,
     *   gtk_filter_match() will alays return {@code true}.
     */
    public static final FilterMatch ALL = new FilterMatch(2);
    
    public FilterMatch(int value) {
        super(value);
    }
}
