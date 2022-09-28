package org.gnome.adw;

/**
 * Application color schemes for {@code StyleManager:color-scheme}.
 */
public class ColorScheme {

    /**
     * Inherit the parent color-scheme. When set on the
     *   {@code AdwStyleManager} returned by {@link StyleManager#getDefault}, it's
     *   equivalent to {@code ADW_COLOR_SCHEME_PREFER_LIGHT}.
     */
    public static final ColorScheme DEFAULT = new ColorScheme(0);
    
    /**
     * Always use light appearance.
     */
    public static final ColorScheme FORCE_LIGHT = new ColorScheme(1);
    
    /**
     * Use light appearance unless the system
     *   prefers dark colors.
     */
    public static final ColorScheme PREFER_LIGHT = new ColorScheme(2);
    
    /**
     * Use dark appearance unless the system prefers
     *   prefers light colors.
     */
    public static final ColorScheme PREFER_DARK = new ColorScheme(3);
    
    /**
     * Always use dark appearance.
     */
    public static final ColorScheme FORCE_DARK = new ColorScheme(4);
    
    private int value;
    
    public ColorScheme(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(ColorScheme[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
