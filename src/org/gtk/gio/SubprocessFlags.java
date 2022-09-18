package org.gtk.gio;

/**
 * Flags to define the behaviour of a {@link org.gtk.gio.Subprocess} 
 * <p>
 * Note that the default for stdin is to redirect from <code>/dev/null</code>.  For
 * stdout and stderr the default are for them to inherit the
 * corresponding descriptor from the calling process.
 * 
 * Note that it is a programmer error to mix &<code>#39</code> incompatible&<code>#39</code>  flags.  For
 * example, you may not request both {@link org.gtk.gio.SubprocessFlags<code>#STDOUT_PIPE</code>  and
 * {@link org.gtk.gio.SubprocessFlags<code>#STDOUT_SILENCE</code>
 */
public class SubprocessFlags {

    /**
     * No flags.
     */
    public static final int NONE = 0;
    
    /**
     * create a pipe for the stdin of the
     *   spawned process that can be accessed with
     *   g_subprocess_get_stdin_pipe().
     */
    public static final int STDIN_PIPE = 1;
    
    /**
     * stdin is inherited from the
     *   calling process.
     */
    public static final int STDIN_INHERIT = 2;
    
    /**
     * create a pipe for the stdout of the
     *   spawned process that can be accessed with
     *   g_subprocess_get_stdout_pipe().
     */
    public static final int STDOUT_PIPE = 4;
    
    /**
     * silence the stdout of the spawned
     *   process (ie: redirect to <code>/dev/null</code>).
     */
    public static final int STDOUT_SILENCE = 8;
    
    /**
     * create a pipe for the stderr of the
     *   spawned process that can be accessed with
     *   g_subprocess_get_stderr_pipe().
     */
    public static final int STDERR_PIPE = 16;
    
    /**
     * silence the stderr of the spawned
     *   process (ie: redirect to <code>/dev/null</code>).
     */
    public static final int STDERR_SILENCE = 32;
    
    /**
     * merge the stderr of the spawned
     *   process with whatever the stdout happens to be.  This is a good way
     *   of directing both streams to a common log file, for example.
     */
    public static final int STDERR_MERGE = 64;
    
    /**
     * spawned processes will inherit the
     *   file descriptors of their parent, unless those descriptors have
     *   been explicitly marked as close-on-exec.  This flag has no effect
     *   over the &<code>#34</code> standard&<code>#34</code>  file descriptors (stdin, stdout, stderr).
     */
    public static final int INHERIT_FDS = 128;
    
    /**
     * if path searching is
     *   needed when spawning the subprocess, use the <code>PATH</code> in the launcher
     *   environment. (Since: 2.72)
     */
    public static final int SEARCH_PATH_FROM_ENVP = 256;
    
}
