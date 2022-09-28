package org.cairographics;

public class FontSlant {

    public static final FontSlant NORMAL = new FontSlant(0);
    
    public static final FontSlant ITALIC = new FontSlant(1);
    
    public static final FontSlant OBLIQUE = new FontSlant(2);
    
    private int value;
    
    public FontSlant(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(FontSlant[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
