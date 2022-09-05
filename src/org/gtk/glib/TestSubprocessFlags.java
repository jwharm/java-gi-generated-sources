package org.gtk.glib;

/**
 * Flags to pass to g_test_trap_subprocess() to control input and output.
 * 
 * Note that in contrast with g_test_trap_fork(), the default is to
 * not show stdout and stderr.
 */
public class TestSubprocessFlags {

    /**
     * If this flag is given, the child
     *     process will inherit the parent's stdin. Otherwise, the child's
     *     stdin is redirected to `/dev/null`.
     */
    public static final int STDIN = 1;
    
    /**
     * If this flag is given, the child
     *     process will inherit the parent's stdout. Otherwise, the child's
     *     stdout will not be visible, but it will be captured to allow
     *     later tests with g_test_trap_assert_stdout().
     */
    public static final int STDOUT = 2;
    
    /**
     * If this flag is given, the child
     *     process will inherit the parent's stderr. Otherwise, the child's
     *     stderr will not be visible, but it will be captured to allow
     *     later tests with g_test_trap_assert_stderr().
     */
    public static final int STDERR = 4;
    
}
