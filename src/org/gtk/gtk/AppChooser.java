package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkAppChooser` is an interface for widgets which allow the user to
 * choose an application.
 * 
 * The main objects that implement this interface are
 * [class@Gtk.AppChooserWidget],
 * [class@Gtk.AppChooserDialog] and [class@Gtk.AppChooserButton].
 * 
 * Applications are represented by GIO `GAppInfo` objects here.
 * GIO has a concept of recommended and fallback applications for a
 * given content type. Recommended applications are those that claim
 * to handle the content type itself, while fallback also includes
 * applications that handle a more generic content type. GIO also
 * knows the default and last-used application for a given content
 * type. The `GtkAppChooserWidget` provides detailed control over
 * whether the shown list of applications should include default,
 * recommended or fallback applications.
 * 
 * To obtain the application that has been selected in a `GtkAppChooser`,
 * use [method@Gtk.AppChooser.get_app_info].
 */
public interface AppChooser extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Returns the currently selected application.
     */
    public default org.gtk.gio.AppInfo getAppInfo() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_app_chooser_get_app_info(HANDLE());
        return new org.gtk.gio.AppInfo.AppInfoImpl(References.get(RESULT, true));
    }
    
    /**
     * Returns the content type for which the `GtkAppChooser`
     * shows applications.
     */
    public default java.lang.String getContentType() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_app_chooser_get_content_type(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Reloads the list of applications.
     */
    public default void refresh() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_app_chooser_refresh(HANDLE());
    }
    
    class AppChooserImpl extends org.gtk.gobject.Object implements AppChooser {
        public AppChooserImpl(io.github.jwharm.javagi.interop.Reference reference) {
            super(reference);
        }
    }
}
