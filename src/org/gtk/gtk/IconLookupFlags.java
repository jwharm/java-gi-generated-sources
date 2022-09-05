package org.gtk.gtk;

/**
 * Used to specify options for gtk_icon_theme_lookup_icon().
 */
public class IconLookupFlags {

    /**
     * Try to always load regular icons, even
     *   when symbolic icon names are given
     */
    public static final int FORCE_REGULAR = 1;
    
    /**
     * Try to always load symbolic icons, even
     *   when regular icon names are given
     */
    public static final int FORCE_SYMBOLIC = 2;
    
    /**
     * Starts loading the texture in the background
     *   so it is ready when later needed.
     */
    public static final int PRELOAD = 4;
    
}
