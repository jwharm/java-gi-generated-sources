package org.gnome.adw;

/**
 * Describes the adaptive modes of {@link ViewSwitcher}.
 */
public class ViewSwitcherPolicy {

    /**
     * Force the narrow mode
     */
    public static final ViewSwitcherPolicy NARROW = new ViewSwitcherPolicy(0);
    
    /**
     * Force the wide mode
     */
    public static final ViewSwitcherPolicy WIDE = new ViewSwitcherPolicy(1);
    
    private int value;
    
    public ViewSwitcherPolicy(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(ViewSwitcherPolicy[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
