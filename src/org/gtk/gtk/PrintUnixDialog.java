package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkPrintUnixDialog} implements a print dialog for platforms
 * which don’t provide a native print dialog, like Unix.
 * <p>
 * <img src="./doc-files/printdialog.png" alt="An example GtkPrintUnixDialog">
 * <p>
 * It can be used very much like any other GTK dialog, at the cost of
 * the portability offered by the high-level printing API with
 * {@link PrintOperation}.
 * <p>
 * In order to print something with {@code GtkPrintUnixDialog}, you need to
 * use {@link PrintUnixDialog#getSelectedPrinter} to obtain a
 * {@code Gtk.PrintJob}
 * using {@link PrintJob#PrintJob}.
 * <p>
 * {@code GtkPrintUnixDialog} uses the following response values:
 * <p>
 * <ul>
 * <li>{@link ResponseType#OK}: for the “Print” button
 * <li>{@link ResponseType#APPLY}: for the “Preview” button
 * <li>{@link ResponseType#CANCEL}: for the “Cancel” button
 * </ul>
 * <p>
 * <h1>GtkPrintUnixDialog as GtkBuildable</h1>
 * <p>
 * The {@code GtkPrintUnixDialog} implementation of the {@code GtkBuildable} interface
 * exposes its {@code notebook} internal children with the name “notebook”.
 * <p>
 * An example of a {@code GtkPrintUnixDialog} UI definition fragment:
 * <p>
 * <pre>{@code xml
 * <object class="GtkPrintUnixDialog" id="dialog1">
 *   <child internal-child="notebook">
 *     <object class="GtkNotebook" id="notebook">
 *       <child>
 *         <object type="GtkNotebookPage">
 *           <property name="tab_expand">False</property>
 *           <property name="tab_fill">False</property>
 *           <property name="tab">
 *             <object class="GtkLabel" id="tablabel">
 *               <property name="label">Tab label</property>
 *             </object>
 *           </property>
 *           <property name="child">
 *             <object class="GtkLabel" id="tabcontent">
 *               <property name="label">Content on notebook tab</property>
 *             </object>
 *           </property>
 *         </object>
 *       </child>
 *     </object>
 *   </child>
 * </object>
 * }</pre>
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
 * {@code GtkPrintUnixDialog} has a single CSS node with name window. The style classes
 * dialog and print are added.
 */
public class PrintUnixDialog extends Dialog implements Accessible, Buildable, ConstraintTarget, Native, Root, ShortcutManager {

    public PrintUnixDialog(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to PrintUnixDialog */
    public static PrintUnixDialog castFrom(org.gtk.gobject.Object gobject) {
        return new PrintUnixDialog(gobject.getReference());
    }
    
    private static Reference constructNew(java.lang.String title, Window parent) {
        Reference RESULT = References.get(gtk_h.gtk_print_unix_dialog_new(Interop.allocateNativeString(title).handle(), parent.handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkPrintUnixDialog}.
     */
    public PrintUnixDialog(java.lang.String title, Window parent) {
        super(constructNew(title, parent));
    }
    
    /**
     * Adds a custom tab to the print dialog.
     */
    public void addCustomTab(Widget child, Widget tabLabel) {
        gtk_h.gtk_print_unix_dialog_add_custom_tab(handle(), child.handle(), tabLabel.handle());
    }
    
    /**
     * Gets the current page of the {@code GtkPrintUnixDialog}.
     */
    public int getCurrentPage() {
        var RESULT = gtk_h.gtk_print_unix_dialog_get_current_page(handle());
        return RESULT;
    }
    
    /**
     * Gets whether to embed the page setup.
     */
    public boolean getEmbedPageSetup() {
        var RESULT = gtk_h.gtk_print_unix_dialog_get_embed_page_setup(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets whether there is a selection.
     */
    public boolean getHasSelection() {
        var RESULT = gtk_h.gtk_print_unix_dialog_get_has_selection(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the capabilities that have been set on this {@code GtkPrintUnixDialog}.
     */
    public int getManualCapabilities() {
        var RESULT = gtk_h.gtk_print_unix_dialog_get_manual_capabilities(handle());
        return RESULT;
    }
    
    /**
     * Gets the page setup that is used by the {@code GtkPrintUnixDialog}.
     */
    public PageSetup getPageSetup() {
        var RESULT = gtk_h.gtk_print_unix_dialog_get_page_setup(handle());
        return new PageSetup(References.get(RESULT, false));
    }
    
    /**
     * Gets whether a page setup was set by the user.
     */
    public boolean getPageSetupSet() {
        var RESULT = gtk_h.gtk_print_unix_dialog_get_page_setup_set(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the currently selected printer.
     */
    public Printer getSelectedPrinter() {
        var RESULT = gtk_h.gtk_print_unix_dialog_get_selected_printer(handle());
        return new Printer(References.get(RESULT, false));
    }
    
    /**
     * Gets a new {@code GtkPrintSettings} object that represents the
     * current values in the print dialog.
     * <p>
     * Note that this creates a new object, and you need to unref
     * it if don’t want to keep it.
     */
    public PrintSettings getPrintSettings() {
        var RESULT = gtk_h.gtk_print_unix_dialog_get_settings(handle());
        return new PrintSettings(References.get(RESULT, true));
    }
    
    /**
     * Gets whether the print dialog allows user to print a selection.
     */
    public boolean getSupportSelection() {
        var RESULT = gtk_h.gtk_print_unix_dialog_get_support_selection(handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets the current page number.
     * <p>
     * If {@code current_page} is not -1, this enables the current page choice
     * for the range of pages to print.
     */
    public void setCurrentPage(int currentPage) {
        gtk_h.gtk_print_unix_dialog_set_current_page(handle(), currentPage);
    }
    
    /**
     * Embed page size combo box and orientation combo box into page setup page.
     */
    public void setEmbedPageSetup(boolean embed) {
        gtk_h.gtk_print_unix_dialog_set_embed_page_setup(handle(), embed ? 1 : 0);
    }
    
    /**
     * Sets whether a selection exists.
     */
    public void setHasSelection(boolean hasSelection) {
        gtk_h.gtk_print_unix_dialog_set_has_selection(handle(), hasSelection ? 1 : 0);
    }
    
    /**
     * This lets you specify the printing capabilities your application
     * supports.
     * <p>
     * For instance, if you can handle scaling the output then you pass
     * {@link PrintCapabilities#SCALE}. If you don’t pass that, then the dialog
     * will only let you select the scale if the printing system automatically
     * handles scaling.
     */
    public void setManualCapabilities(int capabilities) {
        gtk_h.gtk_print_unix_dialog_set_manual_capabilities(handle(), capabilities);
    }
    
    /**
     * Sets the page setup of the {@code GtkPrintUnixDialog}.
     */
    public void setPageSetup(PageSetup pageSetup) {
        gtk_h.gtk_print_unix_dialog_set_page_setup(handle(), pageSetup.handle());
    }
    
    /**
     * Sets the {@code GtkPrintSettings} for the {@code GtkPrintUnixDialog}.
     * <p>
     * Typically, this is used to restore saved print settings
     * from a previous print operation before the print dialog
     * is shown.
     */
    public void setSettings(PrintSettings settings) {
        gtk_h.gtk_print_unix_dialog_set_settings(handle(), settings.handle());
    }
    
    /**
     * Sets whether the print dialog allows user to print a selection.
     */
    public void setSupportSelection(boolean supportSelection) {
        gtk_h.gtk_print_unix_dialog_set_support_selection(handle(), supportSelection ? 1 : 0);
    }
    
}
