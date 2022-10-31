package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Defines the policy to be used in a scrollable widget when updating
 * the scrolled window adjustments in a given orientation.
 */
public class ScrollablePolicy extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkScrollablePolicy";
    
    /**
     * Scrollable adjustments are based on the minimum size
     */
    public static final ScrollablePolicy MINIMUM = new ScrollablePolicy(0);
    
    /**
     * Scrollable adjustments are based on the natural size
     */
    public static final ScrollablePolicy NATURAL = new ScrollablePolicy(1);
    
    public ScrollablePolicy(int value) {
        super(value);
    }
}
