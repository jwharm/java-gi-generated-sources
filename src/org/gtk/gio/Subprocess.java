package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GSubprocess allows the creation of and interaction with child
 * processes.
 * 
 * Processes can be communicated with using standard GIO-style APIs (ie:
 * #GInputStream, #GOutputStream).  There are GIO-style APIs to wait for
 * process termination (ie: cancellable and with an asynchronous
 * variant).
 * 
 * There is an API to force a process to terminate, as well as a
 * race-free API for sending UNIX signals to a subprocess.
 * 
 * One major advantage that GIO brings over the core GLib library is
 * comprehensive API for asynchronous I/O, such
 * g_output_stream_splice_async().  This makes GSubprocess
 * significantly more powerful and flexible than equivalent APIs in
 * some other languages such as the `subprocess.py`
 * included with Python.  For example, using #GSubprocess one could
 * create two child processes, reading standard output from the first,
 * processing it, and writing to the input stream of the second, all
 * without blocking the main loop.
 * 
 * A powerful g_subprocess_communicate() API is provided similar to the
 * `communicate()` method of `subprocess.py`. This enables very easy
 * interaction with a subprocess that has been opened with pipes.
 * 
 * #GSubprocess defaults to tight control over the file descriptors open
 * in the child process, avoiding dangling-fd issues that are caused by
 * a simple fork()/exec().  The only open file descriptors in the
 * spawned process are ones that were explicitly specified by the
 * #GSubprocess API (unless %G_SUBPROCESS_FLAGS_INHERIT_FDS was
 * specified).
 * 
 * #GSubprocess will quickly reap all child processes as they exit,
 * avoiding "zombie processes" remaining around for long periods of
 * time.  g_subprocess_wait() can be used to wait for this to happen,
 * but it will happen even without the call being explicitly made.
 * 
 * As a matter of principle, #GSubprocess has no API that accepts
 * shell-style space-separated strings.  It will, however, match the
 * typical shell behaviour of searching the PATH for executables that do
 * not contain a directory separator in their name. By default, the `PATH`
 * of the current process is used.  You can specify
 * %G_SUBPROCESS_FLAGS_SEARCH_PATH_FROM_ENVP to use the `PATH` of the
 * launcher environment instead.
 * 
 * #GSubprocess attempts to have a very simple API for most uses (ie:
 * spawning a subprocess with arguments and support for most typical
 * kinds of input and output redirection).  See g_subprocess_new(). The
 * #GSubprocessLauncher API is provided for more complicated cases
 * (advanced types of redirection, environment variable manipulation,
 * change of working directory, child setup functions, etc).
 * 
 * A typical use of #GSubprocess will involve calling
 * g_subprocess_new(), followed by g_subprocess_wait_async() or
 * g_subprocess_wait().  After the process exits, the status can be
 * checked using functions such as g_subprocess_get_if_exited() (which
 * are similar to the familiar WIFEXITED-style POSIX macros).
 */
public class Subprocess extends org.gtk.gobject.Object implements Initable {

    public Subprocess(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to Subprocess */
    public static Subprocess castFrom(org.gtk.gobject.Object gobject) {
        return new Subprocess(gobject.getProxy());
    }
    
    /**
     * Communicate with the subprocess until it terminates, and all input
     * and output has been completed.
     * 
     * If @stdin_buf is given, the subprocess must have been created with
     * %G_SUBPROCESS_FLAGS_STDIN_PIPE.  The given data is fed to the
     * stdin of the subprocess and the pipe is closed (ie: EOF).
     * 
     * At the same time (as not to cause blocking when dealing with large
     * amounts of data), if %G_SUBPROCESS_FLAGS_STDOUT_PIPE or
     * %G_SUBPROCESS_FLAGS_STDERR_PIPE were used, reads from those
     * streams.  The data that was read is returned in @stdout and/or
     * the @stderr.
     * 
     * If the subprocess was created with %G_SUBPROCESS_FLAGS_STDOUT_PIPE,
     * @stdout_buf will contain the data read from stdout.  Otherwise, for
     * subprocesses not created with %G_SUBPROCESS_FLAGS_STDOUT_PIPE,
     * @stdout_buf will be set to %NULL.  Similar provisions apply to
     * @stderr_buf and %G_SUBPROCESS_FLAGS_STDERR_PIPE.
     * 
     * As usual, any output variable may be given as %NULL to ignore it.
     * 
     * If you desire the stdout and stderr data to be interleaved, create
     * the subprocess with %G_SUBPROCESS_FLAGS_STDOUT_PIPE and
     * %G_SUBPROCESS_FLAGS_STDERR_MERGE.  The merged result will be returned
     * in @stdout_buf and @stderr_buf will be set to %NULL.
     * 
     * In case of any error (including cancellation), %FALSE will be
     * returned with @error set.  Some or all of the stdin data may have
     * been written.  Any stdout or stderr data that has been read will be
     * discarded. None of the out variables (aside from @error) will have
     * been set to anything in particular and should not be inspected.
     * 
     * In the case that %TRUE is returned, the subprocess has exited and the
     * exit status inspection APIs (eg: g_subprocess_get_if_exited(),
     * g_subprocess_get_exit_status()) may be used.
     * 
     * You should not attempt to use any of the subprocess pipes after
     * starting this function, since they may be left in strange states,
     * even if the operation was cancelled.  You should especially not
     * attempt to interact with the pipes while the operation is in progress
     * (either from another thread or if using the asynchronous version).
     */
    public boolean communicate(org.gtk.glib.Bytes stdinBuf, Cancellable cancellable, org.gtk.glib.Bytes[] stdoutBuf, org.gtk.glib.Bytes[] stderrBuf) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_subprocess_communicate(HANDLE(), stdinBuf.HANDLE(), cancellable.HANDLE(), Interop.allocateNativeArray(stdoutBuf), Interop.allocateNativeArray(stderrBuf), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Complete an invocation of g_subprocess_communicate_async().
     */
    public boolean communicateFinish(AsyncResult result, org.gtk.glib.Bytes[] stdoutBuf, org.gtk.glib.Bytes[] stderrBuf) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_subprocess_communicate_finish(HANDLE(), result.HANDLE(), Interop.allocateNativeArray(stdoutBuf), Interop.allocateNativeArray(stderrBuf), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Like g_subprocess_communicate(), but validates the output of the
     * process as UTF-8, and returns it as a regular NUL terminated string.
     * 
     * On error, @stdout_buf and @stderr_buf will be set to undefined values and
     * should not be used.
     */
    public boolean communicateUtf8(java.lang.String stdinBuf, Cancellable cancellable, java.lang.String[] stdoutBuf, java.lang.String[] stderrBuf) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_subprocess_communicate_utf8(HANDLE(), Interop.getAllocator().allocateUtf8String(stdinBuf), cancellable.HANDLE(), Interop.allocateNativeArray(stdoutBuf), Interop.allocateNativeArray(stderrBuf), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Complete an invocation of g_subprocess_communicate_utf8_async().
     */
    public boolean communicateUtf8Finish(AsyncResult result, java.lang.String[] stdoutBuf, java.lang.String[] stderrBuf) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_subprocess_communicate_utf8_finish(HANDLE(), result.HANDLE(), Interop.allocateNativeArray(stdoutBuf), Interop.allocateNativeArray(stderrBuf), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Use an operating-system specific method to attempt an immediate,
     * forceful termination of the process.  There is no mechanism to
     * determine whether or not the request itself was successful;
     * however, you can use g_subprocess_wait() to monitor the status of
     * the process after calling this function.
     * 
     * On Unix, this function sends %SIGKILL.
     */
    public void forceExit() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_subprocess_force_exit(HANDLE());
    }
    
    /**
     * Check the exit status of the subprocess, given that it exited
     * normally.  This is the value passed to the exit() system call or the
     * return value from main.
     * 
     * This is equivalent to the system WEXITSTATUS macro.
     * 
     * It is an error to call this function before g_subprocess_wait() and
     * unless g_subprocess_get_if_exited() returned %TRUE.
     */
    public int getExitStatus() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_subprocess_get_exit_status(HANDLE());
        return RESULT;
    }
    
    /**
     * On UNIX, returns the process ID as a decimal string.
     * On Windows, returns the result of GetProcessId() also as a string.
     * If the subprocess has terminated, this will return %NULL.
     */
    public java.lang.String getIdentifier() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_subprocess_get_identifier(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Check if the given subprocess exited normally (ie: by way of exit()
     * or return from main()).
     * 
     * This is equivalent to the system WIFEXITED macro.
     * 
     * It is an error to call this function before g_subprocess_wait() has
     * returned.
     */
    public boolean getIfExited() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_subprocess_get_if_exited(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Check if the given subprocess terminated in response to a signal.
     * 
     * This is equivalent to the system WIFSIGNALED macro.
     * 
     * It is an error to call this function before g_subprocess_wait() has
     * returned.
     */
    public boolean getIfSignaled() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_subprocess_get_if_signaled(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the raw status code of the process, as from waitpid().
     * 
     * This value has no particular meaning, but it can be used with the
     * macros defined by the system headers such as WIFEXITED.  It can also
     * be used with g_spawn_check_wait_status().
     * 
     * It is more likely that you want to use g_subprocess_get_if_exited()
     * followed by g_subprocess_get_exit_status().
     * 
     * It is an error to call this function before g_subprocess_wait() has
     * returned.
     */
    public int getStatus() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_subprocess_get_status(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the #GInputStream from which to read the stderr output of
     * @subprocess.
     * 
     * The process must have been created with %G_SUBPROCESS_FLAGS_STDERR_PIPE,
     * otherwise %NULL will be returned.
     */
    public InputStream getStderrPipe() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_subprocess_get_stderr_pipe(HANDLE());
        return new InputStream(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Gets the #GOutputStream that you can write to in order to give data
     * to the stdin of @subprocess.
     * 
     * The process must have been created with %G_SUBPROCESS_FLAGS_STDIN_PIPE and
     * not %G_SUBPROCESS_FLAGS_STDIN_INHERIT, otherwise %NULL will be returned.
     */
    public OutputStream getStdinPipe() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_subprocess_get_stdin_pipe(HANDLE());
        return new OutputStream(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Gets the #GInputStream from which to read the stdout output of
     * @subprocess.
     * 
     * The process must have been created with %G_SUBPROCESS_FLAGS_STDOUT_PIPE,
     * otherwise %NULL will be returned.
     */
    public InputStream getStdoutPipe() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_subprocess_get_stdout_pipe(HANDLE());
        return new InputStream(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Checks if the process was "successful".  A process is considered
     * successful if it exited cleanly with an exit status of 0, either by
     * way of the exit() system call or return from main().
     * 
     * It is an error to call this function before g_subprocess_wait() has
     * returned.
     */
    public boolean getSuccessful() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_subprocess_get_successful(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Get the signal number that caused the subprocess to terminate, given
     * that it terminated due to a signal.
     * 
     * This is equivalent to the system WTERMSIG macro.
     * 
     * It is an error to call this function before g_subprocess_wait() and
     * unless g_subprocess_get_if_signaled() returned %TRUE.
     */
    public int getTermSig() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_subprocess_get_term_sig(HANDLE());
        return RESULT;
    }
    
    /**
     * Sends the UNIX signal @signal_num to the subprocess, if it is still
     * running.
     * 
     * This API is race-free.  If the subprocess has terminated, it will not
     * be signalled.
     * 
     * This API is not available on Windows.
     */
    public void sendSignal(int signalNum) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_subprocess_send_signal(HANDLE(), signalNum);
    }
    
    /**
     * Synchronously wait for the subprocess to terminate.
     * 
     * After the process terminates you can query its exit status with
     * functions such as g_subprocess_get_if_exited() and
     * g_subprocess_get_exit_status().
     * 
     * This function does not fail in the case of the subprocess having
     * abnormal termination.  See g_subprocess_wait_check() for that.
     * 
     * Cancelling @cancellable doesn't kill the subprocess.  Call
     * g_subprocess_force_exit() if it is desirable.
     */
    public boolean wait(Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_subprocess_wait(HANDLE(), cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Combines g_subprocess_wait() with g_spawn_check_wait_status().
     */
    public boolean waitCheck(Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_subprocess_wait_check(HANDLE(), cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Collects the result of a previous call to
     * g_subprocess_wait_check_async().
     */
    public boolean waitCheckFinish(AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_subprocess_wait_check_finish(HANDLE(), result.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Collects the result of a previous call to
     * g_subprocess_wait_async().
     */
    public boolean waitFinish(AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_subprocess_wait_finish(HANDLE(), result.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
}
