package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Application color schemes for {@code StyleManager:color-scheme}.
 * @version 1.0
 */
public enum ColorScheme implements io.github.jwharm.javagi.Enumeration {
    /**
     * Inherit the parent color-scheme. When set on the
     *   {@code AdwStyleManager} returned by {@code StyleManager.StyleManager#getDefault}, it's
     *   equivalent to {@code ADW_COLOR_SCHEME_PREFER_LIGHT}.
     */
    DEFAULT(0),
    /**
     * Always use light appearance.
     */
    FORCE_LIGHT(1),
    /**
     * Use light appearance unless the system
     *   prefers dark colors.
     */
    PREFER_LIGHT(2),
    /**
     * Use dark appearance unless the system prefers
     *   prefers light colors.
     */
    PREFER_DARK(3),
    /**
     * Always use dark appearance.
     */
    FORCE_DARK(4);
    
    private static final java.lang.String C_TYPE_NAME = "AdwColorScheme";
    
    private final int value;
    ColorScheme(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static ColorScheme of(int value) {
        return switch (value) {
            case 0 -> DEFAULT;
            case 1 -> FORCE_LIGHT;
            case 2 -> PREFER_LIGHT;
            case 3 -> PREFER_DARK;
            case 4 -> FORCE_DARK;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
