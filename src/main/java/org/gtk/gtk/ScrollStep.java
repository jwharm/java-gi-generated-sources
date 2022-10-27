package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Passed as argument to various keybinding signals.
 */
public class ScrollStep extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Scroll in steps.
     */
    public static final ScrollStep STEPS = new ScrollStep(0);
    
    /**
     * Scroll by pages.
     */
    public static final ScrollStep PAGES = new ScrollStep(1);
    
    /**
     * Scroll to ends.
     */
    public static final ScrollStep ENDS = new ScrollStep(2);
    
    /**
     * Scroll in horizontal steps.
     */
    public static final ScrollStep HORIZONTAL_STEPS = new ScrollStep(3);
    
    /**
     * Scroll by horizontal pages.
     */
    public static final ScrollStep HORIZONTAL_PAGES = new ScrollStep(4);
    
    /**
     * Scroll to the horizontal ends.
     */
    public static final ScrollStep HORIZONTAL_ENDS = new ScrollStep(5);
    
    public ScrollStep(int value) {
        super(value);
    }
}
