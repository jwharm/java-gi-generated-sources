package org.gtk.glib;

/**
 * Flags to pass to g_main_context_new_with_flags() which affect the behaviour
 * of a #GMainContext.
 */
public class MainContextFlags {

    /**
     * Default behaviour.
     */
    public static final int NONE = 0;
    
    /**
     * Assume that polling for events will
     * free the thread to process other jobs. That's useful if you're using
     * `g_main_context_{prepare,query,check,dispatch}` to integrate GMainContext in
     * other event loops.
     */
    public static final int OWNERLESS_POLLING = 1;
    
}
