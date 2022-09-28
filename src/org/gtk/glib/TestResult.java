package org.gtk.glib;

public class TestResult {

    public static final TestResult SUCCESS = new TestResult(0);
    
    public static final TestResult SKIPPED = new TestResult(1);
    
    public static final TestResult FAILURE = new TestResult(2);
    
    public static final TestResult INCOMPLETE = new TestResult(3);
    
    private int value;
    
    public TestResult(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(TestResult[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
