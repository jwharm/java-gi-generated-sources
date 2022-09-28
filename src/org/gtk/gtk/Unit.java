package org.gtk.gtk;

/**
 * See also gtk_print_settings_set_paper_width().
 */
public class Unit extends io.github.jwharm.javagi.Enumeration {

    /**
     * No units.
     */
    public static final Unit NONE = new Unit(0);
    
    /**
     * Dimensions in points.
     */
    public static final Unit POINTS = new Unit(1);
    
    /**
     * Dimensions in inches.
     */
    public static final Unit INCH = new Unit(2);
    
    /**
     * Dimensions in millimeters
     */
    public static final Unit MM = new Unit(3);
    
    public Unit(int value) {
        super(value);
    }
    
}
