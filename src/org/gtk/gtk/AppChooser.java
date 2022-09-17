package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkAppChooser</code> is an interface for widgets which allow the user to
 * choose an application.
 * <p>
 * The main objects that implement this interface are
 * {@link org.gtk.gtk.AppChooserWidget},
 * {@link org.gtk.gtk.AppChooserDialog} and {@link org.gtk.gtk.AppChooserButton}.
 * <p>
 * Applications are represented by GIO <code>GAppInfo</code> objects here.
 * GIO has a concept of recommended and fallback applications for a
 * given content type. Recommended applications are those that claim
 * to handle the content type itself, while fallback also includes
 * applications that handle a more generic content type. GIO also
 * knows the default and last-used application for a given content
 * type. The <code>GtkAppChooserWidget</code> provides detailed control over
 * whether the shown list of applications should include default,
 * recommended or fallback applications.
 * <p>
 * To obtain the application that has been selected in a <code>GtkAppChooser</code>,
 * use {@link org.gtk.gtk.AppChooser#getAppInfo}.
 */
public interface AppChooser extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Returns the currently selected application.
     */
    public default org.gtk.gio.AppInfo getAppInfo() {
        var RESULT = gtk_h.gtk_app_chooser_get_app_info(handle());
        return new org.gtk.gio.AppInfo.AppInfoImpl(References.get(RESULT, true));
    }
    
    /**
     * Returns the content type for which the <code>GtkAppChooser</code>
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
        public AppChooserImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
