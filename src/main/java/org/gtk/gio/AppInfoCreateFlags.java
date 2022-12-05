package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags used when creating a {@link AppInfo}.
 */
public class AppInfoCreateFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GAppInfoCreateFlags";
    
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
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public AppInfoCreateFlags or(AppInfoCreateFlags mask) {
        return new AppInfoCreateFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static AppInfoCreateFlags combined(AppInfoCreateFlags mask, AppInfoCreateFlags... masks) {
        int value = mask.getValue();        for (AppInfoCreateFlags arg : masks) {
            value |= arg.getValue();
        }
        return new AppInfoCreateFlags(value);
    }
}
