package org.cairographics;

public class Content {

    public static final Content COLOR = new Content(4096);
    
    public static final Content ALPHA = new Content(8192);
    
    public static final Content COLOR_ALPHA = new Content(12288);
    
    private int value;
    
    public Content(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(Content[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
