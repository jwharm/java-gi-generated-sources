package org.gtk.glib;

/**
 * Flags to pass to g_main_context_new_with_flags() which affect the behaviour
 * of a {@link MainContext}.
 */
public class MainContextFlags extends io.github.jwharm.javagi.Bitfield {

    /**
     * Default behaviour.
     */
    public static final MainContextFlags NONE = new MainContextFlags(0);
    
    /**
     * Assume that polling for events will
     * free the thread to process other jobs. That's useful if you're using
     * {@code g_main_context_{prepare,query,check,dispatch}} to integrate GMainContext in
     * other event loops.
     */
    public static final MainContextFlags OWNERLESS_POLLING = new MainContextFlags(1);
    
    public MainContextFlags(int value) {
        super(value);
    }
    
}