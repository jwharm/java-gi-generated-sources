package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This class contains a set of options for launching child processes,
 * such as where its standard input and output will be directed, the
 * argument list, the environment, and more.
 * <p>
 * While the {@link Subprocess} class has high level functions covering
 * popular cases, use of this class allows access to more advanced
 * options.  It can also be used to launch multiple subprocesses with
 * a similar configuration.
 * @version 2.40
 */
public class SubprocessLauncher extends org.gtk.gobject.Object {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSubprocessLauncher";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public SubprocessLauncher(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to SubprocessLauncher if its GType is a (or inherits from) "GSubprocessLauncher".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "SubprocessLauncher" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GSubprocessLauncher", a ClassCastException will be thrown.
     */
    public static SubprocessLauncher castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GSubprocessLauncher"))) {
            return new SubprocessLauncher(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GSubprocessLauncher");
        }
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.gio.SubprocessFlags flags) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_subprocess_launcher_new.invokeExact(
                    flags.getValue()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link SubprocessLauncher}.
     * <p>
     * The launcher is created with the default options.  A copy of the
     * environment of the calling process is made at the time of this call
     * and will be used as the environment that the process is launched in.
     * @param flags {@link SubprocessFlags}
     */
    public SubprocessLauncher(@NotNull org.gtk.gio.SubprocessFlags flags) {
        super(constructNew(flags));
    }
    
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
            DowncallHandles.g_subprocess_launcher_close.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the value of the environment variable {@code variable} in the
     * environment of processes launched from this launcher.
     * <p>
     * On UNIX, the returned string can be an arbitrary byte string.
     * On Windows, it will be UTF-8.
     * @param variable the environment variable to get
     * @return the value of the environment variable,
     *     {@code null} if unset
     */
    public @Nullable java.lang.String getenv(@NotNull java.lang.String variable) {
        java.util.Objects.requireNonNull(variable, "Parameter 'variable' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_subprocess_launcher_getenv.invokeExact(
                    handle(),
                    Interop.allocateNativeString(variable));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
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
     * @param childSetup a {@link org.gtk.glib.SpawnChildSetupFunc} to use as the child setup function
     */
    public void setChildSetup(@NotNull org.gtk.glib.SpawnChildSetupFunc childSetup) {
        java.util.Objects.requireNonNull(childSetup, "Parameter 'childSetup' must not be null");
        try {
            DowncallHandles.g_subprocess_launcher_set_child_setup.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbSpawnChildSetupFunc",
                            MethodType.methodType(void.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(childSetup)),
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the current working directory that processes will be launched
     * with.
     * <p>
     * By default processes are launched with the current working directory
     * of the launching process at the time of launch.
     * @param cwd the cwd for launched processes
     */
    public void setCwd(@NotNull java.lang.String cwd) {
        java.util.Objects.requireNonNull(cwd, "Parameter 'cwd' must not be null");
        try {
            DowncallHandles.g_subprocess_launcher_set_cwd.invokeExact(
                    handle(),
                    Interop.allocateNativeString(cwd));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param env the replacement environment
     */
    public void setEnviron(java.lang.String[] env) {
        java.util.Objects.requireNonNull(env, "Parameter 'env' must not be null");
        try {
            DowncallHandles.g_subprocess_launcher_set_environ.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(env, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param flags {@link SubprocessFlags}
     */
    public void setFlags(@NotNull org.gtk.gio.SubprocessFlags flags) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_subprocess_launcher_set_flags.invokeExact(
                    handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the file path to use as the stderr for spawned processes.
     * <p>
     * If {@code path} is {@code null} then any previously given path is unset.
     * <p>
     * The file will be created or truncated when the process is spawned, as
     * would be the case if using '2&gt;' at the shell.
     * <p>
     * If you want to send both stdout and stderr to the same file then use
     * {@link SubprocessFlags#STDERR_MERGE}.
     * <p>
     * You may not set a stderr file path if a stderr fd is already set or
     * if the launcher flags contain any flags directing stderr elsewhere.
     * <p>
     * This feature is only available on UNIX.
     * @param path a filename or {@code null}
     */
    public void setStderrFilePath(@Nullable java.lang.String path) {
        try {
            DowncallHandles.g_subprocess_launcher_set_stderr_file_path.invokeExact(
                    handle(),
                    (Addressable) (path == null ? MemoryAddress.NULL : Interop.allocateNativeString(path)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
    public void setStdinFilePath(@NotNull java.lang.String path) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        try {
            DowncallHandles.g_subprocess_launcher_set_stdin_file_path.invokeExact(
                    handle(),
                    Interop.allocateNativeString(path));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the file path to use as the stdout for spawned processes.
     * <p>
     * If {@code path} is {@code null} then any previously given path is unset.
     * <p>
     * The file will be created or truncated when the process is spawned, as
     * would be the case if using '&gt;' at the shell.
     * <p>
     * You may not set a stdout file path if a stdout fd is already set or
     * if the launcher flags contain any flags directing stdout elsewhere.
     * <p>
     * This feature is only available on UNIX.
     * @param path a filename or {@code null}
     */
    public void setStdoutFilePath(@Nullable java.lang.String path) {
        try {
            DowncallHandles.g_subprocess_launcher_set_stdout_file_path.invokeExact(
                    handle(),
                    (Addressable) (path == null ? MemoryAddress.NULL : Interop.allocateNativeString(path)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the environment variable {@code variable} in the environment of
     * processes launched from this launcher.
     * <p>
     * On UNIX, both the variable's name and value can be arbitrary byte
     * strings, except that the variable's name cannot contain '='.
     * On Windows, they should be in UTF-8.
     * @param variable the environment variable to set,
     *     must not contain '='
     * @param value the new value for the variable
     * @param overwrite whether to change the variable if it already exists
     */
    public void setenv(@NotNull java.lang.String variable, @NotNull java.lang.String value, boolean overwrite) {
        java.util.Objects.requireNonNull(variable, "Parameter 'variable' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.g_subprocess_launcher_setenv.invokeExact(
                    handle(),
                    Interop.allocateNativeString(variable),
                    Interop.allocateNativeString(value),
                    overwrite ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@link Subprocess} given a provided varargs list of arguments.
     * @param error Error
     * @param argv0 Command line arguments
     * @return A new {@link Subprocess}, or {@code null} on error (and {@code error} will be set)
     */
    public @NotNull org.gtk.gio.Subprocess spawn(@NotNull PointerProxy<org.gtk.glib.Error> error, @NotNull java.lang.String argv0) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Creates a {@link Subprocess} given a provided array of arguments.
     * @param argv Command line arguments
     * @return A new {@link Subprocess}, or {@code null} on error (and {@code error} will be set)
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.gio.Subprocess spawnv(java.lang.String[] argv) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(argv, "Parameter 'argv' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_subprocess_launcher_spawnv.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(argv, false), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.Subprocess(Refcounted.get(RESULT, true));
    }
    
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
     * @param sourceFd File descriptor in parent process
     * @param targetFd Target descriptor for child process
     */
    public void takeFd(int sourceFd, int targetFd) {
        try {
            DowncallHandles.g_subprocess_launcher_take_fd.invokeExact(
                    handle(),
                    sourceFd,
                    targetFd);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param fd a file descriptor, or -1
     */
    public void takeStderrFd(int fd) {
        try {
            DowncallHandles.g_subprocess_launcher_take_stderr_fd.invokeExact(
                    handle(),
                    fd);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param fd a file descriptor, or -1
     */
    public void takeStdinFd(int fd) {
        try {
            DowncallHandles.g_subprocess_launcher_take_stdin_fd.invokeExact(
                    handle(),
                    fd);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param fd a file descriptor, or -1
     */
    public void takeStdoutFd(int fd) {
        try {
            DowncallHandles.g_subprocess_launcher_take_stdout_fd.invokeExact(
                    handle(),
                    fd);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes the environment variable {@code variable} from the environment of
     * processes launched from this launcher.
     * <p>
     * On UNIX, the variable's name can be an arbitrary byte string not
     * containing '='. On Windows, it should be in UTF-8.
     * @param variable the environment variable to unset,
     *     must not contain '='
     */
    public void unsetenv(@NotNull java.lang.String variable) {
        java.util.Objects.requireNonNull(variable, "Parameter 'variable' must not be null");
        try {
            DowncallHandles.g_subprocess_launcher_unsetenv.invokeExact(
                    handle(),
                    Interop.allocateNativeString(variable));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_subprocess_launcher_new = Interop.downcallHandle(
            "g_subprocess_launcher_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_subprocess_launcher_close = Interop.downcallHandle(
            "g_subprocess_launcher_close",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_subprocess_launcher_getenv = Interop.downcallHandle(
            "g_subprocess_launcher_getenv",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_subprocess_launcher_set_child_setup = Interop.downcallHandle(
            "g_subprocess_launcher_set_child_setup",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_subprocess_launcher_set_cwd = Interop.downcallHandle(
            "g_subprocess_launcher_set_cwd",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_subprocess_launcher_set_environ = Interop.downcallHandle(
            "g_subprocess_launcher_set_environ",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_subprocess_launcher_set_flags = Interop.downcallHandle(
            "g_subprocess_launcher_set_flags",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_subprocess_launcher_set_stderr_file_path = Interop.downcallHandle(
            "g_subprocess_launcher_set_stderr_file_path",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_subprocess_launcher_set_stdin_file_path = Interop.downcallHandle(
            "g_subprocess_launcher_set_stdin_file_path",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_subprocess_launcher_set_stdout_file_path = Interop.downcallHandle(
            "g_subprocess_launcher_set_stdout_file_path",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_subprocess_launcher_setenv = Interop.downcallHandle(
            "g_subprocess_launcher_setenv",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_subprocess_launcher_spawn = Interop.downcallHandle(
            "g_subprocess_launcher_spawn",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_subprocess_launcher_spawnv = Interop.downcallHandle(
            "g_subprocess_launcher_spawnv",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_subprocess_launcher_take_fd = Interop.downcallHandle(
            "g_subprocess_launcher_take_fd",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_subprocess_launcher_take_stderr_fd = Interop.downcallHandle(
            "g_subprocess_launcher_take_stderr_fd",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_subprocess_launcher_take_stdin_fd = Interop.downcallHandle(
            "g_subprocess_launcher_take_stdin_fd",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_subprocess_launcher_take_stdout_fd = Interop.downcallHandle(
            "g_subprocess_launcher_take_stdout_fd",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_subprocess_launcher_unsetenv = Interop.downcallHandle(
            "g_subprocess_launcher_unsetenv",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
