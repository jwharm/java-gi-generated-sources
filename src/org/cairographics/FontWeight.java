package org.cairographics;

public class FontWeight {

    public static final FontWeight NORMAL = new FontWeight(0);
    
    public static final FontWeight BOLD = new FontWeight(1);
    
    private int value;
    
    public FontWeight(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(FontWeight[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
