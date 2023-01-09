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
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a PrintUnixDialog proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PrintUnixDialog(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PrintUnixDialog> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PrintUnixDialog(input);
    
    private static MemoryAddress constructNew(@Nullable java.lang.String title, @Nullable org.gtk.gtk.Window parent) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_print_unix_dialog_new.invokeExact(
                        (Addressable) (title == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(title, SCOPE)),
                        (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Creates a new {@code GtkPrintUnixDialog}.
     * @param title Title of the dialog
     * @param parent Transient parent of the dialog
     */
    public PrintUnixDialog(@Nullable java.lang.String title, @Nullable org.gtk.gtk.Window parent) {
        super(constructNew(title, parent));
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Adds a custom tab to the print dialog.
     * @param child the widget to put in the custom tab
     * @param tabLabel the widget to use as tab label
     */
    public void addCustomTab(org.gtk.gtk.Widget child, org.gtk.gtk.Widget tabLabel) {
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
            RESULT = (int) DowncallHandles.gtk_print_unix_dialog_get_current_page.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.gtk_print_unix_dialog_get_embed_page_setup.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets whether there is a selection.
     * @return whether there is a selection
     */
    public boolean getHasSelection() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_unix_dialog_get_has_selection.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the capabilities that have been set on this {@code GtkPrintUnixDialog}.
     * @return the printing capabilities
     */
    public org.gtk.gtk.PrintCapabilities getManualCapabilities() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_unix_dialog_get_manual_capabilities.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.PrintCapabilities(RESULT);
    }
    
    /**
     * Gets the page setup that is used by the {@code GtkPrintUnixDialog}.
     * @return the page setup of {@code dialog}.
     */
    public org.gtk.gtk.PageSetup getPageSetup() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_unix_dialog_get_page_setup.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.PageSetup) Interop.register(RESULT, org.gtk.gtk.PageSetup.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets whether a page setup was set by the user.
     * @return whether a page setup was set by user.
     */
    public boolean getPageSetupSet() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_unix_dialog_get_page_setup_set.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the currently selected printer.
     * @return the currently selected printer
     */
    public @Nullable org.gtk.gtk.Printer getSelectedPrinter() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_unix_dialog_get_selected_printer.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Printer) Interop.register(RESULT, org.gtk.gtk.Printer.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets a new {@code GtkPrintSettings} object that represents the
     * current values in the print dialog.
     * <p>
     * Note that this creates a new object, and you need to unref
     * it if don’t want to keep it.
     * @return a new {@code GtkPrintSettings} object with the values from {@code dialog}
     */
    public org.gtk.gtk.PrintSettings getPrintSettings() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_unix_dialog_get_settings.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gtk.gtk.PrintSettings) Interop.register(RESULT, org.gtk.gtk.PrintSettings.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets whether the print dialog allows user to print a selection.
     * @return whether the application supports print of selection
     */
    public boolean getSupportSelection() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_unix_dialog_get_support_selection.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
                    Marshal.booleanToInteger.marshal(embed, null).intValue());
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
                    Marshal.booleanToInteger.marshal(hasSelection, null).intValue());
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
    public void setManualCapabilities(org.gtk.gtk.PrintCapabilities capabilities) {
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
    public void setPageSetup(org.gtk.gtk.PageSetup pageSetup) {
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
                    Marshal.booleanToInteger.marshal(supportSelection, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_print_unix_dialog_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link PrintUnixDialog.Builder} object constructs a {@link PrintUnixDialog} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link PrintUnixDialog.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Dialog.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link PrintUnixDialog} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PrintUnixDialog}.
         * @return A new instance of {@code PrintUnixDialog} with the properties 
         *         that were set in the Builder object.
         */
        public PrintUnixDialog build() {
            return (PrintUnixDialog) org.gtk.gobject.GObject.newWithProperties(
                PrintUnixDialog.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The current page in the document.
         * @param currentPage The value for the {@code current-page} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCurrentPage(int currentPage) {
            names.add("current-page");
            values.add(org.gtk.gobject.Value.create(currentPage));
            return this;
        }
        
        /**
         * {@code true} if the page setup controls are embedded.
         * @param embedPageSetup The value for the {@code embed-page-setup} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setEmbedPageSetup(boolean embedPageSetup) {
            names.add("embed-page-setup");
            values.add(org.gtk.gobject.Value.create(embedPageSetup));
            return this;
        }
        
        /**
         * Whether the application has a selection.
         * @param hasSelection The value for the {@code has-selection} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHasSelection(boolean hasSelection) {
            names.add("has-selection");
            values.add(org.gtk.gobject.Value.create(hasSelection));
            return this;
        }
        
        /**
         * Capabilities the application can handle.
         * @param manualCapabilities The value for the {@code manual-capabilities} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setManualCapabilities(org.gtk.gtk.PrintCapabilities manualCapabilities) {
            names.add("manual-capabilities");
            values.add(org.gtk.gobject.Value.create(manualCapabilities));
            return this;
        }
        
        /**
         * The {@code GtkPageSetup} object to use.
         * @param pageSetup The value for the {@code page-setup} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPageSetup(org.gtk.gtk.PageSetup pageSetup) {
            names.add("page-setup");
            values.add(org.gtk.gobject.Value.create(pageSetup));
            return this;
        }
        
        /**
         * The {@code GtkPrintSettings} object used for this dialog.
         * @param printSettings The value for the {@code print-settings} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPrintSettings(org.gtk.gtk.PrintSettings printSettings) {
            names.add("print-settings");
            values.add(org.gtk.gobject.Value.create(printSettings));
            return this;
        }
        
        /**
         * The {@code GtkPrinter} which is selected.
         * @param selectedPrinter The value for the {@code selected-printer} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSelectedPrinter(org.gtk.gtk.Printer selectedPrinter) {
            names.add("selected-printer");
            values.add(org.gtk.gobject.Value.create(selectedPrinter));
            return this;
        }
        
        /**
         * Whether the dialog supports selection.
         * @param supportSelection The value for the {@code support-selection} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSupportSelection(boolean supportSelection) {
            names.add("support-selection");
            values.add(org.gtk.gobject.Value.create(supportSelection));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_print_unix_dialog_new = Interop.downcallHandle(
                "gtk_print_unix_dialog_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_print_unix_dialog_add_custom_tab = Interop.downcallHandle(
                "gtk_print_unix_dialog_add_custom_tab",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_print_unix_dialog_get_current_page = Interop.downcallHandle(
                "gtk_print_unix_dialog_get_current_page",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_print_unix_dialog_get_embed_page_setup = Interop.downcallHandle(
                "gtk_print_unix_dialog_get_embed_page_setup",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_print_unix_dialog_get_has_selection = Interop.downcallHandle(
                "gtk_print_unix_dialog_get_has_selection",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_print_unix_dialog_get_manual_capabilities = Interop.downcallHandle(
                "gtk_print_unix_dialog_get_manual_capabilities",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_print_unix_dialog_get_page_setup = Interop.downcallHandle(
                "gtk_print_unix_dialog_get_page_setup",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_print_unix_dialog_get_page_setup_set = Interop.downcallHandle(
                "gtk_print_unix_dialog_get_page_setup_set",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_print_unix_dialog_get_selected_printer = Interop.downcallHandle(
                "gtk_print_unix_dialog_get_selected_printer",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_print_unix_dialog_get_settings = Interop.downcallHandle(
                "gtk_print_unix_dialog_get_settings",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_print_unix_dialog_get_support_selection = Interop.downcallHandle(
                "gtk_print_unix_dialog_get_support_selection",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_print_unix_dialog_set_current_page = Interop.downcallHandle(
                "gtk_print_unix_dialog_set_current_page",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_print_unix_dialog_set_embed_page_setup = Interop.downcallHandle(
                "gtk_print_unix_dialog_set_embed_page_setup",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_print_unix_dialog_set_has_selection = Interop.downcallHandle(
                "gtk_print_unix_dialog_set_has_selection",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_print_unix_dialog_set_manual_capabilities = Interop.downcallHandle(
                "gtk_print_unix_dialog_set_manual_capabilities",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_print_unix_dialog_set_page_setup = Interop.downcallHandle(
                "gtk_print_unix_dialog_set_page_setup",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_print_unix_dialog_set_settings = Interop.downcallHandle(
                "gtk_print_unix_dialog_set_settings",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_print_unix_dialog_set_support_selection = Interop.downcallHandle(
                "gtk_print_unix_dialog_set_support_selection",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_print_unix_dialog_get_type = Interop.downcallHandle(
                "gtk_print_unix_dialog_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_print_unix_dialog_get_type != null;
    }
}
