package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags used to define the behaviour of a {@link Application}.
 * @version 2.28
 */
public class ApplicationFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GApplicationFlags";
    
    /**
     * Default. Deprecated in 2.74, use
     *   {@link ApplicationFlags#DEFAULT_FLAGS} instead
     */
    public static final ApplicationFlags FLAGS_NONE = new ApplicationFlags(0);
    
    /**
     * Default flags. Since: 2.74
     */
    public static final ApplicationFlags DEFAULT_FLAGS = new ApplicationFlags(0);
    
    /**
     * Run as a service. In this mode, registration
     *      fails if the service is already running, and the application
     *      will initially wait up to 10 seconds for an initial activation
     *      message to arrive.
     */
    public static final ApplicationFlags IS_SERVICE = new ApplicationFlags(1);
    
    /**
     * Don't try to become the primary instance.
     */
    public static final ApplicationFlags IS_LAUNCHER = new ApplicationFlags(2);
    
    /**
     * This application handles opening files (in
     *     the primary instance). Note that this flag only affects the default
     *     implementation of local_command_line(), and has no effect if
     *     {@link ApplicationFlags#HANDLES_COMMAND_LINE} is given.
     *     See g_application_run() for details.
     */
    public static final ApplicationFlags HANDLES_OPEN = new ApplicationFlags(4);
    
    /**
     * This application handles command line
     *     arguments (in the primary instance). Note that this flag only affect
     *     the default implementation of local_command_line().
     *     See g_application_run() for details.
     */
    public static final ApplicationFlags HANDLES_COMMAND_LINE = new ApplicationFlags(8);
    
    /**
     * Send the environment of the
     *     launching process to the primary instance. Set this flag if your
     *     application is expected to behave differently depending on certain
     *     environment variables. For instance, an editor might be expected
     *     to use the {@code GIT_COMMITTER_NAME} environment variable
     *     when editing a git commit message. The environment is available
     *     to the {@link Application}::command-line signal handler, via
     *     g_application_command_line_getenv().
     */
    public static final ApplicationFlags SEND_ENVIRONMENT = new ApplicationFlags(16);
    
    /**
     * Make no attempts to do any of the typical
     *     single-instance application negotiation, even if the application
     *     ID is given.  The application neither attempts to become the
     *     owner of the application ID nor does it check if an existing
     *     owner already exists.  Everything occurs in the local process.
     *     Since: 2.30.
     */
    public static final ApplicationFlags NON_UNIQUE = new ApplicationFlags(32);
    
    /**
     * Allow users to override the
     *     application ID from the command line with {@code --gapplication-app-id}.
     *     Since: 2.48
     */
    public static final ApplicationFlags CAN_OVERRIDE_APP_ID = new ApplicationFlags(64);
    
    /**
     * Allow another instance to take over
     *     the bus name. Since: 2.60
     */
    public static final ApplicationFlags ALLOW_REPLACEMENT = new ApplicationFlags(128);
    
    /**
     * Take over from another instance. This flag is
     *     usually set by passing {@code --gapplication-replace} on the commandline.
     *     Since: 2.60
     */
    public static final ApplicationFlags REPLACE = new ApplicationFlags(256);
    
    public ApplicationFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public ApplicationFlags or(ApplicationFlags mask) {
        return new ApplicationFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static ApplicationFlags combined(ApplicationFlags mask, ApplicationFlags... masks) {
        int value = mask.getValue();        for (ApplicationFlags arg : masks) {
            value |= arg.getValue();
        }
        return new ApplicationFlags(value);
    }
}
