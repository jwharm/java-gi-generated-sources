package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Test traps are guards around forked tests.
 * These flags determine what traps to set.
 */
public class TestTrapFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GTestTrapFlags";
    
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
    
    public TestTrapFlags(int value) {
        super(value);
    }
}
