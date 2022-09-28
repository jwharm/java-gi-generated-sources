package org.gnome.adw;

/**
 * Describes title centering behavior of a {@link HeaderBar} widget.
 */
public class CenteringPolicy {

    /**
     * Keep the title centered when possible
     */
    public static final CenteringPolicy LOOSE = new CenteringPolicy(0);
    
    /**
     * Keep the title centered at all cost
     */
    public static final CenteringPolicy STRICT = new CenteringPolicy(1);
    
    private int value;
    
    public CenteringPolicy(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(CenteringPolicy[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
