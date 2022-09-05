package org.gtk.glib;

/**
 * Flags specifying the level of log messages.
 * 
 * It is possible to change how GLib treats messages of the various
 * levels using g_log_set_handler() and g_log_set_fatal_mask().
 */
public class LogLevelFlags {

    /**
     * internal flag
     */
    public static final int FLAG_RECURSION = 1;
    
    /**
     * internal flag
     */
    public static final int FLAG_FATAL = 2;
    
    /**
     * log level for errors, see g_error().
     *     This level is also used for messages produced by g_assert().
     */
    public static final int LEVEL_ERROR = 4;
    
    /**
     * log level for critical warning messages, see
     *     g_critical().
     *     This level is also used for messages produced by g_return_if_fail()
     *     and g_return_val_if_fail().
     */
    public static final int LEVEL_CRITICAL = 8;
    
    /**
     * log level for warnings, see g_warning()
     */
    public static final int LEVEL_WARNING = 16;
    
    /**
     * log level for messages, see g_message()
     */
    public static final int LEVEL_MESSAGE = 32;
    
    /**
     * log level for informational messages, see g_info()
     */
    public static final int LEVEL_INFO = 64;
    
    /**
     * log level for debug messages, see g_debug()
     */
    public static final int LEVEL_DEBUG = 128;
    
    /**
     * a mask including all log levels
     */
    public static final int LEVEL_MASK = -4;
    
}
