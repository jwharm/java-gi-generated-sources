package org.gtk.glib;

/**
 * Flags to pass to g_test_trap_subprocess() to control input and output.
 * <p>
 * Note that in contrast with g_test_trap_fork(), the default is to
 * not show stdout and stderr.
 */
public class TestSubprocessFlags extends io.github.jwharm.javagi.Bitfield {

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
    
    public TestSubprocessFlags(int value) {
        super(value);
    }
    
}