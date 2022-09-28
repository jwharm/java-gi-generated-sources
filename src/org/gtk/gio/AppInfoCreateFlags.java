package org.gtk.gio;

/**
 * Flags used when creating a {@link AppInfo}.
 */
public class AppInfoCreateFlags {

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
    
    private int value;
    
    public AppInfoCreateFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(AppInfoCreateFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public AppInfoCreateFlags combined(AppInfoCreateFlags mask) {
        return new AppInfoCreateFlags(this.getValue() | mask.getValue());
    }
    
    public static AppInfoCreateFlags combined(AppInfoCreateFlags mask, AppInfoCreateFlags... masks) {
        int value = mask.getValue();
        for (AppInfoCreateFlags arg : masks) {
            value |= arg.getValue();
        }
        return new AppInfoCreateFlags(value);
    }
    
}
