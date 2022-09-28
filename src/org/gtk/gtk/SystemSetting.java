package org.gtk.gtk;

/**
 * Values that can be passed to the {@link Widget#systemSettingChanged}
 * vfunc.
 * <p>
 * The values indicate which system setting has changed.
 * Widgets may need to drop caches, or react otherwise.
 * <p>
 * Most of the values correspond to {@link Settings} properties.
 * <p>
 * More values may be added over time.
 */
public class SystemSetting extends io.github.jwharm.javagi.Enumeration {

    /**
     * the {@code Gtk.Settings:gtk-xft-dpi} setting has changed
     */
    public static final SystemSetting DPI = new SystemSetting(0);
    
    /**
     * The {@code Gtk.Settings:gtk-font-name} setting has changed
     */
    public static final SystemSetting FONT_NAME = new SystemSetting(1);
    
    /**
     * The font configuration has changed in a way that
     *   requires text to be redrawn. This can be any of the
     *   {@code Gtk.Settings:gtk-xft-antialias},
     *   {@code Gtk.Settings:gtk-xft-hinting},
     *   {@code Gtk.Settings:gtk-xft-hintstyle},
     *   {@code Gtk.Settings:gtk-xft-rgba} or
     *   {@code Gtk.Settings:gtk-fontconfig-timestamp} settings
     */
    public static final SystemSetting FONT_CONFIG = new SystemSetting(2);
    
    /**
     * The display has changed
     */
    public static final SystemSetting DISPLAY = new SystemSetting(3);
    
    /**
     * The icon theme has changed in a way that requires
     *   icons to be looked up again
     */
    public static final SystemSetting ICON_THEME = new SystemSetting(4);
    
    public SystemSetting(int value) {
        super(value);
    }
    
}
