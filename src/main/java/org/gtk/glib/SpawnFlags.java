package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags passed to g_spawn_sync(), g_spawn_async() and g_spawn_async_with_pipes().
 */
public class SpawnFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GSpawnFlags";
    
    /**
     * no flags, default behaviour
     */
    public static final SpawnFlags DEFAULT = new SpawnFlags(0);
    
    /**
     * the parent's open file descriptors will
     *     be inherited by the child; otherwise all descriptors except stdin,
     *     stdout and stderr will be closed before calling exec() in the child.
     */
    public static final SpawnFlags LEAVE_DESCRIPTORS_OPEN = new SpawnFlags(1);
    
    /**
     * the child will not be automatically reaped;
     *     you must use g_child_watch_add() yourself (or call waitpid() or handle
     *     {@code SIGCHLD} yourself), or the child will become a zombie.
     */
    public static final SpawnFlags DO_NOT_REAP_CHILD = new SpawnFlags(2);
    
    /**
     * {@code argv[0]} need not be an absolute path, it will be
     *     looked for in the user's {@code PATH}.
     */
    public static final SpawnFlags SEARCH_PATH = new SpawnFlags(4);
    
    /**
     * the child's standard output will be discarded,
     *     instead of going to the same location as the parent's standard output.
     */
    public static final SpawnFlags STDOUT_TO_DEV_NULL = new SpawnFlags(8);
    
    /**
     * the child's standard error will be discarded.
     */
    public static final SpawnFlags STDERR_TO_DEV_NULL = new SpawnFlags(16);
    
    /**
     * the child will inherit the parent's standard
     *     input (by default, the child's standard input is attached to {@code /dev/null}).
     */
    public static final SpawnFlags CHILD_INHERITS_STDIN = new SpawnFlags(32);
    
    /**
     * the first element of {@code argv} is the file to
     *     execute, while the remaining elements are the actual argument vector
     *     to pass to the file. Normally g_spawn_async_with_pipes() uses {@code argv[0]}
     *     as the file to execute, and passes all of {@code argv} to the child.
     */
    public static final SpawnFlags FILE_AND_ARGV_ZERO = new SpawnFlags(64);
    
    /**
     * if {@code argv[0]} is not an absolute path,
     *     it will be looked for in the {@code PATH} from the passed child environment.
     *     Since: 2.34
     */
    public static final SpawnFlags SEARCH_PATH_FROM_ENVP = new SpawnFlags(128);
    
    /**
     * create all pipes with the {@code O_CLOEXEC} flag set.
     *     Since: 2.40
     */
    public static final SpawnFlags CLOEXEC_PIPES = new SpawnFlags(256);
    
    /**
     * The child will inherit the parent's standard output.
     */
    public static final SpawnFlags CHILD_INHERITS_STDOUT = new SpawnFlags(512);
    
    /**
     * The child will inherit the parent's standard error.
     */
    public static final SpawnFlags CHILD_INHERITS_STDERR = new SpawnFlags(1024);
    
    /**
     * The child's standard input is attached to {@code /dev/null}.
     */
    public static final SpawnFlags STDIN_FROM_DEV_NULL = new SpawnFlags(2048);
    
    /**
     * Create a new SpawnFlags with the provided value
     */
    public SpawnFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public SpawnFlags or(SpawnFlags... masks) {
        int value = this.getValue();
        for (SpawnFlags arg : masks) {
            value |= arg.getValue();
        }
        return new SpawnFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static SpawnFlags combined(SpawnFlags mask, SpawnFlags... masks) {
        int value = mask.getValue();
        for (SpawnFlags arg : masks) {
            value |= arg.getValue();
        }
        return new SpawnFlags(value);
    }
}
