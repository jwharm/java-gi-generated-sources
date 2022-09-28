package org.gtk.gtk;

/**
 * Used to specify options for gtk_icon_theme_lookup_icon().
 */
public class IconLookupFlags extends io.github.jwharm.javagi.Bitfield {

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
    
    public IconLookupFlags(int value) {
        super(value);
    }
    
}
