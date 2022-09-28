package org.gtk.glib;

/**
 * Flags to pass to g_test_trap_subprocess() to control input and output.
 * <p>
 * Note that in contrast with g_test_trap_fork(), the default is to
 * not show stdout and stderr.
 */
public class TestSubprocessFlags {

    /**
     * If this flag is given, the child
     *     process will inherit the parent's stdin. Otherwise, the child's
     *     stdin is redirected to {@code /dev/null}.
     */
    public static final TestSubprocessFlags STDIN = new TestSubprocessFlags(1);
    
    /**
     * If this flag is given, the child
     *     process will inherit the parent's stdout. Otherwise, the child's
     *     stdout will not be visible, but it will be captured to allow
     *     later tests with g_test_trap_assert_stdout().
     */
    public static final TestSubprocessFlags STDOUT = new TestSubprocessFlags(2);
    
    /**
     * If this flag is given, the child
     *     process will inherit the parent's stderr. Otherwise, the child's
     *     stderr will not be visible, but it will be captured to allow
     *     later tests with g_test_trap_assert_stderr().
     */
    public static final TestSubprocessFlags STDERR = new TestSubprocessFlags(4);
    
    private int value;
    
    public TestSubprocessFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(TestSubprocessFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public TestSubprocessFlags combined(TestSubprocessFlags mask) {
        return new TestSubprocessFlags(this.getValue() | mask.getValue());
    }
    
    public static TestSubprocessFlags combined(TestSubprocessFlags mask, TestSubprocessFlags... masks) {
        int value = mask.getValue();
        for (TestSubprocessFlags arg : masks) {
            value |= arg.getValue();
        }
        return new TestSubprocessFlags(value);
    }
    
}
