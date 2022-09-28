package org.pango;

/**
 * The {@code PangoOverline} enumeration is used to specify whether text
 * should be overlined, and if so, the type of line.
 */
public class Overline extends io.github.jwharm.javagi.Enumeration {

    /**
     * no overline should be drawn
     */
    public static final Overline NONE = new Overline(0);
    
    /**
     * Draw a single line above the ink
     *   extents of the text being underlined.
     */
    public static final Overline SINGLE = new Overline(1);
    
    public Overline(int value) {
        super(value);
    }
    
}
