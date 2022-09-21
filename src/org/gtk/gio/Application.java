package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link Application} is the foundation of an application.  It wraps some
 * low-level platform-specific services and is intended to act as the
 * foundation for higher-level application classes such as
 * {@link org.gtk.gtk.Application} or {@code MxApplication}.  In general, you should not use
 * this class outside of a higher level framework.
 * <p>
 * GApplication provides convenient life cycle management by maintaining
 * a "use count" for the primary application instance. The use count can
 * be changed using g_application_hold() and g_application_release(). If
 * it drops to zero, the application exits. Higher-level classes such as
 * {@link org.gtk.gtk.Application} employ the use count to ensure that the application
 * stays alive as long as it has any opened windows.
 * <p>
 * Another feature that GApplication (optionally) provides is process
 * uniqueness. Applications can make use of this functionality by
 * providing a unique application ID. If given, only one application
 * with this ID can be running at a time per session. The session
 * concept is platform-dependent, but corresponds roughly to a graphical
 * desktop login. When your application is launched again, its
 * arguments are passed through platform communication to the already
 * running program. The already running instance of the program is
 * called the "primary instance"; for non-unique applications this is
 * always the current instance. On Linux, the D-Bus session bus
 * is used for communication.
 * <p>
 * The use of {@link Application} differs from some other commonly-used
 * uniqueness libraries (such as libunique) in important ways. The
 * application is not expected to manually register itself and check
 * if it is the primary instance. Instead, the main() function of a
 * {@link Application} should do very little more than instantiating the
 * application instance, possibly connecting signal handlers, then
 * calling g_application_run(). All checks for uniqueness are done
 * internally. If the application is the primary instance then the
 * startup signal is emitted and the mainloop runs. If the application
 * is not the primary instance then a signal is sent to the primary
 * instance and g_application_run() promptly returns. See the code
 * examples below.
 * <p>
 * If used, the expected form of an application identifier is the same as
 * that of of a
 * <a href="https://dbus.freedesktop.org/doc/dbus-specification.html#message-protocol-names-bus">D-Bus well-known bus name</a>.
 * Examples include: {@code com.example.MyApp}, {@code org.example.internal_apps.Calculator},
 * {@code org._7_zip.Archiver}.
 * For details on valid application identifiers, see g_application_id_is_valid().
 * <p>
 * On Linux, the application identifier is claimed as a well-known bus name
 * on the user's session bus.  This means that the uniqueness of your
 * application is scoped to the current session.  It also means that your
 * application may provide additional services (through registration of other
 * object paths) at that bus name.  The registration of these object paths
 * should be done with the shared GDBus session bus.  Note that due to the
 * internal architecture of GDBus, method calls can be dispatched at any time
 * (even if a main loop is not running).  For this reason, you must ensure that
 * any object paths that you wish to register are registered before {@link Application}
 * attempts to acquire the bus name of your application (which happens in
 * g_application_register()).  Unfortunately, this means that you cannot use
 * g_application_get_is_remote() to decide if you want to register object paths.
 * <p>
 * GApplication also implements the {@link ActionGroup} and {@link ActionMap}
 * interfaces and lets you easily export actions by adding them with
 * g_action_map_add_action(). When invoking an action by calling
 * g_action_group_activate_action() on the application, it is always
 * invoked in the primary instance. The actions are also exported on
 * the session bus, and GIO provides the {@link DBusActionGroup} wrapper to
 * conveniently access them remotely. GIO provides a {@link DBusMenuModel} wrapper
 * for remote access to exported {@code GMenuModels}.
 * <p>
 * There is a number of different entry points into a GApplication:
 * <p>
 * <ul>
 * <li>via 'Activate' (i.e. just starting the application)
 * </ul>
 * <p>
 * <ul>
 * <li>via 'Open' (i.e. opening some files)
 * </ul>
 * <p>
 * <ul>
 * <li>by handling a command-line
 * </ul>
 * <p>
 * <ul>
 * <li>via activating an action
 * </ul>
 * <p>
 * The {@link Application}::startup signal lets you handle the application
 * initialization for all of these in a single place.
 * <p>
 * Regardless of which of these entry points is used to start the
 * application, GApplication passes some ‘platform data’ from the
 * launching instance to the primary instance, in the form of a
 * {@link org.gtk.glib.Variant} dictionary mapping strings to variants. To use platform
 * data, override the {@code before_emit} or {@code after_emit} virtual functions
 * in your {@link Application} subclass. When dealing with
 * {@link ApplicationCommandLine} objects, the platform data is
 * directly available via g_application_command_line_get_cwd(),
 * g_application_command_line_get_environ() and
 * g_application_command_line_get_platform_data().
 * <p>
 * As the name indicates, the platform data may vary depending on the
 * operating system, but it always includes the current directory (key
 * "cwd"), and optionally the environment (ie the set of environment
 * variables and their values) of the calling process (key "environ").
 * The environment is only added to the platform data if the
 * {@link ApplicationFlags#SEND_ENVIRONMENT} flag is set. {@link Application} subclasses
 * can add their own platform data by overriding the {@code add_platform_data}
 * virtual function. For instance, {@link org.gtk.gtk.Application} adds startup notification
 * data in this way.
 * <p>
 * To parse commandline arguments you may handle the
 * {@link Application}::command-line signal or override the local_command_line()
 * vfunc, to parse them in either the primary instance or the local instance,
 * respectively.
 * <p>
 * For an example of opening files with a GApplication, see
 * <a href="https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gapplication-example-open.c">gapplication-example-open.c</a>.
 * <p>
 * For an example of using actions with GApplication, see
 * <a href="https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gapplication-example-actions.c">gapplication-example-actions.c</a>.
 * <p>
 * For an example of using extra D-Bus hooks with GApplication, see
 * <a href="https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gapplication-example-dbushooks.c">gapplication-example-dbushooks.c</a>.
 */
public class Application extends org.gtk.gobject.Object implements ActionGroup, ActionMap {

    public Application(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Application */
    public static Application castFrom(org.gtk.gobject.Object gobject) {
        return new Application(gobject.getReference());
    }
    
    private static Reference constructNew(java.lang.String applicationId, int flags) {
        Reference RESULT = References.get(gtk_h.g_application_new(Interop.allocateNativeString(applicationId).handle(), flags), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link Application} instance.
     * <p>
     * If non-<code>null</code>, the application id must be valid.  See
     * g_application_id_is_valid().
     * <p>
     * If no application ID is given then some features of {@link Application}
     * (most notably application uniqueness) will be disabled.
     */
    public Application(java.lang.String applicationId, int flags) {
        super(constructNew(applicationId, flags));
    }
    
    /**
     * Activates the application.
     * <p>
     * In essence, this results in the {@link Application}::activate signal being
     * emitted in the primary instance.
     * <p>
     * The application must be registered before calling this function.
     */
    public void activate() {
        gtk_h.g_application_activate(handle());
    }
    
    /**
     * Add an option to be handled by {@code application}.
     * <p>
     * Calling this function is the equivalent of calling
     * g_application_add_main_option_entries() with a single {@link org.gtk.glib.OptionEntry}
     * that has its arg_data member set to <code>null</code>.
     * <p>
     * The parsed arguments will be packed into a {@link org.gtk.glib.VariantDict} which
     * is passed to {@link Application}::handle-local-options. If
     * {@link ApplicationFlags#HANDLES_COMMAND_LINE} is set, then it will also
     * be sent to the primary instance. See
     * g_application_add_main_option_entries() for more details.
     * <p>
     * See {@link org.gtk.glib.OptionEntry} for more documentation of the arguments.
     */
    public void addMainOption(java.lang.String longName, byte shortName, int flags, org.gtk.glib.OptionArg arg, java.lang.String description, java.lang.String argDescription) {
        gtk_h.g_application_add_main_option(handle(), Interop.allocateNativeString(longName).handle(), shortName, flags, arg.getValue(), Interop.allocateNativeString(description).handle(), Interop.allocateNativeString(argDescription).handle());
    }
    
    /**
     * Adds main option entries to be handled by {@code application}.
     * <p>
     * This function is comparable to g_option_context_add_main_entries().
     * <p>
     * After the commandline arguments are parsed, the
     * {@link Application}::handle-local-options signal will be emitted.  At this
     * point, the application can inspect the values pointed to by {@code arg_data}
     * in the given {@code GOptionEntrys}.
     * <p>
     * Unlike {@link org.gtk.glib.OptionContext}, {@link Application} supports giving a <code>null</code>
     * {@code arg_data} for a non-callback {@link org.gtk.glib.OptionEntry}.  This results in the
     * argument in question being packed into a {@link org.gtk.glib.VariantDict} which is also
     * passed to {@link Application}::handle-local-options, where it can be
     * inspected and modified.  If {@link ApplicationFlags#HANDLES_COMMAND_LINE} is
     * set, then the resulting dictionary is sent to the primary instance,
     * where g_application_command_line_get_options_dict() will return it.
     * This "packing" is done according to the type of the argument --
     * booleans for normal flags, strings for strings, bytestrings for
     * filenames, etc.  The packing only occurs if the flag is given (ie: we
     * do not pack a "false" {@link org.gtk.glib.Variant} in the case that a flag is missing).
     * <p>
     * In general, it is recommended that all commandline arguments are
     * parsed locally.  The options dictionary should then be used to
     * transmit the result of the parsing to the primary instance, where
     * g_variant_dict_lookup() can be used.  For local options, it is
     * possible to either use {@code arg_data} in the usual way, or to consult (and
     * potentially remove) the option from the options dictionary.
     * <p>
     * This function is new in GLib 2.40.  Before then, the only real choice
     * was to send all of the commandline arguments (options and all) to the
     * primary instance for handling.  {@link Application} ignored them completely
     * on the local side.  Calling this function "opts in" to the new
     * behaviour, and in particular, means that unrecognised options will be
     * treated as errors.  Unrecognised options have never been ignored when
     * {@link ApplicationFlags#HANDLES_COMMAND_LINE} is unset.
     * <p>
     * If {@link Application}::handle-local-options needs to see the list of
     * filenames, then the use of {@code G_OPTION_REMAINING} is recommended.  If
     * {@code arg_data} is <code>null</code> then {@code G_OPTION_REMAINING} can be used as a key into
     * the options dictionary.  If you do use {@code G_OPTION_REMAINING} then you
     * need to handle these arguments for yourself because once they are
     * consumed, they will no longer be visible to the default handling
     * (which treats them as filenames to be opened).
     * <p>
     * It is important to use the proper GVariant format when retrieving
     * the options with g_variant_dict_lookup():
     * <ul>
     * <li>for {@link org.gtk.glib.OptionArg#NONE}, use {@code b}
     * <li>for {@link org.gtk.glib.OptionArg#STRING}, use {@code &s}
     * <li>for {@link org.gtk.glib.OptionArg#INT}, use {@code i}
     * <li>for {@link org.gtk.glib.OptionArg#INT64}, use {@code x}
     * <li>for {@link org.gtk.glib.OptionArg#DOUBLE}, use {@code d}
     * <li>for {@link org.gtk.glib.OptionArg#FILENAME}, use {@code ^&ay}
     * <li>for {@link org.gtk.glib.OptionArg#STRING_ARRAY}, use {@code ^a&s}
     * <li>for {@link org.gtk.glib.OptionArg#FILENAME_ARRAY}, use {@code ^a&ay}
     */
    public void addMainOptionEntries(org.gtk.glib.OptionEntry[] entries) {
        gtk_h.g_application_add_main_option_entries(handle(), Interop.allocateNativeArray(entries).handle());
    }
    
    /**
     * Adds a {@link org.gtk.glib.OptionGroup} to the commandline handling of {@code application}.
     * <p>
     * This function is comparable to g_option_context_add_group().
     * <p>
     * Unlike g_application_add_main_option_entries(), this function does
     * not deal with <code>null</code> {@code arg_data} and never transmits options to the
     * primary instance.
     * <p>
     * The reason for that is because, by the time the options arrive at the
     * primary instance, it is typically too late to do anything with them.
     * Taking the GTK option group as an example: GTK will already have been
     * initialised by the time the {@link Application}::command-line handler runs.
     * In the case that this is not the first-running instance of the
     * application, the existing instance may already have been running for
     * a very long time.
     * <p>
     * This means that the options from {@link org.gtk.glib.OptionGroup} are only really usable
     * in the case that the instance of the application being run is the
     * first instance.  Passing options like {@code --display=} or {@code --gdk-debug=}
     * on future runs will have no effect on the existing primary instance.
     * <p>
     * Calling this function will cause the options in the supplied option
     * group to be parsed, but it does not cause you to be "opted in" to the
     * new functionality whereby unrecognised options are rejected even if
     * {@link ApplicationFlags#HANDLES_COMMAND_LINE} was given.
     */
    public void addOptionGroup(org.gtk.glib.OptionGroup group) {
        gtk_h.g_application_add_option_group(handle(), group.handle());
    }
    
    /**
     * Marks {@code application} as busy (see g_application_mark_busy()) while
     * {@code property} on {@code object} is <code>true</code>.
     * <p>
     * The binding holds a reference to {@code application} while it is active, but
     * not to {@code object}. Instead, the binding is destroyed when {@code object} is
     * finalized.
     */
    public void bindBusyProperty(org.gtk.gobject.Object object, java.lang.String property) {
        gtk_h.g_application_bind_busy_property(handle(), object.handle(), Interop.allocateNativeString(property).handle());
    }
    
    /**
     * Gets the unique identifier for {@code application}.
     */
    public java.lang.String getApplicationId() {
        var RESULT = gtk_h.g_application_get_application_id(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the {@link DBusConnection} being used by the application, or <code>null</code>.
     * <p>
     * If {@link Application} is using its D-Bus backend then this function will
     * return the {@link DBusConnection} being used for uniqueness and
     * communication with the desktop environment and other instances of the
     * application.
     * <p>
     * If {@link Application} is not using D-Bus then this function will return
     * <code>null</code>.  This includes the situation where the D-Bus backend would
     * normally be in use but we were unable to connect to the bus.
     * <p>
     * This function must not be called before the application has been
     * registered.  See g_application_get_is_registered().
     */
    public DBusConnection getDbusConnection() {
        var RESULT = gtk_h.g_application_get_dbus_connection(handle());
        return new DBusConnection(References.get(RESULT, false));
    }
    
    /**
     * Gets the D-Bus object path being used by the application, or <code>null</code>.
     * <p>
     * If {@link Application} is using its D-Bus backend then this function will
     * return the D-Bus object path that {@link Application} is using.  If the
     * application is the primary instance then there is an object published
     * at this path.  If the application is not the primary instance then
     * the result of this function is undefined.
     * <p>
     * If {@link Application} is not using D-Bus then this function will return
     * <code>null</code>.  This includes the situation where the D-Bus backend would
     * normally be in use but we were unable to connect to the bus.
     * <p>
     * This function must not be called before the application has been
     * registered.  See g_application_get_is_registered().
     */
    public java.lang.String getDbusObjectPath() {
        var RESULT = gtk_h.g_application_get_dbus_object_path(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the flags for {@code application}.
     * <p>
     * See {@link ApplicationFlags}.
     */
    public int getFlags() {
        var RESULT = gtk_h.g_application_get_flags(handle());
        return RESULT;
    }
    
    /**
     * Gets the current inactivity timeout for the application.
     * <p>
     * This is the amount of time (in milliseconds) after the last call to
     * g_application_release() before the application stops running.
     */
    public int getInactivityTimeout() {
        var RESULT = gtk_h.g_application_get_inactivity_timeout(handle());
        return RESULT;
    }
    
    /**
     * Gets the application's current busy state, as set through
     * g_application_mark_busy() or g_application_bind_busy_property().
     */
    public boolean getIsBusy() {
        var RESULT = gtk_h.g_application_get_is_busy(handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if {@code application} is registered.
     * <p>
     * An application is registered if g_application_register() has been
     * successfully called.
     */
    public boolean getIsRegistered() {
        var RESULT = gtk_h.g_application_get_is_registered(handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if {@code application} is remote.
     * <p>
     * If {@code application} is remote then it means that another instance of
     * application already exists (the 'primary' instance).  Calls to
     * perform actions on {@code application} will result in the actions being
     * performed by the primary instance.
     * <p>
     * The value of this property cannot be accessed before
     * g_application_register() has been called.  See
     * g_application_get_is_registered().
     */
    public boolean getIsRemote() {
        var RESULT = gtk_h.g_application_get_is_remote(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the resource base path of {@code application}.
     * <p>
     * See g_application_set_resource_base_path() for more information.
     */
    public java.lang.String getResourceBasePath() {
        var RESULT = gtk_h.g_application_get_resource_base_path(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Increases the use count of {@code application}.
     * <p>
     * Use this function to indicate that the application has a reason to
     * continue to run.  For example, g_application_hold() is called by GTK+
     * when a toplevel window is on the screen.
     * <p>
     * To cancel the hold, call g_application_release().
     */
    public void hold() {
        gtk_h.g_application_hold(handle());
    }
    
    /**
     * Increases the busy count of {@code application}.
     * <p>
     * Use this function to indicate that the application is busy, for instance
     * while a long running operation is pending.
     * <p>
     * The busy state will be exposed to other processes, so a session shell will
     * use that information to indicate the state to the user (e.g. with a
     * spinner).
     * <p>
     * To cancel the busy indication, use g_application_unmark_busy().
     * <p>
     * The application must be registered before calling this function.
     */
    public void markBusy() {
        gtk_h.g_application_mark_busy(handle());
    }
    
    /**
     * Opens the given files.
     * <p>
     * In essence, this results in the {@link Application}::open signal being emitted
     * in the primary instance.
     * <p>
     * {@code n_files} must be greater than zero.
     * <p>
     * {@code hint} is simply passed through to the ::open signal.  It is
     * intended to be used by applications that have multiple modes for
     * opening files (eg: "view" vs "edit", etc).  Unless you have a need
     * for this functionality, you should use "".
     * <p>
     * The application must be registered before calling this function
     * and it must have the {@link ApplicationFlags#HANDLES_OPEN} flag set.
     */
    public void open(File[] files, int nFiles, java.lang.String hint) {
        gtk_h.g_application_open(handle(), Interop.allocateNativeArray(files).handle(), nFiles, Interop.allocateNativeString(hint).handle());
    }
    
    /**
     * Immediately quits the application.
     * <p>
     * Upon return to the mainloop, g_application_run() will return,
     * calling only the 'shutdown' function before doing so.
     * <p>
     * The hold count is ignored.
     * Take care if your code has called g_application_hold() on the application and
     * is therefore still expecting it to exist.
     * (Note that you may have called g_application_hold() indirectly, for example
     * through gtk_application_add_window().)
     * <p>
     * The result of calling g_application_run() again after it returns is
     * unspecified.
     */
    public void quit() {
        gtk_h.g_application_quit(handle());
    }
    
    /**
     * Attempts registration of the application.
     * <p>
     * This is the point at which the application discovers if it is the
     * primary instance or merely acting as a remote for an already-existing
     * primary instance.  This is implemented by attempting to acquire the
     * application identifier as a unique bus name on the session bus using
     * GDBus.
     * <p>
     * If there is no application ID or if {@link ApplicationFlags#NON_UNIQUE} was
     * given, then this process will always become the primary instance.
     * <p>
     * Due to the internal architecture of GDBus, method calls can be
     * dispatched at any time (even if a main loop is not running).  For
     * this reason, you must ensure that any object paths that you wish to
     * register are registered before calling this function.
     * <p>
     * If the application has already been registered then <code>true</code> is
     * returned with no work performed.
     * <p>
     * The {@link Application}::startup signal is emitted if registration succeeds
     * and {@code application} is the primary instance (including the non-unique
     * case).
     * <p>
     * In the event of an error (such as {@code cancellable} being cancelled, or a
     * failure to connect to the session bus), <code>false</code> is returned and {@code error}
     * is set appropriately.
     * <p>
     * Note: the return value of this function is not an indicator that this
     * instance is or is not the primary instance of the application.  See
     * g_application_get_is_remote() for that.
     */
    public boolean register(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_application_register(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Decrease the use count of {@code application}.
     * <p>
     * When the use count reaches zero, the application will stop running.
     * <p>
     * Never call this function except to cancel the effect of a previous
     * call to g_application_hold().
     */
    public void release() {
        gtk_h.g_application_release(handle());
    }
    
    /**
     * Runs the application.
     * <p>
     * This function is intended to be run from main() and its return value
     * is intended to be returned by main(). Although you are expected to pass
     * the {@code argc}, {@code argv} parameters from main() to this function, it is possible
     * to pass <code>null</code> if {@code argv} is not available or commandline handling is not
     * required.  Note that on Windows, {@code argc} and {@code argv} are ignored, and
     * g_win32_get_command_line() is called internally (for proper support
     * of Unicode commandline arguments).
     * <p>
     * {@link Application} will attempt to parse the commandline arguments.  You
     * can add commandline flags to the list of recognised options by way of
     * g_application_add_main_option_entries().  After this, the
     * {@link Application}::handle-local-options signal is emitted, from which the
     * application can inspect the values of its {@code GOptionEntrys}.
     * <p>
     * {@link Application}::handle-local-options is a good place to handle options
     * such as {@code --version}, where an immediate reply from the local process is
     * desired (instead of communicating with an already-running instance).
     * A {@link Application}::handle-local-options handler can stop further processing
     * by returning a non-negative value, which then becomes the exit status of
     * the process.
     * <p>
     * What happens next depends on the flags: if
     * {@link ApplicationFlags#HANDLES_COMMAND_LINE} was specified then the remaining
     * commandline arguments are sent to the primary instance, where a
     * {@link Application}::command-line signal is emitted.  Otherwise, the
     * remaining commandline arguments are assumed to be a list of files.
     * If there are no files listed, the application is activated via the
     * {@link Application}::activate signal.  If there are one or more files, and
     * {@link ApplicationFlags#HANDLES_OPEN} was specified then the files are opened
     * via the {@link Application}::open signal.
     * <p>
     * If you are interested in doing more complicated local handling of the
     * commandline then you should implement your own {@link Application} subclass
     * and override local_command_line(). In this case, you most likely want
     * to return <code>true</code> from your local_command_line() implementation to
     * suppress the default handling. See
     * [gapplication-example-cmdline2.c][https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gapplication-example-cmdline2.c]
     * for an example.
     * <p>
     * If, after the above is done, the use count of the application is zero
     * then the exit status is returned immediately.  If the use count is
     * non-zero then the default main context is iterated until the use count
     * falls to zero, at which point 0 is returned.
     * <p>
     * If the {@link ApplicationFlags#IS_SERVICE} flag is set, then the service will
     * run for as much as 10 seconds with a use count of zero while waiting
     * for the message that caused the activation to arrive.  After that,
     * if the use count falls to zero the application will exit immediately,
     * except in the case that g_application_set_inactivity_timeout() is in
     * use.
     * <p>
     * This function sets the prgname (g_set_prgname()), if not already set,
     * to the basename of argv[0].
     * <p>
     * Much like g_main_loop_run(), this function will acquire the main context
     * for the duration that the application is running.
     * <p>
     * Since 2.40, applications that are not explicitly flagged as services
     * or launchers (ie: neither {@link ApplicationFlags#IS_SERVICE} or
     * {@link ApplicationFlags#IS_LAUNCHER} are given as flags) will check (from the
     * default handler for local_command_line) if "--gapplication-service"
     * was given in the command line.  If this flag is present then normal
     * commandline processing is interrupted and the
     * {@link ApplicationFlags#IS_SERVICE} flag is set.  This provides a "compromise"
     * solution whereby running an application directly from the commandline
     * will invoke it in the normal way (which can be useful for debugging)
     * while still allowing applications to be D-Bus activated in service
     * mode.  The D-Bus service file should invoke the executable with
     * "--gapplication-service" as the sole commandline argument.  This
     * approach is suitable for use by most graphical applications but
     * should not be used from applications like editors that need precise
     * control over when processes invoked via the commandline will exit and
     * what their exit status will be.
     */
    public int run(int argc, java.lang.String[] argv) {
        var RESULT = gtk_h.g_application_run(handle(), argc, Interop.allocateNativeArray(argv).handle());
        return RESULT;
    }
    
    /**
     * Sends a notification on behalf of {@code application} to the desktop shell.
     * There is no guarantee that the notification is displayed immediately,
     * or even at all.
     * <p>
     * Notifications may persist after the application exits. It will be
     * D-Bus-activated when the notification or one of its actions is
     * activated.
     * <p>
     * Modifying {@code notification} after this call has no effect. However, the
     * object can be reused for a later call to this function.
     * <p>
     * {@code id} may be any string that uniquely identifies the event for the
     * application. It does not need to be in any special format. For
     * example, "new-message" might be appropriate for a notification about
     * new messages.
     * <p>
     * If a previous notification was sent with the same {@code id}, it will be
     * replaced with {@code notification} and shown again as if it was a new
     * notification. This works even for notifications sent from a previous
     * execution of the application, as long as {@code id} is the same string.
     * <p>
     * {@code id} may be <code>null</code>, but it is impossible to replace or withdraw
     * notifications without an id.
     * <p>
     * If {@code notification} is no longer relevant, it can be withdrawn with
     * g_application_withdraw_notification().
     */
    public void sendNotification(java.lang.String id, Notification notification) {
        gtk_h.g_application_send_notification(handle(), Interop.allocateNativeString(id).handle(), notification.handle());
    }
    
    /**
     * Sets the unique identifier for {@code application}.
     * <p>
     * The application id can only be modified if {@code application} has not yet
     * been registered.
     * <p>
     * If non-<code>null</code>, the application id must be valid.  See
     * g_application_id_is_valid().
     */
    public void setApplicationId(java.lang.String applicationId) {
        gtk_h.g_application_set_application_id(handle(), Interop.allocateNativeString(applicationId).handle());
    }
    
    /**
     * Sets or unsets the default application for the process, as returned
     * by g_application_get_default().
     * <p>
     * This function does not take its own reference on {@code application}.  If
     * {@code application} is destroyed then the default application will revert
     * back to <code>null</code>.
     */
    public void setDefault() {
        gtk_h.g_application_set_default(handle());
    }
    
    /**
     * Sets the flags for {@code application}.
     * <p>
     * The flags can only be modified if {@code application} has not yet been
     * registered.
     * <p>
     * See {@link ApplicationFlags}.
     */
    public void setFlags(int flags) {
        gtk_h.g_application_set_flags(handle(), flags);
    }
    
    /**
     * Sets the current inactivity timeout for the application.
     * <p>
     * This is the amount of time (in milliseconds) after the last call to
     * g_application_release() before the application stops running.
     * <p>
     * This call has no side effects of its own.  The value set here is only
     * used for next time g_application_release() drops the use count to
     * zero.  Any timeouts currently in progress are not impacted.
     */
    public void setInactivityTimeout(int inactivityTimeout) {
        gtk_h.g_application_set_inactivity_timeout(handle(), inactivityTimeout);
    }
    
    /**
     * Adds a description to the {@code application} option context.
     * <p>
     * See g_option_context_set_description() for more information.
     */
    public void setOptionContextDescription(java.lang.String description) {
        gtk_h.g_application_set_option_context_description(handle(), Interop.allocateNativeString(description).handle());
    }
    
    /**
     * Sets the parameter string to be used by the commandline handling of {@code application}.
     * <p>
     * This function registers the argument to be passed to g_option_context_new()
     * when the internal {@link org.gtk.glib.OptionContext} of {@code application} is created.
     * <p>
     * See g_option_context_new() for more information about {@code parameter_string}.
     */
    public void setOptionContextParameterString(java.lang.String parameterString) {
        gtk_h.g_application_set_option_context_parameter_string(handle(), Interop.allocateNativeString(parameterString).handle());
    }
    
    /**
     * Adds a summary to the {@code application} option context.
     * <p>
     * See g_option_context_set_summary() for more information.
     */
    public void setOptionContextSummary(java.lang.String summary) {
        gtk_h.g_application_set_option_context_summary(handle(), Interop.allocateNativeString(summary).handle());
    }
    
    /**
     * Sets (or unsets) the base resource path of {@code application}.
     * <p>
     * The path is used to automatically load various [application
     * resources][gresource] such as menu layouts and action descriptions.
     * The various types of resources will be found at fixed names relative
     * to the given base path.
     * <p>
     * By default, the resource base path is determined from the application
     * ID by prefixing '/' and replacing each '.' with '/'.  This is done at
     * the time that the {@link Application} object is constructed.  Changes to
     * the application ID after that point will not have an impact on the
     * resource base path.
     * <p>
     * As an example, if the application has an ID of "org.example.app" then
     * the default resource base path will be "/org/example/app".  If this
     * is a {@link org.gtk.gtk.Application} (and you have not manually changed the path)
     * then Gtk will then search for the menus of the application at
     * "/org/example/app/gtk/menus.ui".
     * <p>
     * See {@link Resource} for more information about adding resources to your
     * application.
     * <p>
     * You can disable automatic resource loading functionality by setting
     * the path to <code>null</code>.
     * <p>
     * Changing the resource base path once the application is running is
     * not recommended.  The point at which the resource path is consulted
     * for forming paths for various purposes is unspecified.  When writing
     * a sub-class of {@link Application} you should either set the
     * {@link Application}:resource-base-path property at construction time, or call
     * this function during the instance initialization. Alternatively, you
     * can call this function in the {@link ApplicationClass}.startup virtual function,
     * before chaining up to the parent implementation.
     */
    public void setResourceBasePath(java.lang.String resourcePath) {
        gtk_h.g_application_set_resource_base_path(handle(), Interop.allocateNativeString(resourcePath).handle());
    }
    
    /**
     * Destroys a binding between {@code property} and the busy state of
     * {@code application} that was previously created with
     * g_application_bind_busy_property().
     */
    public void unbindBusyProperty(org.gtk.gobject.Object object, java.lang.String property) {
        gtk_h.g_application_unbind_busy_property(handle(), object.handle(), Interop.allocateNativeString(property).handle());
    }
    
    /**
     * Decreases the busy count of {@code application}.
     * <p>
     * When the busy count reaches zero, the new state will be propagated
     * to other processes.
     * <p>
     * This function must only be called to cancel the effect of a previous
     * call to g_application_mark_busy().
     */
    public void unmarkBusy() {
        gtk_h.g_application_unmark_busy(handle());
    }
    
    /**
     * Withdraws a notification that was sent with
     * g_application_send_notification().
     * <p>
     * This call does nothing if a notification with {@code id} doesn't exist or
     * the notification was never sent.
     * <p>
     * This function works even for notifications sent in previous
     * executions of this application, as long {@code id} is the same as it was for
     * the sent notification.
     * <p>
     * Note that notifications are dismissed when the user clicks on one
     * of the buttons in a notification or triggers its default action, so
     * there is no need to explicitly withdraw the notification in that case.
     */
    public void withdrawNotification(java.lang.String id) {
        gtk_h.g_application_withdraw_notification(handle(), Interop.allocateNativeString(id).handle());
    }
    
    /**
     * Returns the default {@link Application} instance for this process.
     * <p>
     * Normally there is only one {@link Application} per process and it becomes
     * the default when it is created.  You can exercise more control over
     * this by using g_application_set_default().
     * <p>
     * If there is no default application then <code>null</code> is returned.
     */
    public static Application getDefault() {
        var RESULT = gtk_h.g_application_get_default();
        return new Application(References.get(RESULT, false));
    }
    
    /**
     * Checks if {@code application_id} is a valid application identifier.
     * <p>
     * A valid ID is required for calls to g_application_new() and
     * g_application_set_application_id().
     * <p>
     * Application identifiers follow the same format as
     * <a href="https://dbus.freedesktop.org/doc/dbus-specification.html#message-protocol-names-bus">D-Bus well-known bus names</a>.
     * For convenience, the restrictions on application identifiers are
     * reproduced here:
     * <p>
     * <ul>
     * <li>Application identifiers are composed of 1 or more elements separated by a
     *   period ({@code .}) character. All elements must contain at least one character.
     * </ul>
     * <p>
     * <ul>
     * <li>Each element must only contain the ASCII characters {@code [A-Z][a-z][0-9]_-},
     *   with {@code -} discouraged in new application identifiers. Each element must not
     *   begin with a digit.
     * </ul>
     * <p>
     * <ul>
     * <li>Application identifiers must contain at least one {@code .} (period) character
     *   (and thus at least two elements).
     * </ul>
     * <p>
     * <ul>
     * <li>Application identifiers must not begin with a {@code .} (period) character.
     * </ul>
     * <p>
     * <ul>
     * <li>Application identifiers must not exceed 255 characters.
     * </ul>
     * <p>
     * Note that the hyphen ({@code -}) character is allowed in application identifiers,
     * but is problematic or not allowed in various specifications and APIs that
     * refer to D-Bus, such as
     * <a href="http://docs.flatpak.org/en/latest/introduction.html#identifiers">Flatpak application IDs</a>,
     * the
     * <a href="https://specifications.freedesktop.org/desktop-entry-spec/desktop-entry-spec-latest.html#dbus">`DBusActivatable` interface in the Desktop Entry Specification</a>,
     * and the convention that an application's "main" interface and object path
     * resemble its application identifier and bus name. To avoid situations that
     * require special-case handling, it is recommended that new application
     * identifiers consistently replace hyphens with underscores.
     * <p>
     * Like D-Bus interface names, application identifiers should start with the
     * reversed DNS domain name of the author of the interface (in lower-case), and
     * it is conventional for the rest of the application identifier to consist of
     * words run together, with initial capital letters.
     * <p>
     * As with D-Bus interface names, if the author's DNS domain name contains
     * hyphen/minus characters they should be replaced by underscores, and if it
     * contains leading digits they should be escaped by prepending an underscore.
     * For example, if the owner of 7-zip.org used an application identifier for an
     * archiving application, it might be named {@code org._7_zip.Archiver}.
     */
    public static boolean idIsValid(java.lang.String applicationId) {
        var RESULT = gtk_h.g_application_id_is_valid(Interop.allocateNativeString(applicationId).handle());
        return (RESULT != 0);
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(Application source);
    }
    
    /**
     * The ::activate signal is emitted on the primary instance when an
     * activation occurs. See g_application_activate().
     */
    public SignalHandle onActivate(ActivateHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalApplicationActivate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("activate").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface CommandLineHandler {
        void signalReceived(Application source, ApplicationCommandLine commandLine);
    }
    
    /**
     * The ::command-line signal is emitted on the primary instance when
     * a commandline is not handled locally. See g_application_run() and
     * the {@link ApplicationCommandLine} documentation for more information.
     */
    public SignalHandle onCommandLine(CommandLineHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalApplicationCommandLine", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("command-line").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface HandleLocalOptionsHandler {
        void signalReceived(Application source, org.gtk.glib.VariantDict options);
    }
    
    /**
     * The ::handle-local-options signal is emitted on the local instance
     * after the parsing of the commandline options has occurred.
     * <p>
     * You can add options to be recognised during commandline option
     * parsing using g_application_add_main_option_entries() and
     * g_application_add_option_group().
     * <p>
     * Signal handlers can inspect {@code options} (along with values pointed to
     * from the {@code arg_data} of an installed {@code GOptionEntrys}) in order to
     * decide to perform certain actions, including direct local handling
     * (which may be useful for options like --version).
     * <p>
     * In the event that the application is marked
     * {@link ApplicationFlags#HANDLES_COMMAND_LINE} the "normal processing" will
     * send the {@code options} dictionary to the primary instance where it can be
     * read with g_application_command_line_get_options_dict().  The signal
     * handler can modify the dictionary before returning, and the
     * modified dictionary will be sent.
     * <p>
     * In the event that {@link ApplicationFlags#HANDLES_COMMAND_LINE} is not set,
     * "normal processing" will treat the remaining uncollected command
     * line arguments as filenames or URIs.  If there are no arguments,
     * the application is activated by g_application_activate().  One or
     * more arguments results in a call to g_application_open().
     * <p>
     * If you want to handle the local commandline arguments for yourself
     * by converting them to calls to g_application_open() or
     * g_action_group_activate_action() then you must be sure to register
     * the application first.  You should probably not call
     * g_application_activate() for yourself, however: just return -1 and
     * allow the default handler to do it for you.  This will ensure that
     * the {@code --gapplication-service} switch works properly (i.e. no activation
     * in that case).
     * <p>
     * Note that this signal is emitted from the default implementation of
     * local_command_line().  If you override that function and don't
     * chain up then this signal will never be emitted.
     * <p>
     * You can override local_command_line() if you need more powerful
     * capabilities than what is provided here, but this should not
     * normally be required.
     */
    public SignalHandle onHandleLocalOptions(HandleLocalOptionsHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalApplicationHandleLocalOptions", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("handle-local-options").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface NameLostHandler {
        boolean signalReceived(Application source);
    }
    
    /**
     * The ::name-lost signal is emitted only on the registered primary instance
     * when a new instance has taken over. This can only happen if the application
     * is using the {@link ApplicationFlags#ALLOW_REPLACEMENT} flag.
     * <p>
     * The default handler for this signal calls g_application_quit().
     */
    public SignalHandle onNameLost(NameLostHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalApplicationNameLost", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("name-lost").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface OpenHandler {
        void signalReceived(Application source, File[] files, int nFiles, java.lang.String hint);
    }
    
    /**
     * The ::open signal is emitted on the primary instance when there are
     * files to open. See g_application_open() for more information.
     */
    public SignalHandle onOpen(OpenHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalApplicationOpen", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("open").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ShutdownHandler {
        void signalReceived(Application source);
    }
    
    /**
     * The ::shutdown signal is emitted only on the registered primary instance
     * immediately after the main loop terminates.
     */
    public SignalHandle onShutdown(ShutdownHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalApplicationShutdown", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("shutdown").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface StartupHandler {
        void signalReceived(Application source);
    }
    
    /**
     * The ::startup signal is emitted on the primary instance immediately
     * after registration. See g_application_register().
     */
    public SignalHandle onStartup(StartupHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalApplicationStartup", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("startup").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
