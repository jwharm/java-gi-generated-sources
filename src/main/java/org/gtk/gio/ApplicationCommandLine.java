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
public class ApplicationCommandLine extends org.gtk.gobject.GObject {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GApplicationCommandLine";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a ApplicationCommandLine proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ApplicationCommandLine(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ApplicationCommandLine> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ApplicationCommandLine(input);
    
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
    public org.gtk.gio.File createFileForArg(java.lang.String arg) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_application_command_line_create_file_for_arg.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(arg, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = (org.gtk.gio.File) Interop.register(RESULT, org.gtk.gio.File.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
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
    public java.lang.String[] getArguments(Out<Integer> argc) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment argcPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_application_command_line_get_arguments.invokeExact(
                        handle(),
                        (Addressable) (argc == null ? MemoryAddress.NULL : (Addressable) argcPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (argc != null) argc.set(argcPOINTER.get(Interop.valueLayout.C_INT, 0));
            java.lang.String[] resultARRAY = new java.lang.String[argc.get().intValue()];
            for (int I = 0; I < argc.get().intValue(); I++) {
                var OBJ = RESULT.get(Interop.valueLayout.ADDRESS, I);
                resultARRAY[I] = Marshal.addressToString.marshal(OBJ, null);
            }
            return resultARRAY;
        }
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
            RESULT = (MemoryAddress) DowncallHandles.g_application_command_line_get_cwd.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
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
    public PointerString getEnviron() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_application_command_line_get_environ.invokeExact(handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerString(RESULT);
        }
    }
    
    /**
     * Gets the exit status of {@code cmdline}.  See
     * g_application_command_line_set_exit_status() for more information.
     * @return the exit status
     */
    public int getExitStatus() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_application_command_line_get_exit_status.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.g_application_command_line_get_is_remote.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
    public org.gtk.glib.VariantDict getOptionsDict() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_application_command_line_get_options_dict.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.VariantDict.fromAddress.marshal(RESULT, null);
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
            RESULT = (MemoryAddress) DowncallHandles.g_application_command_line_get_platform_data.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.Variant.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
            RESULT = (MemoryAddress) DowncallHandles.g_application_command_line_get_stdin.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gtk.gio.InputStream) Interop.register(RESULT, org.gtk.gio.InputStream.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
    public @Nullable java.lang.String getenv(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_application_command_line_getenv.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.addressToString.marshal(RESULT, null);
        }
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
    public void print(java.lang.String format, java.lang.Object... varargs) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_application_command_line_print.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(format, SCOPE),
                        varargs);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
    public void printerr(java.lang.String format, java.lang.Object... varargs) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_application_command_line_printerr.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(format, SCOPE),
                        varargs);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_application_command_line_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link ApplicationCommandLine.Builder} object constructs a {@link ApplicationCommandLine} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ApplicationCommandLine.Builder#build()}. 
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
         * Finish building the {@link ApplicationCommandLine} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ApplicationCommandLine}.
         * @return A new instance of {@code ApplicationCommandLine} with the properties 
         *         that were set in the Builder object.
         */
        public ApplicationCommandLine build() {
            return (ApplicationCommandLine) org.gtk.gobject.GObject.newWithProperties(
                ApplicationCommandLine.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setArguments(org.gtk.glib.Variant arguments) {
            names.add("arguments");
            values.add(org.gtk.gobject.Value.create(arguments));
            return this;
        }
        
        public Builder setIsRemote(boolean isRemote) {
            names.add("is-remote");
            values.add(org.gtk.gobject.Value.create(isRemote));
            return this;
        }
        
        public Builder setOptions(org.gtk.glib.Variant options) {
            names.add("options");
            values.add(org.gtk.gobject.Value.create(options));
            return this;
        }
        
        public Builder setPlatformData(org.gtk.glib.Variant platformData) {
            names.add("platform-data");
            values.add(org.gtk.gobject.Value.create(platformData));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_application_command_line_create_file_for_arg = Interop.downcallHandle(
                "g_application_command_line_create_file_for_arg",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_application_command_line_get_arguments = Interop.downcallHandle(
                "g_application_command_line_get_arguments",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_application_command_line_get_cwd = Interop.downcallHandle(
                "g_application_command_line_get_cwd",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_application_command_line_get_environ = Interop.downcallHandle(
                "g_application_command_line_get_environ",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_application_command_line_get_exit_status = Interop.downcallHandle(
                "g_application_command_line_get_exit_status",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_application_command_line_get_is_remote = Interop.downcallHandle(
                "g_application_command_line_get_is_remote",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_application_command_line_get_options_dict = Interop.downcallHandle(
                "g_application_command_line_get_options_dict",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_application_command_line_get_platform_data = Interop.downcallHandle(
                "g_application_command_line_get_platform_data",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_application_command_line_get_stdin = Interop.downcallHandle(
                "g_application_command_line_get_stdin",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_application_command_line_getenv = Interop.downcallHandle(
                "g_application_command_line_getenv",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_application_command_line_print = Interop.downcallHandle(
                "g_application_command_line_print",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                true
        );
        
        private static final MethodHandle g_application_command_line_printerr = Interop.downcallHandle(
                "g_application_command_line_printerr",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                true
        );
        
        private static final MethodHandle g_application_command_line_set_exit_status = Interop.downcallHandle(
                "g_application_command_line_set_exit_status",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_application_command_line_get_type = Interop.downcallHandle(
                "g_application_command_line_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_application_command_line_get_type != null;
    }
}
