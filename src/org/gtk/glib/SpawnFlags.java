package org.gtk.glib;

/**
 * Flags passed to g_spawn_sync(), g_spawn_async() and g_spawn_async_with_pipes().
 */
public class SpawnFlags {

    /**
     * no flags, default behaviour
     */
    public static final int DEFAULT = 0;
    
    /**
     * the parent's open file descriptors will
     *     be inherited by the child; otherwise all descriptors except stdin,
     *     stdout and stderr will be closed before calling exec() in the child.
     */
    public static final int LEAVE_DESCRIPTORS_OPEN = 1;
    
    /**
     * the child will not be automatically reaped;
     *     you must use g_child_watch_add() yourself (or call waitpid() or handle
     *     `SIGCHLD` yourself), or the child will become a zombie.
     */
    public static final int DO_NOT_REAP_CHILD = 2;
    
    /**
     * `argv[0]` need not be an absolute path, it will be
     *     looked for in the user's `PATH`.
     */
    public static final int SEARCH_PATH = 4;
    
    /**
     * the child's standard output will be discarded,
     *     instead of going to the same location as the parent's standard output.
     */
    public static final int STDOUT_TO_DEV_NULL = 8;
    
    /**
     * the child's standard error will be discarded.
     */
    public static final int STDERR_TO_DEV_NULL = 16;
    
    /**
     * the child will inherit the parent's standard
     *     input (by default, the child's standard input is attached to `/dev/null`).
     */
    public static final int CHILD_INHERITS_STDIN = 32;
    
    /**
     * the first element of `argv` is the file to
     *     execute, while the remaining elements are the actual argument vector
     *     to pass to the file. Normally g_spawn_async_with_pipes() uses `argv[0]`
     *     as the file to execute, and passes all of `argv` to the child.
     */
    public static final int FILE_AND_ARGV_ZERO = 64;
    
    /**
     * if `argv[0]` is not an absolute path,
     *     it will be looked for in the `PATH` from the passed child environment.
     *     Since: 2.34
     */
    public static final int SEARCH_PATH_FROM_ENVP = 128;
    
    /**
     * create all pipes with the `O_CLOEXEC` flag set.
     *     Since: 2.40
     */
    public static final int CLOEXEC_PIPES = 256;
    
}
