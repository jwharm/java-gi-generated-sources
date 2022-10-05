package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * This class contains a set of options for launching child processes,
 * such as where its standard input and output will be directed, the
 * argument list, the environment, and more.
 * <p>
 * While the {@link Subprocess} class has high level functions covering
 * popular cases, use of this class allows access to more advanced
 * options.  It can also be used to launch multiple subprocesses with
 * a similar configuration.
 */
public class SubprocessLauncher extends org.gtk.gobject.Object {

    public SubprocessLauncher(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to SubprocessLauncher */
    public static SubprocessLauncher castFrom(org.gtk.gobject.Object gobject) {
        return new SubprocessLauncher(gobject.refcounted());
    }
    
    static final MethodHandle g_subprocess_launcher_new = Interop.downcallHandle(
        "g_subprocess_launcher_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(SubprocessFlags flags) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_subprocess_launcher_new.invokeExact(flags.getValue()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link SubprocessLauncher}.
     * <p>
     * The launcher is created with the default options.  A copy of the
     * environment of the calling process is made at the time of this call
     * and will be used as the environment that the process is launched in.
     */
    public SubprocessLauncher(SubprocessFlags flags) {
        super(constructNew(flags));
    }
    
    static final MethodHandle g_subprocess_launcher_close = Interop.downcallHandle(
        "g_subprocess_launcher_close",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Closes all the file descriptors previously passed to the object with
     * g_subprocess_launcher_take_fd(), g_subprocess_launcher_take_stderr_fd(), etc.
     * <p>
     * After calling this method, any subsequent calls to g_subprocess_launcher_spawn() or g_subprocess_launcher_spawnv() will
     * return {@link IOErrorEnum#CLOSED}. This method is idempotent if
     * called more than once.
     * <p>
     * This function is called automatically when the {@link SubprocessLauncher}
     * is disposed, but is provided separately so that garbage collected
     * language bindings can call it earlier to guarantee when FDs are closed.
     */
    public void close() {
        try {
            g_subprocess_launcher_close.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_subprocess_launcher_getenv = Interop.downcallHandle(
        "g_subprocess_launcher_getenv",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the value of the environment variable {@code variable} in the
     * environment of processes launched from this launcher.
     * <p>
     * On UNIX, the returned string can be an arbitrary byte string.
     * On Windows, it will be UTF-8.
     */
    public java.lang.String getenv(java.lang.String variable) {
        try {
            var RESULT = (MemoryAddress) g_subprocess_launcher_getenv.invokeExact(handle(), Interop.allocateNativeString(variable).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_subprocess_launcher_set_child_setup = Interop.downcallHandle(
        "g_subprocess_launcher_set_child_setup",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets up a child setup function.
     * <p>
     * The child setup function will be called after fork() but before
     * exec() on the child's side.
     * <p>
     * {@code destroy_notify} will not be automatically called on the child's side
     * of the fork().  It will only be called when the last reference on the
     * {@link SubprocessLauncher} is dropped or when a new child setup function is
     * given.
     * <p>
     * {@code null} can be given as {@code child_setup} to disable the functionality.
     * <p>
     * Child setup functions are only available on UNIX.
     */
    public void setChildSetup(org.gtk.glib.SpawnChildSetupFunc childSetup) {
        try {
            g_subprocess_launcher_set_child_setup.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbSpawnChildSetupFunc",
                            MethodType.methodType(void.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(childSetup.hashCode(), childSetup)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_subprocess_launcher_set_cwd = Interop.downcallHandle(
        "g_subprocess_launcher_set_cwd",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the current working directory that processes will be launched
     * with.
     * <p>
     * By default processes are launched with the current working directory
     * of the launching process at the time of launch.
     */
    public void setCwd(java.lang.String cwd) {
        try {
            g_subprocess_launcher_set_cwd.invokeExact(handle(), Interop.allocateNativeString(cwd).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_subprocess_launcher_set_environ = Interop.downcallHandle(
        "g_subprocess_launcher_set_environ",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Replace the entire environment of processes launched from this
     * launcher with the given 'environ' variable.
     * <p>
     * Typically you will build this variable by using g_listenv() to copy
     * the process 'environ' and using the functions g_environ_setenv(),
     * g_environ_unsetenv(), etc.
     * <p>
     * As an alternative, you can use g_subprocess_launcher_setenv(),
     * g_subprocess_launcher_unsetenv(), etc.
     * <p>
     * Pass an empty array to set an empty environment. Pass {@code null} to inherit the
     * parent process’ environment. As of GLib 2.54, the parent process’ environment
     * will be copied when g_subprocess_launcher_set_environ() is called.
     * Previously, it was copied when the subprocess was executed. This means the
     * copied environment may now be modified (using g_subprocess_launcher_setenv(),
     * etc.) before launching the subprocess.
     * <p>
     * On UNIX, all strings in this array can be arbitrary byte strings.
     * On Windows, they should be in UTF-8.
     */
    public void setEnviron(java.lang.String[] env) {
        try {
            g_subprocess_launcher_set_environ.invokeExact(handle(), Interop.allocateNativeArray(env).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_subprocess_launcher_set_flags = Interop.downcallHandle(
        "g_subprocess_launcher_set_flags",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the flags on the launcher.
     * <p>
     * The default flags are {@link SubprocessFlags#NONE}.
     * <p>
     * You may not set flags that specify conflicting options for how to
     * handle a particular stdio stream (eg: specifying both
     * {@link SubprocessFlags#STDIN_PIPE} and
     * {@link SubprocessFlags#STDIN_INHERIT}).
     * <p>
     * You may also not set a flag that conflicts with a previous call to a
     * function like g_subprocess_launcher_set_stdin_file_path() or
     * g_subprocess_launcher_take_stdout_fd().
     */
    public void setFlags(SubprocessFlags flags) {
        try {
            g_subprocess_launcher_set_flags.invokeExact(handle(), flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_subprocess_launcher_set_stderr_file_path = Interop.downcallHandle(
        "g_subprocess_launcher_set_stderr_file_path",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the file path to use as the stderr for spawned processes.
     * <p>
     * If {@code path} is {@code null} then any previously given path is unset.
     * <p>
     * The file will be created or truncated when the process is spawned, as
     * would be the case if using '2>' at the shell.
     * <p>
     * If you want to send both stdout and stderr to the same file then use
     * {@link SubprocessFlags#STDERR_MERGE}.
     * <p>
     * You may not set a stderr file path if a stderr fd is already set or
     * if the launcher flags contain any flags directing stderr elsewhere.
     * <p>
     * This feature is only available on UNIX.
     */
    public void setStderrFilePath(java.lang.String path) {
        try {
            g_subprocess_launcher_set_stderr_file_path.invokeExact(handle(), Interop.allocateNativeString(path).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_subprocess_launcher_set_stdin_file_path = Interop.downcallHandle(
        "g_subprocess_launcher_set_stdin_file_path",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the file path to use as the stdin for spawned processes.
     * <p>
     * If {@code path} is {@code null} then any previously given path is unset.
     * <p>
     * The file must exist or spawning the process will fail.
     * <p>
     * You may not set a stdin file path if a stdin fd is already set or if
     * the launcher flags contain any flags directing stdin elsewhere.
     * <p>
     * This feature is only available on UNIX.
     */
    public void setStdinFilePath(java.lang.String path) {
        try {
            g_subprocess_launcher_set_stdin_file_path.invokeExact(handle(), Interop.allocateNativeString(path).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_subprocess_launcher_set_stdout_file_path = Interop.downcallHandle(
        "g_subprocess_launcher_set_stdout_file_path",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the file path to use as the stdout for spawned processes.
     * <p>
     * If {@code path} is {@code null} then any previously given path is unset.
     * <p>
     * The file will be created or truncated when the process is spawned, as
     * would be the case if using '>' at the shell.
     * <p>
     * You may not set a stdout file path if a stdout fd is already set or
     * if the launcher flags contain any flags directing stdout elsewhere.
     * <p>
     * This feature is only available on UNIX.
     */
    public void setStdoutFilePath(java.lang.String path) {
        try {
            g_subprocess_launcher_set_stdout_file_path.invokeExact(handle(), Interop.allocateNativeString(path).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_subprocess_launcher_setenv = Interop.downcallHandle(
        "g_subprocess_launcher_setenv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the environment variable {@code variable} in the environment of
     * processes launched from this launcher.
     * <p>
     * On UNIX, both the variable's name and value can be arbitrary byte
     * strings, except that the variable's name cannot contain '='.
     * On Windows, they should be in UTF-8.
     */
    public void setenv(java.lang.String variable, java.lang.String value, boolean overwrite) {
        try {
            g_subprocess_launcher_setenv.invokeExact(handle(), Interop.allocateNativeString(variable).handle(), Interop.allocateNativeString(value).handle(), overwrite ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_subprocess_launcher_spawnv = Interop.downcallHandle(
        "g_subprocess_launcher_spawnv",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a {@link Subprocess} given a provided array of arguments.
     */
    public Subprocess spawnv(java.lang.String[] argv) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_subprocess_launcher_spawnv.invokeExact(handle(), Interop.allocateNativeArray(argv).handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new Subprocess(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_subprocess_launcher_take_fd = Interop.downcallHandle(
        "g_subprocess_launcher_take_fd",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Transfer an arbitrary file descriptor from parent process to the
     * child.  This function takes ownership of the {@code source_fd}; it will be closed
     * in the parent when {@code self} is freed.
     * <p>
     * By default, all file descriptors from the parent will be closed.
     * This function allows you to create (for example) a custom {@code pipe()} or
     * {@code socketpair()} before launching the process, and choose the target
     * descriptor in the child.
     * <p>
     * An example use case is GNUPG, which has a command line argument
     * {@code --passphrase-fd} providing a file descriptor number where it expects
     * the passphrase to be written.
     */
    public void takeFd(int sourceFd, int targetFd) {
        try {
            g_subprocess_launcher_take_fd.invokeExact(handle(), sourceFd, targetFd);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_subprocess_launcher_take_stderr_fd = Interop.downcallHandle(
        "g_subprocess_launcher_take_stderr_fd",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the file descriptor to use as the stderr for spawned processes.
     * <p>
     * If {@code fd} is -1 then any previously given fd is unset.
     * <p>
     * Note that the default behaviour is to pass stderr through to the
     * stderr of the parent process.
     * <p>
     * The passed {@code fd} belongs to the {@link SubprocessLauncher}.  It will be
     * automatically closed when the launcher is finalized.  The file
     * descriptor will also be closed on the child side when executing the
     * spawned process.
     * <p>
     * You may not set a stderr fd if a stderr file path is already set or
     * if the launcher flags contain any flags directing stderr elsewhere.
     * <p>
     * This feature is only available on UNIX.
     */
    public void takeStderrFd(int fd) {
        try {
            g_subprocess_launcher_take_stderr_fd.invokeExact(handle(), fd);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_subprocess_launcher_take_stdin_fd = Interop.downcallHandle(
        "g_subprocess_launcher_take_stdin_fd",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the file descriptor to use as the stdin for spawned processes.
     * <p>
     * If {@code fd} is -1 then any previously given fd is unset.
     * <p>
     * Note that if your intention is to have the stdin of the calling
     * process inherited by the child then {@link SubprocessFlags#STDIN_INHERIT}
     * is a better way to go about doing that.
     * <p>
     * The passed {@code fd} is noted but will not be touched in the current
     * process.  It is therefore necessary that it be kept open by the
     * caller until the subprocess is spawned.  The file descriptor will
     * also not be explicitly closed on the child side, so it must be marked
     * O_CLOEXEC if that's what you want.
     * <p>
     * You may not set a stdin fd if a stdin file path is already set or if
     * the launcher flags contain any flags directing stdin elsewhere.
     * <p>
     * This feature is only available on UNIX.
     */
    public void takeStdinFd(int fd) {
        try {
            g_subprocess_launcher_take_stdin_fd.invokeExact(handle(), fd);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_subprocess_launcher_take_stdout_fd = Interop.downcallHandle(
        "g_subprocess_launcher_take_stdout_fd",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the file descriptor to use as the stdout for spawned processes.
     * <p>
     * If {@code fd} is -1 then any previously given fd is unset.
     * <p>
     * Note that the default behaviour is to pass stdout through to the
     * stdout of the parent process.
     * <p>
     * The passed {@code fd} is noted but will not be touched in the current
     * process.  It is therefore necessary that it be kept open by the
     * caller until the subprocess is spawned.  The file descriptor will
     * also not be explicitly closed on the child side, so it must be marked
     * O_CLOEXEC if that's what you want.
     * <p>
     * You may not set a stdout fd if a stdout file path is already set or
     * if the launcher flags contain any flags directing stdout elsewhere.
     * <p>
     * This feature is only available on UNIX.
     */
    public void takeStdoutFd(int fd) {
        try {
            g_subprocess_launcher_take_stdout_fd.invokeExact(handle(), fd);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_subprocess_launcher_unsetenv = Interop.downcallHandle(
        "g_subprocess_launcher_unsetenv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes the environment variable {@code variable} from the environment of
     * processes launched from this launcher.
     * <p>
     * On UNIX, the variable's name can be an arbitrary byte string not
     * containing '='. On Windows, it should be in UTF-8.
     */
    public void unsetenv(java.lang.String variable) {
        try {
            g_subprocess_launcher_unsetenv.invokeExact(handle(), Interop.allocateNativeString(variable).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
