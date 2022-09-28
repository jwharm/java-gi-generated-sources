package org.cairographics;

public class LineJoin {

    public static final LineJoin MITER = new LineJoin(0);
    
    public static final LineJoin ROUND = new LineJoin(1);
    
    public static final LineJoin BEVEL = new LineJoin(2);
    
    private int value;
    
    public LineJoin(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(LineJoin[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
