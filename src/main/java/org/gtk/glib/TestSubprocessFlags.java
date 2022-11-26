package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags to pass to g_test_trap_subprocess() to control input and output.
 * <p>
 * Note that in contrast with g_test_trap_fork(), the default is to
 * not show stdout and stderr.
 */
public class TestSubprocessFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GTestSubprocessFlags";
    
    /**
     * Default behaviour. Since: 2.74
     */
    public static final TestSubprocessFlags DEFAULT = new TestSubprocessFlags(0);
    
    /**
     * If this flag is given, the child
     *     process will inherit the parent's stdin. Otherwise, the child's
     *     stdin is redirected to {@code /dev/null}.
     */
    public static final TestSubprocessFlags INHERIT_STDIN = new TestSubprocessFlags(1);
    
    /**
     * If this flag is given, the child
     *     process will inherit the parent's stdout. Otherwise, the child's
     *     stdout will not be visible, but it will be captured to allow
     *     later tests with g_test_trap_assert_stdout().
     */
    public static final TestSubprocessFlags INHERIT_STDOUT = new TestSubprocessFlags(2);
    
    /**
     * If this flag is given, the child
     *     process will inherit the parent's stderr. Otherwise, the child's
     *     stderr will not be visible, but it will be captured to allow
     *     later tests with g_test_trap_assert_stderr().
     */
    public static final TestSubprocessFlags INHERIT_STDERR = new TestSubprocessFlags(4);
    
    public TestSubprocessFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public TestSubprocessFlags combined(TestSubprocessFlags mask) {
        this.setValue(this.getValue() | mask.getValue());
        return this;
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static TestSubprocessFlags combined(TestSubprocessFlags mask, TestSubprocessFlags... masks) {
        for (TestSubprocessFlags arg : masks) {
            mask.setValue(mask.getValue() | arg.getValue());
        }
        return mask;
    }
}
