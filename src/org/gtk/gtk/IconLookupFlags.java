package org.gtk.gtk;

/**
 * Used to specify options for gtk_icon_theme_lookup_icon().
 */
public class IconLookupFlags {

    /**
     * Try to always load regular icons, even
     *   when symbolic icon names are given
     */
    public static final IconLookupFlags FORCE_REGULAR = new IconLookupFlags(1);
    
    /**
     * Try to always load symbolic icons, even
     *   when regular icon names are given
     */
    public static final IconLookupFlags FORCE_SYMBOLIC = new IconLookupFlags(2);
    
    /**
     * Starts loading the texture in the background
     *   so it is ready when later needed.
     */
    public static final IconLookupFlags PRELOAD = new IconLookupFlags(4);
    
    private int value;
    
    public IconLookupFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(IconLookupFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public IconLookupFlags combined(IconLookupFlags mask) {
        return new IconLookupFlags(this.getValue() | mask.getValue());
    }
    
    public static IconLookupFlags combined(IconLookupFlags mask, IconLookupFlags... masks) {
        int value = mask.getValue();
        for (IconLookupFlags arg : masks) {
            value |= arg.getValue();
        }
        return new IconLookupFlags(value);
    }
    
}
