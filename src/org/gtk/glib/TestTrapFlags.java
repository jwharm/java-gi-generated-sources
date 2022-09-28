package org.gtk.glib;

/**
 * Test traps are guards around forked tests.
 * These flags determine what traps to set.
 */
public class TestTrapFlags {

    /**
     * Redirect stdout of the test child to
     *     {@code /dev/null} so it cannot be observed on the console during test
     *     runs. The actual output is still captured though to allow later
     *     tests with g_test_trap_assert_stdout().
     */
    public static final TestTrapFlags SILENCE_STDOUT = new TestTrapFlags(128);
    
    /**
     * Redirect stderr of the test child to
     *     {@code /dev/null} so it cannot be observed on the console during test
     *     runs. The actual output is still captured though to allow later
     *     tests with g_test_trap_assert_stderr().
     */
    public static final TestTrapFlags SILENCE_STDERR = new TestTrapFlags(256);
    
    /**
     * If this flag is given, stdin of the
     *     child process is shared with stdin of its parent process.
     *     It is redirected to {@code /dev/null} otherwise.
     */
    public static final TestTrapFlags INHERIT_STDIN = new TestTrapFlags(512);
    
    private int value;
    
    public TestTrapFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(TestTrapFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public TestTrapFlags combined(TestTrapFlags mask) {
        return new TestTrapFlags(this.getValue() | mask.getValue());
    }
    
    public static TestTrapFlags combined(TestTrapFlags mask, TestTrapFlags... masks) {
        int value = mask.getValue();
        for (TestTrapFlags arg : masks) {
            value |= arg.getValue();
        }
        return new TestTrapFlags(value);
    }
    
}
