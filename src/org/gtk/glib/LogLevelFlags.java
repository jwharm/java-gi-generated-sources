package org.gtk.glib;

/**
 * Flags specifying the level of log messages.
 * <p>
 * It is possible to change how GLib treats messages of the various
 * levels using g_log_set_handler() and g_log_set_fatal_mask().
 */
public class LogLevelFlags {

    /**
     * internal flag
     */
    public static final LogLevelFlags FLAG_RECURSION = new LogLevelFlags(1);
    
    /**
     * internal flag
     */
    public static final LogLevelFlags FLAG_FATAL = new LogLevelFlags(2);
    
    /**
     * log level for errors, see g_error().
     *     This level is also used for messages produced by g_assert().
     */
    public static final LogLevelFlags LEVEL_ERROR = new LogLevelFlags(4);
    
    /**
     * log level for critical warning messages, see
     *     g_critical().
     *     This level is also used for messages produced by g_return_if_fail()
     *     and g_return_val_if_fail().
     */
    public static final LogLevelFlags LEVEL_CRITICAL = new LogLevelFlags(8);
    
    /**
     * log level for warnings, see g_warning()
     */
    public static final LogLevelFlags LEVEL_WARNING = new LogLevelFlags(16);
    
    /**
     * log level for messages, see g_message()
     */
    public static final LogLevelFlags LEVEL_MESSAGE = new LogLevelFlags(32);
    
    /**
     * log level for informational messages, see g_info()
     */
    public static final LogLevelFlags LEVEL_INFO = new LogLevelFlags(64);
    
    /**
     * log level for debug messages, see g_debug()
     */
    public static final LogLevelFlags LEVEL_DEBUG = new LogLevelFlags(128);
    
    /**
     * a mask including all log levels
     */
    public static final LogLevelFlags LEVEL_MASK = new LogLevelFlags(-4);
    
    private int value;
    
    public LogLevelFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(LogLevelFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public LogLevelFlags combined(LogLevelFlags mask) {
        return new LogLevelFlags(this.getValue() | mask.getValue());
    }
    
    public static LogLevelFlags combined(LogLevelFlags mask, LogLevelFlags... masks) {
        int value = mask.getValue();
        for (LogLevelFlags arg : masks) {
            value |= arg.getValue();
        }
        return new LogLevelFlags(value);
    }
    
}
