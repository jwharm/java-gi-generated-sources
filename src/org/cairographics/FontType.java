package org.cairographics;

public class FontType {

    public static final FontType TOY = new FontType(0);
    
    public static final FontType FT = new FontType(1);
    
    public static final FontType WIN32 = new FontType(2);
    
    public static final FontType QUARTZ = new FontType(3);
    
    public static final FontType USER = new FontType(4);
    
    private int value;
    
    public FontType(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(FontType[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
