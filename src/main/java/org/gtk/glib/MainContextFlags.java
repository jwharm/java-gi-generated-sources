package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags to pass to g_main_context_new_with_flags() which affect the behaviour
 * of a {@link MainContext}.
 * @version 2.72
 */
public class MainContextFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GMainContextFlags";
    
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
