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
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
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
