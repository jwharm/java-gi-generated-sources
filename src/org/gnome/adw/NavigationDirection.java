package org.gnome.adw;

/**
 * Describes the direction of a swipe navigation gesture.
 */
public class NavigationDirection {

    /**
     * Corresponds to start or top, depending on orientation and text direction
     */
    public static final NavigationDirection BACK = new NavigationDirection(0);
    
    /**
     * Corresponds to end or bottom, depending on orientation and text direction
     */
    public static final NavigationDirection FORWARD = new NavigationDirection(1);
    
    private int value;
    
    public NavigationDirection(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(NavigationDirection[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
