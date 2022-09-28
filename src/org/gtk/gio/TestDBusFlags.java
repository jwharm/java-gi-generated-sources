package org.gtk.gio;

/**
 * Flags to define future {@link TestDBus} behaviour.
 */
public class TestDBusFlags {

    /**
     * No flags.
     */
    public static final TestDBusFlags NONE = new TestDBusFlags(0);
    
    private int value;
    
    public TestDBusFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(TestDBusFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public TestDBusFlags combined(TestDBusFlags mask) {
        return new TestDBusFlags(this.getValue() | mask.getValue());
    }
    
    public static TestDBusFlags combined(TestDBusFlags mask, TestDBusFlags... masks) {
        int value = mask.getValue();
        for (TestDBusFlags arg : masks) {
            value |= arg.getValue();
        }
        return new TestDBusFlags(value);
    }
    
}
