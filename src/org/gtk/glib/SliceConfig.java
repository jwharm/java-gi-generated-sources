package org.gtk.glib;

public class SliceConfig {

    public static final SliceConfig ALWAYS_MALLOC = new SliceConfig(1);
    
    public static final SliceConfig BYPASS_MAGAZINES = new SliceConfig(2);
    
    public static final SliceConfig WORKING_SET_MSECS = new SliceConfig(3);
    
    public static final SliceConfig COLOR_INCREMENT = new SliceConfig(4);
    
    public static final SliceConfig CHUNK_SIZES = new SliceConfig(5);
    
    public static final SliceConfig CONTENTION_COUNTER = new SliceConfig(6);
    
    private int value;
    
    public SliceConfig(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(SliceConfig[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
