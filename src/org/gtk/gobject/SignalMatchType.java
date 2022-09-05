package org.gtk.gobject;

/**
 * The match types specify what g_signal_handlers_block_matched(),
 * g_signal_handlers_unblock_matched() and g_signal_handlers_disconnect_matched()
 * match signals by.
 */
public class SignalMatchType {

    /**
     * The signal id must be equal.
     */
    public static final int ID = 1;
    
    /**
     * The signal detail must be equal.
     */
    public static final int DETAIL = 2;
    
    /**
     * The closure must be the same.
     */
    public static final int CLOSURE = 4;
    
    /**
     * The C closure callback must be the same.
     */
    public static final int FUNC = 8;
    
    /**
     * The closure data must be the same.
     */
    public static final int DATA = 16;
    
    /**
     * Only unblocked signals may be matched.
     */
    public static final int UNBLOCKED = 32;
    
}
