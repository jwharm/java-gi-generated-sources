package org.gtk.gio;

/**
 * Flags used when creating a {@link AppInfo}.
 */
public class AppInfoCreateFlags extends io.github.jwharm.javagi.Bitfield {

    /**
     * No flags.
     */
    public static final AppInfoCreateFlags NONE = new AppInfoCreateFlags(0);
    
    /**
     * Application opens in a terminal window.
     */
    public static final AppInfoCreateFlags NEEDS_TERMINAL = new AppInfoCreateFlags(1);
    
    /**
     * Application supports URI arguments.
     */
    public static final AppInfoCreateFlags SUPPORTS_URIS = new AppInfoCreateFlags(2);
    
    /**
     * Application supports startup notification. Since 2.26
     */
    public static final AppInfoCreateFlags SUPPORTS_STARTUP_NOTIFICATION = new AppInfoCreateFlags(4);
    
    public AppInfoCreateFlags(int value) {
        super(value);
    }
    
}
