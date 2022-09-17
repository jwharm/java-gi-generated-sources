package org.gtk.glib;

/**
 * Test traps are guards around forked tests.
 * These flags determine what traps to set.
 */
public class TestTrapFlags {

    /**
     * Redirect stdout of the test child to
     *     <code>/dev/null</code> so it cannot be observed on the console during test
     *     runs. The actual output is still captured though to allow later
     *     tests with g_test_trap_assert_stdout().
     */
    public static final int SILENCE_STDOUT = 128;
    
    /**
     * Redirect stderr of the test child to
     *     <code>/dev/null</code> so it cannot be observed on the console during test
     *     runs. The actual output is still captured though to allow later
     *     tests with g_test_trap_assert_stderr().
     */
    public static final int SILENCE_STDERR = 256;
    
    /**
     * If this flag is given, stdin of the
     *     child process is shared with stdin of its parent process.
     *     It is redirected to <code>/dev/null</code> otherwise.
     */
    public static final int INHERIT_STDIN = 512;
    
}
