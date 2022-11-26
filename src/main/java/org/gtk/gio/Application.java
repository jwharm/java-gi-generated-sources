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
 * </ul>
 * <ul>
 * <li>via 'Open' (i.e. opening some files)
 * </ul>
 * <ul>
 * <li>by handling a command-line
 * </ul>
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
 * @version 2.28
 */
public class Application extends org.gtk.gobject.Object implements org.gtk.gio.ActionGroup, org.gtk.gio.ActionMap {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GApplication";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
     * Create a Application proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Application(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Application if its GType is a (or inherits from) "GApplication".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Application} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GApplication", a ClassCastException will be thrown.
     */
    public static Application castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), Application.getType())) {
            return new Application(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GApplication");
        }
    }
    
    private static Addressable constructNew(@Nullable java.lang.String applicationId, @NotNull org.gtk.gio.ApplicationFlags flags) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_application_new.invokeExact(
                    (Addressable) (applicationId == null ? MemoryAddress.NULL : Interop.allocateNativeString(applicationId)),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link Application} instance.
     * <p>
     * If non-{@code null}, the application id must be valid.  See
     * g_application_id_is_valid().
     * <p>
     * If no application ID is given then some features of {@link Application}
     * (most notably application uniqueness) will be disabled.
     * @param applicationId the application id
     * @param flags the application flags
     */
    public Application(@Nullable java.lang.String applicationId, @NotNull org.gtk.gio.ApplicationFlags flags) {
        super(constructNew(applicationId, flags), Ownership.FULL);
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
        try {
            DowncallHandles.g_application_activate.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param longName the long name of an option used to specify it in a commandline
     * @param shortName the short name of an option
     * @param flags flags from {@link org.gtk.glib.OptionFlags}
     * @param arg the type of the option, as a {@link org.gtk.glib.OptionArg}
     * @param description the description for the option in {@code --help} output
     * @param argDescription the placeholder to use for the extra argument
     *    parsed by the option in {@code --help} output
     */
    public void addMainOption(@NotNull java.lang.String longName, byte shortName, @NotNull org.gtk.glib.OptionFlags flags, @NotNull org.gtk.glib.OptionArg arg, @NotNull java.lang.String description, @Nullable java.lang.String argDescription) {
        java.util.Objects.requireNonNull(longName, "Parameter 'longName' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        java.util.Objects.requireNonNull(arg, "Parameter 'arg' must not be null");
        java.util.Objects.requireNonNull(description, "Parameter 'description' must not be null");
        try {
            DowncallHandles.g_application_add_main_option.invokeExact(
                    handle(),
                    Interop.allocateNativeString(longName),
                    shortName,
                    flags.getValue(),
                    arg.getValue(),
                    Interop.allocateNativeString(description),
                    (Addressable) (argDescription == null ? MemoryAddress.NULL : Interop.allocateNativeString(argDescription)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * </ul>
     * @param entries a
     *           {@code null}-terminated list of {@code GOptionEntrys}
     */
    public void addMainOptionEntries(@NotNull org.gtk.glib.OptionEntry[] entries) {
        java.util.Objects.requireNonNull(entries, "Parameter 'entries' must not be null");
        try {
            DowncallHandles.g_application_add_main_option_entries.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(entries, org.gtk.glib.OptionEntry.getMemoryLayout(), false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param group a {@link org.gtk.glib.OptionGroup}
     */
    public void addOptionGroup(@NotNull org.gtk.glib.OptionGroup group) {
        java.util.Objects.requireNonNull(group, "Parameter 'group' must not be null");
        try {
            DowncallHandles.g_application_add_option_group.invokeExact(
                    handle(),
                    group.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        group.yieldOwnership();
    }
    
    /**
     * Marks {@code application} as busy (see g_application_mark_busy()) while
     * {@code property} on {@code object} is {@code true}.
     * <p>
     * The binding holds a reference to {@code application} while it is active, but
     * not to {@code object}. Instead, the binding is destroyed when {@code object} is
     * finalized.
     * @param object a {@link org.gtk.gobject.Object}
     * @param property the name of a boolean property of {@code object}
     */
    public void bindBusyProperty(@NotNull org.gtk.gobject.Object object, @NotNull java.lang.String property) {
        java.util.Objects.requireNonNull(object, "Parameter 'object' must not be null");
        java.util.Objects.requireNonNull(property, "Parameter 'property' must not be null");
        try {
            DowncallHandles.g_application_bind_busy_property.invokeExact(
                    handle(),
                    object.handle(),
                    Interop.allocateNativeString(property));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the unique identifier for {@code application}.
     * @return the identifier for {@code application}, owned by {@code application}
     */
    public @Nullable java.lang.String getApplicationId() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_application_get_application_id.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
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
     * @return a {@link DBusConnection}, or {@code null}
     */
    public @Nullable org.gtk.gio.DBusConnection getDbusConnection() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_application_get_dbus_connection.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DBusConnection(RESULT, Ownership.NONE);
    }
    
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
     * @return the object path, or {@code null}
     */
    public @Nullable java.lang.String getDbusObjectPath() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_application_get_dbus_object_path.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the flags for {@code application}.
     * <p>
     * See {@link ApplicationFlags}.
     * @return the flags for {@code application}
     */
    public @NotNull org.gtk.gio.ApplicationFlags getFlags() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_application_get_flags.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.ApplicationFlags(RESULT);
    }
    
    /**
     * Gets the current inactivity timeout for the application.
     * <p>
     * This is the amount of time (in milliseconds) after the last call to
     * g_application_release() before the application stops running.
     * @return the timeout, in milliseconds
     */
    public int getInactivityTimeout() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_application_get_inactivity_timeout.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the application's current busy state, as set through
     * g_application_mark_busy() or g_application_bind_busy_property().
     * @return {@code true} if {@code application} is currently marked as busy
     */
    public boolean getIsBusy() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_application_get_is_busy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks if {@code application} is registered.
     * <p>
     * An application is registered if g_application_register() has been
     * successfully called.
     * @return {@code true} if {@code application} is registered
     */
    public boolean getIsRegistered() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_application_get_is_registered.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
     * @return {@code true} if {@code application} is remote
     */
    public boolean getIsRemote() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_application_get_is_remote.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the resource base path of {@code application}.
     * <p>
     * See g_application_set_resource_base_path() for more information.
     * @return the base resource path, if one is set
     */
    public @Nullable java.lang.String getResourceBasePath() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_application_get_resource_base_path.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
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
        try {
            DowncallHandles.g_application_hold.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
        try {
            DowncallHandles.g_application_mark_busy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param files an array of {@code GFiles} to open
     * @param nFiles the length of the {@code files} array
     * @param hint a hint (or ""), but never {@code null}
     */
    public void open(@NotNull org.gtk.gio.File[] files, int nFiles, @NotNull java.lang.String hint) {
        java.util.Objects.requireNonNull(files, "Parameter 'files' must not be null");
        java.util.Objects.requireNonNull(hint, "Parameter 'hint' must not be null");
        try {
            DowncallHandles.g_application_open.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(files, false),
                    nFiles,
                    Interop.allocateNativeString(hint));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
        try {
            DowncallHandles.g_application_quit.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @return {@code true} if registration succeeded
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean register(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_application_register.invokeExact(
                    handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
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
        try {
            DowncallHandles.g_application_release.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param argc the argc from main() (or 0 if {@code argv} is {@code null})
     * @param argv the argv from main(), or {@code null}
     * @return the exit status
     */
    public int run(int argc, @Nullable java.lang.String[] argv) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_application_run.invokeExact(
                    handle(),
                    argc,
                    (Addressable) (argv == null ? MemoryAddress.NULL : Interop.allocateNativeArray(argv, false)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * {@code id} may be {@code null}, but it is impossible to replace or withdraw
     * notifications without an id.
     * <p>
     * If {@code notification} is no longer relevant, it can be withdrawn with
     * g_application_withdraw_notification().
     * @param id id of the notification, or {@code null}
     * @param notification the {@link Notification} to send
     */
    public void sendNotification(@Nullable java.lang.String id, @NotNull org.gtk.gio.Notification notification) {
        java.util.Objects.requireNonNull(notification, "Parameter 'notification' must not be null");
        try {
            DowncallHandles.g_application_send_notification.invokeExact(
                    handle(),
                    (Addressable) (id == null ? MemoryAddress.NULL : Interop.allocateNativeString(id)),
                    notification.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This used to be how actions were associated with a {@link Application}.
     * Now there is {@link ActionMap} for that.
     * @param actionGroup a {@link ActionGroup}, or {@code null}
     * @deprecated Use the {@link ActionMap} interface instead.  Never ever
     * mix use of this API with use of {@link ActionMap} on the same {@code application}
     * or things will go very badly wrong.  This function is known to
     * introduce buggy behaviour (ie: signals not emitted on changes to the
     * action group), so you should really use {@link ActionMap} instead.
     */
    @Deprecated
    public void setActionGroup(@Nullable org.gtk.gio.ActionGroup actionGroup) {
        try {
            DowncallHandles.g_application_set_action_group.invokeExact(
                    handle(),
                    (Addressable) (actionGroup == null ? MemoryAddress.NULL : actionGroup.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the unique identifier for {@code application}.
     * <p>
     * The application id can only be modified if {@code application} has not yet
     * been registered.
     * <p>
     * If non-{@code null}, the application id must be valid.  See
     * g_application_id_is_valid().
     * @param applicationId the identifier for {@code application}
     */
    public void setApplicationId(@Nullable java.lang.String applicationId) {
        try {
            DowncallHandles.g_application_set_application_id.invokeExact(
                    handle(),
                    (Addressable) (applicationId == null ? MemoryAddress.NULL : Interop.allocateNativeString(applicationId)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets or unsets the default application for the process, as returned
     * by g_application_get_default().
     * <p>
     * This function does not take its own reference on {@code application}.  If
     * {@code application} is destroyed then the default application will revert
     * back to {@code null}.
     */
    public void setDefault() {
        try {
            DowncallHandles.g_application_set_default.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the flags for {@code application}.
     * <p>
     * The flags can only be modified if {@code application} has not yet been
     * registered.
     * <p>
     * See {@link ApplicationFlags}.
     * @param flags the flags for {@code application}
     */
    public void setFlags(@NotNull org.gtk.gio.ApplicationFlags flags) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_application_set_flags.invokeExact(
                    handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param inactivityTimeout the timeout, in milliseconds
     */
    public void setInactivityTimeout(int inactivityTimeout) {
        try {
            DowncallHandles.g_application_set_inactivity_timeout.invokeExact(
                    handle(),
                    inactivityTimeout);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a description to the {@code application} option context.
     * <p>
     * See g_option_context_set_description() for more information.
     * @param description a string to be shown in {@code --help} output
     *  after the list of options, or {@code null}
     */
    public void setOptionContextDescription(@Nullable java.lang.String description) {
        try {
            DowncallHandles.g_application_set_option_context_description.invokeExact(
                    handle(),
                    (Addressable) (description == null ? MemoryAddress.NULL : Interop.allocateNativeString(description)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the parameter string to be used by the commandline handling of {@code application}.
     * <p>
     * This function registers the argument to be passed to g_option_context_new()
     * when the internal {@link org.gtk.glib.OptionContext} of {@code application} is created.
     * <p>
     * See g_option_context_new() for more information about {@code parameter_string}.
     * @param parameterString a string which is displayed
     *   in the first line of {@code --help} output, after the usage summary {@code programname [OPTION...]}.
     */
    public void setOptionContextParameterString(@Nullable java.lang.String parameterString) {
        try {
            DowncallHandles.g_application_set_option_context_parameter_string.invokeExact(
                    handle(),
                    (Addressable) (parameterString == null ? MemoryAddress.NULL : Interop.allocateNativeString(parameterString)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a summary to the {@code application} option context.
     * <p>
     * See g_option_context_set_summary() for more information.
     * @param summary a string to be shown in {@code --help} output
     *  before the list of options, or {@code null}
     */
    public void setOptionContextSummary(@Nullable java.lang.String summary) {
        try {
            DowncallHandles.g_application_set_option_context_summary.invokeExact(
                    handle(),
                    (Addressable) (summary == null ? MemoryAddress.NULL : Interop.allocateNativeString(summary)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param resourcePath the resource path to use
     */
    public void setResourceBasePath(@Nullable java.lang.String resourcePath) {
        try {
            DowncallHandles.g_application_set_resource_base_path.invokeExact(
                    handle(),
                    (Addressable) (resourcePath == null ? MemoryAddress.NULL : Interop.allocateNativeString(resourcePath)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Destroys a binding between {@code property} and the busy state of
     * {@code application} that was previously created with
     * g_application_bind_busy_property().
     * @param object a {@link org.gtk.gobject.Object}
     * @param property the name of a boolean property of {@code object}
     */
    public void unbindBusyProperty(@NotNull org.gtk.gobject.Object object, @NotNull java.lang.String property) {
        java.util.Objects.requireNonNull(object, "Parameter 'object' must not be null");
        java.util.Objects.requireNonNull(property, "Parameter 'property' must not be null");
        try {
            DowncallHandles.g_application_unbind_busy_property.invokeExact(
                    handle(),
                    object.handle(),
                    Interop.allocateNativeString(property));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
        try {
            DowncallHandles.g_application_unmark_busy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param id id of a previously sent notification
     */
    public void withdrawNotification(@NotNull java.lang.String id) {
        java.util.Objects.requireNonNull(id, "Parameter 'id' must not be null");
        try {
            DowncallHandles.g_application_withdraw_notification.invokeExact(
                    handle(),
                    Interop.allocateNativeString(id));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_application_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Returns the default {@link Application} instance for this process.
     * <p>
     * Normally there is only one {@link Application} per process and it becomes
     * the default when it is created.  You can exercise more control over
     * this by using g_application_set_default().
     * <p>
     * If there is no default application then {@code null} is returned.
     * @return the default application for this process, or {@code null}
     */
    public static @Nullable org.gtk.gio.Application getDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_application_get_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.Application(RESULT, Ownership.NONE);
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
     * <ul>
     * <li>Application identifiers are composed of 1 or more elements separated by a
     *   period ({@code .}) character. All elements must contain at least one character.
     * </ul>
     * <ul>
     * <li>Each element must only contain the ASCII characters {@code [A-Z][a-z][0-9]_-},
     *   with {@code -} discouraged in new application identifiers. Each element must not
     *   begin with a digit.
     * </ul>
     * <ul>
     * <li>Application identifiers must contain at least one {@code .} (period) character
     *   (and thus at least two elements).
     * </ul>
     * <ul>
     * <li>Application identifiers must not begin with a {@code .} (period) character.
     * </ul>
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
     * @param applicationId a potential application identifier
     * @return {@code true} if {@code application_id} is valid
     */
    public static boolean idIsValid(@NotNull java.lang.String applicationId) {
        java.util.Objects.requireNonNull(applicationId, "Parameter 'applicationId' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_application_id_is_valid.invokeExact(
                    Interop.allocateNativeString(applicationId));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @FunctionalInterface
    public interface Activate {
        void signalReceived(Application source);
    }
    
    /**
     * The ::activate signal is emitted on the primary instance when an
     * activation occurs. See g_application_activate().
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Application.Activate> onActivate(Application.Activate handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Application.Callbacks.class, "signalApplicationActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Application.Activate>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface CommandLine {
        void signalReceived(Application source, @NotNull org.gtk.gio.ApplicationCommandLine commandLine);
    }
    
    /**
     * The ::command-line signal is emitted on the primary instance when
     * a commandline is not handled locally. See g_application_run() and
     * the {@link ApplicationCommandLine} documentation for more information.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Application.CommandLine> onCommandLine(Application.CommandLine handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("command-line"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Application.Callbacks.class, "signalApplicationCommandLine",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Application.CommandLine>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface HandleLocalOptions {
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Application.HandleLocalOptions> onHandleLocalOptions(Application.HandleLocalOptions handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("handle-local-options"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Application.Callbacks.class, "signalApplicationHandleLocalOptions",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Application.HandleLocalOptions>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface NameLost {
        boolean signalReceived(Application source);
    }
    
    /**
     * The ::name-lost signal is emitted only on the registered primary instance
     * when a new instance has taken over. This can only happen if the application
     * is using the {@link ApplicationFlags#ALLOW_REPLACEMENT} flag.
     * <p>
     * The default handler for this signal calls g_application_quit().
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Application.NameLost> onNameLost(Application.NameLost handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("name-lost"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Application.Callbacks.class, "signalApplicationNameLost",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Application.NameLost>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Open {
        void signalReceived(Application source, @NotNull org.gtk.gio.File[] files, int nFiles, @NotNull java.lang.String hint);
    }
    
    /**
     * The ::open signal is emitted on the primary instance when there are
     * files to open. See g_application_open() for more information.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Application.Open> onOpen(Application.Open handler) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    @FunctionalInterface
    public interface Shutdown {
        void signalReceived(Application source);
    }
    
    /**
     * The ::shutdown signal is emitted only on the registered primary instance
     * immediately after the main loop terminates.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Application.Shutdown> onShutdown(Application.Shutdown handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("shutdown"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Application.Callbacks.class, "signalApplicationShutdown",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Application.Shutdown>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Startup {
        void signalReceived(Application source);
    }
    
    /**
     * The ::startup signal is emitted on the primary instance immediately
     * after registration. See g_application_register().
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Application.Startup> onStartup(Application.Startup handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("startup"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Application.Callbacks.class, "signalApplicationStartup",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Application.Startup>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link Application.Build} object constructs a {@link Application} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Application} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Application} using {@link Application#castFrom}.
         * @return A new instance of {@code Application} with the properties 
         *         that were set in the Build object.
         */
        public Application construct() {
            return Application.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Application.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setActionGroup(org.gtk.gio.ActionGroup actionGroup) {
            names.add("action-group");
            values.add(org.gtk.gobject.Value.create(actionGroup));
            return this;
        }
        
        public Build setApplicationId(java.lang.String applicationId) {
            names.add("application-id");
            values.add(org.gtk.gobject.Value.create(applicationId));
            return this;
        }
        
        public Build setFlags(org.gtk.gio.ApplicationFlags flags) {
            names.add("flags");
            values.add(org.gtk.gobject.Value.create(flags));
            return this;
        }
        
        public Build setInactivityTimeout(int inactivityTimeout) {
            names.add("inactivity-timeout");
            values.add(org.gtk.gobject.Value.create(inactivityTimeout));
            return this;
        }
        
        /**
         * Whether the application is currently marked as busy through
         * g_application_mark_busy() or g_application_bind_busy_property().
         * @param isBusy The value for the {@code is-busy} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIsBusy(boolean isBusy) {
            names.add("is-busy");
            values.add(org.gtk.gobject.Value.create(isBusy));
            return this;
        }
        
        public Build setIsRegistered(boolean isRegistered) {
            names.add("is-registered");
            values.add(org.gtk.gobject.Value.create(isRegistered));
            return this;
        }
        
        public Build setIsRemote(boolean isRemote) {
            names.add("is-remote");
            values.add(org.gtk.gobject.Value.create(isRemote));
            return this;
        }
        
        public Build setResourceBasePath(java.lang.String resourceBasePath) {
            names.add("resource-base-path");
            values.add(org.gtk.gobject.Value.create(resourceBasePath));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_application_new = Interop.downcallHandle(
            "g_application_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_application_activate = Interop.downcallHandle(
            "g_application_activate",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_add_main_option = Interop.downcallHandle(
            "g_application_add_main_option",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_add_main_option_entries = Interop.downcallHandle(
            "g_application_add_main_option_entries",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_add_option_group = Interop.downcallHandle(
            "g_application_add_option_group",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_bind_busy_property = Interop.downcallHandle(
            "g_application_bind_busy_property",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_get_application_id = Interop.downcallHandle(
            "g_application_get_application_id",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_get_dbus_connection = Interop.downcallHandle(
            "g_application_get_dbus_connection",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_get_dbus_object_path = Interop.downcallHandle(
            "g_application_get_dbus_object_path",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_get_flags = Interop.downcallHandle(
            "g_application_get_flags",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_get_inactivity_timeout = Interop.downcallHandle(
            "g_application_get_inactivity_timeout",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_get_is_busy = Interop.downcallHandle(
            "g_application_get_is_busy",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_get_is_registered = Interop.downcallHandle(
            "g_application_get_is_registered",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_get_is_remote = Interop.downcallHandle(
            "g_application_get_is_remote",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_get_resource_base_path = Interop.downcallHandle(
            "g_application_get_resource_base_path",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_hold = Interop.downcallHandle(
            "g_application_hold",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_mark_busy = Interop.downcallHandle(
            "g_application_mark_busy",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_open = Interop.downcallHandle(
            "g_application_open",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_quit = Interop.downcallHandle(
            "g_application_quit",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_register = Interop.downcallHandle(
            "g_application_register",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_release = Interop.downcallHandle(
            "g_application_release",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_run = Interop.downcallHandle(
            "g_application_run",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_send_notification = Interop.downcallHandle(
            "g_application_send_notification",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_set_action_group = Interop.downcallHandle(
            "g_application_set_action_group",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_set_application_id = Interop.downcallHandle(
            "g_application_set_application_id",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_set_default = Interop.downcallHandle(
            "g_application_set_default",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_set_flags = Interop.downcallHandle(
            "g_application_set_flags",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_application_set_inactivity_timeout = Interop.downcallHandle(
            "g_application_set_inactivity_timeout",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_application_set_option_context_description = Interop.downcallHandle(
            "g_application_set_option_context_description",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_set_option_context_parameter_string = Interop.downcallHandle(
            "g_application_set_option_context_parameter_string",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_set_option_context_summary = Interop.downcallHandle(
            "g_application_set_option_context_summary",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_set_resource_base_path = Interop.downcallHandle(
            "g_application_set_resource_base_path",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_unbind_busy_property = Interop.downcallHandle(
            "g_application_unbind_busy_property",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_unmark_busy = Interop.downcallHandle(
            "g_application_unmark_busy",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_withdraw_notification = Interop.downcallHandle(
            "g_application_withdraw_notification",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_get_type = Interop.downcallHandle(
            "g_application_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_application_get_default = Interop.downcallHandle(
            "g_application_get_default",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_application_id_is_valid = Interop.downcallHandle(
            "g_application_id_is_valid",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalApplicationActivate(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Application.Activate) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Application(source, Ownership.NONE));
        }
        
        public static void signalApplicationCommandLine(MemoryAddress source, MemoryAddress commandLine, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Application.CommandLine) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Application(source, Ownership.NONE), new org.gtk.gio.ApplicationCommandLine(commandLine, Ownership.NONE));
        }
        
        public static void signalApplicationHandleLocalOptions(MemoryAddress source, MemoryAddress options, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Application.HandleLocalOptions) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Application(source, Ownership.NONE), new org.gtk.glib.VariantDict(options, Ownership.NONE));
        }
        
        public static boolean signalApplicationNameLost(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Application.NameLost) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new Application(source, Ownership.NONE));
        }
        
        public static void signalApplicationOpen(MemoryAddress source, MemoryAddress files, int nFiles, MemoryAddress hint, MemoryAddress data) {
        // Operation not supported yet
    }
        
        public static void signalApplicationShutdown(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Application.Shutdown) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Application(source, Ownership.NONE));
        }
        
        public static void signalApplicationStartup(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Application.Startup) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Application(source, Ownership.NONE));
        }
    }
}
