package org.cairographics;

public class FillRule {

    public static final FillRule WINDING = new FillRule(0);
    
    public static final FillRule EVEN_ODD = new FillRule(1);
    
    private int value;
    
    public FillRule(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(FillRule[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
