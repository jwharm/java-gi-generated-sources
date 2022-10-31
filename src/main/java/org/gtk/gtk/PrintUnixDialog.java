package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * {@link Printer}
 * using {@link PrintJob#PrintJob}.
 * <p>
 * {@code GtkPrintUnixDialog} uses the following response values:
 * <ul>
 * <li>{@link ResponseType#OK}: for the “Print” button
 * <li>{@link ResponseType#APPLY}: for the “Preview” button
 * <li>{@link ResponseType#CANCEL}: for the “Cancel” button
 * </ul>
 * <p>
 * <strong>GtkPrintUnixDialog as GtkBuildable</strong><br/>
 * The {@code GtkPrintUnixDialog} implementation of the {@code GtkBuildable} interface
 * exposes its {@code notebook} internal children with the name “notebook”.
 * <p>
 * An example of a {@code GtkPrintUnixDialog} UI definition fragment:
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
 * <strong>CSS nodes</strong><br/>
 * {@code GtkPrintUnixDialog} has a single CSS node with name window. The style classes
 * dialog and print are added.
 */
public class PrintUnixDialog extends org.gtk.gtk.Dialog implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Native, org.gtk.gtk.Root, org.gtk.gtk.ShortcutManager {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkPrintUnixDialog";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public PrintUnixDialog(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to PrintUnixDialog if its GType is a (or inherits from) "GtkPrintUnixDialog".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "PrintUnixDialog" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkPrintUnixDialog", a ClassCastException will be thrown.
     */
    public static PrintUnixDialog castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkPrintUnixDialog"))) {
            return new PrintUnixDialog(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkPrintUnixDialog");
        }
    }
    
    private static Refcounted constructNew(@Nullable java.lang.String title, @Nullable org.gtk.gtk.Window parent) {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_print_unix_dialog_new.invokeExact(
                    (Addressable) (title == null ? MemoryAddress.NULL : Interop.allocateNativeString(title)),
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle())), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkPrintUnixDialog}.
     * @param title Title of the dialog
     * @param parent Transient parent of the dialog
     */
    public PrintUnixDialog(@Nullable java.lang.String title, @Nullable org.gtk.gtk.Window parent) {
        super(constructNew(title, parent));
    }
    
    /**
     * Adds a custom tab to the print dialog.
     * @param child the widget to put in the custom tab
     * @param tabLabel the widget to use as tab label
     */
    public void addCustomTab(@NotNull org.gtk.gtk.Widget child, @NotNull org.gtk.gtk.Widget tabLabel) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        java.util.Objects.requireNonNull(tabLabel, "Parameter 'tabLabel' must not be null");
        try {
            DowncallHandles.gtk_print_unix_dialog_add_custom_tab.invokeExact(
                    handle(),
                    child.handle(),
                    tabLabel.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the current page of the {@code GtkPrintUnixDialog}.
     * @return the current page of {@code dialog}
     */
    public int getCurrentPage() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_unix_dialog_get_current_page.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets whether to embed the page setup.
     * @return whether to embed the page setup
     */
    public boolean getEmbedPageSetup() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_unix_dialog_get_embed_page_setup.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets whether there is a selection.
     * @return whether there is a selection
     */
    public boolean getHasSelection() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_unix_dialog_get_has_selection.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the capabilities that have been set on this {@code GtkPrintUnixDialog}.
     * @return the printing capabilities
     */
    public @NotNull org.gtk.gtk.PrintCapabilities getManualCapabilities() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_unix_dialog_get_manual_capabilities.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.PrintCapabilities(RESULT);
    }
    
    /**
     * Gets the page setup that is used by the {@code GtkPrintUnixDialog}.
     * @return the page setup of {@code dialog}.
     */
    public @NotNull org.gtk.gtk.PageSetup getPageSetup() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_unix_dialog_get_page_setup.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.PageSetup(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets whether a page setup was set by the user.
     * @return whether a page setup was set by user.
     */
    public boolean getPageSetupSet() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_unix_dialog_get_page_setup_set.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the currently selected printer.
     * @return the currently selected printer
     */
    public @Nullable org.gtk.gtk.Printer getSelectedPrinter() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_unix_dialog_get_selected_printer.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Printer(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets a new {@code GtkPrintSettings} object that represents the
     * current values in the print dialog.
     * <p>
     * Note that this creates a new object, and you need to unref
     * it if don’t want to keep it.
     * @return a new {@code GtkPrintSettings} object with the values from {@code dialog}
     */
    public @NotNull org.gtk.gtk.PrintSettings getPrintSettings() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_unix_dialog_get_settings.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.PrintSettings(Refcounted.get(RESULT, true));
    }
    
    /**
     * Gets whether the print dialog allows user to print a selection.
     * @return whether the application supports print of selection
     */
    public boolean getSupportSelection() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_unix_dialog_get_support_selection.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets the current page number.
     * <p>
     * If {@code current_page} is not -1, this enables the current page choice
     * for the range of pages to print.
     * @param currentPage the current page number.
     */
    public void setCurrentPage(int currentPage) {
        try {
            DowncallHandles.gtk_print_unix_dialog_set_current_page.invokeExact(
                    handle(),
                    currentPage);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Embed page size combo box and orientation combo box into page setup page.
     * @param embed embed page setup selection
     */
    public void setEmbedPageSetup(boolean embed) {
        try {
            DowncallHandles.gtk_print_unix_dialog_set_embed_page_setup.invokeExact(
                    handle(),
                    embed ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether a selection exists.
     * @param hasSelection {@code true} indicates that a selection exists
     */
    public void setHasSelection(boolean hasSelection) {
        try {
            DowncallHandles.gtk_print_unix_dialog_set_has_selection.invokeExact(
                    handle(),
                    hasSelection ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This lets you specify the printing capabilities your application
     * supports.
     * <p>
     * For instance, if you can handle scaling the output then you pass
     * {@link PrintCapabilities#SCALE}. If you don’t pass that, then the dialog
     * will only let you select the scale if the printing system automatically
     * handles scaling.
     * @param capabilities the printing capabilities of your application
     */
    public void setManualCapabilities(@NotNull org.gtk.gtk.PrintCapabilities capabilities) {
        java.util.Objects.requireNonNull(capabilities, "Parameter 'capabilities' must not be null");
        try {
            DowncallHandles.gtk_print_unix_dialog_set_manual_capabilities.invokeExact(
                    handle(),
                    capabilities.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the page setup of the {@code GtkPrintUnixDialog}.
     * @param pageSetup a {@code GtkPageSetup}
     */
    public void setPageSetup(@NotNull org.gtk.gtk.PageSetup pageSetup) {
        java.util.Objects.requireNonNull(pageSetup, "Parameter 'pageSetup' must not be null");
        try {
            DowncallHandles.gtk_print_unix_dialog_set_page_setup.invokeExact(
                    handle(),
                    pageSetup.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code GtkPrintSettings} for the {@code GtkPrintUnixDialog}.
     * <p>
     * Typically, this is used to restore saved print settings
     * from a previous print operation before the print dialog
     * is shown.
     * @param settings a {@code GtkPrintSettings}
     */
    public void setSettings(@Nullable org.gtk.gtk.PrintSettings settings) {
        try {
            DowncallHandles.gtk_print_unix_dialog_set_settings.invokeExact(
                    handle(),
                    (Addressable) (settings == null ? MemoryAddress.NULL : settings.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the print dialog allows user to print a selection.
     * @param supportSelection {@code true} to allow print selection
     */
    public void setSupportSelection(boolean supportSelection) {
        try {
            DowncallHandles.gtk_print_unix_dialog_set_support_selection.invokeExact(
                    handle(),
                    supportSelection ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_print_unix_dialog_new = Interop.downcallHandle(
            "gtk_print_unix_dialog_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_print_unix_dialog_add_custom_tab = Interop.downcallHandle(
            "gtk_print_unix_dialog_add_custom_tab",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_print_unix_dialog_get_current_page = Interop.downcallHandle(
            "gtk_print_unix_dialog_get_current_page",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_print_unix_dialog_get_embed_page_setup = Interop.downcallHandle(
            "gtk_print_unix_dialog_get_embed_page_setup",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_print_unix_dialog_get_has_selection = Interop.downcallHandle(
            "gtk_print_unix_dialog_get_has_selection",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_print_unix_dialog_get_manual_capabilities = Interop.downcallHandle(
            "gtk_print_unix_dialog_get_manual_capabilities",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_print_unix_dialog_get_page_setup = Interop.downcallHandle(
            "gtk_print_unix_dialog_get_page_setup",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_print_unix_dialog_get_page_setup_set = Interop.downcallHandle(
            "gtk_print_unix_dialog_get_page_setup_set",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_print_unix_dialog_get_selected_printer = Interop.downcallHandle(
            "gtk_print_unix_dialog_get_selected_printer",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_print_unix_dialog_get_settings = Interop.downcallHandle(
            "gtk_print_unix_dialog_get_settings",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_print_unix_dialog_get_support_selection = Interop.downcallHandle(
            "gtk_print_unix_dialog_get_support_selection",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_print_unix_dialog_set_current_page = Interop.downcallHandle(
            "gtk_print_unix_dialog_set_current_page",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_print_unix_dialog_set_embed_page_setup = Interop.downcallHandle(
            "gtk_print_unix_dialog_set_embed_page_setup",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_print_unix_dialog_set_has_selection = Interop.downcallHandle(
            "gtk_print_unix_dialog_set_has_selection",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_print_unix_dialog_set_manual_capabilities = Interop.downcallHandle(
            "gtk_print_unix_dialog_set_manual_capabilities",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_print_unix_dialog_set_page_setup = Interop.downcallHandle(
            "gtk_print_unix_dialog_set_page_setup",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_print_unix_dialog_set_settings = Interop.downcallHandle(
            "gtk_print_unix_dialog_set_settings",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_print_unix_dialog_set_support_selection = Interop.downcallHandle(
            "gtk_print_unix_dialog_set_support_selection",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}
