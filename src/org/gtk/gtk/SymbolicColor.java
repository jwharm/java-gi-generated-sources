package org.gtk.gtk;

/**
 * The indexes of colors passed to symbolic color rendering, such as
 * {@link SymbolicPaintable#snapshotSymbolic}.
 * <p>
 * More values may be added over time.
 */
public class SymbolicColor {

    /**
     * The default foreground color
     */
    public static final SymbolicColor FOREGROUND = new SymbolicColor(0);
    
    /**
     * Indication color for errors
     */
    public static final SymbolicColor ERROR = new SymbolicColor(1);
    
    /**
     * Indication color for warnings
     */
    public static final SymbolicColor WARNING = new SymbolicColor(2);
    
    /**
     * Indication color for success
     */
    public static final SymbolicColor SUCCESS = new SymbolicColor(3);
    
    private int value;
    
    public SymbolicColor(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(SymbolicColor[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
