package org.gtk.gio;

/**
 * Flags used to define the behaviour of a {@link org.gtk.gio.Application}
 */
public class ApplicationFlags {

    /**
     * Default
     */
    public static final int FLAGS_NONE = 0;
    
    /**
     * Run as a service. In this mode, registration
     *      fails if the service is already running, and the application
     *      will initially wait up to 10 seconds for an initial activation
     *      message to arrive.
     */
    public static final int IS_SERVICE = 1;
    
    /**
     * Don&<code>#39</code> t try to become the primary instance.
     */
    public static final int IS_LAUNCHER = 2;
    
    /**
     * This application handles opening files (in
     *     the primary instance). Note that this flag only affects the default
     *     implementation of local_command_line(), and has no effect if
     *     {@link org.gtk.gio.ApplicationFlags<code>#HANDLES_COMMAND_LINE</code>  is given.
     *     See g_application_run() for details.
     */
    public static final int HANDLES_OPEN = 4;
    
    /**
     * This application handles command line
     *     arguments (in the primary instance). Note that this flag only affect
     *     the default implementation of local_command_line().
     *     See g_application_run() for details.
     */
    public static final int HANDLES_COMMAND_LINE = 8;
    
    /**
     * Send the environment of the
     *     launching process to the primary instance. Set this flag if your
     *     application is expected to behave differently depending on certain
     *     environment variables. For instance, an editor might be expected
     *     to use the <code>GIT_COMMITTER_NAME</code> environment variable
     *     when editing a git commit message. The environment is available
     *     to the {@link org.gtk.gio.Application} :command-line signal handler, via
     *     g_application_command_line_getenv().
     */
    public static final int SEND_ENVIRONMENT = 16;
    
    /**
     * Make no attempts to do any of the typical
     *     single-instance application negotiation, even if the application
     *     ID is given.  The application neither attempts to become the
     *     owner of the application ID nor does it check if an existing
     *     owner already exists.  Everything occurs in the local process.
     *     Since: 2.30.
     */
    public static final int NON_UNIQUE = 32;
    
    /**
     * Allow users to override the
     *     application ID from the command line with <code>--gapplication-app-id</code>.
     *     Since: 2.48
     */
    public static final int CAN_OVERRIDE_APP_ID = 64;
    
    /**
     * Allow another instance to take over
     *     the bus name. Since: 2.60
     */
    public static final int ALLOW_REPLACEMENT = 128;
    
    /**
     * Take over from another instance. This flag is
     *     usually set by passing <code>--gapplication-replace</code> on the commandline.
     *     Since: 2.60
     */
    public static final int REPLACE = 256;
    
}
