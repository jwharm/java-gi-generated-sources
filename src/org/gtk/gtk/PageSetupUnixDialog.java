package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkPageSetupUnixDialog` implements a page setup dialog for platforms
 * which don’t provide a native page setup dialog, like Unix.
 * 
 * ![An example GtkPageSetupUnixDialog](pagesetupdialog.png)
 * 
 * It can be used very much like any other GTK dialog, at the
 * cost of the portability offered by the high-level printing
 * API in [class@Gtk.PrintOperation].
 */
public class PageSetupUnixDialog extends Dialog implements Accessible, Buildable, ConstraintTarget, Native, Root, ShortcutManager {

    public PageSetupUnixDialog(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to PageSetupUnixDialog */
    public static PageSetupUnixDialog castFrom(org.gtk.gobject.Object gobject) {
        return new PageSetupUnixDialog(gobject.getProxy());
    }
    
    /**
     * Creates a new page setup dialog.
     */
    public PageSetupUnixDialog(java.lang.String title, Window parent) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_page_setup_unix_dialog_new(Interop.getAllocator().allocateUtf8String(title), parent.HANDLE()), false));
    }
    
    /**
     * Gets the currently selected page setup from the dialog.
     */
    public PageSetup getPageSetup() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_page_setup_unix_dialog_get_page_setup(HANDLE());
        return new PageSetup(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Gets the current print settings from the dialog.
     */
    public PrintSettings getPrintSettings() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_page_setup_unix_dialog_get_print_settings(HANDLE());
        return new PrintSettings(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Sets the `GtkPageSetup` from which the page setup
     * dialog takes its values.
     */
    public void setPageSetup(PageSetup pageSetup) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_page_setup_unix_dialog_set_page_setup(HANDLE(), pageSetup.HANDLE());
    }
    
    /**
     * Sets the `GtkPrintSettings` from which the page setup dialog
     * takes its values.
     */
    public void setPrintSettings(PrintSettings printSettings) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_page_setup_unix_dialog_set_print_settings(HANDLE(), printSettings.HANDLE());
    }
    
}
