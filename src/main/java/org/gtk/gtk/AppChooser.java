package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkAppChooser} is an interface for widgets which allow the user to
 * choose an application.
 * <p>
 * The main objects that implement this interface are
 * {@link AppChooserWidget},
 * {@code Gtk.AppChooserButton}.
 * <p>
 * Applications are represented by GIO {@code GAppInfo} objects here.
 * GIO has a concept of recommended and fallback applications for a
 * given content type. Recommended applications are those that claim
 * to handle the content type itself, while fallback also includes
 * applications that handle a more generic content type. GIO also
 * knows the default and last-used application for a given content
 * type. The {@code GtkAppChooserWidget} provides detailed control over
 * whether the shown list of applications should include default,
 * recommended or fallback applications.
 * <p>
 * To obtain the application that has been selected in a {@code GtkAppChooser},
 * use {@link AppChooser#getAppInfo}.
 */
public interface AppChooser extends io.github.jwharm.javagi.Proxy {

    /**
     * Returns the currently selected application.
     */
    public default org.gtk.gio.AppInfo getAppInfo() {
        var RESULT = gtk_h.gtk_app_chooser_get_app_info(handle());
        return new org.gtk.gio.AppInfo.AppInfoImpl(Refcounted.get(RESULT, true));
    }
    
    /**
     * Returns the content type for which the {@code GtkAppChooser}
     * shows applications.
     */
    public default java.lang.String getContentType() {
        var RESULT = gtk_h.gtk_app_chooser_get_content_type(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Reloads the list of applications.
     */
    public default void refresh() {
        gtk_h.gtk_app_chooser_refresh(handle());
    }
    
    class AppChooserImpl extends org.gtk.gobject.Object implements AppChooser {
        public AppChooserImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
