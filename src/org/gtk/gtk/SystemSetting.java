package org.gtk.gtk;

/**
 * Values that can be passed to the {@link org.gtk.gtk.Widget<code>#systemSettingChanged</code> 
 * vfunc.
 * 
 * The values indicate which system setting has changed.
 * Widgets may need to drop caches, or react otherwise.
 * 
 * Most of the values correspond to {@link [class@Settings]} properties.
 * 
 * More values may be added over time.
 */
public enum SystemSetting {

    /**
     * the {@link [property@Gtk.Settings:gtk-xft-dpi] (ref=property)} setting has changed
     */
    DPI,
    
    /**
     * The {@link [property@Gtk.Settings:gtk-font-name] (ref=property)} setting has changed
     */
    FONT_NAME,
    
    /**
     * The font configuration has changed in a way that
     *   requires text to be redrawn. This can be any of the
     *   {@link [property@Gtk.Settings:gtk-xft-antialias] (ref=property)},
     *   {@link [property@Gtk.Settings:gtk-xft-hinting] (ref=property)},
     *   {@link [property@Gtk.Settings:gtk-xft-hintstyle] (ref=property)},
     *   {@link [property@Gtk.Settings:gtk-xft-rgba] (ref=property)} or
     *   {@link [property@Gtk.Settings:gtk-fontconfig-timestamp] (ref=property)} settings
     */
    FONT_CONFIG,
    
    /**
     * The display has changed
     */
    DISPLAY,
    
    /**
     * The icon theme has changed in a way that requires
     *   icons to be looked up again
     */
    ICON_THEME;
    
    public static SystemSetting fromValue(int value) {
        return switch(value) {
            case 0 -> DPI;
            case 1 -> FONT_NAME;
            case 2 -> FONT_CONFIG;
            case 3 -> DISPLAY;
            case 4 -> ICON_THEME;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case DPI -> 0;
            case FONT_NAME -> 1;
            case FONT_CONFIG -> 2;
            case DISPLAY -> 3;
            case ICON_THEME -> 4;
        };
    }

}
