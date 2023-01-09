package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * @version 2.40
 */
public class Subprocess extends org.gtk.gobject.GObject implements org.gtk.gio.Initable {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSubprocess";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Subprocess proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Subprocess(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Subprocess> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Subprocess(input);
    
    private static MemoryAddress constructNew(org.gtk.gio.SubprocessFlags flags, @Nullable PointerProxy<org.gtk.glib.Error> error, java.lang.String argv0, java.lang.Object... varargs) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_subprocess_new.invokeExact(
                        flags.getValue(),
                        error.handle(),
                        Marshal.stringToAddress.marshal(argv0, SCOPE),
                        varargs);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Create a new process with the given flags and varargs argument
     * list.  By default, matching the g_spawn_async() defaults, the
     * child's stdin will be set to the system null device, and
     * stdout/stderr will be inherited from the parent.  You can use
     * {@code flags} to control this behavior.
     * <p>
     * The argument list must be terminated with {@code null}.
     * @param flags flags that define the behaviour of the subprocess
     * @param error return location for an error, or {@code null}
     * @param argv0 first commandline argument to pass to the subprocess
     * @param varargs more commandline arguments, followed by {@code null}
     */
    public Subprocess(org.gtk.gio.SubprocessFlags flags, @Nullable PointerProxy<org.gtk.glib.Error> error, java.lang.String argv0, java.lang.Object... varargs) {
        super(constructNew(flags, error, argv0, varargs));
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewv(java.lang.String[] argv, org.gtk.gio.SubprocessFlags flags) throws GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_subprocess_newv.invokeExact(
                        Interop.allocateNativeArray(argv, false, SCOPE),
                        flags.getValue(),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        }
    }
        
    /**
     * Create a new process with the given flags and argument list.
     * <p>
     * The argument list is expected to be {@code null}-terminated.
     * @param argv commandline arguments for the subprocess
     * @param flags flags that define the behaviour of the subprocess
     * @return A newly created {@link Subprocess}, or {@code null} on error (and {@code error}
     *   will be set)
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static Subprocess newv(java.lang.String[] argv, org.gtk.gio.SubprocessFlags flags) throws GErrorException {
        var RESULT = constructNewv(argv, flags);
        var OBJECT = (org.gtk.gio.Subprocess) Interop.register(RESULT, org.gtk.gio.Subprocess.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
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
     * @param stdinBuf data to send to the stdin of the subprocess, or {@code null}
     * @param cancellable a {@link Cancellable}
     * @param stdoutBuf data read from the subprocess stdout
     * @param stderrBuf data read from the subprocess stderr
     * @return {@code true} if successful
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean communicate(@Nullable org.gtk.glib.Bytes stdinBuf, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable Out<org.gtk.glib.Bytes> stdoutBuf, @Nullable Out<org.gtk.glib.Bytes> stderrBuf) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment stdoutBufPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment stderrBufPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_subprocess_communicate.invokeExact(
                        handle(),
                        (Addressable) (stdinBuf == null ? MemoryAddress.NULL : stdinBuf.handle()),
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) (stdoutBuf == null ? MemoryAddress.NULL : (Addressable) stdoutBufPOINTER.address()),
                        (Addressable) (stderrBuf == null ? MemoryAddress.NULL : (Addressable) stderrBufPOINTER.address()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    if (stdoutBuf != null) stdoutBuf.set(org.gtk.glib.Bytes.fromAddress.marshal(stdoutBufPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (stderrBuf != null) stderrBuf.set(org.gtk.glib.Bytes.fromAddress.marshal(stderrBufPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Asynchronous version of g_subprocess_communicate().  Complete
     * invocation with g_subprocess_communicate_finish().
     * @param stdinBuf Input data, or {@code null}
     * @param cancellable Cancellable
     * @param callback Callback
     */
    public void communicateAsync(@Nullable org.gtk.glib.Bytes stdinBuf, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_subprocess_communicate_async.invokeExact(
                    handle(),
                    (Addressable) (stdinBuf == null ? MemoryAddress.NULL : stdinBuf.handle()),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Complete an invocation of g_subprocess_communicate_async().
     * @param result Result
     * @param stdoutBuf Return location for stdout data
     * @param stderrBuf Return location for stderr data
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean communicateFinish(org.gtk.gio.AsyncResult result, @Nullable Out<org.gtk.glib.Bytes> stdoutBuf, @Nullable Out<org.gtk.glib.Bytes> stderrBuf) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment stdoutBufPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment stderrBufPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_subprocess_communicate_finish.invokeExact(
                        handle(),
                        result.handle(),
                        (Addressable) (stdoutBuf == null ? MemoryAddress.NULL : (Addressable) stdoutBufPOINTER.address()),
                        (Addressable) (stderrBuf == null ? MemoryAddress.NULL : (Addressable) stderrBufPOINTER.address()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    if (stdoutBuf != null) stdoutBuf.set(org.gtk.glib.Bytes.fromAddress.marshal(stdoutBufPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (stderrBuf != null) stderrBuf.set(org.gtk.glib.Bytes.fromAddress.marshal(stderrBufPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Like g_subprocess_communicate(), but validates the output of the
     * process as UTF-8, and returns it as a regular NUL terminated string.
     * <p>
     * On error, {@code stdout_buf} and {@code stderr_buf} will be set to undefined values and
     * should not be used.
     * @param stdinBuf data to send to the stdin of the subprocess, or {@code null}
     * @param cancellable a {@link Cancellable}
     * @param stdoutBuf data read from the subprocess stdout
     * @param stderrBuf data read from the subprocess stderr
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean communicateUtf8(@Nullable java.lang.String stdinBuf, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable Out<java.lang.String> stdoutBuf, @Nullable Out<java.lang.String> stderrBuf) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment stdoutBufPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment stderrBufPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_subprocess_communicate_utf8.invokeExact(
                        handle(),
                        (Addressable) (stdinBuf == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(stdinBuf, SCOPE)),
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) (stdoutBuf == null ? MemoryAddress.NULL : (Addressable) stdoutBufPOINTER.address()),
                        (Addressable) (stderrBuf == null ? MemoryAddress.NULL : (Addressable) stderrBufPOINTER.address()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    if (stdoutBuf != null) stdoutBuf.set(Marshal.addressToString.marshal(stdoutBufPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (stderrBuf != null) stderrBuf.set(Marshal.addressToString.marshal(stderrBufPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Asynchronous version of g_subprocess_communicate_utf8().  Complete
     * invocation with g_subprocess_communicate_utf8_finish().
     * @param stdinBuf Input data, or {@code null}
     * @param cancellable Cancellable
     * @param callback Callback
     */
    public void communicateUtf8Async(@Nullable java.lang.String stdinBuf, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_subprocess_communicate_utf8_async.invokeExact(
                        handle(),
                        (Addressable) (stdinBuf == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(stdinBuf, SCOPE)),
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                        (Addressable) MemoryAddress.NULL);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Complete an invocation of g_subprocess_communicate_utf8_async().
     * @param result Result
     * @param stdoutBuf Return location for stdout data
     * @param stderrBuf Return location for stderr data
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean communicateUtf8Finish(org.gtk.gio.AsyncResult result, @Nullable Out<java.lang.String> stdoutBuf, @Nullable Out<java.lang.String> stderrBuf) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment stdoutBufPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment stderrBufPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_subprocess_communicate_utf8_finish.invokeExact(
                        handle(),
                        result.handle(),
                        (Addressable) (stdoutBuf == null ? MemoryAddress.NULL : (Addressable) stdoutBufPOINTER.address()),
                        (Addressable) (stderrBuf == null ? MemoryAddress.NULL : (Addressable) stderrBufPOINTER.address()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    if (stdoutBuf != null) stdoutBuf.set(Marshal.addressToString.marshal(stdoutBufPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (stderrBuf != null) stderrBuf.set(Marshal.addressToString.marshal(stderrBufPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
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
            DowncallHandles.g_subprocess_force_exit.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Check the exit status of the subprocess, given that it exited
     * normally.  This is the value passed to the exit() system call or the
     * return value from main.
     * <p>
     * This is equivalent to the system WEXITSTATUS macro.
     * <p>
     * It is an error to call this function before g_subprocess_wait() and
     * unless g_subprocess_get_if_exited() returned {@code true}.
     * @return the exit status
     */
    public int getExitStatus() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_subprocess_get_exit_status.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * On UNIX, returns the process ID as a decimal string.
     * On Windows, returns the result of GetProcessId() also as a string.
     * If the subprocess has terminated, this will return {@code null}.
     * @return the subprocess identifier, or {@code null} if the subprocess
     *    has terminated
     */
    public @Nullable java.lang.String getIdentifier() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_subprocess_get_identifier.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Check if the given subprocess exited normally (ie: by way of exit()
     * or return from main()).
     * <p>
     * This is equivalent to the system WIFEXITED macro.
     * <p>
     * It is an error to call this function before g_subprocess_wait() has
     * returned.
     * @return {@code true} if the case of a normal exit
     */
    public boolean getIfExited() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_subprocess_get_if_exited.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Check if the given subprocess terminated in response to a signal.
     * <p>
     * This is equivalent to the system WIFSIGNALED macro.
     * <p>
     * It is an error to call this function before g_subprocess_wait() has
     * returned.
     * @return {@code true} if the case of termination due to a signal
     */
    public boolean getIfSignaled() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_subprocess_get_if_signaled.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
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
     * @return the (meaningless) waitpid() exit status from the kernel
     */
    public int getStatus() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_subprocess_get_status.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the {@link InputStream} from which to read the stderr output of
     * {@code subprocess}.
     * <p>
     * The process must have been created with {@link SubprocessFlags#STDERR_PIPE},
     * otherwise {@code null} will be returned.
     * @return the stderr pipe
     */
    public @Nullable org.gtk.gio.InputStream getStderrPipe() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_subprocess_get_stderr_pipe.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.InputStream) Interop.register(RESULT, org.gtk.gio.InputStream.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the {@link OutputStream} that you can write to in order to give data
     * to the stdin of {@code subprocess}.
     * <p>
     * The process must have been created with {@link SubprocessFlags#STDIN_PIPE} and
     * not {@link SubprocessFlags#STDIN_INHERIT}, otherwise {@code null} will be returned.
     * @return the stdout pipe
     */
    public @Nullable org.gtk.gio.OutputStream getStdinPipe() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_subprocess_get_stdin_pipe.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.OutputStream) Interop.register(RESULT, org.gtk.gio.OutputStream.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the {@link InputStream} from which to read the stdout output of
     * {@code subprocess}.
     * <p>
     * The process must have been created with {@link SubprocessFlags#STDOUT_PIPE},
     * otherwise {@code null} will be returned.
     * @return the stdout pipe
     */
    public @Nullable org.gtk.gio.InputStream getStdoutPipe() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_subprocess_get_stdout_pipe.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.InputStream) Interop.register(RESULT, org.gtk.gio.InputStream.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Checks if the process was "successful".  A process is considered
     * successful if it exited cleanly with an exit status of 0, either by
     * way of the exit() system call or return from main().
     * <p>
     * It is an error to call this function before g_subprocess_wait() has
     * returned.
     * @return {@code true} if the process exited cleanly with a exit status of 0
     */
    public boolean getSuccessful() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_subprocess_get_successful.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the signal number that caused the subprocess to terminate, given
     * that it terminated due to a signal.
     * <p>
     * This is equivalent to the system WTERMSIG macro.
     * <p>
     * It is an error to call this function before g_subprocess_wait() and
     * unless g_subprocess_get_if_signaled() returned {@code true}.
     * @return the signal causing termination
     */
    public int getTermSig() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_subprocess_get_term_sig.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Sends the UNIX signal {@code signal_num} to the subprocess, if it is still
     * running.
     * <p>
     * This API is race-free.  If the subprocess has terminated, it will not
     * be signalled.
     * <p>
     * This API is not available on Windows.
     * @param signalNum the signal number to send
     */
    public void sendSignal(int signalNum) {
        try {
            DowncallHandles.g_subprocess_send_signal.invokeExact(
                    handle(),
                    signalNum);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param cancellable a {@link Cancellable}
     * @return {@code true} on success, {@code false} if {@code cancellable} was cancelled
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean wait_(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_subprocess_wait.invokeExact(
                        handle(),
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Wait for the subprocess to terminate.
     * <p>
     * This is the asynchronous version of g_subprocess_wait().
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @param callback a {@link AsyncReadyCallback} to call when the operation is complete
     */
    public void waitAsync(@Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_subprocess_wait_async.invokeExact(
                    handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Combines g_subprocess_wait() with g_spawn_check_wait_status().
     * @param cancellable a {@link Cancellable}
     * @return {@code true} on success, {@code false} if process exited abnormally, or
     * {@code cancellable} was cancelled
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean waitCheck(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_subprocess_wait_check.invokeExact(
                        handle(),
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Combines g_subprocess_wait_async() with g_spawn_check_wait_status().
     * <p>
     * This is the asynchronous version of g_subprocess_wait_check().
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @param callback a {@link AsyncReadyCallback} to call when the operation is complete
     */
    public void waitCheckAsync(@Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_subprocess_wait_check_async.invokeExact(
                    handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Collects the result of a previous call to
     * g_subprocess_wait_check_async().
     * @param result the {@link AsyncResult} passed to your {@link AsyncReadyCallback}
     * @return {@code true} if successful, or {@code false} with {@code error} set
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean waitCheckFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_subprocess_wait_check_finish.invokeExact(
                        handle(),
                        result.handle(),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Collects the result of a previous call to
     * g_subprocess_wait_async().
     * @param result the {@link AsyncResult} passed to your {@link AsyncReadyCallback}
     * @return {@code true} if successful, or {@code false} with {@code error} set
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean waitFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_subprocess_wait_finish.invokeExact(
                        handle(),
                        result.handle(),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_subprocess_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link Subprocess.Builder} object constructs a {@link Subprocess} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Subprocess.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Subprocess} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Subprocess}.
         * @return A new instance of {@code Subprocess} with the properties 
         *         that were set in the Builder object.
         */
        public Subprocess build() {
            return (Subprocess) org.gtk.gobject.GObject.newWithProperties(
                Subprocess.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setFlags(org.gtk.gio.SubprocessFlags flags) {
            names.add("flags");
            values.add(org.gtk.gobject.Value.create(flags));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_subprocess_new = Interop.downcallHandle(
                "g_subprocess_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                true
        );
        
        private static final MethodHandle g_subprocess_newv = Interop.downcallHandle(
                "g_subprocess_newv",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_subprocess_communicate = Interop.downcallHandle(
                "g_subprocess_communicate",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_subprocess_communicate_async = Interop.downcallHandle(
                "g_subprocess_communicate_async",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_subprocess_communicate_finish = Interop.downcallHandle(
                "g_subprocess_communicate_finish",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_subprocess_communicate_utf8 = Interop.downcallHandle(
                "g_subprocess_communicate_utf8",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_subprocess_communicate_utf8_async = Interop.downcallHandle(
                "g_subprocess_communicate_utf8_async",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_subprocess_communicate_utf8_finish = Interop.downcallHandle(
                "g_subprocess_communicate_utf8_finish",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_subprocess_force_exit = Interop.downcallHandle(
                "g_subprocess_force_exit",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_subprocess_get_exit_status = Interop.downcallHandle(
                "g_subprocess_get_exit_status",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_subprocess_get_identifier = Interop.downcallHandle(
                "g_subprocess_get_identifier",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_subprocess_get_if_exited = Interop.downcallHandle(
                "g_subprocess_get_if_exited",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_subprocess_get_if_signaled = Interop.downcallHandle(
                "g_subprocess_get_if_signaled",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_subprocess_get_status = Interop.downcallHandle(
                "g_subprocess_get_status",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_subprocess_get_stderr_pipe = Interop.downcallHandle(
                "g_subprocess_get_stderr_pipe",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_subprocess_get_stdin_pipe = Interop.downcallHandle(
                "g_subprocess_get_stdin_pipe",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_subprocess_get_stdout_pipe = Interop.downcallHandle(
                "g_subprocess_get_stdout_pipe",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_subprocess_get_successful = Interop.downcallHandle(
                "g_subprocess_get_successful",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_subprocess_get_term_sig = Interop.downcallHandle(
                "g_subprocess_get_term_sig",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_subprocess_send_signal = Interop.downcallHandle(
                "g_subprocess_send_signal",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_subprocess_wait = Interop.downcallHandle(
                "g_subprocess_wait",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_subprocess_wait_async = Interop.downcallHandle(
                "g_subprocess_wait_async",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_subprocess_wait_check = Interop.downcallHandle(
                "g_subprocess_wait_check",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_subprocess_wait_check_async = Interop.downcallHandle(
                "g_subprocess_wait_check_async",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_subprocess_wait_check_finish = Interop.downcallHandle(
                "g_subprocess_wait_check_finish",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_subprocess_wait_finish = Interop.downcallHandle(
                "g_subprocess_wait_finish",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_subprocess_get_type = Interop.downcallHandle(
                "g_subprocess_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_subprocess_get_type != null;
    }
}
