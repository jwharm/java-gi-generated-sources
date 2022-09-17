package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GApplicationCommandLine represents a command-line invocation of
 * an application.  It is created by #GApplication and emitted
 * in the #GApplication::command-line signal and virtual function.
 * <p>
 * The class contains the list of arguments that the program was invoked
 * with.  It is also possible to query if the commandline invocation was
 * local (ie: the current process is running in direct response to the
 * invocation) or remote (ie: some other process forwarded the
 * commandline to this process).
 * <p>
 * The GApplicationCommandLine object can provide the @argc and @argv
 * parameters for use with the #GOptionContext command-line parsing API,
 * with the g_application_command_line_get_arguments() function. See
 * {@link [gapplication-example-cmdline3.c]}{@link [gapplication-example-cmdline3]}
 * for an example.
 * <p>
 * The exit status of the originally-invoked process may be set and
 * messages can be printed to stdout or stderr of that process.  The
 * lifecycle of the originally-invoked process is tied to the lifecycle
 * of this object (ie: the process exits when the last reference is
 * dropped).
 * <p>
 * The main use for #GApplicationCommandLine (and the
 * <h1>pplication::command-line signal) is &#39;Emacs server&#39; like use cases:</h1>
 * You can set the <code>EDITOR</code> environment variable to have e.g. git use
 * your favourite editor to edit commit messages, and if you already
 * have an instance of the editor running, the editing will happen
 * in the running instance, instead of opening a new one. An important
 * aspect of this use case is that the process that gets started by git
 * does not return until the editing is done.
 * <p>
 * Normally, the commandline is completely handled in the
 * <h1>pplication::command-line handler. The launching instance exits</h1>
 * once the signal handler in the primary instance has returned, and
 * the return value of the signal handler becomes the exit status
 * of the launching instance.
 * |{@link [&#60;!-- language=&#34;C&#34; --&#62;
 * static int
 * command_line (GApplication            *application,
 *               GApplicationCommandLine *cmdline)
 * {
 *   gchar **argv;
 *   gint argc;
 *   gint i;
 * <p>
 *   argv = g_application_command_line_get_arguments (cmdline, &#38;argc);
 * <p>
 *   g_application_command_line_print (cmdline,
 *                                     &#34;This text is written back\\n&#34;
 *                                     &#34;to stdout of the caller\\n&#34;);
 * <p>
 *   for (i = 0; i &#60; argc; i++)
 *     g_print (&#34;argument <code>d:</code> <code>s\\n&#34;,</code> i, argv[i]});
 * <p>
 *   g_strfreev (argv);
 * <p>
 *   return 0;
 * }
 * ]|
 * The complete example can be found here:
 * {@link [gapplication-example-cmdline.c]}(https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gapplication-example-cmdline.c)
 * <p>
 * In more complicated cases, the handling of the commandline can be
 * split between the launcher and the primary instance.
 * |{@link [&#60;!-- language=&#34;C&#34; --&#62;
 * static gboolean
 *  test_local_cmdline (GApplication   *application,
 *                      gchar        ***arguments,
 *                      gint           *exit_status)
 * {
 *   gint i, j;
 *   gchar **argv;
 * <p>
 *   argv = *arguments;
 * <p>
 *   if (argv[0]} == NULL)
 *     {
 *       *exit_status = 0;
 *       return FALSE;
 *     }
 * <p>
 *   i = 1;
 *   while (argv{@link [i]})
 *     {
 *       if (g_str_has_prefix (argv{@link [i]}, &#34;--local-&#34;))
 *         {
 *           g_print (&#34;handling argument <code>s</code> locally\\n&#34;, argv{@link [i]});
 *           g_free (argv{@link [i]});
 *           for (j = i; argv{@link [j]}; j++)
 *             argv{@link [j]} = argv{@link [j + 1]};
 *         }
 *       else
 *         {
 *           g_print (&#34;not handling argument <code>s</code> locally\\n&#34;, argv{@link [i]});
 *           i++;
 *         }
 *     }
 * <p>
 *   *exit_status = 0;
 * <p>
 *   return FALSE;
 * }
 * <p>
 * static void
 * test_application_class_init (TestApplicationClass *class)
 * {
 *   G_APPLICATION_CLASS (class)-&#62;local_command_line = test_local_cmdline;
 * <p>
 *   ...
 * }
 * ]|
 * In this example of split commandline handling, options that start
 * with <code>--local-</code> are handled locally, all other options are passed
 * to the #GApplication::command-line handler which runs in the primary
 * instance.
 * 
 * The complete example can be found here:
 * {@link [gapplication-example-cmdline2.c]}(https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gapplication-example-cmdline2.c)
 * 
 * If handling the commandline requires a lot of work, it may
 * be better to defer it.
 * |{@link [&#60;!-- language=&#34;C&#34; --&#62;
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
 *                           &#34;application&#34;, application,
 *                           (GDestroyNotify)g_application_release);
 * 
 *   g_object_ref (cmdline);
 *   g_idle_add (my_cmdline_handler, cmdline);
 * 
 *   return 0;
 * }
 * ]}|
 * In this example the commandline is not completely handled before
 * the #GApplication::command-line handler returns. Instead, we keep
 * a reference to the #GApplicationCommandLine object and handle it
 * later (in this example, in an idle). Note that it is necessary to
 * hold the application until you are done with the commandline.
 * 
 * The complete example can be found here:
 * {@link [gapplication-example-cmdline3.c]}(https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gapplication-example-cmdline3.c)
 */
public class ApplicationCommandLine extends org.gtk.gobject.Object {

    public ApplicationCommandLine(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ApplicationCommandLine */
    public static ApplicationCommandLine castFrom(org.gtk.gobject.Object gobject) {
        return new ApplicationCommandLine(gobject.getReference());
    }
    
    /**
     * Creates a #GFile corresponding to a filename that was given as part
     * of the invocation of @cmdline.
     * 
     * This differs from g_file_new_for_commandline_arg() in that it
     * resolves relative pathnames using the current working directory of
     * the invoking process rather than the local process.
     */
    public File createFileForArg(java.lang.String arg) {
        var RESULT = gtk_h.g_application_command_line_create_file_for_arg(handle(), Interop.allocateNativeString(arg).handle());
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets the working directory of the command line invocation.
     * The string may contain non-utf8 data.
     * 
     * It is possible that the remote application did not send a working
     * directory, so this may be <code>NULL.
     * 
     * The</code> return value should not be modified or freed and is valid for as
     * long as @cmdline exists.
     */
    public java.lang.String getCwd() {
        var RESULT = gtk_h.g_application_command_line_get_cwd(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the exit status of @cmdline.  See
     * g_application_command_line_set_exit_status() for more information.
     */
    public int getExitStatus() {
        var RESULT = gtk_h.g_application_command_line_get_exit_status(handle());
        return RESULT;
    }
    
    /**
     * Determines if @cmdline represents a remote invocation.
     */
    public boolean getIsRemote() {
        var RESULT = gtk_h.g_application_command_line_get_is_remote(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the options there were passed to g_application_command_line().
     * 
     * If you did not override local_command_line() then these are the same
     * options that were parsed according to the #GOptionEntrys added to the
     * application with g_application_add_main_option_entries() and possibly
     * modified from your GApplication::handle-local-options handler.
     * 
     * If no options were sent then an empty dictionary is returned so that
     * you don&#39;t need to check for 
     *             
     *           
     *         
     *       
     *       
     *         Gets the options there were passed to g_application_command_line().
     * 
     * If you did not override local_command_line() then these are the same
     * options that were parsed according to the #GOptionEntrys added to the
     * application with g_application_add_main_option_entries() and possibly
     * modified from your GApplication::handle-local-options handler.
     * 
     * If no options were sent then an empty dictionary is returned so that
     * you don&#39;t need to check for %NULL.
     */
    public org.gtk.glib.VariantDict getOptionsDict() {
        var RESULT = gtk_h.g_application_command_line_get_options_dict(handle());
        return new org.gtk.glib.VariantDict(References.get(RESULT, false));
    }
    
    /**
     * Gets the platform data associated with the invocation of @cmdline.
     * 
     * This is a #GVariant dictionary containing information about the
     * context in which the invocation occurred.  It typically contains
     * information like the current working directory and the startup
     * notification ID.
     * 
     * For local invocation, it will be 
     *             
     *           
     *         
     *       
     *       
     *         Gets the platform data associated with the invocation of @cmdline.
     * 
     * This is a #GVariant dictionary containing information about the
     * context in which the invocation occurred.  It typically contains
     * information like the current working directory and the startup
     * notification ID.
     * 
     * For local invocation, it will be %NULL.
     */
    public org.gtk.glib.Variant getPlatformData() {
        var RESULT = gtk_h.g_application_command_line_get_platform_data(handle());
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Gets the stdin of the invoking process.
     * 
     * The #GInputStream can be used to read data passed to the standard
     * input of the invoking process.
     * This doesn&#39;t work on all platforms.  Presently, it is only available
     * on UNIX when using a D-Bus daemon capable of passing file descriptors.
     * If stdin is not available then <code>null</code> will be returned.  In the
     * future, support may be expanded to other platforms.
     * 
     * You must only call this function once per commandline invocation.
     */
    public InputStream getStdin() {
        var RESULT = gtk_h.g_application_command_line_get_stdin(handle());
        return new InputStream(References.get(RESULT, true));
    }
    
    /**
     * Gets the value of a particular environment variable of the command
     * line invocation, as would be returned by g_getenv().  The strings may
     * contain non-utf8 data.
     * 
     * The remote application usually does not send an environment.  Use
     * {@link org.gtk.gio.ApplicationFlags#SEND_ENVIRONMENT} to affect that.  Even with this flag
     * set it is possible that the environment is still not available (due
     * to invocation messages from other applications).
     * 
     * The return value should not be modified or freed and is valid for as
     * long as @cmdline exists.
     */
    public java.lang.String getenv(java.lang.String name) {
        var RESULT = gtk_h.g_application_command_line_getenv(handle(), Interop.allocateNativeString(name).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Sets the exit status that will be used when the invoking process
     * exits.
     * 
     * The return value of the #GApplication::command-line signal is
     * passed to this function when the handler returns.  This is the usual
     * way of setting the exit status.
     * 
     * In the event that you want the remote invocation to continue running
     * and want to decide on the exit status in the future, you can use this
     * call.  For the case of a remote invocation, the remote process will
     * typically exit when the last reference is dropped on @cmdline.  The
     * exit status of the remote process will be equal to the last value
     * that was set with this function.
     * 
     * In the case that the commandline invocation is local, the situation
     * is slightly more complicated.  If the commandline invocation results
     * in the mainloop running (ie: because the use-count of the application
     * increased to a non-zero value) then the application is considered to
     * have been &#39;successful&#39; in a certain sense, and the exit status is
     * always zero.  If the application use count is zero, though, the exit
     * status of the local #GApplicationCommandLine is used.
     */
    public void setExitStatus(int exitStatus) {
        gtk_h.g_application_command_line_set_exit_status(handle(), exitStatus);
    }
    
}
