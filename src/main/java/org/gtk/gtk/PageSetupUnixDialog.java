package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkPageSetupUnixDialog} implements a page setup dialog for platforms
 * which don’t provide a native page setup dialog, like Unix.
 * <p>
 * <img src="./doc-files/pagesetupdialog.png" alt="An example GtkPageSetupUnixDialog">
 * <p>
 * It can be used very much like any other GTK dialog, at the
 * cost of the portability offered by the high-level printing
 * API in {@link PrintOperation}.
 */
public class PageSetupUnixDialog extends Dialog implements Accessible, Buildable, ConstraintTarget, Native, Root, ShortcutManager {

    public PageSetupUnixDialog(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to PageSetupUnixDialog */
    public static PageSetupUnixDialog castFrom(org.gtk.gobject.Object gobject) {
        return new PageSetupUnixDialog(gobject.getReference());
    }
    
    private static Reference constructNew(java.lang.String title, Window parent) {
        Reference RESULT = References.get(gtk_h.gtk_page_setup_unix_dialog_new(Interop.allocateNativeString(title).handle(), parent.handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new page setup dialog.
     */
    public PageSetupUnixDialog(java.lang.String title, Window parent) {
        super(constructNew(title, parent));
    }
    
    /**
     * Gets the currently selected page setup from the dialog.
     */
    public PageSetup getPageSetup() {
        var RESULT = gtk_h.gtk_page_setup_unix_dialog_get_page_setup(handle());
        return new PageSetup(References.get(RESULT, false));
    }
    
    /**
     * Gets the current print settings from the dialog.
     */
    public PrintSettings getPrintSettings() {
        var RESULT = gtk_h.gtk_page_setup_unix_dialog_get_print_settings(handle());
        return new PrintSettings(References.get(RESULT, false));
    }
    
    /**
     * Sets the {@code GtkPageSetup} from which the page setup
     * dialog takes its values.
     */
    public void setPageSetup(PageSetup pageSetup) {
        gtk_h.gtk_page_setup_unix_dialog_set_page_setup(handle(), pageSetup.handle());
    }
    
    /**
     * Sets the {@code GtkPrintSettings} from which the page setup dialog
     * takes its values.
     */
    public void setPrintSettings(PrintSettings printSettings) {
        gtk_h.gtk_page_setup_unix_dialog_set_print_settings(handle(), printSettings.handle());
    }
    
}
