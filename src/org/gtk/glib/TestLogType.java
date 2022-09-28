package org.gtk.glib;

public class TestLogType {

    public static final TestLogType NONE = new TestLogType(0);
    
    public static final TestLogType ERROR = new TestLogType(1);
    
    public static final TestLogType START_BINARY = new TestLogType(2);
    
    public static final TestLogType LIST_CASE = new TestLogType(3);
    
    public static final TestLogType SKIP_CASE = new TestLogType(4);
    
    public static final TestLogType START_CASE = new TestLogType(5);
    
    public static final TestLogType STOP_CASE = new TestLogType(6);
    
    public static final TestLogType MIN_RESULT = new TestLogType(7);
    
    public static final TestLogType MAX_RESULT = new TestLogType(8);
    
    public static final TestLogType MESSAGE = new TestLogType(9);
    
    public static final TestLogType START_SUITE = new TestLogType(10);
    
    public static final TestLogType STOP_SUITE = new TestLogType(11);
    
    private int value;
    
    public TestLogType(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(TestLogType[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
