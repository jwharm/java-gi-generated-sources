package org.cairographics;

public class HintStyle {

    public static final HintStyle DEFAULT = new HintStyle(0);
    
    public static final HintStyle NONE = new HintStyle(1);
    
    public static final HintStyle SLIGHT = new HintStyle(2);
    
    public static final HintStyle MEDIUM = new HintStyle(3);
    
    public static final HintStyle FULL = new HintStyle(4);
    
    private int value;
    
    public HintStyle(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(HintStyle[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
