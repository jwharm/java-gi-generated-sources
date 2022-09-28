package org.cairographics;

public class RegionOverlap {

    public static final RegionOverlap IN = new RegionOverlap(0);
    
    public static final RegionOverlap OUT = new RegionOverlap(1);
    
    public static final RegionOverlap PART = new RegionOverlap(2);
    
    private int value;
    
    public RegionOverlap(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(RegionOverlap[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
