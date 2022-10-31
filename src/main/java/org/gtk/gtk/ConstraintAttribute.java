package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The widget attributes that can be used when creating a {@link Constraint}.
 */
public class ConstraintAttribute extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkConstraintAttribute";
    
    /**
     * No attribute, used for constant
     *   relations
     */
    public static final ConstraintAttribute NONE = new ConstraintAttribute(0);
    
    /**
     * The left edge of a widget, regardless of
     *   text direction
     */
    public static final ConstraintAttribute LEFT = new ConstraintAttribute(1);
    
    /**
     * The right edge of a widget, regardless
     *   of text direction
     */
    public static final ConstraintAttribute RIGHT = new ConstraintAttribute(2);
    
    /**
     * The top edge of a widget
     */
    public static final ConstraintAttribute TOP = new ConstraintAttribute(3);
    
    /**
     * The bottom edge of a widget
     */
    public static final ConstraintAttribute BOTTOM = new ConstraintAttribute(4);
    
    /**
     * The leading edge of a widget, depending
     *   on text direction; equivalent to {@link ConstraintAttribute#LEFT} for LTR
     *   languages, and {@link ConstraintAttribute#RIGHT} for RTL ones
     */
    public static final ConstraintAttribute START = new ConstraintAttribute(5);
    
    /**
     * The trailing edge of a widget, depending
     *   on text direction; equivalent to {@link ConstraintAttribute#RIGHT} for LTR
     *   languages, and {@link ConstraintAttribute#LEFT} for RTL ones
     */
    public static final ConstraintAttribute END = new ConstraintAttribute(6);
    
    /**
     * The width of a widget
     */
    public static final ConstraintAttribute WIDTH = new ConstraintAttribute(7);
    
    /**
     * The height of a widget
     */
    public static final ConstraintAttribute HEIGHT = new ConstraintAttribute(8);
    
    /**
     * The center of a widget, on the
     *   horizontal axis
     */
    public static final ConstraintAttribute CENTER_X = new ConstraintAttribute(9);
    
    /**
     * The center of a widget, on the
     *   vertical axis
     */
    public static final ConstraintAttribute CENTER_Y = new ConstraintAttribute(10);
    
    /**
     * The baseline of a widget
     */
    public static final ConstraintAttribute BASELINE = new ConstraintAttribute(11);
    
    public ConstraintAttribute(int value) {
        super(value);
    }
}
