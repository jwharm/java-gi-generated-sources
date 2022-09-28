package org.gtk.gdk;

public class TitlebarGesture {

    public static final TitlebarGesture DOUBLE_CLICK = new TitlebarGesture(1);
    
    public static final TitlebarGesture RIGHT_CLICK = new TitlebarGesture(2);
    
    public static final TitlebarGesture MIDDLE_CLICK = new TitlebarGesture(3);
    
    private int value;
    
    public TitlebarGesture(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(TitlebarGesture[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
