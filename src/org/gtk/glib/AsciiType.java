package org.gtk.glib;

public class AsciiType {

    public static final AsciiType ALNUM = new AsciiType(1);
    
    public static final AsciiType ALPHA = new AsciiType(2);
    
    public static final AsciiType CNTRL = new AsciiType(4);
    
    public static final AsciiType DIGIT = new AsciiType(8);
    
    public static final AsciiType GRAPH = new AsciiType(16);
    
    public static final AsciiType LOWER = new AsciiType(32);
    
    public static final AsciiType PRINT = new AsciiType(64);
    
    public static final AsciiType PUNCT = new AsciiType(128);
    
    public static final AsciiType SPACE = new AsciiType(256);
    
    public static final AsciiType UPPER = new AsciiType(512);
    
    public static final AsciiType XDIGIT = new AsciiType(1024);
    
    private int value;
    
    public AsciiType(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(AsciiType[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public AsciiType combined(AsciiType mask) {
        return new AsciiType(this.getValue() | mask.getValue());
    }
    
    public static AsciiType combined(AsciiType mask, AsciiType... masks) {
        int value = mask.getValue();
        for (AsciiType arg : masks) {
            value |= arg.getValue();
        }
        return new AsciiType(value);
    }
    
}
