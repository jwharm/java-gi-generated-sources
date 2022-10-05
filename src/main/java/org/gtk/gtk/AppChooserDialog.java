package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkAppChooserDialog} shows a {@code GtkAppChooserWidget} inside a {@code GtkDialog}.
 * <p>
 * <img src="./doc-files/appchooserdialog.png" alt="An example GtkAppChooserDialog">
 * <p>
 * Note that {@code GtkAppChooserDialog} does not have any interesting methods
 * of its own. Instead, you should get the embedded {@code GtkAppChooserWidget}
 * using {@link AppChooserDialog#getWidget} and call its methods if
 * the generic {@code Gtk.AppChooser} interface is not sufficient for
 * your needs.
 * <p>
 * To set the heading that is shown above the {@code GtkAppChooserWidget},
 * use {@link AppChooserDialog#setHeading}.
 */
public class AppChooserDialog extends Dialog implements Accessible, AppChooser, Buildable, ConstraintTarget, Native, Root, ShortcutManager {

    public AppChooserDialog(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to AppChooserDialog */
    public static AppChooserDialog castFrom(org.gtk.gobject.Object gobject) {
        return new AppChooserDialog(gobject.refcounted());
    }
    
    static final MethodHandle gtk_app_chooser_dialog_new = Interop.downcallHandle(
        "gtk_app_chooser_dialog_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(Window parent, DialogFlags flags, org.gtk.gio.File file) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_app_chooser_dialog_new.invokeExact(parent.handle(), flags.getValue(), file.handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkAppChooserDialog} for the provided {@code GFile}.
     * <p>
     * The dialog will show applications that can open the file.
     */
    public AppChooserDialog(Window parent, DialogFlags flags, org.gtk.gio.File file) {
        super(constructNew(parent, flags, file));
    }
    
    static final MethodHandle gtk_app_chooser_dialog_new_for_content_type = Interop.downcallHandle(
        "gtk_app_chooser_dialog_new_for_content_type",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewForContentType(Window parent, DialogFlags flags, java.lang.String contentType) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_app_chooser_dialog_new_for_content_type.invokeExact(parent.handle(), flags.getValue(), Interop.allocateNativeString(contentType).handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkAppChooserDialog} for the provided content type.
     * <p>
     * The dialog will show applications that can open the content type.
     */
    public static AppChooserDialog newForContentType(Window parent, DialogFlags flags, java.lang.String contentType) {
        return new AppChooserDialog(constructNewForContentType(parent, flags, contentType));
    }
    
    static final MethodHandle gtk_app_chooser_dialog_get_heading = Interop.downcallHandle(
        "gtk_app_chooser_dialog_get_heading",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the text to display at the top of the dialog.
     */
    public java.lang.String getHeading() {
        try {
            var RESULT = (MemoryAddress) gtk_app_chooser_dialog_get_heading.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_app_chooser_dialog_get_widget = Interop.downcallHandle(
        "gtk_app_chooser_dialog_get_widget",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@code GtkAppChooserWidget} of this dialog.
     */
    public Widget getWidget() {
        try {
            var RESULT = (MemoryAddress) gtk_app_chooser_dialog_get_widget.invokeExact(handle());
            return new Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_app_chooser_dialog_set_heading = Interop.downcallHandle(
        "gtk_app_chooser_dialog_set_heading",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the text to display at the top of the dialog.
     * <p>
     * If the heading is not set, the dialog displays a default text.
     */
    public void setHeading(java.lang.String heading) {
        try {
            gtk_app_chooser_dialog_set_heading.invokeExact(handle(), Interop.allocateNativeString(heading).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
