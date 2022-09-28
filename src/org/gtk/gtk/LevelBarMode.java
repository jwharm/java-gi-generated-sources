package org.gtk.gtk;

/**
 * Describes how {@link LevelBar} contents should be rendered.
 * <p>
 * Note that this enumeration could be extended with additional modes
 * in the future.
 */
public class LevelBarMode {

    /**
     * the bar has a continuous mode
     */
    public static final LevelBarMode CONTINUOUS = new LevelBarMode(0);
    
    /**
     * the bar has a discrete mode
     */
    public static final LevelBarMode DISCRETE = new LevelBarMode(1);
    
    private int value;
    
    public LevelBarMode(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(LevelBarMode[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
