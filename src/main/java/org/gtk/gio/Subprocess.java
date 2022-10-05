package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link Subprocess} allows the creation of and interaction with child
 * processes.
 * <p>
 * Processes can be communicated with using standard GIO-style APIs (ie:
 * {@link InputStream}, {@link OutputStream}).  There are GIO-style APIs to wait for
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
 * some other languages such as the {@code subprocess.py}
 * included with Python.  For example, using {@link Subprocess} one could
 * create two child processes, reading standard output from the first,
 * processing it, and writing to the input stream of the second, all
 * without blocking the main loop.
 * <p>
 * A powerful g_subprocess_communicate() API is provided similar to the
 * {@code communicate()} method of {@code subprocess.py}. This enables very easy
 * interaction with a subprocess that has been opened with pipes.
 * <p>
 * {@link Subprocess} defaults to tight control over the file descriptors open
 * in the child process, avoiding dangling-fd issues that are caused by
 * a simple fork()/exec().  The only open file descriptors in the
 * spawned process are ones that were explicitly specified by the
 * {@link Subprocess} API (unless {@link SubprocessFlags#INHERIT_FDS} was
 * specified).
 * <p>
 * {@link Subprocess} will quickly reap all child processes as they exit,
 * avoiding "zombie processes" remaining around for long periods of
 * time.  g_subprocess_wait() can be used to wait for this to happen,
 * but it will happen even without the call being explicitly made.
 * <p>
 * As a matter of principle, {@link Subprocess} has no API that accepts
 * shell-style space-separated strings.  It will, however, match the
 * typical shell behaviour of searching the PATH for executables that do
 * not contain a directory separator in their name. By default, the {@code PATH}
 * of the current process is used.  You can specify
 * {@link SubprocessFlags#SEARCH_PATH_FROM_ENVP} to use the {@code PATH} of the
 * launcher environment instead.
 * <p>
 * {@link Subprocess} attempts to have a very simple API for most uses (ie:
 * spawning a subprocess with arguments and support for most typical
 * kinds of input and output redirection).  See g_subprocess_new(). The
 * {@link SubprocessLauncher} API is provided for more complicated cases
 * (advanced types of redirection, environment variable manipulation,
 * change of working directory, child setup functions, etc).
 * <p>
 * A typical use of {@link Subprocess} will involve calling
 * g_subprocess_new(), followed by g_subprocess_wait_async() or
 * g_subprocess_wait().  After the process exits, the status can be
 * checked using functions such as g_subprocess_get_if_exited() (which
 * are similar to the familiar WIFEXITED-style POSIX macros).
 */
public class Subprocess extends org.gtk.gobject.Object implements Initable {

    public Subprocess(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Subprocess */
    public static Subprocess castFrom(org.gtk.gobject.Object gobject) {
        return new Subprocess(gobject.refcounted());
    }
    
    static final MethodHandle g_subprocess_newv = Interop.downcallHandle(
        "g_subprocess_newv",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNewv(java.lang.String[] argv, SubprocessFlags flags) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_subprocess_newv.invokeExact(Interop.allocateNativeArray(argv).handle(), flags.getValue(), GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Create a new process with the given flags and argument list.
     * <p>
     * The argument list is expected to be {@code null}-terminated.
     */
    public static Subprocess newv(java.lang.String[] argv, SubprocessFlags flags) throws GErrorException {
        return new Subprocess(constructNewv(argv, flags));
    }
    
    static final MethodHandle g_subprocess_communicate = Interop.downcallHandle(
        "g_subprocess_communicate",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Communicate with the subprocess until it terminates, and all input
     * and output has been completed.
     * <p>
     * If {@code stdin_buf} is given, the subprocess must have been created with
     * {@link SubprocessFlags#STDIN_PIPE}.  The given data is fed to the
     * stdin of the subprocess and the pipe is closed (ie: EOF).
     * <p>
     * At the same time (as not to cause blocking when dealing with large
     * amounts of data), if {@link SubprocessFlags#STDOUT_PIPE} or
     * {@link SubprocessFlags#STDERR_PIPE} were used, reads from those
     * streams.  The data that was read is returned in {@code stdout} and/or
     * the {@code stderr}.
     * <p>
     * If the subprocess was created with {@link SubprocessFlags#STDOUT_PIPE},
     * {@code stdout_buf} will contain the data read from stdout.  Otherwise, for
     * subprocesses not created with {@link SubprocessFlags#STDOUT_PIPE},
     * {@code stdout_buf} will be set to {@code null}.  Similar provisions apply to
     * {@code stderr_buf} and {@link SubprocessFlags#STDERR_PIPE}.
     * <p>
     * As usual, any output variable may be given as {@code null} to ignore it.
     * <p>
     * If you desire the stdout and stderr data to be interleaved, create
     * the subprocess with {@link SubprocessFlags#STDOUT_PIPE} and
     * {@link SubprocessFlags#STDERR_MERGE}.  The merged result will be returned
     * in {@code stdout_buf} and {@code stderr_buf} will be set to {@code null}.
     * <p>
     * In case of any error (including cancellation), {@code false} will be
     * returned with {@code error} set.  Some or all of the stdin data may have
     * been written.  Any stdout or stderr data that has been read will be
     * discarded. None of the out variables (aside from {@code error}) will have
     * been set to anything in particular and should not be inspected.
     * <p>
     * In the case that {@code true} is returned, the subprocess has exited and the
     * exit status inspection APIs (eg: g_subprocess_get_if_exited(),
     * g_subprocess_get_exit_status()) may be used.
     * <p>
     * You should not attempt to use any of the subprocess pipes after
     * starting this function, since they may be left in strange states,
     * even if the operation was cancelled.  You should especially not
     * attempt to interact with the pipes while the operation is in progress
     * (either from another thread or if using the asynchronous version).
     */
    public boolean communicate(org.gtk.glib.Bytes stdinBuf, Cancellable cancellable, org.gtk.glib.Bytes[] stdoutBuf, org.gtk.glib.Bytes[] stderrBuf) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_subprocess_communicate.invokeExact(handle(), stdinBuf.handle(), cancellable.handle(), Interop.allocateNativeArray(stdoutBuf).handle(), Interop.allocateNativeArray(stderrBuf).handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_subprocess_communicate_async = Interop.downcallHandle(
        "g_subprocess_communicate_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Asynchronous version of g_subprocess_communicate().  Complete
     * invocation with g_subprocess_communicate_finish().
     */
    public void communicateAsync(org.gtk.glib.Bytes stdinBuf, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_subprocess_communicate_async.invokeExact(handle(), stdinBuf.handle(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_subprocess_communicate_finish = Interop.downcallHandle(
        "g_subprocess_communicate_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Complete an invocation of g_subprocess_communicate_async().
     */
    public boolean communicateFinish(AsyncResult result, org.gtk.glib.Bytes[] stdoutBuf, org.gtk.glib.Bytes[] stderrBuf) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_subprocess_communicate_finish.invokeExact(handle(), result.handle(), Interop.allocateNativeArray(stdoutBuf).handle(), Interop.allocateNativeArray(stderrBuf).handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_subprocess_communicate_utf8 = Interop.downcallHandle(
        "g_subprocess_communicate_utf8",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Like g_subprocess_communicate(), but validates the output of the
     * process as UTF-8, and returns it as a regular NUL terminated string.
     * <p>
     * On error, {@code stdout_buf} and {@code stderr_buf} will be set to undefined values and
     * should not be used.
     */
    public boolean communicateUtf8(java.lang.String stdinBuf, Cancellable cancellable, java.lang.String[] stdoutBuf, java.lang.String[] stderrBuf) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_subprocess_communicate_utf8.invokeExact(handle(), Interop.allocateNativeString(stdinBuf).handle(), cancellable.handle(), Interop.allocateNativeArray(stdoutBuf).handle(), Interop.allocateNativeArray(stderrBuf).handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_subprocess_communicate_utf8_async = Interop.downcallHandle(
        "g_subprocess_communicate_utf8_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Asynchronous version of g_subprocess_communicate_utf8().  Complete
     * invocation with g_subprocess_communicate_utf8_finish().
     */
    public void communicateUtf8Async(java.lang.String stdinBuf, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_subprocess_communicate_utf8_async.invokeExact(handle(), Interop.allocateNativeString(stdinBuf).handle(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_subprocess_communicate_utf8_finish = Interop.downcallHandle(
        "g_subprocess_communicate_utf8_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Complete an invocation of g_subprocess_communicate_utf8_async().
     */
    public boolean communicateUtf8Finish(AsyncResult result, java.lang.String[] stdoutBuf, java.lang.String[] stderrBuf) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_subprocess_communicate_utf8_finish.invokeExact(handle(), result.handle(), Interop.allocateNativeArray(stdoutBuf).handle(), Interop.allocateNativeArray(stderrBuf).handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_subprocess_force_exit = Interop.downcallHandle(
        "g_subprocess_force_exit",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Use an operating-system specific method to attempt an immediate,
     * forceful termination of the process.  There is no mechanism to
     * determine whether or not the request itself was successful;
     * however, you can use g_subprocess_wait() to monitor the status of
     * the process after calling this function.
     * <p>
     * On Unix, this function sends {@code SIGKILL}.
     */
    public void forceExit() {
        try {
            g_subprocess_force_exit.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_subprocess_get_exit_status = Interop.downcallHandle(
        "g_subprocess_get_exit_status",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Check the exit status of the subprocess, given that it exited
     * normally.  This is the value passed to the exit() system call or the
     * return value from main.
     * <p>
     * This is equivalent to the system WEXITSTATUS macro.
     * <p>
     * It is an error to call this function before g_subprocess_wait() and
     * unless g_subprocess_get_if_exited() returned {@code true}.
     */
    public int getExitStatus() {
        try {
            var RESULT = (int) g_subprocess_get_exit_status.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_subprocess_get_identifier = Interop.downcallHandle(
        "g_subprocess_get_identifier",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * On UNIX, returns the process ID as a decimal string.
     * On Windows, returns the result of GetProcessId() also as a string.
     * If the subprocess has terminated, this will return {@code null}.
     */
    public java.lang.String getIdentifier() {
        try {
            var RESULT = (MemoryAddress) g_subprocess_get_identifier.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_subprocess_get_if_exited = Interop.downcallHandle(
        "g_subprocess_get_if_exited",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Check if the given subprocess exited normally (ie: by way of exit()
     * or return from main()).
     * <p>
     * This is equivalent to the system WIFEXITED macro.
     * <p>
     * It is an error to call this function before g_subprocess_wait() has
     * returned.
     */
    public boolean getIfExited() {
        try {
            var RESULT = (int) g_subprocess_get_if_exited.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_subprocess_get_if_signaled = Interop.downcallHandle(
        "g_subprocess_get_if_signaled",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Check if the given subprocess terminated in response to a signal.
     * <p>
     * This is equivalent to the system WIFSIGNALED macro.
     * <p>
     * It is an error to call this function before g_subprocess_wait() has
     * returned.
     */
    public boolean getIfSignaled() {
        try {
            var RESULT = (int) g_subprocess_get_if_signaled.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_subprocess_get_status = Interop.downcallHandle(
        "g_subprocess_get_status",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the raw status code of the process, as from waitpid().
     * <p>
     * This value has no particular meaning, but it can be used with the
     * macros defined by the system headers such as WIFEXITED.  It can also
     * be used with g_spawn_check_wait_status().
     * <p>
     * It is more likely that you want to use g_subprocess_get_if_exited()
     * followed by g_subprocess_get_exit_status().
     * <p>
     * It is an error to call this function before g_subprocess_wait() has
     * returned.
     */
    public int getStatus() {
        try {
            var RESULT = (int) g_subprocess_get_status.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_subprocess_get_stderr_pipe = Interop.downcallHandle(
        "g_subprocess_get_stderr_pipe",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@link InputStream} from which to read the stderr output of
     * {@code subprocess}.
     * <p>
     * The process must have been created with {@link SubprocessFlags#STDERR_PIPE},
     * otherwise {@code null} will be returned.
     */
    public InputStream getStderrPipe() {
        try {
            var RESULT = (MemoryAddress) g_subprocess_get_stderr_pipe.invokeExact(handle());
            return new InputStream(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_subprocess_get_stdin_pipe = Interop.downcallHandle(
        "g_subprocess_get_stdin_pipe",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@link OutputStream} that you can write to in order to give data
     * to the stdin of {@code subprocess}.
     * <p>
     * The process must have been created with {@link SubprocessFlags#STDIN_PIPE} and
     * not {@link SubprocessFlags#STDIN_INHERIT}, otherwise {@code null} will be returned.
     */
    public OutputStream getStdinPipe() {
        try {
            var RESULT = (MemoryAddress) g_subprocess_get_stdin_pipe.invokeExact(handle());
            return new OutputStream(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_subprocess_get_stdout_pipe = Interop.downcallHandle(
        "g_subprocess_get_stdout_pipe",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@link InputStream} from which to read the stdout output of
     * {@code subprocess}.
     * <p>
     * The process must have been created with {@link SubprocessFlags#STDOUT_PIPE},
     * otherwise {@code null} will be returned.
     */
    public InputStream getStdoutPipe() {
        try {
            var RESULT = (MemoryAddress) g_subprocess_get_stdout_pipe.invokeExact(handle());
            return new InputStream(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_subprocess_get_successful = Interop.downcallHandle(
        "g_subprocess_get_successful",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if the process was "successful".  A process is considered
     * successful if it exited cleanly with an exit status of 0, either by
     * way of the exit() system call or return from main().
     * <p>
     * It is an error to call this function before g_subprocess_wait() has
     * returned.
     */
    public boolean getSuccessful() {
        try {
            var RESULT = (int) g_subprocess_get_successful.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_subprocess_get_term_sig = Interop.downcallHandle(
        "g_subprocess_get_term_sig",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the signal number that caused the subprocess to terminate, given
     * that it terminated due to a signal.
     * <p>
     * This is equivalent to the system WTERMSIG macro.
     * <p>
     * It is an error to call this function before g_subprocess_wait() and
     * unless g_subprocess_get_if_signaled() returned {@code true}.
     */
    public int getTermSig() {
        try {
            var RESULT = (int) g_subprocess_get_term_sig.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_subprocess_send_signal = Interop.downcallHandle(
        "g_subprocess_send_signal",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sends the UNIX signal {@code signal_num} to the subprocess, if it is still
     * running.
     * <p>
     * This API is race-free.  If the subprocess has terminated, it will not
     * be signalled.
     * <p>
     * This API is not available on Windows.
     */
    public void sendSignal(int signalNum) {
        try {
            g_subprocess_send_signal.invokeExact(handle(), signalNum);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_subprocess_wait = Interop.downcallHandle(
        "g_subprocess_wait",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Synchronously wait for the subprocess to terminate.
     * <p>
     * After the process terminates you can query its exit status with
     * functions such as g_subprocess_get_if_exited() and
     * g_subprocess_get_exit_status().
     * <p>
     * This function does not fail in the case of the subprocess having
     * abnormal termination.  See g_subprocess_wait_check() for that.
     * <p>
     * Cancelling {@code cancellable} doesn't kill the subprocess.  Call
     * g_subprocess_force_exit() if it is desirable.
     */
    public boolean wait(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_subprocess_wait.invokeExact(handle(), cancellable.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_subprocess_wait_async = Interop.downcallHandle(
        "g_subprocess_wait_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Wait for the subprocess to terminate.
     * <p>
     * This is the asynchronous version of g_subprocess_wait().
     */
    public void waitAsync(Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_subprocess_wait_async.invokeExact(handle(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_subprocess_wait_check = Interop.downcallHandle(
        "g_subprocess_wait_check",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Combines g_subprocess_wait() with g_spawn_check_wait_status().
     */
    public boolean waitCheck(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_subprocess_wait_check.invokeExact(handle(), cancellable.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_subprocess_wait_check_async = Interop.downcallHandle(
        "g_subprocess_wait_check_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Combines g_subprocess_wait_async() with g_spawn_check_wait_status().
     * <p>
     * This is the asynchronous version of g_subprocess_wait_check().
     */
    public void waitCheckAsync(Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_subprocess_wait_check_async.invokeExact(handle(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_subprocess_wait_check_finish = Interop.downcallHandle(
        "g_subprocess_wait_check_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Collects the result of a previous call to
     * g_subprocess_wait_check_async().
     */
    public boolean waitCheckFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_subprocess_wait_check_finish.invokeExact(handle(), result.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_subprocess_wait_finish = Interop.downcallHandle(
        "g_subprocess_wait_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Collects the result of a previous call to
     * g_subprocess_wait_async().
     */
    public boolean waitFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_subprocess_wait_finish.invokeExact(handle(), result.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}