package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
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

    public AppChooserDialog(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to AppChooserDialog */
    public static AppChooserDialog castFrom(org.gtk.gobject.Object gobject) {
        return new AppChooserDialog(gobject.getReference());
    }
    
    /**
     * Creates a new `GtkAppChooserDialog` for the provided `GFile`.
     * 
     * The dialog will show applications that can open the file.
     */
    public AppChooserDialog(Window parent, int flags, org.gtk.gio.File file) {
        super(References.get(gtk_h.gtk_app_chooser_dialog_new(parent.handle(), flags, file.handle()), false));
    }
    
    /**
     * Creates a new `GtkAppChooserDialog` for the provided content type.
     * 
     * The dialog will show applications that can open the content type.
     */
    public AppChooserDialog(Window parent, int flags, java.lang.String contentType) {
        super(References.get(gtk_h.gtk_app_chooser_dialog_new_for_content_type(parent.handle(), flags, Interop.allocateNativeString(contentType).handle()), false));
    }
    
    /**
     * Returns the text to display at the top of the dialog.
     */
    public java.lang.String getHeading() {
        var RESULT = gtk_h.gtk_app_chooser_dialog_get_heading(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the `GtkAppChooserWidget` of this dialog.
     */
    public Widget getWidget() {
        var RESULT = gtk_h.gtk_app_chooser_dialog_get_widget(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Sets the text to display at the top of the dialog.
     * 
     * If the heading is not set, the dialog displays a default text.
     */
    public void setHeading(java.lang.String heading) {
        gtk_h.gtk_app_chooser_dialog_set_heading(handle(), Interop.allocateNativeString(heading).handle());
    }
    
}
