package org.harfbuzz;

/**
 * Data type for holding color values. Colors are eight bits per
 * channel RGB plus alpha transparency.
 */
public class ColorT {
    private int value;
    
    public ColorT(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(ColorT[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
