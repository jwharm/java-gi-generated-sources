package org.gtk.gtk;

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

    public PrintUnixDialog(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to PrintUnixDialog */
    public static PrintUnixDialog castFrom(org.gtk.gobject.Object gobject) {
        return new PrintUnixDialog(gobject.refcounted());
    }
    
    static final MethodHandle gtk_print_unix_dialog_new = Interop.downcallHandle(
        "gtk_print_unix_dialog_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(java.lang.String title, Window parent) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_print_unix_dialog_new.invokeExact(Interop.allocateNativeString(title).handle(), parent.handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkPrintUnixDialog}.
     */
    public PrintUnixDialog(java.lang.String title, Window parent) {
        super(constructNew(title, parent));
    }
    
    static final MethodHandle gtk_print_unix_dialog_add_custom_tab = Interop.downcallHandle(
        "gtk_print_unix_dialog_add_custom_tab",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a custom tab to the print dialog.
     */
    public void addCustomTab(Widget child, Widget tabLabel) {
        try {
            gtk_print_unix_dialog_add_custom_tab.invokeExact(handle(), child.handle(), tabLabel.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_unix_dialog_get_current_page = Interop.downcallHandle(
        "gtk_print_unix_dialog_get_current_page",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current page of the {@code GtkPrintUnixDialog}.
     */
    public int getCurrentPage() {
        try {
            var RESULT = (int) gtk_print_unix_dialog_get_current_page.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_unix_dialog_get_embed_page_setup = Interop.downcallHandle(
        "gtk_print_unix_dialog_get_embed_page_setup",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether to embed the page setup.
     */
    public boolean getEmbedPageSetup() {
        try {
            var RESULT = (int) gtk_print_unix_dialog_get_embed_page_setup.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_unix_dialog_get_has_selection = Interop.downcallHandle(
        "gtk_print_unix_dialog_get_has_selection",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether there is a selection.
     */
    public boolean getHasSelection() {
        try {
            var RESULT = (int) gtk_print_unix_dialog_get_has_selection.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_unix_dialog_get_manual_capabilities = Interop.downcallHandle(
        "gtk_print_unix_dialog_get_manual_capabilities",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the capabilities that have been set on this {@code GtkPrintUnixDialog}.
     */
    public PrintCapabilities getManualCapabilities() {
        try {
            var RESULT = (int) gtk_print_unix_dialog_get_manual_capabilities.invokeExact(handle());
            return new PrintCapabilities(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_unix_dialog_get_page_setup = Interop.downcallHandle(
        "gtk_print_unix_dialog_get_page_setup",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the page setup that is used by the {@code GtkPrintUnixDialog}.
     */
    public PageSetup getPageSetup() {
        try {
            var RESULT = (MemoryAddress) gtk_print_unix_dialog_get_page_setup.invokeExact(handle());
            return new PageSetup(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_unix_dialog_get_page_setup_set = Interop.downcallHandle(
        "gtk_print_unix_dialog_get_page_setup_set",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether a page setup was set by the user.
     */
    public boolean getPageSetupSet() {
        try {
            var RESULT = (int) gtk_print_unix_dialog_get_page_setup_set.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_unix_dialog_get_selected_printer = Interop.downcallHandle(
        "gtk_print_unix_dialog_get_selected_printer",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the currently selected printer.
     */
    public Printer getSelectedPrinter() {
        try {
            var RESULT = (MemoryAddress) gtk_print_unix_dialog_get_selected_printer.invokeExact(handle());
            return new Printer(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_unix_dialog_get_settings = Interop.downcallHandle(
        "gtk_print_unix_dialog_get_settings",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets a new {@code GtkPrintSettings} object that represents the
     * current values in the print dialog.
     * <p>
     * Note that this creates a new object, and you need to unref
     * it if don’t want to keep it.
     */
    public PrintSettings getPrintSettings() {
        try {
            var RESULT = (MemoryAddress) gtk_print_unix_dialog_get_settings.invokeExact(handle());
            return new PrintSettings(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_unix_dialog_get_support_selection = Interop.downcallHandle(
        "gtk_print_unix_dialog_get_support_selection",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the print dialog allows user to print a selection.
     */
    public boolean getSupportSelection() {
        try {
            var RESULT = (int) gtk_print_unix_dialog_get_support_selection.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_unix_dialog_set_current_page = Interop.downcallHandle(
        "gtk_print_unix_dialog_set_current_page",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the current page number.
     * <p>
     * If {@code current_page} is not -1, this enables the current page choice
     * for the range of pages to print.
     */
    public void setCurrentPage(int currentPage) {
        try {
            gtk_print_unix_dialog_set_current_page.invokeExact(handle(), currentPage);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_unix_dialog_set_embed_page_setup = Interop.downcallHandle(
        "gtk_print_unix_dialog_set_embed_page_setup",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Embed page size combo box and orientation combo box into page setup page.
     */
    public void setEmbedPageSetup(boolean embed) {
        try {
            gtk_print_unix_dialog_set_embed_page_setup.invokeExact(handle(), embed ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_unix_dialog_set_has_selection = Interop.downcallHandle(
        "gtk_print_unix_dialog_set_has_selection",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether a selection exists.
     */
    public void setHasSelection(boolean hasSelection) {
        try {
            gtk_print_unix_dialog_set_has_selection.invokeExact(handle(), hasSelection ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_unix_dialog_set_manual_capabilities = Interop.downcallHandle(
        "gtk_print_unix_dialog_set_manual_capabilities",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * This lets you specify the printing capabilities your application
     * supports.
     * <p>
     * For instance, if you can handle scaling the output then you pass
     * {@link PrintCapabilities#SCALE}. If you don’t pass that, then the dialog
     * will only let you select the scale if the printing system automatically
     * handles scaling.
     */
    public void setManualCapabilities(PrintCapabilities capabilities) {
        try {
            gtk_print_unix_dialog_set_manual_capabilities.invokeExact(handle(), capabilities.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_unix_dialog_set_page_setup = Interop.downcallHandle(
        "gtk_print_unix_dialog_set_page_setup",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the page setup of the {@code GtkPrintUnixDialog}.
     */
    public void setPageSetup(PageSetup pageSetup) {
        try {
            gtk_print_unix_dialog_set_page_setup.invokeExact(handle(), pageSetup.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_unix_dialog_set_settings = Interop.downcallHandle(
        "gtk_print_unix_dialog_set_settings",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the {@code GtkPrintSettings} for the {@code GtkPrintUnixDialog}.
     * <p>
     * Typically, this is used to restore saved print settings
     * from a previous print operation before the print dialog
     * is shown.
     */
    public void setSettings(PrintSettings settings) {
        try {
            gtk_print_unix_dialog_set_settings.invokeExact(handle(), settings.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_unix_dialog_set_support_selection = Interop.downcallHandle(
        "gtk_print_unix_dialog_set_support_selection",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the print dialog allows user to print a selection.
     */
    public void setSupportSelection(boolean supportSelection) {
        try {
            gtk_print_unix_dialog_set_support_selection.invokeExact(handle(), supportSelection ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
