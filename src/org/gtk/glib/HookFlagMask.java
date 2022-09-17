package org.gtk.glib;

/**
 * Flags used internally in the #GHook implementation.
 */
public class HookFlagMask {

    /**
     * set if the hook has not been destroyed
     */
    public static final int ACTIVE = 1;
    
    /**
     * set if the hook is currently being run
     */
    public static final int IN_CALL = 2;
    
    /**
     * A mask covering all bits reserved for
     *   hook flags; see 
     *       
     *       
     *         A mask covering all bits reserved for
     *   hook flags; see %G_HOOK_FLAG_USER_SHIFT
     */
    public static final int MASK = 15;
    
}
