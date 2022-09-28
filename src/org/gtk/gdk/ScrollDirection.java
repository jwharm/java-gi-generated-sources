package org.gtk.gdk;

/**
 * Specifies the direction for scroll events.
 */
public class ScrollDirection {

    /**
     * the surface is scrolled up.
     */
    public static final ScrollDirection UP = new ScrollDirection(0);
    
    /**
     * the surface is scrolled down.
     */
    public static final ScrollDirection DOWN = new ScrollDirection(1);
    
    /**
     * the surface is scrolled to the left.
     */
    public static final ScrollDirection LEFT = new ScrollDirection(2);
    
    /**
     * the surface is scrolled to the right.
     */
    public static final ScrollDirection RIGHT = new ScrollDirection(3);
    
    /**
     * the scrolling is determined by the delta values
     *   in scroll events. See gdk_scroll_event_get_deltas()
     */
    public static final ScrollDirection SMOOTH = new ScrollDirection(4);
    
    private int value;
    
    public ScrollDirection(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(ScrollDirection[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
