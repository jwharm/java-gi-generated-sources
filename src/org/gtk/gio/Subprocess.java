package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GSubprocess allows the creation of and interaction with child
 * processes.
 * <p>
 * Processes can be communicated with using standard GIO-style APIs (ie:
 * <h1>nputStream, #GOutputStream).  There are GIO-style APIs to wait for</h1>
 * process termination (ie: cancellable and with an asynchronous
 * variant).
 * <p>
 * There is an API to force a process to terminate, as well as a
 * race-free API for sending UNIX signals to a subprocess.
 * <p>
 * One major advantage that GIO brings over the core GLib library is
 * comprehensive API for asynchronous I/O, such
 * g_output_stream_splice_async().  This makes GSubprocess
 * significantly more powerful and flexible than equivalent APIs in
 * some other languages such as the <code>subprocess.py</code>
 * included with Python.  For example, using #GSubprocess one could
 * create two child processes, reading standard output from the first,
 * processing it, and writing to the input stream of the second, all
 * without blocking the main loop.
 * <p>
 * A powerful g_subprocess_communicate() API is provided similar to the<code>communicate()</code> method of <code>subprocess.py</code>. This enables very easy
 * interaction with a subprocess that has been opened with pipes.
 * <p>
 * <h1>ubprocess defaults to tight control over the file descriptors open</h1>
 * in the child process, avoiding dangling-fd issues that are caused by
 * a simple fork()/exec().  The only open file descriptors in the
 * spawned process are ones that were explicitly specified by the
 * <h1>ubprocess API (unless {@link org.gtk.gio.SubprocessFlags#INHERIT_FDS} was</h1>
 * specified).
 * <p>
 * <h1>ubprocess will quickly reap all child processes as they exit,</h1>
 * avoiding &#34;zombie processes&#34; remaining around for long periods of
 * time.  g_subprocess_wait() can be used to wait for this to happen,
 * but it will happen even without the call being explicitly made.
 * <p>
 * As a matter of principle, #GSubprocess has no API that accepts
 * shell-style space-separated strings.  It will, however, match the
 * typical shell behaviour of searching the PATH for executables that do
 * not contain a directory separator in their name. By default, the <code>PATH</code>
 * of the current process is used.  You can specify
 * {@link org.gtk.gio.SubprocessFlags#SEARCH_PATH_FROM_ENVP} to use the <code>PATH</code> of the
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

    public Subprocess(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Subprocess */
    public static Subprocess castFrom(org.gtk.gobject.Object gobject) {
        return new Subprocess(gobject.getReference());
    }
    
    private static Reference constructNewv(java.lang.String[] argv, int flags) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.g_subprocess_newv(Interop.allocateNativeArray(argv).handle(), flags, GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Create a new process with the given flags and argument list.
     * 
     * The argument list is expected to be 
     *             
     *           
     *         
     *       
     *       
     *         Create a new process with the given flags and argument list.
     * 
     * The argument list is expected to be %NULL-terminated.
     */
    public static Subprocess newv(java.lang.String[] argv, int flags) throws GErrorException {
        return new Subprocess(constructNewv(argv, flags));
    }
    
    /**
     * Communicate with the subprocess until it terminates, and all input
     * and output has been completed.
     * 
     * If @stdin_buf is given, the subprocess must have been created with
     * <code>G_SUBPROCESS_FLAGS_STDIN_PIPE.</code>  The given data is fed to the
     * stdin of the subprocess and the pipe is closed (ie: EOF).
     * 
     * At the same time (as not to cause blocking when dealing with large
     * amounts of data), if {@link org.gtk.gio.SubprocessFlags#STDOUT_PIPE} or
     * {@link org.gtk.gio.SubprocessFlags#STDERR_PIPE} were used, reads from those
     * streams.  The data that was read is returned in @stdout and/or
     * the @stderr.
     * 
     * If the subprocess was created with <code>G_SUBPROCESS_FLAGS_STDOUT_PIPE,
     * @stdout_buf</code> will contain the data read from stdout.  Otherwise, for
     * subprocesses not created with <code>G_SUBPROCESS_FLAGS_STDOUT_PIPE,
     * @stdout_buf</code> will be set to <code>NULL.</code>  Similar provisions apply to
     * @stderr_buf and <code>G_SUBPROCESS_FLAGS_STDERR_PIPE.
     * 
     * As</code> usual, any output variable may be given as <code>null</code> to ignore it.
     * 
     * If you desire the stdout and stderr data to be interleaved, create
     * the subprocess with {@link org.gtk.gio.SubprocessFlags#STDOUT_PIPE} and
     * <code>G_SUBPROCESS_FLAGS_STDERR_MERGE.</code>  The merged result will be returned
     * in @stdout_buf and @stderr_buf will be set to <code>NULL.
     * 
     * In</code> case of any error (including cancellation), <code>false</code> will be
     * returned with @error set.  Some or all of the stdin data may have
     * been written.  Any stdout or stderr data that has been read will be
     * discarded. None of the out variables (aside from @error) will have
     * been set to anything in particular and should not be inspected.
     * 
     * In the case that <code>true</code> is returned, the subprocess has exited and the
     * exit status inspection APIs (eg: g_subprocess_get_if_exited(),
     * g_subprocess_get_exit_status()) may be used.
     * 
     * You should not attempt to use any of the subprocess pipes after
     * starting this function, since they may be left in strange states,
     * even if the operation was cancelled.  You should especially not
     * attempt to interact with the pipes while the operation is in progress
     * (either from another thread or if using the asynchronous version).
     */
    public boolean communicate(org.gtk.glib.Bytes stdinBuf, Cancellable cancellable, org.gtk.glib.Bytes[] stdoutBuf, org.gtk.glib.Bytes[] stderrBuf) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_subprocess_communicate(handle(), stdinBuf.handle(), cancellable.handle(), Interop.allocateNativeArray(stdoutBuf).handle(), Interop.allocateNativeArray(stderrBuf).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Asynchronous version of g_subprocess_communicate().  Complete
     * invocation with g_subprocess_communicate_finish().
     */
    public void communicateAsync(org.gtk.glib.Bytes stdinBuf, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_subprocess_communicate_async(handle(), stdinBuf.handle(), cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Complete an invocation of g_subprocess_communicate_async().
     */
    public boolean communicateFinish(AsyncResult result, org.gtk.glib.Bytes[] stdoutBuf, org.gtk.glib.Bytes[] stderrBuf) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_subprocess_communicate_finish(handle(), result.handle(), Interop.allocateNativeArray(stdoutBuf).handle(), Interop.allocateNativeArray(stderrBuf).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
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
    public boolean communicateUtf8(java.lang.String stdinBuf, Cancellable cancellable, java.lang.String[] stdoutBuf, java.lang.String[] stderrBuf) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_subprocess_communicate_utf8(handle(), Interop.allocateNativeString(stdinBuf).handle(), cancellable.handle(), Interop.allocateNativeArray(stdoutBuf).handle(), Interop.allocateNativeArray(stderrBuf).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Asynchronous version of g_subprocess_communicate_utf8().  Complete
     * invocation with g_subprocess_communicate_utf8_finish().
     */
    public void communicateUtf8Async(java.lang.String stdinBuf, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_subprocess_communicate_utf8_async(handle(), Interop.allocateNativeString(stdinBuf).handle(), cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Complete an invocation of g_subprocess_communicate_utf8_async().
     */
    public boolean communicateUtf8Finish(AsyncResult result, java.lang.String[] stdoutBuf, java.lang.String[] stderrBuf) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_subprocess_communicate_utf8_finish(handle(), result.handle(), Interop.allocateNativeArray(stdoutBuf).handle(), Interop.allocateNativeArray(stderrBuf).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
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
     * On Unix, this function sends 
     *             
     *           
     *         
     *       
     *       
     *         Use an operating-system specific method to attempt an immediate,
     * forceful termination of the process.  There is no mechanism to
     * determine whether or not the request itself was successful;
     * however, you can use g_subprocess_wait() to monitor the status of
     * the process after calling this function.
     * 
     * On Unix, this function sends %SIGKILL.
     */
    public void forceExit() {
        gtk_h.g_subprocess_force_exit(handle());
    }
    
    /**
     * Check the exit status of the subprocess, given that it exited
     * normally.  This is the value passed to the exit() system call or the
     * return value from main.
     * 
     * This is equivalent to the system WEXITSTATUS macro.
     * 
     * It is an error to call this function before g_subprocess_wait() and
     * unless g_subprocess_get_if_exited() returned 
     *             
     *           
     *         
     *       
     *       
     *         Check the exit status of the subprocess, given that it exited
     * normally.  This is the value passed to the exit() system call or the
     * return value from main.
     * 
     * This is equivalent to the system WEXITSTATUS macro.
     * 
     * It is an error to call this function before g_subprocess_wait() and
     * unless g_subprocess_get_if_exited() returned %TRUE.
     */
    public int getExitStatus() {
        var RESULT = gtk_h.g_subprocess_get_exit_status(handle());
        return RESULT;
    }
    
    /**
     * On UNIX, returns the process ID as a decimal string.
     * On Windows, returns the result of GetProcessId() also as a string.
     * If the subprocess has terminated, this will return 
     *             
     *           
     *         
     *       
     *       
     *         On UNIX, returns the process ID as a decimal string.
     * On Windows, returns the result of GetProcessId() also as a string.
     * If the subprocess has terminated, this will return %NULL.
     */
    public java.lang.String getIdentifier() {
        var RESULT = gtk_h.g_subprocess_get_identifier(handle());
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
        var RESULT = gtk_h.g_subprocess_get_if_exited(handle());
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
        var RESULT = gtk_h.g_subprocess_get_if_signaled(handle());
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
        var RESULT = gtk_h.g_subprocess_get_status(handle());
        return RESULT;
    }
    
    /**
     * Gets the #GInputStream from which to read the stderr output of
     * @subprocess.
     * 
     * The process must have been created with <code>G_SUBPROCESS_FLAGS_STDERR_PIPE,
     * otherwise</code> <code>null</code> will be returned.
     */
    public InputStream getStderrPipe() {
        var RESULT = gtk_h.g_subprocess_get_stderr_pipe(handle());
        return new InputStream(References.get(RESULT, false));
    }
    
    /**
     * Gets the #GOutputStream that you can write to in order to give data
     * to the stdin of @subprocess.
     * 
     * The process must have been created with {@link org.gtk.gio.SubprocessFlags#STDIN_PIPE} and
     * not <code>G_SUBPROCESS_FLAGS_STDIN_INHERIT,</code> otherwise <code>null</code> will be returned.
     */
    public OutputStream getStdinPipe() {
        var RESULT = gtk_h.g_subprocess_get_stdin_pipe(handle());
        return new OutputStream(References.get(RESULT, false));
    }
    
    /**
     * Gets the #GInputStream from which to read the stdout output of
     * @subprocess.
     * 
     * The process must have been created with <code>G_SUBPROCESS_FLAGS_STDOUT_PIPE,
     * otherwise</code> <code>null</code> will be returned.
     */
    public InputStream getStdoutPipe() {
        var RESULT = gtk_h.g_subprocess_get_stdout_pipe(handle());
        return new InputStream(References.get(RESULT, false));
    }
    
    /**
     * Checks if the process was &#34;successful&#34;.  A process is considered
     * successful if it exited cleanly with an exit status of 0, either by
     * way of the exit() system call or return from main().
     * 
     * It is an error to call this function before g_subprocess_wait() has
     * returned.
     */
    public boolean getSuccessful() {
        var RESULT = gtk_h.g_subprocess_get_successful(handle());
        return (RESULT != 0);
    }
    
    /**
     * Get the signal number that caused the subprocess to terminate, given
     * that it terminated due to a signal.
     * 
     * This is equivalent to the system WTERMSIG macro.
     * 
     * It is an error to call this function before g_subprocess_wait() and
     * unless g_subprocess_get_if_signaled() returned 
     *             
     *           
     *         
     *       
     *       
     *         Get the signal number that caused the subprocess to terminate, given
     * that it terminated due to a signal.
     * 
     * This is equivalent to the system WTERMSIG macro.
     * 
     * It is an error to call this function before g_subprocess_wait() and
     * unless g_subprocess_get_if_signaled() returned %TRUE.
     */
    public int getTermSig() {
        var RESULT = gtk_h.g_subprocess_get_term_sig(handle());
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
        gtk_h.g_subprocess_send_signal(handle(), signalNum);
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
     * Cancelling @cancellable doesn&#39;t kill the subprocess.  Call
     * g_subprocess_force_exit() if it is desirable.
     */
    public boolean wait(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_subprocess_wait(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Wait for the subprocess to terminate.
     * 
     * This is the asynchronous version of g_subprocess_wait().
     */
    public void waitAsync(Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_subprocess_wait_async(handle(), cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Combines g_subprocess_wait() with g_spawn_check_wait_status().
     */
    public boolean waitCheck(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_subprocess_wait_check(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Combines g_subprocess_wait_async() with g_spawn_check_wait_status().
     * 
     * This is the asynchronous version of g_subprocess_wait_check().
     */
    public void waitCheckAsync(Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_subprocess_wait_check_async(handle(), cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Collects the result of a previous call to
     * g_subprocess_wait_check_async().
     */
    public boolean waitCheckFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_subprocess_wait_check_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Collects the result of a previous call to
     * g_subprocess_wait_async().
     */
    public boolean waitFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_subprocess_wait_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
}
