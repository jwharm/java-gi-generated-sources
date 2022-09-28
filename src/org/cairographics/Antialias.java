package org.cairographics;

public class Antialias {

    public static final Antialias DEFAULT = new Antialias(0);
    
    public static final Antialias NONE = new Antialias(1);
    
    public static final Antialias GRAY = new Antialias(2);
    
    public static final Antialias SUBPIXEL = new Antialias(3);
    
    public static final Antialias FAST = new Antialias(4);
    
    public static final Antialias GOOD = new Antialias(5);
    
    public static final Antialias BEST = new Antialias(6);
    
    private int value;
    
    public Antialias(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(Antialias[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
