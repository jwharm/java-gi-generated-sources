package org.cairographics;

public class Extend {

    public static final Extend NONE = new Extend(0);
    
    public static final Extend REPEAT = new Extend(1);
    
    public static final Extend REFLECT = new Extend(2);
    
    public static final Extend PAD = new Extend(3);
    
    private int value;
    
    public Extend(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(Extend[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
