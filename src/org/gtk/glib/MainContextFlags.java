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
     * free the thread to process other jobs. That&#39;s useful if you&#39;re using<code>g_main_context_{prepare,query,check,dispatch}</code> to integrate GMainContext in
     * other event loops.
     */
    public static final int OWNERLESS_POLLING = 1;
    
}
