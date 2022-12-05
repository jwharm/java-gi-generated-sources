package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Values that can be passed to the {@code Widget#systemSettingChanged}
 * vfunc.
 * <p>
 * The values indicate which system setting has changed.
 * Widgets may need to drop caches, or react otherwise.
 * <p>
 * Most of the values correspond to {@link Settings} properties.
 * <p>
 * More values may be added over time.
 */
public enum SystemSetting implements io.github.jwharm.javagi.Enumeration {
    /**
     * the {@code Gtk.Settings:gtk-xft-dpi} setting has changed
     */
    DPI(0),
    /**
     * The {@code Gtk.Settings:gtk-font-name} setting has changed
     */
    FONT_NAME(1),
    /**
     * The font configuration has changed in a way that
     *   requires text to be redrawn. This can be any of the
     *   {@code Gtk.Settings:gtk-xft-antialias},
     *   {@code Gtk.Settings:gtk-xft-hinting},
     *   {@code Gtk.Settings:gtk-xft-hintstyle},
     *   {@code Gtk.Settings:gtk-xft-rgba} or
     *   {@code Gtk.Settings:gtk-fontconfig-timestamp} settings
     */
    FONT_CONFIG(2),
    /**
     * The display has changed
     */
    DISPLAY(3),
    /**
     * The icon theme has changed in a way that requires
     *   icons to be looked up again
     */
    ICON_THEME(4);
    
    private static final java.lang.String C_TYPE_NAME = "GtkSystemSetting";
    
    private final int value;
    SystemSetting(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static SystemSetting of(int value) {
        return switch (value) {
            case 0 -> DPI;
            case 1 -> FONT_NAME;
            case 2 -> FONT_CONFIG;
            case 3 -> DISPLAY;
            case 4 -> ICON_THEME;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
