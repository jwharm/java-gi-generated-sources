package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkSettings` provides a mechanism to share global settings between
 * applications.
 * 
 * On the X window system, this sharing is realized by an
 * [XSettings](http://www.freedesktop.org/wiki/Specifications/xsettings-spec)
 * manager that is usually part of the desktop environment, along with
 * utilities that let the user change these settings.
 * 
 * On Wayland, the settings are obtained either via a settings portal,
 * or by reading desktop settings from DConf.
 * 
 * In the absence of these sharing mechanisms, GTK reads default values for
 * settings from `settings.ini` files in `/etc/gtk-4.0`, `$XDG_CONFIG_DIRS/gtk-4.0`
 * and `$XDG_CONFIG_HOME/gtk-4.0`. These files must be valid key files (see
 * `GKeyFile`), and have a section called Settings. Themes can also provide
 * default values for settings by installing a `settings.ini` file
 * next to their `gtk.css` file.
 * 
 * Applications can override system-wide settings by setting the property
 * of the `GtkSettings` object with g_object_set(). This should be restricted
 * to special cases though; `GtkSettings` are not meant as an application
 * configuration facility.
 * 
 * There is one `GtkSettings` instance per display. It can be obtained with
 * [func@Gtk.Settings.get_for_display], but in many cases, it is more
 * convenient to use [method@Gtk.Widget.get_settings].
 */
public class Settings extends org.gtk.gobject.Object implements StyleProvider {

    public Settings(io.github.jwharm.javagi.interop.Reference reference) {
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
    
}
