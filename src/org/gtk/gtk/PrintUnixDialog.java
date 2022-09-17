package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkPrintUnixDialog</code> implements a print dialog for platforms
 * which don&#8217;t provide a native print dialog, like Unix.
 * <p>
 * !{@link [An example GtkPrintUnixDialog]}(printdialog.png)
 * <p>
 * It can be used very much like any other GTK dialog, at the cost of
 * the portability offered by the high-level printing API with
 * {@link org.gtk.gtk.PrintOperation}.
 * <p>
 * In order to print something with <code>GtkPrintUnixDialog</code>, you need to
 * use {@link org.gtk.gtk.PrintUnixDialog#getSelectedPrinter} to obtain a
 * {@link org.gtk.gtk.Printer} object and use it to construct a {@link org.gtk.gtk.PrintJob}
 * using {@link [ctor@Gtk.PrintJob.new] (ref=ctor)}.
 * <p><code>GtkPrintUnixDialog</code> uses the following response values:
 * <p>
 * <li><code>GTK_RESPONSE_OK:</code> for the &#8220;Print&#8221; button
 * <li><code>GTK_RESPONSE_APPLY:</code> for the &#8220;Preview&#8221; button
 * <li><code>GTK_RESPONSE_CANCEL:</code> for the &#8220;Cancel&#8221; button
 * <p>
 * <h1>tkPrintUnixDialog as GtkBuildable</h1>
 * <p>
 * The <code>GtkPrintUnixDialog</code> implementation of the <code>GtkBuildable</code> interface
 * exposes its @notebook internal children with the name &#8220;notebook&#8221;.
 * <p>
 * An example of a <code>GtkPrintUnixDialog</code> UI definition fragment:
 * <p><pre>xml
 * &#60;object class=&#34;GtkPrintUnixDialog&#34; id=&#34;dialog1&#34;&#62;
 *   &#60;child internal-child=&#34;notebook&#34;&#62;
 *     &#60;object class=&#34;GtkNotebook&#34; id=&#34;notebook&#34;&#62;
 *       &#60;child&#62;
 *         &#60;object type=&#34;GtkNotebookPage&#34;&#62;
 *           &#60;property name=&#34;tab_expand&#34;&#62;False&#60;/property&#62;
 *           &#60;property name=&#34;tab_fill&#34;&#62;False&#60;/property&#62;
 *           &#60;property name=&#34;tab&#34;&#62;
 *             &#60;object class=&#34;GtkLabel&#34; id=&#34;tablabel&#34;&#62;
 *               &#60;property name=&#34;label&#34;&#62;Tab label&#60;/property&#62;
 *             &#60;/object&#62;
 *           &#60;/property&#62;
 *           &#60;property name=&#34;child&#34;&#62;
 *             &#60;object class=&#34;GtkLabel&#34; id=&#34;tabcontent&#34;&#62;
 *               &#60;property name=&#34;label&#34;&#62;Content on notebook tab&#60;/property&#62;
 *             &#60;/object&#62;
 *           &#60;/property&#62;
 *         &#60;/object&#62;
 *       &#60;/child&#62;
 *     &#60;/object&#62;
 *   &#60;/child&#62;
 * &#60;/object&#62;
 * </pre>
 * <p>
 * <h1>SS nodes</h1>
 * <p><code>GtkPrintUnixDialog</code> has a single CSS node with name window. The style classes
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
     * Creates a new <code>GtkPrintUnixDialog</code>.
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
     * Gets the current page of the <code>GtkPrintUnixDialog</code>.
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
     * Gets the capabilities that have been set on this <code>GtkPrintUnixDialog</code>.
     */
    public int getManualCapabilities() {
        var RESULT = gtk_h.gtk_print_unix_dialog_get_manual_capabilities(handle());
        return RESULT;
    }
    
    /**
     * Gets the page setup that is used by the <code>GtkPrintUnixDialog</code>.
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
     * Gets a new <code>GtkPrintSettings</code> object that represents the
     * current values in the print dialog.
     * 
     * Note that this creates a new object, and you need to unref
     * it if don&#8217;t want to keep it.
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
     * 
     * If @current_page is not -1, this enables the current page choice
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
     * 
     * For instance, if you can handle scaling the output then you pass
     * <code>GTK_PRINT_CAPABILITY_SCALE.</code> If you don&#8217;t pass that, then the dialog
     * will only let you select the scale if the printing system automatically
     * handles scaling.
     */
    public void setManualCapabilities(int capabilities) {
        gtk_h.gtk_print_unix_dialog_set_manual_capabilities(handle(), capabilities);
    }
    
    /**
     * Sets the page setup of the <code>GtkPrintUnixDialog</code>.
     */
    public void setPageSetup(PageSetup pageSetup) {
        gtk_h.gtk_print_unix_dialog_set_page_setup(handle(), pageSetup.handle());
    }
    
    /**
     * Sets the <code>GtkPrintSettings</code> for the <code>GtkPrintUnixDialog</code>.
     * 
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
