package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkAppChooserDialog` shows a `GtkAppChooserWidget` inside a `GtkDialog`.
 * 
 * ![An example GtkAppChooserDialog](appchooserdialog.png)
 * 
 * Note that `GtkAppChooserDialog` does not have any interesting methods
 * of its own. Instead, you should get the embedded `GtkAppChooserWidget`
 * using [method@Gtk.AppChooserDialog.get_widget] and call its methods if
 * the generic [iface@Gtk.AppChooser] interface is not sufficient for
 * your needs.
 * 
 * To set the heading that is shown above the `GtkAppChooserWidget`,
 * use [method@Gtk.AppChooserDialog.set_heading].
 */
public class AppChooserDialog extends Dialog implements Accessible, AppChooser, Buildable, ConstraintTarget, Native, Root, ShortcutManager {

    public AppChooserDialog(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to AppChooserDialog */
    public static AppChooserDialog castFrom(org.gtk.gobject.Object gobject) {
        return new AppChooserDialog(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkAppChooserDialog` for the provided `GFile`.
     * 
     * The dialog will show applications that can open the file.
     */
    public AppChooserDialog(Window parent, int flags, org.gtk.gio.File file) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_app_chooser_dialog_new(parent.HANDLE(), flags, file.HANDLE()), false));
    }
    
    /**
     * Creates a new `GtkAppChooserDialog` for the provided content type.
     * 
     * The dialog will show applications that can open the content type.
     */
    public AppChooserDialog(Window parent, int flags, java.lang.String contentType) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_app_chooser_dialog_new_for_content_type(parent.HANDLE(), flags, Interop.getAllocator().allocateUtf8String(contentType)), false));
    }
    
    /**
     * Returns the text to display at the top of the dialog.
     */
    public java.lang.String getHeading() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_app_chooser_dialog_get_heading(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the `GtkAppChooserWidget` of this dialog.
     */
    public Widget getWidget() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_app_chooser_dialog_get_widget(HANDLE());
        return new Widget(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Sets the text to display at the top of the dialog.
     * 
     * If the heading is not set, the dialog displays a default text.
     */
    public void setHeading(java.lang.String heading) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_app_chooser_dialog_set_heading(HANDLE(), Interop.getAllocator().allocateUtf8String(heading));
    }
    
}
