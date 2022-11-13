package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link ApplicationCommandLine} represents a command-line invocation of
 * an application.  It is created by {@link Application} and emitted
 * in the {@link Application}::command-line signal and virtual function.
 * <p>
 * The class contains the list of arguments that the program was invoked
 * with.  It is also possible to query if the commandline invocation was
 * local (ie: the current process is running in direct response to the
 * invocation) or remote (ie: some other process forwarded the
 * commandline to this process).
 * <p>
 * The GApplicationCommandLine object can provide the {@code argc} and {@code argv}
 * parameters for use with the {@link org.gtk.glib.OptionContext} command-line parsing API,
 * with the g_application_command_line_get_arguments() function. See
 * [gapplication-example-cmdline3.c][gapplication-example-cmdline3]
 * for an example.
 * <p>
 * The exit status of the originally-invoked process may be set and
 * messages can be printed to stdout or stderr of that process.  The
 * lifecycle of the originally-invoked process is tied to the lifecycle
 * of this object (ie: the process exits when the last reference is
 * dropped).
 * <p>
 * The main use for {@link ApplicationCommandLine} (and the
 * {@link Application}::command-line signal) is 'Emacs server' like use cases:
 * You can set the {@code EDITOR} environment variable to have e.g. git use
 * your favourite editor to edit commit messages, and if you already
 * have an instance of the editor running, the editing will happen
 * in the running instance, instead of opening a new one. An important
 * aspect of this use case is that the process that gets started by git
 * does not return until the editing is done.
 * <p>
 * Normally, the commandline is completely handled in the
 * {@link Application}::command-line handler. The launching instance exits
 * once the signal handler in the primary instance has returned, and
 * the return value of the signal handler becomes the exit status
 * of the launching instance.
 * <pre>{@code <!-- language="C" -->
 * static int
 * command_line (GApplication            *application,
 *               GApplicationCommandLine *cmdline)
 * {
 *   gchar **argv;
 *   gint argc;
 *   gint i;
 * 
 *   argv = g_application_command_line_get_arguments (cmdline, &argc);
 * 
 *   g_application_command_line_print (cmdline,
 *                                     "This text is written back\\n"
 *                                     "to stdout of the caller\\n");
 * 
 *   for (i = 0; i < argc; i++)
 *     g_print ("argument %d: %s\\n", i, argv[i]);
 * 
 *   g_strfreev (argv);
 * 
 *   return 0;
 * }
 * }</pre>
 * The complete example can be found here:
 * <a href="https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gapplication-example-cmdline.c">gapplication-example-cmdline.c</a>
 * <p>
 * In more complicated cases, the handling of the commandline can be
 * split between the launcher and the primary instance.
 * <pre>{@code <!-- language="C" -->
 * static gboolean
 *  test_local_cmdline (GApplication   *application,
 *                      gchar        ***arguments,
 *                      gint           *exit_status)
 * {
 *   gint i, j;
 *   gchar **argv;
 * 
 *   argv = *arguments;
 * 
 *   if (argv[0] == NULL)
 *     {
 *       *exit_status = 0;
 *       return FALSE;
 *     }
 * 
 *   i = 1;
 *   while (argv[i])
 *     {
 *       if (g_str_has_prefix (argv[i], "--local-"))
 *         {
 *           g_print ("handling argument %s locally\\n", argv[i]);
 *           g_free (argv[i]);
 *           for (j = i; argv[j]; j++)
 *             argv[j] = argv[j + 1];
 *         }
 *       else
 *         {
 *           g_print ("not handling argument %s locally\\n", argv[i]);
 *           i++;
 *         }
 *     }
 * 
 *   *exit_status = 0;
 * 
 *   return FALSE;
 * }
 * 
 * static void
 * test_application_class_init (TestApplicationClass *class)
 * {
 *   G_APPLICATION_CLASS (class)->local_command_line = test_local_cmdline;
 * 
 *   ...
 * }
 * }</pre>
 * In this example of split commandline handling, options that start
 * with {@code --local-} are handled locally, all other options are passed
 * to the {@link Application}::command-line handler which runs in the primary
 * instance.
 * <p>
 * The complete example can be found here:
 * <a href="https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gapplication-example-cmdline2.c">gapplication-example-cmdline2.c</a>
 * <p>
 * If handling the commandline requires a lot of work, it may
 * be better to defer it.
 * <pre>{@code <!-- language="C" -->
 * static gboolean
 * my_cmdline_handler (gpointer data)
 * {
 *   GApplicationCommandLine *cmdline = data;
 * 
 *   // do the heavy lifting in an idle
 * 
 *   g_application_command_line_set_exit_status (cmdline, 0);
 *   g_object_unref (cmdline); // this releases the application
 * 
 *   return G_SOURCE_REMOVE;
 * }
 * 
 * static int
 * command_line (GApplication            *application,
 *               GApplicationCommandLine *cmdline)
 * {
 *   // keep the application running until we are done with this commandline
 *   g_application_hold (application);
 * 
 *   g_object_set_data_full (G_OBJECT (cmdline),
 *                           "application", application,
 *                           (GDestroyNotify)g_application_release);
 * 
 *   g_object_ref (cmdline);
 *   g_idle_add (my_cmdline_handler, cmdline);
 * 
 *   return 0;
 * }
 * }</pre>
 * In this example the commandline is not completely handled before
 * the {@link Application}::command-line handler returns. Instead, we keep
 * a reference to the {@link ApplicationCommandLine} object and handle it
 * later (in this example, in an idle). Note that it is necessary to
 * hold the application until you are done with the commandline.
 * <p>
 * The complete example can be found here:
 * <a href="https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gapplication-example-cmdline3.c">gapplication-example-cmdline3.c</a>
 */
public class ApplicationCommandLine extends org.gtk.gobject.Object {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GApplicationCommandLine";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a ApplicationCommandLine proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ApplicationCommandLine(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ApplicationCommandLine if its GType is a (or inherits from) "GApplicationCommandLine".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ApplicationCommandLine} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GApplicationCommandLine", a ClassCastException will be thrown.
     */
    public static ApplicationCommandLine castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GApplicationCommandLine"))) {
            return new ApplicationCommandLine(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GApplicationCommandLine");
        }
    }
    
    /**
     * Creates a {@link File} corresponding to a filename that was given as part
     * of the invocation of {@code cmdline}.
     * <p>
     * This differs from g_file_new_for_commandline_arg() in that it
     * resolves relative pathnames using the current working directory of
     * the invoking process rather than the local process.
     * @param arg an argument from {@code cmdline}
     * @return a new {@link File}
     */
    public @NotNull org.gtk.gio.File createFileForArg(@NotNull java.lang.String arg) {
        java.util.Objects.requireNonNull(arg, "Parameter 'arg' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_application_command_line_create_file_for_arg.invokeExact(
                    handle(),
                    Interop.allocateNativeString(arg));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.File.FileImpl(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the list of arguments that was passed on the command line.
     * <p>
     * The strings in the array may contain non-UTF-8 data on UNIX (such as
     * filenames or arguments given in the system locale) but are always in
     * UTF-8 on Windows.
     * <p>
     * If you wish to use the return value with {@link org.gtk.glib.OptionContext}, you must
     * use g_option_context_parse_strv().
     * <p>
     * The return value is {@code null}-terminated and should be freed using
     * g_strfreev().
     * @param argc the length of the arguments array, or {@code null}
     * @return the string array containing the arguments (the argv)
     */
    public @NotNull java.lang.String[] getArguments(Out<Integer> argc) {
        java.util.Objects.requireNonNull(argc, "Parameter 'argc' must not be null");
        MemorySegment argcPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_application_command_line_get_arguments.invokeExact(
                    handle(),
                    (Addressable) argcPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        argc.set(argcPOINTER.get(ValueLayout.JAVA_INT, 0));
        java.lang.String[] resultARRAY = new java.lang.String[argc.get().intValue()];
        for (int I = 0; I < argc.get().intValue(); I++) {
            var OBJ = RESULT.get(ValueLayout.ADDRESS, I);
            resultARRAY[I] = Interop.getStringFrom(OBJ);
        }
        return resultARRAY;
    }
    
    /**
     * Gets the working directory of the command line invocation.
     * The string may contain non-utf8 data.
     * <p>
     * It is possible that the remote application did not send a working
     * directory, so this may be {@code null}.
     * <p>
     * The return value should not be modified or freed and is valid for as
     * long as {@code cmdline} exists.
     * @return the current directory, or {@code null}
     */
    public @Nullable java.lang.String getCwd() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_application_command_line_get_cwd.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the contents of the 'environ' variable of the command line
     * invocation, as would be returned by g_get_environ(), ie as a
     * {@code null}-terminated list of strings in the form 'NAME=VALUE'.
     * The strings may contain non-utf8 data.
     * <p>
     * The remote application usually does not send an environment.  Use
     * {@link ApplicationFlags#SEND_ENVIRONMENT} to affect that.  Even with this flag
     * set it is possible that the environment is still not available (due
     * to invocation messages from other applications).
     * <p>
     * The return value should not be modified or freed and is valid for as
     * long as {@code cmdline} exists.
     * <p>
     * See g_application_command_line_getenv() if you are only interested
     * in the value of a single environment variable.
     * @return the environment strings, or {@code null} if they were not sent
     */
    public @NotNull PointerString getEnviron() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_application_command_line_get_environ.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Gets the exit status of {@code cmdline}.  See
     * g_application_command_line_set_exit_status() for more information.
     * @return the exit status
     */
    public int getExitStatus() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_application_command_line_get_exit_status.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Determines if {@code cmdline} represents a remote invocation.
     * @return {@code true} if the invocation was remote
     */
    public boolean getIsRemote() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_application_command_line_get_is_remote.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the options there were passed to g_application_command_line().
     * <p>
     * If you did not override local_command_line() then these are the same
     * options that were parsed according to the {@code GOptionEntrys} added to the
     * application with g_application_add_main_option_entries() and possibly
     * modified from your GApplication::handle-local-options handler.
     * <p>
     * If no options were sent then an empty dictionary is returned so that
     * you don't need to check for {@code null}.
     * @return a {@link org.gtk.glib.VariantDict} with the options
     */
    public @NotNull org.gtk.glib.VariantDict getOptionsDict() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_application_command_line_get_options_dict.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.VariantDict(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the platform data associated with the invocation of {@code cmdline}.
     * <p>
     * This is a {@link org.gtk.glib.Variant} dictionary containing information about the
     * context in which the invocation occurred.  It typically contains
     * information like the current working directory and the startup
     * notification ID.
     * <p>
     * For local invocation, it will be {@code null}.
     * @return the platform data, or {@code null}
     */
    public @Nullable org.gtk.glib.Variant getPlatformData() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_application_command_line_get_platform_data.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Variant(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the stdin of the invoking process.
     * <p>
     * The {@link InputStream} can be used to read data passed to the standard
     * input of the invoking process.
     * This doesn't work on all platforms.  Presently, it is only available
     * on UNIX when using a D-Bus daemon capable of passing file descriptors.
     * If stdin is not available then {@code null} will be returned.  In the
     * future, support may be expanded to other platforms.
     * <p>
     * You must only call this function once per commandline invocation.
     * @return a {@link InputStream} for stdin
     */
    public @Nullable org.gtk.gio.InputStream getStdin() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_application_command_line_get_stdin.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.InputStream(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the value of a particular environment variable of the command
     * line invocation, as would be returned by g_getenv().  The strings may
     * contain non-utf8 data.
     * <p>
     * The remote application usually does not send an environment.  Use
     * {@link ApplicationFlags#SEND_ENVIRONMENT} to affect that.  Even with this flag
     * set it is possible that the environment is still not available (due
     * to invocation messages from other applications).
     * <p>
     * The return value should not be modified or freed and is valid for as
     * long as {@code cmdline} exists.
     * @param name the environment variable to get
     * @return the value of the variable, or {@code null} if unset or unsent
     */
    public @Nullable java.lang.String getenv(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_application_command_line_getenv.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Formats a message and prints it using the stdout print handler in the
     * invoking process.
     * <p>
     * If {@code cmdline} is a local invocation then this is exactly equivalent to
     * g_print().  If {@code cmdline} is remote then this is equivalent to calling
     * g_print() in the invoking process.
     * @param format a printf-style format string
     * @param varargs arguments, as per {@code format}
     */
    public void print(@NotNull java.lang.String format, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        try {
            DowncallHandles.g_application_command_line_print.invokeExact(
                    handle(),
                    Interop.allocateNativeString(format),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Formats a message and prints it using the stderr print handler in the
     * invoking process.
     * <p>
     * If {@code cmdline} is a local invocation then this is exactly equivalent to
     * g_printerr().  If {@code cmdline} is remote then this is equivalent to
     * calling g_printerr() in the invoking process.
     * @param format a printf-style format string
     * @param varargs arguments, as per {@code format}
     */
    public void printerr(@NotNull java.lang.String format, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        try {
            DowncallHandles.g_application_command_line_printerr.invokeExact(
                    handle(),
                    Interop.allocateNativeString(format),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the exit status that will be used when the invoking process
     * exits.
     * <p>
     * The return value of the {@link Application}::command-line signal is
     * passed to this function when the handler returns.  This is the usual
     * way of setting the exit status.
     * <p>
     * In the event that you want the remote invocation to continue running
     * and want to decide on the exit status in the future, you can use this
     * call.  For the case of a remote invocation, the remote process will
     * typically exit when the last reference is dropped on {@code cmdline}.  The
     * exit status of the remote process will be equal to the last value
     * that was set with this function.
     * <p>
     * In the case that the commandline invocation is local, the situation
     * is slightly more complicated.  If the commandline invocation results
     * in the mainloop running (ie: because the use-count of the application
     * increased to a non-zero value) then the application is considered to
     * have been 'successful' in a certain sense, and the exit status is
     * always zero.  If the application use count is zero, though, the exit
     * status of the local {@link ApplicationCommandLine} is used.
     * @param exitStatus the exit status
     */
    public void setExitStatus(int exitStatus) {
        try {
            DowncallHandles.g_application_command_line_set_exit_status.invokeExact(
                    handle(),
                    exitStatus);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_application_command_line_create_file_for_arg = Interop.downcallHandle(
            "g_application_command_line_create_file_for_arg",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_command_line_get_arguments = Interop.downcallHandle(
            "g_application_command_line_get_arguments",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_command_line_get_cwd = Interop.downcallHandle(
            "g_application_command_line_get_cwd",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_command_line_get_environ = Interop.downcallHandle(
            "g_application_command_line_get_environ",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_command_line_get_exit_status = Interop.downcallHandle(
            "g_application_command_line_get_exit_status",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_command_line_get_is_remote = Interop.downcallHandle(
            "g_application_command_line_get_is_remote",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_command_line_get_options_dict = Interop.downcallHandle(
            "g_application_command_line_get_options_dict",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_command_line_get_platform_data = Interop.downcallHandle(
            "g_application_command_line_get_platform_data",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_command_line_get_stdin = Interop.downcallHandle(
            "g_application_command_line_get_stdin",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_command_line_getenv = Interop.downcallHandle(
            "g_application_command_line_getenv",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_command_line_print = Interop.downcallHandle(
            "g_application_command_line_print",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle g_application_command_line_printerr = Interop.downcallHandle(
            "g_application_command_line_printerr",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle g_application_command_line_set_exit_status = Interop.downcallHandle(
            "g_application_command_line_set_exit_status",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
    }
}
