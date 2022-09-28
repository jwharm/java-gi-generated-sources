package org.cairographics;

public class PatternType {

    public static final PatternType SOLID = new PatternType(0);
    
    public static final PatternType SURFACE = new PatternType(1);
    
    public static final PatternType LINEAR = new PatternType(2);
    
    public static final PatternType RADIAL = new PatternType(3);
    
    public static final PatternType MESH = new PatternType(4);
    
    public static final PatternType RASTER_SOURCE = new PatternType(5);
    
    private int value;
    
    public PatternType(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(PatternType[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
