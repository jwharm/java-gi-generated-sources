package org.gtk.gtk;

/**
 * Describes a widget state.
 * 
 * Widget states are used to match the widget against CSS pseudo-classes.
 * Note that GTK extends the regular CSS classes and sometimes uses
 * different names.
 */
public class StateFlags {

    /**
     * State during normal operation
     */
    public static final int NORMAL = 0;
    
    /**
     * Widget is active
     */
    public static final int ACTIVE = 1;
    
    /**
     * Widget has a mouse pointer over it
     */
    public static final int PRELIGHT = 2;
    
    /**
     * Widget is selected
     */
    public static final int SELECTED = 4;
    
    /**
     * Widget is insensitive
     */
    public static final int INSENSITIVE = 8;
    
    /**
     * Widget is inconsistent
     */
    public static final int INCONSISTENT = 16;
    
    /**
     * Widget has the keyboard focus
     */
    public static final int FOCUSED = 32;
    
    /**
     * Widget is in a background toplevel window
     */
    public static final int BACKDROP = 64;
    
    /**
     * Widget is in left-to-right text direction
     */
    public static final int DIR_LTR = 128;
    
    /**
     * Widget is in right-to-left text direction
     */
    public static final int DIR_RTL = 256;
    
    /**
     * Widget is a link
     */
    public static final int LINK = 512;
    
    /**
     * The location the widget points to has already been visited
     */
    public static final int VISITED = 1024;
    
    /**
     * Widget is checked
     */
    public static final int CHECKED = 2048;
    
    /**
     * Widget is highlighted as a drop target for DND
     */
    public static final int DROP_ACTIVE = 4096;
    
    /**
     * Widget has the visible focus
     */
    public static final int FOCUS_VISIBLE = 8192;
    
    /**
     * Widget contains the keyboard focus
     */
    public static final int FOCUS_WITHIN = 16384;
    
}
