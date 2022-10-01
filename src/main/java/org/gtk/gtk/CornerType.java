package org.gtk.gtk;

/**
 * Specifies which corner a child widget should be placed in when packed into
 * a {@code GtkScrolledWindow.}
 * <p>
 * This is effectively the opposite of where the scroll bars are placed.
 */
public class CornerType extends io.github.jwharm.javagi.Enumeration {

    /**
     * Place the scrollbars on the right and bottom of the
     *   widget (default behaviour).
     */
    public static final CornerType TOP_LEFT = new CornerType(0);
    
    /**
     * Place the scrollbars on the top and right of the
     *   widget.
     */
    public static final CornerType BOTTOM_LEFT = new CornerType(1);
    
    /**
     * Place the scrollbars on the left and bottom of the
     *   widget.
     */
    public static final CornerType TOP_RIGHT = new CornerType(2);
    
    /**
     * Place the scrollbars on the top and left of the
     *   widget.
     */
    public static final CornerType BOTTOM_RIGHT = new CornerType(3);
    
    public CornerType(int value) {
        super(value);
    }
    
}
