package org.gtk.gobject;

/**
 * These flags used to be passed to g_type_init_with_debug_flags() which
 * is now deprecated.
 * 
 * If you need to enable debugging features, use the GOBJECT_DEBUG
 * environment variable.
 */
public class TypeDebugFlags {

    /**
     * Print no messages
     */
    public static final int NONE = 0;
    
    /**
     * Print messages about object bookkeeping
     */
    public static final int OBJECTS = 1;
    
    /**
     * Print messages about signal emissions
     */
    public static final int SIGNALS = 2;
    
    /**
     * Keep a count of instances of each type
     */
    public static final int INSTANCE_COUNT = 4;
    
    /**
     * Mask covering all debug flags
     */
    public static final int MASK = 7;
    
}
