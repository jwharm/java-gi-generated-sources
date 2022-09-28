package org.cairographics;

public class Format {

    public static final Format INVALID = new Format(-1);
    
    public static final Format ARGB32 = new Format(0);
    
    public static final Format RGB24 = new Format(1);
    
    public static final Format A8 = new Format(2);
    
    public static final Format A1 = new Format(3);
    
    public static final Format RGB16_565 = new Format(4);
    
    public static final Format RGB30 = new Format(5);
    
    private int value;
    
    public Format(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(Format[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
