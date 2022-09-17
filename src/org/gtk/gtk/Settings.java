package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkSettings</code> provides a mechanism to share global settings between
 * applications.
 * <p>
 * On the X window system, this sharing is realized by an
 * {@link [XSettings]}(http://www.freedesktop.org/wiki/Specifications/xsettings-spec)
 * manager that is usually part of the desktop environment, along with
 * utilities that let the user change these settings.
 * <p>
 * On Wayland, the settings are obtained either via a settings portal,
 * or by reading desktop settings from DConf.
 * <p>
 * In the absence of these sharing mechanisms, GTK reads default values for
 * settings from <code>settings.ini</code> files in <code>/etc/gtk-4.0</code>, <code>$XDG_CONFIG_DIRS/gtk-4.0</code>
 * and <code>$XDG_CONFIG_HOME/gtk-4.0</code>. These files must be valid key files (see<code>GKeyFile</code>), and have a section called Settings. Themes can also provide
 * default values for settings by installing a <code>settings.ini</code> file
 * next to their <code>gtk.css</code> file.
 * <p>
 * Applications can override system-wide settings by setting the property
 * of the <code>GtkSettings</code> object with g_object_set(). This should be restricted
 * to special cases though; <code>GtkSettings</code> are not meant as an application
 * configuration facility.
 * <p>
 * There is one <code>GtkSettings</code> instance per display. It can be obtained with
 * {@link Gtk#Settings}, but in many cases, it is more
 * convenient to use {@link org.gtk.gtk.Widget#getSettings}.
 */
public class Settings extends org.gtk.gobject.Object implements StyleProvider {

    public Settings(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Settings */
    public static Settings castFrom(org.gtk.gobject.Object gobject) {
        return new Settings(gobject.getReference());
    }
    
    /**
     * Undoes the effect of calling g_object_set() to install an
     * application-specific value for a setting.
     * 
     * After this call, the setting will again follow the session-wide
     * value for this setting.
     */
    public void resetProperty(java.lang.String name) {
        gtk_h.gtk_settings_reset_property(handle(), Interop.allocateNativeString(name).handle());
    }
    
    /**
     * Gets the <code>GtkSettings</code> object for the default display, creating
     * it if necessary.
     * 
     * See {@link Gtk#Settings}.
     */
    public static Settings getDefault() {
        var RESULT = gtk_h.gtk_settings_get_default();
        return new Settings(References.get(RESULT, false));
    }
    
    /**
     * Gets the <code>GtkSettings</code> object for @display, creating it if necessary.
     */
    public static Settings getForDisplay(org.gtk.gdk.Display display) {
        var RESULT = gtk_h.gtk_settings_get_for_display(display.handle());
        return new Settings(References.get(RESULT, false));
    }
    
}
