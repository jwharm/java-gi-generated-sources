package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A class for managing application-wide styling.
 * <p>
 * {@code AdwStyleManager} provides a way to query and influence the application
 * styles, such as whether to use dark or high contrast appearance.
 * <p>
 * It allows to set the color scheme via the
 * {@code StyleManager:color-scheme} property, and to query the current
 * appearance, as well as whether a system-wide color scheme preference exists.
 */
public class StyleManager extends org.gtk.gobject.Object {

    public StyleManager(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to StyleManager */
    public static StyleManager castFrom(org.gtk.gobject.Object gobject) {
        return new StyleManager(gobject.refcounted());
    }
    
    /**
     * Gets the requested application color scheme.
     */
    public ColorScheme getColorScheme() {
        var RESULT = gtk_h.adw_style_manager_get_color_scheme(handle());
        return new ColorScheme(RESULT);
    }
    
    /**
     * Gets whether the application is using dark appearance.
     */
    public boolean getDark() {
        var RESULT = gtk_h.adw_style_manager_get_dark(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the display the style manager is associated with.
     * <p>
     * The display will be {@code NULL} for the style manager returned by
     * {@link StyleManager#getDefault}.
     */
    public org.gtk.gdk.Display getDisplay() {
        var RESULT = gtk_h.adw_style_manager_get_display(handle());
        return new org.gtk.gdk.Display(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets whether the application is using high contrast appearance.
     */
    public boolean getHighContrast() {
        var RESULT = gtk_h.adw_style_manager_get_high_contrast(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets whether the system supports color schemes.
     */
    public boolean getSystemSupportsColorSchemes() {
        var RESULT = gtk_h.adw_style_manager_get_system_supports_color_schemes(handle());
        return RESULT != 0;
    }
    
    /**
     * Sets the requested application color scheme.
     * <p>
     * The effective appearance will be decided based on the application color
     * scheme and the system preferred color scheme. The
     * {@code StyleManager:dark} property can be used to query the current
     * effective appearance.
     */
    public void setColorScheme(ColorScheme colorScheme) {
        gtk_h.adw_style_manager_set_color_scheme(handle(), colorScheme.getValue());
    }
    
    /**
     * Gets the default {@code AdwStyleManager} instance.
     * <p>
     * It manages all {@link org.gtk.gdk.Display} instances unless the style manager for
     * that display has an override.
     * <p>
     * See {@link StyleManager#getForDisplay}.
     */
    public static StyleManager getDefault() {
        var RESULT = gtk_h.adw_style_manager_get_default();
        return new StyleManager(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the {@code AdwStyleManager} instance managing {@code display}.
     * <p>
     * It can be used to override styles for that specific display instead of the
     * whole application.
     * <p>
     * Most applications should use {@link StyleManager#getDefault} instead.
     */
    public static StyleManager getForDisplay(org.gtk.gdk.Display display) {
        var RESULT = gtk_h.adw_style_manager_get_for_display(display.handle());
        return new StyleManager(Refcounted.get(RESULT, false));
    }
    
}
