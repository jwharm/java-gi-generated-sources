package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkPrintUnixDialog` implements a print dialog for platforms
 * which don’t provide a native print dialog, like Unix.
 * 
 * ![An example GtkPrintUnixDialog](printdialog.png)
 * 
 * It can be used very much like any other GTK dialog, at the cost of
 * the portability offered by the high-level printing API with
 * [class@Gtk.PrintOperation].
 * 
 * In order to print something with `GtkPrintUnixDialog`, you need to
 * use [method@Gtk.PrintUnixDialog.get_selected_printer] to obtain a
 * [class@Gtk.Printer] object and use it to construct a [class@Gtk.PrintJob]
 * using [ctor@Gtk.PrintJob.new].
 * 
 * `GtkPrintUnixDialog` uses the following response values:
 * 
 * - %GTK_RESPONSE_OK: for the “Print” button
 * - %GTK_RESPONSE_APPLY: for the “Preview” button
 * - %GTK_RESPONSE_CANCEL: for the “Cancel” button
 * 
 * # GtkPrintUnixDialog as GtkBuildable
 * 
 * The `GtkPrintUnixDialog` implementation of the `GtkBuildable` interface
 * exposes its @notebook internal children with the name “notebook”.
 * 
 * An example of a `GtkPrintUnixDialog` UI definition fragment:
 * 
 * ```xml
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
 * ```
 * 
 * # CSS nodes
 * 
 * `GtkPrintUnixDialog` has a single CSS node with name window. The style classes
 * dialog and print are added.
 */
public class PrintUnixDialog extends Dialog implements Accessible, Buildable, ConstraintTarget, Native, Root, ShortcutManager {

    public PrintUnixDialog(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to PrintUnixDialog */
    public static PrintUnixDialog castFrom(org.gtk.gobject.Object gobject) {
        return new PrintUnixDialog(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkPrintUnixDialog`.
     */
    public PrintUnixDialog(java.lang.String title, Window parent) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_unix_dialog_new(Interop.getAllocator().allocateUtf8String(title), parent.HANDLE()), false));
    }
    
    /**
     * Adds a custom tab to the print dialog.
     */
    public void addCustomTab(Widget child, Widget tabLabel) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_unix_dialog_add_custom_tab(HANDLE(), child.HANDLE(), tabLabel.HANDLE());
    }
    
    /**
     * Gets the current page of the `GtkPrintUnixDialog`.
     */
    public int getCurrentPage() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_unix_dialog_get_current_page(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets whether to embed the page setup.
     */
    public boolean getEmbedPageSetup() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_unix_dialog_get_embed_page_setup(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets whether there is a selection.
     */
    public boolean getHasSelection() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_unix_dialog_get_has_selection(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the capabilities that have been set on this `GtkPrintUnixDialog`.
     */
    public int getManualCapabilities() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_unix_dialog_get_manual_capabilities(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the page setup that is used by the `GtkPrintUnixDialog`.
     */
    public PageSetup getPageSetup() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_unix_dialog_get_page_setup(HANDLE());
        return new PageSetup(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Gets whether a page setup was set by the user.
     */
    public boolean getPageSetupSet() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_unix_dialog_get_page_setup_set(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the currently selected printer.
     */
    public Printer getSelectedPrinter() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_unix_dialog_get_selected_printer(HANDLE());
        return new Printer(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Gets a new `GtkPrintSettings` object that represents the
     * current values in the print dialog.
     * 
     * Note that this creates a new object, and you need to unref
     * it if don’t want to keep it.
     */
    public PrintSettings getPrintSettings() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_unix_dialog_get_settings(HANDLE());
        return new PrintSettings(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Gets whether the print dialog allows user to print a selection.
     */
    public boolean getSupportSelection() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_unix_dialog_get_support_selection(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Sets the current page number.
     * 
     * If @current_page is not -1, this enables the current page choice
     * for the range of pages to print.
     */
    public void setCurrentPage(int currentPage) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_unix_dialog_set_current_page(HANDLE(), currentPage);
    }
    
    /**
     * Embed page size combo box and orientation combo box into page setup page.
     */
    public void setEmbedPageSetup(boolean embed) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_unix_dialog_set_embed_page_setup(HANDLE(), embed ? 1 : 0);
    }
    
    /**
     * Sets whether a selection exists.
     */
    public void setHasSelection(boolean hasSelection) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_unix_dialog_set_has_selection(HANDLE(), hasSelection ? 1 : 0);
    }
    
    /**
     * This lets you specify the printing capabilities your application
     * supports.
     * 
     * For instance, if you can handle scaling the output then you pass
     * %GTK_PRINT_CAPABILITY_SCALE. If you don’t pass that, then the dialog
     * will only let you select the scale if the printing system automatically
     * handles scaling.
     */
    public void setManualCapabilities(int capabilities) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_unix_dialog_set_manual_capabilities(HANDLE(), capabilities);
    }
    
    /**
     * Sets the page setup of the `GtkPrintUnixDialog`.
     */
    public void setPageSetup(PageSetup pageSetup) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_unix_dialog_set_page_setup(HANDLE(), pageSetup.HANDLE());
    }
    
    /**
     * Sets the `GtkPrintSettings` for the `GtkPrintUnixDialog`.
     * 
     * Typically, this is used to restore saved print settings
     * from a previous print operation before the print dialog
     * is shown.
     */
    public void setSettings(PrintSettings settings) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_unix_dialog_set_settings(HANDLE(), settings.HANDLE());
    }
    
    /**
     * Sets whether the print dialog allows user to print a selection.
     */
    public void setSupportSelection(boolean supportSelection) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_unix_dialog_set_support_selection(HANDLE(), supportSelection ? 1 : 0);
    }
    
}
