package org.gtk.gtk;

/**
 * Values that can be passed to the [vfunc@Gtk.Widget.system_setting_changed]
 * vfunc.
 * 
 * The values indicate which system setting has changed.
 * Widgets may need to drop caches, or react otherwise.
 * 
 * Most of the values correspond to [class@Settings] properties.
 * 
 * More values may be added over time.
 */
public enum SystemSetting {

    /**
     * the [property@Gtk.Settings:gtk-xft-dpi] setting has changed
     */
    DPI,
    
    /**
     * The [property@Gtk.Settings:gtk-font-name] setting has changed
     */
    FONT_NAME,
    
    /**
     * The font configuration has changed in a way that
     *   requires text to be redrawn. This can be any of the
     *   [property@Gtk.Settings:gtk-xft-antialias],
     *   [property@Gtk.Settings:gtk-xft-hinting],
     *   [property@Gtk.Settings:gtk-xft-hintstyle],
     *   [property@Gtk.Settings:gtk-xft-rgba] or
     *   [property@Gtk.Settings:gtk-fontconfig-timestamp] settings
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
