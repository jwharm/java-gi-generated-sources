package org.cairographics;

public class Filter {

    public static final Filter FAST = new Filter(0);
    
    public static final Filter GOOD = new Filter(1);
    
    public static final Filter BEST = new Filter(2);
    
    public static final Filter NEAREST = new Filter(3);
    
    public static final Filter BILINEAR = new Filter(4);
    
    public static final Filter GAUSSIAN = new Filter(5);
    
    private int value;
    
    public Filter(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(Filter[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
