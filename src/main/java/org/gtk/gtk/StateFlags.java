package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes a widget state.
 * <p>
 * Widget states are used to match the widget against CSS pseudo-classes.
 * Note that GTK extends the regular CSS classes and sometimes uses
 * different names.
 */
public class StateFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GtkStateFlags";
    
    /**
     * State during normal operation
     */
    public static final StateFlags NORMAL = new StateFlags(0);
    
    /**
     * Widget is active
     */
    public static final StateFlags ACTIVE = new StateFlags(1);
    
    /**
     * Widget has a mouse pointer over it
     */
    public static final StateFlags PRELIGHT = new StateFlags(2);
    
    /**
     * Widget is selected
     */
    public static final StateFlags SELECTED = new StateFlags(4);
    
    /**
     * Widget is insensitive
     */
    public static final StateFlags INSENSITIVE = new StateFlags(8);
    
    /**
     * Widget is inconsistent
     */
    public static final StateFlags INCONSISTENT = new StateFlags(16);
    
    /**
     * Widget has the keyboard focus
     */
    public static final StateFlags FOCUSED = new StateFlags(32);
    
    /**
     * Widget is in a background toplevel window
     */
    public static final StateFlags BACKDROP = new StateFlags(64);
    
    /**
     * Widget is in left-to-right text direction
     */
    public static final StateFlags DIR_LTR = new StateFlags(128);
    
    /**
     * Widget is in right-to-left text direction
     */
    public static final StateFlags DIR_RTL = new StateFlags(256);
    
    /**
     * Widget is a link
     */
    public static final StateFlags LINK = new StateFlags(512);
    
    /**
     * The location the widget points to has already been visited
     */
    public static final StateFlags VISITED = new StateFlags(1024);
    
    /**
     * Widget is checked
     */
    public static final StateFlags CHECKED = new StateFlags(2048);
    
    /**
     * Widget is highlighted as a drop target for DND
     */
    public static final StateFlags DROP_ACTIVE = new StateFlags(4096);
    
    /**
     * Widget has the visible focus
     */
    public static final StateFlags FOCUS_VISIBLE = new StateFlags(8192);
    
    /**
     * Widget contains the keyboard focus
     */
    public static final StateFlags FOCUS_WITHIN = new StateFlags(16384);
    
    public StateFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public StateFlags combined(StateFlags mask) {
        this.setValue(this.getValue() | mask.getValue());
        return this;
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static StateFlags combined(StateFlags mask, StateFlags... masks) {
        for (StateFlags arg : masks) {
            mask.setValue(mask.getValue() | arg.getValue());
        }
        return mask;
    }
}
