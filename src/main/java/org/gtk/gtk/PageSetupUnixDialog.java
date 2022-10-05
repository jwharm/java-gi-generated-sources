package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
public class PageSetupUnixDialog extends Dialog implements Accessible, Buildable, ConstraintTarget, Native, Root, ShortcutManager {

    public PageSetupUnixDialog(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to PageSetupUnixDialog */
    public static PageSetupUnixDialog castFrom(org.gtk.gobject.Object gobject) {
        return new PageSetupUnixDialog(gobject.refcounted());
    }
    
    static final MethodHandle gtk_page_setup_unix_dialog_new = Interop.downcallHandle(
        "gtk_page_setup_unix_dialog_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(java.lang.String title, Window parent) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_page_setup_unix_dialog_new.invokeExact(Interop.allocateNativeString(title).handle(), parent.handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new page setup dialog.
     */
    public PageSetupUnixDialog(java.lang.String title, Window parent) {
        super(constructNew(title, parent));
    }
    
    static final MethodHandle gtk_page_setup_unix_dialog_get_page_setup = Interop.downcallHandle(
        "gtk_page_setup_unix_dialog_get_page_setup",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the currently selected page setup from the dialog.
     */
    public PageSetup getPageSetup() {
        try {
            var RESULT = (MemoryAddress) gtk_page_setup_unix_dialog_get_page_setup.invokeExact(handle());
            return new PageSetup(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_page_setup_unix_dialog_get_print_settings = Interop.downcallHandle(
        "gtk_page_setup_unix_dialog_get_print_settings",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current print settings from the dialog.
     */
    public PrintSettings getPrintSettings() {
        try {
            var RESULT = (MemoryAddress) gtk_page_setup_unix_dialog_get_print_settings.invokeExact(handle());
            return new PrintSettings(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_page_setup_unix_dialog_set_page_setup = Interop.downcallHandle(
        "gtk_page_setup_unix_dialog_set_page_setup",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the {@code GtkPageSetup} from which the page setup
     * dialog takes its values.
     */
    public void setPageSetup(PageSetup pageSetup) {
        try {
            gtk_page_setup_unix_dialog_set_page_setup.invokeExact(handle(), pageSetup.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_page_setup_unix_dialog_set_print_settings = Interop.downcallHandle(
        "gtk_page_setup_unix_dialog_set_print_settings",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the {@code GtkPrintSettings} from which the page setup dialog
     * takes its values.
     */
    public void setPrintSettings(PrintSettings printSettings) {
        try {
            gtk_page_setup_unix_dialog_set_print_settings.invokeExact(handle(), printSettings.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
