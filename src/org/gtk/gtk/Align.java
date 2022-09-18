package org.gtk.gtk;

/**
 * Controls how a widget deals with extra space in a single dimension.
 * 
 * Alignment only matters if the widget receives a &<code>#8220</code> too large&<code>#8221</code>  allocation,
 * for example if you packed the widget with the {@link [property@Gtk.Widget:hexpand] (ref=property)}
 * property inside a {@link [class@Box]}, then the widget might get extra space.
 * If you have for example a 16x16 icon inside a 32x32 space, the icon
 * could be scaled and stretched, it could be centered, or it could be
 * positioned to one side of the space.
 * 
 * Note that in horizontal context {@link org.gtk.gtk.Align<code>#START</code>  and {@link org.gtk.gtk.Align<code>#END</code>  are interpreted relative to text direction.
 * 
 * {@link org.gtk.gtk.Align<code>#BASELINE</code>  support is optional for containers and widgets, and
 * it is only supported for vertical alignment.  When it&<code>#39</code> s not supported by
 * a child or a container it is treated as {@link org.gtk.gtk.Align<code>#FILL</code>
 */
public enum Align {

    /**
     * stretch to fill all space if possible, center if
     *   no meaningful way to stretch
     */
    FILL,
    
    /**
     * snap to left or top side, leaving space on right or bottom
     */
    START,
    
    /**
     * snap to right or bottom side, leaving space on left or top
     */
    END,
    
    /**
     * center natural width of widget inside the allocation
     */
    CENTER,
    
    /**
     * align the widget according to the baseline.
     *   See {@link org.gtk.gtk.Widget}.
     */
    BASELINE;
    
    public static Align fromValue(int value) {
        return switch(value) {
            case 0 -> FILL;
            case 1 -> START;
            case 2 -> END;
            case 3 -> CENTER;
            case 4 -> BASELINE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case FILL -> 0;
            case START -> 1;
            case END -> 2;
            case CENTER -> 3;
            case BASELINE -> 4;
        };
    }

}
