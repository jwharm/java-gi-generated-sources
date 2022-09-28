package org.gtk.gtk;

/**
 * Controls how a widget deals with extra space in a single dimension.
 * <p>
 * Alignment only matters if the widget receives a “too large” allocation,
 * for example if you packed the widget with the {@code Gtk.Widget:hexpand}
 * property inside a {@link Box}, then the widget might get extra space.
 * If you have for example a 16x16 icon inside a 32x32 space, the icon
 * could be scaled and stretched, it could be centered, or it could be
 * positioned to one side of the space.
 * <p>
 * Note that in horizontal context {@link Align#START} and {@link Align#END}
 * are interpreted relative to text direction.
 * <p>
 * {@link Align#BASELINE} support is optional for containers and widgets, and
 * it is only supported for vertical alignment.  When it's not supported by
 * a child or a container it is treated as {@link Align#FILL}.
 */
public class Align extends io.github.jwharm.javagi.Enumeration {

    /**
     * stretch to fill all space if possible, center if
     *   no meaningful way to stretch
     */
    public static final Align FILL = new Align(0);
    
    /**
     * snap to left or top side, leaving space on right or bottom
     */
    public static final Align START = new Align(1);
    
    /**
     * snap to right or bottom side, leaving space on left or top
     */
    public static final Align END = new Align(2);
    
    /**
     * center natural width of widget inside the allocation
     */
    public static final Align CENTER = new Align(3);
    
    /**
     * align the widget according to the baseline.
     *   See {@link Widget}.
     */
    public static final Align BASELINE = new Align(4);
    
    public Align(int value) {
        super(value);
    }
    
}
