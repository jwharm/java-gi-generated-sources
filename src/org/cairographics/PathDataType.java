package org.cairographics;

public class PathDataType {

    public static final PathDataType MOVE_TO = new PathDataType(0);
    
    public static final PathDataType LINE_TO = new PathDataType(1);
    
    public static final PathDataType CURVE_TO = new PathDataType(2);
    
    public static final PathDataType CLOSE_PATH = new PathDataType(3);
    
    private int value;
    
    public PathDataType(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(PathDataType[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
