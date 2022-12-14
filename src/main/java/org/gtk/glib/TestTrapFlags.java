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
     * Default behaviour. Since: 2.74
     */
    public static final TestTrapFlags DEFAULT = new TestTrapFlags(0);
    
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
    
    /**
     * Create a new TestTrapFlags with the provided value
     */
    public TestTrapFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public TestTrapFlags or(TestTrapFlags... masks) {
        int value = this.getValue();
        for (TestTrapFlags arg : masks) {
            value |= arg.getValue();
        }
        return new TestTrapFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static TestTrapFlags combined(TestTrapFlags mask, TestTrapFlags... masks) {
        int value = mask.getValue();
        for (TestTrapFlags arg : masks) {
            value |= arg.getValue();
        }
        return new TestTrapFlags(value);
    }
}
