package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkAppChooserDialog</code> shows a <code>GtkAppChooserWidget</code> inside a <code>GtkDialog</code>.
 * <p>
 * !{@link [An example GtkAppChooserDialog]}(appchooserdialog.png)
 * <p>
 * Note that <code>GtkAppChooserDialog</code> does not have any interesting methods
 * of its own. Instead, you should get the embedded <code>GtkAppChooserWidget</code>
 * using {@link org.gtk.gtk.AppChooserDialog<code>#getWidget</code>  and call its methods if
 * the generic {@link [iface@Gtk.AppChooser] (ref=iface)} interface is not sufficient for
 * your needs.
 * <p>
 * To set the heading that is shown above the <code>GtkAppChooserWidget</code>,
 * use {@link org.gtk.gtk.AppChooserDialog<code>#setHeading</code> .
 */
public class AppChooserDialog extends Dialog implements Accessible, AppChooser, Buildable, ConstraintTarget, Native, Root, ShortcutManager {

    public AppChooserDialog(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to AppChooserDialog */
    public static AppChooserDialog castFrom(org.gtk.gobject.Object gobject) {
        return new AppChooserDialog(gobject.getReference());
    }
    
    private static Reference constructNew(Window parent, int flags, org.gtk.gio.File file) {
        Reference RESULT = References.get(gtk_h.gtk_app_chooser_dialog_new(parent.handle(), flags, file.handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkAppChooserDialog</code> for the provided <code>GFile</code>.
     * 
     * The dialog will show applications that can open the file.
     */
    public AppChooserDialog(Window parent, int flags, org.gtk.gio.File file) {
        super(constructNew(parent, flags, file));
    }
    
    private static Reference constructNewForContentType(Window parent, int flags, java.lang.String contentType) {
        Reference RESULT = References.get(gtk_h.gtk_app_chooser_dialog_new_for_content_type(parent.handle(), flags, Interop.allocateNativeString(contentType).handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkAppChooserDialog</code> for the provided content type.
     * 
     * The dialog will show applications that can open the content type.
     */
    public static AppChooserDialog newForContentType(Window parent, int flags, java.lang.String contentType) {
        return new AppChooserDialog(constructNewForContentType(parent, flags, contentType));
    }
    
    /**
     * Returns the text to display at the top of the dialog.
     */
    public java.lang.String getHeading() {
        var RESULT = gtk_h.gtk_app_chooser_dialog_get_heading(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the <code>GtkAppChooserWidget</code> of this dialog.
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
