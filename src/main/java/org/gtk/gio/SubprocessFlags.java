package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags to define the behaviour of a {@link Subprocess}.
 * <p>
 * Note that the default for stdin is to redirect from {@code /dev/null}.  For
 * stdout and stderr the default are for them to inherit the
 * corresponding descriptor from the calling process.
 * <p>
 * Note that it is a programmer error to mix 'incompatible' flags.  For
 * example, you may not request both {@link SubprocessFlags#STDOUT_PIPE} and
 * {@link SubprocessFlags#STDOUT_SILENCE}.
 * @version 2.40
 */
public class SubprocessFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GSubprocessFlags";
    
    /**
     * No flags.
     */
    public static final SubprocessFlags NONE = new SubprocessFlags(0);
    
    /**
     * create a pipe for the stdin of the
     *   spawned process that can be accessed with
     *   g_subprocess_get_stdin_pipe().
     */
    public static final SubprocessFlags STDIN_PIPE = new SubprocessFlags(1);
    
    /**
     * stdin is inherited from the
     *   calling process.
     */
    public static final SubprocessFlags STDIN_INHERIT = new SubprocessFlags(2);
    
    /**
     * create a pipe for the stdout of the
     *   spawned process that can be accessed with
     *   g_subprocess_get_stdout_pipe().
     */
    public static final SubprocessFlags STDOUT_PIPE = new SubprocessFlags(4);
    
    /**
     * silence the stdout of the spawned
     *   process (ie: redirect to {@code /dev/null}).
     */
    public static final SubprocessFlags STDOUT_SILENCE = new SubprocessFlags(8);
    
    /**
     * create a pipe for the stderr of the
     *   spawned process that can be accessed with
     *   g_subprocess_get_stderr_pipe().
     */
    public static final SubprocessFlags STDERR_PIPE = new SubprocessFlags(16);
    
    /**
     * silence the stderr of the spawned
     *   process (ie: redirect to {@code /dev/null}).
     */
    public static final SubprocessFlags STDERR_SILENCE = new SubprocessFlags(32);
    
    /**
     * merge the stderr of the spawned
     *   process with whatever the stdout happens to be.  This is a good way
     *   of directing both streams to a common log file, for example.
     */
    public static final SubprocessFlags STDERR_MERGE = new SubprocessFlags(64);
    
    /**
     * spawned processes will inherit the
     *   file descriptors of their parent, unless those descriptors have
     *   been explicitly marked as close-on-exec.  This flag has no effect
     *   over the "standard" file descriptors (stdin, stdout, stderr).
     */
    public static final SubprocessFlags INHERIT_FDS = new SubprocessFlags(128);
    
    /**
     * if path searching is
     *   needed when spawning the subprocess, use the {@code PATH} in the launcher
     *   environment. (Since: 2.72)
     */
    public static final SubprocessFlags SEARCH_PATH_FROM_ENVP = new SubprocessFlags(256);
    
    /**
     * Create a new SubprocessFlags with the provided value
     */
    public SubprocessFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public SubprocessFlags or(SubprocessFlags... masks) {
        int value = this.getValue();
        for (SubprocessFlags arg : masks) {
            value |= arg.getValue();
        }
        return new SubprocessFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static SubprocessFlags combined(SubprocessFlags mask, SubprocessFlags... masks) {
        int value = mask.getValue();
        for (SubprocessFlags arg : masks) {
            value |= arg.getValue();
        }
        return new SubprocessFlags(value);
    }
}
