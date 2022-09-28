package org.cairographics;

public class SubpixelOrder {

    public static final SubpixelOrder DEFAULT = new SubpixelOrder(0);
    
    public static final SubpixelOrder RGB = new SubpixelOrder(1);
    
    public static final SubpixelOrder BGR = new SubpixelOrder(2);
    
    public static final SubpixelOrder VRGB = new SubpixelOrder(3);
    
    public static final SubpixelOrder VBGR = new SubpixelOrder(4);
    
    private int value;
    
    public SubpixelOrder(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(SubpixelOrder[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
