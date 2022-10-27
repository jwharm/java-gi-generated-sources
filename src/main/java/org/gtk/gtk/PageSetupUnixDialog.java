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
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public PageSetupUnixDialog(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to PageSetupUnixDialog */
    public static PageSetupUnixDialog castFrom(org.gtk.gobject.Object gobject) {
        return new PageSetupUnixDialog(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@Nullable java.lang.String title, @Nullable org.gtk.gtk.Window parent) {
        java.util.Objects.requireNonNullElse(title, MemoryAddress.NULL);
        java.util.Objects.requireNonNullElse(parent, MemoryAddress.NULL);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_page_setup_unix_dialog_new.invokeExact(Interop.allocateNativeString(title), parent.handle()), false);
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
        super(constructNew(title, parent));
    }
    
    /**
     * Gets the currently selected page setup from the dialog.
     * @return the current page setup
     */
    public @NotNull org.gtk.gtk.PageSetup getPageSetup() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_page_setup_unix_dialog_get_page_setup.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.PageSetup(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the current print settings from the dialog.
     * @return the current print settings
     */
    public @Nullable org.gtk.gtk.PrintSettings getPrintSettings() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_page_setup_unix_dialog_get_print_settings.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.PrintSettings(Refcounted.get(RESULT, false));
    }
    
    /**
     * Sets the {@code GtkPageSetup} from which the page setup
     * dialog takes its values.
     * @param pageSetup a {@code GtkPageSetup}
     */
    public void setPageSetup(@NotNull org.gtk.gtk.PageSetup pageSetup) {
        java.util.Objects.requireNonNull(pageSetup, "Parameter 'pageSetup' must not be null");
        try {
            DowncallHandles.gtk_page_setup_unix_dialog_set_page_setup.invokeExact(handle(), pageSetup.handle());
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
        java.util.Objects.requireNonNullElse(printSettings, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_page_setup_unix_dialog_set_print_settings.invokeExact(handle(), printSettings.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_page_setup_unix_dialog_new = Interop.downcallHandle(
            "gtk_page_setup_unix_dialog_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_page_setup_unix_dialog_get_page_setup = Interop.downcallHandle(
            "gtk_page_setup_unix_dialog_get_page_setup",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_page_setup_unix_dialog_get_print_settings = Interop.downcallHandle(
            "gtk_page_setup_unix_dialog_get_print_settings",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_page_setup_unix_dialog_set_page_setup = Interop.downcallHandle(
            "gtk_page_setup_unix_dialog_set_page_setup",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_page_setup_unix_dialog_set_print_settings = Interop.downcallHandle(
            "gtk_page_setup_unix_dialog_set_print_settings",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
