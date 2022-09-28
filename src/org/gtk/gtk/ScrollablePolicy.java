package org.gtk.gtk;

/**
 * Defines the policy to be used in a scrollable widget when updating
 * the scrolled window adjustments in a given orientation.
 */
public class ScrollablePolicy {

    /**
     * Scrollable adjustments are based on the minimum size
     */
    public static final ScrollablePolicy MINIMUM = new ScrollablePolicy(0);
    
    /**
     * Scrollable adjustments are based on the natural size
     */
    public static final ScrollablePolicy NATURAL = new ScrollablePolicy(1);
    
    private int value;
    
    public ScrollablePolicy(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(ScrollablePolicy[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
