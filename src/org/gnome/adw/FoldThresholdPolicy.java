package org.gnome.adw;

/**
 * Determines when {@code Leaflet} will fold.
 */
public class FoldThresholdPolicy {

    /**
     * Folding is based on the minimum size
     */
    public static final FoldThresholdPolicy MINIMUM = new FoldThresholdPolicy(0);
    
    /**
     * Folding is based on the natural size
     */
    public static final FoldThresholdPolicy NATURAL = new FoldThresholdPolicy(1);
    
    private int value;
    
    public FoldThresholdPolicy(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(FoldThresholdPolicy[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
