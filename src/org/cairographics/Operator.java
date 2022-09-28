package org.cairographics;

public class Operator {

    public static final Operator CLEAR = new Operator(0);
    
    public static final Operator SOURCE = new Operator(1);
    
    public static final Operator OVER = new Operator(2);
    
    public static final Operator IN = new Operator(3);
    
    public static final Operator OUT = new Operator(4);
    
    public static final Operator ATOP = new Operator(5);
    
    public static final Operator DEST = new Operator(6);
    
    public static final Operator DEST_OVER = new Operator(7);
    
    public static final Operator DEST_IN = new Operator(8);
    
    public static final Operator DEST_OUT = new Operator(9);
    
    public static final Operator DEST_ATOP = new Operator(10);
    
    public static final Operator XOR = new Operator(11);
    
    public static final Operator ADD = new Operator(12);
    
    public static final Operator SATURATE = new Operator(13);
    
    public static final Operator MULTIPLY = new Operator(14);
    
    public static final Operator SCREEN = new Operator(15);
    
    public static final Operator OVERLAY = new Operator(16);
    
    public static final Operator DARKEN = new Operator(17);
    
    public static final Operator LIGHTEN = new Operator(18);
    
    public static final Operator COLOR_DODGE = new Operator(19);
    
    public static final Operator COLOR_BURN = new Operator(20);
    
    public static final Operator HARD_LIGHT = new Operator(21);
    
    public static final Operator SOFT_LIGHT = new Operator(22);
    
    public static final Operator DIFFERENCE = new Operator(23);
    
    public static final Operator EXCLUSION = new Operator(24);
    
    public static final Operator HSL_HUE = new Operator(25);
    
    public static final Operator HSL_SATURATION = new Operator(26);
    
    public static final Operator HSL_COLOR = new Operator(27);
    
    public static final Operator HSL_LUMINOSITY = new Operator(28);
    
    private int value;
    
    public Operator(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(Operator[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
