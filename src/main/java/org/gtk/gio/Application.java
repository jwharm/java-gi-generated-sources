package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * <ul>
 * <li>via 'Activate' (i.e. just starting the application)
 * <li>via 'Open' (i.e. opening some files)
 * <li>by handling a command-line
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

    public Application(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Application */
    public static Application castFrom(org.gtk.gobject.Object gobject) {
        return new Application(gobject.refcounted());
    }
    
    private static final MethodHandle g_application_new = Interop.downcallHandle(
        "g_application_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(@Nullable java.lang.String applicationId, @NotNull ApplicationFlags flags) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_application_new.invokeExact(Interop.allocateNativeString(applicationId), flags.getValue()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link Application} instance.
     * <p>
     * If non-{@code null}, the application id must be valid.  See
     * g_application_id_is_valid().
     * <p>
     * If no application ID is given then some features of {@link Application}
     * (most notably application uniqueness) will be disabled.
     */
    public Application(@Nullable java.lang.String applicationId, @NotNull ApplicationFlags flags) {
        super(constructNew(applicationId, flags));
    }
    
    private static final MethodHandle g_application_activate = Interop.downcallHandle(
        "g_application_activate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Activates the application.
     * <p>
     * In essence, this results in the {@link Application}::activate signal being
     * emitted in the primary instance.
     * <p>
     * The application must be registered before calling this function.
     */
    public @NotNull void activate() {
        try {
            g_application_activate.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_application_add_main_option = Interop.downcallHandle(
        "g_application_add_main_option",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Add an option to be handled by {@code application}.
     * <p>
     * Calling this function is the equivalent of calling
     * g_application_add_main_option_entries() with a single {@link org.gtk.glib.OptionEntry}
     * that has its arg_data member set to {@code null}.
     * <p>
     * The parsed arguments will be packed into a {@link org.gtk.glib.VariantDict} which
     * is passed to {@link Application}::handle-local-options. If
     * {@link ApplicationFlags#HANDLES_COMMAND_LINE} is set, then it will also
     * be sent to the primary instance. See
     * g_application_add_main_option_entries() for more details.
     * <p>
     * See {@link org.gtk.glib.OptionEntry} for more documentation of the arguments.
     */
    public @NotNull void addMainOption(@NotNull java.lang.String longName, @NotNull byte shortName, @NotNull org.gtk.glib.OptionFlags flags, @NotNull org.gtk.glib.OptionArg arg, @NotNull java.lang.String description, @Nullable java.lang.String argDescription) {
        try {
            g_application_add_main_option.invokeExact(handle(), Interop.allocateNativeString(longName), shortName, flags.getValue(), arg.getValue(), Interop.allocateNativeString(description), Interop.allocateNativeString(argDescription));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_application_add_main_option_entries = Interop.downcallHandle(
        "g_application_add_main_option_entries",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     * Unlike {@link org.gtk.glib.OptionContext}, {@link Application} supports giving a {@code null}
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
     * {@code arg_data} is {@code null} then {@code G_OPTION_REMAINING} can be used as a key into
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
    public @NotNull void addMainOptionEntries(@NotNull org.gtk.glib.OptionEntry[] entries) {
        try {
            g_application_add_main_option_entries.invokeExact(handle(), Interop.allocateNativeArray(entries));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_application_add_option_group = Interop.downcallHandle(
        "g_application_add_option_group",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a {@link org.gtk.glib.OptionGroup} to the commandline handling of {@code application}.
     * <p>
     * This function is comparable to g_option_context_add_group().
     * <p>
     * Unlike g_application_add_main_option_entries(), this function does
     * not deal with {@code null} {@code arg_data} and never transmits options to the
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
    public @NotNull void addOptionGroup(@NotNull org.gtk.glib.OptionGroup group) {
        try {
            g_application_add_option_group.invokeExact(handle(), group.refcounted().unowned().handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_application_bind_busy_property = Interop.downcallHandle(
        "g_application_bind_busy_property",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Marks {@code application} as busy (see g_application_mark_busy()) while
     * {@code property} on {@code object} is {@code true}.
     * <p>
     * The binding holds a reference to {@code application} while it is active, but
     * not to {@code object}. Instead, the binding is destroyed when {@code object} is
     * finalized.
     */
    public @NotNull void bindBusyProperty(@NotNull org.gtk.gobject.Object object, @NotNull java.lang.String property) {
        try {
            g_application_bind_busy_property.invokeExact(handle(), object.handle(), Interop.allocateNativeString(property));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_application_get_application_id = Interop.downcallHandle(
        "g_application_get_application_id",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the unique identifier for {@code application}.
     */
    public @Nullable java.lang.String getApplicationId() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_application_get_application_id.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_application_get_dbus_connection = Interop.downcallHandle(
        "g_application_get_dbus_connection",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@link DBusConnection} being used by the application, or {@code null}.
     * <p>
     * If {@link Application} is using its D-Bus backend then this function will
     * return the {@link DBusConnection} being used for uniqueness and
     * communication with the desktop environment and other instances of the
     * application.
     * <p>
     * If {@link Application} is not using D-Bus then this function will return
     * {@code null}.  This includes the situation where the D-Bus backend would
     * normally be in use but we were unable to connect to the bus.
     * <p>
     * This function must not be called before the application has been
     * registered.  See g_application_get_is_registered().
     */
    public @Nullable DBusConnection getDbusConnection() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_application_get_dbus_connection.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new DBusConnection(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_application_get_dbus_object_path = Interop.downcallHandle(
        "g_application_get_dbus_object_path",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the D-Bus object path being used by the application, or {@code null}.
     * <p>
     * If {@link Application} is using its D-Bus backend then this function will
     * return the D-Bus object path that {@link Application} is using.  If the
     * application is the primary instance then there is an object published
     * at this path.  If the application is not the primary instance then
     * the result of this function is undefined.
     * <p>
     * If {@link Application} is not using D-Bus then this function will return
     * {@code null}.  This includes the situation where the D-Bus backend would
     * normally be in use but we were unable to connect to the bus.
     * <p>
     * This function must not be called before the application has been
     * registered.  See g_application_get_is_registered().
     */
    public @Nullable java.lang.String getDbusObjectPath() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_application_get_dbus_object_path.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_application_get_flags = Interop.downcallHandle(
        "g_application_get_flags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the flags for {@code application}.
     * <p>
     * See {@link ApplicationFlags}.
     */
    public @NotNull ApplicationFlags getFlags() {
        int RESULT;
        try {
            RESULT = (int) g_application_get_flags.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ApplicationFlags(RESULT);
    }
    
    private static final MethodHandle g_application_get_inactivity_timeout = Interop.downcallHandle(
        "g_application_get_inactivity_timeout",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current inactivity timeout for the application.
     * <p>
     * This is the amount of time (in milliseconds) after the last call to
     * g_application_release() before the application stops running.
     */
    public int getInactivityTimeout() {
        int RESULT;
        try {
            RESULT = (int) g_application_get_inactivity_timeout.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_application_get_is_busy = Interop.downcallHandle(
        "g_application_get_is_busy",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the application's current busy state, as set through
     * g_application_mark_busy() or g_application_bind_busy_property().
     */
    public boolean getIsBusy() {
        int RESULT;
        try {
            RESULT = (int) g_application_get_is_busy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_application_get_is_registered = Interop.downcallHandle(
        "g_application_get_is_registered",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if {@code application} is registered.
     * <p>
     * An application is registered if g_application_register() has been
     * successfully called.
     */
    public boolean getIsRegistered() {
        int RESULT;
        try {
            RESULT = (int) g_application_get_is_registered.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_application_get_is_remote = Interop.downcallHandle(
        "g_application_get_is_remote",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
        int RESULT;
        try {
            RESULT = (int) g_application_get_is_remote.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_application_get_resource_base_path = Interop.downcallHandle(
        "g_application_get_resource_base_path",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the resource base path of {@code application}.
     * <p>
     * See g_application_set_resource_base_path() for more information.
     */
    public @Nullable java.lang.String getResourceBasePath() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_application_get_resource_base_path.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_application_hold = Interop.downcallHandle(
        "g_application_hold",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Increases the use count of {@code application}.
     * <p>
     * Use this function to indicate that the application has a reason to
     * continue to run.  For example, g_application_hold() is called by GTK+
     * when a toplevel window is on the screen.
     * <p>
     * To cancel the hold, call g_application_release().
     */
    public @NotNull void hold() {
        try {
            g_application_hold.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_application_mark_busy = Interop.downcallHandle(
        "g_application_mark_busy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
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
    public @NotNull void markBusy() {
        try {
            g_application_mark_busy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_application_open = Interop.downcallHandle(
        "g_application_open",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
    public @NotNull void open(@NotNull File[] files, @NotNull int nFiles, @NotNull java.lang.String hint) {
        try {
            g_application_open.invokeExact(handle(), Interop.allocateNativeArray(files), nFiles, Interop.allocateNativeString(hint));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_application_quit = Interop.downcallHandle(
        "g_application_quit",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
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
    public @NotNull void quit() {
        try {
            g_application_quit.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_application_register = Interop.downcallHandle(
        "g_application_register",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     * If the application has already been registered then {@code true} is
     * returned with no work performed.
     * <p>
     * The {@link Application}::startup signal is emitted if registration succeeds
     * and {@code application} is the primary instance (including the non-unique
     * case).
     * <p>
     * In the event of an error (such as {@code cancellable} being cancelled, or a
     * failure to connect to the session bus), {@code false} is returned and {@code error}
     * is set appropriately.
     * <p>
     * Note: the return value of this function is not an indicator that this
     * instance is or is not the primary instance of the application.  See
     * g_application_get_is_remote() for that.
     */
    public boolean register(@Nullable Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_application_register.invokeExact(handle(), cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_application_release = Interop.downcallHandle(
        "g_application_release",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decrease the use count of {@code application}.
     * <p>
     * When the use count reaches zero, the application will stop running.
     * <p>
     * Never call this function except to cancel the effect of a previous
     * call to g_application_hold().
     */
    public @NotNull void release() {
        try {
            g_application_release.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_application_run = Interop.downcallHandle(
        "g_application_run",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Runs the application.
     * <p>
     * This function is intended to be run from main() and its return value
     * is intended to be returned by main(). Although you are expected to pass
     * the {@code argc}, {@code argv} parameters from main() to this function, it is possible
     * to pass {@code null} if {@code argv} is not available or commandline handling is not
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
     * to return {@code true} from your local_command_line() implementation to
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
    public int run(@NotNull int argc, @Nullable java.lang.String[] argv) {
        int RESULT;
        try {
            RESULT = (int) g_application_run.invokeExact(handle(), argc, Interop.allocateNativeArray(argv));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_application_send_notification = Interop.downcallHandle(
        "g_application_send_notification",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     * {@code id} may be {@code null}, but it is impossible to replace or withdraw
     * notifications without an id.
     * <p>
     * If {@code notification} is no longer relevant, it can be withdrawn with
     * g_application_withdraw_notification().
     */
    public @NotNull void sendNotification(@Nullable java.lang.String id, @NotNull Notification notification) {
        try {
            g_application_send_notification.invokeExact(handle(), Interop.allocateNativeString(id), notification.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_application_set_application_id = Interop.downcallHandle(
        "g_application_set_application_id",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the unique identifier for {@code application}.
     * <p>
     * The application id can only be modified if {@code application} has not yet
     * been registered.
     * <p>
     * If non-{@code null}, the application id must be valid.  See
     * g_application_id_is_valid().
     */
    public @NotNull void setApplicationId(@Nullable java.lang.String applicationId) {
        try {
            g_application_set_application_id.invokeExact(handle(), Interop.allocateNativeString(applicationId));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_application_set_default = Interop.downcallHandle(
        "g_application_set_default",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Sets or unsets the default application for the process, as returned
     * by g_application_get_default().
     * <p>
     * This function does not take its own reference on {@code application}.  If
     * {@code application} is destroyed then the default application will revert
     * back to {@code null}.
     */
    public @NotNull void setDefault() {
        try {
            g_application_set_default.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_application_set_flags = Interop.downcallHandle(
        "g_application_set_flags",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the flags for {@code application}.
     * <p>
     * The flags can only be modified if {@code application} has not yet been
     * registered.
     * <p>
     * See {@link ApplicationFlags}.
     */
    public @NotNull void setFlags(@NotNull ApplicationFlags flags) {
        try {
            g_application_set_flags.invokeExact(handle(), flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_application_set_inactivity_timeout = Interop.downcallHandle(
        "g_application_set_inactivity_timeout",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
    public @NotNull void setInactivityTimeout(@NotNull int inactivityTimeout) {
        try {
            g_application_set_inactivity_timeout.invokeExact(handle(), inactivityTimeout);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_application_set_option_context_description = Interop.downcallHandle(
        "g_application_set_option_context_description",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a description to the {@code application} option context.
     * <p>
     * See g_option_context_set_description() for more information.
     */
    public @NotNull void setOptionContextDescription(@Nullable java.lang.String description) {
        try {
            g_application_set_option_context_description.invokeExact(handle(), Interop.allocateNativeString(description));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_application_set_option_context_parameter_string = Interop.downcallHandle(
        "g_application_set_option_context_parameter_string",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the parameter string to be used by the commandline handling of {@code application}.
     * <p>
     * This function registers the argument to be passed to g_option_context_new()
     * when the internal {@link org.gtk.glib.OptionContext} of {@code application} is created.
     * <p>
     * See g_option_context_new() for more information about {@code parameter_string}.
     */
    public @NotNull void setOptionContextParameterString(@Nullable java.lang.String parameterString) {
        try {
            g_application_set_option_context_parameter_string.invokeExact(handle(), Interop.allocateNativeString(parameterString));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_application_set_option_context_summary = Interop.downcallHandle(
        "g_application_set_option_context_summary",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a summary to the {@code application} option context.
     * <p>
     * See g_option_context_set_summary() for more information.
     */
    public @NotNull void setOptionContextSummary(@Nullable java.lang.String summary) {
        try {
            g_application_set_option_context_summary.invokeExact(handle(), Interop.allocateNativeString(summary));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_application_set_resource_base_path = Interop.downcallHandle(
        "g_application_set_resource_base_path",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     * the path to {@code null}.
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
    public @NotNull void setResourceBasePath(@Nullable java.lang.String resourcePath) {
        try {
            g_application_set_resource_base_path.invokeExact(handle(), Interop.allocateNativeString(resourcePath));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_application_unbind_busy_property = Interop.downcallHandle(
        "g_application_unbind_busy_property",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Destroys a binding between {@code property} and the busy state of
     * {@code application} that was previously created with
     * g_application_bind_busy_property().
     */
    public @NotNull void unbindBusyProperty(@NotNull org.gtk.gobject.Object object, @NotNull java.lang.String property) {
        try {
            g_application_unbind_busy_property.invokeExact(handle(), object.handle(), Interop.allocateNativeString(property));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_application_unmark_busy = Interop.downcallHandle(
        "g_application_unmark_busy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decreases the busy count of {@code application}.
     * <p>
     * When the busy count reaches zero, the new state will be propagated
     * to other processes.
     * <p>
     * This function must only be called to cancel the effect of a previous
     * call to g_application_mark_busy().
     */
    public @NotNull void unmarkBusy() {
        try {
            g_application_unmark_busy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_application_withdraw_notification = Interop.downcallHandle(
        "g_application_withdraw_notification",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public @NotNull void withdrawNotification(@NotNull java.lang.String id) {
        try {
            g_application_withdraw_notification.invokeExact(handle(), Interop.allocateNativeString(id));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_application_get_default = Interop.downcallHandle(
        "g_application_get_default",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the default {@link Application} instance for this process.
     * <p>
     * Normally there is only one {@link Application} per process and it becomes
     * the default when it is created.  You can exercise more control over
     * this by using g_application_set_default().
     * <p>
     * If there is no default application then {@code null} is returned.
     */
    public static @Nullable Application getDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_application_get_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Application(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_application_id_is_valid = Interop.downcallHandle(
        "g_application_id_is_valid",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
     * <ul>
     * <li>Application identifiers are composed of 1 or more elements separated by a
     *   period ({@code .}) character. All elements must contain at least one character.
     * <li>Each element must only contain the ASCII characters {@code [A-Z][a-z][0-9]_-},
     *   with {@code -} discouraged in new application identifiers. Each element must not
     *   begin with a digit.
     * <li>Application identifiers must contain at least one {@code .} (period) character
     *   (and thus at least two elements).
     * <li>Application identifiers must not begin with a {@code .} (period) character.
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
    public static boolean idIsValid(@NotNull java.lang.String applicationId) {
        int RESULT;
        try {
            RESULT = (int) g_application_id_is_valid.invokeExact(Interop.allocateNativeString(applicationId));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Application.Callbacks.class, "signalApplicationActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface CommandLineHandler {
        void signalReceived(Application source, @NotNull ApplicationCommandLine commandLine);
    }
    
    /**
     * The ::command-line signal is emitted on the primary instance when
     * a commandline is not handled locally. See g_application_run() and
     * the {@link ApplicationCommandLine} documentation for more information.
     */
    public SignalHandle onCommandLine(CommandLineHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("command-line"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Application.Callbacks.class, "signalApplicationCommandLine",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface HandleLocalOptionsHandler {
        void signalReceived(Application source, @NotNull org.gtk.glib.VariantDict options);
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("handle-local-options"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Application.Callbacks.class, "signalApplicationHandleLocalOptions",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("name-lost"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Application.Callbacks.class, "signalApplicationNameLost",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("shutdown"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Application.Callbacks.class, "signalApplicationShutdown",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("startup"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Application.Callbacks.class, "signalApplicationStartup",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalApplicationActivate(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Application.ActivateHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Application(Refcounted.get(source)));
        }
        
        public static void signalApplicationCommandLine(MemoryAddress source, MemoryAddress commandLine, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Application.CommandLineHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Application(Refcounted.get(source)), new ApplicationCommandLine(Refcounted.get(commandLine, false)));
        }
        
        public static void signalApplicationHandleLocalOptions(MemoryAddress source, MemoryAddress options, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Application.HandleLocalOptionsHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Application(Refcounted.get(source)), new org.gtk.glib.VariantDict(Refcounted.get(options, false)));
        }
        
        public static boolean signalApplicationNameLost(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Application.NameLostHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new Application(Refcounted.get(source)));
        }
        
        public static void signalApplicationShutdown(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Application.ShutdownHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Application(Refcounted.get(source)));
        }
        
        public static void signalApplicationStartup(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Application.StartupHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Application(Refcounted.get(source)));
        }
        
    }
}
