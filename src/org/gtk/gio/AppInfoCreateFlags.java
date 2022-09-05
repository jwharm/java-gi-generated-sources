package org.gtk.gio;

/**
 * Flags used when creating a #GAppInfo.
 */
public class AppInfoCreateFlags {

    /**
     * No flags.
     */
    public static final int NONE = 0;
    
    /**
     * Application opens in a terminal window.
     */
    public static final int NEEDS_TERMINAL = 1;
    
    /**
     * Application supports URI arguments.
     */
    public static final int SUPPORTS_URIS = 2;
    
    /**
     * Application supports startup notification. Since 2.26
     */
    public static final int SUPPORTS_STARTUP_NOTIFICATION = 4;
    
}
