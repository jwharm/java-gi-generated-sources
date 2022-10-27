package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Application color schemes for {@code StyleManager:color-scheme}.
 * @version 1.0
 */
public class ColorScheme extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Inherit the parent color-scheme. When set on the
     *   {@code AdwStyleManager} returned by {@code StyleManager.StyleManager#getDefault}, it's
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
    
    public ColorScheme(int value) {
        super(value);
    }
}
