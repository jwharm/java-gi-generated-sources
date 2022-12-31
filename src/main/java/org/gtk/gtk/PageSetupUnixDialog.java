package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
public class PageSetupUnixDialog extends org.gtk.gtk.Dialog implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Native, org.gtk.gtk.Root, org.gtk.gtk.ShortcutManager {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkPageSetupUnixDialog";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a PageSetupUnixDialog proxy instance for the provided memory address.
     * <p>
     * Because PageSetupUnixDialog is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected PageSetupUnixDialog(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PageSetupUnixDialog> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PageSetupUnixDialog(input, ownership);
    
    private static MemoryAddress constructNew(@Nullable java.lang.String title, @Nullable org.gtk.gtk.Window parent) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_page_setup_unix_dialog_new.invokeExact(
                    (Addressable) (title == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(title, null)),
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new page setup dialog.
     * @param title the title of the dialog
     * @param parent transient parent of the dialog
     */
    public PageSetupUnixDialog(@Nullable java.lang.String title, @Nullable org.gtk.gtk.Window parent) {
        super(constructNew(title, parent), Ownership.NONE);
    }
    
    /**
     * Gets the currently selected page setup from the dialog.
     * @return the current page setup
     */
    public org.gtk.gtk.PageSetup getPageSetup() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_page_setup_unix_dialog_get_page_setup.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.PageSetup) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.PageSetup.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the current print settings from the dialog.
     * @return the current print settings
     */
    public @Nullable org.gtk.gtk.PrintSettings getPrintSettings() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_page_setup_unix_dialog_get_print_settings.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.PrintSettings) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.PrintSettings.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Sets the {@code GtkPageSetup} from which the page setup
     * dialog takes its values.
     * @param pageSetup a {@code GtkPageSetup}
     */
    public void setPageSetup(org.gtk.gtk.PageSetup pageSetup) {
        try {
            DowncallHandles.gtk_page_setup_unix_dialog_set_page_setup.invokeExact(
                    handle(),
                    pageSetup.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code GtkPrintSettings} from which the page setup dialog
     * takes its values.
     * @param printSettings a {@code GtkPrintSettings}
     */
    public void setPrintSettings(@Nullable org.gtk.gtk.PrintSettings printSettings) {
        try {
            DowncallHandles.gtk_page_setup_unix_dialog_set_print_settings.invokeExact(
                    handle(),
                    (Addressable) (printSettings == null ? MemoryAddress.NULL : printSettings.handle()));
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
            RESULT = (long) DowncallHandles.gtk_page_setup_unix_dialog_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link PageSetupUnixDialog.Builder} object constructs a {@link PageSetupUnixDialog} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link PageSetupUnixDialog.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Dialog.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link PageSetupUnixDialog} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PageSetupUnixDialog}.
         * @return A new instance of {@code PageSetupUnixDialog} with the properties 
         *         that were set in the Builder object.
         */
        public PageSetupUnixDialog build() {
            return (PageSetupUnixDialog) org.gtk.gobject.GObject.newWithProperties(
                PageSetupUnixDialog.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_page_setup_unix_dialog_new = Interop.downcallHandle(
            "gtk_page_setup_unix_dialog_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_page_setup_unix_dialog_get_page_setup = Interop.downcallHandle(
            "gtk_page_setup_unix_dialog_get_page_setup",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_page_setup_unix_dialog_get_print_settings = Interop.downcallHandle(
            "gtk_page_setup_unix_dialog_get_print_settings",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_page_setup_unix_dialog_set_page_setup = Interop.downcallHandle(
            "gtk_page_setup_unix_dialog_set_page_setup",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_page_setup_unix_dialog_set_print_settings = Interop.downcallHandle(
            "gtk_page_setup_unix_dialog_set_print_settings",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_page_setup_unix_dialog_get_type = Interop.downcallHandle(
            "gtk_page_setup_unix_dialog_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
