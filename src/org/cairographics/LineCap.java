package org.cairographics;

public class LineCap {

    public static final LineCap BUTT = new LineCap(0);
    
    public static final LineCap ROUND = new LineCap(1);
    
    public static final LineCap SQUARE = new LineCap(2);
    
    private int value;
    
    public LineCap(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(LineCap[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
