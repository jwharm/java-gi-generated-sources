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
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PageSetupUnixDialog(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to PageSetupUnixDialog if its GType is a (or inherits from) "GtkPageSetupUnixDialog".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code PageSetupUnixDialog} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkPageSetupUnixDialog", a ClassCastException will be thrown.
     */
    public static PageSetupUnixDialog castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkPageSetupUnixDialog"))) {
            return new PageSetupUnixDialog(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkPageSetupUnixDialog");
        }
    }
    
    private static Addressable constructNew(@Nullable java.lang.String title, @Nullable org.gtk.gtk.Window parent) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_page_setup_unix_dialog_new.invokeExact(
                    (Addressable) (title == null ? MemoryAddress.NULL : Interop.allocateNativeString(title)),
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
    public @NotNull org.gtk.gtk.PageSetup getPageSetup() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_page_setup_unix_dialog_get_page_setup.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.PageSetup(RESULT, Ownership.NONE);
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
        return new org.gtk.gtk.PrintSettings(RESULT, Ownership.NONE);
    }
    
    /**
     * Sets the {@code GtkPageSetup} from which the page setup
     * dialog takes its values.
     * @param pageSetup a {@code GtkPageSetup}
     */
    public void setPageSetup(@NotNull org.gtk.gtk.PageSetup pageSetup) {
        java.util.Objects.requireNonNull(pageSetup, "Parameter 'pageSetup' must not be null");
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
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_page_setup_unix_dialog_new = Interop.downcallHandle(
            "gtk_page_setup_unix_dialog_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_page_setup_unix_dialog_get_page_setup = Interop.downcallHandle(
            "gtk_page_setup_unix_dialog_get_page_setup",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_page_setup_unix_dialog_get_print_settings = Interop.downcallHandle(
            "gtk_page_setup_unix_dialog_get_print_settings",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_page_setup_unix_dialog_set_page_setup = Interop.downcallHandle(
            "gtk_page_setup_unix_dialog_set_page_setup",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_page_setup_unix_dialog_set_print_settings = Interop.downcallHandle(
            "gtk_page_setup_unix_dialog_set_print_settings",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
}
