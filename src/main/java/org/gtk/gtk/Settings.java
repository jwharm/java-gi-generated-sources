package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkSettings} provides a mechanism to share global settings between
 * applications.
 * <p>
 * On the X window system, this sharing is realized by an
 * <a href="http://www.freedesktop.org/wiki/Specifications/xsettings-spec">XSettings</a>
 * manager that is usually part of the desktop environment, along with
 * utilities that let the user change these settings.
 * <p>
 * On Wayland, the settings are obtained either via a settings portal,
 * or by reading desktop settings from DConf.
 * <p>
 * In the absence of these sharing mechanisms, GTK reads default values for
 * settings from {@code settings.ini} files in {@code /etc/gtk-4.0}, {@code $XDG_CONFIG_DIRS/gtk-4.0}
 * and {@code $XDG_CONFIG_HOME/gtk-4.0}. These files must be valid key files (see
 * {@code GKeyFile}), and have a section called Settings. Themes can also provide
 * default values for settings by installing a {@code settings.ini} file
 * next to their {@code gtk.css} file.
 * <p>
 * Applications can override system-wide settings by setting the property
 * of the {@code GtkSettings} object with g_object_set(). This should be restricted
 * to special cases though; {@code GtkSettings} are not meant as an application
 * configuration facility.
 * <p>
 * There is one {@code GtkSettings} instance per display. It can be obtained with
 * {@link Gtk#Settings}, but in many cases, it is more
 * convenient to use {@link Widget#getSettings}.
 */
public class Settings extends org.gtk.gobject.Object implements StyleProvider {

    public Settings(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Settings */
    public static Settings castFrom(org.gtk.gobject.Object gobject) {
        return new Settings(gobject.refcounted());
    }
    
    static final MethodHandle gtk_settings_reset_property = Interop.downcallHandle(
        "gtk_settings_reset_property",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Undoes the effect of calling g_object_set() to install an
     * application-specific value for a setting.
     * <p>
     * After this call, the setting will again follow the session-wide
     * value for this setting.
     */
    public void resetProperty(java.lang.String name) {
        try {
            gtk_settings_reset_property.invokeExact(handle(), Interop.allocateNativeString(name).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_settings_get_default = Interop.downcallHandle(
        "gtk_settings_get_default",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code GtkSettings} object for the default display, creating
     * it if necessary.
     * <p>
     * See {@link Gtk#Settings}.
     */
    public static Settings getDefault() {
        try {
            var RESULT = (MemoryAddress) gtk_settings_get_default.invokeExact();
            return new Settings(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_settings_get_for_display = Interop.downcallHandle(
        "gtk_settings_get_for_display",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code GtkSettings} object for {@code display}, creating it if necessary.
     */
    public static Settings getForDisplay(org.gtk.gdk.Display display) {
        try {
            var RESULT = (MemoryAddress) gtk_settings_get_for_display.invokeExact(display.handle());
            return new Settings(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
