package org.gtk.gobject;

/**
 * The connection flags are used to specify the behaviour of a signal&#39;s
 * connection.
 */
public class ConnectFlags {

    /**
     * whether the handler should be called before or after the
     *  default handler of the signal.
     */
    public static final int AFTER = 1;
    
    /**
     * whether the instance and data should be swapped when
     *  calling the handler; see g_signal_connect_swapped() for an example.
     */
    public static final int SWAPPED = 2;
    
}
