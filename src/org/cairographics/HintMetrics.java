package org.cairographics;

public class HintMetrics {

    public static final HintMetrics DEFAULT = new HintMetrics(0);
    
    public static final HintMetrics OFF = new HintMetrics(1);
    
    public static final HintMetrics ON = new HintMetrics(2);
    
    private int value;
    
    public HintMetrics(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(HintMetrics[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
